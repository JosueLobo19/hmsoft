/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author admin
 */
public class DetecciondeSAS extends javax.swing.JInternalFrame {
        clsFunciones  oFunc = new clsFunciones();
        clsConnection oConn = new clsConnection();
    public DetecciondeSAS() {
        initComponents();

      jtSAS.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/reportes.png")));
      jtSAS.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/grua.png")));
      jtSAS.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/configuracion.png")));
      jtSAS.setIconAt(3, new ImageIcon(ClassLoader.getSystemResource("imagenes/reportes.png")));
      jtSAS.setIconAt(4, new ImageIcon(ClassLoader.getSystemResource("imagenes/reportes.png")));
      txtNorden.requestFocus();
      txtMedico.setText(Clases.clsGlobales.sNomOperador);
      txtCMP.setText("CMP - "+ Clases.clsGlobales.sCMPOperador);
      if(rbFueraMinaNO.isSelected()== true){
      
      accidente(true);
      }
    }
    private void accidente(boolean t){
    
    chk1_sasNO.setSelected(t);
    chk2_sasNO.setSelected(t);
    chk3_sasNO.setSelected(t);
    chk4_sasNO.setSelected(t);
    chk5_sasNO.setSelected(t);
    chk6_sasNO.setSelected(t);
    chk7_sasNO.setSelected(t);
    chk8_sasNO.setSelected(t);
    chk9_sasNO.setSelected(t);
    chk10_sasNO.setSelected(t);
    chk11_sasNO.setSelected(t);
    chk12_sasNO.setSelected(t);
    chk13_sasNO.setSelected(t);
    if(t== false){
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup5.clearSelection();
        buttonGroup6.clearSelection();
        buttonGroup7.clearSelection();
        buttonGroup8.clearSelection();
        buttonGroup9.clearSelection();
        buttonGroup10.clearSelection();
        buttonGroup11.clearSelection();
        buttonGroup12.clearSelection();
        buttonGroup13.clearSelection();
    }
    
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
        buttonGroup13 = new javax.swing.ButtonGroup();
        btHombres = new javax.swing.ButtonGroup();
        btMujer = new javax.swing.ButtonGroup();
        btHTA = new javax.swing.ButtonGroup();
        btApnea = new javax.swing.ButtonGroup();
        btHTAFiliacion = new javax.swing.ButtonGroup();
        btPSG = new javax.swing.ButtonGroup();
        btEnmina = new javax.swing.ButtonGroup();
        btFuerademina = new javax.swing.ButtonGroup();
        btTrabajonoche = new javax.swing.ButtonGroup();
        btAntecedentefam = new javax.swing.ButtonGroup();
        bte1 = new javax.swing.ButtonGroup();
        bte2 = new javax.swing.ButtonGroup();
        bte3 = new javax.swing.ButtonGroup();
        bte4 = new javax.swing.ButtonGroup();
        bte5 = new javax.swing.ButtonGroup();
        bte6 = new javax.swing.ButtonGroup();
        bte7 = new javax.swing.ButtonGroup();
        bte8 = new javax.swing.ButtonGroup();
        btmallampati = new javax.swing.ButtonGroup();
        btPSGC = new javax.swing.ButtonGroup();
        btAptoC = new javax.swing.ButtonGroup();
        btAptoRiesgoC = new javax.swing.ButtonGroup();
        bgPsgA = new javax.swing.ButtonGroup();
        bgPsgB = new javax.swing.ButtonGroup();
        bgPsgD = new javax.swing.ButtonGroup();
        bgPsgD1 = new javax.swing.ButtonGroup();
        bgPsgD2 = new javax.swing.ButtonGroup();
        bgPsgD3 = new javax.swing.ButtonGroup();
        bgPsgD4 = new javax.swing.ButtonGroup();
        bgPsgD5 = new javax.swing.ButtonGroup();
        bgPsgD6 = new javax.swing.ButtonGroup();
        bgPsgE = new javax.swing.ButtonGroup();
        jtSAS = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FechaSAS = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtAreaTrabajo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLicencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContratista = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tbTrabajaNocheSI = new javax.swing.JRadioButton();
        tbTrabajaNocheNO = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDiasTrabajo = new javax.swing.JTextField();
        txtDescanso = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtanostrabajo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        rbApneaSI = new javax.swing.JRadioButton();
        rbApneaNO = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        txtUltimoControl = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        rbHTASI = new javax.swing.JRadioButton();
        rbHTANO = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        txtRiesgo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        rbPSGSI = new javax.swing.JRadioButton();
        rbPSGNO = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        rbEnMinaSI = new javax.swing.JRadioButton();
        rbEnMinaNO = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        rbFueraMinaSI = new javax.swing.JRadioButton();
        rbFueraMinaNO = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        btnNext0 = new javax.swing.JLabel();
        FechaPSG = new com.toedter.calendar.JDateChooser();
        lblPSG = new javax.swing.JLabel();
        lblApnea = new javax.swing.JLabel();
        btnLimpiar1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        chk1_sasSI = new javax.swing.JCheckBox();
        chk1_sasNO = new javax.swing.JCheckBox();
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
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        chk2_sasSI = new javax.swing.JCheckBox();
        chk2_sasNO = new javax.swing.JCheckBox();
        chk3_sasSI = new javax.swing.JCheckBox();
        chk3_sasNO = new javax.swing.JCheckBox();
        chk4_sasSI = new javax.swing.JCheckBox();
        chk4_sasNO = new javax.swing.JCheckBox();
        chk5_sasSI = new javax.swing.JCheckBox();
        chk5_sasNO = new javax.swing.JCheckBox();
        chk6_sasSI = new javax.swing.JCheckBox();
        chk6_sasNO = new javax.swing.JCheckBox();
        chk7_sasSI = new javax.swing.JCheckBox();
        chk7_sasNO = new javax.swing.JCheckBox();
        chk8_sasSI = new javax.swing.JCheckBox();
        chk8_sasNO = new javax.swing.JCheckBox();
        chk9_sasSI = new javax.swing.JCheckBox();
        chk9_sasNO = new javax.swing.JCheckBox();
        chk10_sasSI = new javax.swing.JCheckBox();
        chk10_sasNO = new javax.swing.JCheckBox();
        chk11_sasSI = new javax.swing.JCheckBox();
        chk11_sasNO = new javax.swing.JCheckBox();
        chk12_sasSI = new javax.swing.JCheckBox();
        chk12_sasNO = new javax.swing.JCheckBox();
        chk13_sasSI = new javax.swing.JCheckBox();
        chk13_sasNO = new javax.swing.JCheckBox();
        btnNext = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        chkAntSI = new javax.swing.JCheckBox();
        chkAntNO = new javax.swing.JCheckBox();
        jLabel46 = new javax.swing.JLabel();
        txtAntecedenteFamiliar = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        chk1_eSI = new javax.swing.JCheckBox();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        chk1_eNO = new javax.swing.JCheckBox();
        chk2_eSI = new javax.swing.JCheckBox();
        chk2_eNO = new javax.swing.JCheckBox();
        chk3_eSI = new javax.swing.JCheckBox();
        chk3_eNO = new javax.swing.JCheckBox();
        chk4_eSI = new javax.swing.JCheckBox();
        chk4_eNO = new javax.swing.JCheckBox();
        chk5_eNO = new javax.swing.JCheckBox();
        chk5_eSI = new javax.swing.JCheckBox();
        chk6_eSI = new javax.swing.JCheckBox();
        chk6_eNO = new javax.swing.JCheckBox();
        chk7_eNO = new javax.swing.JCheckBox();
        chk7_eSI = new javax.swing.JCheckBox();
        chk8_eNO = new javax.swing.JCheckBox();
        chk8_eSI = new javax.swing.JCheckBox();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        txtPuntuacion = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnNext2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtTalla = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txtCircunferencia = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        chkvaronSI = new javax.swing.JCheckBox();
        chkvaronNO = new javax.swing.JCheckBox();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        chkmujerSI = new javax.swing.JCheckBox();
        chkmujerNO = new javax.swing.JCheckBox();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel69 = new javax.swing.JLabel();
        txtSistolica = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtDiastolica = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        chkHTAnuevaSI = new javax.swing.JCheckBox();
        chkHTAnuevaNO = new javax.swing.JCheckBox();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel74 = new javax.swing.JLabel();
        chkGradoI = new javax.swing.JCheckBox();
        chkGradoII = new javax.swing.JCheckBox();
        chkGradoIII = new javax.swing.JCheckBox();
        chkGradoIIII = new javax.swing.JCheckBox();
        btnNext3 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel89 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        txtObservaciones = new javax.swing.JTextField();
        txtCMP = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        chk1_PSG_SI = new javax.swing.JCheckBox();
        chk1_PSG_NO = new javax.swing.JCheckBox();
        jSeparator14 = new javax.swing.JSeparator();
        chkAptoBajoSI = new javax.swing.JCheckBox();
        chkAptoBajoNO = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        txtNordenImp = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        chk1_PSG_SIA = new javax.swing.JCheckBox();
        chk1_PSG_NOA = new javax.swing.JCheckBox();
        chk1_PSG_SIB = new javax.swing.JCheckBox();
        chk1_PSG_NOB = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        chk1_APTO_SI = new javax.swing.JCheckBox();
        chk1_APTO_NO = new javax.swing.JCheckBox();
        chk1_APTO_SID = new javax.swing.JCheckBox();
        chk1_APTO_NOD = new javax.swing.JCheckBox();
        chk1_APTO_SID4 = new javax.swing.JCheckBox();
        chk1_APTO_NOD4 = new javax.swing.JCheckBox();
        chk1_APTO_SID1 = new javax.swing.JCheckBox();
        chk1_APTO_NOD1 = new javax.swing.JCheckBox();
        chk1_APTO_SID2 = new javax.swing.JCheckBox();
        chk1_APTO_NOD2 = new javax.swing.JCheckBox();
        chk1_APTO_SID3 = new javax.swing.JCheckBox();
        chk1_APTO_NOD3 = new javax.swing.JCheckBox();
        chk1_APTO_SID5 = new javax.swing.JCheckBox();
        chk1_APTO_NOD5 = new javax.swing.JCheckBox();
        chk1_APTO_SIE = new javax.swing.JCheckBox();
        chk1_APTO_NOE = new javax.swing.JCheckBox();
        chk1_APTO_SID6 = new javax.swing.JCheckBox();
        chk1_APTO_NOD6 = new javax.swing.JCheckBox();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("FICHA DE DETECCIÓN DE S.A.S.");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "1.- FILIACIÓN"));

        jLabel1.setText("Nro Orden :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellidos y Nombres :");

        txtNombres.setEditable(false);

        jLabel3.setText("Fecha :");

        jLabel4.setText("DNI :");

        txtDni.setEditable(false);

        jLabel5.setText("Sexo :");

        txtSexo.setEditable(false);

        jLabel6.setText("Fecha Nacimiento :");

        FechaNacimiento.setDateFormatString("dd-MM-yyyy");
        FechaNacimiento.setEnabled(false);

        jLabel7.setText("Área de trabajo :");

        txtAreaTrabajo.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tipo Licencia :");

        txtLicencia.setBackground(new java.awt.Color(153, 204, 255));

        jLabel9.setText("Empresa Contratista :");

        txtContratista.setEditable(false);

        jLabel10.setText("Empresa  :");

        txtEmpresa.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Trabaja de noche :");

        tbTrabajaNocheSI.setBackground(new java.awt.Color(153, 204, 255));
        btTrabajonoche.add(tbTrabajaNocheSI);
        tbTrabajaNocheSI.setText("SI");
        tbTrabajaNocheSI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTrabajaNocheSIMouseClicked(evt);
            }
        });

        tbTrabajaNocheNO.setBackground(new java.awt.Color(153, 204, 255));
        btTrabajonoche.add(tbTrabajaNocheNO);
        tbTrabajaNocheNO.setSelected(true);
        tbTrabajaNocheNO.setText("NO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("# dias trabajo :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("# dias descanso :");

        txtDiasTrabajo.setBackground(new java.awt.Color(153, 204, 255));
        txtDiasTrabajo.setText("-");
        txtDiasTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasTrabajoKeyTyped(evt);
            }
        });

        txtDescanso.setBackground(new java.awt.Color(153, 204, 255));
        txtDescanso.setText("-");
        txtDescanso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescansoKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Años que trabaja en dicho horario de trabajo :");

        txtanostrabajo.setBackground(new java.awt.Color(153, 204, 255));
        txtanostrabajo.setText("-");
        txtanostrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanostrabajoKeyTyped(evt);
            }
        });

        jLabel15.setText("años");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaSAS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContratista)
                                    .addComponent(txtEmpresa)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtanostrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel15))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tbTrabajaNocheSI)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tbTrabajaNocheNO)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDiasTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContratista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(tbTrabajaNocheSI)
                        .addComponent(tbTrabajaNocheNO)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDiasTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtanostrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("2.- ANTECEDENTES PERSONALES"));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Ápnea del sueño :");

        rbApneaSI.setBackground(new java.awt.Color(153, 204, 255));
        btApnea.add(rbApneaSI);
        rbApneaSI.setText("SI");
        rbApneaSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApneaSIActionPerformed(evt);
            }
        });

        rbApneaNO.setBackground(new java.awt.Color(153, 204, 255));
        btApnea.add(rbApneaNO);
        rbApneaNO.setSelected(true);
        rbApneaNO.setText("NO");
        rbApneaNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApneaNOActionPerformed(evt);
            }
        });

        jLabel17.setText("Ultimo Control :");

        txtUltimoControl.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("HTA :");

        rbHTASI.setBackground(new java.awt.Color(153, 204, 255));
        btHTAFiliacion.add(rbHTASI);
        rbHTASI.setText("SI");
        rbHTASI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHTASIActionPerformed(evt);
            }
        });

        rbHTANO.setBackground(new java.awt.Color(153, 204, 255));
        btHTAFiliacion.add(rbHTANO);
        rbHTANO.setSelected(true);
        rbHTANO.setText("NO");
        rbHTANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHTANOActionPerformed(evt);
            }
        });

        jLabel19.setText("Medicación : (riesgo > 2)");

        txtRiesgo.setEditable(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Polisomnografía (PSG) realizada alguna");

        rbPSGSI.setBackground(new java.awt.Color(153, 204, 255));
        btPSG.add(rbPSGSI);
        rbPSGSI.setText("SI");
        rbPSGSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPSGSIActionPerformed(evt);
            }
        });

        rbPSGNO.setBackground(new java.awt.Color(153, 204, 255));
        btPSG.add(rbPSGNO);
        rbPSGNO.setSelected(true);
        rbPSGNO.setText("NO");
        rbPSGNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPSGNOActionPerformed(evt);
            }
        });

        jLabel21.setText("Fecha de última PSG :");

        jLabel22.setText("<html>Antecedente de<br> choque de vehículo");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("En mina:");

        rbEnMinaSI.setBackground(new java.awt.Color(153, 204, 255));
        btEnmina.add(rbEnMinaSI);
        rbEnMinaSI.setText("SI");
        rbEnMinaSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnMinaSIActionPerformed(evt);
            }
        });

        rbEnMinaNO.setBackground(new java.awt.Color(153, 204, 255));
        btEnmina.add(rbEnMinaNO);
        rbEnMinaNO.setSelected(true);
        rbEnMinaNO.setText("NO");
        rbEnMinaNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnMinaNOActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Fuera de mina");

        rbFueraMinaSI.setBackground(new java.awt.Color(153, 204, 255));
        btFuerademina.add(rbFueraMinaSI);
        rbFueraMinaSI.setText("SI");
        rbFueraMinaSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFueraMinaSIActionPerformed(evt);
            }
        });

        rbFueraMinaNO.setBackground(new java.awt.Color(153, 204, 255));
        btFuerademina.add(rbFueraMinaNO);
        rbFueraMinaNO.setSelected(true);
        rbFueraMinaNO.setText("NO");
        rbFueraMinaNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFueraMinaNOActionPerformed(evt);
            }
        });

        jLabel26.setText("En el Caso de ser NO , Pasar a sección 4");

        btnNext0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next.png"))); // NOI18N
        btnNext0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNext0MouseClicked(evt);
            }
        });
        btnNext0.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnNext0AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        FechaPSG.setEnabled(false);

        lblPSG.setText("NO APLICA");

        lblApnea.setText("NO APLICA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbApneaSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbApneaNO)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUltimoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblApnea, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbHTASI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbHTANO)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRiesgo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbPSGSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbPSGNO)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaPSG, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPSG, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 79, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbEnMinaSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbEnMinaNO)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFueraMinaSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFueraMinaNO)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel17)
                        .addComponent(txtUltimoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblApnea))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(rbApneaSI)
                        .addComponent(rbApneaNO)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbHTASI)
                        .addComponent(rbHTANO)
                        .addComponent(jLabel19)
                        .addComponent(txtRiesgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(rbPSGSI)
                    .addComponent(rbPSGNO)
                    .addComponent(jLabel21)
                    .addComponent(FechaPSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPSG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(rbEnMinaSI, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(rbEnMinaNO, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel24)
                                .addComponent(rbFueraMinaSI)
                                .addComponent(rbFueraMinaNO)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addContainerGap())
                    .addComponent(btnNext0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLimpiar1)
                                .addGap(30, 30, 30)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jtSAS.addTab("Filiación ", jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Antecedentes del (los) choques (incidentes o accidente)"));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Criterio 1:");

        jLabel27.setText("Se \"cabeceó\" y por ello ocurrió un accidente (incidente) con un vehiculo (alguna vez)");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("SI");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("NO");

        buttonGroup1.add(chk1_sasSI);
        chk1_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup1.add(chk1_sasNO);
        chk1_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Criterio 2");

        jLabel31.setText("2 o más es positivo");

        jLabel32.setText("Accidente ocurrido entre las 0 horas y las 7 de la mañana entre las 13 y 15 horas (tarde)");

        jLabel33.setText("No hubo evidencia de maniobra evasiva del chofer para evitar colisión");

        jLabel34.setText("Colisión frontal de vehículo");

        jLabel35.setText("vehículo que invadió el otro carril o de desvió sin causa aparente");

        jLabel36.setText("La unidad cayó a un barranco , río o chocó contra un porte, puente, edificio u otra estructura estática sin causa aparente");

        jLabel37.setText("Chofer viajaba solo en el vehículo");

        jLabel38.setText("Chofer no tenia copiloto y cumplia o acababa de terminar una jornada larga de trabajo (más de 8 horas)");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Clasificación del (los) \"choques\" o accidentes vehiculares del postulante (marque solo una categoría)");

        jLabel40.setText("Accidente no debido a somnolencia (información suficiente que descarta somnolencia)");

        jLabel41.setText("Accidente confirmado por Somnolencia (Criterio 1 positivo)");

        jLabel42.setText("Accidente con alta sospecha de somnolencia (Criterio 2 positivo)");

        jLabel43.setText("Accidente con escasa evidencia / sospecha por somnolencia (solo 1 item de Criterio 2)");

        jLabel44.setText("No se dispone de datos suficientes para clasificar el (los) insidentes");

        buttonGroup2.add(chk2_sasSI);
        chk2_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup2.add(chk2_sasNO);
        chk2_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup3.add(chk3_sasSI);
        chk3_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup3.add(chk3_sasNO);
        chk3_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup4.add(chk4_sasSI);
        chk4_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup4.add(chk4_sasNO);
        chk4_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup5.add(chk5_sasSI);
        chk5_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup5.add(chk5_sasNO);
        chk5_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup6.add(chk6_sasSI);
        chk6_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup6.add(chk6_sasNO);
        chk6_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup7.add(chk7_sasSI);
        chk7_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup7.add(chk7_sasNO);
        chk7_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup8.add(chk8_sasSI);
        chk8_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup8.add(chk8_sasNO);
        chk8_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup9.add(chk9_sasSI);
        chk9_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup9.add(chk9_sasNO);
        chk9_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup10.add(chk10_sasSI);
        chk10_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup10.add(chk10_sasNO);
        chk10_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup11.add(chk11_sasSI);
        chk11_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup11.add(chk11_sasNO);
        chk11_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup12.add(chk12_sasSI);
        chk12_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup12.add(chk12_sasNO);
        chk12_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup13.add(chk13_sasSI);
        chk13_sasSI.setPreferredSize(new java.awt.Dimension(18, 17));

        buttonGroup13.add(chk13_sasNO);
        chk13_sasNO.setPreferredSize(new java.awt.Dimension(18, 17));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk11_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk13_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk4_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk12_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk3_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk2_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk1_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk5_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(chk8_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk9_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk6_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk7_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk10_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk12_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk3_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk11_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk2_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk13_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk5_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk1_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk4_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(chk8_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk9_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk6_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk7_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk10_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk1_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(chk1_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel32)
                    .addComponent(chk2_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk2_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel33)
                    .addComponent(chk3_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk3_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel34)
                    .addComponent(chk4_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk4_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel35)
                    .addComponent(chk5_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk5_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk6_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk6_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk7_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk7_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk8_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk8_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel41)
                    .addComponent(chk9_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk9_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk10_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk10_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk11_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk11_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk12_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk12_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk13_sasSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk13_sasNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next.png"))); // NOI18N
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        btnNext.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnNextAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(96, 96, 96))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        jtSAS.addTab("En caso de choque", jPanel4);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("3. ANTEC. FAMILIAR DE ÁPNEA DEL SUEÑO :");

        btAntecedentefam.add(chkAntSI);
        chkAntSI.setText("SI");
        chkAntSI.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkAntSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAntSIActionPerformed(evt);
            }
        });

        btAntecedentefam.add(chkAntNO);
        chkAntNO.setSelected(true);
        chkAntNO.setText("NO");
        chkAntNO.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkAntNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAntNOActionPerformed(evt);
            }
        });

        jLabel46.setText("Indique :");

        txtAntecedenteFamiliar.setEditable(false);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("4. ENTREVISTA AL PACIENTE :");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("SI");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("NO");

        jLabel50.setText("En los últimos años, su pareja o esposa le ha comentado que ronca al dormir");

        bte1.add(chk1_eSI);
        chk1_eSI.setPreferredSize(new java.awt.Dimension(18, 17));

        jLabel51.setText("En los últimos 5 años, su pareja o esposa le ah comentado que hace ruidos al respirar mientras duerme");

        jLabel52.setText("En los últimos 5 años, su pareja o esposa le ah comentado que deja de respirar cuando duerme (pausa respiratoria)");

        jLabel53.setText("Comparado con sus compañeros, usted siente que tiene más sueño o cansancio que ellos mientras trabaja");

        jLabel54.setText("Ha tenido algún accidente o incidente vehicular por que se cabeceó");

        jLabel55.setText("Ha tenido algún accidente o incidente vehicular considerado \"por falla humana\"");

        jLabel56.setText("Está recibiendo tratamiento para Ápnea de sueño con CPAP");

        jLabel57.setText("Se le ha realizado una PSG durante el sueño para descartarle un trastorno del sueño");

        bte1.add(chk1_eNO);
        chk1_eNO.setSelected(true);
        chk1_eNO.setPreferredSize(new java.awt.Dimension(18, 17));

        bte2.add(chk2_eSI);
        chk2_eSI.setPreferredSize(new java.awt.Dimension(18, 17));

        bte2.add(chk2_eNO);
        chk2_eNO.setSelected(true);
        chk2_eNO.setPreferredSize(new java.awt.Dimension(18, 17));

        bte3.add(chk3_eSI);
        chk3_eSI.setPreferredSize(new java.awt.Dimension(18, 17));

        bte3.add(chk3_eNO);
        chk3_eNO.setSelected(true);
        chk3_eNO.setPreferredSize(new java.awt.Dimension(18, 17));

        bte4.add(chk4_eSI);
        chk4_eSI.setPreferredSize(new java.awt.Dimension(18, 17));

        bte4.add(chk4_eNO);
        chk4_eNO.setSelected(true);
        chk4_eNO.setPreferredSize(new java.awt.Dimension(18, 17));

        bte5.add(chk5_eNO);
        chk5_eNO.setSelected(true);
        chk5_eNO.setPreferredSize(new java.awt.Dimension(18, 17));

        bte5.add(chk5_eSI);
        chk5_eSI.setPreferredSize(new java.awt.Dimension(18, 17));

        bte6.add(chk6_eSI);
        chk6_eSI.setPreferredSize(new java.awt.Dimension(18, 17));

        bte6.add(chk6_eNO);
        chk6_eNO.setSelected(true);
        chk6_eNO.setPreferredSize(new java.awt.Dimension(18, 17));

        bte7.add(chk7_eNO);
        chk7_eNO.setSelected(true);
        chk7_eNO.setPreferredSize(new java.awt.Dimension(18, 17));

        bte7.add(chk7_eSI);
        chk7_eSI.setPreferredSize(new java.awt.Dimension(18, 17));

        bte8.add(chk8_eNO);
        chk8_eNO.setSelected(true);
        chk8_eNO.setPreferredSize(new java.awt.Dimension(18, 17));

        bte8.add(chk8_eSI);
        chk8_eSI.setPreferredSize(new java.awt.Dimension(18, 17));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setText("<HTML>PUNTUACIÓN DE LA ESCALA DE EPWORTH (ESS)<BR>(NUNCA = 0, POCA=1,MODERADA=2,ALTA=3)");

        txtPuntuacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuntuacionKeyTyped(evt);
            }
        });

        jLabel59.setText("Total puntos (sumatoria)");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setToolTipText("");

        btnNext2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next.png"))); // NOI18N
        btnNext2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNext2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator6)
            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chk2_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk2_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chk1_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk1_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel49)))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chk3_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk3_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chk4_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk4_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chk5_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk5_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chk6_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk6_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chk7_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk7_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chk8_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk8_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(jLabel59)
                                .addGap(18, 18, 18)
                                .addComponent(txtPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 58, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(chkAntSI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkAntNO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAntecedenteFamiliar)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNext2)
                        .addGap(107, 107, 107))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(chkAntSI)
                    .addComponent(chkAntNO)
                    .addComponent(jLabel46)
                    .addComponent(txtAntecedenteFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel50)
                    .addComponent(chk1_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk1_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel51)
                    .addComponent(chk2_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk2_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel52)
                    .addComponent(chk3_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk3_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk4_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk4_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk5_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk5_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk6_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk6_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk7_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk7_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk8_eSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk8_eNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel59)
                        .addComponent(txtPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext2)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jtSAS.addTab("Entrevista", jPanel6);

        jLabel60.setText("Peso (Kg) :");

        txtPeso.setEditable(false);

        txtTalla.setEditable(false);

        jLabel61.setText("Talla (mts):");

        jLabel62.setText("IMC (Kg/m2) :");

        txtIMC.setEditable(false);

        jLabel63.setText("(> 35 es de alto riesgo)");

        jLabel64.setText("Circunferencia de cuello :");

        txtCircunferencia.setEditable(false);

        jLabel65.setText("Varón (menor de 43.2 cm, es normal)");

        jLabel66.setText("Normal :");

        btHombres.add(chkvaronSI);
        chkvaronSI.setText("SI");
        chkvaronSI.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkvaronSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkvaronSIActionPerformed(evt);
            }
        });

        btHombres.add(chkvaronNO);
        chkvaronNO.setText("NO");
        chkvaronNO.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel67.setText("Mujer (menor de 40.6 cm, es normal)");

        jLabel68.setText("Normal :");

        btMujer.add(chkmujerSI);
        chkmujerSI.setText("SI");
        chkmujerSI.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkmujerSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkmujerSIActionPerformed(evt);
            }
        });

        btMujer.add(chkmujerNO);
        chkmujerNO.setText("NO");
        chkmujerNO.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel69.setText("P. Sistólica :");

        txtSistolica.setEditable(false);

        jLabel70.setText("mm Hg");

        jLabel71.setText("mm Hg");

        jLabel72.setText("P. Diastólica :");

        txtDiastolica.setEditable(false);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel73.setText("HTA nueva :");

        chkHTAnuevaSI.setBackground(new java.awt.Color(153, 204, 255));
        btHTA.add(chkHTAnuevaSI);
        chkHTAnuevaSI.setText("SI");
        chkHTAnuevaSI.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkHTAnuevaNO.setBackground(new java.awt.Color(153, 204, 255));
        btHTA.add(chkHTAnuevaNO);
        chkHTAnuevaNO.setSelected(true);
        chkHTAnuevaNO.setText("NO");
        chkHTAnuevaNO.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mallampati.PNG"))); // NOI18N

        chkGradoI.setBackground(new java.awt.Color(153, 204, 255));
        btmallampati.add(chkGradoI);
        chkGradoI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkGradoI.setText("Grado I");
        chkGradoI.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkGradoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGradoIActionPerformed(evt);
            }
        });

        chkGradoII.setBackground(new java.awt.Color(153, 204, 255));
        btmallampati.add(chkGradoII);
        chkGradoII.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkGradoII.setText("Grado II");
        chkGradoII.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkGradoIII.setBackground(new java.awt.Color(153, 204, 255));
        btmallampati.add(chkGradoIII);
        chkGradoIII.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkGradoIII.setText("Grado III");
        chkGradoIII.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkGradoIIII.setBackground(new java.awt.Color(153, 204, 255));
        btmallampati.add(chkGradoIIII);
        chkGradoIIII.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkGradoIIII.setText("Grado IIII");
        chkGradoIIII.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnNext3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next.png"))); // NOI18N
        btnNext3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNext3MouseClicked(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel75.setText("Evaluación de vía aérea superior MALLAMPATI (Seleccione)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator9)
            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel61)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel62))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel66)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkvaronSI)
                                                .addGap(18, 18, 18)
                                                .addComponent(chkvaronNO))
                                            .addComponent(jLabel65))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel63))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel68)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkmujerSI)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkmujerNO))
                                    .addComponent(jLabel67)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel70)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel71)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel73)
                                .addGap(18, 18, 18)
                                .addComponent(chkHTAnuevaSI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkHTAnuevaNO)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(chkGradoI)
                                .addGap(61, 61, 61)
                                .addComponent(chkGradoII)
                                .addGap(56, 56, 56)
                                .addComponent(chkGradoIII)
                                .addGap(46, 46, 46)
                                .addComponent(chkGradoIIII))
                            .addComponent(jLabel74))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(btnNext3)
                        .addGap(33, 33, 33))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel75)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(txtCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(chkvaronSI)
                            .addComponent(chkvaronNO)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(chkmujerSI)
                            .addComponent(chkmujerNO))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel72)
                    .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel73)
                    .addComponent(chkHTAnuevaSI)
                    .addComponent(chkHTAnuevaNO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btnNext3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel75)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkGradoI)
                            .addComponent(chkGradoII)
                            .addComponent(chkGradoIII)
                            .addComponent(chkGradoIIII))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jtSAS.addTab("Exámen Físico", jPanel7);

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel76.setText("6. CONCLUSIÓN DE LA EVALUACIÓN");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel77.setText("Requiere PSG antes de certificar aptitud para conducir. (un criterio positivo)");

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel78.setText("Criterio A:");

        jLabel79.setText("<html>Excesiva somnolencia determinada por ESS mayor de 15 cabeceo<br>presenciado durante la evaluación (espera,antecedente de accidente por somnolencia o <br> con alta sospecha por somnolencia)");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel80.setText("Criterio B:");

        jLabel81.setText("<html>Antecedentes de SAS sin control reciente o sin cumplimiento de tratamiento<br> (con CPAP o cirugía)");

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel89.setText("Apto con bajo riesgo de Ápnea del sueño (ningún criterio positivo)");

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel90.setText("Nombre y Apellidos del Médico - N° de colegiatura :");

        txtMedico.setEditable(false);

        jLabel91.setText("Observaciones :");

        txtCMP.setEditable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObservaciones))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel90)
                                .addGap(0, 123, Short.MAX_VALUE))
                            .addComponent(txtMedico))
                        .addGap(18, 18, 18)
                        .addComponent(txtCMP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator13)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

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

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel92.setText("SI");

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setText("NO");

        btPSGC.add(chk1_PSG_SI);
        chk1_PSG_SI.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_PSG_SI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_PSG_SIActionPerformed(evt);
            }
        });

        btPSGC.add(chk1_PSG_NO);
        chk1_PSG_NO.setSelected(true);
        chk1_PSG_NO.setPreferredSize(new java.awt.Dimension(18, 17));

        btAptoRiesgoC.add(chkAptoBajoSI);
        chkAptoBajoSI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkAptoBajoSI.setSelected(true);
        chkAptoBajoSI.setText("SI");
        chkAptoBajoSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAptoBajoSIActionPerformed(evt);
            }
        });

        btAptoRiesgoC.add(chkAptoBajoNO);
        chkAptoBajoNO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkAptoBajoNO.setText("NO");
        chkAptoBajoNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAptoBajoNOActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imprimir SAS"));

        txtNordenImp.setBackground(new java.awt.Color(255, 153, 0));
        txtNordenImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenImpKeyTyped(evt);
            }
        });

        jLabel96.setText("N° Orden :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNordenImp, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(txtNordenImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgPsgA.add(chk1_PSG_SIA);
        chk1_PSG_SIA.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_PSG_SIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_PSG_SIAActionPerformed(evt);
            }
        });

        bgPsgA.add(chk1_PSG_NOA);
        chk1_PSG_NOA.setSelected(true);
        chk1_PSG_NOA.setPreferredSize(new java.awt.Dimension(18, 17));

        bgPsgB.add(chk1_PSG_SIB);
        chk1_PSG_SIB.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_PSG_SIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_PSG_SIBActionPerformed(evt);
            }
        });

        bgPsgB.add(chk1_PSG_NOB);
        chk1_PSG_NOB.setSelected(true);
        chk1_PSG_NOB.setPreferredSize(new java.awt.Dimension(18, 17));

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel82.setText("Apto por 3 meses a renovar luego de PSG (un criterio positivo)");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel83.setText("Criterio C:");

        jLabel84.setText("<html>Historia de higiene de sueño sugiere SAS (presencia de ronquidos,<br>somnolencia excesiva durante la actividad, pausas respiratorias)");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel85.setText("Criterio D: ");

        jLabel86.setText("<html>Cumple con 2 o más de los siguientes:");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel87.setText("Criterio E: ");

        jLabel88.setText("Evaluación de vía aérea superior patológico*");

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel94.setText("SI");

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel95.setText("NO");

        btAptoC.add(chk1_APTO_SI);
        chk1_APTO_SI.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_APTO_SI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_APTO_SIActionPerformed(evt);
            }
        });

        btAptoC.add(chk1_APTO_NO);
        chk1_APTO_NO.setSelected(true);
        chk1_APTO_NO.setPreferredSize(new java.awt.Dimension(18, 17));

        bgPsgD.add(chk1_APTO_SID);
        chk1_APTO_SID.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_APTO_SID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_APTO_SIDActionPerformed(evt);
            }
        });

        bgPsgD.add(chk1_APTO_NOD);
        chk1_APTO_NOD.setSelected(true);
        chk1_APTO_NOD.setPreferredSize(new java.awt.Dimension(18, 17));

        bgPsgD4.add(chk1_APTO_SID4);
        chk1_APTO_SID4.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_APTO_SID4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_APTO_SID4ActionPerformed(evt);
            }
        });

        bgPsgD4.add(chk1_APTO_NOD4);
        chk1_APTO_NOD4.setSelected(true);
        chk1_APTO_NOD4.setPreferredSize(new java.awt.Dimension(18, 17));

        bgPsgD1.add(chk1_APTO_SID1);
        chk1_APTO_SID1.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_APTO_SID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_APTO_SID1ActionPerformed(evt);
            }
        });

        bgPsgD1.add(chk1_APTO_NOD1);
        chk1_APTO_NOD1.setSelected(true);
        chk1_APTO_NOD1.setPreferredSize(new java.awt.Dimension(18, 17));

        bgPsgD2.add(chk1_APTO_SID2);
        chk1_APTO_SID2.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_APTO_SID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_APTO_SID2ActionPerformed(evt);
            }
        });

        bgPsgD2.add(chk1_APTO_NOD2);
        chk1_APTO_NOD2.setSelected(true);
        chk1_APTO_NOD2.setPreferredSize(new java.awt.Dimension(18, 17));

        bgPsgD3.add(chk1_APTO_SID3);
        chk1_APTO_SID3.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_APTO_SID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_APTO_SID3ActionPerformed(evt);
            }
        });

        bgPsgD3.add(chk1_APTO_NOD3);
        chk1_APTO_NOD3.setSelected(true);
        chk1_APTO_NOD3.setPreferredSize(new java.awt.Dimension(18, 17));

        bgPsgD5.add(chk1_APTO_SID5);
        chk1_APTO_SID5.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_APTO_SID5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_APTO_SID5ActionPerformed(evt);
            }
        });

        bgPsgD5.add(chk1_APTO_NOD5);
        chk1_APTO_NOD5.setSelected(true);
        chk1_APTO_NOD5.setPreferredSize(new java.awt.Dimension(18, 17));

        bgPsgE.add(chk1_APTO_SIE);
        chk1_APTO_SIE.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_APTO_SIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_APTO_SIEActionPerformed(evt);
            }
        });

        bgPsgE.add(chk1_APTO_NOE);
        chk1_APTO_NOE.setSelected(true);
        chk1_APTO_NOE.setPreferredSize(new java.awt.Dimension(18, 17));

        bgPsgD6.add(chk1_APTO_SID6);
        chk1_APTO_SID6.setPreferredSize(new java.awt.Dimension(18, 17));
        chk1_APTO_SID6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1_APTO_SID6ActionPerformed(evt);
            }
        });

        bgPsgD6.add(chk1_APTO_NOD6);
        chk1_APTO_NOD6.setSelected(true);
        chk1_APTO_NOD6.setPreferredSize(new java.awt.Dimension(18, 17));

        jLabel97.setText("IMC mayor o igual a 30");

        jLabel98.setText("Hipertención Arterial (nueva, no controlada con una sola medicación)");

        jLabel99.setText("Circunferencia del cuello anormal");

        jLabel100.setText("Puntuación de Epworth mayor de 10 y menor de 16");

        jLabel101.setText("Antecedente de transtorno del sueño (diagnosticado) sin seguimiento");

        jLabel102.setText("Índice de ápnea-hipopnea (AHI) mayor de 5 y menor de 30");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel83)
                                    .addComponent(jLabel85))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel88))))
                    .addComponent(jLabel82))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(chk1_APTO_SI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk1_APTO_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel95))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(chk1_APTO_SID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk1_APTO_NOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(chk1_APTO_SID4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chk1_APTO_NOD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(chk1_APTO_SID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk1_APTO_NOD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(chk1_APTO_SID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk1_APTO_NOD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(chk1_APTO_SID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk1_APTO_NOD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(chk1_APTO_SID5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk1_APTO_NOD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(chk1_APTO_SID6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk1_APTO_NOD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(chk1_APTO_SIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk1_APTO_NOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel82)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel83)
                                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel94)
                                            .addComponent(jLabel95))
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(chk1_APTO_SI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chk1_APTO_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(chk1_APTO_SID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chk1_APTO_NOD, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel85)
                                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(chk1_APTO_SID1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chk1_APTO_NOD1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(chk1_APTO_SID2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chk1_APTO_NOD2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(chk1_APTO_SID3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chk1_APTO_NOD3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(chk1_APTO_SID4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk1_APTO_NOD4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(chk1_APTO_SID5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk1_APTO_NOD5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(chk1_APTO_SID6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk1_APTO_NOD6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk1_APTO_SIE, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk1_APTO_NOE, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel87)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkAptoBajoSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkAptoBajoNO)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar))
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel80)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(chk1_PSG_SIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk1_PSG_NOA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(chk1_PSG_SIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk1_PSG_NOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel76))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel77)))
                        .addGap(220, 220, 220)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel93))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(chk1_PSG_SI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk1_PSG_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(72, 72, 72))
            .addComponent(jSeparator14)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92)
                            .addComponent(jLabel93))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chk1_PSG_SI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk1_PSG_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chk1_PSG_SIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk1_PSG_NOA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel80)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(chk1_PSG_SIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk1_PSG_NOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(chkAptoBajoSI)
                    .addComponent(chkAptoBajoNO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnLimpiar))
                        .addGap(58, 58, 58))))
        );

        jtSAS.addTab("Conclusión de evaluación", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtSAS, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtSAS, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbEnMinaNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnMinaNOActionPerformed
       choque(false);
       accidente(true);
    }//GEN-LAST:event_rbEnMinaNOActionPerformed

    private void rbFueraMinaNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFueraMinaNOActionPerformed
        choque(false);
        accidente(true);
    }//GEN-LAST:event_rbFueraMinaNOActionPerformed

    private void btnNextAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnNextAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextAncestorAdded

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
       jtSAS.setSelectedIndex(2);
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnNext2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNext2MouseClicked
        jtSAS.setSelectedIndex(3);
    }//GEN-LAST:event_btnNext2MouseClicked

    private void btnNext0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNext0MouseClicked
       jtSAS.setSelectedIndex(1);
    }//GEN-LAST:event_btnNext0MouseClicked

    private void btnNext0AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnNext0AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNext0AncestorAdded

    private void chkvaronSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkvaronSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkvaronSIActionPerformed

    private void chkmujerSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkmujerSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkmujerSIActionPerformed

    private void chkGradoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGradoIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGradoIActionPerformed

    private void btnNext3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNext3MouseClicked
       jtSAS.setSelectedIndex(4);
    }//GEN-LAST:event_btnNext3MouseClicked

    private void chkAptoBajoSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAptoBajoSIActionPerformed
        if(chkAptoBajoSI.isSelected()== true){
        chk1_PSG_NO.setSelected(true);
        chk1_APTO_NO.setSelected(true);
        
        }
    }//GEN-LAST:event_chkAptoBajoSIActionPerformed

    private void chkAptoBajoNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAptoBajoNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAptoBajoNOActionPerformed

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        if(!txtNorden.getText().isEmpty()){
          if(!OrdenExiste()){  
        String Sql="SELECT d.cod_pa,d.nombres_pa,d.apellidos_pa, d.sexo_pa ,d.fecha_nacimiento_pa,n.razon_empresa,n.razon_contrata,n.area_o,	t.peso,t.imc,t.talla,t.perimetro_cuello,t.sistolica,t.diastolica "
                + "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) INNER JOIN triaje AS t ON (n.n_orden = t.n_orden) "
                + "WHERE n.n_orden ='"+txtNorden.getText().toString()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("apellidos_pa").concat(" ").concat(oConn.setResult.getString("nombres_pa")));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        String sexo = oConn.setResult.getString("sexo_pa");
                        txtSexo.setText(sexo);    
                         txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                         txtContratista.setText(oConn.setResult.getString("razon_contrata"));
                         txtAreaTrabajo.setText(oConn.setResult.getString("area_o"));
                         txtPeso.setText(oConn.setResult.getString("peso"));
                         txtTalla.setText(oConn.setResult.getString("talla"));
                         txtIMC.setText(oConn.setResult.getString("imc"));
                         txtCircunferencia.setText(oConn.setResult.getString("perimetro_cuello"));
                         txtSistolica.setText(oConn.setResult.getString("sistolica"));
                         txtDiastolica.setText(oConn.setResult.getString("diastolica"));
                         txtDni.setText(oConn.setResult.getString("cod_pa"));
                         Fecha();
                         if(!txtCircunferencia.getText().isEmpty()){
                         Double a = Double.valueOf(txtCircunferencia.getText().toString());
                          if(txtSexo.getText().equals("M")){                             
                              if( a < 43.2){chkvaronSI.setSelected(true);}else if( a >= 43.2){
                                  {}chkvaronNO.setSelected(true);
                              }
                          }else{
                              if( a < 40.6){chkmujerSI.setSelected(true);}else if( a >= 40.6){
                                  {}chkmujerNO.setSelected(true);
                              }
                          }
                         }else {
                         oFunc.SubSistemaMensajeError("No se Ingreso Circunferencia de cuello en ÁREA DE TRIAJE");
                         }
                         if(!txtIMC.getText().isEmpty()){
                             float imc = Float.parseFloat(txtIMC.getText());
                             if(imc>=30){
                                 chk1_APTO_SID1.setSelected(true);
                             }
                         }
                          if(!txtCircunferencia.getText().isEmpty()){
                            float cuello = Float.parseFloat(txtCircunferencia.getText().toString());
                            if ("M".equals(sexo)) {
                                if (cuello > 43.2) {
                                    chk1_APTO_SID3.setSelected(true);
                                } 
                            }
                            if ("F".equals(sexo)) {
                                if (cuello > 40.6) {
                                    chk1_APTO_SID3.setSelected(true);
                                } 
                            }
                          }
                         choque(false);
                         psg(true);
                         txtNorden.setEditable(false);
                        
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Falta Pasar por Triaje o \n    Aperture EX-Preocupacional de nuevo");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Tríaje:" + ex.getMessage().toString());
        }  
        }
        }    
    }//GEN-LAST:event_txtNordenActionPerformed
    public boolean OrdenExiste()
    {
        
        boolean bResultado=false;
        if(!txtNorden.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from ficha_sas Where n_orden ="+txtNorden.getText().toString();
        
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
             txtNorden.setText(null);
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        
    
        }
    void limpiar(){
    choque(false);    
    txtNorden.setEditable(true);
    txtNorden.requestFocus(); 
    txtNorden.setText(null);
    FechaSAS.setDate(null);
    txtNombres.setText(null);
    FechaNacimiento.setDate(null);
    FechaPSG.setDate(null);
    txtDni.setText(null);
    txtSexo.setText(null);
    txtLicencia.setText(null);
    txtContratista.setText(null);
    txtEmpresa.setText(null);
    txtDescanso.setText(null);
    txtDiasTrabajo.setText(null);
    txtanostrabajo.setText(null);
    //btTrabajonoche.clearSelection();
    txtAreaTrabajo.setText(null);
    txtUltimoControl.setText(null);
    //btApnea.clearSelection();
    //btHTAFiliacion.clearSelection();
    //btPSG.clearSelection();
    //btEnmina.clearSelection();
    //btFuerademina.clearSelection();
    txtRiesgo.setText(null);
    txtUltimoControl.setEditable(false);
    txtRiesgo.setEditable(false);
    FechaPSG.setEnabled(false);
    buttonGroup1.clearSelection();
    buttonGroup2.clearSelection();
    buttonGroup3.clearSelection();
    buttonGroup4.clearSelection();
    buttonGroup5.clearSelection();
    buttonGroup6.clearSelection();
    buttonGroup7.clearSelection();
    buttonGroup8.clearSelection();
    buttonGroup9.clearSelection();
    buttonGroup10.clearSelection();
    buttonGroup11.clearSelection();
    buttonGroup12.clearSelection();
    buttonGroup13.clearSelection();
    //btAntecedentefam.clearSelection();
    txtAntecedenteFamiliar.setText(null);
    txtAntecedenteFamiliar.setEditable(false);
    //bte1.clearSelection();        
    //bte2.clearSelection();        
    //bte3.clearSelection();        
    //bte4.clearSelection();        
    //bte5.clearSelection();        
    //bte6.clearSelection();        
    //bte7.clearSelection();        
    //bte8.clearSelection();
    txtPuntuacion.setText(null);
    txtPeso.setText(null);
    txtTalla.setText(null);
    txtIMC.setText(null);
    txtCircunferencia.setText(null);
    btHombres.clearSelection();
    btMujer.clearSelection();
    txtSistolica.setText(null);
    txtDiastolica.setText(null);
    //btHTA.clearSelection();
    btmallampati.clearSelection();
    //btPSGC.clearSelection();
    //btAptoC.clearSelection();
    //btAptoRiesgoC.clearSelection();
    txtMedico.setText(null);
    txtObservaciones.setText(null);
    jtSAS.setSelectedIndex(0);
    
    }
    void choque(boolean parametro){
    chk1_sasSI.setEnabled(parametro);
    chk2_sasSI.setEnabled(parametro);
    chk3_sasSI.setEnabled(parametro);
    chk4_sasSI.setEnabled(parametro);
    chk5_sasSI.setEnabled(parametro);
    chk6_sasSI.setEnabled(parametro);
    chk7_sasSI.setEnabled(parametro);
    chk8_sasSI.setEnabled(parametro);
    chk9_sasSI.setEnabled(parametro);
    chk10_sasSI.setEnabled(parametro);
    chk11_sasSI.setEnabled(parametro);
    chk12_sasSI.setEnabled(parametro);
    chk13_sasSI.setEnabled(parametro);
    chk1_sasNO.setEnabled(parametro);
    chk2_sasNO.setEnabled(parametro);
    chk3_sasNO.setEnabled(parametro);
    chk4_sasNO.setEnabled(parametro);
    chk5_sasNO.setEnabled(parametro);
    chk6_sasNO.setEnabled(parametro);
    chk7_sasNO.setEnabled(parametro);
    chk8_sasNO.setEnabled(parametro);
    chk9_sasNO.setEnabled(parametro);
    chk10_sasNO.setEnabled(parametro);
    chk11_sasNO.setEnabled(parametro);
    chk12_sasNO.setEnabled(parametro);
    chk13_sasNO.setEnabled(parametro);
    
    }
      void psg(boolean parametro){
    chk1_APTO_NO.setSelected(parametro);
    chk1_APTO_NOD.setSelected(parametro);
    chk1_APTO_NOD4.setSelected(parametro);
    chk1_APTO_NOD1.setSelected(parametro);
    chk1_APTO_NOD2.setSelected(parametro);
    chk1_APTO_NOD3.setSelected(parametro);
     chk1_APTO_NOD5.setSelected(parametro);
    chk1_APTO_NOD5.setSelected(parametro);
    chk1_APTO_NOE.setSelected(parametro);
    }
    private void txtDiasTrabajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasTrabajoKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDiasTrabajoKeyTyped

    private void txtanostrabajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanostrabajoKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtanostrabajoKeyTyped

    private void txtDescansoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescansoKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDescansoKeyTyped

    private void txtPuntuacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntuacionKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtPuntuacionKeyTyped

    private void txtNordenImpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenImpKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenImpKeyTyped

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void rbApneaNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbApneaNOActionPerformed
        txtUltimoControl.setEditable(false);
        lblApnea.setVisible(true);
    }//GEN-LAST:event_rbApneaNOActionPerformed

    private void rbApneaSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbApneaSIActionPerformed
        txtUltimoControl.setEditable(true);
         lblApnea.setVisible(false);
    }//GEN-LAST:event_rbApneaSIActionPerformed

    private void rbHTANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHTANOActionPerformed
        txtRiesgo.setEditable(false);
    }//GEN-LAST:event_rbHTANOActionPerformed

    private void rbHTASIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHTASIActionPerformed
       txtRiesgo.setEditable(true);
    }//GEN-LAST:event_rbHTASIActionPerformed

    private void rbPSGNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPSGNOActionPerformed
        FechaPSG.setEnabled(false);
        lblPSG.setVisible(true);
    }//GEN-LAST:event_rbPSGNOActionPerformed

    private void rbPSGSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPSGSIActionPerformed
        FechaPSG.setEnabled(true);
        lblPSG.setVisible(false);
    }//GEN-LAST:event_rbPSGSIActionPerformed

    private void rbEnMinaSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnMinaSIActionPerformed
       choque(true);
       accidente(false);
    }//GEN-LAST:event_rbEnMinaSIActionPerformed

    private void rbFueraMinaSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFueraMinaSIActionPerformed
        choque(true);
        accidente(false);
    }//GEN-LAST:event_rbFueraMinaSIActionPerformed

    private void chkAntSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAntSIActionPerformed
       txtAntecedenteFamiliar.setEditable(true);
    }//GEN-LAST:event_chkAntSIActionPerformed

    private void chkAntNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAntNOActionPerformed
               txtAntecedenteFamiliar.setEditable(false);
    }//GEN-LAST:event_chkAntNOActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReImp();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chk1_PSG_SIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_PSG_SIActionPerformed
      if(chk1_PSG_SI.isSelected()== true){
       chk1_APTO_NO.setSelected(true);
       chkAptoBajoNO.setSelected(true);       
       }
    }//GEN-LAST:event_chk1_PSG_SIActionPerformed

    private void chk1_PSG_SIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_PSG_SIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_PSG_SIAActionPerformed

    private void chk1_PSG_SIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_PSG_SIBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_PSG_SIBActionPerformed

    private void chk1_APTO_SIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_APTO_SIActionPerformed
        if(chk1_APTO_SI.isSelected()== true){
            chk1_PSG_NO.setSelected(true);
            chkAptoBajoNO.setSelected(true);

        }
    }//GEN-LAST:event_chk1_APTO_SIActionPerformed

    private void chk1_APTO_SIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_APTO_SIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_APTO_SIDActionPerformed

    private void chk1_APTO_SID4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_APTO_SID4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_APTO_SID4ActionPerformed

    private void chk1_APTO_SID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_APTO_SID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_APTO_SID1ActionPerformed

    private void chk1_APTO_SID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_APTO_SID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_APTO_SID2ActionPerformed

    private void chk1_APTO_SID3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_APTO_SID3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_APTO_SID3ActionPerformed

    private void chk1_APTO_SID5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_APTO_SID5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_APTO_SID5ActionPerformed

    private void chk1_APTO_SIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_APTO_SIEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_APTO_SIEActionPerformed

    private void chk1_APTO_SID6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1_APTO_SID6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1_APTO_SID6ActionPerformed

    private void tbTrabajaNocheSIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTrabajaNocheSIMouseClicked
        txtDiasTrabajo.setText(null);
        txtDescanso.setText(null);
        txtanostrabajo.setText(null);
    }//GEN-LAST:event_tbTrabajaNocheSIMouseClicked
