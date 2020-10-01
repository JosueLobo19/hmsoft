/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import autocomplete.ajTextFieldConsulta;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrador
 */
public class HistoriaClinicaPs extends javax.swing.JInternalFrame {
   clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    DefaultTableModel model;
    public HistoriaClinicaPs() {
        initComponents();
        new ajTextFieldConsulta.autocompleterText(txtNombre,"select nombres_pa||' '||apellidos_pa as nombre FROM datos_paciente WHERE CONCAT(nombres_pa,' ',apellidos_pa)");
        sbCargarDatosMC("");
        txtNombre.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtApoderado = new javax.swing.JTextField();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtHCLPS = new javax.swing.JTextField();
        FNacimiento = new com.toedter.calendar.JDateChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivoConsulta = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRecomendaciones = new javax.swing.JTextArea();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAntecedentesRelevantes = new javax.swing.JTextArea();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSeguimiento = new javax.swing.JTextArea();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtBateriaPruebas = new javax.swing.JTextArea();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDiagnosticoPresuntivo = new javax.swing.JTextArea();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtBuscarNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbBuscar = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Historia Clinica Psicologica");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos de Filiación :"));

        jLabel3.setText("Nombres :");

        jLabel2.setText("Sexo :");

        jLabel9.setText("Fecha :");

        jLabel6.setText("F. Nacimiento :");

        jLabel5.setText("Edad :");

        jLabel8.setText("Apoderado :");

        jLabel7.setText("Direccion :");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtSexo.setEditable(false);

        txtEdad.setEditable(false);

        txtDireccion.setEditable(false);

        txtApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApoderadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nº HCL PS. :");

        txtHCLPS.setEditable(false);

        FNacimiento.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre)
                        .addComponent(txtDireccion)
                        .addComponent(txtApoderado)
                        .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHCLPS)))
                    .addComponent(FNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtHCLPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(FNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        txtMotivoConsulta.setColumns(20);
        txtMotivoConsulta.setRows(5);
        jScrollPane1.setViewportView(txtMotivoConsulta);

        jTabbedPane1.addTab("Motivo de Consulta :", jScrollPane1);

        txtRecomendaciones.setColumns(20);
        txtRecomendaciones.setRows(5);
        jScrollPane2.setViewportView(txtRecomendaciones);

        jTabbedPane2.addTab("Recomendaciones :", jScrollPane2);

        txtAntecedentesRelevantes.setColumns(20);
        txtAntecedentesRelevantes.setRows(5);
        jScrollPane3.setViewportView(txtAntecedentesRelevantes);

        jTabbedPane3.addTab("Antecedentes Relevantes :", jScrollPane3);

        txtSeguimiento.setColumns(20);
        txtSeguimiento.setRows(5);
        jScrollPane4.setViewportView(txtSeguimiento);

        jTabbedPane4.addTab("Seguimiento :", jScrollPane4);

        txtBateriaPruebas.setColumns(20);
        txtBateriaPruebas.setRows(5);
        jScrollPane5.setViewportView(txtBateriaPruebas);

        jTabbedPane5.addTab("Bateria de Pruebas :", jScrollPane5);

        txtDiagnosticoPresuntivo.setColumns(20);
        txtDiagnosticoPresuntivo.setRows(5);
        jScrollPane6.setViewportView(txtDiagnosticoPresuntivo);

        jTabbedPane6.addTab("Diagnóstico Presuntivo", jScrollPane6);

        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyReleased(evt);
            }
        });

        jLabel1.setText("Nombre :");

        tbBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbBuscarMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(tbBuscar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarNombre))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Buscar ", jPanel2);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(340, 340, 340)
                            .addComponent(jLabel10))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar)))
                    .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
