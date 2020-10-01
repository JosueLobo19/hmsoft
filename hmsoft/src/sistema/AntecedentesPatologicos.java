/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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

/**
 *
 * @author admin
 */
public final class AntecedentesPatologicos extends javax.swing.JInternalFrame {

   clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    DefaultTableModel model;
   Integer num= null;
   public AntecedentesPatologicos() {
      initComponents();
      jtAntecedentes.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/pildora.png")));
       jtAntecedentes.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
         jtAntecedentes.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png")));
         txtMedico.setText(clsGlobales.sNomOperador);
         sbCargarDatosAP();
        habitos();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
         
   }

 private com.toedter.calendar.JDateChooser FechaNacimiento;
 
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        bgFumar = new javax.swing.ButtonGroup();
        bgLicor = new javax.swing.ButtonGroup();
        bgDrogras = new javax.swing.ButtonGroup();
        jtAntecedentes = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FechaPatologicos = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
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
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        chk8 = new javax.swing.JCheckBox();
        chk7 = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        chk5 = new javax.swing.JCheckBox();
        chk12 = new javax.swing.JCheckBox();
        chk11 = new javax.swing.JCheckBox();
        chk10 = new javax.swing.JCheckBox();
        chk9 = new javax.swing.JCheckBox();
        chk16 = new javax.swing.JCheckBox();
        chk15 = new javax.swing.JCheckBox();
        chk14 = new javax.swing.JCheckBox();
        chk13 = new javax.swing.JCheckBox();
        chk20 = new javax.swing.JCheckBox();
        chk19 = new javax.swing.JCheckBox();
        chk18 = new javax.swing.JCheckBox();
        chk17 = new javax.swing.JCheckBox();
        chk24 = new javax.swing.JCheckBox();
        chk22 = new javax.swing.JCheckBox();
        chk21 = new javax.swing.JCheckBox();
        chk36 = new javax.swing.JCheckBox();
        chk31 = new javax.swing.JCheckBox();
        chk32 = new javax.swing.JCheckBox();
        chk29 = new javax.swing.JCheckBox();
        chk30 = new javax.swing.JCheckBox();
        chk28 = new javax.swing.JCheckBox();
        chk27 = new javax.swing.JCheckBox();
        chk26 = new javax.swing.JCheckBox();
        chk25 = new javax.swing.JCheckBox();
        chk23 = new javax.swing.JCheckBox();
        chk37 = new javax.swing.JCheckBox();
        chk35 = new javax.swing.JCheckBox();
        chk34 = new javax.swing.JCheckBox();
        chk39 = new javax.swing.JCheckBox();
        chk38 = new javax.swing.JCheckBox();
        chk33 = new javax.swing.JCheckBox();
        chk40 = new javax.swing.JCheckBox();
        chk44 = new javax.swing.JCheckBox();
        chk42 = new javax.swing.JCheckBox();
        chk41 = new javax.swing.JCheckBox();
        chk56 = new javax.swing.JCheckBox();
        chk51 = new javax.swing.JCheckBox();
        chk52 = new javax.swing.JCheckBox();
        chk49 = new javax.swing.JCheckBox();
        chk50 = new javax.swing.JCheckBox();
        chk48 = new javax.swing.JCheckBox();
        chk47 = new javax.swing.JCheckBox();
        chk46 = new javax.swing.JCheckBox();
        chk45 = new javax.swing.JCheckBox();
        chk43 = new javax.swing.JCheckBox();
        chk57 = new javax.swing.JCheckBox();
        chk55 = new javax.swing.JCheckBox();
        chk54 = new javax.swing.JCheckBox();
        chk59 = new javax.swing.JCheckBox();
        chk58 = new javax.swing.JCheckBox();
        chk53 = new javax.swing.JCheckBox();
        chk60 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtotrosap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        chk64 = new javax.swing.JCheckBox();
        chk62 = new javax.swing.JCheckBox();
        chk61 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        chk82 = new javax.swing.JCheckBox();
        chk81 = new javax.swing.JCheckBox();
        chk84 = new javax.swing.JCheckBox();
        chk89 = new javax.swing.JCheckBox();
        chk90 = new javax.swing.JCheckBox();
        chk69 = new javax.swing.JCheckBox();
        chk88 = new javax.swing.JCheckBox();
        chk70 = new javax.swing.JCheckBox();
        chk68 = new javax.swing.JCheckBox();
        chk67 = new javax.swing.JCheckBox();
        chk66 = new javax.swing.JCheckBox();
        chk65 = new javax.swing.JCheckBox();
        chk63 = new javax.swing.JCheckBox();
        chk86 = new javax.swing.JCheckBox();
        chk85 = new javax.swing.JCheckBox();
        chk87 = new javax.swing.JCheckBox();
        chk83 = new javax.swing.JCheckBox();
        chk74 = new javax.swing.JCheckBox();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        chk77 = new javax.swing.JCheckBox();
        chk78 = new javax.swing.JCheckBox();
        chk76 = new javax.swing.JCheckBox();
        chk72 = new javax.swing.JCheckBox();
        chk71 = new javax.swing.JCheckBox();
        chk79 = new javax.swing.JCheckBox();
        chk80 = new javax.swing.JCheckBox();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        chk73 = new javax.swing.JCheckBox();
        chk75 = new javax.swing.JCheckBox();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        txtotros1ap = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rbFumarSI = new javax.swing.JRadioButton();
        rbFumarNO = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txtNcigarrillos = new javax.swing.JTextField();
        chkCigarrillos = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        rbLicorSI = new javax.swing.JRadioButton();
        rbLicorNO = new javax.swing.JRadioButton();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        txtLicorFrecuencia = new javax.swing.JTextField();
        atxtObservacionesAltura = new javax.swing.JScrollPane();
        txtLicorTipoFrecuente = new javax.swing.JTextArea();
        chkWiscky = new javax.swing.JCheckBox();
        chkVino = new javax.swing.JCheckBox();
        chkCerveza = new javax.swing.JCheckBox();
        chkRon = new javax.swing.JCheckBox();
        chkLicFrecuencia = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        rbDrogasSI = new javax.swing.JRadioButton();
        rbDrogasNO = new javax.swing.JRadioButton();
        jLabel107 = new javax.swing.JLabel();
        txtDrogasTipo = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        txtDrogasFrecuencia = new javax.swing.JTextField();
        chkDrogas = new javax.swing.JCheckBox();
        chkFreDrog = new javax.swing.JCheckBox();
        btnNext = new javax.swing.JLabel();
        txtCoca = new javax.swing.JTextField();
        txtMarig = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtComplicacionesQui = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtHospitalQui = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuirurgicos = new javax.swing.JTable();
        jLabel111 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        txtdiasHospitalizacionQui = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txtOperacionQui = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        btnQui = new javax.swing.JLabel();
        FechaQui = new javax.swing.JTextField();
        jtReproduccion = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        txtVhijosVivos = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        txtVhijosFallecidos = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtVcausas = new javax.swing.JTextArea();
        txtVnabortosParejas = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        txtDinicioMestruacion = new javax.swing.JTextField();
        txtDinicioVidaSexual = new javax.swing.JTextField();
        txtDnumParejasSexActualidad = new javax.swing.JTextField();
        txtDhijosVivos = new javax.swing.JTextField();
        txtDhijosFallecidos = new javax.swing.JTextField();
        txtDnumerosdeAbortos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDcausas = new javax.swing.JTextArea();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtImp = new javax.swing.JTextField();
        btnIMP = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        txtCercaSinCorregirOD = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        txtLejosSinCorregirOD = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        txtVisionColores = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        txtVisionBinocular = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txtLejosSinCorregirOI = new javax.swing.JTextField();
        txtCercaSinCorregirOI = new javax.swing.JTextField();
        txtLejosCorregidaOI = new javax.swing.JTextField();
        txtLejosCorregidaOD = new javax.swing.JTextField();
        txtCercaCorregidaOD = new javax.swing.JTextField();
        txtCercaCorregidaOI = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel137 = new javax.swing.JLabel();
        txtReflejosPupilares = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        txtEnfermedadesOculares = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();

        jLabel6.setText("Cod. Cliente:");

        setClosable(true);
        setTitle("Antecdentes Patológicos");
        setPreferredSize(new java.awt.Dimension(1060, 630));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ingresar Información"));

        jLabel1.setText("N° Orden :");

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

        jLabel2.setText("Nombres:");

        txtNombres.setEditable(false);

        jLabel8.setText("Sexo :");

        txtSexo.setEditable(false);

        jLabel10.setText("Fecha :");

        FechaPatologicos.setDateFormatString("dd-MM-yyyy");

        jLabel11.setText("Edad :");

