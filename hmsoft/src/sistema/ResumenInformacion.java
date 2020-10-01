/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
public final class ResumenInformacion extends javax.swing.JInternalFrame {
 clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
//public static Observados addObsv;
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
        javax.swing.ImageIcon oIconoNo = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/xx.png"));
        javax.swing.ImageIcon oNo = null;
String[]Triaje = new String[]{};
     DefaultTableModel model;
     Integer cont=0;
     Integer cont1=0; 
   public ResumenInformacion() {
      initComponents();
       sbCargarDatosOcupacional("");
       jtTriaje.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/reportes.png")));
       
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTriaje = new javax.swing.ButtonGroup();
        btBuscar = new javax.swing.ButtonGroup();
        tipoPaciente = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        chkPacientes = new javax.swing.JCheckBox();
        chkOcupacional = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtBuscarCod = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jtTriaje = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTriaje = new javax.swing.JTable();
        btnDetalle = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtCompletos = new javax.swing.JTextField();
        txtFaltantes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Resumen Informacion ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        jLabel31.setText("Nombres/Apellidos:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Selecciones Tipo Busqueda"));

        btBuscar.add(chkPacientes);
        chkPacientes.setText("Pacientes");

        btBuscar.add(chkOcupacional);
        chkOcupacional.setSelected(true);
        chkOcupacional.setText("Ocupacional");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(chkPacientes)
                .addGap(18, 18, 18)
                .addComponent(chkOcupacional)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPacientes)
                    .addComponent(chkOcupacional))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Fecha");

        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        jLabel35.setText("Codigo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbTriaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbTriaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbTriaje.getTableHeader().setReorderingAllowed(false);
        tbTriaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTriajeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbTriajeMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbTriaje);

        jtTriaje.addTab("Revisar si registro paciente correctamente", jScrollPane1);

        btnDetalle.setBackground(new java.awt.Color(255, 255, 0));
        btnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        btnDetalle.setText("Mostrar Detalle");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biology1.png"))); // NOI18N
        jButton1.setText("OBSERVAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCompletos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCompletos.setForeground(new java.awt.Color(0, 51, 255));

        txtFaltantes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFaltantes.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("COMPLETOS :");

        jLabel2.setText("FALTANTES :");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtTriaje)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnDetalle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCompletos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(0, 241, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCompletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDetalle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addComponent(jtTriaje, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
   SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if(chkOcupacional.isSelected()){ 
        sbCargarDatosOcupacional(txtBuscar.getText());}
        if(chkPacientes.isSelected()){ 
        oFunc.SubSistemaMensajeError("no hay registros");
       // sbCargarDatosOcupacional(txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarKeyReleased
   
    private void tbTriajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTriajeMouseClicked
        if (evt.getClickCount() == 1) 
        {  
            String cod  = String.valueOf( tbTriaje.getValueAt(tbTriaje.getSelectedRow(),2).toString());
            String cod1  = String.valueOf( tbTriaje.getValueAt(tbTriaje.getSelectedRow(),0).toString());
//            Observados o = new Observados();
            txtBuscarCod.setText(cod1);
            
            Date fecha = null;
           try {
               fecha = formato.parse(cod);
                txtFecha.setDate(fecha);
           } catch (ParseException ex) {
               Logger.getLogger(ResumenInformacion.class.getName()).log(Level.SEVERE, null, ex);
           }
           sbCargarDatosOcupacional1(fecha);
        }
       
        if (evt.getClickCount() == 2) 
        {  
            String cod  = String.valueOf( tbTriaje.getValueAt(tbTriaje.getSelectedRow(),2).toString());
//            oFunc.SubSistemaMensajeInformacion(cod);
            Date fecha = null;
           try {
               fecha = formato.parse(cod);
           } catch (ParseException ex) {
               Logger.getLogger(ResumenInformacion.class.getName()).log(Level.SEVERE, null, ex);
           }
            printer(fecha);
            
            
        }
      
    }//GEN-LAST:event_tbTriajeMouseClicked

    private void tbTriajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTriajeMousePressed
        
    }//GEN-LAST:event_tbTriajeMousePressed

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        
        printer1(txtFecha.getDate());
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
        if(chkOcupacional.isSelected()){
            sbCargarDatosOcupacional(txtBuscar.getText().toString());}
        if(chkPacientes.isSelected()){
            oFunc.SubSistemaMensajeError("no hay registros");
            // sbCargarDatosOcupacional(txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//         dato();
//        MostrarAddObsv();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       if(!txtBuscarCod.getText().isEmpty()){
         dato();  
       }else{
            Observados o = new Observados();
            o.setVisible(true);
           o.setLocationRelativeTo(this);
       }
        
//        MostrarAddObsv();
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtBuscarCod.setText(null);
        sbCargarDatosOcupacional("");
    }//GEN-LAST:event_jButton2ActionPerformed
    public void dato(){
        Observados o = new Observados();
        String s= txtBuscarCod.getText();
        o.txtNorden.setText(s);
        o.setVisible(true);
        o.setLocationRelativeTo(this);
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTriaje;
    private javax.swing.ButtonGroup btBuscar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JCheckBox chkOcupacional;
    private javax.swing.JCheckBox chkPacientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jtTriaje;
    private javax.swing.JTable tbTriaje;
    private javax.swing.ButtonGroup tipoPaciente;
    private javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtCompletos;
    private javax.swing.JTextField txtFaltantes;
    private com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables
       
    private void abrirDialoj(){
       FichaTriajeModalCod FrmModalCod = new FichaTriajeModalCod(null,true);
        FrmModalCod.setLocationRelativeTo(null);
        FrmModalCod.setVisible(true);
    
    }    
void sbCargarDatosOcupacional(String valor){
    String [] titulos={"N°Orden","Nombre","Fecha","H.Entrada","Empresa","Contrata","T.Examen","Cargo","F.Aptitud","Estado","F.Salida","H_Salida","T.Pago"};
    String [] registros = new String[13];
    String sql="";
    if(!txtBuscarCod.getText().isEmpty()){
        sql ="select n_orden_ocupacional.n_orden, "
            + "datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + " n_orden_ocupacional.fecha_apertura_po,n_orden_ocupacional.n_hora,n_orden_ocupacional.tipo_pago,"
            + "n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
            + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,"
            + "ca.n_orden as aptitud,ca.fecha,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,"
            + "bc.n_orden as conduccion,ba.n_orden as altura,cma.n_orden as altura1,  "
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
            + "CASE  WHEN cma.p_si1 = 'TRUE' THEN 'Apto'\n" +
                    " WHEN cma.p_no1 = 'TRUE' THEN 'No Apto' END as estadoaltura,csm.n_orden as covid,"
            + "CASE  WHEN i.chkigm_reactivo = 'TRUE' THEN 'IGM:+'\n" +
                   " WHEN i.chkigm_noreactivo = 'TRUE' THEN 'IGM:-' END as estadoigm,"+
            "CASE  WHEN i.chkigg_reactivo = 'TRUE' THEN 'IGG:+'\n" +
                   " WHEN i.chkigg_noreactivo = 'TRUE' THEN 'IGG:-' END as estadoigg,"
                + "csm.n_orden as covid,ctc.n_orden as tamizaje,"
            + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
            +" left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexo7d as a ON (a.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexoc as ac ON (ac.n_orden=n_orden_ocupacional.n_orden)"
            +" left join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_conduccion as bc ON (bc.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_altura as ba ON (ba.n_orden=n_orden_ocupacional.n_orden)"      
            +" left join certificacion_medica_altura as cma ON (cma.n_orden=n_orden_ocupacional.n_orden)"      
            + "left join triaje on (n_orden_ocupacional.n_orden = triaje.n_orden)"
            +" left join constancia_salud_marsa as csm ON (n_orden_ocupacional.n_orden=csm.n_orden)"
            +" left join constancia_tamizaje_covid19 as ct ON (n_orden_ocupacional.n_orden=ct.n_orden)"
            +" left join examen_inmunologico as i ON (n_orden_ocupacional.n_orden=i.n_orden)"
           + "where n_orden_ocupacional.n_orden='"+txtBuscarCod.getText().toString()+"'"
            + "ORDER BY n_orden_ocupacional.n_orden ";    
    }else{
        sql ="select n_orden_ocupacional.n_orden, "
            + "datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + " n_orden_ocupacional.fecha_apertura_po,n_orden_ocupacional.n_hora,n_orden_ocupacional.tipo_pago,"
            + "n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
            + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,"
            + "ca.n_orden as aptitud,ca.fecha,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,"
            + "bc.n_orden as conduccion,ba.n_orden as altura,cma.n_orden as altura1,   "
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
            + "CASE  WHEN cma.p_si1 = 'TRUE' THEN 'Apto'\n" +
                    " WHEN cma.p_no1 = 'TRUE' THEN 'No Apto' END as estadoaltura,"
            + "CASE  WHEN i.chkigm_reactivo = 'TRUE' THEN 'IGM:+'\n" +
                  " WHEN i.chkigm_noreactivo = 'TRUE' THEN 'IGM:-' END as estadoigm,"
            + "CASE  WHEN i.chkigg_reactivo = 'TRUE' THEN 'IGG:+' \n" +
                   " WHEN i.chkigg_noreactivo = 'TRUE' THEN 'IGG:-' END as estadoigg,"
                + "csm.n_orden as covid,"
                + "ct.n_orden as tamizaje,"
                + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
            +" left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexo7d as a ON (a.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexoc as ac ON (ac.n_orden=n_orden_ocupacional.n_orden)"
            +" left join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_conduccion as bc ON (bc.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_altura as ba ON (ba.n_orden=n_orden_ocupacional.n_orden)"      
            +" left join certificacion_medica_altura as cma ON (cma.n_orden=n_orden_ocupacional.n_orden)"      
            + "left join triaje on (n_orden_ocupacional.n_orden = triaje.n_orden)"
            +" left join constancia_salud_marsa as csm ON (n_orden_ocupacional.n_orden=csm.n_orden)"
            +" left join constancia_tamizaje_covid19 as ct ON (n_orden_ocupacional.n_orden=ct.n_orden)"
            +" left join examen_inmunologico as i ON (n_orden_ocupacional.n_orden=i.n_orden)"
            + "where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%"+valor+"%'"
            + "ORDER BY n_orden_ocupacional.n_orden desc ";    
    }
          
      // DefaultTableModel tblDatos = (DefaultTableModel) tblProductos.getModel(); 
    
      model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
       
//       int cont=0;
//       int cont1=0;
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("n_orden");
                    registros[1]= oConn.setResult.getString("nombres");
                    registros[2]= formato.format(oConn.setResult.getDate("fecha_apertura_po"));
                    registros[3]= oConn.setResult.getString("n_hora");
                    registros[4]= oConn.setResult.getString("razon_empresa");
                    registros[5]= oConn.setResult.getString("razon_contrata");
                    String exa=oConn.setResult.getString("nom_examen");
                    registros[6]= exa;
                    registros[7]= oConn.setResult.getString("cargo_de");
                    String s=oConn.setResult.getString("aptitud");
                    String a=oConn.setResult.getString("anexo7d");
                    String o=oConn.setResult.getString("observados");
                    String ac=oConn.setResult.getString("anexoc");
                    String bc=oConn.setResult.getString("conduccion");
                    String ba=oConn.setResult.getString("altura");
                    String aa=oConn.setResult.getString("altura1");
                    String csm = oConn. setResult.getString("covid");
                    String ctc = oConn. setResult.getString("tamizaje");
                    String igm=oConn.setResult.getString("estadoigm");
                    String igg=oConn.setResult.getString("estadoigg");
                    String estadoi=igm+"/"+igg;
                    if(s != null ){
                        registros[8]="COMPLETO";
                        registros[9]= oConn.setResult.getString("estado");
//                        cont++;
                    }else if( a != null && "ANEXO-7D".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoad");
//                            cont++;
                    }else if( o!= null){
                            registros[8]="OBSERVADO";
                            registros[9]= oConn.setResult.getString("examenes");
//                            cont1++;
                    }else if( ac!= null && "ANEXO-C".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoac");
//                            cont++;
                    }else if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadobc");
//                            cont++;
                    }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoba");
//                            cont++;
                    }else if( aa!= null && "TEST-ALTURA".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoaltura");
//                            cont++;
                    }else if( csm!= null && ("COVID-19".equals(exa)|| "COVID-19 CUANTITATIVA".equals(exa))){
                            registros[8]="COMPLETO";
                            registros[9]= estadoi;
//                            cont++;
                    }else if( ctc!= null && ("COVID-19".equals(exa)|| "COVID-19 CUANTITATIVA".equals(exa))){
                            registros[8]="COMPLETO";
                            registros[9]= estadoi;
//                            cont++;
                    }else{ 
                        registros[8]="FALTA";
                        registros[9]= " ";
//                        cont1++;
                    }
                    if(oConn.setResult.getDate("fecha")!= null){
                        registros[10]= formato.format(oConn.setResult.getDate("fecha"));
                    }else{
                        registros[10]= " ";
                    }
                    
                    registros[11]= oConn.setResult.getString("horasalida");
                    registros[12]= oConn.setResult.getString("tipo_pago");
