/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import autocomplete.AutoCompleteDBLink;
import autocomplete.AutoTextComplete;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdom.Parent;

/**
 *
 * @author admin
 */
public final class InformePsicologico extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;
 
   public InformePsicologico() {
      initComponents();
   //new ajTextArea.autocompleterText(atxtIntelectual, "razon_empresa", "empresas");
      sbCargarDatosInformePsicologico("");
 
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAprobo = new javax.swing.ButtonGroup();
        bg1 = new javax.swing.ButtonGroup();
        bgACI_1 = new javax.swing.ButtonGroup();
        bgACI_2 = new javax.swing.ButtonGroup();
        bgACI_3 = new javax.swing.ButtonGroup();
        bgACI_4 = new javax.swing.ButtonGroup();
        bgACI_5 = new javax.swing.ButtonGroup();
        bgACI_6 = new javax.swing.ButtonGroup();
        bgACI_7 = new javax.swing.ButtonGroup();
        bgACI_8 = new javax.swing.ButtonGroup();
        bgAAP_1 = new javax.swing.ButtonGroup();
        bgAAP_2 = new javax.swing.ButtonGroup();
        bgAAP_3 = new javax.swing.ButtonGroup();
        bgAAP_4 = new javax.swing.ButtonGroup();
        bgAAP_5 = new javax.swing.ButtonGroup();
        bgAAP_6 = new javax.swing.ButtonGroup();
        bgAAP_7 = new javax.swing.ButtonGroup();
        bgAAP_8 = new javax.swing.ButtonGroup();
        bgAAP_9 = new javax.swing.ButtonGroup();
        bgAS_1 = new javax.swing.ButtonGroup();
        bgAS_2 = new javax.swing.ButtonGroup();
        bgAS_3 = new javax.swing.ButtonGroup();
        bgACM_1 = new javax.swing.ButtonGroup();
        bgACM_2 = new javax.swing.ButtonGroup();
        bgACM_3 = new javax.swing.ButtonGroup();
        bgCondicion = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        FechaEntrevista = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtLugarNacimiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JTextField();
        txtNivelEstudios = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCargoDesempenar = new javax.swing.JTextField();
        txtOcupación = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        rbSi = new javax.swing.JRadioButton();
        rbNo = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        atxtPsicomotricidad = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        atxtRecomendaciones = new javax.swing.JTextArea();
        btnCriterios = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        atxtPersonalidad = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        atxtOrganicidad = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxtIntelectual = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        chkI1 = new javax.swing.JCheckBox();
        chkI2 = new javax.swing.JCheckBox();
        chkI3 = new javax.swing.JCheckBox();
        chkI4 = new javax.swing.JCheckBox();
        chkI5 = new javax.swing.JCheckBox();
        chkI6 = new javax.swing.JCheckBox();
        chkI7 = new javax.swing.JCheckBox();
        chkI8 = new javax.swing.JCheckBox();
        chkI9 = new javax.swing.JCheckBox();
        chkI10 = new javax.swing.JCheckBox();
        chkI11 = new javax.swing.JCheckBox();
        chkI12 = new javax.swing.JCheckBox();
        chkI13 = new javax.swing.JCheckBox();
        chkI14 = new javax.swing.JCheckBox();
        chkI15 = new javax.swing.JCheckBox();
        chkI16 = new javax.swing.JCheckBox();
        chkI17 = new javax.swing.JCheckBox();
        chkO1 = new javax.swing.JCheckBox();
        chkO2 = new javax.swing.JCheckBox();
        chkO3 = new javax.swing.JCheckBox();
        chkO4 = new javax.swing.JCheckBox();
        chkO5 = new javax.swing.JCheckBox();
        chkP1 = new javax.swing.JCheckBox();
        chkP2 = new javax.swing.JCheckBox();
        chkP3 = new javax.swing.JCheckBox();
        chkP4 = new javax.swing.JCheckBox();
        chkP5 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbInformePsicologico = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        txtBuscarCod = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNordenEP = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        txtNombresEP = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtApellidosEP = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtEdadEP = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtDomicilioEP = new javax.swing.JTextField();
        FechaEntrevistaEP = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        FechaNacimientoEP = new com.toedter.calendar.JDateChooser();
        txtLugarNacimientoEP = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtEstadoCivilEP = new javax.swing.JTextField();
        txtNivelEstudiosEP = new javax.swing.JTextField();
        btnEditarEP = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtCargoDesempenarEP = new javax.swing.JTextField();
        txtOcupaciónEP = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        rbSiEP = new javax.swing.JRadioButton();
        rbNoEP = new javax.swing.JRadioButton();
        rbAptoconObservacion = new javax.swing.JRadioButton();
        rbExcelente = new javax.swing.JRadioButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtRecomendaciones = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtApreciacionPers = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnActualizarEP = new javax.swing.JButton();
        btnLimpiarEP = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        rbNivIntelectual_S = new javax.swing.JRadioButton();
        rbNivIntelectual_NPS = new javax.swing.JRadioButton();
        rbNivIntelectual_NP = new javax.swing.JRadioButton();
        rbNivIntelectual_NPI = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        rbAgilidadMental_S = new javax.swing.JRadioButton();
        rbAgilidadMental_NPS = new javax.swing.JRadioButton();
        rbAgilidadMental_NP = new javax.swing.JRadioButton();
        rbNivIntelectual_I = new javax.swing.JRadioButton();
        rbAgilidadMental_I = new javax.swing.JRadioButton();
        rbAgilidadMental_NPI = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        rbRazPractico_S = new javax.swing.JRadioButton();
        rbRazPractico_NPS = new javax.swing.JRadioButton();
        rbRazPractico_NP = new javax.swing.JRadioButton();
        rbRazPractico_NPI = new javax.swing.JRadioButton();
        rbRazPractico_I = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        rbCriterioJuicio_S = new javax.swing.JRadioButton();
        rbCriterioJuicio_NPS = new javax.swing.JRadioButton();
        rbCriterioJuicio_NP = new javax.swing.JRadioButton();
        rbCriterioJuicio_NPI = new javax.swing.JRadioButton();
        rbCriterioJuicio_I = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        rbMemoria_S = new javax.swing.JRadioButton();
        rbMemoria_NPS = new javax.swing.JRadioButton();
        rbMemoria_NP = new javax.swing.JRadioButton();
        rbMemoria_NPI = new javax.swing.JRadioButton();
        rbMemoria_I = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        rbAtencionConc_S = new javax.swing.JRadioButton();
        rbAtencionConc_NPS = new javax.swing.JRadioButton();
        rbAtencionConc_NP = new javax.swing.JRadioButton();
        rbAtencionConc_NPI = new javax.swing.JRadioButton();
        rbAtencionConc_I = new javax.swing.JRadioButton();
        jLabel48 = new javax.swing.JLabel();
        rbOrientEspacial_S = new javax.swing.JRadioButton();
        rbOrientEspacial_NPS = new javax.swing.JRadioButton();
        rbOrientEspacial_NP = new javax.swing.JRadioButton();
        rbOrientEspacial_NPI = new javax.swing.JRadioButton();
        rbOrientEspacial_I = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        rbCoordVisomotora_S = new javax.swing.JRadioButton();
        rbCoordVisomotora_NPS = new javax.swing.JRadioButton();
        rbCoordVisomotora_NP = new javax.swing.JRadioButton();
        rbCoordVisomotora_NPI = new javax.swing.JRadioButton();
        rbCoordVisomotora_I = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        rbEstabEmocional_S = new javax.swing.JRadioButton();
        rbEstabEmocional_NPS = new javax.swing.JRadioButton();
        rbEstabEmocional_NP = new javax.swing.JRadioButton();
        rbEstabEmocional_NPI = new javax.swing.JRadioButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        rbMadurez_S = new javax.swing.JRadioButton();
        rbMadurez_NPS = new javax.swing.JRadioButton();
        rbMadurez_NP = new javax.swing.JRadioButton();
        rbEstabEmocional_I = new javax.swing.JRadioButton();
        rbMadurez_I = new javax.swing.JRadioButton();
        rbMadurez_NPI = new javax.swing.JRadioButton();
        jLabel52 = new javax.swing.JLabel();
        rbControlImpulso_S = new javax.swing.JRadioButton();
        rbControlImpulso_NPS = new javax.swing.JRadioButton();
        rbControlImpulso_NP = new javax.swing.JRadioButton();
        rbControlImpulso_NPI = new javax.swing.JRadioButton();
        rbControlImpulso_I = new javax.swing.JRadioButton();
        jLabel53 = new javax.swing.JLabel();
        rbManejoEstres_S = new javax.swing.JRadioButton();
        rbManejoEstres_NPS = new javax.swing.JRadioButton();
        rbManejoEstres_NP = new javax.swing.JRadioButton();
        rbManejoEstres_NPI = new javax.swing.JRadioButton();
        rbManejoEstres_I = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        rbToleranciaFrus_S = new javax.swing.JRadioButton();
        rbToleranciaFrus_NPS = new javax.swing.JRadioButton();
        rbToleranciaFrus_NP = new javax.swing.JRadioButton();
        rbToleranciaFrus_NPI = new javax.swing.JRadioButton();
        rbToleranciaFrus_I = new javax.swing.JRadioButton();
        jLabel55 = new javax.swing.JLabel();
        rbResponsabilidad_S = new javax.swing.JRadioButton();
        rbResponsabilidad_NPS = new javax.swing.JRadioButton();
        rbResponsabilidad_NP = new javax.swing.JRadioButton();
        rbResponsabilidad_NPI = new javax.swing.JRadioButton();
        rbResponsabilidad_I = new javax.swing.JRadioButton();
        jLabel56 = new javax.swing.JLabel();
        rbSeguridad_S = new javax.swing.JRadioButton();
        rbSeguridad_NPS = new javax.swing.JRadioButton();
        rbSeguridad_NP = new javax.swing.JRadioButton();
        rbSeguridad_NPI = new javax.swing.JRadioButton();
        rbSeguridad_I = new javax.swing.JRadioButton();
        jLabel57 = new javax.swing.JLabel();
        rbRelacionesInterp_S = new javax.swing.JRadioButton();
        rbRelacionesInterp_NPS = new javax.swing.JRadioButton();
        rbRelacionesInterp_NP = new javax.swing.JRadioButton();
        rbRelacionesInterp_NPI = new javax.swing.JRadioButton();
        rbRelacionesInterp_I = new javax.swing.JRadioButton();
        jLabel58 = new javax.swing.JLabel();
        rbCapacAdaptacion_NPS = new javax.swing.JRadioButton();
        rbCapacAdaptacion_S = new javax.swing.JRadioButton();
        rbCapacAdaptacion_NP = new javax.swing.JRadioButton();
        rbCapacAdaptacion_NPI = new javax.swing.JRadioButton();
        rbCapacAdaptacion_I = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        rbNivProactividad_S = new javax.swing.JRadioButton();
        rbNivProactividad_NPS = new javax.swing.JRadioButton();
        rbNivProactividad_NP = new javax.swing.JRadioButton();
        rbNivProactividad_NPI = new javax.swing.JRadioButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        rbDiscrimRiesgo_S = new javax.swing.JRadioButton();
        rbDiscrimRiesgo_NPS = new javax.swing.JRadioButton();
        rbDiscrimRiesgo_NP = new javax.swing.JRadioButton();
        rbNivProactividad_I = new javax.swing.JRadioButton();
        rbDiscrimRiesgo_I = new javax.swing.JRadioButton();
        rbDiscrimRiesgo_NPI = new javax.swing.JRadioButton();
        jLabel61 = new javax.swing.JLabel();
        rbTolRutina_S = new javax.swing.JRadioButton();
        rbTolRutina_NPS = new javax.swing.JRadioButton();
        rbTolRutina_NP = new javax.swing.JRadioButton();
        rbTolRutina_NPI = new javax.swing.JRadioButton();
        rbTolRutina_I = new javax.swing.JRadioButton();
        jPanel20 = new javax.swing.JPanel();
        rbMotTrabajo_S = new javax.swing.JRadioButton();
        rbMotTrabajo_NPS = new javax.swing.JRadioButton();
        rbMotTrabajo_NP = new javax.swing.JRadioButton();
        rbMotTrabajo_NPI = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        rbRespRegConv_S = new javax.swing.JRadioButton();
        rbRespRegConv_NPS = new javax.swing.JRadioButton();
        rbRespRegConv_NP = new javax.swing.JRadioButton();
        rbMotTrabajo_I = new javax.swing.JRadioButton();
        rbRespRegConv_I = new javax.swing.JRadioButton();
        rbRespRegConv_NPI = new javax.swing.JRadioButton();
        jLabel65 = new javax.swing.JLabel();
        rbSeguimInstr_S = new javax.swing.JRadioButton();
        rbSeguimInstr_NPS = new javax.swing.JRadioButton();
        rbSeguimInstr_NP = new javax.swing.JRadioButton();
        rbSeguimInstr_NPI = new javax.swing.JRadioButton();
        rbSeguimInstr_I = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        txtImpEP = new javax.swing.JTextField();
        btnIMP = new javax.swing.JButton();
        btnAgregarEP = new javax.swing.JButton();

        setClosable(true);
        setTitle("Informe Psicológico");

        jPanel5.setForeground(new java.awt.Color(102, 102, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Necesarios"));

        jLabel1.setText("Nro Orden:");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombres:");

        txtNombres.setEditable(false);

        jLabel5.setText("Apellidos:");

        txtApellidos.setEditable(false);

        jLabel6.setText("Fecha Nacimiento:");

        jLabel7.setText("Lugar Nacimiento:");

        jLabel8.setText("Edad:");

        txtEdad.setEditable(false);

        jLabel9.setText("Estado Civil:");

        jLabel10.setText("Domicilio Actual:");

        txtDomicilio.setEditable(false);

        FechaEntrevista.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaEntrevistaPropertyChange(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Fecha Entrevista :");

        FechaNacimiento.setEnabled(false);

        txtLugarNacimiento.setEditable(false);

        jLabel2.setText("Nivel Estudios:");

        jLabel24.setText("años");

        txtEstadoCivil.setEditable(false);

        txtNivelEstudios.setEditable(false);

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
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(txtLugarNacimiento)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDomicilio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNivelEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FechaEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(btnEditar))
                    .addComponent(FechaEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNivelEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Laborales"));

        jLabel12.setText("Ocupación:");

        jLabel13.setText("Cargo Desempeñar :");

        txtCargoDesempenar.setEditable(false);

        txtOcupación.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOcupación, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargoDesempenar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtCargoDesempenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtOcupación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aprobo Test"));

        bgAprobo.add(rbSi);
        rbSi.setText("Si");

        bgAprobo.add(rbNo);
        rbNo.setText("No");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rbSi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbNo)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSi)
                    .addComponent(rbNo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        atxtPsicomotricidad.setColumns(20);
        atxtPsicomotricidad.setRows(5);
        atxtPsicomotricidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                atxtPsicomotricidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                atxtPsicomotricidadFocusLost(evt);
            }
        });
        atxtPsicomotricidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                atxtPsicomotricidadKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(atxtPsicomotricidad);

        atxtRecomendaciones.setColumns(20);
        atxtRecomendaciones.setRows(5);
        jScrollPane5.setViewportView(atxtRecomendaciones);

        btnCriterios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        btnCriterios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCriteriosMouseClicked(evt);
            }
        });

        jLabel22.setText("Recomendaciones:");

        jLabel16.setText("Test de la figura humana de machover / inv Multifásico de Personalidad");

        jLabel15.setText("Test de inteligencia de barranquilla / test de Otis Intermedia");

        atxtPersonalidad.setColumns(20);
        atxtPersonalidad.setRows(5);
        atxtPersonalidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                atxtPersonalidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                atxtPersonalidadFocusLost(evt);
            }
        });
        atxtPersonalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                atxtPersonalidadKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(atxtPersonalidad);
        atxtPersonalidad.getAccessibleContext().setAccessibleName("");

        jLabel19.setText("Test de Bender para adultos / test de Benton Forma C");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Área Personalidad");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Área de Organicidad");

        jLabel21.setText("Prueba de Laberíntos de Weschler");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Área Intelectual");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Área de Psicomotricidad");

        atxtOrganicidad.setColumns(20);
        atxtOrganicidad.setRows(5);
        atxtOrganicidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                atxtOrganicidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                atxtOrganicidadFocusLost(evt);
            }
        });
        atxtOrganicidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                atxtOrganicidadKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(atxtOrganicidad);

        atxtIntelectual.setColumns(20);
        atxtIntelectual.setForeground(new java.awt.Color(0, 102, 51));
        atxtIntelectual.setRows(5);
        atxtIntelectual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                atxtIntelectualFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                atxtIntelectualFocusLost(evt);
            }
        });
        atxtIntelectual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                atxtIntelectualKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(atxtIntelectual);
        atxtIntelectual.getAccessibleContext().setAccessibleName("");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnAgregar.setMnemonic('g');
        btnAgregar.setText("Guardar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizar.setMnemonic('i');
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setMnemonic('l');
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        chkI1.setForeground(new java.awt.Color(0, 102, 51));
        chkI1.setText("NORMAL");
        chkI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI1ActionPerformed(evt);
            }
        });

        chkI2.setForeground(new java.awt.Color(0, 102, 51));
        chkI2.setText("SUPERIOR");
        chkI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI2ActionPerformed(evt);
            }
        });

        chkI3.setForeground(new java.awt.Color(0, 102, 51));
        chkI3.setText("N.INFERIOR");
        chkI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI3ActionPerformed(evt);
            }
        });

        chkI4.setForeground(new java.awt.Color(0, 102, 51));
        chkI4.setText("ALTO");
        chkI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI4ActionPerformed(evt);
            }
        });

        chkI5.setForeground(new java.awt.Color(0, 102, 51));
        chkI5.setText("P.SUPERIOR");
        chkI5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI5ActionPerformed(evt);
            }
        });

        chkI6.setForeground(new java.awt.Color(0, 102, 51));
        chkI6.setText("P. MEDIO");
        chkI6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI6ActionPerformed(evt);
            }
        });

        chkI7.setForeground(new java.awt.Color(0, 102, 51));
        chkI7.setText("P. BAJO");
        chkI7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI7ActionPerformed(evt);
            }
        });

        chkI8.setForeground(new java.awt.Color(0, 102, 51));
        chkI8.setText("BAJO");
        chkI8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI8ActionPerformed(evt);
            }
        });

        bg1.add(chkI9);
        chkI9.setForeground(new java.awt.Color(204, 0, 0));
        chkI9.setText("FACILIDAD");
        chkI9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI9ActionPerformed(evt);
            }
        });

        bg1.add(chkI10);
        chkI10.setForeground(new java.awt.Color(204, 0, 0));
        chkI10.setText("DIFICULTAD");
        chkI10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI10ActionPerformed(evt);
            }
        });

        chkI11.setForeground(new java.awt.Color(0, 0, 255));
        chkI11.setText("P.N.ADECUADO");
        chkI11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI11ActionPerformed(evt);
            }
        });

        chkI12.setForeground(new java.awt.Color(0, 0, 255));
        chkI12.setText("POSEE N.ALTO");
        chkI12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI12ActionPerformed(evt);
            }
        });

        chkI13.setForeground(new java.awt.Color(0, 0, 255));
        chkI13.setText("POSEE N.BAJO");
        chkI13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI13ActionPerformed(evt);
            }
        });

        chkI14.setForeground(new java.awt.Color(255, 102, 0));
        chkI14.setText("Y NUMERICA");
        chkI14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI14ActionPerformed(evt);
            }
        });

        chkI15.setForeground(new java.awt.Color(255, 102, 0));
        chkI15.setText("Y CALCULO");
        chkI15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI15ActionPerformed(evt);
            }
        });

        chkI16.setForeground(new java.awt.Color(0, 204, 51));
        chkI16.setText("ADECUADA, R...");
        chkI16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI16ActionPerformed(evt);
            }
        });

        chkI17.setForeground(new java.awt.Color(0, 204, 51));
        chkI17.setText("INADECUADA");
        chkI17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI17ActionPerformed(evt);
            }
        });

        chkO1.setForeground(new java.awt.Color(0, 0, 255));
        chkO1.setText("O. EN TIEMPO");
        chkO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkO1ActionPerformed(evt);
            }
        });

        chkO2.setForeground(new java.awt.Color(255, 0, 0));
        chkO2.setText("POSEE ALTO");
        chkO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkO2ActionPerformed(evt);
            }
        });

        chkO3.setForeground(new java.awt.Color(255, 0, 0));
        chkO3.setText("P.ADECUADO");
        chkO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkO3ActionPerformed(evt);
            }
        });

        chkO4.setForeground(new java.awt.Color(255, 0, 0));
        chkO4.setText("P.BAJO");
        chkO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkO4ActionPerformed(evt);
            }
        });

        chkO5.setForeground(new java.awt.Color(0, 102, 102));
        chkO5.setText("NO SE EVI....");
        chkO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkO5ActionPerformed(evt);
            }
        });

        chkP1.setForeground(new java.awt.Color(102, 102, 0));
        chkP1.setText("NIVEL ALTO");
        chkP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkP1ActionPerformed(evt);
            }
        });

        chkP2.setForeground(new java.awt.Color(102, 102, 0));
        chkP2.setText("NIVEL ADECUADO");
        chkP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkP2ActionPerformed(evt);
            }
        });

        chkP3.setForeground(new java.awt.Color(102, 102, 0));
        chkP3.setText("NIVEL BAJO");
        chkP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkP3ActionPerformed(evt);
            }
        });

        chkP4.setForeground(new java.awt.Color(0, 153, 0));
        chkP4.setText("FACILIDAD ");
        chkP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkP4ActionPerformed(evt);
            }
        });

        chkP5.setForeground(new java.awt.Color(0, 153, 0));
        chkP5.setText("DIFICULTAD");
        chkP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkP5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkI6)
                    .addComponent(chkI3)
                    .addComponent(chkI2)
                    .addComponent(chkI1)
                    .addComponent(chkI4)
                    .addComponent(chkI5)
                    .addComponent(chkI7)
                    .addComponent(chkI8)
                    .addComponent(chkO1)
                    .addComponent(chkO2)
                    .addComponent(chkO3)
                    .addComponent(chkO4)
                    .addComponent(chkO5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCriterios))
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkI9)
                                    .addComponent(chkI10)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(chkI11))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(chkI12))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(chkI13))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(chkI14))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(chkI15))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkI17)
                                    .addComponent(chkI16)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkP2)
                                    .addComponent(chkP1)
                                    .addComponent(chkP3)
                                    .addComponent(chkP4)
                                    .addComponent(chkP5))))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21))))
                                .addGap(25, 25, 25))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(btnCriterios))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(chkI9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(chkI10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(chkI11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkI12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkI13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkI14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkI15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkI16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkI17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(chkI1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkI2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkI3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkI4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkI5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkI6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkI7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(chkI8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(chkO1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(chkO2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkO3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkO4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(chkO5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(chkP1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkP2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkP3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkP4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkP5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnActualizar)
                            .addComponent(btnLimpiar)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(2, 2, 2))
        );

        jTabbedPane1.addTab("Informe", jPanel5);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar Informe "));

        jLabel11.setText("Buscar :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tbInformePsicologico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbInformePsicologico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbInformePsicologicoMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(tbInformePsicologico);

        jLabel25.setText("1 Clic para Editar | 2 Para Crear el Informe para volver a Imprimir");

        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        jLabel35.setText("Codigo:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reportes", jPanel6);

        jPanel7.setForeground(new java.awt.Color(102, 102, 0));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Necesarios"));

        jLabel3.setText("Nro Orden:");

        txtNordenEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenEPActionPerformed(evt);
            }
        });

        jLabel26.setText("Nombres:");

        txtNombresEP.setEditable(false);

        jLabel27.setText("Apellidos:");

        txtApellidosEP.setEditable(false);

        jLabel28.setText("Fecha Nacimiento:");

        jLabel29.setText("Lugar Nacimiento:");

        jLabel30.setText("Edad:");

        txtEdadEP.setEditable(false);

        jLabel31.setText("Estado Civil:");

        jLabel32.setText("Domicilio Actual:");

        txtDomicilioEP.setEditable(false);

        FechaEntrevistaEP.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaEntrevistaEPPropertyChange(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Fecha Entrevista :");

        FechaNacimientoEP.setEnabled(false);

        txtLugarNacimientoEP.setEditable(false);

        jLabel34.setText("Nivel Estudios:");

        jLabel36.setText("años");

        txtEstadoCivilEP.setEditable(false);

        txtNivelEstudiosEP.setEditable(false);

        btnEditarEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarEP.setText("Editar");
        btnEditarEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEPActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Laborales"));

        jLabel37.setText("Ocupación:");

        jLabel38.setText("Cargo Desempeñar :");

        txtCargoDesempenarEP.setEditable(false);

        txtOcupaciónEP.setEditable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOcupaciónEP, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargoDesempenarEP, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(txtCargoDesempenarEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(txtOcupaciónEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombresEP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellidosEP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FechaNacimientoEP, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(txtLugarNacimientoEP)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDomicilioEP)))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txtEdadEP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel36))
                                    .addComponent(txtEstadoCivilEP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNivelEstudiosEP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNordenEP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarEP)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaEntrevistaEP, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNordenEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33)
                        .addComponent(btnEditarEP))
                    .addComponent(FechaEntrevistaEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(txtNombresEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28))
                            .addComponent(FechaNacimientoEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtApellidosEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(txtLugarNacimientoEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtDomicilioEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtEdadEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtEstadoCivilEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txtNivelEstudiosEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aprobo Test"));

        bgCondicion.add(rbSiEP);
        rbSiEP.setText("Si");

        bgCondicion.add(rbNoEP);
        rbNoEP.setText("No");

        bgCondicion.add(rbAptoconObservacion);
        rbAptoconObservacion.setText("AP.O");

        bgCondicion.add(rbExcelente);
        rbExcelente.setText("Ex");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(rbSiEP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNoEP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbExcelente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAptoconObservacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbExcelente)
                        .addComponent(rbAptoconObservacion))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbSiEP)
                        .addComponent(rbNoEP)))
                .addGap(2, 2, 2))
        );

        txtRecomendaciones.setColumns(20);
        txtRecomendaciones.setRows(5);
        txtRecomendaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRecomendacionesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRecomendacionesFocusLost(evt);
            }
        });
        txtRecomendaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRecomendacionesKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(txtRecomendaciones);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("Recomendaciones :");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setText("Apreciación Profesional :");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText("Observaciones :");

        txtApreciacionPers.setColumns(20);
        txtApreciacionPers.setRows(5);
        txtApreciacionPers.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApreciacionPersFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApreciacionPersFocusLost(evt);
            }
        });
        txtApreciacionPers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApreciacionPersKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(txtApreciacionPers);

        txtObservaciones.setColumns(20);
        txtObservaciones.setForeground(new java.awt.Color(0, 102, 51));
        txtObservaciones.setRows(5);
        txtObservaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtObservacionesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacionesFocusLost(evt);
            }
        });
        txtObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtObservacionesKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(txtObservaciones);

        btnActualizarEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizarEP.setMnemonic('i');
        btnActualizarEP.setText("Actualizar");
        btnActualizarEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEPActionPerformed(evt);
            }
        });

        btnLimpiarEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarEP.setMnemonic('l');
        btnLimpiarEP.setText("Limpiar");
        btnLimpiarEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEPActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(153, 204, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Área Cognitiva-Intelectual:Capacidad ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        rbNivIntelectual_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_1.add(rbNivIntelectual_S);
        rbNivIntelectual_S.setText("S");

        rbNivIntelectual_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_1.add(rbNivIntelectual_NPS);
        rbNivIntelectual_NPS.setText("NPS");

        rbNivIntelectual_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_1.add(rbNivIntelectual_NP);
        rbNivIntelectual_NP.setText("NP");

        rbNivIntelectual_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_1.add(rbNivIntelectual_NPI);
        rbNivIntelectual_NPI.setText("NPI");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("1. Nivel Intelectual :");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("2. Agilidad Mental :");

        rbAgilidadMental_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_2.add(rbAgilidadMental_S);
        rbAgilidadMental_S.setText("S");

        rbAgilidadMental_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_2.add(rbAgilidadMental_NPS);
        rbAgilidadMental_NPS.setText("NPS");

        rbAgilidadMental_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_2.add(rbAgilidadMental_NP);
        rbAgilidadMental_NP.setText("NP");

        rbNivIntelectual_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_1.add(rbNivIntelectual_I);
        rbNivIntelectual_I.setText("I");

        rbAgilidadMental_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_2.add(rbAgilidadMental_I);
        rbAgilidadMental_I.setText("I");

        rbAgilidadMental_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_2.add(rbAgilidadMental_NPI);
        rbAgilidadMental_NPI.setText("NPI");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("3. Razonamiento Práctico :");

        rbRazPractico_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_3.add(rbRazPractico_S);
        rbRazPractico_S.setText("S");

        rbRazPractico_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_3.add(rbRazPractico_NPS);
        rbRazPractico_NPS.setText("NPS");

        rbRazPractico_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_3.add(rbRazPractico_NP);
        rbRazPractico_NP.setText("NP");

        rbRazPractico_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_3.add(rbRazPractico_NPI);
        rbRazPractico_NPI.setText("NPI");

        rbRazPractico_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_3.add(rbRazPractico_I);
        rbRazPractico_I.setText("I");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("4. Criterio / Juicio :");

        rbCriterioJuicio_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_4.add(rbCriterioJuicio_S);
        rbCriterioJuicio_S.setText("S");

        rbCriterioJuicio_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_4.add(rbCriterioJuicio_NPS);
        rbCriterioJuicio_NPS.setText("NPS");

        rbCriterioJuicio_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_4.add(rbCriterioJuicio_NP);
        rbCriterioJuicio_NP.setText("NP");

        rbCriterioJuicio_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_4.add(rbCriterioJuicio_NPI);
        rbCriterioJuicio_NPI.setText("NPI");

        rbCriterioJuicio_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_4.add(rbCriterioJuicio_I);
        rbCriterioJuicio_I.setText("I");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("5. Memoria :");

        rbMemoria_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_5.add(rbMemoria_S);
        rbMemoria_S.setText("S");

        rbMemoria_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_5.add(rbMemoria_NPS);
        rbMemoria_NPS.setText("NPS");

        rbMemoria_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_5.add(rbMemoria_NP);
        rbMemoria_NP.setText("NP");

        rbMemoria_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_5.add(rbMemoria_NPI);
        rbMemoria_NPI.setText("NPI");

        rbMemoria_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_5.add(rbMemoria_I);
        rbMemoria_I.setText("I");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("6. Atención Concentración :");

        rbAtencionConc_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_6.add(rbAtencionConc_S);
        rbAtencionConc_S.setText("S");

        rbAtencionConc_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_6.add(rbAtencionConc_NPS);
        rbAtencionConc_NPS.setText("NPS");

        rbAtencionConc_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_6.add(rbAtencionConc_NP);
        rbAtencionConc_NP.setText("NP");

        rbAtencionConc_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_6.add(rbAtencionConc_NPI);
        rbAtencionConc_NPI.setText("NPI");

        rbAtencionConc_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_6.add(rbAtencionConc_I);
        rbAtencionConc_I.setText("I");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("7. Orientación ESpacial :");

        rbOrientEspacial_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_7.add(rbOrientEspacial_S);
        rbOrientEspacial_S.setText("S");

        rbOrientEspacial_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_7.add(rbOrientEspacial_NPS);
        rbOrientEspacial_NPS.setText("NPS");

        rbOrientEspacial_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_7.add(rbOrientEspacial_NP);
        rbOrientEspacial_NP.setText("NP");

        rbOrientEspacial_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_7.add(rbOrientEspacial_NPI);
        rbOrientEspacial_NPI.setText("NPI");

        rbOrientEspacial_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_7.add(rbOrientEspacial_I);
        rbOrientEspacial_I.setText("I");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("8. Coordinación Visomotora : ");

        rbCoordVisomotora_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_8.add(rbCoordVisomotora_S);
        rbCoordVisomotora_S.setText("S");

        rbCoordVisomotora_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_8.add(rbCoordVisomotora_NPS);
        rbCoordVisomotora_NPS.setText("NPS");

        rbCoordVisomotora_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_8.add(rbCoordVisomotora_NP);
        rbCoordVisomotora_NP.setText("NP");

        rbCoordVisomotora_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_8.add(rbCoordVisomotora_NPI);
        rbCoordVisomotora_NPI.setText("NPI");

        rbCoordVisomotora_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACI_8.add(rbCoordVisomotora_I);
        rbCoordVisomotora_I.setText("I");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(rbAgilidadMental_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbAgilidadMental_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAgilidadMental_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAgilidadMental_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAgilidadMental_I))
                    .addComponent(jLabel39)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(rbNivIntelectual_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbNivIntelectual_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNivIntelectual_NP)
                        .addGap(1, 1, 1)
                        .addComponent(rbNivIntelectual_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNivIntelectual_I))
                    .addComponent(jLabel40)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(rbRazPractico_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbRazPractico_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRazPractico_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRazPractico_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRazPractico_I))
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(rbMemoria_S)
                                .addGap(1, 1, 1)
                                .addComponent(rbMemoria_NPS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMemoria_NP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMemoria_NPI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMemoria_I))
                            .addComponent(jLabel45))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(rbCriterioJuicio_S)
                            .addGap(1, 1, 1)
                            .addComponent(rbCriterioJuicio_NPS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbCriterioJuicio_NP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbCriterioJuicio_NPI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbCriterioJuicio_I)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(rbAtencionConc_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbAtencionConc_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAtencionConc_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAtencionConc_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAtencionConc_I))
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(rbCoordVisomotora_S)
                                .addGap(1, 1, 1)
                                .addComponent(rbCoordVisomotora_NPS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCoordVisomotora_NP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCoordVisomotora_NPI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCoordVisomotora_I))
                            .addComponent(jLabel49))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(rbOrientEspacial_S)
                            .addGap(1, 1, 1)
                            .addComponent(rbOrientEspacial_NPS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbOrientEspacial_NP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbOrientEspacial_NPI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbOrientEspacial_I))))
                .addGap(1, 1, 1))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel39)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbNivIntelectual_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivIntelectual_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivIntelectual_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivIntelectual_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivIntelectual_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel40)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbAgilidadMental_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAgilidadMental_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAgilidadMental_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAgilidadMental_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAgilidadMental_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel41)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbRazPractico_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRazPractico_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRazPractico_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRazPractico_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRazPractico_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbCriterioJuicio_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCriterioJuicio_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCriterioJuicio_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCriterioJuicio_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCriterioJuicio_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbMemoria_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMemoria_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMemoria_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMemoria_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMemoria_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbAtencionConc_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAtencionConc_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAtencionConc_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAtencionConc_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAtencionConc_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbOrientEspacial_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOrientEspacial_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOrientEspacial_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOrientEspacial_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOrientEspacial_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel49)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbCoordVisomotora_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoordVisomotora_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoordVisomotora_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoordVisomotora_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoordVisomotora_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel18.setBackground(new java.awt.Color(153, 204, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Área Afectiva-Personalidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        rbEstabEmocional_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_1.add(rbEstabEmocional_S);
        rbEstabEmocional_S.setText("S");

        rbEstabEmocional_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_1.add(rbEstabEmocional_NPS);
        rbEstabEmocional_NPS.setText("NPS");

        rbEstabEmocional_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_1.add(rbEstabEmocional_NP);
        rbEstabEmocional_NP.setText("NP");

        rbEstabEmocional_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_1.add(rbEstabEmocional_NPI);
        rbEstabEmocional_NPI.setText("NPI");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("1.Estabilidad Emocional :");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setText("2. Madurez :");

        rbMadurez_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_2.add(rbMadurez_S);
        rbMadurez_S.setText("S");

        rbMadurez_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_2.add(rbMadurez_NPS);
        rbMadurez_NPS.setText("NPS");

        rbMadurez_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_2.add(rbMadurez_NP);
        rbMadurez_NP.setText("NP");

        rbEstabEmocional_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_1.add(rbEstabEmocional_I);
        rbEstabEmocional_I.setText("I");

        rbMadurez_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_2.add(rbMadurez_I);
        rbMadurez_I.setText("I");

        rbMadurez_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_2.add(rbMadurez_NPI);
        rbMadurez_NPI.setText("NPI");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setText("3.Control de Impulsos/Autocontrol:");

        rbControlImpulso_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_3.add(rbControlImpulso_S);
        rbControlImpulso_S.setText("S");

        rbControlImpulso_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_3.add(rbControlImpulso_NPS);
        rbControlImpulso_NPS.setText("NPS");

        rbControlImpulso_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_3.add(rbControlImpulso_NP);
        rbControlImpulso_NP.setText("NP");

        rbControlImpulso_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_3.add(rbControlImpulso_NPI);
        rbControlImpulso_NPI.setText("NPI");

        rbControlImpulso_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_3.add(rbControlImpulso_I);
        rbControlImpulso_I.setText("I");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setText("4. Manejo de Estrés y Tensión :");

        rbManejoEstres_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_4.add(rbManejoEstres_S);
        rbManejoEstres_S.setText("S");

        rbManejoEstres_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_4.add(rbManejoEstres_NPS);
        rbManejoEstres_NPS.setText("NPS");

        rbManejoEstres_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_4.add(rbManejoEstres_NP);
        rbManejoEstres_NP.setText("NP");

        rbManejoEstres_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_4.add(rbManejoEstres_NPI);
        rbManejoEstres_NPI.setText("NPI");

        rbManejoEstres_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_4.add(rbManejoEstres_I);
        rbManejoEstres_I.setText("I");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setText("5. Tolerancia a la Frustración :");

        rbToleranciaFrus_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_5.add(rbToleranciaFrus_S);
        rbToleranciaFrus_S.setText("S");

        rbToleranciaFrus_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_5.add(rbToleranciaFrus_NPS);
        rbToleranciaFrus_NPS.setText("NPS");

        rbToleranciaFrus_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_5.add(rbToleranciaFrus_NP);
        rbToleranciaFrus_NP.setText("NP");

        rbToleranciaFrus_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_5.add(rbToleranciaFrus_NPI);
        rbToleranciaFrus_NPI.setText("NPI");

        rbToleranciaFrus_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_5.add(rbToleranciaFrus_I);
        rbToleranciaFrus_I.setText("I");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setText("6. Responsabilidad :");

        rbResponsabilidad_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_6.add(rbResponsabilidad_S);
        rbResponsabilidad_S.setText("S");

        rbResponsabilidad_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_6.add(rbResponsabilidad_NPS);
        rbResponsabilidad_NPS.setText("NPS");

        rbResponsabilidad_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_6.add(rbResponsabilidad_NP);
        rbResponsabilidad_NP.setText("NP");

        rbResponsabilidad_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_6.add(rbResponsabilidad_NPI);
        rbResponsabilidad_NPI.setText("NPI");

        rbResponsabilidad_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_6.add(rbResponsabilidad_I);
        rbResponsabilidad_I.setText("I");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setText("7. Seguridad en si mismo :");

        rbSeguridad_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_7.add(rbSeguridad_S);
        rbSeguridad_S.setText("S");

        rbSeguridad_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_7.add(rbSeguridad_NPS);
        rbSeguridad_NPS.setText("NPS");

        rbSeguridad_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_7.add(rbSeguridad_NP);
        rbSeguridad_NP.setText("NP");

        rbSeguridad_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_7.add(rbSeguridad_NPI);
        rbSeguridad_NPI.setText("NPI");

        rbSeguridad_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_7.add(rbSeguridad_I);
        rbSeguridad_I.setText("I");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setText("8. Relacionales Interpersonales : ");

        rbRelacionesInterp_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_8.add(rbRelacionesInterp_S);
        rbRelacionesInterp_S.setText("S");

        rbRelacionesInterp_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_8.add(rbRelacionesInterp_NPS);
        rbRelacionesInterp_NPS.setText("NPS");

        rbRelacionesInterp_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_8.add(rbRelacionesInterp_NP);
        rbRelacionesInterp_NP.setText("NP");

        rbRelacionesInterp_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_8.add(rbRelacionesInterp_NPI);
        rbRelacionesInterp_NPI.setText("NPI");

        rbRelacionesInterp_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_8.add(rbRelacionesInterp_I);
        rbRelacionesInterp_I.setText("I");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setText("9. Capacidad de Adaptación : ");

        rbCapacAdaptacion_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_9.add(rbCapacAdaptacion_NPS);
        rbCapacAdaptacion_NPS.setText("NPS");

        rbCapacAdaptacion_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_9.add(rbCapacAdaptacion_S);
        rbCapacAdaptacion_S.setText("S");

        rbCapacAdaptacion_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_9.add(rbCapacAdaptacion_NP);
        rbCapacAdaptacion_NP.setText("NP");

        rbCapacAdaptacion_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_9.add(rbCapacAdaptacion_NPI);
        rbCapacAdaptacion_NPI.setText("NPI");

        rbCapacAdaptacion_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAAP_9.add(rbCapacAdaptacion_I);
        rbCapacAdaptacion_I.setText("I");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(rbMadurez_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbMadurez_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMadurez_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMadurez_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMadurez_I))
                    .addComponent(jLabel50)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(rbEstabEmocional_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbEstabEmocional_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEstabEmocional_NP)
                        .addGap(1, 1, 1)
                        .addComponent(rbEstabEmocional_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEstabEmocional_I))
                    .addComponent(jLabel51)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(rbControlImpulso_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbControlImpulso_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbControlImpulso_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbControlImpulso_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbControlImpulso_I))
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(rbToleranciaFrus_S)
                                .addGap(1, 1, 1)
                                .addComponent(rbToleranciaFrus_NPS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbToleranciaFrus_NP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbToleranciaFrus_NPI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbToleranciaFrus_I))
                            .addComponent(jLabel54))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(rbManejoEstres_S)
                            .addGap(1, 1, 1)
                            .addComponent(rbManejoEstres_NPS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbManejoEstres_NP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbManejoEstres_NPI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbManejoEstres_I)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(rbResponsabilidad_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbResponsabilidad_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbResponsabilidad_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbResponsabilidad_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbResponsabilidad_I))
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(rbRelacionesInterp_S)
                                .addGap(1, 1, 1)
                                .addComponent(rbRelacionesInterp_NPS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbRelacionesInterp_NP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbRelacionesInterp_NPI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbRelacionesInterp_I))
                            .addComponent(jLabel57))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(rbSeguridad_S)
                            .addGap(1, 1, 1)
                            .addComponent(rbSeguridad_NPS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbSeguridad_NP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbSeguridad_NPI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbSeguridad_I))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(rbCapacAdaptacion_S)
                                .addGap(1, 1, 1)
                                .addComponent(rbCapacAdaptacion_NPS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCapacAdaptacion_NP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCapacAdaptacion_NPI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCapacAdaptacion_I))
                            .addComponent(jLabel58))))
                .addGap(1, 1, 1))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel50)
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbEstabEmocional_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEstabEmocional_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEstabEmocional_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEstabEmocional_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEstabEmocional_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel51)
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbMadurez_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMadurez_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMadurez_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMadurez_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMadurez_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel52)
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbControlImpulso_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbControlImpulso_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbControlImpulso_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbControlImpulso_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbControlImpulso_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbManejoEstres_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbManejoEstres_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbManejoEstres_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbManejoEstres_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbManejoEstres_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbToleranciaFrus_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbToleranciaFrus_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbToleranciaFrus_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbToleranciaFrus_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbToleranciaFrus_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbResponsabilidad_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbResponsabilidad_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbResponsabilidad_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbResponsabilidad_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbResponsabilidad_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbSeguridad_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSeguridad_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSeguridad_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSeguridad_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSeguridad_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel57)
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbRelacionesInterp_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRelacionesInterp_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRelacionesInterp_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRelacionesInterp_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRelacionesInterp_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel58)
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbCapacAdaptacion_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapacAdaptacion_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapacAdaptacion_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapacAdaptacion_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapacAdaptacion_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel19.setBackground(new java.awt.Color(153, 204, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Área de Seguridad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        rbNivProactividad_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_1.add(rbNivProactividad_S);
        rbNivProactividad_S.setText("S");

        rbNivProactividad_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_1.add(rbNivProactividad_NPS);
        rbNivProactividad_NPS.setText("NPS");

        rbNivProactividad_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_1.add(rbNivProactividad_NP);
        rbNivProactividad_NP.setText("NP");

        rbNivProactividad_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_1.add(rbNivProactividad_NPI);
        rbNivProactividad_NPI.setText("NPI");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel59.setText("1. Nivel Proactividad :");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel60.setText("2. Discriminación de sit. de riesgo :");

        rbDiscrimRiesgo_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_2.add(rbDiscrimRiesgo_S);
        rbDiscrimRiesgo_S.setText("S");

        rbDiscrimRiesgo_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_2.add(rbDiscrimRiesgo_NPS);
        rbDiscrimRiesgo_NPS.setText("NPS");

        rbDiscrimRiesgo_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_2.add(rbDiscrimRiesgo_NP);
        rbDiscrimRiesgo_NP.setText("NP");

        rbNivProactividad_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_1.add(rbNivProactividad_I);
        rbNivProactividad_I.setText("I");

        rbDiscrimRiesgo_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_2.add(rbDiscrimRiesgo_I);
        rbDiscrimRiesgo_I.setText("I");

        rbDiscrimRiesgo_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_2.add(rbDiscrimRiesgo_NPI);
        rbDiscrimRiesgo_NPI.setText("NPI");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel61.setText("3. Tolerancia a la rutina:");

        rbTolRutina_S.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_3.add(rbTolRutina_S);
        rbTolRutina_S.setText("S");

        rbTolRutina_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_3.add(rbTolRutina_NPS);
        rbTolRutina_NPS.setText("NPS");

        rbTolRutina_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_3.add(rbTolRutina_NP);
        rbTolRutina_NP.setText("NP");

        rbTolRutina_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_3.add(rbTolRutina_NPI);
        rbTolRutina_NPI.setText("NPI");

        rbTolRutina_I.setBackground(new java.awt.Color(153, 204, 255));
        bgAS_3.add(rbTolRutina_I);
        rbTolRutina_I.setText("I");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(rbDiscrimRiesgo_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbDiscrimRiesgo_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDiscrimRiesgo_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDiscrimRiesgo_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDiscrimRiesgo_I))
                    .addComponent(jLabel59)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(rbNivProactividad_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbNivProactividad_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNivProactividad_NP)
                        .addGap(1, 1, 1)
                        .addComponent(rbNivProactividad_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNivProactividad_I))
                    .addComponent(jLabel60)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(rbTolRutina_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbTolRutina_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTolRutina_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTolRutina_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTolRutina_I))
                    .addComponent(jLabel61))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel59)
                .addGap(1, 1, 1)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbNivProactividad_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivProactividad_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivProactividad_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivProactividad_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivProactividad_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel60)
                .addGap(1, 1, 1)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbDiscrimRiesgo_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDiscrimRiesgo_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDiscrimRiesgo_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDiscrimRiesgo_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDiscrimRiesgo_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel61)
                .addGap(1, 1, 1)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbTolRutina_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTolRutina_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTolRutina_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTolRutina_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTolRutina_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel20.setBackground(new java.awt.Color(153, 204, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Área Cognitiva-Motivaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        rbMotTrabajo_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_1.add(rbMotTrabajo_S);
        rbMotTrabajo_S.setText("S");

        rbMotTrabajo_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_1.add(rbMotTrabajo_NPS);
        rbMotTrabajo_NPS.setText("NPS");

        rbMotTrabajo_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_1.add(rbMotTrabajo_NP);
        rbMotTrabajo_NP.setText("NP");

        rbMotTrabajo_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_1.add(rbMotTrabajo_NPI);
        rbMotTrabajo_NPI.setText("NPI");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel63.setText("1.Motivación para el trabajo:");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel64.setText("2. Resp regl. convivenc (puntuali) :");

        rbRespRegConv_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_2.add(rbRespRegConv_S);
        rbRespRegConv_S.setText("S");

        rbRespRegConv_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_2.add(rbRespRegConv_NPS);
        rbRespRegConv_NPS.setText("NPS");

        rbRespRegConv_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_2.add(rbRespRegConv_NP);
        rbRespRegConv_NP.setText("NP");

        rbMotTrabajo_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_1.add(rbMotTrabajo_I);
        rbMotTrabajo_I.setText("I");

        rbRespRegConv_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_2.add(rbRespRegConv_I);
        rbRespRegConv_I.setText("I");

        rbRespRegConv_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_2.add(rbRespRegConv_NPI);
        rbRespRegConv_NPI.setText("NPI");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setText("3. Seguimiento de instrucciones:");

        rbSeguimInstr_S.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_3.add(rbSeguimInstr_S);
        rbSeguimInstr_S.setText("S");

        rbSeguimInstr_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_3.add(rbSeguimInstr_NPS);
        rbSeguimInstr_NPS.setText("NPS");

        rbSeguimInstr_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_3.add(rbSeguimInstr_NP);
        rbSeguimInstr_NP.setText("NP");

        rbSeguimInstr_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_3.add(rbSeguimInstr_NPI);
        rbSeguimInstr_NPI.setText("NPI");

        rbSeguimInstr_I.setBackground(new java.awt.Color(153, 204, 255));
        bgACM_3.add(rbSeguimInstr_I);
        rbSeguimInstr_I.setText("I");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(rbRespRegConv_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbRespRegConv_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRespRegConv_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRespRegConv_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRespRegConv_I))
                    .addComponent(jLabel63)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(rbMotTrabajo_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbMotTrabajo_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMotTrabajo_NP)
                        .addGap(1, 1, 1)
                        .addComponent(rbMotTrabajo_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMotTrabajo_I))
                    .addComponent(jLabel64)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(rbSeguimInstr_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbSeguimInstr_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbSeguimInstr_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbSeguimInstr_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbSeguimInstr_I))
                    .addComponent(jLabel65))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel63)
                .addGap(1, 1, 1)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbMotTrabajo_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMotTrabajo_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMotTrabajo_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMotTrabajo_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMotTrabajo_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel64)
                .addGap(1, 1, 1)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbRespRegConv_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRespRegConv_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRespRegConv_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRespRegConv_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRespRegConv_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel65)
                .addGap(1, 1, 1)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbSeguimInstr_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSeguimInstr_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSeguimInstr_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSeguimInstr_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSeguimInstr_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 53, Short.MAX_VALUE))
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Áreas de Evaluación", jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Impirmir N° Orden"));

        txtImpEP.setBackground(new java.awt.Color(255, 153, 0));
        txtImpEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpEPActionPerformed(evt);
            }
        });
        txtImpEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpEPKeyTyped(evt);
            }
        });

        btnIMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnIMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(txtImpEP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtImpEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnAgregarEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnAgregarEP.setMnemonic('g');
        btnAgregarEP.setText("Guardar");
        btnAgregarEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(btnAgregarEP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnActualizarEP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLimpiarEP))))
                        .addGap(0, 102, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnActualizarEP)
                                    .addComponent(btnLimpiarEP)
                                    .addComponent(btnAgregarEP)))
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(2, 2, 2))))
        );

        jTabbedPane1.addTab("Eval. Psicologica", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void atxtIntelectualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtIntelectualFocusGained
    atxtIntelectual.setBackground(Color .ORANGE);
   }//GEN-LAST:event_atxtIntelectualFocusGained

   private void atxtIntelectualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtIntelectualFocusLost
      atxtIntelectual.setBackground(Color .WHITE);
   }//GEN-LAST:event_atxtIntelectualFocusLost

   private void atxtPersonalidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtPersonalidadFocusGained
      
   }//GEN-LAST:event_atxtPersonalidadFocusGained

   private void atxtPersonalidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtPersonalidadFocusLost
      atxtPersonalidad.setBackground(Color.WHITE);
   }//GEN-LAST:event_atxtPersonalidadFocusLost

   private void atxtPsicomotricidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtPsicomotricidadFocusGained
     atxtPsicomotricidad.setBackground(Color.ORANGE);
   }//GEN-LAST:event_atxtPsicomotricidadFocusGained

   private void atxtPsicomotricidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtPsicomotricidadFocusLost
      atxtPsicomotricidad.setBackground(Color.WHITE);
   }//GEN-LAST:event_atxtPsicomotricidadFocusLost

   private void atxtOrganicidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtOrganicidadFocusGained
      atxtOrganicidad.setBackground(Color.ORANGE);
   }//GEN-LAST:event_atxtOrganicidadFocusGained

   private void atxtOrganicidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtOrganicidadFocusLost
      atxtOrganicidad.setBackground(Color.WHITE);
   }//GEN-LAST:event_atxtOrganicidadFocusLost

   private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     limpiar();
   }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        if(!OrdenExiste()){ 
        String Sql="select datos_paciente.nombres_pa,datos_paciente.apellidos_pa,"
                 + "datos_paciente.fecha_nacimiento_pa,datos_paciente.lugar_nac_pa,"
                 + "datos_paciente.direccion_pa,datos_paciente.estado_civil_pa,"
                 + "datos_paciente.nivel_est_pa,datos_paciente.ocupacion_pa,"
                 + "n_orden_ocupacional.cargo_de "
                 + "From datos_paciente,n_orden_ocupacional "
                 + "where datos_paciente.cod_pa = n_orden_ocupacional.cod_pa and n_orden_ocupacional.n_orden ='"+txtNorden.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtLugarNacimiento.setText(oConn.setResult.getString("lugar_nac_pa"));
                        txtDomicilio.setText(oConn.setResult.getString("direccion_pa"));
                        txtEstadoCivil.setText(oConn.setResult.getString("estado_civil_pa"));
                        txtNivelEstudios.setText(oConn.setResult.getString("nivel_est_pa"));
                        txtOcupación.setText(oConn.setResult.getString("ocupacion_pa"));
                        txtCargoDesempenar.setText(oConn.setResult.getString("cargo_de"));
//                        atxtIntelectual.append("- EL EVALUADO POSEE UN NIVEL INTELECTUAL NORMAL.\n"
//                                + "- COMPRENDE Y PROCESA LA INFORMACION CON FACILIDAD.\n"
//                                + "- POSEE UN NIVEL ADECUADO,EN COMPRENSION VERBAL Y BAJO\n"
//                                + "  EN CAPACIDAD NUMERICA.\n"
//                                + "- ADECUADA, RETENCION DE DIGITOS.");
//                        atxtOrganicidad.append("- ORIENTADO EN TIEMPO, ESPACIO, Y PERSONA. \n"
//                                + "- POSEE UN ADECUADO MANEJO DE FACULTADES MENTALES.\n"
//                                + "- NO SE EVIDENCIA DAÑO ORGANICO.");
//                        atxtPsicomotricidad.append("- NIVEL ADECUADO EN DESARROLLO PSICOMOTOR.\n"
//                                + "- REALIZA LAS INSTRUCIONES BRINDAS BRINDADAS CON FACILIDAD.");
                        txtNorden.setEnabled(false);    
                        oPe.fecha(FechaEntrevista);
                        
                        txtEdad.setText(String.valueOf(calcularEdad(FechaNacimiento.getCalendar())) );
                        
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Oftalmologia:" + ex.getMessage().toString());
        }
        }          
    }//GEN-LAST:event_txtNordenActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      if (!txtNorden.getText().isEmpty()){
        if(!OrdenExiste()){
         if (validar()){
      String Sql ="INSERT INTO informe_psicologico(n_orden, fecha_entrevista, edad_inf, "
              + "a_intelectual, a_personalidad, "
              + "a_organicidad, a_psicomotricidad, recomendaciones, aprobo_inf, desaprobo_inf)";
     Sql+="Values('"+txtNorden.getText()+"','"+FechaEntrevista.getDate()+"','"
                     +txtEdad.getText().toString()+ "','"
                     +atxtIntelectual.getText()+ "','"
                     +atxtPersonalidad.getText().toString()+"','"
                     +atxtOrganicidad.getText().toString()+"','"
                     +atxtPsicomotricidad.getText().toString()+"','"
                     +atxtRecomendaciones.getText().toString()+"','"
                     +rbSi.isSelected()+"','"
                     +rbNo.isSelected()+"')";
                     //oFunc.SubSistemaMensajeInformacion(Sql);
                      if (oConn.FnBoolQueryExecuteUpdate(Sql)){
                //oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                imprimir(Integer.valueOf(txtNorden.getText()));          
                txtNorden.setEnabled(true);
                txtNorden.requestFocus();
                sbCargarDatosInformePsicologico("");
                limpiar();
                }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");}
             }else{oFunc.SubSistemaMensajeError("Ingrese Información Faltante");}
      }
      }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void FechaEntrevistaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaEntrevistaPropertyChange
      atxtIntelectual.requestFocus();
    }//GEN-LAST:event_FechaEntrevistaPropertyChange

    private void atxtIntelectualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atxtIntelectualKeyReleased