        txtEdad.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(FechaPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Marcar todas las enfermedades que ah tenido o tiene"));

        jLabel5.setText("Alergias");

        jLabel7.setText("Amigdalitis crónica");

        jLabel9.setText("Arritmias cardiacas");

        jLabel17.setText("Asma");

        jLabel18.setText("Bocio");

        jLabel19.setText("Bronconeumonía");

        jLabel20.setText("Bronquitis a repetición");

        jLabel21.setText("Caries o gingivitis");

        jLabel22.setText("Colecistitis");

        jLabel23.setText("Dermatitis");

        jLabel24.setText("Diabetes");

        jLabel25.setText("Disentería");

        jLabel26.setText("Enfermedades del corazón");

        jLabel27.setText("Enf. Oculares");

        jLabel28.setText("Epilepsia o convulsiones");

        jLabel30.setText("Faringitis crónica");

        jLabel31.setText("Fiebre Reumática");

        jLabel32.setText("Foruncolois");

        jLabel33.setText("Fiebre malta");

        jLabel34.setText("Fiebre tifoidea");

        jLabel29.setText("Hernias");

        jLabel35.setText("Hepatitis");

        jLabel36.setText("Neuritis a Repetición");

        jLabel37.setText("Gonorrea");

        jLabel38.setText("Meningitis");

        jLabel39.setText("Litiasis Urinaria");

        jLabel40.setText("Hemorroides");

        jLabel41.setText("Insuficiencia Renal Crónica");

        jLabel42.setText("Gota");

        jLabel43.setText("Gastritis crónica");

        jLabel44.setText("Paludismo o malaria");

        jLabel45.setText("Inf. Urinarias repetidas");

        jLabel46.setText("Intoxicaciones");

        jLabel47.setText("Parotiditis");

        jLabel48.setText("Insuficiencia Cardiaca");

        jLabel49.setText("Preción alta o baja");

        jLabel50.setText("Insuficiencia Coronaria Crónica");

        jLabel51.setText("Otitis Media");

        jLabel52.setText("Parasitosis Intestinal");

        jLabel53.setText("Hipertención Arterial");

        jLabel54.setText("Resfríos frecuentes");
        jLabel54.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel55.setText("Prótesis Cardiacas Valvulares");
        jLabel55.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel56.setText("Tuberculosis");
        jLabel56.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel57.setText("Plumbismo");
        jLabel57.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel58.setText("Traumatismo encefalocraneano");
        jLabel58.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel59.setText("Trastornos Nerviosos");
        jLabel59.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel60.setText("Portador de Marcapaso");
        jLabel60.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel61.setText("Tos convulsiva");
        jLabel61.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel62.setText("Poliomielitis");
        jLabel62.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel63.setText("Pleuresia");
        jLabel63.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel64.setText("Varicela");

        jLabel65.setText("Sarampión");
        jLabel65.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel66.setText("Sífilis");
        jLabel66.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel67.setText("Varicocele");
        jLabel67.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel68.setText("Silicosis");
        jLabel68.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel69.setText("Ulcera péptica");
        jLabel69.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel70.setText("Sinusitis crónica");
        jLabel70.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel71.setText("Tumores - quistes");
        jLabel71.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel72.setText("Várices");
        jLabel72.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel73.setText("Reumatismo a repetición");
        jLabel73.setPreferredSize(new java.awt.Dimension(38, 11));

        chk1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk1.setPreferredSize(new java.awt.Dimension(21, 14));
        chk1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk2.setPreferredSize(new java.awt.Dimension(21, 14));
        chk2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk4.setPreferredSize(new java.awt.Dimension(21, 14));
        chk4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk3.setPreferredSize(new java.awt.Dimension(21, 14));
        chk3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk8.setPreferredSize(new java.awt.Dimension(21, 14));
        chk8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk7.setPreferredSize(new java.awt.Dimension(21, 14));
        chk7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk6.setPreferredSize(new java.awt.Dimension(21, 14));
        chk6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk5.setPreferredSize(new java.awt.Dimension(21, 14));
        chk5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk12.setPreferredSize(new java.awt.Dimension(21, 14));
        chk12.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk11.setPreferredSize(new java.awt.Dimension(21, 14));
        chk11.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk10.setPreferredSize(new java.awt.Dimension(21, 14));
        chk10.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk9.setPreferredSize(new java.awt.Dimension(21, 14));
        chk9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk16.setPreferredSize(new java.awt.Dimension(21, 14));
        chk16.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk15.setPreferredSize(new java.awt.Dimension(21, 14));
        chk15.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk14.setPreferredSize(new java.awt.Dimension(21, 14));
        chk14.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk13.setPreferredSize(new java.awt.Dimension(21, 14));
        chk13.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk20.setPreferredSize(new java.awt.Dimension(21, 14));
        chk20.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk19.setPreferredSize(new java.awt.Dimension(21, 14));
        chk19.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk18.setPreferredSize(new java.awt.Dimension(21, 14));
        chk18.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk17.setPreferredSize(new java.awt.Dimension(21, 14));
        chk17.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk24.setPreferredSize(new java.awt.Dimension(21, 14));
        chk24.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk24.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk22.setPreferredSize(new java.awt.Dimension(21, 14));
        chk22.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk22.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk21.setPreferredSize(new java.awt.Dimension(21, 14));
        chk21.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk21.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk36.setPreferredSize(new java.awt.Dimension(21, 14));
        chk36.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk36.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk31.setPreferredSize(new java.awt.Dimension(21, 14));
        chk31.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk31.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk32.setPreferredSize(new java.awt.Dimension(21, 14));
        chk32.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk32.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk29.setPreferredSize(new java.awt.Dimension(21, 14));
        chk29.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk29.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk30.setPreferredSize(new java.awt.Dimension(21, 14));
        chk30.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk30.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk28.setPreferredSize(new java.awt.Dimension(21, 14));
        chk28.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk28.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk27.setPreferredSize(new java.awt.Dimension(21, 14));
        chk27.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk27.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk26.setPreferredSize(new java.awt.Dimension(21, 14));
        chk26.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk26.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk25.setPreferredSize(new java.awt.Dimension(21, 14));
        chk25.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk25.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk23.setPreferredSize(new java.awt.Dimension(21, 14));
        chk23.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk23.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk37.setPreferredSize(new java.awt.Dimension(21, 14));
        chk37.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk37.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk35.setPreferredSize(new java.awt.Dimension(21, 14));
        chk35.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk35.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk34.setPreferredSize(new java.awt.Dimension(21, 14));
        chk34.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk34.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk39.setPreferredSize(new java.awt.Dimension(21, 14));
        chk39.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk39.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk38.setPreferredSize(new java.awt.Dimension(21, 14));
        chk38.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk38.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk33.setPreferredSize(new java.awt.Dimension(21, 14));
        chk33.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk33.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk40.setPreferredSize(new java.awt.Dimension(21, 14));
        chk40.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk40.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk44.setPreferredSize(new java.awt.Dimension(21, 14));
        chk44.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk44.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk42.setPreferredSize(new java.awt.Dimension(21, 14));
        chk42.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk42.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk41.setPreferredSize(new java.awt.Dimension(21, 14));
        chk41.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk41.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk56.setPreferredSize(new java.awt.Dimension(21, 14));
        chk56.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk56.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk51.setPreferredSize(new java.awt.Dimension(21, 14));
        chk51.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk51.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk52.setPreferredSize(new java.awt.Dimension(21, 14));
        chk52.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk52.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk49.setPreferredSize(new java.awt.Dimension(21, 14));
        chk49.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk49.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk50.setPreferredSize(new java.awt.Dimension(21, 14));
        chk50.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk50.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk48.setPreferredSize(new java.awt.Dimension(21, 14));
        chk48.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk48.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk47.setPreferredSize(new java.awt.Dimension(21, 14));
        chk47.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk47.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk46.setPreferredSize(new java.awt.Dimension(21, 14));
        chk46.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk46.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk45.setPreferredSize(new java.awt.Dimension(21, 14));
        chk45.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk45.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk43.setPreferredSize(new java.awt.Dimension(21, 14));
        chk43.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk43.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk57.setPreferredSize(new java.awt.Dimension(21, 14));
        chk57.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk57.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk55.setPreferredSize(new java.awt.Dimension(21, 14));
        chk55.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk55.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk54.setPreferredSize(new java.awt.Dimension(21, 14));
        chk54.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk54.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk59.setPreferredSize(new java.awt.Dimension(21, 14));
        chk59.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk59.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk58.setPreferredSize(new java.awt.Dimension(21, 14));
        chk58.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk58.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk53.setPreferredSize(new java.awt.Dimension(21, 14));
        chk53.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk53.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk60.setPreferredSize(new java.awt.Dimension(21, 14));
        chk60.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk60.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtotrosap.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtotrosap, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(2, 2, 2)
                .addComponent(txtotrosap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setText("1.- ANTECEDENTES PATOLÓGICOS PERSONALES");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtAntecedentes.addTab("Antecedentes Patológicos", jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Indicar las enfermedades que ah tenido o tiene, con cierta frecuencia"));

        chk64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk64.setPreferredSize(new java.awt.Dimension(21, 14));
        chk64.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk64.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk62.setPreferredSize(new java.awt.Dimension(21, 14));
        chk62.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk62.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk61.setPreferredSize(new java.awt.Dimension(21, 14));
        chk61.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk61.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel13.setText("Perdida de memoria");

        chk82.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk82.setPreferredSize(new java.awt.Dimension(21, 14));
        chk82.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk82.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk81.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk81.setPreferredSize(new java.awt.Dimension(21, 14));
        chk81.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk81.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk84.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk84.setPreferredSize(new java.awt.Dimension(21, 14));
        chk84.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk84.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk89.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk89.setPreferredSize(new java.awt.Dimension(21, 14));
        chk89.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk89.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk90.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk90.setPreferredSize(new java.awt.Dimension(21, 14));
        chk90.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk90.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk69.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk69.setPreferredSize(new java.awt.Dimension(21, 14));
        chk69.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk69.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk88.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk88.setPreferredSize(new java.awt.Dimension(21, 14));
        chk88.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk88.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk70.setPreferredSize(new java.awt.Dimension(21, 14));
        chk70.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk70.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk68.setPreferredSize(new java.awt.Dimension(21, 14));
        chk68.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk68.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk67.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk67.setPreferredSize(new java.awt.Dimension(21, 14));
        chk67.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk67.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk66.setPreferredSize(new java.awt.Dimension(21, 14));
        chk66.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk66.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk65.setPreferredSize(new java.awt.Dimension(21, 14));
        chk65.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk65.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk63.setPreferredSize(new java.awt.Dimension(21, 14));
        chk63.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk63.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk86.setPreferredSize(new java.awt.Dimension(21, 14));
        chk86.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk86.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk85.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk85.setPreferredSize(new java.awt.Dimension(21, 14));
        chk85.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk85.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk87.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk87.setPreferredSize(new java.awt.Dimension(21, 14));
        chk87.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk87.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk83.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk83.setPreferredSize(new java.awt.Dimension(21, 14));
        chk83.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk83.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk74.setPreferredSize(new java.awt.Dimension(21, 14));
        chk74.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk74.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel74.setText("Pesadillas frecuentes");
        jLabel74.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel75.setText("Sangrado por encias");
        jLabel75.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel76.setText("Tos crónica");
        jLabel76.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel77.setText("Dolores musculares");
        jLabel77.setPreferredSize(new java.awt.Dimension(38, 11));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel78.setText("Orina con dolor o ardor");
        jLabel78.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel79.setText("Dolor de oído");
        jLabel79.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel80.setText("Secreciones por el oído");
        jLabel80.setPreferredSize(new java.awt.Dimension(38, 11));

        chk77.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk77.setPreferredSize(new java.awt.Dimension(21, 14));
        chk77.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk77.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk78.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk78.setPreferredSize(new java.awt.Dimension(21, 14));
        chk78.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk78.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk76.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk76.setPreferredSize(new java.awt.Dimension(21, 14));
        chk76.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk76.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk72.setPreferredSize(new java.awt.Dimension(21, 14));
        chk72.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk72.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk71.setPreferredSize(new java.awt.Dimension(21, 14));
        chk71.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk71.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk79.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk79.setPreferredSize(new java.awt.Dimension(21, 14));
        chk79.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk79.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk80.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk80.setPreferredSize(new java.awt.Dimension(21, 14));
        chk80.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk80.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel81.setText("Orina involuntaria");
        jLabel81.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel82.setText("Heces negras");

        jLabel83.setText("Mareos- Desmayos- Vertigos");

        chk73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk73.setPreferredSize(new java.awt.Dimension(21, 14));
        chk73.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk73.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        chk75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk75.setPreferredSize(new java.awt.Dimension(21, 14));
        chk75.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        chk75.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N

        jLabel84.setText("Palpitaciones");
        jLabel84.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel85.setText("Insomnio");

        jLabel86.setText("Adormecimientos");
        jLabel86.setPreferredSize(new java.awt.Dimension(38, 11));

        jLabel87.setText("Coloración amarilla de la piel");

        jLabel88.setText("Vómitos con sangre");

        jLabel89.setText("Tos con sangre");

        jLabel90.setText("Sangrado por orina");

        jLabel91.setText("Estreñimiento");

        jLabel92.setText("Lumbalgias o dolor de cintura");

        jLabel93.setText("Indigestión frecuente");

        jLabel94.setText("Diarrea");

        jLabel95.setText("Dolor de cabeza");

        jLabel14.setText("Preocupaciones o angustia");

        jLabel96.setText("Aumento o disminución de peso");

        jLabel15.setText("Dolores articulares y/o huesos");

        jLabel97.setText("Dolor ocular");

        jLabel98.setText("Dolor Opresivo Torax");

        jLabel99.setText("Hinchazón de pies o manos");

        jLabel100.setText("Aguitación al hacer ejercicios");

        txtotros1ap.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtotros1ap, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jSeparator4)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addComponent(txtotros1ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hábitos Nocivos"));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Fumar");

        bgFumar.add(rbFumarSI);
        rbFumarSI.setText("SI");
        rbFumarSI.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbFumarSIStateChanged(evt);
            }
        });

        bgFumar.add(rbFumarNO);
        rbFumarNO.setText("NO");
        rbFumarNO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbFumarNOStateChanged(evt);
            }
        });

        jLabel16.setText("Número de cigarrilos :");

        chkCigarrillos.setText("...CIGARRILLOS X MES");
        chkCigarrillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCigarrillosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addComponent(rbFumarSI)
                .addGap(18, 18, 18)
                .addComponent(rbFumarNO)
                .addGap(26, 26, 26)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCigarrillos)
                    .addComponent(txtNcigarrillos, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(chkCigarrillos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbFumarSI)
                    .addComponent(rbFumarNO)
                    .addComponent(jLabel16)
                    .addComponent(txtNcigarrillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel103.setText("Licor");

        bgLicor.add(rbLicorSI);
        rbLicorSI.setText("SI");
        rbLicorSI.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbLicorSIStateChanged(evt);
            }
        });

        bgLicor.add(rbLicorNO);
        rbLicorNO.setText("NO");
        rbLicorNO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbLicorNOStateChanged(evt);
            }
        });

        jLabel104.setText("Tipo más frecuente :");

        jLabel105.setText("Frecuencia :");

        txtLicorTipoFrecuente.setColumns(20);
        txtLicorTipoFrecuente.setRows(2);
        atxtObservacionesAltura.setViewportView(txtLicorTipoFrecuente);

        chkWiscky.setText("WISCKY");
        chkWiscky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkWisckyActionPerformed(evt);
            }
        });

        chkVino.setText("VINO");
        chkVino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVinoActionPerformed(evt);
            }
        });

        chkCerveza.setText("CERVEZA");
        chkCerveza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCervezaActionPerformed(evt);
            }
        });

        chkRon.setText("RON");
        chkRon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRonActionPerformed(evt);
            }
        });

        chkLicFrecuencia.setText("1 VEZ X MES");
        chkLicFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLicFrecuenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addGap(49, 49, 49)
                                .addComponent(rbLicorSI)
                                .addGap(18, 18, 18)
                                .addComponent(rbLicorNO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jLabel104)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(chkRon)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkCerveza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkVino))
                                    .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(chkLicFrecuencia)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel105)
                                .addGap(18, 18, 18)
                                .addComponent(txtLicorFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chkWiscky))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkWiscky, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkVino, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkRon, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel103)
                        .addComponent(rbLicorSI)
                        .addComponent(rbLicorNO))
                    .addComponent(jLabel104))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(txtLicorFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkLicFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel106.setText("Drogas");

        bgDrogras.add(rbDrogasSI);
        rbDrogasSI.setText("SI");
        rbDrogasSI.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbDrogasSIStateChanged(evt);
            }
        });

        bgDrogras.add(rbDrogasNO);
        rbDrogasNO.setText("NO");
        rbDrogasNO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbDrogasNOStateChanged(evt);
            }
        });

        jLabel107.setText("Tipo probado o que usa :");

        jLabel108.setText("Frecuencia :");

        chkDrogas.setText("CHACCHA HOJA DE COCA");
        chkDrogas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDrogasActionPerformed(evt);
            }
        });

        chkFreDrog.setText("15 DIAS X MES");
        chkFreDrog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFreDrogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel106)
                .addGap(40, 40, 40)
                .addComponent(rbDrogasSI)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rbDrogasNO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel107)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkDrogas)
                            .addComponent(txtDrogasTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(chkFreDrog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel108)
                        .addGap(18, 18, 18)
                        .addComponent(txtDrogasFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(chkDrogas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(rbDrogasSI)
                    .addComponent(rbDrogasNO)
                    .addComponent(jLabel107)
                    .addComponent(txtDrogasTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(txtDrogasFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkFreDrog, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/siguiente.png"))); // NOI18N
        btnNext.setText("Click aquí para continuar");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        txtCoca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtMarig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel12.setText("COCAINA:");

        jLabel141.setText("MARIHUANA:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel141))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMarig, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCoca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel141))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtAntecedentes.addTab("Indicar las Enfermedades", jPanel2);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Antecedentes Quirúrgicos"));

        jLabel109.setText("Fecha");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tbQuirurgicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbQuirurgicos);

        jLabel111.setText("Operación");

        jLabel110.setText("Hospital (Nombre - Lugar) Operación");

        txtdiasHospitalizacionQui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiasHospitalizacionQuiKeyTyped(evt);
            }
        });

        jLabel113.setText("Complicaciones");

        jLabel112.setText("Días Hospitalización");

        btnQui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnQui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel109)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel110)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(FechaQui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHospitalQui, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel111)
                            .addComponent(txtOperacionQui))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtdiasHospitalizacionQui, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel112)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel113)
                            .addComponent(txtComplicacionesQui, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnQui))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(jLabel110))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtOperacionQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQui)
                            .addComponent(txtdiasHospitalizacionQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)
                            .addComponent(txtHospitalQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtComplicacionesQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel113)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel111)
                                .addComponent(jLabel112)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jLabel123.setText("Número de hijos vivos :");

        txtVhijosVivos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVhijosVivosKeyTyped(evt);
            }
        });

        jLabel124.setText("Número de hijos fallecidos :");

        txtVhijosFallecidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVhijosFallecidosKeyTyped(evt);
            }
        });

        jLabel125.setText("Número de Abortos en sus parejas :");

        jLabel126.setText("Precisar causas :");

        txtVcausas.setColumns(20);
        txtVcausas.setLineWrap(true);
        txtVcausas.setRows(4);
        jScrollPane3.setViewportView(txtVcausas);

        txtVnabortosParejas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVnabortosParejasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel126, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel124, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel123, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVnabortosParejas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVhijosFallecidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVhijosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(txtVhijosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(txtVhijosFallecidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(txtVnabortosParejas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addGap(54, 54, 54))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jtReproduccion.addTab("En caso de Varones", jPanel14);

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel115.setText("Inicio de mestruación :");

        jLabel116.setText("Inicio de vida sexual :");

        jLabel117.setText("Número de parejas sexuales a la actualidad :");

        jLabel118.setText("Número de hijos vivos :");

        jLabel119.setText("Número de hijos fallecidos :");

        jLabel120.setText("Número de Abortos :");

        jLabel121.setText("Precisar causas :");

        txtDinicioMestruacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDinicioMestruacionKeyTyped(evt);
            }
        });

        txtDinicioVidaSexual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDinicioVidaSexualKeyTyped(evt);
            }
        });

        txtDnumParejasSexActualidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDnumParejasSexActualidadKeyTyped(evt);
            }
        });

        txtDhijosVivos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDhijosVivosKeyTyped(evt);
            }
        });

        txtDhijosFallecidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDhijosFallecidosKeyTyped(evt);
            }
        });

        txtDnumerosdeAbortos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDnumerosdeAbortosKeyTyped(evt);
            }
        });

        txtDcausas.setColumns(20);
        txtDcausas.setLineWrap(true);
        txtDcausas.setRows(4);
        jScrollPane2.setViewportView(txtDcausas);

        jLabel127.setText("Años");

        jLabel128.setText("Años");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel121, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel118, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDhijosFallecidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDnumerosdeAbortos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtDinicioVidaSexual, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel128))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtDinicioMestruacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel127))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDhijosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDnumParejasSexActualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(txtDinicioMestruacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(txtDinicioVidaSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(txtDnumParejasSexActualidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(txtDhijosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(txtDhijosFallecidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(txtDnumerosdeAbortos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addGap(54, 54, 54))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jtReproduccion.addTab("En caso de Damas", jPanel13);

        jLabel122.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel122.setText("Antecedentes de Reproducción");

        jLabel114.setText("Médico :");

        txtMedico.setEditable(false);

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnGrabar.setText("Agregar/Actualizar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        txtLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Impirmir N° Orden"));

        txtImp.setBackground(new java.awt.Color(255, 153, 0));
        txtImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpActionPerformed(evt);
            }
        });
        txtImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpKeyTyped(evt);
            }
        });

        btnIMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnIMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122)
                    .addComponent(jtReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel122)
                .addGap(14, 14, 14)
                .addComponent(jtReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel114)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar)
                    .addComponent(txtLimpiar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jtAntecedentes.addTab("Antecedentes", jPanel11);

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.setPreferredSize(new java.awt.Dimension(189, 334));

        jLabel101.setText("V.C. :");

        jLabel102.setText("V.L.:");

        jLabel129.setText("V.Clrs :");

        jLabel130.setText("V.B.:");

        jLabel131.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel131.setText("Sin Corregir");

        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel132.setText("Corregida");

        jLabel133.setText("O.D");

        jLabel134.setText("O.I");

        jLabel135.setText("O.I");

        jLabel136.setText("O.D");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel137.setText("R. P. :");

        jLabel138.setText("Enfermedades Oculares :");

        jLabel139.setText("V.C. :");

        jLabel140.setText("V.L.:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel130)
                                .addComponent(jLabel129)
                                .addComponent(jLabel102)
                                .addComponent(jLabel101)
                                .addComponent(jLabel137)
                                .addComponent(jLabel139))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel140)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReflejosPupilares, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel136)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel135))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLejosCorregidaOD, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCercaCorregidaOD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLejosCorregidaOI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCercaCorregidaOI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLejosSinCorregirOD, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCercaSinCorregirOD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel133)
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtLejosSinCorregirOI, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCercaSinCorregirOI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel134))))
                            .addComponent(txtVisionBinocular, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVisionColores, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel131)
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnfermedadesOculares, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel138))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel131)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel133)
                            .addComponent(jLabel134))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCercaSinCorregirOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel101))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLejosSinCorregirOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel102)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(txtCercaSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLejosSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel132)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel129)
                            .addComponent(txtVisionColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCercaCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel139))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtLejosCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel140)))
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(txtCercaCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLejosCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel136)
                                    .addComponent(jLabel135))
                                .addGap(48, 48, 48)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVisionBinocular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReflejosPupilares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnfermedadesOculares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtAntecedentes)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        jtAntecedentes.setSelectedIndex(2);
    }//GEN-LAST:event_btnNextMouseClicked

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
      
     if(!txtNorden.getText().isEmpty()){
         if(! OrdenExiste() ){
        String Sql="SELECT d.nombres_pa||' '||d.apellidos_pa as nombrecompleto,d.sexo_pa,"
                + "d.fecha_nacimiento_pa, l.txtcocaina,l.txtmarihuana\n" +
                    "from datos_paciente as d , n_orden_ocupacional as n  \n" +
                    "LEFT JOIN lab_clinico AS l ON(n.n_orden = l.n_orden)\n" +
                    "where d.cod_pa = n.cod_pa and n.n_orden='"+ txtNorden.getText().toString()+  "'";
        oConn.FnBoolQueryExecute(Sql);      
             try {
                    if (oConn.setResult.next()) {
                        
                        txtNombres.setText(oConn.setResult.getString("nombrecompleto"));
                        txtSexo.setText(oConn.setResult.getString("sexo_pa").equals("M") ? "MASCULINO":"FEMENINO");
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        String coca=oConn.setResult.getString("txtcocaina");
                         String marig=oConn.setResult.getString("txtmarihuana");
                         if("REACTIVO".equals(coca)){
//                             txtObservacionesFichaMedica.append("-COCAINA: " + coca.concat("\n"));
                             txtCoca.setForeground(Color.red);
                             txtCoca.setText(coca);
                         }else {
//                             txtObservacionesFichaMedica.append("-COCAINA: " + coca.concat("\n"));
                              txtCoca.setText(coca);
                         }
                         if("REACTIVO".equals(marig)){
//                              txtObservacionesFichaMedica.append("-MARIHUANA: " + marig.concat("\n"));
                             txtMarig.setForeground(Color.red);
                             txtMarig.setText(marig);
                         }else{
//                             txtObservacionesFichaMedica.append("-MARIHUANA: " + marig.concat("\n"));
                              txtMarig.setText(marig);
                         }
                        txtNorden.setEditable(false);
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())).concat(" AÑOS") );
                        oPe.fecha(FechaPatologicos);
                        muestraVisual();
                        Oftalmologia();
                        triaje();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Antecedentes Patologicos:" + ex.getMessage().toString());
        
            }
         }  
     }else{  oFunc.SubSistemaMensajeInformacion("Ingrese N° Orden");}
    }//GEN-LAST:event_txtNordenActionPerformed
     private void triaje(){
        String Sql = "SELECT talla, peso, "
                + "imc, cintura, icc, cadera, temperatura, f_cardiaca, sat_02, perimetro_cuello, "
                + "sistolica, diastolica, f_respiratoria FROM triaje WHERE n_orden ='" + txtNorden.getText().toString() + "'";
        oConn.FnBoolQueryExecute(Sql);
        try {
            if (oConn.setResult.next()) {
                String sistolica=oConn.setResult.getString("sistolica");
                String diastolica=oConn.setResult.getString("diastolica");
                if (!"".equals(sistolica) && !"".equals(diastolica)) {
                    float sistolica1 = Float.parseFloat(sistolica);
                    float diastolica1 = Float.parseFloat(diastolica);
                    if (sistolica1 >= 140 || diastolica1 > 90) {
                        chk27.setSelected(true);
                    }
                }
            } else {
                oFunc.SubSistemaMensajeInformacion("Despues de terminar este Formato, El Paciente debe pasar por triaje");
            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
        }
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       AddAP();
       FechaQui.setText(null);
       txtHospitalQui.setText(null);
       txtOperacionQui.setText(null);
       txtdiasHospitalizacionQui.setText(null);
       txtComplicacionesQui.setText(null);
       FechaQui.requestFocusInWindow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtdiasHospitalizacionQuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiasHospitalizacionQuiKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtdiasHospitalizacionQuiKeyTyped

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenKeyTyped

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_txtLimpiarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if(OrdenExiste() ){
            Actualizar();
        }else{
            if(!txtNorden.getText().isEmpty()){
              if(!OrdenExiste()){
                 if(validar()){ 
                try {
                        if(GrabarAPInfo()){
                           if(tbQuirurgicos.getRowCount()>0 ){
                               if(GrabarAPDetalle()){
                                imp();  
                                
                                limpiar();
                               }
                           }else{
                           imp();
                           limpiar();
                           }
                               
                           oFunc.SubSistemaMensajeInformacion("Se Registro Correctamente");
                       }
                    } catch (SQLException ex) {
                Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
                }
                 }  
            }   
         }
        }
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void rbFumarSIStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbFumarSIStateChanged
        if(rbFumarSI.isSelected()){
        txtNcigarrillos.setEditable(true);}
    }//GEN-LAST:event_rbFumarSIStateChanged

    private void rbFumarNOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbFumarNOStateChanged
        if(rbFumarNO.isSelected()){
            txtNcigarrillos.setText(null);
        txtNcigarrillos.setEditable(false);
        }
    }//GEN-LAST:event_rbFumarNOStateChanged

    private void rbLicorSIStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbLicorSIStateChanged
        if(rbLicorSI.isSelected()){
        txtLicorTipoFrecuente.setEditable(true);
        txtLicorFrecuencia.setEditable(true);
        }
    }//GEN-LAST:event_rbLicorSIStateChanged

    private void rbLicorNOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbLicorNOStateChanged
        if(rbLicorNO.isSelected()){
           txtLicorFrecuencia.setText(null);
           txtLicorTipoFrecuente.setText(null);
          txtLicorTipoFrecuente.setEditable(false);
        txtLicorFrecuencia.setEditable(false);
        }
    }//GEN-LAST:event_rbLicorNOStateChanged

    private void rbDrogasSIStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbDrogasSIStateChanged
        if(rbDrogasSI.isSelected()){
        txtDrogasTipo.setEditable(true);
        txtDrogasFrecuencia.setEditable(true);
        }
    }//GEN-LAST:event_rbDrogasSIStateChanged

    private void rbDrogasNOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbDrogasNOStateChanged
        if(rbDrogasNO.isSelected()){
            txtDrogasTipo.setText(null);
            txtDrogasFrecuencia.setText(null);
        txtDrogasTipo.setEditable(false);
        txtDrogasFrecuencia.setEditable(false);
        }
    }//GEN-LAST:event_rbDrogasNOStateChanged

    private void btnQuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuiMouseClicked
       Qui();
       String sql = "DELETE FROM antecedentes_patologicos_quirurgicos"
               + " WHERE cod_ap ='" +num+ "' RETURNING cod_ap";
        if (oConn.FnBoolQueryExecute(sql)) {
            oFunc.SubSistemaMensajeInformacion("Se ha se elimino la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo eliminar");
        }
    }//GEN-LAST:event_btnQuiMouseClicked

    private void txtVhijosVivosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVhijosVivosKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtVhijosVivosKeyTyped

    private void txtVhijosFallecidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVhijosFallecidosKeyTyped
          oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtVhijosFallecidosKeyTyped

    private void txtVnabortosParejasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVnabortosParejasKeyTyped
         oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtVnabortosParejasKeyTyped

    private void txtDinicioMestruacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDinicioMestruacionKeyTyped
      oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDinicioMestruacionKeyTyped

    private void txtDinicioVidaSexualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDinicioVidaSexualKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDinicioVidaSexualKeyTyped

    private void txtDnumParejasSexActualidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDnumParejasSexActualidadKeyTyped
         oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDnumParejasSexActualidadKeyTyped

    private void txtDhijosVivosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDhijosVivosKeyTyped
         oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDhijosVivosKeyTyped

    private void txtDhijosFallecidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDhijosFallecidosKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDhijosFallecidosKeyTyped

    private void txtDnumerosdeAbortosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDnumerosdeAbortosKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDnumerosdeAbortosKeyTyped

    private void btnIMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPActionPerformed
        ReImp();     
             
    }//GEN-LAST:event_btnIMPActionPerformed

    private void txtImpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtImpKeyTyped

    private void txtImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpActionPerformed
       ReImp();
    }//GEN-LAST:event_txtImpActionPerformed

    private void chkCigarrillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCigarrillosActionPerformed
       if(chkCigarrillos.isSelected()){
           txtNcigarrillos.setText(" CIGARRILLOS X MES.");
       }
    }//GEN-LAST:event_chkCigarrillosActionPerformed

    private void chkRonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRonActionPerformed
        if(chkRon.isSelected()){
            txtLicorTipoFrecuente.append("RON, ");
        }
    }//GEN-LAST:event_chkRonActionPerformed

    private void chkCervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCervezaActionPerformed
        if(chkCerveza.isSelected()){
            txtLicorTipoFrecuente.append(", CERVEZA. ");
        }
    }//GEN-LAST:event_chkCervezaActionPerformed

    private void chkVinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVinoActionPerformed
        if(chkVino.isSelected()){
            txtLicorTipoFrecuente.append(", VINO. ");
        }
    }//GEN-LAST:event_chkVinoActionPerformed

    private void chkWisckyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkWisckyActionPerformed
       if(chkWiscky.isSelected()){
            txtLicorTipoFrecuente.append(", WISCKY. ");
        }
    }//GEN-LAST:event_chkWisckyActionPerformed

    private void chkDrogasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDrogasActionPerformed
        if(chkDrogas.isSelected()){
            txtDrogasTipo.setText("CHACCHA HOJA DE COCA.");
        }
    }//GEN-LAST:event_chkDrogasActionPerformed

    private void chkFreDrogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFreDrogActionPerformed
        if(chkFreDrog.isSelected()){
            txtDrogasFrecuencia.setText("15 DIAS X MES. ");
        }
    }//GEN-LAST:event_chkFreDrogActionPerformed

    private void chkLicFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLicFrecuenciaActionPerformed
        if(chkLicFrecuencia.isSelected()){
            txtLicorFrecuencia.setText("1 VEZ X MES");
        }
    }//GEN-LAST:event_chkLicFrecuenciaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(!txtNorden.getText().isEmpty()){
        
        String Sql="SELECT d.nombres_pa||' '||d.apellidos_pa as nombrecompleto,d.sexo_pa,\n" +