//                    oPe.fecha(FechaFicha);
//                    FechaFicha.setDate());
//                    txtFecha.setText(formato.format(oConn.setResult.getDate("fecha_apertura_po")));
//                    if("CREDITO".equals(registros[12])){
//                        cont++;
//                            registros[13]=String.valueOf(cont);
//                        
//                    }else{
//                        cont1++;
//                        registros[13]=String.valueOf(cont1);
//                        
//                    }
//                    
//                    tbTriaje.setDefaultRenderer(Object.class, new MyCellRenderer());
                    this.tbTriaje.setDefaultRenderer(Object.class, colorCelda());
                            
                     model.addRow(registros);
                }
               
                  // Coloca el Modelo de Nueva Cuenta
                  tbTriaje.setModel(model);
                  sbTablaResumen();
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(ResumenInformacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
public static final  DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
private DefaultTableCellRenderer colorCelda(){
    DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(){
         @Override
         public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//            setBackground(Color.WHITE );
//             setForeground(Color.BLACK);
             boolean valid = String.valueOf(table.getValueAt(row, 8)).equals("COMPLETO");
             boolean valid1= String.valueOf(table.getValueAt(row, 8)).equals("OBSERVADO");
//             boolean valid2= String.valueOf(table.getValueAt(row, 12)).equals("EFECTIVO");
             if(valid){
                 setBackground(Color.green );
             }else if(valid1){
                 setBackground(Color.orange );
             }else{
                 setBackground(Color.red );
             }
             if(isSelected){
                setBackground(Color.lightGray );
            }

            if(column==12){
//                String valor =value.toString();
             if(String.valueOf(table.getValueAt(row, 12)).equals("EFECTIVO")){
                 setBackground(Color.CYAN );
             }else if(String.valueOf(table.getValueAt(row, 12)).equals("CREDITO")){
                 setBackground(Color.yellow );
             }else{
                  setBackground(Color.red );
             }
//                switch (valor){
//                    case "EFECTIVO" : setBackground(Color.CYAN );break;
//                    case "CREDITO" : setBackground(Color.yellow );break;   
//                    
//                }
            }
            
             return component;
         }
    };
     return dtcr;
}
//public class MyCellRenderer extends DefaultTableCellRenderer {
//    @Override
//    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//       
//        boolean valid = String.valueOf(table.getValueAt(row, 8)).equals("COMPLETO");
//        boolean valid1= String.valueOf(table.getValueAt(row, 8)).equals("OBSERVADO");
////        boolean valid2= String.valueOf(table.getValueAt(row, 12)).equals("EFECTIVO");
//        component.setBackground(valid ? Color.green :valid1? Color.ORANGE:Color.RED);
////        component.setForeground(valid ? Color.black : Color.white);
//        return this;
//    }
//}
    private void sbTablaResumen() {
        tbTriaje.getColumnModel().getColumn(0).setMinWidth(50);
        tbTriaje.getColumnModel().getColumn(0).setMaxWidth(50);
//tbTriaje.getColumnModel().getColumn(1).setMinWidth(130);//260
//tbTriaje.getColumnModel().getColumn(1).setMaxWidth(130);
        tbTriaje.getColumnModel().getColumn(2).setMinWidth(80);//130
        tbTriaje.getColumnModel().getColumn(2).setMaxWidth(80);
        tbTriaje.getColumnModel().getColumn(3).setMinWidth(70);//260
        tbTriaje.getColumnModel().getColumn(3).setMaxWidth(70); 
        tbTriaje.getColumnModel().getColumn(8).setMinWidth(80);//260
        tbTriaje.getColumnModel().getColumn(8).setMaxWidth(80); 
        tbTriaje.getColumnModel().getColumn(10).setMinWidth(80);//260
        tbTriaje.getColumnModel().getColumn(10).setMaxWidth(80); 
        tbTriaje.getColumnModel().getColumn(11).setMinWidth(70);//260
        tbTriaje.getColumnModel().getColumn(11).setMaxWidth(70); 
        tbTriaje.getColumnModel().getColumn(12).setMinWidth(75);//260
        tbTriaje.getColumnModel().getColumn(12).setMaxWidth(75); 
        tbTriaje.setFont(new java.awt.Font("Tahoma", 0, 11));
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();

        // Asignamos el Alineamiento Horizontal a la derecha
//        cellAlinear.setHorizontalAlignment(SwingConstants.LEFT);
          cellAlinear.setHorizontalTextPosition(PROPERTIES);
//        tbTriaje.setSelectionForeground(Color.BLUE);
//         tbTriaje.setSelectionBackground(Color.YELLOW);
        tbTriaje.setGridColor(Color.blue);
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
//        tbTriaje.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(8).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        tbTriaje.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11));
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));

    }