void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaSAS.setDate(fechaDate);

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private com.toedter.calendar.JDateChooser FechaPSG;
    private com.toedter.calendar.JDateChooser FechaSAS;
    private javax.swing.ButtonGroup bgPsgA;
    private javax.swing.ButtonGroup bgPsgB;
    private javax.swing.ButtonGroup bgPsgD;
    private javax.swing.ButtonGroup bgPsgD1;
    private javax.swing.ButtonGroup bgPsgD2;
    private javax.swing.ButtonGroup bgPsgD3;
    private javax.swing.ButtonGroup bgPsgD4;
    private javax.swing.ButtonGroup bgPsgD5;
    private javax.swing.ButtonGroup bgPsgD6;
    private javax.swing.ButtonGroup bgPsgE;
    private javax.swing.ButtonGroup btAntecedentefam;
    private javax.swing.ButtonGroup btApnea;
    private javax.swing.ButtonGroup btAptoC;
    private javax.swing.ButtonGroup btAptoRiesgoC;
    private javax.swing.ButtonGroup btEnmina;
    private javax.swing.ButtonGroup btFuerademina;
    private javax.swing.ButtonGroup btHTA;
    private javax.swing.ButtonGroup btHTAFiliacion;
    private javax.swing.ButtonGroup btHombres;
    private javax.swing.ButtonGroup btMujer;
    private javax.swing.ButtonGroup btPSG;
    private javax.swing.ButtonGroup btPSGC;
    private javax.swing.ButtonGroup btTrabajonoche;
    private javax.swing.ButtonGroup bte1;
    private javax.swing.ButtonGroup bte2;
    private javax.swing.ButtonGroup bte3;
    private javax.swing.ButtonGroup bte4;
    private javax.swing.ButtonGroup bte5;
    private javax.swing.ButtonGroup bte6;
    private javax.swing.ButtonGroup bte7;
    private javax.swing.ButtonGroup bte8;
    private javax.swing.ButtonGroup btmallampati;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnNext0;
    private javax.swing.JLabel btnNext2;
    private javax.swing.JLabel btnNext3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JCheckBox chk10_sasNO;
    private javax.swing.JCheckBox chk10_sasSI;
    private javax.swing.JCheckBox chk11_sasNO;
    private javax.swing.JCheckBox chk11_sasSI;
    private javax.swing.JCheckBox chk12_sasNO;
    private javax.swing.JCheckBox chk12_sasSI;
    private javax.swing.JCheckBox chk13_sasNO;
    private javax.swing.JCheckBox chk13_sasSI;
    private javax.swing.JCheckBox chk1_APTO_NO;
    private javax.swing.JCheckBox chk1_APTO_NOD;
    private javax.swing.JCheckBox chk1_APTO_NOD1;
    private javax.swing.JCheckBox chk1_APTO_NOD2;
    private javax.swing.JCheckBox chk1_APTO_NOD3;
    private javax.swing.JCheckBox chk1_APTO_NOD4;
    private javax.swing.JCheckBox chk1_APTO_NOD5;
    private javax.swing.JCheckBox chk1_APTO_NOD6;
    private javax.swing.JCheckBox chk1_APTO_NOE;
    private javax.swing.JCheckBox chk1_APTO_SI;
    private javax.swing.JCheckBox chk1_APTO_SID;
    private javax.swing.JCheckBox chk1_APTO_SID1;
    private javax.swing.JCheckBox chk1_APTO_SID2;
    private javax.swing.JCheckBox chk1_APTO_SID3;
    private javax.swing.JCheckBox chk1_APTO_SID4;
    private javax.swing.JCheckBox chk1_APTO_SID5;
    private javax.swing.JCheckBox chk1_APTO_SID6;
    private javax.swing.JCheckBox chk1_APTO_SIE;
    private javax.swing.JCheckBox chk1_PSG_NO;
    private javax.swing.JCheckBox chk1_PSG_NOA;
    private javax.swing.JCheckBox chk1_PSG_NOB;
    private javax.swing.JCheckBox chk1_PSG_SI;
    private javax.swing.JCheckBox chk1_PSG_SIA;
    private javax.swing.JCheckBox chk1_PSG_SIB;
    private javax.swing.JCheckBox chk1_eNO;
    private javax.swing.JCheckBox chk1_eSI;
    private javax.swing.JCheckBox chk1_sasNO;
    private javax.swing.JCheckBox chk1_sasSI;
    private javax.swing.JCheckBox chk2_eNO;
    private javax.swing.JCheckBox chk2_eSI;
    private javax.swing.JCheckBox chk2_sasNO;
    private javax.swing.JCheckBox chk2_sasSI;
    private javax.swing.JCheckBox chk3_eNO;
    private javax.swing.JCheckBox chk3_eSI;
    private javax.swing.JCheckBox chk3_sasNO;
    private javax.swing.JCheckBox chk3_sasSI;
    private javax.swing.JCheckBox chk4_eNO;
    private javax.swing.JCheckBox chk4_eSI;
    private javax.swing.JCheckBox chk4_sasNO;
    private javax.swing.JCheckBox chk4_sasSI;
    private javax.swing.JCheckBox chk5_eNO;
    private javax.swing.JCheckBox chk5_eSI;
    private javax.swing.JCheckBox chk5_sasNO;
    private javax.swing.JCheckBox chk5_sasSI;
    private javax.swing.JCheckBox chk6_eNO;
    private javax.swing.JCheckBox chk6_eSI;
    private javax.swing.JCheckBox chk6_sasNO;
    private javax.swing.JCheckBox chk6_sasSI;
    private javax.swing.JCheckBox chk7_eNO;
    private javax.swing.JCheckBox chk7_eSI;
    private javax.swing.JCheckBox chk7_sasNO;
    private javax.swing.JCheckBox chk7_sasSI;
    private javax.swing.JCheckBox chk8_eNO;
    private javax.swing.JCheckBox chk8_eSI;
    private javax.swing.JCheckBox chk8_sasNO;
    private javax.swing.JCheckBox chk8_sasSI;
    private javax.swing.JCheckBox chk9_sasNO;
    private javax.swing.JCheckBox chk9_sasSI;
    private javax.swing.JCheckBox chkAntNO;
    private javax.swing.JCheckBox chkAntSI;
    private javax.swing.JCheckBox chkAptoBajoNO;
    private javax.swing.JCheckBox chkAptoBajoSI;
    private javax.swing.JCheckBox chkGradoI;
    private javax.swing.JCheckBox chkGradoII;
    private javax.swing.JCheckBox chkGradoIII;
    private javax.swing.JCheckBox chkGradoIIII;
    private javax.swing.JCheckBox chkHTAnuevaNO;
    private javax.swing.JCheckBox chkHTAnuevaSI;
    private javax.swing.JCheckBox chkmujerNO;
    private javax.swing.JCheckBox chkmujerSI;
    private javax.swing.JCheckBox chkvaronNO;
    private javax.swing.JCheckBox chkvaronSI;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jtSAS;
    private javax.swing.JLabel lblApnea;
    private javax.swing.JLabel lblPSG;
    private javax.swing.JRadioButton rbApneaNO;
    private javax.swing.JRadioButton rbApneaSI;
    private javax.swing.JRadioButton rbEnMinaNO;
    private javax.swing.JRadioButton rbEnMinaSI;
    private javax.swing.JRadioButton rbFueraMinaNO;
    private javax.swing.JRadioButton rbFueraMinaSI;
    private javax.swing.JRadioButton rbHTANO;
    private javax.swing.JRadioButton rbHTASI;
    private javax.swing.JRadioButton rbPSGNO;
    private javax.swing.JRadioButton rbPSGSI;
    private javax.swing.JRadioButton tbTrabajaNocheNO;
    private javax.swing.JRadioButton tbTrabajaNocheSI;
    private javax.swing.JTextField txtAntecedenteFamiliar;
    private javax.swing.JTextField txtAreaTrabajo;
    private javax.swing.JTextField txtCMP;
    private javax.swing.JTextField txtCircunferencia;
    private javax.swing.JTextField txtContratista;
    private javax.swing.JTextField txtDescanso;
    private javax.swing.JTextField txtDiasTrabajo;
    private javax.swing.JTextField txtDiastolica;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JTextField txtLicencia;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtNordenImp;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPuntuacion;
    private javax.swing.JTextField txtRiesgo;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSistolica;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtUltimoControl;
    private javax.swing.JTextField txtanostrabajo;
    // End of variables declaration//GEN-END:variables