"       d.fecha_nacimiento_pa, l.txtcocaina,l.txtmarihuana,a.cod_ap, a.fecha_ap, \n" +
"       a.chk1, a.chk2, a.chk3,a.chk4, a.chk5, a.chk6, a.chk7, a.chk8, a.chk9, a.chk10, a.chk11, a.chk12, a.chk13, \n" +
"       a.chk14, a.chk15, a.chk16, a.chk17, a.chk18, a.chk19, a.chk20, a.chk21, a.chk22, \n" +
"       a.chk23, a.chk24, a.chk25, a.chk26, a.chk27, a.chk28, a.chk29, a.chk30, a.chk31, \n" +
"       a.chk32, a.chk33, a.chk34, a.chk35, a.chk36, a.chk37, a.chk38, a.chk39, a.chk40, \n" +
"       a.chk41, a.chk42, a.chk43, a.chk44, a.chk45, a.chk46, a.chk47, a.chk48, a.chk49, \n" +
"       a.chk50, a.chk51, a.chk52, a.chk53, a.chk54, a.chk55, a.chk56, a.chk57, a.chk58, \n" +
"       a.chk59, a.chk60, a.chk61, a.chk62, a.chk63, a.chk64, a.chk65, a.chk66, a.chk67, \n" +
"       a.chk68, a.chk69, a.chk70, a.chk71, a.chk72, a.chk73, a.chk74, a.chk75, a.chk76, \n" +
"       a.chk77, a.chk78, a.chk79, a.chk80, a.chk81, a.chk82, a.chk83, a.chk84, a.chk85, \n" +
"       a.chk86, a.chk87, a.chk88, a.chk89, a.chk90, a.rbdrogasno, a.rbdrogassi, a.rblicorno, \n" +
"       a.rblicorsi, a.rbfumarno, a.rbfumarsi, a.txtdrogasfrecuencia, a.txtdrogastipo, \n" +
"       a.txtlicorfrecuencia, a.txtlicortipofrecuente, a.txtncigarrillos, a.txtvcausas, \n" +
"       a.txtvhijosvivos, a.txtvhijosfallecidos, a.txtvnabortosparejas, a.txtdiniciomestruacion, \n" +
"       a.txtdiniciovidasexual, a.txtdnumparejassexactualidad, a.txtdhijosvivos, \n" +
"       a.txtdhijosfallecidos, a.txtdnumerosdeabortos, a.txtdcausas,a.txtotrosap,a.txtotros1ap \n" +
"       from datos_paciente as d , n_orden_ocupacional as n  \n" +
"       inner JOIN antecedentes_patologicos AS a ON(n.n_orden = a.n_orden)" +
        "LEFT JOIN lab_clinico AS l ON(n.n_orden = l.n_orden)\n" +
        "where d.cod_pa = n.cod_pa and n.n_orden='"+ txtNorden.getText().toString()+  "'";
        oConn.FnBoolQueryExecute(Sql);      
             try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombrecompleto"));
                        txtSexo.setText(oConn.setResult.getString("sexo_pa").equals("M") ? "MASCULINO":"FEMENINO");
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        String coca=oConn.setResult.getString("txtcocaina");
                         String marig=oConn.setResult.getString("txtmarihuana");
                         if("REACTIVO".equals(coca)){
//                             txtObservacionesFichaMedica.append("-COCAINA: " + coca.concat("\n"));
                             txtCoca.setForeground(Color.red);
                             txtCoca.setText(coca);
                         }else {
//                             txtObservacionesFichaMedica.append("-COCAINA: " + coca.concat("\n"));
                              txtCoca.setText(coca);
                         }
                         if("REACTIVO".equals(marig)){
//                              txtObservacionesFichaMedica.append("-MARIHUANA: " + marig.concat("\n"));
                             txtMarig.setForeground(Color.red);
                             txtMarig.setText(marig);
                         }else{
//                             txtObservacionesFichaMedica.append("-MARIHUANA: " + marig.concat("\n"));
                              txtMarig.setText(marig);
                         }
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())).concat(" AÑOS") );
                        num=Integer.valueOf(oConn.setResult.getString("cod_ap"));
