
package Consultas;

import sistema.*;
import Caja.Admision;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Consultas.ConsultasEmpresas;
import autocomplete.ajTextField;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public final class IngresoConsultas extends javax.swing.JFrame {
   //variales Area Usuario
    static final boolean PROCESO_CODIGO = true;
    static final boolean ADMISION_CODIGO = true;
     static final boolean FARMACIA_CODIGO = true;
    
    
   clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
       public IngresoConsultas()  {
           
       initComponents(); 
//            CargarUsuarios();
            CargarEmpresas();
            CargarContratas();    

     AutoCompleteDecorator.decorate(this.cboEmpresas);
     AutoCompleteDecorator.decorate(this.cboContratas);
    }
    @Override
    public Image getIconImage() {
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/med.png"));
    return retValue;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btIngreso = new javax.swing.ButtonGroup();
        lblUsuario_L = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboEmpresas = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        lblUsuario_L1 = new javax.swing.JLabel();
        cboContratas = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso a \"MEDSOFT\"");
        setIconImage(getIconImage());
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lblUsuario_L.setText("Empresa :");

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btncancelar.setText("Cerrar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Datos de Acceso al Sistema");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carnet.png"))); // NOI18N

        cboEmpresas.setEditable(true);
        cboEmpresas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione algun usuario" }));
        cboEmpresas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboEmpresasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresasActionPerformed(evt);
            }
        });
        cboEmpresas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboEmpresasKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblUsuario_L1.setText("Contrata :");

        cboContratas.setEditable(true);
        cboContratas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione algun usuario" }));
        cboContratas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboContratasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboContratas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboContratasActionPerformed(evt);
            }
        });
        cboContratas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboContratasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3)
                        .addGap(0, 87, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsuario_L)
                            .addComponent(lblUsuario_L1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboEmpresas, javax.swing.GroupLayout.Alignment.LEADING, 0, 243, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(cboContratas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario_L)
                            .addComponent(cboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario_L1)
                            .addComponent(cboContratas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncancelar)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(499, 273));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncancelarActionPerformed

   private void cboEmpresasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboEmpresasPopupMenuWillBecomeInvisible
       
   }//GEN-LAST:event_cboEmpresasPopupMenuWillBecomeInvisible

   private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
 enter(evt);
   }//GEN-LAST:event_formKeyPressed

   private void cboEmpresasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboEmpresasKeyPressed
 enter(evt); 
 evt.getSource().toString().toUpperCase();
   }//GEN-LAST:event_cboEmpresasKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        validar();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresasActionPerformed
         cboEmpresas.getEditor().addActionListener(new ActionListener() {
         @Override
     public void actionPerformed(ActionEvent e) {
           
         if(cboEmpresas.getSelectedIndex()<=-1 )
         {
             
         }else{
             cboContratas.requestFocus();
         }
           
     }});
    }//GEN-LAST:event_cboEmpresasActionPerformed

    private void cboContratasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboContratasPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboContratasPopupMenuWillBecomeInvisible

    private void cboContratasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboContratasActionPerformed
//     validar();
     
    }//GEN-LAST:event_cboContratasActionPerformed

    private void cboContratasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboContratasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboContratasKeyPressed
    public static void main(String args[]) {
             new IngresoConsultas().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btIngreso;
    private javax.swing.JButton btncancelar;
    public static javax.swing.JComboBox cboContratas;
    public static javax.swing.JComboBox cboEmpresas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblUsuario_L;
    private javax.swing.JLabel lblUsuario_L1;
    // End of variables declaration//GEN-END:variables
private void enter(java.awt.event.KeyEvent evt){
int key = evt.getKeyCode();
     if (key == KeyEvent.VK_ENTER) {
        Toolkit.getDefaultToolkit().beep(); 
        validar();
        }
}
private void validar(){
        ConsultasEmpresas s = new ConsultasEmpresas();
        s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);         
//        oConn.SubConnectionClose();
}



private void CargarEmpresas(){
      String sQuery;        
        // Prepara el Query
        sQuery ="SELECT razon_empresa FROM empresas";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     cboEmpresas.addItem(oConn.setResult.getString ("razon_empresa"));
                     
                 }
                 
                 // Cierra Resultados
               //  oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(IngresoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // selecciona
        cboEmpresas.setSelectedIndex(0);


}
private void CargarContratas(){
      String sQuery;        
        // Prepara el Query
        sQuery ="SELECT razon_contrata FROM contratas";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     cboContratas.addItem(oConn.setResult.getString ("razon_contrata"));
                     
                 }
                 
                 // Cierra Resultados
               //  oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(IngresoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // selecciona
        cboContratas.setSelectedIndex(0);


}
public void CerrarJF(){
this.dispose();
}

}

