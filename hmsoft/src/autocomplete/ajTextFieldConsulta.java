/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autocomplete;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
/**
 *
 * @author usuario
 */
public class ajTextFieldConsulta {
    /**
     * Clase que de un cuadro de texto permite completar los datos que se vayen consultando y el texto de sugerencia se encuentra seleccionado. <hr>Modo de llamada: new autocompleterText(jTextField1, "nombre", "personas");
     */
    public static class autocompleterText extends KeyAdapter
    {
        JTextField textField;
        String datoCompletar,datoBuscado;
        String oSql;
        String[]vector;
        /**
         * De un cuadro de texto permite completar los datos que se vayen consultando y el texto de sugerencia se encuentra seleccionado. <hr>Modo de llamada: new autocompleterText(jTextField1, "nombre", "personas");
         */
        public autocompleterText(JTextField textField, String campo)
        {
            this.textField=textField;
            this.textField.addKeyListener(this);
            this.oSql=campo;
        
        }
        /**
         * De un cuadro de texto permite completar los datos que se vayen consultando y el texto de sugerencia se encuentra seleccionado. <hr>Modo de llamada: new autocompleterText(jTextField1, "nombre", "personas");
         * @param textField
         * @param vector
         */
        public autocompleterText(JTextField textField, String[]vector)
        {
            this.textField=textField;
            this.textField.addKeyListener(new keyforString(this.textField, vector));
            this.vector=vector;
        }

        private class keyforString extends KeyAdapter
        {
            String[]veDatos = new String[]{"-"};
            JTextField textField;
            public keyforString(JTextField txt, String[]veDatos)
            {
                this.textField=txt;
                this.veDatos=veDatos;
                textField.addKeyListener(this);
            }
            @Override
            public void keyReleased(KeyEvent e)
            {
                if (!(e.getKeyCode() >= 65 && e.getKeyCode() <= 90 || e.getKeyCode() >= 96 && e.getKeyCode() <= 105 || e.getKeyCode() == KeyEvent.VK_ENTER)) {
                    return;
                }
                if (textField.getText().isEmpty()) {
                    return;
                }
                if (veDatos.length==0) {
                    return;
                }
                ajTextFieldConsulta.addTextAndSelectToTextFieldToRest(textField, ajVarios.getTextoApartirVector(textField.getText(), veDatos));
            }
        }


        @Override
        public void keyReleased(KeyEvent e)
        {
            //65 a 90 y 96 al 105
            if (!(e.getKeyCode() >= 65 && e.getKeyCode() <= 90 || e.getKeyCode() >= 96 && e.getKeyCode() <= 105 || e.getKeyCode() == KeyEvent.VK_ENTER))
            {
                return;
            }
            if(textField.getText().isEmpty()) {
                return;
            }
            
            int nroActual=textField.getText().length();
            //String datoBuscado = ajSQL.getCampoUnicoStrin("select nombre from personas where upper(nombre) like upper('"+textField.getText()+"%') limit 1");
            //String datoBuscado, datoCompletar ;
            datoCompletar = ajSQL.getCampoUnicoStrin(oSql+" like ('"+textField.getText()+"%') limit 1");

            if (datoCompletar.isEmpty()) {
                return;
            }


            datoBuscado = datoCompletar.substring(nroActual, datoCompletar.length());
            try
            {
                textField.getDocument().insertString(textField.getCaretPosition(), datoBuscado, null);
            } catch (BadLocationException ex) {
            }
            textField.select(nroActual, textField.getText().length());
            if (e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                textField.setText(datoCompletar);
            }
        }
    }
    /**
     * A partir del nuevo dato que vamos a insertar lo inserta en un jTextfield y de paso lo selecciona, como muestra el siguiente ejemplo:<hr>
     * jTextfield es 'bra', autocompleta con 'brahian' (seleccionando a partir de la 'h' porque el 'bra' ya se encuentra). Entonces queda mas o menos: bra[hian]
     * @param textField
     * @param newDato
     */
    public static void addTextAndSelectToTextFieldToRest(JTextField textField, String newDato)
    {
        String datoBuscado="";
        int nroActual=textField.getText().length();
        //String datoBuscado = ajSQL.getCampoUnicoStrin("select nombre from personas where upper(nombre) like upper('"+textField.getText()+"%') limit 1");
        //String datoBuscado, datoCompletar ;

        datoBuscado = newDato.substring(nroActual, newDato.length());
        if (newDato.isEmpty() || datoBuscado.isEmpty()) {
            return;
        }

        try
        {
            textField.getDocument().insertString(textField.getCaretPosition(), datoBuscado, null);
        } catch (BadLocationException ex) {
        }
        textField.select(nroActual, textField.getText().length());
    }
}
