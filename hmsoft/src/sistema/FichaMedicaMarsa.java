/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.AddCargos;
import static Caja.RegistrarCliente.addExEn;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author admin
 */
public final class FichaMedicaMarsa extends javax.swing.JInternalFrame {

//    public static frmObservaciones addObsv;
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPu = new clsOperacionesUsuarios();
    boolean ordenVer=true;
    DefaultTableModel model;
    public FichaMedicaMarsa() {
        initComponents();
//        jtFichaMedica.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/id.png")));
//        jtFichaMedica.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/invoice.png")));
//        jtFichaMedica.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/botiquin.png")));
        //Fecha();

    }
    private boolean validar() {
        boolean bResultado = true;
        if (((JTextField) FechaFicha.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha ");
            bResultado = false;
        }
       
//        if (((JTextField)FechaRx.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
//        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
//      if(btEx.isSelected(null)){oFunc.SubSistemaMensajeError("Falta llenar rx"); bResultado = false;}
      if(btApto.isSelected(null)){oFunc.SubSistemaMensajeError("Falta aptitud");bResultado = false;}

        return bResultado;
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btTabaco = new javax.swing.ButtonGroup();
        btAlcohol = new javax.swing.ButtonGroup();
        btDrogas = new javax.swing.ButtonGroup();
        tbReubicacion = new javax.swing.ButtonGroup();
        tbPulmones = new javax.swing.ButtonGroup();
        btTacto = new javax.swing.ButtonGroup();
        btGrupoSanguineo = new javax.swing.ButtonGroup();
        btEx = new javax.swing.ButtonGroup();
        btNegativoPositivo = new javax.swing.ButtonGroup();
        btGrupoSanguineoTIPO = new javax.swing.ButtonGroup();
        btApto = new javax.swing.ButtonGroup();
        jtFichaMedica = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtContrata = new javax.swing.JTextField();
        FechaFicha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtMineralesExplotados = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtLugarNacimiento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtCintura = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtCadera = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txticc = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        txtSistolica = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        txtDiastolica = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        txtFcardiaca = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        txtSatO2 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtPuestoPostula = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPuestoActual = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtExplotacionEn = new javax.swing.JTextField();
        txtAlturaLabor = new javax.swing.JTextField();
        txtGradoInstruccion = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtTipoExamen = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btnEditarFM = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jLabel136 = new javax.swing.JLabel();
        txtGFSPrevio = new javax.swing.JTextField();
        txtGrupoFacLab = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        txtLeucocitos = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txtLinfocitos = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        txteosinofilos = new javax.swing.JTextField();
        txtBastones = new javax.swing.JTextField();
        jLabel190 = new javax.swing.JLabel();
        txtHemoHema = new javax.swing.JTextField();
        jLabel191 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        txtPlaquetas = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        rbSI = new javax.swing.JRadioButton();
        rbNO = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        txtRx = new javax.swing.JTextField();
        FechaRx = new com.toedter.calendar.JDateChooser();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        txtCalidad = new javax.swing.JTextField();
        jLabel161 = new javax.swing.JLabel();
        txtSimbolos = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel162 = new javax.swing.JLabel();
        txtVertices = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        txtHilios = new javax.swing.JTextField();
        jLabel164 = new javax.swing.JLabel();
        txtSenos = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        txtMediastinos = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        txtConclusionesRx = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        txtSiluetaCardioVascular = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        rb0 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        rb7 = new javax.swing.JRadioButton();
        rb8 = new javax.swing.JRadioButton();
        rb9 = new javax.swing.JRadioButton();
        rb11 = new javax.swing.JRadioButton();
        rb10 = new javax.swing.JRadioButton();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        txtImprimir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPruebaCovid = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEncuestaCovid = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtAntecedentesPersonales = new javax.swing.JTextField();
        txtAntecedentesFamiliares = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtAnamnesis = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        rbNormal = new javax.swing.JRadioButton();
        rbAnormal = new javax.swing.JRadioButton();
        txtPulmones = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jLabel123 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRecomendaciones = new javax.swing.JTextArea();
        jtPruebas = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbPruebasCovid = new javax.swing.JTable();

        setClosable(true);
        setTitle("Examenes Pre-Ocupacionales \"Ficha Médica\"");
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1268, 647));
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

        jLabel1.setText("Empresa :");

        jLabel2.setText("Nombres :");

        jLabel3.setText("Apellidos :");

        jLabel4.setText("Contrata :");

        jLabel5.setText("Ex-Médico :");

        jLabel6.setText("N° Orden :");