void Agregar(){
if(!txtNorden.getText().isEmpty()){
    if(validar()){
String insert="INSERT INTO ficha_sas("
        + "n_orden,fecha_sas, licencia_sas, tbtrabajanochesi, tbtrabajanocheno," 
        +  "  txtdiastrabajo, txtdescanso, txtanostrabajo";      
String values="VALUES('"+txtNorden.getText().toString()+"','"+FechaSAS.getDate()+"','"+txtLicencia.getText().toString()+"'";
       values+= ",'"+tbTrabajaNocheSI.isSelected()+"','"+tbTrabajaNocheNO.isSelected()+"','"+txtDiasTrabajo.getText().toString()+"','"+txtDescanso.getText().toString()+"','"+txtanostrabajo.getText().toString()+"'";
        insert+=", rbapneasi, rbapneano";
        values+=",'"+rbApneaSI.isSelected()+"','"+rbApneaNO.isSelected()+"'";
        if(!txtUltimoControl.getText().isEmpty()){
        insert+=",txtultimocontrol";
        values+=",'"+txtUltimoControl.getText().toString()+"'";
        }
        insert+=",rbhtasi,rbhtano";
        values+=",'"+rbHTASI.isSelected()+"','"+rbHTANO.isSelected()+"'";
        if(!txtRiesgo.getText().isEmpty()){
        insert+=",txtriesgo";
        values+=",'"+txtRiesgo.getText().toString()+"'";
        }
        insert+=",rbpsgsi,rbpsgno";
        values+=",'"+rbPSGSI.isSelected()+"','"+rbPSGNO.isSelected()+"'";
        if (((JTextField)FechaPSG.getDateEditor().getUiComponent()).getText().trim().length()> 1 ){
            insert+= ",fechapsg";
            values+= ",'"+FechaPSG.getDate().toString()+ "'";
        }
        insert+=",rbenminasi,rbenminano,rbfueraminasi,rbfueraminano";
        values+=",'"+rbEnMinaSI.isSelected()+"','"+rbEnMinaNO.isSelected()+"','"+rbFueraMinaSI.isSelected()+"','"+rbFueraMinaNO.isSelected()+"'";
                
       insert+=",chk1_sassi, chk2_sassi, chk3_sassi, chk4_sassi, chk5_sassi, chk6_sassi," 
        +  "  chk7_sassi, chk8_sassi, chk9_sassi, chk10_sassi, chk11_sassi," 
        +  "  chk12_sassi, chk13_sassi, chk1_sasno, chk2_sasno, chk3_sasno," 
        +  "  chk4_sasno, chk5_sasno, chk6_sasno, chk7_sasno, chk8_sasno, chk9_sasno," 
        +  "  chk10_sasno, chk11_sasno, chk12_sasno, chk13_sasno";
       values+=",'"+chk1_sasSI.isSelected()+"','"+chk2_sasSI.isSelected()+"','"+chk3_sasSI.isSelected()+"','"+chk4_sasSI.isSelected()+"','"+chk5_sasSI.isSelected()+"','"+chk6_sasSI.isSelected()+"','"
        + chk7_sasSI.isSelected()+"','"+chk8_sasSI.isSelected()+"','"+chk9_sasSI.isSelected()+"','"+chk10_sasSI.isSelected()+"','"+chk11_sasSI.isSelected()+"','"+chk12_sasSI.isSelected()+"','"+chk13_sasSI.isSelected()+"'";       
       values+=",'"+chk1_sasNO.isSelected()+"','"+chk2_sasNO.isSelected()+"','"+chk3_sasNO.isSelected()+"','"+chk4_sasNO.isSelected()+"','"+chk5_sasNO.isSelected()+"','"+chk6_sasNO.isSelected()+"','"
        + chk7_sasNO.isSelected()+"','"+chk8_sasNO.isSelected()+"','"+chk9_sasNO.isSelected()+"','"+chk10_sasNO.isSelected()+"','"+chk11_sasNO.isSelected()+"','"+chk12_sasNO.isSelected()+"','"+chk13_sasNO.isSelected()+"'";       
       insert+= ",chkantsi,chkantno";
       values+=",'"+chkAntSI.isSelected()+"','"+chkAntNO.isSelected()+"'";
       if(!txtAntecedenteFamiliar.getText().isEmpty()){
       insert+=",txtantecedentefamiliar";
       values+= ",'"+txtAntecedenteFamiliar.getText().toString()+"'";
       }
       insert += ",chk1_esi, chk2_esi, chk3_esi,chk4_esi, chk5_esi, chk6_esi, chk7_esi, chk8_esi";
       insert += ",chk1_eno, chk2_eno,chk3_eno, chk4_eno, chk5_eno, chk6_eno, chk7_eno, chk8_eno";
       values +=",'"+chk1_eSI.isSelected()+"','"+chk2_eSI.isSelected()+"','"+chk3_eSI.isSelected()+"','"
               +chk4_eSI.isSelected()+"','"+chk5_eSI.isSelected()+"','"+chk6_eSI.isSelected()+"','"
               +chk7_eSI.isSelected()+"','"+chk8_eSI.isSelected()+"'";
       values +=",'"+chk1_eNO.isSelected()+"','"+chk2_eNO.isSelected()+"','"+chk3_eNO.isSelected()+"','"
               +chk4_eNO.isSelected()+"','"+chk5_eNO.isSelected()+"','"+chk6_eNO.isSelected()+"','"
              +chk7_eNO.isSelected()+"','"+chk8_eNO.isSelected()+"'";        
       if(!txtPuntuacion.getText().isEmpty()){
       insert+=",txtpuntuacion";
       values+=",'"+txtPuntuacion.getText().toString()+"'";
       } 
       insert +=",chkvaronsi,chkvaronno,chkmujersi,chkmujerno,chkhtanuevasi";
       values +=",'"+chkvaronSI.isSelected()+"','"+chkvaronNO.isSelected()+"','"+chkmujerSI.isSelected()+"','"
               +chkmujerNO.isSelected()+"','"+chkHTAnuevaSI.isSelected()+"'";
        insert +=",chkhtanuevano, chkgradoi, chkgradoii, chkgradoiii, chkgradoiiii";
        values  +=",'"+chkHTAnuevaNO.isSelected()+"','"+chkGradoI.isSelected()+"','"+chkGradoII.isSelected()+"','"
                +chkGradoIII.isSelected()+"','"+chkGradoIIII.isSelected()+"'";
        insert += ",chk1_psg_si,chk1_psg_no,chk1_apto_si,chk1_apto_no,chkaptobajosi,chkaptobajono";
        values += ",'"+chk1_PSG_SI.isSelected()+"','"+chk1_PSG_NO.isSelected()+"','"+chk1_APTO_SI.isSelected()+"','"
                +chk1_APTO_NO.isSelected()+"','"+chkAptoBajoSI.isSelected()+"','"+chkAptoBajoNO.isSelected()+"'";
        insert += ",chk1_psg_sia,chk1_psg_noa,chk1_psg_sib,chk1_psg_nob";
        values += ",'"+chk1_PSG_SIA.isSelected()+"','"+chk1_PSG_NOA.isSelected()+"','"
                +chk1_PSG_SIB.isSelected()+"','"+chk1_PSG_NOB.isSelected()+"'";
        insert += ",chk1_apto_sid,chk1_apto_nod,chk1_apto_sid1,chk1_apto_nod1,chk1_apto_sid2,chk1_apto_nod2,"
                + "chk1_apto_sid3,chk1_apto_nod3,chk1_apto_sid4,chk1_apto_nod4,chk1_apto_sid5,chk1_apto_nod5,"
                + "chk1_apto_sid6,chk1_apto_nod6,chk1_apto_sie,chk1_apto_noe";
        values += ",'"+chk1_APTO_SID.isSelected()+"','"+chk1_APTO_NOD.isSelected()+"','"
                +chk1_APTO_SID1.isSelected()+"','"+chk1_APTO_NOD1.isSelected()+"','"
                +chk1_APTO_SID2.isSelected()+"','"+chk1_APTO_NOD2.isSelected()+"','"
                +chk1_APTO_SID3.isSelected()+"','"+chk1_APTO_NOD3.isSelected()+"','"
                +chk1_APTO_SID4.isSelected()+"','"+chk1_APTO_NOD4.isSelected()+"','"
                +chk1_APTO_SID5.isSelected()+"','"+chk1_APTO_NOD5.isSelected()+"','"
                +chk1_APTO_SID6.isSelected()+"','"+chk1_APTO_NOD6.isSelected()+"','"
                +chk1_APTO_SIE.isSelected()+"','"+chk1_APTO_NOE.isSelected()+"'";
        if(!txtObservaciones.getText().isEmpty()){
        insert += ",txtobservaciones"; 
        values += ",'"+txtObservaciones.getText().toString()+"'";
        }
        if(!Clases.clsGlobales.sDniOperador.isEmpty()){
            oFunc.SubSistemaMensajeInformacion(Clases.clsGlobales.sDniOperador);
        insert += ",dni_user";
        values += ",'"+ Clases.clsGlobales.sDniOperador+"'";
        }
       // oFunc.SubSistemaMensajeInformacion(insert.concat(") ") + values.concat(")"));
         if (oConn.FnBoolQueryExecuteUpdate(insert.concat(") ") + values.concat(")"))){
             imp();
             oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
            limpiar();
        }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
             
        }


    }
}       
}
private void ReImp(){
if(!txtNordenImp.getText().isEmpty()){
            if(OrdenImp()){
                if (imprimir1(Integer.valueOf(txtNordenImp.getText()))){
                imprimir2(Integer.valueOf(txtNordenImp.getText()));
                 }
            }else {oFunc.SubSistemaMensajeError("Numero de Orden no Existe"); txtNordenImp.setText(null); txtNordenImp.requestFocus();
            }
            
            
            }else{
           
        
        }

}
public boolean OrdenImp()
    {
        
        boolean bResultado=false;
        if(!txtNordenImp.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from ficha_sas Where n_orden ="+txtNordenImp.getText().toString();
        
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
  private boolean validar(){
boolean bResultado=true;
if (((JTextField)FechaSAS.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    if(txtLicencia.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    if(txtDiasTrabajo.getText().isEmpty()){bResultado = false;}
    if(txtDescanso.getText().isEmpty()){bResultado = false;}
    if(txtanostrabajo.getText().isEmpty()){bResultado = false;}
    if(txtPuntuacion.getText().isEmpty()){oFunc.SubSistemaMensajeError("INGRESE: PUNTUACIÓN DE LA ESCALA DE EPWORTH (ESS)"); bResultado = false;}
    if(btmallampati.isSelected(null)){oFunc.SubSistemaMensajeError(" Seleccione: Evaluación de vía aérea superior MALLAMPATI"); bResultado = false;}
    
   return bResultado;
}
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"FichaDetencionSAS.jasper";
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"FichaDetencionSAS2.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  JasperPrintManager.printReport(jasperPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }

}
