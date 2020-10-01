package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import java.io.File;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class CuestionarioAudiometría extends javax.swing.JInternalFrame {

         clsConnection oConn = new clsConnection();
         clsFunciones  oFunc = new clsFunciones();
    public CuestionarioAudiometría() {
        initComponents();
        txtNorden.requestFocus();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btDiestroZurdo = new javax.swing.ButtonGroup();
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
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        bgEspalda1 = new javax.swing.ButtonGroup();
        bgEspalda2 = new javax.swing.ButtonGroup();
        bgEspalda3 = new javax.swing.ButtonGroup();
        bgEspalda4 = new javax.swing.ButtonGroup();
        bgEspalda5 = new javax.swing.ButtonGroup();
        bgEspalda6 = new javax.swing.ButtonGroup();
        bgEspalda7 = new javax.swing.ButtonGroup();
        bgEspalda8 = new javax.swing.ButtonGroup();
        bgEspalda9 = new javax.swing.ButtonGroup();
        btHombros1 = new javax.swing.ButtonGroup();
        btHombros2 = new javax.swing.ButtonGroup();
        btHombros3 = new javax.swing.ButtonGroup();
        btHombros4 = new javax.swing.ButtonGroup();
        btHombros5 = new javax.swing.ButtonGroup();
        btHombros6 = new javax.swing.ButtonGroup();
        btHombros7 = new javax.swing.ButtonGroup();
        btHombros8 = new javax.swing.ButtonGroup();
        btHombros9 = new javax.swing.ButtonGroup();
        btHombros10 = new javax.swing.ButtonGroup();
        btCuello1 = new javax.swing.ButtonGroup();
        btCuello2 = new javax.swing.ButtonGroup();
        btCuello3 = new javax.swing.ButtonGroup();
        btCuello4 = new javax.swing.ButtonGroup();
        btCuello5 = new javax.swing.ButtonGroup();
        btCuello6 = new javax.swing.ButtonGroup();
        btCuello7 = new javax.swing.ButtonGroup();
        btCuello8 = new javax.swing.ButtonGroup();
        btCuello9 = new javax.swing.ButtonGroup();
        btsexo = new javax.swing.ButtonGroup();
        p1 = new javax.swing.ButtonGroup();
        jtCuestionario = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtNorden = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        chkM = new javax.swing.JCheckBox();
        chkF = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        btnL = new javax.swing.JButton();
        FechaExamen = new com.toedter.calendar.JDateChooser();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        chk_si1 = new javax.swing.JCheckBox();
        chk_no1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCualP1 = new javax.swing.JTextField();
        txtCuandoP1 = new javax.swing.JTextField();
        txtQueP1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        chk_si2 = new javax.swing.JCheckBox();
        chk_no2 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        chk_si3 = new javax.swing.JCheckBox();
        chk_no3 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        chk_si4 = new javax.swing.JCheckBox();
        chk_no4 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        chk_si5 = new javax.swing.JCheckBox();
        chk_no5 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        chk_si6 = new javax.swing.JCheckBox();
        chk_no6 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        chk_si7 = new javax.swing.JCheckBox();
        chk_no7 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        chk_si8 = new javax.swing.JCheckBox();
        chk_no8 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        chk_si9 = new javax.swing.JCheckBox();
        txtCualP9 = new javax.swing.JTextField();
        txtDondeP9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtQueP9 = new javax.swing.JTextField();
        chk_no9 = new javax.swing.JCheckBox();
        btnEditar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        chk_no10 = new javax.swing.JCheckBox();
        txtCualP11 = new javax.swing.JTextField();
        chk_si11 = new javax.swing.JCheckBox();
        txtDondeP10 = new javax.swing.JTextField();
        txtQueP10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCualP10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        chk_no11 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        chk_si10 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCuantoP11 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txtDondeP13 = new javax.swing.JTextField();
        chk_no13 = new javax.swing.JCheckBox();
        jLabel85 = new javax.swing.JLabel();
        txtCuantoP13 = new javax.swing.JTextField();
        txtCuandoP13 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        chk_si13 = new javax.swing.JCheckBox();
        jLabel83 = new javax.swing.JLabel();
        chk_no12 = new javax.swing.JCheckBox();
        chk_si12 = new javax.swing.JCheckBox();
        txtCuantoP12 = new javax.swing.JTextField();
        txtCualP12 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        chk_si14 = new javax.swing.JCheckBox();
        txtCualP14 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txtDondeP14 = new javax.swing.JTextField();
        chk_no14 = new javax.swing.JCheckBox();
        jLabel89 = new javax.swing.JLabel();
        txtQue14 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        chk_si15 = new javax.swing.JCheckBox();
        txtCuantosP15 = new javax.swing.JTextField();
        chk_no15 = new javax.swing.JCheckBox();
        jLabel91 = new javax.swing.JLabel();
        chkCaza16 = new javax.swing.JCheckBox();
        chkTiro16 = new javax.swing.JCheckBox();
        chkDiscotecas16 = new javax.swing.JCheckBox();
        chkAuriculares16 = new javax.swing.JCheckBox();
        chkMilitar16 = new javax.swing.JCheckBox();
        chkboxeo16 = new javax.swing.JCheckBox();
        txtCaza16 = new javax.swing.JTextField();
        txtTiro16 = new javax.swing.JTextField();
        txtDiscoteca16 = new javax.swing.JTextField();
        txtAuriculares16 = new javax.swing.JTextField();
        txtMilitar16 = new javax.swing.JTextField();
        txtBoxeo16 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        txtnordenIMP = new javax.swing.JTextField();
        btnImp = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cuestionario de Audiometría");
        setPreferredSize(new java.awt.Dimension(790, 646));
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

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });
        txtNorden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre Completo:");

        txtNombres.setEditable(false);

        jLabel2.setText("Edad :");

        txtEdad.setEditable(false);

        jLabel3.setText("Género :");

        btsexo.add(chkM);
        chkM.setText("Masculino");
        chkM.setEnabled(false);
        chkM.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btsexo.add(chkF);
        chkF.setText("Femenino");
        chkF.setEnabled(false);
        chkF.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("<html>1.- Tiene conocimiento de algún problema del oido y/o audición que haya tenido o haya sido diagnosticado y/o en estudio,<br> asi como : perdida de audición, hipoacusia, otitis medio agudo, cronico, superativo externo, presencia de secreción<br> purulenta y/o sanguinolenta con o sin mal olor, escucha sonidos como pititos, soplidos del viento, sonido del mar <br> ocufenos, tinitus mareos, vértigo, nauseas, rinitis  alérgica parolisis facial, adormecimiento de hemicoro, tumores del <br>sistema nerviosos central. </html> ");

        jLabel77.setText("Nro Orden :");

        btnL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        jLabel80.setText("Fecha :");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText("Antecendetes médicos:");

        p1.add(chk_si1);
        chk_si1.setText("SI  ¿Cuál?");
        chk_si1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_si1MouseClicked(evt);
            }
        });

        p1.add(chk_no1);
        chk_no1.setSelected(true);
        chk_no1.setText("NO");
        chk_no1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_no1MouseClicked(evt);
            }
        });

        jLabel4.setText("¿Cuándo?");

        jLabel5.setText("¿Qué Hizo?");

        txtCualP1.setEditable(false);

        txtCuandoP1.setEditable(false);

        txtQueP1.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("<html>2.- Ha realizado viaje o ha llegado de viaje en las 16 horas anteriores a esta entrevista y examen. </html> ");

        bgEspalda1.add(chk_si2);
        chk_si2.setText("SI  ");

        bgEspalda1.add(chk_no2);
        chk_no2.setSelected(true);
        chk_no2.setText("NO");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("<html>3.- Ha estado escuchando musica con audifonos en las 16 hoars anteriores a esta entrevista o examen. </html> ");

        bgEspalda2.add(chk_si3);
        chk_si3.setText("SI  ");

        bgEspalda2.add(chk_no3);
        chk_no3.setSelected(true);
        chk_no3.setText("NO");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("<html>4.- Se ha desplazado y/o movilizado en moto lineal y/o en vehiculo con las ventanas abiertas. </html> ");

        bgEspalda3.add(chk_si4);
        chk_si4.setText("SI  ");

        bgEspalda3.add(chk_no4);
        chk_no4.setSelected(true);
        chk_no4.setText("NO");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("<html>5.- Ha trabajado expuesto a ruido y/o vibraciones en las 16 horas anteriores a esta entrevista y examen.</html> ");

        bgEspalda4.add(chk_si5);
        chk_si5.setText("SI  ");

        bgEspalda4.add(chk_no5);
        chk_no5.setSelected(true);
        chk_no5.setText("NO");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("<html>6.- Ha bebido bebidas alcohólicas y/o fumo cigarrillos en las 16 horas anteriores a esta entrevista y examen.</html> ");

        bgEspalda5.add(chk_si6);
        chk_si6.setText("SI  ");

        bgEspalda5.add(chk_no6);
        chk_no6.setSelected(true);
        chk_no6.setText("NO");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("<html>7.- Ha estado despierto o trabajando en turno de noche 16 horas anteriores a esta entrevista y examen.</html> ");

        bgEspalda6.add(chk_si7);
        chk_si7.setText("SI  ");

        bgEspalda6.add(chk_no7);
        chk_no7.setSelected(true);
        chk_no7.setText("NO");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("<html>8.- ¿Está resfriado con tos, con dolor auricular, fiebre y/u otra enfermedad respiratoria aguda. </html> ");

        bgEspalda7.add(chk_si8);
        chk_si8.setText("SI  ");

        bgEspalda7.add(chk_no8);
        chk_no8.setSelected(true);
        chk_no8.setText("NO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("9.- ¿Le han practicado ciorugía de oido (timponoplastio, mastoidectomío, estopediectomía)?");

        bgEspalda8.add(chk_si9);
        chk_si9.setText("SI  ¿Cuál?");
        chk_si9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_si9MouseClicked(evt);
            }
        });

        txtCualP9.setEditable(false);

        txtDondeP9.setEditable(false);

        jLabel6.setText("¿Dónde lo diagnosticaron?");

        jLabel7.setText("¿Qué Hizo?");

        txtQueP9.setEditable(false);

        bgEspalda8.add(chk_no9);
        chk_no9.setSelected(true);
        chk_no9.setText("NO");
        chk_no9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_no9MouseClicked(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel80)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkM)
                                .addGap(18, 18, 18)
                                .addComponent(chkF))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk_si1)
                                    .addComponent(jLabel4))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCuandoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCualP1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_no1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQueP1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chk_si9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCualP9, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(1, 1, 1)
                                                .addComponent(txtDondeP9, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtQueP9, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(chk_no9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk_si6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk_no6))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk_si2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk_si3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_no2)
                                    .addComponent(chk_no3))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk_si7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk_no7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chk_si5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk_no5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chk_si4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk_no4))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chk_si8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chk_no8))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel81)
                                    .addGap(621, 621, 621))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel80)
                    .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(chkM)
                    .addComponent(chkF))
                .addGap(2, 2, 2)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_si1)
                    .addComponent(txtCualP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCuandoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(chk_no1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtQueP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_si2)
                    .addComponent(chk_no2))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_si3)
                    .addComponent(chk_no3))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_si4)
                    .addComponent(chk_no4))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_si5)
                    .addComponent(chk_no5))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_si6)
                    .addComponent(chk_no6))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_si7)
                    .addComponent(chk_no7))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_si8)
                    .addComponent(chk_no8))
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_si9)
                    .addComponent(txtCualP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDondeP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQueP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk_no9)
                .addGap(0, 0, 0))
        );

        jtCuestionario.addTab("Parte 1", jPanel1);

        bgEspalda9.add(chk_no10);
        chk_no10.setSelected(true);
        chk_no10.setText("NO");
        chk_no10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_no10MouseClicked(evt);
            }
        });

        txtCualP11.setEditable(false);

        btCuello1.add(chk_si11);
        chk_si11.setText("SI  ¿Cuál?");
        chk_si11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_si11MouseClicked(evt);
            }
        });

        txtDondeP10.setEditable(false);

        txtQueP10.setEditable(false);

        jLabel14.setText("¿Por cuanto tiempo?");

        txtCualP10.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("10.- ¿Ha tenidop traumatismo craneoencefálico traumatismo en el oído?");

        btCuello1.add(chk_no11);
        chk_no11.setSelected(true);
        chk_no11.setText("NO");
        chk_no11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_no11MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("<html>11.- ¿Ha consumido o consume medicamentos como: Clipatino, aminoglucósidos (bancomicina y amikacina) aspirina, <br> furosemida y/o antitubercolosos?</html>");

        bgEspalda9.add(chk_si10);
        chk_si10.setText("SI  ¿Cuál?");
        chk_si10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_si10MouseClicked(evt);
            }
        });

        jLabel8.setText("¿Dónde?");

        jLabel9.setText("¿Qué Hizo?");

        txtCuantoP11.setEditable(false);

        jLabel86.setText("¿Dónde?");

        txtDondeP13.setEditable(false);

        btCuello3.add(chk_no13);
        chk_no13.setSelected(true);
        chk_no13.setText("NO");
        chk_no13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_no13MouseClicked(evt);
            }
        });

        jLabel85.setText("¿Cuándo?");

        txtCuantoP13.setEditable(false);

        txtCuandoP13.setEditable(false);
        txtCuandoP13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuandoP13ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel84.setText("<html>13.- ¿Ha estado compuesto a vibraciones continuas?</html>");

        btCuello3.add(chk_si13);
        chk_si13.setText("SI  ¿Cuánto tiempo?");
        chk_si13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_si13MouseClicked(evt);
            }
        });

        jLabel83.setText("¿Por cuanto tiempo?");

        btCuello2.add(chk_no12);
        chk_no12.setSelected(true);
        chk_no12.setText("NO");
        chk_no12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_no12MouseClicked(evt);
            }
        });

        btCuello2.add(chk_si12);
        chk_si12.setText("SI  ¿Cuál?");
        chk_si12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_si12MouseClicked(evt);
            }
        });

        txtCuantoP12.setEditable(false);

        txtCualP12.setEditable(false);

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel82.setText("<html>12.- ¿Ha estado expuesto a solventes orgánicos (tolveno, xileno, disulfuro de carbono, plomo, mercurio, monóxido <br> de carbono) plaguicidas, organofosforados y piretroides?</html>");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chk_no12)
                                .addComponent(chk_no13)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chk_si13)
                                        .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCuandoP13)
                                        .addComponent(txtCuantoP13)
                                        .addComponent(txtDondeP13, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel83)
                                        .addComponent(chk_si12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCualP12)
                                        .addComponent(txtCuantoP12, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk_si10)
                                    .addComponent(jLabel8))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDondeP10)
                                    .addComponent(txtCualP10, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_no10)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQueP10, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chk_no11)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(chk_si11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCualP11)
                                    .addComponent(txtCuantoP11, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_si10)
                    .addComponent(txtCualP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDondeP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9)
                        .addGap(5, 5, 5)
                        .addComponent(chk_no10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtQueP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_si11)
                    .addComponent(txtCualP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCuantoP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(chk_no11)
                .addGap(18, 18, 18)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_si12)
                    .addComponent(txtCualP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(txtCuantoP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(chk_no12)
                .addGap(15, 15, 15)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_si13)
                    .addComponent(txtCuantoP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(txtCuandoP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(txtDondeP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk_no13)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jtCuestionario.addTab("Parte 2", jPanel5);

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel87.setText("<html>14.- ¿Sufre de: hipertensión arterial diabetes mellitus, hipotiroidismo, insuficiencia renal crónica, enfermedades <br> autoinmunes?</html>");

        btCuello4.add(chk_si14);
        chk_si14.setText("SI  ¿Cuál?");
        chk_si14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_si14MouseClicked(evt);
            }
        });

        txtCualP14.setEditable(false);

        jLabel88.setText("¿Dónde lo diagnosticaron?");

        txtDondeP14.setEditable(false);

        btCuello4.add(chk_no14);
        chk_no14.setSelected(true);
        chk_no14.setText("NO");
        chk_no14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_no14MouseClicked(evt);
            }
        });

        jLabel89.setText("¿Qué hizo?");

        txtQue14.setEditable(false);

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel90.setText("<html>15.- ¿Consume cigarrillos?</html>");

        btCuello5.add(chk_si15);
        chk_si15.setText("SI  ¿Cuántos por mes ?");
        chk_si15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_si15MouseClicked(evt);
            }
        });

        txtCuantosP15.setEditable(false);

        btCuello5.add(chk_no15);
        chk_no15.setSelected(true);
        chk_no15.setText("NO");
        chk_no15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_no15MouseClicked(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel91.setText("<html>16.- ¿Ha realizado actividades de ?</html>");

        chkCaza16.setText("Caza                                                                                  ¿Cuánto tiempo?");
        chkCaza16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkCaza16MouseClicked(evt);
            }
        });

        chkTiro16.setText("Tiro al blanco                                                                     ¿Cuánto tiempo?");
        chkTiro16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkTiro16MouseClicked(evt);
            }
        });

        chkDiscotecas16.setText("Concurrencia frecuente a discotecas y/o bares                ¿Cuánto tiempo?");
        chkDiscotecas16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkDiscotecas16MouseClicked(evt);
            }
        });

        chkAuriculares16.setText("Uso de auriculares                                                             ¿Cuánto tiempo?");
        chkAuriculares16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkAuriculares16MouseClicked(evt);
            }
        });

        chkMilitar16.setText("Servicio militar                                                                   ¿Cuánto tiempo?");
        chkMilitar16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkMilitar16MouseClicked(evt);
            }
        });

        chkboxeo16.setText("Boxeo                                                                                ¿Cuánto tiempo?");
        chkboxeo16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkboxeo16MouseClicked(evt);
            }
        });

        txtCaza16.setEditable(false);

        txtTiro16.setEditable(false);

        txtDiscoteca16.setEditable(false);

        txtAuriculares16.setEditable(false);

        txtMilitar16.setEditable(false);

        txtBoxeo16.setEditable(false);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imprimir Cuestionario"));

        jLabel76.setText("Nro Orden :");

        txtnordenIMP.setBackground(new java.awt.Color(255, 153, 0));

        btnImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnordenIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnImp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImp)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel76)
                        .addComponent(txtnordenIMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cuestionario Terminado"));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar/Actualizar");
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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAgregar)
                .addGap(2, 2, 2)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel88)
                                    .addComponent(chk_si14)
                                    .addComponent(chk_no14)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel89)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQue14)
                                    .addComponent(txtCualP14)
                                    .addComponent(txtDondeP14, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(chk_no15)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chk_si15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCuantosP15, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(chkCaza16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCaza16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(chkAuriculares16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAuriculares16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(chkMilitar16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMilitar16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(chkboxeo16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBoxeo16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(chkDiscotecas16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDiscoteca16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(chkTiro16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTiro16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54))))))
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_si14)
                    .addComponent(txtCualP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(txtDondeP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(txtQue14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk_no14)
                .addGap(15, 15, 15)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_si15)
                    .addComponent(txtCuantosP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(chk_no15)
                .addGap(15, 15, 15)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chkCaza16)
                                            .addComponent(txtCaza16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkTiro16))
                                    .addComponent(txtTiro16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkDiscotecas16)
                                    .addComponent(txtDiscoteca16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkAuriculares16))
                            .addComponent(txtAuriculares16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkMilitar16))
                    .addComponent(txtMilitar16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkboxeo16)
                    .addComponent(txtBoxeo16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jtCuestionario.addTab("Parte 3", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtCuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtCuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       txtNorden.requestFocus();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLActionPerformed

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenKeyTyped

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        Cargar();
        no();
    }//GEN-LAST:event_txtNordenActionPerformed

    private void btnImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpActionPerformed
        ReImp();
    }//GEN-LAST:event_btnImpActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       if(OrdenExiste()){  
           Actualizar();
       }else{
           Guardar(); 
       }
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        txtNorden.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void chk_si1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_si1MouseClicked
        txtCualP1.setEditable(true);
        txtCuandoP1.setEditable(true);
        txtQueP1.setEditable(true);
    }//GEN-LAST:event_chk_si1MouseClicked

    private void chk_si9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_si9MouseClicked
        txtCualP9.setEditable(true);
        txtDondeP9.setEditable(true);
        txtQueP9.setEditable(true);
    }//GEN-LAST:event_chk_si9MouseClicked

    private void chk_si10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_si10MouseClicked
        txtCualP10.setEditable(true);
        txtDondeP10.setEditable(true);
        txtQueP10.setEditable(true);
    }//GEN-LAST:event_chk_si10MouseClicked

    private void chk_si11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_si11MouseClicked
        txtCualP11.setEditable(true);
        txtCuantoP11.setEditable(true);
    }//GEN-LAST:event_chk_si11MouseClicked

    private void chk_si12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_si12MouseClicked
        txtCualP12.setEditable(true);
        txtCuantoP12.setEditable(true);
        
    }//GEN-LAST:event_chk_si12MouseClicked

    private void chk_si13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_si13MouseClicked
        txtCuandoP13.setEditable(true);
        txtDondeP13.setEditable(true);
        txtCuantoP13.setEditable(true);
    }//GEN-LAST:event_chk_si13MouseClicked

    private void chk_si14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_si14MouseClicked
        txtCualP14.setEditable(true);
        txtDondeP14.setEditable(true);
        txtQue14.setEditable(true);
    }//GEN-LAST:event_chk_si14MouseClicked

    private void chk_si15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_si15MouseClicked
        txtCuantosP15.setEditable(true);
    }//GEN-LAST:event_chk_si15MouseClicked

    private void chkCaza16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkCaza16MouseClicked
        txtCaza16.setEditable(true);
        
    }//GEN-LAST:event_chkCaza16MouseClicked

    private void chkTiro16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkTiro16MouseClicked
        txtTiro16.setEditable(true);
    }//GEN-LAST:event_chkTiro16MouseClicked

    private void chkDiscotecas16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkDiscotecas16MouseClicked
        txtDiscoteca16.setEditable(true);
    }//GEN-LAST:event_chkDiscotecas16MouseClicked

    private void chkAuriculares16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAuriculares16MouseClicked
        txtAuriculares16.setEditable(true);
    }//GEN-LAST:event_chkAuriculares16MouseClicked

    private void chkMilitar16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkMilitar16MouseClicked
        txtMilitar16.setEditable(true);
    }//GEN-LAST:event_chkMilitar16MouseClicked

    private void chkboxeo16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkboxeo16MouseClicked
        txtBoxeo16.setEditable(true);
    }//GEN-LAST:event_chkboxeo16MouseClicked

    private void chk_no1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_no1MouseClicked
        txtCualP1.setEditable(false);
        txtCuandoP1.setEditable(false);
        txtQueP1.setEditable(false);
    }//GEN-LAST:event_chk_no1MouseClicked

    private void chk_no9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_no9MouseClicked
        txtCualP9.setEditable(false);
        txtDondeP9.setEditable(false);
        txtQueP9.setEditable(false);
    }//GEN-LAST:event_chk_no9MouseClicked

    private void chk_no10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_no10MouseClicked
        txtCualP10.setEditable(false);
        txtDondeP10.setEditable(false);
        txtQueP10.setEditable(false);
    }//GEN-LAST:event_chk_no10MouseClicked

    private void chk_no11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_no11MouseClicked
         txtCualP11.setEditable(false);
        txtCuantoP11.setEditable(false);
    }//GEN-LAST:event_chk_no11MouseClicked

    private void chk_no12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_no12MouseClicked
        txtCualP12.setEditable(false);
        txtCuantoP12.setEditable(false);
    }//GEN-LAST:event_chk_no12MouseClicked

    private void chk_no13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_no13MouseClicked
         txtCuandoP13.setEditable(false);
        txtDondeP13.setEditable(false);
        txtCuantoP13.setEditable(false);
    }//GEN-LAST:event_chk_no13MouseClicked

    private void chk_no14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_no14MouseClicked
        txtCualP14.setEditable(false);
        txtDondeP14.setEditable(false);
        txtQue14.setEditable(false);
    }//GEN-LAST:event_chk_no14MouseClicked

    private void chk_no15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_no15MouseClicked
        txtCuantosP15.setEditable(false);
    }//GEN-LAST:event_chk_no15MouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         String sexo;
        String Sql="SELECT d.nombres_pa,d.apellidos_pa,d.fecha_nacimiento_pa,d.sexo_pa,\n" +
