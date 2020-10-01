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
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public final class FichaMedica extends javax.swing.JInternalFrame {

    public static frmObservaciones addObsv;
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPu = new clsOperacionesUsuarios();
    javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
    javax.swing.ImageIcon oIconoNo = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/xx.png"));
    javax.swing.ImageIcon oNo = null;
    boolean ordenVer=true;

    public FichaMedica() {
        initComponents();
        jtFichaMedica.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/id.png")));
        jtFichaMedica.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/invoice.png")));
        jtFichaMedica.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/botiquin.png")));
        //Fecha();

    }

    private void vExamenes(String Nro) {

        vSql(txtTriaje, lblTriaje, "triaje", Nro);
        vSql(txtLabClinico, lblLabClinico, "lab_clinico", Nro);
        vSql(txtElectrocardiograma, lblElectrocardiograma, "informe_electrocardiograma", Nro);
        vSql(txtRadiografiaTorax, lblRadiografiaTorax, "radiografia_torax", Nro);
        vSql(txtExRxSanguineos, lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro);
        vSql(txtFichaAudiologica, lblFichaAudiologica, "ficha_audiologica", Nro);
        vSql(txtEspirometria, lblEspirometria, "funcion_abs", Nro);
        vSql(txtOdontograma, lblOdontograma, "odontograma", Nro);
        vSql(txtPsicologia, lblPsicologia, "informe_psicologico", Nro);
        vSql(txtAnexo7D, lblAnexo7D, "anexo7d", Nro);
        vSql(txtHistoriaOcupacional, lblHistorialOcupacional, "historia_oc_info", Nro);
        vSql(txtAntPatologicos, lblFichaAPatologicos, "antecedentes_patologicos", Nro);
        vSql(txtCuestionarioNordico, lblCuestionarioNordico, "cuestionario_nordico", Nro);
        vSql(txtCerTrabajo, lblCertificacionAltura, "certificacion_medica_altura", Nro);
        vSql(txtDetencionSAS, lblSAS, "ficha_sas", Nro);
        vSql(txtConsentimientoDosaje, lblConsentimientoDosaje, "consentimiento_dosaje", Nro);
        vSql(txtPerimetroToraxico, lblPerimetroToraxico, "perimetro_toracico", Nro);
        vSql(txtOftalmologia, lblOftalmologia, "oftalmologia", Nro);

    }

    private boolean vSql(JTextField txt, JLabel lbl, String sTabla, String sOpcion) {
        String sStmt;
        boolean bResult = false;
        sStmt = " Select * from " + sTabla;
        sStmt += " Where n_orden='" + sOpcion + "'";
        oConn.FnBoolQueryExecute(sStmt);
        try {
            if (oConn.setResult.next()) {
                bResult = true;
                lbl.setIcon(oIconoSi);
                txt.setText("PASADO");
                txt.setForeground(new java.awt.Color(51, 153, 0));
                oConn.setResult.close();
            } else {
                lbl.setIcon(oIconoNo);
                oConn.setResult.close();
                txt.setText("POR PASAR");
                txt.setForeground(new java.awt.Color(204, 0, 0));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ocupacional.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bResult;
    }

    private void Limpiar2() {
        txtEOrden.setText(null);
        txtENombre.setText(null);
        txtEtipoExamen.setText(null);
        ///
        txtTriaje.setText(null);
        txtLabClinico.setText(null);
        txtElectrocardiograma.setText(null);
        txtRadiografiaTorax.setText(null);
        txtFichaAudiologica.setText(null);
        txtEspirometria.setText(null);
        txtOdontograma.setText(null);
        txtPsicologia.setText(null);
        txtAnexo7D.setText(null);
        txtHistoriaOcupacional.setText(null);
        txtAntPatologicos.setText(null);
        txtCuestionarioNordico.setText(null);
        txtCerTrabajo.setText(null);
        txtDetencionSAS.setText(null);
        txtConsentimientoDosaje.setText(null);
        lblSAS.setText(null);
        ///
        lblTriaje.setIcon(oNo);
        lblLabClinico.setIcon(oNo);
        lblElectrocardiograma.setIcon(oNo);
        lblRadiografiaTorax.setIcon(oNo);
        lblFichaAudiologica.setIcon(oNo);
        lblEspirometria.setIcon(oNo);
        lblOdontograma.setIcon(oNo);
        lblPsicologia.setIcon(oNo);
        lblAnexo7D.setIcon(oNo);
        lblHistorialOcupacional.setIcon(oNo);
        lblFichaAPatologicos.setIcon(oNo);
        lblCuestionarioNordico.setIcon(oNo);
        lblCertificacionAltura.setIcon(oNo);
        lblConsentimientoDosaje.setIcon(oNo);
        lblSAS.setIcon(oNo);
        //
        txtEOrden.setEditable(true);
        txtENombre.setEditable(true);
        txtEtipoExamen.setEditable(true);
        txtEOrden.requestFocus();
    }

    private boolean validar() {
        boolean bResultado = true;
        if (((JTextField) FechaFicha.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha ");
            bResultado = false;
        }
        if (tbReubicacion.isSelected(null)) {
            oFunc.SubSistemaMensajeError("Reubicacion?");
            jtFichaMedica.setSelectedIndex(0);
            bResultado = false;
        }
        if (((JTextField)FechaRx.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
      if(btEx.isSelected(null)){oFunc.SubSistemaMensajeError("Falta llenar "); bResultado = false;}
      if(btApto.isSelected(null)){bResultado = false;}

        return bResultado;
    }
    private boolean validar1(){
boolean bResultado=true;
      if (((JTextField)FechaRx.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
      if(btEx.isSelected(null)){oFunc.SubSistemaMensajeError("Falta llenar "); bResultado = false;}
      if(btApto.isSelected(null)){bResultado = false;}
  
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
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        chkRuido = new javax.swing.JCheckBox();
        chkPolvo = new javax.swing.JCheckBox();
        chkVidSegmentario = new javax.swing.JCheckBox();
        chkVidTotal = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        chkCancerigenos = new javax.swing.JCheckBox();
        chkMutagenicos = new javax.swing.JCheckBox();
        chkSolventes = new javax.swing.JCheckBox();
        chkMetales = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        chkTemperatura = new javax.swing.JCheckBox();
        chkBiologicos = new javax.swing.JCheckBox();
        chkPosturas = new javax.swing.JCheckBox();
        chkTurnos = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        chkCargas = new javax.swing.JCheckBox();
        chkMovRepet = new javax.swing.JCheckBox();
        chkPVD = new javax.swing.JCheckBox();
        chkOtros = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        txtPuestoPostula = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPuestoActual = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        tbRsi = new javax.swing.JRadioButton();
        rbRno = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        txtAntecedentesPersonales = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtHijosvivos = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtHijosMuertos = new javax.swing.JTextField();
        txtAntecedentesFamiliares = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        chkTNada = new javax.swing.JRadioButton();
        chkTPoco = new javax.swing.JRadioButton();
        chkTExcesivo = new javax.swing.JRadioButton();
        chkTHabitual = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        chkANada = new javax.swing.JRadioButton();
        chkAPoco = new javax.swing.JRadioButton();
        chkAHabitual = new javax.swing.JRadioButton();
        chkAExcesivo = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        chkDNada = new javax.swing.JRadioButton();
        chkDPoco = new javax.swing.JRadioButton();
        chkDHabitual = new javax.swing.JRadioButton();
        chkDExcesivo = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtExplotacionEn = new javax.swing.JTextField();
        txtAlturaLabor = new javax.swing.JTextField();
        txtGradoInstruccion = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtTipoExamen = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        chkTetano = new javax.swing.JCheckBox();
        chkHepatitisB = new javax.swing.JCheckBox();
        chkFiebreAmarilla = new javax.swing.JCheckBox();
        btnActualizar = new javax.swing.JButton();
        btnEditarFM = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jLabel136 = new javax.swing.JLabel();
        txtGFSPrevio = new javax.swing.JTextField();
        txtGrupoFacLab = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        txtFVC = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        txtFEV1 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        txtFEV1FVC = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        txtFEF2575 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConclusion = new javax.swing.JTextArea();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        chkNormal = new javax.swing.JCheckBox();
        chkPatrobs = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtcabeza = new javax.swing.JTextField();
        txtB_A_F_L = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtCintura = new javax.swing.JTextField();
        txtCadera = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txticc = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtMalEstado = new javax.swing.JTextField();
        txtFaltan = new javax.swing.JTextField();
        txtObservOdonto = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtCercaSinCorregirOD = new javax.swing.JTextField();
        txtCercaSinCorregirOI = new javax.swing.JTextField();
        txtLejosSinCorregirOI = new javax.swing.JTextField();
        txtLejosSinCorregirOD = new javax.swing.JTextField();
        txtCercaCorregidaOI = new javax.swing.JTextField();
        txtCercaCorregidaOD = new javax.swing.JTextField();
        txtLejosCorregidaOD = new javax.swing.JTextField();
        txtLejosCorregidaOI = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtVisionColores = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtEnfermedadesOculares = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtReflejosPupilares = new javax.swing.JTextField();
        txtNariz = new javax.swing.JTextField();
        txtCuello = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
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
        jLabel86 = new javax.swing.JLabel();
        txtOD = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txtOI = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel89 = new javax.swing.JLabel();
        txtTorax = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        txtCorazon = new javax.swing.JTextField();
        txtFcardiaca = new javax.swing.JTextField();
        txtFrespiratoria = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        txtSatO2 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel19 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        txtSistolica = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        txtDiastolica = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel101 = new javax.swing.JLabel();
        rbNormal = new javax.swing.JRadioButton();
        rbAnormal = new javax.swing.JRadioButton();
        txtPulmones = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        txtMiembrosSuperiores = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        txtMiembrosInferiores = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        txtReflejosOsteotendinosos = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        txtMarcha = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel122 = new javax.swing.JLabel();
        txtBinocular = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        txtEnfermedadesOculares1 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        txtcolumnaVertebral = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        txtAbdomen = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel20 = new javax.swing.JPanel();
        rbTNoHizo = new javax.swing.JRadioButton();
        rbTNormal = new javax.swing.JRadioButton();
        rbTAnormal = new javax.swing.JRadioButton();
        chkDescribirObservacion = new javax.swing.JCheckBox();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel108 = new javax.swing.JLabel();
        txtAnillosInguinales = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        txtHernias = new javax.swing.JTextField();
        txtVarices = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        txtGanglios = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        txtOrganosGenitales = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txtLenguage = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jPanel22 = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        txtNorden1 = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
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
        jLabel186 = new javax.swing.JLabel();
        chkPositivo = new javax.swing.JCheckBox();
        chkNegativo = new javax.swing.JCheckBox();
        jLabel187 = new javax.swing.JLabel();
        txtSinNeumoconiosis = new javax.swing.JTextField();
        jLabel188 = new javax.swing.JLabel();
        txtImagenRxExPolvo = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        txtConNeumoconiosis = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        txtTriaje = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        txtLabClinico = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        txtElectrocardiograma = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        txtRadiografiaTorax = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        txtFichaAudiologica = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        txtEspirometria = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        txtOdontograma = new javax.swing.JTextField();
        txtPsicologia = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        txtAnexo7D = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        txtHistoriaOcupacional = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        txtCerTrabajo = new javax.swing.JTextField();
        txtCuestionarioNordico = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        txtDetencionSAS = new javax.swing.JTextField();
        txtConsentimientoDosaje = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        txtAntPatologicos = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        txtEOrden = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        txtENombre = new javax.swing.JTextField();
        jLabel156 = new javax.swing.JLabel();
        txtEtipoExamen = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        lblConsentimientoDosaje = new javax.swing.JLabel();
        lblSAS = new javax.swing.JLabel();
        lblCertificacionAltura = new javax.swing.JLabel();
        lblCuestionarioNordico = new javax.swing.JLabel();
        lblFichaAPatologicos = new javax.swing.JLabel();
        lblRadiografiaTorax = new javax.swing.JLabel();
        lblElectrocardiograma = new javax.swing.JLabel();
        lblLabClinico = new javax.swing.JLabel();
        lblTriaje = new javax.swing.JLabel();
        lblFichaAudiologica = new javax.swing.JLabel();
        lblAnexo7D = new javax.swing.JLabel();
        lblPsicologia = new javax.swing.JLabel();
        lblOdontograma = new javax.swing.JLabel();
        lblEspirometria = new javax.swing.JLabel();
        lblHistorialOcupacional = new javax.swing.JLabel();
        btnVLimpiar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnAnexo7C1 = new javax.swing.JButton();
        btnAnexo7C2 = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel139 = new javax.swing.JLabel();
        txtExRxSanguineos = new javax.swing.JTextField();
        lblExRxSanguineos = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        txtPerimetroToraxico = new javax.swing.JTextField();
        lblPerimetroToraxico = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        txtOftalmologia = new javax.swing.JTextField();
        lblOftalmologia = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        rbO = new javax.swing.JRadioButton();
        rbA = new javax.swing.JRadioButton();
        rbB = new javax.swing.JRadioButton();
        rbAB = new javax.swing.JRadioButton();
        jSeparator27 = new javax.swing.JSeparator();
        rbRhPositivo = new javax.swing.JRadioButton();
        rbRhNegativo = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel190 = new javax.swing.JLabel();
        txtHemoHema = new javax.swing.JTextField();
        jLabel191 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtOtrosEx = new javax.swing.JTextArea();
        jPanel26 = new javax.swing.JPanel();
        rbSI = new javax.swing.JRadioButton();
        rbNO = new javax.swing.JRadioButton();
        rbReevaluacion = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel192 = new javax.swing.JLabel();
        txtVSG = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        txtCreatininaBio = new javax.swing.JTextField();
        txtGlucosaBio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCoca = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        txtMarig = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        txtNitritosEQ = new javax.swing.JTextField();
        txtProteinasEQ = new javax.swing.JTextField();
        txtUrobilinogenoEQ = new javax.swing.JTextField();
        txtBilirubinaEQ = new javax.swing.JTextField();
        jLabel206 = new javax.swing.JLabel();
        txtCetonasEQ = new javax.swing.JTextField();
        jLabel207 = new javax.swing.JLabel();
        txtLeucocitosEQ = new javax.swing.JTextField();
        txtGlucosaEQ = new javax.swing.JTextField();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        txtSangreEQ = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        txtLeucocitosSU = new javax.swing.JTextField();
        txtCelEpitelialesSU = new javax.swing.JTextField();
        txtHematiesSU = new javax.swing.JTextField();
        txtCristalesSU = new javax.swing.JTextField();
        jLabel214 = new javax.swing.JLabel();
        txtCilindiosSU = new javax.swing.JTextField();
        jLabel215 = new javax.swing.JLabel();
        txtBacteriasSU = new javax.swing.JTextField();
        jLabel216 = new javax.swing.JLabel();
        txtPusSU = new javax.swing.JTextField();
        jLabel217 = new javax.swing.JLabel();
        txtOtrosSu = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        txtColorEF = new javax.swing.JTextField();
        txtDensidadEF = new javax.swing.JTextField();
        txtAspectoEF = new javax.swing.JTextField();
        txtPhEF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacionesFichaMedica = new javax.swing.JTextArea();
        jLabel123 = new javax.swing.JLabel();
        btnObsv = new javax.swing.JToggleButton();
        jLabel127 = new javax.swing.JLabel();
        txtColesterol = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        txtLDLColesterol = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txtHDLColesterol = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        txtVLDLColesterol = new javax.swing.JTextField();
        txtTrigliseridos = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObservacionAudio = new javax.swing.JTextArea();

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

        jLabel20.setText("Agentes presentes en Trabajo Actual :");

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        chkRuido.setBackground(new java.awt.Color(153, 204, 255));
        chkRuido.setSelected(true);
        chkRuido.setText("Ruido :  ");
        chkRuido.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkPolvo.setBackground(new java.awt.Color(153, 204, 255));
        chkPolvo.setSelected(true);
        chkPolvo.setText("Polvo :   ");
        chkPolvo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkVidSegmentario.setBackground(new java.awt.Color(153, 204, 255));
        chkVidSegmentario.setSelected(true);
        chkVidSegmentario.setText("Vid Segmentario :   ");
        chkVidSegmentario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkVidTotal.setBackground(new java.awt.Color(153, 204, 255));
        chkVidTotal.setSelected(true);
        chkVidTotal.setText("Vid Total :   ");
        chkVidTotal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkRuido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkPolvo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkVidSegmentario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkVidTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkRuido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPolvo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkVidSegmentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkVidTotal))
        );

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        chkCancerigenos.setBackground(new java.awt.Color(153, 204, 255));
        chkCancerigenos.setText("Cancerígenos :  ");
        chkCancerigenos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkMutagenicos.setBackground(new java.awt.Color(153, 204, 255));
        chkMutagenicos.setText("Mutagenicos :   ");
        chkMutagenicos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkSolventes.setBackground(new java.awt.Color(153, 204, 255));
        chkSolventes.setText("Solventes :");
        chkSolventes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkMetales.setBackground(new java.awt.Color(153, 204, 255));
        chkMetales.setText("Metales :");
        chkMetales.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCancerigenos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkMutagenicos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkSolventes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkMetales, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkCancerigenos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkMutagenicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSolventes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkMetales))
        );

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        chkTemperatura.setBackground(new java.awt.Color(153, 204, 255));
        chkTemperatura.setSelected(true);
        chkTemperatura.setText("Temperatura : ");
        chkTemperatura.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkBiologicos.setBackground(new java.awt.Color(153, 204, 255));
        chkBiologicos.setText("Biológicos :");
        chkBiologicos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkPosturas.setBackground(new java.awt.Color(153, 204, 255));
        chkPosturas.setSelected(true);
        chkPosturas.setText("Posturas :");
        chkPosturas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkTurnos.setBackground(new java.awt.Color(153, 204, 255));
        chkTurnos.setText("Turnos :");
        chkTurnos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTemperatura, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkBiologicos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkPosturas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkTurnos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkTemperatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkBiologicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPosturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkTurnos))
        );

        jPanel10.setBackground(new java.awt.Color(153, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        chkCargas.setBackground(new java.awt.Color(153, 204, 255));
        chkCargas.setSelected(true);
        chkCargas.setText("Cargas : ");
        chkCargas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkMovRepet.setBackground(new java.awt.Color(153, 204, 255));
        chkMovRepet.setSelected(true);
        chkMovRepet.setText("Mov. Repet :");
        chkMovRepet.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkPVD.setBackground(new java.awt.Color(153, 204, 255));
        chkPVD.setText("PVD :");
        chkPVD.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkOtros.setBackground(new java.awt.Color(153, 204, 255));
        chkOtros.setText("Otros :");
        chkOtros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCargas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkMovRepet, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkPVD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkOtros, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkCargas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkMovRepet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPVD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkOtros))
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

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel24.setText("Reubicación");

        tbRsi.setBackground(new java.awt.Color(153, 204, 255));
        tbReubicacion.add(tbRsi);
        tbRsi.setText("SI");

        rbRno.setBackground(new java.awt.Color(153, 204, 255));
        tbReubicacion.add(rbRno);
        rbRno.setSelected(true);
        rbRno.setText("NO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tbRsi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(rbRno)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbRsi)
                    .addComponent(rbRno))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jLabel25.setText("Antecedentes Personales y/o Ocupacionales (enfermedad y/o accidente)");

        txtAntecedentesPersonales.setText("NIEGA DB, TBC, HTA, CONVULSIONES, ASMA, ALERGIAS, ACCIDENTES");
        txtAntecedentesPersonales.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAntecedentesPersonalesFocusGained(evt);
            }
        });

        jLabel26.setText("Antecedentes Familiares:");

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel29.setText("Numero de Hijos");

        jLabel30.setText("Vivos :");

        jLabel31.setText("Muertos:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHijosMuertos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHijosvivos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(10, 10, 10))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHijosvivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHijosMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAntecedentesFamiliares.setText("NO CONTRIBUTORIOS");
        txtAntecedentesFamiliares.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAntecedentesFamiliaresFocusGained(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Inmunizaciones :");

        jPanel13.setBackground(new java.awt.Color(153, 204, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hábitos"));

        jLabel33.setText("Nada :");

        jLabel34.setText("Poco :");

        jLabel35.setText("Habitual :");

        jLabel36.setText("Excesivo :");

        jLabel37.setText("Tabaco");

        chkTNada.setBackground(new java.awt.Color(153, 204, 255));
        btTabaco.add(chkTNada);
        chkTNada.setSelected(true);

        chkTPoco.setBackground(new java.awt.Color(153, 204, 255));
        btTabaco.add(chkTPoco);

        chkTExcesivo.setBackground(new java.awt.Color(153, 204, 255));
        btTabaco.add(chkTExcesivo);

        chkTHabitual.setBackground(new java.awt.Color(153, 204, 255));
        btTabaco.add(chkTHabitual);

        jLabel38.setText("Alcohol");

        chkANada.setBackground(new java.awt.Color(153, 204, 255));
        btAlcohol.add(chkANada);
        chkANada.setSelected(true);

        chkAPoco.setBackground(new java.awt.Color(153, 204, 255));
        btAlcohol.add(chkAPoco);

        chkAHabitual.setBackground(new java.awt.Color(153, 204, 255));
        btAlcohol.add(chkAHabitual);

        chkAExcesivo.setBackground(new java.awt.Color(153, 204, 255));
        btAlcohol.add(chkAExcesivo);

        jLabel39.setText("Drogas");

        chkDNada.setBackground(new java.awt.Color(153, 204, 255));
        btDrogas.add(chkDNada);
        chkDNada.setSelected(true);

        chkDPoco.setBackground(new java.awt.Color(153, 204, 255));
        btDrogas.add(chkDPoco);

        chkDHabitual.setBackground(new java.awt.Color(153, 204, 255));
        btDrogas.add(chkDHabitual);

        chkDExcesivo.setBackground(new java.awt.Color(153, 204, 255));
        btDrogas.add(chkDExcesivo);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel37)
                    .addComponent(chkTNada)
                    .addComponent(chkTPoco)
                    .addComponent(chkTHabitual)
                    .addComponent(chkTExcesivo))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkANada)
                    .addComponent(chkAPoco)
                    .addComponent(chkAHabitual)
                    .addComponent(chkAExcesivo)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkDNada)
                    .addComponent(chkDPoco)
                    .addComponent(chkDHabitual)
                    .addComponent(chkDExcesivo)
                    .addComponent(jLabel39))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkTNada)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkTPoco)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkTHabitual)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkTExcesivo)
                    .addComponent(jLabel36)))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkANada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAPoco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAHabitual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAExcesivo))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDNada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDPoco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDHabitual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDExcesivo))
        );

        jLabel40.setText("Talla :");

        jLabel41.setText("Peso :");

        jLabel42.setText("IMC :");

        txtIMC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtIMC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel43.setText("m.");

        jLabel44.setText("Kg.");

        jLabel27.setText("Area :");

        txtArea.setEditable(false);

        txtExplotacionEn.setEditable(false);

        txtAlturaLabor.setEditable(false);

        txtGradoInstruccion.setEditable(false);

        txtSexo.setEditable(false);

        txtTipoExamen.setEditable(false);

        txtEstadoCivil.setEditable(false);

        jLabel28.setText("Mineral Exp :");

        chkTetano.setBackground(new java.awt.Color(255, 51, 0));
        chkTetano.setText("Tetano");

        chkHepatitisB.setBackground(new java.awt.Color(255, 51, 0));
        chkHepatitisB.setText("Hepatitis - B");

        chkFiebreAmarilla.setBackground(new java.awt.Color(255, 51, 0));
        chkFiebreAmarilla.setText("Fiebre Amarilla");

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnActualizar.setPreferredSize(new java.awt.Dimension(41, 25));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGradoInstruccion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAlturaLabor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 3, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMineralesExplotados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtExplotacionEn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel136)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtGFSPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel140)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGrupoFacLab, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTiempo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPuestoActual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtPuestoPostula, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel27)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAntecedentesPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel32))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAntecedentesFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(chkTetano)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chkHepatitisB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(chkFiebreAmarilla)))
                                    .addGap(24, 24, 24))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel43)
                                                .addComponent(jLabel44)))
                                        .addComponent(txtIMC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(122, 122, 122))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
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
                .addComponent(FechaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtPuestoPostula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtPuestoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel43))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel44))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAntecedentesPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(txtAntecedentesFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(chkTetano)
                                    .addComponent(chkHepatitisB)
                                    .addComponent(chkFiebreAmarilla))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(26, 26, 26)
                        .addComponent(jLabel136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGFSPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrupoFacLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel140))))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jtFichaMedica.addTab("Datos Personales", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Función Respiratoria Abs"));

        jLabel114.setText("FVC:");

        txtFVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFVCActionPerformed(evt);
            }
        });

        jLabel115.setText("FEV1:");

        jLabel116.setText("FEV1/FVC:");

        jLabel117.setText("FEF 25-75%:");

        txtConclusion.setColumns(5);
        txtConclusion.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConclusion.setLineWrap(true);
        txtConclusion.setRows(3);
        txtConclusion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Conclusión"));
        jScrollPane1.setViewportView(txtConclusion);

        jLabel118.setText("% l.");

        jLabel119.setText("% l.");

        jLabel120.setText("%.");

        jLabel121.setText("l/s.");

        chkNormal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkNormal.setText("NORMAL");
        chkNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNormalActionPerformed(evt);
            }
        });

        chkPatrobs.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkPatrobs.setText("P. OBSTRUCTIVO LEVE");
        chkPatrobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPatrobsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFEV1FVC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFEF2575, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFVC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFEV1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel121)
                            .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel120)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(chkNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkPatrobs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(jScrollPane1)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkPatrobs, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel118)
                        .addComponent(jLabel114)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFEV1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel115)
                            .addComponent(jLabel119))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel120)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel116)
                                    .addComponent(txtFEV1FVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel117))
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFEF2575, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel121))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        jLabel45.setText("Cabeza :");

        jLabel46.setText("Nariz :");

        jLabel47.setText("Boca, Amigdalas, Faringe, Laringe :");

        txtcabeza.setBackground(new java.awt.Color(153, 204, 255));
        txtcabeza.setText("NORMAL");
        txtcabeza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcabezaFocusGained(evt);
            }
        });

        txtB_A_F_L.setBackground(new java.awt.Color(153, 204, 255));
        txtB_A_F_L.setText("HUMECTADA, NO HIPERTROFICAS, NO CONGESTIVAS");
        txtB_A_F_L.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtB_A_F_LFocusGained(evt);
            }
        });

        jLabel48.setText("Cuello :");

        jLabel49.setText("Temp. :");

        jLabel50.setText("°C");

        jLabel51.setText("Cintura :");

        jLabel52.setText("Cadera :");

        jLabel53.setText("ICC :");

        jLabel54.setText("Perimetro :");

        txtPerimetro.setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dentadura"));
        jPanel1.setPreferredSize(new java.awt.Dimension(222, 70));

        jLabel55.setText("Piezas en mal estado :");

        jLabel56.setText("Piezas que faltan :");

        txtMalEstado.setPreferredSize(new java.awt.Dimension(6, 18));

        txtFaltan.setPreferredSize(new java.awt.Dimension(6, 18));

        txtObservOdonto.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtObservOdonto.setPreferredSize(new java.awt.Dimension(6, 18));

        jLabel198.setText("Observaciones :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMalEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(txtFaltan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel198)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObservOdonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtMalEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(txtFaltan, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservOdonto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel198))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ojos"));

        jLabel57.setText("Vision de Cerca");

        jLabel58.setText("Vision de Lejos");

        jLabel59.setText("Vision de Colores");

        jLabel60.setText("Sin Corregir");

        jLabel61.setText("Corregida");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 153, 255));
        jLabel62.setText("O.D");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 153, 255));
        jLabel63.setText("OI");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 153, 255));
        jLabel64.setText("OI");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 153, 255));
        jLabel65.setText("O.D");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtCercaSinCorregirOD.setEditable(false);

        txtCercaSinCorregirOI.setEditable(false);

        txtLejosSinCorregirOI.setEditable(false);

        txtLejosSinCorregirOD.setEditable(false);

        txtCercaCorregidaOI.setEditable(false);

        txtCercaCorregidaOD.setEditable(false);

        txtLejosCorregidaOD.setEditable(false);

        txtLejosCorregidaOI.setEditable(false);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtVisionColores.setBackground(new java.awt.Color(153, 204, 255));
        txtVisionColores.setText("NORMAL");
        txtVisionColores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVisionColoresFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel58))
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtCercaSinCorregirOD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtCercaSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(txtLejosSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtLejosSinCorregirOD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel60)))
                                .addGap(13, 13, 13)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel61))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCercaCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLejosCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCercaCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLejosCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addGap(22, 22, 22)
                                .addComponent(txtVisionColores, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel65))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel64))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel62)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel57)
                            .addComponent(txtCercaSinCorregirOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCercaSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCercaCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCercaCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel58)
                            .addComponent(txtLejosSinCorregirOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLejosSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLejosCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLejosCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel63))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel59))
                    .addComponent(txtVisionColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jLabel66.setText("Enferm.Oculares:");

        txtEnfermedadesOculares.setBackground(new java.awt.Color(153, 204, 255));
        txtEnfermedadesOculares.setText("NINGUNA");
        txtEnfermedadesOculares.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnfermedadesOcularesFocusGained(evt);
            }
        });

        jLabel67.setText("Reflejos Pupilares :");

        txtReflejosPupilares.setBackground(new java.awt.Color(153, 204, 255));
        txtReflejosPupilares.setText("CONSERVADOS");
        txtReflejosPupilares.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtReflejosPupilaresFocusGained(evt);
            }
        });

        txtNariz.setBackground(new java.awt.Color(153, 204, 255));
        txtNariz.setText("CENTRAL, PERMEABLE");
        txtNariz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNarizFocusGained(evt);
            }
        });

        txtCuello.setBackground(new java.awt.Color(153, 204, 255));
        txtCuello.setText("CENTRAL, MOVIL");
        txtCuello.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCuelloFocusGained(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

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

        txtOI1000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI1000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI1000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI1000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOI2000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI2000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI2000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI2000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOI3000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI3000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI3000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI3000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOI4000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI4000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI4000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI4000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOI6000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI6000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI6000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI6000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOI8000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI8000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI8000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI8000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        txtOD1000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD1000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD1000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD1000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOD2000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD2000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD2000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD2000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOD3000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD3000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD3000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD3000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOD4000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD4000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD4000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD4000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOD6000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD6000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD6000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD6000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOD8000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD8000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD8000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD8000.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        jLabel86.setText("Otoscopia :");

        txtOD.setBackground(new java.awt.Color(153, 204, 255));
        txtOD.setText("NORMAL");
        txtOD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtODFocusGained(evt);
            }
        });

        jLabel87.setText("O.D :");

        jLabel88.setText("O.I :");

        txtOI.setBackground(new java.awt.Color(153, 204, 255));
        txtOI.setText("NORMAL");
        txtOI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOIFocusGained(evt);
            }
        });

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel89.setText("Tórax :");

        txtTorax.setBackground(new java.awt.Color(153, 204, 255));
        txtTorax.setText("BPMV EN ACP, NO RALES.");
        txtTorax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtToraxFocusGained(evt);
            }
        });

        jLabel90.setText("Corazón :");

        txtCorazon.setBackground(new java.awt.Color(153, 204, 255));
        txtCorazon.setText("RCRR, NO SOPLOS.");
        txtCorazon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorazonFocusGained(evt);
            }
        });

        jLabel91.setText("F. Respiratoria :");

        jLabel92.setText("F. Cardiaca :");

        jLabel93.setText("Sat. O2 : ");

        jLabel94.setText("min.");

        jLabel95.setText("min.");

        jLabel96.setText("%");

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Preción Arterial Sistémica"));

        jLabel97.setText("Sistólica :");

        jLabel98.setText("min.");

        jLabel99.setText("Diastólica :");

        jLabel100.setText("min.");

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel98)
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel100)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98)
                    .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator10)
        );

        jLabel101.setText("Pulmones :");

        rbNormal.setBackground(new java.awt.Color(153, 204, 255));
        tbPulmones.add(rbNormal);
        rbNormal.setSelected(true);
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

        jLabel102.setText("Miembros Superiores :");

        txtMiembrosSuperiores.setBackground(new java.awt.Color(153, 204, 255));
        txtMiembrosSuperiores.setText("SIMETRICOS, NO DEFORMIDADES, MOTRICIDAD CONSERVADA.");
        txtMiembrosSuperiores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMiembrosSuperioresFocusGained(evt);
            }
        });

        jLabel103.setText("Miembros Inferiores :");

        txtMiembrosInferiores.setBackground(new java.awt.Color(153, 204, 255));
        txtMiembrosInferiores.setText("SIMETRICOS, NO DEFORMIDADES, MOTRICIDAD CONSERVADA.");
        txtMiembrosInferiores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMiembrosInferioresFocusGained(evt);
            }
        });

        jLabel104.setText("Reflejos Osteotendinosos :");

        txtReflejosOsteotendinosos.setBackground(new java.awt.Color(153, 204, 255));
        txtReflejosOsteotendinosos.setText("CONSERVADOS");
        txtReflejosOsteotendinosos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtReflejosOsteotendinososFocusGained(evt);
            }
        });

        jLabel105.setText("Marcha :");

        txtMarcha.setBackground(new java.awt.Color(153, 204, 255));
        txtMarcha.setText("NORMAL");
        txtMarcha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMarchaFocusGained(evt);
            }
        });

        jLabel122.setText("Visión Binocular :");

        txtBinocular.setBackground(new java.awt.Color(153, 204, 255));

        jLabel142.setText("Enfermedad.otros:");

        txtEnfermedadesOculares1.setBackground(new java.awt.Color(153, 204, 255));
        txtEnfermedadesOculares1.setText("NINGUNA");
        txtEnfermedadesOculares1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnfermedadesOculares1FocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel67)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel122)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(txtBinocular, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtReflejosPupilares, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel45)
                                            .addGap(4, 4, 4)
                                            .addComponent(txtcabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(jLabel46))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(jLabel48)
                                            .addGap(4, 4, 4)
                                            .addComponent(txtCuello, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel54)))
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNariz, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtB_A_F_L, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEnfermedadesOculares, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txticc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCadera, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel50))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel142)
                        .addGap(4, 4, 4)
                        .addComponent(txtEnfermedadesOculares1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel101)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNormal)
                                .addGap(18, 18, 18)
                                .addComponent(rbAnormal))
                            .addComponent(txtPulmones, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel86))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel88)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtOI, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel87)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtOD, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel89)
                            .addComponent(jLabel90))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTorax)
                            .addComponent(txtCorazon, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMiembrosSuperiores, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMiembrosInferiores, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtReflejosOsteotendinosos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMarcha, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFrespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel94)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFcardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSatO2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel96)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel87))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel88)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTorax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel89))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCorazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel90)))))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFcardiaca)
                                .addComponent(jLabel92)
                                .addComponent(jLabel95))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSatO2)
                                .addComponent(jLabel96)
                                .addComponent(jLabel93))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel91)
                                .addComponent(jLabel94)
                                .addComponent(txtFrespiratoria))
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel101)
                            .addComponent(rbNormal)
                            .addComponent(rbAnormal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPulmones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMiembrosSuperiores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMiembrosInferiores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtReflejosOsteotendinosos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMarcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel105))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel50))
                                        .addGap(6, 6, 6)
                                        .addComponent(txtCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtCadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(txticc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel49)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel51)
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel52)
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel53))))
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNariz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46))))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuello, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel54))))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel47)
                        .addGap(6, 6, 6)
                        .addComponent(txtB_A_F_L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(txtEnfermedadesOculares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel142))
                            .addComponent(txtEnfermedadesOculares1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReflejosPupilares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBinocular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel122)))))
                .addGap(2, 2, 2))
        );

        jPanel16.getAccessibleContext().setAccessibleName("");

        jtFichaMedica.addTab("Exámenes", jPanel3);

        jLabel106.setText("Columna Vertebral :");

        txtcolumnaVertebral.setText("CENTRAL, MOVIL, CURVATURAS CONSERVADAS");
        txtcolumnaVertebral.setPreferredSize(new java.awt.Dimension(81, 20));
        txtcolumnaVertebral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcolumnaVertebralFocusGained(evt);
            }
        });

        jLabel107.setText("Abdomen :");

        txtAbdomen.setText("RHA(+), B/D, NO DOLOROSO A LA PALPACION");
        txtAbdomen.setPreferredSize(new java.awt.Dimension(81, 20));
        txtAbdomen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAbdomenFocusGained(evt);
            }
        });

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Tacto Rectal"));

        btTacto.add(rbTNoHizo);
        rbTNoHizo.setText("No se hizo");
        rbTNoHizo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btTacto.add(rbTNormal);
        rbTNormal.setText("Normal");
        rbTNormal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btTacto.add(rbTAnormal);
        rbTAnormal.setText("Anormal");
        rbTAnormal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkDescribirObservacion.setText("Describir en Observación :");
        chkDescribirObservacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(rbTNoHizo)
                .addGap(18, 18, 18)
                .addComponent(rbTNormal)
                .addGap(18, 18, 18)
                .addComponent(rbTAnormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDescribirObservacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbTNoHizo)
                        .addComponent(rbTNormal)
                        .addComponent(rbTAnormal)
                        .addComponent(chkDescribirObservacion))
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel108.setText("Anillos Inguinales :");

        txtAnillosInguinales.setText("CONSERVADOS");
        txtAnillosInguinales.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnillosInguinalesFocusGained(evt);
            }
        });

        jLabel109.setText("Hernias :");

        txtHernias.setText("NO");
        txtHernias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHerniasFocusGained(evt);
            }
        });

        txtVarices.setText("NO");
        txtVarices.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVaricesFocusGained(evt);
            }
        });

        jLabel110.setText("Várices :");

        jLabel111.setText("Ganglios  :");

        txtGanglios.setText("NO LINFADENOPATIAS");
        txtGanglios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGangliosFocusGained(evt);
            }
        });

        jLabel112.setText("Órganos Genitales :");

        txtOrganosGenitales.setText("DE CARACTER NORMAL");
        txtOrganosGenitales.setPreferredSize(new java.awt.Dimension(81, 20));
        txtOrganosGenitales.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOrganosGenitalesFocusGained(evt);
            }
        });

        jLabel113.setText("Lenguage, Atención, Memoria , Orientación, Inteligencia Afectividad :");

        txtLenguage.setText("NORMAL");
        txtLenguage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLenguageFocusGained(evt);
            }
        });

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel148.setText("N° Orden :");

        jLabel149.setText("DNI :");

        jLabel157.setText("Nombres :");

        txtNorden1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNorden1ActionPerformed(evt);
            }
        });
        txtNorden1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNorden1KeyTyped(evt);
            }
        });

        txtDNI.setEditable(false);

        txtNombres.setEditable(false);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel148)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNorden1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel149)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel157)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel157)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel149)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel148)
                        .addComponent(txtNorden1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        rb0.setSelected(true);

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
                            .addComponent(jLabel182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel162)
                    .addComponent(txtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel163)
                    .addComponent(txtHilios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel164)
                    .addComponent(txtSenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel165)
                    .addComponent(txtMediastinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel166)
                    .addComponent(txtConclusionesRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel167)
                    .addComponent(txtSiluetaCardioVascular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jSeparator26))
                .addContainerGap())
        );

        jLabel186.setText("Reacciones Serológicas Lues - aLues :");

        btNegativoPositivo.add(chkPositivo);
        chkPositivo.setText("Positivo");
        chkPositivo.setEnabled(false);
        chkPositivo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPositivoStateChanged(evt);
            }
        });
        chkPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPositivoActionPerformed(evt);
            }
        });

        btNegativoPositivo.add(chkNegativo);
        chkNegativo.setText("Negativo");
        chkNegativo.setEnabled(false);
        chkNegativo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkNegativoStateChanged(evt);
            }
        });
        chkNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNegativoActionPerformed(evt);
            }
        });

        jLabel187.setText("Sin neumoconiosis :");

        jLabel188.setText("Imagen Radiográfica de Exposición a Polvo :");

        jLabel189.setText("Con Neumoconiosis :");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator15)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel112)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel108))
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel106)
                                .addComponent(jLabel107)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAnillosInguinales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                .addComponent(txtAbdomen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcolumnaVertebral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtOrganosGenitales, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel113)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLenguage))
                            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel109)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHernias, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel110)
                                .addGap(10, 10, 10)
                                .addComponent(txtVarices, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGanglios, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel186)
                                .addGap(9, 9, 9)
                                .addComponent(chkPositivo)
                                .addGap(7, 7, 7)
                                .addComponent(chkNegativo))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel187)
                                .addGap(10, 10, 10)
                                .addComponent(txtSinNeumoconiosis, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel188)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImagenRxExPolvo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel189)
                                .addGap(10, 10, 10)
                                .addComponent(txtConNeumoconiosis, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator13)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel106)
                                    .addComponent(txtcolumnaVertebral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel107)
                                    .addComponent(txtAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel108)
                            .addComponent(txtAnillosInguinales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHernias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110)
                            .addComponent(txtVarices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel111)
                            .addComponent(txtGanglios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel113)
                                .addComponent(txtLenguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel112)
                                .addComponent(txtOrganosGenitales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel186))
                    .addComponent(chkPositivo)
                    .addComponent(chkNegativo))
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSinNeumoconiosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtImagenRxExPolvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel188))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel187)))
                .addGap(6, 6, 6)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel189))
                    .addComponent(txtConNeumoconiosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jtFichaMedica.addTab("Abdomen", jPanel15);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel124.setText("Triaje :");

        txtTriaje.setEditable(false);
        txtTriaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTriaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel126.setText("Lab. Clinico :");

        txtLabClinico.setEditable(false);
        txtLabClinico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtLabClinico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel128.setText("Electrocardiograma :");

        txtElectrocardiograma.setEditable(false);
        txtElectrocardiograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtElectrocardiograma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel130.setText("Rx. Torax P.A:");

        txtRadiografiaTorax.setEditable(false);
        txtRadiografiaTorax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtRadiografiaTorax.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel132.setText("Ficha Audiologica :");

        txtFichaAudiologica.setEditable(false);
        txtFichaAudiologica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaAudiologica.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel134.setText("Espirometria :");

        txtEspirometria.setEditable(false);
        txtEspirometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEspirometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel137.setText("Odontograma :");

        txtOdontograma.setEditable(false);
        txtOdontograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOdontograma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPsicologia.setEditable(false);
        txtPsicologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPsicologia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel138.setText("Psicologia :");

        txtAnexo7D.setEditable(false);
        txtAnexo7D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAnexo7D.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel141.setText("Anexo 7D :");

        txtHistoriaOcupacional.setEditable(false);
        txtHistoriaOcupacional.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtHistoriaOcupacional.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel143.setText("Hist. Ocupacional : ");

        jLabel144.setText("Cert. Trabajo Altura :");

        txtCerTrabajo.setEditable(false);
        txtCerTrabajo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCerTrabajo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCuestionarioNordico.setEditable(false);
        txtCuestionarioNordico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCuestionarioNordico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel145.setText("Cuestionario Nórdico :");

        jLabel146.setText("Detención S.A.S :");

        txtDetencionSAS.setEditable(false);
        txtDetencionSAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDetencionSAS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtConsentimientoDosaje.setEditable(false);
        txtConsentimientoDosaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConsentimientoDosaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel150.setText("Consentimiento Dosaje :");

        jLabel151.setText("Ficha Ant. Patológicos :");

        txtAntPatologicos.setEditable(false);
        txtAntPatologicos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAntPatologicos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel154.setText("Nro Orden :");

        txtEOrden.setBackground(new java.awt.Color(255, 153, 0));
        txtEOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEOrdenActionPerformed(evt);
            }
        });
        txtEOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEOrdenKeyTyped(evt);
            }
        });

        jLabel155.setText("Nombres :");

        jLabel156.setText("Tipo Examén :");

        lblConsentimientoDosaje.setPreferredSize(new java.awt.Dimension(13, 11));

        lblSAS.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCertificacionAltura.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCuestionarioNordico.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaAPatologicos.setPreferredSize(new java.awt.Dimension(13, 11));

        lblRadiografiaTorax.setPreferredSize(new java.awt.Dimension(13, 11));

        lblElectrocardiograma.setPreferredSize(new java.awt.Dimension(13, 11));

        lblLabClinico.setPreferredSize(new java.awt.Dimension(13, 11));

        lblTriaje.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaAudiologica.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAnexo7D.setPreferredSize(new java.awt.Dimension(13, 11));

        lblPsicologia.setPreferredSize(new java.awt.Dimension(13, 11));

        lblOdontograma.setPreferredSize(new java.awt.Dimension(13, 11));

        lblEspirometria.setPreferredSize(new java.awt.Dimension(13, 11));

        lblHistorialOcupacional.setPreferredSize(new java.awt.Dimension(13, 11));

        btnVLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnVLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVLimpiarActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imprimir Informes de Exámenes"));

        btnAnexo7C1.setText("Anexo 7C - N°1");
        btnAnexo7C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7C1ActionPerformed(evt);
            }
        });

        btnAnexo7C2.setText("Anexo 7C - N°2");
        btnAnexo7C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7C2ActionPerformed(evt);
            }
        });

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/toolbar/Edit.png"))); // NOI18N
        jButton3.setText("Anexo 7D");

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/toolbar/DefinedParameters.png"))); // NOI18N
        jButton4.setText("<html>Certificación previa<br>Trabajo en altura");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAnexo7C1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnexo7C2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator17)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAnexo7C1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAnexo7C2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel139.setText("Ex. Rx Sanguineos :");

        txtExRxSanguineos.setEditable(false);
        txtExRxSanguineos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtExRxSanguineos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblExRxSanguineos.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel152.setText("Perimetro Toraxico :");

        txtPerimetroToraxico.setEditable(false);
        txtPerimetroToraxico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPerimetroToraxico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPerimetroToraxico.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel153.setText("Oftalmología :");

        txtOftalmologia.setEditable(false);
        txtOftalmologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOftalmologia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblOftalmologia.setPreferredSize(new java.awt.Dimension(13, 11));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator18)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel124, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel126, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel130, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel132, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtFichaAudiologica, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFichaAudiologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(txtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(txtLabClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblLabClinico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(txtElectrocardiograma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblElectrocardiograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(txtRadiografiaTorax, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblRadiografiaTorax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(29, 29, 29))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel154)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel143, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel141, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel138, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel137, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel134, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtPsicologia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPsicologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtAnexo7D, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAnexo7D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtHistoriaOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblHistorialOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel150, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel146, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel144, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel145, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel151, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtCerTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCertificacionAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtDetencionSAS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtAntPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFichaAPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 186, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel155)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtENombre, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel156)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEtipoExamen))))
                    .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel139)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExRxSanguineos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExRxSanguineos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel152)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel153)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnVLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel154)
                    .addComponent(txtEOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel155)
                    .addComponent(txtENombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel156)
                    .addComponent(txtEtipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel124)
                            .addComponent(lblTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtLabClinico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel126)
                            .addComponent(lblLabClinico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtElectrocardiograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel128)
                            .addComponent(lblElectrocardiograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtRadiografiaTorax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel130)
                            .addComponent(lblRadiografiaTorax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtFichaAudiologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel132)
                            .addComponent(lblFichaAudiologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel134)
                            .addComponent(lblEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel137)
                            .addComponent(lblOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtPsicologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel138)
                            .addComponent(lblPsicologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtAnexo7D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel141)
                            .addComponent(lblAnexo7D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtHistoriaOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel143)
                            .addComponent(lblHistorialOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtAntPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel151)
                            .addComponent(lblFichaAPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel145)
                            .addComponent(lblCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtCerTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel144)
                            .addComponent(lblCertificacionAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtDetencionSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel146)
                            .addComponent(lblSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel150)
                            .addComponent(lblConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblExRxSanguineos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExRxSanguineos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel139))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel152)
                            .addComponent(txtPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel153))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estado de Paciente :", jPanel5);

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Grupo Sanguíneo"));

        btGrupoSanguineo.add(rbO);
        rbO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbO.setForeground(new java.awt.Color(102, 102, 102));
        rbO.setText("O");
        rbO.setEnabled(false);
        rbO.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btGrupoSanguineo.add(rbA);
        rbA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbA.setForeground(new java.awt.Color(102, 102, 102));
        rbA.setText("A");
        rbA.setEnabled(false);
        rbA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btGrupoSanguineo.add(rbB);
        rbB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbB.setForeground(new java.awt.Color(102, 102, 102));
        rbB.setText("B");
        rbB.setEnabled(false);
        rbB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btGrupoSanguineo.add(rbAB);
        rbAB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAB.setForeground(new java.awt.Color(102, 102, 102));
        rbAB.setText("AB");
        rbAB.setEnabled(false);
        rbAB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jSeparator27.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btGrupoSanguineoTIPO.add(rbRhPositivo);
        rbRhPositivo.setText("Rh(+)");
        rbRhPositivo.setEnabled(false);
        rbRhPositivo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btGrupoSanguineoTIPO.add(rbRhNegativo);
        rbRhNegativo.setText("Rh(-)");
        rbRhNegativo.setEnabled(false);
        rbRhNegativo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(rbO)
                .addGap(1, 1, 1)
                .addComponent(rbA)
                .addGap(1, 1, 1)
                .addComponent(rbB)
                .addGap(1, 1, 1)
                .addComponent(rbAB)
                .addGap(1, 1, 1)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rbRhPositivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbRhNegativo)
                .addGap(0, 0, 0))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbB, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rbA, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rbO, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jSeparator27)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rbAB, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbRhPositivo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbRhNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel190.setText("Hemoglobina / Hematocrito");

        txtHemoHema.setEditable(false);
        txtHemoHema.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHemoHema.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel191.setText("gr. %");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel190)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(txtHemoHema, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel191))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel190)
                .addGap(0, 0, 0)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHemoHema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel191))
                .addGap(0, 0, 0))
        );

        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Otros Exámenes"));

        txtOtrosEx.setColumns(20);
        txtOtrosEx.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtOtrosEx.setRows(5);
        txtOtrosEx.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        jScrollPane3.setViewportView(txtOtrosEx);

        jPanel26.setBackground(new java.awt.Color(204, 212, 28));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Apto para Trabajar"));

        rbSI.setBackground(new java.awt.Color(204, 212, 28));
        btApto.add(rbSI);
        rbSI.setSelected(true);
        rbSI.setText("SI");

        rbNO.setBackground(new java.awt.Color(204, 212, 28));
        btApto.add(rbNO);
        rbNO.setText("NO");

        rbReevaluacion.setBackground(new java.awt.Color(204, 212, 28));
        btApto.add(rbReevaluacion);
        rbReevaluacion.setText("Reevaluación");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(rbSI)
                .addGap(2, 2, 2)
                .addComponent(rbNO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbReevaluacion)
                .addGap(2, 2, 2))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbSI)
                .addComponent(rbNO)
                .addComponent(rbReevaluacion))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operaciones"));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar/Actualizar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(btnAgregar)
                .addGap(5, 5, 5)
                .addComponent(jButton6)
                .addGap(1, 1, 1))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6)
                    .addComponent(btnAgregar)))
        );

        jLabel192.setText("V.S.G :");

        txtVSG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtVSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVSGActionPerformed(evt);
            }
        });

        jLabel193.setText("Glucosa :");

        jLabel194.setText("Creatinina :");

        txtCreatininaBio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCreatininaBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatininaBioActionPerformed(evt);
            }
        });

        txtGlucosaBio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGlucosaBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGlucosaBioActionPerformed(evt);
            }
        });

        jLabel9.setText("Coca:");

        txtCoca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCoca.setText("NO REACTIVO");

        jLabel125.setText("Marih.:");

        txtMarig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Exámen Quimico"));

        jLabel202.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel202.setText("Nitritos :");

        jLabel203.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel203.setText("Proteínas :");

        jLabel204.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel204.setText("Urobilinogeno :");

        jLabel205.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel205.setText("Bilirrubina :");

        txtNitritosEQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtNitritosEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNitritosEQFocusGained(evt);
            }
        });

        txtProteinasEQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtProteinasEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProteinasEQFocusGained(evt);
            }
        });

        txtUrobilinogenoEQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtUrobilinogenoEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUrobilinogenoEQFocusGained(evt);
            }
        });

        txtBilirubinaEQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtBilirubinaEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBilirubinaEQFocusGained(evt);
            }
        });

        jLabel206.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel206.setText("Cetonas :");

        txtCetonasEQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtCetonasEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCetonasEQFocusGained(evt);
            }
        });

        jLabel207.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel207.setText("Leucocitos :");

        txtLeucocitosEQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtLeucocitosEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLeucocitosEQFocusGained(evt);
            }
        });

        txtGlucosaEQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtGlucosaEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGlucosaEQFocusGained(evt);
            }
        });

        jLabel208.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel208.setText("Glucosa :");

        jLabel209.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel209.setText("Sangre :");

        txtSangreEQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtSangreEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSangreEQFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel207, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel206, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel203, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel202, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(txtLeucocitosEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel209)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSangreEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProteinasEQ)
                            .addComponent(txtCetonasEQ, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(txtNitritosEQ))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel208, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel205, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel204, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGlucosaEQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUrobilinogenoEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBilirubinaEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel202)
                    .addComponent(jLabel204)
                    .addComponent(txtNitritosEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUrobilinogenoEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel203)
                    .addComponent(jLabel205)
                    .addComponent(txtProteinasEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBilirubinaEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel206)
                    .addComponent(txtCetonasEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel208)
                    .addComponent(txtGlucosaEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel207)
                    .addComponent(txtLeucocitosEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel209)
                    .addComponent(txtSangreEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sedimento Unitario"));

        jLabel210.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel210.setText("Leucocitos :");

        jLabel211.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel211.setText("Cel.Epiteliales :");

        jLabel212.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel212.setText("Hematies :");

        jLabel213.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel213.setText("Cristales :");

        txtLeucocitosSU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtCelEpitelialesSU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtHematiesSU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtCristalesSU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel214.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel214.setText("Cilindios :");

        txtCilindiosSU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel215.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel215.setText("Bacterías :");

        txtBacteriasSU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel216.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel216.setText("Pus :");

        txtPusSU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel217.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel217.setText("Otros :");

        txtOtrosSu.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel215, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel214, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel211, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel210, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLeucocitosSU, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(txtCelEpitelialesSU)
                    .addComponent(txtCilindiosSU)
                    .addComponent(txtBacteriasSU))
                .addGap(2, 2, 2)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel217, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel216, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel213, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel212, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPusSU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txtCristalesSU)
                    .addComponent(txtHematiesSU)
                    .addComponent(txtOtrosSu))
                .addGap(1, 1, 1))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel210)
                    .addComponent(jLabel212)
                    .addComponent(txtLeucocitosSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHematiesSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel211)
                    .addComponent(jLabel213)
                    .addComponent(txtCelEpitelialesSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCristalesSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel214)
                    .addComponent(txtCilindiosSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel216)
                    .addComponent(txtPusSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel215)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBacteriasSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel217)
                        .addComponent(txtOtrosSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Exámen Fisico"));

        jLabel147.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel147.setText("Color :");

        jLabel195.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel195.setText("Densidad :");

        jLabel196.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel196.setText("Aspecto :");

        jLabel197.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel197.setText("PH :");

        txtColorEF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtDensidadEF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtAspectoEF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtPhEF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel195)
                    .addComponent(jLabel147))
                .addGap(1, 1, 1)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtColorEF, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(txtDensidadEF))
                .addGap(1, 1, 1)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel197))
                    .addComponent(jLabel196))
                .addGap(1, 1, 1)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAspectoEF, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(txtPhEF))
                .addGap(1, 1, 1))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel147)
                    .addComponent(jLabel196)
                    .addComponent(txtColorEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAspectoEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel195)
                    .addComponent(jLabel197)
                    .addComponent(txtDensidadEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCoca, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel192)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVSG, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel125)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarig, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel193)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGlucosaBio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel194)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCreatininaBio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGlucosaBio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel193)
                            .addComponent(jLabel194)
                            .addComponent(txtCreatininaBio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtMarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel125))
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel192)
                                    .addComponent(txtVSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jtFichaMedica.addTab("RESULTADOS", jPanel21);

        txtObservacionesFichaMedica.setBackground(new java.awt.Color(189, 222, 255));
        txtObservacionesFichaMedica.setColumns(20);
        txtObservacionesFichaMedica.setLineWrap(true);
        txtObservacionesFichaMedica.setRows(5);
        txtObservacionesFichaMedica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setViewportView(txtObservacionesFichaMedica);

        jLabel123.setText("Observaciones Generales :");

        btnObsv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnObsv.setText("Agregar");
        btnObsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnObsvMouseClicked(evt);
            }
        });
        btnObsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObsvActionPerformed(evt);
            }
        });

        jLabel127.setText("Colesterol Total :");

        txtColesterol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtColesterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColesterolActionPerformed(evt);
            }
        });
        txtColesterol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColesterolKeyTyped(evt);
            }
        });

        jLabel129.setText("L.D.L Colesterol :");

        txtLDLColesterol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtLDLColesterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLDLColesterolActionPerformed(evt);
            }
        });
        txtLDLColesterol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLDLColesterolKeyTyped(evt);
            }
        });

        jLabel131.setText("H.D.L Colesterol :");

        txtHDLColesterol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtHDLColesterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHDLColesterolActionPerformed(evt);
            }
        });
        txtHDLColesterol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHDLColesterolKeyTyped(evt);
            }
        });

        jLabel133.setText("V.L.D.L Colesterol :");

        txtVLDLColesterol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtVLDLColesterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVLDLColesterolActionPerformed(evt);
            }
        });
        txtVLDLColesterol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVLDLColesterolKeyTyped(evt);
            }
        });

        txtTrigliseridos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTrigliseridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrigliseridosActionPerformed(evt);
            }
        });
        txtTrigliseridos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrigliseridosKeyTyped(evt);
            }
        });

        jLabel135.setText("Trigliceridos:");

        txtObservacionAudio.setBackground(new java.awt.Color(189, 222, 255));
        txtObservacionAudio.setColumns(20);
        txtObservacionAudio.setForeground(new java.awt.Color(255, 0, 0));
        txtObservacionAudio.setLineWrap(true);
        txtObservacionAudio.setRows(5);
        jScrollPane4.setViewportView(txtObservacionAudio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jtFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel135)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTrigliseridos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel133)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtVLDLColesterol))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel131)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHDLColesterol))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel129)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLDLColesterol))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel127)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel123)
                                        .addGap(3, 3, 3)
                                        .addComponent(btnObsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel123)
                    .addComponent(btnObsv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(txtColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(txtLDLColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(txtHDLColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(txtVLDLColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(txtTrigliseridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jtFichaMedica, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaNacimientoPropertyChange

    }//GEN-LAST:event_FechaNacimientoPropertyChange

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        consultar();  
        Ordenobservado();
        
    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtAntecedentesPersonalesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAntecedentesPersonalesFocusGained
        txtAntecedentesPersonales.selectAll();
    }//GEN-LAST:event_txtAntecedentesPersonalesFocusGained

    private void txtAntecedentesFamiliaresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAntecedentesFamiliaresFocusGained
        txtAntecedentesFamiliares.selectAll();
    }//GEN-LAST:event_txtAntecedentesFamiliaresFocusGained

    private void txtcabezaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcabezaFocusGained
        txtcabeza.selectAll();
    }//GEN-LAST:event_txtcabezaFocusGained

    private void txtNarizFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNarizFocusGained
        txtNariz.selectAll();
    }//GEN-LAST:event_txtNarizFocusGained

    private void txtCuelloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuelloFocusGained
        txtCuello.selectAll();
    }//GEN-LAST:event_txtCuelloFocusGained

    private void txtB_A_F_LFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtB_A_F_LFocusGained
        txtB_A_F_L.selectAll();
    }//GEN-LAST:event_txtB_A_F_LFocusGained

    private void txtPulmonesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPulmonesFocusGained
        txtPulmones.selectAll();
    }//GEN-LAST:event_txtPulmonesFocusGained

    private void rbAnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAnormalActionPerformed
        txtPulmones.setText(null);
    }//GEN-LAST:event_rbAnormalActionPerformed

    private void txtMiembrosSuperioresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMiembrosSuperioresFocusGained
        txtMiembrosSuperiores.selectAll();
    }//GEN-LAST:event_txtMiembrosSuperioresFocusGained

    private void txtMiembrosInferioresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMiembrosInferioresFocusGained
        txtMiembrosInferiores.selectAll();
    }//GEN-LAST:event_txtMiembrosInferioresFocusGained

    private void txtReflejosOsteotendinososFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReflejosOsteotendinososFocusGained
        txtReflejosOsteotendinosos.selectAll();
    }//GEN-LAST:event_txtReflejosOsteotendinososFocusGained

    private void txtMarchaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarchaFocusGained
        txtMarcha.selectAll();
    }//GEN-LAST:event_txtMarchaFocusGained

    private void txtcolumnaVertebralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcolumnaVertebralFocusGained
        txtcolumnaVertebral.selectAll();
    }//GEN-LAST:event_txtcolumnaVertebralFocusGained

    private void txtAbdomenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAbdomenFocusGained
        txtAbdomen.selectAll();
    }//GEN-LAST:event_txtAbdomenFocusGained

    private void txtAnillosInguinalesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnillosInguinalesFocusGained
        txtAnillosInguinales.selectAll();
    }//GEN-LAST:event_txtAnillosInguinalesFocusGained

    private void txtOrganosGenitalesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrganosGenitalesFocusGained
        txtOrganosGenitales.selectAll();
    }//GEN-LAST:event_txtOrganosGenitalesFocusGained

    private void txtHerniasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHerniasFocusGained
        txtHernias.selectAll();
    }//GEN-LAST:event_txtHerniasFocusGained

    private void txtVaricesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVaricesFocusGained
        txtVarices.selectAll();
    }//GEN-LAST:event_txtVaricesFocusGained

    private void txtGangliosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGangliosFocusGained
        txtGanglios.selectAll();
    }//GEN-LAST:event_txtGangliosFocusGained

    private void txtLenguageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLenguageFocusGained
        txtLenguage.selectAll();
    }//GEN-LAST:event_txtLenguageFocusGained

    private void txtODFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtODFocusGained
        txtOD.selectAll();
    }//GEN-LAST:event_txtODFocusGained

    private void txtOIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOIFocusGained
        txtOI.selectAll();
    }//GEN-LAST:event_txtOIFocusGained

    private void txtToraxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtToraxFocusGained
        txtTorax.selectAll();
    }//GEN-LAST:event_txtToraxFocusGained

    private void txtCorazonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorazonFocusGained
        txtCorazon.selectAll();
    }//GEN-LAST:event_txtCorazonFocusGained

    private void txtVisionColoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVisionColoresFocusGained
        txtVisionColores.selectAll();
    }//GEN-LAST:event_txtVisionColoresFocusGained

    private void txtEnfermedadesOcularesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnfermedadesOcularesFocusGained
        txtEnfermedadesOculares.selectAll();
    }//GEN-LAST:event_txtEnfermedadesOcularesFocusGained

    private void txtReflejosPupilaresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReflejosPupilaresFocusGained
        txtReflejosPupilares.selectAll();
    }//GEN-LAST:event_txtReflejosPupilaresFocusGained

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtNorden.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtNordenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyReleased

    }//GEN-LAST:event_txtNordenKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(Orden()){
            actualizar();
        }else if (validar()) {
            Insertar();
            if (Agregar()) {
                txtEOrden.setText(txtNorden.getText().toString());
                Busca();
                oPu.oFinalizado(txtDni);
                limpiar();
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtEOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEOrdenActionPerformed
        Busca();
    }//GEN-LAST:event_txtEOrdenActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnVLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVLimpiarActionPerformed
        Limpiar2();
    }//GEN-LAST:event_btnVLimpiarActionPerformed

    private void txtEOrdenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEOrdenKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtEOrdenKeyTyped

    private void btnAnexo7C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7C1ActionPerformed
        Integer Norden = Integer.valueOf(txtEOrden.getText());
        oPu.print(Norden, "Anexo7C.jasper", "Anexo 7C Hoja Nro 1");
    }//GEN-LAST:event_btnAnexo7C1ActionPerformed

    private void btnAnexo7C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7C2ActionPerformed
        Integer Norden = Integer.valueOf(txtEOrden.getText());
        oPu.print(Norden, "anexo7c2.jasper", "Anexo 7C Hoja Nro 2");
    }//GEN-LAST:event_btnAnexo7C2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnObsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObsvMouseClicked
        MostrarAddObsv();
    }//GEN-LAST:event_btnObsvMouseClicked

    private void chkNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNormalActionPerformed
        if (chkPatrobs.isSelected()) {
            txtConclusion.setText(null);
        }
        chkPatrobs.setSelected(false);
        if (chkNormal.isSelected()) {
            txtConclusion.append("- NORMAL" + '\n');
        }
    }//GEN-LAST:event_chkNormalActionPerformed

    private void chkPatrobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPatrobsActionPerformed
        // TODO add your handling code here:
        if (chkNormal.isSelected()) {
            txtConclusion.setText(null);
        }
        chkNormal.setSelected(false);
        if (chkPatrobs.isSelected()) {
            txtConclusion.append("-PATRON OBSTRUCTIVO LEVE");
            txtObservacionesFichaMedica.append("\n-PATRON OBSTRUCTIVO LEVE.EVALUACION EN 6 MESES");
        }
    }//GEN-LAST:event_chkPatrobsActionPerformed

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

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void txtColesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColesterolActionPerformed
        float colesterol=Float.parseFloat(txtColesterol.getText().toString());
        if(colesterol>200){
            txtColesterol.setForeground(Color.red);
        }
        txtLDLColesterol.requestFocus();
    }//GEN-LAST:event_txtColesterolActionPerformed

    private void txtColesterolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColesterolKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtColesterolKeyTyped

    private void txtLDLColesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLDLColesterolActionPerformed
        float ldlcolesterol=Float.parseFloat(txtLDLColesterol.getText().toString());
        if(ldlcolesterol>129){
            txtLDLColesterol.setForeground(Color.red);
        }
        txtHDLColesterol.requestFocus();
    }//GEN-LAST:event_txtLDLColesterolActionPerformed

    private void txtLDLColesterolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLDLColesterolKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtLDLColesterolKeyTyped

    private void txtHDLColesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHDLColesterolActionPerformed
        float HDLcolesterol=Float.parseFloat(txtHDLColesterol.getText().toString());
        if(HDLcolesterol<40){
            txtHDLColesterol.setForeground(Color.red);
        }
        txtVLDLColesterol.requestFocus();
    }//GEN-LAST:event_txtHDLColesterolActionPerformed

    private void txtHDLColesterolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHDLColesterolKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtHDLColesterolKeyTyped

    private void txtVLDLColesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVLDLColesterolActionPerformed
        float VLDcolesterol=Float.parseFloat(txtVLDLColesterol.getText().toString());
        if(VLDcolesterol>30){
            txtVLDLColesterol.setForeground(Color.red);
        }
        txtTrigliseridos.requestFocus();
    }//GEN-LAST:event_txtVLDLColesterolActionPerformed

    private void txtVLDLColesterolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVLDLColesterolKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtVLDLColesterolKeyTyped

    private void txtTrigliseridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrigliseridosActionPerformed
        float trigliceridos=Float.parseFloat(txtTrigliseridos.getText().toString());
        if(trigliceridos>150){
            txtTrigliseridos.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_txtTrigliseridosActionPerformed

    private void txtTrigliseridosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrigliseridosKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtTrigliseridosKeyTyped

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtFVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFVCActionPerformed
       
    }//GEN-LAST:event_txtFVCActionPerformed

    private void txtEnfermedadesOculares1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnfermedadesOculares1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnfermedadesOculares1FocusGained

    private void btnObsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObsvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObsvActionPerformed

    private void txtNorden1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNorden1ActionPerformed