        jLabel7.setText("Fecha Exámen :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });
        txtNorden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNordenKeyReleased(evt);
            }
        });

        txtNombre.setEditable(false);

        txtApellido.setEditable(false);

        txtEmpresa.setEditable(false);

        txtContrata.setEditable(false);

        jLabel8.setText("DNI :");

        txtDni.setEditable(false);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        txtMineralesExplotados.setEditable(false);

        jLabel10.setText("Fecha Nacimiento :");

        jLabel11.setText("Edad :");

        txtEdad.setEditable(false);

        jLabel12.setText("Sexo :");

        jLabel13.setText("Lugar Nacimiento :");

        txtLugarNacimiento.setEditable(false);

        jLabel14.setText("Domicilio Habitual :");

        txtDomicilio.setEditable(false);

        jLabel15.setText("Teléfono :");

        txtTelefono.setEditable(false);

        jLabel16.setText("Estado Civil :");

        jLabel17.setText("Grado Instrucción :");

        FechaNacimiento.setEnabled(false);
        FechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaNacimientoPropertyChange(evt);
            }
        });

        jLabel18.setText("Explotación en :");

        jLabel19.setText("Altura de Labor :");

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("FUNCIONES VITALES"));

        jLabel40.setText("Talla :");

        jLabel43.setText("m.");

        jLabel41.setText("Peso :");

        jLabel44.setText("Kg.");

        jLabel42.setText("IMC :");

        txtIMC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtIMC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel49.setText("Temp. :");

        jLabel51.setText("Cintura :");

        jLabel52.setText("Cadera :");

        jLabel53.setText("ICC :");

        jLabel50.setText("°C");

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Preción Arterial Sistémica"));

        jLabel97.setText("Sistólica :");

        jLabel98.setText("min.");

        jLabel99.setText("Diastólica :");

        jLabel100.setText("min.");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel98))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel100)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98))
                .addGap(5, 5, 5)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel100))
                    .addComponent(jLabel99))
                .addGap(0, 0, 0))
        );

        jLabel92.setText("F. Cardiaca :");

        jLabel95.setText("min.");

        jLabel93.setText("Sat. O2 : ");

        jLabel96.setText("%");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel53))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel93)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSatO2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel96))
                                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addComponent(jLabel42))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFcardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel40))
                            .addComponent(jLabel41))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44)))
                            .addComponent(txtIMC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txticc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadera, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)))
                .addGap(2, 2, 2))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))
                        .addGap(6, 6, 6)
                        .addComponent(txtCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtCadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txticc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel51)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel52))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel40)
                                .addComponent(jLabel43))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFcardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel92)
                                .addComponent(jLabel95)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel44))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSatO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel93))
                                .addGap(5, 5, 5)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0))
        );

        jLabel21.setText("Puesto al que Postula :");

        txtPuestoPostula.setEditable(false);
        txtPuestoPostula.setText("N/A");

        jLabel22.setText("Puesto Actual :");

        txtPuestoActual.setBackground(new java.awt.Color(153, 204, 255));
        txtPuestoActual.setText("N/A");

        jLabel23.setText("Tiempo :");

        txtTiempo.setBackground(new java.awt.Color(153, 204, 255));
        txtTiempo.setText("N/A");

        jLabel27.setText("Area :");

        txtArea.setEditable(false);

        txtExplotacionEn.setEditable(false);

        txtAlturaLabor.setEditable(false);

        txtGradoInstruccion.setEditable(false);

        txtSexo.setEditable(false);

        txtTipoExamen.setEditable(false);

        txtEstadoCivil.setEditable(false);

        jLabel28.setText("Mineral Exp :");

        btnEditarFM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarFM.setText("Editar");
        btnEditarFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFMActionPerformed(evt);
            }
        });

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel136.setText("Comparacion Grupo Sanguineo");

        txtGFSPrevio.setEditable(false);
        txtGFSPrevio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGFSPrevio.setForeground(new java.awt.Color(0, 0, 255));

        txtGrupoFacLab.setEditable(false);
        txtGrupoFacLab.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGrupoFacLab.setForeground(new java.awt.Color(0, 0, 255));

        jLabel140.setText("=");

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hemograma"));

        jLabel127.setText("Leucocitos:");

        jLabel131.setText("Linfocitos:");

        jLabel129.setText("Bastones:");

        jLabel133.setText("Eosinófilos:");

        jLabel190.setText("Hemoglobina / Hematocrito:");

        txtHemoHema.setEditable(false);
        txtHemoHema.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel191.setText("gr. %");

        jLabel135.setText("Plaquetas:");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLeucocitos, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txtLinfocitos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBastones)
                    .addComponent(txteosinofilos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtPlaquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel190)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHemoHema, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel191)))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLeucocitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127))
                .addGap(5, 5, 5)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(txtLinfocitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBastones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel129)
                    .addComponent(jLabel190)
                    .addComponent(txtHemoHema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel191))
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel133)
                            .addComponent(txteosinofilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel135)
                            .addComponent(txtPlaquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel26.setBackground(new java.awt.Color(204, 212, 28));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Apto para Trabajar"));

        rbSI.setBackground(new java.awt.Color(204, 212, 28));
        btApto.add(rbSI);
        rbSI.setSelected(true);
        rbSI.setText("SI");

        rbNO.setBackground(new java.awt.Color(204, 212, 28));
        btApto.add(rbNO);
        rbNO.setText("NO");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(rbSI)
                .addGap(2, 2, 2)
                .addComponent(rbNO)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbSI)
                .addComponent(rbNO))
        );

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar/Actualizar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel158.setText("N°Rx :");

        jLabel159.setText("Fecha :");

        jLabel160.setText("Calidad :");

        jLabel161.setText("Símbolos :");

        txtSimbolos.setText("N/A");
        txtSimbolos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSimbolosFocusGained(evt);
            }
        });

        jLabel162.setText("Vértices :");

        txtVertices.setEditable(false);

        jLabel163.setText("Hilios :");

        txtHilios.setEditable(false);

        jLabel164.setText("Senos :");

        txtSenos.setEditable(false);

        jLabel165.setText("Mediastinos :");

        txtMediastinos.setEditable(false);

        jLabel166.setText("Conclusiones Radiográficas :");

        txtConclusionesRx.setEditable(false);

        jLabel167.setText("Silueta Cardiovascular :");

        txtSiluetaCardioVascular.setEditable(false);

        jLabel168.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(51, 153, 255));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel168.setText("0/0");
        jLabel168.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel169.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(51, 153, 255));
        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel169.setText("1/0");
        jLabel169.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel170.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(51, 153, 255));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel170.setText("1/1");
        jLabel170.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel171.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(51, 153, 255));
        jLabel171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel171.setText("1/2");
        jLabel171.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel172.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(51, 153, 255));
        jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel172.setText("2/1");
        jLabel172.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel173.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(51, 153, 255));
        jLabel173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel173.setText("2/2");
        jLabel173.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel174.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(51, 153, 255));
        jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel174.setText("2/3");
        jLabel174.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel175.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(51, 153, 255));
        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel175.setText("3/2");
        jLabel175.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel176.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(51, 153, 255));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel176.setText("3/3");
        jLabel176.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel177.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(51, 153, 255));
        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setText("3/+");
        jLabel177.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel178.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(51, 153, 255));
        jLabel178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel178.setText("A, B C");
        jLabel178.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel179.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(51, 153, 255));
        jLabel179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel179.setText("St");
        jLabel179.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel180.setBackground(new java.awt.Color(204, 212, 28));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("CERO");
        jLabel180.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel181.setBackground(new java.awt.Color(204, 212, 28));
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setText("1/0");
        jLabel181.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel182.setBackground(new java.awt.Color(204, 212, 28));
        jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel182.setText("UNO");
        jLabel182.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel183.setBackground(new java.awt.Color(204, 212, 28));
        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel183.setText("DOS");
        jLabel183.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel184.setBackground(new java.awt.Color(204, 212, 28));
        jLabel184.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel184.setText("TRES");
        jLabel184.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel185.setBackground(new java.awt.Color(204, 212, 28));
        jLabel185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel185.setText("CUATRO");
        jLabel185.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btEx.add(rb0);

        btEx.add(rb1);

        btEx.add(rb2);

        btEx.add(rb3);

        btEx.add(rb4);

        btEx.add(rb5);

        btEx.add(rb6);

        btEx.add(rb7);

        btEx.add(rb8);

        btEx.add(rb9);

        btEx.add(rb11);

        btEx.add(rb10);

        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator23.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator24.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator25.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator26.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator20)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(rb0)
                                    .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(rb1)
                                    .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rb2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(rb3)
                                    .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel182, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(rb4)
                                    .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(rb5)
                                    .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(rb6)
                                    .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb7)
                                    .addComponent(jLabel175, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(rb8)
                                    .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(rb9)
                                    .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(rb10)
                            .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel185))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(rb11)
                            .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRx, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaRx, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel160)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel161)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSimbolos))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel166)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConclusionesRx))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel162)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel163)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHilios, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel164)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSenos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel165)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMediastinos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel167)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSiluetaCardioVascular)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel160)
                        .addComponent(txtCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel161)
                        .addComponent(txtSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FechaRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel158)
                        .addComponent(txtRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel159)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel162)
                    .addComponent(txtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel163)
                    .addComponent(txtHilios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel164)
                    .addComponent(txtSenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel165)
                    .addComponent(txtMediastinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel166)
                    .addComponent(txtConclusionesRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel167)
                    .addComponent(txtSiluetaCardioVascular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator21)
                    .addComponent(jSeparator22)
                    .addComponent(jSeparator23)
                    .addComponent(jSeparator24)
                    .addComponent(jSeparator25)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rb0)
                                        .addComponent(rb1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(rb2)
                                    .addComponent(rb3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(jLabel168)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel180))
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel169)
                                            .addComponent(jLabel170)
                                            .addComponent(jLabel171))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel182)
                                            .addComponent(jLabel181)))))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb4)
                                    .addComponent(rb5)
                                    .addComponent(rb6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel172)
                                    .addComponent(jLabel173)
                                    .addComponent(jLabel174))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel183))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb7)
                                    .addComponent(rb8)
                                    .addComponent(rb9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel175)
                                    .addComponent(jLabel176)
                                    .addComponent(jLabel177)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(rb10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel178)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel185))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addComponent(rb11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel179)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel184)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator26))
                .addGap(0, 0, 0))
        );

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel30.setText("Encuesta COVID-19");

        jLabel31.setText("Prueba Rápida  COVID-19");

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        txtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirActionPerformed(evt);
            }
        });

        txtPruebaCovid.setColumns(20);
        txtPruebaCovid.setRows(5);
        jScrollPane1.setViewportView(txtPruebaCovid);

        txtEncuestaCovid.setColumns(20);
        txtEncuestaCovid.setRows(5);
        jScrollPane3.setViewportView(txtEncuestaCovid);

        jLabel25.setText("Antecedentes Personales y/o Ocupacionales (enfermedad y/o accidente)");

        txtAntecedentesPersonales.setText("NIEGA DB, TBC, HTA, CONVULSIONES, ASMA, ALERGIAS, ACCIDENTES");
        txtAntecedentesPersonales.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAntecedentesPersonalesFocusGained(evt);
            }
        });
        txtAntecedentesPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAntecedentesPersonalesActionPerformed(evt);
            }
        });

        txtAntecedentesFamiliares.setText("NO CONTRIBUTORIOS");
        txtAntecedentesFamiliares.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAntecedentesFamiliaresFocusGained(evt);
            }
        });

        jLabel26.setText("Antecedentes Familiares:");

        jLabel29.setText("Anamnesis:");

        txtAnamnesis.setText("PACIENTE REFIERE");
        txtAnamnesis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnamnesisFocusGained(evt);
            }
        });

        jLabel101.setText("Pulmones :");

        rbNormal.setBackground(new java.awt.Color(153, 204, 255));
        tbPulmones.add(rbNormal);
        rbNormal.setText("Normal");

        rbAnormal.setBackground(new java.awt.Color(153, 204, 255));
        tbPulmones.add(rbAnormal);
        rbAnormal.setText("Anormal");
        rbAnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAnormalActionPerformed(evt);
            }
        });

        txtPulmones.setBackground(new java.awt.Color(153, 204, 255));
        txtPulmones.setText("BPMV EN ACP. NO RALES.");
        txtPulmones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPulmonesFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAntecedentesFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAntecedentesPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPulmones)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabel101)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbNormal)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbAnormal)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnamnesis, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(3, 3, 3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel25)
                .addGap(0, 0, 0)
                .addComponent(txtAntecedentesPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtAntecedentesFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtAnamnesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(rbNormal)
                    .addComponent(rbAnormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPulmones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtArea, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTiempo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPuestoActual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPuestoPostula, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addGap(438, 438, 438))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarFM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(FechaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(418, 418, 418))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefono))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtDomicilio))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGradoInstruccion))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmpresa))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContrata))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtExplotacionEn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMineralesExplotados, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAlturaLabor))))
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel136)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtGFSPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel140)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtGrupoFacLab, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)
                                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(445, 445, 445))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarFM)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(FechaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(183, 183, 183)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(txtGradoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel16)
                                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(214, 214, 214)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(240, 240, 240)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMineralesExplotados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtExplotacionEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAlturaLabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel136)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtGFSPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGrupoFacLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel140)))
                                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgregar)
                                    .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnImprimir)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(3, 3, 3)
                                .addComponent(txtPuestoPostula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel27)
                                .addGap(0, 0, 0)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel22)
                                .addGap(0, 0, 0)
                                .addComponent(txtPuestoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel23)
                                .addGap(0, 0, 0)
                                .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel30)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        jtFichaMedica.addTab("Datos de Ficha Médica COVID-19", jPanel2);

        txtDiagnostico.setBackground(new java.awt.Color(189, 222, 255));
        txtDiagnostico.setColumns(20);
        txtDiagnostico.setLineWrap(true);
        txtDiagnostico.setRows(5);
        txtDiagnostico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setViewportView(txtDiagnostico);

        jLabel123.setText("Diagnóstico:");

        jLabel125.setText("Recomendaciones:");

        txtRecomendaciones.setBackground(new java.awt.Color(189, 222, 255));
        txtRecomendaciones.setColumns(20);
        txtRecomendaciones.setLineWrap(true);
        txtRecomendaciones.setRows(5);
        txtRecomendaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane4.setViewportView(txtRecomendaciones);

        tbPruebasCovid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbPruebasCovid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbPruebasCovid.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbPruebasCovid);

        jtPruebas.addTab("Registros anteriores de pruebas covid", jScrollPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jtFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel123)
                            .addComponent(jLabel125)
                            .addComponent(jtPruebas))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel125)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jtFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaNacimientoPropertyChange

    }//GEN-LAST:event_FechaNacimientoPropertyChange

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        consultar();
        
        
    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtAntecedentesPersonalesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAntecedentesPersonalesFocusGained
        txtAntecedentesPersonales.selectAll();
    }//GEN-LAST:event_txtAntecedentesPersonalesFocusGained

    private void txtAntecedentesFamiliaresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAntecedentesFamiliaresFocusGained
        txtAntecedentesFamiliares.selectAll();
    }//GEN-LAST:event_txtAntecedentesFamiliaresFocusGained

    private void txtPulmonesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPulmonesFocusGained
        txtPulmones.selectAll();
    }//GEN-LAST:event_txtPulmonesFocusGained

    private void rbAnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAnormalActionPerformed
        txtPulmones.setText(null);
    }//GEN-LAST:event_rbAnormalActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtNorden.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtNordenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyReleased

    }//GEN-LAST:event_txtNordenKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       if(Orden()){
            actualizar();
        }else if (validar()) {
            if (Agregar()) {
                oPu.oFinalizado(txtDni);
                imprimir();
                limpiar();
            }
        }  
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnEditarFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFMActionPerformed
        if(!txtNorden.getText().isEmpty()){
            if(Orden()){
            editar();
            
        }else {oFunc.SubSistemaMensajeError("No hay datos en la ficha o orden no existe");}
        }else{
            oFunc.SubSistemaMensajeError("Debe ingresar numero de orden");
        }
