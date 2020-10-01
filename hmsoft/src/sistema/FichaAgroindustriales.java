/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.AddCargos;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public final class FichaAgroindustriales extends javax.swing.JInternalFrame {

    public static frmObservaciones addObsv1;
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPu = new clsOperacionesUsuarios();
    javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
    javax.swing.ImageIcon oIconoNo = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/xx.png"));
    javax.swing.ImageIcon oNo = null;
    boolean ordenVer=true;
     DefaultTableModel model;
   Integer num= null;
    public FichaAgroindustriales() {
        initComponents();
        
        jtFichaMedica.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/id.png")));
        jtFichaMedica.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/invoice.png")));
        jtFichaMedica.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/botiquin.png")));
        //Fecha();
        txtCertifica.setText( clsGlobales.sNomOperador  );
        sbCargarDatosAP();
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
//        if (tbReubicacion.isSelected(null)) {
//            oFunc.SubSistemaMensajeError("Reubicacion?");
//            jtFichaMedica.setSelectedIndex(0);
//            bResultado = false;
//        }
       
//      if(btEx.isSelected(null)){oFunc.SubSistemaMensajeError("Falta llenar "); bResultado = false;}
      if(btApto.isSelected(null)){bResultado = false;}

        return bResultado;
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAsociado = new javax.swing.ButtonGroup();
        btGrupoSanguineo = new javax.swing.ButtonGroup();
        bgResidencia = new javax.swing.ButtonGroup();
        btNegativoPositivo = new javax.swing.ButtonGroup();
        btGrupoSanguineoTIPO = new javax.swing.ButtonGroup();
        btApto = new javax.swing.ButtonGroup();
        bgMedicamento = new javax.swing.ButtonGroup();
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
        chkNeoplasia = new javax.swing.JCheckBox();
        chkITS = new javax.swing.JCheckBox();
        chkQuemaduras = new javax.swing.JCheckBox();
        chkCirugias = new javax.swing.JCheckBox();
        chkAPOtros = new javax.swing.JCheckBox();
        txtNeoplasia = new javax.swing.JTextField();
        txtIts = new javax.swing.JTextField();
        txtQuemaduras = new javax.swing.JTextField();
        txtCirugias = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        chkResidenciaSI = new javax.swing.JCheckBox();
        chkResidenciaNo = new javax.swing.JCheckBox();
        jLabel147 = new javax.swing.JLabel();
        txtTiempoResidencia = new javax.swing.JTextField();
        chkEps = new javax.swing.JCheckBox();
        chkOtros = new javax.swing.JCheckBox();
        chkSctr = new javax.swing.JCheckBox();
        chkOtros1 = new javax.swing.JCheckBox();
        chkEssalud = new javax.swing.JCheckBox();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        txtPadre = new javax.swing.JTextField();
        txtMadre = new javax.swing.JTextField();
        txtHermanos = new javax.swing.JTextField();
        txtEsposa = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPuestoPostula = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPuestoActual = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        txtHijosvivos = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtHijosMuertos = new javax.swing.JTextField();
        jLabel195 = new javax.swing.JLabel();
        txtNDependientes = new javax.swing.JTextField();
        txtTotalhijos = new javax.swing.JTextField();
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
        btnActualizar = new javax.swing.JButton();
        btnEditarFM = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jLabel136 = new javax.swing.JLabel();
        txtGFSPrevio = new javax.swing.JTextField();
        txtGrupoFacLab = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        Año = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtEnfaccidente = new javax.swing.JTextField();
        rbSiTrabajo = new javax.swing.JRadioButton();
        rbNoTrabajo = new javax.swing.JRadioButton();
        txtAnioTrabajo = new javax.swing.JTextField();
        txtDiasDesanso = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbQuirurgicos = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnQui = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtTipMed = new javax.swing.JTextField();
        txtMedFrecuencia = new javax.swing.JTextField();
        rbMedsi = new javax.swing.JRadioButton();
        rbMedno = new javax.swing.JRadioButton();
        txtOtrosAntecendetes = new javax.swing.JTextField();
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
        jLabel49 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtCintura = new javax.swing.JTextField();
        txtCadera = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txticc = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtMalEstado = new javax.swing.JTextField();
        txtFaltan = new javax.swing.JTextField();
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
        txtFcardiaca = new javax.swing.JTextField();
        txtFrespiratoria = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        txtSatO2 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        txtSistolica = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        txtDiastolica = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel122 = new javax.swing.JLabel();
        txtBinocular = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        txtEnfermedadesOculares1 = new javax.swing.JTextField();
        txtPerimetro = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtEctoscopia = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        txtEstadoMental = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txtAnamnesis = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        rbO = new javax.swing.JRadioButton();
        rbA = new javax.swing.JRadioButton();
        rbB = new javax.swing.JRadioButton();
        rbAB = new javax.swing.JRadioButton();
        jSeparator27 = new javax.swing.JSeparator();
        rbRhPositivo = new javax.swing.JRadioButton();
        rbRhNegativo = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        txtcabeza = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtCuello = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtBoca = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        txtFaringe = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtNariz = new javax.swing.JTextField();
        txtMarcha = new javax.swing.JTextField();
        txtPiel = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        txtApartoRespiratorio = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        txtAparatoCardivascular = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        txtAparatoDigestivo = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        txtAparatoGenitourinario = new javax.swing.JTextField();
        txtAparatoLocomotor = new javax.swing.JTextField();
        jLabel202 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        txtMiembrosSuperiores = new javax.swing.JTextField();
        txtMiembrosInferiores = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        txtSistemaLinfatico = new javax.swing.JTextField();
        jLabel187 = new javax.swing.JLabel();
        txtSistemaNervioso = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        txtColumnaVertebral = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        txtOidos = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtOtrosEx = new javax.swing.JTextArea();
        txtCertifica = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
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
        btnAptitudMedica = new javax.swing.JButton();
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
        jPanel25 = new javax.swing.JPanel();
        txtHemoHema = new javax.swing.JTextField();
        jLabel191 = new javax.swing.JLabel();
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
        jPanel20 = new javax.swing.JPanel();
        chkApto = new javax.swing.JCheckBox();
        chkRestriccion = new javax.swing.JCheckBox();
        chkNoApto = new javax.swing.JCheckBox();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        FechaHasta = new com.toedter.calendar.JDateChooser();
        jPanel23 = new javax.swing.JPanel();
        chk3 = new javax.swing.JCheckBox();
        chk12 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        chkNinguno = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        chk7 = new javax.swing.JCheckBox();
        chk10 = new javax.swing.JCheckBox();
        chk5 = new javax.swing.JCheckBox();
        chk8 = new javax.swing.JCheckBox();
        chk11 = new javax.swing.JCheckBox();
        chk9 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk1 = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        atxtRestricciones = new javax.swing.JTextArea();
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

        setClosable(true);
        setTitle("Examenes Pre-Ocupacionales \"Anexo 2\"");
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
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Ant. Personales"));

        chkNeoplasia.setBackground(new java.awt.Color(153, 204, 255));
        chkNeoplasia.setText("Neoplasia:");
        chkNeoplasia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNeoplasia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkNeoplasiaMouseClicked(evt);
            }
        });

        chkITS.setBackground(new java.awt.Color(153, 204, 255));
        chkITS.setText("ITS:");
        chkITS.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkITS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkITSMouseClicked(evt);
            }
        });

        chkQuemaduras.setBackground(new java.awt.Color(153, 204, 255));
        chkQuemaduras.setText("Quemaduras:");
        chkQuemaduras.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkQuemaduras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkQuemadurasMouseClicked(evt);
            }
        });

        chkCirugias.setBackground(new java.awt.Color(153, 204, 255));
        chkCirugias.setText("Cirugias:");
        chkCirugias.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkCirugias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkCirugiasMouseClicked(evt);
            }
        });

        chkAPOtros.setBackground(new java.awt.Color(153, 204, 255));
        chkAPOtros.setText("Otros:");
        chkAPOtros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkAPOtros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkAPOtrosMouseClicked(evt);
            }
        });

        txtNeoplasia.setEditable(false);

        txtIts.setEditable(false);

        txtQuemaduras.setEditable(false);

        txtCirugias.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkAPOtros)
                    .addComponent(chkNeoplasia)
                    .addComponent(chkITS)
                    .addComponent(chkQuemaduras)
                    .addComponent(chkCirugias))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNeoplasia, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtIts, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtQuemaduras, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtCirugias, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNeoplasia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNeoplasia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkITS, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIts, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkQuemaduras, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuemaduras, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCirugias, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCirugias, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(chkAPOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Residencia en el lugar de trabajo"));

        chkResidenciaSI.setBackground(new java.awt.Color(153, 204, 255));
        bgResidencia.add(chkResidenciaSI);
        chkResidenciaSI.setSelected(true);
        chkResidenciaSI.setText("SI");
        chkResidenciaSI.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkResidenciaNo.setBackground(new java.awt.Color(153, 204, 255));
        bgResidencia.add(chkResidenciaNo);
        chkResidenciaNo.setText("NO");
        chkResidenciaNo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel147.setText("Tiempo :");

        chkEps.setBackground(new java.awt.Color(153, 204, 255));
        chkEps.setText("EPS:");
        chkEps.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkEps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEpsActionPerformed(evt);
            }
        });

        chkOtros.setBackground(new java.awt.Color(153, 204, 255));
        chkOtros.setText("Otros :");
        chkOtros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkSctr.setBackground(new java.awt.Color(153, 204, 255));
        chkSctr.setText("SCTR:");
        chkSctr.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSctr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSctrActionPerformed(evt);
            }
        });

        chkOtros1.setBackground(new java.awt.Color(153, 204, 255));
        chkOtros1.setText("Otros :");
        chkOtros1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkEssalud.setBackground(new java.awt.Color(153, 204, 255));
        chkEssalud.setText("ESSALUD:");
        chkEssalud.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkEssalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEssaludActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator28)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(chkResidenciaSI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chkResidenciaNo)
                            .addGap(2, 2, 2)
                            .addComponent(jLabel147)
                            .addGap(0, 0, 0)
                            .addComponent(txtTiempoResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chkSctr)
                                .addGap(61, 61, 61)
                                .addComponent(chkOtros1))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(chkEssalud)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkEps)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkOtros)))))
                .addGap(2, 2, 2))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jSeparator29)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkResidenciaSI)
                    .addComponent(chkResidenciaNo)
                    .addComponent(jLabel147)
                    .addComponent(txtTiempoResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEssalud)
                    .addComponent(chkEps)
                    .addComponent(chkOtros))
                .addGap(6, 6, 6)
                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSctr)
                    .addComponent(chkOtros1))
                .addGap(2, 2, 2))
        );

        jPanel10.setBackground(new java.awt.Color(153, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Antencedentes Familiares"));

        jLabel196.setText("Padre:");

        jLabel197.setText("Madre: ");

        jLabel198.setText("Hermanos:");

        jLabel199.setText("Esposa(o):");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addComponent(jLabel197)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtMadre, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addComponent(jLabel196)
                    .addGap(2, 2, 2)
                    .addComponent(txtPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel199)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel198)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel196)
                    .addComponent(txtPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel197)
                    .addComponent(txtMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel198)
                    .addComponent(txtHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel199)
                    .addComponent(txtEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Hijos"));

        txtHijosvivos.setEditable(false);

        jLabel30.setText("Vivos :");

        jLabel31.setText("Muertos:");

        txtHijosMuertos.setEditable(false);

        jLabel195.setText("N° Dependientes:");

        txtTotalhijos.setEditable(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel195, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtTotalhijos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtHijosMuertos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHijosvivos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNDependientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHijosvivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHijosMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(txtTotalhijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel195)
                    .addComponent(txtNDependientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jLabel40.setText("Talla :");

        txtTalla.setEditable(false);

        jLabel41.setText("Peso :");

        txtPeso.setEditable(false);

        jLabel42.setText("IMC :");

        txtIMC.setEditable(false);
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

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Absentismo: Enfermedades y accidentes  (Asociados con  el trabajo)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel204.setText("Enfermedad, Accidente ");

        jLabel205.setText("Asociado al Trabajo");

        Año.setText("Año");

        jLabel20.setText("Días de descanso");

        bgAsociado.add(rbSiTrabajo);
        rbSiTrabajo.setText("SI");

        bgAsociado.add(rbNoTrabajo);
        rbNoTrabajo.setText("NO");

        tbQuirurgicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbQuirurgicos);

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEnfaccidente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(rbSiTrabajo)
                                .addGap(10, 10, 10)
                                .addComponent(rbNoTrabajo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAnioTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel205)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Año)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtDiasDesanso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(btnQui, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(2, 2, 2))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel204)
                            .addComponent(jLabel205)
                            .addComponent(Año)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEnfaccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbSiTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnioTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiasDesanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnQui, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel24.setText("Tipo :");

        jLabel25.setText("Frecuencia :");

        txtTipMed.setEditable(false);

        txtMedFrecuencia.setEditable(false);

        bgMedicamento.add(rbMedsi);
        rbMedsi.setText("SI");
        rbMedsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMedsiMouseClicked(evt);
            }
        });

        bgMedicamento.add(rbMedno);
        rbMedno.setText("NO");
        rbMedno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMednoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMedsi)
                    .addComponent(rbMedno))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipMed, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtTipMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMedsi, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtMedFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbMedno, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtOtrosAntecendetes.setEditable(false);
        txtOtrosAntecendetes.setBackground(new java.awt.Color(153, 204, 255));
        txtOtrosAntecendetes.setEnabled(false);

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
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMineralesExplotados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtExplotacionEn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel136)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtGFSPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel140)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGrupoFacLab, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
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
                                                .addComponent(jLabel27))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtTalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel43)
                                                    .addComponent(jLabel44)))
                                            .addComponent(txtIMC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOtrosAntecendetes, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
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
                            .addComponent(jLabel140))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOtrosAntecendetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtPuestoPostula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtPuestoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
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
                                    .addComponent(jLabel42))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );

        jtFichaMedica.addTab("Datos Personales", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");

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

        jLabel49.setText("Temp. :");

        jLabel50.setText("°C");

        jLabel51.setText("Cintura :");

        jLabel52.setText("Cadera :");

        jLabel53.setText("ICC :");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dentadura"));
        jPanel1.setPreferredSize(new java.awt.Dimension(222, 70));

        jLabel55.setText("Piezas en mal estado :");

        jLabel56.setText("Piezas que faltan :");

        txtMalEstado.setPreferredSize(new java.awt.Dimension(6, 18));

        txtFaltan.setPreferredSize(new java.awt.Dimension(6, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMalEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(txtFaltan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtMalEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtFaltan, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(2, 2, 2)
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

        jLabel91.setText("F. Respiratoria :");

        jLabel92.setText("F. Cardiaca :");

        jLabel93.setText("Sat. O2 : ");

        jLabel94.setText("min.");

        jLabel95.setText("min.");

        jLabel96.setText("%");

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
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel97)
                        .addGap(2, 2, 2)
                        .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel98))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addGap(1, 1, 1)
                        .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel100)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100))
                .addGap(2, 2, 2))
            .addComponent(jSeparator10)
        );

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

        txtPerimetro.setEditable(false);

        jLabel54.setText("Perimetro :");

        txtEctoscopia.setBackground(new java.awt.Color(153, 204, 255));
        txtEctoscopia.setText("APARENTA BUEN ESTADO DE SALUD.");
        txtEctoscopia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEctoscopiaFocusGained(evt);
            }
        });

        jLabel86.setText("Ectoscopía :");

        jLabel89.setText("Estado Mental :");

        txtEstadoMental.setBackground(new java.awt.Color(153, 204, 255));
        txtEstadoMental.setText("DESPIERTO, OTEP, COMUNICATIVO.");
        txtEstadoMental.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstadoMentalFocusGained(evt);
            }
        });

        jLabel88.setText("Anamnesis :");

        txtAnamnesis.setBackground(new java.awt.Color(153, 204, 255));
        txtAnamnesis.setText("COLABORADOR REFIERE SENTIRSE BIEN, SIN PROBLEMAS DE SALUD.");
        txtAnamnesis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnamnesisFocusGained(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(rbO)
                .addGap(18, 18, 18)
                .addComponent(rbA)
                .addGap(18, 18, 18)
                .addComponent(rbB)
                .addGap(18, 18, 18)
                .addComponent(rbAB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(rbRhPositivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbRhNegativo)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbB, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rbA, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rbO, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator27)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAB, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbRhPositivo)
                            .addComponent(rbRhNegativo))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel67)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel122)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(txtBinocular, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtReflejosPupilares, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                        .addComponent(jLabel142))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEnfermedadesOculares1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel66)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtEnfermedadesOculares, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtFrespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel94))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtFcardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel95))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtSatO2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel96)
                                                .addGap(12, 12, 12))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel92)
                                                    .addComponent(jLabel93)))
                                            .addComponent(jLabel54)
                                            .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel86))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEstadoMental)
                                    .addComponent(txtEctoscopia)
                                    .addComponent(txtAnamnesis)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel88)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
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
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBinocular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel122))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(jLabel94)
                                    .addComponent(txtFrespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel92)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(txtFcardiaca)
                                    .addComponent(jLabel95))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(txtSatO2)
                                    .addComponent(jLabel96))
                                .addGap(5, 5, 5)
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(txtEctoscopia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(txtEstadoMental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnamnesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.getAccessibleContext().setAccessibleName("");

        jtFichaMedica.addTab("Exámenes", jPanel3);

        jLabel45.setText("Cabeza :");

        txtcabeza.setBackground(new java.awt.Color(153, 204, 255));
        txtcabeza.setText("CENTRAL, PRESENCIA DE CABELLO FRONDOSO, NO MASAS, NO TUMORACIONES.");
        txtcabeza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcabezaFocusGained(evt);
            }
        });

        jLabel48.setText("Cuello :");

        txtCuello.setBackground(new java.awt.Color(153, 204, 255));
        txtCuello.setText("CENTRAL, MOVIL, NO MASAS NO TUMORACIONES.");
        txtCuello.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCuelloFocusGained(evt);
            }
        });

        jLabel47.setText("Boca :");

        txtBoca.setBackground(new java.awt.Color(153, 204, 255));
        txtBoca.setText("HUMECTADA, LENGUA ROSADA,CARRILLOS ROSADOS,NO MASA, NO TUMORACIONES, NO LESIONES EN MUCOSA.");
        txtBoca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBocaFocusGained(evt);
            }
        });

        jLabel90.setText("Faringe:");

        txtFaringe.setBackground(new java.awt.Color(153, 204, 255));
        txtFaringe.setText("\"HUMECTADA, SONROSADA, AMIGADALAS NO HIPERTROFICAS, NO CONGESTIVAS.\"");
        txtFaringe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFaringeFocusGained(evt);
            }
        });

        jLabel200.setText("Piel :");

        jLabel87.setText("Marcha :");

        jLabel46.setText("Nariz :");

        txtNariz.setBackground(new java.awt.Color(153, 204, 255));
        txtNariz.setText("CENTRAL, PERMEABLE");
        txtNariz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNarizActionPerformed(evt);
            }
        });
        txtNariz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNarizFocusGained(evt);
            }
        });

        txtMarcha.setBackground(new java.awt.Color(153, 204, 255));
        txtMarcha.setText("NORMAL");

        txtPiel.setBackground(new java.awt.Color(153, 204, 255));
        txtPiel.setText("NORMAL.NO  MANCHA, NO SPRESENCIA DE LUNARES SOSPECHOSOS DE MALIGNIDAD.");

        jLabel107.setText("Aparato Respiratorio :");

        txtApartoRespiratorio.setBackground(new java.awt.Color(153, 204, 255));
        txtApartoRespiratorio.setText("RESPIRACION  NORMAL,EXPANSION TORACICA SIMETRICA, BPMV EN ACP, NO RALES.");
        txtApartoRespiratorio.setPreferredSize(new java.awt.Dimension(81, 20));
        txtApartoRespiratorio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApartoRespiratorioFocusGained(evt);
            }
        });

        jLabel108.setText("  Apa.Cardiovascular :");

        txtAparatoCardivascular.setBackground(new java.awt.Color(153, 204, 255));
        txtAparatoCardivascular.setText("NO INGURGITACION YUGULAR, CAROTIDEO,RADIAL, FEMORAL, PEDIO CONSERVADOS.RCRR, NO SOPLOS, NO FROTES.");
        txtAparatoCardivascular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAparatoCardivascularFocusGained(evt);
            }
        });

        jLabel112.setText(" Aparato Digestivo :");

        txtAparatoDigestivo.setBackground(new java.awt.Color(153, 204, 255));
        txtAparatoDigestivo.setText("ABDOMEN PLANO, RHA CONSERVADOS, NO RUIDOS ANORMALES, BLANDO, DEPRESIBLE, NO DOLOR A LA PALPACION SUPERFICIAL NI PROFUNDA, NO MASAS NI TUMORACIONES PALPABLES.");
        txtAparatoDigestivo.setPreferredSize(new java.awt.Dimension(81, 20));
        txtAparatoDigestivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAparatoDigestivoFocusGained(evt);
            }
        });

        jLabel201.setText("A.Genitourinario :");

        txtAparatoGenitourinario.setBackground(new java.awt.Color(153, 204, 255));
        txtAparatoGenitourinario.setText("PPL: NEGATIVO. PRU: NEGATIVO.HIPOGASTRIO PLANO, B/D, NO DOLOROSO A LA PALPACION SUPERFIAL NI PROFUNDA.NO MASAS NI TUMORACIONES PALPABLES.");
        txtAparatoGenitourinario.setPreferredSize(new java.awt.Dimension(81, 20));
        txtAparatoGenitourinario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAparatoGenitourinarioFocusGained(evt);
            }
        });

        txtAparatoLocomotor.setBackground(new java.awt.Color(153, 204, 255));
        txtAparatoLocomotor.setText("BIPEDESTACION,MUSCULATURA CONSERVADA, MOTRICIDAD CORPORAL Y SEGMENTARIA CONSERVADA.");
        txtAparatoLocomotor.setPreferredSize(new java.awt.Dimension(81, 20));
        txtAparatoLocomotor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAparatoLocomotorFocusGained(evt);
            }
        });

        jLabel202.setText("  Aparato Locomotor :");

        jLabel102.setText("Miembros Superiores :");

        txtMiembrosSuperiores.setBackground(new java.awt.Color(153, 204, 255));
        txtMiembrosSuperiores.setText("SIMETRICOS, NO DEFORMIDADES, MOTRICIDAD CONSERVADA.");
        txtMiembrosSuperiores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMiembrosSuperioresFocusGained(evt);
            }
        });

        txtMiembrosInferiores.setBackground(new java.awt.Color(153, 204, 255));
        txtMiembrosInferiores.setText("SIMETRICOS, NO DEFORMIDADES, MOTRICIDAD CONSERVADA.");
        txtMiembrosInferiores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMiembrosInferioresFocusGained(evt);
            }
        });

        jLabel103.setText("Miembros Inferiores :");

        jLabel203.setText("Sistema Linfatico :");

        txtSistemaLinfatico.setBackground(new java.awt.Color(153, 204, 255));
        txtSistemaLinfatico.setText("NO ADENOMEGALIAS PATOLOGICA.");
        txtSistemaLinfatico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSistemaLinfaticoFocusGained(evt);
            }
        });

        jLabel187.setText("Sistema Nervioso :");

        txtSistemaNervioso.setBackground(new java.awt.Color(153, 204, 255));
        txtSistemaNervioso.setText("DESPIERTO, OTEP, SENSIBILIDAD Y MOTRICIDAD CONSERVADA, ROTS CONSERVADOS.PARES CRANEALES CONSERVADOS.NO SIGNOS MENINGEOS.");

        jLabel189.setText("Columna Vertebral :");

        txtColumnaVertebral.setBackground(new java.awt.Color(153, 204, 255));
        txtColumnaVertebral.setText("CENTRAL, CURVATURAS CONSERVADAS, MOTRICIDAD CONSERVADA.");

        jLabel101.setText("Oídos :");

        txtOidos.setBackground(new java.awt.Color(153, 204, 255));
        txtOidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOidosFocusGained(evt);
            }
        });

        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Otros Exámenes"));

        txtOtrosEx.setColumns(20);
        txtOtrosEx.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txtOtrosEx.setRows(5);
        txtOtrosEx.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        jScrollPane3.setViewportView(txtOtrosEx);

        jLabel26.setText("Medico que Certifica :");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txtCertifica, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel87)
                            .addComponent(jLabel90)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarcha)
                            .addComponent(txtNariz)
                            .addComponent(txtFaringe)
                            .addComponent(txtBoca)
                            .addComponent(txtCuello)
                            .addComponent(txtcabeza)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel203))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSistemaLinfatico))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtMiembrosSuperiores)
                                            .addComponent(txtMiembrosInferiores))
                                        .addGap(1, 1, 1))))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel201)
                                    .addComponent(jLabel202))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAparatoGenitourinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAparatoLocomotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAparatoDigestivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel200))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAparatoCardivascular)
                                    .addComponent(txtApartoRespiratorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPiel)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel189)
                                    .addComponent(jLabel187))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColumnaVertebral)
                                    .addComponent(txtSistemaNervioso, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOidos)))
                .addGap(53, 53, 53))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtcabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48)
                    .addComponent(txtCuello, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtBoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(txtFaringe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtNariz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(txtOidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtMarcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel200))
                .addGap(6, 6, 6)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(txtApartoRespiratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(txtAparatoCardivascular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(txtAparatoDigestivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel201)
                    .addComponent(txtAparatoGenitourinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAparatoLocomotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel202))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMiembrosSuperiores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMiembrosInferiores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSistemaLinfatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel203))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSistemaNervioso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel187))
                .addGap(2, 2, 2)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColumnaVertebral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel189))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCertifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtFichaMedica.addTab("Examen Fisico", jPanel15);

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

        btnAptitudMedica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/toolbar/Edit.png"))); // NOI18N
        btnAptitudMedica.setText("Aptitud Medica");
        btnAptitudMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAptitudMedicaActionPerformed(evt);
            }
        });

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
                .addComponent(btnAptitudMedica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jSeparator17)
                .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnexo7C1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnexo7C2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAptitudMedica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING)
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
                                        .addComponent(txtDetencionSAS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtCerTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCertificacionAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtAntPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFichaAPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 184, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel155)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtENombre, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel156)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEtipoExamen))))
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
                                .addComponent(lblOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
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
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtDetencionSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel146)
                            .addComponent(lblSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel150)
                            .addComponent(lblConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel153)))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jTabbedPane1.addTab("Estado de Paciente :", jPanel5);

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Hemoglobina / Hematocrito"));

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
                .addComponent(txtHemoHema, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel191))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHemoHema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel191))
                .addGap(2, 2, 2))
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
                .addGap(2, 2, 2))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
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

        jLabel9.setText("Cocaina:");

        txtCoca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel125.setText("Marihuana:");

        txtMarig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btApto.add(chkApto);
        chkApto.setSelected(true);
        chkApto.setText("APTO (para el puesto en el que trabaja o postula)                                 ");
        chkApto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAptoActionPerformed(evt);
            }
        });

        btApto.add(chkRestriccion);
        chkRestriccion.setText("APTO CON RESTRICCION (para el puesto en el que trabaja o postula)");
        chkRestriccion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkRestriccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRestriccionActionPerformed(evt);
            }
        });

        btApto.add(chkNoApto);
        chkNoApto.setText("NO APTO (para el puesto en el que trabaja o postula)                           ");
        chkNoApto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkNoApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoAptoActionPerformed(evt);
            }
        });

        Fecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaPropertyChange(evt);
            }
        });

        jLabel32.setText("Fecha :");

        jLabel33.setText("Fecha Venc.");

        FechaHasta.setEnabled(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkRestriccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkNoApto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(chkApto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(chkApto)
                .addGap(7, 7, 7)
                .addComponent(chkRestriccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkNoApto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(FechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chk3.setText("CORREGIR AGUDEZA VISUAL TOTAL PARA TRABAJO SOBRE 1.8 M.S.N.PISO");
        chk3.setMaximumSize(new java.awt.Dimension(225, 23));
        chk3.setMinimumSize(new java.awt.Dimension(225, 23));
        chk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3ActionPerformed(evt);
            }
        });

        chk12.setText("CORREGIR AGUDEZA VISUAL PARA TRABAJO SOBRE 1.8 M.S.N.PISO");
        chk12.setMaximumSize(new java.awt.Dimension(225, 23));
        chk12.setMinimumSize(new java.awt.Dimension(225, 23));
        chk12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk12ActionPerformed(evt);
            }
        });

        chk4.setText("DIETA HIPOCALORICA Y EJERCICIOS ");
        chk4.setMaximumSize(new java.awt.Dimension(225, 23));
        chk4.setMinimumSize(new java.awt.Dimension(225, 23));
        chk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4ActionPerformed(evt);
            }
        });

        chkNinguno.setText("NINGUNO.");
        chkNinguno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNingunoActionPerformed(evt);
            }
        });

        chk6.setText("EVITAR MOVIMIENTOS Y POSICIONES DISERGONOMICAS");
        chk6.setMaximumSize(new java.awt.Dimension(225, 23));
        chk6.setMinimumSize(new java.awt.Dimension(225, 23));
        chk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk6ActionPerformed(evt);
            }
        });

        chk7.setText("NO HACER TRABAJO DE ALTO RIESGO ");
        chk7.setMaximumSize(new java.awt.Dimension(225, 23));
        chk7.setMinimumSize(new java.awt.Dimension(225, 23));
        chk7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk7ActionPerformed(evt);
            }
        });

        chk10.setText("NO CONDUCIR VEHICULOS ");
        chk10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk10ActionPerformed(evt);
            }
        });

        chk5.setText("USO DE EPP AUDITIVO");
        chk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk5ActionPerformed(evt);
            }
        });

        chk8.setText("NO HACER TRABAJO SOBRE 1.8 M.S.N.PISO");
        chk8.setMaximumSize(new java.awt.Dimension(225, 23));
        chk8.setMinimumSize(new java.awt.Dimension(225, 23));
        chk8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk8ActionPerformed(evt);
            }
        });

        chk11.setText("USO DE EPP AUDITIVO ANTE EXPOSICION A RUIDO >=80 DB");
        chk11.setMaximumSize(new java.awt.Dimension(225, 23));
        chk11.setMinimumSize(new java.awt.Dimension(225, 23));
        chk11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk11ActionPerformed(evt);
            }
        });

        chk9.setText("USO DE LENTES CORRECTORES PARA CONDUCIR Y/O OPERAR VEHICULOS MOTORIZADOS");
        chk9.setMaximumSize(new java.awt.Dimension(225, 23));
        chk9.setMinimumSize(new java.awt.Dimension(225, 23));
        chk9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk9ActionPerformed(evt);
            }
        });

        chk2.setText("USO DE LENTES CORRECTORES PARA TRABAJO.");
        chk2.setMaximumSize(new java.awt.Dimension(225, 23));
        chk2.setMinimumSize(new java.awt.Dimension(225, 23));
        chk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2ActionPerformed(evt);
            }
        });

        chk1.setText("USO DE LENTES CORRECTORES PARA TRABAJO SOBRE 1.8 M.S.N.PISO");
        chk1.setMaximumSize(new java.awt.Dimension(225, 23));
        chk1.setMinimumSize(new java.awt.Dimension(225, 23));
        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk11, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk12, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addComponent(chk4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkNinguno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chk7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chk8, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chk5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chk10, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(chk3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNinguno, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Restricciones"));

        atxtRestricciones.setBackground(new java.awt.Color(51, 204, 255));
        atxtRestricciones.setColumns(20);
        atxtRestricciones.setRows(5);
        jScrollPane5.setViewportView(atxtRestricciones);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel192)
                    .addComponent(txtVSG)
                    .addComponent(jLabel193)
                    .addComponent(jLabel194)
                    .addComponent(jLabel125)
                    .addComponent(txtMarig)
                    .addComponent(jLabel9)
                    .addComponent(txtCoca)
                    .addComponent(txtCreatininaBio)
                    .addComponent(txtGlucosaBio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(2, 2, 2))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel192)
                        .addGap(1, 1, 1)
                        .addComponent(txtVSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel193)
                        .addGap(2, 2, 2)
                        .addComponent(txtGlucosaBio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel194)
                        .addGap(2, 2, 2)
                        .addComponent(txtCreatininaBio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jtFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel123)
                        .addGap(3, 3, 3)
                        .addComponent(btnObsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel123)
                    .addComponent(btnObsv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(txtColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(txtLDLColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(txtHDLColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(txtVLDLColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(txtTrigliseridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jtFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaNacimientoPropertyChange

    }//GEN-LAST:event_FechaNacimientoPropertyChange

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        consultar();  
        
    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtApartoRespiratorioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApartoRespiratorioFocusGained
        txtApartoRespiratorio.selectAll();
    }//GEN-LAST:event_txtApartoRespiratorioFocusGained

    private void txtAparatoCardivascularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAparatoCardivascularFocusGained
        txtAparatoCardivascular.selectAll();
    }//GEN-LAST:event_txtAparatoCardivascularFocusGained

    private void txtAparatoDigestivoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAparatoDigestivoFocusGained
        txtAparatoDigestivo.selectAll();
    }//GEN-LAST:event_txtAparatoDigestivoFocusGained

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtNorden.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtNordenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyReleased

    }//GEN-LAST:event_txtNordenKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(Orden()){
            ActualizarFicha();
            Qui();
        }else if (validar()) {
            try {
                if (Agregar()) {
                    if (tbQuirurgicos.getRowCount() > 0) {
                        if (GrabarAPDetalle()) {
                            txtEOrden.setText(txtNorden.getText().toString());
                            Busca();
                            oPu.oFinalizado(txtDni);
                            limpiar();
                            Qui();
                        }
                    } else {
                        txtEOrden.setText(txtNorden.getText().toString());
                        Busca();
                        oPu.oFinalizado(txtDni);
                        limpiar();
                        Qui();
                    }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(FichaAgroindustriales.class.getName()).log(Level.SEVERE, null, ex);
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
        oPu.print(Norden, "Anexo02.jasper", "Anexo 7C Hoja Nro 1");
    }//GEN-LAST:event_btnAnexo7C1ActionPerformed

    private void btnAnexo7C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7C2ActionPerformed
        Integer Norden = Integer.valueOf(txtEOrden.getText());
        oPu.print(Norden, "Anexo02_1.jasper", "Anexo 7C Hoja Nro 2");
    }//GEN-LAST:event_btnAnexo7C2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnObsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObsvMouseClicked
        MostrarAddObsv1();
    }//GEN-LAST:event_btnObsvMouseClicked

    private void btnEditarFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFMActionPerformed
        if(!txtNorden.getText().isEmpty()){
            if(Orden()){
            editar();
            
        }else {oFunc.SubSistemaMensajeError("No hay datos en anexo  o orden no existe");}
        }else{
            oFunc.SubSistemaMensajeError("Debe ingresar numero de orden");
        }
        
