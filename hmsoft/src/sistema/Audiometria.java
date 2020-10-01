/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public final class Audiometria extends javax.swing.JInternalFrame {
        clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   DefaultTableModel model;
    String[]nombres = new String[]{};
    public Audiometria() {
        initComponents();
        Deshabilitar(true);
      sbCargarDatosAudiometria("");
      jtAudiometria.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/doc.png")));
    
       nombres = getRowsToVector("select nombre_user||' '||apellido_user as nombres from usuarios");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        btProtectores = new javax.swing.ButtonGroup();
        btApreciacionRuido = new javax.swing.ButtonGroup();
        jtAudiometria = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtNroOrden = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Fechaexamen = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtTipoExamen = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FechaCalibracion = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtApellidosyNombres = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtanosTrabajo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNomContrata = new javax.swing.JTextField();
        txtNomEmpresa = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtTiempoExposicionTotalPonderado = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        chkTapones = new javax.swing.JCheckBox();
        chkGrajeras = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        chkIntenso = new javax.swing.JCheckBox();
        chkModerado = new javax.swing.JCheckBox();
        chkNoMolesto = new javax.swing.JCheckBox();
        Limpiar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        chk1_si = new javax.swing.JCheckBox();
        chk1_no = new javax.swing.JCheckBox();
        chk2_si = new javax.swing.JCheckBox();
        chk3_si = new javax.swing.JCheckBox();
        chk4_si = new javax.swing.JCheckBox();
        chk5_si = new javax.swing.JCheckBox();
        chk6_si = new javax.swing.JCheckBox();
        chk2_no = new javax.swing.JCheckBox();
        chk3_no = new javax.swing.JCheckBox();
        chk4_no = new javax.swing.JCheckBox();
        chk5_no = new javax.swing.JCheckBox();
        chk6_no = new javax.swing.JCheckBox();
        chk9_si = new javax.swing.JCheckBox();
        chk10_si = new javax.swing.JCheckBox();
        jLabel43 = new javax.swing.JLabel();
        chk8_si = new javax.swing.JCheckBox();
        chk8_no = new javax.swing.JCheckBox();
        chk9_no = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        chk11_si = new javax.swing.JCheckBox();
        chk12_si = new javax.swing.JCheckBox();
        chk7_si = new javax.swing.JCheckBox();
        chk7_no = new javax.swing.JCheckBox();
        chk10_no = new javax.swing.JCheckBox();
        chk12_no = new javax.swing.JCheckBox();
        chk11_no = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtdOD250 = new javax.swing.JTextField();
        txtdOD500 = new javax.swing.JTextField();
        txtdOD1000 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtdOI500 = new javax.swing.JTextField();
        txtdOI1000 = new javax.swing.JTextField();
        txtdOI250 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtLDUmbralDiscriminacion = new javax.swing.JTextField();
        txtLDPorcentageDiscriminacion = new javax.swing.JTextField();
        txtLDConfort = new javax.swing.JTextField();
        txtLIPorcentageDiscriminacion = new javax.swing.JTextField();
        txtLIConfort = new javax.swing.JTextField();
        txtLIUmbralDiscriminacion = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txtLDdisconfort = new javax.swing.JTextField();
        txtLIdisconfort = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtConclusiones = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        cmdLimpiar = new javax.swing.JButton();
        cmdAgregar = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        txtOtoscopia = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        txtImpFicha = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        txtmesestrabajo = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEditarAudiolog = new javax.swing.JButton();
        chkModelo = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        txtContrata = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAudiometria = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        FechaAudiometria = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtExMedico = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtBuscarCod = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtOI500 = new javax.swing.JTextField();
        txtOI1000 = new javax.swing.JTextField();
        txtOI2000 = new javax.swing.JTextField();
        txtOI3000 = new javax.swing.JTextField();
        txtOI4000 = new javax.swing.JTextField();
        txtOI6000 = new javax.swing.JTextField();
        txtOI8000 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtOD500 = new javax.swing.JTextField();
        txtOD1000 = new javax.swing.JTextField();
        txtOD2000 = new javax.swing.JTextField();
        txtOD3000 = new javax.swing.JTextField();
        txtOD4000 = new javax.swing.JTextField();
        txtOD6000 = new javax.swing.JTextField();
        txtOD8000 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        txtOI501 = new javax.swing.JTextField();
        txtOI1001 = new javax.swing.JTextField();
        txtOI2001 = new javax.swing.JTextField();
        txtOI3001 = new javax.swing.JTextField();
        txtOI4001 = new javax.swing.JTextField();
        txtOI6001 = new javax.swing.JTextField();
        txtOI8001 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtOD501 = new javax.swing.JTextField();
        txtOD1001 = new javax.swing.JTextField();
        txtOD2001 = new javax.swing.JTextField();
        txtOD3001 = new javax.swing.JTextField();
        txtOD4001 = new javax.swing.JTextField();
        txtOD6001 = new javax.swing.JTextField();
        txtOD8001 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        chkGrafico = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        atxtObservacionesAltura = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        btnActualizarAudiom = new javax.swing.JButton();
        btnEditarAudiom = new javax.swing.JButton();
        btnDiagnostico = new javax.swing.JButton();
        chkNoAudio = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        setClosable(true);
        setTitle("Audiometría");
        setToolTipText("");
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

        jLabel11.setText("Nro Orden :");

        txtNroOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroOrdenActionPerformed(evt);
            }
        });
        txtNroOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroOrdenKeyTyped(evt);
            }
        });

        jLabel12.setText("Fecha de Examen :");

        jLabel13.setText("Tipo de Examen :");

        txtTipoExamen.setEditable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Audiómetro"));

        jLabel14.setText("Marca :");

        txtMarca.setText("AMPLIVOX");
        txtMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMarcaFocusGained(evt);
            }
        });

        txtModelo.setText("AMPLIVOX 270");
        txtModelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModeloFocusGained(evt);
            }
        });

        jLabel15.setText("Modelo :");

        jLabel16.setText("Calibracion :");

        FechaCalibracion.setDateFormatString("MMMM-yyyy");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMarca)
                    .addComponent(txtModelo)
                    .addComponent(FechaCalibracion, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(FechaCalibracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setText("Apellidos y Nombres :");

        txtApellidosyNombres.setEditable(false);

        jLabel18.setText("Edad :");

        txtEdad.setEditable(false);

        jLabel19.setText("años");

        jLabel20.setText("Sexo :");

        txtSexo.setEditable(false);

        jLabel21.setText("Ocupación :");

        txtOcupacion.setEditable(false);

        jLabel22.setText("Años Trabajo. :");

        txtanosTrabajo.setBackground(new java.awt.Color(153, 204, 255));
        txtanosTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanosTrabajoActionPerformed(evt);
            }
        });

        jLabel23.setText("Empresa Contratista :");

        jLabel24.setText("Empresa :");

        txtNomContrata.setEditable(false);

        txtNomEmpresa.setEditable(false);

        jLabel26.setText("Tiempo de exposición total ponderado 8h/d :");

        txtTiempoExposicionTotalPonderado.setBackground(new java.awt.Color(153, 204, 255));
        txtTiempoExposicionTotalPonderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoExposicionTotalPonderadoActionPerformed(evt);
            }
        });

        jLabel27.setText("h/d");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Uso de protectores Auditivos"));

        btProtectores.add(chkTapones);
        chkTapones.setSelected(true);
        chkTapones.setText("Tapones");

        chkGrajeras.setText("Grajeras");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkTapones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkGrajeras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(chkTapones)
                .addComponent(chkGrajeras))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Apreciación del Ruido"));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btApreciacionRuido.add(chkIntenso);
        chkIntenso.setText("Ruido muy intenso");

        btApreciacionRuido.add(chkModerado);
        chkModerado.setSelected(true);
        chkModerado.setText("Ruido moderado");

        btApreciacionRuido.add(chkNoMolesto);
        chkNoMolesto.setText("Ruido no molesto");

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkIntenso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkModerado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkNoMolesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(chkIntenso)
                .addComponent(chkModerado)
                .addComponent(chkNoMolesto))
            .addComponent(Limpiar)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("ANTECEDENTES relacionados ");

        jLabel28.setText("SI");

        jLabel29.setText("NO");

        jLabel30.setText("Consumo de tabaco");

        jLabel31.setText("Servicio Militar");

        jLabel32.setText("Hoobies con exposición a ruido");

        jLabel33.setText("Exposición laboral a químicos");

        jLabel34.setText("Infección al Oído");

        jLabel35.setText("Uso de Ototoxicos");

        jLabel36.setText("Otra");

        jLabel37.setText("Infección al Oído");

        jLabel38.setText("Mareos");

        jLabel39.setText("Zumbido");

        jLabel40.setText("Dolor de Oídos");

        jLabel41.setText("Disminución de la audición");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("SINTOMAS actuales");

        buttonGroup1.add(chk1_si);

        buttonGroup1.add(chk1_no);
        chk1_no.setSelected(true);

        buttonGroup2.add(chk2_si);

        buttonGroup3.add(chk3_si);

        buttonGroup4.add(chk4_si);

        buttonGroup5.add(chk5_si);

        buttonGroup6.add(chk6_si);

        buttonGroup2.add(chk2_no);
        chk2_no.setSelected(true);

        buttonGroup3.add(chk3_no);
        chk3_no.setSelected(true);

        buttonGroup4.add(chk4_no);
        chk4_no.setSelected(true);

        buttonGroup5.add(chk5_no);
        chk5_no.setSelected(true);

        buttonGroup6.add(chk6_no);
        chk6_no.setSelected(true);

        buttonGroup9.add(chk9_si);

        buttonGroup10.add(chk10_si);

        jLabel43.setText("NO");

        buttonGroup8.add(chk8_si);

        buttonGroup8.add(chk8_no);
        chk8_no.setSelected(true);

        buttonGroup9.add(chk9_no);
        chk9_no.setSelected(true);

        jLabel44.setText("SI");

        buttonGroup11.add(chk11_si);

        buttonGroup12.add(chk12_si);

        buttonGroup7.add(chk7_si);

        buttonGroup7.add(chk7_no);
        chk7_no.setSelected(true);

        buttonGroup10.add(chk10_no);
        chk10_no.setSelected(true);

        buttonGroup12.add(chk12_no);
        chk12_no.setSelected(true);

        buttonGroup11.add(chk11_no);
        chk11_no.setSelected(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk6_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk6_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk5_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk5_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk3_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk3_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk2_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk2_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk1_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk1_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk4_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk4_no)))
                .addGap(79, 79, 79)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38))
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk12_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk12_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk11_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk11_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk9_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk9_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk8_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk8_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk7_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk7_no))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(chk10_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk10_no)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel30)
                            .addComponent(chk1_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk1_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel31)
                            .addComponent(chk2_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk2_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chk3_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk3_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chk4_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk4_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chk5_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk5_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk6_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk6_no, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel43))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel41)
                                    .addComponent(chk7_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk7_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel40)
                                    .addComponent(chk8_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk8_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel39)
                                    .addComponent(chk9_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk9_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel42)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel38)
                            .addComponent(chk10_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk10_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel37)
                            .addComponent(chk11_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk11_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chk12_si, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk12_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAPASONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("O.D");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText("O.I");

        jLabel47.setText("RINNE Y WEBER");

        txtdOD250.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtdOD500.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtdOD1000.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel48.setText("250 Hz.");

        jLabel49.setText("500 Hz.");

        jLabel50.setText("1000 Hz.");

        txtdOI500.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtdOI1000.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtdOI250.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel45))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtdOD250)
                        .addComponent(txtdOD500)
                        .addComponent(txtdOD1000, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtdOI250)
                        .addComponent(txtdOI500)
                        .addComponent(txtdOI1000, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(jLabel46))
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtdOD250, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(txtdOI250, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtdOD500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(txtdOI500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtdOD1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(txtdOI1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGOAUDIOMETRIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setText("Derecha");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setText("Izquierda");

        txtLDUmbralDiscriminacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLDPorcentageDiscriminacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLDConfort.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLIPorcentageDiscriminacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLIConfort.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLIUmbralDiscriminacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel63.setText("<HTML>Umbral de<BR>discriminación</HTML>");

        jLabel64.setText("<HTML>% de<BR>discriminación</HTML>");

        jLabel65.setText("<HTML>Umbral de<BR>Confort MCL</HTML>");

        jLabel66.setText("<HTML>Umbral de<BR>Disconfort UCL</HTML>");

        txtLDdisconfort.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLIdisconfort.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtLDdisconfort, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLIdisconfort, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLDUmbralDiscriminacion)
                                .addComponent(txtLDPorcentageDiscriminacion)
                                .addComponent(txtLDConfort, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel57)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLIUmbralDiscriminacion)
                            .addComponent(txtLIPorcentageDiscriminacion)
                            .addComponent(txtLIConfort, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(21, 21, 21))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtLDUmbralDiscriminacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLIUmbralDiscriminacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtLDPorcentageDiscriminacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLIPorcentageDiscriminacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtLDConfort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLIConfort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLDdisconfort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLIdisconfort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel59.setText("Nombre del profesional que realiza la audiometría :");

        txtResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsableActionPerformed(evt);
            }
        });
        txtResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResponsableKeyReleased(evt);
            }
        });

        jLabel60.setText("Conclusiones :");

        txtConclusiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConclusionesActionPerformed(evt);
            }
        });
        txtConclusiones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConclusionesFocusGained(evt);
            }
        });

        jLabel61.setText("Nombre del Medico :");

        txtMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMedicoKeyReleased(evt);
            }
        });

        cmdLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        cmdAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });

        jLabel62.setText("Otoscopia :");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Imprimir Audiologica"));

        jLabel51.setText("N° :");

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImpFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnImprimir)
                    .addComponent(txtImpFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel52.setText("y Meses :");

        txtmesestrabajo.setBackground(new java.awt.Color(153, 204, 255));
        txtmesestrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmesestrabajoActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEditarAudiolog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarAudiolog.setText("Editar");
        btnEditarAudiolog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAudiologActionPerformed(evt);
            }
        });

        chkModelo.setText("BELL PLUS");
        chkModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkModeloActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox2.setText("No Examen");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNomEmpresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomContrata, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTiempoExposicionTotalPonderado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27))
                            .addComponent(txtOtoscopia, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtApellidosyNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtanosTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmesestrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chkModelo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnEditarAudiolog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fechaexamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel59)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtResponsable))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel61)
                                            .addComponent(jLabel60))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtConclusiones)
                                            .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(cmdLimpiar)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel11)
                            .addComponent(txtNroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(Fechaexamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtTipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarAudiolog)
                            .addComponent(jCheckBox2))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel17)
                            .addComponent(txtApellidosyNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(chkModelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(txtanosTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52)
                            .addComponent(txtmesestrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel23)
                            .addComponent(txtNomContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(txtTiempoExposicionTotalPonderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtOtoscopia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(txtConclusiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdLimpiar)
                            .addComponent(cmdAgregar)
                            .addComponent(btnActualizar))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jtAudiometria.addTab("Ficha Audiologica", jPanel3);

        jLabel8.setText("Contrata :");

        jLabel10.setText("Nombres :");

        jLabel9.setText("Empresa :");

        tbAudiometria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbAudiometria);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

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

        jLabel6.setText("Fecha Ex :");

        jLabel4.setText("Apellidos :");

        jLabel5.setText("Fecha Nac :");

        jLabel3.setText("Nombres :");

        jLabel2.setText("DNI :");

        jLabel1.setText("N° Orden :");

        jLabel7.setText("Ex. Médico :");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setMnemonic('l');
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtBuscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCodActionPerformed(evt);
            }
        });
        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        jLabel53.setText("Codigo:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Oido Izquierdo"));

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("500");
        jLabel68.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("1000");
        jLabel69.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("2000");
        jLabel70.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("3000");
        jLabel71.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("4000");
        jLabel72.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("6000");
        jLabel73.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("8000");
        jLabel74.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOI500.setBackground(new java.awt.Color(248, 213, 73));
        txtOI500.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI500.setForeground(new java.awt.Color(0, 102, 204));
        txtOI500.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI500MouseClicked(evt);
            }
        });
        txtOI500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI500ActionPerformed(evt);
            }
        });

        txtOI1000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI1000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI1000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI1000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI1000MouseClicked(evt);
            }
        });
        txtOI1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI1000ActionPerformed(evt);
            }
        });

        txtOI2000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI2000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI2000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI2000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI2000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI2000MouseClicked(evt);
            }
        });
        txtOI2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI2000ActionPerformed(evt);
            }
        });

        txtOI3000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI3000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI3000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI3000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI3000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI3000MouseClicked(evt);
            }
        });
        txtOI3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI3000ActionPerformed(evt);
            }
        });

        txtOI4000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI4000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI4000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI4000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI4000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI4000MouseClicked(evt);
            }
        });
        txtOI4000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI4000ActionPerformed(evt);
            }
        });

        txtOI6000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI6000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI6000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI6000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI6000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI6000MouseClicked(evt);
            }
        });
        txtOI6000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI6000ActionPerformed(evt);
            }
        });

        txtOI8000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI8000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI8000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI8000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI8000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI8000MouseClicked(evt);
            }
        });
        txtOI8000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI8000ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 102, 102));
        jLabel75.setText("Hz");

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 102, 102));
        jLabel76.setText("db (A)");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI500, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI1000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI2000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI3000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI4000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI6000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI8000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOI500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI2000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI3000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI4000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI6000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI8000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Oido Derecho"));

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("500");
        jLabel77.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("1000");
        jLabel78.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("2000");
        jLabel79.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("3000");
        jLabel80.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("4000");
        jLabel81.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("6000");
        jLabel82.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("8000");
        jLabel83.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOD500.setBackground(new java.awt.Color(248, 213, 73));
        txtOD500.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD500.setForeground(new java.awt.Color(0, 102, 204));
        txtOD500.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD500MouseClicked(evt);
            }
        });
        txtOD500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD500ActionPerformed(evt);
            }
        });

        txtOD1000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD1000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD1000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD1000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD1000MouseClicked(evt);
            }
        });
        txtOD1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD1000ActionPerformed(evt);
            }
        });

        txtOD2000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD2000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD2000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD2000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD2000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD2000MouseClicked(evt);
            }
        });
        txtOD2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD2000ActionPerformed(evt);
            }
        });

        txtOD3000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD3000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD3000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD3000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD3000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD3000MouseClicked(evt);
            }
        });
        txtOD3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD3000ActionPerformed(evt);
            }
        });

        txtOD4000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD4000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD4000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD4000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD4000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD4000MouseClicked(evt);
            }
        });
        txtOD4000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD4000ActionPerformed(evt);
            }
        });

        txtOD6000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD6000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD6000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD6000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD6000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD6000MouseClicked(evt);
            }
        });
        txtOD6000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD6000ActionPerformed(evt);
            }
        });

        txtOD8000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD8000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD8000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD8000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD8000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD8000MouseClicked(evt);
            }
        });
        txtOD8000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD8000ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 102, 102));
        jLabel84.setText("Hz");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 102, 102));
        jLabel85.setText("db (A)");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD500, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD1000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD2000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD3000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD4000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD6000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD8000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80)
                    .addComponent(jLabel81)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83)
                    .addComponent(jLabel84))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOD500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD2000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD3000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD4000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD6000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD8000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Audiometría Aérea", jPanel1);

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Oido Izquierdo"));

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("500");
        jLabel86.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("1000");
        jLabel87.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("2000");
        jLabel88.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("3000");
        jLabel89.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("4000");
        jLabel90.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("6000");
        jLabel91.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("8000");
        jLabel92.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOI501.setBackground(new java.awt.Color(248, 213, 73));
        txtOI501.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI501.setForeground(new java.awt.Color(0, 102, 204));
        txtOI501.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI501ActionPerformed(evt);
            }
        });

        txtOI1001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI1001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI1001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI1001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI1001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI1001ActionPerformed(evt);
            }
        });

        txtOI2001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI2001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI2001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI2001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI2001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI2001ActionPerformed(evt);
            }
        });

        txtOI3001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI3001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI3001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI3001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI3001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI3001ActionPerformed(evt);
            }
        });

        txtOI4001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI4001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI4001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI4001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI4001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI4001ActionPerformed(evt);
            }
        });

        txtOI6001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI6001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI6001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI6001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI6001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI6001ActionPerformed(evt);
            }
        });

        txtOI8001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI8001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI8001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI8001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI8001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI8001ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 102, 102));
        jLabel93.setText("Hz");

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(102, 102, 102));
        jLabel94.setText("db (A)");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addComponent(jLabel94))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI501, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI1001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI2001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI3001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI4001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI6001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI8001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88)
                    .addComponent(jLabel89)
                    .addComponent(jLabel90)
                    .addComponent(jLabel91)
                    .addComponent(jLabel92)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOI501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI1001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI2001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI3001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI4001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI6001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI8001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Oido Derecho"));

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("500");
        jLabel95.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("1000");
        jLabel96.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("2000");
        jLabel97.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("3000");
        jLabel98.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("4000");
        jLabel99.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("6000");
        jLabel100.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("8000");
        jLabel101.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOD501.setBackground(new java.awt.Color(248, 213, 73));
        txtOD501.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD501.setForeground(new java.awt.Color(0, 102, 204));
        txtOD501.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD501ActionPerformed(evt);
            }
        });

        txtOD1001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD1001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD1001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD1001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD1001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD1001ActionPerformed(evt);
            }
        });

        txtOD2001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD2001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD2001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD2001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD2001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD2001ActionPerformed(evt);
            }
        });

        txtOD3001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD3001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD3001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD3001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD3001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD3001ActionPerformed(evt);
            }
        });

        txtOD4001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD4001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD4001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD4001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD4001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD4001ActionPerformed(evt);
            }
        });

        txtOD6001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD6001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD6001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD6001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD6001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD6001ActionPerformed(evt);
            }
        });

        txtOD8001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD8001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD8001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD8001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD8001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD8001ActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(102, 102, 102));
        jLabel102.setText("Hz");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(102, 102, 102));
        jLabel103.setText("db (A)");

        jCheckBox1.setText("Llenar");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD501, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD1001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD2001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD3001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD4001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD6001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD8001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOD501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD1001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD2001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD3001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD4001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD6001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD8001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Audiometría Osea", jPanel10);

        chkGrafico.setSelected(true);
        chkGrafico.setText("Activar Gráfico");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGuardar.setMnemonic('g');
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(2);
        atxtObservacionesAltura.setViewportView(txtDiagnostico);

        btnActualizarAudiom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizarAudiom.setText("Actualizar");
        btnActualizarAudiom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAudiomActionPerformed(evt);
            }
        });

        btnEditarAudiom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarAudiom.setText("Editar");
        btnEditarAudiom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAudiomActionPerformed(evt);
            }
        });

        btnDiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnDiagnostico.setText("Agregar Diagnostico");
        btnDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticoActionPerformed(evt);
            }
        });

        chkNoAudio.setText("No paso Examen");
        chkNoAudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkNoAudioMouseClicked(evt);
            }
        });
        chkNoAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoAudioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnEditarAudiom)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(chkNoAudio)
                        .addGap(35, 35, 35)
                        .addComponent(chkGrafico))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(btnActualizarAudiom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDiagnostico)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtApellidos)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDni)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FechaAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmpresa)
                                .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditarAudiom)
                            .addComponent(txtExMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(180, 180, 180)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNoAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizarAudiom))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDiagnostico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel1)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel5)
                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(FechaAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(7, 7, 7)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(231, 231, 231)))
                    .addContainerGap(128, Short.MAX_VALUE)))
        );

        jtAudiometria.addTab("Audiometría", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
             
        if(!txtNumero.getText().isEmpty()){
            if(!OrdenExiste()){
            String Sql="SELECT datos_paciente.cod_pa, "
                    + "datos_paciente.nombres_pa, "
                    + "datos_paciente.fecha_nacimiento_pa, "
                    + "datos_paciente.apellidos_pa, "
                    + "datos_paciente.sexo_pa, "
                    + "n_orden_ocupacional.razon_empresa, "
                    + "n_orden_ocupacional.cargo_de, "
                    + "n_orden_ocupacional.razon_contrata, "
                    + "n_orden_ocupacional.nom_examen "
                    + "FROM datos_paciente, n_orden_ocupacional "
                    + "WHERE datos_paciente.cod_pa  = n_orden_ocupacional.cod_pa "
                    + "AND n_orden_ocupacional.n_orden='"+txtNumero.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                       txtApellidosyNombres.setText(oConn.setResult.getString("apellidos_pa").concat(" ").concat(oConn.setResult.getString("nombres_pa")));
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtExMedico.setText(oConn.setResult.getString("nom_examen"));
                        txtNumero.setEnabled(false);
                        txtNroOrden.setText (txtNumero.getText());
                       txtSexo.setText(oConn.setResult.getString("sexo_pa"));
                      txtTipoExamen.setText(txtExMedico.getText());
                      txtOcupacion.setText(oConn.setResult.getString("cargo_de"));
                      txtNomContrata.setText(txtContrata.getText());
                      txtNomEmpresa.setText(txtEmpresa.getText());
                       txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())));
                        Fecha();
        txtOD500.requestFocus();
                     
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Audiometría:" + ex.getMessage().toString());
        } }}

    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Deshabilitar(true);
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(validar()){
        if(!txtNumero.getText().isEmpty()){
        if (oFunc.fnIntSistemaPregunta("Desea realmente Agregar el Registro")==JOptionPane.YES_OPTION){
            //datosGrafico();
            
            Agregar();
               
        }}else{oFunc.SubSistemaMensajeError("Llene los campos");
        }
        }else{oFunc.SubSistemaMensajeError("Llene los campos o Falta Diagnostico");}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtNumero.requestFocusInWindow();
       
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        sbCargarDatosAudiometria(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtResponsableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsableKeyReleased
        if(!(evt.getKeyCode()>=65 && evt.getKeyCode()<=90 || evt.getKeyCode()>=96 && evt.getKeyCode()<=105 || evt.getKeyCode() == KeyEvent.VK_ENTER ))
            return;
        if(txtResponsable.getText().isEmpty())
            return;
        if(nombres.length ==0)
            return;
        addTextAndSelectToTextFieldToRest(txtResponsable, getTextoApartirVector(txtResponsable.getText(), nombres));
    }//GEN-LAST:event_txtResponsableKeyReleased

    private void txtMedicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicoKeyReleased
         if(!(evt.getKeyCode()>=65 && evt.getKeyCode()<=90 || evt.getKeyCode()>=96 && evt.getKeyCode()<=105 || evt.getKeyCode() == KeyEvent.VK_ENTER ))
            return;
        if(txtMedico.getText().isEmpty())
            return;
        if(nombres.length ==0)
            return;
        addTextAndSelectToTextFieldToRest(txtMedico, getTextoApartirVector(txtMedico.getText(), nombres));
    }//GEN-LAST:event_txtMedicoKeyReleased

    private void txtResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsableActionPerformed
        txtConclusiones.requestFocus();
    }//GEN-LAST:event_txtResponsableActionPerformed

    private void txtConclusionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConclusionesActionPerformed
        txtMedico.requestFocus();
    }//GEN-LAST:event_txtConclusionesActionPerformed

    private void txtConclusionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConclusionesFocusGained
       txtConclusiones.selectAll();
    }//GEN-LAST:event_txtConclusionesFocusGained

    private void txtModeloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModeloFocusGained
        txtModelo.selectAll();
    
    }//GEN-LAST:event_txtModeloFocusGained

    private void txtMarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarcaFocusGained
        txtMarca.selectAll();
    }//GEN-LAST:event_txtMarcaFocusGained

    private void txtNroOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroOrdenActionPerformed
        ficha();
        nombres = getRowsToVector("select nombre_user||' '||apellido_user as nombres from usuarios");
    }//GEN-LAST:event_txtNroOrdenActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        LimpiarFicha();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtNroOrdenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroOrdenKeyTyped
      oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNroOrdenKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        AgregarFicha();
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void txtanosTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanosTrabajoActionPerformed
        txtTiempoExposicionTotalPonderado.requestFocus();
    }//GEN-LAST:event_txtanosTrabajoActionPerformed

    private void txtTiempoExposicionTotalPonderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoExposicionTotalPonderadoActionPerformed
        txtResponsable.requestFocus();
    }//GEN-LAST:event_txtTiempoExposicionTotalPonderadoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        if(!txtImpFicha.getText().isEmpty()){
        print(Integer.valueOf(txtImpFicha.getText().toString()));
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        btApreciacionRuido.clearSelection();
        btProtectores.clearSelection();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void txtmesestrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmesestrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmesestrabajoActionPerformed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
        
            sbCargarDatosAudiometria(txtBuscarCod.getText());
        
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void txtBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCodActionPerformed

    private void txtOI500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI500ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI1000.requestFocus();}
    }//GEN-LAST:event_txtOI500ActionPerformed

    private void txtOI1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI1000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI2000.requestFocus();}
    }//GEN-LAST:event_txtOI1000ActionPerformed

    private void txtOI2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI2000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI3000.requestFocus();}
    }//GEN-LAST:event_txtOI2000ActionPerformed

    private void txtOI3000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI3000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI4000.requestFocus();}
    }//GEN-LAST:event_txtOI3000ActionPerformed

    private void txtOI4000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI4000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI6000.requestFocus();}
    }//GEN-LAST:event_txtOI4000ActionPerformed

    private void txtOI6000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI6000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI8000.requestFocus();}
    }//GEN-LAST:event_txtOI6000ActionPerformed

    private void txtOD500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD500ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD1000.requestFocus();}
    }//GEN-LAST:event_txtOD500ActionPerformed

    private void txtOD1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD1000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD2000.requestFocus();}
    }//GEN-LAST:event_txtOD1000ActionPerformed

    private void txtOD2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD2000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD3000.requestFocus();}
    }//GEN-LAST:event_txtOD2000ActionPerformed

    private void txtOD3000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD3000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD4000.requestFocus();}
    }//GEN-LAST:event_txtOD3000ActionPerformed

    private void txtOD4000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD4000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD6000.requestFocus();}
    }//GEN-LAST:event_txtOD4000ActionPerformed

    private void txtOD6000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD6000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD8000.requestFocus();}
    }//GEN-LAST:event_txtOD6000ActionPerformed

    private void txtOD8000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD8000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI500.requestFocus();}
    }//GEN-LAST:event_txtOD8000ActionPerformed

    private void txtOI501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI501ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI1001.requestFocus();}
    }//GEN-LAST:event_txtOI501ActionPerformed

    private void txtOI1001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI1001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI2001.requestFocus();}
    }//GEN-LAST:event_txtOI1001ActionPerformed

    private void txtOI2001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI2001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI3001.requestFocus();}
    }//GEN-LAST:event_txtOI2001ActionPerformed

    private void txtOI3001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI3001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI4001.requestFocus();}
    }//GEN-LAST:event_txtOI3001ActionPerformed

    private void txtOI4001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI4001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI6001.requestFocus();}
    }//GEN-LAST:event_txtOI4001ActionPerformed

    private void txtOI6001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI6001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI8001.requestFocus();}
    }//GEN-LAST:event_txtOI6001ActionPerformed

    private void txtOD501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD501ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD1001.requestFocus();}
    }//GEN-LAST:event_txtOD501ActionPerformed

    private void txtOD1001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD1001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD2001.requestFocus();}
    }//GEN-LAST:event_txtOD1001ActionPerformed

    private void txtOD2001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD2001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD3001.requestFocus();}
    }//GEN-LAST:event_txtOD2001ActionPerformed

    private void txtOD3001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD3001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD4001.requestFocus();}
    }//GEN-LAST:event_txtOD3001ActionPerformed

    private void txtOD4001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD4001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD6001.requestFocus();}
    }//GEN-LAST:event_txtOD4001ActionPerformed

    private void txtOD6001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD6001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD8001.requestFocus();}
    }//GEN-LAST:event_txtOD6001ActionPerformed

    private void txtOD8001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD8001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI501.requestFocus();}
    }//GEN-LAST:event_txtOD8001ActionPerformed

    private void txtOI8001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI8001ActionPerformed
         if(!txtNumero.getText().isEmpty()){
            btnGuardar.requestFocus();}
    }//GEN-LAST:event_txtOI8001ActionPerformed

    private void txtOI8000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI8000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD501.requestFocus();}
        diagnosticoAudio1(); 
    }//GEN-LAST:event_txtOI8000ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    txtOD501.setText("-");
    txtOD1001.setText("-");
    txtOD2001.setText("-");
    txtOD3001.setText("-");
    txtOD4001.setText("-");
    txtOD6001.setText("-");
    txtOD8001.setText("-");
    txtOI501.setText("-");
    txtOI1001.setText("-");
    txtOI2001.setText("-");
    txtOI3001.setText("-");
    txtOI4001.setText("-");
    txtOI6001.setText("-");
    txtOI8001.setText("-");
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnActualizarAudiomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAudiomActionPerformed
             
        String sCodigo=txtNumero.getText();
        String strSqlStmt;
        if(validar()){
        strSqlStmt="UPDATE audiometria_po\n" +
               "SET fecha_au='"+FechaAudiometria.getDate()+"', o_d_500='"+txtOD500.getText().toString()+"', o_d_1000='"+txtOD1000.getText().toString()+"', \n" +
                    "o_d_2000='"+txtOD2000.getText().toString()+"', o_d_3000='"+txtOD3000.getText().toString()+"', o_d_4000='"+txtOD4000.getText().toString()+"', "
                + " o_d_6000='"+txtOD6000.getText().toString()+"', o_d_8000='"+txtOD8000.getText().toString()+"', o_i_500='"+txtOI500.getText().toString()+"', \n" +
                    "o_i_1000='"+txtOI1000.getText().toString()+"', o_i_2000='"+txtOI2000.getText().toString()+"', o_i_3000='"+txtOI3000.getText().toString()+"', "
                + " o_i_4000='"+txtOI4000.getText().toString()+"', o_i_6000='"+txtOI6000.getText().toString()+"', o_i_8000='"+txtOI8000.getText().toString()+"', \n" +
                    "o_d1_500='"+txtOD501.getText().toString()+"', o_d1_1000='"+txtOD1001.getText().toString()+"', o_d1_2000='"+txtOD2001.getText().toString()+"', "
                + "o_d1_3000='"+txtOD3001.getText().toString()+"', o_d1_4000='"+txtOD4001.getText().toString()+"', \n" +
                    "o_d1_6000='"+txtOD6001.getText().toString()+"', o_d1_8000='"+txtOD8001.getText().toString()+"', o_i1_500='"+txtOI501.getText().toString()+"',"
                + " o_i1_1000='"+txtOI1001.getText().toString()+"', o_i1_2000='"+txtOI2001.getText().toString()+"', \n" +
                    "o_i1_3000='"+txtOI3001.getText().toString()+"', o_i1_4000='"+txtOI4001.getText().toString()+"', o_i1_6000='"+txtOI6001.getText().toString()+"', "
                + "o_i1_8000='"+txtOI8001.getText().toString()+"',diagnostico='"+txtDiagnostico.getText().toString()+"'" +
                " WHERE n_orden='" + sCodigo + "'";
            Limpiar();
            btnGuardar.setEnabled(true);
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
        }else {
            oFunc.SubSistemaMensajeError("AGREAGR DIAGNOSTICO");
        }
    }//GEN-LAST:event_btnActualizarAudiomActionPerformed

    private void btnEditarAudiomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAudiomActionPerformed
        if(!txtNumero.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, "
                    + "d.nombres_pa, "
                    + "d.fecha_nacimiento_pa, "
                    + "d.apellidos_pa, "
                    + "d.sexo_pa, "
                    + "n.razon_empresa, "
                    + "n.cargo_de, "
                    + "n.razon_contrata, "
                    + "n.nom_examen,"
                    + "a.fecha_au, a.o_d_500, a.o_d_1000, a.o_d_2000, \n" +
                        "a.o_d_3000, a.o_d_4000, a.o_d_6000, a.o_d_8000, a.o_i_500, a.o_i_1000, a.o_i_2000, \n" +
                        "a.o_i_3000, a.o_i_4000, a.o_i_6000, a.o_i_8000, a.o_d1_500, a.o_d1_1000, \n" +
                        "a.o_d1_2000, a.o_d1_3000, a.o_d1_4000, a.o_d1_6000, a.o_d1_8000, a.o_i1_500, \n" +
                        "a.o_i1_1000, a.o_i1_2000, a.o_i1_3000, a.o_i1_4000, a.o_i1_6000, a.o_i1_8000, diagnostico "
                    + "FROM datos_paciente as d "
                    +"INNER JOIN n_orden_ocupacional as n ON (d.cod_pa  = n.cod_pa )"
                    +"INNER JOIN audiometria_po as a ON (n.n_orden = a.n_orden)"
                    + "WHERE a.n_orden='"+txtNumero.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtExMedico.setText(oConn.setResult.getString("nom_examen"));
                        txtSexo.setText(oConn.setResult.getString("sexo_pa"));
                        txtOcupacion.setText(oConn.setResult.getString("cargo_de"));
                        FechaAudiometria.setDate(oConn.setResult.getDate("fecha_au"));
                        txtOD500.setText(oConn.setResult.getString("o_d_500"));
                        txtOD1000.setText(oConn.setResult.getString("o_d_1000"));
                        txtOD2000.setText(oConn.setResult.getString("o_d_2000"));
                        txtOD3000.setText(oConn.setResult.getString("o_d_3000"));
                        txtOD4000.setText(oConn.setResult.getString("o_d_4000"));
                        txtOD6000.setText(oConn.setResult.getString("o_d_6000"));
                        txtOD8000.setText(oConn.setResult.getString("o_d_8000"));
                        txtOI500.setText(oConn.setResult.getString("o_i_500"));
                        txtOI1000.setText(oConn.setResult.getString("o_i_1000"));
                        txtOI2000.setText(oConn.setResult.getString("o_i_2000"));
                        txtOI3000.setText(oConn.setResult.getString("o_i_3000"));
                        txtOI4000.setText(oConn.setResult.getString("o_i_4000"));
                        txtOI6000.setText(oConn.setResult.getString("o_i_6000"));
                        txtOI8000.setText(oConn.setResult.getString("o_i_8000"));
                        txtOD501.setText(oConn.setResult.getString("o_d1_500"));
                        txtOD1001.setText(oConn.setResult.getString("o_d1_1000"));
                        txtOD2001.setText(oConn.setResult.getString("o_d1_2000"));
                        txtOD3001.setText(oConn.setResult.getString("o_d1_3000"));
                        txtOD4001.setText(oConn.setResult.getString("o_d1_4000"));
                        txtOD6001.setText(oConn.setResult.getString("o_d1_6000"));
                        txtOD8001.setText(oConn.setResult.getString("o_d1_8000"));
                        txtOI501.setText(oConn.setResult.getString("o_i1_500"));
                        txtOI1001.setText(oConn.setResult.getString("o_i1_1000"));
                        txtOI2001.setText(oConn.setResult.getString("o_i1_2000"));
                        txtOI3001.setText(oConn.setResult.getString("o_i1_3000"));
                        txtOI4001.setText(oConn.setResult.getString("o_i1_4000"));
                        txtOI6001.setText(oConn.setResult.getString("o_i1_6000"));
                        txtOI8001.setText(oConn.setResult.getString("o_i1_8000"));
                        txtDiagnostico.setText(oConn.setResult.getString("diagnostico"));
                        txtDiagnostico.setText(null);
                        btnGuardar.setEnabled(false);
                        oConn.setResult.close();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Audiometria:" + ex.getMessage().toString());
        } 
       }
    }//GEN-LAST:event_btnEditarAudiomActionPerformed

    private void btnEditarAudiologActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAudiologActionPerformed
           Nacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNroOrden.getText().isEmpty()){
           
            String consulta="SELECT d.nombres_pa, d.fecha_nacimiento_pa, d.apellidos_pa, d.sexo_pa, n.razon_empresa, n.cargo_de, "
                    + "n.razon_contrata, n.nom_examen,f.fecha_examen, f.tiempo_trabajo, f.tiempo_exposicion_total_ponderado, \n" +
                    "       f.chk_tapones, f.chkgrajeras, f.chkintenso, f.chkmoderado, f.chknomolesto, \n" +
                    "       f.txtmarca, f.txtmodelo, f.fechacalibracion, f.chk1_si, f.chk2_si, f.chk3_si, \n" +
                    "       f.chk4_si, f.chk5_si, f.chk6_si, f.chk7_si, f.chk8_si, f.chk9_si, f.chk10_si, \n" +
                    "       f.chk11_si, f.chk12_si, f.chk1_no, f.chk2_no, f.chk3_no, f.chk4_no, f.chk5_no, \n" +
                    "       f.chk6_no, f.chk7_no, f.chk8_no, f.chk9_no, f.chk10_no, f.chk11_no, f.chk12_no, \n" +
                    "       f.txtldumbraldiscriminacion, f.txtliumbraldiscriminacion, f.txtldporcentagediscriminacion, \n" +
                    "       f.txtliporcentagediscriminacion, f.txtldconfort, f.txtliconfort, f.txtlddisconfort, \n" +
                    "       f.txtlidisconfort, f.txtresponsable, f.txtconclusiones, f.txtmedico, \n" +
                    "       f.txtotoscopia, f.txtmesestrabajo "
                    + "FROM datos_paciente AS d "
                    + "INNER JOIN n_orden_ocupacional  AS n ON( d.cod_pa = n.cod_pa) "
                    + "INNER JOIN ficha_audiologica as f ON(n.n_orden = f.n_orden) "
                    + "WHERE n.n_orden='"+txtNroOrden.getText().toString()+"'";
             //oFunc.SubSistemaMensajeInformacion(consulta);
             oConn.FnBoolQueryExecute(consulta);
                try {
                    if (oConn.setResult.next()) {                        
                     txtTipoExamen.setText(oConn.setResult.getString("nom_examen"));
                     txtApellidosyNombres.setText(oConn.setResult.getString("apellidos_pa").concat(" ").concat(oConn.setResult.getString("nombres_pa")));
                     txtSexo.setText(oConn.setResult.getString("sexo_pa"));
                     txtOcupacion.setText(oConn.setResult.getString("cargo_de"));
                     txtNomContrata.setText(oConn.setResult.getString("razon_contrata"));
                     txtNomEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                     Nacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                     txtEdad.setText(String.valueOf(oFunc.calcularEdad(Nacimiento.getCalendar())));
                     Fechaexamen.setDate(oConn.setResult.getDate("fecha_examen"));
                     txtanosTrabajo.setText(oConn.setResult.getString("tiempo_trabajo"));
                     txtTiempoExposicionTotalPonderado.setText(oConn.setResult.getString("tiempo_exposicion_total_ponderado"));
                     chkTapones.setSelected(oConn.setResult.getBoolean("chk_tapones"));
                     chkGrajeras.setSelected(oConn.setResult.getBoolean("chkgrajeras"));
                     chkIntenso.setSelected(oConn.setResult.getBoolean("chkintenso"));
                     chkModerado.setSelected(oConn.setResult.getBoolean("chkmoderado"));
                     chkNoMolesto.setSelected(oConn.setResult.getBoolean("chknomolesto"));
                     txtMarca.setText(oConn.setResult.getString("txtmarca"));
                     txtModelo.setText(oConn.setResult.getString("txtmodelo"));
                     FechaCalibracion.setDate(oConn.setResult.getDate("fechacalibracion"));
                     chk1_si.setSelected(oConn.setResult.getBoolean("chk1_si"));
                     chk2_si.setSelected(oConn.setResult.getBoolean("chk2_si"));
                     chk3_si.setSelected(oConn.setResult.getBoolean("chk3_si"));
                     chk4_si.setSelected(oConn.setResult.getBoolean("chk4_si"));
                     chk5_si.setSelected(oConn.setResult.getBoolean("chk5_si"));
                     chk6_si.setSelected(oConn.setResult.getBoolean("chk6_si"));
                     chk7_si.setSelected(oConn.setResult.getBoolean("chk7_si"));
                     chk8_si.setSelected(oConn.setResult.getBoolean("chk8_si"));
                     chk9_si.setSelected(oConn.setResult.getBoolean("chk9_si"));
                     chk10_si.setSelected(oConn.setResult.getBoolean("chk10_si"));
                     chk11_si.setSelected(oConn.setResult.getBoolean("chk11_si"));
                     chk12_si.setSelected(oConn.setResult.getBoolean("chk12_si"));
                     chk1_no.setSelected(oConn.setResult.getBoolean("chk1_no"));
                     chk2_no.setSelected(oConn.setResult.getBoolean("chk2_no"));
                     chk3_no.setSelected(oConn.setResult.getBoolean("chk3_no"));
                     chk4_no.setSelected(oConn.setResult.getBoolean("chk4_no"));
                     chk5_no.setSelected(oConn.setResult.getBoolean("chk5_no"));
                     chk6_no.setSelected(oConn.setResult.getBoolean("chk6_no"));
                     chk7_no.setSelected(oConn.setResult.getBoolean("chk7_no"));
                     chk8_no.setSelected(oConn.setResult.getBoolean("chk8_no"));
                     chk9_no.setSelected(oConn.setResult.getBoolean("chk9_no"));
                     chk10_no.setSelected(oConn.setResult.getBoolean("chk10_no"));
                     chk11_no.setSelected(oConn.setResult.getBoolean("chk11_no"));
                     chk12_no.setSelected(oConn.setResult.getBoolean("chk12_no"));
                    txtLDUmbralDiscriminacion.setText(oConn.setResult.getString("txtldumbraldiscriminacion"));
                     txtLIUmbralDiscriminacion.setText(oConn.setResult.getString("txtliumbraldiscriminacion"));
                     txtLDPorcentageDiscriminacion.setText(oConn.setResult.getString("txtldporcentagediscriminacion"));
                     txtLIPorcentageDiscriminacion.setText(oConn.setResult.getString("txtliporcentagediscriminacion"));
                     txtLDConfort.setText(oConn.setResult.getString("txtldconfort"));
                     txtLIConfort.setText(oConn.setResult.getString("txtliconfort"));
                     txtResponsable.setText(oConn.setResult.getString("txtresponsable"));
                     txtConclusiones.setText(oConn.setResult.getString("txtconclusiones"));
                     txtMedico.setText(oConn.setResult.getString("txtmedico"));
                     txtOtoscopia.setText(oConn.setResult.getString("txtotoscopia"));
                     txtmesestrabajo.setText(oConn.setResult.getString("txtmesestrabajo"));
                     oConn.setResult.close();
                     }else{
                        oFunc.SubSistemaMensajeError("No se pudo realizar Registro:");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Audiometría:" + ex.getMessage().toString());
        } }

    }//GEN-LAST:event_btnEditarAudiologActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String sCodigo=txtNroOrden.getText();
        String strSqlStmt;
        
        strSqlStmt="UPDATE ficha_audiologica\n" +
                    "SET fecha_examen='"+Fechaexamen.getDate()+"', tiempo_trabajo='"+txtanosTrabajo.getText().toString()+"', "
                + "tiempo_exposicion_total_ponderado='"+txtTiempoExposicionTotalPonderado.getText().toString()+"', \n" +
                    "edad_fa='"+txtEdad.getText().toString()+"', chk_tapones='"+chkTapones.isSelected()+"', chkgrajeras='"+chkGrajeras.isSelected()+"', "
                + "chkintenso='"+chkIntenso.isSelected()+"', chkmoderado='"+chkModerado.isSelected()+"', \n" +
                    "chknomolesto='"+chkTapones.isSelected()+"', txtmarca='"+txtMarca.getText().toString()+"', txtmodelo='"+txtModelo.getText().toString()+"', "
                + "fechacalibracion='"+FechaCalibracion.getDate()+"', \n" +
                    "chk1_si='"+chk1_si.isSelected()+"', chk2_si='"+chk2_si.isSelected()+"', chk3_si='"+chk3_si.isSelected()+"', chk4_si='"+chk4_si.isSelected()+"',"
                + " chk5_si='"+chk5_si.isSelected()+"', chk6_si='"+chk6_si.isSelected()+"', chk7_si='"+chk7_si.isSelected()+"', chk8_si='"+chk8_si.isSelected()+"',"
                + " chk9_si='"+chk9_si.isSelected()+"', chk10_si='"+chk10_si.isSelected()+"', chk11_si='"+chk11_si.isSelected()+"', chk12_si='"+chk12_si.isSelected()+"', \n" +
                    "chk1_no='"+chk1_no.isSelected()+"', chk2_no='"+chk2_no.isSelected()+"', chk3_no='"+chk3_no.isSelected()+"', chk4_no='"+chk4_no.isSelected()+"',"
                + " chk5_no='"+chk5_no.isSelected()+"', chk6_no='"+chk6_no.isSelected()+"', chk7_no='"+chk7_no.isSelected()+"', chk8_no='"+chk8_no.isSelected()+"',"
                + " chk9_no='"+chk9_no.isSelected()+"', chk10_no='"+chk10_no.isSelected()+"', chk11_no='"+chk11_no.isSelected()+"', chk12_no='"+chk12_no.isSelected()+"', \n" +
                    "txtldumbraldiscriminacion='"+txtLDUmbralDiscriminacion.getText().toString()+"', txtliumbraldiscriminacion='"+txtLIUmbralDiscriminacion.getText().toString()+"', \n" +
                    "txtldporcentagediscriminacion='"+txtLDPorcentageDiscriminacion.getText().toString()+"', txtliporcentagediscriminacion='"+txtLIPorcentageDiscriminacion.getText().toString()+"', \n" +
                    "txtldconfort='"+txtLDConfort.getText().toString()+"', txtliconfort='"+txtLIConfort.getText().toString()+"', txtlddisconfort='"+txtLDdisconfort.getText().toString()+"',"
                + " txtlidisconfort='"+txtLIdisconfort.getText().toString()+"',txtresponsable='"+txtResponsable.getText().toString()+"',"
                + " txtconclusiones='"+txtConclusiones.getText().toString()+"', txtmedico='"+txtMedico.getText().toString()+"', "
                + " txtotoscopia='"+txtOtoscopia.getText().toString()+"'";
                if(!txtmesestrabajo.getText().isEmpty()){
                  strSqlStmt+= ",txtmesestrabajo='"+txtmesestrabajo.getText().toString()+"'" ;
                }
                
               strSqlStmt+= " WHERE n_orden='" + sCodigo + "'";
        
               
               
               
               
               
               
               
               
            LimpiarFicha();
             
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticoActionPerformed
     
        diagnosticoAudio1();
      
    }//GEN-LAST:event_btnDiagnosticoActionPerformed

    private void txtOD500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD500MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOD500MouseClicked

    private void txtOD1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD1000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOD1000MouseClicked

    private void txtOD2000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD2000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOD2000MouseClicked

    private void txtOD3000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD3000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOD3000MouseClicked

    private void txtOD4000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD4000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOD4000MouseClicked

    private void txtOD6000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD6000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOD6000MouseClicked

    private void txtOD8000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD8000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOD8000MouseClicked

    private void txtOI500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI500MouseClicked
       txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOI500MouseClicked

    private void txtOI1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI1000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOI1000MouseClicked

    private void txtOI2000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI2000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOI2000MouseClicked

    private void txtOI3000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI3000MouseClicked
       txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOI3000MouseClicked

    private void txtOI4000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI4000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOI4000MouseClicked

    private void txtOI6000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI6000MouseClicked
        txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOI6000MouseClicked

    private void txtOI8000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI8000MouseClicked
         txtDiagnostico.setText(null);
    }//GEN-LAST:event_txtOI8000MouseClicked

    private void chkNoAudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkNoAudioMouseClicked
        txtOD500.setText("N/A");
        txtOD1000.setText("N/A");
        txtOD2000.setText("N/A");
        txtOD3000.setText("N/A");
        txtOD4000.setText("N/A");
        txtOD6000.setText("N/A");
        txtOD8000.setText("N/A");
        txtOI500.setText("N/A");
        txtOI1000.setText("N/A");
        txtOI2000.setText("N/A");
        txtOI3000.setText("N/A");
        txtOI4000.setText("N/A");
        txtOI6000.setText("N/A");
        txtOI8000.setText("N/A");
        txtDiagnostico.setText("N/A");
    }//GEN-LAST:event_chkNoAudioMouseClicked

    private void chkModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkModeloActionPerformed
        if(chkModelo.isSelected()){
            txtModelo.setText("BELL PLUS");
        }
    }//GEN-LAST:event_chkModeloActionPerformed

    private void chkNoAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoAudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNoAudioActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
       txtanosTrabajo.setText("0");
       txtTiempoExposicionTotalPonderado.setText("0");
       txtModelo.setText("--");
       txtMarca.setText("--");
       txtResponsable.setText("--");
       String entrada = "00/00/0000";
       DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
       Date fecha;
            try {
                fecha = format.parse(entrada);
                FechaCalibracion.setDate(fecha);
            } catch (ParseException ex) {
                Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaAudiometria.setDate(fechaDate);
Fechaexamen.setDate(fechaDate);
}
void Fecha1(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
Fechaexamen.setDate(fechaDate);
}
 private com.toedter.calendar.JDateChooser Nacimiento;