//        if(!txtNorden1.getText().isEmpty()){
//            if(OrdenExiste1()){
//                if(!oPu.nOrden(txtNorden1, "ex_radiograficos_sanguineos")){
//                    String Sql="select d.cod_pa, d.nombres_pa, d.apellidos_pa,n.n_orden,l.chkpositivo,l.chknegativo,"
//                    + "  l.chko, l.chka , l.chkb , l.chkab,l.rbrhpositivo, l.rbrhnegativo,l.txthemoglobina,l.txtglucosabio,l.txtvsg,l.txtcocaina,l.txtmarihuana,l.txtcreatininabio, "
//                    + " r.txtvertices,r.txthilios,r.txtsenoscostofrenicos,r.txtmediastinos,r.txtsiluetacardiovascular,r.txtconclusionesradiograficas "
//                    + "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)"
//                    + "INNER JOIn lab_clinico AS l ON (n.n_orden = l.n_orden) "
//                    + "INNER JOIN radiografia_torax AS r ON (n.n_orden = r.n_orden ) WHERE l.n_orden ='"+txtNorden1.getText().toString()+"'";
//                    oConn.FnBoolQueryExecute(Sql);
//                    try {
//                        if (oConn.setResult.next()) {
//
//                            txtDNI.setText(oConn.setResult.getString("cod_pa"));
//                            txtRx.setText(oConn.setResult.getString("n_orden"));
//                            txtVertices.setText(oConn.setResult.getString("txtvertices"));
//                            txtHilios.setText(oConn.setResult.getString("txthilios"));
//                            txtSenos.setText(oConn.setResult.getString("txtsenoscostofrenicos"));
//                            txtMediastinos.setText(oConn.setResult.getString("txtmediastinos"));
//                            txtSiluetaCardioVascular.setText(oConn.setResult.getString("txtsiluetacardiovascular"));
//                            txtConclusionesRx.setText(oConn.setResult.getString("txtconclusionesradiograficas"));
//                            txtHemoHema.setText(oConn.setResult.getString("txthemoglobina"));
//                            chkPositivo.setSelected(oConn.setResult.getBoolean("chkpositivo"));
//                            chkNegativo.setSelected(oConn.setResult.getBoolean("chknegativo"));
//                            txtNombres.setText(oConn.setResult.getString("nombres_pa").concat(" ").concat(oConn.setResult.getString("apellidos_pa")));
//                            rbO.setSelected(oConn.setResult.getBoolean("chko"));
//                            rbA.setSelected(oConn.setResult.getBoolean("chka"));
//                            rbB.setSelected(oConn.setResult.getBoolean("chkb"));
//                            rbAB.setSelected(oConn.setResult.getBoolean("chkab"));
//                            rbRhPositivo.setSelected(oConn.setResult.getBoolean("rbrhpositivo"));
//                            rbRhNegativo.setSelected(oConn.setResult.getBoolean("rbrhnegativo"));
//                            txtOtrosEx.append("-HEMOGRAMA: NORMAL. \n");
//                            txtOtrosEx.append (oConn.setResult.getString("txtglucosabio")== null ? "":("-GLUCOSA: "+ oConn.setResult.getString("txtglucosabio") + " mg/dl. \n"));
//                            txtOtrosEx.append (oConn.setResult.getString("txtcreatininabio")== null ? "":("-CREATININA: "+ oConn.setResult.getString("txtcreatininabio") + " mg/dl. \n"));
//                            txtOtrosEx.append (oConn.setResult.getString("txtvsg") == null ? "":("-VSG: "+ oConn.setResult.getString("txtvsg")+ ". \n"));
//                            txtOtrosEx.append("-EX ORINA: NORMAL. \n");
//                            txtOtrosEx.append (oConn.setResult.getString("txtcocaina") == null ? "":("-COCAINA: " + oConn.setResult.getString("txtcocaina")+". \n"));
//                            txtOtrosEx.append (oConn.setResult.getString("txtmarihuana")== null ? "":("-MARIHUANA: "+oConn.setResult.getString("txtmarihuana")+ "."));
//                            txtNorden1.setEditable(false);
//                            txtCalidad.setText("2");
//                            txtSimbolos.setText("N/A");
//                            Fecha();
//
//                        }else{
//                            oFunc.SubSistemaMensajeError("No se encuentra Registros(Registros Necesarios): \n 1- Laboratorio Clinico \n 2- Radiografía de Torax P.A");
//                        }
//                    } catch (SQLException ex) {
//                        oFunc.SubSistemaMensajeInformacion("Historia Ocupacional:" + ex.getMessage().toString());
//                    }
//                }else{oFunc.SubSistemaMensajeError("El Formulario ya fue Llenado");
//                }
//            }
//        }
    }//GEN-LAST:event_txtNorden1ActionPerformed

    private void txtNorden1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNorden1KeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNorden1KeyTyped

    private void txtSimbolosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSimbolosFocusGained
        txtSimbolos.selectAll();
    }//GEN-LAST:event_txtSimbolosFocusGained

    private void chkPositivoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPositivoStateChanged
        if(chkPositivo.isSelected()== true){
            txtSinNeumoconiosis.setText(null);
            txtImagenRxExPolvo.setText(null);
            txtSinNeumoconiosis.requestFocus();
        }
    }//GEN-LAST:event_chkPositivoStateChanged

    private void chkPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPositivoActionPerformed

    }//GEN-LAST:event_chkPositivoActionPerformed

    private void chkNegativoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkNegativoStateChanged
        if(chkNegativo.isSelected()== true){
            txtSinNeumoconiosis.setText("NORMAL");
            txtImagenRxExPolvo.setText("SOSPECHA");
        }
    }//GEN-LAST:event_chkNegativoStateChanged

    private void chkNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNegativoActionPerformed

    }//GEN-LAST:event_chkNegativoActionPerformed

    private void txtVSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVSGActionPerformed

    }//GEN-LAST:event_txtVSGActionPerformed

    private void txtCreatininaBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatininaBioActionPerformed

    }//GEN-LAST:event_txtCreatininaBioActionPerformed

    private void txtGlucosaBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGlucosaBioActionPerformed

    }//GEN-LAST:event_txtGlucosaBioActionPerformed

    private void txtNitritosEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNitritosEQFocusGained
        txtNitritosEQ.selectAll();
    }//GEN-LAST:event_txtNitritosEQFocusGained

    private void txtProteinasEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProteinasEQFocusGained
        txtProteinasEQ.selectAll();
    }//GEN-LAST:event_txtProteinasEQFocusGained

    private void txtUrobilinogenoEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUrobilinogenoEQFocusGained
        txtUrobilinogenoEQ.selectAll();
    }//GEN-LAST:event_txtUrobilinogenoEQFocusGained

    private void txtBilirubinaEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBilirubinaEQFocusGained
        txtBilirubinaEQ.selectAll();
    }//GEN-LAST:event_txtBilirubinaEQFocusGained

    private void txtCetonasEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCetonasEQFocusGained
        txtCetonasEQ.selectAll();
    }//GEN-LAST:event_txtCetonasEQFocusGained

    private void txtLeucocitosEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLeucocitosEQFocusGained
        txtLeucocitosEQ.selectAll();
    }//GEN-LAST:event_txtLeucocitosEQFocusGained

    private void txtGlucosaEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGlucosaEQFocusGained
        txtGlucosaEQ.selectAll();
    }//GEN-LAST:event_txtGlucosaEQFocusGained

    private void txtSangreEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSangreEQFocusGained
        txtSangreEQ.selectAll();
    }//GEN-LAST:event_txtSangreEQFocusGained
    private void Busca() {
        if (!txtEOrden.getText().isEmpty()) {
           String sql="Select * from anexo7c WHERE n.n_orden ='" + txtEOrden.getText().toUpperCase() + "'"; if (OrdenExiste()) {
                String Sql = "SELECT d.nombres_pa||' '||d.apellidos_pa AS nombres,n.nom_examen FROM "
                        + "datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa)WHERE n.n_orden ='" + txtEOrden.getText().toUpperCase() + "'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtENombre.setText(oConn.setResult.getString("nombres"));
                        txtEtipoExamen.setText(oConn.setResult.getString("nom_examen"));
                        txtEOrden.setEditable(false);
                        txtENombre.setEditable(false);
                        txtEtipoExamen.setEditable(false);
                        oConn.setResult.close();
                    }
                    oConn.setResult.close();
                } catch (Exception e) {
                }
                vExamenes(txtEOrden.getText().toString());

            } else {
                oFunc.SubSistemaMensajeError("No existe Nro Orden");
                Limpiar2();
            }
        }
    }

    public boolean OrdenExiste() {
        boolean bResultado = false;

        String sQuery;

        sQuery = "Select n_orden from n_orden_ocupacional Where n_orden=" + txtEOrden.getText().toString();

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

    public boolean Orden() {
        boolean bResultado = false;

        String sQuery;

        sQuery = "Select n_orden from anexo7c Where n_orden=" + txtNorden.getText().toString();

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
    public void Ordenobservado() {
        int cont=1;
        String sQuery;
        String observacion = "Observado en: \n";
        sQuery = "SELECT d.cod_pa, d.nombres_pa, n.n_orden,examenes\n" +
                "FROM datos_paciente as d\n" +
                "inner join n_orden_ocupacional as n on(n.cod_pa=d.cod_pa)\n" +
                "inner join observaciones as o on(o.n_orden=n.n_orden)\n" +
                "where n.cod_pa=" + txtDni.getText().toString();

        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {

            // Verifico que haya habido resultados
            while(oConn.setResult.next() && cont<5) {
                cont++;
                observacion+=oConn.setResult.getString("examenes");
                
            }
            oFunc.SubSistemaMensajeInformacion(observacion);
            // Cierro los Resultados
            oConn.setResult.close();

        } catch (SQLException ex) {

        }

    }

    void Fecha() {
        Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
        FechaFicha.setDate(fechaDate);
        FechaRx.setDate(fechaDate);
    }
    
    void editar(){
        
                String Consulta = "SELECT d.cod_pa,d.nombres_pa,d.apellidos_pa,d.fecha_nacimiento_pa,d.sexo_pa,d.lugar_nac_pa,d.direccion_pa,\n" +
                    "d.tel_casa_pa,d.cel_pa,d.estado_civil_pa,d.nivel_est_pa,n.razon_empresa,n.razon_contrata,n.nom_examen,n.nom_ex,\n" +
                    "n.altura_po,n.mineral_po,n.cargo_de,n.area_o,ap.txtvhijosvivos,ap.txtvhijosfallecidos,ap.txtdhijosvivos,ap.txtdhijosfallecidos,\n" +
                    "triaje.talla,triaje.peso,triaje.imc,triaje.sistolica,triaje.diastolica,triaje.f_respiratoria,triaje.f_cardiaca,\n" +
                    "triaje.sat_02,triaje.temperatura,triaje.cintura,triaje.cadera,triaje.icc,triaje.perimetro_cuello,o.v_cerca_s_od,\n" +
                    "o.v_cerca_s_oi,o.v_cerca_c_od,o.v_cerca_c_oi,o.v_lejos_s_od,o.v_lejos_s_oi,o.v_lejos_c_od,o.v_lejos_c_oi,o.v_binocular, \n" +
                    "o.e_oculares,o.e_oculares1, odontograma.txtausentes,odontograma.txtobservaciones,odontograma.txtpiezasmalestado,r.txtobservacionesrt,\n" +
                    "l.txtobservacioneslb, e.txtobservacionesrs,l.txtglucosabio,l.txtvsg,l.txtcocaina,l.txtmarihuana,l.txtcreatininabio,m.o_d_500,m.o_d_1000,m.o_d_2000,m.o_d_3000,\n" +
                    "m.o_d_4000,m.o_d_6000,m.o_d_8000,m.o_i_500,m.o_i_1000,m.o_i_2000,m.o_i_3000,m.o_i_4000,m.o_i_6000,m.o_i_8000,m.diagnostico ,\n" +
                    "funcion_abs.fvc,funcion_abs.fev1,funcion_abs.fev1fvc,funcion_abs.fef25_75,funcion_abs.interpretacion,funcion_abs.interpretacion,\n" +
                    "a.fecha, a.chkruido, a.chkpolvo, a.chkvidsegmentario,a.chkvidtotal, a.chkcancerigenos, a.chkmutagenicos, a.chksolventes, a.chkmetales,  \n" +
                    "a.chktemperatura, a.chkbiologicos, a.chkposturas, a.chkturnos, a.chkcargas, a.chkmovrepet, a.chkpvd, a.chkotros, a.tbrsi, a.rbrno, a.chktnada,\n" +
                    "a.chktpoco,a.chkthabitual, a.chktexcesivo, a.chkanada, a.chkapoco, a.chkahabitual, a.chkaexcesivo, a.chkdnada, a.chkdpoco, a.chkdhabitual, \n" +
                    "a.chkdexcesivo,a.txtpuestoactual, a.txttiempo, a.txtantecedentespersonales, a.txtantecedentesfamiliares,\n" +
                    "a.txtcabeza, a.txtnariz, a.txtcuello,a.txtperimetro, a.txtb_a_f_l, a.txtvisioncolores, a.txtenfermedadesoculares,a.txtdiagnosticoaudio,a.txtenfermedadesoculares2,a.txtreflejospupilares, \n" +
                    "a.txtbinocular, a.txtod, a.txtoi, a.txttorax, a.txtcorazon, a.rbnormal, a.rbanormal, a.txtpulmones, a.txtmiembrossuperiores, \n" +
                    "a.txtmiembrosinferiores,a.txtreflejososteotendinosos, a.txtmarcha, a.txtcolumnavertebral, a.txtabdomen,a.txtanillosinguinales, \n" +
                    "a.txtorganosgenitales, a.rbtnohizo, a.rbtnormal,a.rbtanormal, a.chkdescribirobservacion, a.txthernias, a.txtvarices, a.txtganglios,\n" +
                    "a.txtlenguage, a.txtobservacionesfm, a.txtconclusion,tetano,hepatitisb,fiebreamarilla\n" +
                    "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) \n" +
                    "INNER JOIN antecedentes_patologicos AS ap ON(n.n_orden = ap.n_orden) INNER JOIN triaje ON(n.n_orden = triaje.n_orden) \n" +
                    "INNER JOIN oftalmologia AS o ON(n.n_orden = o.n_orden)\n" +
                    "INNER JOIN funcion_abs ON(n.n_orden = funcion_abs.n_orden)\n" +
                    "INNER JOIN radiografia_torax AS r ON(n.n_orden = r.n_orden)\n" +
                    "INNER JOIN lab_clinico AS l ON(n.n_orden = l.n_orden)\n" +
                    "INNER JOIN ex_radiograficos_sanguineos AS e ON(n.n_orden = e.n_orden)\n" +
                    "INNER JOIN odontograma ON(n.n_orden = odontograma.n_orden)\n" +
                    "INNER JOIN audiometria_po AS m ON(n.n_orden =m.n_orden)\n" +
                    "INNER JOIN anexo7c as a ON(n.n_orden = a.n_orden)\n" +
                    "WHERE a.n_orden ='" + txtNorden.getText().toString() + "'";
                
                oConn.FnBoolQueryExecute(Consulta);
                
                try {
                    if (oConn.setResult.next()) {
                       
                        if (oConn.setResult.getString("txtobservaciones") != null) {
                            txtObservacionesFichaMedica.append("-ODONTOGRAMA : " + oConn.setResult.getString("txtobservaciones").concat("\n"));
                            
                        }
                        txtObservOdonto.setText(oConn.setResult.getString("txtobservaciones"));
                        if (oConn.setResult.getString("txtobservacionesrt") != null) {
                            txtObservacionesFichaMedica.append("-RADIOGRAFIA : " + oConn.setResult.getString("txtobservacionesrt").concat("\n"));
                        }
                        if (oConn.setResult.getString("txtobservacioneslb") != null) {
                            txtObservacionesFichaMedica.append("-LAB CLINICO: " + oConn.setResult.getString("txtobservacioneslb").concat("\n"));
                        }
                         String coca=oConn.setResult.getString("txtcocaina");
                         String marig=oConn.setResult.getString("txtmarihuana");
                         if(coca!=null && marig!=null){
                            if ("REACTIVO".equals(coca)||"POSITIVO".equals(coca)) {
                                txtObservacionesFichaMedica.append("-COCAINA: " + coca.concat("\n"));
                                txtCoca.setForeground(Color.red);
                                txtCoca.setText(coca);
                            } else {
                                txtObservacionesFichaMedica.append("-COCAINA: " + coca.concat("\n"));
                                txtCoca.setText(coca);
                            }
                            if ("REACTIVO".equals(marig)||"POSITIVO".equals(marig)) {
                                txtObservacionesFichaMedica.append("-MARIHUANA: " + marig.concat("\n"));
                                txtMarig.setForeground(Color.red);
                                txtMarig.setText(marig);
                            } else {
                                txtObservacionesFichaMedica.append("-MARIHUANA: " + marig.concat("\n"));
                                txtMarig.setText(marig);
                            }
                        }
                         
                            String vsg=oConn.setResult.getString("txtvsg");
                            String gluc=oConn.setResult.getString("txtglucosabio");
                            String creat=oConn.setResult.getString("txtcreatininabio");
                            
                            txtVSG.setText(vsg);
                            txtGlucosaBio.setText(gluc);
                            txtCreatininaBio.setText(creat);
                            if(!txtGlucosaBio.getText().isEmpty()&& !"N/A".equals(txtGlucosaBio.getText()) ){
                            float glucosa = Float.parseFloat(txtGlucosaBio.getText().toString());
                                if (glucosa >= 110 || glucosa < 70) {
                                    txtGlucosaBio.setForeground(Color.red);
                                } else {
                                    txtGlucosaBio.setForeground(Color.black);
                                }
                            }
                            
                        if (!txtCreatininaBio.getText().isEmpty()&& !"N/A".equals(txtCreatininaBio.getText()) ) {
                            float cretinina = Float.parseFloat(txtCreatininaBio.getText().toString());
                            if (cretinina >= 1.4 || cretinina < 0.8) {
                                txtCreatininaBio.setForeground(Color.red);
                            } else {
                                txtCreatininaBio.setForeground(Color.black);
                            }

                        }
//                            txtOtrosEx.setText(coca);
                            txtOtrosEx.append("-HEMOGRAMA: NORMAL. \n");
                            txtOtrosEx.append(gluc== null ? "":("-GLUCOSA: "+ gluc+ " mg/dl. \n"));
                            txtOtrosEx.append (creat== null ? "":("-CREATININA: "+ creat + " mg/dl. \n"));
                            txtOtrosEx.append (vsg == null ? "":("-VSG: "+ vsg + ". \n"));
                            txtOtrosEx.append("-EX ORINA: NORMAL. \n");
                            txtOtrosEx.append (coca == null ? "":("-COCAINA: " +coca+". \n"));
                            txtOtrosEx.append (marig== null ? "":("-MARIHUANA: "+marig+ "."));
                        if (oConn.setResult.getString("txtobservacionesrs") != null) {
                            txtObservacionesFichaMedica.append("-EX. RX SANGUINEOS : " + oConn.setResult.getString("txtobservacionesrs").concat("\n"));
                        }
                        
                        //txtObservacionesFichaMedica.append(oConn.setResult.getString("txtobservaciones")== null ? "":"-Odontograma : "+ oConn.setResult.getString("txtobservaciones").concat("\n"));
                        //txtObservacionesFichaMedica.append(oConn.setResult.getString("txtobservacionesrt")== null ? "":"-Radiografia : "+ oConn.setResult.getString("txtobservacionesrt").concat("\n"));
                        //txtObservacionesFichaMedica.append(oConn.setResult.getString("txtobservacioneslb")== null ? "":"-Laboratorio Clinico: "+ oConn.setResult.getString("txtobservacioneslb").concat("\n"));
                        //.append(oConn.setResult.getString("txtobservacionesrs")== null ? "":"-Ex.Radiografico Sanguineo : "+ oConn.setResult.getString("txtobservacionesrs").concat("\n"));
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
                        txtArea.setText(oConn.setResult.getString("area_o"));
                        txtFVC.setText(oConn.setResult.getString("fvc"));
//                          if(!txtFVC.getText().isEmpty() && !"N/A".equals(txtFVC.getText().toString())){
//                            float fvc=Float.parseFloat(txtFVC.getText().toString());
//                            if(fvc >=80){
//                                txtConclusion.append("-NORMAL");
//                            }else{
//                                txtConclusion.append("-PATRON RESTRICTIVO" +'\n' );
////                                txtInterpretacion.append("-PATRON RESTRICTIVO"+ '\n');
//                                txtObservacionesFichaMedica.append("-PATRON RESTRICTIVO LEVE.EVALUACION EN 6 MESES." + '\n' );
//                            } 
//                        }
                        txtFEV1.setText(oConn.setResult.getString("fev1"));
                        txtFEV1FVC.setText(oConn.setResult.getString("fev1fvc"));
//                         if(!txtFEV1FVC.getText().isEmpty()&&!"N/A".equals(txtFVC.getText().toString())){
//                           float fev1fvc=Float.parseFloat(txtFEV1FVC.getText().toString());
//                           if(fev1fvc >=70.0){
//                               if(!"-NORMAL".equals(txtConclusion.getText().toString())){
//                                   txtConclusion.append("-NORMAL" + '\n');
//                               }
//                           }else{
//                               txtConclusion.append("-PATRON OBSTRUCTIVO"+ '\n');
//                               txtObservacionesFichaMedica.append("-PATRON OBSTRUCTIVO LEVE. EVALUACION EN 6 MESES." + '\n' );
//                           } 
//                        }
                        txtFEF2575.setText(oConn.setResult.getString("fef25_75"));
                        txtConclusion.setText(oConn.setResult.getString("interpretacion"));
                        txtMalEstado.setText(oConn.setResult.getString("txtpiezasmalestado"));
//                        if(!txtMalEstado.getText().isEmpty()){
//                            float malEstado = Float.parseFloat(txtMalEstado.getText().toString());
//                            if (malEstado >=1) {
//                            txtObservacionesFichaMedica.append("-CARIES DENTAL.TTO.EVALUACION EN 6 MESES." + '\n');
//                            }
//                        }
                        txtFaltan.setText(oConn.setResult.getString("txtausentes"));
                        if (txtSexo.getText().equals("M")) {
                            txtHijosvivos.setText(oConn.setResult.getString("txtvhijosvivos") == null ? "0" : oConn.setResult.getString("txtvhijosvivos"));
                            txtHijosMuertos.setText(oConn.setResult.getString("txtvhijosfallecidos") == null ? "0" : oConn.setResult.getString("txtvhijosfallecidos"));
                        } else {
                            txtHijosvivos.setText(oConn.setResult.getString("txtdhijosvivos") == null ? "0" : oConn.setResult.getString("txtdhijosvivos"));
                            txtHijosMuertos.setText(oConn.setResult.getString("txtdhijosfallecidos") == null ? "0" : oConn.setResult.getString("txtdhijosfallecidos"));
                        }
                        txtIMC.setText(oConn.setResult.getString("imc"));

                        txtTalla.setText(oConn.setResult.getString("talla"));
                        txtPeso.setText(oConn.setResult.getString("peso"));
                        txtPerimetro.setText(oConn.setResult.getString("perimetro_cuello"));
                        txtTemperatura.setText(oConn.setResult.getString("temperatura"));
                        txtCintura.setText(oConn.setResult.getString("cintura"));
                        txtCadera.setText(oConn.setResult.getString("cadera"));
                        txticc.setText(oConn.setResult.getString("icc"));
                        txtFrespiratoria.setText(oConn.setResult.getString("f_respiratoria"));
                        txtFcardiaca.setText(oConn.setResult.getString("f_cardiaca"));
                        txtSatO2.setText(oConn.setResult.getString("sat_02"));
                        txtSistolica.setText(oConn.setResult.getString("sistolica"));
                        txtDiastolica.setText(oConn.setResult.getString("diastolica"));
                        txtConclusion.setText(oConn.setResult.getString("interpretacion"));
                        //
                        txtCercaSinCorregirOD.setText(oConn.setResult.getString("v_cerca_s_od"));
                        txtCercaSinCorregirOI.setText(oConn.setResult.getString("v_cerca_s_oi"));
                        txtCercaCorregidaOD.setText(oConn.setResult.getString("v_cerca_c_od"));
                        txtCercaCorregidaOI.setText(oConn.setResult.getString("v_cerca_c_oi"));
                        txtLejosSinCorregirOD.setText(oConn.setResult.getString("v_lejos_s_od"));
                        txtLejosSinCorregirOI.setText(oConn.setResult.getString("v_lejos_s_oi"));
                        txtLejosCorregidaOD.setText(oConn.setResult.getString("v_lejos_c_od"));
                        txtLejosCorregidaOI.setText(oConn.setResult.getString("v_lejos_c_oi"));
                        txtBinocular.setText(oConn.setResult.getString("v_binocular"));
                        
      
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
                        
                      
                        //anexo7c....................................
                        FechaFicha.setDate(oConn.setResult.getDate("fecha"));
                        chkRuido.setSelected(oConn.setResult.getBoolean("chkruido"));
                        chkPolvo.setSelected(oConn.setResult.getBoolean("chkpolvo"));
                        chkVidSegmentario.setSelected(oConn.setResult.getBoolean("chkvidsegmentario"));
                        chkVidTotal.setSelected(oConn.setResult.getBoolean("chkvidtotal"));
                        chkCancerigenos.setSelected(oConn.setResult.getBoolean("chkcancerigenos"));
                        chkMutagenicos.setSelected(oConn.setResult.getBoolean("chkmutagenicos"));
                        chkSolventes.setSelected(oConn.setResult.getBoolean("chksolventes"));
                        chkMetales.setSelected(oConn.setResult.getBoolean("chkmetales"));
                        chkTemperatura.setSelected(oConn.setResult.getBoolean("chktemperatura"));
                        chkBiologicos.setSelected(oConn.setResult.getBoolean("chkbiologicos"));
                        chkPosturas.setSelected(oConn.setResult.getBoolean("chkposturas"));
                        chkTurnos.setSelected(oConn.setResult.getBoolean("chkturnos"));
                        chkCargas.setSelected(oConn.setResult.getBoolean("chkcargas"));
                        chkMovRepet.setSelected(oConn.setResult.getBoolean("chkmovrepet"));
                        chkPVD.setSelected(oConn.setResult.getBoolean("chkpvd"));
                        chkOtros.setSelected(oConn.setResult.getBoolean("chkotros"));
                        tbRsi.setSelected(oConn.setResult.getBoolean("tbrsi"));
                        rbRno.setSelected(oConn.setResult.getBoolean("rbrno"));
                        chkTNada.setSelected(oConn.setResult.getBoolean("chktnada"));
                        chkTPoco.setSelected(oConn.setResult.getBoolean("chktpoco"));
                        chkTHabitual.setSelected(oConn.setResult.getBoolean("chkthabitual"));
                        chkTExcesivo.setSelected(oConn.setResult.getBoolean("chktexcesivo"));
                        chkANada.setSelected(oConn.setResult.getBoolean("chkanada"));
                        chkAPoco.setSelected(oConn.setResult.getBoolean("chkapoco"));
                        chkAHabitual.setSelected(oConn.setResult.getBoolean("chkahabitual"));
                        chkAExcesivo.setSelected(oConn.setResult.getBoolean("chkaexcesivo"));
                        chkDNada.setSelected(oConn.setResult.getBoolean("chkdnada"));
                        chkDPoco.setSelected(oConn.setResult.getBoolean("chkdpoco"));
                        chkDHabitual.setSelected(oConn.setResult.getBoolean("chkdhabitual"));
                        chkDExcesivo.setSelected(oConn.setResult.getBoolean("chkdexcesivo"));
                        txtPuestoActual.setText(oConn.setResult.getString("txtpuestoactual"));
                        txtTiempo.setText(oConn.setResult.getString("txttiempo"));
                        txtAntecedentesPersonales.setText(oConn.setResult.getString("txtantecedentespersonales"));
                        txtAntecedentesFamiliares.setText(oConn.setResult.getString("txtantecedentesfamiliares"));
//                        txtHijosvivos.setText(oConn.setResult.getString("txthijosvivos"));
//                        txtHijosMuertos.setText(oConn.setResult.getString("txthijosmuertos"));
                        txtcabeza.setText(oConn.setResult.getString("txtcabeza"));
                        txtNariz.setText(oConn.setResult.getString("txtnariz"));
                        txtCuello.setText(oConn.setResult.getString("txtcuello"));
                        txtPerimetro.setText(oConn.setResult.getString("txtperimetro"));
                        txtB_A_F_L.setText(oConn.setResult.getString("txtb_a_f_l"));
                        txtVisionColores.setText(oConn.setResult.getString("txtvisioncolores"));
                        txtEnfermedadesOculares.setText(oConn.setResult.getString("txtenfermedadesoculares"));
//                      txtEnfermedadesOculares2.setText(oConn.setResult.getString("txtenfermedadesoculares1"));
                        txtEnfermedadesOculares1.setText(oConn.setResult.getString("txtenfermedadesoculares2"));
                        txtReflejosPupilares.setText(oConn.setResult.getString("txtreflejospupilares"));
                        txtBinocular.setText(oConn.setResult.getString("txtbinocular"));
                        txtOD.setText(oConn.setResult.getString("txtod"));
                        txtOI.setText(oConn.setResult.getString("txtoi"));
                        txtTorax.setText(oConn.setResult.getString("txttorax"));
                        txtCorazon.setText(oConn.setResult.getString("txtcorazon"));
                        rbNormal.setSelected(oConn.setResult.getBoolean("rbnormal"));
                        rbAnormal.setSelected(oConn.setResult.getBoolean("rbanormal"));
                        txtPulmones.setText(oConn.setResult.getString("txtpulmones"));
                        txtMiembrosSuperiores.setText(oConn.setResult.getString("txtmiembrossuperiores"));
                        txtMiembrosInferiores.setText(oConn.setResult.getString("txtmiembrosinferiores"));
                        txtReflejosOsteotendinosos.setText(oConn.setResult.getString("txtreflejososteotendinosos"));
                        txtMarcha.setText(oConn.setResult.getString("txtmarcha"));
                        txtcolumnaVertebral.setText(oConn.setResult.getString("txtcolumnavertebral"));
                        txtAbdomen.setText(oConn.setResult.getString("txtabdomen"));
                        txtAnillosInguinales.setText(oConn.setResult.getString("txtanillosinguinales"));
                        txtOrganosGenitales.setText(oConn.setResult.getString("txtorganosgenitales"));
                        rbTNoHizo.setSelected(oConn.setResult.getBoolean("rbtnohizo"));
                        rbTNormal.setSelected(oConn.setResult.getBoolean("rbtnormal"));
                        rbTAnormal.setSelected(oConn.setResult.getBoolean("rbtanormal"));
                        chkDescribirObservacion.setSelected(oConn.setResult.getBoolean("chkdescribirobservacion"));
                        txtHernias.setText(oConn.setResult.getString("txthernias"));
                        txtVarices.setText(oConn.setResult.getString("txtvarices"));
                        txtGanglios.setText(oConn.setResult.getString("txtganglios"));
                        txtLenguage.setText(oConn.setResult.getString("txtlenguage"));
                        txtObservacionesFichaMedica.setText(oConn.setResult.getString("txtobservacionesfm"));
                        txtConclusion.setText(oConn.setResult.getString("txtconclusion"));
                        chkTetano.setSelected(oConn.setResult.getBoolean("tetano"));
                        chkHepatitisB.setSelected(oConn.setResult.getBoolean("hepatitisb"));
                        chkFiebreAmarilla.setSelected(oConn.setResult.getBoolean("fiebreamarilla"));
                           if(!txtOD500.getText().isEmpty() && !"N/A".equals(txtOD500.getText())&&!"NORMAL".equals(txtOD500.getText())){
                           txtObservacionAudio.setText(oConn.setResult.getString("diagnostico").concat(".USO DE EPP AUDITIVO.EVALUACION ANUAL "));
                        }else if("N/A".equals(txtOD500.getText())){
                            txtObservacionAudio.setText(null);
                             txtObservacionAudio.append("NO PASO EXAMEN AUDIOMETRIA." + '\n');
                        }
                        //----
                       oPu.fecha(FechaFicha);
                       muestraVisual();
                       editarRadiogrSan();
                       electroCardiograma();
                       examenOrina();
                       cargarAnalisisB();
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
                 String Consulta = "SELECT d.cod_pa,d.nombres_pa,d.apellidos_pa,d.fecha_nacimiento_pa,d.sexo_pa,d.lugar_nac_pa,d.direccion_pa,"
                         + "d.tel_casa_pa,d.cel_pa,d.estado_civil_pa,d.nivel_est_pa,n.razon_empresa,n.razon_contrata,n.nom_examen,n.nom_ex,"
                         + "n.altura_po,n.mineral_po,n.cargo_de,n.area_o,n.grupofactorsan,a.txtvhijosvivos,a.txtvhijosfallecidos,a.txtdhijosvivos,a.txtdhijosfallecidos,"
                        + "a.rbfumarsi,a.rblicorsi,triaje.talla,triaje.peso,triaje.imc,triaje.sistolica,triaje.diastolica,triaje.f_respiratoria,triaje.f_cardiaca,triaje.sat_02,"
                         + "triaje.temperatura,triaje.cintura,triaje.cadera,triaje.icc,triaje.perimetro_cuello,"
                         + "o.v_cerca_s_od,o.v_cerca_s_oi,"
                         + "o.v_cerca_c_od,o.v_cerca_c_oi,o.v_lejos_s_od,o.v_lejos_s_oi,o.v_lejos_c_od,o.v_lejos_c_oi,o.v_colores,o.v_binocular, "
                         + "o.e_oculares,o.e_oculares1, "
                         + "o.e_oculvisionlejos,odontograma.txtausentes,odontograma.txtobservaciones,odontograma.txtpiezasmalestado,r.txtvertices,r.txthilios, "
                         + "r.txtsenoscostofrenicos, r.txtmediastinos, r.txtsiluetacardiovascular, r.txtosteomuscular, r.txtconclusionesradiograficas,"
                         + " r.txtobservacionesrt, r.txtcampospulm,l.txtobservacioneslb,"
                         + " l.txtcocaina,l.txtmarihuana,l.txtglucosabio,l.txtvsg,l.txtcreatininabio, CASE WHEN l.chko = 'TRUE' THEN 'O'"
                            + " WHEN l.chka = 'TRUE' THEN 'A'"
                            + " WHEN l.chkb = 'TRUE' THEN 'B'"
                            + " WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| "
                            + "CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' "
                            + " WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS Grupofactor ,"
                         + "m.o_d_500,m.o_d_1000,m.o_d_2000,m.o_d_3000,m.o_d_4000,m.o_d_6000,m.o_d_8000,"
                         + "m.o_i_500,m.o_i_1000,m.o_i_2000,m.o_i_3000,m.o_i_4000,m.o_i_6000,m.o_i_8000,m.diagnostico,funcion_abs.fvc,funcion_abs.fev1,"
                         + "funcion_abs.fev1fvc,funcion_abs.fef25_75,funcion_abs.interpretacion,ba.n_orden as ordenaltura,"
                         + " ba.b_c_observaciones as alturabarrick,bc.n_orden as ordencond,"
                         + "bc.b_c_observaciones as conduccion,ca.n_orden as numalt, ca.observaciones as certialtura "
                        + "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) "
                        + "INNER JOIN antecedentes_patologicos AS a ON(n.n_orden = a.n_orden) "
                        + "INNER JOIN triaje ON(n.n_orden = triaje.n_orden) "
                        + "INNER JOIN oftalmologia AS o ON(n.n_orden = o.n_orden)"
                        + "INNER JOIN funcion_abs ON(n.n_orden = funcion_abs.n_orden)"
                        + "INNER JOIN radiografia_torax AS r ON(n.n_orden = r.n_orden)"
                        + "INNER JOIN lab_clinico AS l ON(n.n_orden = l.n_orden)"
//                      + "INNER JOIN ex_radiograficos_sanguineos AS e ON(n.n_orden = e.n_orden)"
                        + "INNER JOIN odontograma ON(n.n_orden = odontograma.n_orden)"
                        + "INNER JOIN audiometria_po AS m ON(n.n_orden =m.n_orden)"
                         + "LEFT JOIN b_certificado_altura as ba ON(ba.n_orden = n.n_orden)"
                        + "LEFT JOIN b_certificado_conduccion as bc ON(bc.n_orden = n.n_orden)"
                        + "LEFT JOIN certificacion_medica_altura as ca ON(ca.n_orden = n.n_orden)"
                         + "WHERE n.n_orden ='" + txtNorden.getText().toString() + "'";
                
                oConn.FnBoolQueryExecute(Consulta);
                
                try {
                    if (oConn.setResult.next()) {
                        //oFunc.SubSistemaMensajeError(oConn.setResult.getString("txtobservaciones"));
                        if (oConn.setResult.getString("txtobservaciones") != null && !"NINGUNA".equals(oConn.setResult.getString("txtobservaciones")) ) {
                            txtObservacionesFichaMedica.append("-ODONTOGRAMA : " + oConn.setResult.getString("txtobservaciones").concat("\n"));
                            txtObservOdonto.setText(oConn.setResult.getString("txtobservaciones"));
                        }
                        //------radio
                       if(oConn.setResult.getString("txtvertices") != null && !"NO SE TOMÓ RX DE TORAX".equals(oConn.setResult.getString("txtvertices"))){
                           if (oConn.setResult.getString("txtvertices") != null && !"LIBRES".equals(oConn.setResult.getString("txtvertices"))) {
                            txtObservacionesFichaMedica.append( oConn.setResult.getString("txtvertices"));
                        }
                        if (oConn.setResult.getString("txthilios") != null && !"NORMALES".equals(oConn.setResult.getString("txthilios"))) {
                            txtObservacionesFichaMedica.append( oConn.setResult.getString("txthilios"));
                        }
                        
                        if (oConn.setResult.getString("txtsenoscostofrenicos") != null && !"LIBRES".equals(oConn.setResult.getString("txtsenoscostofrenicos"))) {
                            txtObservacionesFichaMedica.append(oConn.setResult.getString("txtsenoscostofrenicos"));
                        }
                        if (oConn.setResult.getString("txtcampospulm") != null && !"NORMALES".equals(oConn.setResult.getString("txtcampospulm"))) {
                            txtObservacionesFichaMedica.append( oConn.setResult.getString("txtcampospulm"));
                        }
                        if (oConn.setResult.getString("txtmediastinos") != null && !"NORMALES".equals(oConn.setResult.getString("txtmediastinos"))) {
                            txtObservacionesFichaMedica.append( oConn.setResult.getString("txtmediastinos"));
                        }
                        if (oConn.setResult.getString("txtsiluetacardiovascular") != null && !"NORMAL".equals(oConn.setResult.getString("txtsiluetacardiovascular"))) {
                            txtObservacionesFichaMedica.append(oConn.setResult.getString("txtsiluetacardiovascular"));
                        }
                        if (oConn.setResult.getString("txtosteomuscular") != null && !"NORMAL".equals(oConn.setResult.getString("txtosteomuscular"))) {
                            txtObservacionesFichaMedica.append(oConn.setResult.getString("txtosteomuscular"));
                        }
                        if (oConn.setResult.getString("txtconclusionesradiograficas") != null && !"NORMAL".equals(oConn.setResult.getString("txtconclusionesradiograficas"))) {
                            txtObservacionesFichaMedica.append( oConn.setResult.getString("txtconclusionesradiograficas"));
                        }
                        
                       }
                        if (oConn.setResult.getString("txtobservacionesrt") != null && !"NORMAL".equals(oConn.setResult.getString("txtobservacionesrt"))) {
                            txtObservacionesFichaMedica.append(oConn.setResult.getString("txtobservacionesrt").concat("\n"));
                        }
                        //-----
                        if (oConn.setResult.getString("txtobservacioneslb") != null ) {
                            txtObservacionesFichaMedica.append(oConn.setResult.getString("txtobservacioneslb"));
                        }
                        if (oConn.setResult.getString("alturabarrick") != null  ) {
                            txtObservacionesFichaMedica.append(oConn.setResult.getString("alturabarrick").concat("\n"));
                        }else if (oConn.setResult.getString("certialtura") != null ) {
                            txtObservacionesFichaMedica.append(oConn.setResult.getString("certialtura").concat("\n"));
                        
                        }
                        if(oConn.setResult.getString("ordenaltura")== null && oConn.setResult.getString("numalt")== null){
                            if (oConn.setResult.getString("conduccion") != null ) {
                            txtObservacionesFichaMedica.append(oConn.setResult.getString("conduccion").concat("\n"));
                        }
                        }
                        
                         
                         String coca=oConn.setResult.getString("txtcocaina");
                         String marig=oConn.setResult.getString("txtmarihuana");
                         if("REACTIVO".equals(coca)){
                             txtObservacionesFichaMedica.append("- TEST DE COCAINA: " + coca.concat(" COLABORADOR DE LA COMUNIDAD, CONSUME HOJA DE COCA.\n"));
                             txtCoca.setForeground(Color.red);
                             txtCoca.setText(coca);
                         }else {//txtObservacionesFichaMedica.append("-COCAINA: " + coca.concat("\n"));
                            txtCoca.setText(coca);
                         }
                         if("REACTIVO".equals(marig)){
                              txtObservacionesFichaMedica.append("-MARIHUANA: " + marig.concat(" COLABORADOR DE LA COMUNIDAD, CONSUME HOJA DE COCA.\n"));
                             txtMarig.setForeground(Color.red);
                             txtMarig.setText(marig);
                         }else{//txtObservacionesFichaMedica.append("-MARIHUANA: " + marig.concat("\n"));
                            txtMarig.setText(marig);
                         }
                           String vsg=oConn.setResult.getString("txtvsg");
                            String gluc=oConn.setResult.getString("txtglucosabio");
                            String creat=oConn.setResult.getString("txtcreatininabio");
                            
                            txtVSG.setText(vsg);
                            txtGlucosaBio.setText(gluc);
                            txtCreatininaBio.setText(creat);
                                if(!txtGlucosaBio.getText().isEmpty()&& !"N/A".equals(txtGlucosaBio.getText())){
                                 float glucosa = Float.parseFloat(txtGlucosaBio.getText().toString());
                                     if (glucosa >= 110 || glucosa < 70) {
                                         txtGlucosaBio.setForeground(Color.red);
                                     } else {
                                         txtGlucosaBio.setForeground(Color.black);
                                     }
                                } 
                            
                            
                        
                           if (!txtCreatininaBio.getText().isEmpty()&& !"N/A".equals(txtCreatininaBio.getText())) {
                                float cretinina = Float.parseFloat(txtCreatininaBio.getText().toString());
                                if (cretinina >= 1.4 || cretinina < 0.8) {
                                    txtCreatininaBio.setForeground(Color.red);
                                } else {
                                    txtCreatininaBio.setForeground(Color.black);
                                }
                           } 
                        
                        
                         //modi
//                        if (oConn.setResult.getString("txtobservacionesrs") != null) {
//                            txtObservacionesFichaMedica.append("-EX. RX SANGUINEOS : " + oConn.setResult.getString("txtobservacionesrs").concat("\n"));
//                        }
                        //txtObservacionesFichaMedica.append(oConn.setResult.getString("txtobservaciones")== null ? "":"-Odontograma : "+ oConn.setResult.getString("txtobservaciones").concat("\n"));
                        //txtObservacionesFichaMedica.append(oConn.setResult.getString("txtobservacionesrt")== null ? "":"-Radiografia : "+ oConn.setResult.getString("txtobservacionesrt").concat("\n"));
                        //txtObservacionesFichaMedica.append(oConn.setResult.getString("txtobservacioneslb")== null ? "":"-Laboratorio Clinico: "+ oConn.setResult.getString("txtobservacioneslb").concat("\n"));
                        //.append(oConn.setResult.getString("txtobservacionesrs")== null ? "":"-Ex.Radiografico Sanguineo : "+ oConn.setResult.getString("txtobservacionesrs").concat("\n"));
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
                            tbRsi.setSelected(true);
                        }
                        txtArea.setText(oConn.setResult.getString("area_o"));
                        txtGFSPrevio.setText(oConn.setResult.getString("grupofactorsan"));
                        txtFVC.setText(oConn.setResult.getString("fvc"));
                        if(!txtFVC.getText().isEmpty() && !"N/A".equals(txtFVC.getText().toString())){
                            float fvc=Float.parseFloat(txtFVC.getText().toString());
                            if(fvc >=80){
                                txtConclusion.append("-NORMAL");
                            }else{
                                txtConclusion.append("-PATRON RESTRICTIVO" +'\n' );
//                                txtInterpretacion.append("-PATRON RESTRICTIVO"+ '\n');
                                txtObservacionesFichaMedica.append("-PATRON RESTRICTIVO LEVE.EVALUACION EN 6 MESES." + '\n' );
                            } 
                        }
                       
                        txtFEV1.setText(oConn.setResult.getString("fev1"));
                        txtFEV1FVC.setText(oConn.setResult.getString("fev1fvc"));
                        if("N/A".equals(txtFVC.getText().toString())){
                           txtObservacionesFichaMedica.append("-NO PASO EXAMEN DE ESPIROMETRIA." + '\n' ); 
                        }else{
                            if(!txtFEV1FVC.getText().isEmpty()&&!"N/A".equals(txtFVC.getText().toString())){
                           float fev1fvc=Float.parseFloat(txtFEV1FVC.getText().toString());
                           if(fev1fvc >=70.0){
                               if(!"-NORMAL".equals(txtConclusion.getText().toString())){
                                   txtConclusion.append("-NORMAL" + '\n');
                               }
                           }else{
                               txtConclusion.append("-PATRON OBSTRUCTIVO"+ '\n');
                               txtObservacionesFichaMedica.append("-PATRON OBSTRUCTIVO LEVE. EVALUACION EN 6 MESES." + '\n' );
                           } 
                        } 
                        }
                       
                        txtFEF2575.setText(oConn.setResult.getString("fef25_75"));
//                        txtConclusion.setText(oConn.setResult.getString("interpretacion"));
                        txtMalEstado.setText(oConn.setResult.getString("txtpiezasmalestado"));
                        if(!txtMalEstado.getText().isEmpty()){
                            float malEstado = Float.parseFloat(txtMalEstado.getText().toString());
                            if (malEstado >=1) {
                            txtObservacionesFichaMedica.append("-CARIES DENTAL.TTO.EVALUACION EN 6 MESES." + '\n');
                            }
                        }
                        txtFaltan.setText(oConn.setResult.getString("txtausentes"));
                        if (txtSexo.getText().equals("M")) {
                            txtHijosvivos.setText(oConn.setResult.getString("txtvhijosvivos") == null ? "0" : oConn.setResult.getString("txtvhijosvivos"));
                            txtHijosMuertos.setText(oConn.setResult.getString("txtvhijosfallecidos") == null ? "0" : oConn.setResult.getString("txtvhijosfallecidos"));
                        } else {
                            txtHijosvivos.setText(oConn.setResult.getString("txtdhijosvivos") == null ? "0" : oConn.setResult.getString("txtdhijosvivos"));
                            txtHijosMuertos.setText(oConn.setResult.getString("txtdhijosfallecidos") == null ? "0" : oConn.setResult.getString("txtdhijosfallecidos"));
                        }
                        txtIMC.setText(oConn.setResult.getString("imc"));
                    if(oConn.setResult.getString("ordenaltura")== null && oConn.setResult.getString("ordencond")== null 
                            && oConn.setResult.getString("numalt")== null){
                       if(!txtIMC.getText().isEmpty()){
                           float imc = Float.parseFloat(txtIMC.getText().toString());
                            txtIMC.setForeground(Color.black);
                            if (imc >= 25 && imc < 30) {
                                txtIMC.setForeground(Color.red);
                                txtObservacionesFichaMedica.append("-SOBREPESO:DIETA HIPOCALORICA Y EJERCICIOS." + '\n');
                            } else if (imc >= 30 && imc < 35) {
                                txtIMC.setForeground(Color.red);
                                txtObservacionesFichaMedica.append("-OBESIDAD I.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS" + '\n');
                            } else if (imc >= 35 && imc < 40) {
                                txtIMC.setForeground(Color.red);
                                txtObservacionesFichaMedica.append("-OBESIDAD II.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS.EVALUACION POR ENDOCRINOLOGIA Y CARDIOLOGO" + '\n');
                            } else if(imc>=40 && imc<45){
                                txtObservacionesFichaMedica.append("-OBESIDAD III.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS.EVALUACION POR ENDOCRINOLOGIA Y CARDIOLOGO" + '\n');
                            }else if(imc>=45 && imc<50){
                                txtObservacionesFichaMedica.append("OBESIDAD IV.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS.EVALUACION POR ENDOCRINOLOGIA Y CARDIOLOGO" + '\n');
                            }
                        }
                       
                     }
                        chkTPoco.setSelected(oConn.setResult.getBoolean("rbfumarsi"));
                        chkAPoco.setSelected(oConn.setResult.getBoolean("rblicorsi"));
                        txtTalla.setText(oConn.setResult.getString("talla"));
                        txtPeso.setText(oConn.setResult.getString("peso"));
                        txtPerimetro.setText(oConn.setResult.getString("perimetro_cuello"));
                        txtTemperatura.setText(oConn.setResult.getString("temperatura"));
                        txtCintura.setText(oConn.setResult.getString("cintura"));
                        txtCadera.setText(oConn.setResult.getString("cadera"));
                        txticc.setText(oConn.setResult.getString("icc"));
                        txtFrespiratoria.setText(oConn.setResult.getString("f_respiratoria"));
                        txtFcardiaca.setText(oConn.setResult.getString("f_cardiaca"));
                        txtSatO2.setText(oConn.setResult.getString("sat_02"));
                        String sistolica=oConn.setResult.getString("sistolica");
                        String diastolica=oConn.setResult.getString("diastolica");
                        txtSistolica.setText(sistolica);
                        txtDiastolica.setText(diastolica);
//                        txtConclusion.setText(oConn.setResult.getString("interpretacion"));
                        //
                        txtGrupoFacLab.setText(oConn.setResult.getString("Grupofactor"));
                       
                        
//                        txtCercaSinCorregirOD.setText(oConn.setResult.getString("v_cerca_s_od"));
//                        txtCercaSinCorregirOI.setText(oConn.setResult.getString("v_cerca_s_oi"));
//                        txtCercaCorregidaOD.setText(oConn.setResult.getString("v_cerca_c_od"));
//                        txtCercaCorregidaOI.setText(oConn.setResult.getString("v_cerca_c_oi"));
//                        txtLejosSinCorregirOD.setText(oConn.setResult.getString("v_lejos_s_od"));
//                        txtLejosSinCorregirOI.setText(oConn.setResult.getString("v_lejos_s_oi"));
//                        txtLejosCorregidaOD.setText(oConn.setResult.getString("v_lejos_c_od"));
//                        txtLejosCorregidaOI.setText(oConn.setResult.getString("v_lejos_c_oi"));
//                        txtVisionColores.setText(oConn.setResult.getString("v_colores"));
//                        txtBinocular.setText(oConn.setResult.getString("v_binocular"));
//                        oFunc.SubSistemaMensajeError(oConn.setResult.getString("e_oculares"));
                       
                        if (oConn.setResult.getString("e_oculares") != null  ) {
                            txtEnfermedadesOculares.setText(oConn.setResult.getString("e_oculares"));
                        }else{
                            txtEnfermedadesOculares.setText("NINGUNA");
                        }
                        if (oConn.setResult.getString("e_oculares1") != null ) {
                            txtEnfermedadesOculares1.setText(oConn.setResult.getString("e_oculares1"));
                        }else{
                            txtEnfermedadesOculares1.setText("NINGUNA");
                        }
//                     diagnosticoOftalmologia();
                        if(!"NINGUNA".equals(txtEnfermedadesOculares.getText().toString())  && 
                                    !txtEnfermedadesOculares.getText().isEmpty() ){
                                txtObservacionesFichaMedica.append("- "+txtEnfermedadesOculares.getText().toString() + '\n');
                        }
                        
                        if("PTERIGION BILATERAL".equals(txtEnfermedadesOculares1.getText().toString())){
                            txtObservacionesFichaMedica.append("- PTERIGION BILATERAL:EVALUACION X OFTALMOLOGIA." + '\n');
                        }else if(!"NINGUNA".equals(txtEnfermedadesOculares1.getText().toString()) && !txtEnfermedadesOculares1.getText().isEmpty()){
                                txtObservacionesFichaMedica.append(txtEnfermedadesOculares1.getText().toString().concat(":EVALUACION X OFTALMOLOGIA.") + '\n');
                        }
                       
                        //************************************************************
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
                       
                         //************************************************************
                        if(!txtOD500.getText().isEmpty() && !"N/A".equals(txtOD500.getText())&&!"NORMAL".equals(txtOD500.getText())){
                           txtObservacionAudio.setText(oConn.setResult.getString("diagnostico").concat(".USO DE EPP AUDITIVO.EVALUACION ANUAL "));
                        }else if("N/A".equals(txtOD500.getText())|| txtOD500.getText().isEmpty()){
                            txtObservacionAudio.setText(null);
                             txtObservacionAudio.append("NO PASO EXAMEN AUDIOMETRIA." + '\n');
                        }
                         //************************************************************
                       oPu.fecha(FechaFicha);
                      
                       
                       if(txtGrupoFacLab.getText() == null ? txtGFSPrevio.getText() == null : !txtGrupoFacLab.getText().equals(txtGFSPrevio.getText())){
                            oFunc.SubSistemaMensajeError("Grupo Sanguinio incongruente por favotr revisar");
                        }   
                       muestraVisual();
                       electroCardiograma();
                       cargarExamSanguineos();
                       examenOrina();
                       cargarAnalisisB();
                       
                        if(!"NINGUNA".equals(txtVisionColores.getText())&& !"NORMAL".equals(txtVisionColores.getText())){
                                txtObservacionesFichaMedica.append("- "+txtVisionColores.getText().toString() + '\n');
                        }
                        if (!"".equals(sistolica) && !"".equals(diastolica)) {
                            float sistolica1 = Float.parseFloat(sistolica);
                            float diastolica1 = Float.parseFloat(diastolica);
                         
                            if (sistolica1 >= 140 || diastolica1 >= 90) {
                                txtObservacionesFichaMedica.append("- HTA NO CONTROLADA." + '\n');
                            } 
                        }
                       
//                       if (txtOtrosEx.getText().toString() != null ) {
//                            txtObservacionesFichaMedica.append(txtOtrosEx.getText().toString());
//                       }
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
                        txtBinocular.setText(oConn.setResult.getString("VB"));
                        txtReflejosPupilares.setText(oConn.setResult.getString("RP"));
                        
                       txtEnfermedadesOculares.setText(oConn.setResult.getString("e_oculares"));
                        
                       
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registros en oftalmologia");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
            }
        
    }
    public void diagnosticoOftalmologia(){
        String vcercasod = txtCercaSinCorregirOD.getText();
        String vcercasoi = txtCercaSinCorregirOI.getText();
        String vcercacod = txtCercaCorregidaOD.getText();
        String vcercacoi = txtCercaCorregidaOI.getText();
        String vlejossod = txtLejosSinCorregirOD.getText();
        String vlejossoi = txtLejosSinCorregirOI.getText();
        String vlejoscod = txtLejosCorregidaOD.getText();
        String vlejoscoi = txtLejosCorregidaOI.getText();
        String tipoDiagnostico = null;
        String tipoDiagnostico1 = null;
        //****************************************************************
        if((!vcercasod.equals("20/20") && !vcercasoi.equals("20/20")) || 
              (!vcercasod.equals("20/20-1") && !vcercasoi.equals("20/20-1"))||
              (!vcercasod.equals("20/20-2") && !vcercasoi.equals("20/20-2"))|| 
              (!vcercasod.equals("20/20-3") && !vcercasoi.equals("20/20-3"))|| 
              (!vcercasod.equals("20/20-1") && !vcercasoi.equals("20/20"))||
              (!vcercasod.equals("20/20") && !vcercasoi.equals("20/20-1"))|| 
              (!vcercasod.equals("20/20") && !vcercasoi.equals("20/20-2"))|| 
              (!vcercasod.equals("20/20-2") && !vcercasoi.equals("20/20"))|| 
              (!vcercasod.equals("20/20") && !vcercasoi.equals("20/20-3"))|| 
              (!vcercasod.equals("20/20-3") && !vcercasoi.equals("20/20"))|| 
              (!vcercasod.equals("20/20-1") && !vcercasoi.equals("20/20-2"))|| 
              (!vcercasod.equals("20/20-2") && !vcercasoi.equals("20/20-1"))|| 
              (!vcercasod.equals("20/20-1") && !vcercasoi.equals("20/20-3"))|| 
              (!vcercasod.equals("20/20-3") && !vcercasoi.equals("20/20-1"))|| 
              (!vcercasod.equals("20/20-2") && !vcercasoi.equals("20/20-3"))|| 
              (!vcercasod.equals("20/20-3") && !vcercasoi.equals("20/20-2"))){
            if(vcercacod.equals("00") && vcercacoi.equals("00") ){
                tipoDiagnostico=" NO CORREGIDA";
            }else if(!vcercacod.equals("00") && !vcercacoi.equals("00")){
                if(vcercacod.equals("20/20") && vcercacoi.equals("20/20") || 
                    vcercacod.equals("20/20-1") && vcercacoi.equals("20/20-1") || 
                    vcercacod.equals("20/20-2") && vcercacoi.equals("20/20-2") || 
                    vcercacod.equals("20/20-3") && vcercacoi.equals("20/20-3") || 
                    (vcercacod.equals("20/20-1") && vcercacoi.equals("20/20"))||
                    (vcercacod.equals("20/20") && vcercacoi.equals("20/20-1"))|| 
                    (vcercacod.equals("20/20") && vcercacoi.equals("20/20-2"))|| 
                    (vcercacod.equals("20/20-2") && vcercacoi.equals("20/20"))|| 
                    (vcercacod.equals("20/20") && vcercacoi.equals("20/20-3"))|| 
                    (vcercacod.equals("20/20-3") && vcercacoi.equals("20/20"))|| 
                    (vcercacod.equals("20/20-1") && vcercacoi.equals("20/20-2"))|| 
                    (vcercacod.equals("20/20-2") && vcercacoi.equals("20/20-1"))|| 
                    (vcercacod.equals("20/20-1") && vcercacoi.equals("20/20-3"))|| 
                    (vcercacod.equals("20/20-3") && vcercacoi.equals("20/20-1"))|| 
                    (vcercacod.equals("20/20-2") && vcercacoi.equals("20/20-3"))|| 
                    (vcercacod.equals("20/20-3") && vcercacoi.equals("20/20-2"))){
                    tipoDiagnostico=" CORREGIDA";
                }
            }else if(!vcercacod.equals("00") && !vcercacoi.equals("00")){
                if(!vcercacod.equals("20/20") || !vcercacoi.equals("20/20") || 
                    !vcercacod.equals("20/20-1") || !vcercacoi.equals("20/20-1") || 
                    !vcercacod.equals("20/20-2") || !vcercacoi.equals("20/20-2") || 
                    !vcercacod.equals("20/20-3") || !vcercacoi.equals("20/20-3") ){
                    tipoDiagnostico=" PARCIALMENTE CORREGIDA";
                }
                
            }
            
        } 
       if((!vlejossod.equals("20/20") && !vlejossoi.equals("20/20")) || 
              (!vlejossod.equals("20/20-1") && !vlejossoi.equals("20/20-1"))||
              (!vlejossod.equals("20/20-2") && !vlejossoi.equals("20/20-2"))|| 
              (!vlejossod.equals("20/20-3") && !vlejossoi.equals("20/20-3"))|| 
              (!vlejossod.equals("20/20-1") && !vlejossoi.equals("20/20"))||
              (!vlejossod.equals("20/20") && !vlejossoi.equals("20/20-1"))|| 
              (!vlejossod.equals("20/20") && !vlejossoi.equals("20/20-2"))|| 
              (!vlejossod.equals("20/20-2") && !vlejossoi.equals("20/20"))|| 
              (!vlejossod.equals("20/20") && !vlejossoi.equals("20/20-3"))|| 
              (!vlejossod.equals("20/20-3") && !vlejossoi.equals("20/20"))|| 
              (!vlejossod.equals("20/20-1") && !vlejossoi.equals("20/20-2"))|| 
              (!vlejossod.equals("20/20-2") && !vlejossoi.equals("20/20-1"))|| 
              (!vlejossod.equals("20/20-1") && !vlejossoi.equals("20/20-3"))|| 
              (!vlejossod.equals("20/20-3") && !vlejossoi.equals("20/20-1"))|| 
              (!vlejossod.equals("20/20-2") && !vlejossoi.equals("20/20-3"))|| 
              (!vlejossod.equals("20/20-3") && !vlejossoi.equals("20/20-2"))){
            if(vlejoscod.equals("00") && vlejoscoi.equals("00") ){
                tipoDiagnostico1=" NO CORREGIDA";
            }else if(!vlejoscod.equals("00") && !vlejoscoi.equals("00")){
                if(vlejoscod.equals("20/20") && vlejoscoi.equals("20/20") || 
                    vlejoscod.equals("20/20-1") && vlejoscoi.equals("20/20-1") || 
                    vlejoscod.equals("20/20-2") && vlejoscoi.equals("20/20-2") || 
                    vlejoscod.equals("20/20-3") && vlejoscoi.equals("20/20-3") || 
                    (vlejoscod.equals("20/20-1") && vlejoscoi.equals("20/20"))||
                    (vlejoscod.equals("20/20") && vlejoscoi.equals("20/20-1"))|| 
                    (vlejoscod.equals("20/20") && vlejoscoi.equals("20/20-2"))|| 
                    (vlejoscod.equals("20/20-2") && vlejoscoi.equals("20/20"))|| 
                    (vlejoscod.equals("20/20") && vlejoscoi.equals("20/20-3"))|| 
                    (vlejoscod.equals("20/20-3") && vlejoscoi.equals("20/20"))|| 
                    (vlejoscod.equals("20/20-1") && vlejoscoi.equals("20/20-2"))|| 
                    (vlejoscod.equals("20/20-2") && vlejoscoi.equals("20/20-1"))|| 
                    (vlejoscod.equals("20/20-1") && vlejoscoi.equals("20/20-3"))|| 
                    (vlejoscod.equals("20/20-3") && vlejoscoi.equals("20/20-1"))|| 
                    (vlejoscod.equals("20/20-2") && vlejoscoi.equals("20/20-3"))|| 
                    (vlejoscod.equals("20/20-3") && vlejoscoi.equals("20/20-2"))){
                  tipoDiagnostico1=" CORREGIDA";
                }
            }else if(!vlejoscod.equals("00") && !vlejoscoi.equals("00")){
                if(!vlejoscod.equals("20/20") || !vlejoscoi.equals("20/20") || 
                    !vlejoscod.equals("20/20-1") || !vlejoscoi.equals("20/20-1") || 
                    !vlejoscod.equals("20/20-2") || !vlejoscoi.equals("20/20-2") || 
                    !vlejoscod.equals("20/20-3") || !vlejoscoi.equals("20/20-3") ){
                    tipoDiagnostico1=" PARCIALMENTE CORREGIDA";
                }
            }
        } 
       String dvisioncerca = txtEnfermedadesOculares.getText().toString();
//       String dvisionlejos = txtEnfermedadesOculares2.getText().toString();
//       if(!txtEnfermedadesOculares.getText().isEmpty()){
//           dvisioncerca=txtEnfermedadesOculares.getText().toString();
//       }
//       if(!txtEnfermedadesOculares2.getText().isEmpty()){
//           dvisionlejos=txtEnfermedadesOculares2.getText().toString();
//       }
       if(!"NINGUNA".equals(dvisioncerca)  && !txtEnfermedadesOculares.getText().isEmpty() ){
           txtObservacionesFichaMedica.append(dvisioncerca.concat(tipoDiagnostico) + '\n');
       }
        //************************************************************

    }
    public void diagnosticoAudio(){
    
        float od500=Float.parseFloat(txtOD500.getText());
        float od1000=Float.parseFloat(txtOD1000.getText());
        float od2000=Float.parseFloat(txtOD2000.getText());
        float od3000=Float.parseFloat(txtOD3000.getText());
        float od4000=Float.parseFloat(txtOD4000.getText());
        float od6000=Float.parseFloat(txtOD6000.getText());
        float od8000=Float.parseFloat(txtOD8000.getText());
        float oi500=Float.parseFloat(txtOI500.getText());
        float oi1000=Float.parseFloat(txtOI1000.getText());
        float oi2000=Float.parseFloat(txtOI2000.getText());
        float oi3000=Float.parseFloat(txtOI3000.getText());
        float oi4000=Float.parseFloat(txtOI4000.getText());
        float oi6000=Float.parseFloat(txtOI6000.getText());
        float oi8000=Float.parseFloat(txtOI8000.getText());
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
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO  MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO  MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO  LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionAudio.append("NORMAL");    
            }
        }else if((may>=26 && may<=40)){
            if( may1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        } else if(may>=41 && may<=55){
            if( may1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }else if(may>=56 && may<=70){
            if(may1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }else if(may>=71 && may<=90){
            if( may1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL  \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }else if(may>=90  ){
            if( may1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionAudio.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionAudio.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionAudio.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionAudio.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }

//                 } else {
//                     oFunc.SubSistemaMensajeInformacion("Falto llenar ficha de electrocardiograma");
//                 }
//            } catch (SQLException ex) {
//            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
//            }  
        
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
        int cont=0;
        int cont1=0;
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
        }else{
            txtObservacionAudio.setText("NORMAL");
        }
        if(oi500>25 || oi1000>25 || oi2000>25 || oi3000>25 || oi4000>25 || oi6000>25 || oi8000>25){
            prom1=may1/cont1;
        }else{
            txtObservacionAudio.setText("NORMAL");
        }
        if(prom>=-10 && prom<=25  ){
            if( prom1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=71 && prom1<=90){
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=56 && prom1<=70){
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO  MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=41 && prom1<=55){
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO  MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=26 && prom1<=40){
                txtObservacionAudio.append("- HIPOACUSIA IZQUIERDO  LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(prom1>=-10 && prom1<=25){
                txtObservacionAudio.append("NORMAL");    
            }
        }else if((prom>=26 && prom<=40)){
            if( prom1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=71 && prom1<=90){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=56 && prom1<=70){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=41 && prom1<=55){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=26 && prom1<=40){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(prom1>=-10 && prom1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        } else if(prom>=41 && prom<=55){
            if( prom1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=71 && prom1<=90){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=56 && prom1<=70){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=41 && prom1<=55){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=26 && prom1<=40){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(prom1>=-10 && prom1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }else if(prom>=56 && prom<=70){
            if(prom1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=71 && prom1<=90){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=56 && prom1<=70){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=41 && prom1<=55){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=26 && prom1<=40){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(prom1>=-10 && prom1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }else if(prom>=71 && prom<=90){
            if( prom1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=71 && prom1<=90){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=56 && prom1<=70){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=41 && prom1<=55){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=26 && prom1<=40){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL  \n");    
            }else if(prom1>=-10 && prom1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }else if(prom>=90  ){
            if( prom1>=90 ){
                txtObservacionAudio.append("- HIPOACUSIA BILATERAL PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=71 && prom1<=90){
                txtObservacionAudio.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=56 && prom1<=70){
                txtObservacionAudio.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=41 && prom1<=55){
                txtObservacionAudio.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(prom1>=26 && prom1<=40){
                txtObservacionAudio.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(prom1>=-10 && prom1<=25){
                txtObservacionAudio.append("- HIPOACUSIA DERECHO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }    
}
    void actualizar(){
        if (!txtNorden.getText().isEmpty()) {
            if (Orden()) {
                String sql="UPDATE anexo7c SET fecha='"+FechaFicha.getDate()+
                    "',chkruido='"+chkRuido.isSelected()+
                    "',chkpolvo='"+chkPolvo.isSelected() +
                    "',chkvidsegmentario='"+chkVidSegmentario.isSelected()+
                    "',chkvidtotal='"+chkVidTotal.isSelected()+
                    "',chkcancerigenos='"+chkCancerigenos.isSelected()+
                    "',chkmutagenicos='"+chkMutagenicos.isSelected()+
                    "',chksolventes='"+chkSolventes.isSelected()+
                    "',chkmetales='"+chkMetales.isSelected()+
                    "',chktemperatura='"+chkTemperatura.isSelected()+
                    "',chkbiologicos='"+chkBiologicos.isSelected()+
                    "',chkposturas='"+chkPosturas.isSelected()+
                    "',chkturnos='"+chkTurnos.isSelected()+
                    "',chkcargas='"+chkCargas.isSelected()+
                    "',chkmovrepet='"+chkMovRepet.isSelected()+
                    "',chkpvd='"+chkPVD.isSelected()+
                    "',chkotros='"+chkOtros.isSelected()+
                    "',tbrsi='"+tbRsi.isSelected()+
                    "',rbrno='"+rbRno.isSelected()+
                    "',chktnada='"+chkTNada.isSelected()+
                    "',chktpoco='"+chkTPoco.isSelected()+
                    "',chkthabitual='"+chkTHabitual.isSelected() +
                    "',chktexcesivo='"+chkTExcesivo.isSelected()+
                    "',chkanada='"+chkANada.isSelected()+
                    "',chkapoco='"+chkAPoco.isSelected()+
                    "',chkahabitual='"+chkAHabitual.isSelected()+
                    "',chkaexcesivo='"+chkAExcesivo.isSelected()+
                    "',chkdnada='"+chkDNada.isSelected()+
                    "',chkdpoco='"+chkDPoco.isSelected()+
                    "',chkdhabitual='"+chkDHabitual.isSelected()+
                    "',chkdexcesivo='"+chkDExcesivo.isSelected()+
                    "',txtpuestoactual='"+txtPuestoActual.getText().toString()+
                    "',txttiempo='"+txtTiempo.getText().toString()+
                    "',txtantecedentespersonales='"+txtAntecedentesPersonales.getText().toString()+
                    "',txtantecedentesfamiliares='"+txtAntecedentesFamiliares.getText().toString()+
                    "',txthijosvivos='"+txtHijosvivos.getText().toString()+
                    "',txthijosmuertos='"+txtHijosMuertos.getText().toString()+
                    "',txtcabeza='"+txtcabeza.getText().toString()+
                    "',txtnariz='"+txtNariz.getText().toString()+
                    "',txtcuello='"+txtCuello.getText().toString()+
                    "',txtperimetro='"+txtPerimetro.getText().toString()+
                    "',txtb_a_f_l='"+txtB_A_F_L.getText().toString()+
                    "',txtvisioncolores='"+txtVisionColores.getText().toString()+
                    "',txtenfermedadesoculares='"+txtEnfermedadesOculares.getText().toString()+
                    "',txtreflejospupilares='"+txtReflejosPupilares.getText().toString()+
                    "',txtbinocular='"+txtBinocular.getText().toString()+
                    "',txtod='"+txtOD.getText().toString()+
                    "',txtoi='"+txtOI.getText().toString()+
                    "',txttorax='"+txtTorax.getText().toString()+
                    "',txtcorazon='"+txtCorazon.getText().toString()+
                    "',rbnormal='"+rbNormal.isSelected()+
                    "',rbanormal='"+rbAnormal.isSelected()+
                    "',txtpulmones='"+txtPulmones.getText().toString()+
                    "',txtmiembrossuperiores='"+txtMiembrosSuperiores.getText().toString()+
                    "',txtmiembrosinferiores='"+txtMiembrosInferiores.getText().toString()+
                    "',txtreflejososteotendinosos='"+txtReflejosOsteotendinosos.getText().toString()+
                    "',txtmarcha='"+txtMarcha.getText().toString()+
                    "',txtcolumnavertebral='"+txtcolumnaVertebral.getText().toString()+
                    "',txtabdomen='"+txtAbdomen.getText().toString()+
                    "',txtanillosinguinales='"+txtAnillosInguinales.getText().toString()+
                    "',txtorganosgenitales='"+txtOrganosGenitales.getText().toString()+
                    "',rbtnohizo='"+rbTNoHizo.isSelected()+
                    "',rbtnormal='"+rbTNormal.isSelected()+
                    "',rbtanormal='"+rbTAnormal.isSelected()+
                    "',chkdescribirobservacion='"+chkDescribirObservacion.isSelected()+
                    "',txthernias='"+txtHernias.getText().toString()+
                    "',txtvarices='"+txtVarices.getText().toString()+
                    "',txtganglios='"+txtGanglios.getText().toString()+
                    "',txtlenguage='"+txtLenguage.getText().toString();
                 if ("N/A".equals(txtOD500.getText())&&"NORMAL".equals(txtObservacionAudio.getText())) {
                    sql+="',txtobservacionesfm='"+txtObservacionesFichaMedica.getText().toString()+"\n"+txtObservacionAudio.getText().toString();
                }else{
                     sql+="',txtobservacionesfm='"+txtObservacionesFichaMedica.getText().toString();
                 }
                    
                   sql+= "',txtconclusion='"+txtConclusion.getText().toString()+
                    "',tetano='"+chkTetano.isSelected()+
                    "',hepatitisb='"+chkHepatitisB.isSelected()+
                    "',fiebreamarilla='"+chkFiebreAmarilla.isSelected()+
                    "',txtedad='"+txtEdad.getText().toString()+
                    "',txtdiagnosticoaudio='"+txtObservacionAudio.getText().toString()+
                    "',txtenfermedadesoculares2='"+txtEnfermedadesOculares1.getText().toString()+
                    "' WHERE n_orden='"+txtNorden.getText().toString()+"'";
                if (oConn.FnBoolQueryExecuteUpdate(sql)) {
                    ActualizarRadiograSan();
                    oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                    txtEOrden.setText(txtNorden.getText().toString());
                    Busca();
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
    private void electroCardiograma(){
   
   String Sql="select hallazgo,recomendaciones from informe_electrocardiograma " +
                "where n_orden='"+txtNorden.getText().toString()+"'";
               oConn.FnBoolQueryExecute(Sql);
             
             try {
                  if (oConn.setResult.next()) {

                     if ((oConn.setResult.getString("hallazgo") != null && !"NORMAL.".equals(oConn.setResult.getString("hallazgo")) )) {
                         if( oConn.setResult.getString("recomendaciones") != null ){
                               txtObservacionesFichaMedica.append("-ELECTROCARDIOGRAMA: " + oConn.setResult.getString("hallazgo")+ "."+
                                 oConn.setResult.getString("recomendaciones")+"\n");
                         }else{
                             txtObservacionesFichaMedica.append("-ELECTROCARDIOGRAMA: " + oConn.setResult.getString("hallazgo")+ "\n");
                         }
                       
                     }

                 } else {
                     oFunc.SubSistemaMensajeInformacion("Falto llenar ficha de electrocardiograma");
                 }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
            }  
  }
    private void llenar() {
        String oSql = "select * from anexo7c";
        oConn.FnBoolQueryExecute(oSql);
        try {
            if (oConn.setResult.next()) {
                FechaFicha.setDate(oConn.setResult.getDate("fecha"));
            }
        } catch (Exception e) {
        }
    }

    private boolean Agregar() {
        Boolean r = false;

        if (!txtNorden.getText().isEmpty()) {
            if (!Orden()) {
                String insert = "INSERT INTO anexo7c(n_orden, fecha, chkruido, chkpolvo, chkvidsegmentario, "
                        + " chkvidtotal, chkcancerigenos, chkmutagenicos, chksolventes, chkmetales, "
                        + " chktemperatura, chkbiologicos, chkposturas, chkturnos, chkcargas, "
                        + " chkmovrepet, chkpvd, chkotros, tbrsi, rbrno, chktnada, chktpoco, "
                        + " chkthabitual, chktexcesivo, chkanada, chkapoco, chkahabitual, "
                        + " chkaexcesivo, chkdnada, chkdpoco, chkdhabitual, chkdexcesivo";
                String values = "VALUES ('" + txtNorden.getText().toString() + "','" + FechaFicha.getDate() + "','" + chkRuido.isSelected() + "','" + chkPolvo.isSelected() + "','" + chkVidSegmentario.isSelected() + "'";
                values += ",'" + chkVidTotal.isSelected() + "','" + chkCancerigenos.isSelected() + "','" + chkMutagenicos.isSelected() + "','" + chkSolventes.isSelected() + "','" + chkMetales.isSelected() + "'";
                values += ",'" + chkTemperatura.isSelected() + "','" + chkBiologicos.isSelected() + "','" + chkPosturas.isSelected() + "','" + chkTurnos.isSelected() + "','" + chkCargas.isSelected() + "'";
                values += ",'" + chkMovRepet.isSelected() + "','" + chkPVD.isSelected() + "','" + chkOtros.isSelected() + "','" + tbRsi.isSelected() + "','" + rbRno.isSelected() + "','" + chkTNada.isSelected() + "','" + chkTPoco.isSelected() + "'";
                values += ",'" + chkTHabitual.isSelected() + "','" + chkTExcesivo.isSelected() + "','" + chkANada.isSelected() + "','" + chkAPoco.isSelected() + "','" + chkAHabitual.isSelected() + "'";
                values += ",'" + chkAExcesivo.isSelected() + "','" + chkDNada.isSelected() + "','" + chkDPoco.isSelected() + "','" + chkDHabitual.isSelected() + "','" + chkDExcesivo.isSelected() + "'";
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

                insert += ",tetano,hepatitisb,fiebreamarilla ";
                values += ",'" + chkTetano.isSelected() + "','" + chkHepatitisB.isSelected() + "','" + chkFiebreAmarilla.isSelected() + "'";

                if (!txtHijosvivos.getText().isEmpty()) {
                    insert += ",txthijosvivos ";
                    values += ",'" + txtHijosvivos.getText().toString() + "'";
                }
                if (!txtHijosMuertos.getText().isEmpty()) {
                    insert += ",txthijosmuertos ";
                    values += ",'" + txtHijosMuertos.getText().toString() + "'";
                }
                if (!txtcabeza.getText().isEmpty()) {
                    insert += ",txtcabeza ";
                    values += ",'" + txtcabeza.getText().toString() + "'";
                }
                if (!txtNariz.getText().isEmpty()) {
                    insert += ",txtnariz ";
                    values += ",'" + txtNariz.getText().toString() + "'";
                }
                if (!txtCuello.getText().isEmpty()) {
                    insert += ",txtcuello ";
                    values += ",'" + txtCuello.getText().toString() + "'";
                }
                if (!txtPerimetro.getText().isEmpty()) {
                    insert += ",txtperimetro ";
                    values += ",'" + txtPerimetro.getText().toString() + "'";
                }
                if (!txtB_A_F_L.getText().isEmpty()) {
                    insert += ",txtb_a_f_l ";
                    values += ",'" + txtB_A_F_L.getText().toString() + "'";
                }
                if (!txtVisionColores.getText().isEmpty()) {
                    insert += ",txtvisioncolores ";
                    values += ",'" + txtVisionColores.getText().toString() + "'";
                }
                if (!txtEnfermedadesOculares.getText().isEmpty()) {
                    insert += ",txtenfermedadesoculares ";
                    values += ",'" + txtEnfermedadesOculares.getText().toString()+ "'";
                }
                if (!txtReflejosPupilares.getText().isEmpty()) {
                    insert += ",txtreflejospupilares ";
                    values += ",'" + txtReflejosPupilares.getText().toString() + "'";
                }
                if (!txtBinocular.getText().isEmpty()) {
                    insert += ",txtbinocular ";
                    values += ",'" + txtBinocular.getText().toString() + "'";
                }
                if (!txtOD.getText().isEmpty()) {
                    insert += ",txtod ";
                    values += ",'" + txtOD.getText().toString() + "'";
                }
                if (!txtOI.getText().isEmpty()) {
                    insert += ",txtoi ";
                    values += ",'" + txtOI.getText().toString() + "'";
                }
                if (!txtTorax.getText().isEmpty()) {
                    insert += ",txttorax ";
                    values += ",'" + txtTorax.getText().toString() + "'";
                }
                if (!txtCorazon.getText().isEmpty()) {
                    insert += ",txtcorazon ";
                    values += ",'" + txtCorazon.getText().toString() + "'";
                }
                insert += ",rbnormal ";
                values += ",'" + rbNormal.isSelected() + "'";
                insert += ",rbanormal ";
                values += ",'" + rbAnormal.isSelected() + "'";
                if (!txtPulmones.getText().isEmpty()) {
                    insert += ",txtpulmones ";
                    values += ",'" + txtPulmones.getText().toString() + "'";
                }
                if (!txtMiembrosSuperiores.getText().isEmpty()) {
                    insert += ",txtmiembrossuperiores ";
                    values += ",'" + txtMiembrosSuperiores.getText().toString() + "'";
                }
                if (!txtMiembrosInferiores.getText().isEmpty()) {
                    insert += ",txtmiembrosinferiores ";
                    values += ",'" + txtMiembrosInferiores.getText().toString() + "'";
                }
                if (!txtReflejosOsteotendinosos.getText().isEmpty()) {
                    insert += ",txtreflejososteotendinosos ";
                    values += ",'" + txtReflejosOsteotendinosos.getText().toString() + "'";
                }
                if (!txtMarcha.getText().isEmpty()) {
                    insert += ",txtmarcha ";
                    values += ",'" + txtMarcha.getText().toString() + "'";
                }
                if (!txtcolumnaVertebral.getText().isEmpty()) {
                    insert += ",txtcolumnavertebral ";
                    values += ",'" + txtcolumnaVertebral.getText().toString() + "'";
                }
                if (!txtAbdomen.getText().isEmpty()) {
                    insert += ",txtabdomen ";
                    values += ",'" + txtAbdomen.getText().toString() + "'";
                }
                if (!txtAnillosInguinales.getText().isEmpty()) {
                    insert += ",txtanillosinguinales ";
                    values += ",'" + txtAnillosInguinales.getText().toString() + "'";
                }
                if (!txtOrganosGenitales.getText().isEmpty()) {
                    insert += ",txtorganosgenitales ";
                    values += ",'" + txtOrganosGenitales.getText().toString() + "'";
                }
                insert += ",rbtnohizo, rbtnormal, rbtanormal, chkdescribirobservacion ";
                values += ",'" + rbTNoHizo.isSelected() + "','" + rbTNormal.isSelected() + "','" + rbTAnormal.isSelected() + "','" + chkDescribirObservacion.isSelected() + "'";
                if (!txtHernias.getText().isEmpty()) {
                    insert += ",txthernias ";
                    values += ",'" + txtHernias.getText().toString() + "'";
                }
                if (!txtVarices.getText().isEmpty()) {
                    insert += ",txtvarices ";
                    values += ",'" + txtVarices.getText().toString() + "'";
                }
                if (!txtGanglios.getText().isEmpty()) {
                    insert += ",txtganglios ";
                    values += ",'" + txtGanglios.getText().toString() + "'";
                }
                if (!txtLenguage.getText().isEmpty()) {
                    insert += ",txtlenguage ";
                    values += ",'" + txtLenguage.getText().toString() + "'";
                }
//                if (!txtObservacionesFichaMedica.getText().isEmpty()) {
                    if(!"N/A".equals(txtOD500.getText())&& !"NORMAL".equals(txtObservacionAudio.getText())){
                        insert += ",txtobservacionesfm ";
                        values += ",'" + txtObservacionesFichaMedica.getText().toString() + "\n"+txtObservacionAudio.getText().toString()+ "'";
                
                    }else{
                       insert += ",txtobservacionesfm ";
                       values += ",'" + txtObservacionesFichaMedica.getText().toString() +  "'";
                 
                    }
//                }
//                if (!txtConclusion.getText().isEmpty()) {
                    insert += ",txtconclusion ";
                    values += ",'" + txtConclusion.getText().toString() + "'";
//                }
                if (!txtEdad.getText().isEmpty() ) {
                    insert += ",txtedad ";
                    values += ",'" + txtEdad.getText().toString() + "'";
                }
                if (!txtObservacionAudio.getText().isEmpty() ) {
                    insert += ",txtdiagnosticoaudio ";
                    values += ",'" + txtObservacionAudio.getText().toString()+  "'";
                }
                if (!txtEnfermedadesOculares1.getText().isEmpty()) {
                    insert += ",txtenfermedadesoculares2 ";
                    values += ",'" + txtEnfermedadesOculares1.getText().toString()+  "'";
                }
                //oFunc.SubSistemaMensajeInformacion(insert.concat(")") + values.concat(")"));
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
        txtHijosvivos.setText(null);
        txtHijosMuertos.setText(null);
        txtTalla.setText(null);
        txtPeso.setText(null);
        txtIMC.setText(null);
        txtAntecedentesPersonales.setText("NIEGA DB, TBC, HTA, CONVULSIONES, ASMA, ALERGIAS, ACCIDENTES");
        txtAntecedentesFamiliares.setText("NO CONTRIBUTORIOS");
//txtInmunizaciones.setText("NO RECUERDA");
        txtPuestoPostula.setText(null);
        txtArea.setText(null);
        txtPuestoActual.setText(null);
        txtTiempo.setText(null);
        tbReubicacion.clearSelection();
        rbRno.setSelected(true);
        txtFVC.setText(null);
        txtFEV1.setText(null);
        txtFEV1FVC.setText(null);
        txtFEF2575.setText(null);
        txtTemperatura.setText(null);
        txtCintura.setText(null);
        txtCadera.setText(null);
        txticc.setText(null);
        txtcabeza.setText("NORMAL");
        txtNariz.setText("CENTRAL, PERMEABLE");
        txtCuello.setText("CENTRAL, MOVIL");
        txtPerimetro.setText(null);
        txtB_A_F_L.setText("HUMECTADA, NO HIPERTROFICAS, NO CONGESTIVAS");
        txtCercaSinCorregirOD.setText(null);
        txtCercaSinCorregirOI.setText(null);
        txtCercaCorregidaOD.setText(null);
        txtCercaCorregidaOI.setText(null);
        txtLejosSinCorregirOD.setText(null);
        txtLejosSinCorregirOI.setText(null);
        txtLejosCorregidaOD.setText(null);
        txtLejosCorregidaOI.setText(null);
        txtEnfermedadesOculares.setText("NINGUNA");
        txtEnfermedadesOculares1.setText("NINGUNA");
//        txtEnfermedadesOculares2.setText("NINGUNA");
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
        txtOD.setText("NORMAL");
        txtOI.setText("NORMAL");
        txtTorax.setText("BPMV EN ACP, NO RALES");
        txtCorazon.setText("RCRR, NO SOPLOS");
        txtFrespiratoria.setText(null);
        txtFcardiaca.setText(null);
        txtSatO2.setText(null);
        txtSistolica.setText(null);
        txtDiastolica.setText(null);
        rbNormal.setSelected(true);
        txtPulmones.setText("BPMV EN ACP. NO RALES");
        txtMiembrosSuperiores.setText("SIMETRICOS, NO DEFORMIDADES");
        txtMiembrosInferiores.setText("SIMETRICOS, NO DEFORMIDADES");
        txtReflejosOsteotendinosos.setText("CONSERVADOS");
        txtMarcha.setText("NORMAl");
        txtMalEstado.setText(null);
        txtFaltan.setText(null);
        txtObservacionesFichaMedica.setText(null);
        txtGFSPrevio.setText(null);
        txtGrupoFacLab.setText(null);
        txtConclusion.setText(null);
        txtObservacionAudio.setText(null);
        
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnexo7C1;
    private javax.swing.JButton btnAnexo7C2;
    private javax.swing.JButton btnEditarFM;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JToggleButton btnObsv;
    private javax.swing.JButton btnVLimpiar;
    private javax.swing.JRadioButton chkAExcesivo;
    private javax.swing.JRadioButton chkAHabitual;
    private javax.swing.JRadioButton chkANada;
    private javax.swing.JRadioButton chkAPoco;
    private javax.swing.JCheckBox chkBiologicos;
    private javax.swing.JCheckBox chkCancerigenos;
    private javax.swing.JCheckBox chkCargas;
    private javax.swing.JRadioButton chkDExcesivo;
    private javax.swing.JRadioButton chkDHabitual;
    private javax.swing.JRadioButton chkDNada;
    private javax.swing.JRadioButton chkDPoco;
    private javax.swing.JCheckBox chkDescribirObservacion;
    private javax.swing.JCheckBox chkFiebreAmarilla;
    private javax.swing.JCheckBox chkHepatitisB;
    private javax.swing.JCheckBox chkMetales;
    private javax.swing.JCheckBox chkMovRepet;
    private javax.swing.JCheckBox chkMutagenicos;
    private javax.swing.JCheckBox chkNegativo;
    private javax.swing.JCheckBox chkNormal;
    private javax.swing.JCheckBox chkOtros;
    private javax.swing.JCheckBox chkPVD;
    private javax.swing.JCheckBox chkPatrobs;
    private javax.swing.JCheckBox chkPolvo;
    private javax.swing.JCheckBox chkPositivo;
    private javax.swing.JCheckBox chkPosturas;
    private javax.swing.JCheckBox chkRuido;
    private javax.swing.JCheckBox chkSolventes;
    private javax.swing.JRadioButton chkTExcesivo;
    private javax.swing.JRadioButton chkTHabitual;
    private javax.swing.JRadioButton chkTNada;
    private javax.swing.JRadioButton chkTPoco;
    private javax.swing.JCheckBox chkTemperatura;
    private javax.swing.JCheckBox chkTetano;
    private javax.swing.JCheckBox chkTurnos;
    private javax.swing.JCheckBox chkVidSegmentario;
    private javax.swing.JCheckBox chkVidTotal;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
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
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
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
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
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
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jtFichaMedica;
    private javax.swing.JLabel lblAnexo7D;
    private javax.swing.JLabel lblCertificacionAltura;
    private javax.swing.JLabel lblConsentimientoDosaje;
    private javax.swing.JLabel lblCuestionarioNordico;
    private javax.swing.JLabel lblElectrocardiograma;
    private javax.swing.JLabel lblEspirometria;
    private javax.swing.JLabel lblExRxSanguineos;
    private javax.swing.JLabel lblFichaAPatologicos;
    private javax.swing.JLabel lblFichaAudiologica;
    private javax.swing.JLabel lblHistorialOcupacional;
    private javax.swing.JLabel lblLabClinico;
    private javax.swing.JLabel lblOdontograma;
    private javax.swing.JLabel lblOftalmologia;
    private javax.swing.JLabel lblPerimetroToraxico;
    private javax.swing.JLabel lblPsicologia;
    private javax.swing.JLabel lblRadiografiaTorax;
    private javax.swing.JLabel lblSAS;
    private javax.swing.JLabel lblTriaje;
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
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbAB;
    private javax.swing.JRadioButton rbAnormal;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbNO;
    private javax.swing.JRadioButton rbNormal;
    private javax.swing.JRadioButton rbO;
    private javax.swing.JRadioButton rbReevaluacion;
    private javax.swing.JRadioButton rbRhNegativo;
    private javax.swing.JRadioButton rbRhPositivo;
    private javax.swing.JRadioButton rbRno;
    private javax.swing.JRadioButton rbSI;
    private javax.swing.JRadioButton rbTAnormal;
    private javax.swing.JRadioButton rbTNoHizo;
    private javax.swing.JRadioButton rbTNormal;
    private javax.swing.ButtonGroup tbPulmones;
    private javax.swing.ButtonGroup tbReubicacion;
    private javax.swing.JRadioButton tbRsi;
    private javax.swing.JTextField txtAbdomen;
    private javax.swing.JTextField txtAlturaLabor;
    private javax.swing.JTextField txtAnexo7D;
    private javax.swing.JTextField txtAnillosInguinales;
    private javax.swing.JTextField txtAntPatologicos;
    private javax.swing.JTextField txtAntecedentesFamiliares;
    private javax.swing.JTextField txtAntecedentesPersonales;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtAspectoEF;
    private javax.swing.JTextField txtB_A_F_L;
    private javax.swing.JTextField txtBacteriasSU;
    private javax.swing.JTextField txtBilirubinaEQ;
    private javax.swing.JTextField txtBinocular;
    private javax.swing.JTextField txtCadera;
    private javax.swing.JTextField txtCalidad;
    private javax.swing.JTextField txtCelEpitelialesSU;
    private javax.swing.JTextField txtCerTrabajo;
    private javax.swing.JTextField txtCercaCorregidaOD;
    private javax.swing.JTextField txtCercaCorregidaOI;
    private javax.swing.JTextField txtCercaSinCorregirOD;
    private javax.swing.JTextField txtCercaSinCorregirOI;
    private javax.swing.JTextField txtCetonasEQ;
    private javax.swing.JTextField txtCilindiosSU;
    private javax.swing.JTextField txtCintura;
    private javax.swing.JTextField txtCoca;
    private javax.swing.JTextField txtColesterol;
    private javax.swing.JTextField txtColorEF;
    private javax.swing.JTextField txtConNeumoconiosis;
    private javax.swing.JTextArea txtConclusion;
    private javax.swing.JTextField txtConclusionesRx;
    private javax.swing.JTextField txtConsentimientoDosaje;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtCorazon;
    private javax.swing.JTextField txtCreatininaBio;
    private javax.swing.JTextField txtCristalesSU;
    private javax.swing.JTextField txtCuello;
    private javax.swing.JTextField txtCuestionarioNordico;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDensidadEF;
    private javax.swing.JTextField txtDetencionSAS;
    private javax.swing.JTextField txtDiastolica;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtENombre;
    private javax.swing.JTextField txtEOrden;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtElectrocardiograma;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEnfermedadesOculares;
    private javax.swing.JTextField txtEnfermedadesOculares1;
    private javax.swing.JTextField txtEspirometria;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtEtipoExamen;
    private javax.swing.JTextField txtExRxSanguineos;
    private javax.swing.JTextField txtExplotacionEn;
    private javax.swing.JTextField txtFEF2575;
    private javax.swing.JTextField txtFEV1;
    private javax.swing.JTextField txtFEV1FVC;
    private javax.swing.JTextField txtFVC;
    private javax.swing.JTextField txtFaltan;
    private javax.swing.JTextField txtFcardiaca;
    private javax.swing.JTextField txtFichaAudiologica;
    private javax.swing.JTextField txtFrespiratoria;
    private javax.swing.JTextField txtGFSPrevio;
    private javax.swing.JTextField txtGanglios;
    private javax.swing.JTextField txtGlucosaBio;
    private javax.swing.JTextField txtGlucosaEQ;
    private javax.swing.JTextField txtGradoInstruccion;
    private javax.swing.JTextField txtGrupoFacLab;
    private javax.swing.JTextField txtHDLColesterol;
    private javax.swing.JTextField txtHematiesSU;
    private javax.swing.JTextField txtHemoHema;
    private javax.swing.JTextField txtHernias;
    private javax.swing.JTextField txtHijosMuertos;
    private javax.swing.JTextField txtHijosvivos;
    private javax.swing.JTextField txtHilios;
    private javax.swing.JTextField txtHistoriaOcupacional;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JTextField txtImagenRxExPolvo;
    private javax.swing.JTextField txtLDLColesterol;
    private javax.swing.JTextField txtLabClinico;
    private javax.swing.JTextField txtLejosCorregidaOD;
    private javax.swing.JTextField txtLejosCorregidaOI;
    private javax.swing.JTextField txtLejosSinCorregirOD;
    private javax.swing.JTextField txtLejosSinCorregirOI;
    private javax.swing.JTextField txtLenguage;
    private javax.swing.JTextField txtLeucocitosEQ;
    private javax.swing.JTextField txtLeucocitosSU;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtMalEstado;
    private javax.swing.JTextField txtMarcha;
    private javax.swing.JTextField txtMarig;
    private javax.swing.JTextField txtMediastinos;
    private javax.swing.JTextField txtMiembrosInferiores;
    private javax.swing.JTextField txtMiembrosSuperiores;
    private javax.swing.JTextField txtMineralesExplotados;
    private javax.swing.JTextField txtNariz;
    private javax.swing.JTextField txtNitritosEQ;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtNorden1;
    private javax.swing.JTextField txtOD;
    private javax.swing.JTextField txtOD1000;
    private javax.swing.JTextField txtOD2000;
    private javax.swing.JTextField txtOD3000;
    private javax.swing.JTextField txtOD4000;
    private javax.swing.JTextField txtOD500;
    private javax.swing.JTextField txtOD6000;
    private javax.swing.JTextField txtOD8000;
    private javax.swing.JTextField txtOI;
    private javax.swing.JTextField txtOI1000;
    private javax.swing.JTextField txtOI2000;
    private javax.swing.JTextField txtOI3000;
    private javax.swing.JTextField txtOI4000;
    private javax.swing.JTextField txtOI500;
    private javax.swing.JTextField txtOI6000;
    private javax.swing.JTextField txtOI8000;
    private javax.swing.JTextField txtObservOdonto;
    private javax.swing.JTextArea txtObservacionAudio;
    private javax.swing.JTextArea txtObservacionesFichaMedica;
    private javax.swing.JTextField txtOdontograma;
    private javax.swing.JTextField txtOftalmologia;
    private javax.swing.JTextField txtOrganosGenitales;
    private javax.swing.JTextArea txtOtrosEx;
    private javax.swing.JTextField txtOtrosSu;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtPerimetroToraxico;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPhEF;
    private javax.swing.JTextField txtProteinasEQ;
    private javax.swing.JTextField txtPsicologia;
    private javax.swing.JTextField txtPuestoActual;
    private javax.swing.JTextField txtPuestoPostula;
    private javax.swing.JTextField txtPulmones;
    private javax.swing.JTextField txtPusSU;
    private javax.swing.JTextField txtRadiografiaTorax;
    private javax.swing.JTextField txtReflejosOsteotendinosos;
    private javax.swing.JTextField txtReflejosPupilares;
    private javax.swing.JTextField txtRx;
    private javax.swing.JTextField txtSangreEQ;
    private javax.swing.JTextField txtSatO2;
    private javax.swing.JTextField txtSenos;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSiluetaCardioVascular;
    private javax.swing.JTextField txtSimbolos;
    private javax.swing.JTextField txtSinNeumoconiosis;
    private javax.swing.JTextField txtSistolica;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtTipoExamen;
    private javax.swing.JTextField txtTorax;
    private javax.swing.JTextField txtTriaje;
    private javax.swing.JTextField txtTrigliseridos;
    private javax.swing.JTextField txtUrobilinogenoEQ;
    private javax.swing.JTextField txtVLDLColesterol;
    private javax.swing.JTextField txtVSG;
    private javax.swing.JTextField txtVarices;
    private javax.swing.JTextField txtVertices;
    private javax.swing.JTextField txtVisionColores;
    private javax.swing.JTextField txtcabeza;
    private javax.swing.JTextField txtcolumnaVertebral;
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

    public void MostrarAddObsv() {
        addObsv = new frmObservaciones(this, true);
        addObsv.setVisible(true);

    }

    public void txtObsv(String Ocupacion) {
        txtObservacionesFichaMedica.append(Ocupacion.concat("\n"));
    }
    
    //analisis bioquimicos
    public void cargarAnalisisB(){
        String Sql="SELECT txtcolesterol, txtldlcolesterol, txthdlcolesterol, txtvldlcolesterol, \n" +
            "txttrigliseridos\n" +
            "  FROM analisis_bioquimicos\n" +
            "  where n_orden='"+txtNorden.getText().toString()+"'";
               oConn.FnBoolQueryExecute(Sql);
             
             try {
                  if (oConn.setResult.next()) {
                      txtColesterol.setText(oConn.setResult.getString("txtcolesterol"));
                      txtLDLColesterol.setText(oConn.setResult.getString("txtldlcolesterol"));
                      txtHDLColesterol.setText(oConn.setResult.getString("txthdlcolesterol"));
                      txtVLDLColesterol.setText(oConn.setResult.getString("txtvldlcolesterol"));
                      txtTrigliseridos.setText(oConn.setResult.getString("txttrigliseridos"));
                      
                      float ct=Float.parseFloat(txtColesterol.getText().toString());
                      float ldl=Float.parseFloat(txtLDLColesterol.getText().toString());
                      float hdl=Float.parseFloat(txtHDLColesterol.getText().toString());
                      float vldl=Float.parseFloat(txtVLDLColesterol.getText().toString());
                      float trigli=Float.parseFloat(txtTrigliseridos.getText().toString());
                     if (ct> 200) {
                         txtObservacionesFichaMedica.append("- HIPERCOLESTEROLEMIA.DIETA HIPOCALORICA Y EJERCICIOS. \n ");
                          txtColesterol.setForeground(Color.red);
                     }
                     if (trigli>150) {
                         txtObservacionesFichaMedica.append("- HIPERTRIGLICERIDEMIA.DIETA HIPOCALORICA Y EJERCICIOS. \n " );
                         txtTrigliseridos.setForeground(Color.red);
                     }
                     if (ldl> 129) {
                           txtLDLColesterol.setForeground(Color.red);
                          
                     }
                     if (hdl<40 || hdl>60) {
                         txtHDLColesterol.setForeground(Color.red);
                     }
                     if (vldl> 30) {
                          txtVLDLColesterol.setForeground(Color.red);
                     }
//                     if(ct>200 || trigli>150 || ldl>129 || (hdl<40 || hdl>60) || vldl>30){
//                         txtObservacionesFichaMedica.append("- DIETA HIPOCALORICA Y EJERCICIOS. \n ");
//                     }
                 } else {
                     oFunc.SubSistemaMensajeInformacion("No hay registro de analisis quimicos");
                 }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
            }  
    }
    //***********************
    void Limpiar() {
        txtNorden1.setText(null);
        txtNombres.setText(null);
        txtDNI.setText(null);
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
        rb0.setSelected(true);
        btNegativoPositivo.clearSelection();
        txtSinNeumoconiosis.setText(null);
        txtImagenRxExPolvo.setText(null);
        txtConNeumoconiosis.setText(null);
        btGrupoSanguineo.clearSelection();
        btGrupoSanguineoTIPO.clearSelection();
        txtHemoHema.setText(null);
        btApto.clearSelection();
        rbSI.setSelected(true);
        txtOtrosEx.setText(null);
        txtGlucosaBio.setText(null);
        txtCreatininaBio.setText(null);
        txtVSG.setText(null);
        txtCoca.setText(null);
        txtMarig.setText(null);
        txtColesterol.setText(null);
        txtLDLColesterol.setText(null);
        txtHDLColesterol.setText(null);
        txtVLDLColesterol.setText(null);
        txtTrigliseridos.setText(null);
        txtNorden1.setEditable(true);
        txtNorden1.requestFocus();
        
    }
private void Insertar(){
    
            String insert="INSERT INTO ex_radiograficos_sanguineos("
                    + "n_rx, fecha_exra, txtcalidad, txtsimbolos, n_orden,"
                    + "ex_0, ex_10, ex_11, ex_12, ex_21, ex_22, ex_23, ex_32, ex_33,"
                    + "ex_3mas, ex_abc, ex_st";

            String values ="VALUES('"+txtRx.getText().toString()+ "','" +FechaRx.getDate()+ "','"+txtCalidad.getText()+"'";
                values += ",'"+ txtSimbolos.getText()+"','" +txtNorden.getText().toString()+ "'"; 
                values += ",'"+rb0.isSelected()+ "','"+rb1.isSelected()+"'";
                values += ",'"+rb2.isSelected()+"','"+rb3.isSelected()+"'";
                values += ",'"+rb4.isSelected()+ "','"+rb5.isSelected()+"'";
                values += ",'"+rb6.isSelected()+"','"+rb7.isSelected()+"'";
                values += ",'"+rb8.isSelected()+"','"+rb9.isSelected()+"'";
                    values += ",'"+rb10.isSelected()+"','"+rb11.isSelected()+"'";

                if(!txtSinNeumoconiosis.getText().isEmpty()){
                insert+=",txtsinneumoconiosis";
                values+= ",'"+txtSinNeumoconiosis.getText().toString()+"'";
                }
                if(!txtConNeumoconiosis.getText().isEmpty()){
                insert+=",txtconneumoconiosis";
                values+= ",'"+txtConNeumoconiosis.getText().toString()+"'";
                }
                if(!txtImagenRxExPolvo.getText().isEmpty()){
                insert+=",txtirep";
                values+= ",'"+txtImagenRxExPolvo.getText().toString()+"'";
                }
                if(!txtOtrosEx.getText().isEmpty()){
                insert+=",txtotrosex";
                values+= ",'"+txtOtrosEx.getText().toString()+"'";
                }
                
                insert += ",apto_si,apto_no,apto_re)"; 
                values += ",'"+rbSI.isSelected()+"','"+rbNO.isSelected()+"','"+rbReevaluacion.isSelected()+"')";
               
                 if (oConn.FnBoolQueryExecuteUpdate(insert + values)){
             oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
             Limpiar();
         
        }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
             
       }
       
  }
public boolean OrdenExiste1()
    {
        boolean bResultado=false;

        String sQuery;

        sQuery  = "Select n_orden from radiografia_torax Where n_orden="+txtNorden.getText().toString();
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             
             
            }else{oFunc.SubSistemaMensajeError("Necesario Realizar Radiografía de Torax P.A");}
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }

        return bResultado;
        
    }
  private void cargarExamSanguineos(){
      if(!txtNorden.getText().isEmpty()){
            if(OrdenExiste1()){
                if(!oPu.nOrden(txtNorden, "ex_radiograficos_sanguineos")){
                    String Sql="select d.cod_pa,d.sexo_pa, d.nombres_pa, d.apellidos_pa,n.n_orden,l.chkpositivo,l.chknegativo,"
                    + "  l.chko, l.chka , l.chkb , l.chkab,l.rbrhpositivo, l.rbrhnegativo,l.txthemoglobina,l.txtglucosabio,l.txtvsg,l.txtcocaina,l.txtmarihuana,l.txtcreatininabio, "
                    + " r.txtvertices,r.txthilios,r.txtsenoscostofrenicos,r.txtmediastinos,r.txtsiluetacardiovascular,r.txtconclusionesradiograficas "
                    + "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)"
                    + "INNER JOIn lab_clinico AS l ON (n.n_orden = l.n_orden) "
                    + "INNER JOIN radiografia_torax AS r ON (n.n_orden = r.n_orden ) WHERE l.n_orden ='"+txtNorden.getText().toString()+"'";
                    oConn.FnBoolQueryExecute(Sql);
                    String sexo;
                    try {
                        if (oConn.setResult.next()) {

                            txtDNI.setText(oConn.setResult.getString("cod_pa"));
                            txtRx.setText(oConn.setResult.getString("n_orden"));
                            txtVertices.setText(oConn.setResult.getString("txtvertices"));
                            txtHilios.setText(oConn.setResult.getString("txthilios"));
                            txtSenos.setText(oConn.setResult.getString("txtsenoscostofrenicos"));
                            txtMediastinos.setText(oConn.setResult.getString("txtmediastinos"));
                            txtSiluetaCardioVascular.setText(oConn.setResult.getString("txtsiluetacardiovascular"));
                            txtConclusionesRx.setText(oConn.setResult.getString("txtconclusionesradiograficas"));
                            String hemo=oConn.setResult.getString("txthemoglobina");
                            txtHemoHema.setText(hemo);
                            chkPositivo.setSelected(oConn.setResult.getBoolean("chkpositivo"));
                            chkNegativo.setSelected(oConn.setResult.getBoolean("chknegativo"));
                            txtNombres.setText(oConn.setResult.getString("nombres_pa").concat(" ").concat(oConn.setResult.getString("apellidos_pa")));
                            rbO.setSelected(oConn.setResult.getBoolean("chko"));
                            rbA.setSelected(oConn.setResult.getBoolean("chka"));
                            rbB.setSelected(oConn.setResult.getBoolean("chkb"));
                            rbAB.setSelected(oConn.setResult.getBoolean("chkab"));
                            rbRhPositivo.setSelected(oConn.setResult.getBoolean("rbrhpositivo"));
                            rbRhNegativo.setSelected(oConn.setResult.getBoolean("rbrhnegativo"));
                            
                            String vsg=oConn.setResult.getString("txtvsg");
                            String gluc=oConn.setResult.getString("txtglucosabio");
                            String creat=oConn.setResult.getString("txtcreatininabio");
                            
                            txtVSG.setText(vsg);
                            txtGlucosaBio.setText(gluc);
                            txtCreatininaBio.setText(creat);
                            txtOtrosEx.append("-HEMOGRAMA: NORMAL. \n");
                            txtOtrosEx.append (gluc== null ? "":("-GLUCOSA: "+ gluc + " mg/dl. \n"));
                            txtOtrosEx.append (creat== null ? "":("-CREATININA: "+ creat + " mg/dl. \n"));
                            txtOtrosEx.append (vsg == null ? "":("-VSG: "+ vsg+ ". \n"));
                            txtOtrosEx.append("-EX ORINA: NORMAL. \n");
                            txtOtrosEx.append (oConn.setResult.getString("txtcocaina") == null ? "":("-COCAINA: " + oConn.setResult.getString("txtcocaina")+". \n"));
                            txtOtrosEx.append (oConn.setResult.getString("txtmarihuana")== null ? "":("-MARIHUANA: "+oConn.setResult.getString("txtmarihuana")+ "."));
                            txtNorden1.setEditable(false);
                            txtCalidad.setText("2");
                            txtSimbolos.setText("N/A");
                            Fecha();
                            sexo = oConn.setResult.getString("sexo_pa");
                            if(!txtHemoHema.getText().isEmpty()){
                              float hemoglobina=Float.parseFloat(hemo);
                                  if ("M".equals(sexo)) {
                                      if(hemoglobina < 14 || hemoglobina > 20){
                                           txtHemoHema.setForeground(Color.red);
                                       }
                                      else{
                                          txtHemoHema.setForeground(Color.BLACK);
                                      }
                                  }
                                  if ("F".equals(sexo)) {
                                       if(hemoglobina < 13.5 || hemoglobina > 20){
                                            txtHemoHema.setForeground(Color.red);
                                       }
                                       else{
                                          txtHemoHema.setForeground(Color.BLACK);
                                      }
                                  }  
                            }
                            
                           
                                  
                        }else{
                            oFunc.SubSistemaMensajeError("No se encuentra Registros(Registros Necesarios): \n 1- Laboratorio Clinico \n 2- Radiografía de Torax P.A");
                        }
                    } catch (SQLException ex) {
                        oFunc.SubSistemaMensajeInformacion("Historia Ocupacional:" + ex.getMessage().toString());
                    }
                }else{oFunc.SubSistemaMensajeError("El Formulario ya fue Llenado");
                }
            }
        }
  }    
  private void editarRadiogrSan(){
      if(!txtNorden.getText().isEmpty()){

            String Sql="select d.cod_pa, d.nombres_pa, d.apellidos_pa,d.sexo_pa,n.n_orden,l.chkpositivo,l.chknegativo,"
            + "  l.chko, l.chka , l.chkb , l.chkab,l.rbrhpositivo, l.rbrhnegativo,l.txthemoglobina,l.txtglucosabio,"
                    + "l.txtvsg,l.txtcocaina,l.txtmarihuana,l.txtcreatininabio, "
            + " r.txtvertices,r.txthilios,r.txtsenoscostofrenicos,r.txtmediastinos,r.txtsiluetacardiovascular,r.txtconclusionesradiograficas,"
            + "e.fecha_exra, e.txtcalidad, e.txtsimbolos,\n" +
            " e.ex_0, e.ex_10, e.ex_11, e.ex_12, e.ex_21, e.ex_22, e.ex_23, e.ex_32, e.ex_33, \n" +
            " e.ex_3mas, e.ex_abc, e.ex_st, e.txtsinneumoconiosis, e.txtconneumoconiosis, \n" +
            " e.txtirep, e.txtotrosex, e.txtobservacionesrs, e.apto_si, e.apto_no, e.apto_re "
            + "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)"
            + "INNER JOIn lab_clinico AS l ON (n.n_orden = l.n_orden) "
            + "INNER JOIn ex_radiograficos_sanguineos AS e ON (n.n_orden = e.n_orden) "
            + "INNER JOIN radiografia_torax AS r ON (n.n_orden = r.n_orden ) "
           + "WHERE r.n_orden ='"+txtNorden.getText().toString()+"'";
            oConn.FnBoolQueryExecute(Sql);
            String sexo;
            try {
                if (oConn.setResult.next()) {

                    txtDNI.setText(oConn.setResult.getString("cod_pa"));
                    txtRx.setText(oConn.setResult.getString("n_orden"));
                    txtVertices.setText(oConn.setResult.getString("txtvertices"));
                    txtHilios.setText(oConn.setResult.getString("txthilios"));
                    txtSenos.setText(oConn.setResult.getString("txtsenoscostofrenicos"));
                    txtMediastinos.setText(oConn.setResult.getString("txtmediastinos"));
                    txtSiluetaCardioVascular.setText(oConn.setResult.getString("txtsiluetacardiovascular"));
                    txtConclusionesRx.setText(oConn.setResult.getString("txtconclusionesradiograficas"));
                    txtHemoHema.setText(oConn.setResult.getString("txthemoglobina"));
                    
                    chkPositivo.setSelected(oConn.setResult.getBoolean("chkpositivo"));
                    chkNegativo.setSelected(oConn.setResult.getBoolean("chknegativo"));
                    txtNombres.setText(oConn.setResult.getString("nombres_pa").concat(" ").concat(oConn.setResult.getString("apellidos_pa")));
                    rbO.setSelected(oConn.setResult.getBoolean("chko"));
                    rbA.setSelected(oConn.setResult.getBoolean("chka"));
                    rbB.setSelected(oConn.setResult.getBoolean("chkb"));
                    rbAB.setSelected(oConn.setResult.getBoolean("chkab"));
                    rbRhPositivo.setSelected(oConn.setResult.getBoolean("rbrhpositivo"));
                    rbRhNegativo.setSelected(oConn.setResult.getBoolean("rbrhnegativo"));
//                    txtOtrosEx.setText("");
//                    txtOtrosEx.append("-HEMOGRAMA: NORMAL. \n");
//                            txtOtrosEx.append (oConn.setResult.getString("txtglucosabio")== null ? "":("-GLUCOSA: "+ oConn.setResult.getString("txtglucosabio") + " mg/dl. \n"));
//                            txtOtrosEx.append (oConn.setResult.getString("txtcreatininabio")== null ? "":("-CREATININA: "+ oConn.setResult.getString("txtcreatininabio") + " mg/dl. \n"));
//                            txtOtrosEx.append (oConn.setResult.getString("txtvsg") == null ? "":("-VSG: "+ oConn.setResult.getString("txtvsg")+ ". \n"));
//                            txtOtrosEx.append("-EX ORINA: NORMAL. \n");
//                            txtOtrosEx.append (oConn.setResult.getString("txtcocaina") == null ? "":("-COCAINA: " + oConn.setResult.getString("txtcocaina")+". \n"));
//                            txtOtrosEx.append (oConn.setResult.getString("txtmarihuana")== null ? "":("-MARIHUANA: "+oConn.setResult.getString("txtmarihuana")+ "."));
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
                    txtSinNeumoconiosis.setText(oConn.setResult.getString("txtsinneumoconiosis"));
                    txtConNeumoconiosis.setText(oConn.setResult.getString("txtconneumoconiosis"));
                    txtImagenRxExPolvo.setText(oConn.setResult.getString("txtirep"));
//                    txtOtrosEx.setText(oConn.setResult.getString("txtotrosex"));
//                    txtObservacionesExamenesRS.setText(oConn.setResult.getString("txtobservacionesrs"));
                    rbSI.setSelected(oConn.setResult.getBoolean("apto_si"));
                    rbNO.setSelected(oConn.setResult.getBoolean("apto_no"));
                    rbReevaluacion.setSelected(oConn.setResult.getBoolean("apto_re"));
                    sexo = oConn.setResult.getString("sexo_pa");
                            float hemoglobina=Float.parseFloat(txtHemoHema.getText().toString());
                                  if ("M".equals(sexo)) {
                                      if(hemoglobina < 14 || hemoglobina > 20){
                                           txtHemoHema.setForeground(Color.red);
                                       }
                                      else{
                                          txtHemoHema.setForeground(Color.BLACK);
                                      }
                                  }
                                  if ("F".equals(sexo)) {
                                       if(hemoglobina < 13.5 || hemoglobina > 20){
                                            txtHemoHema.setForeground(Color.red);
                                       }
                                       else{
                                          txtHemoHema.setForeground(Color.BLACK);
                                      }
                                  }

                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Registros(Registros Necesarios)");
                }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Historia Ocupacional:" + ex.getMessage().toString());
            }
        }else{oFunc.SubSistemaMensajeError("ingrese N° orden");
        }
  }
  private void ActualizarRadiograSan(){
      String sCodigo=txtNorden.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE ex_radiograficos_sanguineos\n" +
        "SET fecha_exra='"+FechaRx.getDate()+"', txtcalidad='"+txtCalidad.getText().toString()+"', txtsimbolos='"+txtSimbolos.getText().toString()+"',"
        + " ex_0='"+rb0.isSelected()+"', ex_10='"+rb1.isSelected()+"', ex_11='"+rb2.isSelected()+"', ex_12='"+rb3.isSelected()+"', "
        + "ex_21='"+rb4.isSelected()+"', ex_22='"+rb5.isSelected()+"',ex_23='"+rb6.isSelected()+"', ex_32='"+rb7.isSelected()+"',"
        + " ex_33='"+rb8.isSelected()+"', ex_3mas='"+rb9.isSelected()+"', ex_abc='"+rb10.isSelected()+"', ex_st='"+rb11.isSelected()+"', "
        + "txtsinneumoconiosis='"+txtSinNeumoconiosis.getText().toString()+"', txtconneumoconiosis='"+txtConNeumoconiosis.getText().toString()+"',"
        + " txtirep='"+txtImagenRxExPolvo.getText().toString()+"', txtotrosex='"+txtOtrosEx.getText().toString()+"', "
        + "apto_si='"+rbSI.isSelected()+"', apto_no='"+rbNO.isSelected()+"',"
        + " apto_re='"+rbReevaluacion.isSelected()+"'" +
        " WHERE n_orden='" + sCodigo + "'";
        Limpiar();
        txtNorden1.setEnabled(true);
        txtNorden1.requestFocus();
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
  }
  public void examenOrina(){
          String Sql="SELECT lc.txtcoloref, lc.txtdensidadef, lc.txtaspectoef, lc.txtphef, lc.txtnitritoseq, lc.txtproteinaseq, lc.txtcetonaseq,\n" +
                    "lc.txtleucocitoseq, lc.txturobilinogenoeq, lc.txtbilirubinaeq, lc.txtglucosaeq, lc.txtsangreeq, lc.txtleucocitossu, \n" +
                    "lc.txtcelepitelialessu, lc.txtcilindiossu, lc.txtbacteriassu, lc.txthematiessu, lc.txtcristalessu, lc.txtpussu, lc.txtotrossu \n" +
                    "FROM lab_clinico as lc  \n" +
                    "WHERE lc.n_orden ='"+txtNorden.getText().toString()+"'" ;
              
              oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        
                         txtColorEF.setText(oConn.setResult.getString("txtcoloref"));
                         txtAspectoEF.setText(oConn.setResult.getString("txtaspectoef"));
                         txtDensidadEF.setText(oConn.setResult.getString("txtdensidadef"));
                         txtPhEF.setText(oConn.setResult.getString("txtphef"));
                         txtNitritosEQ.setText(oConn.setResult.getString("txtnitritoseq"));
                         txtProteinasEQ.setText(oConn.setResult.getString("txtproteinaseq"));
                         txtLeucocitosEQ.setText(oConn.setResult.getString("txtleucocitoseq"));
                         txtCetonasEQ.setText(oConn.setResult.getString("txtcetonaseq"));
                         txtUrobilinogenoEQ.setText(oConn.setResult.getString("txturobilinogenoeq"));
                         txtBilirubinaEQ.setText(oConn.setResult.getString("txtbilirubinaeq"));
                         txtGlucosaEQ.setText(oConn.setResult.getString("txtglucosaeq"));
                         txtSangreEQ.setText(oConn.setResult.getString("txtsangreeq"));
                         txtLeucocitosSU.setText(oConn.setResult.getString("txtleucocitossu"));
                         txtCelEpitelialesSU.setText(oConn.setResult.getString("txtcelepitelialessu"));
                         txtCilindiosSU.setText(oConn.setResult.getString("txtcilindiossu"));
                         txtBacteriasSU.setText(oConn.setResult.getString("txtbacteriassu"));
                         txtHematiesSU.setText(oConn.setResult.getString("txthematiessu"));
                         txtCristalesSU.setText(oConn.setResult.getString("txtcristalessu"));
                         txtPusSU.setText(oConn.setResult.getString("txtpussu"));
                         txtOtrosSu.setText(oConn.setResult.getString("txtotrossu"));
                        
                   
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro en laboratorio");
                    }
                    oConn.setResult.close();
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Laboratorio Clinico:" + ex.getMessage().toString());
        }
  }
 
}
