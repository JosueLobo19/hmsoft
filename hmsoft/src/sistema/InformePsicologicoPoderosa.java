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
public final class InformePsicologicoPoderosa extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;
 
   public InformePsicologicoPoderosa() {
      initComponents();
   //new ajTextArea.autocompleterText(atxtIntelectual, "razon_empresa", "empresas");
     
 
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAprobo = new javax.swing.ButtonGroup();
        bg1 = new javax.swing.ButtonGroup();
        bgINT_1 = new javax.swing.ButtonGroup();
        bgINT_2 = new javax.swing.ButtonGroup();
        bgINT_3 = new javax.swing.ButtonGroup();
        bgINT_4 = new javax.swing.ButtonGroup();
        bgINT_5 = new javax.swing.ButtonGroup();
        bgINT_6 = new javax.swing.ButtonGroup();
        bgINT_7 = new javax.swing.ButtonGroup();
        bgINT_8 = new javax.swing.ButtonGroup();
        bgPERS_1 = new javax.swing.ButtonGroup();
        bgPERS_2 = new javax.swing.ButtonGroup();
        bgPERS_3 = new javax.swing.ButtonGroup();
        bgPERS_4 = new javax.swing.ButtonGroup();
        bgPERS_5 = new javax.swing.ButtonGroup();
        bgINT_9 = new javax.swing.ButtonGroup();
        bgCondicion = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        txtNordenEP = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        txtNombresEP = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtApellidosEP = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtEdadEP = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtDomicilioEP = new javax.swing.JTextField();
        FechaEntrevistaEP = new com.toedter.calendar.JDateChooser();
        jLabel73 = new javax.swing.JLabel();
        FechaNacimientoEP = new com.toedter.calendar.JDateChooser();
        txtLugarNacimientoEP = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtEstadoCivilEP = new javax.swing.JTextField();
        txtNivelEstudiosEP = new javax.swing.JTextField();
        btnEditarEP1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        txtCargoDesempenarEP = new javax.swing.JTextField();
        txtOcupaciónEP = new javax.swing.JTextField();
        chkLicencia = new javax.swing.JCheckBox();
        chkTrabCalientes = new javax.swing.JCheckBox();
        jPanel16 = new javax.swing.JPanel();
        rbSiEP = new javax.swing.JRadioButton();
        rbNoEP = new javax.swing.JRadioButton();
        rbAptoconObservacion = new javax.swing.JRadioButton();
        rbExcelente = new javax.swing.JRadioButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtRecomendaciones = new javax.swing.JTextArea();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtAmenDebilidades = new javax.swing.JTextArea();
        btnActualizarEP = new javax.swing.JButton();
        btnLimpiarEP = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        rbCoefIntelectual_S = new javax.swing.JRadioButton();
        rbCoefIntelectual_NPS = new javax.swing.JRadioButton();
        rbCoefIntelectual_NP = new javax.swing.JRadioButton();
        rbCoefIntelectual_NPI = new javax.swing.JRadioButton();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        rbComp_S = new javax.swing.JRadioButton();
        rbComp_NPS = new javax.swing.JRadioButton();
        rbComp_NP = new javax.swing.JRadioButton();
        rbCoefIntelectual_I = new javax.swing.JRadioButton();
        rbComp_I = new javax.swing.JRadioButton();
        rbComp_NPI = new javax.swing.JRadioButton();
        jLabel83 = new javax.swing.JLabel();
        rbNivAtenc_S = new javax.swing.JRadioButton();
        rbNivAtenc_NPS = new javax.swing.JRadioButton();
        rbNivAtenc_NP = new javax.swing.JRadioButton();
        rbNivAtenc_NPI = new javax.swing.JRadioButton();
        rbNivAtenc_I = new javax.swing.JRadioButton();
        jLabel84 = new javax.swing.JLabel();
        rbMemo_S = new javax.swing.JRadioButton();
        rbMemo_NPS = new javax.swing.JRadioButton();
        rbMemo_NP = new javax.swing.JRadioButton();
        rbMemo_NPI = new javax.swing.JRadioButton();
        rbMemo_I = new javax.swing.JRadioButton();
        jLabel85 = new javax.swing.JLabel();
        rbCoorVisio_S = new javax.swing.JRadioButton();
        rbCoorVisio_NPS = new javax.swing.JRadioButton();
        rbCoorVisio_NP = new javax.swing.JRadioButton();
        rbCoorVisio_NPI = new javax.swing.JRadioButton();
        rbCoorVisio_I = new javax.swing.JRadioButton();
        jLabel86 = new javax.swing.JLabel();
        rbOrient_S = new javax.swing.JRadioButton();
        rbOrient_NPS = new javax.swing.JRadioButton();
        rbOrient_NP = new javax.swing.JRadioButton();
        rbOrient_NPI = new javax.swing.JRadioButton();
        rbOrient_I = new javax.swing.JRadioButton();
        jLabel87 = new javax.swing.JLabel();
        rbCapDiscr_S = new javax.swing.JRadioButton();
        rbCapDiscr_NPS = new javax.swing.JRadioButton();
        rbCapDiscr_NP = new javax.swing.JRadioButton();
        rbCapDiscr_NPI = new javax.swing.JRadioButton();
        rbCapDiscr_I = new javax.swing.JRadioButton();
        jLabel88 = new javax.swing.JLabel();
        rbCapApredizaje_S = new javax.swing.JRadioButton();
        rbCapApredizaje_NPS = new javax.swing.JRadioButton();
        rbCapApredizaje_NP = new javax.swing.JRadioButton();
        rbCapApredizaje_NPI = new javax.swing.JRadioButton();
        rbCapApredizaje_I = new javax.swing.JRadioButton();
        jLabel98 = new javax.swing.JLabel();
        rbCapAnalisis_S = new javax.swing.JRadioButton();
        rbCapAnalisis_NPS = new javax.swing.JRadioButton();
        rbCapAnalisis_NP = new javax.swing.JRadioButton();
        rbCapAnalisis_NPI = new javax.swing.JRadioButton();
        rbCapAnalisis_I = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        rbEstabEmocional_S = new javax.swing.JRadioButton();
        rbEstabEmocional_NPS = new javax.swing.JRadioButton();
        rbEstabEmocional_NP = new javax.swing.JRadioButton();
        rbEstabEmocional_NPI = new javax.swing.JRadioButton();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        rbAfrontEst_S = new javax.swing.JRadioButton();
        rbAfrontEst_NPS = new javax.swing.JRadioButton();
        rbAfrontEst_NP = new javax.swing.JRadioButton();
        rbEstabEmocional_I = new javax.swing.JRadioButton();
        rbAfrontEst_I = new javax.swing.JRadioButton();
        rbAfrontEst_NPI = new javax.swing.JRadioButton();
        jLabel91 = new javax.swing.JLabel();
        rbAfrontRies_S = new javax.swing.JRadioButton();
        rbAfrontRies_NPS = new javax.swing.JRadioButton();
        rbAfrontRies_NP = new javax.swing.JRadioButton();
        rbAfrontRies_NPI = new javax.swing.JRadioButton();
        rbAfrontRies_I = new javax.swing.JRadioButton();
        jLabel92 = new javax.swing.JLabel();
        rbRelaciInter_S = new javax.swing.JRadioButton();
        rbRelaciInter_NPS = new javax.swing.JRadioButton();
        rbRelaciInter_NP = new javax.swing.JRadioButton();
        rbRelaciInter_NPI = new javax.swing.JRadioButton();
        rbRelaciInter_I = new javax.swing.JRadioButton();
        jLabel93 = new javax.swing.JLabel();
        rbDisposicNorm_S = new javax.swing.JRadioButton();
        rbDisposicNorm_NPS = new javax.swing.JRadioButton();
        rbDisposicNorm_NP = new javax.swing.JRadioButton();
        rbDisposicNorm_NPI = new javax.swing.JRadioButton();
        rbDisposicNorm_I = new javax.swing.JRadioButton();
        jPanel26 = new javax.swing.JPanel();
        txtImpEP = new javax.swing.JTextField();
        btnIMP = new javax.swing.JButton();
        btnAgregarEP = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtFortOportunidades = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Informe Psicológico");

        jPanel13.setForeground(new java.awt.Color(102, 102, 0));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Necesarios"));

        jLabel62.setText("Nro Orden:");

        txtNordenEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenEPActionPerformed(evt);
            }
        });

        jLabel66.setText("Nombres:");

        txtNombresEP.setEditable(false);

        jLabel67.setText("Apellidos:");

        txtApellidosEP.setEditable(false);

        jLabel68.setText("Fecha Nacimiento:");

        jLabel69.setText("Lugar Nacimiento:");

        jLabel70.setText("Edad:");

        txtEdadEP.setEditable(false);

        jLabel71.setText("Estado Civil:");

        jLabel72.setText("Domicilio Actual:");

        txtDomicilioEP.setEditable(false);

        FechaEntrevistaEP.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaEntrevistaEPPropertyChange(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel73.setText("Fecha Entrevista :");

        FechaNacimientoEP.setEnabled(false);

        txtLugarNacimientoEP.setEditable(false);

        jLabel74.setText("Nivel Estudios:");

        jLabel75.setText("años");

        txtEstadoCivilEP.setEditable(false);

        txtNivelEstudiosEP.setEditable(false);

        btnEditarEP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarEP1.setText("Editar");
        btnEditarEP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEP1ActionPerformed(evt);
            }
        });

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Laborales"));

        jLabel76.setText("Ocupación:");

        jLabel77.setText("Cargo Desempeñar :");

        txtCargoDesempenarEP.setEditable(false);

        txtOcupaciónEP.setEditable(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOcupaciónEP, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargoDesempenarEP, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel77)
                        .addComponent(txtCargoDesempenarEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel76)
                        .addComponent(txtOcupaciónEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        chkLicencia.setText("LICENCIA");
        chkLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLicenciaActionPerformed(evt);
            }
        });

        chkTrabCalientes.setText("T.CALIENTES");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombresEP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellidosEP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FechaNacimientoEP, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(txtLugarNacimientoEP)))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jLabel72)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDomicilioEP)))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(txtEdadEP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel75))
                                    .addComponent(txtEstadoCivilEP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNivelEstudiosEP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNordenEP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarEP1)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaEntrevistaEP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkLicencia)
                                    .addComponent(chkTrabCalientes)))))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel62)
                                .addComponent(txtNordenEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel73)
                                .addComponent(btnEditarEP1))
                            .addComponent(FechaEntrevistaEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(chkLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(chkTrabCalientes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel66)
                                .addComponent(txtNombresEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel68))
                            .addComponent(FechaNacimientoEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(txtApellidosEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69)
                            .addComponent(txtLugarNacimientoEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(txtDomicilioEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(txtEdadEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(txtEstadoCivilEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(txtNivelEstudiosEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aprobo Test"));

        bgCondicion.add(rbSiEP);
        rbSiEP.setText("Si");

        bgCondicion.add(rbNoEP);
        rbNoEP.setText("No");

        bgCondicion.add(rbAptoconObservacion);
        rbAptoconObservacion.setText("AP.O");

        bgCondicion.add(rbExcelente);
        rbExcelente.setSelected(true);
        rbExcelente.setText("Ex");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(rbSiEP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNoEP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbExcelente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAptoconObservacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbExcelente)
                        .addComponent(rbAptoconObservacion))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
        jScrollPane12.setViewportView(txtRecomendaciones);

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel78.setText("Recomendaciones :");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel79.setText("Observaciones :");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel80.setText("Fortalezas / Oportunidades: ");

        txtObservaciones.setColumns(20);
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
        jScrollPane13.setViewportView(txtObservaciones);

        txtAmenDebilidades.setColumns(20);
        txtAmenDebilidades.setForeground(new java.awt.Color(0, 102, 51));
        txtAmenDebilidades.setRows(5);
        txtAmenDebilidades.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAmenDebilidadesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAmenDebilidadesFocusLost(evt);
            }
        });
        txtAmenDebilidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmenDebilidadesKeyReleased(evt);
            }
        });
        jScrollPane14.setViewportView(txtAmenDebilidades);

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

        jPanel22.setBackground(new java.awt.Color(153, 204, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "INTELIGENCIA ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        rbCoefIntelectual_S.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_1.add(rbCoefIntelectual_S);
        rbCoefIntelectual_S.setText("S");

        rbCoefIntelectual_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_1.add(rbCoefIntelectual_NPS);
        rbCoefIntelectual_NPS.setText("NPS");
        rbCoefIntelectual_NPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCoefIntelectual_NPSActionPerformed(evt);
            }
        });

        rbCoefIntelectual_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_1.add(rbCoefIntelectual_NP);
        rbCoefIntelectual_NP.setText("NP");

        rbCoefIntelectual_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_1.add(rbCoefIntelectual_NPI);
        rbCoefIntelectual_NPI.setText("NPI");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText("1. Coeficiente intelectual:");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel82.setText("2. Comprensión :");

        rbComp_S.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_2.add(rbComp_S);
        rbComp_S.setText("S");

        rbComp_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_2.add(rbComp_NPS);
        rbComp_NPS.setText("NPS");

        rbComp_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_2.add(rbComp_NP);
        rbComp_NP.setText("NP");

        rbCoefIntelectual_I.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_1.add(rbCoefIntelectual_I);
        rbCoefIntelectual_I.setText("I");

        rbComp_I.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_2.add(rbComp_I);
        rbComp_I.setText("I");

        rbComp_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_2.add(rbComp_NPI);
        rbComp_NPI.setText("NPI");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel83.setText("3. Nivel de atención / Concentración :");

        rbNivAtenc_S.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_3.add(rbNivAtenc_S);
        rbNivAtenc_S.setText("S");

        rbNivAtenc_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_3.add(rbNivAtenc_NPS);
        rbNivAtenc_NPS.setText("NPS");

        rbNivAtenc_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_3.add(rbNivAtenc_NP);
        rbNivAtenc_NP.setText("NP");

        rbNivAtenc_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_3.add(rbNivAtenc_NPI);
        rbNivAtenc_NPI.setText("NPI");

        rbNivAtenc_I.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_3.add(rbNivAtenc_I);
        rbNivAtenc_I.setText("I");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel84.setText("4. Memoria a corto, mediano y largo plazo :");

        rbMemo_S.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_4.add(rbMemo_S);
        rbMemo_S.setText("S");

        rbMemo_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_4.add(rbMemo_NPS);
        rbMemo_NPS.setText("NPS");

        rbMemo_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_4.add(rbMemo_NP);
        rbMemo_NP.setText("NP");

        rbMemo_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_4.add(rbMemo_NPI);
        rbMemo_NPI.setText("NPI");

        rbMemo_I.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_4.add(rbMemo_I);
        rbMemo_I.setText("I");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel85.setText("5. Coordinación viso-motora");

        rbCoorVisio_S.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_5.add(rbCoorVisio_S);
        rbCoorVisio_S.setText("S");

        rbCoorVisio_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_5.add(rbCoorVisio_NPS);
        rbCoorVisio_NPS.setText("NPS");

        rbCoorVisio_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_5.add(rbCoorVisio_NP);
        rbCoorVisio_NP.setText("NP");

        rbCoorVisio_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_5.add(rbCoorVisio_NPI);
        rbCoorVisio_NPI.setText("NPI");

        rbCoorVisio_I.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_5.add(rbCoorVisio_I);
        rbCoorVisio_I.setText("I");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel86.setText("6. Orientación espacial :");

        rbOrient_S.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_6.add(rbOrient_S);
        rbOrient_S.setText("S");

        rbOrient_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_6.add(rbOrient_NPS);
        rbOrient_NPS.setText("NPS");

        rbOrient_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_6.add(rbOrient_NP);
        rbOrient_NP.setText("NP");

        rbOrient_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_6.add(rbOrient_NPI);
        rbOrient_NPI.setText("NPI");

        rbOrient_I.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_6.add(rbOrient_I);
        rbOrient_I.setText("I");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel87.setText("7. Capacidad para discriminar detalles");

        rbCapDiscr_S.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_7.add(rbCapDiscr_S);
        rbCapDiscr_S.setText("S");

        rbCapDiscr_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_7.add(rbCapDiscr_NPS);
        rbCapDiscr_NPS.setText("NPS");

        rbCapDiscr_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_7.add(rbCapDiscr_NP);
        rbCapDiscr_NP.setText("NP");

        rbCapDiscr_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_7.add(rbCapDiscr_NPI);
        rbCapDiscr_NPI.setText("NPI");

        rbCapDiscr_I.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_7.add(rbCapDiscr_I);
        rbCapDiscr_I.setText("I");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel88.setText("8. Capacidad de aprendizaje : ");

        rbCapApredizaje_S.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_8.add(rbCapApredizaje_S);
        rbCapApredizaje_S.setText("S");

        rbCapApredizaje_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_8.add(rbCapApredizaje_NPS);
        rbCapApredizaje_NPS.setText("NPS");

        rbCapApredizaje_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_8.add(rbCapApredizaje_NP);
        rbCapApredizaje_NP.setText("NP");

        rbCapApredizaje_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_8.add(rbCapApredizaje_NPI);
        rbCapApredizaje_NPI.setText("NPI");

        rbCapApredizaje_I.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_8.add(rbCapApredizaje_I);
        rbCapApredizaje_I.setText("I");

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel98.setText("9. Capacidad de análisis y síntesis : ");

        rbCapAnalisis_S.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_9.add(rbCapAnalisis_S);
        rbCapAnalisis_S.setText("S");

        rbCapAnalisis_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_9.add(rbCapAnalisis_NPS);
        rbCapAnalisis_NPS.setText("NPS");

        rbCapAnalisis_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_9.add(rbCapAnalisis_NP);
        rbCapAnalisis_NP.setText("NP");

        rbCapAnalisis_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_9.add(rbCapAnalisis_NPI);
        rbCapAnalisis_NPI.setText("NPI");

        rbCapAnalisis_I.setBackground(new java.awt.Color(153, 204, 255));
        bgINT_9.add(rbCapAnalisis_I);
        rbCapAnalisis_I.setText("I");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(rbComp_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbComp_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbComp_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbComp_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbComp_I))
                    .addComponent(jLabel81)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(rbCoefIntelectual_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbCoefIntelectual_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCoefIntelectual_NP)
                        .addGap(1, 1, 1)
                        .addComponent(rbCoefIntelectual_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCoefIntelectual_I))
                    .addComponent(jLabel82)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(rbNivAtenc_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbNivAtenc_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNivAtenc_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNivAtenc_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNivAtenc_I))
                    .addComponent(jLabel83)
                    .addComponent(jLabel84)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(rbCoorVisio_S)
                                .addGap(1, 1, 1)
                                .addComponent(rbCoorVisio_NPS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCoorVisio_NP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCoorVisio_NPI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCoorVisio_I))
                            .addComponent(jLabel85))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(rbMemo_S)
                            .addGap(1, 1, 1)
                            .addComponent(rbMemo_NPS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbMemo_NP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbMemo_NPI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbMemo_I)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(rbOrient_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbOrient_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOrient_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOrient_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOrient_I))
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(rbCapApredizaje_S)
                                .addGap(1, 1, 1)
                                .addComponent(rbCapApredizaje_NPS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCapApredizaje_NP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCapApredizaje_NPI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCapApredizaje_I))
                            .addComponent(jLabel88))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(rbCapDiscr_S)
                            .addGap(1, 1, 1)
                            .addComponent(rbCapDiscr_NPS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbCapDiscr_NP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbCapDiscr_NPI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbCapDiscr_I)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(rbCapAnalisis_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbCapAnalisis_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCapAnalisis_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCapAnalisis_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCapAnalisis_I))
                    .addComponent(jLabel98))
                .addGap(1, 1, 1))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel81)
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbCoefIntelectual_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoefIntelectual_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoefIntelectual_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoefIntelectual_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoefIntelectual_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel82)
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbComp_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbComp_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbComp_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbComp_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbComp_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel83)
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbNivAtenc_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivAtenc_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivAtenc_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivAtenc_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNivAtenc_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84)
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbMemo_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMemo_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMemo_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMemo_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMemo_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel85)
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbCoorVisio_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoorVisio_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoorVisio_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoorVisio_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCoorVisio_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86)
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbOrient_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOrient_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOrient_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOrient_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOrient_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbCapDiscr_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapDiscr_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapDiscr_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapDiscr_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapDiscr_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel88)
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbCapApredizaje_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapApredizaje_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapApredizaje_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapApredizaje_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapApredizaje_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addGap(1, 1, 1)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbCapAnalisis_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapAnalisis_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapAnalisis_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapAnalisis_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCapAnalisis_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(153, 204, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PERSONALIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        rbEstabEmocional_S.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_1.add(rbEstabEmocional_S);
        rbEstabEmocional_S.setText("S");

        rbEstabEmocional_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_1.add(rbEstabEmocional_NPS);
        rbEstabEmocional_NPS.setText("NPS");

        rbEstabEmocional_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_1.add(rbEstabEmocional_NP);
        rbEstabEmocional_NP.setText("NP");

        rbEstabEmocional_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_1.add(rbEstabEmocional_NPI);
        rbEstabEmocional_NPI.setText("NPI");

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel89.setText("1. Estabilidad emocional:");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel90.setText("2. Afrontamiento al estrés :");

        rbAfrontEst_S.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_2.add(rbAfrontEst_S);
        rbAfrontEst_S.setText("S");

        rbAfrontEst_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_2.add(rbAfrontEst_NPS);
        rbAfrontEst_NPS.setText("NPS");

        rbAfrontEst_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_2.add(rbAfrontEst_NP);
        rbAfrontEst_NP.setText("NP");

        rbEstabEmocional_I.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_1.add(rbEstabEmocional_I);
        rbEstabEmocional_I.setText("I");

        rbAfrontEst_I.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_2.add(rbAfrontEst_I);
        rbAfrontEst_I.setText("I");

        rbAfrontEst_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_2.add(rbAfrontEst_NPI);
        rbAfrontEst_NPI.setText("NPI");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel91.setText("3. Afrontamiento al riesgo:");

        rbAfrontRies_S.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_3.add(rbAfrontRies_S);
        rbAfrontRies_S.setText("S");

        rbAfrontRies_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_3.add(rbAfrontRies_NPS);
        rbAfrontRies_NPS.setText("NPS");

        rbAfrontRies_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_3.add(rbAfrontRies_NP);
        rbAfrontRies_NP.setText("NP");

        rbAfrontRies_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_3.add(rbAfrontRies_NPI);
        rbAfrontRies_NPI.setText("NPI");

        rbAfrontRies_I.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_3.add(rbAfrontRies_I);
        rbAfrontRies_I.setText("I");

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel92.setText("4. Relaciones interpersonales / Adaptación al medio :");

        rbRelaciInter_S.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_4.add(rbRelaciInter_S);
        rbRelaciInter_S.setText("S");

        rbRelaciInter_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_4.add(rbRelaciInter_NPS);
        rbRelaciInter_NPS.setText("NPS");
        rbRelaciInter_NPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRelaciInter_NPSActionPerformed(evt);
            }
        });

        rbRelaciInter_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_4.add(rbRelaciInter_NP);
        rbRelaciInter_NP.setText("NP");

        rbRelaciInter_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_4.add(rbRelaciInter_NPI);
        rbRelaciInter_NPI.setText("NPI");

        rbRelaciInter_I.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_4.add(rbRelaciInter_I);
        rbRelaciInter_I.setText("I");

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setText("5. Disposición para acatar normas y reglas :");

        rbDisposicNorm_S.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_5.add(rbDisposicNorm_S);
        rbDisposicNorm_S.setText("S");

        rbDisposicNorm_NPS.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_5.add(rbDisposicNorm_NPS);
        rbDisposicNorm_NPS.setText("NPS");

        rbDisposicNorm_NP.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_5.add(rbDisposicNorm_NP);
        rbDisposicNorm_NP.setText("NP");

        rbDisposicNorm_NPI.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_5.add(rbDisposicNorm_NPI);
        rbDisposicNorm_NPI.setText("NPI");

        rbDisposicNorm_I.setBackground(new java.awt.Color(153, 204, 255));
        bgPERS_5.add(rbDisposicNorm_I);
        rbDisposicNorm_I.setText("I");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(rbAfrontEst_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbAfrontEst_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAfrontEst_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAfrontEst_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAfrontEst_I))
                    .addComponent(jLabel89)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(rbEstabEmocional_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbEstabEmocional_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEstabEmocional_NP)
                        .addGap(1, 1, 1)
                        .addComponent(rbEstabEmocional_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEstabEmocional_I))
                    .addComponent(jLabel90)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(rbAfrontRies_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbAfrontRies_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAfrontRies_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAfrontRies_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAfrontRies_I))
                    .addComponent(jLabel91)
                    .addComponent(jLabel92)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(rbDisposicNorm_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbDisposicNorm_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDisposicNorm_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDisposicNorm_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDisposicNorm_I))
                    .addComponent(jLabel93)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(rbRelaciInter_S)
                        .addGap(1, 1, 1)
                        .addComponent(rbRelaciInter_NPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRelaciInter_NP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRelaciInter_NPI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRelaciInter_I)))
                .addGap(1, 1, 1))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel89)
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbEstabEmocional_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEstabEmocional_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEstabEmocional_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEstabEmocional_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEstabEmocional_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel90)
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbAfrontEst_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAfrontEst_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAfrontEst_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAfrontEst_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAfrontEst_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel91)
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbAfrontRies_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAfrontRies_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAfrontRies_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAfrontRies_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAfrontRies_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbRelaciInter_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRelaciInter_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRelaciInter_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRelaciInter_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRelaciInter_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel93)
                .addGap(1, 1, 1)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbDisposicNorm_S, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDisposicNorm_NPS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDisposicNorm_NP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDisposicNorm_NPI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDisposicNorm_I, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Áreas de Evaluación", jPanel21);

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Impirmir N° Orden"));

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

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(txtImpEP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel94.setText("Amenazas / Debilidades:");

        txtFortOportunidades.setColumns(20);
        txtFortOportunidades.setForeground(new java.awt.Color(0, 102, 51));
        txtFortOportunidades.setRows(5);
        txtFortOportunidades.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFortOportunidadesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFortOportunidadesFocusLost(evt);
            }
        });
        txtFortOportunidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFortOportunidadesKeyReleased(evt);
            }
        });
        jScrollPane15.setViewportView(txtFortOportunidades);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane3)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14)
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane13)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(btnAgregarEP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnActualizarEP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLimpiarEP)))
                            .addComponent(jLabel94))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(jScrollPane15))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel78)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnActualizarEP)
                                    .addComponent(btnLimpiarEP)
                                    .addComponent(btnAgregarEP)))
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3)
                        .addGap(2, 2, 2))))
        );

        jTabbedPane1.addTab("Eval. Psicologica Poderosa", jPanel13);

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

    private void btnEditarEP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEP1ActionPerformed
         String Sql="select d.nombres_pa,d.apellidos_pa,"
                 + "d.fecha_nacimiento_pa,d.lugar_nac_pa,"
                 + "d.direccion_pa,d.estado_civil_pa,"
                 + "d.nivel_est_pa,d.ocupacion_pa,"
                 + "n.cargo_de,ep.fecha_ep, ep.rbi1, ep.rbi2, ep.rbi3, ep.rbi4, ep.rbi5, \n" +