//   if(!atxtIntelectual.getText().isEmpty()){
//               AutoTextComplete Intelectual = new AutoTextComplete(atxtIntelectual);
//     
////try {
////Class.forName("org.postgresql.Driver");
////java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/medsoft","postgres","g26028");
////            AutoCompleteDBLink CompleteDBLink = new AutoCompleteDBLink(Intelectual, "SELECT criterio  FROM criterios_informe_psicologico WHERE area='INTELECTUAL' ;",con);
////            
////                       
////} catch(ClassNotFoundException | SQLException ex) {}
//
//   }
    }//GEN-LAST:event_atxtIntelectualKeyReleased

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        sbCargarDatosInformePsicologico(txtBuscar.getText().toString());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tbInformePsicologicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInformePsicologicoMousePressed
        if (evt.getClickCount() == 2) 
        {  
            Integer cod  = Integer.valueOf( tbInformePsicologico.getValueAt(tbInformePsicologico.getSelectedRow(),1).toString());
            print(cod);
            
        }
    }//GEN-LAST:event_tbInformePsicologicoMousePressed

    private void btnCriteriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriteriosMouseClicked
            CriteriosPsicologia cri = new CriteriosPsicologia(null, closable);
            cri.setVisible(true);
           
           
    }//GEN-LAST:event_btnCriteriosMouseClicked

    private void atxtPersonalidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atxtPersonalidadKeyReleased
