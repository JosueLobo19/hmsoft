/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autocomplete;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
/**
 *
 * @author usuario
 */
public class ajTextArea {
    /**
     * Clase que de un cuadro de texto permite completar los datos que se vayen consultando y el texto de sugerencia se encuentra seleccionado. <hr>Modo de llamada: new autocompleterText(jTextField1, "nombre", "personas");
     */
    public static class autocompleterText extends KeyAdapter
    {
        JTextArea textArea;
        String campo, tabla, datoBuscado, datoCompletar;
        String[]vector;
        /**
         * De un cuadro de texto permite completar los datos que se vayen consultando y el texto de sugerencia se encuentra seleccionado. <hr>Modo de llamada: new autocompleterText(jTextField1, "nombre", "personas");
         */
        public autocompleterText(JTextArea textArea, String campo, String tabla)
        {
            this.textArea=textArea;
            this.textArea.addKeyListener(this);
            this.campo=campo;
            this.tabla=tabla;
        }
        /**
         * De un cuadro de texto permite completar los datos que se vayen consultando y el texto de sugerencia se encuentra seleccionado. <hr>Modo de llamada: new autocompleterText(jTextField1, "nombre", "personas");
         * @param textField
         * @param vector
         */
        public autocompleterText(JTextField textField, String[]vector)
        {
            this.textArea=textArea;
            this.textArea.addKeyListener(new keyforString(this.textArea, vector));
            this.vector=vector;
        }

        private class keyforString extends KeyAdapter
        {
            String[]veDatos = new String[]{"-"};
            JTextArea textArea;
            public keyforString(JTextArea txt, String[]veDatos)
            {
                this.textArea=txt;
                this.veDatos=veDatos;
                textArea.addKeyListener(this);
            }
            @Override
            public void keyReleased(KeyEvent e)
            {
                if (!(e.getKeyCode() >= 65 && e.getKeyCode() <= 90 || e.getKeyCode() >= 96 && e.getKeyCode() <= 105 || e.getKeyCode() == e.VK_ENTER))
                    return;
                if (textArea.getText().isEmpty())
                    return;
                if (veDatos.length==0)
                    return;
                ajTextArea.addTextAndSelectToTextFieldToRest(textArea, ajVarios.getTextoApartirVector(textArea.getText(), veDatos));
            }
        }


        @Override
        public void keyReleased(KeyEvent e)
        {
            //65 a 90 y 96 al 105
            if (!(e.getKeyCode() >= 65 && e.getKeyCode() <= 90 || e.getKeyCode() >= 96 && e.getKeyCode() <= 105 || e.getKeyCode() == e.VK_ENTER))
            {
                return;
            }
            if(textArea.getText().isEmpty())
            return;
            
            int nroActual=textArea.getText().length();
            //String datoBuscado = ajSQL.getCampoUnicoStrin("select nombre from personas where upper(nombre) like upper('"+textField.getText()+"%') limit 1");
            //String datoBuscado, datoCompletar ;
            datoCompletar = ajSQL.getCampoUnicoStrin("select "+campo+" from "+tabla+" where upper("+campo+") like upper('"+textArea.getText()+"%') limit 1");

            if (datoCompletar.isEmpty()) {
                return;
            }


            datoBuscado = datoCompletar.substring(nroActual, datoCompletar.length());
            try
            {
                textArea.getDocument().insertString(textArea.getCaretPosition(), datoBuscado, null);
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
            textArea.select(nroActual, textArea.getText().length());
            if (e.getKeyCode() == e.VK_ENTER)
            {
                textArea.append(datoCompletar);
            }
        }
    }
    /**
     * A partir del nuevo dato que vamos a insertar lo inserta en un jTextfield y de paso lo selecciona, como muestra el siguiente ejemplo:<hr>
     * jTextfield es 'bra', autocompleta con 'brahian' (seleccionando a partir de la 'h' porque el 'bra' ya se encuentra). Entonces queda mas o menos: bra[hian]
     * @param textField
     * @param newDato
     */
    public static void addTextAndSelectToTextFieldToRest(JTextArea textArea, String newDato)
    {
        String datoBuscado="";
        int nroActual=textArea.getText().length();
        //String datoBuscado = ajSQL.getCampoUnicoStrin("select nombre from personas where upper(nombre) like upper('"+textField.getText()+"%') limit 1");
        //String datoBuscado, datoCompletar ;

        datoBuscado = newDato.substring(nroActual, newDato.length());
        if (newDato.isEmpty() || datoBuscado.isEmpty()) {
            return;
        }

        try
        {
            textArea.getDocument().insertString(textArea.getCaretPosition(), datoBuscado, null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
        textArea.select(nroActual, textArea.getText().length());
    }
}