"       ep.rbi6, ep.rbi7, ep.rbi8, ep.rbi9, ep.rbi10, ep.rbi11, ep.rbi12, ep.rbi13, ep.rbi14, ep.rbi15, \n" +
"       ep.rbi16, ep.rbi17, ep.rbi18, ep.rbi19, ep.rbi20, ep.rbi21, ep.rbi22, ep.rbi23, ep.rbi24, \n" +
"       ep.rbi25, ep.rbi26, ep.rbi27, ep.rbi28, ep.rbi29, ep.rbi30, ep.rbi31, ep.rbi32, ep.rbi33, \n" +
"       ep.rbi34, ep.rbi35, ep.rbi36, ep.rbi37, ep.rbi38, ep.rbi39, ep.rbi40, ep.rbi41, ep.rbi42, \n" +
"       ep.rbi43, ep.rbi44, ep.rbi45, ep.rbp1, ep.rbp2, ep.rbp3, ep.rbp4, ep.rbp5, ep.rbp6, ep.rbp7, \n" +
"       ep.rbp8, ep.rbp9, ep.rbp10, ep.rbp11, ep.rbp12, ep.rbp13, ep.rbp14, ep.rbp15, ep.rbp16, \n" +
"       ep.rbp17, ep.rbp18, ep.rbp19, ep.rbp20, ep.rbp21, ep.rbp22, ep.rbp23, ep.rbp24, ep.rbp25, \n" +
"       ep.txtfortalezas_o, ep.txtamenazas_d, ep.txtobservaciones, ep.txtrecomendaciones, ep.rbapto,"
                 + " ep.rbnoapto,rbexcelente, rbapto_observacion,chklicencia,chktrabcalientes "
                 + "From datos_paciente as d "
               + "inner join n_orden_ocupacional as n on(d.cod_pa = n.cod_pa) "
               + "inner join evaluacion_psicologica_poderosa as ep on(n.n_orden = ep.n_orden) "
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
                        rbCoefIntelectual_S.setSelected(oConn.setResult.getBoolean("rbi1"));
                        rbCoefIntelectual_NPS.setSelected(oConn.setResult.getBoolean("rbi2"));
                        rbCoefIntelectual_NP.setSelected(oConn.setResult.getBoolean("rbi3"));
                        rbCoefIntelectual_NPI.setSelected(oConn.setResult.getBoolean("rbi4"));
                        rbCoefIntelectual_I.setSelected(oConn.setResult.getBoolean("rbi5"));
                        
                        rbComp_S.setSelected(oConn.setResult.getBoolean("rbi6"));
                        rbComp_NPS.setSelected(oConn.setResult.getBoolean("rbi7"));
                        rbComp_NP.setSelected(oConn.setResult.getBoolean("rbi8"));
                        rbComp_NPI.setSelected(oConn.setResult.getBoolean("rbi9"));
                        rbComp_I.setSelected(oConn.setResult.getBoolean("rbi10"));
                        
                        rbNivAtenc_S.setSelected(oConn.setResult.getBoolean("rbi11"));
                        rbNivAtenc_NPS.setSelected(oConn.setResult.getBoolean("rbi12"));
                        rbNivAtenc_NP.setSelected(oConn.setResult.getBoolean("rbi13"));
                        rbNivAtenc_NPI.setSelected(oConn.setResult.getBoolean("rbi14"));
                        rbNivAtenc_I.setSelected(oConn.setResult.getBoolean("rbi15"));
                        
                        rbMemo_S.setSelected(oConn.setResult.getBoolean("rbi16"));
                        rbMemo_NPS.setSelected(oConn.setResult.getBoolean("rbi17"));
                        rbMemo_NP.setSelected(oConn.setResult.getBoolean("rbi18"));
                        rbMemo_NPI.setSelected(oConn.setResult.getBoolean("rbi19"));
                        rbMemo_I.setSelected(oConn.setResult.getBoolean("rbi20"));
                        
                        rbCoorVisio_S.setSelected(oConn.setResult.getBoolean("rbi21"));
                        rbCoorVisio_NPS.setSelected(oConn.setResult.getBoolean("rbi22"));
                        rbCoorVisio_NP.setSelected(oConn.setResult.getBoolean("rbi23"));
                        rbCoorVisio_NPI.setSelected(oConn.setResult.getBoolean("rbi24"));
                        rbCoorVisio_I.setSelected(oConn.setResult.getBoolean("rbi25"));
                        
                        rbOrient_S.setSelected(oConn.setResult.getBoolean("rbi26"));
                        rbOrient_NPS.setSelected(oConn.setResult.getBoolean("rbi27"));
                        rbOrient_NP.setSelected(oConn.setResult.getBoolean("rbi28"));
                        rbOrient_NPI.setSelected(oConn.setResult.getBoolean("rbi29"));
                        rbOrient_I.setSelected(oConn.setResult.getBoolean("rbi30"));
                        
                        rbCapDiscr_S.setSelected(oConn.setResult.getBoolean("rbi31"));
                        rbCapDiscr_NPS.setSelected(oConn.setResult.getBoolean("rbi32"));
                        rbCapDiscr_NP.setSelected(oConn.setResult.getBoolean("rbi33"));
                        rbCapDiscr_NPI.setSelected(oConn.setResult.getBoolean("rbi34"));
                        rbCapDiscr_I.setSelected(oConn.setResult.getBoolean("rbi35"));
                        
                        rbCapApredizaje_S.setSelected(oConn.setResult.getBoolean("rbi36"));
                        rbCapApredizaje_NPS.setSelected(oConn.setResult.getBoolean("rbi37"));
                        rbCapApredizaje_NP.setSelected(oConn.setResult.getBoolean("rbi38"));
                        rbCapApredizaje_NPI.setSelected(oConn.setResult.getBoolean("rbi39"));
                        rbCapApredizaje_I.setSelected(oConn.setResult.getBoolean("rbi40"));
                        
                        rbCapAnalisis_S.setSelected(oConn.setResult.getBoolean("rbi41"));
                        rbCapAnalisis_NPS.setSelected(oConn.setResult.getBoolean("rbi42"));
                        rbCapAnalisis_NP.setSelected(oConn.setResult.getBoolean("rbi43"));
                        rbCapAnalisis_NPI.setSelected(oConn.setResult.getBoolean("rbi44"));
                        rbCapAnalisis_I.setSelected(oConn.setResult.getBoolean("rbi45"));
                        
                        rbEstabEmocional_S.setSelected(oConn.setResult.getBoolean("rbp1"));
                        rbEstabEmocional_NPS.setSelected(oConn.setResult.getBoolean("rbp2"));
                        rbEstabEmocional_NP.setSelected(oConn.setResult.getBoolean("rbp3"));
                        rbEstabEmocional_NPI.setSelected(oConn.setResult.getBoolean("rbp4"));
                        rbEstabEmocional_I.setSelected(oConn.setResult.getBoolean("rbp5"));
                        
                        rbAfrontEst_S.setSelected(oConn.setResult.getBoolean("rbp6"));
                        rbAfrontEst_NPS.setSelected(oConn.setResult.getBoolean("rbp7"));
                        rbAfrontEst_NP.setSelected(oConn.setResult.getBoolean("rbp8"));
                        rbAfrontEst_NPI.setSelected(oConn.setResult.getBoolean("rbp9"));
                        rbAfrontEst_I.setSelected(oConn.setResult.getBoolean("rbp10"));
                        
                        rbAfrontRies_S.setSelected(oConn.setResult.getBoolean("rbp11"));
                        rbAfrontRies_NPS.setSelected(oConn.setResult.getBoolean("rbp12"));
                        rbAfrontRies_NP.setSelected(oConn.setResult.getBoolean("rbp13"));
                        rbAfrontRies_NPI.setSelected(oConn.setResult.getBoolean("rbp14"));
                        rbAfrontRies_I.setSelected(oConn.setResult.getBoolean("rbp15"));
                        
                        rbRelaciInter_S.setSelected(oConn.setResult.getBoolean("rbp16"));
                        rbRelaciInter_NPS.setSelected(oConn.setResult.getBoolean("rbp17"));
                        rbRelaciInter_NP.setSelected(oConn.setResult.getBoolean("rbp18"));
                        rbRelaciInter_NPI.setSelected(oConn.setResult.getBoolean("rbp19"));
                        rbRelaciInter_I.setSelected(oConn.setResult.getBoolean("rbp20"));
                        
                        rbDisposicNorm_S.setSelected(oConn.setResult.getBoolean("rbp21"));
                        rbDisposicNorm_NPS.setSelected(oConn.setResult.getBoolean("rbp22"));
                        rbDisposicNorm_NP.setSelected(oConn.setResult.getBoolean("rbp23"));
                        rbDisposicNorm_NPI.setSelected(oConn.setResult.getBoolean("rbp24"));
                        rbDisposicNorm_I.setSelected(oConn.setResult.getBoolean("rbp25"));
                        
                        
                        txtFortOportunidades.setText(oConn.setResult.getString("txtfortalezas_o"));
                        txtAmenDebilidades.setText(oConn.setResult.getString("txtamenazas_d"));
                        txtObservaciones.setText(oConn.setResult.getString("txtobservaciones"));
                        txtRecomendaciones.setText(oConn.setResult.getString("txtrecomendaciones"));
                       
                        rbSiEP.setSelected(oConn.setResult.getBoolean("rbapto"));
                        rbNoEP.setSelected(oConn.setResult.getBoolean("rbnoapto"));
                        rbExcelente.setSelected(oConn.setResult.getBoolean("rbexcelente"));
                        rbAptoconObservacion.setSelected(oConn.setResult.getBoolean("rbapto_observacion"));
                        chkLicencia.setSelected(oConn.setResult.getBoolean("chklicencia"));
                        chkTrabCalientes.setSelected(oConn.setResult.getBoolean("chktrabcalientes"));
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Evaluacion Psicologica:" + ex.getMessage().toString());
            }
        
    }//GEN-LAST:event_btnEditarEP1ActionPerformed

    private void txtRecomendacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecomendacionesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecomendacionesFocusGained

    private void txtRecomendacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecomendacionesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecomendacionesFocusLost

    private void txtRecomendacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecomendacionesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecomendacionesKeyReleased

    private void txtObservacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesFocusGained

    private void txtObservacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesFocusLost

    private void txtObservacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesKeyReleased

    private void txtAmenDebilidadesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmenDebilidadesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmenDebilidadesFocusGained

    private void txtAmenDebilidadesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmenDebilidadesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmenDebilidadesFocusLost

    private void txtAmenDebilidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmenDebilidadesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmenDebilidadesKeyReleased

    private void btnActualizarEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEPActionPerformed
         String sCodigo=txtNordenEP.getText();
            String strSqlStmt;
            strSqlStmt="UPDATE evaluacion_psicologica_poderosa\n" +
