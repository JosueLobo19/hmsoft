package Caja;

import Clases.GestorTime;
import Clases.clsConnection;
import Clases.clsFunciones;
import autocomplete.ajTextField;
import autocomplete.ajTextFieldConsulta;
import autocomplete.ajTextFieldInteger;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import sistema.Audiometria;
import sistema.Odontograma;

/**
 *
 * @author Richard García Zárate
 */
public final class RegistrarCliente extends javax.swing.JInternalFrame {
    clsFunciones oFunc = new clsFunciones();
    clsConnection oConn = new clsConnection();
    public static AddOcupacion addOcupacion;
    public static AgregarEmpresa addEmpresa;
    public static AgregarContrata addContrata;
    public static AddCargos addExEn;
    public static AddArea addExmedico;
    public static AddMineralEx addMineralEx;
    public static AddAlturaPo addAlturaPo;
    public static VerUltimoRegistro verUltimoRegistro;
    public static addAreaOcupacioal areaOcupacional;
    String num;
    String dni;
    DefaultTableModel model;
     // String[]empresas = new String[]{};
    // String[]contratas = new String[]{};
    public RegistrarCliente() {
        super();
        initComponents();

        fecha();
        jtRegistroGeneral.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/agegar.png")));
        jtRegistroGeneral.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/reportes.png")));
        deshabilitar();
        AltaDesabilitar();
        deshabilitarbotones();
        CargarServicios();
        CargarProfesionOcupacion();
        cboProfesion.setSelectedIndex(-1);
        CargarAlturaPo();
        CargarExplotacion();
        CargarMineralEx();
        CargarAreaOcupacional();
        new ajTextField.autocompleterText(txtEmpresa, "razon_empresa", "empresas");
        new ajTextField.autocompleterText(txtContrata, "razon_contrata", "contratas");
        new ajTextField.autocompleterText(txtCargoDesempenar, "ocupacion_pa", "ocupaciones_pa");
        new ajTextFieldConsulta.autocompleterText(txtMedico, "select nombre_user||' '||apellido_user as nombre FROM usuarios WHERE CONCAT(nombre_user,' ',apellido_user)");
        new ajTextFieldInteger.autocompleterText(txtDniAlta, "cod_pa", "datos_paciente");
        AutoCompleteDecorator.decorate(this.cboProfesion);
        AutoCompleteDecorator.decorate(this.cboDepartamento);
        AutoCompleteDecorator.decorate(this.cboProvincia);
        AutoCompleteDecorator.decorate(this.cboDistrito);
        AutoCompleteDecorator.decorate(this.cboSexo);
        AutoCompleteDecorator.decorate(this.cboEstadoCivil);
        AutoCompleteDecorator.decorate(this.cboNivelEstudio);
        AutoCompleteDecorator.decorate(this.cboExamenMedico);
        AutoCompleteDecorator.decorate(this.cboMineralExp);
        AutoCompleteDecorator.decorate(this.cboExplotacion);
        AutoCompleteDecorator.decorate(this.cboAltura);
        AutoCompleteDecorator.decorate(this.cboArea);
        cboMineralExp.setSelectedIndex(-1);
        cboExplotacion.setSelectedIndex(-1);
        cboAltura.setSelectedIndex(-1);
        cboArea.setSelectedIndex(-1);
        btnAgregar.setEnabled(false);
        timer.start();
        cboExamenMedico.setSelectedIndex(-1);
        sbCargarOcupacional("");
        txtNumColor.setText("1");
        hBotones(false);
    }

    private void hBotones(boolean btn) {
        BtnActualizarEx.setVisible(btn);
        BtnEditarEx.setVisible(btn);
        btnGuardarAperturar.setVisible(!btn);

    }

    public void MostrarAddAreaOcupacional() {
        areaOcupacional = new addAreaOcupacioal(this, true);
        areaOcupacional.setVisible(true);

    }

    public void MostrarAddArea() {
        addExmedico = new AddArea(this, true);
        addExmedico.setVisible(true);

    }

    public void MostrarAddCargos() {
        addExEn = new AddCargos(this, true);
        addExEn.setVisible(true);

    }

    public void MostrarUltimoRegistro() {
        verUltimoRegistro = new VerUltimoRegistro(this, true);
        verUltimoRegistro.setVisible(true);

    }

    public void MostrarAddMineralEx() {
        addMineralEx = new AddMineralEx(this, true);
        addMineralEx.setVisible(true);

    }

    public void MostrarAddAlturaPo() {
        addAlturaPo = new AddAlturaPo(this, true);
        addAlturaPo.setVisible(true);

    }

    public void MostrarAddOcupacion() {
        addOcupacion = new AddOcupacion(this, true);
        addOcupacion.setVisible(true);

    }

    public void MostrarEmpresa() {
        addEmpresa = new AgregarEmpresa(this, true);
        addEmpresa.setVisible(true);
    }

