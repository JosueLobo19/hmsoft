/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import Caja.*;
import Clases.ExportarExel;
import Clases.clsConnection;
import Clases.clsFunciones;
import autocomplete.ajTextField;
import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.IndexedColors;
import sistema.Audiometria;


/**
 *
 * @author Administrador
 */
public class ConsultaPacientes extends javax.swing.JInternalFrame {
        DefaultTableModel model;        
   clsConnection oConn = new clsConnection();
         clsFunciones  oFunc = new clsFunciones();
    public ConsultaPacientes() {
        initComponents();
        personalizado(false);
        Columnas(true);   
    }
    private void LimpiarPersonalizado(){

    Fhasta.setDate(null);
    Fdesde.setDate(null);
    
    }
    private void personalizado(boolean t){
    Fdesde.setEnabled(t);
    Fhasta.setEnabled(t);
    btnMostrar.setEnabled(t);
    btnLimpiar.setEnabled(t);
    
    }
    
    private void Columnas(boolean t){
    
    
    }
    private void cOrdenServicio(){
//               
//                 model = new DefaultTableModel(){        
//                 @Override
//                    public boolean isCellEditable(int rowIndex, int columnIndex) {
//                    return false;
//                    }};
//                 String vSql="SELECT n.n_orden AS FICHA, ";
//                         if(chk1.isSelected()== true){
//                        vSql += "n.nom_examen AS EXAMEN,";
//                         }
//                         if(chk9.isSelected()== true){
//                         vSql += "n.n_fisttest as FISTTEST,";
//                         }
//                         if(chk10.isSelected()== true){
//                          vSql += "n.n_psicosen as PSICOSENSO, ";
//                         }
//                         if(chk11.isSelected()== true){
//                         vSql+= "n.n_testaltura as TESTALTURA, ";
//                         }
//                         if(chk2.isSelected()== true){
//                         vSql += "d.cod_pa AS DNI,";
//                         }
//                         if(chk3.isSelected()== true){
//                          vSql += "d.nombres_pa||' '||d.apellidos_pa AS NOMBRES, ";
//                         }
//                         if(chk4.isSelected()== true){
//                         vSql+= "n.cargo_de AS CARGO, ";
//                         }
//                         if(chk5.isSelected()== true){
//                         vSql+= "n.fecha_apertura_po AS FECHA, ";
//                          }
//                         
//                         if(chk7.isSelected()== true){
//                         vSql+= "n.razon_contrata AS CONTRATA, ";
//                                 }
//                         if(chk8.isSelected()== true){
//                         vSql+= "n.razon_empresa AS EMPRESA, ";
//                                 }
//                         if(chk6.isSelected()== true){
//                         vSql+= "n.tipo_pago AS TIPOPAGO, ";
//                                 }
//                         vSql+= "n.precio_po::numeric AS PRECIO "
//                             
//                + "FROM n_orden_ocupacional AS n "
//                + "LEFT JOIN datos_paciente AS d ON (n.cod_pa = d.cod_pa) "
//                + "LEFT JOIN lab_clinico AS l ON (n.n_orden = l.n_orden)"                
//                + "WHERE n.o_servicio ="+txtOrdenServicio.getText().toString();
//                  if (oConn.FnBoolQueryExecute(vSql))
//             {
//             try  {
//                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
//                        int CantidaColumnas = rsmt.getColumnCount();
//                        for (int i = 1; i <= CantidaColumnas; i++) {
//                         model.addColumn(rsmt.getColumnLabel(i));
//                        }
//                    while (oConn.setResult.next())
//                    {
//                        Object [] Fila = new Object[CantidaColumnas];
//                        for (int i = 0; i < CantidaColumnas; i++) {
//                            Fila[i] = oConn.setResult.getObject(i+1);
//                        }
//                        model.addRow(Fila);
//                    }
//                      tbReporte.setModel(model);
//                     oConn.setResult.close();
//                } 
//                catch (SQLException ex) 
//                {
//                    oFunc.SubSistemaMensajeError(ex.toString());
//                    Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
        }
    private void cPersonalizada(){
//    model = new DefaultTableModel(){        
//                 @Override
//                    public boolean isCellEditable(int rowIndex, int columnIndex) {
//                    return false;
//                    }};
//                    String vSql="SELECT  n.n_orden AS FICHA ";
//                         if(chk5.isSelected()== true){
//                         vSql+= ",n.fecha_apertura_po AS FECHAEMO ";
//                          }
//                         if(chk3.isSelected()== true){
//                          vSql += ",d.nombres_pa||' '||d.apellidos_pa AS NOMBRES ";
//                         }
//                         if(chk2.isSelected()== true){
//                         vSql += ",d.cod_pa AS DNI ";
//                         }
//                         vSql+=",d.fecha_nacimiento_pa AS FECHANACIMIENTO ";
//                         vSql+=",obtener_edad(d.fecha_nacimiento_pa,n.fecha_apertura_po) as EDAD";
//                         if(chk4.isSelected()== true){
//                         vSql+= ",n.cargo_de AS CARGO ";
//                         }
//                        
//                         if(chk7.isSelected()== true){
//                         vSql+= ",n.razon_contrata AS CONTRATA ";
//                                 }
//                         if(chk8.isSelected()== true){
//                         vSql+= ",n.razon_empresa AS EMPRESA ";
//                                 }
//                          if(chk1.isSelected()== true){
//                        vSql += ",n.nom_examen AS EXAMEN ";
//                         }
//                         if(chk9.isSelected()== true){
//                         vSql += ",n.n_fisttest as FISTTEST ";
//                         }
//                         if(chk10.isSelected()== true){
//                          vSql += ",n.n_psicosen as PSICOSENSO ";
//                         }
//                         if(chk11.isSelected()== true){
//                         vSql+= ",n.n_testaltura as TESTALTURA ";
//                         }
//                         if(chk12.isSelected()== true){
//                         vSql += ",CASE WHEN ie.n_orden is not null  AND n.nom_examen ='ANEXO-7D' "
//                                 + "THEN 'true' ELSE 'false' END AS EKG ";
//                         }
//                         vSql+=",CASE WHEN l.chko = 'TRUE' THEN 'O'"
//                            + "       WHEN l.chka = 'TRUE' THEN 'A'\n" +
//                            "         WHEN l.chkb = 'TRUE' THEN 'B'\n" +
//                            "         WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| \n" +
//                            "  CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' \n" +
//                            "      WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS GRUPOFACTOR ";                 
//                        vSql+=",  CASE  WHEN o.n_orden is not null THEN 'Observado'\n" +
//                    "                   WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
//                    "                   WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
//                    "                   WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
//                    "                   WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
//                    "                   WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
//                    "                   WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
//                    "                   WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
//                    "                   WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
//                    "                   WHEN cma.p_si1 = 'TRUE' THEN 'Apto'\n" +
//                    "                   WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  \n" +
//                    "                   WHEN ac.no_apto = 'TRUE' THEN 'No Apto' \n" +
//                    "                   WHEN a.no_apto = 'TRUE' THEN 'No Apto'\n" +
//                    "                   WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto'\n" +
//                    "                   WHEN cma.p_no1 = 'TRUE' THEN 'No Apto'\n" +
//                    "		        WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
//                    "                   WHEN ba.chk_observado = 'TRUE' THEN 'Observado' END as condicion ";
//                         if(chk6.isSelected()== true){
//                         vSql+= ",n.tipo_pago AS TIPOPAGO ";
//                                 }
//                         vSql+= ",n.precio_po::numeric AS PRECIO "
//                + "FROM n_orden_ocupacional AS n "
//                + "LEFT JOIN datos_paciente AS d ON (n.cod_pa = d.cod_pa) "
//                + "LEFT JOIN lab_clinico AS l ON (n.n_orden = l.n_orden) "  
//                + "LEFT JOIN informe_electrocardiograma AS ie ON (n.n_orden = ie.n_orden)  "  
//                +" LEFT JOIN certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden)"      
//                +" left join anexo7d as a ON (a.n_orden=n.n_orden)"
//                +" left join anexoc as ac ON (ac.n_orden=n.n_orden)"
//                +" left join observaciones as o ON (o.n_orden=n.n_orden)"
//                +" left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)"
//                +" left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)"
//                 +" left join certificacion_medica_altura as cma ON (cma.n_orden=n.n_orden)" ;              
//                if(!txtContrata.getText().isEmpty()){
//                vSql +="WHERE '"+txtContrata.getText().toString()+"' = n.razon_contrata ";
//                }
//                if(!txtContrata.getText().isEmpty() & !txtEmpresa.getText().isEmpty()){
//                vSql +=" AND ";
//                }
//                if(txtContrata.getText().isEmpty() && !txtEmpresa.getText().isEmpty()){
//                vSql +=" WHERE ";
//                }                
//                if(!txtEmpresa.getText().isEmpty()){
//                vSql +="'"+txtEmpresa.getText().toString()+"' = n.razon_empresa";
//                }
//                if(chkRepTestAltura.isSelected()){
//                    vSql +=" and n.n_testaltura = 'true'";
//                }
//                if(chkRepPsicosen.isSelected()){
//                    vSql +=" and n.n_psicosen = 'true'";
//                }
//                 if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) 
//                 {
//                     if(txtEmpresa.getText().isEmpty() && txtContrata.getText().isEmpty() ){
//                          vSql +=" WHERE n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
//                     }else{
//                         vSql +=" AND n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
//                     }
//                     
//                 }
//                 if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) 
//                 {
//                 vSql +=" AND n.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"'";
//                 }
//                         
//                         
//                   //oFunc.SubSistemaMensajeInformacion(vSql);      
//                if (oConn.FnBoolQueryExecute(vSql))
//             {
//             try  {
//                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
//                        int CantidaColumnas = rsmt.getColumnCount();
//                        for (int i = 1; i <= CantidaColumnas; i++) {
//                         model.addColumn(rsmt.getColumnLabel(i));
//                        }
//                    while (oConn.setResult.next())
//                    {
//                        Object [] Fila = new Object[CantidaColumnas];
//                       
//                        for (int i = 0; i < CantidaColumnas; i++) {
//                           
//                            Fila[i] = oConn.setResult.getObject(i+1);
//                        }
//                        model.addRow(Fila);
//                    }
//                    tbReporte = autoResizeColWidth(tbReporte, model);
//                      tbReporte.setModel(model);
//                     oConn.setResult.close();
//                } 
//                catch (SQLException ex) 
//                {
//                    oFunc.SubSistemaMensajeError(ex.toString());
//                    Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
    
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btTipoReporte = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReporte = new javax.swing.JTable();
        btnExportarExel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fhasta = new com.toedter.calendar.JDateChooser();
        Fdesde = new com.toedter.calendar.JDateChooser();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodPaciente = new javax.swing.JTextField();
        pgExportar = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Reporte para control Interno e Impresion detallada");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tbReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbReporte);

        jTabbedPane1.addTab("Reporte", jScrollPane1);

        btnExportarExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        btnExportarExel.setText("Exportar");
        btnExportarExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExelActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Personalizada"));

        jLabel4.setText("Desde :");

        jLabel5.setText("Hasta :");

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fhasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnMostrar)
                    .addComponent(jLabel1)
                    .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fhasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnLimpiar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        jButton2.setText("Vista detallada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton3.setText("Nuevo reporte");

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pgExportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExportarExel)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnExportarExel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(btnImprimir)
                        .addGap(2, 2, 2)
                        .addComponent(pgExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarPersonalizado();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
          
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnExportarExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExelActionPerformed
//        if(this.tbReporte.getRowCount()==0){
//            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//        JFileChooser chooser = new JFileChooser();
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de exel", "xls");
//        chooser.setFileFilter(filter);
//        chooser.setDialogTitle("Guardar archivo");
//        chooser.setMultiSelectionEnabled(false);
//        chooser.setAcceptAllFileFilterUsed(false);
//        if(chooser.showSaveDialog(null)== JFileChooser.APPROVE_OPTION){
//            List<JTable> tb = new ArrayList<>();
//            List<String> nom = new ArrayList<>();
//        tb.add(tbReporte);
//        nom.add("socios");
//        String file=chooser.getSelectedFile().toString().concat(".xls");
//        try{
//            ExportarExel e = new ExportarExel(new File(file), tb, nom);
//            if(e.export()){
//                JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel.","Reportes",JOptionPane.INFORMATION_MESSAGE);
//            }
//        }catch (Exception ex){
//            JOptionPane.showMessageDialog(null, "Hubo un error"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
//        
//        }
//        
//        }
        if(this.tbReporte.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        generar(tbReporte);
    }//GEN-LAST:event_btnExportarExelActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        cPersonalizada();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        ReporteFechas(Fdesde.getDate(), Fhasta.getDate());
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
public void generar(JTable table) {
        HSSFWorkbook libro = new HSSFWorkbook();
        HSSFSheet hoja = libro.createSheet("Reporte");
           //  HSSFRow trow = hoja.createRow((short) 0);
         // createTituloCell(libro, trow, 0, CellStyle.ALIGN_CENTER,CellStyle.VERTICAL_CENTER, "Titulo del Excel");

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de exel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        //////////
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String file = chooser.getSelectedFile().toString().concat(".xls");
            ///////////////////////
            HSSFFont fuente = libro.createFont();
            HSSFFont fuente2 = libro.createFont();
fuente.setFontHeightInPoints((short)8);         
fuente.setFontName(HSSFFont.FONT_ARIAL);
fuente.setColor(IndexedColors.WHITE.getIndex());
fuente.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
///////////
fuente2.setFontHeightInPoints((short)7);         
fuente2.setFontName(HSSFFont.FONT_ARIAL);
fuente2.setColor(IndexedColors.BLACK.getIndex());

///////////////////
HSSFCellStyle estiloCelda = libro.createCellStyle();
HSSFCellStyle estiloCelda2 = libro.createCellStyle();

estiloCelda.setWrapText(true);
estiloCelda.setAlignment(HSSFCellStyle. ALIGN_CENTER);
estiloCelda.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
estiloCelda.setFont(fuente);
/////////////////////
estiloCelda2.setWrapText(true);
estiloCelda2.setAlignment(HSSFCellStyle. ALIGN_LEFT);
estiloCelda2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
estiloCelda2.setFont(fuente2);
//////////////////
// También, podemos establecer bordes...
estiloCelda.setBorderBottom(HSSFCellStyle.BORDER_THIN);
estiloCelda.setBottomBorderColor((short)8);
estiloCelda.setBorderLeft(HSSFCellStyle.BORDER_THIN);
estiloCelda.setLeftBorderColor((short)8);
estiloCelda.setBorderRight(HSSFCellStyle.BORDER_THIN);
estiloCelda.setRightBorderColor((short)8);
estiloCelda.setBorderTop(HSSFCellStyle.BORDER_THIN);
estiloCelda.setTopBorderColor((short)8);
//////////
estiloCelda2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setBottomBorderColor((short)8);
estiloCelda2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setLeftBorderColor((short)8);
estiloCelda2.setBorderRight(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setRightBorderColor((short)8);
estiloCelda2.setBorderTop(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setTopBorderColor((short)8);
///////////////////////
estiloCelda.setFillForegroundColor(IndexedColors.DARK_BLUE.getIndex());
estiloCelda.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
///////////////////////////////
        // oFunc.SubSistemaMensajeInformacion(String.valueOf(table.getColumnCount()));
            //   oFunc.SubSistemaMensajeInformacion(String.valueOf(table.getRowCount()));
            for (int i = 0; i < table.getRowCount() ; i++) {
                
               if (i == 0) {
                   HSSFRow fila = hoja.createRow(i);
                 for (int j = 0; j < table.getColumnCount() ; j++) {
                        HSSFCell celda = fila.createCell(j);
                        celda.setCellValue(new HSSFRichTextString(table.getColumnModel().getColumn(j).getHeaderValue().toString().toUpperCase()));
                       celda.setCellStyle(estiloCelda);
                   }
              } //else {
                    HSSFRow fila = hoja.createRow(i+1);
                    for (int j = 0; j < table.getColumnCount() ; j++) {
                        HSSFCell celda = fila.createCell(j);
                         
                        if (table.getValueAt(i, j) != null) {
                           
                            celda.setCellValue(new HSSFRichTextString(table.getValueAt(i, j).toString()));
                            hoja.autoSizeColumn(j);
                            celda.setCellStyle(estiloCelda2); 
                   // }
                 }      
                
               }
                try {
                    try (FileOutputStream elFichero = new FileOutputStream(file)) {
                        libro.write(elFichero);
                    }
                } catch (IOException e) {
                }
            }
          oFunc.SubSistemaMensajeInformacion("REPORTE COMPLETO");
 }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fdesde;
    private com.toedter.calendar.JDateChooser Fhasta;
    private javax.swing.ButtonGroup btTipoReporte;
    private javax.swing.JButton btnExportarExel;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JProgressBar pgExportar;
    private javax.swing.JTable tbReporte;
    private javax.swing.JTextField txtCodPaciente;
    // End of variables declaration//GEN-END:variables

   public JTable autoResizeColWidth(JTable table, DefaultTableModel model) {
    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    table.setModel(model);

    int margin = 5;

    for (int i = 0; i < table.getColumnCount(); i++) {
        int                     vColIndex = i;
        DefaultTableColumnModel colModel  = (DefaultTableColumnModel) table.getColumnModel();
        TableColumn             col       = colModel.getColumn(vColIndex);
        int                     width     = 0;

        // Get width of column header
        TableCellRenderer renderer = col.getHeaderRenderer();

        if (renderer == null) {
            renderer = table.getTableHeader().getDefaultRenderer();
        }

        Component comp = renderer.getTableCellRendererComponent(table, col.getHeaderValue(), false, false, 0, 0);

        width = comp.getPreferredSize().width;

        // Get maximum width of column data
        for (int r = 0; r < table.getRowCount(); r++) {
            renderer = table.getCellRenderer(r, vColIndex);
            comp     = renderer.getTableCellRendererComponent(table, table.getValueAt(r, vColIndex), false, false,
                    r, vColIndex);
            width = Math.max(width, comp.getPreferredSize().width);
        }

        // Add margin
        width += 2 * margin;

        // Set the width
        col.setPreferredWidth(width);
    }

    ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.LEFT);

    // table.setAutoCreateRowSorter(true);
    table.getTableHeader().setReorderingAllowed(false);

    return table;
} 
   private void ReporteFechas(Date date1, Date date2){

                Map parameters = new HashMap(); 
                parameters.put("Fecha1",date1);             
                parameters.put("Fecha2",date2);

                try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"ReporteAtendidos.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Ficha 'Reporte por Fechas'");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }
   void Condicion(){
        String dato;
        String sql="";
        sql ="select n.nom_examen,n.cargo_de,"
            + "ca.n_orden as aptitud,ca.fecha,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,"
            + "bc.n_orden as conduccion,ba.n_orden as altura,  "
            + "CASE  WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  END as estado, \n" 
            + "CASE  WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ac.no_apto = 'TRUE' THEN 'No Apto' END as estadoac, \n" 
            + "CASE  WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN a.no_apto = 'TRUE' THEN 'No Apto' END as estadoad,"
            + "CASE  WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN bc.chk_no = 'TRUE' THEN 'No Apto' END as estadobc,"
            + "CASE  WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN ba.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto' END as estadoba,"
                + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional as n ON (datos_paciente.cod_pa = n.cod_pa)"
            +" left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden)"
            +" left join anexo7d as a ON (a.n_orden=n.n_orden)"
            +" left join anexoc as ac ON (ac.n_orden=n.n_orden)"
            +" left join observaciones as o ON (o.n_orden=n.n_orden)"
            +" left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)"
            +" left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)"     
//            + "where n.n_orden='"+valor+"'"
            + "ORDER BY n.n_orden desc ";    
    
       
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    
                    String exa=oConn.setResult.getString("nom_examen");
                    String s=oConn.setResult.getString("aptitud");
                    String a=oConn.setResult.getString("anexo7d");
                    String o=oConn.setResult.getString("observados");
                    String ac=oConn.setResult.getString("anexoc");
                    String bc=oConn.setResult.getString("conduccion");
                    String ba=oConn.setResult.getString("altura");
                    
                    if( o!= null){
                            dato= "Observado";
                    }else if(s != null ){
                        dato= oConn.setResult.getString("estado");
                    }else if( a != null && "ANEXO-7D".equals(exa)){
                           dato= oConn.setResult.getString("estadoad");
                    }else  if( ac!= null && "ANEXO-C".equals(exa)){
                            dato= oConn.setResult.getString("estadoac");
                    }else if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                            dato= oConn.setResult.getString("estadobc");
                    }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                            dato= oConn.setResult.getString("estadoba");
                    }
                    
                }
                
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
            }
        }
}
}