"   SET n_orden='"+txtNordenEP.getText()+"', edad_ep='"+txtEdadEP.getText()+"', fecha_ep='"+FechaEntrevistaEP.getDate()+"',"
     + " rbi1='"+rbCoefIntelectual_S.isSelected()+"', rbi2='"+rbCoefIntelectual_NPS.isSelected()+"', rbi3='"+rbCoefIntelectual_NP.isSelected()+"', \n" +
"       rbi4='"+rbCoefIntelectual_NPI.isSelected()+"', rbi5='"+rbCoefIntelectual_I.isSelected()+"', rbi6='"+rbComp_S.isSelected()+"', "
     + "rbi7='"+rbComp_NPS.isSelected()+"', rbi8='"+rbComp_NP.isSelected()+"', rbi9='"+rbComp_NPI.isSelected()+"',"
     + "rbi10='"+rbComp_I.isSelected()+"', rbi11='"+rbNivAtenc_S.isSelected()+"', \n" +
"       rbi12='"+rbNivAtenc_NPS.isSelected()+"', rbi13='"+rbNivAtenc_NP.isSelected()+"', "
     + "rbi14='"+rbNivAtenc_NPI.isSelected()+"', rbi15='"+rbNivAtenc_I.isSelected()+"',"
     + " rbi16='"+rbMemo_S.isSelected()+"', rbi17='"+rbMemo_NPS.isSelected()+"',"
     + " rbi18='"+rbMemo_NP.isSelected()+"', rbi19='"+rbMemo_NPI.isSelected()+"',"
     + " rbi20='"+rbMemo_I.isSelected()+"', rbi21='"+rbCoorVisio_S.isSelected()+"',"
     + " rbi22='"+rbCoorVisio_NPS.isSelected()+"', rbi23='"+rbCoorVisio_NP.isSelected()+"', "
     + "rbi24='"+rbCoorVisio_NPI.isSelected()+"', rbi25='"+rbCoorVisio_I.isSelected()+"', \n" +