void ficha(){
  Nacimiento = new com.toedter.calendar.JDateChooser();
    if(!OrdenAudiometria()){
        if(!txtNroOrden.getText().isEmpty()){
           
            String consulta="SELECT d.nombres_pa, d.fecha_nacimiento_pa, d.apellidos_pa, d.sexo_pa, n.razon_empresa, n.cargo_de, n.razon_contrata, n.nom_examen "
                    + "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional  AS n ON( d.cod_pa = n.cod_pa) WHERE n.n_orden='"+txtNroOrden.getText().toString()+"'";
             //oFunc.SubSistemaMensajeInformacion(consulta);
             oConn.FnBoolQueryExecute(consulta);
                try {
                    if (oConn.setResult.next()) {                        
                     txtTipoExamen.setText(oConn.setResult.getString("nom_examen"));
                     txtApellidosyNombres.setText(oConn.setResult.getString("apellidos_pa").concat(" ").concat(oConn.setResult.getString("nombres_pa")));
                     txtSexo.setText(oConn.setResult.getString("sexo_pa"));
                     txtOcupacion.setText(oConn.setResult.getString("cargo_de"));
                     txtNomContrata.setText(oConn.setResult.getString("razon_contrata"));
                     txtNomEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                     Nacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                     txtEdad.setText(String.valueOf(oFunc.calcularEdad(Nacimiento.getCalendar())));
                     txtNroOrden.setEditable(false);
                     Fecha1();
                     txtanosTrabajo.requestFocus();  
                     
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Audiometría:" + ex.getMessage().toString());
        } }}


}
         private boolean validarFicha(){
boolean bResultado=true;
if (((JTextField)FechaCalibracion.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Calibración");bResultado = false;}
if (((JTextField)Fechaexamen.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de creación de Ficha");bResultado = false;}
if(txtResponsable.getText().isEmpty()){oFunc.SubSistemaMensajeError("Nombre del profesional que realiza la audiometría :");bResultado = false;}
//if(txtMedico.getText().isEmpty()){oFunc.SubSistemaMensajeError("Nombre del Medico :");bResultado = false;}
if(txtMarca.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Marca :");bResultado = false;}
if(txtModelo.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Modelo :");bResultado = false;}
if(txtanosTrabajo.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Años de Trabajo :");bResultado = false;}
if(txtTiempoExposicionTotalPonderado.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Tiempo de exposición total ponderado 8h/d :");bResultado = false;}

   return bResultado;
}
void LimpiarFicha(){
    
    txtNroOrden.setText(null);
     txtNroOrden.setEditable(true);
     txtEdad.setText(null);
    txtNomContrata.setText(null);
    txtNomEmpresa.setText(null);
    txtApellidosyNombres.setText(null);
    Fechaexamen.setDate(null);
    txtTiempoExposicionTotalPonderado.setText(null);
    txtTipoExamen.setText(null);
    txtSexo.setText(null);
    txtOcupacion.setText(null);
    txtanosTrabajo.setText(null);
    txtOtoscopia.setText(null);
    txtModelo.setText("AMPLIVOX 270");
    txtMarca.setText("AMPLIVOX");
    FechaCalibracion.setDate(null);
    txtdOD250.setText(null);
    txtdOD500.setText(null);
    txtdOD1000.setText(null);
    txtdOI250.setText(null);
    txtdOI500.setText(null);
    txtdOI1000.setText(null);
    txtResponsable.setText(null);
    txtConclusiones.setText("NORMAL");
    txtMedico.setText(null);
    txtLDUmbralDiscriminacion.setText(null);
    txtLDPorcentageDiscriminacion.setText(null);
    txtLDConfort.setText(null);
    txtLDdisconfort.setText(null);
    txtLIUmbralDiscriminacion.setText(null);
    txtLIPorcentageDiscriminacion.setText(null);
    txtLIConfort.setText(null);
    txtLIdisconfort.setText(null);
    txtNroOrden.requestFocus();
   }
public void AgregarFicha(){
    
   if(!txtNroOrden.getText().isEmpty()){
       if(!OrdenAudiometria()){
           if(validarFicha()){
    String insert="INSERT INTO ficha_audiologica("
        + "n_orden, fecha_examen, tiempo_trabajo, tiempo_exposicion_total_ponderado,"
        + "edad_fa, chk_tapones, chkgrajeras, chkintenso, chkmoderado, chknomolesto,txtmarca, txtmodelo, fechacalibracion, chk1_si, chk2_si, chk3_si,"
        + "chk4_si, chk5_si, chk6_si, chk7_si, chk8_si, chk9_si, chk10_si, "
        + "chk11_si, chk12_si, chk1_no, chk2_no, chk3_no, chk4_no, chk5_no, "
        + "chk6_no, chk7_no, chk8_no, chk9_no, chk10_no, chk11_no, chk12_no";
    String values="VALUES ('"+txtNroOrden.getText().toString()+"','"+Fechaexamen.getDate()+"','"+txtanosTrabajo.getText().toString()+"','"+txtTiempoExposicionTotalPonderado.getText().toString()+"'";
       values+= ",'"+txtEdad.getText()+"','"+chkTapones.isSelected()+"','"+chkGrajeras.isSelected()+"','"+chkIntenso.isSelected()+"','"+chkModerado.isSelected()+"','"+chkNoMolesto.isSelected()+"'";
       values+=",'"+txtMarca.getText()+"','"+txtModelo.getText()+"','"+FechaCalibracion.getDate()+"'";
       values+=",'"+chk1_si.isSelected()+"','"+chk2_si.isSelected()+"','"+chk3_si.isSelected()+"','"+chk4_si.isSelected()+"','"+chk5_si.isSelected()+"','"+chk6_si.isSelected()+"','"+chk7_si.isSelected()+"','"+chk8_si.isSelected()+"','"+chk9_si.isSelected()+"','"+chk10_si.isSelected()+"','"+chk11_si.isSelected()+"','"+chk12_si.isSelected()+"'";
       values+=",'"+chk1_no.isSelected()+"','"+chk2_no.isSelected()+"','"+chk3_no.isSelected()+"','"+chk4_no.isSelected()+"','"+chk5_no.isSelected()+"','"+chk6_no.isSelected()+"','"+chk7_no.isSelected()+"','"+chk8_no.isSelected()+"','"+chk9_no.isSelected()+"','"+chk10_no.isSelected()+"','"+chk11_no.isSelected()+"','"+chk12_no.isSelected()+"'";
       if(!txtdOD250.getText().isEmpty()){
        insert+= ",txtdod250 ";
        values+=",'"+txtdOD250.getText().toString()+"'";
       }
       if(!txtdOD500.getText().isEmpty()){
        insert+= ",txtdod500 ";
        values+=",'"+txtdOD500.getText().toString()+"'";
       }
       if(!txtdOD1000.getText().isEmpty()){
        insert+= ",txtdod1000 ";
        values+=",'"+txtdOD1000.getText().toString()+"'";
       }
       if(!txtdOI250.getText().isEmpty()){
        insert+= ",txtdoi250 ";
        values+=",'"+txtdOI250.getText().toString()+"'";
       }
       if(!txtdOI500.getText().isEmpty()){
        insert+= ",txtdoi500 ";
        values+=",'"+txtdOI500.getText().toString()+"'";
       }
       if(!txtdOI1000.getText().isEmpty()){
        insert+= ",txtdoi1000 ";
        values+=",'"+txtdOI1000.getText().toString()+"'";
       }
       if(!txtLDUmbralDiscriminacion.getText().isEmpty()){
        insert+= ",txtldumbraldiscriminacion ";
        values+=",'"+txtLDUmbralDiscriminacion.getText().toString()+"'";
       }
       if(!txtLIUmbralDiscriminacion.getText().isEmpty()){
        insert+= ",txtliumbraldiscriminacion ";
        values+=",'"+txtLIUmbralDiscriminacion.getText().toString()+"'";
       }
       if(!txtLDPorcentageDiscriminacion.getText().isEmpty()){
        insert+= ",txtldporcentagediscriminacion ";
        values+=",'"+txtLDPorcentageDiscriminacion.getText().toString()+"'";
       }
       if(!txtLIPorcentageDiscriminacion.getText().isEmpty()){
        insert+= ",txtliporcentagediscriminacion ";
        values+=",'"+txtLIPorcentageDiscriminacion.getText().toString()+"'";
       }
       if(!txtLDConfort.getText().isEmpty()){
        insert+= ",txtldconfort ";
        values+=",'"+txtLDConfort.getText().toString()+"'";
       }
        if(!txtLIConfort.getText().isEmpty()){
        insert+= ",txtliconfort ";
        values+=",'"+txtLIConfort.getText().toString()+"'";
       }
        if(!txtLDdisconfort.getText().isEmpty()){
        insert+= ",txtlddisconfort ";
        values+=",'"+txtLDdisconfort.getText().toString()+"'";
       }
        if(!txtLIdisconfort.getText().isEmpty()){
        insert+= ",txtlidisconfort ";
        values+=",'"+txtLIdisconfort.getText().toString()+"'";
       }
        if(!txtResponsable.getText().isEmpty()){
        insert+= ",txtresponsable ";
        values+=",'"+txtResponsable.getText().toString()+"'";
       }
        if(!txtConclusiones.getText().isEmpty()){
        insert+= ",txtconclusiones ";
        values+=",'"+txtConclusiones.getText().toString()+"'";
       }
        if(!txtMedico.getText().isEmpty()){
        insert+= ",txtmedico ";
        values+=",'"+txtMedico.getText().toString()+"'";
       }
        if(!txtOtoscopia.getText().isEmpty()){
        insert+= ",txtotoscopia ";
        values+=",'"+txtOtoscopia.getText().toString()+"'";
       }
       if(! txtmesestrabajo.getText().isEmpty()){
       insert += ",txtmesestrabajo";
       values +=",'"+txtmesestrabajo.getText().toString()+"'";
       
       } 
        //oFunc.SubSistemaMensajeError(insert.concat(")") + values.concat(")"));
        if (oConn.FnBoolQueryExecuteUpdate(insert.concat(")") + values.concat(")"))){
                oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
//                imprimir();
                LimpiarFicha();
                
                }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");}
             
        
           }
       }    
    }      
}
  private boolean imprimir(){
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
      printer(Integer.valueOf(txtNroOrden.getText().toString()));
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
       if(chkGrafico.isSelected()){
           Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"FichaAudiologica.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  JasperPrintManager.printReport(jasperPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
       }else{
            Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"FichaAudiologica1.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  JasperPrintManager.printReport(jasperPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
       }
                
   }
 private void print(Integer cod){
            if(chkGrafico.isSelected()){
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"FichaAudiologica.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Ficha Audiologica");
                    //viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"FichaAudiologica1.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Ficha Audiologica");
                    //viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
                 
 
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaAudiometria;
    private com.toedter.calendar.JDateChooser FechaCalibracion;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private com.toedter.calendar.JDateChooser Fechaexamen;
    private javax.swing.JButton Limpiar;
    private javax.swing.JScrollPane atxtObservacionesAltura;
    private javax.swing.ButtonGroup btApreciacionRuido;
    private javax.swing.ButtonGroup btProtectores;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarAudiom;
    private javax.swing.JButton btnDiagnostico;
    private javax.swing.JButton btnEditarAudiolog;
    private javax.swing.JButton btnEditarAudiom;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JCheckBox chk10_no;
    private javax.swing.JCheckBox chk10_si;
    private javax.swing.JCheckBox chk11_no;
    private javax.swing.JCheckBox chk11_si;
    private javax.swing.JCheckBox chk12_no;
    private javax.swing.JCheckBox chk12_si;
    private javax.swing.JCheckBox chk1_no;
    private javax.swing.JCheckBox chk1_si;
    private javax.swing.JCheckBox chk2_no;
    private javax.swing.JCheckBox chk2_si;
    private javax.swing.JCheckBox chk3_no;
    private javax.swing.JCheckBox chk3_si;
    private javax.swing.JCheckBox chk4_no;
    private javax.swing.JCheckBox chk4_si;
    private javax.swing.JCheckBox chk5_no;
    private javax.swing.JCheckBox chk5_si;
    private javax.swing.JCheckBox chk6_no;
    private javax.swing.JCheckBox chk6_si;
    private javax.swing.JCheckBox chk7_no;
    private javax.swing.JCheckBox chk7_si;
    private javax.swing.JCheckBox chk8_no;
    private javax.swing.JCheckBox chk8_si;
    private javax.swing.JCheckBox chk9_no;
    private javax.swing.JCheckBox chk9_si;
    private javax.swing.JCheckBox chkGrafico;
    private javax.swing.JCheckBox chkGrajeras;
    private javax.swing.JCheckBox chkIntenso;
    private javax.swing.JCheckBox chkModelo;
    private javax.swing.JCheckBox chkModerado;
    private javax.swing.JCheckBox chkNoAudio;
    private javax.swing.JCheckBox chkNoMolesto;
    private javax.swing.JCheckBox chkTapones;
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jtAudiometria;
    private javax.swing.JTable tbAudiometria;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosyNombres;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtConclusiones;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtExMedico;
    private javax.swing.JTextField txtImpFicha;
    private javax.swing.JTextField txtLDConfort;
    private javax.swing.JTextField txtLDPorcentageDiscriminacion;
    private javax.swing.JTextField txtLDUmbralDiscriminacion;
    private javax.swing.JTextField txtLDdisconfort;
    private javax.swing.JTextField txtLIConfort;
    private javax.swing.JTextField txtLIPorcentageDiscriminacion;
    private javax.swing.JTextField txtLIUmbralDiscriminacion;
    private javax.swing.JTextField txtLIdisconfort;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomContrata;
    private javax.swing.JTextField txtNomEmpresa;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNroOrden;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOD1000;
    private javax.swing.JTextField txtOD1001;
    private javax.swing.JTextField txtOD2000;
    private javax.swing.JTextField txtOD2001;
    private javax.swing.JTextField txtOD3000;
    private javax.swing.JTextField txtOD3001;
    private javax.swing.JTextField txtOD4000;
    private javax.swing.JTextField txtOD4001;
    private javax.swing.JTextField txtOD500;
    private javax.swing.JTextField txtOD501;
    private javax.swing.JTextField txtOD6000;
    private javax.swing.JTextField txtOD6001;
    private javax.swing.JTextField txtOD8000;
    private javax.swing.JTextField txtOD8001;
    private javax.swing.JTextField txtOI1000;
    private javax.swing.JTextField txtOI1001;
    private javax.swing.JTextField txtOI2000;
    private javax.swing.JTextField txtOI2001;
    private javax.swing.JTextField txtOI3000;
    private javax.swing.JTextField txtOI3001;
    private javax.swing.JTextField txtOI4000;
    private javax.swing.JTextField txtOI4001;
    private javax.swing.JTextField txtOI500;
    private javax.swing.JTextField txtOI501;
    private javax.swing.JTextField txtOI6000;
    private javax.swing.JTextField txtOI6001;
    private javax.swing.JTextField txtOI8000;
    private javax.swing.JTextField txtOI8001;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtOtoscopia;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTiempoExposicionTotalPonderado;
    private javax.swing.JTextField txtTipoExamen;
    private javax.swing.JTextField txtanosTrabajo;
    private javax.swing.JTextField txtdOD1000;
    private javax.swing.JTextField txtdOD250;
    private javax.swing.JTextField txtdOD500;
    private javax.swing.JTextField txtdOI1000;
    private javax.swing.JTextField txtdOI250;
    private javax.swing.JTextField txtdOI500;
    private javax.swing.JTextField txtmesestrabajo;
    // End of variables declaration//GEN-END:variables
    public void Limpiar(){
    txtDni.setText(null);
    txtNombres.setText(null);
    FechaNacimiento.setDate(null);
    txtApellidos.setText(null);
    txtEmpresa.setText(null);
    txtContrata.setText(null);
    txtExMedico.setText(null);
    txtNumero.setText(null);
    FechaAudiometria.setDate(null);
    txtOD500.setText(null);
    txtOD1000.setText(null);
    txtOD2000.setText(null);
    txtOD3000.setText(null);
    txtOD4000.setText(null);
    txtOD6000.setText(null);
    txtOD8000.setText(null);
    txtOI500.setText(null);
    txtOI1000.setText(null);
    txtOI2000.setText(null);
    txtOI3000.setText(null);
    txtOI4000.setText(null);
    txtOI6000.setText(null);
    txtOI8000.setText(null);
    txtOD501.setText(null);
    txtOD1001.setText(null);
    txtOD2001.setText(null);
    txtOD3001.setText(null);
    txtOD4001.setText(null);
    txtOD6001.setText(null);
    txtOD8001.setText(null);
    txtOI501.setText(null);
    txtOI1001.setText(null);
    txtOI2001.setText(null);
    txtOI3001.setText(null);
    txtOI4001.setText(null);
    txtOI6001.setText(null);
    txtOI8001.setText(null);
    txtDiagnostico.setText(null);
//    btnGuardar.setEnabled(false);
   txtNumero.requestFocus();
}
    public void Deshabilitar(boolean ficha){
 
    txtDni.setEnabled(false);
    txtNombres.setEnabled(false);
    FechaNacimiento.setEnabled(false);
    txtApellidos.setEnabled(false);
    txtEmpresa.setEnabled(false);            
    txtContrata.setEnabled(false);
    txtExMedico.setEnabled(false);
    txtNumero.setEnabled(ficha);
    
}
    public void Agregar(){
     
if(!OrdenExiste()){
    if(validar()){
        
            String strSqlStmt;
             
             strSqlStmt="INSERT INTO audiometria_po(n_orden, fecha_au, "
                     + "o_d_500, o_d_1000, o_d_2000,o_d_3000, o_d_4000, o_d_6000, o_d_8000,"
                     + " o_i_500, o_i_1000, o_i_2000,o_i_3000, o_i_4000, o_i_6000, o_i_8000,"
                     + "o_d1_500, o_d1_1000, o_d1_2000,o_d1_3000, o_d1_4000, o_d1_6000, o_d1_8000,"
                     + " o_i1_500, o_i1_1000, o_i1_2000,o_i1_3000, o_i1_4000, o_i1_6000, o_i1_8000,diagnostico)";
             strSqlStmt+="Values('"+txtNumero.getText()+"','"+FechaAudiometria.getDate()+"','"
                     +txtOD500.getText().toString()+ "','"
                     +txtOD1000.getText().toString()+ "','"
                     +txtOD2000.getText().toString()+"','"
                     +txtOD3000.getText().toString()+"','"
                     +txtOD4000.getText().toString()+"','"
                     +txtOD6000.getText().toString()+"','"
                     +txtOD8000.getText().toString()+"','"
                     +txtOI500.getText().toString()+"','"
                     +txtOI1000.getText().toString()+"','"
                     +txtOI2000.getText().toString()+"','"
                     +txtOI3000.getText().toString()+"','"
                     +txtOI4000.getText().toString()+"','"
                     +txtOI6000.getText().toString()+"','"
                     +txtOI8000.getText().toString()+"','"
                     //------------------parte 2
                     +txtOD501.getText().toString()+ "','"
                     +txtOD1001.getText().toString()+ "','"
                     +txtOD2001.getText().toString()+"','"
                     +txtOD3001.getText().toString()+"','"
                     +txtOD4001.getText().toString()+"','"
                     +txtOD6001.getText().toString()+"','"
                     +txtOD8001.getText().toString()+"','"
                     +txtOI501.getText().toString()+"','"
                     +txtOI1001.getText().toString()+"','"
                     +txtOI2001.getText().toString()+"','"
                     +txtOI3001.getText().toString()+"','"
                     +txtOI4001.getText().toString()+"','"
                     +txtOI6001.getText().toString()+"','"
                     +txtOI8001.getText().toString()+"','"
                     +txtDiagnostico.getText().toString()+"')";
               if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                imprimir1();
                Limpiar();
                txtNumero.setEnabled(true);
                sbCargarDatosAudiometria("");
                txtNumero.requestFocus();
                }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");}
             }
            }else  {oFunc.SubSistemaMensajeError("Error N° Orden Registrada");
            }
    }
    public void datosGrafico() {
       
         String strSqlStmt = null;
         if (!txtOD500.getText().isEmpty()) {
            strSqlStmt = "INSERT INTO grafico_audio(n_orden, o_d, o_i, rangox,o_d1,o_i1)";
            strSqlStmt += "Values('" + txtNumero.getText() + "','"
                    + txtOD500.getText().toString() + "','"
                    + txtOI500.getText().toString() + "','"
                    + 500 + "','"
                    + txtOD501.getText().toString() + "','"
                    + txtOI501.getText().toString() + "')";
            oConn.FnBoolQueryExecuteUpdate(strSqlStmt);
        }
        if (!txtOD1000.getText().isEmpty()) {
            strSqlStmt = "INSERT INTO grafico_audio(n_orden, o_d, o_i, rangox,o_d1,o_i1)";
            strSqlStmt += "Values('" + txtNumero.getText() + "','"
                    + txtOD1000.getText().toString() + "','"
                    + txtOI1000.getText().toString() + "','"
                    + 1000 + "','"
                    + txtOD1001.getText().toString() + "','"
                    + txtOI1001.getText().toString() + "')";
            oConn.FnBoolQueryExecuteUpdate(strSqlStmt);
        }
        if (!txtOD2000.getText().isEmpty()) {
            strSqlStmt = "INSERT INTO grafico_audio(n_orden, o_d, o_i, rangox,o_d1,o_i1)";
            strSqlStmt += "Values('" + txtNumero.getText() + "','"
                    + txtOD2000.getText().toString() + "','"
                    + txtOI2000.getText().toString() + "','"
                    + 2000 + "','"
                    + txtOD2001.getText().toString() + "','"
                    + txtOI2001.getText().toString() + "')";
            oConn.FnBoolQueryExecuteUpdate(strSqlStmt);

        }
        if (!txtOD3000.getText().isEmpty()) {
            strSqlStmt = "INSERT INTO grafico_audio(n_orden, o_d, o_i, rangox,o_d1,o_i1)";
            strSqlStmt += "Values('" + txtNumero.getText() + "','"
                    + txtOD3000.getText().toString() + "','"
                    + txtOI3000.getText().toString() + "','"
                    + 3000 + "','"
                    + txtOD3001.getText().toString() + "','"
                    + txtOI3001.getText().toString() + "')";
            oConn.FnBoolQueryExecuteUpdate(strSqlStmt);
        }
        if (!txtOD4000.getText().isEmpty()) {
            strSqlStmt = "INSERT INTO grafico_audio(n_orden, o_d, o_i, rangox,o_d1,o_i1)";
            strSqlStmt += "Values('" + txtNumero.getText() + "','"
                    + txtOD4000.getText().toString() + "','"
                    + txtOI4000.getText().toString() + "','"
                    + 4000 + "','"
                    + txtOD4001.getText().toString() + "','"
                    + txtOI4001.getText().toString() + "')";
            oConn.FnBoolQueryExecuteUpdate(strSqlStmt);
        }
        if (!txtOD6000.getText().isEmpty()) {
            strSqlStmt = "INSERT INTO grafico_audio(n_orden, o_d, o_i, rangox,o_d1,o_i1)";
            strSqlStmt += "Values('" + txtNumero.getText() + "','"
                    + txtOD6000.getText().toString() + "','"
                    + txtOI6000.getText().toString() + "','"
                    + 6000 + "','"
                    + txtOD6001.getText().toString() + "','"
                    + txtOI6001.getText().toString() + "')";
            oConn.FnBoolQueryExecuteUpdate(strSqlStmt);
        }
        if (!txtOD8000.getText().isEmpty()) {
            strSqlStmt = "INSERT INTO grafico_audio(n_orden, o_d, o_i, rangox,o_d1,o_i1)";
            strSqlStmt += "Values('" + txtNumero.getText() + "','"
                    + txtOD8000.getText().toString() + "','"
                    + txtOI8000.getText().toString() + "','"
                    + 8000 + "','"
                    + txtOD8001.getText().toString() + "','"
                    + txtOI8001.getText().toString() + "')";
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

            } else {
                oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
            }
        }
           

    }
    private boolean validar(){
boolean bResultado=true;
if (((JTextField)FechaAudiometria.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Examen");bResultado = false;}
    if(txtOD500.getText().isEmpty()){bResultado = false;}
    if(txtOD1000.getText().isEmpty()){bResultado = false;}
    if(txtOD2000.getText().isEmpty()){bResultado = false;}
    if(txtOD3000.getText().isEmpty()){bResultado = false;}
    if(txtOD4000.getText().isEmpty()){bResultado = false;}
    if(txtOD6000.getText().isEmpty()){bResultado = false;}
    if(txtOD8000.getText().isEmpty()){bResultado = false;}
    if(txtOI500.getText().isEmpty()){bResultado = false;}
    if(txtOI1000.getText().isEmpty()){bResultado = false;}
    if(txtOI2000.getText().isEmpty()){bResultado = false;}
    if(txtOI3000.getText().isEmpty()){bResultado = false;}
    if(txtOI4000.getText().isEmpty()){bResultado = false;}
    if(txtOI6000.getText().isEmpty()){bResultado = false;}
    if(txtOI8000.getText().isEmpty()){bResultado = false;}
    if(txtDiagnostico.getText().isEmpty()){bResultado = false;}
   return bResultado;
}
    public boolean OrdenExiste()
    {
        boolean bResultado=false;

        String sQuery;

        sQuery  = "Select n_orden from audiometria_po Where n_orden="+txtNumero.getText().toString();
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             Limpiar();
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }

        return bResultado;
        
    }
    public boolean OrdenAudiometria()
    {
        boolean bResultado=false;

        String sQuery;

        sQuery  = "Select n_orden from ficha_audiologica Where n_orden="+txtNroOrden.getText().toString();
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             Limpiar();
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }

        return bResultado;
        
    }
    void sbCargarDatosAudiometria(String valor){
    String [] titulos={"Cod","N.Orden","Nombre","Fecha"};
    String [] registros = new String[4];
      String sql ="";
      if(!txtBuscarCod.getText().isEmpty()){
          sql="select datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, \n" +
"            audiometria_po.cod_au,\n" +
"            audiometria_po.n_orden,\n" +
"            audiometria_po.fecha_au \n" +
"            From datos_paciente inner join n_orden_ocupacional ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)\n" +
"              inner join audiometria_po on (n_orden_ocupacional.n_orden = audiometria_po.n_orden) \n" +
"              where audiometria_po.n_orden='"+txtBuscarCod.getText().toString()+"'";     
      }else{
          sql="select datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + "audiometria_po.cod_au,"
            + "audiometria_po.n_orden,"
            + "audiometria_po.fecha_au "
            + "From datos_paciente inner join n_orden_ocupacional ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
              + "inner join audiometria_po on (n_orden_ocupacional.n_orden = audiometria_po.n_orden) "
              + "where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%"+valor+"%'";    
      }
       model = new DefaultTableModel(null,titulos);
      
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                                     
                    registros[0]= oConn.setResult.getString("cod_au");
                    registros[1]= oConn.setResult.getString("n_orden");
                    registros[2]= oConn.setResult.getString("nombres");
                    registros[3]= formato.format(oConn.setResult.getDate("fecha_au"));
                     model.addRow(registros);
                }
                 
                  // Coloca el Modelo de Nueva Cuenta
                  tbAudiometria.setModel(model);
                sbTablaAudiometria();
             
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
    private void sbTablaAudiometria()
    {
   
        tbAudiometria.getColumnModel().getColumn(0).setMinWidth(50);
        tbAudiometria.getColumnModel().getColumn(0).setMaxWidth(50);
        tbAudiometria.getColumnModel().getColumn(1).setMinWidth(65);
        tbAudiometria.getColumnModel().getColumn(1).setMaxWidth(65);
        tbAudiometria.getColumnModel().getColumn(2).setMinWidth(270);
        tbAudiometria.getColumnModel().getColumn(2).setMaxWidth(270);
        tbAudiometria.getColumnModel().getColumn(3).setMinWidth(170);
        tbAudiometria.getColumnModel().getColumn(3).setMaxWidth(170);

        tbAudiometria.setFont(new java.awt.Font("Tahoma", 0, 11)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbAudiometria.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbAudiometria.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
        tbAudiometria.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        tbAudiometria.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11)); 
   
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }
 public String[]getRowsToVector(String sql)
    {
        String[]veDats;
        //clsConnection oConn = new clsConnection();
        try
        {
            //oConn.FnBoolConnectionOpen(strConnector, strHost,strUser,strPassword);
            oConn.FnBoolQueryExecute(sql);

            ArrayList lista = new ArrayList();
            while (oConn.setResult.next())
            {
                lista.add(oConn.setResult.getString(1));
            }
            veDats = new String[lista.size()];
            for (int i = 0; i < lista.size(); i++)
            {
                veDats[i]=lista.get(i).toString();
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
            
            return null;
        }
        return veDats;
    }
public static int getPosicionVectorBuscar(String datoBuscar, String[]datos)
{
  try{
      for(int i =0;1 < datos.length; i++){
        if(datoBuscar.equals(datos[i].substring(0, datoBuscar.length())))
            return i;
      }
              
     
  }catch(Exception e){
  
  }
  return -1;
}
public static String getTextoApartirVector(String datoBuscar, String[]vector)
{
    int nroPosicion = getPosicionVectorBuscar(datoBuscar, vector);
    if(nroPosicion == -1){
        return datoBuscar;
    }
    return vector[nroPosicion];
}
public static void addTextAndSelectToTextFieldToRest(JTextField textField, String newDato)
{
    String datoBuscado ="";
    int nroActual = textField.getText().length();
    datoBuscado = newDato.substring(nroActual, newDato.length());
    if(newDato.isEmpty() || datoBuscado.isEmpty())
        return;
    try {
        textField.getDocument().insertString(textField.getCaretPosition(), datoBuscado, null);
    }catch(Exception e){
    }
    textField.select(nroActual, textField.getText().length());

}
public void diagnosticoAudio(){
   float od500=Float.parseFloat(txtOD500.getText().toString());
        float od1000=Float.parseFloat(txtOD1000.getText().toString());
        float od2000=Float.parseFloat(txtOD2000.getText().toString());
        float od3000=Float.parseFloat(txtOD3000.getText().toString());
        float od4000=Float.parseFloat(txtOD4000.getText().toString());
        float od6000=Float.parseFloat(txtOD6000.getText().toString());
        float od8000=Float.parseFloat(txtOD8000.getText().toString());
        float oi500=Float.parseFloat(txtOI500.getText().toString());
        float oi1000=Float.parseFloat(txtOI1000.getText().toString());
        float oi2000=Float.parseFloat(txtOI2000.getText().toString());
        float oi3000=Float.parseFloat(txtOI3000.getText().toString());
        float oi4000=Float.parseFloat(txtOI4000.getText().toString());
        float oi6000=Float.parseFloat(txtOI6000.getText().toString());
        float oi8000=Float.parseFloat(txtOI8000.getText().toString());
        float may=0;
        float may1=0;
        if(od500>=od1000 && od500>=od2000 && od500>=od3000 && od500>=od4000 && od500>=od6000 && od500>=od8000){
            may=od500;
        }else if(od1000>=od500 && od1000>=od2000 && od1000>=od3000 && od1000>=od4000 && od1000>=od6000 && od1000>=od8000){
            may=od1000;
        }else if(od2000>=od500 && od2000>=od1000 && od2000>=od3000 && od2000>=od4000 && od2000>=od6000 && od2000>=od8000){
            may=od2000;
        }else if(od3000>=od500 && od3000>=od1000 && od3000>=od2000 && od3000>=od4000 && od3000>=od6000 && od3000>=od8000){
            may=od3000;
        }else if(od4000>=od500 && od4000>=od1000 && od4000>=od2000 && od4000>=od3000 && od4000>=od6000 && od4000>=od8000){
            may=od4000;
        }else if(od6000>=od500 && od6000>=od1000 && od6000>=od2000 && od6000>=od3000 && od6000>=od4000 && od6000>=od8000){
            may=od6000;
        }else if(od8000>=od500 && od8000>=od1000 && od8000>=od2000 && od8000>=od3000 && od8000>=od4000 && od8000>=od6000){
            may=od8000;
        }
        if(oi500>=oi1000 && oi500>=oi2000 && oi500>=oi3000 && oi500>=oi4000 && oi500>=oi6000 && oi500>=oi8000){
            may1=oi500;
        }else if(oi1000>=oi500 && oi1000>=oi2000 && oi1000>=oi3000 && oi1000>=oi4000 && oi1000>=oi6000 && oi1000>=oi8000){
            may1=oi1000;
        }else if(oi2000>=oi500 && oi2000>=oi1000 && oi2000>=oi3000 && oi2000>=oi4000 && oi2000>=oi6000 && oi2000>=oi8000){
            may1=oi2000;
        }else if(oi3000>=oi500 && oi3000>=oi1000 && oi3000>=oi2000 && oi3000>=oi4000 && oi3000>=oi6000 && oi3000>=oi8000){
            may1=oi3000;
        }else if(oi4000>=oi500 && oi4000>=oi1000 && oi4000>=oi2000 && oi4000>=oi3000 && oi4000>=oi6000 && oi4000>=oi8000){
            may1=oi4000;
        }else if(oi6000>=oi500 && oi6000>=oi1000 && oi6000>=oi2000 && oi6000>=oi3000 && oi6000>=oi4000 && oi6000>=oi8000){
            may1=oi6000;
        }else if(oi8000>=oi500 && oi8000>=oi1000 && oi8000>=oi2000 && oi8000>=oi3000 && oi8000>=oi4000 && oi8000>=oi6000){
            may1=oi8000;
        }
        
        if(may>=-10 && may<=25  ){
            if( may1>=90 ){
                txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO PROFUNDA \n"); 
            }else if(may1>=71 && may1<=90){
                txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO SEVERA \n"); 
            }else if(may1>=56 && may1<=70){
                txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  MODERADA-SEVERA \n"); 
            }else if(may1>=41 && may1<=55){
                txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  MODERADA \n"); 
            }else if(may1>=26 && may1<=40){
                txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  LEVE \n");    
            }else if(may1>=-10 && may1<=25){
                txtDiagnostico.setText("NORMAL");    
            }
        }else if((may>=26 && may<=40)){
            if( may1>=90 ){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO PROFUNDA \n"); 
            }else if(may1>=71 && may1<=90){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO SEVERA \n"); 
            }else if(may1>=56 && may1<=70){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA-SEVERA \n"); 
            }else if(may1>=41 && may1<=55){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA \n"); 
            }else if(may1>=26 && may1<=40){
                txtDiagnostico.setText("- HIPOACUSIA BILATERAL LEVE \n");    
            }else if(may1>=-10 && may1<=25){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE \n");    
            }
        } else if(may>=41 && may<=55){
            if( may1>=90 ){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO PROFUNDA \n"); 
            }else if(may1>=71 && may1<=90){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO SEVERA \n"); 
            }else if(may1>=56 && may1<=70){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO MODERADA-SEVERA \n"); 
            }else if(may1>=41 && may1<=55){
                txtDiagnostico.setText("- HIPOACUSIA BILATERAL MODERADA \n"); 
            }else if(may1>=26 && may1<=40){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO LEVE \n");    
            }else if(may1>=-10 && may1<=25){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA \n");    
            }
        }else if(may>=56 && may<=70){
            if(may1>=90 ){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO PROFUNDA \n"); 
            }else if(may1>=71 && may1<=90){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO SEVERA \n"); 
            }else if(may1>=56 && may1<=70){
                txtDiagnostico.setText("- HIPOACUSIA BILATERAL MODERADA-SEVERA \n"); 
            }else if(may1>=41 && may1<=55){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO MODERADA \n"); 
            }else if(may1>=26 && may1<=40){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO LEVE \n");    
            }else if(may1>=-10 && may1<=25){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA \n");    
            }
        }else if(may>=71 && may<=90){
            if( may1>=90 ){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO PROFUNDA \n"); 
            }else if(may1>=71 && may1<=90){
                txtDiagnostico.setText("- HIPOACUSIA BILATERAL SEVERA \n"); 
            }else if(may1>=56 && may1<=70){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA-SEVERA \n"); 
            }else if(may1>=41 && may1<=55){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA \n"); 
            }else if(may1>=26 && may1<=40){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO LEVE  \n");    
            }else if(may1>=-10 && may1<=25){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA \n");    
            }
        }else if(may>=90  ){
            if( may1>=90 ){
                txtDiagnostico.setText("- HIPOACUSIA BILATERAL PROFUNDA \n"); 
            }else if(may1>=71 && may1<=90){
                txtDiagnostico.setText("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA SEVERA \n"); 
            }else if(may1>=56 && may1<=70){
                txtDiagnostico.setText("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA-SEVERA \n"); 
            }else if(may1>=41 && may1<=55){
                txtDiagnostico.setText("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA \n"); 
            }else if(may1>=26 && may1<=40){
                txtDiagnostico.setText("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA LEVE \n");    
            }else if(may1>=-10 && may1<=25){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO PROFUNDA \n");    
            }
        }
}
public void diagnosticoAudio1(){
   float od500=Float.parseFloat(txtOD500.getText().toString());
        float od1000=Float.parseFloat(txtOD1000.getText().toString());
        float od2000=Float.parseFloat(txtOD2000.getText().toString());
        float od3000=Float.parseFloat(txtOD3000.getText().toString());
        float od4000=Float.parseFloat(txtOD4000.getText().toString());
        float od6000=Float.parseFloat(txtOD6000.getText().toString());
        float od8000=Float.parseFloat(txtOD8000.getText().toString());
        float oi500=Float.parseFloat(txtOI500.getText().toString());
        float oi1000=Float.parseFloat(txtOI1000.getText().toString());
        float oi2000=Float.parseFloat(txtOI2000.getText().toString());
        float oi3000=Float.parseFloat(txtOI3000.getText().toString());
        float oi4000=Float.parseFloat(txtOI4000.getText().toString());
        float oi6000=Float.parseFloat(txtOI6000.getText().toString());
        float oi8000=Float.parseFloat(txtOI8000.getText().toString());
        float may=0;
        float may1=0;
        float cont=0;
        float cont1=0;
        float prom=0;  
        float prom1=0; 
        if(od500>25){
            may=may+od500;
            cont=cont+1;
        }
        if(od1000>25){
            may=may+od1000;
            cont=cont+1;
        }
        if(od2000>25){
            may=may+od2000;
            cont=cont+1;
        }
        if(od3000>25){
            may=may+od3000;
            cont=cont+1;
        }
        if(od4000>25){
            may=may+od4000;
            cont=cont+1;
        } 
        if(od6000>25){
            may=may+od6000;
            cont=cont+1;
        } 
        if(od8000>25){
            may=may+od8000;
            cont=cont+1;
        }
        if(oi500>25){
            may1=may1+oi500;
            cont1=cont1+1;
        }
        if(oi1000>25){
            may1=may1+oi1000;
            cont1=cont1+1;
        }
        if(oi2000>25){
            may1=may1+oi2000;
            cont1=cont1+1;
        }
        if(oi3000>25){
            may1=may1+oi3000;
            cont1=cont1+1;
        }
        if(oi4000>25){
            may1=may1+oi4000;
            cont1=cont1+1;
        } 
        if(oi6000>25){
            may1=may1+oi6000;
            cont1=cont1+1;
        } 
        if(oi8000>25){
            may1=may1+oi8000;
            cont1=cont1+1;
        }
        if(od500>25 || od1000>25 || od2000>25 || od3000>25 || od4000>25 || od6000>25 || od8000>25){
            prom=may/cont;
        }
        if(oi500>25 || oi1000>25 || oi2000>25 || oi3000>25 || oi4000>25 || oi6000>25 || oi8000>25){
            prom1=may1/cont1;
        }
        
        if(prom>=-10 && prom<=25  ){
            if( prom1>90 ){
                if(cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  LEVE \n");
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO PROFUNDA \n"); 
                } 
            }else if(prom1>70 && prom1<=90){
                if(cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  LEVE \n");
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO SEVERA \n"); 
                }
                
            }else if(prom1>55 && prom1<=70){
                if(cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  LEVE \n");
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  MODERADA-SEVERA \n");  
                }
                
            }else if(prom1>40 && prom1<=55){
                if(cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  LEVE \n");
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  MODERADA \n"); 
                }
            }else if(prom1>25 && prom1<=40){
                   txtDiagnostico.setText("- HIPOACUSIA IZQUIERDO  LEVE \n");   
            }else if(prom1>=-10 && prom1<=25){
                txtDiagnostico.setText("NORMAL");    
            }
        }else if((prom>=26 && prom<=40)){
            if( prom1>=90 ){
                if(cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO PROFUNDA \n"); 
                } 
            }else if(prom1>=71 && prom1<=90){
                if(cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO SEVERA \n"); 
                } 
            }else if(prom1>=56 && prom1<=70){
                if(cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA-SEVERA \n"); 
                } 
            }else if(prom1>=41 && prom1<=55){
                 if(cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA \n");
                }
            }else if(prom1>=26 && prom1<=40){
                txtDiagnostico.setText("- HIPOACUSIA BILATERAL LEVE \n");    
            }else if(prom1>=-10 && prom1<=25){
                txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE \n");    
            }
        } else if(prom>=41 && prom<=55){
            if( prom1>=90 ){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO PROFUNDA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO LEVE \n"); 
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO PROFUNDA \n"); 
                }
            }else if(prom1>=71 && prom1<=90){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO SEVERA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO LEVE \n"); 
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO SEVERA \n"); 
                }
            }else if(prom1>=56 && prom1<=70){
               if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA-SEVERA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO LEVE \n"); 
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO MODERADA-SEVERA \n"); 
                }
            }else if(prom1>=41 && prom1<=55){
                 if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO LEVE \n"); 
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA BILATERAL MODERADA \n"); 
                }
            }else if(prom1>=26 && prom1<=40){
                if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE \n");
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO LEVE \n");   
                }       
            }else if(prom1>=-10 && prom1<=25){
                if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHOLEVE \n");
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA \n");  
                } 
                  
            }
        }else if(prom>=56 && prom<=70){
            if(prom1>=90 ){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO PROFUNDA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO LEVE \n"); 
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO PROFUNDA \n");
                }
                 
            }else if(prom1>=71 && prom1<=90){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO SEVERA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO LEVE \n"); 
                }else{
                     txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO SEVERA \n");
                }
                
            }else if(prom1>=56 && prom1<=70){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA-SEVERA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO LEVE \n"); 
                }else{
                     txtDiagnostico.setText("- HIPOACUSIA BILATERAL MODERADA-SEVERA \n");
                }
               
            }else if(prom1>=41 && prom1<=55){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO LEVE \n"); 
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO MODERADA \n"); 
                } 
            }else if(prom1>=26 && prom1<=40){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE \n");
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO LEVE \n"); 
                } 
            }else if(prom1>=-10 && prom1<=25){
                if(cont==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE \n"); 
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO MODERADA-SEVERA \n");     
                }
            }
        }else if(prom>=71 && prom<=90){
            if( prom1>=90 ){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO PROFUNDA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO LEVE \n"); 
                }else{
                     txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO PROFUNDA \n"); 
                }
                
            }else if(prom1>=71 && prom1<=90){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO SEVERA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO LEVE \n"); 
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA BILATERAL SEVERA \n"); 
                }
                
            }else if(prom1>=56 && prom1<=70){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA-SEVERA  \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO LEVE \n"); 
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA-SEVERA \n");  
                }
                
            }else if(prom1>=41 && prom1<=55){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO LEVE \n"); 
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA \n");  
                }
                
            }else if(prom1>=26 && prom1<=40){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA \n");
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO LEVE  \n"); 
                }  
            }else if(prom1>=-10 && prom1<=25){
                if(cont==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE \n"); 
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO SEVERA \n");    
                }
            }
        }else if(prom>=90  ){
            if( prom1>=90 ){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO PROFUNDA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO PROFUNDA Y IZQUIERDO LEVE \n"); 
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA BILATERAL PROFUNDA \n");  
                }
                
            }else if(prom1>=71 && prom1<=90){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO SEVERA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO PROFUNDA Y IZQUIERDO LEVE \n"); 
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA SEVERA \n");   
                }
                
            }else if(prom1>=56 && prom1<=70){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA-SEVERA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO PROFUNDA Y IZQUIERDO LEVE \n"); 
                }else{
                  txtDiagnostico.setText("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA-SEVERA \n");   
                }
            }else if(prom1>=41 && prom1<=55){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA \n");
                }else if(cont1==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO PROFUNDA Y IZQUIERDO LEVE \n"); 
                }else{
                  txtDiagnostico.setText("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA \n"); 
                }
            }else if(prom1>=26 && prom1<=40){
                if(cont==1 && cont1==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO Y IZQUIERDO LEVE  \n");   
                }else if(cont==1){
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA \n");
                }else{
                   txtDiagnostico.setText("- HIPOACUSIA DERECHO PROFUNDA Y IZQUIERDO LEVE \n"); 
                }
                  
            }else if(prom1>=-10 && prom1<=25){
                if(cont==1){
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO LEVE \n"); 
                }else{
                    txtDiagnostico.setText("- HIPOACUSIA DERECHO PROFUNDA \n");       
                }
                 
            }
        }
          
//        oFunc.SubSistemaMensajeInformacion(prom +"-"+ prom1);
}
private void imprimir1(){
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir ?", //Mensaje
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
      printer1(Integer.valueOf(txtNumero.getText()));
       
   }
   else
   {
      // PRESIONO NO
   }
  }

}
private void printer1(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/FichaAudiologica.jasper";

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte Laboratorio Clinico.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
//            JasperPrint myPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);

//            JasperViewer.viewReport(myPrint, false);
              
             JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
