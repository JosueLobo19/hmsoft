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

public class CuestionarioNordico extends javax.swing.JInternalFrame {

         clsConnection oConn = new clsConnection();
         clsFunciones  oFunc = new clsFunciones();
    public CuestionarioNordico() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTanos = new javax.swing.JTextField();
        txtTmeses = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHorasTrabaja = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        chkDiestro = new javax.swing.JCheckBox();
        chkZurdo = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        btnL = new javax.swing.JButton();
        FechaExamen = new com.toedter.calendar.JDateChooser();
        jLabel80 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        chkCuelloNo = new javax.swing.JCheckBox();
        chkCuelloSi = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        rbH1 = new javax.swing.JRadioButton();
        rbH2 = new javax.swing.JRadioButton();
        rbH3 = new javax.swing.JRadioButton();
        rbH4 = new javax.swing.JRadioButton();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        rbC1 = new javax.swing.JRadioButton();
        rbC2 = new javax.swing.JRadioButton();
        rbC3 = new javax.swing.JRadioButton();
        rbC4 = new javax.swing.JRadioButton();
        jSeparator9 = new javax.swing.JSeparator();
        rbM4 = new javax.swing.JRadioButton();
        rbM3 = new javax.swing.JRadioButton();
        rbM2 = new javax.swing.JRadioButton();
        rbM1 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        chkNo1 = new javax.swing.JCheckBox();
        chkNo2 = new javax.swing.JCheckBox();
        chkNo3 = new javax.swing.JCheckBox();
        chkNo4 = new javax.swing.JCheckBox();
        chkNo5 = new javax.swing.JCheckBox();
        chkSi5 = new javax.swing.JCheckBox();
        chkSi4 = new javax.swing.JCheckBox();
        chkSi3 = new javax.swing.JCheckBox();
        chkSi2 = new javax.swing.JCheckBox();
        chkSi1 = new javax.swing.JCheckBox();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        chkNo6 = new javax.swing.JCheckBox();
        chkSi6 = new javax.swing.JCheckBox();
        chkSi7 = new javax.swing.JCheckBox();
        chkNo7 = new javax.swing.JCheckBox();
        chkSi8 = new javax.swing.JCheckBox();
        chkNo8 = new javax.swing.JCheckBox();
        chkSi9 = new javax.swing.JCheckBox();
        chkNo9 = new javax.swing.JCheckBox();
        chkSi10 = new javax.swing.JCheckBox();
        chkNo10 = new javax.swing.JCheckBox();
        chkSi11 = new javax.swing.JCheckBox();
        chkNo11 = new javax.swing.JCheckBox();
        chkSi12 = new javax.swing.JCheckBox();
        chkNo12 = new javax.swing.JCheckBox();
        chkSi13 = new javax.swing.JCheckBox();
        chkNo13 = new javax.swing.JCheckBox();
        chkSi14 = new javax.swing.JCheckBox();
        chkNo14 = new javax.swing.JCheckBox();
        chkSi15 = new javax.swing.JCheckBox();
        chkNo15 = new javax.swing.JCheckBox();
        chkMNo1 = new javax.swing.JCheckBox();
        chkMSi1 = new javax.swing.JCheckBox();
        chkCoNo1 = new javax.swing.JCheckBox();
        chkCoSi1 = new javax.swing.JCheckBox();
        chkHNo1 = new javax.swing.JCheckBox();
        chkHSi1 = new javax.swing.JCheckBox();
        chkCNo1 = new javax.swing.JCheckBox();
        chkCSi1 = new javax.swing.JCheckBox();
        chkMNo2 = new javax.swing.JCheckBox();
        chkMSi2 = new javax.swing.JCheckBox();
        chkCoNo2 = new javax.swing.JCheckBox();
        chkCoSi2 = new javax.swing.JCheckBox();
        chkHNo2 = new javax.swing.JCheckBox();
        chkHSi2 = new javax.swing.JCheckBox();
        chkCNo2 = new javax.swing.JCheckBox();
        chkCSi2 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        chkENo1 = new javax.swing.JCheckBox();
        chkESi1 = new javax.swing.JCheckBox();
        chkENo2 = new javax.swing.JCheckBox();
        chkESi2 = new javax.swing.JCheckBox();
        chkENo3 = new javax.swing.JCheckBox();
        chkESi3 = new javax.swing.JCheckBox();
        rbE1 = new javax.swing.JRadioButton();
        rbE2 = new javax.swing.JRadioButton();
        rbE3 = new javax.swing.JRadioButton();
        rbE4 = new javax.swing.JRadioButton();
        rbE5 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        chkENo4 = new javax.swing.JCheckBox();
        chkESi4 = new javax.swing.JCheckBox();
        chkENo5 = new javax.swing.JCheckBox();
        chkESi5 = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        rbE6 = new javax.swing.JRadioButton();
        rbE7 = new javax.swing.JRadioButton();
        rbE8 = new javax.swing.JRadioButton();
        rbE9 = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        chkENo6 = new javax.swing.JCheckBox();
        chkESi6 = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        chkENo7 = new javax.swing.JCheckBox();
        chkESi7 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        chkPHNo1 = new javax.swing.JCheckBox();
        chkPHSi1 = new javax.swing.JCheckBox();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        chkPH1 = new javax.swing.JCheckBox();
        chkPH2 = new javax.swing.JCheckBox();
        chkPH4 = new javax.swing.JCheckBox();
        chkPH3 = new javax.swing.JCheckBox();
        jLabel52 = new javax.swing.JLabel();
        chkPHNo2 = new javax.swing.JCheckBox();
        chkPHSi2 = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        chkPH6 = new javax.swing.JCheckBox();
        chkPH5 = new javax.swing.JCheckBox();
        chkPH8 = new javax.swing.JCheckBox();
        chkPH7 = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        chkPH12 = new javax.swing.JRadioButton();
        chkPH11 = new javax.swing.JRadioButton();
        chkPH10 = new javax.swing.JRadioButton();
        chkPH9 = new javax.swing.JRadioButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        chkPHNo3 = new javax.swing.JCheckBox();
        chkPHSi3 = new javax.swing.JCheckBox();
        chkPHSi4 = new javax.swing.JCheckBox();
        chkPHNo4 = new javax.swing.JCheckBox();
        jLabel58 = new javax.swing.JLabel();
        chkPH13 = new javax.swing.JRadioButton();
        chkPH14 = new javax.swing.JRadioButton();
        chkPH15 = new javax.swing.JRadioButton();
        chkPH16 = new javax.swing.JRadioButton();
        jLabel59 = new javax.swing.JLabel();
        chkPHNo5 = new javax.swing.JCheckBox();
        chkPHSi5 = new javax.swing.JCheckBox();
        chkPH17 = new javax.swing.JCheckBox();
        chkPH18 = new javax.swing.JCheckBox();
        chkPH19 = new javax.swing.JCheckBox();
        chkPH20 = new javax.swing.JCheckBox();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        chkPCNo1 = new javax.swing.JCheckBox();
        chkPCSi1 = new javax.swing.JCheckBox();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        chkPCNo2 = new javax.swing.JCheckBox();
        chkPCSi2 = new javax.swing.JCheckBox();
        jLabel67 = new javax.swing.JLabel();
        chkPCNo3 = new javax.swing.JCheckBox();
        chkPCSi3 = new javax.swing.JCheckBox();
        jLabel68 = new javax.swing.JLabel();
        chkPC1 = new javax.swing.JRadioButton();
        chkPC2 = new javax.swing.JRadioButton();
        chkPC3 = new javax.swing.JRadioButton();
        chkPC4 = new javax.swing.JRadioButton();
        chkPC5 = new javax.swing.JRadioButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        chkPCNo4 = new javax.swing.JCheckBox();
        chkPCSi4 = new javax.swing.JCheckBox();
        chkPCSi5 = new javax.swing.JCheckBox();
        chkPCNo5 = new javax.swing.JCheckBox();
        jLabel73 = new javax.swing.JLabel();
        chkPC6 = new javax.swing.JRadioButton();
        chkPC7 = new javax.swing.JRadioButton();
        chkPC8 = new javax.swing.JRadioButton();
        chkPC9 = new javax.swing.JRadioButton();
        jLabel74 = new javax.swing.JLabel();
        chkPCNo6 = new javax.swing.JCheckBox();
        chkPCSi6 = new javax.swing.JCheckBox();
        jLabel75 = new javax.swing.JLabel();
        chkPCNo7 = new javax.swing.JCheckBox();
        chkPCSi7 = new javax.swing.JCheckBox();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        txtnordenIMP = new javax.swing.JTextField();
        btnImp = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cuestionario Nórdico de Signos y Síntomas Osteomusculares");
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

        jLabel2.setText("Edad en años cumplidos :");

        txtEdad.setEditable(false);

        jLabel3.setText("Género :");