//       if(!atxtPersonalidad.getText().isEmpty()){
//               AutoTextComplete Personalidad = new AutoTextComplete(atxtPersonalidad);
//     
////try {
////Class.forName("org.postgresql.Driver");
////java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/medsoft","postgres","g26028");
////            AutoCompleteDBLink CompleteDBLink = new AutoCompleteDBLink(Personalidad, "SELECT criterio  FROM criterios_informe_psicologico WHERE area='PERSONALIDAD' ;",con);
////            
////                       
////} catch(ClassNotFoundException | SQLException ex) {}
//
//   }
    }//GEN-LAST:event_atxtPersonalidadKeyReleased

    private void atxtOrganicidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atxtOrganicidadKeyReleased
//          if(!atxtOrganicidad.getText().isEmpty()){
//               AutoTextComplete Organicidad = new AutoTextComplete(atxtOrganicidad);
//     
////try {
////Class.forName("org.postgresql.Driver");
////java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/medsoft","postgres","g26028");
////            AutoCompleteDBLink CompleteDBLink = new AutoCompleteDBLink(Organicidad, "SELECT criterio  FROM criterios_informe_psicologico WHERE area='ORGANICIDAD' ;",con);
////            
////                       
////} catch(ClassNotFoundException | SQLException ex) {}
//
//   }
    }//GEN-LAST:event_atxtOrganicidadKeyReleased

    private void atxtPsicomotricidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atxtPsicomotricidadKeyReleased
