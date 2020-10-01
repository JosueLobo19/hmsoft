package Caja;

import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richard Garcia
 */
public final class VerUltimoRegistro extends javax.swing.JDialog {
    public static RegistrarCliente registrar;
       clsFunciones  oFunc = new clsFunciones();
      clsConnection oConn = new clsConnection();
      DefaultTableModel model;
      String dato;
    public VerUltimoRegistro(RegistrarCliente parent, boolean modal) {
        //super(parent, modal);
        VerUltimoRegistro.registrar = parent;
        this.setModal(modal);
        initComponents();
       
      
   
        sbTablaUltimoRegistro();
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
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUltimoRegistro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbUltimoRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbUltimoRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbUltimoRegistroMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbUltimoRegistro);

        jLabel2.setText("Fecha  :");

        txtFecha.setDateFormatString("dd/MM/yyyy");
        txtFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFechaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFechaPropertyChange
           Date dateHoy = new Date();

        
        // Inicializa Folio y Fecha
        txtFecha.setDate(dateHoy);
        UltimoRegistro();
    }//GEN-LAST:event_txtFechaPropertyChange

    private void tbUltimoRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUltimoRegistroMousePressed
       
     
         DefaultTableModel tblDatos = (DefaultTableModel) tbUltimoRegistro.getModel();
        
        if (evt.getClickCount() == 2) 
        {  
            String razon  = tblDatos.getValueAt(tbUltimoRegistro.getSelectedRow(),0).toString();
            registrar.addDni(razon);
            String sql;
       sql="select nombres_pa, apellidos_pa from datos_paciente where cod_pa ='"+razon.toString()+"'";
          
                oConn.FnBoolQueryExecute(sql);
          try 
                {
                 if (oConn.setResult.next())
                 {       
                         
                         registrar.addNombre(oConn.setResult.getString("nombres_pa"));           
                         registrar.addApellido(oConn.setResult.getString("apellidos_pa"));  
                         registrar.AltaHabilitar();
                 }else {
                 oFunc.SubSistemaMensajeError("Si es la primera vez \n Rebe de Registar este Paciente \n   Clic en en la Imagen" );
                 }
              
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
            
        }
    }//GEN-LAST:event_tbUltimoRegistroMousePressed
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
            java.util.logging.Logger.getLogger(VerUltimoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerUltimoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerUltimoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerUltimoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                VerUltimoRegistro dialog = new VerUltimoRegistro(registrar, true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUltimoRegistro;
    private com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables

    public void UltimoRegistro(){
    
String [] titulos={"RUC","Nombre","Fecha","Hora"};
    String [] registros = new String[4];
    
    String sql="select cod_pa, nombres_pa, fecha_registro_pa, hora_registro_pa from datos_paciente where fecha_registro_pa ='"+ txtFecha.getDate() +"'";
    
      model = new DefaultTableModel(null,titulos);       
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                    registros[0]= oConn.setResult.getString("cod_pa");
                    registros[1]= oConn.setResult.getString("nombres_pa");
                    registros[2]= oConn.setResult.getString("fecha_registro_pa");
                    registros[3]= oConn.setResult.getString("hora_registro_pa");
                     model.addRow(registros);
                }
                 
                  // Coloca el Modelo de Nueva Cuenta
                  tbUltimoRegistro.setModel(model);
                
             
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


private void sbTablaUltimoRegistro()
    {
        // Declaro un modelo de datos
        DefaultTableModel modelo = new DefaultTableModel();      
                
        // Añadimos columnas al modelo de datos
        modelo.addColumn("RUC");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha");
       
                
        // Coloca el Modelo en la Tabla
        tbUltimoRegistro.setModel(modelo);
        
        // Directamente
        tbUltimoRegistro.getColumn("RUC").setWidth(3);     
        tbUltimoRegistro.getColumn("Nombre").setWidth(140);
        tbUltimoRegistro.getColumn("Nombre").setPreferredWidth(140);
        tbUltimoRegistro.getColumn("Fecha").setWidth(40);
        tbUltimoRegistro.getColumn("Fecha").setPreferredWidth(40);
      
        
        tbUltimoRegistro.setFont(new java.awt.Font("Tahoma", 0, 11)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.RIGHT);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbUltimoRegistro.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbUltimoRegistro.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
        tbUltimoRegistro.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        tbUltimoRegistro.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11)); 
   
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }
}