//        String sql="Select * from anexo7c WHERE n.n_orden ='" + txtEOrden.getText().toUpperCase() + "'";
    }//GEN-LAST:event_btnEditarFMActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        Qui();
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

    private void btnObsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObsvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObsvActionPerformed

    private void txtVSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVSGActionPerformed

    }//GEN-LAST:event_txtVSGActionPerformed

    private void txtCreatininaBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatininaBioActionPerformed

    }//GEN-LAST:event_txtCreatininaBioActionPerformed

    private void txtGlucosaBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGlucosaBioActionPerformed

    }//GEN-LAST:event_txtGlucosaBioActionPerformed

    private void chkSctrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSctrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSctrActionPerformed

    private void chkEpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEpsActionPerformed

    private void chkEssaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEssaludActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEssaludActionPerformed

    private void txtAparatoGenitourinarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAparatoGenitourinarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAparatoGenitourinarioFocusGained

    private void txtAparatoLocomotorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAparatoLocomotorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAparatoLocomotorFocusGained

    private void txtSistemaLinfaticoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSistemaLinfaticoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSistemaLinfaticoFocusGained

    private void txtFaringeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFaringeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaringeFocusGained

    private void txtEnfermedadesOculares1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnfermedadesOculares1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnfermedadesOculares1FocusGained

    private void txtMiembrosInferioresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMiembrosInferioresFocusGained
        txtMiembrosInferiores.selectAll();
    }//GEN-LAST:event_txtMiembrosInferioresFocusGained

    private void txtMiembrosSuperioresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMiembrosSuperioresFocusGained
        txtMiembrosSuperiores.selectAll();
    }//GEN-LAST:event_txtMiembrosSuperioresFocusGained

    private void txtEstadoMentalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoMentalFocusGained
        txtEstadoMental.selectAll();
    }//GEN-LAST:event_txtEstadoMentalFocusGained

    private void txtAnamnesisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnamnesisFocusGained
        txtAnamnesis.selectAll();
    }//GEN-LAST:event_txtAnamnesisFocusGained

    private void txtEctoscopiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEctoscopiaFocusGained
        txtEctoscopia.selectAll();
    }//GEN-LAST:event_txtEctoscopiaFocusGained

    private void txtCuelloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuelloFocusGained
        txtCuello.selectAll();
    }//GEN-LAST:event_txtCuelloFocusGained

    private void txtNarizFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNarizFocusGained
        txtNariz.selectAll();
    }//GEN-LAST:event_txtNarizFocusGained

    private void txtReflejosPupilaresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReflejosPupilaresFocusGained
        txtReflejosPupilares.selectAll();
    }//GEN-LAST:event_txtReflejosPupilaresFocusGained

    private void txtEnfermedadesOcularesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnfermedadesOcularesFocusGained
        txtEnfermedadesOculares.selectAll();
    }//GEN-LAST:event_txtEnfermedadesOcularesFocusGained

    private void txtVisionColoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVisionColoresFocusGained
        txtVisionColores.selectAll();
    }//GEN-LAST:event_txtVisionColoresFocusGained

    private void txtBocaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBocaFocusGained
        txtBoca.selectAll();
    }//GEN-LAST:event_txtBocaFocusGained

    private void txtcabezaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcabezaFocusGained
        txtcabeza.selectAll();
    }//GEN-LAST:event_txtcabezaFocusGained

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

    private void chkNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNormalActionPerformed
        if (chkPatrobs.isSelected()) {
            txtConclusion.setText(null);
        }
        chkPatrobs.setSelected(false);
        if (chkNormal.isSelected()) {
            txtConclusion.append("- NORMAL" + '\n');
        }
    }//GEN-LAST:event_chkNormalActionPerformed

    private void txtFVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFVCActionPerformed

    }//GEN-LAST:event_txtFVCActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddAP();
        txtEnfaccidente.setText(null);
        rbSiTrabajo.setSelected(false);
        rbNoTrabajo.setSelected(false);
        txtAnioTrabajo.setText(null);
        txtDiasDesanso.setText(null);
        txtEnfaccidente.requestFocusInWindow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnQuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuiMouseClicked
        Qui();
        String sql = "DELETE FROM accidentes_trabajo"
        + " WHERE cod_anexo ='" +num+ "' RETURNING cod_anexo";
        if (oConn.FnBoolQueryExecute(sql)) {
            oFunc.SubSistemaMensajeInformacion("Se ha se elimino la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo eliminar");
        }
    }//GEN-LAST:event_btnQuiMouseClicked

    private void chkAPOtrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAPOtrosMouseClicked
       if(chkAPOtros.isSelected()){
           txtOtrosAntecendetes.setEditable(true);
           txtOtrosAntecendetes.setEnabled(true);
           txtOtrosAntecendetes.requestFocus();
       }else{
           txtOtrosAntecendetes.setEditable(false);
           txtOtrosAntecendetes.setEnabled(false);
       }
        
               
    }//GEN-LAST:event_chkAPOtrosMouseClicked

    private void rbMedsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMedsiMouseClicked
       if(rbMedsi.isSelected()){
           txtTipMed.setEditable(true);
           txtMedFrecuencia.setEditable(true);
           txtTipMed.requestFocus();
       }
    }//GEN-LAST:event_rbMedsiMouseClicked

    private void chkNeoplasiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkNeoplasiaMouseClicked
       if(chkNeoplasia.isSelected()){
           txtNeoplasia.setEditable(true);
           txtNeoplasia.requestFocus();
       }else{
           txtNeoplasia.setEditable(false);
       }
    }//GEN-LAST:event_chkNeoplasiaMouseClicked

    private void chkITSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkITSMouseClicked
       if(chkITS.isSelected()){
           txtIts.setEditable(true);
           txtIts.requestFocus();
       }else{
           txtIts.setEditable(false);
       }
    }//GEN-LAST:event_chkITSMouseClicked

    private void chkQuemadurasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkQuemadurasMouseClicked
        if(chkQuemaduras.isSelected()){
           txtQuemaduras.setEditable(true);
           txtQuemaduras.requestFocus();
       }else{
           txtQuemaduras.setEditable(false);
       }
    }//GEN-LAST:event_chkQuemadurasMouseClicked

    private void chkCirugiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkCirugiasMouseClicked
        if(chkCirugias.isSelected()){
           txtCirugias.setEditable(true);
           txtCirugias.requestFocus();
       }else{
           txtCirugias.setEditable(false);
       }
    }//GEN-LAST:event_chkCirugiasMouseClicked

    private void txtOidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOidosFocusGained

    private void txtNarizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNarizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNarizActionPerformed

    private void rbMednoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMednoMouseClicked
         if(rbMedno.isSelected()){
           txtTipMed.setEditable(false);
           txtMedFrecuencia.setEditable(false);
       }
    }//GEN-LAST:event_rbMednoMouseClicked

    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed

        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk1.isSelected()){
            atxtRestricciones.append("- USO DE LENTES CORRECTORES PARA TRABAJO SOBRE 1.8 M.S.N.PISO." + '\n');

        }
    }//GEN-LAST:event_chk1ActionPerformed

    private void chk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk2.isSelected()){
            atxtRestricciones.append("- USO DE LENTES CORRECTORES PARA TRABAJO." + '\n');
        }
    }//GEN-LAST:event_chk2ActionPerformed

    private void chk9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk9ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk9.isSelected()){
            atxtRestricciones.append("- USO DE LENTES CORRECTORES PARA CONDUCIR Y/O OPERAR VEHICULOS MOTORIZADOS." + '\n');}
    }//GEN-LAST:event_chk9ActionPerformed

    private void chk11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk11ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk11.isSelected()){
            atxtRestricciones.append("- USO DE EPP AUDITIVO ANTE EXPOSICION A RUIDO >=80 DB." + '\n');}
    }//GEN-LAST:event_chk11ActionPerformed

    private void chk8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk8ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk8.isSelected()){
            atxtRestricciones.append("- NO HACER TRABAJO SOBRE 1.8 M.S.N.PISO" + '\n');}
    }//GEN-LAST:event_chk8ActionPerformed

    private void chk7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk7ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk7.isSelected()){
            atxtRestricciones.append("- NO HACER TRABAJO DE ALTO RIESGO." + '\n');}
    }//GEN-LAST:event_chk7ActionPerformed

    private void chk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk6ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk6.isSelected()){
            atxtRestricciones.append("- EVITAR MOVIMIENTOS Y POSICIONES DISERGONOMICAS." + '\n');}
    }//GEN-LAST:event_chk6ActionPerformed

    private void chk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4ActionPerformed
        // TODO add your handling code here:
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk4.isSelected()){
            atxtRestricciones.append("- DIETA HIPOCALORICA Y EJERCICIOS." + '\n');}
    }//GEN-LAST:event_chk4ActionPerformed

    private void chk12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk12ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk12.isSelected()){
            atxtRestricciones.append("- CORREGIR AGUDEZA VISUAL PARA TRABAJO SOBRE 1.8 M.S.N.PISO." + '\n');}
    }//GEN-LAST:event_chk12ActionPerformed

    private void chk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk3.isSelected()){
            atxtRestricciones.append("- CORREGIR AGUDEZA VISUAL TOTAL PARA TRABAJO SOBRE 1.8 M.S.N.PISO." + '\n'); }
    }//GEN-LAST:event_chk3ActionPerformed

    private void chkNingunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNingunoActionPerformed
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
        atxtRestricciones.setText(null);
        atxtRestricciones.append("- NINGUNO." + '\n');

    }//GEN-LAST:event_chkNingunoActionPerformed

    private void chk10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk10ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk10.isSelected()){
            atxtRestricciones.append("- NO CONDUCIR VEHICULOS." + '\n');}
    }//GEN-LAST:event_chk10ActionPerformed

    private void chk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk5ActionPerformed
        if(chkNinguno.isSelected()){atxtRestricciones.setText(null);}
        chkNinguno.setSelected(false);
        if(chk5.isSelected()){
            atxtRestricciones.append("- USO DE EPP AUDITIVO." + '\n');}
    }//GEN-LAST:event_chk5ActionPerformed

    private void chkAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAptoActionPerformed
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
        atxtRestricciones.setText(null);
        atxtRestricciones.append("- NINGUNO." + '\n');
    }//GEN-LAST:event_chkAptoActionPerformed

    private void FechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaPropertyChange
      if (((JTextField) Fecha.getDateEditor().getUiComponent()).getText().trim().length() > 2) {

             Calendar hasta = Calendar.getInstance();
        hasta.setTime(Fecha.getDate());
        hasta.add(Calendar.YEAR, 1);
        FechaHasta.setCalendar(hasta);
        }
    }//GEN-LAST:event_FechaPropertyChange

    private void chkRestriccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRestriccionActionPerformed
        atxtRestricciones.setText(null);
    }//GEN-LAST:event_chkRestriccionActionPerformed

    private void chkNoAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoAptoActionPerformed
        atxtRestricciones.setText(null);
    }//GEN-LAST:event_chkNoAptoActionPerformed

    private void btnAptitudMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAptitudMedicaActionPerformed
         Integer Norden = Integer.valueOf(txtEOrden.getText());
        oPu.print(Norden, "Aptitud_Agroindustrial.jasper", "Aptitud Medica");
    }//GEN-LAST:event_btnAptitudMedicaActionPerformed
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
     void fechaHasta(){
        Calendar hasta = Calendar.getInstance();
        hasta.add(Calendar.YEAR, 1);
        FechaHasta.setCalendar(hasta);
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

        sQuery = "Select n_orden from anexo_agroindustrial Where n_orden=" + txtNorden.getText().toString();

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
        Fecha.setDate(fechaDate);
    }
    
    void editar(){
                String Consulta = "SELECT d.cod_pa,d.nombres_pa,d.apellidos_pa,d.fecha_nacimiento_pa,d.sexo_pa,d.lugar_nac_pa,d.direccion_pa,\n" +
"                   d.tel_casa_pa,d.cel_pa,d.estado_civil_pa,d.nivel_est_pa,n.razon_empresa,n.razon_contrata,n.nom_examen,n.nom_ex,\n" +
"                    n.altura_po,n.mineral_po,n.cargo_de,n.area_o,ap.txtvhijosvivos,ap.txtvhijosfallecidos,ap.txtdhijosvivos,ap.txtdhijosfallecidos,\n" +
"                    t.talla,t.peso,t.imc,t.sistolica,t.diastolica,t.f_respiratoria,t.f_cardiaca,\n" +
"                    t.sat_02,t.temperatura,t.cintura,t.cadera,t.icc,t.perimetro_cuello,o.v_cerca_s_od,\n" +
"                    o.v_cerca_s_oi,o.v_cerca_c_od,o.v_cerca_c_oi,o.v_lejos_s_od,o.v_lejos_s_oi,o.v_lejos_c_od,o.v_lejos_c_oi,o.v_binocular, \n" +
"                    o.e_oculares,o.e_oculares1, odontograma.txtausentes,odontograma.txtobservaciones,odontograma.txtpiezasmalestado,r.txtobservacionesrt,\n" +
"                    l.txtobservacioneslb, e.txtobservacionesrs,l.chko, l.chka , l.chkb , l.chkab,l.rbrhpositivo, l.rbrhnegativo,"
                         + " l.txthemoglobina,l.txtglucosabio,l.txtvsg,l.txtcocaina,l.txtmarihuana,l.txtcreatininabio,m.o_d_500,m.o_d_1000,m.o_d_2000,m.o_d_3000,\n" +
"                    m.o_d_4000,m.o_d_6000,m.o_d_8000,m.o_i_500,m.o_i_1000,m.o_i_2000,m.o_i_3000,m.o_i_4000,m.o_i_6000,m.o_i_8000 ,\n" +
"                    funcion_abs.fvc,funcion_abs.fev1,funcion_abs.fev1fvc,funcion_abs.fef25_75,funcion_abs.interpretacion,\n" +
"                   a.cod_anexo, a.n_orden, a.fecha, a.chkneoplasia, a.txtneoplasia, a.chkits, \n" +
            "       a.txtits, a.chkquemaduras, a.txtquemaduras, a.chkcirugias, a.txtcirugias, \n" +
            "       a.chkapotros, a.txtotrosantecendetes, a.chkresidenciasi, a.chkresidenciano, \n" +
            "       a.txttiemporesidencia, a.chkessalud, a.chkeps, a.chkotros, a.chksctr, a.chkotros1, \n" +
            "       a.txtpadre, a.txtmadre, a.txthermanos, a.txtesposa, a.txtpuestoactual, \n" +
            "       a.txttiempo, a.rbsimed, a.rbnomed, a.txttipomedicamento, a.txtfrecuenciamed, \n" +
            "       a.txttotalhijos, a.txtndependientes,a.txtvisioncolores, a.txtenfermedadesoculares,a.txtreflejospupilares,a.txtbinocular,\n" +
            "       a.txtpelo, a.txtnariz, a.txtcuello, a.txtperimetro, a.txtboca, a.txtoidos, \n" +
            "       a.txtfaringe,a.txtmiembrossuperiores, a.txtmiembrosinferiores, a.txtectoscopia, \n" +
            "       a.txtestadomental, a.txtanamnesis, a.txtmarcha, a.txtcolumnavertebral, \n" +
            "       a.txtaparatorespiratorio, a.txtaparatocardiovascular, a.txtaparatodigestivo, \n" +
            "       a.txtaparatogeiotourinario, a.txtaparatolocomotor, a.txtsistemalinfatico, \n" +
            "       a.txtpiel, a.txtobservacionesfm, a.txtconclusion, a.txtedad, a.txtenfermedadesoculares1, \n" +
            "       a.sistemanervioso, a.txtotrosex, a.txtrestricciones, a.apto_si, a.apto_no, \n" +
            "       a.apto_re,a.fechadesde, a.fechahasta, a.medico  " +
"                    FROM datos_paciente AS d "+
                    "LEFT JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) \n" +
"                    LEFT JOIN antecedentes_patologicos AS ap ON(n.n_orden = ap.n_orden)\n" +
"                    LEFT JOIN triaje as t ON(n.n_orden = t.n_orden) \n" +
"                    LEFT JOIN oftalmologia AS o ON(n.n_orden = o.n_orden)\n" +
"                    LEFT JOIN funcion_abs ON(n.n_orden = funcion_abs.n_orden)\n" +
"                    LEFT JOIN radiografia_torax AS r ON(n.n_orden = r.n_orden)\n" +
"                    LEFT JOIN lab_clinico AS l ON(n.n_orden = l.n_orden)\n" +
"                    LEFT JOIN ex_radiograficos_sanguineos AS e ON(n.n_orden = e.n_orden)\n" +
"                    LEFT JOIN odontograma ON(n.n_orden = odontograma.n_orden)\n" +
"                    LEFT JOIN audiometria_po AS m ON(n.n_orden =m.n_orden)\n" +
"                    LEFT JOIN anexo_agroindustrial as a ON(n.n_orden = a.n_orden)" +
                    " WHERE a.n_orden ='" + txtNorden.getText().toString() + "'";
                
                oConn.FnBoolQueryExecute(Consulta);
                String sexo;
                try {
                    if (oConn.setResult.next()) {
                       
                        if (oConn.setResult.getString("txtobservaciones") != null) {
                            txtObservacionesFichaMedica.append("-ODONTOGRAMA : " + oConn.setResult.getString("txtobservaciones").concat("\n"));
                        }
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
                             String hemo=oConn.setResult.getString("txthemoglobina");
                            txtHemoHema.setText(hemo);
                            rbO.setSelected(oConn.setResult.getBoolean("chko"));
                            rbA.setSelected(oConn.setResult.getBoolean("chka"));
                            rbB.setSelected(oConn.setResult.getBoolean("chkb"));
                            rbAB.setSelected(oConn.setResult.getBoolean("chkab"));
                            rbRhPositivo.setSelected(oConn.setResult.getBoolean("rbrhpositivo"));
                            rbRhNegativo.setSelected(oConn.setResult.getBoolean("rbrhnegativo"));
                            
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
                            
                            sexo = oConn.setResult.getString("sexo_pa");
                            if(!"N/A".equals(hemo) && txtHemoHema.getText().isEmpty()){
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
                            if(!txtGlucosaBio.getText().isEmpty()&& !"N/A".equals(txtGlucosaBio.getText()) ){
                            float glucosa = Float.parseFloat(txtGlucosaBio.getText().toString());
                                if (glucosa >= 110 || glucosa < 70) {
                                    txtGlucosaBio.setForeground(Color.red);
                                } else {
                                    txtGlucosaBio.setForeground(Color.black);
                                }
                            }
                        if (txtCreatininaBio.getText().isEmpty()&& !"N/A".equals(txtCreatininaBio.getText()) ) {
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
                        txtFEV1.setText(oConn.setResult.getString("fev1"));
                        txtFEV1FVC.setText(oConn.setResult.getString("fev1fvc"));

                        txtFEF2575.setText(oConn.setResult.getString("fef25_75"));
                        txtConclusion.setText(oConn.setResult.getString("interpretacion"));
                        txtMalEstado.setText(oConn.setResult.getString("txtpiezasmalestado"));

                        txtFaltan.setText(oConn.setResult.getString("txtausentes"));
                        String hvivos=oConn.setResult.getString("txtvhijosvivos");
                        String hfallecidos=oConn.setResult.getString("txtvhijosfallecidos");
                        if (txtSexo.getText().equals("M")) {
                            txtHijosvivos.setText( hvivos== null ? "0" : hvivos);
                            txtHijosMuertos.setText( hfallecidos== null ? "0" : hfallecidos);
                        } else {
                            txtHijosvivos.setText(hvivos == null ? "0" : hvivos);
                            txtHijosMuertos.setText(hfallecidos == null ? "0" : hfallecidos);
                        }
                        if(!txtHijosvivos.getText().isEmpty()&&!txtHijosMuertos.getText().isEmpty()){
                            Integer hv=Integer.parseInt(txtHijosvivos.getText());
                            Integer hm=Integer.parseInt(txtHijosMuertos.getText());
                            txtTotalhijos.setText(String.valueOf(hv+hm));
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
                        //anexo7c....................................
                        num=Integer.valueOf(oConn.setResult.getString("cod_anexo"));
                        FechaFicha.setDate(oConn.setResult.getDate("fecha"));
                        chkNeoplasia.setSelected(oConn.setResult.getBoolean("chkneoplasia"));
                        txtNeoplasia.setText(oConn.setResult.getString("txtneoplasia"));                        
                        chkITS.setSelected(oConn.setResult.getBoolean("chkits"));
                        txtIts.setText(oConn.setResult.getString("txtits"));      
                        chkQuemaduras.setSelected(oConn.setResult.getBoolean("chkquemaduras"));
                        txtQuemaduras.setText(oConn.setResult.getString("txtquemaduras"));  
                        chkCirugias.setSelected(oConn.setResult.getBoolean("chkcirugias"));
                        txtCirugias.setText(oConn.setResult.getString("txtcirugias"));  
                        chkAPOtros.setSelected(oConn.setResult.getBoolean("chkapotros"));
                        txtOtrosAntecendetes.setText(oConn.setResult.getString("txtotrosantecendetes"));
                        chkResidenciaSI.setSelected(oConn.setResult.getBoolean("chkresidenciasi"));
                        chkResidenciaNo.setSelected(oConn.setResult.getBoolean("chkresidenciano"));
                        txtTiempoResidencia.setText(oConn.setResult.getString("txttiemporesidencia"));
                        chkEssalud.setSelected(oConn.setResult.getBoolean("chkessalud"));
                        chkEps.setSelected(oConn.setResult.getBoolean("chkeps"));
                        chkOtros.setSelected(oConn.setResult.getBoolean("chkotros"));
                        chkSctr.setSelected(oConn.setResult.getBoolean("chkSctr"));
                        chkOtros1.setSelected(oConn.setResult.getBoolean("chkotros1"));
                        txtPadre.setText(oConn.setResult.getString("txtpadre"));
                        txtMadre.setText(oConn.setResult.getString("txtmadre"));
                        txtHermanos.setText(oConn.setResult.getString("txthermanos"));
                        txtEsposa.setText(oConn.setResult.getString("txtesposa"));
                        txtPuestoActual.setText(oConn.setResult.getString("txtpuestoactual"));
                        txtTiempo.setText(oConn.setResult.getString("txttiempo"));
                        rbMedsi.setSelected(oConn.setResult.getBoolean("rbsimed"));
                        rbMedno.setSelected(oConn.setResult.getBoolean("rbnomed"));
                        txtTipMed.setText(oConn.setResult.getString("txttipomedicamento"));
                        txtMedFrecuencia.setText(oConn.setResult.getString("txtfrecuenciamed"));
                        txtTotalhijos.setText(oConn.setResult.getString("txttotalHijos"));
                        txtNDependientes.setText(oConn.setResult.getString("txtndependientes"));
                        txtcabeza.setText(oConn.setResult.getString("txtpelo"));
                        txtNariz.setText(oConn.setResult.getString("txtnariz"));
                        txtCuello.setText(oConn.setResult.getString("txtcuello"));
                        txtPerimetro.setText(oConn.setResult.getString("txtperimetro"));
                        txtBoca.setText(oConn.setResult.getString("txtboca"));
                        txtOidos.setText(oConn.setResult.getString("txtoidos"));
                        txtFaringe.setText(oConn.setResult.getString("txtfaringe"));
                        txtVisionColores.setText(oConn.setResult.getString("txtvisioncolores"));
                        txtEnfermedadesOculares.setText(oConn.setResult.getString("txtenfermedadesoculares"));
                        txtEnfermedadesOculares1.setText(oConn.setResult.getString("txtenfermedadesoculares1"));
                        txtReflejosPupilares.setText(oConn.setResult.getString("txtreflejospupilares"));
                        txtBinocular.setText(oConn.setResult.getString("txtbinocular"));
                        txtMiembrosSuperiores.setText(oConn.setResult.getString("txtmiembrossuperiores"));
                        txtMiembrosInferiores.setText(oConn.setResult.getString("txtmiembrosinferiores"));
                        txtEctoscopia.setText(oConn.setResult.getString("txtectoscopia"));
                        txtEstadoMental.setText(oConn.setResult.getString("txtestadomental"));
                        txtAnamnesis.setText(oConn.setResult.getString("txtanamnesis"));
                        
                        txtMarcha.setText(oConn.setResult.getString("txtmarcha"));
                        txtColumnaVertebral.setText(oConn.setResult.getString("txtcolumnavertebral"));
                        txtApartoRespiratorio.setText(oConn.setResult.getString("txtaparatorespiratorio"));
                        txtAparatoCardivascular.setText(oConn.setResult.getString("txtaparatocardiovascular"));
                        txtAparatoDigestivo.setText(oConn.setResult.getString("txtaparatodigestivo"));
                         txtAparatoGenitourinario.setText(oConn.setResult.getString("txtaparatogeiotourinario"));
                        txtAparatoLocomotor.setText(oConn.setResult.getString("txtaparatolocomotor"));
                        txtSistemaLinfatico.setText(oConn.setResult.getString("txtsistemalinfatico"));
                        txtSistemaNervioso.setText(oConn.setResult.getString("sistemanervioso"));
                        txtPiel.setText(oConn.setResult.getString("txtpiel"));
                        txtObservacionesFichaMedica.setText(oConn.setResult.getString("txtobservacionesfm"));
                        txtConclusion.setText(oConn.setResult.getString("txtconclusion"));
                        atxtRestricciones.setText(oConn.setResult.getString("txtrestricciones"));
                        txtEdad.setText(oConn.setResult.getString("txtedad"));
                        chkApto.setSelected(oConn.setResult.getBoolean("apto_si"));
                        chkNoApto.setSelected(oConn.setResult.getBoolean("apto_no"));
                        chkRestriccion.setSelected(oConn.setResult.getBoolean("apto_re"));
                        Fecha.setDate(oConn.setResult.getDate("fechadesde"));
                        FechaFicha.setDate(oConn.setResult.getDate("fechahasta"));
                        txtCertifica.setText(oConn.setResult.getString("medico"));
                        //----
                       oPu.fecha(FechaFicha);
//                       electroCardiograma();
//                       cargarAnalisisB();
//                       editarRadiogrSan();
                       electroCardiograma();
                       DetalleEnfermedades();
//                       cargarExamSanguineos();
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
                        + "triaje.talla,triaje.peso,triaje.imc,triaje.sistolica,triaje.diastolica,triaje.f_respiratoria,triaje.f_cardiaca,triaje.sat_02,"
                         + "triaje.temperatura,triaje.cintura,triaje.cadera,triaje.icc,triaje.perimetro_cuello,o.v_cerca_s_od,o.v_cerca_s_oi,"
                         + "o.v_cerca_c_od,o.v_cerca_c_oi,o.v_lejos_s_od,o.v_lejos_s_oi,o.v_lejos_c_od,o.v_lejos_c_oi,o.v_colores,o.v_binocular, o.e_oculares,o.e_oculares1, "
                         + "o.e_oculvisionlejos,odontograma.txtausentes,odontograma.txtobservaciones,odontograma.txtpiezasmalestado,r.txtvertices,r.txthilios, "
                         + "r.txtsenoscostofrenicos, r.txtmediastinos, r.txtsiluetacardiovascular, r.txtosteomuscular, r.txtconclusionesradiograficas,"
                         + " r.txtobservacionesrt, r.txtcampospulm,l.txtobservacioneslb,l.chko, l.chka , l.chkb , l.chkab,l.rbrhpositivo, l.rbrhnegativo,"
                         + " l.txthemoglobina,l.txtglucosabio,l.txtvsg,l.txtcocaina,l.txtmarihuana,l.txtcreatininabio, CASE WHEN l.chko = 'TRUE' THEN 'O'"
                            + " WHEN l.chka = 'TRUE' THEN 'A'"
                            + " WHEN l.chkb = 'TRUE' THEN 'B'"
                            + " WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| "
                            + "CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' "
                            + " WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS Grupofactor ,"
                         + "m.o_d_500,m.o_d_1000,m.o_d_2000,m.o_d_3000,m.o_d_4000,m.o_d_6000,m.o_d_8000,"
                         + "m.o_i_500,m.o_i_1000,m.o_i_2000,m.o_i_3000,m.o_i_4000,m.o_i_6000,m.o_i_8000,m.diagnostico ,funcion_abs.fvc,funcion_abs.fev1,"
                         + "funcion_abs.fev1fvc,funcion_abs.fef25_75,funcion_abs.interpretacion "
                        + "FROM datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) "
                        + "INNER JOIN antecedentes_patologicos AS a ON(n.n_orden = a.n_orden) "
                        + "INNER JOIN triaje ON(n.n_orden = triaje.n_orden) "
                        + "INNER JOIN oftalmologia AS o ON(n.n_orden = o.n_orden)"
                        + "INNER JOIN funcion_abs ON(n.n_orden = funcion_abs.n_orden)"
                        + "INNER JOIN radiografia_torax AS r ON(n.n_orden = r.n_orden)"
                        + "INNER JOIN lab_clinico AS l ON(n.n_orden = l.n_orden)"
//                      + "INNER JOIN ex_radiograficos_sanguineos AS e ON(n.n_orden = e.n_orden)"
                        + "INNER JOIN odontograma ON(n.n_orden = odontograma.n_orden)"
                        + "INNER JOIN audiometria_po AS m ON(n.n_orden =m.n_orden)WHERE n.n_orden ='" + txtNorden.getText().toString() + "'";
                
                oConn.FnBoolQueryExecute(Consulta);
                String sexo;
                try {
                    if (oConn.setResult.next()) {
                        if (oConn.setResult.getString("txtobservaciones") != null && !"NINGUNA".equals(oConn.setResult.getString("txtobservaciones")) ) {
                            txtObservacionesFichaMedica.append("-ODONTOGRAMA : " + oConn.setResult.getString("txtobservaciones").concat("\n"));
                            
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
                            txtObservacionesFichaMedica.append("-RADIOGRAFIA : " + oConn.setResult.getString("txtobservacionesrt").concat("\n"));
                        }
                        //-----
                        if (oConn.setResult.getString("txtobservacioneslb") != null ) {
                            txtObservacionesFichaMedica.append("-LAB CLINICO: " + oConn.setResult.getString("txtobservacioneslb").concat("\n"));
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
                             String hemo=oConn.setResult.getString("txthemoglobina");
                            txtHemoHema.setText(hemo);
                            rbO.setSelected(oConn.setResult.getBoolean("chko"));
                            rbA.setSelected(oConn.setResult.getBoolean("chka"));
                            rbB.setSelected(oConn.setResult.getBoolean("chkb"));
                            rbAB.setSelected(oConn.setResult.getBoolean("chkab"));
                            rbRhPositivo.setSelected(oConn.setResult.getBoolean("rbrhpositivo"));
                            rbRhNegativo.setSelected(oConn.setResult.getBoolean("rbrhnegativo"));
                            
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
                            
                            sexo = oConn.setResult.getString("sexo_pa");
                            if(!"N/A".equals(hemo) && !txtHemoHema.getText().isEmpty()){
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
                            
                            txtVSG.setText(vsg);
                            txtGlucosaBio.setText(gluc);
                            txtCreatininaBio.setText(creat);
                            if(!txtGlucosaBio.getText().isEmpty() && !"N/A".equals(txtGlucosaBio.getText())){
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
                        if("N/A".equals(txtFVC.getText().toString()) && !txtFVC.getText().isEmpty()){
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
                            float malEstado = Float.parseFloat(txtMalEstado.getText());
                            if (malEstado>=1) {
                                txtObservacionesFichaMedica.append("-CARIES DENTAL.TTO.EVALUACION EN 6 MESES." + '\n');
                            }
                        }
                        txtFaltan.setText(oConn.setResult.getString("txtausentes"));
                        String hvivos=oConn.setResult.getString("txtvhijosvivos");
                        String hfallecidos=oConn.setResult.getString("txtvhijosfallecidos");
                        if (txtSexo.getText().equals("M")) {
                            txtHijosvivos.setText( hvivos== null ? "0" : hvivos);
                            txtHijosMuertos.setText( hfallecidos== null ? "0" : hfallecidos);
                        } else {
                            txtHijosvivos.setText(hvivos == null ? "0" : hvivos);
                            txtHijosMuertos.setText(hfallecidos == null ? "0" : hfallecidos);
                        }
                        if(!txtHijosvivos.getText().isEmpty()&&!txtHijosMuertos.getText().isEmpty()){
                            Integer hv=Integer.parseInt(txtHijosvivos.getText());
                            Integer hm=Integer.parseInt(txtHijosMuertos.getText());
                            txtTotalhijos.setText(String.valueOf(hv+hm));
                        }
                        txtIMC.setText(oConn.setResult.getString("imc"));
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
                                txtObservacionesFichaMedica.append("-OBESIDAD II.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS" + '\n');
                            } //else {
//                                txtObservacionesFichaMedica.append("-OBESIDAD III.NO HACER TRABAJO 1.8 M.N PISO.DIETA HIPOCALORICA Y EJERCICIOS" + '\n');
//                            } 
                        }
                        
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
//                        txtSistolica.setText(oConn.setResult.getString("sistolica"));
//                        txtDiastolica.setText(oConn.setResult.getString("diastolica"));
                        String sistolica=oConn.setResult.getString("sistolica");
                        String diastolica=oConn.setResult.getString("diastolica");
                        txtSistolica.setText(sistolica);
                        txtDiastolica.setText(diastolica);
//                        txtConclusion.setText(oConn.setResult.getString("interpretacion"));
                        //
                        txtGrupoFacLab.setText(oConn.setResult.getString("Grupofactor"));
                        txtCercaSinCorregirOD.setText(oConn.setResult.getString("v_cerca_s_od"));
                        txtCercaSinCorregirOI.setText(oConn.setResult.getString("v_cerca_s_oi"));
                        txtCercaCorregidaOD.setText(oConn.setResult.getString("v_cerca_c_od"));
                        txtCercaCorregidaOI.setText(oConn.setResult.getString("v_cerca_c_oi"));
                        txtLejosSinCorregirOD.setText(oConn.setResult.getString("v_lejos_s_od"));
                        txtLejosSinCorregirOI.setText(oConn.setResult.getString("v_lejos_s_oi"));
                        txtLejosCorregidaOD.setText(oConn.setResult.getString("v_lejos_c_od"));
                        txtLejosCorregidaOI.setText(oConn.setResult.getString("v_lejos_c_oi"));
                        txtVisionColores.setText(oConn.setResult.getString("v_colores"));
                        txtBinocular.setText(oConn.setResult.getString("v_binocular"));
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
                        if(!txtCercaSinCorregirOD.getText().isEmpty()){
//                           diagnosticoOftalmologia();
                            if(!"NINGUNA".equals(txtEnfermedadesOculares.getText().toString())  && 
                                    !txtEnfermedadesOculares.getText().isEmpty() ){
                                txtObservacionesFichaMedica.append("- "+txtEnfermedadesOculares.getText().toString() + '\n');
                            }
                        }
                        if("PTERIGION BILATERAL".equals(txtEnfermedadesOculares1.getText().toString())){
                            txtObservacionesFichaMedica.append("- PTERIGION BILATERAL:EVALUACION X OFTALMOLOGIA." + '\n');
                        }else if(!"NINGUNA".equals(txtEnfermedadesOculares1.getText().toString()) && !txtEnfermedadesOculares1.getText().isEmpty()){
                                txtObservacionesFichaMedica.append(txtEnfermedadesOculares1.getText().toString().concat(":EVALUACION X OFTALMOLOGIA.") + '\n');
                        }
//                        if(!"NINGUNA".equals(txtEnfermedadesOculares.getText().toString())){
//                                txtObservacionesFichaMedica.append(txtEnfermedadesOculares.getText().toString() + '\n');
//                        }
                        if(!"NINGUNA".equals(txtVisionColores.getText().toString())&& !"NORMAL".equals(txtVisionColores.getText().toString())){
                                txtObservacionesFichaMedica.append("- "+txtVisionColores.getText().toString() + '\n');
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
                        String s=oConn.setResult.getString("diagnostico");
                         //************************************************************
                        if(!txtOD500.getText().isEmpty() && !"N/A".equals(txtOD500.getText())&&!"NORMAL".equals(s)){
                           txtObservacionesFichaMedica.append(s.concat(".USO DE EPP AUDITIVO.EVALUACION ANUAL "));
                        }else if("N/A".equals(txtOD500.getText())){
                             txtObservacionesFichaMedica.append("NO PASO EXAMEN AUDIOMETRIA." + '\n');
                        }
                         //************************************************************
                       oPu.fecha(FechaFicha);
                       oPu.fecha(Fecha);
                       fechaHasta();
                       if(chkApto.isSelected()){
                           atxtRestricciones.setText("-NINGUNO");
                       }
                       electroCardiograma();
                       cargarAnalisisB();
                       if(txtGrupoFacLab.getText() == null ? txtGFSPrevio.getText() == null : !txtGrupoFacLab.getText().equals(txtGFSPrevio.getText())){
                            oFunc.SubSistemaMensajeError("Grupo Sanguinio incongruente por favotr revisar");
                        }
                        if (!"".equals(sistolica) && !"".equals(diastolica)) {
                            float sistolica1 = Float.parseFloat(sistolica);
                            float diastolica1 = Float.parseFloat(diastolica);
                         
                            if (sistolica1 >= 140 || diastolica1 >= 90) {
                                txtObservacionesFichaMedica.append("- HTA NO CONTROLADA." + '\n');
                            } 
                        }
//                       cargarExamSanguineos();
////                       if (txtOtrosEx.getText().toString() != null ) {
////                            txtObservacionesFichaMedica.append(txtOtrosEx.getText().toString());
////                       }
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
                txtObservacionesFichaMedica.append("- HIPOACUSIA IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionesFichaMedica.append("- HIPOACUSIA IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionesFichaMedica.append("- HIPOACUSIA IZQUIERDO  MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionesFichaMedica.append("- HIPOACUSIA IZQUIERDO  MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionesFichaMedica.append("- HIPOACUSIA IZQUIERDO  LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }//else if(may1>=-10 && may1<=25){
               // txtObservacionesFichaMedica.append("- AUDIOMETRIA: NORMAL \n");    
            //}
        }else if((may>=26 && may<=40)){
            if( may1>=90 ){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO LEVE Y IZQUIERDO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionesFichaMedica.append("- HIPOACUSIA BILATERAL LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        } else if(may>=41 && may<=55){
            if( may1>=90 ){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionesFichaMedica.append("- HIPOACUSIA BILATERAL MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA Y IZQUIERDO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }else if(may>=56 && may<=70){
            if(may1>=90 ){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionesFichaMedica.append("- HIPOACUSIA BILATERAL MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA-SEVERA Y IZQUIERDO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }else if(may>=71 && may<=90){
            if( may1>=90 ){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionesFichaMedica.append("- HIPOACUSIA BILATERAL SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO SEVERA Y IZQUIERDO LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL  \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }else if(may>=90  ){
            if( may1>=90 ){
                txtObservacionesFichaMedica.append("- HIPOACUSIA BILATERAL PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=71 && may1<=90){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=56 && may1<=70){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA-SEVERA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=41 && may1<=55){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA MODERADA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n"); 
            }else if(may1>=26 && may1<=40){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHA PROFUNDA Y IZQUIERDA LEVE.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }else if(may1>=-10 && may1<=25){
                txtObservacionesFichaMedica.append("- HIPOACUSIA DERECHO PROFUNDA.USO DE EPP AUDITIVO.EVALUACION ANUAL \n");    
            }
        }

//                 } else {
//                     oFunc.SubSistemaMensajeInformacion("Falto llenar ficha de electrocardiograma");
//                 }
//            } catch (SQLException ex) {
//            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
//            }  
        
    }
    private void ActualizarFicha(){
        if (validar()) {
            try {
                if (actualizar()) {
                    if (tbQuirurgicos.getRowCount() > 0) {
                        if (GrabarAPDetalle()) {
                            txtEOrden.setText(txtNorden.getText().toString());
                            Busca();
                            oPu.oFinalizado(txtDni);
                            limpiar();
                        }
                    } else {
                        txtEOrden.setText(txtNorden.getText().toString());
                        Busca();
                        oPu.oFinalizado(txtDni);
                        limpiar();
                    }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(FichaAgroindustriales.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private boolean actualizar() throws SQLException{
         boolean bResult = false;
        if (!txtNorden.getText().isEmpty()) {
            if (Orden()) {

                String sql="UPDATE anexo_agroindustrial SET fecha='"+FechaFicha.getDate()+
                    "',chkneoplasia='"+chkNeoplasia.isSelected()+
                    "',txtneoplasia='"+txtNeoplasia.getText().toString()+
                    "',chkits='"+chkITS.isSelected() +
                    "',txtits='"+txtIts.getText().toString()+
                    "',chkquemaduras='"+chkQuemaduras.isSelected()+
                    "',txtquemaduras='"+txtQuemaduras.getText().toString()+
                    "',chkcirugias='"+chkCirugias.isSelected()+
                    "',txtcirugias='"+txtCirugias.getText().toString()+
                    "',chkapotros='"+chkAPOtros.isSelected()+
                    "',txtotrosantecendetes ='"+txtOtrosAntecendetes.getText().toString()+    
                    "',chkresidenciasi='"+chkResidenciaSI.isSelected()+
                    "',chkresidenciano='"+chkResidenciaNo.isSelected()+
                    "',txttiemporesidencia='"+txtTiempoResidencia.getText().toString()+
                    "',chkessalud='"+chkEssalud.isSelected()+
                    "',chkeps='"+chkEps.isSelected()+
                    "',chkotros='"+chkOtros.isSelected()+
                    "',chksctr='"+chkSctr.isSelected()+
                    "',chkotros1='"+chkOtros1.isSelected()+
                    
                    "',txtpadre='"+txtPadre.getText().toString()+
                    "',txtmadre='"+txtMadre.getText().toString()+
                    "',txthermanos='"+txtHermanos.getText().toString()+
                    "',txtesposa='"+txtEsposa.getText().toString() +
                  
                    "',txtpuestoactual='"+txtPuestoActual.getText().toString()+
                    "',txttiempo='"+txtTiempo.getText().toString()+
                    "',rbsimed='"+rbMedsi.isSelected()+
                    "',rbnomed='"+rbMedno.isSelected()+
                    "',txttipomedicamento ='"+txtTipMed.getText().toString()+
                    "',txtfrecuenciamed ='"+txtMedFrecuencia.getText().toString()+
                    "',txthijosvivos='"+txtHijosvivos.getText().toString()+
                    "',txthijosmuertos='"+txtHijosMuertos.getText().toString()+
                     "',txttotalHijos='"+txtTotalhijos.getText().toString()+
                    "',txtndependientes='"+txtNDependientes.getText().toString()+
                    "',txtpelo='"+txtcabeza.getText().toString()+
                    "',txtpiel='"+txtPiel.getText().toString()+
                    "',txtnariz='"+txtNariz.getText().toString()+
                    "',txtcuello='"+txtCuello.getText().toString()+
                    "',txtperimetro='"+txtPerimetro.getText().toString()+
                    "',txtboca='"+txtBoca.getText().toString()+
                    "',txtoidos='"+txtOidos.getText().toString()+
                     "',txtfaringe='"+txtFaringe.getText().toString()+
                    "',txtvisioncolores='"+txtVisionColores.getText().toString()+
                    "',txtenfermedadesoculares='"+txtEnfermedadesOculares.getText().toString()+
                    "',txtreflejospupilares='"+txtReflejosPupilares.getText().toString()+
                    "',txtbinocular='"+txtBinocular.getText().toString()+
                    "',txtmiembrossuperiores='"+txtMiembrosSuperiores.getText().toString()+
                    "',txtmiembrosinferiores='"+txtMiembrosInferiores.getText().toString()+
                    "',txtectoscopia='"+txtEctoscopia.getText().toString()+
                    "',txtestadomental='"+txtEstadoMental.getText().toString()+
                    "',txtanamnesis='"+txtAnamnesis.getText().toString()+
                    "',txtmarcha='"+txtMarcha.getText().toString()+
                    "',txtcolumnavertebral='"+txtColumnaVertebral.getText().toString()+
                    "',txtaparatorespiratorio='"+txtApartoRespiratorio.getText().toString()+
                    "',txtaparatocardiovascular='"+txtAparatoCardivascular.getText().toString()+
                    "',txtaparatodigestivo='"+txtAparatoDigestivo.getText().toString()+
                    "',txtaparatogeiotourinario='"+txtAparatoGenitourinario.getText().toString()+
                    "',txtaparatolocomotor='"+txtAparatoLocomotor.getText().toString()+
                    "',txtsistemalinfatico='"+txtSistemaLinfatico.getText().toString()+
                     "',sistemanervioso ='"+txtSistemaNervioso.getText().toString()+
                    "',txtobservacionesfm='"+txtObservacionesFichaMedica.getText().toString()+
                    "',txtconclusion='"+txtConclusion.getText().toString()+
                    "',txtedad='"+txtEdad.getText().toString()+
                    "',txtenfermedadesoculares1='"+txtEnfermedadesOculares1.getText().toString()+ 
                    "',txtotrosex ='"+txtOtrosEx.getText().toString()+ 
                    "',txtrestricciones ='"+atxtRestricciones.getText().toString()+     
                    "',apto_si='"+chkApto.isSelected()+  
                    "',apto_no='"+chkNoApto.isSelected()+    
                    "',apto_re='"+chkRestriccion.isSelected()+    
                    "',fechadesde='"+Fecha.getDate()+    
                    "',fechahasta='"+FechaHasta.getDate()+       
                     "',medico ='"+txtCertifica.getText().toString()+ 
                    "' WHERE n_orden='"+txtNorden.getText().toString()+"' RETURNING cod_anexo;";
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
    private void electroCardiograma(){
   
   String Sql="select hallazgo,recomendaciones from informe_electrocardiograma " +
                "where n_orden='"+txtNorden.getText().toString()+"'";
               oConn.FnBoolQueryExecute(Sql);
             
             try {
                  if (oConn.setResult.next()) {

                     if ((oConn.setResult.getString("hallazgo") != null && !"NORMAL.".equals(oConn.setResult.getString("hallazgo")) )) {
                         if( oConn.setResult.getString("recomendaciones") != null ){
                               txtObservacionesFichaMedica.append("\n -ELECTROCARDIOGRAMA: " + oConn.setResult.getString("hallazgo")+ "."+
                                 oConn.setResult.getString("recomendaciones")+"\n");
                         }else{
                             txtObservacionesFichaMedica.append("\n -ELECTROCARDIOGRAMA: " + oConn.setResult.getString("hallazgo")+ "\n");
                         }
                       
                     }

                 } else {
                     oFunc.SubSistemaMensajeInformacion("Falto llenar ficha de electrocardiograma");
                 }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
            }  
  }
    

    private boolean Agregar() throws SQLException {
        Boolean r = false;

        if (!txtNorden.getText().isEmpty()) {
            if (!Orden()) {
                String insert = "INSERT INTO anexo_agroindustrial(\n" +
"            n_orden, fecha, chkneoplasia, chkits, chkquemaduras, \n" +
"            chkcirugias, chkapotros, chkresidenciasi, chkresidenciano, txttiemporesidencia, \n" +
"            chkessalud, chkeps, chkotros, chksctr, chkotros1, txtpadre, txtmadre, \n" +
"            txthermanos, txtesposa ";
                String values = "VALUES ('" + txtNorden.getText().toString() + "','" + FechaFicha.getDate() + "','" 
                        + chkNeoplasia.isSelected() + "','" + chkITS.isSelected() + "','" + chkQuemaduras.isSelected() + "'";
                values += ",'" + chkCirugias.isSelected() + "','" + chkAPOtros.isSelected() + "'";
                values += ",'" + chkResidenciaSI.isSelected() + "','" + chkResidenciaNo.isSelected() + "','" + txtTiempoResidencia.getText().toString()+ 
                          "','" + chkEssalud.isSelected() + "'";
                values += ",'" + chkEps.isSelected() + "','" + chkOtros.isSelected() + "','" + chkSctr.isSelected() + "','" + chkOtros1.isSelected() + 
                          "','" + txtPadre.getText().toString() + "','" + txtMadre.getText().toString() + "'";
                values += ",'" + txtHermanos.getText().toString() + "','" + txtEsposa.getText().toString() +  "'";
                 if (!txtNeoplasia.getText().isEmpty()) {
                    insert += ",txtneoplasia ";
                    values += ",'" + txtNeoplasia.getText().toString() + "'";
                }
                if (!txtIts.getText().isEmpty()) {
                    insert += ",txtits ";
                    values += ",'" + txtIts.getText().toString() + "'";
                }
                if (!txtQuemaduras.getText().isEmpty()) {
                    insert += ",txtquemaduras ";
                    values += ",'" + txtQuemaduras.getText().toString() + "'";
                }
                if (!txtCirugias.getText().isEmpty()) {
                    insert += ",txtcirugias ";
                    values += ",'" + txtCirugias.getText().toString() + "'";
                }
                //------
                if (!txtOtrosAntecendetes.getText().isEmpty()) {
                    insert += ",txtotrosantecendetes ";
                    values += ",'" + txtOtrosAntecendetes.getText().toString() + "'";
                }
                if (!txtPuestoPostula.getText().isEmpty()) {
                    insert += ",txtpuestoactual ";
                    values += ",'" + txtPuestoPostula.getText().toString() + "'";
                }
                if (!txtTiempo.getText().isEmpty()) {
                    insert += ",txttiempo ";
                    values += ",'" + txtTiempo.getText().toString() + "'";
                }
                    insert += ",rbsimed ";
                    values += ",'" + rbMedsi.isSelected() + "'";
                    insert += ",rbnomed ";
                    values += ",'" + rbMedno.isSelected() + "'";
                if (!txtTipMed.getText().isEmpty()) {
                    insert += ",txttipomedicamento ";
                    values += ",'" + txtTipMed.getText().toString() + "'";
                }
                if (!txtMedFrecuencia.getText().isEmpty()) {
                    insert += ",txtfrecuenciamed ";
                    values += ",'" + txtMedFrecuencia.getText().toString() + "'";
                }
                if (!txtHijosvivos.getText().isEmpty()) {
                    insert += ",txthijosvivos ";
                    values += ",'" + txtHijosvivos.getText().toString() + "'";
                }
                if (!txtHijosMuertos.getText().isEmpty()) {
                    insert += ",txthijosmuertos ";
                    values += ",'" + txtHijosMuertos.getText().toString() + "'";
                } 
                 if (!txtTotalhijos.getText().isEmpty()) {
                    insert += ",txttotalHijos ";
                    values += ",'" + txtTotalhijos.getText().toString() + "'";
                }
                  if (!txtNDependientes.getText().isEmpty()) {
                    insert += ",txtndependientes ";
                    values += ",'" + txtNDependientes.getText().toString() + "'";
                }
                if (!txtcabeza.getText().isEmpty()) {
                    insert += ",txtpelo ";
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
                if (!txtBoca.getText().isEmpty()) {
                    insert += ",txtboca";
                    values += ",'" + txtBoca.getText().toString() + "'";
                }
                if (!txtOidos.getText().isEmpty()) {
                    insert += ",txtoidos";
                    values += ",'" + txtOidos.getText().toString() + "'";
                }
                 if (!txtFaringe.getText().isEmpty()) {
                    insert += ",txtfaringe";
                    values += ",'" + txtFaringe.getText().toString() + "'";
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
                if (!txtMiembrosSuperiores.getText().isEmpty()) {
                    insert += ",txtmiembrossuperiores ";
                    values += ",'" + txtMiembrosSuperiores.getText().toString() + "'";
                }
                if (!txtMiembrosInferiores.getText().isEmpty()) {
                    insert += ",txtmiembrosinferiores ";
                    values += ",'" + txtMiembrosInferiores.getText().toString() + "'";
                }
                if (!txtEctoscopia.getText().isEmpty()) {
                    insert += ",txtectoscopia ";
                    values += ",'" + txtEctoscopia.getText().toString() + "'";
                }
                 if (!txtEstadoMental.getText().isEmpty()) {
                    insert += ",txtestadomental ";
                    values += ",'" + txtEstadoMental.getText().toString() + "'";
                }
                if (!txtAnamnesis.getText().isEmpty()) {
                    insert += ",txtanamnesis ";
                    values += ",'" + txtAnamnesis.getText().toString() + "'";
                }
               
                if (!txtMarcha.getText().isEmpty()) {
                    insert += ",txtmarcha ";
                    values += ",'" + txtMarcha.getText().toString() + "'";
                }
                if (!txtColumnaVertebral.getText().isEmpty()) {
                    insert += ",txtcolumnavertebral ";
                    values += ",'" + txtColumnaVertebral.getText().toString() + "'";
                }
                if (!txtApartoRespiratorio.getText().isEmpty()) {
                    insert += ",txtaparatorespiratorio ";
                    values += ",'" + txtApartoRespiratorio.getText().toString() + "'";
                }
                if (!txtAparatoCardivascular.getText().isEmpty()) {
                    insert += ",txtaparatocardiovascular ";
                    values += ",'" + txtAparatoCardivascular.getText().toString() + "'";
                }
                if (!txtAparatoDigestivo.getText().isEmpty()) {
                    insert += ",txtaparatodigestivo ";
                    values += ",'" + txtAparatoDigestivo.getText().toString() + "'";
                }
                
                if (!txtAparatoGenitourinario.getText().isEmpty()) {
                    insert += ",txtaparatogeiotourinario ";
                    values += ",'" + txtAparatoGenitourinario.getText().toString() + "'";
                }
                if (!txtAparatoLocomotor.getText().isEmpty()) {
                    insert += ",txtaparatolocomotor ";
                    values += ",'" + txtAparatoLocomotor.getText().toString() + "'";
                }
                if (!txtSistemaLinfatico.getText().isEmpty()) {
                    insert += ",txtsistemalinfatico ";
                    values += ",'" + txtSistemaLinfatico.getText().toString() + "'";
                }
               if (!txtPiel.getText().isEmpty()) {
                    insert += ",txtpiel ";
                    values += ",'" + txtPiel.getText().toString() + "'";
                }
                if (!txtObservacionesFichaMedica.getText().isEmpty()) {
                    insert += ",txtobservacionesfm ";
                    values += ",'" + txtObservacionesFichaMedica.getText().toString() + "'";
                }
//                if (!txtConclusion.getText().isEmpty()) {
                    insert += ",txtconclusion ";
                    values += ",'" + txtConclusion.getText().toString() + "'";
//                }
                if (!txtEdad.getText().isEmpty() ) {
                    insert += ",txtedad ";
                    values += ",'" + txtEdad.getText().toString() + "'";
                }
                
                if (!txtEnfermedadesOculares1.getText().isEmpty()) {
                    insert += ",txtenfermedadesoculares1 ";
                    values += ",'" + txtEnfermedadesOculares1.getText().toString()+  "'";
                }
                if (!txtSistemaNervioso.getText().isEmpty()) {
                    insert += ",sistemanervioso ";
                    values += ",'" + txtSistemaNervioso.getText().toString()+  "'";
                }
                if (!txtOtrosEx.getText().isEmpty()) {
                    insert += ",txtotrosex ";
                    values += ",'" + txtOtrosEx.getText().toString()+  "'";
                }
                if (!atxtRestricciones.getText().isEmpty()) {
                    insert += ",txtrestricciones ";
                    values += ",'" + atxtRestricciones.getText().toString()+  "'";
                }
                insert += ",apto_si,apto_no,apto_re "; 
                values += ",'"+chkApto.isSelected()+"','"+chkNoApto.isSelected()+"','"+chkRestriccion.isSelected()+"'";
                insert += ",fechadesde,fechahasta "; 
                values += ",'"+Fecha.getDate()+"','"+FechaHasta.getDate()+"'";
                if (!txtCertifica.getText().isEmpty()) {
                    insert += ",medico ";
                    values += ",'" + txtCertifica.getText().toString()+  "'";
                }
                //oFunc.SubSistemaMensajeInformacion(insert.concat(")") + values.concat(")"));
                if (oConn.FnBoolQueryExecute(insert.concat(")") + values.concat(") RETURNING cod_anexo"))) {
                    oConn.setResult.next();
                    num = Integer.valueOf(oConn.setResult.getString("cod_anexo"));
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
        Fecha.setDate(null);
        FechaHasta.setDate(null);
        atxtRestricciones.setText(null);
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
//txtInmunizaciones.setText("NO RECUERDA");
        txtPuestoPostula.setText(null);
        txtArea.setText(null);
        txtPuestoActual.setText(null);
        txtTiempo.setText(null);
        bgAsociado.clearSelection();
        txtFVC.setText(null);
        txtFEV1.setText(null);
        txtFEV1FVC.setText(null);
        txtFEF2575.setText(null);
        txtTemperatura.setText(null);
        txtCintura.setText(null);
        txtCadera.setText(null);
        txticc.setText(null);
        txtcabeza.setText("CENTRAL, PRESENCIA DE CABELLO FRONDOSO, NO MASAS, NO TUMORACIONES.");
        txtNariz.setText("CENTRAL, PERMEABLE");
        txtCuello.setText("CENTRAL, MOVIL, NO MASAS NO TUMORACIONES.");
        txtPerimetro.setText(null);
        txtBoca.setText("HUMECTADA, LENGUA ROSADA,CARRILLOS ROSADOS,NO MASA, NO TUMORACIONES, NO LESIONES EN MUCOSA.");
        txtFaringe.setText("HUMECTADA, SONROSADA, AMIGADALAS NO HIPERTROFICAS, NO CONGESTIVAS.");
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
        txtEctoscopia.setText("APARENTA BUEN ESTADO DE SALUD.");
        txtAnamnesis.setText("COLABORADOR REFIERE SENTIRSE BIEN, SIN PROBLEMAS DE SALUD.");
        txtEstadoMental.setText("DESPIERTO, OTEP, COMUNICATIVO.");
        txtFrespiratoria.setText(null);
        txtFcardiaca.setText(null);
        txtSatO2.setText(null);
        txtSistolica.setText(null);
        txtDiastolica.setText(null);
      
        txtMiembrosSuperiores.setText("SIMETRICOS, NO DEFORMIDADES");
        txtMiembrosInferiores.setText("SIMETRICOS, NO DEFORMIDADES");
        bgAsociado.clearSelection();
        bgMedicamento.clearSelection();
        chkNeoplasia.setSelected(false);
        txtNeoplasia.setText(null);
        chkITS.setSelected(false);
        txtIts.setText(null);
        
        chkQuemaduras.setSelected(false);
        txtQuemaduras.setText(null);
        chkCirugias.setSelected(false);
        txtCirugias.setText(null);
        chkAPOtros.setSelected(false);
         chkEssalud.setSelected(false);
        chkEps.setSelected(false);
        chkOtros.setSelected(false);
        chkSctr.setSelected(false);
        chkOtros1.setSelected(false);
        txtOidos.setText(null);
        txtMarcha.setText("NORMAL");
        txtColumnaVertebral.setText("CENTRAL, CURVATURAS CONSERVADAS, MOTRICIDAD CONSERVADA.");
        txtMalEstado.setText(null);
        txtFaltan.setText(null);
        txtObservacionesFichaMedica.setText(null);
        txtGFSPrevio.setText(null);
        txtGrupoFacLab.setText(null);
        txtConclusion.setText(null);
        txtPiel.setText("NORMAL.NO  MANCHA, NO SPRESENCIA DE LUNARES SOSPECHOSOS DE MALIGNIDAD.");
        txtApartoRespiratorio.setText("RESPIRACION  NORMAL,EXPANSION TORACICA SIMETRICA, BPMV EN ACP, NO RALES.");
        txtPadre.setText("");
        txtMadre.setText("");
        txtHermanos.setText("");
        txtEsposa.setText("");
        txtTiempoResidencia.setText("");
        txtTipMed.setText("");
        txtMedFrecuencia.setText("");
        txtTotalhijos.setText("");
        txtNDependientes.setText("");
        txtAparatoCardivascular.setText("NO INGURGITACION YUGULAR, CAROTIDEO,RADIAL, FEMORAL, PEDIO CONSERVADOS.RCRR, NO SOPLOS, NO FROTES.");
        txtAparatoDigestivo.setText("ABDOMEN PLANO, RHA CONSERVADOS, NO RUIDOS ANORMALES, BLANDO, DEPRESIBLE, NO DOLOR A LA PALPACION SUPERFICIAL NI PROFUNDA, NO MASAS NI TUMORACIONES PALPABLES.");
        txtAparatoGenitourinario.setText("PPL: NEGATIVO. PRU: NEGATIVO.HIPOGASTRIO PLANO, B/D, NO DOLOROSO A LA PALPACION SUPERFIAL NI PROFUNDA.NO MASAS NI TUMORACIONES PALPABLES.");
        txtAparatoLocomotor.setText("BIPEDESTACION,MUSCULATURA CONSERVADA, MOTRICIDAD CORPORAL Y SEGMENTARIA CONSERVADA.");
        txtSistemaLinfatico.setText("NO ADENOMEGALIAS PATOLOGICA.");
        txtSistemaNervioso.setText("DESPIERTO, OTEP, SENSIBILIDAD Y MOTRICIDAD CONSERVADA, ROTS CONSERVADOS.PARES CRANEALES CONSERVADOS.NO SIGNOS MENINGEOS.");
         Limpiar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Año;
    private com.toedter.calendar.JDateChooser Fecha;
    private com.toedter.calendar.JDateChooser FechaFicha;
    private com.toedter.calendar.JDateChooser FechaHasta;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JTextArea atxtRestricciones;
    private javax.swing.ButtonGroup bgAsociado;
    private javax.swing.ButtonGroup bgMedicamento;
    private javax.swing.ButtonGroup bgResidencia;
    private javax.swing.ButtonGroup btApto;
    private javax.swing.ButtonGroup btGrupoSanguineo;
    private javax.swing.ButtonGroup btGrupoSanguineoTIPO;
    private javax.swing.ButtonGroup btNegativoPositivo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnexo7C1;
    private javax.swing.JButton btnAnexo7C2;
    private javax.swing.JButton btnAptitudMedica;
    private javax.swing.JButton btnEditarFM;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JToggleButton btnObsv;
    private javax.swing.JLabel btnQui;
    private javax.swing.JButton btnVLimpiar;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk10;
    private javax.swing.JCheckBox chk11;
    private javax.swing.JCheckBox chk12;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JCheckBox chk8;
    private javax.swing.JCheckBox chk9;
    private javax.swing.JCheckBox chkAPOtros;
    private javax.swing.JCheckBox chkApto;
    private javax.swing.JCheckBox chkCirugias;
    private javax.swing.JCheckBox chkEps;
    private javax.swing.JCheckBox chkEssalud;
    private javax.swing.JCheckBox chkITS;
    private javax.swing.JCheckBox chkNeoplasia;
    private javax.swing.JCheckBox chkNinguno;
    private javax.swing.JCheckBox chkNoApto;
    private javax.swing.JCheckBox chkNormal;
    private javax.swing.JCheckBox chkOtros;
    private javax.swing.JCheckBox chkOtros1;
    private javax.swing.JCheckBox chkPatrobs;
    private javax.swing.JCheckBox chkQuemaduras;
    private javax.swing.JCheckBox chkResidenciaNo;
    private javax.swing.JCheckBox chkResidenciaSI;
    private javax.swing.JCheckBox chkRestriccion;
    private javax.swing.JCheckBox chkSctr;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel112;
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
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
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbAB;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbMedno;
    private javax.swing.JRadioButton rbMedsi;
    private javax.swing.JRadioButton rbNoTrabajo;
    private javax.swing.JRadioButton rbO;
    private javax.swing.JRadioButton rbRhNegativo;
    private javax.swing.JRadioButton rbRhPositivo;
    private javax.swing.JRadioButton rbSiTrabajo;
    private javax.swing.JTable tbQuirurgicos;
    private javax.swing.JTextField txtAlturaLabor;
    private javax.swing.JTextField txtAnamnesis;
    private javax.swing.JTextField txtAnexo7D;
    private javax.swing.JTextField txtAnioTrabajo;
    private javax.swing.JTextField txtAntPatologicos;
    private javax.swing.JTextField txtAparatoCardivascular;
    private javax.swing.JTextField txtAparatoDigestivo;
    private javax.swing.JTextField txtAparatoGenitourinario;
    private javax.swing.JTextField txtAparatoLocomotor;
    private javax.swing.JTextField txtApartoRespiratorio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBinocular;
    private javax.swing.JTextField txtBoca;
    private javax.swing.JTextField txtCadera;
    private javax.swing.JTextField txtCerTrabajo;
    private javax.swing.JTextField txtCercaCorregidaOD;
    private javax.swing.JTextField txtCercaCorregidaOI;
    private javax.swing.JTextField txtCercaSinCorregirOD;
    private javax.swing.JTextField txtCercaSinCorregirOI;
    private javax.swing.JTextField txtCertifica;
    private javax.swing.JTextField txtCintura;
    private javax.swing.JTextField txtCirugias;
    private javax.swing.JTextField txtCoca;
    private javax.swing.JTextField txtColesterol;
    private javax.swing.JTextField txtColumnaVertebral;
    private javax.swing.JTextArea txtConclusion;
    private javax.swing.JTextField txtConsentimientoDosaje;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtCreatininaBio;
    private javax.swing.JTextField txtCuello;
    private javax.swing.JTextField txtCuestionarioNordico;
    private javax.swing.JTextField txtDetencionSAS;
    private javax.swing.JTextField txtDiasDesanso;
    private javax.swing.JTextField txtDiastolica;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtENombre;
    private javax.swing.JTextField txtEOrden;
    private javax.swing.JTextField txtEctoscopia;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtElectrocardiograma;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEnfaccidente;
    private javax.swing.JTextField txtEnfermedadesOculares;
    private javax.swing.JTextField txtEnfermedadesOculares1;
    private javax.swing.JTextField txtEspirometria;
    private javax.swing.JTextField txtEsposa;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtEstadoMental;
    private javax.swing.JTextField txtEtipoExamen;
    private javax.swing.JTextField txtExRxSanguineos;
    private javax.swing.JTextField txtExplotacionEn;
    private javax.swing.JTextField txtFEF2575;
    private javax.swing.JTextField txtFEV1;
    private javax.swing.JTextField txtFEV1FVC;
    private javax.swing.JTextField txtFVC;
    private javax.swing.JTextField txtFaltan;
    private javax.swing.JTextField txtFaringe;
    private javax.swing.JTextField txtFcardiaca;
    private javax.swing.JTextField txtFichaAudiologica;
    private javax.swing.JTextField txtFrespiratoria;
    private javax.swing.JTextField txtGFSPrevio;
    private javax.swing.JTextField txtGlucosaBio;
    private javax.swing.JTextField txtGradoInstruccion;
    private javax.swing.JTextField txtGrupoFacLab;
    private javax.swing.JTextField txtHDLColesterol;
    private javax.swing.JTextField txtHemoHema;
    private javax.swing.JTextField txtHermanos;
    private javax.swing.JTextField txtHijosMuertos;
    private javax.swing.JTextField txtHijosvivos;
    private javax.swing.JTextField txtHistoriaOcupacional;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JTextField txtIts;
    private javax.swing.JTextField txtLDLColesterol;
    private javax.swing.JTextField txtLabClinico;
    private javax.swing.JTextField txtLejosCorregidaOD;
    private javax.swing.JTextField txtLejosCorregidaOI;
    private javax.swing.JTextField txtLejosSinCorregirOD;
    private javax.swing.JTextField txtLejosSinCorregirOI;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtMadre;
    private javax.swing.JTextField txtMalEstado;
    private javax.swing.JTextField txtMarcha;
    private javax.swing.JTextField txtMarig;
    private javax.swing.JTextField txtMedFrecuencia;
    private javax.swing.JTextField txtMiembrosInferiores;
    private javax.swing.JTextField txtMiembrosSuperiores;
    private javax.swing.JTextField txtMineralesExplotados;
    private javax.swing.JTextField txtNDependientes;
    private javax.swing.JTextField txtNariz;
    private javax.swing.JTextField txtNeoplasia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtOD1000;
    private javax.swing.JTextField txtOD2000;
    private javax.swing.JTextField txtOD3000;
    private javax.swing.JTextField txtOD4000;
    private javax.swing.JTextField txtOD500;
    private javax.swing.JTextField txtOD6000;
    private javax.swing.JTextField txtOD8000;
    private javax.swing.JTextField txtOI1000;
    private javax.swing.JTextField txtOI2000;
    private javax.swing.JTextField txtOI3000;
    private javax.swing.JTextField txtOI4000;
    private javax.swing.JTextField txtOI500;
    private javax.swing.JTextField txtOI6000;
    private javax.swing.JTextField txtOI8000;
    private javax.swing.JTextArea txtObservacionesFichaMedica;
    private javax.swing.JTextField txtOdontograma;
    private javax.swing.JTextField txtOftalmologia;
    private javax.swing.JTextField txtOidos;
    private javax.swing.JTextField txtOtrosAntecendetes;
    private javax.swing.JTextArea txtOtrosEx;
    private javax.swing.JTextField txtPadre;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtPerimetroToraxico;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPiel;
    private javax.swing.JTextField txtPsicologia;
    private javax.swing.JTextField txtPuestoActual;
    private javax.swing.JTextField txtPuestoPostula;
    private javax.swing.JTextField txtQuemaduras;
    private javax.swing.JTextField txtRadiografiaTorax;
    private javax.swing.JTextField txtReflejosPupilares;
    private javax.swing.JTextField txtSatO2;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSistemaLinfatico;
    private javax.swing.JTextField txtSistemaNervioso;
    private javax.swing.JTextField txtSistolica;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtTiempoResidencia;
    private javax.swing.JTextField txtTipMed;
    private javax.swing.JTextField txtTipoExamen;
    private javax.swing.JTextField txtTotalhijos;
    private javax.swing.JTextField txtTriaje;
    private javax.swing.JTextField txtTrigliseridos;
    private javax.swing.JTextField txtVLDLColesterol;
    private javax.swing.JTextField txtVSG;
    private javax.swing.JTextField txtVisionColores;
    private javax.swing.JTextField txtcabeza;
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

//    public void MostrarAddObsv() {
//        addObsv = new frmObservaciones(this, true);
//        addObsv.setVisible(true);
//
//    }

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
                         txtObservacionesFichaMedica.append("- HIPERCOLESTEROLEMIA.");
                          txtColesterol.setForeground(Color.red);
                     }
                     if (trigli>150) {
                         txtObservacionesFichaMedica.append("- HIPERTRIGLICERIDEMIA." );
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
                     if(ct>200 || trigli>150 || ldl>129 || (hdl<40 || hdl>60) || vldl>30){
                         txtObservacionesFichaMedica.append("DIETA HIPOCALORICA Y EJERCICIOS. \n ");
                     }
                 } else {
                     oFunc.SubSistemaMensajeInformacion("No hay registro de analisis quimicos");
                 }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
            }  
    }
    //***********************
    void Limpiar() {
        
        bgResidencia.clearSelection();
        btNegativoPositivo.clearSelection();
        btGrupoSanguineo.clearSelection();
        btGrupoSanguineoTIPO.clearSelection();
        txtHemoHema.setText(null);
        btApto.clearSelection();
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
 
 void AddAP(){
    //SimpleDateFormat formato = new SimpleDateFormat("yyyy");
   
    String [] registros = new String[4];
    model = (DefaultTableModel) tbQuirurgicos.getModel();
    if(!txtNorden.getText().isEmpty()){
                   if(validarQui()){  
                    registros[0]= txtEnfaccidente.getText().toString();
                    if(rbSiTrabajo.isSelected()){
                        registros[1]= "SI";
                    }else if(rbNoTrabajo.isSelected()){
                        registros[1]= "NO";
                    }
                    registros[2]= txtAnioTrabajo.getText().toString();
                    registros[3]= txtDiasDesanso.getText().toString();
               
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
    if(txtEnfaccidente.getText().isEmpty()){bResultado = false;}
    if(txtAnioTrabajo.getText().isEmpty()){bResultado = false;}
    if(txtDiasDesanso.getText().isEmpty()){bResultado = false;}
  
   return bResultado;
}
 public void Qui(){
sbCargarDatosAP();
txtEnfaccidente.setText(null);
rbSiTrabajo.setSelected(false);
rbNoTrabajo.setSelected(false);
txtAnioTrabajo.setText(null);
txtDiasDesanso.setText(null);
}
 void sbCargarDatosAP(){
        
          String [] titulos={"Enfermedad-Accindente","AsociadoTrabajo ","Año","DiasDescanso"};
          model = new DefaultTableModel(null,titulos){
            
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
          tbQuirurgicos.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbQuirurgicos.setModel(model);          
          tbQuirurgicos.getColumnModel().getColumn(0).setPreferredWidth(300);
          tbQuirurgicos.getColumnModel().getColumn(1).setPreferredWidth(60);
          tbQuirurgicos.getColumnModel().getColumn(2).setPreferredWidth(60);
          tbQuirurgicos.getColumnModel().getColumn(3).setPreferredWidth(60);
}
 private boolean GrabarAPDetalle() {
         boolean bResult = false;
                      
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String  enfermedad, asociadotrabajo, anio, diasdescanso;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbQuirurgicos.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            enfermedad = tbQuirurgicos.getModel().getValueAt(iFila, 0).toString();
            asociadotrabajo = tbQuirurgicos.getModel().getValueAt(iFila, 1).toString();
            anio = tbQuirurgicos.getModel().getValueAt(iFila, 2).toString();
            diasdescanso = tbQuirurgicos.getModel().getValueAt(iFila, 3).toString();
        
           
           strSqlStmt="INSERT INTO accidentes_trabajo(cod_anexo, enfermedad, asociadotrabajo, anio, diasdescanso)";
                                      
                    strSqlStmt = strSqlStmt + " Values ('";
//                    oFunc.SubSistemaMensajeError(String.valueOf(num));
                    strSqlStmt += num+"','";
                    strSqlStmt += enfermedad+"','";
                    strSqlStmt += asociadotrabajo+"','";
                    strSqlStmt += anio+"','";
                    strSqlStmt += diasdescanso+"')";
                    
                    // Ejecuta la Sentencia
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                        bResult = true;
                        
                    }
                  }
         return bResult;
    }
 private void DetalleEnfermedades(){
//    String [] titulos={"N°Orden","Hospital","Operacion","Dias","complicaciones","Fecha"};
    String [] registros = new String[4];
      String sql = "SELECT cod_anexo, enfermedad, asociadotrabajo, anio, diasdescanso, fecha\n" +
                    "  FROM accidentes_trabajo "
               + "WHERE cod_anexo ='" + num + "'";

    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("enfermedad");
                    registros[1]= oConn.setResult.getString("asociadotrabajo");
                    registros[2]= oConn.setResult.getString("anio");
                    registros[3]= oConn.setResult.getString("diasdescanso");
                    
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
 public void MostrarAddObsv1() {
        addObsv1 = new frmObservaciones(this, true);
        addObsv1.setVisible(true);

    }

    public void txtObsv1(String Ocupacion) {
        txtObservacionesFichaMedica.append(Ocupacion.concat("\n"));
    }
}