//          if(!atxtPsicomotricidad.getText().isEmpty()){
//               AutoTextComplete Psicomotricidad = new AutoTextComplete(atxtPsicomotricidad);
//     
////try {
////Class.forName("org.postgresql.Driver");
////java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/medsoft","postgres","g26028");
////            AutoCompleteDBLink CompleteDBLink = new AutoCompleteDBLink(Psicomotricidad, "SELECT criterio  FROM criterios_informe_psicologico WHERE area='PSICOMOTRICIDAD' ;",con);
////            
////                       
////} catch(ClassNotFoundException | SQLException ex) {}
//
//   }
    }//GEN-LAST:event_atxtPsicomotricidadKeyReleased

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
        sbCargarDatosInformePsicologico(txtBuscarCod.getText());
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String sCodigo=txtNorden.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE informe_psicologico\n" +
                "   SET fecha_entrevista='"+FechaEntrevista.getDate()+"',edad_inf='"+txtEdad.getText().toString()+"', a_intelectual='"+atxtIntelectual.getText().toString()+"', \n" +
                "   a_personalidad='"+atxtPersonalidad.getText().toString()+"', a_organicidad='"+atxtOrganicidad.getText().toString()+"',"
                + " a_psicomotricidad='"+atxtPsicomotricidad.getText().toString()+"', recomendaciones='"+atxtRecomendaciones.getText().toString()+"', \n" +
                "   aprobo_inf='"+rbSi.isSelected()+"', desaprobo_inf='"+rbNo.isSelected()+"' " +
                " WHERE n_orden='" + sCodigo + "'";
            
             txtNorden.setEnabled(true);
             txtNorden.requestFocus();
             sbCargarDatosInformePsicologico("");
             
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
            imprimir(Integer.valueOf(txtNorden.getText()));
            limpiar();
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       String Sql="select d.nombres_pa,d.apellidos_pa,"
                 + "d.fecha_nacimiento_pa,d.lugar_nac_pa,"
                 + "d.direccion_pa,d.estado_civil_pa,"
                 + "d.nivel_est_pa,d.ocupacion_pa,"
                 + "n.cargo_de,i.fecha_entrevista, i.a_intelectual, \n" +
                   "i.a_personalidad, i.a_organicidad, i.a_psicomotricidad, i.recomendaciones, \n" +
                   " i.aprobo_inf, i.desaprobo_inf "
                 + "From datos_paciente as d "
               + "inner join n_orden_ocupacional as n on(d.cod_pa = n.cod_pa) "
               + "inner join informe_psicologico as i on(n.n_orden = i.n_orden) "
                 + "where  n.n_orden ='"+txtNorden.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtLugarNacimiento.setText(oConn.setResult.getString("lugar_nac_pa"));
                        txtDomicilio.setText(oConn.setResult.getString("direccion_pa"));
                        txtEstadoCivil.setText(oConn.setResult.getString("estado_civil_pa"));
                        txtNivelEstudios.setText(oConn.setResult.getString("nivel_est_pa"));
                        txtOcupación.setText(oConn.setResult.getString("ocupacion_pa"));
                        txtCargoDesempenar.setText(oConn.setResult.getString("cargo_de"));
                        txtEdad.setText(String.valueOf(calcularEdad(FechaNacimiento.getCalendar())) );
                        FechaEntrevista.setDate(oConn.setResult.getDate("fecha_entrevista"));
                        atxtIntelectual.setText(oConn.setResult.getString("a_intelectual"));
                        atxtPersonalidad.setText(oConn.setResult.getString("a_personalidad"));
                        atxtOrganicidad.setText(oConn.setResult.getString("a_organicidad"));
                        atxtPsicomotricidad.setText(oConn.setResult.getString("a_psicomotricidad"));
                        atxtRecomendaciones.setText(oConn.setResult.getString("recomendaciones"));
                        rbSi.setSelected(oConn.setResult.getBoolean("aprobo_inf"));
                        rbNo.setSelected(oConn.setResult.getBoolean("desaprobo_inf"));
                        
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Oftalmologia:" + ex.getMessage().toString());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void chkI8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI8ActionPerformed
         atxtIntelectual.setText("- EL EVALUADO POSEE UN NIVEL INTELECTUAL BAJO.\n");
    }//GEN-LAST:event_chkI8ActionPerformed

    private void chkI9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI9ActionPerformed
         atxtIntelectual.append("- COMPRENDE Y PROCESA LA INFORMACION CON FACILIDAD.\n");
    }//GEN-LAST:event_chkI9ActionPerformed

    private void chkI10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI10ActionPerformed
        atxtIntelectual.append("- COMPRENDE Y PROCESA LA INFORMACION CON DIFICULTAD.\n");
    }//GEN-LAST:event_chkI10ActionPerformed

    private void chkI11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI11ActionPerformed
        atxtIntelectual.append("- POSEE UN NIVEL ADECUADO EN COMPRENSION VERBAL ");
    }//GEN-LAST:event_chkI11ActionPerformed

    private void chkI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI1ActionPerformed
        atxtIntelectual.setText("- EL EVALUADO POSEE UN NIVEL INTELECTUAL NORMAL.\n");
    }//GEN-LAST:event_chkI1ActionPerformed

    private void chkI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI2ActionPerformed
        atxtIntelectual.setText("- EL EVALUADO POSEE UN NIVEL INTELECTUAL SUPERIOR.\n");
    }//GEN-LAST:event_chkI2ActionPerformed

    private void chkI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI3ActionPerformed
        atxtIntelectual.setText("- EL EVALUADO POSEE UN NIVEL INTELECTUAL NORMAL INFERIOR.\n");
    }//GEN-LAST:event_chkI3ActionPerformed

    private void chkI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI4ActionPerformed
        atxtIntelectual.setText("- EL EVALUADO POSEE UN NIVEL INTELECTUAL ALTO.\n.");
    }//GEN-LAST:event_chkI4ActionPerformed

    private void chkI12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI12ActionPerformed
        atxtIntelectual.append("- POSEE UN NIVEL ALTO EN COMPRENSION VERBAL ");
    }//GEN-LAST:event_chkI12ActionPerformed

    private void chkI13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI13ActionPerformed
        atxtIntelectual.append("- POSEE UN NIVEL BAJO EN COMPRENSION VERBAL ");
    }//GEN-LAST:event_chkI13ActionPerformed

    private void chkI14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI14ActionPerformed
        atxtIntelectual.append("Y EN CAPACIDAD NUMÉRICA.\n");
    }//GEN-LAST:event_chkI14ActionPerformed

    private void chkI15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI15ActionPerformed
        atxtIntelectual.append("Y EN CAPACIDAD DE CÁLCULO.\n");
    }//GEN-LAST:event_chkI15ActionPerformed

    private void chkI16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI16ActionPerformed
        atxtIntelectual.append("- ADECUADA, RETENCION DE DIGITOS.\n");
    }//GEN-LAST:event_chkI16ActionPerformed

    private void chkI17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI17ActionPerformed
       atxtIntelectual.append("- INADECUADA, RETENCIÓN DE DIGITOS.\n");
    }//GEN-LAST:event_chkI17ActionPerformed

    private void chkO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkO1ActionPerformed
        atxtOrganicidad.setText("- ORIENTADO EN TIEMPO, ESPACIO, Y PERSONA. \n");
    }//GEN-LAST:event_chkO1ActionPerformed

    private void chkO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkO2ActionPerformed
       atxtOrganicidad.append("- POSEE UN ALTO MANEJO DE FACULTADES MENTALES.\n");
    }//GEN-LAST:event_chkO2ActionPerformed

    private void chkO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkO3ActionPerformed
        atxtOrganicidad.append("- POSEE UN ADECUADO MANEJO DE FACULTADES MENTALES.\n");
    }//GEN-LAST:event_chkO3ActionPerformed

    private void chkO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkO4ActionPerformed
        atxtOrganicidad.append("- POSEE UN BAJO MANEJO DE FACULTADES MENTALES.\n");
    }//GEN-LAST:event_chkO4ActionPerformed

    private void chkO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkO5ActionPerformed
        atxtOrganicidad.append("- NO SE EVIDENCIA DAÑO ORGÁNICO.\n");
    }//GEN-LAST:event_chkO5ActionPerformed

    private void chkP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkP1ActionPerformed
        atxtPsicomotricidad.append("- NIVEL ALTO EN DESARROLLO PSICOMOTOR.\n");
    }//GEN-LAST:event_chkP1ActionPerformed

    private void chkP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkP2ActionPerformed
        atxtPsicomotricidad.append("- NIVEL ADECUADO EN DESARROLLO PSICOMOTOR.\n");
    }//GEN-LAST:event_chkP2ActionPerformed

    private void chkP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkP3ActionPerformed
        atxtPsicomotricidad.append("- NIVEL BAJO EN DESARROLLO PSICOMOTOR.\n");
    }//GEN-LAST:event_chkP3ActionPerformed

    private void chkP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkP4ActionPerformed
        atxtPsicomotricidad.append("- REALIZA LAS INSTRUCCIONES BRINDADAS CON FACILIDAD.\n");
    }//GEN-LAST:event_chkP4ActionPerformed

    private void chkP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkP5ActionPerformed
         atxtPsicomotricidad.append("- REALIZA LAS INSTRUCCIONES  BRINDADAS CON DIFICULTAD.\n");
    }//GEN-LAST:event_chkP5ActionPerformed

    private void chkI5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI5ActionPerformed
        atxtIntelectual.setText("EL EVALUADO POSEE UN NIVEL INTELECTUAL PROMEDIO SUPERIOR.\n");
    }//GEN-LAST:event_chkI5ActionPerformed

    private void chkI6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI6ActionPerformed
        atxtIntelectual.setText("EL EVALUADO POSEE UN NIVEL INTELECTUAL PROMEDIO MEDIO.\n");
    }//GEN-LAST:event_chkI6ActionPerformed

    private void chkI7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI7ActionPerformed
         atxtIntelectual.setText("EL EVALUADO POSEE UN NIVEL INTELECTUAL PROMEDIO BAJO.\n");
    }//GEN-LAST:event_chkI7ActionPerformed

    private void txtNordenEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenEPActionPerformed
        if(!OrdenExisteEP()){ 
        String Sql="select datos_paciente.nombres_pa,datos_paciente.apellidos_pa,"
                 + "datos_paciente.fecha_nacimiento_pa,datos_paciente.lugar_nac_pa,"
                 + "datos_paciente.direccion_pa,datos_paciente.estado_civil_pa,"
                 + "datos_paciente.nivel_est_pa,datos_paciente.ocupacion_pa,"
                 + "n_orden_ocupacional.cargo_de "
                 + "From datos_paciente,n_orden_ocupacional "
                 + "where datos_paciente.cod_pa = n_orden_ocupacional.cod_pa and n_orden_ocupacional.n_orden ='"+txtNordenEP.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombresEP.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidosEP.setText(oConn.setResult.getString("apellidos_pa"));
                        FechaNacimientoEP.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtLugarNacimientoEP.setText(oConn.setResult.getString("lugar_nac_pa"));
                        txtDomicilioEP.setText(oConn.setResult.getString("direccion_pa"));
                        txtEstadoCivilEP.setText(oConn.setResult.getString("estado_civil_pa"));
                        txtNivelEstudiosEP.setText(oConn.setResult.getString("nivel_est_pa"));
                        txtOcupaciónEP.setText(oConn.setResult.getString("ocupacion_pa"));
                        txtCargoDesempenarEP.setText(oConn.setResult.getString("cargo_de"));
                        txtEdadEP.setText(String.valueOf(calcularEdad(FechaNacimientoEP.getCalendar())) );
                        txtNordenEP.setEnabled(false);    
                        oPe.fecha(FechaEntrevistaEP);
                                              
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
                    } catch (SQLException ex) {
                        oFunc.SubSistemaMensajeInformacion("Evaluacion Psicologica:" + ex.getMessage().toString());
                    }
        }
    }//GEN-LAST:event_txtNordenEPActionPerformed

    private void FechaEntrevistaEPPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaEntrevistaEPPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaEntrevistaEPPropertyChange

    private void btnEditarEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEPActionPerformed
    
             String Sql="select d.nombres_pa,d.apellidos_pa,"
                 + "d.fecha_nacimiento_pa,d.lugar_nac_pa,"
                 + "d.direccion_pa,d.estado_civil_pa,"
                 + "d.nivel_est_pa,d.ocupacion_pa,"
                 + "n.cargo_de,ep.fecha_ep, ep.rbi1, ep.rbi2, ep.rbi3, ep.rbi4, ep.rbi5, \n" +
