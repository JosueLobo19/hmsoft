/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Configurar extends javax.swing.JInternalFrame {
        clsConnection oConn = new clsConnection();
        clsFunciones  oFunc = new clsFunciones();
        DefaultTableModel ticket;
        DefaultTableModel factura;
        DefaultTableModel boleta;
    public Configurar() {
        initComponents();
         jtConfigurar.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
         jtConfigurar.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
         jtConfigurar.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
         jtConfigurar.setIconAt(3, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
         sbBoleta();
         sbFactura();
         sbTicket();
         cTabla("s_n_ticket", ticket, tbTicket);
         cTabla("s_n_factura", factura, tbFacturas);
         cTabla("s_n_boleta", boleta, tbBoletas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtConfigurar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtDesdeF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFacturas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtSerieF = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtHastaF = new javax.swing.JTextField();
        btnAgregarF = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtDesdeB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBoletas = new javax.swing.JTable();
        txtHastaB = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtSerieB = new javax.swing.JTextField();
        btnAgregarB = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtDesdeT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTicket = new javax.swing.JTable();
        txtHastaT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtSerieT = new javax.swing.JTextField();
        btnAgregarT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Configuraciones Globales");

        jtConfigurar.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel4.setText("Serie :");

        tbFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbFacturas);

        jTabbedPane2.addTab("Series Facturas", jScrollPane2);

        jLabel5.setText("Desde :");

        jLabel6.setText("Hasta :");

        btnAgregarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregarF.setMnemonic('a');
        btnAgregarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerieF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesdeF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHastaF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtSerieF)
                        .addComponent(jLabel5)
                        .addComponent(txtDesdeF)
                        .addComponent(jLabel6)
                        .addComponent(txtHastaF))
                    .addComponent(btnAgregarF, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jtConfigurar.addTab("<html>Nº Series <br>Facturas</br></html>", jPanel1);

        jLabel7.setText("Serie :");

        jLabel8.setText("Desde :");

        tbBoletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbBoletas);

        jTabbedPane3.addTab("Series Boletas", jScrollPane3);

        jLabel9.setText("Hasta :");

        btnAgregarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregarB.setMnemonic('a');
        btnAgregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerieB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(txtDesdeB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(txtHastaB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtSerieB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtDesdeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtHastaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregarB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jtConfigurar.addTab("<html>Nº Series <br>Boletas</br></html>", jPanel3);

        jLabel10.setText("Serie :");

        jLabel11.setText("Desde :");

        tbTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbTicket);

        jTabbedPane4.addTab("Series Agregadas Tickets", jScrollPane4);

        jLabel12.setText("Hasta :");

        btnAgregarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregarT.setMnemonic('a');
        btnAgregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerieT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(2, 2, 2)
                        .addComponent(txtDesdeT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHastaT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtSerieT)
                        .addComponent(jLabel11)
                        .addComponent(txtDesdeT)
                        .addComponent(jLabel12)
                        .addComponent(txtHastaT))
                    .addComponent(btnAgregarT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jtConfigurar.addTab("<html>Nº Series <br>Tickets</br></html>", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jtConfigurar.addTab("IGV", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtConfigurar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTActionPerformed
        
        uComprobantes("s_n_ticket", "s_ticket", txtDesdeT, txtHastaT, txtSerieT);
        sbTicket();
         cTabla("s_n_ticket", ticket, tbTicket);
    }//GEN-LAST:event_btnAgregarTActionPerformed

    private void btnAgregarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFActionPerformed
        uComprobantes("s_n_factura", "s_factura", txtDesdeF, txtHastaF, txtSerieF);
         sbFactura(); 
        cTabla("s_n_factura", factura, tbFacturas);
    }//GEN-LAST:event_btnAgregarFActionPerformed

    private void btnAgregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBActionPerformed
        uComprobantes("s_n_boleta", "s_boleta", txtDesdeB, txtHastaB, txtSerieB);
        sbBoleta();
        cTabla("s_n_boleta", boleta, tbBoletas);
    }//GEN-LAST:event_btnAgregarBActionPerformed
    private void uComprobantes(String tabla,String into, JTextField desde, JTextField hasta , JTextField serie){
    String oSql="INSERT INTO "+tabla.toString()+"(desde, hasta,"+into.toString()+" ) VALUES ('"+desde.getText().toString()+"','"+hasta.getText().toString()+"','"+serie.getText().toString()+"')";
    if (oConn.FnBoolQueryExecuteUpdate(oSql)){
         oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
    }else{
        oFunc.SubSistemaMensajeError("Error registrando la Entrada");
    }
    }
    private void sbTicket()
    {
        ticket = new DefaultTableModel(){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
                  if(columnIndex==1) {
                  return true;
              }
            else {
                  return false;
              }
    }  };

        ticket.addColumn("Serie");
        ticket.addColumn("Desde");
        ticket.addColumn("Hasta");
                       
        // Coloca el Modelo en la Tabla
        tbTicket.setModel(ticket);
        tbTicket.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbTicket.getColumnModel().getColumn(1).setPreferredWidth(5);
        tbTicket.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbTicket.getTableHeader().setReorderingAllowed(false);
        tbTicket.getTableHeader().setResizingAllowed(false);
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        tbTicket.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);        
        tbTicket.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
    }
        private void sbBoleta()
    {
        boleta = new DefaultTableModel(){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
                  if(columnIndex==1) {
                  return true;
              }
            else {
                  return false;
              }
    }  };

        boleta.addColumn("Serie");
        boleta.addColumn("Desde");
        boleta.addColumn("Hasta");
                       
        // Coloca el Modelo en la Tabla
        tbBoletas.setModel(boleta);
        tbBoletas.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbBoletas.getColumnModel().getColumn(1).setPreferredWidth(5);
        tbBoletas.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbBoletas.getTableHeader().setReorderingAllowed(false);
        tbBoletas.getTableHeader().setResizingAllowed(false);
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        tbBoletas.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbBoletas.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);        
        tbBoletas.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
    }
        private void sbFactura()
    {
        factura = new DefaultTableModel(){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
                 
                  return false;
              
    }  };

        factura.addColumn("Serie");
        factura.addColumn("Desde");
        factura.addColumn("Hasta");
                       
        // Coloca el Modelo en la Tabla
        tbFacturas.setModel(factura);
        tbFacturas.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbFacturas.getColumnModel().getColumn(1).setPreferredWidth(5);
        tbFacturas.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbFacturas.getTableHeader().setReorderingAllowed(false);
        tbFacturas.getTableHeader().setResizingAllowed(false);
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        tbFacturas.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbFacturas.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);        
        tbFacturas.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
    }
    private void cTabla(String Tabla, DefaultTableModel modelo,JTable tabla){
        
   
    Object [] oFila = new Object[3];
   // String [] oFila = new String[3];    
    String oSql="SELECT * FROM "+Tabla.toString();
    oConn.FnBoolQueryExecute(oSql);
        try {
            while (oConn.setResult.next())
                {       
                        oFila[0]=oFunc.serie(oConn.setResult.getInt(3));
                        oFila[1]=oFunc.factura(oConn.setResult.getInt(1));
                        oFila[2]=oFunc.factura(oConn.setResult.getInt(2));
                     //   modelo.insertRow(0, oFila);
                        modelo.addRow(oFila);
                       
                }
             tabla.setModel(modelo);
        } catch (Exception e) {
        }
    
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarB;
    private javax.swing.JButton btnAgregarF;
    private javax.swing.JButton btnAgregarT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jtConfigurar;
    private javax.swing.JTable tbBoletas;
    private javax.swing.JTable tbFacturas;
    private javax.swing.JTable tbTicket;
    private javax.swing.JTextField txtDesdeB;
    private javax.swing.JTextField txtDesdeF;
    private javax.swing.JTextField txtDesdeT;
    private javax.swing.JTextField txtHastaB;
    private javax.swing.JTextField txtHastaF;
    private javax.swing.JTextField txtHastaT;
    private javax.swing.JTextField txtSerieB;
    private javax.swing.JTextField txtSerieF;
    private javax.swing.JTextField txtSerieT;
    // End of variables declaration//GEN-END:variables
}