        btsexo.add(chkM);
        chkM.setText("Masculino");
        chkM.setEnabled(false);
        chkM.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMActionPerformed(evt);
            }
        });

        btsexo.add(chkF);
        chkF.setText("Femenino");
        chkF.setEnabled(false);
        chkF.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setText("Cuantos años y meses ha estado Ud. haciendo el presente tipo de trabajo :");

        jLabel5.setText("Años :");

        txtTanos.setText("0");
        txtTanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanosActionPerformed(evt);
            }
        });
        txtTanos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTanosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTanosFocusLost(evt);
            }
        });
        txtTanos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTanosKeyTyped(evt);
            }
        });

        txtTmeses.setText("0");
        txtTmeses.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTmesesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTmesesFocusLost(evt);
            }
        });
        txtTmeses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTmesesKeyTyped(evt);
            }
        });

        jLabel6.setText("Meses :");

        jLabel7.setText("En promedio cuántas horas a la semana trabaja ?");

        txtHorasTrabaja.setText("70");
        txtHorasTrabaja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHorasTrabajaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHorasTrabajaFocusLost(evt);
            }
        });
        txtHorasTrabaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHorasTrabajaKeyTyped(evt);
            }
        });

        jLabel8.setText("Es Ud. :");

        btDiestroZurdo.add(chkDiestro);
        chkDiestro.setSelected(true);
        chkDiestro.setText("Diestro :");
        chkDiestro.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkDiestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDiestroActionPerformed(evt);
            }
        });

        btDiestroZurdo.add(chkZurdo);
        chkZurdo.setText("Zurdo :");
        chkZurdo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkZurdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkZurdoActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nordico.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("2.- Problemas con los órganos de la locomoción");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("1.- Datos Personales");

        jLabel12.setText("¿Cómo responder el cuestionario?");

        jLabel13.setText("<html>Ud. debe decidir cuál parte tiene o ha tenido molestias / problema<br> (si lo ha tenido). por favor responda poniendo una x en el respectivo <br> recuadro para cada pregunta");

        jLabel14.setText("<html>En este dibujo Ud. puede ver la posición aproximada de las partes del cuerpo<br> referidos en el cuestionario.");

        btnNext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next.png"))); // NOI18N
        btnNext1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNext1MouseClicked(evt);
            }
        });

        jLabel77.setText("Nro Orden :");

        btnL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        jLabel80.setText("Fecha :");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkDiestro)
                                .addGap(18, 18, 18)
                                .addComponent(chkZurdo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTanos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTmeses, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHorasTrabaja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEditar))
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chkM)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkF))
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNext1)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel77)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel80)
                                    .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnL))
                            .addComponent(btnEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(chkM)
                            .addComponent(chkF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtTmeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHorasTrabaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(chkDiestro)
                            .addComponent(chkZurdo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnNext1)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(369, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(195, 195, 195)))
        );

        jtCuestionario.addTab("Cuestionario", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel15.setText("<html>Ha tenido Ud. Durante cualquier tiempo en los últimos 12 meses<br>problemas (molestias, dolor o disconfort) en :");

        jLabel16.setText("<html>Ha estado impedido en cualquier<br>tiempo durante los pasados 12<br>meses para hacer sus rutinas<br>habituales en el trabajo o su casa<br>por este problema?");

        jLabel17.setText("<html>Ud. Ha tenido problemas <br>durante los últimos 7 días?");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Para ser respondido por todos");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Para ser respondido únicamente por quienes han tenido problemas");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel20.setText("Cuello :");

        buttonGroup1.add(chkCuelloNo);
        chkCuelloNo.setSelected(true);
        chkCuelloNo.setText("No");
        chkCuelloNo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCuelloNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkCuelloNoStateChanged(evt);
            }
        });

        buttonGroup1.add(chkCuelloSi);
        chkCuelloSi.setText("Si");
        chkCuelloSi.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCuelloSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCuelloSiActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel21.setText("Hombros :");

        buttonGroup4.add(rbH1);
        rbH1.setSelected(true);
        rbH1.setText("No");
        rbH1.setPreferredSize(new java.awt.Dimension(93, 16));
        rbH1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbH1StateChanged(evt);
            }
        });

        buttonGroup4.add(rbH2);
        rbH2.setText("Si, en el hombro derecho");
        rbH2.setPreferredSize(new java.awt.Dimension(93, 16));
        rbH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbH2ActionPerformed(evt);
            }
        });

        buttonGroup4.add(rbH3);
        rbH3.setText("Si, en el hombro izquierdo");
        rbH3.setPreferredSize(new java.awt.Dimension(93, 16));
        rbH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbH3ActionPerformed(evt);
            }
        });

        buttonGroup4.add(rbH4);
        rbH4.setText("Si, en ambos hombros");
        rbH4.setPreferredSize(new java.awt.Dimension(93, 16));
        rbH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbH4ActionPerformed(evt);
            }
        });

        jLabel22.setText("Codos :");

        buttonGroup7.add(rbC1);
        rbC1.setSelected(true);
        rbC1.setText("No");
        rbC1.setPreferredSize(new java.awt.Dimension(93, 16));
        rbC1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbC1StateChanged(evt);
            }
        });

        buttonGroup7.add(rbC2);
        rbC2.setText("Si, en el codo derecho");
        rbC2.setPreferredSize(new java.awt.Dimension(93, 16));
        rbC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbC2ActionPerformed(evt);
            }
        });

        buttonGroup7.add(rbC3);
        rbC3.setText("Si, en el codo izquierdo");
        rbC3.setPreferredSize(new java.awt.Dimension(93, 16));
        rbC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbC3ActionPerformed(evt);
            }
        });

        buttonGroup7.add(rbC4);
        rbC4.setText("Si, en ambos codos");
        rbC4.setPreferredSize(new java.awt.Dimension(93, 16));
        rbC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbC4ActionPerformed(evt);
            }
        });

        buttonGroup10.add(rbM4);
        rbM4.setText("Si, en ambas muñecas/manos");
        rbM4.setPreferredSize(new java.awt.Dimension(93, 16));
        rbM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbM4ActionPerformed(evt);
            }
        });

        buttonGroup10.add(rbM3);
        rbM3.setText("Si, en la muñeca/mano izquierda");
        rbM3.setPreferredSize(new java.awt.Dimension(93, 16));
        rbM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbM3ActionPerformed(evt);
            }
        });

        buttonGroup10.add(rbM2);
        rbM2.setText("Si, en la muñeca/mano derecha");
        rbM2.setPreferredSize(new java.awt.Dimension(93, 16));
        rbM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbM2ActionPerformed(evt);
            }
        });

        buttonGroup10.add(rbM1);
        rbM1.setSelected(true);
        rbM1.setText("No");
        rbM1.setPreferredSize(new java.awt.Dimension(93, 16));
        rbM1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbM1StateChanged(evt);
            }
        });

        jLabel23.setText("Muñeca :");

        jLabel24.setText("Una o ambas caderas/muslos");

        jLabel25.setText("Espalda Alta (Tórax)");

        jLabel26.setText("Espalda Baja (Región Lumbar)");

        jLabel27.setText("Una o ambas rodillas");

        jLabel28.setText("Uno a ambos tobillos/Pies");

        buttonGroup13.add(chkNo1);
        chkNo1.setSelected(true);
        chkNo1.setText("No");
        chkNo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo1.setPreferredSize(new java.awt.Dimension(87, 16));
        chkNo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkNo1StateChanged(evt);
            }
        });

        buttonGroup14.add(chkNo2);
        chkNo2.setSelected(true);
        chkNo2.setText("No");
        chkNo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo2.setPreferredSize(new java.awt.Dimension(87, 16));
        chkNo2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkNo2StateChanged(evt);
            }
        });

        buttonGroup15.add(chkNo3);
        chkNo3.setSelected(true);
        chkNo3.setText("No");
        chkNo3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo3.setPreferredSize(new java.awt.Dimension(87, 16));
        chkNo3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkNo3StateChanged(evt);
            }
        });

        buttonGroup16.add(chkNo4);
        chkNo4.setSelected(true);
        chkNo4.setText("No");
        chkNo4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo4.setPreferredSize(new java.awt.Dimension(87, 16));
        chkNo4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkNo4StateChanged(evt);
            }
        });

        buttonGroup17.add(chkNo5);
        chkNo5.setSelected(true);
        chkNo5.setText("No");
        chkNo5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo5.setPreferredSize(new java.awt.Dimension(87, 16));
        chkNo5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkNo5StateChanged(evt);
            }
        });

        buttonGroup17.add(chkSi5);
        chkSi5.setText("Si");
        chkSi5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi5.setPreferredSize(new java.awt.Dimension(87, 16));
        chkSi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSi5ActionPerformed(evt);
            }
        });

        buttonGroup16.add(chkSi4);
        chkSi4.setText("Si");
        chkSi4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi4.setPreferredSize(new java.awt.Dimension(87, 16));
        chkSi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSi4ActionPerformed(evt);
            }
        });

        buttonGroup15.add(chkSi3);
        chkSi3.setText("Si");
        chkSi3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi3.setPreferredSize(new java.awt.Dimension(87, 16));
        chkSi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSi3ActionPerformed(evt);
            }
        });

        buttonGroup14.add(chkSi2);
        chkSi2.setText("Si");
        chkSi2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi2.setPreferredSize(new java.awt.Dimension(87, 16));
        chkSi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSi2ActionPerformed(evt);
            }
        });

        buttonGroup13.add(chkSi1);
        chkSi1.setText("Si");
        chkSi1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi1.setPreferredSize(new java.awt.Dimension(87, 16));
        chkSi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSi1ActionPerformed(evt);
            }
        });

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonGroup18.add(chkNo6);
        chkNo6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo6.setText("No");
        chkNo6.setEnabled(false);
        chkNo6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo6.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup18.add(chkSi6);
        chkSi6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi6.setText("Si");
        chkSi6.setEnabled(false);
        chkSi6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi6.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup19.add(chkSi7);
        chkSi7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi7.setText("Si");
        chkSi7.setEnabled(false);
        chkSi7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi7.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup19.add(chkNo7);
        chkNo7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo7.setText("No");
        chkNo7.setEnabled(false);
        chkNo7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo7.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup20.add(chkSi8);
        chkSi8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi8.setText("Si");
        chkSi8.setEnabled(false);
        chkSi8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi8.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup20.add(chkNo8);
        chkNo8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo8.setText("No");
        chkNo8.setEnabled(false);
        chkNo8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo8.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup21.add(chkSi9);
        chkSi9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi9.setText("Si");
        chkSi9.setEnabled(false);
        chkSi9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi9.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup21.add(chkNo9);
        chkNo9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo9.setText("No");
        chkNo9.setEnabled(false);
        chkNo9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo9.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup22.add(chkSi10);
        chkSi10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi10.setText("Si");
        chkSi10.setEnabled(false);
        chkSi10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi10.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup22.add(chkNo10);
        chkNo10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo10.setText("No");
        chkNo10.setEnabled(false);
        chkNo10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo10.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup23.add(chkSi11);
        chkSi11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi11.setText("Si");
        chkSi11.setEnabled(false);
        chkSi11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi11.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup23.add(chkNo11);
        chkNo11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo11.setText("No");
        chkNo11.setEnabled(false);
        chkNo11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo11.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup24.add(chkSi12);
        chkSi12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi12.setText("Si");
        chkSi12.setEnabled(false);
        chkSi12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi12.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup24.add(chkNo12);
        chkNo12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo12.setText("No");
        chkNo12.setEnabled(false);
        chkNo12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo12.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup25.add(chkSi13);
        chkSi13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi13.setText("Si");
        chkSi13.setEnabled(false);
        chkSi13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi13.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup25.add(chkNo13);
        chkNo13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo13.setText("No");
        chkNo13.setEnabled(false);
        chkNo13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo13.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup26.add(chkSi14);
        chkSi14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi14.setText("Si");
        chkSi14.setEnabled(false);
        chkSi14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi14.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup26.add(chkNo14);
        chkNo14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo14.setText("No");
        chkNo14.setEnabled(false);
        chkNo14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo14.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup27.add(chkSi15);
        chkSi15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkSi15.setText("Si");
        chkSi15.setEnabled(false);
        chkSi15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSi15.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup27.add(chkNo15);
        chkNo15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNo15.setText("No");
        chkNo15.setEnabled(false);
        chkNo15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNo15.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup11.add(chkMNo1);
        chkMNo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkMNo1.setText("No");
        chkMNo1.setEnabled(false);
        chkMNo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkMNo1.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup11.add(chkMSi1);
        chkMSi1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkMSi1.setText("Si");
        chkMSi1.setEnabled(false);
        chkMSi1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkMSi1.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup8.add(chkCoNo1);
        chkCoNo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkCoNo1.setText("No");
        chkCoNo1.setEnabled(false);
        chkCoNo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCoNo1.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup8.add(chkCoSi1);
        chkCoSi1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkCoSi1.setText("Si");
        chkCoSi1.setEnabled(false);
        chkCoSi1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCoSi1.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup5.add(chkHNo1);
        chkHNo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkHNo1.setText("No");
        chkHNo1.setEnabled(false);
        chkHNo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkHNo1.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup5.add(chkHSi1);
        chkHSi1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkHSi1.setText("Si");
        chkHSi1.setEnabled(false);
        chkHSi1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkHSi1.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup2.add(chkCNo1);
        chkCNo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkCNo1.setText("No");
        chkCNo1.setEnabled(false);
        chkCNo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCNo1.setPreferredSize(new java.awt.Dimension(87, 16));
        chkCNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCNo1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(chkCSi1);
        chkCSi1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkCSi1.setText("Si");
        chkCSi1.setEnabled(false);
        chkCSi1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCSi1.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup12.add(chkMNo2);
        chkMNo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkMNo2.setText("No");
        chkMNo2.setEnabled(false);
        chkMNo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkMNo2.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup12.add(chkMSi2);
        chkMSi2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkMSi2.setText("Si");
        chkMSi2.setEnabled(false);
        chkMSi2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkMSi2.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup9.add(chkCoNo2);
        chkCoNo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkCoNo2.setText("No");
        chkCoNo2.setEnabled(false);
        chkCoNo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCoNo2.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup9.add(chkCoSi2);
        chkCoSi2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkCoSi2.setText("Si");
        chkCoSi2.setEnabled(false);
        chkCoSi2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCoSi2.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup6.add(chkHNo2);
        chkHNo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkHNo2.setText("No");
        chkHNo2.setEnabled(false);
        chkHNo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkHNo2.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup6.add(chkHSi2);
        chkHSi2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkHSi2.setText("Si");
        chkHSi2.setEnabled(false);
        chkHSi2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkHSi2.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup3.add(chkCNo2);
        chkCNo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkCNo2.setText("No");
        chkCNo2.setEnabled(false);
        chkCNo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCNo2.setPreferredSize(new java.awt.Dimension(87, 16));

        buttonGroup3.add(chkCSi2);
        chkCSi2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkCSi2.setText("Si");
        chkCSi2.setEnabled(false);
        chkCSi2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCSi2.setPreferredSize(new java.awt.Dimension(87, 16));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel23)
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbM2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbM3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbM4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel22)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbC2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbC3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbC4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbH2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbH3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbH4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel20)
                        .addGap(185, 185, 185)
                        .addComponent(chkCuelloNo)
                        .addGap(10, 10, 10)
                        .addComponent(chkCuelloSi)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCoNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkHNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMSi1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCoSi1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkHSi1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCSi1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCoNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkHNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMSi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCoSi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkHSi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCSi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNo5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkSi1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSi3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSi4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSi5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkNo11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkSi11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(587, 587, 587)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel18))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel20))
                            .addComponent(chkCuelloNo)
                            .addComponent(chkCuelloSi)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(chkCNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkCSi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkCNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkCSi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel21))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(rbH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(rbH3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(rbH4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(rbH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(chkHNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkHSi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkHNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkHSi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(rbC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(rbC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(rbC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(chkCoNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkCoSi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkCoNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkCoSi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23)))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel23))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(rbM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(rbM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(rbM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(rbM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(chkMNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkMSi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkMNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkMSi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel25)
                            .addComponent(chkNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel26)
                            .addComponent(chkNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel24)
                            .addComponent(chkNo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel27)
                            .addComponent(chkNo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel28)
                            .addComponent(chkNo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNo15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSi15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtCuestionario.addTab("Responder", jPanel2);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("3.- Problemas con la Espalda Baja");

        jLabel30.setText("<html> En este dibujo Ud. puede ver la Parte del cuerpo referida en el cuestionario. problemas de espalda baja significan molestias.<br> dolor o disconfort en el área indicada con irradiación o no hacia una o ambas piernas (ciática). Por favor responda<br> poniendo una x en el respectivo recuadro para cada pregunta.");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText(" ¿Cómo responder el cuestionario?");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Espaldabaja.PNG"))); // NOI18N

        jLabel33.setText("1- Ud. ha tenido problemas en la espalda baja (molestias, dolor o disconfort) ?");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Si Ud. respondió NO a la pregunta 1, no responda las preguntas de la 2 a la 8.");

        jLabel35.setText("2- Ud. ha estado hospitalizado por problemas de espalda baja ?");

        jLabel36.setText("3- Ud. ha tenido cambios de trabajo o actividad por problemas de espalda baja ?");

        jLabel37.setText("4- Cuál es la duración total del tiempo en que ha tenido problemas de espalda baja durante los últimos 12 meses ?");

        bgEspalda1.add(chkENo1);
        chkENo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkENo1.setSelected(true);
        chkENo1.setText("No");
        chkENo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkENo1.setPreferredSize(new java.awt.Dimension(87, 16));
        chkENo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkENo1StateChanged(evt);
            }
        });

        bgEspalda1.add(chkESi1);
        chkESi1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkESi1.setText("Si");
        chkESi1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkESi1.setPreferredSize(new java.awt.Dimension(87, 16));
        chkESi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkESi1ActionPerformed(evt);
            }
        });

        bgEspalda2.add(chkENo2);
        chkENo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkENo2.setText("No");
        chkENo2.setEnabled(false);
        chkENo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkENo2.setPreferredSize(new java.awt.Dimension(87, 16));
        chkENo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkENo2ActionPerformed(evt);
            }
        });

        bgEspalda2.add(chkESi2);
        chkESi2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkESi2.setText("Si");
        chkESi2.setEnabled(false);
        chkESi2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkESi2.setPreferredSize(new java.awt.Dimension(87, 16));

        bgEspalda3.add(chkENo3);
        chkENo3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkENo3.setText("No");
        chkENo3.setEnabled(false);
        chkENo3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkENo3.setPreferredSize(new java.awt.Dimension(87, 16));
        chkENo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkENo3ActionPerformed(evt);
            }
        });

        bgEspalda3.add(chkESi3);
        chkESi3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkESi3.setText("Si");
        chkESi3.setEnabled(false);
        chkESi3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkESi3.setPreferredSize(new java.awt.Dimension(87, 16));

        bgEspalda4.add(rbE1);
        rbE1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbE1.setText("0 Días");
        rbE1.setEnabled(false);
        rbE1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbE1StateChanged(evt);
            }
        });
        rbE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbE1ActionPerformed(evt);
            }
        });

        bgEspalda4.add(rbE2);
        rbE2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbE2.setText("1-7 Días");
        rbE2.setEnabled(false);
        rbE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbE2ActionPerformed(evt);
            }
        });

        bgEspalda4.add(rbE3);
        rbE3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbE3.setText("8-30 Días");
        rbE3.setEnabled(false);
        rbE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbE3ActionPerformed(evt);
            }
        });

        bgEspalda4.add(rbE4);
        rbE4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbE4.setText("Mas de 30 Días");
        rbE4.setEnabled(false);
        rbE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbE4ActionPerformed(evt);
            }
        });

        bgEspalda4.add(rbE5);
        rbE5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbE5.setText("Todos los Días");
        rbE5.setEnabled(false);
        rbE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbE5ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Si Ud. respondió 0 días a la pregunta 4, No responda las preguntas 5 a la 8");

        jLabel39.setText("5- Los problemas de espalda baja han causado a Ud. reducción de su actividad física durante los últimos 12 meses ?");

        jLabel40.setText("a. Actividad de trabajo (en el trabajo o la casa)");

        jLabel41.setText("b. Actividades recreativas");

        bgEspalda5.add(chkENo4);
        chkENo4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkENo4.setText("No");
        chkENo4.setEnabled(false);
        chkENo4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkENo4.setPreferredSize(new java.awt.Dimension(87, 16));
        chkENo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkENo4ActionPerformed(evt);
            }
        });

        bgEspalda5.add(chkESi4);
        chkESi4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkESi4.setText("Si");
        chkESi4.setEnabled(false);
        chkESi4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkESi4.setPreferredSize(new java.awt.Dimension(87, 16));

        bgEspalda6.add(chkENo5);
        chkENo5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkENo5.setText("No");
        chkENo5.setEnabled(false);
        chkENo5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkENo5.setPreferredSize(new java.awt.Dimension(87, 16));
        chkENo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkENo5ActionPerformed(evt);
            }
        });

        bgEspalda6.add(chkESi5);
        chkESi5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkESi5.setText("Si");
        chkESi5.setEnabled(false);
        chkESi5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkESi5.setPreferredSize(new java.awt.Dimension(87, 16));

        jLabel42.setText("<html>6-Cuál es la duración total de tiempo que los problemasde espalda baja le han impedido hacer sus rutinas de trabajo (en el trabajo o en casa)<br> durante los últimos 12 meses ?");

        bgEspalda9.add(rbE6);
        rbE6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbE6.setText("0 Días");
        rbE6.setEnabled(false);

        bgEspalda9.add(rbE7);
        rbE7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbE7.setText("1-7 Días");
        rbE7.setEnabled(false);

        bgEspalda9.add(rbE8);
        rbE8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbE8.setText("8-30 Días");
        rbE8.setEnabled(false);

        bgEspalda9.add(rbE9);
        rbE9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbE9.setText("Mas de 30 Días");
        rbE9.setEnabled(false);

        jLabel43.setText("<html>7-Ha sido visto por un médico. fisioterapista,quiropráctico y otra persona de área debido a problemas de espalda<br> durante los últimos 12 meses ?");

        bgEspalda7.add(chkENo6);
        chkENo6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkENo6.setText("No");
        chkENo6.setEnabled(false);
        chkENo6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkENo6.setPreferredSize(new java.awt.Dimension(87, 16));
        chkENo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkENo6ActionPerformed(evt);
            }
        });

        bgEspalda7.add(chkESi6);
        chkESi6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkESi6.setText("Si");
        chkESi6.setEnabled(false);
        chkESi6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkESi6.setPreferredSize(new java.awt.Dimension(87, 16));

        jLabel44.setText("8-Ha tenido problemas de espalda baja en algún momento durante los últimos 7 días ?");

        bgEspalda8.add(chkENo7);
        chkENo7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkENo7.setText("No");
        chkENo7.setEnabled(false);
        chkENo7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkENo7.setPreferredSize(new java.awt.Dimension(87, 16));
        chkENo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkENo7ActionPerformed(evt);
            }
        });

        bgEspalda8.add(chkESi7);
        chkESi7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkESi7.setText("Si");
        chkESi7.setEnabled(false);
        chkESi7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkESi7.setPreferredSize(new java.awt.Dimension(87, 16));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkENo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkENo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkENo3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkENo4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkENo5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkENo6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkENo7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkESi1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkESi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkESi3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkESi4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkESi5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkESi6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkESi7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel35))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(rbE6)
                        .addGap(18, 18, 18)
                        .addComponent(rbE7)
                        .addGap(10, 10, 10)
                        .addComponent(rbE8)
                        .addGap(18, 18, 18)
                        .addComponent(rbE9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel39))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(rbE1)
                        .addGap(18, 18, 18)
                        .addComponent(rbE2)
                        .addGap(10, 10, 10)
                        .addComponent(rbE3)
                        .addGap(18, 18, 18)
                        .addComponent(rbE4)
                        .addGap(18, 18, 18)
                        .addComponent(rbE5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel29))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(jLabel31)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(chkENo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkESi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel35)
                    .addComponent(chkENo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkESi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel36)
                    .addComponent(chkENo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkESi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbE1)
                    .addComponent(rbE2)
                    .addComponent(rbE3)
                    .addComponent(rbE4)
                    .addComponent(rbE5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel40)
                    .addComponent(chkENo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkESi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkESi5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkENo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbE6)
                    .addComponent(rbE7)
                    .addComponent(rbE8)
                    .addComponent(rbE9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(chkESi6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkENo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkESi7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkENo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jtCuestionario.addTab("Espalda baja", jPanel5);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("4.- Problemas con los Hombros");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText(" ¿Cómo responder el cuestionario?");

        jLabel47.setText("<html> Problemas de los hombros significa molestias. dolor o disconforten el área indicada. Por favor concéntrese en ésta área.<br>ignorando cualquier problema que usted.  pueda haber tenido en partes adyacentes a ésta. Existe un cuestionario separado<br>para cuello. Por favor responda poniendo una x en el respectivo recuadro para cada pregunta.");

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hombros.PNG"))); // NOI18N

        jLabel49.setText("9- Ud. ha tenido problema de hombros (molestias, dolor o disconfort) ?");

        btHombros1.add(chkPHNo1);
        chkPHNo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHNo1.setSelected(true);
        chkPHNo1.setText("No");
        chkPHNo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHNo1.setPreferredSize(new java.awt.Dimension(87, 16));
        chkPHNo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPHNo1StateChanged(evt);
            }
        });

        btHombros1.add(chkPHSi1);
        chkPHSi1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHSi1.setText("Si");
        chkPHSi1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHSi1.setPreferredSize(new java.awt.Dimension(87, 16));
        chkPHSi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPHSi1ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("Si Ud. respondió NO a la pregunta 9, no responda a las preguntas 10 a 17.");

        jLabel51.setText("10- Ud. ha tenido lesiones en sus hombros en un accidente ?");

        btHombros6.add(chkPH1);
        chkPH1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH1.setText("1 No");
        chkPH1.setEnabled(false);
        chkPH1.setPreferredSize(new java.awt.Dimension(47, 16));
        chkPH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPH1ActionPerformed(evt);
            }
        });

        btHombros6.add(chkPH2);
        chkPH2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH2.setText("2 Si, en mi hombro derecho");
        chkPH2.setEnabled(false);
        chkPH2.setPreferredSize(new java.awt.Dimension(47, 16));

        btHombros6.add(chkPH4);
        chkPH4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH4.setText("4 Si, en ambos hombros");
        chkPH4.setEnabled(false);
        chkPH4.setPreferredSize(new java.awt.Dimension(47, 16));

        btHombros6.add(chkPH3);
        chkPH3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH3.setText("3 Si, en mi hombro izquierdo");
        chkPH3.setEnabled(false);
        chkPH3.setPreferredSize(new java.awt.Dimension(47, 16));
        chkPH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPH3ActionPerformed(evt);
            }
        });

        jLabel52.setText("11- Ud. ha tenido un cambio de trabajo o actividad por problemas de hombros ?");

        btHombros2.add(chkPHNo2);
        chkPHNo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHNo2.setText("No");
        chkPHNo2.setEnabled(false);
        chkPHNo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHNo2.setPreferredSize(new java.awt.Dimension(87, 16));

        btHombros2.add(chkPHSi2);
        chkPHSi2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHSi2.setText("Si");
        chkPHSi2.setEnabled(false);
        chkPHSi2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHSi2.setPreferredSize(new java.awt.Dimension(87, 16));

        jLabel53.setText("12- Ud. ha tenido problemas en los hombros durante los últimos 12 meses ?");

        btHombros7.add(chkPH6);
        chkPH6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH6.setText("2 Si, en mi hombro derecho");
        chkPH6.setEnabled(false);
        chkPH6.setPreferredSize(new java.awt.Dimension(47, 16));
        chkPH6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPH6ActionPerformed(evt);
            }
        });

        btHombros7.add(chkPH5);
        chkPH5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH5.setText("1 No");
        chkPH5.setEnabled(false);
        chkPH5.setPreferredSize(new java.awt.Dimension(47, 16));
        chkPH5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPH5StateChanged(evt);
            }
        });

        btHombros7.add(chkPH8);
        chkPH8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH8.setText("4 Si, en ambos hombros");
        chkPH8.setEnabled(false);
        chkPH8.setPreferredSize(new java.awt.Dimension(47, 16));
        chkPH8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPH8ActionPerformed(evt);
            }
        });

        btHombros7.add(chkPH7);
        chkPH7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH7.setText("3 Si, en mi hombro izquierdo");
        chkPH7.setEnabled(false);
        chkPH7.setPreferredSize(new java.awt.Dimension(47, 16));
        chkPH7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPH7ActionPerformed(evt);
            }
        });

        jLabel54.setText("13- Cuál es la duración total del tiempo en que Ud. Ha tenido problemas en los últimos 12 meses");

        btHombros8.add(chkPH12);
        chkPH12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH12.setText("Mas de 30 Días");
        chkPH12.setEnabled(false);

        btHombros8.add(chkPH11);
        chkPH11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH11.setText("8-30 Días");
        chkPH11.setEnabled(false);

        btHombros8.add(chkPH10);
        chkPH10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH10.setText("1-7 Días");
        chkPH10.setEnabled(false);

        btHombros8.add(chkPH9);
        chkPH9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH9.setText("0 Días");
        chkPH9.setEnabled(false);
        chkPH9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPH9StateChanged(evt);
            }
        });

        jLabel55.setText("14- El problema en sus hombros le han causado una disminución de su actividad durante los últimos  12 meses ?");

        jLabel56.setText("a. Actividad de trabajo (en el trabajo o la casa)");

        jLabel57.setText("b. Actividades recreativas");

        btHombros3.add(chkPHNo3);
        chkPHNo3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHNo3.setText("No");
        chkPHNo3.setEnabled(false);
        chkPHNo3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHNo3.setPreferredSize(new java.awt.Dimension(87, 16));

        btHombros3.add(chkPHSi3);
        chkPHSi3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHSi3.setText("Si");
        chkPHSi3.setEnabled(false);
        chkPHSi3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHSi3.setPreferredSize(new java.awt.Dimension(87, 16));

        btHombros4.add(chkPHSi4);
        chkPHSi4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHSi4.setText("Si");
        chkPHSi4.setEnabled(false);
        chkPHSi4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHSi4.setPreferredSize(new java.awt.Dimension(87, 16));

        btHombros4.add(chkPHNo4);
        chkPHNo4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHNo4.setText("No");
        chkPHNo4.setEnabled(false);
        chkPHNo4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHNo4.setPreferredSize(new java.awt.Dimension(87, 16));

        jLabel58.setText("<html>15- Cuál es la duración total de tiempo que el problema en sus hombros le han impedido hacer sus rutinas<br>de trabajo (en el trabajo o en casa) durante los últimos 12 meses ?");

        btHombros9.add(chkPH13);
        chkPH13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH13.setText("0 Días");
        chkPH13.setEnabled(false);

        btHombros9.add(chkPH14);
        chkPH14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH14.setText("1-7 Días");
        chkPH14.setEnabled(false);

        btHombros9.add(chkPH15);
        chkPH15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH15.setText("8-30 Días");
        chkPH15.setEnabled(false);

        btHombros9.add(chkPH16);
        chkPH16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH16.setText("Mas de 30 Días");
        chkPH16.setEnabled(false);

        jLabel59.setText("<html>16-Ha sido visto por un médico,fisioterapista, quiropráctico u otra persona del área debido a <br>problemas en los hombros durante los últimos 12 meses ? ");

        btHombros5.add(chkPHNo5);
        chkPHNo5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHNo5.setText("No");
        chkPHNo5.setEnabled(false);
        chkPHNo5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHNo5.setPreferredSize(new java.awt.Dimension(87, 16));

        btHombros5.add(chkPHSi5);
        chkPHSi5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPHSi5.setText("Si");
        chkPHSi5.setEnabled(false);
        chkPHSi5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPHSi5.setPreferredSize(new java.awt.Dimension(87, 16));

        btHombros10.add(chkPH17);
        chkPH17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH17.setText("1 No");
        chkPH17.setEnabled(false);
        chkPH17.setPreferredSize(new java.awt.Dimension(47, 16));

        btHombros10.add(chkPH18);
        chkPH18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH18.setText("2 Si, en mi hombro derecho");
        chkPH18.setEnabled(false);
        chkPH18.setPreferredSize(new java.awt.Dimension(47, 16));

        btHombros10.add(chkPH19);
        chkPH19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH19.setText("3 Si, en mi hombro izquierdo");
        chkPH19.setEnabled(false);
        chkPH19.setPreferredSize(new java.awt.Dimension(47, 16));

        btHombros10.add(chkPH20);
        chkPH20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPH20.setText("4 Si, en ambos hombros");
        chkPH20.setEnabled(false);
        chkPH20.setPreferredSize(new java.awt.Dimension(47, 16));

        jLabel78.setText("17- Ha tenido problemas de los hombros en algún momento durante los últimos 7 días ?");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel79.setText(" Si Ud. Responde NO, No responda las preguntas 13 a la 17");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator16)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkPH2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkPH18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkPH6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkPH17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkPH1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkPH5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkPH20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkPH8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkPH4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkPH3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkPH19, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkPH7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(144, 144, 144))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel56))
                                .addGap(268, 268, 268))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(chkPH13)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkPH14)
                                        .addGap(10, 10, 10)
                                        .addComponent(chkPH15)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkPH16))
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(chkPH9)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkPH10)
                                        .addGap(10, 10, 10)
                                        .addComponent(chkPH11)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkPH12))
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel52))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(chkPHNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(chkPHSi3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(chkPHNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(chkPHSi4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(chkPHNo5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(chkPHSi5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(chkPHNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkPHSi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(chkPHNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkPHSi1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addComponent(jLabel46)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel48))
                            .addComponent(jLabel78))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel79)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(chkPH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkPH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(chkPH3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkPH4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(chkPHNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkPHSi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel52)
                    .addComponent(chkPHNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPHSi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel79))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chkPH5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkPH6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chkPH7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkPH8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPH9)
                    .addComponent(chkPH10)
                    .addComponent(chkPH11)
                    .addComponent(chkPH12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel56)
                    .addComponent(chkPHNo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPHSi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel57)
                    .addComponent(chkPHNo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPHSi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPH13)
                    .addComponent(chkPH14)
                    .addComponent(chkPH15)
                    .addComponent(chkPH16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPHNo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPHSi5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel78)
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chkPH17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkPH18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chkPH19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkPH20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jtCuestionario.addTab("Hombros", jPanel6);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel60.setText(" ¿Cómo responder el cuestionario?");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setText("5.- Problemas con el Cuello");

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuello.PNG"))); // NOI18N

        jLabel64.setText("<html> Problemas de cuello significa molestias. dolor o disconforten el área indicada. Por favor concéntrese en ésta área.<br>ignorando cualquier problema que usted.  pueda haber tenido en partes adyacentes a ésta.<br> Por favor responda poniendo una x en el respectivo recuadro para cada pregunta.");

        jLabel62.setText("1- Ud. ha tenido problemas en el cuello (molestias, dolor o disconfort) ?");

        btCuello1.add(chkPCNo1);
        chkPCNo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCNo1.setSelected(true);
        chkPCNo1.setText("No");
        chkPCNo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCNo1.setPreferredSize(new java.awt.Dimension(87, 16));
        chkPCNo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPCNo1StateChanged(evt);
            }
        });

        btCuello1.add(chkPCSi1);
        chkPCSi1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCSi1.setText("Si");
        chkPCSi1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCSi1.setPreferredSize(new java.awt.Dimension(87, 16));
        chkPCSi1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPCSi1StateChanged(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setText("Si Ud. respondió NO a la pregunta 1, no responda a las preguntas de la 2 a la 8.");

        jLabel66.setText("2- Ud. ha sido lesionado en su cuello en un accidente ?");

        btCuello2.add(chkPCNo2);
        chkPCNo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCNo2.setText("No");
        chkPCNo2.setEnabled(false);
        chkPCNo2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCNo2.setPreferredSize(new java.awt.Dimension(87, 16));

        btCuello2.add(chkPCSi2);
        chkPCSi2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCSi2.setText("Si");
        chkPCSi2.setEnabled(false);
        chkPCSi2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCSi2.setPreferredSize(new java.awt.Dimension(87, 16));

        jLabel67.setText("3- Ud. ha tenido cambios de trabajo o actividad por problemas en el cuello ?");

        btCuello3.add(chkPCNo3);
        chkPCNo3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCNo3.setText("No");
        chkPCNo3.setEnabled(false);
        chkPCNo3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCNo3.setPreferredSize(new java.awt.Dimension(87, 16));

        btCuello3.add(chkPCSi3);
        chkPCSi3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCSi3.setText("Si");
        chkPCSi3.setEnabled(false);
        chkPCSi3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCSi3.setPreferredSize(new java.awt.Dimension(87, 16));

        jLabel68.setText("4- Cuál es la duración total del tiempo en que ha tenido problemas en el cuello durante los últimos 12 meses ?");

        btCuello4.add(chkPC1);
        chkPC1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPC1.setText("0 Días");
        chkPC1.setEnabled(false);
        chkPC1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPC1StateChanged(evt);
            }
        });

        btCuello4.add(chkPC2);
        chkPC2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPC2.setText("1-7 Días");
        chkPC2.setEnabled(false);
        chkPC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPC2ActionPerformed(evt);
            }
        });

        btCuello4.add(chkPC3);
        chkPC3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPC3.setText("8-30 Días");
        chkPC3.setEnabled(false);
        chkPC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPC3ActionPerformed(evt);
            }
        });

        btCuello4.add(chkPC4);
        chkPC4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPC4.setText("Mas de 30 Días");
        chkPC4.setEnabled(false);
        chkPC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPC4ActionPerformed(evt);
            }
        });

        btCuello4.add(chkPC5);
        chkPC5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPC5.setText("Todos los Días");
        chkPC5.setEnabled(false);
        chkPC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPC5ActionPerformed(evt);
            }
        });

        jLabel69.setText("5- Los problemas de su cuello han causado a Ud. reducción de actividad física durante los últimos 12 meses ?");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel70.setText("Si Ud. respondió 0 Días a la pregunta 4, no responda a las preguntas de la 5 a la 8.");

        jLabel71.setText("a. Actividad de trabajo (en el trabajo o la casa)");

        jLabel72.setText("b. Actividades recreativas");

        btCuello5.add(chkPCNo4);
        chkPCNo4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCNo4.setText("No");
        chkPCNo4.setEnabled(false);
        chkPCNo4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCNo4.setPreferredSize(new java.awt.Dimension(87, 16));

        btCuello5.add(chkPCSi4);
        chkPCSi4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCSi4.setText("Si");
        chkPCSi4.setEnabled(false);
        chkPCSi4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCSi4.setPreferredSize(new java.awt.Dimension(87, 16));

        btCuello6.add(chkPCSi5);
        chkPCSi5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCSi5.setText("Si");
        chkPCSi5.setEnabled(false);
        chkPCSi5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCSi5.setPreferredSize(new java.awt.Dimension(87, 16));

        btCuello6.add(chkPCNo5);
        chkPCNo5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCNo5.setText("No");
        chkPCNo5.setEnabled(false);
        chkPCNo5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCNo5.setPreferredSize(new java.awt.Dimension(87, 16));

        jLabel73.setText("<html>6- Cuál es la duracción total de tiempo que los problemas de su cuello la han impedido hacer sus rutinas<br>de trabajo (en el trabajo o en casa) durante los últimos 12 meses ?");

        btCuello7.add(chkPC6);
        chkPC6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPC6.setText("0 Días");
        chkPC6.setEnabled(false);

        btCuello7.add(chkPC7);
        chkPC7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPC7.setText("1-7 Días");
        chkPC7.setEnabled(false);

        btCuello7.add(chkPC8);
        chkPC8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPC8.setText("8-30 Días");
        chkPC8.setEnabled(false);

        btCuello7.add(chkPC9);
        chkPC9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPC9.setText("Mas de 30 Días");
        chkPC9.setEnabled(false);

        jLabel74.setText("<html>7-Ha sido visto por un médico,fisioterapista, quiropráctico u otra persona del área debido a <br>problemas en su cuello durante los últimos 12 meses ? ");

        btCuello8.add(chkPCNo6);
        chkPCNo6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCNo6.setText("No");
        chkPCNo6.setEnabled(false);
        chkPCNo6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCNo6.setPreferredSize(new java.awt.Dimension(87, 16));

        btCuello8.add(chkPCSi6);
        chkPCSi6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCSi6.setText("Si");
        chkPCSi6.setEnabled(false);
        chkPCSi6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCSi6.setPreferredSize(new java.awt.Dimension(87, 16));

        jLabel75.setText("8- Ha tenido problemas en su cuello en algún momento durante los últimos 7 días ?");

        btCuello9.add(chkPCNo7);
        chkPCNo7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCNo7.setText("No");
        chkPCNo7.setEnabled(false);
        chkPCNo7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCNo7.setPreferredSize(new java.awt.Dimension(87, 16));

        btCuello9.add(chkPCSi7);
        chkPCSi7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkPCSi7.setText("Si");
        chkPCSi7.setEnabled(false);
        chkPCSi7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkPCSi7.setPreferredSize(new java.awt.Dimension(87, 16));

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

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Formulario Terminado"));

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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAgregar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator17, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(chkPC1)
                        .addGap(18, 18, 18)
                        .addComponent(chkPC2)
                        .addGap(10, 10, 10)
                        .addComponent(chkPC3)
                        .addGap(18, 18, 18)
                        .addComponent(chkPC4)
                        .addGap(18, 18, 18)
                        .addComponent(chkPC5))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel69))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel70))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(chkPC6)
                        .addGap(18, 18, 18)
                        .addComponent(chkPC7)
                        .addGap(10, 10, 10)
                        .addComponent(chkPC8)
                        .addGap(18, 18, 18)
                        .addComponent(chkPC9))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkPCNo7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkPCSi7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 39, 39))
            .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel60))
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel63)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 20, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel72)
                                    .addComponent(jLabel71)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(596, 596, 596)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(chkPCNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(chkPCSi4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(chkPCNo5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(chkPCSi5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(chkPCNo6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(chkPCSi6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel66))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(chkPCNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkPCSi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(chkPCNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkPCSi1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel68))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkPCNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkPCSi3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chkPCNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPCSi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chkPCNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPCSi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(chkPCNo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkPCSi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPC1)
                    .addComponent(chkPC2)
                    .addComponent(chkPC3)
                    .addComponent(chkPC4)
                    .addComponent(chkPC5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel71)
                    .addComponent(chkPCNo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPCSi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkPCSi5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPCNo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPC6)
                    .addComponent(chkPC7)
                    .addComponent(chkPC8)
                    .addComponent(chkPC9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(chkPCSi6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkPCNo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel75)
                    .addComponent(chkPCNo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPCSi7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jtCuestionario.addTab("Cuello", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtCuestionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtCuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMActionPerformed

    private void chkDiestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDiestroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDiestroActionPerformed

    private void chkZurdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkZurdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkZurdoActionPerformed

    private void chkCNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCNo1ActionPerformed
    void hombros1 (boolean f){
    chkPH1.setEnabled(f);
    chkPH2.setEnabled(f);
    chkPH3.setEnabled(f);
    chkPH4.setEnabled(f);
    chkPH5.setEnabled(f);
    chkPH6.setEnabled(f);
    chkPH7.setEnabled(f);
    chkPH8.setEnabled(f);
        chkPHNo2.setEnabled(f);
    chkPHSi2.setEnabled(f);
    
    }
    private void chkENo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkENo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkENo2ActionPerformed

    private void chkENo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkENo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkENo3ActionPerformed

    private void chkENo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkENo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkENo4ActionPerformed

    private void chkENo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkENo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkENo5ActionPerformed

    private void chkENo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkENo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkENo6ActionPerformed

    private void chkENo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkENo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkENo7ActionPerformed

    private void chkPH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPH3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPH3ActionPerformed

    private void btnNext1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNext1MouseClicked
        jtCuestionario.setSelectedIndex(1);
    }//GEN-LAST:event_btnNext1MouseClicked

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
       Cargar();
    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtTanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanosActionPerformed
        txtTmeses.requestFocus();
    }//GEN-LAST:event_txtTanosActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
      txtNorden.setEditable(true);
      txtNorden.requestFocus();
      txtNorden.setText(null);
      txtNombres.setText(null);
      txtEdad.setText(null);
    }//GEN-LAST:event_btnLActionPerformed

    private void chkCuelloSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCuelloSiActionPerformed
        chkCNo1.setEnabled(true);
        chkCSi1.setEnabled(true);
        chkCNo2.setEnabled(true);
        chkCSi2.setEnabled(true);
    }//GEN-LAST:event_chkCuelloSiActionPerformed

    private void chkSi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSi1ActionPerformed
       chkNo6.setEnabled(true);
        chkSi6.setEnabled(true);
        chkNo11.setEnabled(true);
        chkSi11.setEnabled(true);
    }//GEN-LAST:event_chkSi1ActionPerformed

    private void chkSi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSi2ActionPerformed
        chkNo7.setEnabled(true);
        chkSi7.setEnabled(true);
        chkNo12.setEnabled(true);
        chkSi12.setEnabled(true);
    }//GEN-LAST:event_chkSi2ActionPerformed

    private void chkSi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSi3ActionPerformed
         chkNo8.setEnabled(true);
        chkSi8.setEnabled(true);
        chkNo13.setEnabled(true);
        chkSi13.setEnabled(true);
    }//GEN-LAST:event_chkSi3ActionPerformed

    private void chkSi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSi4ActionPerformed
          chkNo9.setEnabled(true);
        chkSi9.setEnabled(true);
        chkNo14.setEnabled(true);
        chkSi14.setEnabled(true);
    }//GEN-LAST:event_chkSi4ActionPerformed

    private void chkSi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSi5ActionPerformed
        chkNo10.setEnabled(true);
        chkSi10.setEnabled(true);
        chkNo15.setEnabled(true);
        chkSi15.setEnabled(true);
    }//GEN-LAST:event_chkSi5ActionPerformed

    private void rbH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbH2ActionPerformed
        chkHNo1.setEnabled(true);
        chkHSi1.setEnabled(true);
        chkHNo2.setEnabled(true);
        chkHSi2.setEnabled(true);
    }//GEN-LAST:event_rbH2ActionPerformed

    private void rbH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbH3ActionPerformed
           chkHNo1.setEnabled(true);
        chkHSi1.setEnabled(true);
        chkHNo2.setEnabled(true);
        chkHSi2.setEnabled(true);
    }//GEN-LAST:event_rbH3ActionPerformed

    private void rbH4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbH4ActionPerformed
            chkHNo1.setEnabled(true);
        chkHSi1.setEnabled(true);
        chkHNo2.setEnabled(true);
        chkHSi2.setEnabled(true);
    }//GEN-LAST:event_rbH4ActionPerformed

    private void rbC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbC2ActionPerformed
        chkCoNo1.setEnabled(true);
        chkCoSi1.setEnabled(true);
        chkCoNo2.setEnabled(true);
        chkCoSi2.setEnabled(true);
    }//GEN-LAST:event_rbC2ActionPerformed

    private void rbC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbC3ActionPerformed
        chkCoNo1.setEnabled(true);
        chkCoSi1.setEnabled(true);
        chkCoNo2.setEnabled(true);
        chkCoSi2.setEnabled(true);
    }//GEN-LAST:event_rbC3ActionPerformed

    private void rbC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbC4ActionPerformed
        chkCoNo1.setEnabled(true);
        chkCoSi1.setEnabled(true);
        chkCoNo2.setEnabled(true);
        chkCoSi2.setEnabled(true);
    }//GEN-LAST:event_rbC4ActionPerformed

    private void rbM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbM2ActionPerformed
        chkMNo1.setEnabled(true);
        chkMSi1.setEnabled(true);
        chkMNo2.setEnabled(true);
        chkMSi2.setEnabled(true);
    }//GEN-LAST:event_rbM2ActionPerformed

    private void rbM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbM3ActionPerformed
        chkMNo1.setEnabled(true);
        chkMSi1.setEnabled(true);
        chkMNo2.setEnabled(true);
        chkMSi2.setEnabled(true);
    }//GEN-LAST:event_rbM3ActionPerformed

    private void rbM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbM4ActionPerformed
        chkMNo1.setEnabled(true);
        chkMSi1.setEnabled(true);
        chkMNo2.setEnabled(true);
        chkMSi2.setEnabled(true);
    }//GEN-LAST:event_rbM4ActionPerformed

    private void rbE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbE1ActionPerformed
        espalda2(false);
          bgEspalda5.clearSelection();
       bgEspalda6.clearSelection();
       bgEspalda7.clearSelection();
       bgEspalda8.clearSelection();
       bgEspalda9.clearSelection();
    }//GEN-LAST:event_rbE1ActionPerformed

    private void chkESi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkESi1ActionPerformed
        espalda1(true);
        espalda2(true);
        rbE1.setSelected(true);
    }//GEN-LAST:event_chkESi1ActionPerformed

    private void rbE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbE2ActionPerformed
            espalda2(true);
    }//GEN-LAST:event_rbE2ActionPerformed

    private void rbE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbE3ActionPerformed
         espalda2(true);
    }//GEN-LAST:event_rbE3ActionPerformed

    private void rbE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbE4ActionPerformed
         espalda2(true);
    }//GEN-LAST:event_rbE4ActionPerformed

    private void rbE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbE5ActionPerformed
        espalda2(true);
    }//GEN-LAST:event_rbE5ActionPerformed

    private void rbE1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbE1StateChanged
        if(rbE1.isSelected()== true) {
        espalda2(false);
          bgEspalda5.clearSelection();
       bgEspalda6.clearSelection();
       bgEspalda7.clearSelection();
       bgEspalda8.clearSelection();
       bgEspalda9.clearSelection();
        }
    }//GEN-LAST:event_rbE1StateChanged

    private void chkPH9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPH9StateChanged
       
    }//GEN-LAST:event_chkPH9StateChanged

    private void chkPHSi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPHSi1ActionPerformed
         if (chkPHSi1.isSelected()== true){
            
           hombros1(true);
           chkPH5.setSelected(true);
           
        }
    }//GEN-LAST:event_chkPHSi1ActionPerformed

    private void chkPH5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPH5StateChanged
        if(chkPH5.isSelected()== true){
            hombros2(false);
        
        }
    }//GEN-LAST:event_chkPH5StateChanged

    private void chkPH6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPH6ActionPerformed
         if(chkPH6.isSelected()== true){
            hombros2(true);
        
        }
    }//GEN-LAST:event_chkPH6ActionPerformed

    private void chkPH7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPH7ActionPerformed
        if(chkPH7.isSelected()== true){
            hombros2(true);
        
        }
    }//GEN-LAST:event_chkPH7ActionPerformed

    private void chkPH8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPH8ActionPerformed
        if(chkPH8.isSelected()== true){
            hombros2(true);
        
        }
    }//GEN-LAST:event_chkPH8ActionPerformed

    private void chkPHNo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPHNo1StateChanged
         if (chkPHNo1.isSelected()== true){
           hombros1(false); 
           hombros2(false);
           btHombros2.clearSelection();
           btHombros3.clearSelection();
           btHombros4.clearSelection();
           btHombros5.clearSelection();
           btHombros6.clearSelection();
           btHombros7.clearSelection();
           btHombros8.clearSelection();
           btHombros9.clearSelection();
           btHombros10.clearSelection();        
        }
    }//GEN-LAST:event_chkPHNo1StateChanged

    private void chkPCNo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPCNo1StateChanged
        if(chkPCNo1.isSelected()== true){
        btCuello2.clearSelection();
        btCuello3.clearSelection();
        btCuello4.clearSelection();
        btCuello5.clearSelection();
        btCuello6.clearSelection();
        btCuello7.clearSelection();
        btCuello8.clearSelection();
        btCuello9.clearSelection();
       cuello1(false);
       cuello2(false);
        }
    }//GEN-LAST:event_chkPCNo1StateChanged

    private void chkPC1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPC1StateChanged
        if(chkPC1.isSelected()== true){
          btCuello5.clearSelection();
        btCuello6.clearSelection();
        btCuello7.clearSelection();
        btCuello8.clearSelection();
        btCuello9.clearSelection();
        cuello2(false);
        }
    }//GEN-LAST:event_chkPC1StateChanged

    private void chkPCSi1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPCSi1StateChanged
       if(chkPCSi1.isSelected()== true){
           cuello1(true);
           chkPC1.setSelected(true);
       
       }
    }//GEN-LAST:event_chkPCSi1StateChanged

    private void chkPC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPC2ActionPerformed
        cuello2(true);
    
    }//GEN-LAST:event_chkPC2ActionPerformed

    private void chkPC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPC3ActionPerformed
        cuello2(true);
    }//GEN-LAST:event_chkPC3ActionPerformed

    private void chkPC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPC4ActionPerformed
        cuello2(true);
    }//GEN-LAST:event_chkPC4ActionPerformed

    private void chkPC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPC5ActionPerformed
        cuello2(true);
    }//GEN-LAST:event_chkPC5ActionPerformed

    private void txtTanosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTanosFocusGained
        txtTanos.selectAll();
    }//GEN-LAST:event_txtTanosFocusGained

    private void txtTmesesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTmesesFocusGained
      txtTmeses.selectAll();
    }//GEN-LAST:event_txtTmesesFocusGained

    private void txtHorasTrabajaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasTrabajaFocusGained
      txtHorasTrabaja.selectAll();
    }//GEN-LAST:event_txtHorasTrabajaFocusGained

    private void txtHorasTrabajaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasTrabajaFocusLost
        if(txtHorasTrabaja.getText().equals("")){txtHorasTrabaja.setText("0");
        }
    }//GEN-LAST:event_txtHorasTrabajaFocusLost

    private void txtTmesesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTmesesFocusLost
       if(txtTmeses.getText().equals("")){txtTmeses.setText("0");
        }
    }//GEN-LAST:event_txtTmesesFocusLost

    private void txtTanosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTanosFocusLost
         if(txtTanos.getText().equals("")){txtTanos.setText("0");
        }
    }//GEN-LAST:event_txtTanosFocusLost

    private void txtTanosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTanosKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtTanosKeyTyped

    private void txtTmesesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTmesesKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtTmesesKeyTyped

    private void txtHorasTrabajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasTrabajaKeyTyped
         oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtHorasTrabajaKeyTyped

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

    private void chkCuelloNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkCuelloNoStateChanged
       if(chkCuelloNo.isSelected()== true){
        chkCNo1.setEnabled(false);
        chkCSi1.setEnabled(false);
        chkCNo2.setEnabled(false);
        chkCSi2.setEnabled(false);
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
       }
    }//GEN-LAST:event_chkCuelloNoStateChanged

    private void rbH1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbH1StateChanged
        if(rbH1.isSelected()== true){
        chkHNo1.setEnabled(false);
        chkHSi1.setEnabled(false);
        chkHNo2.setEnabled(false);
        chkHSi2.setEnabled(false);
        buttonGroup5.clearSelection();
         buttonGroup6.clearSelection();
        }
    }//GEN-LAST:event_rbH1StateChanged

    private void rbM1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbM1StateChanged
        if(rbM1.isSelected()==true){  
        chkMNo1.setEnabled(false);
        chkMSi1.setEnabled(false);
        chkMNo2.setEnabled(false);
        chkMSi2.setEnabled(false);
         buttonGroup11.clearSelection();
         buttonGroup12.clearSelection();}
    }//GEN-LAST:event_rbM1StateChanged

    private void chkNo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkNo1StateChanged
        if(chkNo1.isSelected()== true){
        chkNo6.setEnabled(false);
        chkSi6.setEnabled(false);
        chkNo11.setEnabled(false);
        chkSi11.setEnabled(false);
         buttonGroup18.clearSelection();
         buttonGroup23.clearSelection();
        }
    }//GEN-LAST:event_chkNo1StateChanged

    private void chkNo2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkNo2StateChanged
       if(chkNo2.isSelected()==true){
        chkNo7.setEnabled(false);
        chkSi7.setEnabled(false);
        chkNo12.setEnabled(false);
        chkSi12.setEnabled(false);
        buttonGroup19.clearSelection();
         buttonGroup24.clearSelection();
       }
    }//GEN-LAST:event_chkNo2StateChanged

    private void chkNo3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkNo3StateChanged
        if(chkNo3.isSelected()== true){
        chkNo8.setEnabled(false);
        chkSi8.setEnabled(false);
        chkNo13.setEnabled(false);
        chkSi13.setEnabled(false);
        buttonGroup20.clearSelection();
         buttonGroup25.clearSelection();
        }
    }//GEN-LAST:event_chkNo3StateChanged

    private void chkNo4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkNo4StateChanged
        if(chkNo4.isSelected()== true){
        chkNo9.setEnabled(false);
        chkSi9.setEnabled(false);
        chkNo14.setEnabled(false);
        chkSi14.setEnabled(false);
        buttonGroup21.clearSelection();
         buttonGroup26.clearSelection();
        }
    }//GEN-LAST:event_chkNo4StateChanged

    private void chkNo5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkNo5StateChanged
        if(chkNo5.isSelected()== true){
        chkNo10.setEnabled(false);
        chkSi10.setEnabled(false);
        chkNo15.setEnabled(false);
        chkSi15.setEnabled(false);
        buttonGroup22.clearSelection();
        buttonGroup27.clearSelection();
        }
    }//GEN-LAST:event_chkNo5StateChanged

    private void chkENo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkENo1StateChanged
       if(chkENo1.isSelected()== true){
        espalda1(false);
       espalda2(false);
       bgEspalda2.clearSelection();
       bgEspalda3.clearSelection();
       bgEspalda4.clearSelection();
       bgEspalda5.clearSelection();
       bgEspalda6.clearSelection();
       bgEspalda7.clearSelection();
       bgEspalda8.clearSelection();
       bgEspalda9.clearSelection();
       }
    }//GEN-LAST:event_chkENo1StateChanged

    private void rbC1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbC1StateChanged
     if(rbC1.isSelected()== true){
      chkCoNo1.setEnabled(false);
      chkCoSi1.setEnabled(false);
      chkCoNo2.setEnabled(false);
      chkCoSi2.setEnabled(false);
      buttonGroup8.clearSelection();
      buttonGroup9.clearSelection(); 
     }
    }//GEN-LAST:event_rbC1StateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       txtNorden.requestFocus();
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenKeyTyped

    private void chkPH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPH1ActionPerformed

    private void btnImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpActionPerformed
        ReImp();
    }//GEN-LAST:event_btnImpActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(!txtNorden.getText().isEmpty()){
            String Sql="SELECT d.nombres_pa,d.apellidos_pa,d.sexo_pa, \n" +
            "       c.edad, c.txthorastrabaja, c.txttmeses, \n" +
            "       c.txttanos, c.chkdiestro, c.chkzurdo, c.chkcuellono, c.chkcuellosi, c.chkcno1, \n" +
            "       c.chkcsi1, c.chkcno2, c.chkcsi2, c.rbh1, c.rbh2, c.rbh3, c.rbh4, c.chkhno1, c.chkhsi1, \n" +
            "       c.chkhno2, c.chkhsi2, c.rbc1, c.rbc2, c.rbc3, c.rbc4, c.chkcono1, c.chkcosi1, \n" +
            "       c.chkcono2, c.chkcosi2, c.rbm1, c.rbm2, c.rbm3, c.rbm4, c.chkmno1, c.chkmsi1, \n" +
            "       c.chkmno2, c.chkmsi2, c.chkno1, c.chkno2, c.chkno3, c.chkno4, c.chkno5, c.chkno6, \n" +
            "       c.chkno7, c.chkno8, c.chkno9, c.chkno10, c.chkno11, c.chkno12, c.chkno13, c.chkno14, \n" +
            "       c.chkno15, c.chksi1, c.chksi2, c.chksi3, c.chksi4, c.chksi5, c.chksi6, c.chksi7, \n" +
            "       c.chksi8, c.chksi9, c.chksi10, c.chksi11, c.chksi12, c.chksi13, c.chksi14, \n" +
            "       c.chksi15, c.chkeno1, c.chkeno2, c.chkeno3, c.chkeno4, c.chkeno5, c.chkeno6, \n" +
            "       c.chkeno7, c.chkesi1, c.chkesi2, c.chkesi3, c.chkesi4, c.chkesi5, c.chkesi6, \n" +
            "       c.chkesi7, c.rbe1, c.rbe2, c.rbe3, c.rbe4, c.rbe5, c.rbe6, c.rbe7, c.rbe8, c.rbe9, \n" +
            "       c.chkphno1, c.chkphno2, c.chkphno3, c.chkphno4, c.chkphno5, c.chkphsi1, c.chkphsi2, \n" +
            "       c.chkphsi3, c.chkphsi4, c.chkphsi5, c.chkph1, c.chkph2, c.chkph3, c.chkph4, \n" +
            "       c.chkph5, c.chkph6, c.chkph7, c.chkph8, c.chkph9, c.chkph10, c.chkph11, c.chkph12, \n" +
            "       c.chkph13, c.chkph14, c.chkph15, c.chkph16, c.chkph17, c.chkph18, c.chkph19, \n" +
            "       c.chkph20, c.chkpcno1, c.chkpcno2, c.chkpcno3, c.chkpcno4, c.chkpcno5, c.chkpcno6, \n" +
            "       c.chkpcno7, c.chkpcsi1, c.chkpcsi2, c.chkpcsi3, c.chkpcsi4, c.chkpcsi5, c.chkpcsi6, \n" +
            "       c.chkpcsi7, c.chkpc1, c.chkpc2, c.chkpc3, c.chkpc4, c.chkpc5, c.chkpc6, c.chkpc7, \n" +
            "       c.chkpc8, c.chkpc9, c.fecha_cuestionario\n" +
            "  FROM datos_paciente AS d \n" +
            "  INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa)\n" +
            "  INNER JOIN cuestionario_nordico AS c ON(c.n_orden = n.n_orden)\n" +
            "  WHERE n.n_orden ='"+txtNorden.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        
                        txtNombres.setText(oConn.setResult.getString("nombres_pa").concat(oConn.setResult.getString("apellidos_pa")));
                        String sexo =(oConn.setResult.getString("sexo_pa"));
                        if (sexo.equals("M")){chkM.setSelected(true);
                        }else{chkF.setSelected(true);
                        }
                        txtEdad.setText(oConn.setResult.getString("edad"));
                        txtHorasTrabaja.setText(oConn.setResult.getString("txthorastrabaja"));
                        txtTmeses.setText(oConn.setResult.getString("txttmeses"));
                        txtTanos.setText(oConn.setResult.getString("txttanos"));
                        chkDiestro.setSelected(oConn.setResult.getBoolean("chkdiestro"));
                        chkZurdo.setSelected(oConn.setResult.getBoolean("chkzurdo"));
                       
                        chkCuelloNo.setSelected(oConn.setResult.getBoolean("chkcuellono"));
                        chkCuelloSi.setSelected(oConn.setResult.getBoolean("chkcuellosi"));
                        chkCNo1.setSelected(oConn.setResult.getBoolean("chkcno1"));
                        chkCSi1.setSelected(oConn.setResult.getBoolean("chkcsi1"));
                        chkCNo2.setSelected(oConn.setResult.getBoolean("chkcno2"));
                        chkCSi2.setSelected(oConn.setResult.getBoolean("chkcsi2"));
                        
                        rbH1.setSelected(oConn.setResult.getBoolean("rbh1"));
                        rbH2.setSelected(oConn.setResult.getBoolean("rbh2"));
                        rbH3.setSelected(oConn.setResult.getBoolean("rbh3"));
                        rbH4.setSelected(oConn.setResult.getBoolean("rbh4"));
                        chkHNo1.setSelected(oConn.setResult.getBoolean("chkhno1"));
                        chkHSi1.setSelected(oConn.setResult.getBoolean("chkhsi1"));
                        chkHNo2.setSelected(oConn.setResult.getBoolean("chkhno2"));
                        chkHSi2.setSelected(oConn.setResult.getBoolean("chkhsi2"));
                        
                        rbC1.setSelected(oConn.setResult.getBoolean("rbc1"));
                        rbC2.setSelected(oConn.setResult.getBoolean("rbc2"));
                        rbC3.setSelected(oConn.setResult.getBoolean("rbc3"));
                        rbC4.setSelected(oConn.setResult.getBoolean("rbc4"));
                        chkCoNo1.setSelected(oConn.setResult.getBoolean("chkcono1"));
                        chkCoSi1.setSelected(oConn.setResult.getBoolean("chkcosi1"));
                        chkCoNo2.setSelected(oConn.setResult.getBoolean("chkcono2"));
                        chkCoSi2.setSelected(oConn.setResult.getBoolean("chkcosi2"));
                        
                        rbM1.setSelected(oConn.setResult.getBoolean("rbm1"));
                        rbM2.setSelected(oConn.setResult.getBoolean("rbm2"));
                        rbM3.setSelected(oConn.setResult.getBoolean("rbm3"));
                        rbM4.setSelected(oConn.setResult.getBoolean("rbm4"));
                        chkMNo1.setSelected(oConn.setResult.getBoolean("chkmno1"));
                        chkMSi1.setSelected(oConn.setResult.getBoolean("chkmsi1"));
                        chkMNo2.setSelected(oConn.setResult.getBoolean("chkmno2"));
                        chkMSi2.setSelected(oConn.setResult.getBoolean("chkmsi2"));
                        
                        chkNo1.setSelected(oConn.setResult.getBoolean("chkno1"));
                        chkNo2.setSelected(oConn.setResult.getBoolean("chkno2"));
                        chkNo3.setSelected(oConn.setResult.getBoolean("chkno3"));
                        chkNo4.setSelected(oConn.setResult.getBoolean("chkno4"));
                        chkNo5.setSelected(oConn.setResult.getBoolean("chkno5"));
                        chkNo6.setSelected(oConn.setResult.getBoolean("chkno6"));
                        chkNo7.setSelected(oConn.setResult.getBoolean("chkno7"));
                        chkNo8.setSelected(oConn.setResult.getBoolean("chkno8"));
                        chkNo9.setSelected(oConn.setResult.getBoolean("chkno9"));
                        chkNo10.setSelected(oConn.setResult.getBoolean("chkno10"));
                        chkNo11.setSelected(oConn.setResult.getBoolean("chkno11"));
                        chkNo12.setSelected(oConn.setResult.getBoolean("chkno12"));
                        chkNo13.setSelected(oConn.setResult.getBoolean("chkno13"));
                        chkNo14.setSelected(oConn.setResult.getBoolean("chkno14"));
                        chkNo15.setSelected(oConn.setResult.getBoolean("chkno15"));
                        
                        chkSi1.setSelected(oConn.setResult.getBoolean("chksi1"));
                        chkSi2.setSelected(oConn.setResult.getBoolean("chksi2"));
                        chkSi3.setSelected(oConn.setResult.getBoolean("chksi3"));
                        chkSi4.setSelected(oConn.setResult.getBoolean("chksi4"));
                        chkSi5.setSelected(oConn.setResult.getBoolean("chksi5"));
                        chkSi6.setSelected(oConn.setResult.getBoolean("chksi6"));
                        chkSi7.setSelected(oConn.setResult.getBoolean("chksi7"));
                        chkSi8.setSelected(oConn.setResult.getBoolean("chksi8"));
                        chkSi9.setSelected(oConn.setResult.getBoolean("chksi9"));
                        chkSi10.setSelected(oConn.setResult.getBoolean("chksi10"));
                        chkSi11.setSelected(oConn.setResult.getBoolean("chksi11"));
                        chkSi12.setSelected(oConn.setResult.getBoolean("chksi12"));
                        chkSi13.setSelected(oConn.setResult.getBoolean("chksi13"));
                        chkSi14.setSelected(oConn.setResult.getBoolean("chksi14"));
                        chkSi15.setSelected(oConn.setResult.getBoolean("chksi15"));
                        
                        chkENo1.setSelected(oConn.setResult.getBoolean("chkeno1"));
                        chkENo2.setSelected(oConn.setResult.getBoolean("chkeno2"));
                        chkENo3.setSelected(oConn.setResult.getBoolean("chkeno3"));
                        chkENo4.setSelected(oConn.setResult.getBoolean("chkeno4"));
                        chkENo5.setSelected(oConn.setResult.getBoolean("chkeno5"));
                        chkENo6.setSelected(oConn.setResult.getBoolean("chkeno6"));
                        chkENo7.setSelected(oConn.setResult.getBoolean("chkeno7"));
                        
                        chkESi1.setSelected(oConn.setResult.getBoolean("chkesi1"));
                        chkESi2.setSelected(oConn.setResult.getBoolean("chkesi2"));
                        chkESi3.setSelected(oConn.setResult.getBoolean("chkesi3"));
                        chkESi4.setSelected(oConn.setResult.getBoolean("chkesi4"));
                        chkESi5.setSelected(oConn.setResult.getBoolean("chkesi5"));
                        chkESi6.setSelected(oConn.setResult.getBoolean("chkesi6"));
                        chkESi7.setSelected(oConn.setResult.getBoolean("chkesi7"));
                        
                        rbE1.setSelected(oConn.setResult.getBoolean("rbe1"));
                        rbE2.setSelected(oConn.setResult.getBoolean("rbe2"));
                        rbE3.setSelected(oConn.setResult.getBoolean("rbe3"));
                        rbE4.setSelected(oConn.setResult.getBoolean("rbe4"));
                        rbE5.setSelected(oConn.setResult.getBoolean("rbe5"));
                        rbE6.setSelected(oConn.setResult.getBoolean("rbe6"));
                        rbE7.setSelected(oConn.setResult.getBoolean("rbe7"));
                        rbE8.setSelected(oConn.setResult.getBoolean("rbe8"));
                        rbE9.setSelected(oConn.setResult.getBoolean("rbe9"));
                        
                        chkPHNo1.setSelected(oConn.setResult.getBoolean("chkphno1"));
                        chkPHNo2.setSelected(oConn.setResult.getBoolean("chkphno2"));
                        chkPHNo3.setSelected(oConn.setResult.getBoolean("chkphno3"));
                        chkPHNo4.setSelected(oConn.setResult.getBoolean("chkphno4"));
                        chkPHNo5.setSelected(oConn.setResult.getBoolean("chkphno5"));
                        
                        chkPHSi1.setSelected(oConn.setResult.getBoolean("chkphsi1"));
                        chkPHSi2.setSelected(oConn.setResult.getBoolean("chkphsi2"));
                        chkPHSi3.setSelected(oConn.setResult.getBoolean("chkphsi3"));
                        chkPHSi4.setSelected(oConn.setResult.getBoolean("chkphsi4"));
                        chkPHSi5.setSelected(oConn.setResult.getBoolean("chkphsi5"));
                        
                        chkPH1.setSelected(oConn.setResult.getBoolean("chkph1"));
                        chkPH2.setSelected(oConn.setResult.getBoolean("chkph2"));
                        chkPH3.setSelected(oConn.setResult.getBoolean("chkph3"));
                        chkPH4.setSelected(oConn.setResult.getBoolean("chkph4"));
                        chkPH5.setSelected(oConn.setResult.getBoolean("chkph5"));
                        chkPH6.setSelected(oConn.setResult.getBoolean("chkph6"));
                        chkPH7.setSelected(oConn.setResult.getBoolean("chkph7"));
                        chkPH8.setSelected(oConn.setResult.getBoolean("chkph8"));
                        chkPH9.setSelected(oConn.setResult.getBoolean("chkph9"));
                        chkPH10.setSelected(oConn.setResult.getBoolean("chkph10"));
                        chkPH11.setSelected(oConn.setResult.getBoolean("chkph11"));
                        chkPH12.setSelected(oConn.setResult.getBoolean("chkph12"));
                        chkPH13.setSelected(oConn.setResult.getBoolean("chkph13"));
                        chkPH14.setSelected(oConn.setResult.getBoolean("chkph14"));
                        chkPH15.setSelected(oConn.setResult.getBoolean("chkph15"));
                        chkPH16.setSelected(oConn.setResult.getBoolean("chkph16"));
                        chkPH17.setSelected(oConn.setResult.getBoolean("chkph17"));
                        chkPH18.setSelected(oConn.setResult.getBoolean("chkph18"));
                        chkPH19.setSelected(oConn.setResult.getBoolean("chkph19"));
                        chkPH20.setSelected(oConn.setResult.getBoolean("chkph20"));
                        
                        chkPCNo1.setSelected(oConn.setResult.getBoolean("chkpcno1"));
                        chkPCNo2.setSelected(oConn.setResult.getBoolean("chkpcno2"));
                        chkPCNo3.setSelected(oConn.setResult.getBoolean("chkpcno3"));
                        chkPCNo4.setSelected(oConn.setResult.getBoolean("chkpcno4"));
                        chkPCNo5.setSelected(oConn.setResult.getBoolean("chkpcno5"));
                        chkPCNo6.setSelected(oConn.setResult.getBoolean("chkpcno6"));
                        chkPCNo7.setSelected(oConn.setResult.getBoolean("chkpcno7"));
                        
                        chkPCSi1.setSelected(oConn.setResult.getBoolean("chkpcsi1"));
                        chkPCSi2.setSelected(oConn.setResult.getBoolean("chkpcsi2"));
                        chkPCSi3.setSelected(oConn.setResult.getBoolean("chkpcsi3"));
                        chkPCSi4.setSelected(oConn.setResult.getBoolean("chkpcsi4"));
                        chkPCSi5.setSelected(oConn.setResult.getBoolean("chkpcsi5"));
                        chkPCSi6.setSelected(oConn.setResult.getBoolean("chkpcsi6"));
                        chkPCSi7.setSelected(oConn.setResult.getBoolean("chkpcsi7"));
                        
                        chkPC1.setSelected(oConn.setResult.getBoolean("chkpc1"));
                        chkPC2.setSelected(oConn.setResult.getBoolean("chkpc2"));
                        chkPC3.setSelected(oConn.setResult.getBoolean("chkpc3"));
                        chkPC4.setSelected(oConn.setResult.getBoolean("chkpc4"));
                        chkPC5.setSelected(oConn.setResult.getBoolean("chkpc5"));
                        chkPC6.setSelected(oConn.setResult.getBoolean("chkpc6"));
                        chkPC7.setSelected(oConn.setResult.getBoolean("chkpc7"));
                        chkPC8.setSelected(oConn.setResult.getBoolean("chkpc8"));
                        chkPC9.setSelected(oConn.setResult.getBoolean("chkpc9"));
                        
                        FechaExamen.setDate(oConn.setResult.getDate("fecha_cuestionario"));
                        oConn.setResult.close();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Audiometria:" + ex.getMessage().toString());
         
       }
    }     
    }//GEN-LAST:event_btnEditarActionPerformed
   void cuello1(boolean f){
       chkPCNo2.setEnabled(f);
       chkPCSi2.setEnabled(f);
       chkPCNo3.setEnabled(f);
       chkPCSi3.setEnabled(f);
       chkPC1.setEnabled(f);
       chkPC2.setEnabled(f);
       chkPC3.setEnabled(f);
       chkPC4.setEnabled(f);
       chkPC5.setEnabled(f);
       
   }
   void cuello2(boolean f){
       chkPCNo4.setEnabled(f);
       chkPCSi4.setEnabled(f);
       chkPCNo5.setEnabled(f);
       chkPCSi5.setEnabled(f);
       chkPC6.setEnabled(f);
       chkPC7.setEnabled(f);
       chkPC8.setEnabled(f);
       chkPC9.setEnabled(f);
       chkPCNo6.setEnabled(f);
       chkPCSi6.setEnabled(f);
       chkPCNo7.setEnabled(f);
       chkPCSi7.setEnabled(f);
   }
    
    void hombros2(boolean  f){
     chkPH9.setEnabled(f);
    chkPH10.setEnabled(f);
    chkPH11.setEnabled(f);
    chkPH12.setEnabled(f);
    chkPHNo3.setEnabled(f);
    chkPHSi3.setEnabled(f);
    chkPHNo4.setEnabled(f);
    chkPHSi4.setEnabled(f);
    chkPH13.setEnabled(f);
    chkPH14.setEnabled(f);
    chkPH15.setEnabled(f);
    chkPH16.setEnabled(f);
    chkPHNo5.setEnabled(f);
    chkPHSi5.setEnabled(f);
    chkPH17.setEnabled(f);
    chkPH18.setEnabled(f);
    chkPH19.setEnabled(f);
    chkPH20.setEnabled(f);

       
            btHombros8.clearSelection();
            btHombros9.clearSelection();
            btHombros10.clearSelection();
            btHombros3.clearSelection();
            btHombros4.clearSelection();
            btHombros5.clearSelection();
   
   }
    void espalda1(boolean f){
        chkENo2.setEnabled(f);
       chkESi2.setEnabled(f);
       chkENo3.setEnabled(f);
       chkESi3.setEnabled(f);
       rbE1.setEnabled(f);
       rbE2.setEnabled(f);
       rbE3.setEnabled(f);
       rbE4.setEnabled(f);
       rbE5.setEnabled(f);
 
 }
 void espalda2(boolean f){
         chkENo4.setEnabled(f);
        chkESi4.setEnabled(f);
        chkENo5.setEnabled(f);
        chkESi5.setEnabled(f);        
        rbE6.setEnabled(f);
        rbE7.setEnabled(f);
        rbE8.setEnabled(f);
        rbE9.setEnabled(f);
        chkENo6.setEnabled(f);
        chkESi6.setEnabled(f);
        chkENo7.setEnabled(f);
        chkESi7.setEnabled(f);
 
 }
    
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
                        txtTanos.requestFocus();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Cuestionario Nordico:" + ex.getMessage().toString());
            }
        }
        }
}
    