"       ep.rbi6, ep.rbi7, ep.rbi8, ep.rbi9, ep.rbi10, ep.rbi11, ep.rbi12, ep.rbi13, ep.rbi14, ep.rbi15, \n" +
"       ep.rbi16, ep.rbi17, ep.rbi18, ep.rbi19, ep.rbi20, ep.rbi21, ep.rbi22, ep.rbi23, ep.rbi24, \n" +
"       ep.rbi25, ep.rbi26, ep.rbi27, ep.rbi28, ep.rbi29, ep.rbi30, ep.rbi31, ep.rbi32, ep.rbi33, \n" +
"       ep.rbi34, ep.rbi35, ep.rbi36, ep.rbi37, ep.rbi38, ep.rbi39, ep.rbi40, ep.rbp1, ep.rbp2, \n" +
"       ep.rbp3, ep.rbp4, ep.rbp5, ep.rbp6, ep.rbp7, ep.rbp8, ep.rbp9, ep.rbp10, ep.rbp11, ep.rbp12, \n" +
"       ep.rbp13, ep.rbp14, ep.rbp15, ep.rbp16, ep.rbp17, ep.rbp18, ep.rbp19, ep.rbp20, ep.rbp21, \n" +
"       ep.rbp22, ep.rbp23, ep.rbp24, ep.rbp25, ep.rbp26, ep.rbp27, ep.rbp28, ep.rbp29, ep.rbp30, \n" +
"       ep.rbp31, ep.rbp32, ep.rbp33, ep.rbp34, ep.rbp35, ep.rbp36, ep.rbp37, ep.rbp38, ep.rbp39, \n" +
"       ep.rbp40, ep.rbp41, ep.rbp42, ep.rbp43, ep.rbp44, ep.rbp45, ep.rbs1, ep.rbs2, ep.rbs3, ep.rbs4, \n" +
"       ep.rbs5, ep.rbs6, ep.rbs7, ep.rbs8, ep.rbs9, ep.rbs10, ep.rbs11, ep.rbs12, ep.rbs13, ep.rbs14, \n" +
"       ep.rbs15, ep.rbm1, ep.rbm2, ep.rbm3, ep.rbm4, ep.rbm5, ep.rbm6, ep.rbm7, ep.rbm8, ep.rbm9, \n" +
"       ep.rbm10, ep.rbm11, ep.rbm12, ep.rbm13, ep.rbm14, ep.rbm15, ep.txtobservaciones, ep.txtapreciacion, \n" +
"       ep.txtrecomendaciones, ep.rbapto, ep.rbnoapto,rbexcelente, rbapto_observacion "
                 + "From datos_paciente as d "
               + "inner join n_orden_ocupacional as n on(d.cod_pa = n.cod_pa) "
               + "inner join evaluacion_psicologica as ep on(n.n_orden = ep.n_orden) "
                 + "where  n.n_orden ='"+txtNordenEP.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombresEP.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidosEP.setText(oConn.setResult.getString("apellidos_pa"));
                        FechaNacimientoEP.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtLugarNacimientoEP.setText(oConn.setResult.getString("lugar_nac_pa"));
                        txtDomicilioEP.setText(oConn.setResult.getString("direccion_pa"));
                        txtEstadoCivilEP.setText(oConn.setResult.getString("estado_civil_pa"));
                        txtNivelEstudiosEP.setText(oConn.setResult.getString("nivel_est_pa"));
                        txtOcupaciónEP.setText(oConn.setResult.getString("ocupacion_pa"));
                        txtCargoDesempenarEP.setText(oConn.setResult.getString("cargo_de"));
                        txtEdadEP.setText(String.valueOf(calcularEdad(FechaNacimientoEP.getCalendar())) );
                        FechaEntrevistaEP.setDate(oConn.setResult.getDate("fecha_ep"));
                        rbNivIntelectual_S.setSelected(oConn.setResult.getBoolean("rbi1"));
                        rbNivIntelectual_NPS.setSelected(oConn.setResult.getBoolean("rbi2"));
                        rbNivIntelectual_NP.setSelected(oConn.setResult.getBoolean("rbi3"));
                        rbNivIntelectual_NPI.setSelected(oConn.setResult.getBoolean("rbi4"));
                        rbNivIntelectual_I.setSelected(oConn.setResult.getBoolean("rbi5"));
                        
                        rbAgilidadMental_S.setSelected(oConn.setResult.getBoolean("rbi6"));
                        rbAgilidadMental_NPS.setSelected(oConn.setResult.getBoolean("rbi7"));
                        rbAgilidadMental_NP.setSelected(oConn.setResult.getBoolean("rbi8"));
                        rbAgilidadMental_NPI.setSelected(oConn.setResult.getBoolean("rbi9"));
                        rbAgilidadMental_I.setSelected(oConn.setResult.getBoolean("rbi10"));
                        
                        rbRazPractico_S.setSelected(oConn.setResult.getBoolean("rbi11"));
                        rbRazPractico_NPS.setSelected(oConn.setResult.getBoolean("rbi12"));
                        rbRazPractico_NP.setSelected(oConn.setResult.getBoolean("rbi13"));
                        rbRazPractico_NPI.setSelected(oConn.setResult.getBoolean("rbi14"));
                        rbRazPractico_I.setSelected(oConn.setResult.getBoolean("rbi15"));
                        
                        rbCriterioJuicio_S.setSelected(oConn.setResult.getBoolean("rbi16"));
                        rbCriterioJuicio_NPS.setSelected(oConn.setResult.getBoolean("rbi17"));
                        rbCriterioJuicio_NP.setSelected(oConn.setResult.getBoolean("rbi18"));
                        rbCriterioJuicio_NPI.setSelected(oConn.setResult.getBoolean("rbi19"));
                        rbCriterioJuicio_I.setSelected(oConn.setResult.getBoolean("rbi20"));
                        
                        rbMemoria_S.setSelected(oConn.setResult.getBoolean("rbi21"));
                        rbMemoria_NPS.setSelected(oConn.setResult.getBoolean("rbi22"));
                        rbMemoria_NP.setSelected(oConn.setResult.getBoolean("rbi23"));
                        rbMemoria_NPI.setSelected(oConn.setResult.getBoolean("rbi24"));
                        rbMemoria_I.setSelected(oConn.setResult.getBoolean("rbi25"));
                        
                        rbAtencionConc_S.setSelected(oConn.setResult.getBoolean("rbi26"));
                        rbAtencionConc_NPS.setSelected(oConn.setResult.getBoolean("rbi27"));
                        rbAtencionConc_NP.setSelected(oConn.setResult.getBoolean("rbi28"));
                        rbAtencionConc_NPI.setSelected(oConn.setResult.getBoolean("rbi29"));
                        rbAtencionConc_I.setSelected(oConn.setResult.getBoolean("rbi30"));
                        
                        rbOrientEspacial_S.setSelected(oConn.setResult.getBoolean("rbi31"));
                        rbOrientEspacial_NPS.setSelected(oConn.setResult.getBoolean("rbi32"));
                        rbOrientEspacial_NP.setSelected(oConn.setResult.getBoolean("rbi33"));
                        rbOrientEspacial_NPI.setSelected(oConn.setResult.getBoolean("rbi34"));
                        rbOrientEspacial_I.setSelected(oConn.setResult.getBoolean("rbi35"));
                        
                        rbCoordVisomotora_S.setSelected(oConn.setResult.getBoolean("rbi36"));
                        rbCoordVisomotora_NPS.setSelected(oConn.setResult.getBoolean("rbi37"));
                        rbCoordVisomotora_NP.setSelected(oConn.setResult.getBoolean("rbi38"));
                        rbCoordVisomotora_NPI.setSelected(oConn.setResult.getBoolean("rbi39"));
                        rbCoordVisomotora_I.setSelected(oConn.setResult.getBoolean("rbi40"));
                        
                        rbEstabEmocional_S.setSelected(oConn.setResult.getBoolean("rbp1"));
                        rbEstabEmocional_NPS.setSelected(oConn.setResult.getBoolean("rbp2"));
                        rbEstabEmocional_NP.setSelected(oConn.setResult.getBoolean("rbp3"));
                        rbEstabEmocional_NPI.setSelected(oConn.setResult.getBoolean("rbp4"));
                        rbEstabEmocional_I.setSelected(oConn.setResult.getBoolean("rbp5"));
                        
                        rbMadurez_S.setSelected(oConn.setResult.getBoolean("rbp6"));
                        rbMadurez_NPS.setSelected(oConn.setResult.getBoolean("rbp7"));
                        rbMadurez_NP.setSelected(oConn.setResult.getBoolean("rbp8"));
                        rbMadurez_NPI.setSelected(oConn.setResult.getBoolean("rbp9"));
                        rbMadurez_I.setSelected(oConn.setResult.getBoolean("rbp10"));
                        
                        rbControlImpulso_S.setSelected(oConn.setResult.getBoolean("rbp11"));
                        rbControlImpulso_NPS.setSelected(oConn.setResult.getBoolean("rbp12"));
                        rbControlImpulso_NP.setSelected(oConn.setResult.getBoolean("rbp13"));
                        rbControlImpulso_NPI.setSelected(oConn.setResult.getBoolean("rbp14"));
                        rbControlImpulso_I.setSelected(oConn.setResult.getBoolean("rbp15"));
                        
                        rbManejoEstres_S.setSelected(oConn.setResult.getBoolean("rbp16"));
                        rbManejoEstres_NPS.setSelected(oConn.setResult.getBoolean("rbp17"));
                        rbManejoEstres_NP.setSelected(oConn.setResult.getBoolean("rbp18"));
                        rbManejoEstres_NPI.setSelected(oConn.setResult.getBoolean("rbp19"));
                        rbManejoEstres_I.setSelected(oConn.setResult.getBoolean("rbp20"));
                        
                        rbToleranciaFrus_S.setSelected(oConn.setResult.getBoolean("rbp21"));
                        rbToleranciaFrus_NPS.setSelected(oConn.setResult.getBoolean("rbp22"));
                        rbToleranciaFrus_NP.setSelected(oConn.setResult.getBoolean("rbp23"));
                        rbToleranciaFrus_NPI.setSelected(oConn.setResult.getBoolean("rbp24"));
                        rbToleranciaFrus_I.setSelected(oConn.setResult.getBoolean("rbp25"));
                        
                        rbResponsabilidad_S.setSelected(oConn.setResult.getBoolean("rbp26"));
                        rbResponsabilidad_NPS.setSelected(oConn.setResult.getBoolean("rbp27"));
                        rbResponsabilidad_NP.setSelected(oConn.setResult.getBoolean("rbp28"));
                        rbResponsabilidad_NPI.setSelected(oConn.setResult.getBoolean("rbp29"));
                        rbResponsabilidad_I.setSelected(oConn.setResult.getBoolean("rbp30"));
                        
                        rbSeguridad_S.setSelected(oConn.setResult.getBoolean("rbp31"));
                        rbSeguridad_NPS.setSelected(oConn.setResult.getBoolean("rbp32"));
                        rbSeguridad_NP.setSelected(oConn.setResult.getBoolean("rbp33"));
                        rbSeguridad_NPI.setSelected(oConn.setResult.getBoolean("rbp34"));
                        rbSeguridad_I.setSelected(oConn.setResult.getBoolean("rbp35"));
                        
                        rbRelacionesInterp_S.setSelected(oConn.setResult.getBoolean("rbp36"));
                        rbRelacionesInterp_NPS.setSelected(oConn.setResult.getBoolean("rbp37"));
                        rbRelacionesInterp_NP.setSelected(oConn.setResult.getBoolean("rbp38"));
                        rbRelacionesInterp_NPI.setSelected(oConn.setResult.getBoolean("rbp39"));
                        rbRelacionesInterp_I.setSelected(oConn.setResult.getBoolean("rbp40"));
                        
                        rbCapacAdaptacion_S.setSelected(oConn.setResult.getBoolean("rbp41"));
                        rbCapacAdaptacion_NPS.setSelected(oConn.setResult.getBoolean("rbp42"));
                        rbCapacAdaptacion_NP.setSelected(oConn.setResult.getBoolean("rbp43"));
                        rbCapacAdaptacion_NPI.setSelected(oConn.setResult.getBoolean("rbp44"));
                        rbCapacAdaptacion_I.setSelected(oConn.setResult.getBoolean("rbp45"));
                        
                        rbNivProactividad_S.setSelected(oConn.setResult.getBoolean("rbs1"));
                        rbNivProactividad_NPS.setSelected(oConn.setResult.getBoolean("rbs2"));
                        rbNivProactividad_NP.setSelected(oConn.setResult.getBoolean("rbs3"));
                        rbNivProactividad_NPI.setSelected(oConn.setResult.getBoolean("rbs4"));
                        rbNivProactividad_I.setSelected(oConn.setResult.getBoolean("rbs5"));
                        
                        rbDiscrimRiesgo_S.setSelected(oConn.setResult.getBoolean("rbs6"));
                        rbDiscrimRiesgo_NPS.setSelected(oConn.setResult.getBoolean("rbs7"));
                        rbDiscrimRiesgo_NP.setSelected(oConn.setResult.getBoolean("rbs8"));
                        rbDiscrimRiesgo_NPI.setSelected(oConn.setResult.getBoolean("rbs9"));
                        rbDiscrimRiesgo_I.setSelected(oConn.setResult.getBoolean("rbs10"));
                        
                        rbTolRutina_S.setSelected(oConn.setResult.getBoolean("rbs11"));
                        rbTolRutina_NPS.setSelected(oConn.setResult.getBoolean("rbs12"));
                        rbTolRutina_NP.setSelected(oConn.setResult.getBoolean("rbs13"));
                        rbTolRutina_NPI.setSelected(oConn.setResult.getBoolean("rbs14"));
                        rbTolRutina_I.setSelected(oConn.setResult.getBoolean("rbs15"));
                        
                        rbMotTrabajo_S.setSelected(oConn.setResult.getBoolean("rbm1"));
                        rbMotTrabajo_NPS.setSelected(oConn.setResult.getBoolean("rbm2"));
                        rbMotTrabajo_NP.setSelected(oConn.setResult.getBoolean("rbm3"));
                        rbMotTrabajo_NPI.setSelected(oConn.setResult.getBoolean("rbm4"));
                        rbMotTrabajo_I.setSelected(oConn.setResult.getBoolean("rbm5"));
                        
                        rbRespRegConv_S.setSelected(oConn.setResult.getBoolean("rbm6"));
                        rbRespRegConv_NPS.setSelected(oConn.setResult.getBoolean("rbm7"));
                        rbRespRegConv_NP.setSelected(oConn.setResult.getBoolean("rbm8"));
                        rbRespRegConv_NPI.setSelected(oConn.setResult.getBoolean("rbm9"));
                        rbRespRegConv_I.setSelected(oConn.setResult.getBoolean("rbm10"));
                        
                        rbSeguimInstr_S.setSelected(oConn.setResult.getBoolean("rbm11"));
                        rbSeguimInstr_NPS.setSelected(oConn.setResult.getBoolean("rbm12"));
                        rbSeguimInstr_NP.setSelected(oConn.setResult.getBoolean("rbm13"));
                        rbSeguimInstr_NPI.setSelected(oConn.setResult.getBoolean("rbm14"));
                        rbSeguimInstr_I.setSelected(oConn.setResult.getBoolean("rbm15"));
                        
                        txtObservaciones.setText(oConn.setResult.getString("txtobservaciones"));
                        txtApreciacionPers.setText(oConn.setResult.getString("txtapreciacion"));
                        txtRecomendaciones.setText(oConn.setResult.getString("txtrecomendaciones"));
                       
                        rbSiEP.setSelected(oConn.setResult.getBoolean("rbapto"));
                        rbNoEP.setSelected(oConn.setResult.getBoolean("rbnoapto"));
                        rbExcelente.setSelected(oConn.setResult.getBoolean("rbexcelente"));
                        rbAptoconObservacion.setSelected(oConn.setResult.getBoolean("rbapto_observacion"));
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Evaluacion Psicologica:" + ex.getMessage().toString());
            }
        
    }//GEN-LAST:event_btnEditarEPActionPerformed

    private void txtRecomendacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecomendacionesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecomendacionesFocusGained

    private void txtRecomendacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecomendacionesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecomendacionesFocusLost

    private void txtRecomendacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecomendacionesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecomendacionesKeyReleased

    private void txtApreciacionPersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApreciacionPersFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApreciacionPersFocusGained

    private void txtApreciacionPersFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApreciacionPersFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApreciacionPersFocusLost

    private void txtApreciacionPersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApreciacionPersKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApreciacionPersKeyReleased

    private void txtObservacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesFocusGained

    private void txtObservacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesFocusLost

    private void txtObservacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesKeyReleased

    private void btnAgregarEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEPActionPerformed
        if (!txtNordenEP.getText().isEmpty()){
        if(!OrdenExisteEP()){
         if (validarEP()){
      String Sql ="INSERT INTO evaluacion_psicologica(\n" +
            "            n_orden, edad_ep, fecha_ep, rbi1, rbi2, rbi3, rbi4, rbi5, \n" +
            "            rbi6, rbi7, rbi8, rbi9, rbi10, rbi11, rbi12, rbi13, rbi14, rbi15, \n" +
            "            rbi16, rbi17, rbi18, rbi19, rbi20, rbi21, rbi22, rbi23, rbi24, \n" +
            "            rbi25, rbi26, rbi27, rbi28, rbi29, rbi30, rbi31, rbi32, rbi33, \n" +
            "            rbi34, rbi35, rbi36, rbi37, rbi38, rbi39, rbi40, rbp1, rbp2, \n" +
            "            rbp3, rbp4, rbp5, rbp6, rbp7, rbp8, rbp9, rbp10, rbp11, rbp12, \n" +
            "            rbp13, rbp14, rbp15, rbp16, rbp17, rbp18, rbp19, rbp20, rbp21, \n" +
            "            rbp22, rbp23, rbp24, rbp25, rbp26, rbp27, rbp28, rbp29, rbp30, \n" +
            "            rbp31, rbp32, rbp33, rbp34, rbp35, rbp36, rbp37, rbp38, rbp39, \n" +
            "            rbp40, rbp41, rbp42, rbp43, rbp44, rbp45, rbs1, rbs2, rbs3, rbs4, \n" +
            "            rbs5, rbs6, rbs7, rbs8, rbs9, rbs10, rbs11, rbs12, rbs13, rbs14, \n" +
            "            rbs15, rbm1, rbm2, rbm3, rbm4, rbm5, rbm6, rbm7, rbm8, rbm9, \n" +
            "            rbm10, rbm11, rbm12, rbm13, rbm14, rbm15, txtobservaciones, txtapreciacion, \n" +
            "            txtrecomendaciones, rbapto, rbnoapto,rbexcelente, rbapto_observacion)\n" +
            "    VALUES ('"+txtNordenEP.getText()+"', '"+txtEdadEP.getText()+"','"+FechaEntrevistaEP.getDate()+"',"
          + " '"+rbNivIntelectual_S.isSelected()+"', '"+rbNivIntelectual_NPS.isSelected()+"', '"+rbNivIntelectual_NP.isSelected()+"',"
          + " '"+rbNivIntelectual_NPI.isSelected()+"', '"+rbNivIntelectual_I.isSelected()+"', '"+rbAgilidadMental_S.isSelected()+"', \n" +
            "  '"+rbAgilidadMental_NPS.isSelected()+"', '"+rbAgilidadMental_NP.isSelected()+"', '"+rbAgilidadMental_NPI.isSelected()+"', "
              + "'"+rbAgilidadMental_I.isSelected()+"', '"+rbRazPractico_S.isSelected()+"','"+rbRazPractico_NPS.isSelected()+"', "
              + "'"+rbRazPractico_NP.isSelected()+"', '"+rbRazPractico_NPI.isSelected()+"', '"+rbRazPractico_I.isSelected()+"',"
              + " '"+rbCriterioJuicio_S.isSelected()+"', '"+rbCriterioJuicio_NPS.isSelected()+"', '"+rbCriterioJuicio_NP.isSelected()+"',"
              + " '"+rbCriterioJuicio_NPI.isSelected()+"', '"+rbCriterioJuicio_I.isSelected()+"', '"+rbMemoria_S.isSelected()+"',"
              + " '"+rbMemoria_NPS.isSelected()+"', '"+rbMemoria_NP.isSelected()+"', '"+rbMemoria_NPI.isSelected()+"', '"+rbMemoria_I.isSelected()+"', \n" +
            " '"+rbAtencionConc_S.isSelected()+"', '"+rbAtencionConc_NPS.isSelected()+"', '"+rbAtencionConc_NP.isSelected()+"', '"+rbAtencionConc_NPI.isSelected()+"',"
              + " '"+rbAtencionConc_I.isSelected()+"', '"+rbOrientEspacial_S.isSelected()+"', '"+rbOrientEspacial_NPS.isSelected()+"',"
              + " '"+rbOrientEspacial_NP.isSelected()+"', '"+rbOrientEspacial_NPI.isSelected()+"', '"+rbOrientEspacial_I.isSelected()+"', "
              + "'"+rbCoordVisomotora_S.isSelected()+"', '"+rbCoordVisomotora_NPS.isSelected()+"','"+rbCoordVisomotora_NP.isSelected()+"',"
              + " '"+rbCoordVisomotora_NPI.isSelected()+"', '"+rbCoordVisomotora_I.isSelected()+"', '"+rbEstabEmocional_S.isSelected()+"',"
              + " '"+rbEstabEmocional_NPS.isSelected()+"', '"+rbEstabEmocional_NP.isSelected()+"','"+rbEstabEmocional_NPI.isSelected()+"',"
              + " '"+rbEstabEmocional_I.isSelected()+"', '"+rbMadurez_S.isSelected()+"', '"+rbMadurez_NPS.isSelected()+"',"
              + " '"+rbMadurez_NP.isSelected()+"', '"+rbMadurez_NPI.isSelected()+"', '"+rbMadurez_I.isSelected()+"',"
              + " '"+rbControlImpulso_S.isSelected()+"', '"+rbControlImpulso_NPS.isSelected()+"', '"+rbControlImpulso_NP.isSelected()+"', "
              + "'"+rbControlImpulso_NPI.isSelected()+"',\n" +
            " '"+rbControlImpulso_I.isSelected()+"','"+rbManejoEstres_S.isSelected()+"','"+rbManejoEstres_NPS.isSelected()+"',"
              + " '"+rbManejoEstres_NP.isSelected()+"', '"+rbManejoEstres_NPI.isSelected()+"', '"+rbManejoEstres_I.isSelected()+"',"
              + " '"+rbToleranciaFrus_S.isSelected()+"', '"+rbToleranciaFrus_NPS.isSelected()+"', '"+rbToleranciaFrus_NP.isSelected()+"', \n" +
            " '"+rbToleranciaFrus_NPI.isSelected()+"', '"+rbToleranciaFrus_I.isSelected()+"', '"+rbResponsabilidad_S.isSelected()+"', "
              + "'"+rbResponsabilidad_NPS.isSelected()+"', '"+rbResponsabilidad_NP.isSelected()+"','"+rbResponsabilidad_NPI.isSelected()+"',"
              + "'"+rbResponsabilidad_I.isSelected()+"', '"+rbSeguridad_S.isSelected()+"', '"+rbSeguridad_NPS.isSelected()+"', \n" +
            " '"+rbSeguridad_NP.isSelected()+"', '"+rbSeguridad_NPI.isSelected()+"','"+rbSeguridad_I.isSelected()+"', "
              + "'"+rbRelacionesInterp_S.isSelected()+"', '"+rbRelacionesInterp_NPS.isSelected()+"', '"+rbRelacionesInterp_NP.isSelected()+"',"
              + " '"+rbRelacionesInterp_NPI.isSelected()+"','"+rbRelacionesInterp_I.isSelected()+"', '"+rbCapacAdaptacion_S.isSelected()+"', \n" +
            " '"+rbCapacAdaptacion_NPS.isSelected()+"', '"+rbCapacAdaptacion_NP.isSelected()+"', '"+rbCapacAdaptacion_NPI.isSelected()+"',"
              + "'"+rbCapacAdaptacion_I.isSelected()+"','"+rbNivProactividad_S.isSelected()+"', '"+rbNivProactividad_NPS.isSelected()+"',"
              + "'"+rbNivProactividad_NP.isSelected()+"', '"+rbNivProactividad_NPI.isSelected()+"','"+rbNivProactividad_I.isSelected()+"',"
              + "'"+rbDiscrimRiesgo_S.isSelected()+"','"+rbDiscrimRiesgo_NPS.isSelected()+"','"+rbDiscrimRiesgo_NP.isSelected()+"',"
              + " '"+rbDiscrimRiesgo_NPI.isSelected()+"', '"+rbDiscrimRiesgo_I.isSelected()+"', '"+rbTolRutina_S.isSelected()+"',"
              + " '"+rbTolRutina_NPS.isSelected()+"', '"+rbTolRutina_NP.isSelected()+"', '"+rbTolRutina_NPI.isSelected()+"',"
              + " '"+rbTolRutina_I.isSelected()+"', '"+rbMotTrabajo_S.isSelected()+"','"+rbMotTrabajo_NPS.isSelected()+"',"
              + "'"+rbMotTrabajo_NP.isSelected()+"', '"+rbMotTrabajo_NPI.isSelected()+"', '"+rbMotTrabajo_I.isSelected()+"',"
              + " '"+rbRespRegConv_S.isSelected()+"','"+rbRespRegConv_NPS.isSelected()+"','"+rbRespRegConv_NP.isSelected()+"',"
              + "'"+rbRespRegConv_NPI.isSelected()+"', '"+rbRespRegConv_I.isSelected()+"', '"+rbSeguimInstr_S.isSelected()+"', \n" +
            " '"+rbSeguimInstr_NPS.isSelected()+"', '"+rbSeguimInstr_NP.isSelected()+"', '"+rbSeguimInstr_NPI.isSelected()+"',"
              + " '"+rbSeguimInstr_I.isSelected()+"','"+txtObservaciones.getText()+"', '"+txtApreciacionPers.getText()+"',"
              + "'"+txtRecomendaciones.getText()+"','"+rbSiEP.isSelected()+"', '"+rbNoEP.isSelected()+"',"
              + "'"+rbExcelente.isSelected()+"','"+rbAptoconObservacion.isSelected()+"');";
                     //oFunc.SubSistemaMensajeInformacion(Sql);
                      if (oConn.FnBoolQueryExecuteUpdate(Sql)){
                //oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                         
               
                sbCargarDatosInformePsicologico("");
                imprimirEP(); 
                limpiarEP();
                 txtNordenEP.setEnabled(true);
                txtNordenEP.requestFocus();
                }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");}
             }else{oFunc.SubSistemaMensajeError("Ingrese Información Faltante");}
      }
      }
    }//GEN-LAST:event_btnAgregarEPActionPerformed

    private void btnActualizarEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEPActionPerformed
        
            String sCodigo=txtNordenEP.getText();
            String strSqlStmt;
            strSqlStmt="UPDATE evaluacion_psicologica\n" +
