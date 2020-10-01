/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public final class RadiografiaTorax extends javax.swing.JInternalFrame {
clsConnection oConn = new clsConnection();
 clsFunciones  oFunc = new clsFunciones();
 clsOperacionesUsuarios oPe= new clsOperacionesUsuarios();
  DefaultTableModel model;
    public RadiografiaTorax() {
        initComponents();
        jtRadiografico.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/impresora.png")));
        jtReporte.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
         FechaNacimiento = new com.toedter.calendar.JDateChooser();
        CargarDatos("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bgBuscar = new javax.swing.ButtonGroup();
        bgTipoCliente = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        chkRecibo = new javax.swing.JCheckBox();
        chkNorden = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumero = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FechaExamen = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtVertices = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtHilios = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSenosCostofrenicos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMediastinos = new javax.swing.JTextField();
        txtSiluetaCardiovascular = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtOsteomuscular = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtConclusionesRadiograficas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacionesrt = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        chkConsultas = new javax.swing.JCheckBox();
        chkOcupacionales = new javax.swing.JCheckBox();
        txtBuscar = new javax.swing.JTextField();
        txtBuscarCod = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jtRadiografico = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRadiografia = new javax.swing.JTable();
        jtReporte = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        chkFechaOcupacionales = new javax.swing.JCheckBox();
        chkExternos = new javax.swing.JCheckBox();
        btnConsulta = new javax.swing.JButton();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Fecha2 = new com.toedter.calendar.JDateChooser();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtCamposPulm = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        chkCampPul = new javax.swing.JCheckBox();
        chkObservacion = new javax.swing.JCheckBox();
        chkNoRx = new javax.swing.JCheckBox();
        chkLlenarObeservaciones = new javax.swing.JCheckBox();
        chkLlenar1 = new javax.swing.JCheckBox();
        chkLlenar2 = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Radiografia de Torax P.A");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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
                formInternalFrameOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tipo Cliente"));

        bgTipoCliente.add(chkRecibo);
        chkRecibo.setText("Nro Recibo");

        bgTipoCliente.add(chkNorden);
        chkNorden.setSelected(true);
        chkNorden.setText("Nro Orden");
        chkNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNordenActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkRecibo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkNorden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chkRecibo)
            .addComponent(chkNorden)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnEditar))
        );

        jLabel1.setText("Nombres :");

        jLabel2.setText("Apellidos :");

        txtNombres.setEditable(false);

        txtApellidos.setEditable(false);

        jLabel3.setText("Edad :");

        txtEdad.setEditable(false);

        jLabel4.setText("años");

        jLabel5.setText("Fecha Examen :");

        jLabel6.setText("Vértices :");

        txtVertices.setBackground(new java.awt.Color(211, 226, 242));
        txtVertices.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVerticesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVerticesFocusLost(evt);
            }
        });

        jLabel7.setText("Hilios :");

        txtHilios.setBackground(new java.awt.Color(211, 226, 242));
        txtHilios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHiliosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHiliosFocusLost(evt);
            }
        });

        jLabel8.setText("Senos Costofrenicos :");

        txtSenosCostofrenicos.setBackground(new java.awt.Color(211, 226, 242));
        txtSenosCostofrenicos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenosCostofrenicosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenosCostofrenicosFocusLost(evt);
            }
        });

        jLabel9.setText("Mediastinos :");

        txtMediastinos.setBackground(new java.awt.Color(211, 226, 242));
        txtMediastinos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMediastinosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMediastinosFocusLost(evt);
            }
        });

        txtSiluetaCardiovascular.setBackground(new java.awt.Color(211, 226, 242));
        txtSiluetaCardiovascular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSiluetaCardiovascularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSiluetaCardiovascularFocusLost(evt);
            }
        });

        jLabel10.setText("Silueta Cardiovascular :");

        jLabel11.setText("Osteomuscular :");

        txtOsteomuscular.setBackground(new java.awt.Color(211, 226, 242));
        txtOsteomuscular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOsteomuscularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOsteomuscularFocusLost(evt);
            }
        });

        jLabel12.setText("Conclusiones Radiográficas :");

        txtConclusionesRadiograficas.setBackground(new java.awt.Color(211, 226, 242));
        txtConclusionesRadiograficas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConclusionesRadiograficasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConclusionesRadiograficasFocusLost(evt);
            }
        });

        jLabel13.setText("Observaciones :");

        txtObservacionesrt.setBackground(new java.awt.Color(211, 226, 242));
        txtObservacionesrt.setColumns(20);
        txtObservacionesrt.setLineWrap(true);
        txtObservacionesrt.setRows(3);
        txtObservacionesrt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtObservacionesrtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacionesrtFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtObservacionesrt);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Buscar por Nombre"));

        bgBuscar.add(chkConsultas);
        chkConsultas.setText("Externos");
        chkConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConsultasActionPerformed(evt);
            }
        });

        bgBuscar.add(chkOcupacionales);
        chkOcupacionales.setSelected(true);
        chkOcupacionales.setText("Ocupacionales");
        chkOcupacionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOcupacionalesActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        jLabel37.setText("Codigo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(chkConsultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkOcupacionales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel37)
                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(chkOcupacionales)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(chkConsultas))
        );

        tbRadiografia.setModel(new javax.swing.table.DefaultTableModel(
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
        tbRadiografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbRadiografiaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbRadiografia);

        jtRadiografico.addTab("Informe de Examen", jScrollPane2);

        jLabel34.setText("Buscar por Fechas :");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar por :"));

        chkFechaOcupacionales.setSelected(true);
        chkFechaOcupacionales.setText("Ocupacionales");

        chkExternos.setText("Externos");

        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnConsulta.setText("Ejecutar Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkExternos)
                .addGap(18, 18, 18)
                .addComponent(chkFechaOcupacionales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsulta)
                .addGap(37, 37, 37))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnConsulta)
                    .addComponent(chkFechaOcupacionales)
                    .addComponent(chkExternos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel35.setText("Desde");

        jLabel36.setText("Desde");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtReporte.addTab("Reportes por Fechas", jPanel4);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar/Actualizar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtCamposPulm.setBackground(new java.awt.Color(211, 226, 242));
        txtCamposPulm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCamposPulmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCamposPulmFocusLost(evt);
            }
        });

        jLabel14.setText("Campos Pulmonares :");

        chkCampPul.setText("TRAMA BRONCOVASCULAR ACENTUADA EN ACP");
        chkCampPul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCampPulActionPerformed(evt);
            }
        });

        chkObservacion.setText("EVALUACION ANUAL");
        chkObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkObservacionActionPerformed(evt);
            }
        });

        chkNoRx.setText("NO SE TOMO RX DE TORAX");
        chkNoRx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoRxActionPerformed(evt);
            }
        });

        chkLlenarObeservaciones.setText("NO SE TOMO RADIOGRAFIA DE TORAX PORQUE COLABORADOR PASO EXAMEN....");
        chkLlenarObeservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLlenarObeservacionesActionPerformed(evt);
            }
        });

        chkLlenar1.setText("HACIENDOSE RESPONSABLE POR NO PASAR ESTE EXAMEN");
        chkLlenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLlenar1ActionPerformed(evt);
            }
        });

        chkLlenar2.setText("EVALUADO POR NEUMOLOGO");
        chkLlenar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLlenar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btnAgregar)
                                .addGap(10, 10, 10)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel11)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtOsteomuscular, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtConclusionesRadiograficas, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel10)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtSiluetaCardiovascular, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel14))
                                            .addGap(4, 4, 4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtMediastinos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCamposPulm, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(chkCampPul)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSenosCostofrenicos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel13)
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkObservacion)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHilios, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(4, 4, 4)
                                        .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtRadiografico)
                    .addComponent(jtReporte)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkNoRx)
                            .addComponent(chkLlenarObeservaciones)
                            .addComponent(chkLlenar1)
                            .addComponent(chkLlenar2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jtRadiografico, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jtReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkNoRx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkLlenarObeservaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkLlenar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkLlenar2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHilios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenosCostofrenicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCamposPulm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCampPul, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtMediastinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtSiluetaCardiovascular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtOsteomuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtConclusionesRadiograficas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addComponent(btnLimpiar))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNordenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNordenActionPerformed

    private void chkConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkConsultasActionPerformed

    private void chkOcupacionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOcupacionalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOcupacionalesActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        if(chkFechaOcupacionales.isSelected() == true){
            ReporteFechas(Fecha1.getDate(), Fecha2.getDate());
        }
    }//GEN-LAST:event_btnConsultaActionPerformed
      private void ReporteFechas(Date date1, Date date2){

                Map parameters = new HashMap(); 
                parameters.put("Fecha1",date1);             
                parameters.put("Fecha2",date2);

                try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"ReporteFechasRadiografia.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Radiografía de Torax - Reporte por Fechas");
                  //  viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }
    private void txtVerticesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVerticesFocusGained
       if(!txtNombres.getText().isEmpty()){txtVertices.selectAll();}
    }//GEN-LAST:event_txtVerticesFocusGained

    private void txtVerticesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVerticesFocusLost
        if(!txtNombres.getText().isEmpty()){
            if(txtVertices.getText().isEmpty()){
                txtVertices.setText("LIBRES");}
        }
    }//GEN-LAST:event_txtVerticesFocusLost
    
    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
       if(chkNorden.isSelected() == true){
           norden();
       }
       if(chkRecibo.isSelected() == true){
      oFunc.SubSistemaMensajeError("no");
        
       }
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtHiliosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHiliosFocusGained
        if(!txtNombres.getText().isEmpty()){txtHilios.selectAll();}
    }//GEN-LAST:event_txtHiliosFocusGained

    private void txtHiliosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHiliosFocusLost
        if(!txtNombres.getText().isEmpty()){
            if(txtHilios.getText().isEmpty()){
            txtHilios.setText("NORMALES");
            }
        }
    }//GEN-LAST:event_txtHiliosFocusLost

    private void txtSenosCostofrenicosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenosCostofrenicosFocusGained
        if(!txtNombres.getText().isEmpty()){txtSenosCostofrenicos.selectAll();}
    }//GEN-LAST:event_txtSenosCostofrenicosFocusGained

    private void txtSenosCostofrenicosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenosCostofrenicosFocusLost
        if(!txtNombres.getText().isEmpty()){
              if(txtSenosCostofrenicos.getText().isEmpty()){
            txtSenosCostofrenicos.setText("LIBRES");
              }
        }
    }//GEN-LAST:event_txtSenosCostofrenicosFocusLost

    private void txtMediastinosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMediastinosFocusGained
        if(!txtNombres.getText().isEmpty()){txtMediastinos.selectAll();}
    }//GEN-LAST:event_txtMediastinosFocusGained

    private void txtMediastinosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMediastinosFocusLost
       if(!txtNombres.getText().isEmpty()){
             if(txtMediastinos.getText().isEmpty()){
            txtMediastinos.setText("NORMALES");
             }
        }
    }//GEN-LAST:event_txtMediastinosFocusLost

    private void txtSiluetaCardiovascularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSiluetaCardiovascularFocusGained
         if(!txtNombres.getText().isEmpty()){txtSiluetaCardiovascular.selectAll();}
    }//GEN-LAST:event_txtSiluetaCardiovascularFocusGained

    private void txtSiluetaCardiovascularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSiluetaCardiovascularFocusLost
       if(!txtNombres.getText().isEmpty()){
             if(txtSiluetaCardiovascular.getText().isEmpty()){
            txtSiluetaCardiovascular.setText("NORMAL");
             }
        }
    }//GEN-LAST:event_txtSiluetaCardiovascularFocusLost

    private void txtOsteomuscularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOsteomuscularFocusGained
        if(!txtNombres.getText().isEmpty()){txtOsteomuscular.selectAll();}
    }//GEN-LAST:event_txtOsteomuscularFocusGained

    private void txtOsteomuscularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOsteomuscularFocusLost
        if(!txtNombres.getText().isEmpty()){
              if(txtOsteomuscular.getText().isEmpty()){
            txtOsteomuscular.setText("NORMAL");
              }
        }
    }//GEN-LAST:event_txtOsteomuscularFocusLost

    private void txtConclusionesRadiograficasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConclusionesRadiograficasFocusGained
        if(!txtNombres.getText().isEmpty()){txtConclusionesRadiograficas.selectAll();}
    }//GEN-LAST:event_txtConclusionesRadiograficasFocusGained

    private void txtConclusionesRadiograficasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConclusionesRadiograficasFocusLost
        if(!txtNombres.getText().isEmpty()){
              if(txtConclusionesRadiograficas.getText().isEmpty()){
            txtConclusionesRadiograficas.setText("NORMAL");
              }
        }
    }//GEN-LAST:event_txtConclusionesRadiograficasFocusLost

    private void txtObservacionesrtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesrtFocusGained
       if(!txtNombres.getText().isEmpty()){txtObservacionesrt.selectAll();}
    }//GEN-LAST:event_txtObservacionesrtFocusGained

    private void txtObservacionesrtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesrtFocusLost
       if(!txtNombres.getText().isEmpty()){
             if(txtObservacionesrt.getText().isEmpty()){
            txtObservacionesrt.setText("NORMAL");
             }
        }
    }//GEN-LAST:event_txtObservacionesrtFocusLost

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(OrdenExiste()){
            Actualizar();
        }else{
             if(chkNorden.isSelected()== true){
             AddNorden();}
             if(chkRecibo.isSelected()== true){oFunc.SubSistemaMensajeInformacion("Aun se Implementa este servicio para Usuarios con Recibo");Limpiar();}
        }
       
         
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
          if(chkOcupacionales.isSelected()== true){
        CargarDatos(txtBuscar.getText());
        }
        if(chkConsultas.isSelected()== true){oFunc.SubSistemaMensajeError("No hay registros");
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tbRadiografiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRadiografiaMousePressed
        if (evt.getClickCount() == 2) 
        {  
            Integer cod  = Integer.valueOf( tbRadiografia.getValueAt(tbRadiografia.getSelectedRow(),0).toString());
            print(cod);
            
        }
    }//GEN-LAST:event_tbRadiografiaMousePressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         txtNumero.requestFocusInWindow();
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtCamposPulmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCamposPulmFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamposPulmFocusGained

    private void txtCamposPulmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCamposPulmFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamposPulmFocusLost

    private void chkCampPulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCampPulActionPerformed
       if(chkCampPul.isSelected()){
           txtCamposPulm.setText("TRAMA BRONCOVASCULAR ACENTUADA EN ACP.");
       }
    }//GEN-LAST:event_chkCampPulActionPerformed

    private void chkObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkObservacionActionPerformed
            if(chkObservacion.isSelected()){
                txtObservacionesrt.setText(null);
                txtObservacionesrt.append("EVALUACION ANUAL.");
            }
    }//GEN-LAST:event_chkObservacionActionPerformed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
        CargarDatos(txtBuscarCod.getText());
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(!txtNumero.getText().isEmpty()){
           
             String Sql="SELECT d.nombres_pa,d.apellidos_pa,d.fecha_nacimiento_pa, "
                     +"r.fecha_examen, r.txtvertices, \n" +
                    "r.txthilios, r.txtsenoscostofrenicos, r.txtmediastinos, r.txtsiluetacardiovascular, \n" +
                    "r.txtosteomuscular, r.txtconclusionesradiograficas, r.txtobservacionesrt, \n" +
                    "r.txtcampospulm "
              + "FROM datos_paciente AS d "
                     + "INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa)"
                      + "INNER JOIN radiografia_torax AS r ON(n.n_orden = r.n_orden)"
                     + "WHERE n.n_orden ='"+txtNumero.getText().toString()+"'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa")); 
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        FechaExamen.setDate(oConn.setResult.getDate("fecha_examen"));
                        txtVertices.setText(oConn.setResult.getString("txtvertices"));
                        txtHilios.setText(oConn.setResult.getString("txthilios"));
                        txtSenosCostofrenicos.setText(oConn.setResult.getString("txtsenoscostofrenicos"));
                        txtMediastinos.setText(oConn.setResult.getString("txtmediastinos"));
                        txtSiluetaCardiovascular.setText(oConn.setResult.getString("txtsiluetacardiovascular"));
                        txtOsteomuscular.setText(oConn.setResult.getString("txtosteomuscular"));
                        txtConclusionesRadiograficas.setText(oConn.setResult.getString("txtconclusionesradiograficas"));
                        txtObservacionesrt.setText(oConn.setResult.getString("txtobservacionesrt"));
                        txtCamposPulm.setText(oConn.setResult.getString("txtcampospulm"));
                      }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Radiografia:" + ex.getMessage().toString());}
           
    
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void chkNoRxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoRxActionPerformed
        if(chkNoRx.isSelected()){
            txtVertices.setText("NO SE TOMÓ RX DE TORAX");
            txtHilios.setText("NO SE TOMÓ RX DE TORAX");
            txtSenosCostofrenicos.setText("NO SE TOMÓ RX DE TORAX");
            txtCamposPulm.setText("NO SE TOMÓ RX DE TORAX");
            txtMediastinos.setText("NO SE TOMÓ RX DE TORAX");
            txtSiluetaCardiovascular.setText("NO SE TOMÓ RX DE TORAX");
            txtOsteomuscular.setText("NO SE TOMÓ RX DE TORAX");
            txtConclusionesRadiograficas.setText("NO SE TOMÓ RX DE TORAX");
            txtObservacionesrt.setText("NO SE TOMÓ RX DE TORAX");
        }
    }//GEN-LAST:event_chkNoRxActionPerformed

    private void chkLlenarObeservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLlenarObeservacionesActionPerformed
       if(chkLlenarObeservaciones.isSelected()){
           txtObservacionesrt.setText("NO SE TOMÓ RX DE TORAX PORQUE COLABORADOR PASO EXAMEN ..... HACE .... MESES PARA LA EMPRESA......");
       }
    }//GEN-LAST:event_chkLlenarObeservacionesActionPerformed

    private void chkLlenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLlenar1ActionPerformed
        if(chkLlenar1.isSelected()){
           txtObservacionesrt.append(" HACIENDOSE RESPONSABLE POR NO PASAR ESTE EXAMEN");
       }
    }//GEN-LAST:event_chkLlenar1ActionPerformed

    private void chkLlenar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLlenar2ActionPerformed
        if(chkLlenar2.isSelected()){
           txtObservacionesrt.append(" EVALUADO POR NEUMOLOGO");
       }
    }//GEN-LAST:event_chkLlenar2ActionPerformed
    public static com.toedter.calendar.JDateChooser FechaNacimiento;
    private void Actualizar(){
        String sCodigo=txtNumero.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE radiografia_torax\n" +
                "   SET edad_rat='"+txtEdad.getText().toString()+"',fecha_examen='"+FechaExamen.getDate()+"', \n" +
                "       txtvertices='"+txtVertices.getText().toString()+"', txthilios='"+txtHilios.getText().toString()+"', "
                + "txtsenoscostofrenicos='"+txtSenosCostofrenicos.getText().toString()+"', txtmediastinos='"+txtMediastinos.getText().toString()+"', \n" +
                "       txtsiluetacardiovascular='"+txtSiluetaCardiovascular.getText().toString()+"', txtosteomuscular='"+txtOsteomuscular.getText().toString()+"', "
                + "txtconclusionesradiograficas='"+txtConclusionesRadiograficas.getText().toString()+"', \n" +
                "       txtobservacionesrt='"+txtObservacionesrt.getText().toString()+"', txtcampospulm='"+txtCamposPulm.getText().toString()+"' " +
                " WHERE n_orden='" + sCodigo + "'";
             Limpiar();
             txtNumero.setEnabled(true);
             txtNumero.requestFocus();
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
    }
    void AddNorden(){
       if(!txtNumero.getText().isEmpty()){ 
         if(validar()){  
            String insert ="INSERT INTO radiografia_torax(n_orden,edad_rat";
            String values ="VALUES ('"+txtNumero.getText().toString()+"','"+txtEdad.getText().toString()+"'";
            if(!txtVertices.getText().isEmpty()){
            insert +=",txtvertices"; values+=",'"+txtVertices.getText().toString()+"'";
            }
            if(!txtHilios.getText().isEmpty()){
            insert +=",txthilios"; values+=",'"+txtHilios.getText().toString()+"'";
            }
            if(!txtSenosCostofrenicos.getText().isEmpty()){
            insert +=",txtsenoscostofrenicos"; values+=",'"+txtSenosCostofrenicos.getText().toString()+"'";
            }
            if(!txtCamposPulm.getText().isEmpty()){
            insert +=",txtcampospulm"; values+=",'"+txtCamposPulm.getText().toString()+"'";
            }
            if(!txtMediastinos.getText().isEmpty()){
            insert +=",txtmediastinos"; values+=",'"+txtMediastinos.getText().toString()+"'";
            }
            if(!txtSiluetaCardiovascular.getText().isEmpty()){
            insert +=",txtsiluetacardiovascular"; values+=",'"+txtSiluetaCardiovascular.getText().toString()+"'";
            }
            if(!txtOsteomuscular.getText().isEmpty()){
            insert +=",txtosteomuscular"; values+=",'"+txtOsteomuscular.getText().toString()+"'";
            }
            if(!txtConclusionesRadiograficas.getText().isEmpty()){
            insert +=",txtconclusionesradiograficas"; values+=",'"+txtConclusionesRadiograficas.getText().toString()+"'";
            }
            if(!txtObservacionesrt.getText().isEmpty()){
            insert +=",txtobservacionesrt"; values+=",'"+txtObservacionesrt.getText().toString()+"'";
            }
            insert +=",fecha_examen)"; 
            values+=",'"+FechaExamen.getDate()+"')";
                //oFunc.SubSistemaMensajeError(insert + values);
                    if (oConn.FnBoolQueryExecuteUpdate(insert + values)){
                        //imprimir();
                        oFunc.SubSistemaMensajeInformacion("Agregado correctamente");
                        imprimirNumero();
                        FechaNacimiento.setDate(null);
                        CargarDatos("");
                        Limpiar();

                    }else {oFunc.SubSistemaMensajeError("No se pudo Agregar Registro Intente Nuevamente");
                    }
            }
       }else{oFunc.SubSistemaMensajeError("Ingrese Nro ");
       }
    }
       
    private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaExamen.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
  
   return bResultado;
}
    void norden(){
        
        if(!txtNumero.getText().isEmpty()){
           if(!OrdenExiste()){
             String Sql="SELECT d.nombres_pa,d.apellidos_pa,d.fecha_nacimiento_pa "
              + "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa)WHERE n.n_orden ='"+txtNumero.getText().toString()+"'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa")); 
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        oPe.fecha(FechaExamen);
                        defecto();
                        txtNumero.setEditable(false);
                        
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Radiografia:" + ex.getMessage().toString());}
           }
    
        }
    }
    public boolean OrdenExiste()
    {
        boolean bResultado=false;

        String sQuery;

        sQuery  = "Select n_orden from radiografia_torax Where n_orden="+txtNumero.getText().toString();
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             Limpiar();
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }

        return bResultado;
        
    }
    void defecto(){
    txtVertices.setText("LIBRES");
    txtHilios.setText("NORMALES");
    txtSenosCostofrenicos.setText("LIBRES");
    txtCamposPulm.setText("NORMALES");
    txtMediastinos.setText("NORMALES");
    txtSiluetaCardiovascular.setText("NORMAL");
    txtOsteomuscular.setText("NORMAL");
    txtConclusionesRadiograficas.setText("NORMAL");
    txtObservacionesrt.setText("NORMAL");
    }
    void Limpiar(){
    txtVertices.setText(null);
    txtHilios.setText(null);
    txtSenosCostofrenicos.setText(null);
    txtMediastinos.setText(null);
    txtSiluetaCardiovascular.setText(null);
    txtOsteomuscular.setText(null);
    txtConclusionesRadiograficas.setText(null);
    txtCamposPulm.setText(null);
    txtObservacionesrt.setText(null);
    FechaExamen.setDate(null);
    FechaNacimiento.setDate(null);
    txtEdad.setText(null);
    txtNombres.setText(null);
    txtApellidos.setText(null);
    txtNumero.setText(null);
    txtNumero.setEditable(true);
    chkNoRx.setSelected(false);
    chkLlenarObeservaciones.setSelected(false);
    txtNumero.requestFocus();
    }
    public void CargarDatos(String valor){
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
   String [] titulos={"N° Orden","Nombres y Apellidos","Fecha"};
    String [] registros = new String[3];    
   model = new DefaultTableModel(null,titulos){
            
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
    String Sql="";
    if(!txtBuscarCod.getText().isEmpty()){
        Sql="select d.nombres_pa||' '||d.apellidos_pa AS nombres,r.n_orden,  r.fecha_examen "
            + "FROM radiografia_torax AS r "
            + "INNER JOIN n_orden_ocupacional AS n ON (r.n_orden = n.n_orden)"
            + "INNER JOIN datos_paciente AS d ON (n.cod_pa = d.cod_pa)"
            + "WHERE r.n_orden='"+txtBuscarCod.getText().toString()+"'";
    }else{
        Sql="select d.nombres_pa||' '||d.apellidos_pa AS nombres,r.n_orden,  r.fecha_examen "
            + "FROM radiografia_torax AS r "
            + "INNER JOIN n_orden_ocupacional AS n ON (r.n_orden = n.n_orden)"
            + "INNER JOIN datos_paciente AS d ON (n.cod_pa = d.cod_pa)"
            + "WHERE CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%"+valor+"%'";
    }
    
                if (oConn.FnBoolQueryExecute(Sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                                     
                    registros[0]= oConn.setResult.getString("n_orden");
                    registros[1]= oConn.setResult.getString("nombres");
                    registros[2]= formato.format(oConn.setResult.getDate("fecha_examen"));
                     model.addRow(registros);
                }
                
                  // Coloca el Modelo de Nueva Cuenta
                  tbRadiografia.setModel(model);
               sbImp();
             
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           
}
void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaExamen.setDate(fechaDate);
}  
void sbImp(){
       
                 
          tbRadiografia.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbRadiografia.getColumnModel().getColumn(0).setPreferredWidth(100);
          tbRadiografia.getColumnModel().getColumn(1).setPreferredWidth(400);
          tbRadiografia.getColumnModel().getColumn(2).setPreferredWidth(200);
          
}
private boolean imprimirNumero(){
    boolean im = false;
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir?", //Mensaje
    "Seleccione una opción", // Título
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,    // null para icono por defecto.
    new Object[] { "Si", "No"},    // null para YES, NO y CANCEL
    "Si");
    if (seleccion != -1)
    {
   if((seleccion + 1)==1)
   {
      printer(Integer.valueOf(txtNumero.getText().toString()));
       im = true;
   }
   else
   {
      // PRESIONO NO
     }
    }
    return im;

}
   private void printer(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"RagiografiaToraxPA.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  JasperPrintManager.printReport(jasperPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
    private void print(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"RagiografiaToraxPA.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Radiografía de Torax P.A");
                    //viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha1;
    private com.toedter.calendar.JDateChooser Fecha2;
    private com.toedter.calendar.JDateChooser FechaExamen;
    private javax.swing.ButtonGroup bgBuscar;
    private javax.swing.ButtonGroup bgTipoCliente;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkCampPul;
    private javax.swing.JCheckBox chkConsultas;
    private javax.swing.JCheckBox chkExternos;
    private javax.swing.JCheckBox chkFechaOcupacionales;
    private javax.swing.JCheckBox chkLlenar1;
    private javax.swing.JCheckBox chkLlenar2;
    private javax.swing.JCheckBox chkLlenarObeservaciones;
    private javax.swing.JCheckBox chkNoRx;
    private javax.swing.JCheckBox chkNorden;
    private javax.swing.JCheckBox chkObservacion;
    private javax.swing.JCheckBox chkOcupacionales;
    private javax.swing.JCheckBox chkRecibo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jtRadiografico;
    private javax.swing.JTabbedPane jtReporte;
    private javax.swing.JTable tbRadiografia;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtCamposPulm;
    private javax.swing.JTextField txtConclusionesRadiograficas;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtHilios;
    private javax.swing.JTextField txtMediastinos;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObservacionesrt;
    private javax.swing.JTextField txtOsteomuscular;
    private javax.swing.JTextField txtSenosCostofrenicos;
    private javax.swing.JTextField txtSiluetaCardiovascular;
    private javax.swing.JTextField txtVertices;
    // End of variables declaration//GEN-END:variables
}