"       rbi26='"+rbOrient_S.isSelected()+"', rbi27='"+rbOrient_NPS.isSelected()+"',"
     + " rbi28='"+rbOrient_NP.isSelected()+"', rbi29='"+rbOrient_NPI.isSelected()+"',"
     + " rbi30='"+rbOrient_I.isSelected()+"', rbi31='"+rbCapDiscr_S.isSelected()+"', "
     + "rbi32='"+rbCapDiscr_NPS.isSelected()+"',rbi33='"+rbCapDiscr_NP.isSelected()+"',"
     + " rbi34='"+rbCapDiscr_NPI.isSelected()+"', rbi35='"+rbCapDiscr_I.isSelected()+"',"
     + " rbi36='"+rbCapApredizaje_S.isSelected()+"', rbi37='"+rbCapApredizaje_NPS.isSelected()+"',"
     + " rbi38='"+rbCapApredizaje_NP.isSelected()+"', rbi39='"+rbCapApredizaje_NPI.isSelected()+"', \n" 
     + "rbi40='"+rbCapApredizaje_I.isSelected()+"', rbi41='"+rbCapAnalisis_S.isSelected()+"', \n" +
"       rbi42='"+rbCapAnalisis_NPS.isSelected()+"', rbi43='"+rbCapAnalisis_NP.isSelected()+"', "
     + "rbi44='"+rbCapAnalisis_NPI.isSelected()+"', rbi45='"+rbCapAnalisis_I.isSelected()+"', "
     + " rbp1='"+rbEstabEmocional_S.isSelected()+"',rbp2='"+rbEstabEmocional_NPS.isSelected()+"', "
     + "rbp3='"+rbEstabEmocional_NP.isSelected()+"', rbp4='"+rbEstabEmocional_NPI.isSelected()+"',"
     + " rbp5='"+rbEstabEmocional_I.isSelected()+"', \n" +