"   SET n_orden='"+txtNordenEP.getText()+"', edad_ep='"+txtEdadEP.getText()+"', fecha_ep='"+FechaEntrevistaEP.getDate()+"',"
     + " rbi1='"+rbNivIntelectual_S.isSelected()+"', rbi2='"+rbNivIntelectual_NPS.isSelected()+"', rbi3='"+rbNivIntelectual_NP.isSelected()+"', \n" +
"       rbi4='"+rbNivIntelectual_NPI.isSelected()+"', rbi5='"+rbNivIntelectual_I.isSelected()+"', rbi6='"+rbAgilidadMental_S.isSelected()+"', "
     + "rbi7='"+rbAgilidadMental_NPS.isSelected()+"', rbi8='"+rbAgilidadMental_NP.isSelected()+"', rbi9='"+rbAgilidadMental_NPI.isSelected()+"',"
     + "rbi10='"+rbAgilidadMental_I.isSelected()+"', rbi11='"+rbRazPractico_S.isSelected()+"', \n" +
"       rbi12='"+rbRazPractico_NPS.isSelected()+"', rbi13='"+rbRazPractico_NP.isSelected()+"', "
     + "rbi14='"+rbRazPractico_NPI.isSelected()+"', rbi15='"+rbRazPractico_I.isSelected()+"',"
     + " rbi16='"+rbCriterioJuicio_S.isSelected()+"', rbi17='"+rbCriterioJuicio_NPS.isSelected()+"',"
     + " rbi18='"+rbCriterioJuicio_NP.isSelected()+"', rbi19='"+rbCriterioJuicio_NPI.isSelected()+"',"
     + " rbi20='"+rbCriterioJuicio_I.isSelected()+"', rbi21='"+rbMemoria_S.isSelected()+"',"
     + " rbi22='"+rbMemoria_NPS.isSelected()+"', rbi23='"+rbMemoria_NP.isSelected()+"', "
     + "rbi24='"+rbMemoria_NPI.isSelected()+"', rbi25='"+rbMemoria_I.isSelected()+"', \n" +