public int calcularEdad(Calendar fechaNac){
    Calendar today = Calendar.getInstance();
    int diay = today.get(Calendar.YEAR);
    int fechay = fechaNac.get(Calendar.YEAR);
    int diff_year = diay - fechay;
    int diam = today.get(Calendar.MONTH);
    int fecham = fechaNac.get(Calendar.MONTH);
    int diff_month = diam - fecham;
    int dia = today.get(Calendar.DAY_OF_MONTH);
    int fecha = fechaNac.get(Calendar.DAY_OF_MONTH);
    int diff_day = dia - fecha;
    //Si está en ese año pero todavía no los ha cumplido
    if(diff_month<0 || (diff_month==0 && diff_day<0)){
        int factor=1;
        diff_year = diff_year - factor;
    }
    return diff_year;
}
    private void printer(Date cod) {
        Map parameters = new HashMap();
        parameters.put("Fecha", cod);
        try {
               String master = System.getProperty("user.dir")
                    + "/reportes/ReporteDetalle.jasper";
            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            // Genera el reporte usando el objeto JasperReport e indicando la conexion
            JasperPrint myPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
                    //JasperPrint myPrint = JasperFillManager.fillReport(myReport, null,new JREmptyDataSource());
            // Visualiza el Reporte
            JasperViewer.viewReport(myPrint, false);
        } catch (JRException ex) {
            Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void printer1(Date cod) {
        Map parameters = new HashMap();
        parameters.put("Fecha", cod);
        try {
               String master = System.getProperty("user.dir")
                    + "/reportes/ReportePagos.jasper";
            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            // Genera el reporte usando el objeto JasperReport e indicando la conexion
            JasperPrint myPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
                    //JasperPrint myPrint = JasperFillManager.fillReport(myReport, null,new JREmptyDataSource());
            // Visualiza el Reporte
            JasperViewer.viewReport(myPrint, false);
        } catch (JRException ex) {
            Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
void sbCargarDatosOcupacional1(Date valor){
    String [] titulos={"N°Orden","Nombre","Fecha","H.Entrada","Empresa","Contrata","T.Examen","Cargo","F.Aptitud","Estado","F.Salida","H_Salida","T.Pago"};
    String [] registros = new String[13];
    String sql="";
    if(!txtBuscarCod.getText().isEmpty()){
     
        sql ="select n_orden_ocupacional.n_orden, "
            + "datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + " n_orden_ocupacional.fecha_apertura_po,n_orden_ocupacional.n_hora,n_orden_ocupacional.tipo_pago,"
            + "n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
            + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,"
            + "ca.n_orden as aptitud,ca.fecha,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,"
            + "bc.n_orden as conduccion,ba.n_orden as altura,cma.n_orden as altura1,   "
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
            + "CASE  WHEN cma.p_si1 = 'TRUE' THEN 'Apto'\n" +
                    " WHEN cma.p_no1 = 'TRUE' THEN 'No Apto' END as estadoaltura,"
            + "CASE  WHEN i.chkigm_reactivo = 'TRUE' THEN 'IGM:+'\n" +
                  " WHEN i.chkigm_noreactivo = 'TRUE' THEN 'IGM:-' END as estadoigm,"
            + "CASE  WHEN i.chkigg_reactivo = 'TRUE' THEN 'IGG:+' \n" +
                   " WHEN i.chkigg_noreactivo = 'TRUE' THEN 'IGG:-' END as estadoigg,"
                + "csm.n_orden as covid,"
                + "ct.n_orden as tamizaje,"
                + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
            +" left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexo7d as a ON (a.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexoc as ac ON (ac.n_orden=n_orden_ocupacional.n_orden)"
            +" left join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_conduccion as bc ON (bc.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_altura as ba ON (ba.n_orden=n_orden_ocupacional.n_orden)"      
            +" left join certificacion_medica_altura as cma ON (cma.n_orden=n_orden_ocupacional.n_orden)"      
            + "left join triaje on (n_orden_ocupacional.n_orden = triaje.n_orden)"
            +" left join constancia_salud_marsa as csm ON (n_orden_ocupacional.n_orden=csm.n_orden)"
            +" left join constancia_tamizaje_covid19 as ct ON (n_orden_ocupacional.n_orden=ct.n_orden)"
            +" left join examen_inmunologico as i ON (n_orden_ocupacional.n_orden=i.n_orden)"
            + "where n_orden_ocupacional.fecha_apertura_po='"+valor+"'"
            + "ORDER BY n_orden_ocupacional.n_orden desc ";    
    
          
      // DefaultTableModel tblDatos = (DefaultTableModel) tblProductos.getModel(); 
    
      model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
       
//       int cont=0;
//       int cont1=0;
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("n_orden");
                    registros[1]= oConn.setResult.getString("nombres");
                    registros[2]= formato.format(oConn.setResult.getDate("fecha_apertura_po"));
                    registros[3]= oConn.setResult.getString("n_hora");
                    registros[4]= oConn.setResult.getString("razon_empresa");
                    registros[5]= oConn.setResult.getString("razon_contrata");
                    String exa=oConn.setResult.getString("nom_examen");
                    registros[6]= exa;
                    registros[7]= oConn.setResult.getString("cargo_de");
                    String s=oConn.setResult.getString("aptitud");
                    String a=oConn.setResult.getString("anexo7d");
                    String o=oConn.setResult.getString("observados");
                    String ac=oConn.setResult.getString("anexoc");
                    String bc=oConn.setResult.getString("conduccion");
                    String ba=oConn.setResult.getString("altura");
                    String aa=oConn.setResult.getString("altura1");
                    String csm = oConn. setResult.getString("covid");
                    String ctc = oConn. setResult.getString("tamizaje");
                    String igm=oConn.setResult.getString("estadoigm");
                    String igg=oConn.setResult.getString("estadoigg");
                    String estadoi=igm+"/"+igg;
                    if(s != null ){
                        registros[8]="COMPLETO";
                        registros[9]= oConn.setResult.getString("estado");
//                        cont++;
                    }else if( a != null && "ANEXO-7D".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoad");
//                            cont++;
                    }else if( o!= null){
                            registros[8]="OBSERVADO";
                            registros[9]= oConn.setResult.getString("examenes");
//                            cont1++;
                    }else if( ac!= null && "ANEXO-C".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoac");
//                            cont++;
                    }else if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadobc");
//                            cont++;
                    }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoba");
//                            cont++;
                    }else if( aa!= null && "TEST-ALTURA".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoaltura");
//                            cont++;
                    }else if( csm!= null && ("COVID-19".equals(exa)|| "COVID-19 CUANTITATIVA".equals(exa))){
                            registros[8]="COMPLETO";
                            registros[9]= estadoi;
//                            cont++;
                    }else if( ctc!= null && ("COVID-19".equals(exa)|| "COVID-19 CUANTITATIVA".equals(exa))){
                            registros[8]="COMPLETO";
                            registros[9]= estadoi;
//                            cont++;
                    }else{ 
                        registros[8]="FALTA";
                        registros[9]= " ";
//                        cont1++;
                    }
                    if(oConn.setResult.getDate("fecha")!= null){
                        registros[10]= formato.format(oConn.setResult.getDate("fecha"));
                    }else{
                        registros[10]= " ";
                    }
                    
                    registros[11]= oConn.setResult.getString("horasalida");
                    registros[12]= oConn.setResult.getString("tipo_pago");
//                    oPe.fecha(FechaFicha);
//                    FechaFicha.setDate());
//                    txtFecha.setText(formato.format(oConn.setResult.getDate("fecha_apertura_po")));
//                    if("CREDITO".equals(registros[12])){
//                        cont++;
//                            registros[13]=String.valueOf(cont);
//                        
//                    }else{
//                        cont1++;
//                        registros[13]=String.valueOf(cont1);
//                        
//                    }
//                    
//                    tbTriaje.setDefaultRenderer(Object.class, new MyCellRenderer());
                    this.tbTriaje.setDefaultRenderer(Object.class, colorCelda());
                            
                     model.addRow(registros);
                }
               
                  // Coloca el Modelo de Nueva Cuenta
                  tbTriaje.setModel(model);
                  sbTablaResumen();
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(ResumenInformacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    txtCompletos.setText(String.valueOf(cont));
    txtFaltantes.setText(String.valueOf(cont1));
    cont=0;
    cont1=0;
}
}