cLLenar(txtNombre);        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApoderadoActionPerformed
        txtMotivoConsulta.requestFocusInWindow();
    }//GEN-LAST:event_txtApoderadoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!txtNombre.getText().isEmpty()&& !txtHCLPS.getText().isEmpty()){
            Agregar();
            sbCargarDatosMC("");
        } else {
        oFunc.SubSistemaMensajeError("Ingrese Evaluado");
         txtNombre.requestFocus();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased
        sbCargarDatosMC(txtBuscarNombre.getText());
    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void tbBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBuscarMousePressed
if (evt.getClickCount() == 2) 
        {  
            
            Integer cod  = Integer.valueOf(tbBuscar.getValueAt(tbBuscar.getSelectedRow(),0).toString());
            print(cod);
            
        }
    }//GEN-LAST:event_tbBuscarMousePressed
    public void cLLenar(JTextField cod){
        String oSql="select sexo_pa, historial_pa,fecha_nacimiento_pa,direccion_pa from datos_paciente where CONCAT(nombres_pa,' ',apellidos_pa) = '"+cod.getText().toString()+"'";
    oConn.FnBoolQueryExecute(oSql);
    try {
            if (oConn.setResult.next()) {
                txtSexo.setText(oConn.setResult.getString("sexo_pa").equals("M")? "MASCULINO":"FEMENINO"); 
                txtHCLPS.setText(oConn.setResult.getString("historial_pa"));
               FNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                txtDireccion.setText(oConn.setResult.getString("direccion_pa"));
                txtEdad.setText(String.valueOf(oFunc.calcularEdad(FNacimiento.getCalendar())) );
                oFunc.Fecha(Fecha);
               oConn.setResult.close();
               txtNombre.setEditable(false);
               txtApoderado.requestFocus();
                       
               
            } 
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Ticket: " + ex.getMessage().toString());
        }
    
    }
    public void Agregar(){
    String insert="INSERT INTO hcps(h_cod,h_edad,h_fecha";
    String values ="VALUES ('"+txtHCLPS.getText().toString()+"','"+txtEdad.getText().toString()+"','"+ Fecha.getDate().toString()+"'";
           if(!txtApoderado.getText().isEmpty()){ 
           insert += ",h_apoderado";
           values += ",'"+txtApoderado.getText().toString()+"'";
           }
           if(!txtMotivoConsulta.getText().isEmpty()){ 
           insert += ",h_motivo_c";
           values += ",'"+txtMotivoConsulta.getText().toString()+"'";
           }
           if(!txtAntecedentesRelevantes.getText().isEmpty()){ 
           insert += ",h_antesedentes_r";
           values += ",'"+txtAntecedentesRelevantes.getText().toString()+"'";
           }
           if(!txtBateriaPruebas.getText().isEmpty()){ 
           insert += ",h_bateria_pruebas";
           values += ",'"+txtBateriaPruebas.getText().toString()+"'";
           }
           if(!txtDiagnosticoPresuntivo.getText().isEmpty()){ 
           insert += ",h_diagnostico_p";
           values += ",'"+txtDiagnosticoPresuntivo.getText().toString()+"'";
           }
           if(!txtRecomendaciones.getText().isEmpty()){ 
           insert += ",h_recomendaciones";
           values += ",'"+txtRecomendaciones.getText().toString()+"'";
           }
           if(!txtSeguimiento.getText().isEmpty()){ 
           insert += ",h_seguimiento";
           values += ",'"+txtSeguimiento.getText().toString()+"'";
           }
           try {
            if (oConn.FnBoolQueryExecuteUpdate(insert.concat(" ) ")+ values.concat(" ) "))){
                
                  oFunc.SubSistemaMensajeInformacion("Agregado Correctamente");
                     Limpiar();            
                }else{
                oFunc.SubSistemaMensajeError("No se pudo Registrar Intente de nuevo");
            
            }
        } catch (Exception e) {
        }
    
    
    }
     private void print(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"HCLP.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Hoja de Ruta EXMENES OCUPACIONALES");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 }
    void sbCargarDatosMC(String valor){
        
          String [] titulos={"Nº","HCL PS","Nombres","Fecha"};
          String [] registros = new String[4];
          model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
          String Sql="SELECT  d.nombres_pa||' '||d.apellidos_pa as nombre, h.h_fecha, h.h_cod,h.h_n "
                  + "FROM datos_paciente AS d INNER JOIN hcps AS h ON (d.historial_pa = h.h_cod)where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%"+valor+"%'"; 
                     
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    if (oConn.FnBoolQueryExecute(Sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                    registros[0]= oConn.setResult.getString("h_n");                 
                    registros[1]= oConn.setResult.getString("h_cod");
                    registros[2]= oConn.setResult.getString("nombre");
                    registros[3]= formato.format(oConn.setResult.getDate("h_fecha"));
                     model.addRow(registros);
                }
                 
                  // Coloca el Modelo de Nueva Cuenta
                  tbBuscar.setModel(model);
                tabla();
             
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
         
}
    void tabla(){
    tbBuscar.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbBuscar.setModel(model);          
          tbBuscar.getColumnModel().getColumn(0).setPreferredWidth(15);
          tbBuscar.getColumnModel().getColumn(1).setPreferredWidth(20);
          tbBuscar.getColumnModel().getColumn(2).setPreferredWidth(230);
          tbBuscar.getColumnModel().getColumn(3).setPreferredWidth(40);
          tbBuscar.getTableHeader().setReorderingAllowed(false);

}
    
    
    public void Limpiar(){
    txtNombre.setEditable(true);
    txtNombre.setText(null);
    txtSexo.setText(null);
    txtHCLPS.setText(null);
    txtEdad.setText(null);
    FNacimiento.setDate(null);
    txtDireccion.setText(null);
    txtApoderado.setText(null);
    txtMotivoConsulta.setText(null);
    txtAntecedentesRelevantes.setText(null);
    txtBateriaPruebas.setText(null);
    txtDiagnosticoPresuntivo.setText(null);
    txtRecomendaciones.setText(null);
    txtSeguimiento.setText(null);
    txtNombre.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FNacimiento;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable tbBuscar;
    private javax.swing.JTextArea txtAntecedentesRelevantes;
    private javax.swing.JTextField txtApoderado;
    private javax.swing.JTextArea txtBateriaPruebas;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextArea txtDiagnosticoPresuntivo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtHCLPS;
    private javax.swing.JTextArea txtMotivoConsulta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtRecomendaciones;
    private javax.swing.JTextArea txtSeguimiento;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