"       rbi26='"+rbAtencionConc_S.isSelected()+"', rbi27='"+rbAtencionConc_NPS.isSelected()+"',"
     + " rbi28='"+rbAtencionConc_NP.isSelected()+"', rbi29='"+rbAtencionConc_NPI.isSelected()+"',"
     + " rbi30='"+rbAtencionConc_I.isSelected()+"', rbi31='"+rbOrientEspacial_S.isSelected()+"', "
     + "rbi32='"+rbOrientEspacial_NPS.isSelected()+"',rbi33='"+rbOrientEspacial_NP.isSelected()+"',"
     + " rbi34='"+rbOrientEspacial_NPI.isSelected()+"', rbi35='"+rbOrientEspacial_I.isSelected()+"',"
     + " rbi36='"+rbCoordVisomotora_S.isSelected()+"', rbi37='"+rbCoordVisomotora_NPS.isSelected()+"',"
     + " rbi38='"+rbCoordVisomotora_NP.isSelected()+"', rbi39='"+rbCoordVisomotora_NPI.isSelected()+"', \n" +
"       rbi40='"+rbCoordVisomotora_I.isSelected()+"', rbp1='"+rbEstabEmocional_S.isSelected()+"', "
     + "rbp2='"+rbEstabEmocional_NPS.isSelected()+"', rbp3='"+rbEstabEmocional_NP.isSelected()+"', "
     + "rbp4='"+rbEstabEmocional_NPI.isSelected()+"', rbp5='"+rbEstabEmocional_I.isSelected()+"',"
     + "rbp6='"+rbMadurez_S.isSelected()+"', rbp7='"+rbMadurez_NPS.isSelected()+"', \n" +
"       rbp8='"+rbMadurez_NP.isSelected()+"', rbp9='"+rbMadurez_NPI.isSelected()+"', "
     + "rbp10='"+rbMadurez_I.isSelected()+"', rbp11='"+rbControlImpulso_S.isSelected()+"', "
     + "rbp12='"+rbControlImpulso_NPS.isSelected()+"', rbp13='"+rbControlImpulso_NP.isSelected()+"',"
     + " rbp14='"+rbControlImpulso_NPI.isSelected()+"',rbp15='"+rbControlImpulso_I.isSelected()+"',"
     + " rbp16='"+rbManejoEstres_S.isSelected()+"', rbp17='"+rbManejoEstres_NPS.isSelected()+"',"
     + " rbp18='"+rbManejoEstres_NP.isSelected()+"', rbp19='"+rbManejoEstres_NPI.isSelected()+"',"
     + " rbp20='"+rbManejoEstres_I.isSelected()+"', rbp21='"+rbToleranciaFrus_S.isSelected()+"', \n" +
"       rbp22='"+rbToleranciaFrus_NPS.isSelected()+"', rbp23='"+rbToleranciaFrus_NP.isSelected()+"',"
     + " rbp24='"+rbToleranciaFrus_NPI.isSelected()+"', rbp25='"+rbToleranciaFrus_I.isSelected()+"',"
     + " rbp26='"+rbResponsabilidad_S.isSelected()+"', rbp27='"+rbResponsabilidad_NPS.isSelected()+"',"
     + " rbp28='"+rbResponsabilidad_NP.isSelected()+"',rbp29='"+rbResponsabilidad_NPI.isSelected()+"',"
     + " rbp30='"+rbResponsabilidad_I.isSelected()+"', rbp31='"+rbSeguridad_S.isSelected()+"', "
     + "rbp32='"+rbSeguridad_NPS.isSelected()+"', rbp33='"+rbSeguridad_NP.isSelected()+"',"
     + " rbp34='"+rbSeguridad_NPI.isSelected()+"', rbp35='"+rbSeguridad_I.isSelected()+"', \n" +
"       rbp36='"+rbRelacionesInterp_S.isSelected()+"', rbp37='"+rbRelacionesInterp_NPS.isSelected()+"',"
     + " rbp38='"+rbRelacionesInterp_NP.isSelected()+"', rbp39='"+rbRelacionesInterp_NPI.isSelected()+"', "
     + "rbp40='"+rbRelacionesInterp_I.isSelected()+"', rbp41='"+rbCapacAdaptacion_S.isSelected()+"',"
     + " rbp42='"+rbCapacAdaptacion_NPS.isSelected()+"',rbp43='"+rbCapacAdaptacion_NP.isSelected()+"',"
     + " rbp44='"+rbCapacAdaptacion_NPI.isSelected()+"', rbp45='"+rbCapacAdaptacion_I.isSelected()+"',"
     + " rbs1='"+rbNivProactividad_S.isSelected()+"',rbs2='"+rbNivProactividad_NPS.isSelected()+"', "
     + "rbs3='"+rbNivProactividad_NP.isSelected()+"', rbs4='"+rbNivProactividad_NPI.isSelected()+"',"
     + " rbs5='"+rbNivProactividad_I.isSelected()+"', \n" +
"       rbs6='"+rbDiscrimRiesgo_S.isSelected()+"', rbs7='"+rbDiscrimRiesgo_NPS.isSelected()+"',"
     + " rbs8='"+rbDiscrimRiesgo_NP.isSelected()+"', rbs9='"+rbDiscrimRiesgo_NPI.isSelected()+"', "
     + "rbs10='"+rbDiscrimRiesgo_I.isSelected()+"', rbs11='"+rbTolRutina_S.isSelected()+"', "
     + "rbs12='"+rbTolRutina_NPS.isSelected()+"', rbs13='"+rbTolRutina_NP.isSelected()+"', \n" +
"       rbs14='"+rbTolRutina_NPI.isSelected()+"', rbs15='"+rbTolRutina_I.isSelected()+"',"
     + " rbm1='"+rbMotTrabajo_S.isSelected()+"', rbm2='"+rbMotTrabajo_NPS.isSelected()+"',"
     + " rbm3='"+rbMotTrabajo_NP.isSelected()+"', rbm4='"+rbMotTrabajo_NPI.isSelected()+"',"
     + " rbm5='"+rbMotTrabajo_I.isSelected()+"', rbm6='"+rbRespRegConv_S.isSelected()+"', \n" +
"       rbm7='"+rbRespRegConv_NPS.isSelected()+"', rbm8='"+rbRespRegConv_NP.isSelected()+"', "
     + "rbm9='"+rbRespRegConv_NPI.isSelected()+"', rbm10='"+rbRespRegConv_I.isSelected()+"', "
     + "rbm11='"+rbSeguimInstr_S.isSelected()+"', rbm12='"+rbSeguimInstr_NPS.isSelected()+"',"
     + " rbm13='"+rbSeguimInstr_NP.isSelected()+"', rbm14='"+rbSeguimInstr_NPI.isSelected()+"', \n" +
"       rbm15='"+rbSeguimInstr_I.isSelected()+"', txtobservaciones='"+txtObservaciones.getText()+"', "
     + "txtapreciacion='"+txtApreciacionPers.getText()+"', txtrecomendaciones='"+txtRecomendaciones.getText()+"', \n" +
"       rbapto='"+rbSiEP.isSelected()+"', rbnoapto='"+rbNoEP.isSelected()+"'," +
     "  rbexcelente='"+rbExcelente.isSelected()+"', rbapto_observacion='"+rbAptoconObservacion.isSelected()+"' " +
     " WHERE n_orden='" + sCodigo + "'";
            sbCargarDatosInformePsicologico("");
                
                 txtNordenEP.setEnabled(true);
                 txtNordenEP.requestFocus();
//            oFunc.SubSistemaMensajeInformacion(strSqlStmt);
                 
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimirEP();
                 limpiarEP();
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
        
    }//GEN-LAST:event_btnActualizarEPActionPerformed

    private void btnLimpiarEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEPActionPerformed
        limpiarEP();
    }//GEN-LAST:event_btnLimpiarEPActionPerformed

    private void txtImpEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpEPActionPerformed
        printerEP(Integer.parseInt(txtImpEP.getText()));
    }//GEN-LAST:event_txtImpEPActionPerformed

    private void txtImpEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpEPKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtImpEPKeyTyped

    private void btnIMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPActionPerformed
        printerEP(Integer.parseInt(txtImpEP.getText()));

    }//GEN-LAST:event_btnIMPActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEntrevista;
    private com.toedter.calendar.JDateChooser FechaEntrevistaEP;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private com.toedter.calendar.JDateChooser FechaNacimientoEP;
    private javax.swing.JTextArea atxtIntelectual;
    private javax.swing.JTextArea atxtOrganicidad;
    private javax.swing.JTextArea atxtPersonalidad;
    private javax.swing.JTextArea atxtPsicomotricidad;
    private javax.swing.JTextArea atxtRecomendaciones;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.ButtonGroup bgAAP_1;
    private javax.swing.ButtonGroup bgAAP_2;
    private javax.swing.ButtonGroup bgAAP_3;
    private javax.swing.ButtonGroup bgAAP_4;
    private javax.swing.ButtonGroup bgAAP_5;
    private javax.swing.ButtonGroup bgAAP_6;
    private javax.swing.ButtonGroup bgAAP_7;
    private javax.swing.ButtonGroup bgAAP_8;
    private javax.swing.ButtonGroup bgAAP_9;
    private javax.swing.ButtonGroup bgACI_1;
    private javax.swing.ButtonGroup bgACI_2;
    private javax.swing.ButtonGroup bgACI_3;
    private javax.swing.ButtonGroup bgACI_4;
    private javax.swing.ButtonGroup bgACI_5;
    private javax.swing.ButtonGroup bgACI_6;
    private javax.swing.ButtonGroup bgACI_7;
    private javax.swing.ButtonGroup bgACI_8;
    private javax.swing.ButtonGroup bgACM_1;
    private javax.swing.ButtonGroup bgACM_2;
    private javax.swing.ButtonGroup bgACM_3;
    private javax.swing.ButtonGroup bgAS_1;
    private javax.swing.ButtonGroup bgAS_2;
    private javax.swing.ButtonGroup bgAS_3;
    private javax.swing.ButtonGroup bgAprobo;
    private javax.swing.ButtonGroup bgCondicion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarEP;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarEP;
    private javax.swing.JLabel btnCriterios;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarEP;
    private javax.swing.JButton btnIMP;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarEP;
    private javax.swing.JCheckBox chkI1;
    private javax.swing.JCheckBox chkI10;
    private javax.swing.JCheckBox chkI11;
    private javax.swing.JCheckBox chkI12;
    private javax.swing.JCheckBox chkI13;
    private javax.swing.JCheckBox chkI14;
    private javax.swing.JCheckBox chkI15;
    private javax.swing.JCheckBox chkI16;
    private javax.swing.JCheckBox chkI17;
    private javax.swing.JCheckBox chkI2;
    private javax.swing.JCheckBox chkI3;
    private javax.swing.JCheckBox chkI4;
    private javax.swing.JCheckBox chkI5;
    private javax.swing.JCheckBox chkI6;
    private javax.swing.JCheckBox chkI7;
    private javax.swing.JCheckBox chkI8;
    private javax.swing.JCheckBox chkI9;
    private javax.swing.JCheckBox chkO1;
    private javax.swing.JCheckBox chkO2;
    private javax.swing.JCheckBox chkO3;
    private javax.swing.JCheckBox chkO4;
    private javax.swing.JCheckBox chkO5;
    private javax.swing.JCheckBox chkP1;
    private javax.swing.JCheckBox chkP2;
    private javax.swing.JCheckBox chkP3;
    private javax.swing.JCheckBox chkP4;
    private javax.swing.JCheckBox chkP5;
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
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton rbAgilidadMental_I;
    private javax.swing.JRadioButton rbAgilidadMental_NP;
    private javax.swing.JRadioButton rbAgilidadMental_NPI;
    private javax.swing.JRadioButton rbAgilidadMental_NPS;
    private javax.swing.JRadioButton rbAgilidadMental_S;
    private javax.swing.JRadioButton rbAptoconObservacion;
    private javax.swing.JRadioButton rbAtencionConc_I;
    private javax.swing.JRadioButton rbAtencionConc_NP;
    private javax.swing.JRadioButton rbAtencionConc_NPI;
    private javax.swing.JRadioButton rbAtencionConc_NPS;
    private javax.swing.JRadioButton rbAtencionConc_S;
    private javax.swing.JRadioButton rbCapacAdaptacion_I;
    private javax.swing.JRadioButton rbCapacAdaptacion_NP;
    private javax.swing.JRadioButton rbCapacAdaptacion_NPI;
    private javax.swing.JRadioButton rbCapacAdaptacion_NPS;
    private javax.swing.JRadioButton rbCapacAdaptacion_S;
    private javax.swing.JRadioButton rbControlImpulso_I;
    private javax.swing.JRadioButton rbControlImpulso_NP;
    private javax.swing.JRadioButton rbControlImpulso_NPI;
    private javax.swing.JRadioButton rbControlImpulso_NPS;
    private javax.swing.JRadioButton rbControlImpulso_S;
    private javax.swing.JRadioButton rbCoordVisomotora_I;
    private javax.swing.JRadioButton rbCoordVisomotora_NP;
    private javax.swing.JRadioButton rbCoordVisomotora_NPI;
    private javax.swing.JRadioButton rbCoordVisomotora_NPS;
    private javax.swing.JRadioButton rbCoordVisomotora_S;
    private javax.swing.JRadioButton rbCriterioJuicio_I;
    private javax.swing.JRadioButton rbCriterioJuicio_NP;
    private javax.swing.JRadioButton rbCriterioJuicio_NPI;
    private javax.swing.JRadioButton rbCriterioJuicio_NPS;
    private javax.swing.JRadioButton rbCriterioJuicio_S;
    private javax.swing.JRadioButton rbDiscrimRiesgo_I;
    private javax.swing.JRadioButton rbDiscrimRiesgo_NP;
    private javax.swing.JRadioButton rbDiscrimRiesgo_NPI;
    private javax.swing.JRadioButton rbDiscrimRiesgo_NPS;
    private javax.swing.JRadioButton rbDiscrimRiesgo_S;
    private javax.swing.JRadioButton rbEstabEmocional_I;
    private javax.swing.JRadioButton rbEstabEmocional_NP;
    private javax.swing.JRadioButton rbEstabEmocional_NPI;
    private javax.swing.JRadioButton rbEstabEmocional_NPS;
    private javax.swing.JRadioButton rbEstabEmocional_S;
    private javax.swing.JRadioButton rbExcelente;
    private javax.swing.JRadioButton rbMadurez_I;
    private javax.swing.JRadioButton rbMadurez_NP;
    private javax.swing.JRadioButton rbMadurez_NPI;
    private javax.swing.JRadioButton rbMadurez_NPS;
    private javax.swing.JRadioButton rbMadurez_S;
    private javax.swing.JRadioButton rbManejoEstres_I;
    private javax.swing.JRadioButton rbManejoEstres_NP;
    private javax.swing.JRadioButton rbManejoEstres_NPI;
    private javax.swing.JRadioButton rbManejoEstres_NPS;
    private javax.swing.JRadioButton rbManejoEstres_S;
    private javax.swing.JRadioButton rbMemoria_I;
    private javax.swing.JRadioButton rbMemoria_NP;
    private javax.swing.JRadioButton rbMemoria_NPI;
    private javax.swing.JRadioButton rbMemoria_NPS;
    private javax.swing.JRadioButton rbMemoria_S;
    private javax.swing.JRadioButton rbMotTrabajo_I;
    private javax.swing.JRadioButton rbMotTrabajo_NP;
    private javax.swing.JRadioButton rbMotTrabajo_NPI;
    private javax.swing.JRadioButton rbMotTrabajo_NPS;
    private javax.swing.JRadioButton rbMotTrabajo_S;
    private javax.swing.JRadioButton rbNivIntelectual_I;
    private javax.swing.JRadioButton rbNivIntelectual_NP;
    private javax.swing.JRadioButton rbNivIntelectual_NPI;
    private javax.swing.JRadioButton rbNivIntelectual_NPS;
    private javax.swing.JRadioButton rbNivIntelectual_S;
    private javax.swing.JRadioButton rbNivProactividad_I;
    private javax.swing.JRadioButton rbNivProactividad_NP;
    private javax.swing.JRadioButton rbNivProactividad_NPI;
    private javax.swing.JRadioButton rbNivProactividad_NPS;
    private javax.swing.JRadioButton rbNivProactividad_S;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbNoEP;
    private javax.swing.JRadioButton rbOrientEspacial_I;
    private javax.swing.JRadioButton rbOrientEspacial_NP;
    private javax.swing.JRadioButton rbOrientEspacial_NPI;
    private javax.swing.JRadioButton rbOrientEspacial_NPS;
    private javax.swing.JRadioButton rbOrientEspacial_S;
    private javax.swing.JRadioButton rbRazPractico_I;
    private javax.swing.JRadioButton rbRazPractico_NP;
    private javax.swing.JRadioButton rbRazPractico_NPI;
    private javax.swing.JRadioButton rbRazPractico_NPS;
    private javax.swing.JRadioButton rbRazPractico_S;
    private javax.swing.JRadioButton rbRelacionesInterp_I;
    private javax.swing.JRadioButton rbRelacionesInterp_NP;
    private javax.swing.JRadioButton rbRelacionesInterp_NPI;
    private javax.swing.JRadioButton rbRelacionesInterp_NPS;
    private javax.swing.JRadioButton rbRelacionesInterp_S;
    private javax.swing.JRadioButton rbRespRegConv_I;
    private javax.swing.JRadioButton rbRespRegConv_NP;
    private javax.swing.JRadioButton rbRespRegConv_NPI;
    private javax.swing.JRadioButton rbRespRegConv_NPS;
    private javax.swing.JRadioButton rbRespRegConv_S;
    private javax.swing.JRadioButton rbResponsabilidad_I;
    private javax.swing.JRadioButton rbResponsabilidad_NP;
    private javax.swing.JRadioButton rbResponsabilidad_NPI;
    private javax.swing.JRadioButton rbResponsabilidad_NPS;
    private javax.swing.JRadioButton rbResponsabilidad_S;
    private javax.swing.JRadioButton rbSeguimInstr_I;
    private javax.swing.JRadioButton rbSeguimInstr_NP;
    private javax.swing.JRadioButton rbSeguimInstr_NPI;
    private javax.swing.JRadioButton rbSeguimInstr_NPS;
    private javax.swing.JRadioButton rbSeguimInstr_S;
    private javax.swing.JRadioButton rbSeguridad_I;
    private javax.swing.JRadioButton rbSeguridad_NP;
    private javax.swing.JRadioButton rbSeguridad_NPI;
    private javax.swing.JRadioButton rbSeguridad_NPS;
    private javax.swing.JRadioButton rbSeguridad_S;
    private javax.swing.JRadioButton rbSi;
    private javax.swing.JRadioButton rbSiEP;
    private javax.swing.JRadioButton rbTolRutina_I;
    private javax.swing.JRadioButton rbTolRutina_NP;
    private javax.swing.JRadioButton rbTolRutina_NPI;
    private javax.swing.JRadioButton rbTolRutina_NPS;
    private javax.swing.JRadioButton rbTolRutina_S;
    private javax.swing.JRadioButton rbToleranciaFrus_I;
    private javax.swing.JRadioButton rbToleranciaFrus_NP;
    private javax.swing.JRadioButton rbToleranciaFrus_NPI;
    private javax.swing.JRadioButton rbToleranciaFrus_NPS;
    private javax.swing.JRadioButton rbToleranciaFrus_S;
    private javax.swing.JTable tbInformePsicologico;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosEP;
    private javax.swing.JTextArea txtApreciacionPers;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtCargoDesempenar;
    private javax.swing.JTextField txtCargoDesempenarEP;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtDomicilioEP;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdadEP;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtEstadoCivilEP;
    private javax.swing.JTextField txtImpEP;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtLugarNacimientoEP;
    private javax.swing.JTextField txtNivelEstudios;
    private javax.swing.JTextField txtNivelEstudiosEP;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombresEP;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtNordenEP;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtOcupación;
    private javax.swing.JTextField txtOcupaciónEP;
    private javax.swing.JTextArea txtRecomendaciones;
    // End of variables declaration//GEN-END:variables
