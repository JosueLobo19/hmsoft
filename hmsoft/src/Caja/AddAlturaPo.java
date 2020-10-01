package Caja;

import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard Garcia
 */
public class AddAlturaPo extends javax.swing.JDialog {
    public static RegistrarCliente registrar;
       clsFunciones  oFunc = new clsFunciones();
      clsConnection oConn = new clsConnection();
    public AddAlturaPo(RegistrarCliente parent, boolean modal) {
        //super(parent, modal);
        AddAlturaPo.registrar = parent;
        this.setModal(modal);
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        txtAddOcupacion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Agregar Explotacion en :");

        txtAddOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddOcupacionActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnAgregar.setMnemonic('a');
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAddOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAddOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddOcupacionActionPerformed
       if(txtAddOcupacion.getText().isEmpty()){
          oFunc.SubSistemaMensajeError("Ingrese una Ocupación"); 
       }else{
        AgregarOcupacion();
       }
    }//GEN-LAST:event_txtAddOcupacionActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       if(txtAddOcupacion.getText().isEmpty()){
          oFunc.SubSistemaMensajeError("Ingrese una Ocupación"); 
       }else{
        AgregarOcupacion();
       }
    }//GEN-LAST:event_btnAgregarActionPerformed
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
            java.util.logging.Logger.getLogger(AddAlturaPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAlturaPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAlturaPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAlturaPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                AddAlturaPo dialog = new AddAlturaPo(registrar, true);
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddOcupacion;
    // End of variables declaration//GEN-END:variables
public void AgregarOcupacion(){
String SqlStmt ;
SqlStmt="INSERT INTO ocupaciones_pa values('";
SqlStmt+= txtAddOcupacion.getText()+"')";

    int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea guardar la siguiente Ocupacion / Profeción?", //Mensaje
    "Seleccione una opción", // Título
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Si", "No"},
    "Si");
    if (seleccion != -1)
{
   if((seleccion + 1)==1)
   {
      if (oConn.FnBoolQueryExecuteUpdate(SqlStmt));
      oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
      registrar.CargarProfesionOcupacion();
      registrar.cboOcupacion(txtAddOcupacion.getText());
      txtAddOcupacion.setText(null);
      
   }
   else
   {
      // nada
   }
}

 
    
}
}