"       rbp6='"+rbAfrontEst_S.isSelected()+"', rbp7='"+rbAfrontEst_NPS.isSelected()+"',"
     + " rbp8='"+rbAfrontEst_NP.isSelected()+"', rbp9='"+rbAfrontEst_NPI.isSelected()+"', "
     + "rbp10='"+rbAfrontEst_I.isSelected()+"', rbp11='"+rbAfrontRies_S.isSelected()+"', "
     + "rbp12='"+rbAfrontRies_NPS.isSelected()+"', rbp13='"+rbAfrontRies_NP.isSelected()+"', \n" +
"       rbp14='"+rbAfrontRies_NPI.isSelected()+"', rbp15='"+rbAfrontRies_I.isSelected()+"',"
     + " rbp16='"+rbRelaciInter_S.isSelected()+"', rbp17='"+rbRelaciInter_NPS.isSelected()+"',"
     + " rbp18='"+rbRelaciInter_NP.isSelected()+"', rbp19='"+rbRelaciInter_NPI.isSelected()+"',"
     + " rbp20='"+rbRelaciInter_I.isSelected()+"', rbp21='"+rbDisposicNorm_S.isSelected()+"', \n" +
"       rbp22='"+rbDisposicNorm_NPS.isSelected()+"', rbp23='"+rbDisposicNorm_NP.isSelected()+"', "
     + "rbp24='"+rbDisposicNorm_NPI.isSelected()+"', rbp25='"+rbDisposicNorm_I.isSelected()+"', "
    +" txtfortalezas_o='"+txtFortOportunidades.getText()+"',txtamenazas_d='"+txtAmenDebilidades.getText()+"', "
     + "txtobservaciones='"+txtObservaciones.getText()+"', txtrecomendaciones='"+txtRecomendaciones.getText()+"', \n" +
