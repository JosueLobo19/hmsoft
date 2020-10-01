/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.AddCargos;
import Caja.RegistrarCliente;
import static Caja.RegistrarCliente.addExEn;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import java.awt.Color;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public final class Aptitud_Anexo03 extends javax.swing.JInternalFrame {

    public static frmObservaciones addObsv;
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPu = new clsOperacionesUsuarios();
    
    boolean ordenVer=true;
     DefaultTableModel model;
   Integer num= null;
    public Aptitud_Anexo03() {
        initComponents();
        //Fecha();
        txtAlturaLabor.setText( clsGlobales.sNomOperador  );
        sbCargarDatosAP();
    }

    void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaFicha.setDate(fechaDate);
}
    

   
    private boolean validar() {
        boolean bResultado = true;
        if (((JTextField) FechaFicha.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha ");
            bResultado = false;
        }

        return bResultado;
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPresentacion = new javax.swing.ButtonGroup();
        bgPostura = new javax.swing.ButtonGroup();
        bgRitmo = new javax.swing.ButtonGroup();
        bgTono = new javax.swing.ButtonGroup();
        bgArticulacion = new javax.swing.ButtonGroup();
        bgTiempo = new javax.swing.ButtonGroup();
        bgEspacio = new javax.swing.ButtonGroup();
        bgPersona = new javax.swing.ButtonGroup();
        bgMemoria = new javax.swing.ButtonGroup();
        bgInteligencia = new javax.swing.ButtonGroup();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtPuestoPostula = new javax.swing.JTextField();
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
        jPanel7 = new javax.swing.JPanel();
        jLabel204 = new javax.swing.JLabel();
        Año = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        txtCausaRet = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbEmpresasAnteriores = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnQui = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        txtNomEmpresa = new javax.swing.JTextField();
        txtActEmpresa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        txtTSup = new javax.swing.JTextField();
        txtTSub = new javax.swing.JTextField();
        jLabel207 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        txtexperiencia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMotivoEval = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtPrincipalesRiesgos = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtMedidasSeguridad = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtHistoriaFamiliar = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtHabitos = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        rbAdecuado = new javax.swing.JRadioButton();
        rbInadecuado = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        rbErguida = new javax.swing.JRadioButton();
        rbEncorvada = new javax.swing.JRadioButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        rbLento = new javax.swing.JRadioButton();
        rbRapido = new javax.swing.JRadioButton();
        rbFluido = new javax.swing.JRadioButton();
        jPanel28 = new javax.swing.JPanel();
        rbBajo = new javax.swing.JRadioButton();
        rbModerado = new javax.swing.JRadioButton();
        rbAlto = new javax.swing.JRadioButton();
        jPanel29 = new javax.swing.JPanel();
        rbConDificultad = new javax.swing.JRadioButton();
        rbSinDificultad = new javax.swing.JRadioButton();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        rbTOrientado = new javax.swing.JRadioButton();
        rbTDesorientado = new javax.swing.JRadioButton();
        jPanel32 = new javax.swing.JPanel();
        rbEOrientado = new javax.swing.JRadioButton();
        rbEDesorientado = new javax.swing.JRadioButton();
        jPanel33 = new javax.swing.JPanel();
        rbPOrientado = new javax.swing.JRadioButton();
        rbPDesorientado = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        rbCortoPlazo = new javax.swing.JRadioButton();
        rbMedianoPlazo = new javax.swing.JRadioButton();
        rbLargoPlazo = new javax.swing.JRadioButton();
        jLabel66 = new javax.swing.JLabel();
        txtLucido = new javax.swing.JTextField();
        txtPensamiento = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtPercepcion = new javax.swing.JTextField();
        txtApetito = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        rbMuySuperior = new javax.swing.JRadioButton();
        rbSuperior = new javax.swing.JRadioButton();
        rbNormal = new javax.swing.JRadioButton();
        rbPromedio = new javax.swing.JRadioButton();
        rbTorpe = new javax.swing.JRadioButton();
        rbFronterizo = new javax.swing.JRadioButton();
        rbLeve = new javax.swing.JRadioButton();
        rbRModerado = new javax.swing.JRadioButton();
        rbRSevero = new javax.swing.JRadioButton();
        rbRProfundo = new javax.swing.JRadioButton();
        jLabel71 = new javax.swing.JLabel();
        txtSueño = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txtPersonalidad = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txtAfectividad = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        txtConductaSexual = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        txtPuntaje1 = new javax.swing.JTextField();
        txtPuntaje2 = new javax.swing.JTextField();
        txtPuntaje3 = new javax.swing.JTextField();
        txtPuntaje4 = new javax.swing.JTextField();
        txtPuntaje5 = new javax.swing.JTextField();
        txtPuntaje6 = new javax.swing.JTextField();
        txtPuntaje7 = new javax.swing.JTextField();
        txtPuntaje8 = new javax.swing.JTextField();
        txtPuntaje9 = new javax.swing.JTextField();
        txtPuntaje10 = new javax.swing.JTextField();
        txtPuntaje11 = new javax.swing.JTextField();
        txtPuntaje12 = new javax.swing.JTextField();
        txtPuntaje13 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtAreaCognitiva = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtAreaEmocional = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtIMP = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Ficha Psicologica Anexo 03");
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1100, 590));
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

        jLabel21.setText("Puesto :");

        txtPuestoPostula.setEditable(false);
        txtPuestoPostula.setText("N/A");

        jLabel27.setText("Area :");

        txtArea.setEditable(false);

        txtExplotacionEn.setEditable(false);

        txtAlturaLabor.setEditable(false);
        txtAlturaLabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaLaborActionPerformed(evt);
            }
        });

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

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTERIORES EMPRESAS (experiencia laboral)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel204.setText("Fecha");

        Año.setText("Puesto");

        jLabel20.setText("Causa retiro");

        tbEmpresasAnteriores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbEmpresasAnteriores);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnQui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnQui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuiMouseClicked(evt);
            }
        });

        jLabel206.setText("Nombre Empresa");

        jLabel14.setText("Act. Empresa");

        jLabel205.setText("T. Sup");

        jLabel207.setText("T. Sub");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha)
                            .addComponent(jLabel204, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel206)
                            .addComponent(txtNomEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtActEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Año))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTSup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel205))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel207)
                            .addComponent(txtTSub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtCausaRet, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQui, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQui, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel206)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel204)
                                .addComponent(jLabel20)
                                .addComponent(jLabel14)
                                .addComponent(jLabel205)
                                .addComponent(Año)
                                .addComponent(jLabel207))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCausaRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtActEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLabel104.setText("T.Laborando :");

        txtexperiencia.setBackground(new java.awt.Color(255, 204, 0));
        txtexperiencia.setText("  AÑOS");
        txtexperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexperienciaActionPerformed(evt);
            }
        });

        txtMotivoEval.setColumns(5);
        txtMotivoEval.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtMotivoEval.setLineWrap(true);
        txtMotivoEval.setRows(3);
        txtMotivoEval.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Motivo Evaluación :"));
        jScrollPane2.setViewportView(txtMotivoEval);

        txtPrincipalesRiesgos.setColumns(5);
        txtPrincipalesRiesgos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtPrincipalesRiesgos.setLineWrap(true);
        txtPrincipalesRiesgos.setRows(3);
        txtPrincipalesRiesgos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Principales Riesgos :"));
        jScrollPane6.setViewportView(txtPrincipalesRiesgos);

        txtMedidasSeguridad.setColumns(5);
        txtMedidasSeguridad.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtMedidasSeguridad.setLineWrap(true);
        txtMedidasSeguridad.setRows(3);
        txtMedidasSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Medidas de Seguridad :"));
        jScrollPane7.setViewportView(txtMedidasSeguridad);

        txtHistoriaFamiliar.setColumns(5);
        txtHistoriaFamiliar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtHistoriaFamiliar.setLineWrap(true);
        txtHistoriaFamiliar.setRows(3);
        txtHistoriaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Historia Familiar :"));
        jScrollPane8.setViewportView(txtHistoriaFamiliar);

        txtHabitos.setColumns(5);
        txtHabitos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtHabitos.setLineWrap(true);
        txtHabitos.setRows(3);
        txtHabitos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Habitos:"));
        jScrollPane9.setViewportView(txtHabitos);

        txtObservaciones.setColumns(5);
        txtObservaciones.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(3);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Otras Observaciones :"));
        jScrollPane10.setViewportView(txtObservaciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEditarFM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtAlturaLabor))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtMineralesExplotados, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtExplotacionEn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtGradoInstruccion, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtContrata, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtPuestoPostula, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel27))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtexperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnEditarFM)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtTipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel104)
                                .addComponent(txtexperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtPuestoPostula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtGradoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtMineralesExplotados, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtExplotacionEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlturaLabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        jtFichaMedica.addTab("Datos Personales - Ocupacionales", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Observacion de Conductas"));

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Presentación :"));

        bgPresentacion.add(rbAdecuado);
        rbAdecuado.setText("Adecuado");

        bgPresentacion.add(rbInadecuado);
        rbInadecuado.setText("Inadecuado");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAdecuado)
                    .addComponent(rbInadecuado))
                .addGap(0, 0, 0))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(rbAdecuado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbInadecuado)
                .addGap(0, 0, 0))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Postura :"));

        bgPostura.add(rbErguida);
        rbErguida.setText("Erguida");

        bgPostura.add(rbEncorvada);
        rbEncorvada.setText("Encorvada");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbErguida)
                    .addComponent(rbEncorvada))
                .addGap(0, 0, 0))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(rbErguida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEncorvada)
                .addGap(0, 0, 0))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Discurso :"));

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ritmo :"));

        bgRitmo.add(rbLento);
        rbLento.setText("Lento");

        bgRitmo.add(rbRapido);
        rbRapido.setText("Rápido");

        bgRitmo.add(rbFluido);
        rbFluido.setText("Fluido");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbLento)
            .addComponent(rbRapido)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbFluido)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(rbLento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbRapido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFluido)
                .addGap(0, 0, 0))
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tono :"));

        bgTono.add(rbBajo);
        rbBajo.setText("Bajo");

        bgTono.add(rbModerado);
        rbModerado.setText("Moderado");

        bgTono.add(rbAlto);
        rbAlto.setText("Alto");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbBajo)
                    .addComponent(rbModerado)
                    .addComponent(rbAlto))
                .addGap(0, 0, 0))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(rbBajo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbModerado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbAlto))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Articulación :"));

        bgArticulacion.add(rbConDificultad);
        rbConDificultad.setText("Con dificultad");

        bgArticulacion.add(rbSinDificultad);
        rbSinDificultad.setText("Sin dificultad");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbConDificultad)
                    .addComponent(rbSinDificultad))
                .addGap(0, 0, 0))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(rbConDificultad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSinDificultad)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Orientación"));

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tiempo"));

        bgTiempo.add(rbTOrientado);
        rbTOrientado.setText("Orientado");

        bgTiempo.add(rbTDesorientado);
        rbTDesorientado.setText("Desorientado");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbTOrientado)
                    .addComponent(rbTDesorientado))
                .addGap(0, 0, 0))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(rbTOrientado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTDesorientado)
                .addGap(0, 0, 0))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Espacio :"));

        bgEspacio.add(rbEOrientado);
        rbEOrientado.setText("Orientado");

        bgEspacio.add(rbEDesorientado);
        rbEDesorientado.setText("Desorientado");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEOrientado)
                    .addComponent(rbEDesorientado))
                .addGap(0, 0, 0))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(rbEOrientado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEDesorientado)
                .addGap(0, 0, 0))
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Persona"));

        bgPersona.add(rbPOrientado);
        rbPOrientado.setText("Orientado");

        bgPersona.add(rbPDesorientado);
        rbPDesorientado.setText("Desorientado");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPOrientado)
                    .addComponent(rbPDesorientado))
                .addGap(0, 0, 0))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(rbPOrientado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPDesorientado)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Procesos Cognitivos :"));

        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Memoria :"));

        bgMemoria.add(rbCortoPlazo);
        rbCortoPlazo.setText("Corto Plazo ");

        bgMemoria.add(rbMedianoPlazo);
        rbMedianoPlazo.setText("Mediano Plazo");
        rbMedianoPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMedianoPlazoActionPerformed(evt);
            }
        });

        bgMemoria.add(rbLargoPlazo);
        rbLargoPlazo.setText("Largo Plazo");
        rbLargoPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLargoPlazoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(rbCortoPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMedianoPlazo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbLargoPlazo)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCortoPlazo)
                    .addComponent(rbMedianoPlazo)
                    .addComponent(rbLargoPlazo))
                .addGap(0, 0, 0))
        );

        jLabel66.setText("Lucido, atento :");

        txtLucido.setBackground(new java.awt.Color(153, 204, 255));
        txtLucido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLucidoFocusGained(evt);
            }
        });

        txtPensamiento.setBackground(new java.awt.Color(153, 204, 255));
        txtPensamiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPensamientoFocusGained(evt);
            }
        });

        jLabel68.setText("Pensamiento :");

        jLabel69.setText("Percepción :");

        txtPercepcion.setBackground(new java.awt.Color(153, 204, 255));
        txtPercepcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPercepcionFocusGained(evt);
            }
        });

        txtApetito.setBackground(new java.awt.Color(153, 204, 255));
        txtApetito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApetitoFocusGained(evt);
            }
        });

        jLabel70.setText("Apetito :");

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Inteligencia :"));

        bgInteligencia.add(rbMuySuperior);
        rbMuySuperior.setText("Muy Superior");

        bgInteligencia.add(rbSuperior);
        rbSuperior.setText("Superior");

        bgInteligencia.add(rbNormal);
        rbNormal.setText("Normal Brillante");

        bgInteligencia.add(rbPromedio);
        rbPromedio.setText("Promedio");

        bgInteligencia.add(rbTorpe);
        rbTorpe.setText("N.Torpe");

        bgInteligencia.add(rbFronterizo);
        rbFronterizo.setText("Fronterizo");

        bgInteligencia.add(rbLeve);
        rbLeve.setText("RM Leve");

        bgInteligencia.add(rbRModerado);
        rbRModerado.setText("RM Moderado");

        bgInteligencia.add(rbRSevero);
        rbRSevero.setText("RM Severo");

        bgInteligencia.add(rbRProfundo);
        rbRProfundo.setText("RM Profundo");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(rbMuySuperior)
                                .addGap(0, 0, 0)
                                .addComponent(rbSuperior))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(rbTorpe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbFronterizo)))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(rbNormal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPromedio))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(rbLeve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbRModerado))))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(rbRSevero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbRProfundo)))
                .addGap(0, 0, 0))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMuySuperior)
                    .addComponent(rbSuperior)
                    .addComponent(rbNormal)
                    .addComponent(rbPromedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTorpe)
                    .addComponent(rbFronterizo)
                    .addComponent(rbLeve)
                    .addComponent(rbRModerado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRSevero)
                    .addComponent(rbRProfundo))
                .addGap(0, 0, 0))
        );

        jLabel71.setText("Sueño :");

        txtSueño.setBackground(new java.awt.Color(153, 204, 255));
        txtSueño.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSueñoFocusGained(evt);
            }
        });

        jLabel72.setText("Personalidad :");

        txtPersonalidad.setBackground(new java.awt.Color(153, 204, 255));
        txtPersonalidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPersonalidadFocusGained(evt);
            }
        });
        txtPersonalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonalidadActionPerformed(evt);
            }
        });

        jLabel73.setText("Afectividad :");

        txtAfectividad.setBackground(new java.awt.Color(153, 204, 255));
        txtAfectividad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAfectividadFocusGained(evt);
            }
        });

        jLabel74.setText("Conducta Sexual :");

        txtConductaSexual.setBackground(new java.awt.Color(153, 204, 255));
        txtConductaSexual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConductaSexualFocusGained(evt);
            }
        });
        txtConductaSexual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConductaSexualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLucido))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPensamiento))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPercepcion))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApetito))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSueño))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPersonalidad))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAfectividad))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtConductaSexual)))))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(txtLucido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(txtPensamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(txtPercepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(txtApetito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(txtSueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(txtPersonalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(txtAfectividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(txtConductaSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel75.setText("Inventario Millón de Estilos de Personalidad - MIPS");

        jLabel76.setText("Escala de Motivacioes Psicosociales -MPS");

        jLabel77.setText("Luria - DNA Diagnostico neuropsicológico de Adultos");

        jLabel78.setText("Escala de Apresiación del Estrés EAE");

        jLabel79.setText("Inventario de Bornout de  Maslach");

        jLabel80.setText("Clima laboral");

        jLabel81.setText("Bateria de Conductores");

        jLabel82.setText("WAIS");

        jLabel83.setText("Test BENTON");

        jLabel84.setText("Test Bender");

        jLabel85.setText("Inventario de la ansiedad ZUNG");

        jLabel86.setText("Inventario de Depresión ZUNG\t");

        jLabel87.setText("Escala de Memoria de Wechsler");

        txtPuntaje4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntaje4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Ptje");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Nombre");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtPuntaje1)
                    .addComponent(txtPuntaje2)
                    .addComponent(txtPuntaje3)
                    .addComponent(txtPuntaje4)
                    .addComponent(txtPuntaje5)
                    .addComponent(txtPuntaje6)
                    .addComponent(txtPuntaje7)
                    .addComponent(txtPuntaje8)
                    .addComponent(txtPuntaje9)
                    .addComponent(txtPuntaje10)
                    .addComponent(txtPuntaje11)
                    .addComponent(txtPuntaje12)
                    .addComponent(txtPuntaje13))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel76)
                                .addComponent(jLabel75)
                                .addComponent(jLabel79)
                                .addComponent(jLabel80)
                                .addComponent(jLabel81)
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addGap(5, 5, 5)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(txtPuntaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtPuntaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77)
                    .addComponent(txtPuntaje3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(txtPuntaje4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(txtPuntaje5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(txtPuntaje6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(txtPuntaje7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(txtPuntaje8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(txtPuntaje9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(txtPuntaje10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(txtPuntaje11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(txtPuntaje12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtPuntaje13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAreaCognitiva.setColumns(5);
        txtAreaCognitiva.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtAreaCognitiva.setLineWrap(true);
        txtAreaCognitiva.setRows(3);
        txtAreaCognitiva.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Área Cognitiva"));
        jScrollPane12.setViewportView(txtAreaCognitiva);

        txtAreaEmocional.setColumns(5);
        txtAreaEmocional.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtAreaEmocional.setLineWrap(true);
        txtAreaEmocional.setRows(3);
        txtAreaEmocional.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Área Emocional"));
        jScrollPane13.setViewportView(txtAreaEmocional);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        jButton1.setText("Guardar /Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imprimir N°orden"));

        txtIMP.setBackground(new java.awt.Color(255, 153, 0));
        txtIMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIMPActionPerformed(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIMP))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel16.getAccessibleContext().setAccessibleName("");

        jtFichaMedica.addTab("Examén Mental", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtFichaMedica, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtNorden.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtexperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexperienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexperienciaActionPerformed

    private void btnQuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuiMouseClicked
        Qui();
        String sql = "DELETE FROM empresas_anexo_03"
        + " WHERE cod_anexo ='" +num+ "' RETURNING cod_anexo03";
        if (oConn.FnBoolQueryExecute(sql)) {
            oFunc.SubSistemaMensajeInformacion("Se ha se elimino la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo eliminar");
        }
    }//GEN-LAST:event_btnQuiMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddAP();
        txtFecha.setText(null);
        txtNomEmpresa.setText(null);
        txtActEmpresa.setText(null);
        txtPuesto.setText(null);
        txtTSup.setText(null);
        txtTSub.setText(null);
        txtCausaRet.setText(null);
        txtFecha.requestFocusInWindow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        Qui();
        limpiar();

    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnEditarFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFMActionPerformed
        if(!txtNorden.getText().isEmpty()){
            if(Orden()){
                editar();

            }else {oFunc.SubSistemaMensajeError("No hay datos en anexo 7c o orden no existe");}
        }else{
            oFunc.SubSistemaMensajeError("Debe ingresar numero de orden");
        }

        //        String sql="Select * from anexo7c WHERE n.n_orden ='" + txtEOrden.getText().toUpperCase() + "'";
    }//GEN-LAST:event_btnEditarFMActionPerformed

    private void FechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaNacimientoPropertyChange

    }//GEN-LAST:event_FechaNacimientoPropertyChange

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtNordenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyReleased

    }//GEN-LAST:event_txtNordenKeyReleased

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        consultar();

    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtLucidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLucidoFocusGained
        txtLucido.selectAll();
    }//GEN-LAST:event_txtLucidoFocusGained

    private void txtPensamientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPensamientoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPensamientoFocusGained

    private void txtPercepcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPercepcionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPercepcionFocusGained

    private void txtApetitoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApetitoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApetitoFocusGained

    private void rbMedianoPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMedianoPlazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMedianoPlazoActionPerformed

    private void rbLargoPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLargoPlazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLargoPlazoActionPerformed

    private void txtSueñoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSueñoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueñoFocusGained

    private void txtPersonalidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPersonalidadFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonalidadFocusGained

    private void txtAfectividadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAfectividadFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfectividadFocusGained

    private void txtConductaSexualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConductaSexualFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConductaSexualFocusGained

    private void txtAlturaLaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaLaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaLaborActionPerformed

    private void txtPersonalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonalidadActionPerformed

    private void txtPuntaje4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntaje4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntaje4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(Orden()){
            ActualizarFicha();
            Qui();
            
        }else if (validar()) {
            try {
                if (Agregar()) {
                    if (tbEmpresasAnteriores.getRowCount() > 0) {
                        if (GrabarAPDetalle()) {
                            imprimir();
                            limpiar();
                            Qui();
                        }
                    } else {
                       imprimir();
                        limpiar();
                        Qui();
                    }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(FichaAgroindustriales.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtConductaSexualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConductaSexualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConductaSexualActionPerformed

    private void txtIMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIMPActionPerformed
        if(!txtIMP.getText().isEmpty()){
            print(Integer.valueOf(txtIMP.getText()));
        }
    }//GEN-LAST:event_txtIMPActionPerformed

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        if(!txtIMP.getText().isEmpty()){
            print(Integer.valueOf(txtIMP.getText()));
        }
    }//GEN-LAST:event_jLabel44MouseClicked
   

    public boolean Orden() {
        boolean bResultado = false;

        String sQuery;
        sQuery = "Select n_orden from ficha_psicologica_anexo03 Where n_orden=" + txtNorden.getText().toString();
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

    void editar(){
       Nacimiento = new com.toedter.calendar.JDateChooser();
    
        if(!txtNorden.getText().isEmpty()){
            String consulta="SELECT d.apellidos_pa ,d.nombres_pa, d.fecha_nacimiento_pa,d.lugar_nac_pa,d.estado_civil_pa,\n" +
            "       d.nivel_est_pa,d.direccion_pa, n.nom_examen, d.sexo_pa, n.razon_empresa, n.razon_contrata,n.cargo_de,\n" +
            "       n.area_o, n.nom_ex, n.mineral_po,n.altura_po,f.cod_anexo03,f.fecha, f.motivo_eval, f.timpo_trab, f.princ_riesgo, \n" +
            "       f.med_seguridad, f.hist_familiar, f.habitos, f.otras_observ, f.rb_adecuado, \n" +
            "       f.rb_indecuado, f.rb_erguida, f.rb_encorvada, f.rb_lento, f.rb_rapido, \n" +
            "       f.rb_fluido, f.rb_bajo, f.rb_moderado, f.rb_alto, f.rb_condificultad, f.rb_sindificultad, \n" +
            "       f.rb_torientado, f.rb_tdesorientado, f.rb_eorientado, f.rb_edesorientado, \n" +
            "       f.rb_porientado, f.rb_pdesorientado, f.lucido, f.pensamiento, f.percepcion, \n" +
            "       f.rb_cortoplazo, f.rb_medianoplazo, f.rb_largoplazo, f.rb_muysuperior, \n" +
            "       f.rb_superior, f.rb_normal, f.rb_promedio, f.rb_torpe, f.rb_fronterizo, \n" +
            "       f.rb_rleve, f.rb_rmoderado, f.rb_rsevero, f.rb_rprofundo, f.apetito, f.sueno, \n" +
            "       f.personalidad, f.afectividad, f.conducta_sexual, f.puntaje1, f.puntaje2, \n" +
            "       f.puntaje3, f.puntaje4, f.puntaje5, f.puntaje6, f.puntaje7, f.puntaje8, f.puntaje9, \n" +
            "       f.puntaje10, f.puntaje11, f.puntaje12, f.puntaje13, f.area_cognitiva, f.area_emocional\n" +
            "FROM datos_paciente AS d \n" +
            "INNER JOIN n_orden_ocupacional  AS n ON( d.cod_pa = n.cod_pa) \n" +
            "INNER JOIN ficha_psicologica_anexo03 AS f ON(f.n_orden=n.n_orden)"
                    + "  WHERE n.n_orden='"+txtNorden.getText().toString()+"'";
             //oFunc.SubSistemaMensajeInformacion(consulta);
             oConn.FnBoolQueryExecute(consulta);
                try {
                    if (oConn.setResult.next()) {                        
                     txtTipoExamen.setText(oConn.setResult.getString("nom_examen"));
                     txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                     txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                     FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                     txtLugarNacimiento.setText(oConn.setResult.getString("lugar_nac_pa"));
                     txtEstadoCivil.setText(oConn.setResult.getString("estado_civil_pa"));
                     txtGradoInstruccion.setText(oConn.setResult.getString("nivel_est_pa"));
                     txtTipoExamen.setText(oConn.setResult.getString("nom_examen"));
                     txtSexo.setText(oConn.setResult.getString("sexo_pa"));
                     txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                     txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                     txtPuestoPostula.setText(oConn.setResult.getString("cargo_de"));
                     txtArea.setText(oConn.setResult.getString("cargo_de"));
                     Nacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                     txtEdad.setText(String.valueOf(oFunc.calcularEdad(Nacimiento.getCalendar())));
                     txtExplotacionEn.setText(oConn.setResult.getString("nom_ex"));
                     txtMineralesExplotados.setText(oConn.setResult.getString("mineral_po"));
                     txtAlturaLabor.setText(oConn.setResult.getString("altura_po"));
                     num=Integer.valueOf(oConn.setResult.getString("cod_anexo03"));
                     FechaFicha.setDate(oConn.setResult.getDate("fecha"));
                     txtMotivoEval.setText(oConn.setResult.getString("motivo_eval"));
                     txtexperiencia.setText(oConn.setResult.getString("timpo_trab"));
                        txtPrincipalesRiesgos.setText(oConn.setResult.getString("princ_riesgo"));
                        txtMedidasSeguridad.setText(oConn.setResult.getString("med_seguridad"));
                        txtHistoriaFamiliar.setText(oConn.setResult.getString("hist_familiar"));
                        txtHabitos.setText(oConn.setResult.getString("habitos"));
                        txtObservaciones.setText(oConn.setResult.getString("otras_observ"));
                        rbAdecuado.setSelected(oConn.setResult.getBoolean("rb_adecuado"));
                        rbInadecuado.setSelected(oConn.setResult.getBoolean("rb_indecuado"));
                        rbErguida.setSelected(oConn.setResult.getBoolean("rb_erguida"));
                        rbEncorvada.setSelected(oConn.setResult.getBoolean("rb_encorvada"));
                        rbLento.setSelected(oConn.setResult.getBoolean("rb_lento"));
                        rbRapido.setSelected(oConn.setResult.getBoolean("rb_rapido"));
                        rbFluido.setSelected(oConn.setResult.getBoolean("rb_fluido"));
                        rbBajo.setSelected(oConn.setResult.getBoolean("rb_bajo"));
                        rbModerado.setSelected(oConn.setResult.getBoolean("rb_moderado"));
                        rbAlto.setSelected(oConn.setResult.getBoolean("rb_alto"));
                        rbConDificultad.setSelected(oConn.setResult.getBoolean("rb_condificultad"));
                        rbSinDificultad.setSelected(oConn.setResult.getBoolean("rb_sindificultad"));
                        rbTOrientado.setSelected(oConn.setResult.getBoolean("rb_torientado"));
                        rbTDesorientado.setSelected(oConn.setResult.getBoolean("rb_tdesorientado"));
                        rbEOrientado.setSelected(oConn.setResult.getBoolean("rb_eorientado"));
                        rbEDesorientado.setSelected(oConn.setResult.getBoolean("rb_edesorientado"));
                        rbPOrientado.setSelected(oConn.setResult.getBoolean("rb_porientado"));
                        rbPDesorientado.setSelected(oConn.setResult.getBoolean("rb_pdesorientado"));
                        txtLucido.setText(oConn.setResult.getString("lucido"));
                        txtPensamiento.setText(oConn.setResult.getString("pensamiento"));
                        txtPercepcion.setText(oConn.setResult.getString("percepcion"));
                        rbCortoPlazo.setSelected(oConn.setResult.getBoolean("rb_cortoplazo"));
                        rbMedianoPlazo.setSelected(oConn.setResult.getBoolean("rb_medianoplazo"));
                        rbLargoPlazo.setSelected(oConn.setResult.getBoolean("rb_largoplazo"));
                        rbMuySuperior.setSelected(oConn.setResult.getBoolean("rb_muysuperior"));
                        rbSuperior.setSelected(oConn.setResult.getBoolean("rb_superior"));
                        rbNormal.setSelected(oConn.setResult.getBoolean("rb_normal"));
                        rbPromedio.setSelected(oConn.setResult.getBoolean("rb_promedio"));
                        rbTorpe.setSelected(oConn.setResult.getBoolean("rb_torpe"));
                        rbFronterizo.setSelected(oConn.setResult.getBoolean("rb_fronterizo"));
                        rbLeve.setSelected(oConn.setResult.getBoolean("rb_rleve"));
                        rbRModerado.setSelected(oConn.setResult.getBoolean("rb_rmoderado"));
                        rbRSevero.setSelected(oConn.setResult.getBoolean("rb_rsevero"));
                        rbRProfundo.setSelected(oConn.setResult.getBoolean("rb_rprofundo"));
                        txtApetito.setText(oConn.setResult.getString("apetito"));
                        txtSueño.setText(oConn.setResult.getString("sueno"));
                        txtPersonalidad.setText(oConn.setResult.getString("personalidad"));
                        txtAfectividad.setText(oConn.setResult.getString("afectividad"));
                        txtConductaSexual.setText(oConn.setResult.getString("conducta_sexual"));
                        txtPuntaje1.setText(oConn.setResult.getString("puntaje1"));
                        txtPuntaje2.setText(oConn.setResult.getString("puntaje2"));
                        txtPuntaje3.setText(oConn.setResult.getString("puntaje3"));
                        txtPuntaje4.setText(oConn.setResult.getString("puntaje4"));
                        txtPuntaje5.setText(oConn.setResult.getString("puntaje5"));
                        txtPuntaje6.setText(oConn.setResult.getString("puntaje6"));
                        txtPuntaje7.setText(oConn.setResult.getString("puntaje7"));
                        txtPuntaje8.setText(oConn.setResult.getString("puntaje8"));
                        txtPuntaje9.setText(oConn.setResult.getString("puntaje9"));
                        txtPuntaje10.setText(oConn.setResult.getString("puntaje10"));
                        txtPuntaje11.setText(oConn.setResult.getString("puntaje11"));
                        txtPuntaje12.setText(oConn.setResult.getString("puntaje12"));
                        txtPuntaje13.setText(oConn.setResult.getString("puntaje13"));
                        txtAreaCognitiva.setText(oConn.setResult.getString("area_cognitiva"));
                        txtAreaEmocional.setText(oConn.setResult.getString("area_emocional"));
                     DetalleEmpresas();
                     txtNorden.setEditable(false);
                     Fecha();
                     txtexperiencia.requestFocus();  
                     
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Ficha Psicologica- Anexo03:" + ex.getMessage().toString());
        } }


    }
    private com.toedter.calendar.JDateChooser Nacimiento;
    void consultar() {
        Nacimiento = new com.toedter.calendar.JDateChooser();
    if(!Orden()){
        if(!txtNorden.getText().isEmpty()){
           
            String consulta="SELECT d.apellidos_pa,d.nombres_pa, d.fecha_nacimiento_pa,d.lugar_nac_pa,d.estado_civil_pa,\n" +
"       d.nivel_est_pa,d.direccion_pa, n.nom_examen, d.sexo_pa, n.razon_empresa, n.razon_contrata,n.cargo_de,\n" +
"       n.area_o, n.nom_ex, n.mineral_po,n.altura_po,d.cod_pa \n" +
"FROM datos_paciente AS d INNER JOIN n_orden_ocupacional  AS n ON( d.cod_pa = n.cod_pa)   WHERE n.n_orden='"+txtNorden.getText().toString()+"'";
             //oFunc.SubSistemaMensajeInformacion(consulta);
             oConn.FnBoolQueryExecute(consulta);
                try {
                    if (oConn.setResult.next()) {                        
                     txtTipoExamen.setText(oConn.setResult.getString("nom_examen"));
                     txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                     txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                     FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                     txtLugarNacimiento.setText(oConn.setResult.getString("lugar_nac_pa"));
                     txtEstadoCivil.setText(oConn.setResult.getString("estado_civil_pa"));
                     txtGradoInstruccion.setText(oConn.setResult.getString("nivel_est_pa"));
                     txtTipoExamen.setText(oConn.setResult.getString("nom_examen"));
                     txtSexo.setText(oConn.setResult.getString("sexo_pa"));
                     txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                     txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                     txtPuestoPostula.setText(oConn.setResult.getString("cargo_de"));
                     txtArea.setText(oConn.setResult.getString("area_o"));
                     Nacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                     txtEdad.setText(String.valueOf(oFunc.calcularEdad(Nacimiento.getCalendar())));
                     txtExplotacionEn.setText(oConn.setResult.getString("nom_ex"));
                     txtMineralesExplotados.setText(oConn.setResult.getString("mineral_po"));
                     txtAlturaLabor.setText(oConn.setResult.getString("altura_po"));
                     txtDni.setText(oConn.setResult.getString("cod_pa"));
                     txtNorden.setEditable(false);
                     Fecha();
                     txtexperiencia.requestFocus();  
                     
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Ficha Psicologica-Anexo03:" + ex.getMessage().toString());
        } }}


    }

    private void ActualizarFicha(){
        if (validar()) {
            try {
                if (actualizar()) {
                    if (tbEmpresasAnteriores.getRowCount() > 0) {
                        if (GrabarAPDetalle()) {
                            imprimir();
                            limpiar();
                        }
                    } else {
                        
                        limpiar();
                    }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Aptitud_Anexo03.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private boolean actualizar() throws SQLException{
         boolean bResult = false;
        if (!txtNorden.getText().isEmpty()) {
            if (Orden()) {
                String sql="UPDATE ficha_psicologica_anexo03\n" +
            "   SET fecha='"+FechaFicha.getDate()+"'"
                        + ", edad='"+txtEdad.getText()+"'"
                        + ", motivo_eval='"+txtMotivoEval.getText()+"'"
                        + ", timpo_trab='"+txtexperiencia.getText()+"'"
                        + ", princ_riesgo='"+txtPrincipalesRiesgos.getText()+"'"
                        + ", med_seguridad='"+txtMedidasSeguridad.getText()+"',"
                        + "  hist_familiar='"+txtHistoriaFamiliar.getText()+"'"
                        + ", habitos='"+txtHabitos.getText()+"'"
                        + ", otras_observ='"+txtObservaciones.getText()+"'"
                        + ", rb_adecuado='"+rbAdecuado.isSelected()+"'"
                        + ", rb_indecuado='"+rbInadecuado.isSelected()+"'"
                        + ", rb_erguida='"+rbErguida.isSelected()+"'"
                        + ", rb_encorvada='"+rbEncorvada.isSelected()+"'"
                        + ", rb_lento='"+rbLento.isSelected()+"'"
                        + ", rb_rapido='"+rbRapido.isSelected()+"'"
                        + ", rb_fluido='"+rbFluido.isSelected()+"'"
                        + ", rb_bajo='"+rbBajo.isSelected()+"'"
                        + ", rb_moderado='"+rbModerado.isSelected()+"'"
                        + ", rb_alto='"+rbAlto.isSelected()+"'"
                        + ", rb_condificultad='"+rbConDificultad.isSelected()+"'"
                        + ", rb_sindificultad='"+rbSinDificultad.isSelected()+"'"
                        + ", rb_torientado='"+rbTOrientado.isSelected()+"'"
                        + ", rb_tdesorientado='"+rbTDesorientado.isSelected()+"'"
                        + ", rb_eorientado='"+rbEOrientado.isSelected()+"'"
                        + ", rb_edesorientado='"+rbEDesorientado.isSelected()+"'"
                        + ", rb_porientado='"+rbPOrientado.isSelected()+"'"
                        + ", rb_pdesorientado='"+rbPDesorientado.isSelected()+"'"
                        + ", lucido='"+txtLucido.getText()+"'"
                        + ", pensamiento='"+txtPensamiento.getText()+"'"
                        + ", percepcion='"+txtPercepcion.getText()+"'"
                        + ", rb_cortoplazo='"+rbCortoPlazo.isSelected()+"'"
                        + ", rb_medianoplazo='"+rbMedianoPlazo.isSelected()+"'"
                        + ", rb_largoplazo='"+rbLargoPlazo.isSelected()+"'"
                        + ", rb_muysuperior='"+rbMuySuperior.isSelected()+"'"
                        + ", rb_superior='"+rbSuperior.isSelected()+"'"
                        + ", rb_normal='"+rbNormal.isSelected()+"'"
                        + ", rb_promedio='"+rbPromedio.isSelected()+"'"
                        + ", rb_torpe='"+rbTorpe.isSelected()+"'"
                        + ", rb_fronterizo='"+rbFronterizo.isSelected()+"'"
                        + ", rb_rleve='"+rbLeve.isSelected()+"'"
                        + ", rb_rmoderado='"+rbRModerado.isSelected()+"'"
                        + ", rb_rsevero='"+rbRSevero.isSelected()+"'"
                        + ", rb_rprofundo='"+rbRProfundo.isSelected()+"'"
                        + ", apetito='"+txtApetito.getText()+"'"
                        + ", sueno='"+txtSueño.getText()+"'"
                        + ", personalidad='"+txtPersonalidad.getText()+"'"
                        + ", afectividad='"+txtAfectividad.getText()+"'"
                        + ", conducta_sexual='"+txtConductaSexual.getText()+"'"
                        + ", puntaje1='"+txtPuntaje1.getText()+"'"
                        + ", puntaje2='"+txtPuntaje2.getText()+"'"
                        + ", puntaje3='"+txtPuntaje3.getText()+"'"
                        + ", puntaje4='"+txtPuntaje4.getText()+"'"
                        + ", puntaje5='"+txtPuntaje5.getText()+"'"
                        + ", puntaje6='"+txtPuntaje6.getText()+"'"
                        + ", puntaje7='"+txtPuntaje7.getText()+"'"
                        + ", puntaje8='"+txtPuntaje8.getText()+"'"
                        + ", puntaje9='"+txtPuntaje9.getText()+"'"
                        + ", puntaje10='"+txtPuntaje10.getText()+"'"
                        + ", puntaje11='"+txtPuntaje11.getText()+"'"
                        + ", puntaje12='"+txtPuntaje12.getText()+"'"
                        + ", puntaje13='"+txtPuntaje13.getText()+"'"
                        + ", area_cognitiva='"+txtAreaCognitiva.getText()+"'"
                        + ", area_emocional='"+txtAreaEmocional.getText()+"' RETURNING cod_anexo03;";
                if (oConn.FnBoolQueryExecute(sql)) {
                    bResult = true;
                    oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito"); 
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
        return bResult;   
    }
    

    private boolean Agregar() throws SQLException {
        Boolean r = false;

        if (!txtNorden.getText().isEmpty()) {
            if (!Orden()) {
                String insert = "INSERT INTO ficha_psicologica_anexo03(n_orden, fecha " ;
 String values = "VALUES ('" + txtNorden.getText().toString() + "','" + FechaFicha.getDate() + "'";
                 
            insert += ",edad ";
            values += ",'" + txtEdad.getText().toString() + "'";
                
            insert += ",motivo_eval ";
            values += ",'" + txtMotivoEval.getText().toString() + "'";
            insert += ",timpo_trab ";
            values += ",'" + txtexperiencia.getText().toString() + "'";
            insert += ",princ_riesgo ";
            values += ",'" + txtPrincipalesRiesgos.getText().toString() + "'";
            insert += ",med_seguridad ";
            values += ",'" + txtMedidasSeguridad.getText().toString() + "'";
            insert += ",hist_familiar ";
            values += ",'" + txtHistoriaFamiliar.getText().toString() + "'";
            insert += ",habitos ";
            values += ",'" + txtHabitos.getText().toString() + "'";
            insert += ",otras_observ ";
            values += ",'" + txtObservaciones.getText()+ "'";
            insert += ",rb_adecuado ";
            values += ",'" + rbAdecuado.isSelected() + "'";
            insert += ",rb_indecuado ";
            values += ",'" + rbInadecuado.isSelected() + "'";
            insert += ",rb_erguida ";
            values += ",'" + rbErguida.isSelected() + "'";
            insert += ",rb_encorvada ";
            values += ",'" + rbEncorvada.isSelected() + "'";
            insert += ",rb_lento ";
            values += ",'" + rbLento.isSelected() + "'";
            insert += ",rb_rapido ";
            values += ",'" + rbRapido.isSelected() + "'";
            insert += ",rb_fluido ";
            values += ",'" + rbFluido.isSelected() + "'";
            insert += ",rb_bajo ";
            values += ",'" + rbBajo.isSelected() + "'";
            insert += ",rb_moderado ";
            values += ",'" + rbModerado.isSelected() + "'";
            insert += ",rb_alto ";
            values += ",'" + rbAlto.isSelected() + "'";
            insert += ",rb_condificultad ";
            values += ",'" + rbConDificultad.isSelected() + "'";
            insert += ",rb_sindificultad";
            values += ",'" + rbSinDificultad.isSelected() + "'";
            insert += ",rb_torientado";
            values += ",'" + rbTOrientado.isSelected() + "'";
            insert += ",rb_tdesorientado";
            values += ",'" + rbTDesorientado.isSelected() + "'";
            insert += ",rb_eorientado ";
            values += ",'" + rbEOrientado.isSelected() + "'";
            insert += ",rb_edesorientado ";
            values += ",'" + rbEDesorientado.isSelected()+ "'";
            insert += ",rb_porientado ";
            values += ",'" + rbPOrientado.isSelected() + "'";
            insert += ",rb_pdesorientado ";
            values += ",'" + rbPDesorientado.isSelected() + "'";
            insert += ",lucido ";
            values += ",'" + txtLucido.getText().toString() + "'";
            insert += ",pensamiento ";
            values += ",'" + txtPensamiento.getText().toString() + "'";
            insert += ",percepcion ";
            values += ",'" + txtPercepcion.getText().toString() + "'";
            insert += ",rb_cortoplazo ";
            values += ",'" + rbCortoPlazo.isSelected() + "'";
            insert += ",rb_medianoplazo ";
            values += ",'" + rbMedianoPlazo.isSelected() + "'";
            insert += ",rb_largoplazo ";
            values += ",'" + rbLargoPlazo.isSelected() + "'";
            insert += ",rb_muysuperior ";
            values += ",'" + rbMuySuperior.isSelected() + "'";
            insert += ",rb_superior ";
            values += ",'" + rbSuperior.isSelected() + "'";
            insert += ",rb_normal ";
            values += ",'" + rbNormal.isSelected() + "'";
            insert += ",rb_promedio ";
            values += ",'" + rbPromedio.isSelected() + "'";
            insert += ",rb_torpe ";
            values += ",'" + rbTorpe.isSelected() + "'";
            insert += ",rb_fronterizo ";
            values += ",'" + rbFronterizo.isSelected() + "'";
            insert += ",rb_rleve ";
            values += ",'" + rbLeve.isSelected() + "'";
            insert += ",rb_rmoderado ";
            values += ",'" + rbRModerado.isSelected() + "'";
            insert += ",rb_rsevero ";
            values += ",'" + rbRSevero.isSelected()+ "'";
            insert += ",rb_rprofundo ";
            values += ",'" + rbRProfundo.isSelected() + "'";
            insert += ",apetito ";
            values += ",'" + txtApetito.getText().toString()+  "'";
            insert += ",sueno ";
            values += ",'" + txtSueño.getText().toString()+  "'";
            insert += ",personalidad ";
            values += ",'" + txtPersonalidad.getText().toString()+  "'";
            insert += ",afectividad ";
            values += ",'" + txtAfectividad.getText().toString()+  "'";
            insert += ",conducta_sexual"; 
            values += ",'"+txtConductaSexual.getText()+"'";
            insert += ",puntaje1 "; 
            values += ",'"+txtPuntaje1.getText()+"'";
            insert += ",puntaje2 "; 
            values += ",'"+txtPuntaje2.getText()+"'";
            insert += ",puntaje3 "; 
            values += ",'"+txtPuntaje3.getText()+"'";
            insert += ",puntaje4 "; 
            values += ",'"+txtPuntaje4.getText()+"'";
            insert += ",puntaje5 "; 
            values += ",'"+txtPuntaje5.getText()+"'";
            insert += ",puntaje6 "; 
            values += ",'"+txtPuntaje6.getText()+"'";
            insert += ",puntaje7 "; 
            values += ",'"+txtPuntaje7.getText()+"'";
            insert += ",puntaje8 "; 
            values += ",'"+txtPuntaje8.getText()+"'";
            insert += ",puntaje9 "; 
            values += ",'"+txtPuntaje9.getText()+"'";
            insert += ",puntaje10 "; 
            values += ",'"+txtPuntaje10.getText()+"'";
            insert += ",puntaje11 "; 
            values += ",'"+txtPuntaje11.getText()+"'";
            insert += ",puntaje12 "; 
            values += ",'"+txtPuntaje12.getText()+"'";
            insert += ",puntaje13 "; 
            values += ",'"+txtPuntaje13.getText()+"'";
            insert += ",area_cognitiva "; 
            values += ",'"+txtAreaCognitiva.getText()+"'";
            insert += ",area_emocional "; 
            values += ",'"+txtAreaEmocional.getText()+"'";
                //oFunc.SubSistemaMensajeInformacion(insert.concat(")") + values.concat(")"));
                if (oConn.FnBoolQueryExecute(insert.concat(")") + values.concat(") RETURNING cod_anexo03"))) {
                    oConn.setResult.next();
                    num = Integer.valueOf(oConn.setResult.getString("cod_anexo03"));
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
        txtexperiencia.setText(null);
        txtDni.setText(null);
        txtNombre.setText(null);
        txtEdad.setText(null);
        txtApellido.setText(null);
        FechaNacimiento.setDate(null);
        txtSexo.setText(null);
        txtLugarNacimiento.setText(null);
        txtEstadoCivil.setText(null);
        txtGradoInstruccion.setText(null);
        txtEmpresa.setText(null);
        txtContrata.setText(null);
        txtMineralesExplotados.setText(null);
        txtExplotacionEn.setText(null);
        txtAlturaLabor.setText(null);
        
        txtMotivoEval.setText(null);
        txtPrincipalesRiesgos.setText(null);
        txtMedidasSeguridad.setText(null);
        txtHistoriaFamiliar.setText(null);
        txtHabitos.setText(null);
        txtPuestoPostula.setText(null);
        txtArea.setText(null);
        txtObservaciones.setText(null);
        
        bgPresentacion.clearSelection();
        bgPostura.clearSelection();
        bgRitmo.clearSelection();
        bgTono.clearSelection();
        bgArticulacion.clearSelection();
        bgTiempo.clearSelection();
        bgEspacio.clearSelection();
        bgPersona.clearSelection();
        
        txtLucido.setText(null);
        txtPensamiento.setText(null);
        txtPercepcion.setText(null);
        bgMemoria.clearSelection();
        bgInteligencia.clearSelection();
        txtApetito.setText(null);
        txtSueño.setText(null);
        txtPersonalidad.setText(null);
        txtAfectividad.setText(null);
        txtConductaSexual.setText(null);
        txtPuntaje1.setText(null);
        txtPuntaje2.setText(null);
        txtPuntaje3.setText(null);
        txtPuntaje4.setText(null);
        txtPuntaje5.setText(null);
        txtPuntaje6.setText(null);
        txtPuntaje7.setText(null);
        txtPuntaje8.setText(null);
        txtPuntaje9.setText(null);
        txtPuntaje10.setText(null);
        txtPuntaje11.setText(null);
        txtPuntaje12.setText(null);
        txtPuntaje13.setText(null);
        txtAreaCognitiva.setText(null);
        txtAreaEmocional.setText(null);
        txtNorden.setEditable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Año;
    private com.toedter.calendar.JDateChooser FechaFicha;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.ButtonGroup bgArticulacion;
    private javax.swing.ButtonGroup bgEspacio;
    private javax.swing.ButtonGroup bgInteligencia;
    private javax.swing.ButtonGroup bgMemoria;
    private javax.swing.ButtonGroup bgPersona;
    private javax.swing.ButtonGroup bgPostura;
    private javax.swing.ButtonGroup bgPresentacion;
    private javax.swing.ButtonGroup bgRitmo;
    private javax.swing.ButtonGroup bgTiempo;
    private javax.swing.ButtonGroup bgTono;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEditarFM;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JLabel btnQui;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel104;
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
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jtFichaMedica;
    private javax.swing.JRadioButton rbAdecuado;
    private javax.swing.JRadioButton rbAlto;
    private javax.swing.JRadioButton rbBajo;
    private javax.swing.JRadioButton rbConDificultad;
    private javax.swing.JRadioButton rbCortoPlazo;
    private javax.swing.JRadioButton rbEDesorientado;
    private javax.swing.JRadioButton rbEOrientado;
    private javax.swing.JRadioButton rbEncorvada;
    private javax.swing.JRadioButton rbErguida;
    private javax.swing.JRadioButton rbFluido;
    private javax.swing.JRadioButton rbFronterizo;
    private javax.swing.JRadioButton rbInadecuado;
    private javax.swing.JRadioButton rbLargoPlazo;
    private javax.swing.JRadioButton rbLento;
    private javax.swing.JRadioButton rbLeve;
    private javax.swing.JRadioButton rbMedianoPlazo;
    private javax.swing.JRadioButton rbModerado;
    private javax.swing.JRadioButton rbMuySuperior;
    private javax.swing.JRadioButton rbNormal;
    private javax.swing.JRadioButton rbPDesorientado;
    private javax.swing.JRadioButton rbPOrientado;
    private javax.swing.JRadioButton rbPromedio;
    private javax.swing.JRadioButton rbRModerado;
    private javax.swing.JRadioButton rbRProfundo;
    private javax.swing.JRadioButton rbRSevero;
    private javax.swing.JRadioButton rbRapido;
    private javax.swing.JRadioButton rbSinDificultad;
    private javax.swing.JRadioButton rbSuperior;
    private javax.swing.JRadioButton rbTDesorientado;
    private javax.swing.JRadioButton rbTOrientado;
    private javax.swing.JRadioButton rbTorpe;
    private javax.swing.JTable tbEmpresasAnteriores;
    private javax.swing.JTextField txtActEmpresa;
    private javax.swing.JTextField txtAfectividad;
    private javax.swing.JTextField txtAlturaLabor;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApetito;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextArea txtAreaCognitiva;
    private javax.swing.JTextArea txtAreaEmocional;
    private javax.swing.JTextField txtCausaRet;
    private javax.swing.JTextField txtConductaSexual;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtExplotacionEn;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGradoInstruccion;
    private javax.swing.JTextArea txtHabitos;
    private javax.swing.JTextArea txtHistoriaFamiliar;
    private javax.swing.JTextField txtIMP;
    private javax.swing.JTextField txtLucido;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextArea txtMedidasSeguridad;
    private javax.swing.JTextField txtMineralesExplotados;
    private javax.swing.JTextArea txtMotivoEval;
    private javax.swing.JTextField txtNomEmpresa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtPensamiento;
    private javax.swing.JTextField txtPercepcion;
    private javax.swing.JTextField txtPersonalidad;
    private javax.swing.JTextArea txtPrincipalesRiesgos;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtPuestoPostula;
    private javax.swing.JTextField txtPuntaje1;
    private javax.swing.JTextField txtPuntaje10;
    private javax.swing.JTextField txtPuntaje11;
    private javax.swing.JTextField txtPuntaje12;
    private javax.swing.JTextField txtPuntaje13;
    private javax.swing.JTextField txtPuntaje2;
    private javax.swing.JTextField txtPuntaje3;
    private javax.swing.JTextField txtPuntaje4;
    private javax.swing.JTextField txtPuntaje5;
    private javax.swing.JTextField txtPuntaje6;
    private javax.swing.JTextField txtPuntaje7;
    private javax.swing.JTextField txtPuntaje8;
    private javax.swing.JTextField txtPuntaje9;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSueño;
    private javax.swing.JTextField txtTSub;
    private javax.swing.JTextField txtTSup;
    private javax.swing.JTextField txtTipoExamen;
    private javax.swing.JTextField txtexperiencia;
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


 void AddAP(){
    //SimpleDateFormat formato = new SimpleDateFormat("yyyy");
   
    String [] registros = new String[7];
    model = (DefaultTableModel) tbEmpresasAnteriores.getModel();
    if(!txtNorden.getText().isEmpty()){
                   if(validarQui()){  
                    registros[0]= txtFecha.getText().toString();
                    registros[1]= txtNomEmpresa.getText().toString();
                    registros[2]= txtActEmpresa.getText().toString();
                    registros[3]= txtPuesto.getText().toString();
                    registros[4]= txtTSup.getText().toString();
                    registros[5]= txtTSub.getText().toString();
                    registros[6]= txtCausaRet.getText().toString();
               
                model.addRow(registros);  
                tbEmpresasAnteriores.setModel(model);
                        }
                 }
       
                else{oFunc.SubSistemaMensajeError("Falto Llenar algo");
                          
                 //}
                   
    } 
        
}
 private boolean validarQui(){
boolean bResultado=true;
  if(txtNorden.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese N° Orden"); bResultado = false;}
    if(txtFecha.getText().isEmpty()){bResultado = false;}
    if(txtNomEmpresa.getText().isEmpty()){bResultado = false;}
    if(txtPuesto.getText().isEmpty()){bResultado = false;}
    if(txtCausaRet.getText().isEmpty()){bResultado = false;}
  
   return bResultado;
}
 public void Qui(){
sbCargarDatosAP();
txtFecha.setText(null);
txtNomEmpresa.setText(null);
txtActEmpresa.setText(null);
txtTSup.setText(null);
txtTSub.setText(null);
txtPuesto.setText(null);
txtCausaRet.setText(null);
}
 void sbCargarDatosAP(){
        
          String [] titulos={"Fecha","NombreEmpresa ","ActividadEmpresa","Puesto","Sup","Sub","CausaRetiro"};
          model = new DefaultTableModel(null,titulos){
            
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
          tbEmpresasAnteriores.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbEmpresasAnteriores.setModel(model);          
          tbEmpresasAnteriores.getColumnModel().getColumn(0).setPreferredWidth(60);
          tbEmpresasAnteriores.getColumnModel().getColumn(1).setPreferredWidth(60);
          tbEmpresasAnteriores.getColumnModel().getColumn(2).setPreferredWidth(60);
          tbEmpresasAnteriores.getColumnModel().getColumn(3).setPreferredWidth(60);
          tbEmpresasAnteriores.getColumnModel().getColumn(4).setPreferredWidth(60);
          tbEmpresasAnteriores.getColumnModel().getColumn(5).setPreferredWidth(60);
          tbEmpresasAnteriores.getColumnModel().getColumn(6).setPreferredWidth(60);
}
 private boolean GrabarAPDetalle() {
         boolean bResult = false;
                      
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String  fecha, nomempresa, actempresa, puesto,sup, sub,causaretiro;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbEmpresasAnteriores.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            fecha = tbEmpresasAnteriores.getModel().getValueAt(iFila, 0).toString();
            nomempresa = tbEmpresasAnteriores.getModel().getValueAt(iFila, 1).toString();
            actempresa = tbEmpresasAnteriores.getModel().getValueAt(iFila, 2).toString();
            puesto = tbEmpresasAnteriores.getModel().getValueAt(iFila, 3).toString();
            sup = tbEmpresasAnteriores.getModel().getValueAt(iFila, 4).toString();
            sub = tbEmpresasAnteriores.getModel().getValueAt(iFila, 5).toString();
            causaretiro= tbEmpresasAnteriores.getModel().getValueAt(iFila, 6).toString();
           
           strSqlStmt="INSERT INTO empresas_anexo_03(\n" +
"            cod_anexo, fecha, nom_empresa, act_empresa, puesto, sup, sub, \n" +
"            causa_retiro)";
                                      
                    strSqlStmt = strSqlStmt + " Values ('";
//                    oFunc.SubSistemaMensajeError(String.valueOf(num));
                    strSqlStmt += num+"','";
                    strSqlStmt += fecha+"','";
                    strSqlStmt += nomempresa+"','";
                    strSqlStmt += actempresa+"','";
                    strSqlStmt += puesto+"','";
                    strSqlStmt += sup+"','";
                    strSqlStmt += sub+"','";
                    strSqlStmt += causaretiro+"')";
                    
                    // Ejecuta la Sentencia
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                        bResult = true;
                        
                    }
                  }
         return bResult;
    }
 private void DetalleEmpresas(){
//    String [] titulos={"N°Orden","Hospital","Operacion","Dias","complicaciones","Fecha"};
    String [] registros = new String[7];
    
      String sql = "SELECT fecha, nom_empresa, act_empresa, puesto, sup, sub, \n" +
"       causa_retiro\n" +
"  FROM empresas_anexo_03 "
               + "WHERE cod_anexo ='" + num + "'";

    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("fecha");
                    registros[1]= oConn.setResult.getString("nom_empresa");
                    registros[2]= oConn.setResult.getString("act_empresa");
                    registros[3]= oConn.setResult.getString("puesto");
                    registros[4]= oConn.setResult.getString("sup");
                    registros[5]= oConn.setResult.getString("sub");
                    registros[6]= oConn.setResult.getString("causa_retiro");
                    
                     model.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  tbEmpresasAnteriores.setModel(model);
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
 private void imprimir(){
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir Historia Ocupacional ?", //Mensaje
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
      printer(Integer.valueOf(txtNorden.getText().toString()));
   }
   else
   {
      // PRESIONO NO
     }
    }

}
private void printer(Integer cod){
                Map parameters = new HashMap();
    parameters.put("Norden", cod);
    try {
        String master = System.getProperty("user.dir")+ "/reportes/FichaPsicologicaOcupacional.jasper";
        System.out.println("master" + master);
        if (master == null) {
            System.out.println("No encuentro el archivo Anexo7D.");
            //System.exit(2);
        }
        JasperReport masterReport = null;
        try {
            masterReport = (JasperReport) JRLoader.loadObject(master);
        } catch (JRException e) {
            System.out.println("Error cargando el reporte maestro: " + e.getMessage());
            System.exit(3);
        }
            //JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);

              //      JasperViewer.viewReport(myPrint,false);
        JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
        JasperViewer.viewReport(jasperPrint,false);
        JasperPrintManager.printReport(jasperPrint, true);

    } catch (JRException ex) {
        Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
    }

 
 }
private void print(Integer cod){
  //Integer n;
               //n = Integer.parseInt(txtNorden.getText());
                //Pasamos parametros al reporte Jasper. 
              Map parameters = new HashMap();
        // Coloco los valores en los parámetros
        parameters.put("Norden", cod);

        try {
            String master = System.getProperty("user.dir")+ "/reportes/FichaPsicologicaOcupacional.jasper";
            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo No encuentro el archivo Anexo7D.");
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
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
