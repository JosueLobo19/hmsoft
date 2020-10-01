package sistema;

import Caja.*;
import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Deymer
 */
public class AddMarcaCovid extends javax.swing.JDialog {
    public static LaboratorioClinico registrar;
       clsFunciones  oFunc = new clsFunciones();
      clsConnection oConn = new clsConnection();
    public AddMarcaCovid(LaboratorioClinico parent, boolean modal) {
        //super(parent, modal);
        AddMarcaCovid.registrar = parent;
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
        txtAddMarcaCovid = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Agregar Marca :");

        txtAddMarcaCovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddMarcaCovidActionPerformed(evt);
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
                .addComponent(txtAddMarcaCovid, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtAddMarcaCovid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void txtAddMarcaCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddMarcaCovidActionPerformed
       if(txtAddMarcaCovid.getText().isEmpty()){
          oFunc.SubSistemaMensajeError("Ingrese una Marca"); 
       }else{
        AgregarOcupacion();
       }
    }//GEN-LAST:event_txtAddMarcaCovidActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       if(txtAddMarcaCovid.getText().isEmpty()){
          oFunc.SubSistemaMensajeError("Ingrese una Marca"); 
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
            java.util.logging.Logger.getLogger(AddMarcaCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMarcaCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMarcaCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMarcaCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                AddMarcaCovid dialog = new AddMarcaCovid(registrar, true);
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
    private javax.swing.JTextField txtAddMarcaCovid;
    // End of variables declaration//GEN-END:variables
public void AgregarOcupacion(){
String SqlStmt ;
SqlStmt="INSERT INTO marca_covid values('";
SqlStmt+= txtAddMarcaCovid.getText()+"')";

    int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea guardar la siguiente Marca?", //Mensaje
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
      registrar.CargarMarcaCovid();
      registrar.cboAreaOcupacional(txtAddMarcaCovid.getText());
      txtAddMarcaCovid.setText(null);
      
   }
   else
   {
      // nada
   }
}

 
    
}
}