"       c.edad, c.fecha_cuestionario, c.chksi1, \n" +
"       c.chkno1, c.txtrcual1, c.txtrcuando1, c.txtrque1, c.chksi2, c.chkno2, c.chksi3, \n" +
"       c.chkno3, c.chksi4, c.chkno4, c.chksi5, c.chkno5, c.chksi6, c.chkno6, c.chksi7, \n" +
"       c.chkno7, c.chksi8, c.chkno8, c.chksi9, c.chkno9, c.txtrcual9, c.txtrdonde9, \n" +
"       c.txtrque9, c.chksi10, c.chkno10, c.txtrcual10, c.txtrdonde10, c.txtrque10, \n" +
"       c.chksi11, c.chkno11, c.txtrcual11, c.txtrcuanto11, c.chksi12, c.chkno12, \n" +
"       c.txtrcual12, c.txtrcuanto12, c.chksi13, c.chkno13, c.txtrcuanto13, c.txtrcuando13, \n" +
"       c.txtrdonde13, c.chksi14, c.chkno14, c.txtrcual14, c.txtrdonde14, c.txtrque14, \n" +
"       c.chksi15, c.chkno15, c.txtrcuantos15, c.chkcaza16, c.txtcaza16, c.chktiro16, \n" +
"       c.txttiro16, c.chkdiscoteca16, c.txtdiscoteca16, c.chkauriculares16, \n" +
"       c.txtauriculares16, c.chkmilitar16, c.txtmilitar16, c.chkboxeo16, c.txtboxeo16\n" +
"       FROM datos_paciente AS d\n" +
"       INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa)\n" +
"       INNER JOIN cuestionario_audiometria AS c ON(c.n_orden = n.n_orden)"
                + "WHERE n.n_orden ='"+txtNorden.getText().toString()+"'";
        oConn.FnBoolQueryExecute(Sql);       
        try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombres_pa").concat(oConn.setResult.getString("apellidos_pa")));
                        sexo =(oConn.setResult.getString("sexo_pa"));
                        if (sexo.equals("M")){chkM.setSelected(true);
                        }else{chkF.setSelected(true);
                        }
                        txtEdad.setText(oConn.setResult.getString("edad"));
                        FechaExamen.setDate(oConn.setResult.getDate("fecha_cuestionario"));
                        chk_si1.setSelected(oConn.setResult.getBoolean("chksi1"));
                        chk_no1.setSelected(oConn.setResult.getBoolean("chkno1"));
                        txtCualP1.setText(oConn.setResult.getString("txtrcual1"));
                        txtCuandoP1.setText(oConn.setResult.getString("txtrcuando1"));
                        txtQueP1.setText(oConn.setResult.getString("txtrque1"));
                        chk_si2.setSelected(oConn.setResult.getBoolean("chksi2"));
                        chk_no2.setSelected(oConn.setResult.getBoolean("chkno2"));
                        chk_si3.setSelected(oConn.setResult.getBoolean("chksi3"));
                        chk_no3.setSelected(oConn.setResult.getBoolean("chkno3"));
                        chk_si4.setSelected(oConn.setResult.getBoolean("chksi4"));
                        chk_no4.setSelected(oConn.setResult.getBoolean("chkno4"));
                        chk_si5.setSelected(oConn.setResult.getBoolean("chksi5"));
                        chk_no5.setSelected(oConn.setResult.getBoolean("chkno5"));
                        chk_si6.setSelected(oConn.setResult.getBoolean("chksi6"));
                        chk_no6.setSelected(oConn.setResult.getBoolean("chkno6"));
                        chk_si7.setSelected(oConn.setResult.getBoolean("chksi7"));
                        chk_no7.setSelected(oConn.setResult.getBoolean("chkno7"));
                        chk_si8.setSelected(oConn.setResult.getBoolean("chksi8"));
                        chk_no8.setSelected(oConn.setResult.getBoolean("chkno8"));
                        chk_si9.setSelected(oConn.setResult.getBoolean("chksi9"));
                        chk_no9.setSelected(oConn.setResult.getBoolean("chkno9"));
                        txtCualP9.setText(oConn.setResult.getString("txtrcual9"));
                        txtDondeP9.setText(oConn.setResult.getString("txtrdonde9"));
                        txtQueP9.setText(oConn.setResult.getString("txtrque9"));
                        chk_si10.setSelected(oConn.setResult.getBoolean("chksi10"));
                        chk_no10.setSelected(oConn.setResult.getBoolean("chkno10"));
                         txtCualP10.setText(oConn.setResult.getString("txtrcual10"));
                        txtDondeP10.setText(oConn.setResult.getString("txtrdonde10"));
                        txtQueP10.setText(oConn.setResult.getString("txtrque10"));
                        chk_si11.setSelected(oConn.setResult.getBoolean("chksi11"));
                        chk_no11.setSelected(oConn.setResult.getBoolean("chkno11"));
                        txtCualP11.setText(oConn.setResult.getString("txtrcual11"));
                        txtCuantoP11.setText(oConn.setResult.getString("txtrcuanto11"));
                        chk_si12.setSelected(oConn.setResult.getBoolean("chksi12"));
                        chk_no12.setSelected(oConn.setResult.getBoolean("chkno12"));
                        txtCualP12.setText(oConn.setResult.getString("txtrcual12"));
                        txtCuantoP12.setText(oConn.setResult.getString("txtrcuanto12"));
                        chk_si13.setSelected(oConn.setResult.getBoolean("chksi13"));
                        chk_no13.setSelected(oConn.setResult.getBoolean("chkno13"));
                        txtCuantoP13.setText(oConn.setResult.getString("txtrcuanto13"));
                        txtCuandoP13.setText(oConn.setResult.getString("txtrcuando13"));
                        txtDondeP13.setText(oConn.setResult.getString("txtrdonde13"));
                        chk_si14.setSelected(oConn.setResult.getBoolean("chksi14"));
                        chk_no14.setSelected(oConn.setResult.getBoolean("chkno14"));
                        txtCualP14.setText(oConn.setResult.getString("txtrcual14"));
                        txtDondeP14.setText(oConn.setResult.getString("txtrdonde14"));
                        txtQue14.setText(oConn.setResult.getString("txtrque14"));
                        chk_si15.setSelected(oConn.setResult.getBoolean("chksi15"));
                        chk_no15.setSelected(oConn.setResult.getBoolean("chkno15"));
                        txtCuantosP15.setText(oConn.setResult.getString("txtrcuantos15"));
                        chkCaza16.setSelected(oConn.setResult.getBoolean("chkcaza16"));
                        chkTiro16.setSelected(oConn.setResult.getBoolean("chktiro16"));
                        chkDiscotecas16.setSelected(oConn.setResult.getBoolean("chkdiscoteca16"));
                        chkAuriculares16.setSelected(oConn.setResult.getBoolean("chkauriculares16"));
                        chkMilitar16.setSelected(oConn.setResult.getBoolean("chkmilitar16"));
                        chkboxeo16.setSelected(oConn.setResult.getBoolean("chkboxeo16"));
                        txtCaza16.setText(oConn.setResult.getString("txtcaza16"));
                        txtTiro16.setText(oConn.setResult.getString("txttiro16"));
                        txtDiscoteca16.setText(oConn.setResult.getString("txtdiscoteca16"));
                        txtAuriculares16.setText(oConn.setResult.getString("txtauriculares16"));
                        txtMilitar16.setText(oConn.setResult.getString("txtmilitar16"));
                        txtBoxeo16.setText(oConn.setResult.getString("txtboxeo16"));
                        
                    }
                    
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Cuestionario Audiometria:" + ex.getMessage().toString());
            }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtCuandoP13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuandoP13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuandoP13ActionPerformed
   
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    void Cargar(){
     FechaNacimiento = new com.toedter.calendar.JDateChooser();
        String sexo;
        if(!txtNorden.getText().isEmpty()){
         if(!OrdenExiste()){    
        String Sql="SELECT d.nombres_pa,d.apellidos_pa,d.fecha_nacimiento_pa,d.sexo_pa "
        + "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) WHERE n.n_orden ='"+txtNorden.getText().toString()+"'";
        oConn.FnBoolQueryExecute(Sql);       
        try {
                    if (oConn.setResult.next()) {
                        Fecha();
                        
                        txtNombres.setText(oConn.setResult.getString("nombres_pa").concat(oConn.setResult.getString("apellidos_pa")));
                        sexo =(oConn.setResult.getString("sexo_pa"));
                        if (sexo.equals("M")){chkM.setSelected(true);
                        }else{chkF.setSelected(true);
                        }
                      FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtNorden.setEditable(false);
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
                    
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Cuestionario Audiometria:" + ex.getMessage().toString());
            }
        }else{
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
         }
        }
}
    
void Guardar(){
    if(!txtNorden.getText().isEmpty()){
        if(validar()){
    String insert="INSERT INTO cuestionario_audiometria(" +
"            n_orden, edad, fecha_cuestionario, "
           + "chksi1, chkno1, txtrcual1, txtrcuando1, txtrque1, "
            + "chksi2, chkno2, chksi3, chkno3, "
            + "chksi4, chkno4, chksi5, chkno5, "
            + "chksi6, chkno6, chksi7,chkno7, \n" +
"            chksi8, chkno8, chksi9, chkno9, txtrcual9, txtrdonde9, txtrque9, \n" +
"            chksi10, chkno10, txtrcual10, txtrdonde10, txtrque10, chksi11, \n" +
"            chkno11, txtrcual11, txtrcuanto11, chksi12, chkno12, txtrcual12, \n" +
"            txtrcuanto12, chksi13, chkno13, txtrcuanto13, txtrcuando13, txtrdonde13, \n" +
"            chksi14, chkno14, txtrcual14, txtrdonde14, txtrque14, chksi15, \n" +
"            chkno15, txtrcuantos15, chkcaza16, txtcaza16, chktiro16, txttiro16, \n" +
"            chkdiscoteca16, txtdiscoteca16, chkauriculares16, txtauriculares16, \n" +
"            chkmilitar16, txtmilitar16, chkboxeo16, txtboxeo16)";
     String values="VALUES ('"+ txtNorden.getText().toString()+"', '"+txtEdad.getText().toString()+"', '"+FechaExamen.getDate()+"', '"
             + chk_si1.isSelected()+"','"+chk_no1.isSelected()+"', '"
             +txtCualP1.getText().toString()+"', '"+txtCuandoP1.getText().toString()+"', '"+txtQueP1.getText().toString()+"', '"
             +chk_si2.isSelected()+"', '"+chk_no2.isSelected()+"', '"+chk_si3.isSelected()+"', '"+chk_no3.isSelected()+"','"
             +chk_si4.isSelected()+"', '"+chk_no4.isSelected()+"', '"+chk_si5.isSelected()+"', '"+chk_no5.isSelected()+"', '"
             +chk_si6.isSelected()+"', '"+chk_no6.isSelected()+"', '"+chk_si7.isSelected()+"','"+chk_no7.isSelected()+"', '"
             +chk_si8.isSelected()+"', '"+chk_no8.isSelected()+"', '"+chk_si9.isSelected()+"', '"+chk_no9.isSelected()+"', '"
             +txtCualP9.getText().toString()+"', '"+txtDondeP9.getText().toString()+"','"+txtQueP9.getText().toString()+"', '"
             +chk_si10.isSelected()+"', '"+chk_no10.isSelected()+"', '"
             +txtCualP10.getText().toString()+"', '"+txtDondeP10.getText().toString()+"', '"+txtQueP10.getText().toString()+"', '"
             +chk_si11.isSelected()+"', '"+chk_no11.isSelected()+"', '"
             +txtCualP11.getText().toString()+"', '"+txtCuantoP11.getText().toString()+"','"
             +chk_si12.isSelected()+"', '"+chk_no12.isSelected()+"','"
             +txtCualP12.getText().toString()+"', '"+txtCuantoP12.getText().toString()+"', '"
             +chk_si13.isSelected()+"', '"+chk_no13.isSelected()+"', '"
             +txtCuantoP13.getText().toString()+"', '"+txtCuandoP13.getText().toString()+"','"+txtDondeP13.getText().toString()+"', '"
             +chk_si14.isSelected()+"','"+chk_no14.isSelected()+"', '"
             +txtCualP14.getText().toString()+"', '"+txtDondeP14.getText().toString()+"', '"+txtQue14.getText().toString()+"','"
             +chk_si15.isSelected()+"', '"+chk_no15.isSelected()+"', '"+txtCuantosP15.getText().toString()+"', '"
             +chkCaza16.isSelected()+"', '"+txtCaza16.getText().toString()+"', '"
             +chkTiro16.isSelected()+"','"+txtTiro16.getText().toString()+"', '"
             +chkDiscotecas16.isSelected()+"', '"+txtDiscoteca16.getText().toString()+"', '"
             +chkAuriculares16.isSelected()+"', '"+txtAuriculares16.getText().toString()+"', '"
             +chkMilitar16.isSelected()+"', '"+txtMilitar16.getText().toString()+"', '"
             +chkboxeo16.isSelected()+"','"+txtBoxeo16.getText().toString()+"')";
             
              if (oConn.FnBoolQueryExecuteUpdate(insert + values)){
                imp();  
                oFunc.SubSistemaMensajeInformacion("Agregado correctamente");
                limpiar();
               
                txtNorden.requestFocus();
                    
               }
        }  
      }
}
private void Actualizar(){
    String sCodigo=txtNorden.getText();
        String strSqlStmt;
        if(validar()){
        strSqlStmt="UPDATE cuestionario_audiometria\n" +
"   SET edad='"+txtEdad.getText().toString()+"', fecha_cuestionario='"+FechaExamen.getDate()+"', \n" +
"       chksi1='"+chk_si1.isSelected()+"', chkno1='"+chk_no1.isSelected()+"', "
                + "txtrcual1='"+txtCualP1.getText().toString()+"', txtrcuando1='"+txtCuandoP1.getText().toString()+"',"
                + " txtrque1='"+txtQueP1.getText().toString()+"', chksi2='"+chk_si2.isSelected()+"', \n" +
"       chkno2='"+chk_no2.isSelected()+"', chksi3='"+chk_si3.isSelected()+"', chkno3='"+chk_no3.isSelected()+"',"
                + " chksi4='"+chk_si4.isSelected()+"', chkno4='"+chk_no4.isSelected()+"', chksi5='"+chk_si5.isSelected()+"',"
                + " chkno5='"+chk_no5.isSelected()+"', \n" +
"       chksi6='"+chk_si6.isSelected()+"', chkno6='"+chk_no6.isSelected()+"', chksi7='"+chk_si7.isSelected()+"',"
                + "chkno7='"+chk_no7.isSelected()+"', chksi8='"+chk_si8.isSelected()+"', chkno8='"+chk_no8.isSelected()+"',"
                + " chksi9='"+chk_si9.isSelected()+"', \n" +
"       chkno9='"+chk_no9.isSelected()+"', txtrcual9='"+txtCualP9.getText().toString()+"', "
                + "txtrdonde9='"+txtDondeP9.getText().toString()+"', txtrque9='"+txtQueP9.getText().toString()+"',"
                + " chksi10='"+chk_si10.isSelected()+"', chkno10='"+chk_no10.isSelected()+"', \n" +
"       txtrcual10='"+txtCualP10.getText().toString()+"', txtrdonde10='"+txtDondeP10.getText().toString()+"',"
                + " txtrque10='"+txtQueP10.getText().toString()+"', chksi11='"+chk_si11.isSelected()+"',"
                + " chkno11='"+chk_no11.isSelected()+"', \n" +
"       txtrcual11='"+txtCualP11.getText().toString()+"', txtrcuanto11='"+txtCuantoP11.getText().toString()+"', "
                + "chksi12='"+chk_si12.isSelected()+"', chkno12='"+chk_no12.isSelected()+"', "
                + "txtrcual12='"+txtCualP12.getText().toString()+"', \n" +
"       txtrcuanto12='"+txtCuantoP12.getText().toString()+"', chksi13='"+chk_si13.isSelected()+"', "
                + "chkno13='"+chk_no13.isSelected()+"', txtrcuanto13='"+txtCuantoP13.getText().toString()+"', "
                + "txtrcuando13='"+txtCuandoP13.getText().toString()+"', \n" +
"       txtrdonde13='"+txtDondeP13.getText().toString()+"', chksi14='"+chk_si14.isSelected()+"',"
                + " chkno14='"+chk_no14.isSelected()+"', txtrcual14='"+txtCualP14.getText().toString()+"', "
                + "txtrdonde14='"+txtDondeP14.getText().toString()+"', \n" +
"       txtrque14='"+txtQue14.getText().toString()+"', chksi15='" +chk_si15.isSelected()+"', "
                + "chkno15='"+chk_no15.isSelected()+"', txtrcuantos15='"+txtCuantosP15.getText().toString()+"',"
                + " chkcaza16='"+chkCaza16.isSelected()+"', \n" +
"       txtcaza16='"+txtCaza16.getText().toString()+"', chktiro16='"+chkTiro16.isSelected()+"',"
                + " txttiro16='"+txtTiro16.getText().toString()+"', chkdiscoteca16='" +chkDiscotecas16.isSelected()+"',"
                + " txtdiscoteca16='"+txtDiscoteca16.getText().toString()+"', \n" +
"       chkauriculares16='"+chkAuriculares16.isSelected()+"', txtauriculares16='"+txtAuriculares16.getText().toString()+"',"
                + " chkmilitar16='"+chkMilitar16.isSelected()+"', txtmilitar16='"+txtMilitar16.getText().toString()+"', \n" +
"       chkboxeo16='"+chkboxeo16.isSelected()+"', txtboxeo16='"+txtBoxeo16.getText().toString()+"'" +
                " WHERE n_orden='" + sCodigo + "'";
            limpiar();
            
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
        }else {
            oFunc.SubSistemaMensajeError("AGREAGR DIAGNOSTICO");
        }
}
private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaExamen.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
   
  
   return bResultado;
}
void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaExamen.setDate(fechaDate);
} 
    public boolean OrdenExiste()
    {
        
        boolean bResultado=false;
        if(!txtNorden.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from cuestionario_audiometria where n_orden ="+txtNorden.getText().toString();
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             
//             txtNorden.setText(null);
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        
        }
    void no(){
        chk_no1.setSelected(true);
        chk_no2.setSelected(true);
        chk_no3.setSelected(true);
        chk_no4.setSelected(true);
        chk_no5.setSelected(true);
        chk_no6.setSelected(true);
        chk_no7.setSelected(true);
        chk_no8.setSelected(true);
        chk_no9.setSelected(true);
        chk_no10.setSelected(true);
        chk_no11.setSelected(true);
        chk_no12.setSelected(true);
        chk_no13.setSelected(true);
        chk_no14.setSelected(true);
        chk_no15.setSelected(true);
    }
    void limpiar(){
      txtNorden.setEditable(true);
      txtNorden.requestFocus();
      txtNorden.setText(null);
      txtNombres.setText(null);
      txtEdad.setText(null);
      btsexo.clearSelection();
      p1.clearSelection();
      txtCualP1.setText(null);
      txtCuandoP1.setText(null);
      txtQueP1.setText(null);
      txtCualP9.setText(null);
      txtDondeP9.setText(null);
      txtQueP9.setText(null);
      txtCualP10.setText(null);
      txtDondeP10.setText(null);
      txtQueP10.setText(null);
      txtCualP11.setText(null);
      txtCuantoP11.setText(null);
      txtCualP12.setText(null);
      txtCuantoP12.setText(null);
      txtCuantoP13.setText(null);
      txtCuandoP13.setText(null);
      txtDondeP13.setText(null);
      txtCualP14.setText(null);
      txtDondeP14.setText(null);
      txtQue14.setText(null);
      txtCuantosP15.setText(null);
      txtCaza16.setText(null);
      txtTiro16.setText(null);
      txtDiscoteca16.setText(null);
      txtAuriculares16.setText(null);
      txtMilitar16.setText(null);
      txtBoxeo16.setText(null);
      bgEspalda1.clearSelection();
      bgEspalda2.clearSelection();
      bgEspalda3.clearSelection();
      bgEspalda4.clearSelection();
      bgEspalda5.clearSelection();
      bgEspalda6.clearSelection();
      bgEspalda7.clearSelection();
      bgEspalda8.clearSelection();
      bgEspalda9.clearSelection();
      btCuello1.clearSelection();
      btCuello2.clearSelection();
      btCuello3.clearSelection();
      btCuello4.clearSelection();
      btCuello5.clearSelection();
      jtCuestionario.setSelectedIndex(0);
      txtNorden.requestFocusInWindow();
      
    }
 private void ReImp(){
   print(Integer.valueOf(txtnordenIMP.getText()));

}
public boolean OrdenImp()
    {
        
        boolean bResultado=false;
        if(!txtnordenIMP.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from cuestionario_audiometria Where n_orden ="+txtnordenIMP.getText().toString();
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
            
             
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        
    
        }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaExamen;
    private javax.swing.ButtonGroup bgEspalda1;
    private javax.swing.ButtonGroup bgEspalda2;
    private javax.swing.ButtonGroup bgEspalda3;
    private javax.swing.ButtonGroup bgEspalda4;
    private javax.swing.ButtonGroup bgEspalda5;
    private javax.swing.ButtonGroup bgEspalda6;
    private javax.swing.ButtonGroup bgEspalda7;
    private javax.swing.ButtonGroup bgEspalda8;
    private javax.swing.ButtonGroup bgEspalda9;
    private javax.swing.ButtonGroup btCuello1;
    private javax.swing.ButtonGroup btCuello2;
    private javax.swing.ButtonGroup btCuello3;
    private javax.swing.ButtonGroup btCuello4;
    private javax.swing.ButtonGroup btCuello5;
    private javax.swing.ButtonGroup btCuello6;
    private javax.swing.ButtonGroup btCuello7;
    private javax.swing.ButtonGroup btCuello8;
    private javax.swing.ButtonGroup btCuello9;
    private javax.swing.ButtonGroup btDiestroZurdo;
    private javax.swing.ButtonGroup btHombros1;
    private javax.swing.ButtonGroup btHombros10;
    private javax.swing.ButtonGroup btHombros2;
    private javax.swing.ButtonGroup btHombros3;
    private javax.swing.ButtonGroup btHombros4;
    private javax.swing.ButtonGroup btHombros5;
    private javax.swing.ButtonGroup btHombros6;
    private javax.swing.ButtonGroup btHombros7;
    private javax.swing.ButtonGroup btHombros8;
    private javax.swing.ButtonGroup btHombros9;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImp;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup btsexo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JCheckBox chkAuriculares16;
    private javax.swing.JCheckBox chkCaza16;
    private javax.swing.JCheckBox chkDiscotecas16;
    private javax.swing.JCheckBox chkF;
    private javax.swing.JCheckBox chkM;
    private javax.swing.JCheckBox chkMilitar16;
    private javax.swing.JCheckBox chkTiro16;
    private javax.swing.JCheckBox chk_no1;
    private javax.swing.JCheckBox chk_no10;
    private javax.swing.JCheckBox chk_no11;
    private javax.swing.JCheckBox chk_no12;
    private javax.swing.JCheckBox chk_no13;
    private javax.swing.JCheckBox chk_no14;
    private javax.swing.JCheckBox chk_no15;
    private javax.swing.JCheckBox chk_no2;
    private javax.swing.JCheckBox chk_no3;
    private javax.swing.JCheckBox chk_no4;
    private javax.swing.JCheckBox chk_no5;
    private javax.swing.JCheckBox chk_no6;
    private javax.swing.JCheckBox chk_no7;
    private javax.swing.JCheckBox chk_no8;
    private javax.swing.JCheckBox chk_no9;
    private javax.swing.JCheckBox chk_si1;
    private javax.swing.JCheckBox chk_si10;
    private javax.swing.JCheckBox chk_si11;
    private javax.swing.JCheckBox chk_si12;
    private javax.swing.JCheckBox chk_si13;
    private javax.swing.JCheckBox chk_si14;
    private javax.swing.JCheckBox chk_si15;
    private javax.swing.JCheckBox chk_si2;
    private javax.swing.JCheckBox chk_si3;
    private javax.swing.JCheckBox chk_si4;
    private javax.swing.JCheckBox chk_si5;
    private javax.swing.JCheckBox chk_si6;
    private javax.swing.JCheckBox chk_si7;
    private javax.swing.JCheckBox chk_si8;
    private javax.swing.JCheckBox chk_si9;
    private javax.swing.JCheckBox chkboxeo16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jtCuestionario;
    private javax.swing.ButtonGroup p1;
    private javax.swing.JTextField txtAuriculares16;
    private javax.swing.JTextField txtBoxeo16;
    private javax.swing.JTextField txtCaza16;
    private javax.swing.JTextField txtCualP1;
    private javax.swing.JTextField txtCualP10;
    private javax.swing.JTextField txtCualP11;
    private javax.swing.JTextField txtCualP12;
    private javax.swing.JTextField txtCualP14;
    private javax.swing.JTextField txtCualP9;
    private javax.swing.JTextField txtCuandoP1;
    private javax.swing.JTextField txtCuandoP13;
    private javax.swing.JTextField txtCuantoP11;
    private javax.swing.JTextField txtCuantoP12;
    private javax.swing.JTextField txtCuantoP13;
    private javax.swing.JTextField txtCuantosP15;
    private javax.swing.JTextField txtDiscoteca16;
    private javax.swing.JTextField txtDondeP10;
    private javax.swing.JTextField txtDondeP13;
    private javax.swing.JTextField txtDondeP14;
    private javax.swing.JTextField txtDondeP9;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtMilitar16;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtQue14;
    private javax.swing.JTextField txtQueP1;
    private javax.swing.JTextField txtQueP10;
    private javax.swing.JTextField txtQueP9;
    private javax.swing.JTextField txtTiro16;
    private javax.swing.JTextField txtnordenIMP;
    // End of variables declaration//GEN-END:variables
public void imp(){
  imprimir1(Integer.valueOf(txtNorden.getText()));
}
private boolean imprimir1(Integer num){
    boolean im = false;
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
      printer1(num);
       im = true;
   }
   else
   {
      // PRESIONO NO
     }
    }
    return im;

}

  
private void printer1(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"CuestionarioAudiometria.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  
//                  JasperViewer.viewReport(jasperPrint,true);
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"CuestionarioAudiometria.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Cuestionario Audiometria");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 }    
          
}
