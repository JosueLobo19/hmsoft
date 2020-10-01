/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Actualizar extends javax.swing.JDialog {

    /**
     * Creates new form Actualizar
     */
    public Actualizar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         this.setLocationRelativeTo(parent); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pgUpdate = new javax.swing.JProgressBar();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Sistema");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Actualizar"));

        pgUpdate.setStringPainted(true);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pgUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pgUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnUpdate.setEnabled(false);
        
        Actualizar();
    }//GEN-LAST:event_btnUpdateActionPerformed
private void Finalizado(){
    boolean im = false;
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "Desea Reinciar el Programa Ahora?", //Mensaje
    "Actualización Finalizada", // Título
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,    // null para icono por defecto.
    new Object[] { "Si", "No"},    // null para YES, NO y CANCEL
    "Si");
    if (seleccion != -1)
    {
   if((seleccion + 1)==1)
   {
       System.exit(0);
       
   }
   else
   {
      dispose();
     }
    }
   

}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Actualizar dialog = new Actualizar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar pgUpdate;
    // End of variables declaration//GEN-END:variables
private void Actualizar(){
Thread v = new Thread(new Runnable() {
            @Override
            public void run() {
                String site="http://peruhost.pe/hmsoft/dist.zip";
                String filename="hmsoft.zip";

            try {
       
        URL url=new URL(site);
        HttpURLConnection connection =
            (HttpURLConnection) url.openConnection();
        int filesize = connection.getContentLength();
        float totalDataRead=0;
            java.io.BufferedInputStream in = new java.io.BufferedInputStream(connection.getInputStream());
            java.io.FileOutputStream fos = new java.io.FileOutputStream(filename);
            java.io.BufferedOutputStream bout = new BufferedOutputStream(fos,1024);
            byte[] data = new byte[1024];
            int i=0;
            while((i=in.read(data,0,1024))>=0)
            {
            totalDataRead=totalDataRead+i;
            bout.write(data,0,i);
            float Percent=(totalDataRead*100)/filesize;
            pgUpdate.setValue((int)Percent);
            }  
            bout.close();
            in.close();
            //////////////////////////////////////
             File fichero = new File(System.getProperty("user.dir")+  "/hmsoft.zip") ;
                                        
                        if(fichero.exists()) {
                       unzip("hmsoft.zip",System.getProperty("user.dir"));
                      // btnUpdate.setEnabled(true);
                     
                    }
                        else {
                        System.out.println(System.getProperty("No existe"));
                    }
                        Finalizado();
    }
    catch(Exception e)
    {
         javax.swing.JOptionPane.showConfirmDialog((java.awt.Component)
                 null,e.getMessage(), "Error",
                 javax.swing.JOptionPane.DEFAULT_OPTION);
    }
            }
            });
        v.start();
}
public void unzip(String strZipFile,String strDestinationPath) {
               
                try
                {
                        File fSourceZip = new File(strZipFile);
                        ZipFile zipFile = new ZipFile(fSourceZip);
                        Enumeration e = zipFile.entries();
                       
                        while(e.hasMoreElements())
                        {
                                ZipEntry entry = (ZipEntry)e.nextElement();
                                File destinationFilePath = new File(strDestinationPath + "/" + entry.getName());
                                destinationFilePath.getParentFile().mkdirs();
                                if(entry.isDirectory())
                                {
                                        continue;
                                }
                                else
                                {
                                        //System.out.println("Extracting " + destinationFilePath);
                                        BufferedInputStream bis = new BufferedInputStream(zipFile.getInputStream(entry));
                                                                                                                       
                                        int b;
                                        byte buffer[] = new byte[1024];
                                        FileOutputStream fos = new FileOutputStream(destinationFilePath);
                                        BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
 
                                        while ((b = bis.read(buffer, 0, 1024)) != -1) {
                                                        bos.write(buffer, 0, b);
                                        }
                                        bos.flush();
                                        bos.close();
                                        bis.close();
                                }
                        }
                }
                catch(IOException ioe)
                {
                        System.out.println("IOError :" + ioe);
                }
               
        }
}
