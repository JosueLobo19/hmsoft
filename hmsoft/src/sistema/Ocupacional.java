/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;


import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;


//import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author admin
 */
public class Ocupacional extends javax.swing.JFrame {
 clsFunciones  oFunc = new clsFunciones();
    clsConnection oConn = new clsConnection();
    FichaTriaje ft;
    HistoriaClinicaPs hcl;
    AntecedentesPatologicos ap;
    BuscarUsuarios pe;
    HistorialPacientes hcO;
    TestPsicologico te;
    InformePsicologico ips;
    FichaMedica fm;
    ConsentimientoInformado coi;
//    Anexo7C a7c;
    FichaOftalmologica fo;
    ElectroCardiograma el;
    
    Configurar cf;
    HCL his;
    Radiografia ra;
    Audiometria au;
    LaboratorioClinico an;
    PerimetroToraxico pmt;
    EmpresasLugaresGeograficos hc;
    Anexo7D an7;
    Anexo16A a16;
    AnexoC an7c;
    ConsentimientoDosajeMC cmc;
    CertificacionMedicaTrabajoAltura cmta;
    B_Certificacion_Trabajo_Altura b_ceral;
    B_Uso_Respiradores b_uso;
    b_Ficha_Sas b_sas;
    Odontograma odn;
    AnalisisBioquimico lca;
    RadiografiaTorax rtpa;
    DetecciondeSAS fs;
    CuestionarioNordico cn;
    CuestionarioAudiometría ca;
    FuncionRespiratoriaABS fn;
    ExamenRadiograficoSanguineo er;
    Eliminar Exc;
    InformePsicologicoPoderosa ipp;
    FichaPsicologica_Anexo03 fpa;
    B_Certificacion_conduccion b_cercon;
    B_OIT b_oit;
    Observados obs;
    ExamenesAdicionales exaadi;
    Psicosensometrico psico;
    Frm_conalvias frm_conal;  
     ConstanciaCovid19 frm_constancia; 
      Aptitud_Medico_Ocupacional frm_aptitud; 
      FichaAgroindustriales frm_agro;
      javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
        javax.swing.ImageIcon oNo = null;
    public Ocupacional() {
            getRootPane().setWindowDecorationStyle(JRootPane.NONE);
            initComponents();
            sbSubHabilitaOpciones();
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
           
      lblUsuarioCaja.setText(clsGlobales.sNomOperador);
            KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
//y enseguida registramos nuestro dispatcher
manager.addKeyEventDispatcher(new KeyEventDispatcher(){
            @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
                //como dije, solo las notificaciones del tipo "typed" son las que actualizan los componentes
                if(e.getID() == KeyEvent.KEY_TYPED){
                        //como vamos a convertir todo a mayúsculas, entonces solo checamos si los caracteres son 
                        //minusculas
                        if(e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z'){
                                //si lo son, entonces lo reemplazamos por su respectivo en mayúscula en el mismo evento
                                // (esto se logra por que en java todas las variables son pasadas por referencia)
                                e.setKeyChar((char)(((int)e.getKeyChar()) - 32));
                        }
                }
                //y listo, regresamos siempre falso para que las demas notificaciones continuen, si regresamos true
                // significa que el dispatcher consumio el evento
                return false; 
        }
});  
     
   }
    private void sbSubHabilitaOpciones()
    {
        // Habilita Deshablita opciones
        
        btnTriaje.setVisible(fnBoolIsOptionEnabled("SIS_TRI_01"));
        btnRadiografia.setVisible(fnBoolIsOptionEnabled("SIS_RAD_01"));
        btnOftalmologia.setVisible(fnBoolIsOptionEnabled("SIS_OFT_01"));
        btnFrayosX.setVisible(fnBoolIsOptionEnabled("SIS_FRA_01"));
        btnAudiometria.setVisible(fnBoolIsOptionEnabled("SIS_AUD_01"));
        btnHistoriaOcupacional.setVisible(fnBoolIsOptionEnabled("SIS_HOC_01"));
        btnFichaMedica.setVisible(fnBoolIsOptionEnabled("SIS_FME_01"));
        btnApatologicos.setVisible(fnBoolIsOptionEnabled("SIS_APA_01"));
        ////////////        
        btnAbioquimicos.setVisible(fnBoolIsOptionEnabled("SIS_ABI_01"));
        btnLclinico.setVisible(fnBoolIsOptionEnabled("SIS_LCL_01"));
        //btnFrayosX.setVisible(fnBoolIsOptionEnabled("SIS_PMT_01"));
        btnPelisa.setVisible(fnBoolIsOptionEnabled("SIS_PEL_01"));
        btnInformePsicologico.setVisible(fnBoolIsOptionEnabled("SIS_IFP_01"));
        btnOdontologia.setVisible(fnBoolIsOptionEnabled("SIS_ODN_01"));
        btnTestPsicologico.setVisible(fnBoolIsOptionEnabled("SIS_TPS_01"));
        btnElectrocardigrama.setVisible(fnBoolIsOptionEnabled("SIS_ELE_01"));
        btnAnexo7D.setVisible(fnBoolIsOptionEnabled("SIS_A7D_01"));
        ConsentimientoDosaje.setVisible(fnBoolIsOptionEnabled("SIS_DOS_01"));
        CertificacionTrabajoAltura.setVisible(fnBoolIsOptionEnabled("SIS_CTA_01"));
        RadiografiaTorax.setVisible(fnBoolIsOptionEnabled("SIS_TRX_01"));
        FichaSaS.setVisible(fnBoolIsOptionEnabled("SIS_SAS_01"));
        CuestionarioNordico.setVisible(fnBoolIsOptionEnabled("SIS_NOR_01"));
        FuncionRespiratoria.setVisible(fnBoolIsOptionEnabled("SIS_FRE_01"));
        btnAddUsuarios.setVisible(fnBoolIsOptionEnabled("SIS_USU_01"));
    }
    private boolean fnBoolIsOptionEnabled(String sOption)
    {
        String sStmt;
        boolean bResult=false;
        
        // Consulta para Verificar Acceso a Sistema-Procesos
        sStmt = " Select * from u_rol_procesos";
        sStmt+= " Where rol_user='"+clsGlobales.sRol+"'";
        sStmt+= " And   procesos_ide='"+sOption+"'";
        
        // Ejecuto el Query
        oConn.FnBoolQueryExecute(sStmt);
        try 
        {
            // Verifico que haya habido resultados
            if (oConn.setResult.next()) {
                bResult=true;
            }
        
            // Cierra la Consulta
            oConn.setResult.close();    
        } catch (SQLException ex) {
            Logger.getLogger(Ocupacional.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        // Retorna el Resultado
        return bResult;
        
    }
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPopupMenu();
        Observados = new javax.swing.JMenuItem();
        mExamenesAdicionales = new javax.swing.JMenu();
        mPsicosensometria = new javax.swing.JMenuItem();
        ExamenesAdicionales = new javax.swing.JMenuItem();
        ConsentimientoDosaje = new javax.swing.JMenuItem();
        CertificacionTrabajoAltura = new javax.swing.JMenuItem();
        RadiografiaTorax = new javax.swing.JMenuItem();
        FichaSaS = new javax.swing.JMenuItem();
        CuestionarioNordico = new javax.swing.JMenuItem();
        FuncionRespiratoria = new javax.swing.JMenuItem();
        btnHCL = new javax.swing.JMenuItem();
        btnHC = new javax.swing.JMenuItem();
        ConsentimientoInformado = new javax.swing.JMenuItem();
        OIT = new javax.swing.JMenuItem();
        mBarrick = new javax.swing.JMenu();
        mCertificacionConduccion = new javax.swing.JMenuItem();
        mCertificacionTrabajoAltura = new javax.swing.JMenuItem();
        mUsoRespiradores = new javax.swing.JMenuItem();
        mApnea = new javax.swing.JMenuItem();
        mFichaRetiro = new javax.swing.JMenuItem();
        mAptitudMedico = new javax.swing.JMenuItem();
        FrmVarios = new javax.swing.JMenu();
        frmConalvias = new javax.swing.JMenuItem();
        HclMenu = new javax.swing.JPopupMenu();
        btnHCLPS = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        barraPrincipal = new javax.swing.JToolBar();
        jToolBar2 = new javax.swing.JToolBar();
        btnTriaje = new javax.swing.JButton();
        btnRadiografia = new javax.swing.JButton();
        btnOftalmologia = new javax.swing.JButton();
        btnFrayosX = new javax.swing.JButton();
        btnAudiometria = new javax.swing.JButton();
        btnCuestionarioAudio = new javax.swing.JButton();
        btnHistoriaOcupacional = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnFichaMedica = new javax.swing.JButton();
        btnFichaAptitud = new javax.swing.JButton();
        btnFichaRetiro = new javax.swing.JButton();
        btnApatologicos = new javax.swing.JButton();
        btnAbioquimicos = new javax.swing.JButton();
        btnLclinico = new javax.swing.JButton();
        btnInformePsicologico = new javax.swing.JButton();
        btnOdontologia = new javax.swing.JButton();
        btnTestPsicologico = new javax.swing.JButton();
        btnElectrocardigrama = new javax.swing.JButton();
        btnPespera = new javax.swing.JButton();
        btnAnexo7D = new javax.swing.JButton();
        btnPelisa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUsuarioCaja = new javax.swing.JLabel();
        jbarra = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        Desktop = new javax.swing.JDesktopPane();
        MenuOcupacional = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCambiarUsuario = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        btnconfiguracionsistema = new javax.swing.JMenu();
        btnconfigurarservicios = new javax.swing.JMenuItem();
        btnAddUsuarios = new javax.swing.JMenuItem();
        btnAddUsuariosEmpresas = new javax.swing.JMenuItem();
        btnConfiguracion = new javax.swing.JMenuItem();
        btnEliminarEx = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnActualizar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnPsicologicaPoderosa = new javax.swing.JMenuItem();
        btnFichaPsicologica_Anexo03 = new javax.swing.JMenuItem();

        Observados.setText("Observados");
        Observados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObservadosActionPerformed(evt);
            }
        });
        Menu.add(Observados);

        mExamenesAdicionales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gold.png"))); // NOI18N
        mExamenesAdicionales.setText("Examenes Adicionales");

        mPsicosensometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grua.png"))); // NOI18N
        mPsicosensometria.setText("Psiconsensometrico");
        mPsicosensometria.setActionCommand("Cert. Conducción de Vehiculos");
        mPsicosensometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPsicosensometriaActionPerformed(evt);
            }
        });
        mExamenesAdicionales.add(mPsicosensometria);

        Menu.add(mExamenesAdicionales);

        ExamenesAdicionales.setText("Examenes Adicionales");
        ExamenesAdicionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamenesAdicionalesActionPerformed(evt);
            }
        });
        Menu.add(ExamenesAdicionales);

        ConsentimientoDosaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maletin.png"))); // NOI18N
        ConsentimientoDosaje.setText("Consentimiendo Dosaje");
        ConsentimientoDosaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ConsentimientoDosaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsentimientoDosajeActionPerformed(evt);
            }
        });
        Menu.add(ConsentimientoDosaje);

        CertificacionTrabajoAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        CertificacionTrabajoAltura.setText("Certificación Medica Trabajo en Altura");
        CertificacionTrabajoAltura.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        CertificacionTrabajoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CertificacionTrabajoAlturaActionPerformed(evt);
            }
        });
        Menu.add(CertificacionTrabajoAltura);

        RadiografiaTorax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ray.png"))); // NOI18N
        RadiografiaTorax.setText("Radiografia de Torax P.A");
        RadiografiaTorax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadiografiaToraxActionPerformed(evt);
            }
        });
        Menu.add(RadiografiaTorax);

        FichaSaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        FichaSaS.setText("FichaSas");
        FichaSaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaSaSActionPerformed(evt);
            }
        });
        Menu.add(FichaSaS);

        CuestionarioNordico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        CuestionarioNordico.setText("Cuestionadio Nordico");
        CuestionarioNordico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuestionarioNordicoActionPerformed(evt);
            }
        });
        Menu.add(CuestionarioNordico);

        FuncionRespiratoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        FuncionRespiratoria.setText("Examen Sanguineo");
        FuncionRespiratoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionRespiratoriaActionPerformed(evt);
            }
        });
        Menu.add(FuncionRespiratoria);

        btnHCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnHCL.setText("Llenar Historia");
        btnHCL.setActionCommand("Llenar Historia Clinica");
        btnHCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHCLActionPerformed(evt);
            }
        });
        Menu.add(btnHCL);

        btnHC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnHC.setText("Buscar Historia Clinica");
        btnHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHCActionPerformed(evt);
            }
        });
        Menu.add(btnHC);

        ConsentimientoInformado.setText("Consentimiento Informado Examen Medico");
        ConsentimientoInformado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsentimientoInformadoActionPerformed(evt);
            }
        });
        Menu.add(ConsentimientoInformado);

        OIT.setText("OIT");
        OIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OITActionPerformed(evt);
            }
        });
        Menu.add(OIT);

        mBarrick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gold.png"))); // NOI18N
        mBarrick.setText("Formatos Barrick");

        mCertificacionConduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grua.png"))); // NOI18N
        mCertificacionConduccion.setText("Certificacion de Suficiencia");
        mCertificacionConduccion.setActionCommand("Cert. Conducción de Vehiculos");
        mCertificacionConduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCertificacionConduccionActionPerformed(evt);
            }
        });
        mBarrick.add(mCertificacionConduccion);

        mCertificacionTrabajoAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mCertificacionTrabajoAltura.setText("Certificacion Trabajo en Altura");
        mCertificacionTrabajoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCertificacionTrabajoAlturaActionPerformed(evt);
            }
        });
        mBarrick.add(mCertificacionTrabajoAltura);

        mUsoRespiradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mask.png"))); // NOI18N
        mUsoRespiradores.setText("Uso de Respiradores");
        mUsoRespiradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUsoRespiradoresActionPerformed(evt);
            }
        });
        mBarrick.add(mUsoRespiradores);

        mApnea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cama.png"))); // NOI18N
        mApnea.setText("Apnea de Sueño");
        mApnea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApneaActionPerformed(evt);
            }
        });
        mBarrick.add(mApnea);

        mFichaRetiro.setText("Ficha Retiro");
        mFichaRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaRetiroActionPerformed(evt);
            }
        });
        mBarrick.add(mFichaRetiro);

        mAptitudMedico.setText("Actitud Medico Ocupacional");
        mAptitudMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAptitudMedicoActionPerformed(evt);
            }
        });
        mBarrick.add(mAptitudMedico);

        Menu.add(mBarrick);

        FrmVarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        FrmVarios.setText("Formatos Personalizados");

        frmConalvias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        frmConalvias.setText("Formulario Conalvias");
        frmConalvias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmConalviasActionPerformed(evt);
            }
        });
        FrmVarios.add(frmConalvias);

        Menu.add(FrmVarios);

        btnHCLPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llenarHistoria.png"))); // NOI18N
        btnHCLPS.setText("Historia Clinica Psicologica");
        btnHCLPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHCLPSActionPerformed(evt);
            }
        });
        HclMenu.add(btnHCLPS);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemes de Gestión \"MEDSOFT\"");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        barraPrincipal.setBorder(null);
        barraPrincipal.setFloatable(false);
        barraPrincipal.setRollover(true);
        barraPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraPrincipal.setPreferredSize(new java.awt.Dimension(1219, 52));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar2.setFloatable(false);
        jToolBar2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar2.setToolTipText("");

        btnTriaje.setForeground(new java.awt.Color(102, 102, 102));
        btnTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/enfermeria.jpg"))); // NOI18N
        btnTriaje.setMnemonic('t');
        btnTriaje.setText("Triaje");
        btnTriaje.setToolTipText("F2 (Triaje)");
        btnTriaje.setFocusable(false);
        btnTriaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTriaje.setMaximumSize(new java.awt.Dimension(50, 72));
        btnTriaje.setMinimumSize(new java.awt.Dimension(50, 72));
        btnTriaje.setPreferredSize(new java.awt.Dimension(41, 50));
        btnTriaje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriajeActionPerformed(evt);
            }
        });
        jToolBar2.add(btnTriaje);

        btnRadiografia.setForeground(new java.awt.Color(102, 102, 102));
        btnRadiografia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/radiografia.jpg"))); // NOI18N
        btnRadiografia.setMnemonic('r');
        btnRadiografia.setText("Espirometria");
        btnRadiografia.setToolTipText("F3 (Radiografía)");
        btnRadiografia.setFocusable(false);
        btnRadiografia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRadiografia.setMaximumSize(new java.awt.Dimension(65, 72));
        btnRadiografia.setMinimumSize(new java.awt.Dimension(65, 72));
        btnRadiografia.setPreferredSize(new java.awt.Dimension(67, 50));
        btnRadiografia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRadiografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiografiaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnRadiografia);

        btnOftalmologia.setForeground(new java.awt.Color(102, 102, 102));
        btnOftalmologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/oftalmologia.jpg"))); // NOI18N
        btnOftalmologia.setMnemonic('o');
        btnOftalmologia.setText("Oftalmología");
        btnOftalmologia.setToolTipText("F4 (Oftalmología)");
        btnOftalmologia.setFocusable(false);
        btnOftalmologia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOftalmologia.setMaximumSize(new java.awt.Dimension(70, 72));
        btnOftalmologia.setMinimumSize(new java.awt.Dimension(70, 72));
        btnOftalmologia.setPreferredSize(new java.awt.Dimension(0, 50));
        btnOftalmologia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOftalmologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOftalmologiaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnOftalmologia);

        btnFrayosX.setForeground(new java.awt.Color(102, 102, 102));
        btnFrayosX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/radiografia.jpg"))); // NOI18N
        btnFrayosX.setMnemonic('x');
        btnFrayosX.setText("P. Toracico");
        btnFrayosX.setToolTipText("F5");
        btnFrayosX.setFocusable(false);
        btnFrayosX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFrayosX.setMaximumSize(new java.awt.Dimension(65, 72));
        btnFrayosX.setMinimumSize(new java.awt.Dimension(65, 72));
        btnFrayosX.setPreferredSize(new java.awt.Dimension(0, 50));
        btnFrayosX.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFrayosX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrayosXActionPerformed(evt);
            }
        });
        jToolBar2.add(btnFrayosX);

        btnAudiometria.setForeground(new java.awt.Color(102, 102, 102));
        btnAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/audiometro.jpg"))); // NOI18N
        btnAudiometria.setMnemonic('a');
        btnAudiometria.setText("Audiometría");
        btnAudiometria.setToolTipText("F6 (Audiometría)");
        btnAudiometria.setFocusable(false);
        btnAudiometria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAudiometria.setMaximumSize(new java.awt.Dimension(65, 72));
        btnAudiometria.setMinimumSize(new java.awt.Dimension(65, 72));
        btnAudiometria.setPreferredSize(new java.awt.Dimension(0, 50));
        btnAudiometria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAudiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudiometriaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAudiometria);

        btnCuestionarioAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/comprobante.png"))); // NOI18N
        btnCuestionarioAudio.setText("C.Audiometria");
        btnCuestionarioAudio.setFocusable(false);
        btnCuestionarioAudio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuestionarioAudio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCuestionarioAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestionarioAudioActionPerformed(evt);
            }
        });
        jToolBar2.add(btnCuestionarioAudio);

        btnHistoriaOcupacional.setForeground(new java.awt.Color(102, 102, 102));
        btnHistoriaOcupacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/comprobante.png"))); // NOI18N
        btnHistoriaOcupacional.setText("H. Ocupacional");
        btnHistoriaOcupacional.setToolTipText("F7 (Historia Ocupacional)");
        btnHistoriaOcupacional.setFocusable(false);
        btnHistoriaOcupacional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistoriaOcupacional.setMaximumSize(new java.awt.Dimension(100, 72));
        btnHistoriaOcupacional.setMinimumSize(new java.awt.Dimension(100, 72));
        btnHistoriaOcupacional.setPreferredSize(new java.awt.Dimension(0, 50));
        btnHistoriaOcupacional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHistoriaOcupacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaOcupacionalActionPerformed(evt);
            }
        });
        jToolBar2.add(btnHistoriaOcupacional);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.add(jSeparator1);

        btnFichaMedica.setForeground(new java.awt.Color(102, 102, 102));
        btnFichaMedica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/comprobante.png"))); // NOI18N
        btnFichaMedica.setMnemonic('m');
        btnFichaMedica.setText("F. Médica");
        btnFichaMedica.setToolTipText("F7 (Ficha Médica)");
        btnFichaMedica.setFocusable(false);
        btnFichaMedica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFichaMedica.setMaximumSize(new java.awt.Dimension(65, 72));
        btnFichaMedica.setMinimumSize(new java.awt.Dimension(65, 72));
        btnFichaMedica.setPreferredSize(new java.awt.Dimension(0, 50));
        btnFichaMedica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFichaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaMedicaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnFichaMedica);

        btnFichaAptitud.setForeground(new java.awt.Color(102, 102, 102));
        btnFichaAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/comprobante.png"))); // NOI18N
        btnFichaAptitud.setMnemonic('m');
        btnFichaAptitud.setText("F.Aptitud");
        btnFichaAptitud.setToolTipText("F7 (Ficha Médica)");
        btnFichaAptitud.setFocusable(false);
        btnFichaAptitud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFichaAptitud.setMaximumSize(new java.awt.Dimension(65, 72));
        btnFichaAptitud.setMinimumSize(new java.awt.Dimension(65, 72));
        btnFichaAptitud.setPreferredSize(new java.awt.Dimension(0, 50));
        btnFichaAptitud.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFichaAptitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaAptitudActionPerformed(evt);
            }
        });
        jToolBar2.add(btnFichaAptitud);

        btnFichaRetiro.setForeground(new java.awt.Color(102, 102, 102));
        btnFichaRetiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/comprobante.png"))); // NOI18N
        btnFichaRetiro.setMnemonic('m');
        btnFichaRetiro.setText("Constancia");
        btnFichaRetiro.setToolTipText("F7 (Ficha Médica)");
        btnFichaRetiro.setFocusable(false);
        btnFichaRetiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFichaRetiro.setMaximumSize(new java.awt.Dimension(65, 72));
        btnFichaRetiro.setMinimumSize(new java.awt.Dimension(65, 72));
        btnFichaRetiro.setPreferredSize(new java.awt.Dimension(0, 50));
        btnFichaRetiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFichaRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaRetiroActionPerformed(evt);
            }
        });
        jToolBar2.add(btnFichaRetiro);

        btnApatologicos.setForeground(new java.awt.Color(102, 102, 102));
        btnApatologicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/patologia.jpg"))); // NOI18N
        btnApatologicos.setMnemonic('p');
        btnApatologicos.setText("A. Patológicos");
        btnApatologicos.setToolTipText("F6");
        btnApatologicos.setFocusable(false);
        btnApatologicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnApatologicos.setMaximumSize(new java.awt.Dimension(80, 72));
        btnApatologicos.setMinimumSize(new java.awt.Dimension(80, 72));
        btnApatologicos.setPreferredSize(new java.awt.Dimension(0, 50));
        btnApatologicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnApatologicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApatologicosActionPerformed(evt);
            }
        });
        jToolBar2.add(btnApatologicos);

        btnAbioquimicos.setForeground(new java.awt.Color(102, 102, 102));
        btnAbioquimicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/bioquimicos.png"))); // NOI18N
        btnAbioquimicos.setMnemonic('b');
        btnAbioquimicos.setText("A. Bioquímicos");
        btnAbioquimicos.setToolTipText("F5");
        btnAbioquimicos.setFocusable(false);
        btnAbioquimicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbioquimicos.setMaximumSize(new java.awt.Dimension(80, 72));
        btnAbioquimicos.setMinimumSize(new java.awt.Dimension(80, 72));
        btnAbioquimicos.setPreferredSize(new java.awt.Dimension(0, 50));
        btnAbioquimicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbioquimicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbioquimicosActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAbioquimicos);

        btnLclinico.setForeground(new java.awt.Color(102, 102, 102));
        btnLclinico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/laborato.jpg"))); // NOI18N
        btnLclinico.setMnemonic('c');
        btnLclinico.setText("L. Clinico");
        btnLclinico.setToolTipText("F4");
        btnLclinico.setFocusable(false);
        btnLclinico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLclinico.setMaximumSize(new java.awt.Dimension(65, 72));
        btnLclinico.setMinimumSize(new java.awt.Dimension(65, 72));
        btnLclinico.setPreferredSize(new java.awt.Dimension(0, 50));
        btnLclinico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLclinico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLclinicoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnLclinico);

        btnInformePsicologico.setForeground(new java.awt.Color(102, 102, 102));
        btnInformePsicologico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/cerebro.jpg"))); // NOI18N
        btnInformePsicologico.setText("I. Psicológico");
        btnInformePsicologico.setToolTipText("F2");
        btnInformePsicologico.setFocusable(false);
        btnInformePsicologico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInformePsicologico.setMaximumSize(new java.awt.Dimension(72, 72));
        btnInformePsicologico.setMinimumSize(new java.awt.Dimension(72, 72));
        btnInformePsicologico.setPreferredSize(new java.awt.Dimension(0, 50));
        btnInformePsicologico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInformePsicologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformePsicologicoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnInformePsicologico);

        btnOdontologia.setForeground(new java.awt.Color(102, 102, 102));
        btnOdontologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/dental.jpg"))); // NOI18N
        btnOdontologia.setText("Odontología");
        btnOdontologia.setToolTipText("F6");
        btnOdontologia.setFocusable(false);
        btnOdontologia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOdontologia.setMaximumSize(new java.awt.Dimension(72, 72));
        btnOdontologia.setMinimumSize(new java.awt.Dimension(72, 72));
        btnOdontologia.setPreferredSize(new java.awt.Dimension(0, 50));
        btnOdontologia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOdontologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdontologiaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnOdontologia);

        btnTestPsicologico.setForeground(new java.awt.Color(102, 102, 102));
        btnTestPsicologico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/psiquiatria.jpg"))); // NOI18N
        btnTestPsicologico.setText("T. Psicológico");
        btnTestPsicologico.setToolTipText("F11");
        btnTestPsicologico.setComponentPopupMenu(HclMenu);
        btnTestPsicologico.setFocusable(false);
        btnTestPsicologico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTestPsicologico.setMaximumSize(new java.awt.Dimension(72, 72));
        btnTestPsicologico.setMinimumSize(new java.awt.Dimension(72, 72));
        btnTestPsicologico.setPreferredSize(new java.awt.Dimension(0, 50));
        btnTestPsicologico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTestPsicologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestPsicologicoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnTestPsicologico);

        btnElectrocardigrama.setForeground(new java.awt.Color(102, 102, 102));
        btnElectrocardigrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/electro.jpg"))); // NOI18N
        btnElectrocardigrama.setText("Electrocardiograma");
        btnElectrocardigrama.setToolTipText("F6");
        btnElectrocardigrama.setFocusable(false);
        btnElectrocardigrama.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElectrocardigrama.setMaximumSize(new java.awt.Dimension(100, 72));
        btnElectrocardigrama.setMinimumSize(new java.awt.Dimension(100, 72));
        btnElectrocardigrama.setPreferredSize(new java.awt.Dimension(0, 50));
        btnElectrocardigrama.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnElectrocardigrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectrocardigramaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnElectrocardigrama);

        btnPespera.setForeground(new java.awt.Color(102, 102, 102));
        btnPespera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/agregar.png"))); // NOI18N
        btnPespera.setMnemonic('p');
        btnPespera.setText("Pacientes");
        btnPespera.setToolTipText("F5");
        btnPespera.setFocusable(false);
        btnPespera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPespera.setMaximumSize(new java.awt.Dimension(65, 72));
        btnPespera.setMinimumSize(new java.awt.Dimension(65, 72));
        btnPespera.setPreferredSize(new java.awt.Dimension(0, 50));
        btnPespera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPespera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesperaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnPespera);

        btnAnexo7D.setForeground(new java.awt.Color(102, 102, 102));
        btnAnexo7D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        btnAnexo7D.setMnemonic('p');
        btnAnexo7D.setText("Anexo 16-A");
        btnAnexo7D.setToolTipText("F5");
        btnAnexo7D.setFocusable(false);
        btnAnexo7D.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnexo7D.setMaximumSize(new java.awt.Dimension(65, 72));
        btnAnexo7D.setMinimumSize(new java.awt.Dimension(65, 72));
        btnAnexo7D.setPreferredSize(new java.awt.Dimension(0, 50));
        btnAnexo7D.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnexo7D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7DActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAnexo7D);

        barraPrincipal.add(jToolBar2);

        btnPelisa.setForeground(new java.awt.Color(102, 102, 102));
        btnPelisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        btnPelisa.setMnemonic('e');
        btnPelisa.setText("Anexo-C");
        btnPelisa.setToolTipText("F3");
        btnPelisa.setFocusable(false);
        btnPelisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPelisa.setMaximumSize(new java.awt.Dimension(65, 72));
        btnPelisa.setMinimumSize(new java.awt.Dimension(65, 72));
        btnPelisa.setPreferredSize(new java.awt.Dimension(0, 50));
        btnPelisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPelisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelisaActionPerformed(evt);
            }
        });
        barraPrincipal.add(btnPelisa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1424, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/server.png"))); // NOI18N
        jLabel3.setText("Estado de Servidor :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Conectado");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("CopyRight(c) 2005 -2012 NORPEC");

        lblUsuarioCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuarioCaja.setForeground(new java.awt.Color(0, 51, 102));
        lblUsuarioCaja.setText("Medsoft");

        jbarra.setMnemonic('b');
        jbarra.setText("barra");
        jbarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbarraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuarioCaja)
                .addGap(311, 311, 311)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jbarra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 447, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jbarra)
                    .addComponent(lblUsuarioCaja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        Desktop.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Desktop.setComponentPopupMenu(Menu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1424, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        MenuOcupacional.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        btnCambiarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        btnCambiarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnCambiarUsuario);

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalir);

        MenuOcupacional.add(jMenu1);

        btnconfiguracionsistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnconfiguracionsistema.setText("Configuración del sistema");

        btnconfigurarservicios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        btnconfigurarservicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        btnconfigurarservicios.setText("Configurar servicios");
        btnconfigurarservicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfigurarserviciosActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(btnconfigurarservicios);

        btnAddUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        btnAddUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnAddUsuarios.setText("Crear Usuarios");
        btnAddUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUsuariosActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(btnAddUsuarios);

        btnAddUsuariosEmpresas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        btnAddUsuariosEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnAddUsuariosEmpresas.setText("Crear Usuarios Empresas");
        btnAddUsuariosEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUsuariosEmpresasActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(btnAddUsuariosEmpresas);

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnConfiguracion.setText("Configuración Global");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(btnConfiguracion);

        btnEliminarEx.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        btnEliminarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnEliminarEx.setText("Eliminar Examenes completos");
        btnEliminarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarExActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(btnEliminarEx);

        MenuOcupacional.add(btnconfiguracionsistema);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        jMenu3.setText("Reportes");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        jMenuItem1.setText("Reporte Pacientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Reporte por meses");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        MenuOcupacional.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jMenu4.setText("Ayuda");

        btnActualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizar.setText("Actualizar Sistema");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jMenu4.add(btnActualizar);

        MenuOcupacional.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jMenu5.setText("Evaluaciones Poderosa");

        btnPsicologicaPoderosa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        btnPsicologicaPoderosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnPsicologicaPoderosa.setText("Psicologia Poderosa");
        btnPsicologicaPoderosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsicologicaPoderosaActionPerformed(evt);
            }
        });
        jMenu5.add(btnPsicologicaPoderosa);

        btnFichaPsicologica_Anexo03.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        btnFichaPsicologica_Anexo03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnFichaPsicologica_Anexo03.setText("Ficha Psicologica -Anexo03");
        btnFichaPsicologica_Anexo03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaPsicologica_Anexo03ActionPerformed(evt);
            }
        });
        jMenu5.add(btnFichaPsicologica_Anexo03);

        MenuOcupacional.add(jMenu5);

        setJMenuBar(MenuOcupacional);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    
   }//GEN-LAST:event_jMenu1ActionPerformed

   private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
  
   }//GEN-LAST:event_jMenuItem1ActionPerformed

   private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
   int seleccion = JOptionPane.showOptionDialog(this, "Desea Salir del Sistema","Seleccione su Opción", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"si","no"},"si");
      if(seleccion != -1)
      {
         if((seleccion + 1)==1)
         {
            System.exit(0);
         }
         else
         {
         }
      }
   }//GEN-LAST:event_btnSalirActionPerformed

   private void btnconfigurarserviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfigurarserviciosActionPerformed
       // if(estacerrado(cs)){             
       //   Sistema.Desktop.add(cs);
       //   ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
       //   cs.setFrameIcon(ticon);
       //   cs.setLocation(centradoXY(cs));
       //    cs.show();
       // }
       //      else{
       //    cs.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
       // }
   }//GEN-LAST:event_btnconfigurarserviciosActionPerformed

   private void btnTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriajeActionPerformed
         
        
       if(estacerrado(ft)){   
         ft = new FichaTriaje();  
          Ocupacional.Desktop.add(ft);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          ft.setFrameIcon(ticon);
          ft.setLocation(centradoXY(ft));

           ft.show();
         // ft.setVisible(true);
       }
             else{
           ft.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
       
   }//GEN-LAST:event_btnTriajeActionPerformed

   private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
                        Ingreso i = new Ingreso();
                        i.setVisible(true);
                        this.dispose();
                       
                        
                      
   }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

   private void btnApatologicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApatologicosActionPerformed
         
       if(estacerrado(ap)){ 
            ap = new AntecedentesPatologicos();     
             Ocupacional.Desktop.add(ap);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          ap.setFrameIcon(ticon);
          ap.setLocation(centradoXY(ap));

           ap.show();
         // ap.setVisible(true);
       }
             else{
           ap.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
   }//GEN-LAST:event_btnApatologicosActionPerformed

   private void btnPesperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesperaActionPerformed
      
       if (estacerrado(pe)) {
            pe = new BuscarUsuarios();
         Ocupacional.Desktop.add(pe);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         pe.setFrameIcon(ticon);
         pe.setLocation(centradoXY(pe));
         pe.show();
         //pe.setVisible(true);
      } else {
         pe.moveToFront();
         //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
   }//GEN-LAST:event_btnPesperaActionPerformed

   private void btnTestPsicologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestPsicologicoActionPerformed
        
       if (estacerrado(te)) {
           te = new TestPsicologico();
         Ocupacional.Desktop.add(te);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         te.setFrameIcon(ticon);
         te.setLocation(centradoXY(te));
         te.show();
         //te.setVisible(true);
      } else {
         te.moveToFront();
         //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
   }//GEN-LAST:event_btnTestPsicologicoActionPerformed

   private void btnInformePsicologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformePsicologicoActionPerformed
     
       if (estacerrado(ips)) {
         ips   = new InformePsicologico();
         Ocupacional.Desktop.add(ips);

         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ips.setFrameIcon(ticon);
         ips.setLocation(centradoXY(ips));

         ips.show();
         //ips.setVisible(true);
      } else {
         ips.moveToFront();

         //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
   }//GEN-LAST:event_btnInformePsicologicoActionPerformed

   private void jbarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbarraActionPerformed
    if (jbarra.isSelected()){
     barraPrincipal.setVisible(false);
    }else{
       barraPrincipal.setVisible(true);
    
   }
   }//GEN-LAST:event_jbarraActionPerformed

    private void btnFichaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaMedicaActionPerformed
       
        if(estacerrado(fm)){  
          fm = new FichaMedica();  
          Ocupacional.Desktop.add(fm);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fm.setFrameIcon(ticon);
          fm.setLocation(centradoXY(fm));

          fm.show();
         // fm.setVisible(true);
       }
             else{
           fm.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnFichaMedicaActionPerformed

    private void btnRadiografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiografiaActionPerformed
          
        if(estacerrado(fn)){    
            fn = new FuncionRespiratoriaABS();
          Ocupacional.Desktop.add(fn);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fn.setFrameIcon(ticon);
          fn.setLocation(centradoXY(fn));

           fn.show();
         // er.setVisible(true);
       }
             else{
           fn.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnRadiografiaActionPerformed

    private void btnOftalmologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOftalmologiaActionPerformed
        
        if(estacerrado(fo)){ 
             fo = new FichaOftalmologica();
          Ocupacional.Desktop.add(fo);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fo.setFrameIcon(ticon);
          fo.setLocation(centradoXY(fo));

           fo.show();
          //fo.setVisible(true);
       }
             else{
           fo.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnOftalmologiaActionPerformed

    private void btnElectrocardigramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectrocardigramaActionPerformed
          
        if(estacerrado(el)){   
            el = new ElectroCardiograma(); 
          Ocupacional.Desktop.add(el);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         el.setFrameIcon(ticon);
          el.setLocation(centradoXY(el));

          el.show();
          //el.setVisible(true);
       }
             else{
           el.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnElectrocardigramaActionPerformed

    private void btnFrayosXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrayosXActionPerformed
         
        if(estacerrado(pmt)){  
            pmt = new PerimetroToraxico();
          Ocupacional.Desktop.add(pmt);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         pmt.setFrameIcon(ticon);
          pmt.setLocation(centradoXY(pmt));

           pmt.show();
          //ra.setVisible(true);
       }
             else{
           pmt.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnFrayosXActionPerformed

    private void btnAudiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudiometriaActionPerformed
          
        if(estacerrado(au)){ 
            au = new Audiometria();
          Ocupacional.Desktop.add(au);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         au.setFrameIcon(ticon);
          au.setLocation(centradoXY(au));
          //  au.setVisible(true);
          au.show();
       }
             else{
           au.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnAudiometriaActionPerformed

    private void btnLclinicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLclinicoActionPerformed
            
        if(estacerrado(an)){   
            an = new LaboratorioClinico(); 
          Ocupacional.Desktop.add(an);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         an.setFrameIcon(ticon);
          an.setLocation(centradoXY(an));
           an.show();
         // an.setVisible(true);
       }
             else{
           an.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnLclinicoActionPerformed

    private void btnAbioquimicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbioquimicosActionPerformed
        
 
            if(estacerrado(lca)){
            lca =new AnalisisBioquimico();
          Desktop.add(lca);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         lca.setFrameIcon(ticon);
      lca.setLocation(centradoXY(lca));

          lca.show();
          //lca.setVisible(true);
       }
             else{
         lca.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
                
    }//GEN-LAST:event_btnAbioquimicosActionPerformed

    private void btnHistoriaOcupacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaOcupacionalActionPerformed
         
        if(estacerrado(hc)){  
            hc = new EmpresasLugaresGeograficos();    
          Ocupacional.Desktop.add(hc);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         hc.setFrameIcon(ticon);
          hc.setLocation(centradoXY(hc));

           hc.show();
           //a7c = new Anexo7C();
           // Ocupacional.Desktop.add(a7c);
           // a7c.show();
          //hc.setVisible(true);
       }
             else{
           hc.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnHistoriaOcupacionalActionPerformed

    private void btnAnexo7DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7DActionPerformed
        
        if(estacerrado(a16)){   
             a16 = new Anexo16A();     
          Ocupacional.Desktop.add(a16);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         a16.setFrameIcon(ticon);
          a16.setLocation(centradoXY(a16));

           a16.show();
          //an7.setVisible(true);
       }
             else{
           a16.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnAnexo7DActionPerformed

    private void ConsentimientoDosajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsentimientoDosajeActionPerformed
      
        if(estacerrado(cmc)){ 
             cmc = new ConsentimientoDosajeMC();
          Ocupacional.Desktop.add(cmc);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cmc.setFrameIcon(ticon);
          cmc.setLocation(centradoXY(cmc));

           cmc.show();
         // cmc.setVisible(true);
       }
             else{
           cmc.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_ConsentimientoDosajeActionPerformed

    private void CertificacionTrabajoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CertificacionTrabajoAlturaActionPerformed
        
        if(estacerrado(cmta)){ 
            cmta =new CertificacionMedicaTrabajoAltura();
          Ocupacional.Desktop.add(cmta);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cmta.setFrameIcon(ticon);
          cmta.setLocation(centradoXY(cmta));

          cmta.show();
          //cmta.setVisible(true);
       }
             else{
           cmta.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_CertificacionTrabajoAlturaActionPerformed

    private void btnOdontologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdontologiaActionPerformed
       if(estacerrado(odn)){ 
         odn =new Odontograma();
         Desktop.add(odn);          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         odn.setFrameIcon(ticon);
         odn.setLocation(centradoXY(odn));

         odn.show();
         // odn.setVisible(true);
       }
             else{
          odn.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }   

    }//GEN-LAST:event_btnOdontologiaActionPerformed

    private void RadiografiaToraxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadiografiaToraxActionPerformed
          
        if(estacerrado(rtpa)){ 
            rtpa =new RadiografiaTorax();
          Desktop.add(rtpa);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         rtpa.setFrameIcon(ticon);
      rtpa.setLocation(centradoXY(rtpa));

           rtpa.show();
          //rtpa.setVisible(true);
       }
             else{
         rtpa.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_RadiografiaToraxActionPerformed

    private void FichaSaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaSaSActionPerformed
        
        if(estacerrado(fs)){
            fs =new DetecciondeSAS();
          Desktop.add(fs);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fs.setFrameIcon(ticon);
      fs.setLocation(centradoXY(fs));

          fs.show();
          //fs.setVisible(true);
       }
             else{
         fs.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
       
    }//GEN-LAST:event_FichaSaSActionPerformed

    private void CuestionarioNordicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuestionarioNordicoActionPerformed
          
        if(estacerrado(cn)){  
            cn =new CuestionarioNordico();
          Desktop.add(cn);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cn.setFrameIcon(ticon);
      cn.setLocation(centradoXY(cn));

           cn.show();
          //cn.setVisible(true);
       }
             else{
          cn.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_CuestionarioNordicoActionPerformed

    private void FuncionRespiratoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionRespiratoriaActionPerformed
       
        if(estacerrado(er)){  
          er =new ExamenRadiograficoSanguineo();
          Desktop.add(er);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         er.setFrameIcon(ticon);
      er.setLocation(centradoXY(er));

          er.show();
          //fn.setVisible(true);
       }
             else{
         er.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_FuncionRespiratoriaActionPerformed

    private void btnAddUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUsuariosActionPerformed
         SistemasUsuarios as = new SistemasUsuarios();
              as.setLocationRelativeTo(null);

            as.setVisible(true);
    }//GEN-LAST:event_btnAddUsuariosActionPerformed

    private void btnPelisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelisaActionPerformed
       if(estacerrado(an7c)){   
             an7c = new AnexoC();     
          Ocupacional.Desktop.add(an7c);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         an7c.setFrameIcon(ticon);
          an7c.setLocation(centradoXY(an7c));

           an7c.show();
          //an7.setVisible(true);
       }
             else{
           an7c.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnPelisaActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        if(estacerrado(cf)){  
          cf =new Configurar();
          Desktop.add(cf);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cf.setFrameIcon(ticon);
      cf.setLocation(centradoXY(cf));

          cf.show();
          //fn.setVisible(true);
       }
             else{
         cf.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnHCLPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHCLPSActionPerformed
        if(estacerrado(hcl)){  
          hcl =new HistoriaClinicaPs();
          Desktop.add(hcl);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         hcl.setFrameIcon(ticon);
      hcl.setLocation(centradoXY(hcl));

          hcl.show();
          //fn.setVisible(true);
       }
             else{
         hcl.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnHCLPSActionPerformed

    private void btnHCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHCLActionPerformed
         if(estacerrado(his)){  
          his =new HCL();
          Desktop.add(his);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         his.setFrameIcon(ticon);
      his.setLocation(centradoXY(his));

          his.show();
          //fn.setVisible(true);
       }
             else{
         his.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnHCLActionPerformed

    private void btnHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHCActionPerformed
         if(estacerrado(hcO)){  
          hcO =new HistorialPacientes();
          Desktop.add(hcO);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         hcO.setFrameIcon(ticon);
      hcO.setLocation(centradoXY(hcO));

          hcO.show();
          //fn.setVisible(true);
       }
             else{
         hcO.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnHCActionPerformed

    private void btnEliminarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarExActionPerformed
         if(estacerrado(Exc)){  
          Exc =new Eliminar();
          Desktop.add(Exc);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         Exc.setFrameIcon(ticon);
      Exc.setLocation(centradoXY(Exc));

          Exc.show();
          //fn.setVisible(true);
       }
             else{
         Exc.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnEliminarExActionPerformed

    private void ConsentimientoInformadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsentimientoInformadoActionPerformed
        if(estacerrado(coi)){  
          coi =new ConsentimientoInformado();
          Desktop.add(coi);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         coi.setFrameIcon(ticon);
      coi.setLocation(centradoXY(coi));

          coi.show();
          //fn.setVisible(true);
       }
             else{
         coi.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_ConsentimientoInformadoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Actualizar a = new Actualizar(null,true);
            a.setVisible(true);
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void mCertificacionConduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCertificacionConduccionActionPerformed
         if(estacerrado(b_cercon)){  
          b_cercon =new B_Certificacion_conduccion();
          Desktop.add(b_cercon);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         b_cercon.setFrameIcon(ticon);
      b_cercon.setLocation(centradoXY(b_cercon));

          b_cercon.show();
          //fn.setVisible(true);
       }
             else{
         b_cercon.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCertificacionConduccionActionPerformed

    private void mCertificacionTrabajoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCertificacionTrabajoAlturaActionPerformed
        if(estacerrado(b_ceral)){   
         b_ceral = new B_Certificacion_Trabajo_Altura();  
          Ocupacional.Desktop.add(b_ceral);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_ceral.setFrameIcon(ticon);
          b_ceral.setLocation(centradoXY(b_ceral));

           b_ceral.show();
         // ft.setVisible(true);
       }
             else{
           b_ceral.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCertificacionTrabajoAlturaActionPerformed

    private void mUsoRespiradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUsoRespiradoresActionPerformed
         if(estacerrado(b_uso)){   
         b_uso = new B_Uso_Respiradores();  
          Ocupacional.Desktop.add(b_uso);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_uso.setFrameIcon(ticon);
          b_uso.setLocation(centradoXY(b_uso));

           b_uso.show();
         // ft.setVisible(true);
       }
             else{
           b_uso.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mUsoRespiradoresActionPerformed

    private void mApneaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApneaActionPerformed
        if(estacerrado(b_sas)){   
         b_sas = new b_Ficha_Sas();  
          Ocupacional.Desktop.add(b_sas);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_sas.setFrameIcon(ticon);
          b_sas.setLocation(centradoXY(b_sas));

           b_sas.show();
         // ft.setVisible(true);
       }
             else{
           b_sas.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mApneaActionPerformed

    private void OITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OITActionPerformed
         if(estacerrado(b_oit)){   
         b_oit = new B_OIT();  
          Ocupacional.Desktop.add(b_oit);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_oit.setFrameIcon(ticon);
          b_oit.setLocation(centradoXY(b_oit));

           b_oit.show();
         // ft.setVisible(true);
       }
             else{
           b_oit.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_OITActionPerformed

    private void frmConalviasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmConalviasActionPerformed
       
               if(estacerrado(frm_conal)){   
         frm_conal = new Frm_conalvias();  
          Ocupacional.Desktop.add(frm_conal);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_conal.setFrameIcon(ticon);
          frm_conal.setLocation(centradoXY(frm_conal));

           frm_conal.show();
         // ft.setVisible(true);
       }
             else{
           frm_conal.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_frmConalviasActionPerformed

    private void mFichaRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaRetiroActionPerformed
        if(estacerrado(frm_constancia)){   
         frm_constancia = new ConstanciaCovid19();  
          Ocupacional.Desktop.add(frm_constancia);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_constancia.setFrameIcon(ticon);
          frm_constancia.setLocation(centradoXY(frm_constancia));

           frm_constancia.show();
         // ft.setVisible(true);
       }
             else{
           frm_constancia.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaRetiroActionPerformed

    private void mAptitudMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAptitudMedicoActionPerformed
        if(estacerrado(frm_aptitud)){   
         frm_aptitud = new Aptitud_Medico_Ocupacional();  
          Ocupacional.Desktop.add(frm_aptitud);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_aptitud.setFrameIcon(ticon);
          frm_aptitud.setLocation(centradoXY(frm_aptitud));

           frm_aptitud.show();
         // ft.setVisible(true);
       }
             else{
           frm_aptitud.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mAptitudMedicoActionPerformed

    private void btnFichaRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaRetiroActionPerformed
        if(estacerrado(frm_constancia)){   
         frm_constancia = new ConstanciaCovid19();  
          Ocupacional.Desktop.add(frm_constancia);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_constancia.setFrameIcon(ticon);
          frm_constancia.setLocation(centradoXY(frm_constancia));

           frm_constancia.show();
         // ft.setVisible(true);
       }
             else{
           frm_constancia.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnFichaRetiroActionPerformed

    private void btnFichaAptitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaAptitudActionPerformed
        if(estacerrado(frm_aptitud)){   
         frm_aptitud = new Aptitud_Medico_Ocupacional();  
          Ocupacional.Desktop.add(frm_aptitud);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_aptitud.setFrameIcon(ticon);
          frm_aptitud.setLocation(centradoXY(frm_aptitud));

           frm_aptitud.show();
         // ft.setVisible(true);
       }
             else{
           frm_aptitud.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnFichaAptitudActionPerformed

    private void ObservadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObservadosActionPerformed
        if(estacerrado(frm_agro)){   
         frm_agro = new FichaAgroindustriales();  
          Ocupacional.Desktop.add(frm_agro);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_agro.setFrameIcon(ticon);
          frm_agro.setLocation(centradoXY(frm_agro));

           frm_agro.show();
         // ft.setVisible(true);
       }
             else{
           frm_agro.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }

//        if(estacerrado(obs)){
//            obs = new Observados();
//            Ocupacional.Desktop.add(obs);
//            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
//            obs.setFrameIcon(ticon);
//            obs.setLocation(centradoXY(obs));
//
//            obs.show();
//             cmc.setVisible(true);
//        }
//        else{
//            obs.moveToFront();
//
//              JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
//        }
    }//GEN-LAST:event_ObservadosActionPerformed

    private void btnCuestionarioAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuestionarioAudioActionPerformed
         if(estacerrado(ca)){ 
             ca = new CuestionarioAudiometría();
          Ocupacional.Desktop.add(ca);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ca.setFrameIcon(ticon);
          ca.setLocation(centradoXY(ca));

           ca.show();
         // cmc.setVisible(true);
       }
             else{
           ca.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnCuestionarioAudioActionPerformed

    private void ExamenesAdicionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamenesAdicionalesActionPerformed
        if(estacerrado(exaadi)){
            exaadi = new ExamenesAdicionales();
            Ocupacional.Desktop.add(exaadi);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            exaadi.setFrameIcon(ticon);
            exaadi.setLocation(centradoXY(exaadi));

            exaadi.show();
            // cmc.setVisible(true);
        }
        else{
            exaadi.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_ExamenesAdicionalesActionPerformed

    private void mPsicosensometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPsicosensometriaActionPerformed
        if(estacerrado(psico)){
            psico = new Psicosensometrico();
            Ocupacional.Desktop.add(psico);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            psico.setFrameIcon(ticon);
            psico.setLocation(centradoXY(psico));

            psico.show();
            // cmc.setVisible(true);
        }
        else{
            psico.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mPsicosensometriaActionPerformed

    private void btnPsicologicaPoderosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsicologicaPoderosaActionPerformed
        if(estacerrado(ipp)){  
          ipp =new InformePsicologicoPoderosa();
          Desktop.add(ipp);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ipp.setFrameIcon(ticon);
      ipp.setLocation(centradoXY(ipp));

          ipp.show();
          //fn.setVisible(true);
       }
             else{
         ipp.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnPsicologicaPoderosaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnFichaPsicologica_Anexo03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaPsicologica_Anexo03ActionPerformed
        if(estacerrado(fpa)){  
          fpa =new FichaPsicologica_Anexo03();
          Desktop.add(fpa);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fpa.setFrameIcon(ticon);
      fpa.setLocation(centradoXY(fpa));

          fpa.show();
          //fn.setVisible(true);
       }
             else{
         fpa.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnFichaPsicologica_Anexo03ActionPerformed

    private void btnAddUsuariosEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUsuariosEmpresasActionPerformed
        SistemasUsuariosEmpresas sue= new SistemasUsuariosEmpresas();
              sue.setLocationRelativeTo(null);

            sue.setVisible(true);
    }//GEN-LAST:event_btnAddUsuariosEmpresasActionPerformed
@Override
     public Image getIconImage() {
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/med.png"));
    return retValue;
    }
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /*
       * Set% the Nimbus look and feel
       */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
       * If Nimbus (introduced in Java SE 6) is not available, stay with the
       * default look and feel. For details see
       * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(Ocupacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Ocupacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Ocupacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Ocupacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /*
       * Create and display the form
       */
      java.awt.EventQueue.invokeLater(new Runnable() {

         @Override
         public void run() {
          
           // JFrame.setDefaultLookAndFeelDecorated(true);
               //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeCoffeeSkin");
                 //new Sistema().setVisible(true);
                 Ocupacional main = new Ocupacional();
                main.setExtendedState(MAXIMIZED_BOTH);
                main.setVisible(true);

         }
      });
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CertificacionTrabajoAltura;
    private javax.swing.JMenuItem ConsentimientoDosaje;
    private javax.swing.JMenuItem ConsentimientoInformado;
    private javax.swing.JMenuItem CuestionarioNordico;
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem ExamenesAdicionales;
    private javax.swing.JMenuItem FichaSaS;
    private javax.swing.JMenu FrmVarios;
    private javax.swing.JMenuItem FuncionRespiratoria;
    private javax.swing.JPopupMenu HclMenu;
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JMenuBar MenuOcupacional;
    private javax.swing.JMenuItem OIT;
    private javax.swing.JMenuItem Observados;
    private javax.swing.JMenuItem RadiografiaTorax;
    private javax.swing.JToolBar barraPrincipal;
    private javax.swing.JButton btnAbioquimicos;
    private javax.swing.JMenuItem btnActualizar;
    private javax.swing.JMenuItem btnAddUsuarios;
    private javax.swing.JMenuItem btnAddUsuariosEmpresas;
    private javax.swing.JButton btnAnexo7D;
    private javax.swing.JButton btnApatologicos;
    private javax.swing.JButton btnAudiometria;
    private javax.swing.JMenuItem btnCambiarUsuario;
    private javax.swing.JMenuItem btnConfiguracion;
    private javax.swing.JButton btnCuestionarioAudio;
    private javax.swing.JButton btnElectrocardigrama;
    private javax.swing.JMenuItem btnEliminarEx;
    private javax.swing.JButton btnFichaAptitud;
    private javax.swing.JButton btnFichaMedica;
    private javax.swing.JMenuItem btnFichaPsicologica_Anexo03;
    private javax.swing.JButton btnFichaRetiro;
    private javax.swing.JButton btnFrayosX;
    private javax.swing.JMenuItem btnHC;
    private javax.swing.JMenuItem btnHCL;
    private javax.swing.JMenuItem btnHCLPS;
    private javax.swing.JButton btnHistoriaOcupacional;
    private javax.swing.JButton btnInformePsicologico;
    private javax.swing.JButton btnLclinico;
    private javax.swing.JButton btnOdontologia;
    private javax.swing.JButton btnOftalmologia;
    private javax.swing.JButton btnPelisa;
    private javax.swing.JButton btnPespera;
    private javax.swing.JMenuItem btnPsicologicaPoderosa;
    private javax.swing.JButton btnRadiografia;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JButton btnTestPsicologico;
    private javax.swing.JButton btnTriaje;
    private javax.swing.JMenu btnconfiguracionsistema;
    private javax.swing.JMenuItem btnconfigurarservicios;
    private javax.swing.JMenuItem frmConalvias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JCheckBox jbarra;
    private javax.swing.JLabel lblUsuarioCaja;
    private javax.swing.JMenuItem mApnea;
    private javax.swing.JMenuItem mAptitudMedico;
    private javax.swing.JMenu mBarrick;
    private javax.swing.JMenuItem mCertificacionConduccion;
    private javax.swing.JMenuItem mCertificacionTrabajoAltura;
    private javax.swing.JMenu mExamenesAdicionales;
    private javax.swing.JMenuItem mFichaRetiro;
    private javax.swing.JMenuItem mPsicosensometria;
    private javax.swing.JMenuItem mUsoRespiradores;
    // End of variables declaration//GEN-END:variables
    
    private boolean estacerrado(Object obj){
        JInternalFrame[] activos=Desktop.getAllFrames();
        boolean cerrado=true;
        int i=0;
        while (i<activos.length && cerrado){
            if(activos[i]==obj){
		cerrado=false;
            }
            i++;
        }
       
    return cerrado;
    }
    public Point centradoXY(JInternalFrame jif)
    {
        Point p = new Point(0,0);
        //se obtiene dimension del contenedor
        Dimension pantalla = Ocupacional.Desktop.getSize();
        //se obtiene dimension del JInternalFrame
        Dimension ventana = jif.getSize();
        //se calcula posición para el centrado
        p.x = (pantalla.width - ventana.width) / 2;
        p.y = (pantalla.height - ventana.height) / 2;
        return p;
    }
    
//    public void vExamenes(String Nro){
//      
//        vSql(lblTriaje, "triaje", Nro);
//        vSql(lblLabClinico, "lab_clinico", Nro);
//        vSql(lblElectrocardiograma, "informe_electrocardiograma", Nro);
//        vSql(lblRadiografiaTorax, "radiografia_torax", Nro);
//        vSql(lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro);
//        //modificacion
//        vSql(lblFichaAudiologica, "ficha_audiologica", Nro);  
//        vSql(lblAudiometria, "audiometria_po", Nro); 
//        //
//        vSql(lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro);
//        vSql(lblEspirometria, "funcion_abs", Nro);
//        vSql(lblOdontograma, "odontograma", Nro);
//        vSql(lblPsicologia, "informe_psicologico", Nro);
//        vSql(lblAnexo7D, "anexo7d", Nro);
//        vSql(lblHistorialOcupacional, "historia_oc_info", Nro);        
//        vSql(lblFichaAPatologicos, "antecedentes_patologicos", Nro);
//        vSql(lblCuestionarioNordico, "cuestionario_nordico", Nro);
//        vSql(lblCertificacionAltura, "certificacion_medica_altura", Nro);
//        vSql(lblSAS, "ficha_sas", Nro);
//        vSql(lblConsentimientoDosaje, "consentimiento_dosaje", Nro);
//        vSql(lblPerimetroToraxico, "perimetro_toracico", Nro);
//        vSql(lblOftalmologia, "oftalmologia", Nro); 
//        vSql(lblAnexo7C, "anexo7c", Nro);
//        //modificacion
//        vSql(lblCertTrabAltBarrick, "b_certificado_altura", Nro);
//        vSql(lblCertCondVehBarrick, "b_certificado_conduccion", Nro);
//        vSql(lblUsoRespirador, "b_uso_respiradores", Nro);
//        vSql(lblAcctitudMedOcupa, "certificado_aptitud_medico_ocupacional", Nro);
//        vSql(lblFichaOIT,"oit",Nro);
//    }
//    public boolean vSql(JLabel lbl ,String sTabla, String sOpcion)
//    {
//        String sStmt;
//        boolean bResult=false;
//        sStmt = " Select * from "+sTabla;
//        sStmt+= " Where n_orden='"+sOpcion+"'";        
//        oConn.FnBoolQueryExecute(sStmt);
//        try 
//        {
//            if (oConn.setResult.next()){        
//               bResult=true;
//            lbl.setIcon(oIconoSi);
//           
//            }else{
//            }
//            oConn.setResult.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Ocupacional.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//        return bResult;        
//    }
//    private void Limpiar2(){
//    
//    lblTriaje.setIcon(oNo);
//    lblLabClinico.setIcon(oNo);
//    lblElectrocardiograma.setIcon(oNo);
//    lblRadiografiaTorax.setIcon(oNo);
//    lblFichaAudiologica.setIcon(oNo);
//    lblAudiometria.setIcon(oNo);
//    lblEspirometria.setIcon(oNo);
//    lblOdontograma.setIcon(oNo);
//    lblPsicologia.setIcon(oNo);
//    lblAnexo7D.setIcon(oNo);
//    lblHistorialOcupacional.setIcon(oNo);
//    lblFichaAPatologicos.setIcon(oNo);
//    lblCuestionarioNordico.setIcon(oNo);
//    lblCertificacionAltura.setIcon(oNo);
//    lblConsentimientoDosaje.setIcon(oNo);
//    lblSAS.setIcon(oNo);
//    lblAnexo7C.setIcon(oNo);
//    lblExRxSanguineos.setIcon(oNo);
//    lblPerimetroToraxico.setIcon(oNo);
//    lblOftalmologia.setIcon(oNo);
//    //modificacion
//    lblCertTrabAltBarrick.setIcon(oNo);
//    lblCertCondVehBarrick.setIcon(oNo);
//    lblUsoRespirador.setIcon(oNo);
//    lblAcctitudMedOcupa.setIcon(oNo);
//    lblFichaOIT.setIcon(oNo);
//    txtNorden.setText(null);
//    txtNorden.requestFocus();
//  }
//    public void verifica(String orden){
//        if (!orden.isEmpty()) {
//            if (OrdenExiste(orden)) {
//                String Sql = "SELECT d.nombres_pa||' '||d.apellidos_pa AS nombres,n.nom_examen FROM "
//                        + "datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa)WHERE n.n_orden ='" + orden + "'";
//                oConn.FnBoolQueryExecute(Sql);
//                try {
//                    if (oConn.setResult.next()) {
//                        txtNorden.setText(orden);
//                        oConn.setResult.close();
//                    }
//                    oConn.setResult.close();
//                } catch (Exception e) {
//                }
//                vExamenes(orden);
//
//            } else {
//                oFunc.SubSistemaMensajeError("No existe Nro Orden");
//                Limpiar2();
//            }
//        }
//}
//public boolean OrdenExiste(String orden)
//    {
//        boolean bResultado=false;
//        String sQuery;
//        sQuery  = "Select n_orden from n_orden_ocupacional Where n_orden="+orden;
//        //Ejecuta el Query
//        oConn.FnBoolQueryExecute(sQuery);
//        // Capturo el Error
//        try { // Verifico que haya habido resultados
//            if (oConn.setResult.next())
//            {
//                // Resultado
//                bResultado = true;
//            }// Cierro los Resultados
//            oConn.setResult.close();
//        } catch (SQLException ex) {
//        }
//        return bResultado; 
//    }    
}