void Guardar(){
    if(!txtNorden.getText().isEmpty()){
        if(validar()){
    String insert="INSERT INTO cuestionario_nordico("//
            + "n_orden, edad, txthorastrabaja, txttmeses,txttanos,"//
            + "chkdiestro, chkzurdo, chkcuellono, chkcuellosi, chkcno1,"//
            + "chkcsi1, chkcno2, chkcsi2, rbh1, rbh2, rbh3, rbh4, chkhno1, chkhsi1," //
            + "chkhno2, chkhsi2, rbc1, rbc2, rbc3, rbc4, chkcono1, chkcosi1," //
            + "chkcono2, chkcosi2, rbm1, rbm2, rbm3, rbm4, chkmno1, chkmsi1," //
            + "chkmno2, chkmsi2, chkno1, chkno2, chkno3, chkno4, chkno5, chkno6," //
            + "chkno7, chkno8, chkno9, chkno10, chkno11, chkno12, chkno13, chkno14," //
            + "chkno15, chksi1, chksi2, chksi3, chksi4, chksi5, chksi6, chksi7,"// 
            + "chksi8, chksi9, chksi10, chksi11, chksi12, chksi13, chksi14," //
            + "chksi15, chkeno1, chkeno2, chkeno3, chkeno4, chkeno5, chkeno6,"// 
            + "chkeno7, chkesi1, chkesi2, chkesi3, chkesi4, chkesi5, chkesi6,"// 
            + "chkesi7, rbe1, rbe2, rbe3, rbe4, rbe5, rbe6, rbe7, rbe8, rbe9,"// 
            + "chkphno1, chkphno2, chkphno3, chkphno4, chkphno5, chkphsi1, chkphsi2," //
            + "chkphsi3, chkphsi4, chkphsi5, chkph1, chkph2, chkph3, chkph4,"// 
            + "chkph5, chkph6, chkph7, chkph8, chkph9, chkph10, chkph11, chkph12," //
            + "chkph13, chkph14, chkph15, chkph16, chkph17, chkph18, chkph19," //
            + "chkph20, chkpcno1, chkpcno2, chkpcno3, chkpcno4, chkpcno5, chkpcno6,"//
            + "chkpcno7, chkpcsi1, chkpcsi2, chkpcsi3, chkpcsi4, chkpcsi5, chkpcsi6," //
            + "chkpcsi7, chkpc1, chkpc2, chkpc3, chkpc4, chkpc5, chkpc6, chkpc7," 
            + "chkpc8, chkpc9,fecha_cuestionario)";
     String values="VALUES ('"
             + txtNorden.getText().toString()+"','"+txtEdad.getText().toString()+"','"+txtHorasTrabaja.getText().toString()+"','"+txtTmeses.getText().toString()+"','"+txtTanos.getText().toString()+"','"
             + chkDiestro.isSelected()+"','"+chkZurdo.isSelected()+"','"+chkCuelloNo.isSelected()+"','"+chkCuelloSi.isSelected()+"','"+chkCNo1.isSelected()+"','"
             + chkCSi1.isSelected()+"','"+chkCNo2.isSelected()+"','"+chkCSi2.isSelected()+"','"+rbH1.isSelected()+"','"+rbH2.isSelected()+"','"+rbH3.isSelected()+"','"+rbH4.isSelected()+"','"+chkHNo1.isSelected()+"','"+chkHSi1.isSelected()+"','"
             + chkHNo2.isSelected()+"','"+chkHSi2.isSelected()+"','"+rbC1.isSelected()+"','"+rbC2.isSelected()+"','"+rbC3.isSelected()+"','"+rbC4.isSelected()+"','"+chkCoNo1.isSelected()+"','"+chkCoSi1.isSelected()+"','"
             + chkCoNo2.isSelected()+"','"+chkCoSi2.isSelected()+"','"+rbM1.isSelected()+"','"+rbM2.isSelected()+"','"+rbM3.isSelected()+"','"+rbM4.isSelected()+"','"+chkMNo1.isSelected()+"','"+chkMSi1.isSelected()+"','"
             + chkMNo2.isSelected()+"','"+chkMSi2.isSelected()+"','"+chkNo1.isSelected()+"','"+chkNo2.isSelected()+"','"+chkNo3.isSelected()+"','"+chkNo4.isSelected()+"','"+chkNo5.isSelected()+"','"+chkNo6.isSelected()+"','"
             + chkNo7.isSelected()+"','"+chkNo8.isSelected()+"','"+chkNo9.isSelected()+"','"+chkNo10.isSelected()+"','"+chkNo11.isSelected()+"','"+chkNo12.isSelected()+"','"+chkNo13.isSelected()+"','"+chkNo14.isSelected()+"','"
             + chkNo15.isSelected()+"','"+chkSi1.isSelected()+"','"+chkSi2.isSelected()+"','"+chkSi3.isSelected()+"','"+chkSi4.isSelected()+"','"+chkSi5.isSelected()+"','"+chkSi6.isSelected()+"','"+chkSi7.isSelected()+"','"
             + chkSi8.isSelected()+"','"+chkSi9.isSelected()+"','"+chkSi10.isSelected()+"','"+chkSi11.isSelected()+"','"+chkSi12.isSelected()+"','"+chkSi13.isSelected()+"','"+chkSi14.isSelected()+"','"
             + chkSi15.isSelected()+"','"+chkENo1.isSelected()+"','"+chkENo2.isSelected()+"','"+chkENo3.isSelected()+"','"+chkENo4.isSelected()+"','"+chkENo5.isSelected()+"','"+chkENo6.isSelected()+"','"
             + chkENo7.isSelected()+"','"+chkESi1.isSelected()+"','"+chkESi2.isSelected()+"','"+chkESi3.isSelected()+"','"+chkESi4.isSelected()+"','"+chkESi5.isSelected()+"','"+chkESi6.isSelected()+"','"
             + chkESi7.isSelected()+"','"+rbE1.isSelected()+"','"+rbE2.isSelected()+"','"+rbE3.isSelected()+"','"+rbE4.isSelected()+"','"+rbE5.isSelected()+"','"+rbE6.isSelected()+"','"+rbE7.isSelected()+"','"+rbE8.isSelected()+"','"+rbE9.isSelected()+"','"
             + chkPHNo1.isSelected()+"','"+chkPHNo2.isSelected()+"','"+chkPHNo3.isSelected()+"','"+chkPHNo4.isSelected()+"','"+chkPHNo5.isSelected()+"','"+chkPHSi1.isSelected()+"','"+chkPHSi2.isSelected()+"','"
             + chkPHSi3.isSelected()+"','"+chkPHSi4.isSelected()+"','"+chkPHSi5.isSelected()+"','"+chkPH1.isSelected()+"','"+chkPH2.isSelected()+"','"+chkPH3.isSelected()+"','"+chkPH4.isSelected()+"','"
             + chkPH5.isSelected()+"','"+chkPH6.isSelected()+"','"+chkPH7.isSelected()+"','"+chkPH8.isSelected()+"','"+chkPH9.isSelected()+"','"+chkPH10.isSelected()+"','"+chkPH11.isSelected()+"','"+chkPH12.isSelected()+"','"
             + chkPH13.isSelected()+"','"+chkPH14.isSelected()+"','"+chkPH15.isSelected()+"','"+chkPH16.isSelected()+"','"+chkPH17.isSelected()+"','"+chkPH18.isSelected()+"','"+chkPH19.isSelected()+"','"
             + chkPH20.isSelected()+"','"+chkPCNo1.isSelected()+"','"+chkPCNo2.isSelected()+"','"+chkPCNo3.isSelected()+"','"+chkPCNo4.isSelected()+"','"+chkPCNo5.isSelected()+"','"+chkPCNo6.isSelected()+"','"
             + chkPCNo7.isSelected()+"','"+chkPCSi1.isSelected()+"','"+chkPCSi2.isSelected()+"','"+chkPCSi3.isSelected()+"','"+chkPCSi4.isSelected()+"','"+chkPCSi5.isSelected()+"','"+chkPCSi6.isSelected()+"','"
             + chkPCSi7.isSelected()+"','"+chkPC1.isSelected()+"','"+chkPC2.isSelected()+"','"+chkPC3.isSelected()+"','"+chkPC4.isSelected()+"','"+chkPC5.isSelected()+"','"+chkPC6.isSelected()+"','"+chkPC7.isSelected()+"','"
             + chkPC8.isSelected()+"','"+chkPC9.isSelected()+"','"+FechaExamen.getDate()+"')";
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
        strSqlStmt="UPDATE cuestionario_nordico\n" +
                "   SET edad='"+txtEdad.getText().toString()+"',txthorastrabaja='"+txtHorasTrabaja.getText().toString()+"', txttmeses='"+txtTmeses.getText().toString()+"', \n" +
                "       txttanos='"+txtTanos.getText().toString()+"', chkdiestro='"+chkDiestro.isSelected()+"', chkzurdo='"+chkZurdo.isSelected()+"',"
                + "     chkcuellono='"+chkCuelloNo.isSelected()+"', chkcuellosi='"+chkCuelloSi.isSelected()+"', \n" +
                "       chkcno1='"+chkCNo1.isSelected()+"', chkcsi1='"+chkCSi1.isSelected()+"', chkcno2='"+chkCNo2.isSelected()+"',"
                + "     chkcsi2='"+chkCSi2.isSelected()+"', rbh1='"+rbH1.isSelected()+"', rbh2='"+rbH2.isSelected()+"', rbh3='"+rbH3.isSelected()+"', \n" +
                "       rbh4='"+rbH4.isSelected()+"', chkhno1='"+chkHNo1.isSelected()+"', chkhsi1='"+chkHSi1.isSelected()+"', chkhno2='"+chkHNo2.isSelected()+"',"
                + "     chkhsi2='"+chkHSi2.isSelected()+"', rbc1='"+rbC1.isSelected()+"', rbc2='"+rbC2.isSelected()+"', \n" +
                "       rbc3='"+rbC3.isSelected()+"', rbc4='"+rbC4.isSelected()+"', chkcono1='"+chkCoNo1.isSelected()+"', "
                + "     chkcosi1='"+chkCoSi1.isSelected()+"', chkcono2='"+chkCoNo2.isSelected()+"', chkcosi2='"+chkCoSi2.isSelected()+"', \n" +
                "       rbm1='"+rbM1.isSelected()+"', rbm2='"+rbM2.isSelected()+"', rbm3='"+rbM3.isSelected()+"', rbm4='"+rbM4.isSelected()+"', "
                + "     chkmno1='"+chkMNo1.isSelected()+"', chkmsi1='"+chkMSi1.isSelected()+"', chkmno2='"+chkMNo2.isSelected()+"', \n" +
                "       chkmsi2='"+chkMSi2.isSelected()+"', chkno1='"+chkNo1.isSelected()+"', chkno2='"+chkNo2.isSelected()+"', "
                + "     chkno3='"+chkNo3.isSelected()+"', chkno4='"+chkNo4.isSelected()+"', chkno5='"+chkNo5.isSelected()+"', \n" +
                "       chkno6='"+chkNo6.isSelected()+"', chkno7='"+chkNo7.isSelected()+"', chkno8='"+chkNo8.isSelected()+"', "
                + "     chkno9='"+chkNo9.isSelected()+"', chkno10='"+chkNo10.isSelected()+"', chkno11='"+chkNo11.isSelected()+"', \n" +
                "       chkno12='"+chkNo12.isSelected()+"', chkno13='"+chkNo13.isSelected()+"', chkno14='"+chkNo14.isSelected()+"',"
                + "     chkno15='"+chkNo15.isSelected()+"', chksi1='"+chkSi1.isSelected()+"', chksi2='"+chkSi2.isSelected()+"', \n" +
                "       chksi3='"+chkSi3.isSelected()+"', chksi4='"+chkSi4.isSelected()+"', chksi5='"+chkSi5.isSelected()+"',"
                + "     chksi6='"+chkSi6.isSelected()+"', chksi7='"+chkSi7.isSelected()+"', chksi8='"+chkSi8.isSelected()+"', "
                + "     chksi9='"+chkSi9.isSelected()+"', \n" +
                "       chksi10='"+chkSi10.isSelected()+"', chksi11='"+chkSi11.isSelected()+"', chksi12='"+chkSi12.isSelected()+"', "
                + "     chksi13='"+chkSi13.isSelected()+"', chksi14='"+chkSi14.isSelected()+"', chksi15='"+chkSi15.isSelected()+"', \n" +
                "       chkeno1='"+chkENo1.isSelected()+"', chkeno2='"+chkENo2.isSelected()+"', chkeno3='"+chkENo3.isSelected()+"', "
                + "     chkeno4='"+chkENo4.isSelected()+"', chkeno5='"+chkENo5.isSelected()+"', chkeno6='"+chkENo6.isSelected()+"', \n" +
                "       chkeno7='"+chkENo7.isSelected()+"', chkesi1='"+chkESi1.isSelected()+"', chkesi2='"+chkESi2.isSelected()+"', "
                + "     chkesi3='"+chkESi3.isSelected()+"', chkesi4='"+chkESi4.isSelected()+"', chkesi5='"+chkESi5.isSelected()+"', \n" +
                "       chkesi6='"+chkESi6.isSelected()+"', chkesi7='"+chkESi7.isSelected()+"', rbe1='"+rbE1.isSelected()+"', "
                + "     rbe2='"+rbE2.isSelected()+"', rbe3='"+rbE3.isSelected()+"', rbe4='"+rbE4.isSelected()+"', rbe5='"+rbE5.isSelected()+"', \n" +
                "       rbe6='"+rbE6.isSelected()+"', rbe7='"+rbE7.isSelected()+"', rbe8='"+rbE8.isSelected()+"', rbe9='"+rbE9.isSelected()+"',"
                + "     chkphno1='"+chkPHNo1.isSelected()+"', chkphno2='"+chkPHNo2.isSelected()+"', chkphno3='"+chkPHNo3.isSelected()+"', \n" +
                "       chkphno4='"+chkPHNo4.isSelected()+"', chkphno5='"+chkPHNo5.isSelected()+"', chkphsi1='"+chkPHSi1.isSelected()+"',"
                + "     chkphsi2='"+chkPHSi2.isSelected()+"', chkphsi3='"+chkPHSi3.isSelected()+"', chkphsi4='"+chkPHSi4.isSelected()+"', \n" +
                "       chkphsi5='"+chkPHSi5.isSelected()+"', chkph1='"+chkPH1.isSelected()+"', chkph2='"+chkPH2.isSelected()+"',"
                + "     chkph3='"+chkPH3.isSelected()+"', chkph4='"+chkPH4.isSelected()+"', chkph5='"+chkPH5.isSelected()+"', \n" +
                "       chkph6='"+chkPH6.isSelected()+"', chkph7='"+chkPH7.isSelected()+"', chkph8='"+chkPH8.isSelected()+"',"
                + "     chkph9='"+chkPH9.isSelected()+"', chkph10='"+chkPH10.isSelected()+"', chkph11='"+chkPH11.isSelected()+"', \n" +
                "       chkph12='"+chkPH12.isSelected()+"', chkph13='"+chkPH13.isSelected()+"', chkph14='"+chkPH14.isSelected()+"', "
                + "     chkph15='"+chkPH15.isSelected()+"', chkph16='"+chkPH16.isSelected()+"', chkph17='"+chkPH17.isSelected()+"', \n" +
                "       chkph18='"+chkPH18.isSelected()+"', chkph19='"+chkPH19.isSelected()+"', chkph20='"+chkPH20.isSelected()+"',"
                + "     chkpcno1='"+chkPCNo1.isSelected()+"', chkpcno2='"+chkPCNo2.isSelected()+"', chkpcno3='"+chkPCNo3.isSelected()+"', \n" +
                "       chkpcno4='"+chkPCNo4.isSelected()+"', chkpcno5='"+chkPCNo5.isSelected()+"', chkpcno6='"+chkPCNo6.isSelected()+"',"
                + "     chkpcno7='"+chkPCNo7.isSelected()+"', chkpcsi1='"+chkPCSi1.isSelected()+"', chkpcsi2='"+chkPCSi2.isSelected()+"', \n" +
                "       chkpcsi3='"+chkPCSi3.isSelected()+"', chkpcsi4='"+chkPCSi4.isSelected()+"', chkpcsi5='"+chkPCSi5.isSelected()+"', "
                + "     chkpcsi6='"+chkPCSi6.isSelected()+"', chkpcsi7='"+chkPCSi7.isSelected()+"', chkpc1='"+chkPC1.isSelected()+"', \n" +
                "       chkpc2='"+chkPC2.isSelected()+"', chkpc3='"+chkPC3.isSelected()+"', chkpc4='"+chkPC4.isSelected()+"',"
                + "     chkpc5='"+chkPC5.isSelected()+"', chkpc6='"+chkPC6.isSelected()+"', chkpc7='"+chkPC7.isSelected()+"', "
                + "     chkpc8='"+chkPC8.isSelected()+"', \n" +
                "       chkpc9='"+chkPC9.isSelected()+"', fecha_cuestionario='"+FechaExamen.getDate()+"'" +
                " WHERE n_orden='" + sCodigo + "'";
            
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            imp();  
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
            limpiar();
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
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

        sQuery  = "Select n_orden from cuestionario_nordico where n_orden ="+txtNorden.getText().toString();
        
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
//             txtNorden.setText(null);
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        
    
        }
    void limpiar(){
      txtNorden.setEditable(true);
      txtNorden.requestFocus();
      txtNorden.setText(null);
      txtNombres.setText(null);
      txtEdad.setText(null);
      txtHorasTrabaja.setText("0");
      txtTanos.setText("0");
     txtTmeses.setText("0");
     btsexo.clearSelection();
      chkCuelloNo.setSelected(true);
      rbH1.setSelected(true);
      rbC1.setSelected(true);
      rbM1.setSelected(true);
      chkNo1.setSelected(true);
      chkNo2.setSelected(true);
      chkNo3.setSelected(true);
      chkNo4.setSelected(true);
      chkNo5.setSelected(true);
      chkENo1.setSelected(true);
      chkPHNo1.setSelected(true);
      chkPCNo1.setSelected(true);
      jtCuestionario.setSelectedIndex(0);
      txtNorden.requestFocusInWindow();
      
    }
 private void ReImp(){
if(!txtnordenIMP.getText().isEmpty()){
            if(OrdenImp()){
                if (imprimir1(Integer.valueOf(txtnordenIMP.getText()))){
                imprimir2(Integer.valueOf(txtnordenIMP.getText()));
                 }
            }else {oFunc.SubSistemaMensajeError("Numero de Orden no Existe"); txtnordenIMP.setText(null); txtnordenIMP.requestFocus();
            }
            
            
            }else{
           
        
        }

}
public boolean OrdenImp()
    {
        
        boolean bResultado=false;
        if(!txtnordenIMP.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from cuestionario_nordico Where n_orden ="+txtnordenIMP.getText().toString();
        
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
    private javax.swing.JLabel btnNext1;
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
    private javax.swing.JCheckBox chkCNo1;
    private javax.swing.JCheckBox chkCNo2;
    private javax.swing.JCheckBox chkCSi1;
    private javax.swing.JCheckBox chkCSi2;
    private javax.swing.JCheckBox chkCoNo1;
    private javax.swing.JCheckBox chkCoNo2;
    private javax.swing.JCheckBox chkCoSi1;
    private javax.swing.JCheckBox chkCoSi2;
    private javax.swing.JCheckBox chkCuelloNo;
    private javax.swing.JCheckBox chkCuelloSi;
    private javax.swing.JCheckBox chkDiestro;
    private javax.swing.JCheckBox chkENo1;
    private javax.swing.JCheckBox chkENo2;
    private javax.swing.JCheckBox chkENo3;
    private javax.swing.JCheckBox chkENo4;
    private javax.swing.JCheckBox chkENo5;
    private javax.swing.JCheckBox chkENo6;
    private javax.swing.JCheckBox chkENo7;
    private javax.swing.JCheckBox chkESi1;
    private javax.swing.JCheckBox chkESi2;
    private javax.swing.JCheckBox chkESi3;
    private javax.swing.JCheckBox chkESi4;
    private javax.swing.JCheckBox chkESi5;
    private javax.swing.JCheckBox chkESi6;
    private javax.swing.JCheckBox chkESi7;
    private javax.swing.JCheckBox chkF;
    private javax.swing.JCheckBox chkHNo1;
    private javax.swing.JCheckBox chkHNo2;
    private javax.swing.JCheckBox chkHSi1;
    private javax.swing.JCheckBox chkHSi2;
    private javax.swing.JCheckBox chkM;
    private javax.swing.JCheckBox chkMNo1;
    private javax.swing.JCheckBox chkMNo2;
    private javax.swing.JCheckBox chkMSi1;
    private javax.swing.JCheckBox chkMSi2;
    private javax.swing.JCheckBox chkNo1;
    private javax.swing.JCheckBox chkNo10;
    private javax.swing.JCheckBox chkNo11;
    private javax.swing.JCheckBox chkNo12;
    private javax.swing.JCheckBox chkNo13;
    private javax.swing.JCheckBox chkNo14;
    private javax.swing.JCheckBox chkNo15;
    private javax.swing.JCheckBox chkNo2;
    private javax.swing.JCheckBox chkNo3;
    private javax.swing.JCheckBox chkNo4;
    private javax.swing.JCheckBox chkNo5;
    private javax.swing.JCheckBox chkNo6;
    private javax.swing.JCheckBox chkNo7;
    private javax.swing.JCheckBox chkNo8;
    private javax.swing.JCheckBox chkNo9;
    private javax.swing.JRadioButton chkPC1;
    private javax.swing.JRadioButton chkPC2;
    private javax.swing.JRadioButton chkPC3;
    private javax.swing.JRadioButton chkPC4;
    private javax.swing.JRadioButton chkPC5;
    private javax.swing.JRadioButton chkPC6;
    private javax.swing.JRadioButton chkPC7;
    private javax.swing.JRadioButton chkPC8;
    private javax.swing.JRadioButton chkPC9;
    private javax.swing.JCheckBox chkPCNo1;
    private javax.swing.JCheckBox chkPCNo2;
    private javax.swing.JCheckBox chkPCNo3;
    private javax.swing.JCheckBox chkPCNo4;
    private javax.swing.JCheckBox chkPCNo5;
    private javax.swing.JCheckBox chkPCNo6;
    private javax.swing.JCheckBox chkPCNo7;
    private javax.swing.JCheckBox chkPCSi1;
    private javax.swing.JCheckBox chkPCSi2;
    private javax.swing.JCheckBox chkPCSi3;
    private javax.swing.JCheckBox chkPCSi4;
    private javax.swing.JCheckBox chkPCSi5;
    private javax.swing.JCheckBox chkPCSi6;
    private javax.swing.JCheckBox chkPCSi7;
    private javax.swing.JCheckBox chkPH1;
    private javax.swing.JRadioButton chkPH10;
    private javax.swing.JRadioButton chkPH11;
    private javax.swing.JRadioButton chkPH12;
    private javax.swing.JRadioButton chkPH13;
    private javax.swing.JRadioButton chkPH14;
    private javax.swing.JRadioButton chkPH15;
    private javax.swing.JRadioButton chkPH16;
    private javax.swing.JCheckBox chkPH17;
    private javax.swing.JCheckBox chkPH18;
    private javax.swing.JCheckBox chkPH19;
    private javax.swing.JCheckBox chkPH2;
    private javax.swing.JCheckBox chkPH20;
    private javax.swing.JCheckBox chkPH3;
    private javax.swing.JCheckBox chkPH4;
    private javax.swing.JCheckBox chkPH5;
    private javax.swing.JCheckBox chkPH6;
    private javax.swing.JCheckBox chkPH7;
    private javax.swing.JCheckBox chkPH8;
    private javax.swing.JRadioButton chkPH9;
    private javax.swing.JCheckBox chkPHNo1;
    private javax.swing.JCheckBox chkPHNo2;
    private javax.swing.JCheckBox chkPHNo3;
    private javax.swing.JCheckBox chkPHNo4;
    private javax.swing.JCheckBox chkPHNo5;
    private javax.swing.JCheckBox chkPHSi1;
    private javax.swing.JCheckBox chkPHSi2;
    private javax.swing.JCheckBox chkPHSi3;
    private javax.swing.JCheckBox chkPHSi4;
    private javax.swing.JCheckBox chkPHSi5;
    private javax.swing.JCheckBox chkSi1;
    private javax.swing.JCheckBox chkSi10;
    private javax.swing.JCheckBox chkSi11;
    private javax.swing.JCheckBox chkSi12;
    private javax.swing.JCheckBox chkSi13;
    private javax.swing.JCheckBox chkSi14;
    private javax.swing.JCheckBox chkSi15;
    private javax.swing.JCheckBox chkSi2;
    private javax.swing.JCheckBox chkSi3;
    private javax.swing.JCheckBox chkSi4;
    private javax.swing.JCheckBox chkSi5;
    private javax.swing.JCheckBox chkSi6;
    private javax.swing.JCheckBox chkSi7;
    private javax.swing.JCheckBox chkSi8;
    private javax.swing.JCheckBox chkSi9;
    private javax.swing.JCheckBox chkZurdo;
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
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
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
    private javax.swing.JLabel jLabel67;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jtCuestionario;
    private javax.swing.JRadioButton rbC1;
    private javax.swing.JRadioButton rbC2;
    private javax.swing.JRadioButton rbC3;
    private javax.swing.JRadioButton rbC4;
    private javax.swing.JRadioButton rbE1;
    private javax.swing.JRadioButton rbE2;
    private javax.swing.JRadioButton rbE3;
    private javax.swing.JRadioButton rbE4;
    private javax.swing.JRadioButton rbE5;
    private javax.swing.JRadioButton rbE6;
    private javax.swing.JRadioButton rbE7;
    private javax.swing.JRadioButton rbE8;
    private javax.swing.JRadioButton rbE9;
    private javax.swing.JRadioButton rbH1;
    private javax.swing.JRadioButton rbH2;
    private javax.swing.JRadioButton rbH3;
    private javax.swing.JRadioButton rbH4;
    private javax.swing.JRadioButton rbM1;
    private javax.swing.JRadioButton rbM2;
    private javax.swing.JRadioButton rbM3;
    private javax.swing.JRadioButton rbM4;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtHorasTrabaja;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtTanos;
    private javax.swing.JTextField txtTmeses;
    private javax.swing.JTextField txtnordenIMP;
    // End of variables declaration//GEN-END:variables
public void imp(){
if (imprimir1(Integer.valueOf(txtNorden.getText()))){
    imprimir2(Integer.valueOf(txtNorden.getText()));
}

}
private boolean imprimir1(Integer num){
    boolean im = false;
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir Hoja 1 de 2 ?", //Mensaje
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
private void imprimir2(Integer num){
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Ingrese la misma hoja para imprimir Reverso - Hoja 2 de 2 ?", //Mensaje
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
      printer2(num);
   }
   else
   {
      // PRESIONO NO
     }
    }

}
  
private void printer1(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"CuestionarioNordico.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  JasperPrintManager.printReport(jasperPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
          private void printer2(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"CuestionarioNordico2.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  JasperPrintManager.printReport(jasperPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
}