"       rbapto='"+rbSiEP.isSelected()+"', rbnoapto='"+rbNoEP.isSelected()+"'," +
     "  rbexcelente='"+rbExcelente.isSelected()+"', "+ 
     "  rbapto_observacion='"+rbAptoconObservacion.isSelected()+"', "+ 
     "  chklicencia='"+chkLicencia.isSelected()+"', "+
     "  chktrabcalientes='"+chkTrabCalientes.isSelected()+"' " +
     " WHERE n_orden='" + sCodigo + "'";
                
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
        // TODO add your handling code here:
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

    private void btnAgregarEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEPActionPerformed
        if (!txtNordenEP.getText().isEmpty()){
        if(!OrdenExisteEP()){
         if (validarEP()){
      String Sql ="INSERT INTO evaluacion_psicologica_poderosa(\n" +
"            n_orden, edad_ep, fecha_ep, rbi1, rbi2, rbi3, rbi4, rbi5, \n" +
"            rbi6, rbi7, rbi8, rbi9, rbi10, rbi11, rbi12, rbi13, rbi14, rbi15, \n" +
"            rbi16, rbi17, rbi18, rbi19, rbi20, rbi21, rbi22, rbi23, rbi24, \n" +
"            rbi25, rbi26, rbi27, rbi28, rbi29, rbi30, rbi31, rbi32, rbi33, \n" +
"            rbi34, rbi35, rbi36, rbi37, rbi38, rbi39, rbi40, rbi41, rbi42, \n" +
"            rbi43, rbi44, rbi45, rbp1, rbp2, rbp3, rbp4, rbp5, rbp6, rbp7, \n" +
"            rbp8, rbp9, rbp10, rbp11, rbp12, rbp13, rbp14, rbp15, rbp16, \n" +
"            rbp17, rbp18, rbp19, rbp20, rbp21, rbp22, rbp23, rbp24, rbp25, \n" +
"            txtfortalezas_o, txtamenazas_d, txtobservaciones, txtrecomendaciones, \n" +
"            rbapto, rbnoapto, rbexcelente, rbapto_observacion,chklicencia,chktrabcalientes)\n" +
            "    VALUES ('"+txtNordenEP.getText()+"', '"+txtEdadEP.getText()+"','"+FechaEntrevistaEP.getDate()+"',"
          + " '"+rbCoefIntelectual_S.isSelected()+"', '"+rbCoefIntelectual_NPS.isSelected()+"', '"+rbCoefIntelectual_NP.isSelected()+"',"
          + " '"+rbCoefIntelectual_NPI.isSelected()+"', '"+rbCoefIntelectual_I.isSelected()+"', '"+rbComp_S.isSelected()+"', \n" +
            "  '"+rbComp_NPS.isSelected()+"', '"+rbComp_NP.isSelected()+"', '"+rbComp_NPI.isSelected()+"', "
              + "'"+rbComp_I.isSelected()+"', '"+rbNivAtenc_S.isSelected()+"','"+rbNivAtenc_NPS.isSelected()+"', "
              + "'"+rbNivAtenc_NP.isSelected()+"', '"+rbNivAtenc_NPI.isSelected()+"', '"+rbNivAtenc_I.isSelected()+"',"
              + " '"+rbMemo_S.isSelected()+"', '"+rbMemo_NPS.isSelected()+"', '"+rbMemo_NP.isSelected()+"',"
              + " '"+rbMemo_NPI.isSelected()+"', '"+rbMemo_I.isSelected()+"', '"+rbCoorVisio_S.isSelected()+"',"
              + " '"+rbCoorVisio_NPS.isSelected()+"', '"+rbCoorVisio_NP.isSelected()+"', '"+rbCoorVisio_NPI.isSelected()+"', '"+rbCoorVisio_I.isSelected()+"', \n" +
            " '"+rbOrient_S.isSelected()+"', '"+rbOrient_NPS.isSelected()+"', '"+rbOrient_NP.isSelected()+"', '"+rbOrient_NPI.isSelected()+"',"
              + " '"+rbOrient_I.isSelected()+"', '"+rbCapDiscr_S.isSelected()+"', '"+rbCapDiscr_NPS.isSelected()+"',"
              + " '"+rbCapDiscr_NP.isSelected()+"', '"+rbCapDiscr_NPI.isSelected()+"', '"+rbCapDiscr_I.isSelected()+"', "
              + "'"+rbCapApredizaje_S.isSelected()+"', '"+rbCapApredizaje_NPS.isSelected()+"','"+rbCapApredizaje_NP.isSelected()+"',"
              + " '"+rbCapApredizaje_NPI.isSelected()+"', '"+rbCapApredizaje_I.isSelected()+"', '"+rbCapAnalisis_S.isSelected()+"',"
              + " '"+rbCapAnalisis_NPS.isSelected()+"', '"+rbCapAnalisis_NP.isSelected()+"','"+rbCapAnalisis_NPI.isSelected()+"',"
              + " '"+rbCapAnalisis_I.isSelected()+"', '"+rbEstabEmocional_S.isSelected()+"', '"+rbEstabEmocional_NPS.isSelected()+"',"
              + " '"+rbEstabEmocional_NP.isSelected()+"', '"+rbEstabEmocional_NPI.isSelected()+"', '"+rbEstabEmocional_I.isSelected()+"',"
              + " '"+rbAfrontEst_S.isSelected()+"', '"+rbAfrontEst_NPS.isSelected()+"', '"+rbAfrontEst_NP.isSelected()+"', "
              + "'"+rbAfrontEst_NPI.isSelected()+"',\n" +
            " '"+rbAfrontEst_I.isSelected()+"','"+rbAfrontRies_S.isSelected()+"','"+rbAfrontRies_NPS.isSelected()+"',"
              + " '"+rbAfrontRies_NP.isSelected()+"', '"+rbAfrontRies_NPI.isSelected()+"', '"+rbAfrontRies_I.isSelected()+"',"
              + " '"+rbRelaciInter_S.isSelected()+"', '"+rbRelaciInter_NPS.isSelected()+"', '"+rbRelaciInter_NP.isSelected()+"', \n" +
            " '"+rbRelaciInter_NPI.isSelected()+"', '"+rbRelaciInter_I.isSelected()+"', '"+rbDisposicNorm_S.isSelected()+"', "
              + "'"+rbDisposicNorm_NPS.isSelected()+"', '"+rbDisposicNorm_NP.isSelected()+"','"+rbDisposicNorm_NPI.isSelected()+"',"
              + "'"+rbDisposicNorm_I.isSelected()+"', '"+txtFortOportunidades.getText()+"','"+txtAmenDebilidades.getText()+"',"
              + "'"+txtObservaciones.getText()+"','"+txtRecomendaciones.getText()+"','"+rbSiEP.isSelected()+"', "
              + "'"+rbNoEP.isSelected()+"','"+rbExcelente.isSelected()+"',"
              + "'"+rbAptoconObservacion.isSelected()+"',"
              + "'"+chkLicencia.isSelected()+"',"
              + "'"+chkTrabCalientes.isSelected()+"');";
//                     oFunc.SubSistemaMensajeInformacion(Sql);
                      if (oConn.FnBoolQueryExecuteUpdate(Sql)){
                //oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
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

    private void txtFortOportunidadesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFortOportunidadesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFortOportunidadesFocusGained

    private void txtFortOportunidadesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFortOportunidadesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFortOportunidadesFocusLost

    private void txtFortOportunidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFortOportunidadesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFortOportunidadesKeyReleased

    private void rbCoefIntelectual_NPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCoefIntelectual_NPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCoefIntelectual_NPSActionPerformed

    private void rbRelaciInter_NPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRelaciInter_NPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRelaciInter_NPSActionPerformed

    private void chkLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLicenciaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEntrevistaEP;
    private com.toedter.calendar.JDateChooser FechaNacimientoEP;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.ButtonGroup bgAprobo;
    private javax.swing.ButtonGroup bgCondicion;
    private javax.swing.ButtonGroup bgINT_1;
    private javax.swing.ButtonGroup bgINT_2;
    private javax.swing.ButtonGroup bgINT_3;
    private javax.swing.ButtonGroup bgINT_4;
    private javax.swing.ButtonGroup bgINT_5;
    private javax.swing.ButtonGroup bgINT_6;
    private javax.swing.ButtonGroup bgINT_7;
    private javax.swing.ButtonGroup bgINT_8;
    private javax.swing.ButtonGroup bgINT_9;
    private javax.swing.ButtonGroup bgPERS_1;
    private javax.swing.ButtonGroup bgPERS_2;
    private javax.swing.ButtonGroup bgPERS_3;
    private javax.swing.ButtonGroup bgPERS_4;
    private javax.swing.ButtonGroup bgPERS_5;
    private javax.swing.JButton btnActualizarEP;
    private javax.swing.JButton btnAgregarEP;
    private javax.swing.JButton btnEditarEP1;
    private javax.swing.JButton btnIMP;
    private javax.swing.JButton btnLimpiarEP;
    private javax.swing.JCheckBox chkLicencia;
    private javax.swing.JCheckBox chkTrabCalientes;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
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
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JRadioButton rbAfrontEst_I;
    private javax.swing.JRadioButton rbAfrontEst_NP;
    private javax.swing.JRadioButton rbAfrontEst_NPI;
    private javax.swing.JRadioButton rbAfrontEst_NPS;
    private javax.swing.JRadioButton rbAfrontEst_S;
    private javax.swing.JRadioButton rbAfrontRies_I;
    private javax.swing.JRadioButton rbAfrontRies_NP;
    private javax.swing.JRadioButton rbAfrontRies_NPI;
    private javax.swing.JRadioButton rbAfrontRies_NPS;
    private javax.swing.JRadioButton rbAfrontRies_S;
    private javax.swing.JRadioButton rbAptoconObservacion;
    private javax.swing.JRadioButton rbCapAnalisis_I;
    private javax.swing.JRadioButton rbCapAnalisis_NP;
    private javax.swing.JRadioButton rbCapAnalisis_NPI;
    private javax.swing.JRadioButton rbCapAnalisis_NPS;
    private javax.swing.JRadioButton rbCapAnalisis_S;
    private javax.swing.JRadioButton rbCapApredizaje_I;
    private javax.swing.JRadioButton rbCapApredizaje_NP;
    private javax.swing.JRadioButton rbCapApredizaje_NPI;
    private javax.swing.JRadioButton rbCapApredizaje_NPS;
    private javax.swing.JRadioButton rbCapApredizaje_S;
    private javax.swing.JRadioButton rbCapDiscr_I;
    private javax.swing.JRadioButton rbCapDiscr_NP;
    private javax.swing.JRadioButton rbCapDiscr_NPI;
    private javax.swing.JRadioButton rbCapDiscr_NPS;
    private javax.swing.JRadioButton rbCapDiscr_S;
    private javax.swing.JRadioButton rbCoefIntelectual_I;
    private javax.swing.JRadioButton rbCoefIntelectual_NP;
    private javax.swing.JRadioButton rbCoefIntelectual_NPI;
    private javax.swing.JRadioButton rbCoefIntelectual_NPS;
    private javax.swing.JRadioButton rbCoefIntelectual_S;
    private javax.swing.JRadioButton rbComp_I;
    private javax.swing.JRadioButton rbComp_NP;
    private javax.swing.JRadioButton rbComp_NPI;
    private javax.swing.JRadioButton rbComp_NPS;
    private javax.swing.JRadioButton rbComp_S;
    private javax.swing.JRadioButton rbCoorVisio_I;
    private javax.swing.JRadioButton rbCoorVisio_NP;
    private javax.swing.JRadioButton rbCoorVisio_NPI;
    private javax.swing.JRadioButton rbCoorVisio_NPS;
    private javax.swing.JRadioButton rbCoorVisio_S;
    private javax.swing.JRadioButton rbDisposicNorm_I;
    private javax.swing.JRadioButton rbDisposicNorm_NP;
    private javax.swing.JRadioButton rbDisposicNorm_NPI;
    private javax.swing.JRadioButton rbDisposicNorm_NPS;
    private javax.swing.JRadioButton rbDisposicNorm_S;
    private javax.swing.JRadioButton rbEstabEmocional_I;
    private javax.swing.JRadioButton rbEstabEmocional_NP;
    private javax.swing.JRadioButton rbEstabEmocional_NPI;
    private javax.swing.JRadioButton rbEstabEmocional_NPS;
    private javax.swing.JRadioButton rbEstabEmocional_S;
    private javax.swing.JRadioButton rbExcelente;
    private javax.swing.JRadioButton rbMemo_I;
    private javax.swing.JRadioButton rbMemo_NP;
    private javax.swing.JRadioButton rbMemo_NPI;
    private javax.swing.JRadioButton rbMemo_NPS;
    private javax.swing.JRadioButton rbMemo_S;
    private javax.swing.JRadioButton rbNivAtenc_I;
    private javax.swing.JRadioButton rbNivAtenc_NP;
    private javax.swing.JRadioButton rbNivAtenc_NPI;
    private javax.swing.JRadioButton rbNivAtenc_NPS;
    private javax.swing.JRadioButton rbNivAtenc_S;
    private javax.swing.JRadioButton rbNoEP;
    private javax.swing.JRadioButton rbOrient_I;
    private javax.swing.JRadioButton rbOrient_NP;
    private javax.swing.JRadioButton rbOrient_NPI;
    private javax.swing.JRadioButton rbOrient_NPS;
    private javax.swing.JRadioButton rbOrient_S;
    private javax.swing.JRadioButton rbRelaciInter_I;
    private javax.swing.JRadioButton rbRelaciInter_NP;
    private javax.swing.JRadioButton rbRelaciInter_NPI;
    private javax.swing.JRadioButton rbRelaciInter_NPS;
    private javax.swing.JRadioButton rbRelaciInter_S;
    private javax.swing.JRadioButton rbSiEP;
    private javax.swing.JTextArea txtAmenDebilidades;
    private javax.swing.JTextField txtApellidosEP;
    private javax.swing.JTextField txtCargoDesempenarEP;
    private javax.swing.JTextField txtDomicilioEP;
    private javax.swing.JTextField txtEdadEP;
    private javax.swing.JTextField txtEstadoCivilEP;
    private javax.swing.JTextArea txtFortOportunidades;
    private javax.swing.JTextField txtImpEP;
    private javax.swing.JTextField txtLugarNacimientoEP;
    private javax.swing.JTextField txtNivelEstudiosEP;
    private javax.swing.JTextField txtNombresEP;
    private javax.swing.JTextField txtNordenEP;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtOcupaciónEP;
    private javax.swing.JTextArea txtRecomendaciones;
    // End of variables declaration//GEN-END:variables

public void limpiarEP(){
    bg1.clearSelection();
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
    txtAmenDebilidades.setText(null);
    txtFortOportunidades.setText(null);
    txtRecomendaciones.setText(null);
    FechaEntrevistaEP.setDate(null);
    bgPERS_1.clearSelection();
    bgPERS_2.clearSelection();
    bgPERS_3.clearSelection();
    bgPERS_4.clearSelection();
    bgPERS_5.clearSelection();

    bgINT_1.clearSelection();
    bgINT_2.clearSelection();
    bgINT_3.clearSelection();
    bgINT_4.clearSelection();
    bgINT_5.clearSelection();
    bgINT_6.clearSelection();
    bgINT_7.clearSelection();
    bgINT_8.clearSelection();
    bgINT_9.clearSelection();

    bgCondicion.clearSelection();
    chkLicencia.setSelected(false);
    chkTrabCalientes.setSelected(false);
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

private boolean validarEP(){
boolean bResultado=true;
if (((JTextField)FechaEntrevistaEP.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Entrevista");bResultado = false;}
    if(txtNordenEP.getText().isEmpty()){bResultado = false;}
    if(txtEdadEP.getText().isEmpty()){bResultado = false;}
    if(txtObservaciones.getText().isEmpty()){bResultado = false;}
    if(txtFortOportunidades.getText().isEmpty()){bResultado = false;}
    if(txtAmenDebilidades.getText().isEmpty()){bResultado = false;}
    if(txtRecomendaciones.getText().isEmpty()){bResultado = false;}
    
    if(!bgCondicion.getSelection().isSelected()){
        oFunc.SubSistemaMensajeError("Seleccione si aprobo o no aprobo");
        
        bResultado = false;}
 
   return bResultado;
}

public boolean OrdenExisteEP()
    {
        boolean bResultado=false;
        String sQuery;
        sQuery  = "Select n_orden from evaluacion_psicologica_poderosa Where n_orden="+txtNordenEP.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             limpiarEP();
            }
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         }
        return bResultado;        
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
 private void printerEP(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                 try 
                {
                    String master = System.getProperty("user.dir") +
                                "/reportes/EvaluacionPsicologica_p.jasper";
            
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