//                        oFunc.SubSistemaMensajeError(String.valueOf(num));
                        FechaPatologicos.setDate(oConn.setResult.getDate("fecha_ap"));
                        chk1.setSelected(oConn.setResult.getBoolean("chk1"));
                        chk2.setSelected(oConn.setResult.getBoolean("chk2"));
                        chk3.setSelected(oConn.setResult.getBoolean("chk3"));
                        chk4.setSelected(oConn.setResult.getBoolean("chk4"));
                        chk5.setSelected(oConn.setResult.getBoolean("chk5"));
                        chk6.setSelected(oConn.setResult.getBoolean("chk6"));
                        chk7.setSelected(oConn.setResult.getBoolean("chk7"));
                        chk8.setSelected(oConn.setResult.getBoolean("chk8"));
                        chk9.setSelected(oConn.setResult.getBoolean("chk9"));
                        chk10.setSelected(oConn.setResult.getBoolean("chk10"));
                        chk11.setSelected(oConn.setResult.getBoolean("chk11"));
                        chk12.setSelected(oConn.setResult.getBoolean("chk12"));
                        chk13.setSelected(oConn.setResult.getBoolean("chk13"));
                        chk14.setSelected(oConn.setResult.getBoolean("chk14"));
                        chk15.setSelected(oConn.setResult.getBoolean("chk15"));
                        chk16.setSelected(oConn.setResult.getBoolean("chk16"));
                        chk17.setSelected(oConn.setResult.getBoolean("chk17"));
                        chk18.setSelected(oConn.setResult.getBoolean("chk18"));
                        chk19.setSelected(oConn.setResult.getBoolean("chk19"));
                        chk20.setSelected(oConn.setResult.getBoolean("chk20"));
                        chk21.setSelected(oConn.setResult.getBoolean("chk21"));
                        chk22.setSelected(oConn.setResult.getBoolean("chk22"));
                        chk23.setSelected(oConn.setResult.getBoolean("chk23"));
                        chk24.setSelected(oConn.setResult.getBoolean("chk24"));
                        chk25.setSelected(oConn.setResult.getBoolean("chk25"));
                        chk26.setSelected(oConn.setResult.getBoolean("chk26"));
                        chk27.setSelected(oConn.setResult.getBoolean("chk27"));
                        chk28.setSelected(oConn.setResult.getBoolean("chk28"));
                        chk29.setSelected(oConn.setResult.getBoolean("chk29"));
                        chk30.setSelected(oConn.setResult.getBoolean("chk30"));
                        chk31.setSelected(oConn.setResult.getBoolean("chk31"));
                        chk32.setSelected(oConn.setResult.getBoolean("chk32"));
                        chk33.setSelected(oConn.setResult.getBoolean("chk33"));
                        chk34.setSelected(oConn.setResult.getBoolean("chk34"));
                        chk35.setSelected(oConn.setResult.getBoolean("chk35"));
                        chk36.setSelected(oConn.setResult.getBoolean("chk36"));
                        chk37.setSelected(oConn.setResult.getBoolean("chk37"));
                        chk38.setSelected(oConn.setResult.getBoolean("chk38"));
                        chk39.setSelected(oConn.setResult.getBoolean("chk39"));
                        chk40.setSelected(oConn.setResult.getBoolean("chk40"));
                        chk41.setSelected(oConn.setResult.getBoolean("chk41"));
                        chk42.setSelected(oConn.setResult.getBoolean("chk42"));
                        chk43.setSelected(oConn.setResult.getBoolean("chk43"));
                        chk44.setSelected(oConn.setResult.getBoolean("chk44"));
                        chk45.setSelected(oConn.setResult.getBoolean("chk45"));
                        chk46.setSelected(oConn.setResult.getBoolean("chk46"));
                        chk47.setSelected(oConn.setResult.getBoolean("chk47"));
                        chk48.setSelected(oConn.setResult.getBoolean("chk48"));
                        chk49.setSelected(oConn.setResult.getBoolean("chk49"));
                        chk50.setSelected(oConn.setResult.getBoolean("chk50"));
                        chk51.setSelected(oConn.setResult.getBoolean("chk51"));
                        chk52.setSelected(oConn.setResult.getBoolean("chk52"));
                        chk53.setSelected(oConn.setResult.getBoolean("chk53"));
                        chk54.setSelected(oConn.setResult.getBoolean("chk54"));
                        chk55.setSelected(oConn.setResult.getBoolean("chk55"));
                        chk56.setSelected(oConn.setResult.getBoolean("chk56"));
                        chk57.setSelected(oConn.setResult.getBoolean("chk57"));
                        chk58.setSelected(oConn.setResult.getBoolean("chk58"));
                        chk59.setSelected(oConn.setResult.getBoolean("chk59"));
                        chk60.setSelected(oConn.setResult.getBoolean("chk60"));
                        chk61.setSelected(oConn.setResult.getBoolean("chk61"));
                        chk62.setSelected(oConn.setResult.getBoolean("chk62"));
                        chk63.setSelected(oConn.setResult.getBoolean("chk63"));
                        chk64.setSelected(oConn.setResult.getBoolean("chk64"));
                        chk65.setSelected(oConn.setResult.getBoolean("chk65"));
                        chk66.setSelected(oConn.setResult.getBoolean("chk66"));
                        chk67.setSelected(oConn.setResult.getBoolean("chk67"));
                        chk68.setSelected(oConn.setResult.getBoolean("chk68"));
                        chk69.setSelected(oConn.setResult.getBoolean("chk69"));
                        chk70.setSelected(oConn.setResult.getBoolean("chk70"));
                        chk71.setSelected(oConn.setResult.getBoolean("chk71"));
                        chk72.setSelected(oConn.setResult.getBoolean("chk72"));
                        chk73.setSelected(oConn.setResult.getBoolean("chk73"));
                        chk74.setSelected(oConn.setResult.getBoolean("chk74"));
                        chk75.setSelected(oConn.setResult.getBoolean("chk75"));
                        chk76.setSelected(oConn.setResult.getBoolean("chk76"));
                        chk77.setSelected(oConn.setResult.getBoolean("chk77"));
                        chk78.setSelected(oConn.setResult.getBoolean("chk78"));
                        chk79.setSelected(oConn.setResult.getBoolean("chk79"));
                        chk80.setSelected(oConn.setResult.getBoolean("chk80"));
                        chk81.setSelected(oConn.setResult.getBoolean("chk81"));
                        chk82.setSelected(oConn.setResult.getBoolean("chk82"));
                        chk83.setSelected(oConn.setResult.getBoolean("chk83"));
                        chk84.setSelected(oConn.setResult.getBoolean("chk84"));
                        chk85.setSelected(oConn.setResult.getBoolean("chk85"));
                        chk86.setSelected(oConn.setResult.getBoolean("chk86"));
                        chk87.setSelected(oConn.setResult.getBoolean("chk87"));
                        chk88.setSelected(oConn.setResult.getBoolean("chk88"));
                        chk89.setSelected(oConn.setResult.getBoolean("chk89"));
                        chk90.setSelected(oConn.setResult.getBoolean("chk90"));
                        rbDrogasNO.setSelected(oConn.setResult.getBoolean("rbdrogasno"));
                        rbDrogasSI.setSelected(oConn.setResult.getBoolean("rbdrogassi"));
                        rbLicorNO.setSelected(oConn.setResult.getBoolean("rblicorno"));
                        rbLicorSI.setSelected(oConn.setResult.getBoolean("rblicorsi"));
                        rbFumarNO.setSelected(oConn.setResult.getBoolean("rbfumarno"));
                        rbFumarSI.setSelected(oConn.setResult.getBoolean("rbfumarsi"));
                        txtDrogasFrecuencia.setText(oConn.setResult.getString("txtdrogasfrecuencia"));
                        txtDrogasTipo.setText(oConn.setResult.getString("txtdrogastipo"));
                        txtLicorFrecuencia.setText(oConn.setResult.getString("txtlicorfrecuencia"));
                        txtLicorTipoFrecuente.setText(oConn.setResult.getString("txtlicortipofrecuente"));
                        txtNcigarrillos.setText(oConn.setResult.getString("txtncigarrillos"));
                        txtVcausas.setText(oConn.setResult.getString("txtvcausas"));
                        txtVhijosVivos.setText(oConn.setResult.getString("txtvhijosvivos"));
                        txtVhijosFallecidos.setText(oConn.setResult.getString("txtvhijosfallecidos"));
                        txtVnabortosParejas.setText(oConn.setResult.getString("txtvnabortosparejas"));
                        txtDinicioMestruacion.setText(oConn.setResult.getString("txtdiniciomestruacion"));
                        txtDinicioVidaSexual.setText(oConn.setResult.getString("txtdiniciovidasexual"));
                        txtDnumParejasSexActualidad.setText(oConn.setResult.getString("txtdnumparejassexactualidad"));
                        txtDhijosVivos.setText(oConn.setResult.getString("txtdhijosvivos"));
                        txtDhijosFallecidos.setText(oConn.setResult.getString("txtdhijosfallecidos"));
                        txtDnumerosdeAbortos.setText(oConn.setResult.getString("txtdnumerosdeabortos"));
                        txtDcausas.setText(oConn.setResult.getString("txtdcausas"));
                        txtotrosap.setText(oConn.setResult.getString("txtotrosap"));
                        txtotros1ap.setText(oConn.setResult.getString("txtotros1ap"));
                        muestraVisual();
                        Oftalmologia();
                        detalleantecedentes();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Antecedentes Patologicos:" + ex.getMessage().toString());
            }
          
     }else{  oFunc.SubSistemaMensajeInformacion("Ingrese N° Orden");}
    }//GEN-LAST:event_btnEditarActionPerformed
  private void muestraVisual(){
        String sql="SELECT o.v_cerca_s_od, o.v_cerca_s_oi,\n" +
"          CASE  WHEN ol.v_cerca_c_od IS NULL THEN o.v_cerca_c_od  ELSE ol.v_cerca_c_od  END as ODCC, \n" +
"          CASE  WHEN ol.v_cerca_c_oi IS NULL THEN o.v_cerca_c_oi  ELSE ol.v_cerca_c_oi  END as OICC, \n" +
"          o.v_lejos_s_od, o.v_lejos_s_oi, \n" +
"	  CASE  WHEN ol.v_lejos_c_od IS NULL THEN o.v_lejos_c_od  ELSE ol.v_lejos_c_od  END as ODLC, \n" +
"          CASE  WHEN ol.v_lejos_c_oi IS NULL THEN o.v_lejos_c_oi  ELSE ol.v_lejos_c_oi  END as OILC, \n" +
"	  CASE  WHEN ol.v_colores IS NULL THEN o.v_colores  ELSE ol.v_colores  END as VC, \n" +
"          CASE  WHEN ol.v_binocular IS NULL THEN o.v_binocular  ELSE ol.v_binocular  END as VB, \n" +
"          CASE  WHEN ol.r_pupilares IS NULL THEN o.r_pupilares  ELSE ol.r_pupilares  END as RP, o.e_oculares\n" +
"     FROM oftalmologia as o\n" +
"     left JOIN oftalmologia_lo as ol on (o.n_orden=ol.n_orden)\n" +
"     WHERE o.n_orden ='"+txtNorden.getText().toString()+"'";
         oConn.FnBoolQueryExecute(sql);      
             try {
                    if (oConn.setResult.next()) {                        
                        txtCercaSinCorregirOD.setText(oConn.setResult.getString("v_cerca_s_od"));
                        txtCercaSinCorregirOI.setText(oConn.setResult.getString("v_cerca_s_oi"));
                        txtLejosSinCorregirOD.setText(oConn.setResult.getString("v_lejos_s_od"));
                        txtLejosSinCorregirOI.setText(oConn.setResult.getString("v_lejos_s_oi"));
                       
                        txtCercaCorregidaOD.setText(oConn.setResult.getString("ODCC"));
                        txtCercaCorregidaOI.setText(oConn.setResult.getString("OICC"));
                        txtLejosCorregidaOD.setText(oConn.setResult.getString("ODLC"));
                        txtLejosCorregidaOI.setText(oConn.setResult.getString("OILC"));
                        txtVisionColores.setText(oConn.setResult.getString("VC"));
                        txtVisionBinocular.setText(oConn.setResult.getString("VB"));
                        txtReflejosPupilares.setText(oConn.setResult.getString("RP"));
                        
                       txtEnfermedadesOculares.setText(oConn.setResult.getString("e_oculares"));
                        
                       
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registros en oftalmologia");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
            }
        
    }
  private void detalleantecedentes(){
//    String [] titulos={"N°Orden","Hospital","Operacion","Dias","complicaciones","Fecha"};
    String [] registros = new String[5];
      String sql = "SELECT cod_ap,hospital_operacion, operacion, dias_hospitalizado, complicaciones, \n" +
                    "       fecha\n" +
                    "  FROM antecedentes_patologicos_quirurgicos "
               + "WHERE cod_ap ='" + num + "'";

    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("fecha");
                    registros[1]= oConn.setResult.getString("hospital_operacion");
                    registros[2]= oConn.setResult.getString("operacion");
                    registros[3]= oConn.setResult.getString("dias_hospitalizado");
                    registros[4]=oConn.setResult.getString("complicaciones");
                    
                     model.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  tbQuirurgicos.setModel(model);
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  }
    private void Oftalmologia(){
        String Sql="SELECT o.e_oculares,e_oculares1 "
                + "from n_orden_ocupacional as n"
                + " inner join oftalmologia as o ON(n.n_orden = o.n_orden) \n" 
                +"where n.n_orden='"+ txtNorden.getText().toString()+  "'";
        oConn.FnBoolQueryExecute(Sql);      
             try {
                    if (oConn.setResult.next()) {
                        String enf=oConn.setResult.getString("e_oculares");
                        String enf1=oConn.setResult.getString("e_oculares1");
                        oFunc.SubSistemaMensajeInformacion(enf);
                        if(enf != null && enf!=""|| enf1!=null || enf1!="" ){
                           if(!"NINGUNA".equals(enf) ){
                               chk14.setSelected(true);
                           }
                            
                        }else{
                            oFunc.SubSistemaMensajeError("No se encuentra registro de enfermedades ocualres");
                        }
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Oftlamologia" + ex.getMessage().toString());
        
            }
    }
    public boolean OrdenImp()
    {
        
        boolean bResultado=false;
        if(!txtImp.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from antecedentes_patologicos Where n_orden ="+txtImp.getText().toString();
        
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
    public boolean OrdenExiste()
    {
        
        boolean bResultado=false;
        if(!txtNorden.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from antecedentes_patologicos Where n_orden ="+txtNorden.getText().toString();
        
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
             
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        
    
        }
private boolean GrabarAPInfo() throws SQLException{
        boolean bResult = false;
        
        String strSqlStmt;
             
             strSqlStmt="INSERT INTO antecedentes_patologicos("
                     + "n_orden, edad_ap, fecha_ap, dni_user, chk1, chk2, chk3,"
                     + "chk4, chk5, chk6, chk7, chk8, chk9, chk10, chk11, chk12, chk13," 
                     + "chk14, chk15, chk16, chk17, chk18, chk19, chk20, chk21, chk22," 
                     + "chk23, chk24, chk25, chk26, chk27, chk28, chk29, chk30, chk31,"
                     + "chk32, chk33, chk34, chk35, chk36, chk37, chk38, chk39, chk40,"
                     + "chk41, chk42, chk43, chk44, chk45, chk46, chk47, chk48, chk49,"
                     + "chk50, chk51, chk52, chk53, chk54, chk55, chk56, chk57, chk58,"
                     + "chk59, chk60, chk61, chk62, chk63, chk64, chk65, chk66, chk67,"
                     + "chk68, chk69, chk70, chk71, chk72, chk73, chk74, chk75, chk76,"
                     + "chk77, chk78, chk79, chk80, chk81, chk82, chk83, chk84, chk85, "
                     + "chk86, chk87, chk88, chk89, rbdrogasno, rbdrogassi, rblicorno,"
                     + "rblicorsi, rbfumarno, rbfumarsi, ";                   
                    
            String  Query="Values('"+txtNorden.getText().toString()+"','"+txtEdad.getText()+"','"+FechaPatologicos.getDate()+"','"+clsGlobales.sDniOperador+"','";
                    Query+= chk1.isSelected()+"','"+chk2.isSelected()+"','"+chk3.isSelected()+"','"+chk4.isSelected()+"','"+chk5.isSelected()+"','"+chk6.isSelected()+"','"+chk7.isSelected()+"','"+chk8.isSelected()+"','"+chk9.isSelected()+"','";
                    Query+= chk10.isSelected()+"','"+chk11.isSelected()+"','"+chk12.isSelected()+"','"+chk13.isSelected()+"','"+chk14.isSelected()+"','"+chk15.isSelected()+"','"+chk16.isSelected()+"','"+chk17.isSelected()+"','"+chk18.isSelected()+"','";
                    Query+= chk19.isSelected()+"','"+chk20.isSelected()+"','"+chk21.isSelected()+"','"+chk22.isSelected()+"','"+chk23.isSelected()+"','"+chk24.isSelected()+"','"+chk25.isSelected()+"','"+chk26.isSelected()+"','"+chk27.isSelected()+"','";
                    Query+= chk28.isSelected()+"','"+chk29.isSelected()+"','"+chk30.isSelected()+"','"+chk31.isSelected()+"','"+chk32.isSelected()+"','"+chk33.isSelected()+"','"+chk34.isSelected()+"','"+chk35.isSelected()+"','";
                    Query+= chk36.isSelected()+"','"+chk37.isSelected()+"','"+chk38.isSelected()+"','"+chk39.isSelected()+"','"+chk40.isSelected()+"','"+chk41.isSelected()+"','"+chk42.isSelected()+"','"+chk43.isSelected()+"','";
                    Query+= chk44.isSelected()+"','"+chk45.isSelected()+"','"+chk46.isSelected()+"','"+chk47.isSelected()+"','"+chk48.isSelected()+"','"+chk49.isSelected()+"','"+chk50.isSelected()+"','"+chk51.isSelected()+"','"+chk52.isSelected()+"','";
                    Query+= chk53.isSelected()+"','"+chk54.isSelected()+"','"+chk55.isSelected()+"','"+chk56.isSelected()+"','"+chk57.isSelected()+"','"+chk58.isSelected()+"','"+chk59.isSelected()+"','"+chk60.isSelected()+"','"+chk61.isSelected()+"','";
                    Query+= chk62.isSelected()+"','"+chk63.isSelected()+"','"+chk64.isSelected()+"','"+chk65.isSelected()+"','"+chk66.isSelected()+"','"+chk67.isSelected()+"','"+chk68.isSelected()+"','"+chk69.isSelected()+"','"+chk70.isSelected()+"','";
                    Query+= chk71.isSelected()+"','"+chk72.isSelected()+"','"+chk73.isSelected()+"','"+chk74.isSelected()+"','"+chk75.isSelected()+"','"+chk76.isSelected()+"','"+chk77.isSelected()+"','"+chk78.isSelected()+"','"+chk79.isSelected()+"','";
                    Query+= chk80.isSelected()+"','"+chk81.isSelected()+"','"+chk82.isSelected()+"','"+chk83.isSelected()+"','"+chk84.isSelected()+"','"+chk85.isSelected()+"','"+chk86.isSelected()+"','"+chk87.isSelected()+"','"+chk88.isSelected()+"','";
                    Query+= chk89.isSelected()+"','"+rbDrogasNO.isSelected()+"','"+rbDrogasSI.isSelected()+"','"+rbLicorNO.isSelected()+"','"+rbLicorSI.isSelected()+"','"+rbFumarNO.isSelected()+"','"+rbFumarSI.isSelected()+"',";
                     if(txtDrogasFrecuencia.getText().trim().length()>= 1){
                         strSqlStmt+= "txtdrogasfrecuencia, ";
                         Query+= "'"+ txtDrogasFrecuencia.getText()+"',";                         
                     }
                     if(txtDrogasTipo.getText().trim().length()>= 1){
                          strSqlStmt+= "txtdrogastipo, ";
                         Query+= "'"+txtDrogasTipo.getText()+"',";
                     }
                     if(txtLicorTipoFrecuente.getText().trim().length()>= 1){
                         strSqlStmt+= "txtlicortipofrecuente, ";
                         Query+= "'"+txtLicorTipoFrecuente.getText() +"',";
                     }
                     if(txtLicorFrecuencia.getText().trim().length()>= 1){
                         strSqlStmt+= "txtLicorFrecuencia,";
                         Query+= "'"+txtLicorFrecuencia.getText()+"',";
                     }
                     if(txtNcigarrillos.getText().trim().length()>= 1){
                         strSqlStmt+= "txtncigarrillos, ";
                         Query+= "'"+txtNcigarrillos.getText()+"',";
                     }
                     if(txtVcausas.getText().trim().length()>= 1){
                         strSqlStmt+= "txtvcausas, ";
                         Query+= "'"+txtVcausas.getText()+"',";
                     }
                     if(txtVhijosVivos.getText().trim().length()>= 1){
                         strSqlStmt+= "txtvhijosvivos, ";
                         Query+="'"+ txtVhijosVivos.getText()+"',";
                     }
                     if(txtVhijosFallecidos.getText().trim().length()>= 1){
                         strSqlStmt+= "txtvhijosfallecidos, ";
                         Query+="'"+ txtVhijosFallecidos.getText()+"',";
                     }
                     if(txtVnabortosParejas.getText().trim().length()>= 1){
                         strSqlStmt+= "txtvnabortosparejas, ";
                         Query+= "'"+txtVnabortosParejas.getText()+"',";
                     }
                     if(txtDinicioMestruacion.getText().trim().length()>= 1){
                         strSqlStmt+= "txtdiniciomestruacion, ";
                         Query+="'"+ txtDinicioMestruacion.getText()+"',";
                     }
                     if(txtDinicioVidaSexual.getText().trim().length()>= 1){
                         strSqlStmt+= "txtdiniciovidasexual, ";
                         Query+= "'"+txtDinicioVidaSexual.getText()+"',";
                     }
                     if(txtDnumParejasSexActualidad.getText().trim().length()>= 1){
                         strSqlStmt+= "txtdnumparejassexactualidad, ";
                         Query+= "'"+txtDnumParejasSexActualidad.getText()+"',";
                     }
                      if(txtDhijosVivos.getText().trim().length()>= 1){
                          strSqlStmt+= "txtdhijosvivos, ";
                          Query+= "'"+txtDhijosVivos.getText()+"',";
                      }
                     if(txtDhijosFallecidos.getText().trim().length()>= 1){
                         strSqlStmt+= "txtdhijosfallecidos, ";
                         Query+= "'"+txtDhijosFallecidos.getText()+"',";
                     }
                     if(txtDnumerosdeAbortos.getText().trim().length()>= 1){
                         strSqlStmt+= "txtdnumerosdeabortos, ";
                         Query+= "'"+txtDnumerosdeAbortos.getText()+"',";
                     }
                     if(txtDcausas.getText().trim().length()>= 1){
                         strSqlStmt+= "txtdcausas, ";
                         Query+= "'"+txtDcausas.getText()+"',";
                     }
                     if(txtotrosap.getText().trim().length()>= 1){
                         strSqlStmt+= "txtotrosap, ";
                         Query+= "'"+txtotrosap.getText()+"',";
                     }
                     if(txtotros1ap.getText().trim().length()>= 1){
                         strSqlStmt+= "txtotros1ap, ";
                         Query+= "'"+txtotros1ap.getText()+"',";
                     }
                     
             strSqlStmt +=  "chk90)";
             Query+= "'"+chk90.isSelected()+"') RETURNING cod_ap;";
                                   
   
               if (oConn.FnBoolQueryExecute(strSqlStmt + Query)){
                
                   oConn.setResult.next();
                 num = Integer.valueOf(oConn.setResult.getString("cod_ap"));
                  
                   bResult = true;
               }
                              
                else{
             //oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
                  return bResult;
                  
        }
private boolean ActualizarAPInfo()throws SQLException{
    boolean bResult = false;
        String strSqlStmt;
        strSqlStmt="UPDATE antecedentes_patologicos ";       
            String  Query="SET edad_ap='"+txtEdad.getText()+"',fecha_ap='"+FechaPatologicos.getDate()+"',dni_user='"+clsGlobales.sDniOperador+"',";
                    Query+= "chk1='"+chk1.isSelected()+"',chk2='"+chk2.isSelected()+"',chk3='"+chk3.isSelected()+"',chk4='"+chk4.isSelected()+"',chk5='"+chk5.isSelected()+"',"
                            + "chk6='"+chk6.isSelected()+"',chk7='"+chk7.isSelected()+"',chk8='"+chk8.isSelected()+"',chk9='"+chk9.isSelected()+"',";
                    Query+= "chk10='"+chk10.isSelected()+"',chk11='"+chk11.isSelected()+"',chk12='"+chk12.isSelected()+"',chk13='"+chk13.isSelected()+"',chk14='"+chk14.isSelected()+"',"
                            + "chk15='"+chk15.isSelected()+"',chk16='"+chk16.isSelected()+"',chk17='"+chk17.isSelected()+"',chk18='"+chk18.isSelected()+"',";
                    Query+= "chk19='"+chk19.isSelected()+"',chk20='"+chk20.isSelected()+"',chk21='"+chk21.isSelected()+"',chk22='"+chk22.isSelected()+"',"
                            + "chk23='"+chk23.isSelected()+"',chk24='"+chk24.isSelected()+"',chk25='"+chk25.isSelected()+"',chk26='"+chk26.isSelected()+"',"
                            + "chk27='"+chk27.isSelected()+"',";
                    Query+= "chk28='"+chk28.isSelected()+"',chk29='"+chk29.isSelected()+"',chk30='"+chk30.isSelected()+"',chk31='"+chk31.isSelected()+"',"
                            + "chk32='"+chk32.isSelected()+"',chk33='"+chk33.isSelected()+"',chk34='"+chk34.isSelected()+"',chk35='"+chk35.isSelected()+"',";
                    Query+= "chk36='"+chk36.isSelected()+"',chk37='"+chk37.isSelected()+"',chk38='"+chk38.isSelected()+"',chk39='"+chk39.isSelected()+"',"
                            + "chk40='"+chk40.isSelected()+"',chk41='"+chk41.isSelected()+"',chk42='"+chk42.isSelected()+"',chk43='"+chk43.isSelected()+"',";
                    Query+= "chk44='"+chk44.isSelected()+"',chk45='"+chk45.isSelected()+"',chk46='"+chk46.isSelected()+"',chk47='"+chk47.isSelected()+"',"
                            + "chk48='"+chk48.isSelected()+"',chk49='"+chk49.isSelected()+"',chk50='"+chk50.isSelected()+"',chk51='"+chk51.isSelected()+"',"
                            + "chk52='"+chk52.isSelected()+"',";
                    Query+= "chk53='"+chk53.isSelected()+"',chk54='"+chk54.isSelected()+"',chk55='"+chk55.isSelected()+"',chk56='"+chk56.isSelected()+"',"
                            + "chk57='"+chk57.isSelected()+"',chk58='"+chk58.isSelected()+"',chk59='"+chk59.isSelected()+"',chk60='"+chk60.isSelected()+"',"
                            + "chk61='"+chk61.isSelected()+"',";
                    Query+= "chk62='"+chk62.isSelected()+"',chk63='"+chk63.isSelected()+"',chk64='"+chk64.isSelected()+"',chk65='"+chk65.isSelected()+"',"
                            + "chk66='"+chk66.isSelected()+"',chk67='"+chk67.isSelected()+"',chk68='"+chk68.isSelected()+"',chk69='"+chk69.isSelected()+"',"
                            + "chk70='"+chk70.isSelected()+"',";
                    Query+= "chk71='"+chk71.isSelected()+"',chk72='"+chk72.isSelected()+"',chk73='"+chk73.isSelected()+"',chk74='"+chk74.isSelected()+"',"
                            + "chk75='"+chk75.isSelected()+"',chk76='"+chk76.isSelected()+"',chk77='"+chk77.isSelected()+"',chk78='"+chk78.isSelected()+"',"
                            + "chk79='"+chk79.isSelected()+"',";
                    Query+= "chk80='"+chk80.isSelected()+"',chk81='"+chk81.isSelected()+"',chk82='"+chk82.isSelected()+"',chk83='"+chk83.isSelected()+"',"
                            + "chk84='"+chk84.isSelected()+"',chk85='"+chk85.isSelected()+"',chk86='"+chk86.isSelected()+"',chk87='"+chk87.isSelected()+"',"
                            + "chk88='"+chk88.isSelected()+"',";
                    Query+= "chk89='"+chk89.isSelected()+"',rbdrogasno='"+rbDrogasNO.isSelected()+"',rbdrogassi='"+rbDrogasSI.isSelected()+"',"
                            + "rblicorno='"+rbLicorNO.isSelected()+"',rblicorsi='"+rbLicorSI.isSelected()+"',rbfumarno='"+rbFumarNO.isSelected()+"',"
                            + "rbfumarsi='"+rbFumarSI.isSelected()+"',";
                     if(txtDrogasFrecuencia.getText().trim().length()>= 1){
                         Query+= "txtdrogasfrecuencia='"+ txtDrogasFrecuencia.getText()+"',";                         
                     }
                     if(txtDrogasTipo.getText().trim().length()>= 1){
                         Query+= "txtdrogastipo='"+txtDrogasTipo.getText()+"',";
                     }
                     if(txtLicorTipoFrecuente.getText().trim().length()>= 1){
                         
                         Query+= "txtlicortipofrecuente='"+txtLicorTipoFrecuente.getText() +"',";
                     }
                     if(txtLicorFrecuencia.getText().trim().length()>= 1){
                         
                         Query+= "txtLicorFrecuencia='"+txtLicorFrecuencia.getText()+"',";
                     }
                     if(txtNcigarrillos.getText().trim().length()>= 1){
                        
                         Query+= "txtncigarrillos='"+txtNcigarrillos.getText()+"',";
                     }
                     if(txtVcausas.getText().trim().length()>= 1){
                         Query+= "txtvcausas='"+txtVcausas.getText()+"',";
                     }
                     if(txtVhijosVivos.getText().trim().length()>= 1){
                         
                         Query+="txtvhijosvivos='"+ txtVhijosVivos.getText()+"',";
                     }
                     if(txtVhijosFallecidos.getText().trim().length()>= 1){
                        
                         Query+="txtvhijosfallecidos='"+ txtVhijosFallecidos.getText()+"',";
                     }
                     if(txtVnabortosParejas.getText().trim().length()>= 1){
                    
                         Query+= "txtvnabortosparejas='"+txtVnabortosParejas.getText()+"',";
                     }
                     if(txtDinicioMestruacion.getText().trim().length()>= 1){
                         
                         Query+="txtdiniciomestruacion='"+ txtDinicioMestruacion.getText()+"',";
                     }
                     if(txtDinicioVidaSexual.getText().trim().length()>= 1){
                       
                         Query+= "txtdiniciovidasexual='"+txtDinicioVidaSexual.getText()+"',";
                     }
                     if(txtDnumParejasSexActualidad.getText().trim().length()>= 1){
                         
                         Query+= "txtdnumparejassexactualidad='"+txtDnumParejasSexActualidad.getText()+"',";
                     }
                      if(txtDhijosVivos.getText().trim().length()>= 1){
                        
                          Query+= "txtdhijosvivos='"+txtDhijosVivos.getText()+"',";
                      }
                     if(txtDhijosFallecidos.getText().trim().length()>= 1){
                       
                         Query+= "txtdhijosfallecidos='"+txtDhijosFallecidos.getText()+"',";
                     }
                     if(txtDnumerosdeAbortos.getText().trim().length()>= 1){
                         Query+= "txtdnumerosdeabortos='"+txtDnumerosdeAbortos.getText()+"',";
                     }
                     if(txtDcausas.getText().trim().length()>= 1){
                         Query+= "txtdcausas='"+txtDcausas.getText()+"',";
                     }
                     if(txtotrosap.getText().trim().length()>= 1){
                         Query+= "txtotrosap='"+txtotrosap.getText()+"',";
                     }
                     if(txtotros1ap.getText().trim().length()>= 1){
                         Query+= "txtotros1ap='"+txtotros1ap.getText()+"',";
                     }
                     
             Query+= "chk90='"+chk90.isSelected()+"' where n_orden='"+txtNorden.getText()+"' RETURNING cod_ap;";
//             oFunc.SubSistemaMensajeError(strSqlStmt+Query);
               if (oConn.FnBoolQueryExecute(strSqlStmt + Query)){
                 bResult = true;
               }
                              
                else{
             //oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
               return bResult;   
        }
private void ReImp(){
if(!txtImp.getText().isEmpty()){
            if(OrdenImp()){
                if (imprimir1(Integer.valueOf(txtImp.getText()))){
                imprimir2(Integer.valueOf(txtImp.getText()));
                 }
            }else {oFunc.SubSistemaMensajeError("Numero de Orden no Existe"); txtImp.setText(null); txtImp.requestFocus();
            }
            
            
            }else{
           
        
        }

}
private boolean GrabarAPDetalle() {
         boolean bResult = false;
                      
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String Fecha, HospitalQui, OperacionQui, diasHospitalizacionQui, ComplicacionesQui;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbQuirurgicos.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            Fecha = tbQuirurgicos.getModel().getValueAt(iFila, 0).toString();
            HospitalQui = tbQuirurgicos.getModel().getValueAt(iFila, 1).toString();
            OperacionQui = tbQuirurgicos.getModel().getValueAt(iFila, 2).toString();
            diasHospitalizacionQui = tbQuirurgicos.getModel().getValueAt(iFila, 3).toString();
            ComplicacionesQui = tbQuirurgicos.getModel().getValueAt(iFila, 4).toString();
        
           
           strSqlStmt="INSERT INTO antecedentes_patologicos_quirurgicos(cod_ap, fecha, hospital_operacion, operacion, dias_hospitalizado, complicaciones)";
                                      
                    strSqlStmt = strSqlStmt + " Values ('";
//                    oFunc.SubSistemaMensajeError(String.valueOf(num));
                    strSqlStmt += num+"','";
                    strSqlStmt += Fecha+"','";
                    strSqlStmt += HospitalQui+"','";
                    strSqlStmt += OperacionQui+"','";
                    strSqlStmt += diasHospitalizacionQui+"','";
                    strSqlStmt += ComplicacionesQui+"')";
                    
                    // Ejecuta la Sentencia
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                        bResult = true;
                        
                    }
                  }
         return bResult;
    }
public void Actualizar(){
     if(!txtNorden.getText().isEmpty()){
                 if(validar()){ 
                     try {
                         if(ActualizarAPInfo()){
                             if(tbQuirurgicos.getRowCount()>0 ){
                                 if(GrabarAPDetalle()){
                                     imp();
                                     limpiar();
                                 }
                             }else{
                                 imp();
                                 limpiar();
                             }
                             oFunc.SubSistemaMensajeInformacion("Se Actualizo Correctamente");
                         }
                     } catch (SQLException ex) {
                         Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }  
              
         }
}
private boolean ActualizarAPDetalle()
    {
         boolean bResult = false;
                      
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String Fecha, HospitalQui, OperacionQui, diasHospitalizacionQui, ComplicacionesQui;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbQuirurgicos.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            Fecha = tbQuirurgicos.getModel().getValueAt(iFila, 0).toString();
            HospitalQui = tbQuirurgicos.getModel().getValueAt(iFila, 1).toString();
            OperacionQui = tbQuirurgicos.getModel().getValueAt(iFila, 2).toString();
            diasHospitalizacionQui = tbQuirurgicos.getModel().getValueAt(iFila, 3).toString();
            ComplicacionesQui = tbQuirurgicos.getModel().getValueAt(iFila, 4).toString();
        
        
           strSqlStmt="UPDATE antecedentes_patologicos_quirurgicos "; 
                    strSqlStmt = strSqlStmt + " SET fecha='"+ Fecha+"',hospital_operacion='"+ HospitalQui+"',"
                            + "operacion='"+ OperacionQui+"',dias_hospitalizado='"+diasHospitalizacionQui+"',"
                            + "complicaciones='"+ComplicacionesQui+"' ";
                    strSqlStmt+="where cod_ap='"+num+"'";
                    // Ejecuta la Sentencia
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                        bResult = true;
                        
                    }
                  }
         return bResult;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaPatologicos;
    private javax.swing.JTextField FechaQui;
    private javax.swing.JScrollPane atxtObservacionesAltura;
    private javax.swing.ButtonGroup bgDrogras;
    private javax.swing.ButtonGroup bgFumar;
    private javax.swing.ButtonGroup bgLicor;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnIMP;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnQui;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk10;
    private javax.swing.JCheckBox chk11;
    private javax.swing.JCheckBox chk12;
    private javax.swing.JCheckBox chk13;
    private javax.swing.JCheckBox chk14;
    private javax.swing.JCheckBox chk15;
    private javax.swing.JCheckBox chk16;
    private javax.swing.JCheckBox chk17;
    private javax.swing.JCheckBox chk18;
    private javax.swing.JCheckBox chk19;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk20;
    private javax.swing.JCheckBox chk21;
    private javax.swing.JCheckBox chk22;
    private javax.swing.JCheckBox chk23;
    private javax.swing.JCheckBox chk24;
    private javax.swing.JCheckBox chk25;
    private javax.swing.JCheckBox chk26;
    private javax.swing.JCheckBox chk27;
    private javax.swing.JCheckBox chk28;
    private javax.swing.JCheckBox chk29;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk30;
    private javax.swing.JCheckBox chk31;
    private javax.swing.JCheckBox chk32;
    private javax.swing.JCheckBox chk33;
    private javax.swing.JCheckBox chk34;
    private javax.swing.JCheckBox chk35;
    private javax.swing.JCheckBox chk36;
    private javax.swing.JCheckBox chk37;
    private javax.swing.JCheckBox chk38;
    private javax.swing.JCheckBox chk39;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk40;
    private javax.swing.JCheckBox chk41;
    private javax.swing.JCheckBox chk42;
    private javax.swing.JCheckBox chk43;
    private javax.swing.JCheckBox chk44;
    private javax.swing.JCheckBox chk45;
    private javax.swing.JCheckBox chk46;
    private javax.swing.JCheckBox chk47;
    private javax.swing.JCheckBox chk48;
    private javax.swing.JCheckBox chk49;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk50;
    private javax.swing.JCheckBox chk51;
    private javax.swing.JCheckBox chk52;
    private javax.swing.JCheckBox chk53;
    private javax.swing.JCheckBox chk54;
    private javax.swing.JCheckBox chk55;
    private javax.swing.JCheckBox chk56;
    private javax.swing.JCheckBox chk57;
    private javax.swing.JCheckBox chk58;
    private javax.swing.JCheckBox chk59;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chk60;
    private javax.swing.JCheckBox chk61;
    private javax.swing.JCheckBox chk62;
    private javax.swing.JCheckBox chk63;
    private javax.swing.JCheckBox chk64;
    private javax.swing.JCheckBox chk65;
    private javax.swing.JCheckBox chk66;
    private javax.swing.JCheckBox chk67;
    private javax.swing.JCheckBox chk68;
    private javax.swing.JCheckBox chk69;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JCheckBox chk70;
    private javax.swing.JCheckBox chk71;
    private javax.swing.JCheckBox chk72;
    private javax.swing.JCheckBox chk73;
    private javax.swing.JCheckBox chk74;
    private javax.swing.JCheckBox chk75;
    private javax.swing.JCheckBox chk76;
    private javax.swing.JCheckBox chk77;
    private javax.swing.JCheckBox chk78;
    private javax.swing.JCheckBox chk79;
    private javax.swing.JCheckBox chk8;
    private javax.swing.JCheckBox chk80;
    private javax.swing.JCheckBox chk81;
    private javax.swing.JCheckBox chk82;
    private javax.swing.JCheckBox chk83;
    private javax.swing.JCheckBox chk84;
    private javax.swing.JCheckBox chk85;
    private javax.swing.JCheckBox chk86;
    private javax.swing.JCheckBox chk87;
    private javax.swing.JCheckBox chk88;
    private javax.swing.JCheckBox chk89;
    private javax.swing.JCheckBox chk9;
    private javax.swing.JCheckBox chk90;
    private javax.swing.JCheckBox chkCerveza;
    private javax.swing.JCheckBox chkCigarrillos;
    private javax.swing.JCheckBox chkDrogas;
    private javax.swing.JCheckBox chkFreDrog;
    private javax.swing.JCheckBox chkLicFrecuencia;
    private javax.swing.JCheckBox chkRon;
    private javax.swing.JCheckBox chkVino;
    private javax.swing.JCheckBox chkWiscky;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
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
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTabbedPane jtAntecedentes;
    private javax.swing.JTabbedPane jtReproduccion;
    private javax.swing.JRadioButton rbDrogasNO;
    private javax.swing.JRadioButton rbDrogasSI;
    private javax.swing.JRadioButton rbFumarNO;
    private javax.swing.JRadioButton rbFumarSI;
    private javax.swing.JRadioButton rbLicorNO;
    private javax.swing.JRadioButton rbLicorSI;
    private javax.swing.JTable tbQuirurgicos;
    private javax.swing.JTextField txtCercaCorregidaOD;
    private javax.swing.JTextField txtCercaCorregidaOI;
    private javax.swing.JTextField txtCercaSinCorregirOD;
    private javax.swing.JTextField txtCercaSinCorregirOI;
    private javax.swing.JTextField txtCoca;
    private javax.swing.JTextField txtComplicacionesQui;
    private javax.swing.JTextArea txtDcausas;
    private javax.swing.JTextField txtDhijosFallecidos;
    private javax.swing.JTextField txtDhijosVivos;
    private javax.swing.JTextField txtDinicioMestruacion;
    private javax.swing.JTextField txtDinicioVidaSexual;
    private javax.swing.JTextField txtDnumParejasSexActualidad;
    private javax.swing.JTextField txtDnumerosdeAbortos;
    private javax.swing.JTextField txtDrogasFrecuencia;
    private javax.swing.JTextField txtDrogasTipo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEnfermedadesOculares;
    private javax.swing.JTextField txtHospitalQui;
    private javax.swing.JTextField txtImp;
    private javax.swing.JTextField txtLejosCorregidaOD;
    private javax.swing.JTextField txtLejosCorregidaOI;
    private javax.swing.JTextField txtLejosSinCorregirOD;
    private javax.swing.JTextField txtLejosSinCorregirOI;
    private javax.swing.JTextField txtLicorFrecuencia;
    private javax.swing.JTextArea txtLicorTipoFrecuente;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtMarig;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtNcigarrillos;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtOperacionQui;
    private javax.swing.JTextField txtReflejosPupilares;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextArea txtVcausas;
    private javax.swing.JTextField txtVhijosFallecidos;
    private javax.swing.JTextField txtVhijosVivos;
    private javax.swing.JTextField txtVisionBinocular;
    private javax.swing.JTextField txtVisionColores;
    private javax.swing.JTextField txtVnabortosParejas;
    private javax.swing.JTextField txtdiasHospitalizacionQui;
    private javax.swing.JTextField txtotros1ap;
    private javax.swing.JTextField txtotrosap;
    // End of variables declaration//GEN-END:variables

void sbCargarDatosAP(){
        
          String [] titulos={"Fecha","Hospital(Nombre - Lugar)","Operación","Días","Complicaciones"};
          model = new DefaultTableModel(null,titulos){
            
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
          tbQuirurgicos.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbQuirurgicos.setModel(model);          
          tbQuirurgicos.getColumnModel().getColumn(0).setPreferredWidth(90);
          tbQuirurgicos.getColumnModel().getColumn(1).setPreferredWidth(400);
          tbQuirurgicos.getColumnModel().getColumn(2).setPreferredWidth(200);
          tbQuirurgicos.getColumnModel().getColumn(3).setPreferredWidth(50);
          tbQuirurgicos.getColumnModel().getColumn(4).setPreferredWidth(200);
}
void AddAP(){
    //SimpleDateFormat formato = new SimpleDateFormat("yyyy");
   
    String [] registros = new String[5];
    model = (DefaultTableModel) tbQuirurgicos.getModel();
    if(!txtNorden.getText().isEmpty()){
                   if(validarQui()){  
                    registros[0]= FechaQui.getText().toString();
                    registros[1]= txtHospitalQui.getText().toString();
                    registros[2]= txtOperacionQui.getText().toString();
                    registros[3]= txtdiasHospitalizacionQui.getText().toString();
                    registros[4]= txtComplicacionesQui.getText().toString();
               
                   
                model.addRow(registros);  
                tbQuirurgicos.setModel(model);
                        }
                 }
       
                else{oFunc.SubSistemaMensajeError("Falto Llenar algo");
                          
                 //}
                   
    } 
        
}

private boolean validarQui(){
boolean bResultado=true;
  if(txtNorden.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese N° Orden"); bResultado = false;}
    if(FechaQui.getText().isEmpty()){bResultado = false;}
    if(txtHospitalQui.getText().isEmpty()){bResultado = false;}
    if(txtOperacionQui.getText().isEmpty()){bResultado = false;}
    if(txtdiasHospitalizacionQui.getText().isEmpty()){bResultado = false;}
    if(txtComplicacionesQui.getText().isEmpty()){bResultado = false;}
  
   return bResultado;
}
private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaPatologicos.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    if(bgDrogras.isSelected(null)){oFunc.SubSistemaMensajeError("Usa drogas?");bResultado = false;}
    if(bgFumar.isSelected(null)){oFunc.SubSistemaMensajeError("Fuma?");bResultado = false;}
    if(bgLicor.isSelected(null)){oFunc.SubSistemaMensajeError("bebe Licor?");bResultado = false;}
  
   return bResultado;
}
private void limpiar(){
num = null;    
txtNorden.setText(null);
FechaNacimiento.setDate(null);
FechaPatologicos.setDate(null);
FechaQui.setText(null);
txtNombres.setText(null);
txtSexo.setText(null);
txtEdad.setText(null);
txtNcigarrillos.setText(null);
txtLicorTipoFrecuente.setText(null);
txtLicorFrecuencia.setText(null);
txtDrogasTipo.setText(null);
txtDrogasFrecuencia.setText(null);
txtCoca.setText(null);
txtMarig.setText(null);
txtotrosap.setText(null);
txtotros1ap.setText(null);
bgDrogras.clearSelection();
bgFumar.clearSelection();
bgLicor.clearSelection();
chk1.setSelected(false);
chk2.setSelected(false);
chk3.setSelected(false);
chk4.setSelected(false);
chk5.setSelected(false);
chk6.setSelected(false);
chk7.setSelected(false);
chk8.setSelected(false);
chk9.setSelected(false);
chk10.setSelected(false);
chk11.setSelected(false);
chk12.setSelected(false);
chk13.setSelected(false);
chk14.setSelected(false);
chk15.setSelected(false);
chk16.setSelected(false);
chk17.setSelected(false);
chk18.setSelected(false);
chk19.setSelected(false);
chk20.setSelected(false);
chk21.setSelected(false);
chk22.setSelected(false);
chk23.setSelected(false);
chk24.setSelected(false);
chk25.setSelected(false);
chk26.setSelected(false);
chk27.setSelected(false);
chk28.setSelected(false);
chk29.setSelected(false);
chk30.setSelected(false);
chk31.setSelected(false);
chk32.setSelected(false);
chk33.setSelected(false);
chk34.setSelected(false);
chk35.setSelected(false);
chk36.setSelected(false);
chk37.setSelected(false);
chk38.setSelected(false);
chk39.setSelected(false);
chk40.setSelected(false);
chk41.setSelected(false);
chk42.setSelected(false);
chk43.setSelected(false);
chk44.setSelected(false);
chk45.setSelected(false);
chk46.setSelected(false);
chk47.setSelected(false);
chk48.setSelected(false);
chk49.setSelected(false);
chk50.setSelected(false);
chk51.setSelected(false);
chk52.setSelected(false);
chk53.setSelected(false);
chk54.setSelected(false);
chk55.setSelected(false);
chk56.setSelected(false);
chk57.setSelected(false);
chk58.setSelected(false);
chk59.setSelected(false);
chk60.setSelected(false);
chk61.setSelected(false);
chk62.setSelected(false);
chk63.setSelected(false);
chk64.setSelected(false);
chk65.setSelected(false);
chk67.setSelected(false);
chk68.setSelected(false);
chk69.setSelected(false);
chk70.setSelected(false);
chk71.setSelected(false);
chk72.setSelected(false);
chk73.setSelected(false);
chk74.setSelected(false);
chk75.setSelected(false);
chk76.setSelected(false);
chk77.setSelected(false);
chk78.setSelected(false);
chk79.setSelected(false);
chk80.setSelected(false);
chk81.setSelected(false);
chk82.setSelected(false);
chk83.setSelected(false);
chk84.setSelected(false);
chk85.setSelected(false);
chk86.setSelected(false);
chk87.setSelected(false);
chk88.setSelected(false);
chk89.setSelected(false);
chk90.setSelected(false);
jtAntecedentes.setSelectedIndex(0);
txtNorden.setEditable(true);
txtNorden.requestFocus();
Qui();
habitos();
}
public void habitos(){
        txtNcigarrillos.setEditable(false);
        txtNcigarrillos.setText(null);
        txtLicorTipoFrecuente.setEditable(false);
        txtLicorTipoFrecuente.setText(null);
        txtLicorFrecuencia.setEditable(false);
        txtLicorFrecuencia.setText(null);
        txtDrogasTipo.setEditable(false);
        txtDrogasTipo.setText(null);
        txtDrogasFrecuencia.setEditable(false);
        txtDrogasFrecuencia.setText(null);
}
public void Qui(){
sbCargarDatosAP();
txtHospitalQui.setText(null);
txtOperacionQui.setText(null);
txtdiasHospitalizacionQui.setText(null);
txtComplicacionesQui.setText(null);
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
                    String master = System.getProperty("user.dir") +
                                "/reportes/ficha_antecedente_patologico.jasper";
            
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del ficha antecedente patologico.");
                //System.exit(2);
            } 
            JasperReport masterReport = null;
            try 
            {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } 
            catch (JRException e) 
            {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            } 
            //JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
                           
              //      JasperViewer.viewReport(myPrint,false);
            
            JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint,true);

                   } catch (JRException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
private void printer2(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                 try 
                {
                    String master = System.getProperty("user.dir") +
                                "/reportes/ficha_antecedente_patologico_2.jasper";
            
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del ficha antecedente patologico.");
                //System.exit(2);
            } 
            JasperReport masterReport = null;
            try 
            {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } 
            catch (JRException e) 
            {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            } 
            //JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
                           
              //      JasperViewer.viewReport(myPrint,false);
            
            JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint,true);

                   } catch (JRException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }


}