//        String sql="Select * from anexo7c WHERE n.n_orden ='" + txtEOrden.getText().toUpperCase() + "'";
    }//GEN-LAST:event_btnEditarFMActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtSimbolosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSimbolosFocusGained
        txtSimbolos.selectAll();
    }//GEN-LAST:event_txtSimbolosFocusGained

    private void txtAnamnesisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnamnesisFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnamnesisFocusGained

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Integer Norden = Integer.valueOf(txtImprimir.getText());
        oPu.print(Norden, "Ficha_Medica_COVID.jasper", "Ficha Médica Marza");
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirActionPerformed

    }//GEN-LAST:event_txtImprimirActionPerformed

    private void txtAntecedentesPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAntecedentesPersonalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAntecedentesPersonalesActionPerformed
  
    public boolean Orden() {
        boolean bResultado = false;

        String sQuery;

        sQuery = "Select n_orden from fmedica_covid_marsa Where n_orden=" + txtNorden.getText().toString();

        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);

        // Capturo el Error
        try {

            // Verifico que haya habido resultados
            if (oConn.setResult.next()) {
                // Resultado
                bResultado = true;

            }

            // Cierro los Resultados
            oConn.setResult.close();

        } catch (SQLException ex) {

        }

        return bResultado;

    }

    void Fecha() {
        Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
        FechaFicha.setDate(fechaDate);
        FechaRx.setDate(fechaDate);
    }
    
    void editar(){
                String Consulta = "SELECT d.cod_pa,d.nombres_pa,d.apellidos_pa,d.fecha_nacimiento_pa,d.sexo_pa,d.lugar_nac_pa,d.direccion_pa,\n" +
"       d.tel_casa_pa,d.cel_pa,d.estado_civil_pa,d.nivel_est_pa,n.n_orden,n.razon_empresa,n.razon_contrata,n.nom_examen,n.nom_ex,\n" +
"       n.altura_po,n.mineral_po,n.cargo_de,n.area_o,n.grupofactorsan,\n" +
"       t.talla,t.peso,t.imc,t.sistolica,t.diastolica,t.f_cardiaca,t.sat_02,\n" +
"       t.temperatura,t.cintura,t.cadera,t.icc,\n" +
"       CASE WHEN l.chko = 'TRUE' THEN 'O'\n" +
"       WHEN l.chka = 'TRUE' THEN 'A'\n" +
"       WHEN l.chkb = 'TRUE' THEN 'B'\n" +
"       WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| \n" +
"       CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' \n" +
"       WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS Grupofactor ,\n" +
"       l.chkpositivo,l.chknegativo, l.chko, l.chka , l.chkb , l.chkab,\n" +
"       l.txthemoglobina,l.txtleucocitosematologia,\n" +
"       l.txtlinfocitosematologia,l.txtbasofilosematologia,l.txteosinofiosematologia,l.txtplaquetas,"
                        + "i.chkigm_reactivo,i.chkigg_reactivo,i.chkinvalido, i.chkigm_noreactivo,i.chkigg_noreactivo,"
                        + "c.chk_asintomatico,c.chk_sintomatico,c.txtresultados,\n" +
"       r.txtvertices, r.txthilios, r.txtsenoscostofrenicos, r.txtmediastinos, r.txtsiluetacardiovascular,\n" +
"       r.txtconclusionesradiograficas, fm.fecha, fm.txtpuestoactual, fm.txttiempo, \n" +
"       fm.txtantecedentespersonales, fm.txtantecedentesfamiliares, fm.rbnormal, \n" +
"       fm.rbanormal, fm.txtpulmones, fm.txtanamnesis, fm.encuesta_covid, fm.n_rx, fm.fecha_exra, \n" +
"       txtcalidad, txtsimbolos, ex_0, ex_10, ex_11, ex_12, ex_21, ex_22, \n" +
"       fm.ex_23, fm.ex_32, fm.ex_33, fm.ex_3mas, fm.ex_abc, fm.ex_st, fm.apto_si, fm.apto_no, \n" +
"       fm.prueba_covid, fm.txtdiagnostico, fm.txtrecomendaciones\n" +
"       FROM datos_paciente AS d \n" +
"       INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) \n" +
"       LEFT JOIN triaje as t ON(n.n_orden = t.n_orden) \n" +
"       LEFT JOIN radiografia_torax AS r ON(n.n_orden = r.n_orden)\n" +
"       LEFT JOIN lab_clinico AS l ON(n.n_orden = l.n_orden)\n" +
"       inner JOIN fmedica_covid_marsa AS fm ON(n.n_orden = fm.n_orden)" +
             "left JOIN examen_inmunologico AS i ON (n.n_orden = i.n_orden) "+
        "left JOIN constancia_salud_marsa AS c ON (n.n_orden = c.n_orden) "+
"                WHERE n.n_orden ='" + txtNorden.getText().toString() + "'";
                
                oConn.FnBoolQueryExecute(Consulta);
                
                try {
                    if (oConn.setResult.next()) {
                        txtTipoExamen.setText(oConn.setResult.getString("nom_examen"));
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtSexo.setText(oConn.setResult.getString("sexo_pa"));
                        txtLugarNacimiento.setText(oConn.setResult.getString("lugar_nac_pa"));
                        txtDomicilio.setText(oConn.setResult.getString("direccion_pa"));
                        txtTelefono.setText(oConn.setResult.getString("tel_casa_pa"));//== null ? "-":oConn.setResult.getString("cel_pa"));
                        txtEstadoCivil.setText(oConn.setResult.getString("estado_civil_pa"));
                        txtGradoInstruccion.setText(oConn.setResult.getString("nivel_est_pa"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())));
                        txtExplotacionEn.setText(oConn.setResult.getString("nom_ex"));
                        txtAlturaLabor.setText(oConn.setResult.getString("altura_po"));
                        txtMineralesExplotados.setText(oConn.setResult.getString("mineral_po"));
                        txtPuestoPostula.setText(oConn.setResult.getString("cargo_de"));
                        if ("ANUAL".equals(txtTipoExamen.getText().toString())) {
                            txtPuestoActual.setText(oConn.setResult.getString("cargo_de"));
                        }
                        txtIMC.setText(oConn.setResult.getString("imc"));
                        
                    txtTalla.setText(oConn.setResult.getString("talla"));
                    txtPeso.setText(oConn.setResult.getString("peso"));
                    txtTemperatura.setText(oConn.setResult.getString("temperatura"));
                    txtCintura.setText(oConn.setResult.getString("cintura"));
                    txtCadera.setText(oConn.setResult.getString("cadera"));
                    txticc.setText(oConn.setResult.getString("icc"));
                    txtFcardiaca.setText(oConn.setResult.getString("f_cardiaca"));
                    txtSatO2.setText(oConn.setResult.getString("sat_02"));
                    txtSistolica.setText(oConn.setResult.getString("sistolica"));
                    txtDiastolica.setText(oConn.setResult.getString("diastolica"));
                        txtArea.setText(oConn.setResult.getString("area_o"));
                        txtLeucocitos.setText(oConn.setResult.getString("txtleucocitosematologia"));
                        txtLinfocitos.setText(oConn.setResult.getString("txtlinfocitosematologia"));
                        txtBastones.setText(oConn.setResult.getString("txtbasofilosematologia"));
                        txteosinofilos.setText(oConn.setResult.getString("txteosinofiosematologia"));
                        txtPlaquetas.setText(oConn.setResult.getString("txtplaquetas"));
                    
                    txtRx.setText(oConn.setResult.getString("n_orden"));
                    txtVertices.setText(oConn.setResult.getString("txtvertices"));
                    txtHilios.setText(oConn.setResult.getString("txthilios"));
                    txtSenos.setText(oConn.setResult.getString("txtsenoscostofrenicos"));
                    txtMediastinos.setText(oConn.setResult.getString("txtmediastinos"));
                    txtSiluetaCardioVascular.setText(oConn.setResult.getString("txtsiluetacardiovascular"));
                    txtConclusionesRx.setText(oConn.setResult.getString("txtconclusionesradiograficas"));
                    txtHemoHema.setText(oConn.setResult.getString("txthemoglobina"));
                    txtPuestoActual.setText(oConn.setResult.getString("txtpuestoactual"));
                    txtTiempo.setText(oConn.setResult.getString("txttiempo"));
                    txtAntecedentesPersonales.setText(oConn.setResult.getString("txtantecedentespersonales"));
                    txtAntecedentesFamiliares.setText(oConn.setResult.getString("txtantecedentesfamiliares"));
                    rbNormal.setSelected(oConn.setResult.getBoolean("rbnormal"));
                    rbAnormal.setSelected(oConn.setResult.getBoolean("rbanormal"));
                    txtPulmones.setText(oConn.setResult.getString("txtpulmones"));
                    txtAnamnesis.setText(oConn.setResult.getString("txtanamnesis"));
//                    txtEncuestaCovid.setText(oConn.setResult.getString("encuesta_covid"));
                    FechaRx.setDate(oConn.setResult.getDate("fecha_exra"));
                    txtCalidad.setText(oConn.setResult.getString("txtcalidad"));
                    txtSimbolos.setText(oConn.setResult.getString("txtsimbolos"));
                    rb0.setSelected(oConn.setResult.getBoolean("ex_0"));
                    rb1.setSelected(oConn.setResult.getBoolean("ex_10"));
                    rb2.setSelected(oConn.setResult.getBoolean("ex_11"));
                    rb3.setSelected(oConn.setResult.getBoolean("ex_12"));
                    rb4.setSelected(oConn.setResult.getBoolean("ex_21"));
                    rb5.setSelected(oConn.setResult.getBoolean("ex_22"));
                    rb6.setSelected(oConn.setResult.getBoolean("ex_23"));
                    rb7.setSelected(oConn.setResult.getBoolean("ex_32"));
                    rb8.setSelected(oConn.setResult.getBoolean("ex_33"));
                    rb9.setSelected(oConn.setResult.getBoolean("ex_3mas"));
                    rb10.setSelected(oConn.setResult.getBoolean("ex_abc"));
                    rb11.setSelected(oConn.setResult.getBoolean("ex_st"));
                    rbSI.setSelected(oConn.setResult.getBoolean("apto_si"));
                    rbNO.setSelected(oConn.setResult.getBoolean("apto_no"));
                    FechaFicha.setDate(oConn.setResult.getDate("fecha"));
//                    txtPruebaCovid.setText(oConn.setResult.getString("prueba_covid"));
                    txtEncuestaCovid.append(String.valueOf(oConn.setResult.getBoolean("chk_asintomatico")).equals("true")?"ASINTOMATICO":"");
                        txtEncuestaCovid.append(String.valueOf(oConn.setResult.getBoolean("chk_sintomatico")).equals("true")?"SINTOMATICO ".concat(oConn.setResult.getString("txtresultados")):"");
                        txtPruebaCovid.append(String.valueOf(oConn.setResult.getBoolean("chkigm_reactivo")).equals("true")? ", IgM:POSITIVO":"IgM:NEGATIVO") ;
                        txtPruebaCovid.append(String.valueOf(oConn.setResult.getBoolean("chkigg_reactivo")).equals("true")? ", IgG:POSITIVO":"IgG:NEGATIVO") ;  
//                    txtDiagnostico.setText(oConn.setResult.getString("txtdiagnostico"));
                    txtRecomendaciones.setText(oConn.setResult.getString("txtrecomendaciones"));
                    txtAnamnesis.setText("PACIENTE REFIERE ESTAR ".concat(txtEncuestaCovid.getText()));
                     txtDiagnostico.append("1.".concat(txtEncuestaCovid.getText())+"\n");
                            txtDiagnostico.append("2.PRESENTA: ".concat(txtPruebaCovid.getText())+"\n");
                    if(!txtIMC.getText().isEmpty()){
                           float imc = Float.parseFloat(txtIMC.getText().toString());
                            txtIMC.setForeground(Color.black);
                            if (imc <= 18.5) {
                                txtIMC.setForeground(Color.red);
                                txtDiagnostico.append("- INDICE DE MASA CORPORAL: BAJO DE PESO." + '\n');
                            } else if (imc >= 25 && imc < 30) {
                                txtIMC.setForeground(Color.red);
                                txtDiagnostico.append("-SOBREPESO:DIETA HIPOCALORICA Y EJERCICIOS." + '\n');
                            } else if (imc >= 30 && imc < 35) {
                                txtIMC.setForeground(Color.red);
                                txtDiagnostico.append("-OBESIDAD I.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS" + '\n');
                            } else if (imc >= 35 && imc < 40) {
                                txtIMC.setForeground(Color.red);
                                txtDiagnostico.append("-OBESIDAD II.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS" + '\n');
                            } //else {
//                                txtObservacionesFichaMedica.append("-OBESIDAD III.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS" + '\n');
//                            } 
                        }
                       oPu.fecha(FechaFicha);
                       
                    } else {
                        oFunc.SubSistemaMensajeError("No se encuentra Registros(Registros Necesarios): \n 1- Laboratorio Clinico \n 2- Radiografía de Torax P.A");
                    }
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Historia Ocupacional:" + ex.getMessage().toString());
                }
            //}else {
           // oFunc.SubSistemaMensajeError("No hay datos en anexo 7c");
        //}
    }
    void consultar() {
        if (!txtNorden.getText().isEmpty()) {
            if (!Orden()) {
                String Consulta = "SELECT d.cod_pa,d.nombres_pa,d.apellidos_pa,d.fecha_nacimiento_pa,d.sexo_pa,d.lugar_nac_pa,d.direccion_pa,\n" +
"       d.tel_casa_pa,d.cel_pa,d.estado_civil_pa,d.nivel_est_pa,n.n_orden,n.razon_empresa,n.razon_contrata,n.nom_examen,n.nom_ex,\n" +
"       n.altura_po,n.mineral_po,n.cargo_de,n.area_o,n.grupofactorsan,\n" +
"       t.talla,t.peso,t.imc,t.sistolica,t.diastolica,t.f_cardiaca,t.sat_02,\n" +
"       t.temperatura,t.cintura,t.cadera,t.icc,\n" +
"       CASE WHEN l.chko = 'TRUE' THEN 'O'\n" +
"       WHEN l.chka = 'TRUE' THEN 'A'\n" +
"       WHEN l.chkb = 'TRUE' THEN 'B'\n" +
"       WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| \n" +
"       CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' \n" +
"       WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS Grupofactor ,\n" +
"       l.chkpositivo,l.chknegativo, l.chko, l.chka , l.chkb , l.chkab,\n" +
"       l.txthemoglobina,l.txtleucocitosematologia,\n" +
"       l.txtlinfocitosematologia,l.txtbasofilosematologia,l.txteosinofiosematologia,l.txtplaquetas,"
       + "i.chkigm_reactivo,i.chkigg_reactivo,i.chkinvalido, i.chkigm_noreactivo,i.chkigg_noreactivo,"
                        + "c.chk_asintomatico,c.chk_sintomatico,c.txtresultados,\n" +
"       r.txtvertices, r.txthilios, r.txtsenoscostofrenicos, r.txtmediastinos, r.txtsiluetacardiovascular,\n" +
"       r.txtconclusionesradiograficas\n" +
"       FROM datos_paciente AS d \n" +
"       INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) \n" +
"       LEFT JOIN triaje as t ON(n.n_orden = t.n_orden) \n" +
"       LEFT JOIN radiografia_torax AS r ON(n.n_orden = r.n_orden)\n" +
"       LEFT JOIN lab_clinico AS l ON(n.n_orden = l.n_orden)\n" +
"       left JOIN ex_radiograficos_sanguineos AS e ON(n.n_orden = e.n_orden)"
        + "left JOIN examen_inmunologico AS i ON (n.n_orden = i.n_orden) "
        + "left JOIN constancia_salud_marsa AS c ON (n.n_orden = c.n_orden) "
                        + "WHERE n.n_orden ='" + txtNorden.getText().toString() + "'";
                
                oConn.FnBoolQueryExecute(Consulta);
                
                try {
                    if (oConn.setResult.next()) {
                        //oFunc.SubSistemaMensajeError(oConn.setResult.getString("txtobservaciones"));
                        
                        txtTipoExamen.setText(oConn.setResult.getString("nom_examen"));
                        String s=oConn.setResult.getString("cod_pa");
                        txtDni.setText(s);
                        txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtSexo.setText(oConn.setResult.getString("sexo_pa"));
                        txtLugarNacimiento.setText(oConn.setResult.getString("lugar_nac_pa"));
                        txtDomicilio.setText(oConn.setResult.getString("direccion_pa"));
                        txtTelefono.setText(oConn.setResult.getString("tel_casa_pa"));//== null ? "-":oConn.setResult.getString("cel_pa"));
                        txtEstadoCivil.setText(oConn.setResult.getString("estado_civil_pa"));
                        txtGradoInstruccion.setText(oConn.setResult.getString("nivel_est_pa"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())));
                        txtExplotacionEn.setText(oConn.setResult.getString("nom_ex"));
                        txtAlturaLabor.setText(oConn.setResult.getString("altura_po"));
                        txtMineralesExplotados.setText(oConn.setResult.getString("mineral_po"));
                        txtPuestoPostula.setText(oConn.setResult.getString("cargo_de"));
                        if ("ANUAL".equals(txtTipoExamen.getText().toString())) {
                            txtPuestoActual.setText(oConn.setResult.getString("cargo_de"));
                        }
                        txtArea.setText(oConn.setResult.getString("area_o"));
                        txtGFSPrevio.setText(oConn.setResult.getString("grupofactorsan"));
                        txtTalla.setText(oConn.setResult.getString("talla"));
                        txtPeso.setText(oConn.setResult.getString("peso"));
                        txtIMC.setText(oConn.setResult.getString("imc"));
                        
                        txtTemperatura.setText(oConn.setResult.getString("temperatura"));
                        txtCintura.setText(oConn.setResult.getString("cintura"));
                        txtCadera.setText(oConn.setResult.getString("cadera"));
                        txticc.setText(oConn.setResult.getString("icc"));
                        txtFcardiaca.setText(oConn.setResult.getString("f_cardiaca"));
                        txtSatO2.setText(oConn.setResult.getString("sat_02"));
                        txtSistolica.setText(oConn.setResult.getString("sistolica"));
                        txtDiastolica.setText(oConn.setResult.getString("diastolica"));
                        txtGrupoFacLab.setText(oConn.setResult.getString("Grupofactor"));
                        txtEncuestaCovid.append(String.valueOf(oConn.setResult.getBoolean("chk_asintomatico")).equals("true")?"ASINTOMATICO":"");
                        txtEncuestaCovid.append(String.valueOf(oConn.setResult.getBoolean("chk_sintomatico")).equals("true")?"SINTOMATICO: ".concat(oConn.setResult.getString("txtresultados")):"");
                        txtPruebaCovid.append(String.valueOf(oConn.setResult.getBoolean("chkigm_reactivo")).equals("true")? "IgM:POSITIVO":"IgM:NEGATIVO") ;
                        txtPruebaCovid.append(String.valueOf(oConn.setResult.getBoolean("chkigg_reactivo")).equals("true")? ", IgG:POSITIVO":"IgG:NEGATIVO") ;
                            txtRx.setText(oConn.setResult.getString("n_orden"));
                            txtVertices.setText(oConn.setResult.getString("txtvertices"));
                            txtHilios.setText(oConn.setResult.getString("txthilios"));
                            txtSenos.setText(oConn.setResult.getString("txtsenoscostofrenicos"));
                            txtMediastinos.setText(oConn.setResult.getString("txtmediastinos"));
                            txtSiluetaCardioVascular.setText(oConn.setResult.getString("txtsiluetacardiovascular"));
                            txtConclusionesRx.setText(oConn.setResult.getString("txtconclusionesradiograficas"));
                            txtHemoHema.setText(oConn.setResult.getString("txthemoglobina"));
                            txtAnamnesis.setText("PACIENTE REFIERE ESTAR ".concat(txtEncuestaCovid.getText()));
                            txtDiagnostico.append("1.".concat(txtEncuestaCovid.getText())+"\n");
                            txtDiagnostico.append("2.PRESENTA: ".concat(txtPruebaCovid.getText())+"\n");
                            if(!txtIMC.getText().isEmpty()){
                           float imc = Float.parseFloat(txtIMC.getText().toString());
                            txtIMC.setForeground(Color.black);
                            if (imc <= 18.5) {
                                txtIMC.setForeground(Color.red);
                                txtDiagnostico.append("- INDICE DE MASA CORPORAL: BAJO DE PESO." + '\n');
                            } else if (imc >= 25 && imc < 30) {
                                txtIMC.setForeground(Color.red);
                                txtDiagnostico.append("-SOBREPESO:DIETA HIPOCALORICA Y EJERCICIOS." + '\n');
                            } else if (imc >= 30 && imc < 35) {
                                txtIMC.setForeground(Color.red);
                                txtDiagnostico.append("-OBESIDAD I.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS" + '\n');
                            } else if (imc >= 35 && imc < 40) {
                                txtIMC.setForeground(Color.red);
                                txtDiagnostico.append("-OBESIDAD II.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS" + '\n');
                            } //else {
//                                txtObservacionesFichaMedica.append("-OBESIDAD III.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS" + '\n');
//                            } 
                        }
//                           if( !" ".equals(txtVertices.getText())){
//                            txtCalidad.setText("2");
//                            txtSimbolos.setText("N/A");
                            oPu.fecha(FechaRx);
//                           }
                       oPu.fecha(FechaFicha);
                       
                       if(txtGrupoFacLab.getText() == null ? txtGFSPrevio.getText() == null : !txtGrupoFacLab.getText().equals(txtGFSPrevio.getText())){
                            oFunc.SubSistemaMensajeError("Grupo Sanguinio incongruente por favotr revisar");
                        }  
                       sbCargarDatosPruebaCovid(s);
                    } else {
                        oFunc.SubSistemaMensajeError("No se encuentra Registros(Registros Necesarios): \n 1- Laboratorio Clinico \n 2- Radiografía de Torax P.A");
                    }
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Historia Ocupacional:" + ex.getMessage().toString());
                }
            }else {
             oFunc.SubSistemaMensajeInformacion("N° Orden registrado" );
            }
        } else {
            txtNorden.setText(null);
            txtNorden.requestFocus();
            oFunc.SubSistemaMensajeInformacion("Ficha Fue llenada y Esta Lista para Imprimir.");
        }
    }
    
    
    void actualizar(){
        if (!txtNorden.getText().isEmpty()) {
            if (Orden()) {
                String sql="UPDATE fmedica_covid_marsa SET fecha='"+FechaFicha.getDate()+
                    "',txtedad='"+txtEdad.getText().toString()+
                    "',txtpuestoactual='"+txtPuestoActual.getText().toString()+
                    "',txttiempo='"+txtTiempo.getText().toString()+
                    "',txtantecedentespersonales='"+txtAntecedentesPersonales.getText().toString()+
                    "',txtantecedentesfamiliares='"+txtAntecedentesFamiliares.getText().toString()+
                    "',rbnormal='"+rbNormal.isSelected()+
                    "',rbanormal='"+rbAnormal.isSelected()+
                    "',txtpulmones='"+txtPulmones.getText().toString()+
                    "',txtanamnesis='"+txtAnamnesis.getText().toString()+
                    "',encuesta_covid='"+txtEncuestaCovid.getText().toString()+
                    "',fecha_exra='"+FechaRx.getDate()+"', txtcalidad='"+txtCalidad.getText().toString()+
                    "',txtsimbolos='"+txtSimbolos.getText().toString()+
                    "',ex_0='"+rb0.isSelected()+"', ex_10='"+rb1.isSelected()+"', ex_11='"+rb2.isSelected()+
                    "', ex_12='"+rb3.isSelected()+"', ex_21='"+rb4.isSelected()+"', ex_22='"+rb5.isSelected()+
                    "',ex_23='"+rb6.isSelected()+"', ex_32='"+rb7.isSelected()+"', ex_33='"+rb8.isSelected()+
                    "', ex_3mas='"+rb9.isSelected()+"', ex_abc='"+rb10.isSelected()+ "', ex_st='"+rb11.isSelected()+
                    "', apto_si='"+rbSI.isSelected()+"', apto_no='"+rbNO.isSelected()+
                    "',prueba_covid='"+txtPruebaCovid.getText().toString()+    
                    "',txtdiagnostico='"+txtDiagnostico.getText().toString()+
                    "',txtrecomendaciones='"+txtRecomendaciones.getText().toString()+   
                    "' WHERE n_orden='"+txtNorden.getText().toString()+"'";
                if (oConn.FnBoolQueryExecuteUpdate(sql)) {
                    oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                    imprimir();
                    limpiar();
                } else {
                    oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
                }
            }else {
                oFunc.SubSistemaMensajeInformacion("NUMERO ORDEN NO EXISTE");
                txtNorden.setText(null);
                txtNorden.requestFocus();
            }
        }else {
            oFunc.SubSistemaMensajeInformacion("INGRESE EL NUMERO ORDEN");
        }
        
    }

    private boolean Agregar() {
        Boolean r = false;

        if (!txtNorden.getText().isEmpty()) {
            if (!Orden()) {
                String insert = "INSERT INTO fmedica_covid_marsa(n_orden, fecha ";
                String values = "VALUES ('" + txtNorden.getText().toString() + "','" + FechaFicha.getDate() + "'";
                if (!txtEdad.getText().isEmpty() ) {
                    insert += ",txtedad ";
                    values += ",'" + txtEdad.getText().toString() + "'";
                }
                if (!txtPuestoActual.getText().isEmpty()) {
                    insert += ",txtpuestoactual ";
                    values += ",'" + txtPuestoActual.getText().toString() + "'";
                }
                if (!txtTiempo.getText().isEmpty()) {
                    insert += ",txttiempo ";
                    values += ",'" + txtTiempo.getText().toString() + "'";
                }
                if (!txtAntecedentesPersonales.getText().isEmpty()) {
                    insert += ",txtantecedentespersonales ";
                    values += ",'" + txtAntecedentesPersonales.getText().toString() + "'";
                }
                if (!txtAntecedentesFamiliares.getText().isEmpty()) {
                    insert += ",txtantecedentesfamiliares ";
                    values += ",'" + txtAntecedentesFamiliares.getText().toString() + "'";
                }               
                insert += ",rbnormal ";
                values += ",'" + rbNormal.isSelected() + "'";
                insert += ",rbanormal ";
                values += ",'" + rbAnormal.isSelected() + "'";
                if (!txtPulmones.getText().isEmpty()) {
                    insert += ",txtpulmones ";
                    values += ",'" + txtPulmones.getText().toString() + "'";
                }
                insert += ",txtanamnesis";
                values += ",'" + txtAnamnesis.getText().toString() + "'";
                insert += ",encuesta_covid ";
                values += ",'" + txtEncuestaCovid.getText().toString() + "'";
                
                  insert += ",n_rx, fecha_exra, txtcalidad, txtsimbolos,"
                    + "ex_0, ex_10, ex_11, ex_12, ex_21, ex_22, ex_23, ex_32, ex_33,"
                    + "ex_3mas, ex_abc, ex_st";

                values +=",'"+txtRx.getText().toString()+ "','" +FechaRx.getDate()+ "','"+txtCalidad.getText()+"'";
                values += ",'"+ txtSimbolos.getText()+"'"; 
                values += ",'"+rb0.isSelected()+ "','"+rb1.isSelected()+"'";
                values += ",'"+rb2.isSelected()+"','"+rb3.isSelected()+"'";
                values += ",'"+rb4.isSelected()+ "','"+rb5.isSelected()+"'";
                values += ",'"+rb6.isSelected()+"','"+rb7.isSelected()+"'";
                values += ",'"+rb8.isSelected()+"','"+rb9.isSelected()+"'";
                values += ",'"+rb10.isSelected()+"','"+rb11.isSelected()+"'";

                
                insert += ",apto_si,apto_no"; 
                values += ",'"+rbSI.isSelected()+"','"+rbNO.isSelected()+"'";
                if (!txtPruebaCovid.getText().isEmpty()) {
                    insert += ",prueba_covid ";
                    values += ",'" + txtPruebaCovid.getText().toString() + "'";
                } 
                if (!txtDiagnostico.getText().isEmpty()) {
                    insert += ",txtdiagnostico ";
                    values += ",'" + txtDiagnostico.getText().toString() + "'";
                }    
                if (!txtRecomendaciones.getText().isEmpty()) {
                    insert += ",txtrecomendaciones ";
                    values += ",'" + txtRecomendaciones.getText().toString() + "'";
                } 
                
//                oFunc.SubSistemaMensajeInformacion(insert + values);
                if (oConn.FnBoolQueryExecuteUpdate(insert.concat(")") + values.concat(")"))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                    r = true;

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");

                }
            } else {
                txtNorden.setText(null);
                txtNorden.requestFocus();
            }
        } else {
            oFunc.SubSistemaMensajeError("Ingrese Correctamente los datos");
            txtNorden.setText(null);
            txtNorden.requestFocus();
            jtFichaMedica.setSelectedIndex(0);
        }
        return r;
    }

    private void limpiar() {
        txtNorden.setText(null);
        txtTipoExamen.setText(null);
        FechaFicha.setDate(null);
        txtDni.setText(null);
        txtNombre.setText(null);
        txtEdad.setText(null);
        txtApellido.setText(null);
        FechaNacimiento.setDate(null);
        txtSexo.setText(null);
        txtLugarNacimiento.setText(null);
        txtDomicilio.setText(null);
        txtTelefono.setText(null);
        txtEstadoCivil.setText(null);
        txtGradoInstruccion.setText(null);
        txtEmpresa.setText(null);
        txtContrata.setText(null);
        txtMineralesExplotados.setText(null);
        txtExplotacionEn.setText(null);
        txtAlturaLabor.setText(null);
        txtTalla.setText(null);
        txtPeso.setText(null);
        txtIMC.setText(null);
        txtAntecedentesPersonales.setText("NIEGA DB, TBC, HTA, CONVULSIONES, ASMA, ALERGIAS, ACCIDENTES");
        txtAntecedentesFamiliares.setText("NO CONTRIBUTORIOS");
        txtAnamnesis.setText("PACIENTE REFIERE");
        txtPruebaCovid.setText(null);
        txtEncuestaCovid.setText(null);
        txtDiagnostico.setText(null);
        txtRecomendaciones.setText(null);
        
//txtInmunizaciones.setText("NO RECUERDA");
        txtPuestoPostula.setText(null);
        txtArea.setText(null);
        txtPuestoActual.setText(null);
        txtTiempo.setText("N/A");
        
        txtTemperatura.setText(null);
        txtCintura.setText(null);
        txtCadera.setText(null);
        txticc.setText(null);
        
//        txtEnfermedadesOculares2.setText("NINGUNA");
        
        txtFcardiaca.setText(null);
        txtSatO2.setText(null);
        txtSistolica.setText(null);
        txtDiastolica.setText(null);
        rbNormal.setSelected(true);
        txtPulmones.setText("BPMV EN ACP. NO RALES");
        txtGFSPrevio.setText(null);
        txtGrupoFacLab.setText(null);
        txtLeucocitos.setText(null);
        txtLinfocitos.setText(null);
        txtBastones.setText(null);
        txteosinofilos.setText(null);
        txtPlaquetas.setText(null);
         Limpiar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaFicha;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private com.toedter.calendar.JDateChooser FechaRx;
    private javax.swing.ButtonGroup btAlcohol;
    private javax.swing.ButtonGroup btApto;
    private javax.swing.ButtonGroup btDrogas;
    private javax.swing.ButtonGroup btEx;
    private javax.swing.ButtonGroup btGrupoSanguineo;
    private javax.swing.ButtonGroup btGrupoSanguineoTIPO;
    private javax.swing.ButtonGroup btNegativoPositivo;
    private javax.swing.ButtonGroup btTabaco;
    private javax.swing.ButtonGroup btTacto;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditarFM;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JTabbedPane jtFichaMedica;
    private javax.swing.JTabbedPane jtPruebas;
    private javax.swing.JRadioButton rb0;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb10;
    private javax.swing.JRadioButton rb11;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JRadioButton rb7;
    private javax.swing.JRadioButton rb8;
    private javax.swing.JRadioButton rb9;
    private javax.swing.JRadioButton rbAnormal;
    private javax.swing.JRadioButton rbNO;
    private javax.swing.JRadioButton rbNormal;
    private javax.swing.JRadioButton rbSI;
    private javax.swing.JTable tbPruebasCovid;
    private javax.swing.ButtonGroup tbPulmones;
    private javax.swing.ButtonGroup tbReubicacion;
    private javax.swing.JTextField txtAlturaLabor;
    private javax.swing.JTextField txtAnamnesis;
    private javax.swing.JTextField txtAntecedentesFamiliares;
    private javax.swing.JTextField txtAntecedentesPersonales;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBastones;
    private javax.swing.JTextField txtCadera;
    private javax.swing.JTextField txtCalidad;
    private javax.swing.JTextField txtCintura;
    private javax.swing.JTextField txtConclusionesRx;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDiastolica;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextArea txtEncuestaCovid;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtExplotacionEn;
    private javax.swing.JTextField txtFcardiaca;
    private javax.swing.JTextField txtGFSPrevio;
    private javax.swing.JTextField txtGradoInstruccion;
    private javax.swing.JTextField txtGrupoFacLab;
    private javax.swing.JTextField txtHemoHema;
    private javax.swing.JTextField txtHilios;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JTextField txtImprimir;
    private javax.swing.JTextField txtLeucocitos;
    private javax.swing.JTextField txtLinfocitos;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtMediastinos;
    private javax.swing.JTextField txtMineralesExplotados;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPlaquetas;
    private javax.swing.JTextArea txtPruebaCovid;
    private javax.swing.JTextField txtPuestoActual;
    private javax.swing.JTextField txtPuestoPostula;
    private javax.swing.JTextField txtPulmones;
    private javax.swing.JTextArea txtRecomendaciones;
    private javax.swing.JTextField txtRx;
    private javax.swing.JTextField txtSatO2;
    private javax.swing.JTextField txtSenos;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSiluetaCardioVascular;
    private javax.swing.JTextField txtSimbolos;
    private javax.swing.JTextField txtSistolica;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtTipoExamen;
    private javax.swing.JTextField txtVertices;
    private javax.swing.JTextField txteosinofilos;
    private javax.swing.JTextField txticc;
    // End of variables declaration//GEN-END:variables
public static int calcularEdad(String fecha) {
        String datetext = fecha;
        try {
            Calendar birth = new GregorianCalendar();
            Calendar today = new GregorianCalendar();
            int age = 0;
            int factor = 0;
            Date birthDate = new SimpleDateFormat("dd-MM-yyyy").parse(datetext);
            Date currentDate = new Date(); //current date
            birth.setTime(birthDate);
            today.setTime(currentDate);
            if (today.get(Calendar.MONTH) <= birth.get(Calendar.MONTH)) {
                if (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH)) {
                    if (today.get(Calendar.DATE) > birth.get(Calendar.DATE)) {
                        factor = -1; //Aun no celebra su cumpleaÃ±os
                    }
                } else {
                    factor = -1; //Aun no celebra su cumpleaÃ±os
                }
            }
            age = (today.get(Calendar.YEAR) - birth.get(Calendar.YEAR)) + factor;

            return age;

        } catch (ParseException e) {
            return -1;
        }

    }
    public void txtObsv(String Ocupacion) {
        txtDiagnostico.append(Ocupacion.concat("\n"));
    }
    void Limpiar(){
        txtRx.setText(null);
        FechaRx.setDate(null);
        txtCalidad.setText(null);
        txtSimbolos.setText(null);
        txtVertices.setText(null);
        txtHilios.setText(null);
        txtSenos.setText(null);
        txtMediastinos.setText(null);
        txtConclusionesRx.setText(null);
        txtSiluetaCardioVascular.setText(null);
        btEx.clearSelection();
        rb0.setSelected(false);
        btNegativoPositivo.clearSelection();
        btGrupoSanguineo.clearSelection();
        btGrupoSanguineoTIPO.clearSelection();
        txtHemoHema.setText(null);
        btApto.clearSelection();
        rbSI.setSelected(true);
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
              printer(Integer.valueOf(txtNorden.getText()));
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Ficha_Medica_COVID.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
   void sbCargarDatosPruebaCovid(String valor) {
        String[] titulos = {"Fecha", "N°Prueba","IGM","IGG","SINTOMAS","RESULTADO"};
        String[] registros = new String[6];
        String sql = "";
            sql = "SELECT n.fecha_apertura_po,n.chkcovid1,n.chkcovid2,\n" +
"     CASE WHEN i.chkigm_reactivo = 'TRUE' THEN 'POSITIVO'\n" +
"          WHEN i.chkigm_noreactivo = 'TRUE' THEN 'NEGATIVO' \n" +
"          WHEN i.chkinvalido = 'TRUE' THEN 'INVALIDO' END AS IGM,\n" +
"     CASE WHEN i.chkigg_reactivo = 'TRUE' THEN 'POSITIVO'\n" +
"          WHEN i.chkigg_noreactivo = 'TRUE' THEN 'NEGATIVO'\n" +
"          WHEN i.chkinvalido = 'TRUE' THEN 'INVALIDO' END AS IGG,\n" +
"     CASE WHEN c.chk_asintomatico = 'TRUE' THEN 'ASINTOMATIVO'\n" +
"          WHEN c.chk_sintomatico = 'TRUE' THEN 'SINTOMATICO' END AS SINTOMAS,\n" +
"     CASE WHEN c.chk_asintomatico = 'TRUE' THEN '...'\n" +
"          WHEN c.chk_sintomatico = 'TRUE' THEN txtresultados END AS RESULTADO\n" +
"          FROM datos_paciente as dp \n" +
"                 inner join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) \n" +
"                 LEFT JOIN examen_inmunologico AS i ON (n.n_orden = i.n_orden) \n" +
"                LEFT JOIN constancia_salud_marsa AS c ON (n.n_orden = c.n_orden) \n" +
//                "  inner join lab_clinico as l on(n.n_orden=l.n_orden)\n" +
                "  where n.cod_pa="+valor +"and n.nom_examen='COVID-19'";
           model = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if (oConn.FnBoolQueryExecute(sql)) {
            try {
                while (oConn.setResult.next()) {
                    registros[0] = formato.format(oConn.setResult.getDate("fecha_apertura_po"));
                    String c1=oConn.setResult.getString("chkcovid1");
                    String c2 = oConn.setResult.getString("chkcovid2");
                    if("t".equals(c1)){
                        c1="PRUEBA-1";
                        registros[1] = c1;
                    }else if("t".equals(c2)){
                        c2="PRUEBA-2";
                        registros[1] = c2;
                    }else {
                        registros[1] = "";
                    }
                    registros[2] = oConn.setResult.getString("IGM");;
                    registros[3] = oConn.setResult.getString("IGG");
                    registros[4] =  oConn.setResult.getString("SINTOMAS");
                    registros[5] = oConn.setResult.getString("RESULTADO");
                    //registros[3]=oConn.setResult.getString("anexo7c");
                    tbPruebasCovid.setDefaultRenderer(Object.class, new MyCellRenderer());
                    model.addRow(registros);
                }
                // Coloca el Modelo de Nueva Cuenta
                tbPruebasCovid.setModel(model);
                sbTablaPruebasCovid();

                // Cierra Resultados
                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
   public class MyCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            boolean valid = String.valueOf(table.getValueAt(row, 2)).equals("");

            component.setBackground(valid ? Color.white : Color.yellow);

            component.setForeground(valid ? Color.white : Color.red);
            return component;
        }
        
    }
   private void sbTablaPruebasCovid()
    {
               
        tbPruebasCovid.setFont(new java.awt.Font("Tahoma", 0, 8)); 
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.LEFT);
//        tblabclinico.setForeground(Color.red);
        tbPruebasCovid.setGridColor(Color.blue);
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbPruebasCovid.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
//        tblabclinico.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
        tbPruebasCovid.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
//        tblabclinico.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        
        tbPruebasCovid.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11)); 
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }
    
}