    public void MostrarContrata() {
        addContrata = new AgregarContrata(this, true);
        addContrata.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        btGS = new javax.swing.ButtonGroup();
        bgFS = new javax.swing.ButtonGroup();
        jtRegistroGeneral = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cboSexo = new javax.swing.JComboBox();
        txtEmail = new javax.swing.JTextField();
        txtLugarNacimiento = new javax.swing.JTextField();
        cboNivelEstudio = new javax.swing.JComboBox();
        cboProfesion = new javax.swing.JComboBox();
        cboEstadoCivil = new javax.swing.JComboBox();
        txtDireccion = new javax.swing.JTextField();
        cboDepartamento = new javax.swing.JComboBox();
        cboProvincia = new javax.swing.JComboBox();
        cboDistrito = new javax.swing.JComboBox();
        cboCaserio = new javax.swing.JComboBox();
        txtTelefonoCasa = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnAddOcupacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ckbSinDni = new javax.swing.JCheckBox();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtHistorial = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        txtContrata = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnAddOcupacion1 = new javax.swing.JLabel();
        btnAddOcupacion2 = new javax.swing.JLabel();
        chkAltaManipAlimen = new javax.swing.JCheckBox();
        jpOcupacional = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cboExamenMedico = new javax.swing.JComboBox();
        btnMineralEx = new javax.swing.JLabel();
        cboExplotacion = new javax.swing.JComboBox();
        cboMineralExp = new javax.swing.JComboBox();
        cboAltura = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        chkPrecio = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtFechaAlta = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        txtCargoDesempenar = new javax.swing.JTextField();
        btnAreaOcupacional = new javax.swing.JLabel();
        btnCargo = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtObserv1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtObserv2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtNombresAlta = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtApellidosAlta = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnGuardarAperturar = new javax.swing.JButton();
        btnLimpiarApertura = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOcupacional = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        txtNorden = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        txtDniAlta = new javax.swing.JTextField();
        BtnEditarEx = new javax.swing.JButton();
        BtnActualizarEx = new javax.swing.JButton();
        chkFistTest = new javax.swing.JCheckBox();
        chkPsicosen = new javax.swing.JCheckBox();
        btnActivar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        rbCredito = new javax.swing.JRadioButton();
        rbEfectivo = new javax.swing.JRadioButton();
        chkAltaTestAltura = new javax.swing.JCheckBox();
        btnActualizarEx = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        chkAltaPsicosen = new javax.swing.JCheckBox();
        chkAltaFist = new javax.swing.JCheckBox();
        txtNumColor = new javax.swing.JLabel();
        txtGS = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtGrupoSan = new javax.swing.JTextField();
        rbPos = new javax.swing.JRadioButton();
        rbNeg = new javax.swing.JRadioButton();
        chkO = new javax.swing.JCheckBox();
        chkA = new javax.swing.JCheckBox();
        chkB = new javax.swing.JCheckBox();
        chkAB = new javax.swing.JCheckBox();
        txtFactorSan = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtBuscarCod = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        cboSedeClinica = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        chkAltaVisualCom = new javax.swing.JCheckBox();
        chkVisualCompl = new javax.swing.JCheckBox();
        chkTrabCalientes = new javax.swing.JCheckBox();
        chkAltaTrabCal = new javax.swing.JCheckBox();
        chkAltaCovid1 = new javax.swing.JCheckBox();
        chkAltaCovid2 = new javax.swing.JCheckBox();
        chkCovid1 = new javax.swing.JCheckBox();
        chkCovid2 = new javax.swing.JCheckBox();
        chkManipAliment = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        txtNorden1 = new javax.swing.JTextField();
        btnLimpiar1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        setClosable(true);
        setTitle("Registro de Pacientes");
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

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnCerrar.setMnemonic('c');
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnGrabar.setMnemonic('g');
        btnGrabar.setText("Grabar");
        btnGrabar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGrabarMouseClicked(evt);
            }
        });
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel12.setText("(*)Prof / Ocupación:");

        jLabel11.setText("(*)Nivel Estudio:");

        jLabel10.setText("(*)Lugar Nacimiento:");

        jLabel8.setText("Email:");

        jLabel7.setText("(*)Sexo:");

        jLabel6.setText("(*)Fecha Nacimiento:");

        jLabel2.setText("(*)Dirección Habitual :");

        jLabel1.setText("(*)Nombres :");

        jLabel13.setText("Estado Civil:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cboSexo.setEditable(true);
        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMENINO" }));
        cboSexo.setSelectedIndex(-1);
        cboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtLugarNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarNacimientoActionPerformed(evt);
            }
        });

        cboNivelEstudio.setEditable(true);
        cboNivelEstudio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANALFABETO", "PRIMARIA COMPLETA", "PRIMARIA INCOMPLETA", "SECUNDARIA COMPLETA", "SECUNDARIA INCOMPLETA", "UNIVERSITARIO", "TECNICO" }));
        cboNivelEstudio.setSelectedIndex(-1);
        cboNivelEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivelEstudioActionPerformed(evt);
            }
        });

        cboProfesion.setEditable(true);
        cboProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProfesionActionPerformed(evt);
            }
        });

        cboEstadoCivil.setEditable(true);
        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO", "CONVIVIENTE" }));
        cboEstadoCivil.setSelectedIndex(-1);
        cboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoCivilActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        cboDepartamento.setEditable(true);
        cboDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AMAZONAS", "CAJAMARCA", "TUMBES", "LORETO", "PIURA", "LAMBAYEQUE", "SAN MARTIN", "LA LIBERTAD", "UCAYALI", "ANCASH", "HUANUCO", "PASCO", "JUNIN", "LIMA", "HUANCAVELICA", "AYACUCHO", "ICA", "AREQUIPA", "MOQUEGUA", "MADRE DE DIOS", "CUSCO", "APURIMAC", "PUNO", "TACNA" }));
        cboDepartamento.setSelectedIndex(-1);
        cboDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDepartamentoItemStateChanged(evt);
            }
        });
        cboDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDepartamentoActionPerformed(evt);
            }
        });

        cboProvincia.setEditable(true);
        cboProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProvinciaItemStateChanged(evt);
            }
        });
        cboProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProvinciaActionPerformed(evt);
            }
        });

        cboDistrito.setEditable(true);
        cboDistrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cboDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDistritoActionPerformed(evt);
            }
        });

        cboCaserio.setEditable(true);
        cboCaserio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        txtTelefonoCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoCasaActionPerformed(evt);
            }
        });

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        jLabel20.setText("(*)DNI /LM:");

        btnAddOcupacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAddOcupacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOcupacionMouseClicked(evt);
            }
        });

        jLabel3.setText("Casa:");

        jLabel5.setText("Celular:");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/telefono.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/celular.png"))); // NOI18N

        jLabel24.setText("    (*)Departameto:");

        jLabel25.setText(" (*)   Provincia:");

        jLabel26.setText("    Distrito:");

        jLabel27.setText("    Caserio:");

        ckbSinDni.setText("Sin DNI");
        ckbSinDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSinDniActionPerformed(evt);
            }
        });

        FechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaNacimientoPropertyChange(evt);
            }
        });

        jLabel14.setText("(*)Apellidos:");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(24, 24, 24)))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboCaserio, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDni)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellidos))
                                .addGap(28, 28, 28)
                                .addComponent(ckbSinDni)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboNivelEstudio, 0, 155, Short.MAX_VALUE)
                                    .addComponent(cboProfesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddOcupacion))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jLabel20))
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel10)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(txtTelefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel14)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel20)
                            .addComponent(ckbSinDni)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNivelEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(btnAddOcupacion))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel24))
                    .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel26))
                    .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel27))
                    .addComponent(cboCaserio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTelefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel23))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel5))
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setMnemonic('e');
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnAgregar.setMnemonic('a');
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtHistorial.setEditable(false);
        txtHistorial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHistorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHistorial.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "N° Historial"));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnNuevo.setMnemonic('n');
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnLimpiar.setMnemonic('l');
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imagen"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camara.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camactualizar.png"))); // NOI18N

        jLabel34.setText("Fecha Registro:");

        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel40.setText("Hora Registro:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregar)
                                        .addGap(11, 11, 11)
                                        .addComponent(btnLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGrabar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCerrar))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 119, Short.MAX_VALUE))
        );

        jtRegistroGeneral.addTab("Registro Clientes en General", jPanel5);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Empresa :");

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });
        txtEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpresaKeyReleased(evt);
            }
        });

        txtContrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrataActionPerformed(evt);
            }
        });
        txtContrata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrataKeyReleased(evt);
            }
        });

        jLabel16.setText("Contrata :");

        btnAddOcupacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAddOcupacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOcupacion1MouseClicked(evt);
            }
        });

        btnAddOcupacion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAddOcupacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOcupacion2MouseClicked(evt);
            }
        });

        chkAltaManipAlimen.setText("MANIP.ALIM.");
        chkAltaManipAlimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaManipAlimenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(txtContrata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddOcupacion1)
                    .addComponent(btnAddOcupacion2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(chkAltaManipAlimen)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnAddOcupacion1)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnAddOcupacion2)
                            .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkAltaManipAlimen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpOcupacional.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Área  Pre- Ocupacional"));

        jLabel21.setText("Explotación en :");

        jLabel28.setText("Altura :");

        jLabel29.setText("Mineral Exp. :");

        jLabel30.setText("Exa. Médico :");

        cboExamenMedico.setEditable(true);
        cboExamenMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboExamenMedico.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboExamenMedicoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboExamenMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboExamenMedicoActionPerformed(evt);
            }
        });

        btnMineralEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnMineralEx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMineralExMouseClicked(evt);
            }
        });

        cboExplotacion.setEditable(true);
        cboExplotacion.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboExplotacionPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboExplotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboExplotacionActionPerformed(evt);
            }
        });

        cboMineralExp.setEditable(true);
        cboMineralExp.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboMineralExpPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboMineralExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMineralExpActionPerformed(evt);
            }
        });

        cboAltura.setEditable(true);
        cboAltura.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboAlturaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAlturaActionPerformed(evt);
            }
        });

        jLabel43.setText("Precio:");

        txtPrecio.setEditable(false);

        chkPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPrecioActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha Apertura:");

        jLabel42.setText("Area :");

        cboArea.setEditable(true);
        cboArea.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboAreaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAreaActionPerformed(evt);
            }
        });

        jLabel19.setText("Cargo Desempeñar :");

        txtCargoDesempenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoDesempenarActionPerformed(evt);
            }
        });

        btnAreaOcupacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAreaOcupacional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAreaOcupacionalMouseClicked(evt);
            }
        });

        btnCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargoMouseClicked(evt);
            }
        });

        jLabel46.setText("Observ.1 :");

        txtObserv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObserv1ActionPerformed(evt);
            }
        });

        jLabel47.setText("Observ.2 :");

        txtObserv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObserv2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpOcupacionalLayout = new javax.swing.GroupLayout(jpOcupacional);
        jpOcupacional.setLayout(jpOcupacionalLayout);
        jpOcupacionalLayout.setHorizontalGroup(
            jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOcupacionalLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOcupacionalLayout.createSequentialGroup()
                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel19)
                            .addComponent(jLabel42)
                            .addComponent(jLabel30)
                            .addComponent(jLabel21)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel43)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                        .addComponent(cboExplotacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(20, 20, 20))
                                    .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboMineralExp, 0, 0, Short.MAX_VALUE)
                                            .addComponent(cboAltura, 0, 0, Short.MAX_VALUE)
                                            .addComponent(cboArea, 0, 0, Short.MAX_VALUE)
                                            .addComponent(txtCargoDesempenar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnMineralEx)
                                            .addComponent(btnAreaOcupacional, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnCargo)))
                                    .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkPrecio))
                                            .addComponent(txtFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addComponent(cboExamenMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                .addComponent(txtObserv1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jpOcupacionalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObserv2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpOcupacionalLayout.setVerticalGroup(
            jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOcupacionalLayout.createSequentialGroup()
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCargo)
                    .addComponent(txtCargoDesempenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(btnAreaOcupacional))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboExamenMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtObserv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtObserv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboExplotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnMineralEx)
                    .addComponent(cboMineralExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jLabel31.setText("DNI :");

        jLabel32.setText("Nombres :");

        txtNombresAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresAltaActionPerformed(evt);
            }
        });
        txtNombresAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresAltaKeyReleased(evt);
            }
        });

        jLabel33.setText("Apellidos :");

        txtApellidosAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosAltaActionPerformed(evt);
            }
        });
        txtApellidosAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosAltaKeyReleased(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha y Hora"));

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel38.setText("Hora :");

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel36.setText("Fecha :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        btnGuardarAperturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnGuardarAperturar.setText("Agregar");
        btnGuardarAperturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAperturarActionPerformed(evt);
            }
        });

        btnLimpiarApertura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarApertura.setText("Limpiar");
        btnLimpiarApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAperturaActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tbOcupacional.setModel(new javax.swing.table.DefaultTableModel(
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
        tbOcupacional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbOcupacionalMousePressed(evt);
            }
        });
        tbOcupacional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbOcupacionalKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbOcupacional);

        jTabbedPane1.addTab("Ultimos Agregados & Hoja de Ruta", jScrollPane1);

        jLabel4.setText("Nombre :");

        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyReleased(evt);
            }
        });

        txtNorden.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNorden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNorden.setText("0");
        txtNorden.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nro de Orden"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Medico Ocupacional a cargo del Examen :"));

        jLabel17.setText("Medico :");

        txtMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMedico)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        txtDniAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniAltaActionPerformed(evt);
            }
        });
        txtDniAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniAltaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniAltaKeyTyped(evt);
            }
        });

        BtnEditarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        BtnEditarEx.setText("Habilitar");
        BtnEditarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarExActionPerformed(evt);
            }
        });

        BtnActualizarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        BtnActualizarEx.setText("Actualizar");
        BtnActualizarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarExActionPerformed(evt);
            }
        });

        chkFistTest.setText("FIST TEST");
        chkFistTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkFistTestMouseClicked(evt);
            }
        });

        chkPsicosen.setText("PSICOSENSOMETRIA");

        btnActivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        btnActivar.setText("ACTIVAR EXAMEN ");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO PAGO"));

        rbCredito.setBackground(new java.awt.Color(153, 204, 255));
        bgTipo.add(rbCredito);
        rbCredito.setText("Credito");

        rbEfectivo.setBackground(new java.awt.Color(153, 204, 255));
        bgTipo.add(rbEfectivo);
        rbEfectivo.setSelected(true);
        rbEfectivo.setText("Efectivo");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCredito)
                    .addComponent(rbEfectivo)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(rbCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        chkAltaTestAltura.setText("TEST ALTURA");
        chkAltaTestAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaTestAlturaActionPerformed(evt);
            }
        });

        btnActualizarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizarEx.setText("ACTUALIZAR EXA");
        btnActualizarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarExActionPerformed(evt);
            }
        });

        jLabel22.setText("Examen Complemetarios:");

        chkAltaPsicosen.setText("PSICOSEN");
        chkAltaPsicosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaPsicosenActionPerformed(evt);
            }
        });

        chkAltaFist.setText("FIST-TEST");
        chkAltaFist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaFistActionPerformed(evt);
            }
        });

        txtGS.setEditable(false);

        jTextField1.setEditable(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("G.Sang.");

        txtGrupoSan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        bgFS.add(rbPos);
        rbPos.setText("+");
        rbPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPosActionPerformed(evt);
            }
        });

        bgFS.add(rbNeg);
        rbNeg.setText("-");
        rbNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNegActionPerformed(evt);
            }
        });

        btGS.add(chkO);
        chkO.setText("O");
        chkO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOActionPerformed(evt);
            }
        });

        btGS.add(chkA);
        chkA.setText("A");
        chkA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAActionPerformed(evt);
            }
        });

        btGS.add(chkB);
        chkB.setText("B");
        chkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBActionPerformed(evt);
            }
        });

        btGS.add(chkAB);
        chkAB.setText("AB");
        chkAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkABActionPerformed(evt);
            }
        });

        txtFactorSan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel41.setText("Codigo:");

        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sede Clinica"));

        cboSedeClinica.setEditable(true);
        cboSedeClinica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HUAMACHUCO", "TRUJILLO" }));
        cboSedeClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboSedeClinicaMouseClicked(evt);
            }
        });
        cboSedeClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSedeClinicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(cboSedeClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(cboSedeClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("--");

        chkAltaVisualCom.setText("VIS. COMPL");
        chkAltaVisualCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaVisualComActionPerformed(evt);
            }
        });

        chkVisualCompl.setText("VISUAL COMPLEMENT.");

        chkTrabCalientes.setText("TRAB-CALIENTES");

        chkAltaTrabCal.setText("T-CAL");
        chkAltaTrabCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaTrabCalActionPerformed(evt);
            }
        });

        chkAltaCovid1.setText("C19-1");
        chkAltaCovid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaCovid1ActionPerformed(evt);
            }
        });

        chkAltaCovid2.setText("C19-2");
        chkAltaCovid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaCovid2ActionPerformed(evt);
            }
        });

        chkCovid1.setText("COVID19-1");
        chkCovid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCovid1ActionPerformed(evt);
            }
        });

        chkCovid2.setText("COVID19-2");
        chkCovid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCovid2ActionPerformed(evt);
            }
        });

        chkManipAliment.setText("MANIP.ALIMEN.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpOcupacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtNumColor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnActivar, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(btnActualizarEx)
                                                .addGap(1, 1, 1)))))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkVisualCompl)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BtnActualizarEx, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkPsicosen, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnEditarEx, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLimpiarApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGuardarAperturar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chkFistTest)
                                    .addComponent(chkTrabCalientes)
                                    .addComponent(chkManipAliment)
                                    .addComponent(chkCovid1)
                                    .addComponent(chkCovid2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkAltaFist)
                                        .addGap(8, 8, 8)
                                        .addComponent(chkAltaPsicosen)))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chkAltaTestAltura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkAltaVisualCom))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkAltaTrabCal, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chkAltaCovid1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chkAltaCovid2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkO)
                            .addComponent(chkA)
                            .addComponent(chkB)
                            .addComponent(chkAB)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel31)
                                .addGap(10, 10, 10)
                                .addComponent(txtDniAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombresAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(txtApellidosAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtGS, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtGrupoSan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(txtFactorSan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(rbPos)
                                .addGap(7, 7, 7)
                                .addComponent(rbNeg)))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(167, 167, 167))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGrupoSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFactorSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel41)
                                                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4)
                                                .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel31)
                                                .addComponent(txtDniAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtGS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(5, 5, 5)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel33)
                                                .addComponent(jLabel32))
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNombresAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtApellidosAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rbPos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chkO, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(chkA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkB, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkAB, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(chkAltaCovid1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chkAltaCovid2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkAltaTrabCal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22)
                                        .addComponent(chkAltaTestAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkAltaPsicosen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkAltaVisualCom, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chkAltaFist, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(btnGuardarAperturar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(btnLimpiarApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(BtnEditarEx, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(BtnActualizarEx, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(chkPsicosen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(chkVisualCompl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkFistTest, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkTrabCalientes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkManipAliment, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(chkCovid1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkCovid2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jpOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNumColor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(btnActivar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnActualizarEx)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jTabbedPane1)))
                    .addComponent(jSeparator3))
                .addGap(2, 2, 2))
        );

        jtRegistroGeneral.addTab("Aperturar Examenes Pre - Ocupacionales", jPanel6);

        jLabel45.setText("Nro Orden :");

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Examenes"));

        jCheckBox1.setText("Lab.Clinico");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Electrocardiograma");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Audiologia");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Audiometria");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Espirometria");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Rayos X");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("Certificado de Altura");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("Odontologia");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setText("Oftalmologia");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setText("Psicologia");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        txtNorden1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNorden1ActionPerformed(evt);
            }
        });

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNorden1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(634, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNorden1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(btnLimpiar1))
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jtRegistroGeneral.addTab("Examenes que no pasa paciente ", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jtRegistroGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jtRegistroGeneral))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDepartamentoActionPerformed

        cboDepartamento.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cboProvincia.requestFocus();
            }
        });
    }//GEN-LAST:event_cboDepartamentoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtApellidos.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoActionPerformed
        cboSexo.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtEmail.requestFocus();
            }
        });
    }//GEN-LAST:event_cboSexoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        txtLugarNacimiento.requestFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void cboNivelEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivelEstudioActionPerformed
        cboNivelEstudio.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cboProfesion.requestFocus();
            }
        });
    }//GEN-LAST:event_cboNivelEstudioActionPerformed

    private void txtLugarNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarNacimientoActionPerformed
        cboNivelEstudio.requestFocus();
    }//GEN-LAST:event_txtLugarNacimientoActionPerformed

    private void cboProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProfesionActionPerformed
        cboProfesion.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // departamentos();
                cboEstadoCivil.requestFocus();
            }
        });
    }//GEN-LAST:event_cboProfesionActionPerformed

    private void cboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoCivilActionPerformed
        // txtTelefonoCasa.requestFocus();
        cboEstadoCivil.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                 departamentos();
                txtTelefonoCasa.requestFocus();
            }
        });
    }//GEN-LAST:event_cboEstadoCivilActionPerformed

    private void txtTelefonoCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoCasaActionPerformed
        txtCelular.requestFocus();
    }//GEN-LAST:event_txtTelefonoCasaActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        cboDepartamento.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void cboProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProvinciaActionPerformed
        departamentos();
        cboProvincia.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cboDistrito.requestFocus();
            }
        });
    }//GEN-LAST:event_cboProvinciaActionPerformed

    private void cboDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDistritoActionPerformed
//        departamentos();
        cboDistrito.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cboCaserio.requestFocus();
            }
        });
    }//GEN-LAST:event_cboDistritoActionPerformed

    private void cboProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProvinciaItemStateChanged

    }//GEN-LAST:event_cboProvinciaItemStateChanged

    private void cboDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDepartamentoItemStateChanged
        // cboProvincia.removeAllItems();
        //departamentos();
    }//GEN-LAST:event_cboDepartamentoItemStateChanged

    private void ckbSinDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSinDniActionPerformed
        if (ckbSinDni.isSelected()) {

            txtDni.setEnabled(false);
            CargarProfesionOcupacion();
            habilitar();
            limpiar();
            deshabilitarbotones();
            generarcod();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(true);

        } else {
            btnAgregar.setEnabled(false);
            txtDni.setEnabled(true);
            limpiar();
            deshabilitar();
            txtDni.requestFocus();
        }
    }//GEN-LAST:event_ckbSinDniActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        deshabilitar();
        btnEditar.setEnabled(false);
        btnGrabar.setEnabled(false);
        btnAgregar.setEnabled(false);
        ckbSinDni.setEnabled(true);
        txtHistorial.setVisible(false);
        txtDni.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitar();
        btnGrabar.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    public void cboOcupacion(String Ocupacion) {
        cboProfesion.setSelectedItem(Ocupacion);
    }

    public void cboMineral(String Ocupacion) {
        cboMineralExp.setSelectedItem(Ocupacion);
    }

    public void txtCargo(String Ocupacion) {
        txtCargoDesempenar.setText(Ocupacion);
    }

    public void cboAreaOcupacional(String Ocupacion) {
        cboArea.setSelectedItem(Ocupacion);
    }

    void cargardatos() {
        CargarProfesionOcupacion();
        cboProfesion.setSelectedIndex(-1);
        String sQuery;
        sQuery = "SELECT * from datos_paciente where cod_pa='" + txtDni.getText() + "'";
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next()) {
                deshabilitar();
                ckbSinDni.setEnabled(false);

                //FechaNacimiento.setEnabled(true);
                //Calendar fecha = new GregorianCalendar();
                txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                cboSexo.setSelectedItem(oConn.setResult.getString("sexo_pa"));

                txtEmail.setText(oConn.setResult.getString("email_pa"));
                txtLugarNacimiento.setText(oConn.setResult.getString("lugar_nac_pa"));
                cboNivelEstudio.setSelectedItem(oConn.setResult.getString("nivel_est_pa"));
                cboProfesion.setSelectedItem(oConn.setResult.getString("ocupacion_pa"));
                cboEstadoCivil.setSelectedItem(oConn.setResult.getString("estado_civil_pa"));
                txtDireccion.setText(oConn.setResult.getString("direccion_pa"));
                cboDepartamento.setSelectedItem(oConn.setResult.getString("departamento_pa"));
                cboProvincia.setSelectedItem(oConn.setResult.getString("provincia_pa"));
                cboDistrito.setSelectedItem(oConn.setResult.getString("distrito_pa"));
                cboCaserio.setSelectedItem(oConn.setResult.getString("caserio_pa"));
                txtTelefonoCasa.setText(oConn.setResult.getString("tel_casa_pa"));
                txtCelular.setText(oConn.setResult.getString("cel_pa"));
                txtHistorial.setText(oConn.setResult.getString("historial_pa"));
                btnAgregar.setEnabled(false);
                txtDni.setEnabled(false);
                btnLimpiar.setEnabled(false);
                btnNuevo.setEnabled(true);
                btnEditar.setEnabled(true);
                btnGrabar.setEnabled(false);
                txtHistorial.setVisible(true);
                btnLimpiar.setEnabled(false);

                btnGrabar.setEnabled(true);
                oConn.setResult.close();

            } else {
                habilitar();
                //txtDni.setText("");
                txtNombre.requestFocus();
                btnAgregar.setEnabled(true);

                btnLimpiar.setEnabled(true);
                deshabilitarbotones();
                oConn.setResult.close();
            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Cod Paciente:" + ex.getMessage().toString());
        }
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        deshabilitar();
        btnAgregar.setEnabled(false);
        txtDni.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (!txtNorden.getText().isEmpty()) {
            if (ValidarRegistro()) {

                String strSqlStmt;
                String Query;
                strSqlStmt = "Insert INTO datos_paciente (";
                Query = "Values('";
                if (txtDni.getText().trim().length() >= 1) {
                    strSqlStmt += "cod_pa";
                    Query += txtDni.getText().toString() + "'";
                }
                if (txtNombre.getText().trim().length() > 1) {
                    strSqlStmt += ",nombres_pa";
                    Query += ",'" + txtNombre.getText().toString() + "'";
                }
                if (txtApellidos.getText().trim().length() > 1) {
                    strSqlStmt += ",apellidos_pa";
                    Query += ",'" + txtApellidos.getText().toString() + "'";
                }
                if (((JTextField) FechaNacimiento.getDateEditor().getUiComponent()).getText().trim().length() > 1) {
                    strSqlStmt += ",fecha_nacimiento_pa";
                    Query += ",'" + FechaNacimiento.getDate().toGMTString()+ "'";
                }
                if (cboSexo.getSelectedIndex() >= 0) {

                    strSqlStmt += ",sexo_pa";
                    Query += ",'" + cboSexo.getSelectedItem().toString() + "'";
                }

                if (txtEmail.getText().trim().length() > 1) {
                    strSqlStmt += ",email_pa";
                    Query += ",'" + txtEmail.getText().toString() + "'";
                }
                if (txtLugarNacimiento.getText().trim().length() > 1) {
                    strSqlStmt += ",lugar_nac_pa";
                    Query += ",'" + txtLugarNacimiento.getText().toString() + "'";
                }
                if (cboNivelEstudio.getSelectedIndex() >= 0) {
                    strSqlStmt += ",nivel_est_pa";
                    Query += ",'" + cboNivelEstudio.getSelectedItem().toString() + "'";
                }
                if (cboProfesion.getSelectedIndex() >= 0) {
                    strSqlStmt += ",ocupacion_pa";
                    Query += ",'" + cboProfesion.getSelectedItem().toString() + "'";
                }
                if (cboEstadoCivil.getSelectedIndex() >= 0) {
                    strSqlStmt += ",estado_civil_pa";
                    Query += ",'" + cboEstadoCivil.getSelectedItem().toString() + "'";
                }
                if (txtDireccion.getText().trim().length() > 1) {
                    strSqlStmt += ",direccion_pa";
                    Query += ",'" + txtDireccion.getText().toString() + "'";
                }
                if (cboDepartamento.getSelectedIndex() >= 0) {
                    strSqlStmt += ",departamento_pa";
                    Query += ",'" + cboDepartamento.getSelectedItem().toString() + "'";
                }
                if (cboProvincia.getSelectedIndex() >= 0) {
                    strSqlStmt += ",provincia_pa";
                    Query += ",'" + cboProvincia.getSelectedItem().toString() + "'";
                }
//                if (cboDistrito.getSelectedIndex() >= 0) {
                    strSqlStmt += ",distrito_pa";
                    Query += ",'" + cboDistrito.getSelectedItem().toString() + "'";
//                }
                if (cboCaserio.getSelectedIndex() >= 0) {
                    strSqlStmt += ",caserio_pa";
                    Query += ",'" + cboCaserio.getSelectedItem().toString() + "'";
                }
                if (txtTelefonoCasa.getText().trim().length() > 1) {
                    strSqlStmt += ",tel_casa_pa";
                    Query += ",'" + txtTelefonoCasa.getText().toString() + "'";
                }
           // if (txtTelefonoTrabajo.getText().trim().length()> 1 ){
                //   strSqlStmt+= ",tel_trabajo_pa";
                //   Query+= ",'"+txtTelefonoTrabajo.getText().toString()+ "'";
                //  }
                if (txtCelular.getText().trim().length() > 1) {
                    strSqlStmt += ",cel_pa";
                    Query += ",'" + txtCelular.getText().toString() + "'";
                }
                if (txtFecha.getText().trim().length() > 1) {
                    strSqlStmt += ",fecha_registro_pa";
                    Query += ",'" + txtFecha.getText().toString() + "'";
                }
                
                if (txtHora.getText().trim().length() > 1) {
                    strSqlStmt += ",hora_registro_pa";
                    Query += ",'" + txtHora.getText().toString() + "'";
                }
                if (ckbSinDni.isSelected()) {
                    strSqlStmt += ",cod_aleatorio_pa";
                    Query += ",'" + txtDni.getText().toString() + "'";

                }

             // oFunc.SubSistemaMensajeInformacion(strSqlStmt.concat(") ") + Query.concat(")"));  
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                    limpiar();
                    deshabilitar();
                    btnAgregar.setEnabled(false);
                    txtDni.requestFocus();
                    ckbSinDni.setSelected(false);
                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");

                }
            }

        }
        
        jtRegistroGeneral.setSelectedIndex(1);
        LimpiarAlta();
        txtDniAlta.setText(dni);
        txtDniAlta.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        agregaractualizar();
         jtRegistroGeneral.setSelectedIndex(1);
         LimpiarAlta();
        txtDniAlta.setText(dni);
        txtDniAlta.requestFocus();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAddOcupacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOcupacionMouseClicked
        MostrarAddOcupacion();
    }//GEN-LAST:event_btnAddOcupacionMouseClicked

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        FechaNacimiento.requestFocusInWindow();
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnAddOcupacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOcupacion1MouseClicked
        MostrarAgregarEmpresa();
    }//GEN-LAST:event_btnAddOcupacion1MouseClicked

    private void btnAddOcupacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOcupacion2MouseClicked
        MostrarAgregarContrata();
    }//GEN-LAST:event_btnAddOcupacion2MouseClicked

    private void txtEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresaKeyReleased

    }//GEN-LAST:event_txtEmpresaKeyReleased

    private void txtContrataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrataKeyReleased

    }//GEN-LAST:event_txtContrataKeyReleased

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        txtContrata.requestFocus();
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void btnMineralExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMineralExMouseClicked
        MostrarAddMineralEx();
    }//GEN-LAST:event_btnMineralExMouseClicked

    private void txtNombresAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresAltaActionPerformed

    private void txtNombresAltaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresAltaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresAltaKeyReleased

    private void txtApellidosAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosAltaActionPerformed

    private void txtApellidosAltaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosAltaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosAltaKeyReleased

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtDni.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtContrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrataActionPerformed
        txtMedico.requestFocus();
    }//GEN-LAST:event_txtContrataActionPerformed

    private void chkPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPrecioActionPerformed
        if (chkPrecio.isSelected()) {
            txtPrecio.setEditable(true);
        } else {
            txtPrecio.setEditable(false);
        }
    }//GEN-LAST:event_chkPrecioActionPerformed

    private void cboExamenMedicoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboExamenMedicoPopupMenuWillBecomeInvisible
        if (cboExamenMedico.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Seleccione Servicio");
        } else {
            String sql = "select precio_examen from examen_medico_ocupacional where nom_examen ='" + cboExamenMedico.getSelectedItem().toString() + "'";
            oConn.FnBoolQueryExecute(sql);
            try {
                if (oConn.setResult.next()) {
                    txtPrecio.setText(oConn.setResult.getString("precio_examen"));
                }
            } catch (SQLException ex) {

                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_cboExamenMedicoPopupMenuWillBecomeInvisible

    private void cboExamenMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboExamenMedicoActionPerformed
        cboExamenMedico.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboExamenMedico.getSelectedIndex() <= -1) {

                } else {

                    txtObserv1.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboExamenMedicoActionPerformed

    private void cboExplotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboExplotacionActionPerformed
        cboExplotacion.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboExamenMedico.getSelectedIndex() <= -1) {

                } else {

                    cboMineralExp.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboExplotacionActionPerformed

    private void cboExplotacionPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboExplotacionPopupMenuWillBecomeInvisible
        if (cboExplotacion.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Seleccione Explotación de Mineral");
        }
    }//GEN-LAST:event_cboExplotacionPopupMenuWillBecomeInvisible

    private void cboMineralExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMineralExpActionPerformed
        cboMineralExp.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboExamenMedico.getSelectedIndex() <= -1) {

                } else {

                    cboAltura.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboMineralExpActionPerformed

    private void cboMineralExpPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboMineralExpPopupMenuWillBecomeInvisible
        if (cboMineralExp.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese / Seleccione Mineral Explotado");
        }
    }//GEN-LAST:event_cboMineralExpPopupMenuWillBecomeInvisible

    private void cboAlturaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboAlturaPopupMenuWillBecomeInvisible
        if (cboAltura.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese / seleccione Altura de Labor");
        }
    }//GEN-LAST:event_cboAlturaPopupMenuWillBecomeInvisible

    private void btnLimpiarAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAperturaActionPerformed
        LimpiarAlta();
    }//GEN-LAST:event_btnLimpiarAperturaActionPerformed
 
   private void LimpiarAlta(){
       AltaDesabilitar();
        AltaLimpiar();
       txtDniAlta.setEditable(true);
        hBotones(false);
        rbCredito.setSelected(false);
        rbEfectivo.setSelected(true);
        txtNumColor.setText(null);
        txtGS.setText(null);
        txtGrupoSan.setText(null);
        txtFactorSan.setText(null);
        bgFS.clearSelection();
        btGS.clearSelection();
        txtDniAlta.requestFocus();
        
   }
    private void btnGuardarAperturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAperturarActionPerformed
        if (ValidarAlta()) {
            String stip=null;
             if(rbCredito.isSelected()){
                 stip="CREDITO";
             }else{
                 stip="EFECTIVO";
             }
             
            String Sql = "INSERT INTO n_orden_ocupacional(cod_pa, razon_empresa, razon_contrata,"
                    + " nom_ex, altura_po,mineral_po, fecha_apertura_po,nom_examen,precio_po,cargo_de,n_medico,n_hora,area_o,"
                    + "tipo_pago,n_fisttest,n_psicosen,n_testaltura,color,gruposan,grupofactorsan,cod_clinica,visual_compl,"
                    + "trab_calientes,chkcovid1,chkcovid2,manip_alimentos,txtobserv1,txtobserv2)";//
               
            Sql += " Values ('" + txtDniAlta.getText().toString() + "','"
                    + txtEmpresa.getText().toString() + "','"
                    + txtContrata.getText().toString() + "','"
                    + cboExplotacion.getSelectedItem().toString() + "','"
                    + cboAltura.getSelectedItem().toString() + "','"
                    + cboMineralExp.getSelectedItem().toString() + "','"
                    + txtFechaAlta.getDate().toString() + "','"
                    + cboExamenMedico.getSelectedItem().toString() + "','"
                    + txtPrecio.getText().toString() + "','"
                    + txtCargoDesempenar.getText().toString() + "','"
                    + txtMedico.getText().toString() + "','"
                    + lblHora.getText().toString() + "','"
                    + cboArea.getSelectedItem().toString()+"','" 
                    + stip + "','" 
                    + chkAltaFist.isSelected() + "','"
                    + chkAltaPsicosen.isSelected() + "','"
                    + chkAltaTestAltura.isSelected() +"','"
                    + txtNumColor.getText().toString() + "','"
                    + txtGS.getText().toString() + "','"
                    + txtGrupoSan.getText().toString().concat(txtFactorSan.getText().toString())+ "','"
                    + jLabel44.getText().toString() + "','"
                    + chkAltaVisualCom.isSelected() + "','"
                    + chkAltaTrabCal.isSelected() + "','"
                    + chkAltaCovid1.isSelected() + "','"
                    + chkAltaCovid2.isSelected() + "','"
                    + chkAltaManipAlimen.isSelected() + "','"
                    + txtObserv1.getText()+ "','"
                    + txtObserv2.getText() + "') RETURNING n_orden;";
                   //oFunc.SubSistemaMensajeError(Sql);
                   
            if (oConn.FnBoolQueryExecute(Sql)) {
                try {
                    oConn.setResult.next();
                    num = oConn.setResult.getString("n_orden");
                    txtNorden1.setText(num);
                    oFunc.SubSistemaMensajeInformacion("Alta Correctamente\nSu numero de Orden es :** " + num + " **");
                    AltaDesabilitar();
                    AltaLimpiar();
                    txtDniAlta.setEditable(true);
                    txtDniAlta.requestFocus();
                    sbCargarOcupacional("");
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                oFunc.SubSistemaMensajeError("No se pudo dar de Alta");
            }

        } else {
            oFunc.SubSistemaMensajeError("Llene todos los Campos");
        }
    }//GEN-LAST:event_btnGuardarAperturarActionPerformed
    public boolean OrdenExiste() {
        boolean bResultado = false;

        String sQuery;

        sQuery = "Select n_orden from n_orden_ocupacional Where n_orden=" + txtDniAlta.getText().toString();

        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);

        // Capturo el Error
        try {

            // Verifico que haya habido resultados
            if (oConn.setResult.next()) {
                // Resultado
                bResultado = true;
                oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                limpiar();
            }

            // Cierro los Resultados
            oConn.setResult.close();

        } catch (SQLException ex) {

        }

        return bResultado;

    }
    private void cboAreaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboAreaPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAreaPopupMenuWillBecomeInvisible

    private void cboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAreaActionPerformed
        cboArea.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboArea.getSelectedIndex() <= -1) {

                } else {

                    cboExamenMedico.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboAreaActionPerformed

    private void btnAreaOcupacionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAreaOcupacionalMouseClicked
        MostrarAddArea();
    }//GEN-LAST:event_btnAreaOcupacionalMouseClicked

    private void txtCargoDesempenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoDesempenarActionPerformed
        cboArea.requestFocus();
    }//GEN-LAST:event_txtCargoDesempenarActionPerformed

    private void cboAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAlturaActionPerformed
        cboAltura.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboAltura.getSelectedIndex() <= -1) {

                } else {

                    txtFechaAlta.requestFocusInWindow();
                }

            }
        });
    }//GEN-LAST:event_cboAlturaActionPerformed

    private void FechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaNacimientoPropertyChange
        if (((JTextField) FechaNacimiento.getDateEditor().getUiComponent()).getText().trim().length() > 2) {

            cboSexo.requestFocus();
        }
    }//GEN-LAST:event_FechaNacimientoPropertyChange

    private void btnCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargoMouseClicked
        MostrarAddCargos();
    }//GEN-LAST:event_btnCargoMouseClicked

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        if (txtDni.getText().length() == 8) {
            cargardatos();
            dni=txtDni.getText().toString();
        } else {
            oFunc.SubSistemaMensajeError("Es correcto el DNI?");
        }
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        int limite = 8;
        {
            if (txtDni.getText().length() == limite) {
                evt.consume();
            }
        }
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased
        sbCargarOcupacional(txtBuscarNombre.getText().toString());
    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void txtMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicoActionPerformed
        txtCargoDesempenar.requestFocus();
    }//GEN-LAST:event_txtMedicoActionPerformed

    private void txtDniAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniAltaActionPerformed
        if (txtDniAlta.getText().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese DNI de Trabajador");
        } else {
            if (!OrdenExiste()) {
                String sql;
//                sql = "select nombres_pa, apellidos_pa from datos_paciente where cod_pa ='" + txtDniAlta.getText().toString() + "'";
//                sql="select dp.nombres_pa, dp.apellidos_pa,count(l.fecha_lab) as pasado,l.chko ,l.chka ,l.chkb ,l.chkab, \n" +
//"                        l.rbrhpositivo ,l.rbrhnegativo from datos_paciente as dp\n" +
//"                        inner join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) \n" +
//"                        inner join lab_clinico as l on(n.n_orden=l.n_orden) \n" +
//"                         where dp.cod_pa ='" + txtDniAlta.getText().toString() + "'"+
//"                         group by dp.nombres_pa, dp.apellidos_pa,l.chko ,l.chka ,l.chkb ,l.chkab, \n" +
//"                        l.rbrhpositivo ,l.rbrhnegativo";
                sql="select dp.nombres_pa, dp.apellidos_pa,max(l.fecha_lab) as pasado,\n" +
                    "CASE WHEN l.chko = 'TRUE' THEN 'O'\n" +
                    " WHEN l.chka = 'TRUE' THEN 'A'\n" +
                    " WHEN l.chkb = 'TRUE' THEN 'B'\n" +
                    " WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| \n" +
                    " CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' \n" +
                    " WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS Grupoyfactor  \n" +
                    " from datos_paciente as dp\n" +
                    " left join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) \n" +
                    " left join lab_clinico as l on(n.n_orden=l.n_orden) \n" +
                    " where dp.cod_pa ='"+ txtDniAlta.getText().toString() + "' "+
                   "group by dp.nombres_pa, dp.apellidos_pa,l.chko ,l.chka ,l.chkb ,l.chkab, \n" +
                      "l.rbrhpositivo ,l.rbrhnegativo limit 1";
                oConn.FnBoolQueryExecute(sql);
                try {
                    if (oConn.setResult.next()) {

                        txtNombresAlta.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidosAlta.setText(oConn.setResult.getString("apellidos_pa"));
                        String gs=oConn.setResult.getString("Grupoyfactor");
                        oFunc.SubSistemaMensajeError(gs);
                        if(gs!=null){
                            txtGS.setText(gs);
                        }else{
                            txtGS.setText("null");
                        }
                        AltaHabilitar();
                        CargarNorden();
                        
                        NumColor();
                        
                        txtEmpresa.requestFocus();
                        txtEmpresa.setText("");
                        txtContrata.setText("");
                        txtDniAlta.setEditable(false);
                        
                    } else {

                        oFunc.SubSistemaMensajeError("Si es la primera vez \n Rebe de Registar este Paciente \n   Clic en en la Imagen");
                        AltaDesabilitar();
                        AltaLimpiar();
                        txtDniAlta.requestFocus();
                    }

                    oConn.setResult.close();

                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_txtDniAltaActionPerformed

    private void txtDniAltaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniAltaKeyReleased
        if (evt.getKeyCode() == 112) // F1 = 112
        {
            MostrarUltimoRegistro();
        }
    }//GEN-LAST:event_txtDniAltaKeyReleased

    private void txtDniAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniAltaKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDniAltaKeyTyped

    private void tbOcupacionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOcupacionalMousePressed
        if (evt.getClickCount() == 2) {
            Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
            print(cod);

        }
        if (evt.getClickCount() == 1 ) {
            AltaDesabilitar();
            Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
            String Sql = "SELECT d.nombres_pa,d.apellidos_pa ,n.n_orden, n.cod_pa, n.razon_empresa, n.razon_contrata, n.nom_ex, n.altura_po, "
                    + "n.mineral_po, n.fecha_apertura_po, n.precio_po, n.estado_ex, n.nom_examen, "
                    + "n.cargo_de, n.area_o, n.n_medico, n_hora,n.tipo_pago,n.n_fisttest,n.n_psicosen,n.n_testaltura,"
                    + "n.visual_compl,n.trab_calientes,chkcovid1,chkcovid2,manip_alimentos,txtobserv1,txtobserv2,"
                    + "n.gruposan,n.color,n.grupofactorsan,n.cod_clinica "
                    + "FROM n_orden_ocupacional AS n  "
                    + "INNER JOIN datos_paciente AS d ON(n.cod_pa = d.cod_pa) "
                    + "WHERE n.n_orden = " + cod;
            String stip;
            boolean pago=false;
            boolean pago1=false;
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtDniAlta.setText(oConn.setResult.getString("cod_pa"));
                    txtNombresAlta.setText(oConn.setResult.getString("nombres_pa"));
                    txtApellidosAlta.setText(oConn.setResult.getString("apellidos_pa"));
                    txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                    txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                    txtMedico.setText(oConn.setResult.getString("n_medico"));
                    txtCargoDesempenar.setText(oConn.setResult.getString("cargo_de"));
                    cboArea.setSelectedItem(oConn.setResult.getString("area_o"));
                    cboExamenMedico.setSelectedItem(oConn.setResult.getString("nom_examen"));
                    cboExplotacion.setSelectedItem(oConn.setResult.getString("nom_ex"));
                    cboMineralExp.setSelectedItem(oConn.setResult.getString("mineral_po"));
                    cboAltura.setSelectedItem(oConn.setResult.getString("altura_po"));
                    txtPrecio.setText(oConn.setResult.getString("precio_po"));
                    txtFechaAlta.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                    txtNorden.setText(oConn.setResult.getString("n_orden"));
                    stip=oConn.setResult.getString("tipo_pago");
                     if("EFECTIVO".equals(stip)){
                        pago=true;
                     } 
                     if("CREDITO".equals(stip)){
                        pago1=true;
                    }
                    rbCredito.setSelected(pago1);
                    rbEfectivo.setSelected(pago);
                    chkAltaFist.setSelected(oConn.setResult.getBoolean("n_fisttest"));
                    chkAltaPsicosen.setSelected(oConn.setResult.getBoolean("n_psicosen"));
                    chkAltaTestAltura.setSelected(oConn.setResult.getBoolean("n_testaltura"));
                    chkAltaVisualCom.setSelected(oConn.setResult.getBoolean("visual_compl"));
                    chkAltaTrabCal.setSelected(oConn.setResult.getBoolean("trab_calientes"));
                    chkAltaCovid1.setSelected(oConn.setResult.getBoolean("chkcovid1"));
                    chkAltaCovid2.setSelected(oConn.setResult.getBoolean("chkcovid2"));
                    txtGS.setText(oConn.setResult.getString("gruposan"));
                    txtNumColor.setText(oConn.setResult.getString("color"));
                    txtGrupoSan.setText(oConn.setResult.getString("grupofactorsan"));
                    jLabel44.setText(oConn.setResult.getString("cod_clinica"));
                    chkAltaManipAlimen.setSelected(oConn.setResult.getBoolean("manip_alimentos"));
                    txtObserv1.setText(oConn.setResult.getString("txtobserv1"));
                    txtObserv2.setText(oConn.setResult.getString("txtobserv2"));
                    if(cboSedeClinica.getSelectedIndex()==0){
                            jLabel44.setText(txtNorden.getText()+" - H");
                    }else {
                        jLabel44.setText(txtNorden.getText()+" - T");
                    }
                    txtDniAlta.setEditable(false);
                    hBotones(true);
                    oConn.setResult.close();
                }
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_tbOcupacionalMousePressed

    private void BtnEditarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarExActionPerformed
        txtEmpresa.setEnabled(true);
        txtContrata.setEnabled(true);
        txtMedico.setEnabled(true);
        txtCargoDesempenar.setEnabled(true);
        cboArea.setEnabled(true);
        cboExamenMedico.setEnabled(true);
        cboExplotacion.setEnabled(true);
        cboMineralExp.setEnabled(true);
        cboAltura.setEnabled(true);
        chkAltaFist.setEnabled(true);
        chkAltaPsicosen.setEnabled(true);
        chkAltaTestAltura.setEnabled(true);
        chkAltaVisualCom.setEnabled(true);
        chkAltaTrabCal.setEnabled(true);
        chkAltaCovid1.setEnabled(true);
        chkAltaCovid2.setEnabled(true);
        chkAltaManipAlimen.setEnabled(true);
        txtObserv1.setEnabled(true);
        txtObserv2.setEnabled(true);
        cboSedeClinica.setEnabled(true);
        txtFechaAlta.setEnabled(true);
       

    }//GEN-LAST:event_BtnEditarExActionPerformed

    private void BtnActualizarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarExActionPerformed
         String stip=null;
             if(rbCredito.isSelected()){
                 stip="CREDITO";
             }
             if(rbEfectivo.isSelected()){
                 stip="EFECTIVO";
             }
        String sCodigo;
        String strSqlStmt;
        strSqlStmt = "UPDATE n_orden_ocupacional "
                + "SET razon_empresa='" + txtEmpresa.getText().toString() + "', razon_contrata='" + txtContrata.getText().toString() + "', nom_ex='" + cboExplotacion.getSelectedItem().toString() + "', "
                + "altura_po='" + cboAltura.getSelectedItem().toString() + "', mineral_po='" + cboMineralExp.getSelectedItem().toString() +  "', fecha_apertura_po='" + txtFechaAlta.getDate().toString() 
                +  "',precio_po='" + txtPrecio.getText().toString() + "', "
                + "nom_examen='" + cboExamenMedico.getSelectedItem().toString() + "', cargo_de='" + txtCargoDesempenar.getText().toString() + "', area_o='" + cboArea.getSelectedItem().toString() + "', "
                + "n_medico='" + txtMedico.getText().toString() + "', tipo_pago='" + stip +"', "
                 + "n_fisttest='"+chkAltaFist.isSelected() + "',n_psicosen='"+ chkAltaPsicosen.isSelected() 
                + "',n_testaltura='"+ chkAltaTestAltura.isSelected()+ "',"
                + "color='"+ txtNumColor.getText().toString()  +"',"
                + "grupofactorsan='"+ txtGrupoSan.getText().toString().concat(txtFactorSan.getText().toString())  +"',"
                 + "cod_clinica='"+ jLabel44.getText().toString() +"'," 
                + "visual_compl='"+ chkAltaVisualCom.isSelected() +"',"
                + "trab_calientes='"+ chkAltaTrabCal.isSelected()+"'," 
                + "chkcovid1='"+ chkAltaCovid1.isSelected() +"',"
                + "chkcovid2='"+ chkAltaCovid2.isSelected() +"',"
                + "manip_alimentos='"+ chkAltaManipAlimen.isSelected() +"',"
                + "txtobserv1='"+ txtObserv1.getText() +"',"
                + "txtobserv2='"+ txtObserv2.getText() +"'";
//        sCodigo = txtNorden.getText();
        sCodigo = tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString();
        strSqlStmt += " Where n_orden = '" + sCodigo + "'";
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
            AltaDesabilitar();
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
        sbCargarOcupacional("");
    }//GEN-LAST:event_BtnActualizarExActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
        String sql;
        sql = "select n_orden from tip_ex_otros where n_orden ='" + cod + "'";
        //oFunc.SubSistemaMensajeError(sql);
        if (sql != null) {

            String Sql = "INSERT INTO tip_ex_otros(n_orden,t_ex1,t_ex2,t_ex3,t_ex4,t_ex5,t_ex6,t_ex7)";
            Sql += " Values ('" + cod + "','"
                    + chkFistTest.isSelected() + "','"
                    + chkPsicosen.isSelected() + "','"
                    + chkVisualCompl.isSelected() + "','"
                    + chkTrabCalientes.isSelected() + "','"
                    + chkCovid1.isSelected() + "','"
                    + chkCovid2.isSelected() + "','"
                    + chkManipAliment.isSelected() +  "') RETURNING n_orden;";

            if (oConn.FnBoolQueryExecute(Sql)) {
                try {
                    oConn.setResult.next();
                    num = oConn.setResult.getString("n_orden");

                    oFunc.SubSistemaMensajeInformacion("Su numero de Orden es :** " + num + " **");

                    //sbCargarOcupacional("");
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                oFunc.SubSistemaMensajeError("Nº Orden ya existe");
            }
        } 
    }//GEN-LAST:event_btnActivarActionPerformed

    private void chkFistTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkFistTestMouseClicked
    
    }//GEN-LAST:event_chkFistTestMouseClicked

    private void chkAltaTestAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaTestAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaTestAlturaActionPerformed

    private void btnActualizarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarExActionPerformed
         Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
        String Sql = "UPDATE tip_ex_otros "
                + "SET t_ex1='" + chkFistTest.isSelected() + 
                "', t_ex2='" + chkPsicosen.isSelected()+
                "', t_ex3='" + chkVisualCompl.isSelected()+
                "', t_ex4='" + chkTrabCalientes.isSelected()+
                "', t_ex5='" + chkCovid1.isSelected()+
                "', t_ex6='" + chkCovid2.isSelected()+
                "', t_ex7='"+chkManipAliment.isSelected()+"'";
            Sql += " Where n_orden = '" + cod + "'";
            oConn.FnBoolQueryExecuteUpdate(Sql);
            oFunc.SubSistemaMensajeInformacion("Examenes Actualizados");
            chkFistTest.setSelected(false);
            chkPsicosen.setSelected(false);
            chkVisualCompl.setSelected(false);
            chkTrabCalientes.setSelected(false);
            chkCovid1.setSelected(false);
            chkCovid2.setSelected(false);
            chkManipAliment.setSelected(false);
    }//GEN-LAST:event_btnActualizarExActionPerformed

    private void chkAltaPsicosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaPsicosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaPsicosenActionPerformed

    private void chkAltaFistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaFistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaFistActionPerformed

    private void tbOcupacionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbOcupacionalKeyReleased
        if(evt.getKeyCode() == 40 || evt.getKeyCode() == 38){
            AltaDesabilitar();
            Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
            String Sql = "SELECT d.nombres_pa,d.apellidos_pa ,n.n_orden, n.cod_pa, n.razon_empresa, n.razon_contrata, n.nom_ex, n.altura_po, "
                    + "n.mineral_po, n.fecha_apertura_po, n.precio_po, n.estado_ex, n.nom_examen, "
                    + "n.cargo_de, n.area_o, n.n_medico, n_hora,n.tipo_pago,n.n_fisttest,n.n_psicosen,n.n_testaltura,"
                    + "visual_compl,trab_calientes,chkcovid1,chkcovid2,manip_alimentos,txtobserv1,txtobserv2,"
                    + "n.color,n.gruposan,n.grupofactorsan,n.cod_clinica "
                    + "FROM n_orden_ocupacional AS n  "
                    + "INNER JOIN datos_paciente AS d ON(n.cod_pa = d.cod_pa) "
                    + "WHERE n.n_orden = " + cod;
            String stip;
            boolean pago=false;
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtDniAlta.setText(oConn.setResult.getString("cod_pa"));
                    txtNombresAlta.setText(oConn.setResult.getString("nombres_pa"));
                    txtApellidosAlta.setText(oConn.setResult.getString("apellidos_pa"));
                    txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                    txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                    txtMedico.setText(oConn.setResult.getString("n_medico"));
                    txtCargoDesempenar.setText(oConn.setResult.getString("cargo_de"));
                    cboArea.setSelectedItem(oConn.setResult.getString("area_o"));
                    cboExamenMedico.setSelectedItem(oConn.setResult.getString("nom_examen"));
                    cboExplotacion.setSelectedItem(oConn.setResult.getString("nom_ex"));
                    cboMineralExp.setSelectedItem(oConn.setResult.getString("mineral_po"));
                    cboAltura.setSelectedItem(oConn.setResult.getString("altura_po"));
                    txtPrecio.setText(oConn.setResult.getString("precio_po"));
                    txtFechaAlta.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                    txtNorden.setText(oConn.setResult.getString("n_orden"));
                    stip=oConn.setResult.getString("tipo_pago");
                     if("EFECTIVO".equals(stip)){
                        pago=true;
                     }if("CREDITO".equals(stip)){
                        pago=true;
                    }
                    rbCredito.setSelected(pago);
                    rbEfectivo.setSelected(pago);
                    chkAltaFist.setSelected(oConn.setResult.getBoolean("n_fisttest"));
                    chkAltaPsicosen.setSelected(oConn.setResult.getBoolean("n_psicosen"));
                    chkAltaTestAltura.setSelected(oConn.setResult.getBoolean("n_testaltura"));
                    chkAltaVisualCom.setSelected(oConn.setResult.getBoolean("visual_compl"));
                    chkAltaTrabCal.setSelected(oConn.setResult.getBoolean("trab_calientes"));
                    chkAltaCovid1.setSelected(oConn.setResult.getBoolean("chkcovid1"));
                    chkAltaCovid2.setSelected(oConn.setResult.getBoolean("chkcovid2"));
                    chkAltaManipAlimen.setSelected(oConn.setResult.getBoolean("manip_alimentos"));
                    txtNumColor.setText(oConn.setResult.getString("color"));
                    txtGrupoSan.setText(oConn.setResult.getString("grupofactorsan"));
                    jLabel44.setText(oConn.setResult.getString("cod_clinica"));
                    txtObserv1.setText(oConn.setResult.getString("txtobserv1"));
                    txtObserv2.setText(oConn.setResult.getString("txtobserv2"));
                    if(cboSedeClinica.getSelectedIndex()==0){
                            jLabel44.setText(txtNorden.getText()+" - H");
                    }else {
                        jLabel44.setText(txtNorden.getText()+" - T");
                    }
                    txtDniAlta.setEditable(false);
                    hBotones(true);
                    oConn.setResult.close();
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_tbOcupacionalKeyReleased

    private void chkOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOActionPerformed
        txtGrupoSan.setText("O");
    }//GEN-LAST:event_chkOActionPerformed

    private void chkAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAActionPerformed
        txtGrupoSan.setText("A");
    }//GEN-LAST:event_chkAActionPerformed

    private void chkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBActionPerformed
        txtGrupoSan.setText("B");
    }//GEN-LAST:event_chkBActionPerformed

    private void chkABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkABActionPerformed
        txtGrupoSan.setText("AB");
    }//GEN-LAST:event_chkABActionPerformed

    private void rbPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPosActionPerformed
        txtFactorSan.setText("+");
    }//GEN-LAST:event_rbPosActionPerformed

    private void rbNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNegActionPerformed
        txtFactorSan.setText("-");
    }//GEN-LAST:event_rbNegActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        jtRegistroGeneral.setSelectedIndex(1);
        txtDniAlta.setText(dni);
        txtDniAlta.requestFocus();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnGrabarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrabarMouseClicked
        jtRegistroGeneral.setSelectedIndex(1);
        txtDniAlta.setText(dni);
        txtDniAlta.requestFocus();
    }//GEN-LAST:event_btnGrabarMouseClicked

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
        
            sbCargarOcupacional(txtBuscarCod.getText());
        
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void cboSedeClinicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSedeClinicaMouseClicked
        
    }//GEN-LAST:event_cboSedeClinicaMouseClicked

    private void cboSedeClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSedeClinicaActionPerformed
        if(cboSedeClinica.getSelectedIndex()==0){
                            jLabel44.setText(txtNorden.getText()+" - H");
         }else{
                            jLabel44.setText(txtNorden.getText()+" - T");
                        }
    }//GEN-LAST:event_cboSedeClinicaActionPerformed

    private void txtNorden1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNorden1ActionPerformed

        limpiarChk();
    }//GEN-LAST:event_txtNorden1ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="perimetro_toracico";
        if(!OrdenExiste(tab,txtNorden1.getText())){
            String strSqlStmt;
            strSqlStmt="INSERT INTO perimetro_toracico(\n" +
"            n_orden, t_pelicula, fecha_perimetro)" +
            " VALUES ('"+txtNorden1.getText()+"', 'NO PASO EXAMEN','"+lblFecha.getText()+"'";
            try {
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            } catch (Exception e) {
            }
        }else{
           elimina(tab);
           jCheckBox6.setSelected(false);
       }
        
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="funcion_abs";
        if(!OrdenExiste(tab,txtNorden1.getText())){
            String strSqlStmt;
            strSqlStmt="INSERT INTO funcion_abs(\n" +
    "            n_orden, fecha_abs, interpretacion)" +
            " VALUES ('"+txtNorden1.getText()+"', '"+lblFecha.getText()+"','NO PASO EXAMEN'";
            try {
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            } catch (Exception e) {
            }
        }else{
           elimina(tab);
           jCheckBox5.setSelected(false);
       }
                 
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="audiometria_po";
        if(!OrdenExiste(tab,txtNorden1.getText())){
            String strSqlStmt;
            strSqlStmt="INSERT INTO audiometria_po(\n" +
    "            n_orden, fecha_au)" +
            " VALUES ('"+txtNorden1.getText()+"', '"+lblFecha.getText()+"'";
            try {
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            } catch (Exception e) {
            }
        }else{
           elimina(tab);
           jCheckBox4.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="ficha_audiologica";
        if(!OrdenExiste(tab,txtNorden1.getText())){
            String strSqlStmt;
            strSqlStmt="INSERT INTO ficha_audiologica(" +
    "            n_orden, fecha_examen, txtconclusiones)" +
            " VALUES ('"+txtNorden1.getText()+"', '"+lblFecha.getText()+"','NO PASA EXAMEN' ";
            try {
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            } catch (Exception e) {
            }
        }else{
           elimina(tab);
           jCheckBox3.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="informe_electrocardiograma";
        if(!OrdenExiste(tab,txtNorden1.getText())){
            String strSqlStmt;
            strSqlStmt="INSERT INTO informe_electrocardiograma(\n" +
    "            n_orden, fecha_informe, hallazgo)\n" +
            " VALUES ('"+txtNorden1.getText()+"', '"+lblFecha.getText()+"','NO PASA EXAMEN' ";
            try {
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            } catch (Exception e) {
            }
        }else{
           elimina(tab);
           jCheckBox2.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox2ActionPerformed
    public boolean elimina(String From){
        boolean bResultado=false;
        int seleccion = JOptionPane.showOptionDialog(null, // Componente padre
        "¿Codigo Registrado Desea Eliminar?", //Mensaje
        "Seleccione una opción", // Título
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,    // null para icono por defecto.
        new Object[] { "Si", "No"},   
        "Si");
        if (seleccion != -1){
            if((seleccion + 1)==1){
                String triaje ="DELETE FROM "+From+" WHERE n_orden="+txtNorden1.getText();
                  if(oConn.FnBoolQueryExecuteUpdate(triaje)){
                      oFunc.SubSistemaMensajeInformacion("Eliminado Correctamente");
                      bResultado = true;
                  }else{oFunc.SubSistemaMensajeInformacion("No se pudo Eliminar Registro");bResultado = true;}            
                
        }
        else
        {
      // PRESIONO NO
        }
    }  
    
    return bResultado;
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="lab_clinico";
       if(!OrdenExiste(tab,txtNorden1.getText())){
           String strSqlStmt;
        strSqlStmt="INSERT INTO lab_clinico(\n" +
        "tipo_servicio,n_orden, fecha_lab)" +
        " VALUES ('NO PASO EXAMEN', '"+txtNorden1.getText()+"','"+lblFecha.getText()+"' ";
        try {
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
            }else{
                oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
            }
        } catch (Exception e) {
        }
       }else{
           elimina(tab);
          
           jCheckBox1.setSelected(false);
       }
        

    }//GEN-LAST:event_jCheckBox1ActionPerformed
public boolean OrdenExiste(String tabla,String orden)
    {
        boolean bResultado=false;
        String sQuery;
        sQuery  = "Select n_orden from "+tabla+" Where n_orden="+orden;
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
        return bResultado;
        
    }
    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="certificacion_medica_altura";
        if(!OrdenExiste(tab,txtNorden1.getText())){
             String strSqlStmt;
             strSqlStmt="INSERT INTO certificacion_medica_altura(\n" +
     "            n_orden, fecha_certificacion,dni_user,observaciones)" +
             " VALUES ('"+txtNorden1.getText()+"', '"+lblFecha.getText()+"','42664426','NO PASO EXAMEN' ";
             try {
                 if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                     oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                 }else{
                     oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                 }
             } catch (Exception e) {
             }
        }else{
           elimina(tab);
           jCheckBox7.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        limpiarChk();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="odontograma";
        if(!OrdenExiste(tab,txtNorden1.getText())){
            String strSqlStmt;
            strSqlStmt="INSERT INTO odontograma(\n" +
"            n_orden, fecha_od,txtobservaciones)" +
            " VALUES ('"+txtNorden1.getText()+"', '"+lblFecha.getText()+"','NO PASO EXAMEN'";
            try {
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            } catch (Exception e) {
            }
        }else{
           elimina(tab);
           jCheckBox8.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="oftalmologia";
        if(!OrdenExiste(tab,txtNorden1.getText())){
            String strSqlStmt;
            strSqlStmt="INSERT INTO oftalmologia(\n" +
"            n_orden, e_oculares, fecha_of)" +
            " VALUES ('"+txtNorden1.getText()+"', 'NO PASO EXAMEN','"+lblFecha.getText()+"'";
            try {
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            } catch (Exception e) {
            }
        }else{
           elimina(tab);
           jCheckBox9.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void chkAltaVisualComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaVisualComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaVisualComActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab="informe_psicologico";
        if(!OrdenExiste(tab,txtNorden1.getText())){
            String strSqlStmt;
            strSqlStmt="INSERT INTO informe_psicologico(\n" +
"            n_orden, fecha_entrevista,edad_inf,recomendaciones)" +
            " VALUES ('"+txtNorden1.getText()+"', '"+lblFecha.getText()+"','0','NO PASO EXAMEN'";
            try {
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))){
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            } catch (Exception e) {
            }
        }else{
           elimina(tab);
           jCheckBox10.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void chkAltaTrabCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaTrabCalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaTrabCalActionPerformed

    private void chkAltaCovid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaCovid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaCovid1ActionPerformed

    private void chkAltaCovid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaCovid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaCovid2ActionPerformed

    private void chkCovid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCovid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCovid1ActionPerformed

    private void chkCovid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCovid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCovid2ActionPerformed

    private void chkAltaManipAlimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaManipAlimenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaManipAlimenActionPerformed

    private void txtObserv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObserv1ActionPerformed
        // TODO add your handling code here:
        txtObserv2.requestFocus();
    }//GEN-LAST:event_txtObserv1ActionPerformed

    private void txtObserv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObserv2ActionPerformed
        // TODO add your handling code here:
        cboExplotacion.requestFocus();
    }//GEN-LAST:event_txtObserv2ActionPerformed
    
    private void print(Integer cod) {

        Map parameters = new HashMap();
        parameters.put("Norden", cod);
         
        try {
            String c=cboExamenMedico.getSelectedItem().toString();
            String empresa=txtEmpresa.getText().toString();
            if(("MINERA BARRICK MISQUICHILCA SA".equals(empresa) && "RETIRO".equals(c))|| "LA ARENA S.A.".equals(empresa) && "RETIRO".equals(c)){
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ReporteExamenR.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }else if("ANUAL".equals(c) || "PRE-OCUPACIONAL".equals(c)||"RETIRO".equals(c)||"REUBICACION".equals(c)){
                
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ReporteExamen.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
            
            if("TEST-ALTURA".equals(c)&& !chkAltaPsicosen.isSelected() && "LA ARENA S.A.".equals(empresa) ){
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "TestAltura.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }else if("TEST-ALTURA".equals(c)&&!chkAltaPsicosen.isSelected()){
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "TestAltura2.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
            
            if("PSICOSENSOMETRIA".equals(c)&& !chkAltaTestAltura.isSelected()||"FIST-TEST".equals(c)){
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Psicosensometria.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
            if(("TEST-ALTURA".equals(c) && chkAltaPsicosen.isSelected())||("PSICOSENSOMETRIA".equals(c) &&chkAltaTestAltura.isSelected())){
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "TestAltura1.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
             if("ANEXO 16A".equals(c)||"ANEXO-C".equals(c)||"ANEXO-7D".equals(c)){
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Admision7D.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
             if("COVID-19".equals(c)||"ALTA-EPIDEMIOLOGICA".equals(c)){
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Covid19.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
             if("MANIPULADOR-ALIMENTOS".equals(c)){
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ManipuladorAlimentos.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
            
        } catch (JRException ex) {
            Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void addcontrata(String sDatos) {
        txtContrata.setText(sDatos);

    }

    public void addDni(String sDatos) {
        txtDniAlta.setText(sDatos);
        txtEmpresa.requestFocus();
    }

    public void addNombre(String sDatos) {
        txtNombresAlta.setText(sDatos);
        txtEmpresa.requestFocus();
    }

    public void addApellido(String sDatos) {
        txtApellidosAlta.setText(sDatos);
        txtEmpresa.requestFocus();
    }

    public void addempresa(String sDatos) {
        txtEmpresa.setText(sDatos);

    }

    public void MostrarAgregarEmpresa() {
        addEmpresa = new AgregarEmpresa(this, true);
        addEmpresa.setVisible(true);

    }

    public void MostrarAgregarContrata() {
        addContrata = new AgregarContrata(this, true);
        addContrata.setVisible(true);

    }

    private void agregaractualizar() {
        
        String strSqlStmt;
        strSqlStmt = "Update datos_paciente set nombres_pa = '" + txtNombre.getText()
                + "',apellidos_pa = '" + txtApellidos.getText()
                + "',fecha_nacimiento_pa = '" + FechaNacimiento.getDate().toGMTString()
                + "',sexo_pa = '" + cboSexo.getSelectedItem().toString()
                + "',email_pa = '" + txtEmail.getText()
                + "',lugar_nac_pa = '" + txtLugarNacimiento.getText()
                + "',nivel_est_pa = '" + cboNivelEstudio.getSelectedItem().toString()
                + "',ocupacion_pa = '" + cboProfesion.getSelectedItem().toString()
                + "',estado_civil_pa = '" + cboEstadoCivil.getSelectedItem().toString()
                + "',direccion_pa = '" + txtDireccion.getText()
                + "',departamento_pa = '" + cboDepartamento.getSelectedItem().toString()
                + "',provincia_pa = '" + cboProvincia.getSelectedItem().toString()
                + "',distrito_pa = '" + cboDistrito.getSelectedItem().toString()
                + "',caserio_pa = '" + cboCaserio.getSelectedItem()
                + "',tel_casa_pa = '" + txtTelefonoCasa.getText()
                + //"',tel_trabajo_pa = '"+txtTelefonoTrabajo.getText()+
                "',cel_pa = '" + txtCelular.getText();
        strSqlStmt += "' Where cod_pa = '" + txtDni.getText() + "'";
        
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            limpiar();
            deshabilitar();
            btnAgregar.setEnabled(false);
            txtDni.requestFocus();
            ckbSinDni.setSelected(false);
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
            
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }

    }
//////////////////////////////////////////////////////////////////////////////////////////////

    void sbCargarOcupacional(String valor) {

        String[] titulos = {"N°Orden", "Nombres", "Fecha","Empresa","Contrata","T.Examen","F.Aptitud"};
        String[] registros = new String[7];
        model = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        String Sql;
        if(!txtBuscarCod.getText().isEmpty()){
            Sql= "select d.nombres_pa||''||d.apellidos_pa AS nombres, n.fecha_apertura_po,"
                + "n.n_orden,n.razon_empresa,n.razon_contrata,n.nom_examen,ca.n_orden as aptitud,"
                + "a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc, "
                + "bc.n_orden as conduccion,ba.n_orden as altura,csm.n_orden as covid,ctc.n_orden as tamizaje"
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden) "
                +" left join anexo7d as a ON (a.n_orden=n.n_orden)"
                +" left join anexoc as ac ON (ac.n_orden=n.n_orden)"
                +" left join observaciones as o ON (o.n_orden=n.n_orden)\n" 
                +" left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)"
                +" left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)"  
                +" left join constancia_salud_marsa as csm ON (csm.n_orden=n.n_orden)" 
                +" left join constancia_tamizaje_covid19 as ctc ON (n.n_orden=ctc.n_orden)"
                + "where n.n_orden='" + valor + "'";
        }else{
            Sql= "select d.nombres_pa||''||d.apellidos_pa AS nombres, n.fecha_apertura_po,"
                + "n.n_orden,n.razon_empresa,n.razon_contrata,n.nom_examen,ca.n_orden as aptitud,"
                + "a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc, "
                + "bc.n_orden as conduccion,ba.n_orden as altura,csm.n_orden as covid,ctc.n_orden as tamizaje  "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden) "
                +" left join anexo7d as a ON (a.n_orden=n.n_orden)"
                +" left join anexoc as ac ON (ac.n_orden=n.n_orden)"
                +" left join observaciones as o ON (o.n_orden=n.n_orden)\n" 
                +" left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)"
                +" left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)"  
                +" left join constancia_salud_marsa as csm ON (csm.n_orden=n.n_orden)" 
                +" left join constancia_tamizaje_covid19 as ctc ON (n.n_orden=ctc.n_orden)"
                + "where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%" + valor + "%'"
                + " order by n.n_orden desc limit 40";
        }
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if (oConn.FnBoolQueryExecute(Sql)) {
            try {

                while (oConn.setResult.next()) {

                    registros[0] = oConn.setResult.getString("n_orden");
                    registros[1] = oConn.setResult.getString("nombres");
                    registros[2] = formato.format(oConn.setResult.getDate("fecha_apertura_po"));
                    registros[3]= oConn.setResult.getString("razon_empresa");
                    registros[4]= oConn.setResult.getString("razon_contrata");
                    String exa=oConn.setResult.getString("nom_examen");
                    registros[5]= exa;
                    String s=oConn.setResult.getString("aptitud");
                    String a=oConn.setResult.getString("anexo7d");
                    String o=oConn.setResult.getString("observados");
                    String ac=oConn.setResult.getString("anexoc");
                    String bc=oConn.setResult.getString("conduccion");
                    String ba=oConn.setResult.getString("altura");
                    String csm=oConn.setResult.getString("covid");
                    String ctc=oConn.setResult.getString("tamizaje");
                    if(s != null ){
                        registros[6]="COMPLETO";
                    }else if( a != null && "ANEXO-7D".equals(exa)){
                            registros[6]="COMPLETO";
                    }else if( o!= null){
                            registros[6]="OBSERVADO";
                    }else if( ac!= null && "ANEXO-C".equals(exa)){
                            registros[6]="COMPLETO";
                    }else if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                            registros[6]="COMPLETO";
                    }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                            registros[6]="COMPLETO";
                    }else if( csm!= null && ("COVID-19".equals(exa)|| "COVID-19 CUANTITATIVA".equals(exa))){
                            registros[6]="COMPLETO";
                    }else if( ctc!= null && ("COVID-19".equals(exa)|| "COVID-19 CUANTITATIVA".equals(exa))){
                            registros[6]="COMPLETO";
                    }else{ registros[6]="FALTA"; }
                    
                    tbOcupacional.setDefaultRenderer(Object.class, new MyCellRenderer());
                    model.addRow(registros);
                }

                // Coloca el Modelo de Nueva Cuenta
                tbOcupacional.setModel(model);
                tabla();

                // Cierra Resultados
                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
 public class MyCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        boolean valid = String.valueOf(table.getValueAt(row, 6)).equals("COMPLETO");
        boolean valid1= String.valueOf(table.getValueAt(row, 6)).equals("OBSERVADO");
        component.setBackground(valid ? Color.green :valid1? Color.ORANGE:Color.RED);
       
//        component.setForeground(valid ? Color.blue : Color.white);
        return component;
    }
}
    void tabla() {
        tbOcupacional.setFont(new java.awt.Font("Tahoma", 0, 11));
        tbOcupacional.setModel(model);
        tbOcupacional.setSelectionForeground(Color.BLUE);
        tbOcupacional.getColumnModel().getColumn(0).setPreferredWidth(30);
//      tbOcupacional.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbOcupacional.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbOcupacional.getTableHeader().setReorderingAllowed(false);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarEx;
    private javax.swing.JButton BtnEditarEx;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.ButtonGroup bgFS;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.ButtonGroup btGS;
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnActualizarEx;
    private javax.swing.JLabel btnAddOcupacion;
    private javax.swing.JLabel btnAddOcupacion1;
    private javax.swing.JLabel btnAddOcupacion2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel btnAreaOcupacional;
    private javax.swing.JLabel btnCargo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnGuardarAperturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiarApertura;
    private javax.swing.JLabel btnMineralEx;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboAltura;
    private javax.swing.JComboBox cboArea;
    private javax.swing.JComboBox cboCaserio;
    private javax.swing.JComboBox cboDepartamento;
    private javax.swing.JComboBox cboDistrito;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JComboBox cboExamenMedico;
    private javax.swing.JComboBox cboExplotacion;
    private javax.swing.JComboBox cboMineralExp;
    private javax.swing.JComboBox cboNivelEstudio;
    private javax.swing.JComboBox cboProfesion;
    private javax.swing.JComboBox cboProvincia;
    private javax.swing.JComboBox cboSedeClinica;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JCheckBox chkA;
    private javax.swing.JCheckBox chkAB;
    private javax.swing.JCheckBox chkAltaCovid1;
    private javax.swing.JCheckBox chkAltaCovid2;
    private javax.swing.JCheckBox chkAltaFist;
    private javax.swing.JCheckBox chkAltaManipAlimen;
    private javax.swing.JCheckBox chkAltaPsicosen;
    private javax.swing.JCheckBox chkAltaTestAltura;
    private javax.swing.JCheckBox chkAltaTrabCal;
    private javax.swing.JCheckBox chkAltaVisualCom;
    private javax.swing.JCheckBox chkB;
    private javax.swing.JCheckBox chkCovid1;
    private javax.swing.JCheckBox chkCovid2;
    private javax.swing.JCheckBox chkFistTest;
    private javax.swing.JCheckBox chkManipAliment;
    private javax.swing.JCheckBox chkO;
    private javax.swing.JCheckBox chkPrecio;
    private javax.swing.JCheckBox chkPsicosen;
    private javax.swing.JCheckBox chkTrabCalientes;
    private javax.swing.JCheckBox chkVisualCompl;
    private javax.swing.JCheckBox ckbSinDni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpOcupacional;
    private javax.swing.JTabbedPane jtRegistroGeneral;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JRadioButton rbCredito;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.JRadioButton rbNeg;
    private javax.swing.JRadioButton rbPos;
    private javax.swing.JTable tbOcupacional;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosAlta;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtCargoDesempenar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniAlta;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtFactorSan;
    private javax.swing.JLabel txtFecha;
    private com.toedter.calendar.JDateChooser txtFechaAlta;
    private javax.swing.JTextField txtGS;
    private javax.swing.JTextField txtGrupoSan;
    private javax.swing.JTextField txtHistorial;
    private javax.swing.JLabel txtHora;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombresAlta;
    private javax.swing.JLabel txtNorden;
    private javax.swing.JTextField txtNorden1;
    private javax.swing.JLabel txtNumColor;
    private javax.swing.JTextField txtObserv1;
    private javax.swing.JTextField txtObserv2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefonoCasa;
    // End of variables declaration//GEN-END:variables
    public void fecha() {
        Date dateHoy = new Date();
//Date dateHora = new Date();    
        // Variable para dar formato
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat FormatoHora = new SimpleDateFormat("hh:mm:ss a");
        // Inicializa Folio y Fecha
        lblFecha.setText(formato.format(dateHoy));
        // lblHora.setText(FormatoHora.format(dateHora));
        txtFecha.setText(formato.format(dateHoy));
        // txtHora.setText(FormatoHora.format(dateHora));
        txtFechaAlta.setDate(dateHoy);

    }
    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date HorNew = new Date();
            SimpleDateFormat fechaforma = new SimpleDateFormat("hh:mm:ss a");
            String FfechaSystemA = fechaforma.format(HorNew);

            GestorTime.setFfechaSystem(FfechaSystemA);
            lblHora.setText(GestorTime.getFfechaSystem());
            txtHora.setText(GestorTime.getFfechaSystem());
        }
    });

    public void CargarProfesionOcupacion() {
        cboProfesion.removeAllItems();
        String sQuery;
        // Prepara el Query
        sQuery = "SELECT ocupacion_pa FROM ocupaciones_pa";

        if (oConn.FnBoolQueryExecute(sQuery)) {
            try {

                while (oConn.setResult.next()) {
                    cboProfesion.addItem(oConn.setResult.getString("ocupacion_pa"));

                }

                // Cierra Resultados
                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());

            }
        }
    }

    public void CargarAreaOcupacional() {
        cboArea.removeAllItems();
        String sQuery;
        // Prepara el Query
        sQuery = "SELECT area_o FROM area_ocupacional";

        if (oConn.FnBoolQueryExecute(sQuery)) {
            try {

                while (oConn.setResult.next()) {
                    cboArea.addItem(oConn.setResult.getString("area_o"));

                }

                // Cierra Resultados
                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());

            }
        }
    }

    private boolean ValidarRegistro() {
        // Variable de Resultado
        boolean bResultado = true;

        if (txtDni.getText().isEmpty()) {
            bResultado = false;
        } else if (txtNombre.getText().isEmpty()) {
            bResultado = false;
        } else if (txtApellidos.getText().isEmpty()) {
            bResultado = false;
        } else if (((JTextField) FechaNacimiento.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha de Nacimiento");
            bResultado = false;
        } else if (cboSexo.getSelectedIndex() <= -1) {
            bResultado = false;
        } else if (txtLugarNacimiento.getText().trim().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese Lugar de Nacimiento");
            bResultado = false;
        } else if (cboNivelEstudio.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese Nivel de Estudio");
            bResultado = false;
        } else if (cboProfesion.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese Profesión");
            bResultado = false;
        } else if (cboEstadoCivil.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese Estado Civil");
            bResultado = false;
        } else if (txtDireccion.getText().trim().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese su Dirección");
            bResultado = false;
        } else if (cboDepartamento.getEditor().getItem().toString().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese Departamento");
            bResultado = false;
        } else if (cboDistrito.getEditor().getItem().toString().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese Distrito");
            bResultado = false;
        } else if (txtTelefonoCasa.getText().isEmpty() && txtCelular.getText().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese número Fijo i/o Celular");
            bResultado = false;
        }

        return bResultado;
    }

    private void generarcod() {
        String sQuery;
        sQuery = "SELECT count(cod_aleatorio_pa)+1 as aleatorio from datos_paciente";
        if (oConn.FnBoolQueryExecute(sQuery)) {
            try {
                while (oConn.setResult.next()) {
                    txtDni.setText(oConn.setResult.getString("aleatorio"));
                }
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex);
            }
        }

    //    txtDni.setBackground(Color.lightGray);
    }

    private void deshabilitarbotones() {
        txtHistorial.setVisible(false);
        btnEditar.setEnabled(false);
        btnGrabar.setEnabled(false);
        btnNuevo.setEnabled(false);

    }

    private void deshabilitar() {

        txtDni.setEnabled(true);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        //txtTelefonoTrabajo.setEnabled(false);
        txtTelefonoCasa.setEnabled(false);

        txtLugarNacimiento.setEnabled(false);
        txtEmail.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCelular.setEnabled(false);
        cboSexo.setEnabled(false);
        cboProvincia.setEnabled(false);
        cboProfesion.setEnabled(false);
        cboNivelEstudio.setEnabled(false);
        cboEstadoCivil.setEnabled(false);
        cboDistrito.setEnabled(false);
        cboDepartamento.setEnabled(false);
        cboCaserio.setEnabled(false);
        btnAddOcupacion.setVisible(false);
        FechaNacimiento.setEnabled(false);
        txtGrupoSan.setEnabled(false);
        txtFactorSan.setEnabled(false);

    }
   
    private void limpiar() {
        txtDni.setText(null);
        txtNombre.setText(null);
        txtApellidos.setText(null);
        // txtTelefonoTrabajo.setText("");
        txtTelefonoCasa.setText("");

        txtLugarNacimiento.setText("");
        txtEmail.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
        cboSexo.setSelectedIndex(-1);
        cboProvincia.setSelectedIndex(-1);
        cboProfesion.setSelectedIndex(-1);
        cboNivelEstudio.setSelectedIndex(-1);
        cboEstadoCivil.setSelectedIndex(-1);
        cboDistrito.setSelectedIndex(-1);
        cboDepartamento.setSelectedIndex(-1);
        cboCaserio.setSelectedIndex(-1);
        FechaNacimiento.setDate(null);
        txtHistorial.setText("");
    }

    private void habilitar() {
        txtDni.setEnabled(false);
        txtApellidos.setEnabled(true);
        txtNombre.setEnabled(true);
        // txtTelefonoTrabajo.setEnabled(true);
        txtTelefonoCasa.setEnabled(true);

        txtLugarNacimiento.setEnabled(true);
        txtEmail.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtCelular.setEnabled(true);
        cboSexo.setEnabled(true);
        cboProvincia.setEnabled(true);
        cboProfesion.setEnabled(true);
        cboNivelEstudio.setEnabled(true);
        cboEstadoCivil.setEnabled(true);
        cboDistrito.setEnabled(true);
        cboDepartamento.setEnabled(true);
        cboCaserio.setEnabled(true);
        btnAddOcupacion.setVisible(true);
        FechaNacimiento.setEnabled(true);
        txtGrupoSan.setEnabled(true);
        txtFactorSan.setEnabled(true);

    }

    private void departamentos() {

        switch ((String) cboDepartamento.getSelectedItem()) {
            case "HUANCAVELICA":
                cboProvincia.addItem("HUANCAVELICA");
                cboProvincia.addItem("ACOBAMBA");
                cboProvincia.addItem("ANGARAES");
                cboProvincia.addItem("CASTROVIRREYNA");
                cboProvincia.addItem("CHURCAMPA");
                cboProvincia.addItem("HUAYTARA");
                cboProvincia.addItem("TAYACAJA");
                break;
            case "AMAZONAS":
                cboProvincia.addItem("CHACHAPOYAS");
                cboProvincia.addItem("BAGUA");
                cboProvincia.addItem("BONGARA");
                cboProvincia.addItem("CONDORCANQUI");
                cboProvincia.addItem("LUYA");
                cboProvincia.addItem("RODRIGUEZ DE MENDOZA");
                cboProvincia.addItem("UTCUBAMBA");
                break;
            case "CAJAMARCA":
                cboProvincia.addItem("SAN IGNACIO");
                cboProvincia.addItem("JAEN");
                cboProvincia.addItem("CUTERVO");
                cboProvincia.addItem("CHOTA");
                cboProvincia.addItem("SANTA CRUZ");
                cboProvincia.addItem("HUALGAYOC");
                cboProvincia.addItem("CELENDIN");
                cboProvincia.addItem("SAN PABLO");
                cboProvincia.addItem("SAN MIGUEL");
                cboProvincia.addItem("CONTUMAZA");
                cboProvincia.addItem("CAJAMARCA");
                cboProvincia.addItem("CAJABAMBA");
                cboProvincia.addItem("SAN MARCOS");
                break;
            case "TUMBES":
                cboProvincia.addItem("TUMBES");
                break;
            case "LORETO":
                System.out.println("Mayo");
                break;
            case "PIURA":
                System.out.println("Junio");
                break;
            case "LAMBAYEQUE":
                System.out.println("Julio");
                break;
            case "SAN MARTIN":
                System.out.println("Agosto");
                break;
            case "LA LIBERTAD":
                cboProvincia.addItem("TRUJILLO");
                cboProvincia.addItem("ASCOPE");
                cboProvincia.addItem("BOLIVAR");
                cboProvincia.addItem("CHEPEN");
                cboProvincia.addItem("JULCAN");
                cboProvincia.addItem("OTUZCO");
                cboProvincia.addItem("PACASMAYO");
                cboProvincia.addItem("PATAZ");
                cboProvincia.addItem("SANCHEZ CARRION");
                cboProvincia.addItem("SANTIAGO DE CHUCO");
                cboProvincia.addItem("GRAN CHIMU");
                cboProvincia.addItem("VIRU");
                break;
            case "UCAYALI":
                System.out.println("Octubre");
                break;
            case "ANCASH":
                System.out.println("Noviembre");
                break;
            case "HUANUCO":
                System.out.println("Diciembre");
                break;
            case "PASCO":
                System.out.println("Diciembre");
                break;
            case "JUNIN":
                System.out.println("Diciembre");
                break;
            case "AYACUCHO":
                System.out.println("Diciembre");
                break;
            case "LIMA":
                System.out.println("Diciembre");
                break;
            case "ICA":
                System.out.println("Diciembre");
                break;
            case "AREQUIPA":
                System.out.println("Diciembre");
                break;
            case "MOQUEGUA":
                System.out.println("Diciembre");
                break;
            case "MADRE DE DIOS":
                System.out.println("Diciembre");
                break;
            case "CUSCO":
                System.out.println("Diciembre");
                break;
            case "APURIMAC":
                System.out.println("Diciembre");
                break;
            case "PUNO":
                System.out.println("Diciembre");
                break;
            case "TACNA":
                System.out.println("Diciembre");
                break;

        }
    }

    private void CargarServicios() {
        String Consulta;

        Consulta = "select nom_examen from examen_medico_ocupacional ";
        if (oConn.FnBoolQueryExecute(Consulta)) {
            try {
                while (oConn.setResult.next()) {

                    cboExamenMedico.addItem(oConn.setResult.getString("nom_examen"));
                }

                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void CargarAlturaPo() {
        String Consulta;

        Consulta = "select altura_po from altura_po ";
        if (oConn.FnBoolQueryExecute(Consulta)) {
            try {
                while (oConn.setResult.next()) {

                    cboAltura.addItem(oConn.setResult.getString("altura_po"));
                }

                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void CargarExplotacion() {
        String Consulta;

        Consulta = "select nom_ex from explotacion_en_po ";
        if (oConn.FnBoolQueryExecute(Consulta)) {
            try {
                while (oConn.setResult.next()) {

                    cboExplotacion.addItem(oConn.setResult.getString("nom_ex"));
                }

                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void CargarMineralEx() {
        String Consulta;

        Consulta = "select mineral_po from mineral_ex_po ";
        if (oConn.FnBoolQueryExecute(Consulta)) {
            try {
                while (oConn.setResult.next()) {

                    cboMineralExp.addItem(oConn.setResult.getString("mineral_po"));
                }

                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void AltaDesabilitar() {
        txtEmpresa.setEnabled(false);
        txtContrata.setEnabled(false);
        txtNombresAlta.setEnabled(false);
        txtCargoDesempenar.setEnabled(false);
        txtApellidosAlta.setEnabled(false);
        cboArea.setEnabled(false);
        cboAltura.setEnabled(false);
        cboMineralExp.setEnabled(false);
        cboExplotacion.setEnabled(false);
        cboExamenMedico.setEnabled(false);
        txtObserv1.setEnabled(false);
        txtObserv2.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtNorden.setEnabled(false);
        txtMedico.setEnabled(false);
        txtFechaAlta.setEnabled(false);
        chkAltaFist.setEnabled(false);
        chkAltaPsicosen.setEnabled(false);
        chkAltaTestAltura.setEnabled(false);
        chkAltaVisualCom.setEnabled(false);
        chkAltaTrabCal.setEnabled(false);
        chkAltaCovid1.setEnabled(false);
        chkAltaCovid2.setEnabled(false);
        chkAltaManipAlimen.setEnabled(false);
        cboSedeClinica.setEnabled(false);       
    }

    public void AltaHabilitar() {
        txtCargoDesempenar.setEnabled(true);
        cboArea.setEnabled(true);
        jpOcupacional.setEnabled(true);
        txtEmpresa.setEnabled(true);
        txtContrata.setEnabled(true);
        txtNombresAlta.setEnabled(true);
        txtApellidosAlta.setEnabled(true);
        cboAltura.setEnabled(true);
        cboMineralExp.setEnabled(true);
        cboExplotacion.setEnabled(true);
        cboExamenMedico.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtNorden.setEnabled(true);
        txtMedico.setEnabled(true);
        txtFechaAlta.setEnabled(true);
        txtDniAlta.setEditable(true);
        chkAltaFist.setEnabled(true);
        chkAltaPsicosen.setEnabled(true);
        chkAltaTestAltura.setEnabled(true);
        chkAltaVisualCom.setEnabled(true);
        chkAltaTrabCal.setEnabled(true);
        chkAltaCovid1.setEnabled(true);
        chkAltaCovid2.setEnabled(true);
        chkAltaManipAlimen.setEnabled(true);
        txtGrupoSan.setEnabled(true);
        txtFactorSan.setEnabled(true);
        cboSedeClinica.setEnabled(true);
        txtObserv1.setEnabled(true);
        txtObserv2.setEnabled(true);
    }

    public void AltaLimpiar() {
        txtDniAlta.setText(null);
        jLabel44.setText(null);
        txtEmpresa.setText(null);
        txtContrata.setText(null);
        txtNombresAlta.setText(null);
        txtApellidosAlta.setText(null);
        cboAltura.setSelectedIndex(-1);
        cboMineralExp.setSelectedIndex(-1);
        cboExplotacion.setSelectedIndex(-1);
        cboExamenMedico.setSelectedIndex(-1);
        cboArea.setSelectedIndex(-1);
        txtCargoDesempenar.setText(null);
        txtPrecio.setText(null);
        txtNorden.setText(null);
        txtMedico.setText(null);
        txtFechaAlta.setDate(null);
        txtNorden.setText("0");
        chkAltaFist.setSelected(false);
        chkAltaPsicosen.setSelected(false);
        chkAltaTestAltura.setSelected(false);
        chkAltaVisualCom.setSelected(false);
        chkAltaTrabCal.setEnabled(false);
        chkAltaCovid1.setEnabled(false);
        chkAltaCovid2.setEnabled(false);
        chkAltaManipAlimen.setEnabled(false);
        txtGrupoSan.setText(null);
        txtFactorSan.setText(null);
        txtObserv1.setText(null);
        txtObserv2.setText(null);
        
    }
    
    private void CargarNorden() {
        String sql = "SELECT max(n_orden)+1 as cod from n_orden_ocupacional";
        oConn.FnBoolQueryExecute(sql);
        try {
            if (oConn.setResult.next()) {

                txtNorden.setText(oConn.setResult.getString("cod"));
                if(cboSedeClinica.getSelectedIndex()==0){
                            jLabel44.setText(txtNorden.getText()+" - H");
                }else {
                        jLabel44.setText(txtNorden.getText()+" - T");
                }
            } else {

            }

            oConn.setResult.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void NumColor() {
        String sql = "SELECT max(color)+1 as cod from n_orden_ocupacional\n" +
                        "where fecha_apertura_po='"+lblFecha.getText().toString()+"'";
        oConn.FnBoolQueryExecute(sql);
        
        int numc;
        String n;
        try {
            if (oConn.setResult.next()) {
                n=oConn.setResult.getString("cod");
                if(n!=null){
                   numc = Integer.parseInt(n);
                   txtNumColor.setText(String.valueOf(numc));
                }else
                    txtNumColor.setText("1");
            } 
            oConn.setResult.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private boolean ValidarAlta() {

        boolean bResultado = true;
        if (txtDniAlta.getText().isEmpty()) {
            bResultado = false;
        }
        if (txtEmpresa.getText().trim().isEmpty()) {
            bResultado = false;
        }
        if (txtContrata.getText().trim().isEmpty()) {
            bResultado = false;
        }
        if (cboExamenMedico.getSelectedIndex() <= -1) {
            bResultado = false;
        }
        if (cboAltura.getSelectedIndex() <= -1) {
            bResultado = false;
        }
        if (cboExplotacion.getSelectedIndex() <= -1) {
            bResultado = false;
        }
        if (cboMineralExp.getSelectedIndex() <= -1) {
            bResultado = false;
        }
        if (((JTextField) txtFechaAlta.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha");
            bResultado = false;
        }
        return bResultado;
    }
    public void limpiarChk(){
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
    }
}
