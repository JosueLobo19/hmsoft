package Caja;
import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author admin
 */
public final class BuscarCliente extends javax.swing.JDialog {
     clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
     String[]veDatos = new String[]{};
     DefaultTableModel model;
public static Comprobantes comprobates;
    public BuscarCliente(Comprobantes parent, boolean modal) {
       // super(parent, modal);
     BuscarCliente.comprobates = parent;
        this.setModal(modal);
        initComponents();
        
        sbCargarTabla("");
        setLocationRelativeTo(this);
        KeyboardFocusManager kb = KeyboardFocusManager.getCurrentKeyboardFocusManager();
kb.addKeyEventPostProcessor(new KeyEventPostProcessor(){
            @Override
            public boolean postProcessKeyEvent(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE && this != null){
                       dispose();
                    return false;
                }
                return true;
            }
});
veDatos = getRowsToVector("select nombres_pa from datos_paciente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscarCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBuscarCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre / DNI :");

        tbBuscarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbBuscarCliente.setColumnSelectionAllowed(true);
        tbBuscarCliente.getTableHeader().setReorderingAllowed(false);
        tbBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBuscarClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBuscarCliente);
        tbBuscarCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBuscarClienteMouseClicked
       
       if (tbBuscarCliente.getSelectedRow()>=0)
        {
            // DefaultTableModel modelo = new DefaultTableModel();
             DefaultTableModel tblDatos = (DefaultTableModel) tbBuscarCliente.getModel();
            
            // Obtengo el Codigo de la celda
           // comprobates.codCliente(tblDatos.getValueAt(tbBuscarCliente.getSelectedRow(),0).toString());
           // comprobates.nomCliente(tblDatos.getValueAt(tbBuscarCliente.getSelectedRow(),1).toString());
            // Libera la Forma
            this.dispose();
        }
        else
            oFunc.SubSistemaMensajeError("Seleccione un Registro");
    }//GEN-LAST:event_tbBuscarClienteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                BuscarCliente dialog = new BuscarCliente(comprobates, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbBuscarCliente;
    private javax.swing.JTextField txtBuscarCliente;
    // End of variables declaration//GEN-END:variables
private void sbTablaTicket        ()
    {
        // Declaro un modelo de datos
        DefaultTableModel modelo = new DefaultTableModel();      
                
        // Añadimos columnas al modelo de datos
        modelo.addColumn("Código");
        modelo.addColumn("Nombre Cliente");
        modelo.addColumn("Fecha Registro");
       
                
        // Coloca el Modelo en la Tabla
        tbBuscarCliente.setModel(modelo);
        
        // Directamente
        tbBuscarCliente.getColumn("Código").setWidth(3);
        tbBuscarCliente.getColumn("Código").setPreferredWidth(3);        
        tbBuscarCliente.getColumn("Nombre Cliente").setWidth(140);
        tbBuscarCliente.getColumn("Nombre Cliente").setPreferredWidth(140);
        tbBuscarCliente.getColumn("Fecha Registro").setWidth(40);
        tbBuscarCliente.getColumn("Fecha Registro").setPreferredWidth(40);
      
        
        tbBuscarCliente.setFont(new java.awt.Font("Lucida Sans", 0, 14)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.RIGHT);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbBuscarCliente.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbBuscarCliente.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
        tbBuscarCliente.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        tbBuscarCliente.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 12)); 
   
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }
void sbCargarTabla(String valor){
    String [] titulos={"DNI","Nombres","Fecha Registro"};
    String [] registros = new String[3];
    String sql="select cod_pa, nombres_pa, fecha_registro_pa from datos_paciente where CONCAT(cod_pa,' ',nombres_pa) LIKE '%"+valor+"%'";
      model = new DefaultTableModel(null,titulos);       
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                    registros[0]= oConn.setResult.getString("cod_pa");
                    registros[1]= oConn.setResult.getString("nombres_pa");
                    registros[2]= oConn.setResult.getString("fecha_registro_pa");
                     model.addRow(registros);
                }
                 
                  // Coloca el Modelo de Nueva Cuenta
                  tbBuscarCliente.setModel(model);
                
             
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(BuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
 public String[]getRowsToVector(String sql)
    {
        String[]veDats;
        //clsConnection oConn = new clsConnection();
        try
        {
            //oConn.FnBoolConnectionOpen(strConnector, strHost,strUser,strPassword);
            oConn.FnBoolQueryExecute(sql);

            ArrayList lista = new ArrayList();
            while (oConn.setResult.next())
            {
                lista.add(oConn.setResult.getString(1));
            }
            veDats = new String[lista.size()];
            for (int i = 0; i < lista.size(); i++)
            {
                veDats[i]=lista.get(i).toString();
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
            
            return null;
        }
        return veDats;
    }
public static int getPosicionVectorBuscar(String datoBuscar, String[]veDatos)
{
  try{
      for(int i =0;1 < veDatos.length; i++){
        if(datoBuscar.equals(veDatos[i].substring(0, datoBuscar.length())))
            return i;
      }
              
     
  }catch(Exception e){
  
  }
  return -1;
}
public static String getTextoApartirVector(String datoBuscar, String[]veDatos)
{
    int nroPosicion = getPosicionVectorBuscar(datoBuscar, veDatos);
    if(nroPosicion == -1){
        return datoBuscar;
    }
    return veDatos[nroPosicion];
}
public static void addTextAndSelectToTextFieldToRest(JTextField textField, String newDato)
{
    String datoBuscado ="";
    int nroActual = textField.getText().length();
    datoBuscado = newDato.substring(nroActual, newDato.length());
    if(newDato.isEmpty() || datoBuscado.isEmpty())
        return;
    try {
        textField.getDocument().insertString(textField.getCaretPosition(), datoBuscado, null);
    }catch(Exception e){
    }
    textField.select(nroActual, textField.getText().length());

}  
}