public void limpiar(){
txtNorden.setText(null);
txtNombres.setText(null);
txtApellidos.setText(null);
FechaNacimiento.setDate(null);
txtLugarNacimiento.setText(null);
txtEdad.setText(null);
txtDomicilio.setText(null);
txtOcupación.setText(null);
txtCargoDesempenar.setText(null);
txtNivelEstudios.setText(null);
txtEstadoCivil.setText(null);
atxtIntelectual.setText(null);
atxtOrganicidad.setText(null);
atxtPersonalidad.setText(null);
atxtPsicomotricidad.setText(null);
atxtRecomendaciones.setText(null);
FechaEntrevista.setDate(null);
chkI1.setSelected(false);
chkI2.setSelected(false);
chkI3.setSelected(false);
chkI4.setSelected(false);
chkI5.setSelected(false);
chkI6.setSelected(false);
chkI7.setSelected(false);
bg1.clearSelection();
chkI10.setSelected(false);
chkI11.setSelected(false);
chkI12.setSelected(false);
chkI13.setSelected(false);
chkI14.setSelected(false);
chkI15.setSelected(false);
chkI16.setSelected(false);
chkI17.setSelected(false);
chkO1.setSelected(false);
chkO2.setSelected(false);
chkO3.setSelected(false);
chkO4.setSelected(false);
chkO5.setSelected(false);
chkP1.setSelected(false);
chkP2.setSelected(false);
chkP3.setSelected(false);
chkP4.setSelected(false);
chkP5.setSelected(false);
txtNorden.setEnabled(true);
txtNorden.requestFocus();
}
public void limpiarEP(){
txtNordenEP.setText(null);
txtNombresEP.setText(null);
txtApellidosEP.setText(null);
FechaNacimientoEP.setDate(null);
txtLugarNacimientoEP.setText(null);
txtEdadEP.setText(null);
txtDomicilioEP.setText(null);
txtOcupaciónEP.setText(null);
txtCargoDesempenarEP.setText(null);
txtNivelEstudiosEP.setText(null);
txtEstadoCivilEP.setText(null);
txtObservaciones.setText(null);
txtApreciacionPers.setText(null);
txtRecomendaciones.setText(null);
FechaEntrevistaEP.setDate(null);
bgAAP_1.clearSelection();
bgAAP_2.clearSelection();
bgAAP_3.clearSelection();
bgAAP_4.clearSelection();
bgAAP_5.clearSelection();
bgAAP_6.clearSelection();
bgAAP_7.clearSelection();
bgAAP_8.clearSelection();
bgAAP_9.clearSelection();

bgACI_1.clearSelection();
bgACI_2.clearSelection();
bgACI_3.clearSelection();
bgACI_4.clearSelection();
bgACI_5.clearSelection();
bgACI_6.clearSelection();
bgACI_7.clearSelection();
bgACI_8.clearSelection();

bgAS_1.clearSelection();
bgAS_2.clearSelection();
bgAS_3.clearSelection();

bgACM_1.clearSelection();
bgACM_2.clearSelection();
bgACM_3.clearSelection();

bgCondicion.clearSelection();
txtNorden.setEnabled(true);
txtNorden.requestFocus();
}
public int calcularEdad(Calendar fechaNac){
    
    Calendar today = Calendar.getInstance();
    int diay = today.get(Calendar.YEAR);
    int fechay = fechaNac.get(Calendar.YEAR);
    int diff_year = diay - fechay;
    int diam = today.get(Calendar.MONTH);
    int fecham = fechaNac.get(Calendar.MONTH);
    int diff_month = diam - fecham;
    int dia = today.get(Calendar.DAY_OF_MONTH);
    int fecha = fechaNac.get(Calendar.DAY_OF_MONTH);
    int diff_day = dia - fecha;
    //Si está en ese año pero todavía no los ha cumplido
    if(diff_month<0 || (diff_month==0 && diff_day<0)){
        int factor=1;
        diff_year = diff_year - factor;
    }
    return diff_year;
}
private boolean validar(){
boolean bResultado=true;
if (((JTextField)FechaEntrevista.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Entrevista");bResultado = false;}
    if(txtNorden.getText().isEmpty()){bResultado = false;}
    if(txtEdad.getText().isEmpty()){bResultado = false;}
    if(atxtIntelectual.getText().isEmpty()){bResultado = false;}
    if(atxtOrganicidad.getText().isEmpty()){bResultado = false;}
    if(atxtPersonalidad.getText().isEmpty()){bResultado = false;}
    if(atxtPsicomotricidad.getText().isEmpty()){bResultado = false;}
    if(atxtRecomendaciones.getText().isEmpty()){bResultado = false;}
    if(!bgAprobo.getSelection().isSelected()){
        oFunc.SubSistemaMensajeError("Seleccione si aprobo o no aprobo");
        
        bResultado = false;}
 
   return bResultado;
}
private boolean validarEP(){
boolean bResultado=true;
if (((JTextField)FechaEntrevistaEP.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Entrevista");bResultado = false;}
    if(txtNordenEP.getText().isEmpty()){bResultado = false;}
    if(txtEdadEP.getText().isEmpty()){bResultado = false;}
    if(txtObservaciones.getText().isEmpty()){bResultado = false;}
    if(txtApreciacionPers.getText().isEmpty()){bResultado = false;}
    if(txtRecomendaciones.getText().isEmpty()){bResultado = false;}
    
    if(!bgCondicion.getSelection().isSelected()){
        oFunc.SubSistemaMensajeError("Seleccione si aprobo o no aprobo");
        
        bResultado = false;}
 
   return bResultado;
}
public boolean OrdenExiste()
    {
        boolean bResultado=false;
        String sQuery;
        sQuery  = "Select n_orden from informe_psicologico Where n_orden="+txtNorden.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             limpiar();
            }
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         }
        return bResultado;        
    }
public boolean OrdenExisteEP()
    {
        boolean bResultado=false;
        String sQuery;
        sQuery  = "Select n_orden from evaluacion_psicologica Where n_orden="+txtNordenEP.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             limpiar();
            }
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         }
        return bResultado;        
    }
void sbCargarDatosInformePsicologico(String valor){
    String [] titulos={"Cod","N.Orden","Nombre","Fecha"};
    String [] registros = new String[4];
      String sql="";
      if(!txtBuscarCod.getText().isEmpty()){
          sql ="select datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
              + "informe_psicologico.cod_inf, informe_psicologico.n_orden, informe_psicologico.fecha_entrevista "
              + "From datos_paciente inner join n_orden_ocupacional ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
              + "inner join informe_psicologico on (n_orden_ocupacional.n_orden = informe_psicologico.n_orden) "
              + "where informe_psicologico.n_orden='"+txtBuscarCod.getText().toString()+"'"
              + " ORDER BY informe_psicologico.n_orden desc";   
      }else{
          sql ="select datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
              + "informe_psicologico.cod_inf, informe_psicologico.n_orden, informe_psicologico.fecha_entrevista "
              + "From datos_paciente inner join n_orden_ocupacional ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
              + "inner join informe_psicologico on (n_orden_ocupacional.n_orden = informe_psicologico.n_orden) "
              + "where CONCAT(nombres_pa,' ',apellidos_pa)  LIKE '%"+valor+"%'"
              + " ORDER BY informe_psicologico.n_orden desc";   
      }
         
       model = new DefaultTableModel(null,titulos);
      
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                                     
                    registros[0]= oConn.setResult.getString("cod_inf");
                    registros[1]= oConn.setResult.getString("n_orden");
                    registros[2]= oConn.setResult.getString("nombres");
                    registros[3]= formato.format(oConn.setResult.getDate("fecha_entrevista"));
                     model.addRow(registros);
                }
                 
                  // Coloca el Modelo de Nueva Cuenta
                  tbInformePsicologico.setModel(model);
            sbTablaInformePsicologico();
             
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
private void sbTablaInformePsicologico()
    {
   
        tbInformePsicologico.getColumnModel().getColumn(0).setMinWidth(45);
tbInformePsicologico.getColumnModel().getColumn(0).setMaxWidth(45);
tbInformePsicologico.getColumnModel().getColumn(1).setMinWidth(65);
tbInformePsicologico.getColumnModel().getColumn(1).setMaxWidth(65);
tbInformePsicologico.getColumnModel().getColumn(2).setMinWidth(245);
tbInformePsicologico.getColumnModel().getColumn(2).setMaxWidth(245);
tbInformePsicologico.getColumnModel().getColumn(3).setMinWidth(130);
tbInformePsicologico.getColumnModel().getColumn(3).setMaxWidth(130);
        tbInformePsicologico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
      
        
        tbInformePsicologico.setFont(new java.awt.Font("Tahoma", 0, 11)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbInformePsicologico.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbInformePsicologico.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
        tbInformePsicologico.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        tbInformePsicologico.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11)); 
   
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }
 private void print(Integer cod){
  //Integer n;
               //n = Integer.parseInt(txtNorden.getText());
                //Pasamos parametros al reporte Jasper. 
                Map parameters = new HashMap(); 

                // Coloco los valores en los parámetros
                parameters.put("Norden",cod);             
                

                try 
                {
                    String master = System.getProperty("user.dir") +
                                "/reportes/InformePsicologico.jasper";
            
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del reporte InformePsicologico.");
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
                 


                    // Genera el reporte usando el objeto JasperReport e indicando la conexion
                    JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
                    //JasperPrint myPrint = JasperFillManager.fillReport(myReport, null,new JREmptyDataSource());

                    // Visualiza el Reporte
                  
                    JasperViewer.viewReport(myPrint,false);
                    

                } catch (JRException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }
 private void imprimir(Integer num){
     
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir Ficha ?", //Mensaje
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
      printer(num);
      
   }
   else
   {
      // PRESIONO NO
     }
    }

}
private void imprimirEP(){
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir Ficha ?", //Mensaje
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
      printerEP(Integer.valueOf(txtNordenEP.getText()));
   }
   else
   {
      // PRESIONO NO
     }
    }

}
private void printer(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/InformePsicologico.jasper";

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del ficha psicologica.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);

                    JasperViewer.viewReport(myPrint,true);
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 
 private void printerEP(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                 try 
                {
                    String master = System.getProperty("user.dir") +
                                "/reportes/EvaluacionPsicologica.jasper";
            
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del reporte EvaluacionPsicologica.");
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
            JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);

                    JasperViewer.viewReport(myPrint,true);
                    
            JasperPrintManager.printReport(myPrint,true);

                   } catch (JRException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }


}
