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
import java.io.File;
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
public final class FichaSintomatologiaCovid19 extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;
 
   public FichaSintomatologiaCovid19() {
      initComponents();
   //new ajTextArea.autocompleterText(atxtIntelectual, "razon_empresa", "empresas");
     txtNordenEP.requestFocusInWindow();
 
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgS1 = new javax.swing.ButtonGroup();
        bgS2 = new javax.swing.ButtonGroup();
        bgS3 = new javax.swing.ButtonGroup();
        bgS4 = new javax.swing.ButtonGroup();
        bgS5 = new javax.swing.ButtonGroup();
        bgS6 = new javax.swing.ButtonGroup();
        bgS7 = new javax.swing.ButtonGroup();
        bgS8 = new javax.swing.ButtonGroup();
        bgS9 = new javax.swing.ButtonGroup();
        bgS10 = new javax.swing.ButtonGroup();
        bgS11 = new javax.swing.ButtonGroup();
        bgAF1 = new javax.swing.ButtonGroup();
        bgAF2 = new javax.swing.ButtonGroup();
        bgAF3 = new javax.swing.ButtonGroup();
        bgF1 = new javax.swing.ButtonGroup();
        bgF2 = new javax.swing.ButtonGroup();
        bgF3 = new javax.swing.ButtonGroup();
        bgF4 = new javax.swing.ButtonGroup();
        bgF5 = new javax.swing.ButtonGroup();
        bgF6 = new javax.swing.ButtonGroup();
        bgF7 = new javax.swing.ButtonGroup();
        bgF8 = new javax.swing.ButtonGroup();
        bgF9 = new javax.swing.ButtonGroup();
        bgF10 = new javax.swing.ButtonGroup();
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
        FechaExamen = new com.toedter.calendar.JDateChooser();
        jLabel73 = new javax.swing.JLabel();
        FechaNacimientoEP = new com.toedter.calendar.JDateChooser();
        txtLugarNacimientoEP = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnEditarEP1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtOcupaciónEP = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        rbSntoma1_si = new javax.swing.JRadioButton();
        rbSntoma1_no = new javax.swing.JRadioButton();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        rbSntoma2_si = new javax.swing.JRadioButton();
        rbSntoma2_no = new javax.swing.JRadioButton();
        jLabel83 = new javax.swing.JLabel();
        rbSntoma3_si = new javax.swing.JRadioButton();
        rbSntoma3_no = new javax.swing.JRadioButton();
        jLabel84 = new javax.swing.JLabel();
        rbSntoma4_si = new javax.swing.JRadioButton();
        rbSntoma4_no = new javax.swing.JRadioButton();
        jLabel85 = new javax.swing.JLabel();
        rbSntoma5_si = new javax.swing.JRadioButton();
        rbSntoma5_no = new javax.swing.JRadioButton();
        jLabel86 = new javax.swing.JLabel();
        rbSntoma6_si = new javax.swing.JRadioButton();
        rbSntoma6_no = new javax.swing.JRadioButton();
        jLabel87 = new javax.swing.JLabel();
        rbSntoma7_si = new javax.swing.JRadioButton();
        rbSntoma7_no = new javax.swing.JRadioButton();
        jLabel88 = new javax.swing.JLabel();
        rbSntoma8_si = new javax.swing.JRadioButton();
        rbSntoma8_no = new javax.swing.JRadioButton();
        jLabel98 = new javax.swing.JLabel();
        rbSntoma9_si = new javax.swing.JRadioButton();
        rbSntoma9_no = new javax.swing.JRadioButton();
        txtSintoma1 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        rbSntoma10_si = new javax.swing.JRadioButton();
        rbSntoma10_no = new javax.swing.JRadioButton();
        jLabel100 = new javax.swing.JLabel();
        rbSntoma11_si = new javax.swing.JRadioButton();
        rbSntoma11_no = new javax.swing.JRadioButton();
        txtSintoma11 = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        rbAfirma1_si = new javax.swing.JRadioButton();
        rbAfirma1_no = new javax.swing.JRadioButton();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        rbAfirma2_si = new javax.swing.JRadioButton();
        rbAfirma2_no = new javax.swing.JRadioButton();
        jLabel91 = new javax.swing.JLabel();
        rbAfirma3_si = new javax.swing.JRadioButton();
        rbAfirma3_no = new javax.swing.JRadioButton();
        txtAfirma1 = new javax.swing.JTextField();
        txtAfirma2 = new javax.swing.JTextField();
        txtAfirma3 = new javax.swing.JTextField();
        btnAgregarEP = new javax.swing.JButton();
        btnLimpiarEP = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        txtImpEP = new javax.swing.JTextField();
        btnIMP = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        rbFactorR1_si = new javax.swing.JRadioButton();
        rbFactorR1_no = new javax.swing.JRadioButton();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        rbFactorR2_si = new javax.swing.JRadioButton();
        rbFactorR2_no = new javax.swing.JRadioButton();
        jLabel94 = new javax.swing.JLabel();
        rbFactorR3_si = new javax.swing.JRadioButton();
        rbFactorR3_no = new javax.swing.JRadioButton();
        jLabel95 = new javax.swing.JLabel();
        rbFactorR4_si = new javax.swing.JRadioButton();
        rbFactorR4_no = new javax.swing.JRadioButton();
        jLabel96 = new javax.swing.JLabel();
        rbFactorR5_si = new javax.swing.JRadioButton();
        rbFactorR5_no = new javax.swing.JRadioButton();
        jLabel97 = new javax.swing.JLabel();
        rbFactorR6_si = new javax.swing.JRadioButton();
        rbFactorR6_no = new javax.swing.JRadioButton();
        jLabel101 = new javax.swing.JLabel();
        rbFactorR7_si = new javax.swing.JRadioButton();
        rbFactorR7_no = new javax.swing.JRadioButton();
        jLabel102 = new javax.swing.JLabel();
        rbFactorR8_si = new javax.swing.JRadioButton();
        rbFactorR8_no = new javax.swing.JRadioButton();
        jLabel103 = new javax.swing.JLabel();
        rbFactorR9_si = new javax.swing.JRadioButton();
        rbFactorR9_no = new javax.swing.JRadioButton();
        jLabel104 = new javax.swing.JLabel();
        rbFactorR10_si = new javax.swing.JRadioButton();
        rbFactorR10_no = new javax.swing.JRadioButton();
        txtFactorR10 = new javax.swing.JTextField();
        txtFactorR3 = new javax.swing.JTextField();
        txtFactorR7 = new javax.swing.JTextField();

        setClosable(true);
        setTitle(" Ficha Sintomatología Covid 19");

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

        jLabel71.setText("Celular:");

        jLabel72.setText("Domicilio Actual:");

        txtDomicilioEP.setEditable(false);

        FechaExamen.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExamenPropertyChange(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel73.setText("Fecha Examen :");

        FechaNacimientoEP.setEnabled(false);

        txtLugarNacimientoEP.setEditable(false);

        jLabel75.setText("años");

        txtCelular.setEditable(false);

        btnEditarEP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarEP1.setText("Editar");
        btnEditarEP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEP1ActionPerformed(evt);
            }
        });

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Laborales"));

        jLabel76.setText("Ocupación:");

        jLabel77.setText("Area :");

        txtArea.setEditable(false);

        txtOcupaciónEP.setEditable(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel76))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel77)))
                .addGap(5, 5, 5)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOcupaciónEP, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(txtArea))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtOcupaciónEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellidosEP, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtNombresEP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FechaNacimientoEP, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(txtLugarNacimientoEP))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(txtEdadEP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel75))
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDomicilioEP, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNordenEP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarEP1)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel62)
                        .addComponent(txtNordenEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel73)
                        .addComponent(btnEditarEP1))
                    .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel22.setBackground(new java.awt.Color(153, 204, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "En los últomos catorce (14) días ha tenido alguno de los sintomas siguientes:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        rbSntoma1_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS1.add(rbSntoma1_si);
        rbSntoma1_si.setText("SI");

        rbSntoma1_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS1.add(rbSntoma1_no);
        rbSntoma1_no.setSelected(true);
        rbSntoma1_no.setText("NO");
        rbSntoma1_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSntoma1_noActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText("1. Sensación de alza térmica o fiebre (especificar)");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel82.setText("2. Tos, estornudos o dificultad para respirar");

        rbSntoma2_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS2.add(rbSntoma2_si);
        rbSntoma2_si.setText("SI");

        rbSntoma2_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS2.add(rbSntoma2_no);
        rbSntoma2_no.setSelected(true);
        rbSntoma2_no.setText("NO");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel83.setText("3. Dolor de garganta");

        rbSntoma3_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS3.add(rbSntoma3_si);
        rbSntoma3_si.setText("SI");

        rbSntoma3_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS3.add(rbSntoma3_no);
        rbSntoma3_no.setSelected(true);
        rbSntoma3_no.setText("NO");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel84.setText("4. Congestión o secreción nasal");

        rbSntoma4_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS4.add(rbSntoma4_si);
        rbSntoma4_si.setText("SI");
        rbSntoma4_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSntoma4_siActionPerformed(evt);
            }
        });

        rbSntoma4_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS4.add(rbSntoma4_no);
        rbSntoma4_no.setSelected(true);
        rbSntoma4_no.setText("NO");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel85.setText("5. Expectoración o flema amarilla o verdosa");

        rbSntoma5_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS5.add(rbSntoma5_si);
        rbSntoma5_si.setText("SI");

        rbSntoma5_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS5.add(rbSntoma5_no);
        rbSntoma5_no.setSelected(true);
        rbSntoma5_no.setText("NO");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel86.setText("6. Pérdida del olfato o perdida del gusto");

        rbSntoma6_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS6.add(rbSntoma6_si);
        rbSntoma6_si.setText("SI");

        rbSntoma6_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS6.add(rbSntoma6_no);
        rbSntoma6_no.setSelected(true);
        rbSntoma6_no.setText("NO");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel87.setText("7. Dolor abdominal, náuseas o diarrea");

        rbSntoma7_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS7.add(rbSntoma7_si);
        rbSntoma7_si.setText("SI");

        rbSntoma7_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS7.add(rbSntoma7_no);
        rbSntoma7_no.setSelected(true);
        rbSntoma7_no.setText("NO");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel88.setText("8. Dolor en el pecho");

        rbSntoma8_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS8.add(rbSntoma8_si);
        rbSntoma8_si.setText("SI");

        rbSntoma8_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS8.add(rbSntoma8_no);
        rbSntoma8_no.setSelected(true);
        rbSntoma8_no.setText("NO");

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel98.setText("9. Desorientación o confusión");

        rbSntoma9_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS9.add(rbSntoma9_si);
        rbSntoma9_si.setText("SI");

        rbSntoma9_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS9.add(rbSntoma9_no);
        rbSntoma9_no.setSelected(true);
        rbSntoma9_no.setText("NO");

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel99.setText("10. Coloración azul en los labios");

        rbSntoma10_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS10.add(rbSntoma10_si);
        rbSntoma10_si.setText("SI");

        rbSntoma10_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS10.add(rbSntoma10_no);
        rbSntoma10_no.setSelected(true);
        rbSntoma10_no.setText("NO");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel100.setText("11. Está tomando alguna medicación (detalle):");

        rbSntoma11_si.setBackground(new java.awt.Color(153, 204, 255));
        bgS11.add(rbSntoma11_si);
        rbSntoma11_si.setText("SI");

        rbSntoma11_no.setBackground(new java.awt.Color(153, 204, 255));
        bgS11.add(rbSntoma11_no);
        rbSntoma11_no.setSelected(true);
        rbSntoma11_no.setText("NO");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSntoma2_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbSntoma2_no))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSntoma4_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbSntoma4_no))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSntoma5_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbSntoma5_no))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSntoma6_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbSntoma6_no))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSntoma3_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSntoma3_no))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSntoma10_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbSntoma10_no))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSntoma11_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbSntoma11_no))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSntoma9_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbSntoma9_no))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addGap(18, 18, 18)
                        .addComponent(rbSntoma1_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbSntoma1_no)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel88)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(rbSntoma7_si)
                                .addGap(1, 1, 1)
                                .addComponent(rbSntoma7_no))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(rbSntoma8_si)
                                .addGap(1, 1, 1)
                                .addComponent(rbSntoma8_no))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSintoma11)
                            .addComponent(txtSintoma1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel81)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbSntoma1_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbSntoma1_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(txtSintoma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(rbSntoma2_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbSntoma2_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbSntoma3_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbSntoma3_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbSntoma4_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbSntoma4_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbSntoma5_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbSntoma5_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbSntoma6_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbSntoma6_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbSntoma7_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbSntoma7_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbSntoma8_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbSntoma8_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(rbSntoma10_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbSntoma10_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(rbSntoma11_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbSntoma11_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbSntoma9_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbSntoma9_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSintoma11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel23.setBackground(new java.awt.Color(153, 204, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "<html>En los últimos catorce (14) días (detallar, de ser afirmativa la respuesta):</html>", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        rbAfirma1_si.setBackground(new java.awt.Color(153, 204, 255));
        bgAF1.add(rbAfirma1_si);
        rbAfirma1_si.setText("SI");

        rbAfirma1_no.setBackground(new java.awt.Color(153, 204, 255));
        bgAF1.add(rbAfirma1_no);
        rbAfirma1_no.setSelected(true);
        rbAfirma1_no.setText("NO");

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel89.setText("<html>1. Ha tenido contacto con personas casos sospechosos o confirmados de COVID-19</html>");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel90.setText("2. Ha viajado al exterior");

        rbAfirma2_si.setBackground(new java.awt.Color(153, 204, 255));
        bgAF2.add(rbAfirma2_si);
        rbAfirma2_si.setText("SI");

        rbAfirma2_no.setBackground(new java.awt.Color(153, 204, 255));
        bgAF2.add(rbAfirma2_no);
        rbAfirma2_no.setSelected(true);
        rbAfirma2_no.setText("NO");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel91.setText("3. Ha visitado un establecimiento de salud");

        rbAfirma3_si.setBackground(new java.awt.Color(153, 204, 255));
        bgAF3.add(rbAfirma3_si);
        rbAfirma3_si.setText("SI");

        rbAfirma3_no.setBackground(new java.awt.Color(153, 204, 255));
        bgAF3.add(rbAfirma3_no);
        rbAfirma3_no.setSelected(true);
        rbAfirma3_no.setText("NO");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel90)
                    .addComponent(jLabel91)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(79, 79, 79))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(txtAfirma3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAfirma1)
                            .addComponent(txtAfirma2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                    .addComponent(rbAfirma1_si)
                                    .addGap(1, 1, 1)
                                    .addComponent(rbAfirma1_no))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                    .addComponent(rbAfirma2_si)
                                    .addGap(1, 1, 1)
                                    .addComponent(rbAfirma2_no)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(rbAfirma3_si)
                                .addGap(1, 1, 1)
                                .addComponent(rbAfirma3_no))))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtAfirma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtAfirma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(rbAfirma1_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAfirma1_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(rbAfirma2_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAfirma2_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(rbAfirma3_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAfirma3_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addComponent(txtAfirma3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregarEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnAgregarEP.setMnemonic('g');
        btnAgregarEP.setText("Guardar/Actualizar");
        btnAgregarEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEPActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarEP)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarEP)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(113, 113, 113))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEP)
                    .addComponent(btnLimpiarEP))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Sintomas", jPanel21);

        jPanel24.setBackground(new java.awt.Color(153, 204, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tiene los siguientes factores de riesgo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        rbFactorR1_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF1.add(rbFactorR1_si);
        rbFactorR1_si.setText("SI");

        rbFactorR1_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF1.add(rbFactorR1_no);
        rbFactorR1_no.setSelected(true);
        rbFactorR1_no.setText("NO");
        rbFactorR1_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFactorR1_noActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel92.setText("1. Edad mayor de 65 años");

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setText("2. Hipertensión arterial");

        rbFactorR2_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF2.add(rbFactorR2_si);
        rbFactorR2_si.setText("SI");

        rbFactorR2_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF2.add(rbFactorR2_no);
        rbFactorR2_no.setSelected(true);
        rbFactorR2_no.setText("NO");

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel94.setText("3. Enfermedad cardiovascular (especificar)");

        rbFactorR3_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF3.add(rbFactorR3_si);
        rbFactorR3_si.setText("SI");

        rbFactorR3_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF3.add(rbFactorR3_no);
        rbFactorR3_no.setSelected(true);
        rbFactorR3_no.setText("NO");

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel95.setText("4. Cáncer");

        rbFactorR4_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF4.add(rbFactorR4_si);
        rbFactorR4_si.setText("SI");
        rbFactorR4_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFactorR4_siActionPerformed(evt);
            }
        });

        rbFactorR4_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF4.add(rbFactorR4_no);
        rbFactorR4_no.setSelected(true);
        rbFactorR4_no.setText("NO");

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel96.setText("5. Diabetes mellitus");

        rbFactorR5_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF5.add(rbFactorR5_si);
        rbFactorR5_si.setText("SI");

        rbFactorR5_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF5.add(rbFactorR5_no);
        rbFactorR5_no.setSelected(true);
        rbFactorR5_no.setText("NO");

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel97.setText("6. Obesidad con IMC de 40 a más");

        rbFactorR6_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF6.add(rbFactorR6_si);
        rbFactorR6_si.setText("SI");

        rbFactorR6_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF6.add(rbFactorR6_no);
        rbFactorR6_no.setSelected(true);
        rbFactorR6_no.setText("NO");

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel101.setText("7.  Asma o enfermedad pulmonar crónica (detallar)");

        rbFactorR7_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF7.add(rbFactorR7_si);
        rbFactorR7_si.setText("SI");

        rbFactorR7_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF7.add(rbFactorR7_no);
        rbFactorR7_no.setSelected(true);
        rbFactorR7_no.setText("NO");

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel102.setText("8. Insuficiencia renal crónica");

        rbFactorR8_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF8.add(rbFactorR8_si);
        rbFactorR8_si.setText("SI");

        rbFactorR8_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF8.add(rbFactorR8_no);
        rbFactorR8_no.setSelected(true);
        rbFactorR8_no.setText("NO");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel103.setText("<html>9. Enfermedad, tratamiento inmunosupresor u otro estado de inmunosupresión</html>");

        rbFactorR9_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF9.add(rbFactorR9_si);
        rbFactorR9_si.setText("SI");

        rbFactorR9_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF9.add(rbFactorR9_no);
        rbFactorR9_no.setSelected(true);
        rbFactorR9_no.setText("NO");

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel104.setText("10. Otro (detallar)");

        rbFactorR10_si.setBackground(new java.awt.Color(153, 204, 255));
        bgF10.add(rbFactorR10_si);
        rbFactorR10_si.setText("SI");

        rbFactorR10_no.setBackground(new java.awt.Color(153, 204, 255));
        bgF10.add(rbFactorR10_no);
        rbFactorR10_no.setSelected(true);
        rbFactorR10_no.setText("NO");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbFactorR2_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbFactorR2_no))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbFactorR4_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbFactorR4_no))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbFactorR5_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbFactorR5_no))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbFactorR6_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbFactorR6_no))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbFactorR3_si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFactorR3_no))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbFactorR10_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbFactorR10_no))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel102)
                            .addComponent(jLabel101))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(rbFactorR7_si)
                                .addGap(1, 1, 1)
                                .addComponent(rbFactorR7_no))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(rbFactorR8_si)
                                .addGap(1, 1, 1)
                                .addComponent(rbFactorR8_no))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(rbFactorR9_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbFactorR9_no))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtFactorR3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFactorR10, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbFactorR1_si)
                        .addGap(1, 1, 1)
                        .addComponent(rbFactorR1_no)))
                .addContainerGap())
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFactorR7, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel92)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbFactorR1_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbFactorR1_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbFactorR2_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbFactorR2_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbFactorR3_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbFactorR3_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFactorR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbFactorR4_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbFactorR4_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbFactorR5_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbFactorR5_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel97)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbFactorR6_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbFactorR6_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbFactorR7_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbFactorR7_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(txtFactorR7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbFactorR8_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbFactorR8_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(rbFactorR10_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbFactorR10_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(rbFactorR9_si, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbFactorR9_no, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(txtFactorR10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        jTabbedPane1.addTab("Ficha Sintomatología", jPanel13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(2, 2, 2))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Ficha Sintomatología");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNordenEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenEPActionPerformed
        if(!oPe.nOrden(txtNordenEP, "ficha_sintomatologica_covid19")){ 
        String Sql="select d.nombres_pa,d.apellidos_pa,"
                 + "d.fecha_nacimiento_pa,d.lugar_nac_pa,"
                 + "d.direccion_pa,d.cel_pa,"
                 + "n.area_o,"
                 + "n.cargo_de "
                 + "From datos_paciente as d"
                + " INNER JOIN n_orden_ocupacional as n on (n.cod_pa=d.cod_pa) "
                 + " where n.n_orden ='"+txtNordenEP.getText()+"'";
        
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombresEP.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidosEP.setText(oConn.setResult.getString("apellidos_pa"));
                        FechaNacimientoEP.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtLugarNacimientoEP.setText(oConn.setResult.getString("lugar_nac_pa"));
                        txtDomicilioEP.setText(oConn.setResult.getString("direccion_pa"));
                        txtCelular.setText(oConn.setResult.getString("cel_pa"));
                        txtOcupaciónEP.setText(oConn.setResult.getString("cargo_de"));
                        txtArea.setText(oConn.setResult.getString("area_o"));
                        txtEdadEP.setText(String.valueOf(calcularEdad(FechaNacimientoEP.getCalendar())) );
                        txtNordenEP.setEnabled(false);    
                        oPe.fecha(FechaExamen);
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
                    } catch (SQLException ex) {
                        oFunc.SubSistemaMensajeInformacion("Evaluacion Psicologica:" + ex.getMessage().toString());
                    }
        }
    }//GEN-LAST:event_txtNordenEPActionPerformed

    private void FechaExamenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExamenPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaExamenPropertyChange

    private void btnEditarEP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEP1ActionPerformed
         String Sql="select d.nombres_pa,d.apellidos_pa,"
                 + "d.fecha_nacimiento_pa,d.lugar_nac_pa,"
                 + "d.direccion_pa,d.cel_pa,d.ocupacion_pa,"
                 + "n.cargo_de,area_o,f.* "
                 + "From datos_paciente as d "
               + "inner join n_orden_ocupacional as n on(d.cod_pa = n.cod_pa) "
               + "inner join ficha_sintomatologica_covid19 as f on(n.n_orden = f.n_orden) "
                 + "where  n.n_orden ='"+txtNordenEP.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombresEP.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidosEP.setText(oConn.setResult.getString("apellidos_pa"));
                        FechaNacimientoEP.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtLugarNacimientoEP.setText(oConn.setResult.getString("lugar_nac_pa"));
                        txtDomicilioEP.setText(oConn.setResult.getString("direccion_pa"));
                        txtCelular.setText(oConn.setResult.getString("cel_pa"));
                        txtOcupaciónEP.setText(oConn.setResult.getString("cargo_de"));
                        txtArea.setText(oConn.setResult.getString("area_o"));
                        txtEdadEP.setText(String.valueOf(calcularEdad(FechaNacimientoEP.getCalendar())) );
                        FechaExamen.setDate(oConn.setResult.getDate("fecha_examen"));
                        rbSntoma1_si.setSelected(oConn.setResult.getBoolean("rbsintoma1_si"));
                        rbSntoma1_no.setSelected(oConn.setResult.getBoolean("rbsintoma1_no"));
                        txtSintoma1.setText(oConn.setResult.getString("txtsintoma1"));
                        
                        rbSntoma2_si.setSelected(oConn.setResult.getBoolean("rbsintoma2_si"));
                        rbSntoma2_no.setSelected(oConn.setResult.getBoolean("rbsintoma2_no"));
                        
                        rbSntoma3_si.setSelected(oConn.setResult.getBoolean("rbsintoma3_si"));
                        rbSntoma3_no.setSelected(oConn.setResult.getBoolean("rbsintoma3_no"));
                        rbSntoma4_si.setSelected(oConn.setResult.getBoolean("rbsintoma4_si"));
                        rbSntoma4_no.setSelected(oConn.setResult.getBoolean("rbsintoma4_no"));
                        
                        rbSntoma5_si.setSelected(oConn.setResult.getBoolean("rbsintoma5_si"));
                        rbSntoma5_no.setSelected(oConn.setResult.getBoolean("rbsintoma5_no"));
                        
                        rbSntoma6_si.setSelected(oConn.setResult.getBoolean("rbsintoma6_si"));
                        rbSntoma6_no.setSelected(oConn.setResult.getBoolean("rbsintoma6_no"));
                        
                        rbSntoma7_si.setSelected(oConn.setResult.getBoolean("rbsintoma7_si"));
                        rbSntoma7_no.setSelected(oConn.setResult.getBoolean("rbsintoma7_no"));
                        
                        rbSntoma8_si.setSelected(oConn.setResult.getBoolean("rbsintoma8_si"));
                        rbSntoma8_no.setSelected(oConn.setResult.getBoolean("rbsintoma8_no"));
                        
                        rbSntoma9_si.setSelected(oConn.setResult.getBoolean("rbsintoma9_si"));
                        rbSntoma9_no.setSelected(oConn.setResult.getBoolean("rbsintoma9_no"));
                        
                        rbSntoma10_si.setSelected(oConn.setResult.getBoolean("rbsintoma10_si"));
                        rbSntoma10_no.setSelected(oConn.setResult.getBoolean("rbsintoma10_no"));
                        
                        rbSntoma11_si.setSelected(oConn.setResult.getBoolean("rbsintoma11_si"));
                        rbSntoma11_no.setSelected(oConn.setResult.getBoolean("rbsintoma11_no"));
                        txtSintoma11.setText(oConn.setResult.getString("txtsintoma11"));
                        
                        rbAfirma1_si.setSelected(oConn.setResult.getBoolean("rbafirma1_si"));
                        rbAfirma1_no.setSelected(oConn.setResult.getBoolean("rbafirma1_no"));
                        txtAfirma1.setText(oConn.setResult.getString("txtafirma1"));
                        
                        rbAfirma2_si.setSelected(oConn.setResult.getBoolean("rbafirma2_si"));
                        rbAfirma2_no.setSelected(oConn.setResult.getBoolean("rbafirma2_no"));
                        txtAfirma2.setText(oConn.setResult.getString("txtafirma2"));
                        
                        rbAfirma3_si.setSelected(oConn.setResult.getBoolean("rbafirma3_si"));
                        rbAfirma3_no.setSelected(oConn.setResult.getBoolean("rbafirma3_no"));
                        txtAfirma3.setText(oConn.setResult.getString("txtafirma3"));
                        
                        rbFactorR1_si.setSelected(oConn.setResult.getBoolean("rbfactorr1_si"));
                        rbFactorR1_no.setSelected(oConn.setResult.getBoolean("rbfactorr1_no"));
                        
                        rbFactorR2_si.setSelected(oConn.setResult.getBoolean("rbfactorr2_si"));
                        rbFactorR2_no.setSelected(oConn.setResult.getBoolean("rbfactorr2_no"));
                        
                        rbFactorR3_si.setSelected(oConn.setResult.getBoolean("rbfactorr3_si"));
                        rbFactorR3_no.setSelected(oConn.setResult.getBoolean("rbfactorr3_no"));
                        txtFactorR3.setText(oConn.setResult.getString("txtfactorr3"));
                        
                        rbFactorR4_si.setSelected(oConn.setResult.getBoolean("rbfactorr4_si"));
                        rbFactorR4_no.setSelected(oConn.setResult.getBoolean("rbfactorr4_no"));
                        
                        rbFactorR5_si.setSelected(oConn.setResult.getBoolean("rbfactorr5_si"));
                        rbFactorR5_no.setSelected(oConn.setResult.getBoolean("rbfactorr5_no"));
                        
                        rbFactorR6_si.setSelected(oConn.setResult.getBoolean("rbfactorr6_si"));
                        rbFactorR6_no.setSelected(oConn.setResult.getBoolean("rbfactorr6_no"));
                        
                        rbFactorR7_si.setSelected(oConn.setResult.getBoolean("rbfactorr7_si"));
                        rbFactorR7_no.setSelected(oConn.setResult.getBoolean("rbfactorr7_no"));
                        txtFactorR7.setText(oConn.setResult.getString("txtfactorr7"));
                        
                        rbFactorR8_si.setSelected(oConn.setResult.getBoolean("rbfactorr8_si"));
                        rbFactorR8_no.setSelected(oConn.setResult.getBoolean("rbfactorr8_no"));
                        
                        rbFactorR9_si.setSelected(oConn.setResult.getBoolean("rbfactorr9_si"));
                        rbFactorR9_no.setSelected(oConn.setResult.getBoolean("rbfactorr9_no"));
                        
                        rbFactorR10_si.setSelected(oConn.setResult.getBoolean("rbfactorr10_si"));
                        rbFactorR10_no.setSelected(oConn.setResult.getBoolean("rbfactorr10_no"));
                        txtFactorR10.setText(oConn.setResult.getString("txtfactorr10"));
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Evaluacion Psicologica:" + ex.getMessage().toString());
            }
        
    }//GEN-LAST:event_btnEditarEP1ActionPerformed

    private void btnLimpiarEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEPActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarEPActionPerformed

    private void txtImpEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpEPActionPerformed
        print(Integer.parseInt(txtImpEP.getText()));
    }//GEN-LAST:event_txtImpEPActionPerformed

    private void txtImpEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpEPKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtImpEPKeyTyped

    private void btnIMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPActionPerformed
        print(Integer.parseInt(txtImpEP.getText()));
    }//GEN-LAST:event_btnIMPActionPerformed

    private void btnAgregarEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEPActionPerformed
         if(oPe.nOrden(txtNordenEP, "ficha_sintomatologica_covid19"))  {
           actualizar();
       }else{
            Agregar();
       }
      
    }//GEN-LAST:event_btnAgregarEPActionPerformed

    private void rbSntoma1_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSntoma1_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSntoma1_noActionPerformed

    private void rbSntoma4_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSntoma4_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSntoma4_siActionPerformed

    private void rbFactorR1_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFactorR1_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFactorR1_noActionPerformed

    private void rbFactorR4_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFactorR4_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFactorR4_siActionPerformed
     private void Agregar(){
         if(!txtNordenEP.getText().isEmpty()){
            if(!oPe.nOrden(txtNordenEP, "ficha_sintomatologica_covid19")){
                if(validarEP()){
                    String strSqlStmt;
                    String query;
                    strSqlStmt="INSERT INTO ficha_sintomatologica_covid19(\n" ;
                    query="Values('";
                    strSqlStmt += "n_orden";query += txtNordenEP.getText()+ "'";
                    strSqlStmt += ",fecha_examen";query += ",'"+FechaExamen.getDate()+ "'";
                    strSqlStmt += ",rbsintoma1_si";query += ",'"+rbSntoma1_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma1_no";query += ",'"+rbSntoma1_no.isSelected()+ "'";
                    strSqlStmt += ",txtsintoma1";query += ",'"+txtSintoma1.getText()+ "'";
                    strSqlStmt += ",rbsintoma2_si";query += ",'"+rbSntoma2_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma2_no";query += ",'"+rbSntoma2_no.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma3_si";query += ",'"+rbSntoma3_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma3_no";query += ",'"+rbSntoma3_no.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma4_si";query += ",'"+rbSntoma4_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma4_no";query += ",'"+rbSntoma4_no.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma5_si";query += ",'"+rbSntoma5_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma5_no";query += ",'"+rbSntoma5_no.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma6_si";query += ",'"+rbSntoma6_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma6_no";query += ",'"+rbSntoma6_no.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma7_si";query += ",'"+rbSntoma7_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma7_no";query += ",'"+rbSntoma7_no.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma8_si";query += ",'"+rbSntoma8_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma8_no";query += ",'"+rbSntoma8_no.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma9_si";query += ",'"+rbSntoma9_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma9_no";query += ",'"+rbSntoma9_no.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma10_si";query += ",'"+rbSntoma10_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma10_no";query += ",'"+rbSntoma10_no.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma11_si";query += ",'"+rbSntoma11_si.isSelected()+ "'";
                    strSqlStmt += ",rbsintoma11_no";query += ",'"+rbSntoma11_no.isSelected()+ "'";
                    strSqlStmt += ",txtsintoma11";query += ",'"+txtSintoma11.getText()+ "'";
                    strSqlStmt += ",rbafirma1_si";query += ",'"+rbAfirma1_si.isSelected()+ "'";
                    strSqlStmt += ",rbafirma1_no";query += ",'"+rbAfirma1_no.isSelected()+ "'";
                    strSqlStmt += ",txtafirma1";query += ",'"+txtAfirma1.getText()+ "'";
                    strSqlStmt += ",rbafirma2_si";query += ",'"+rbAfirma2_si.isSelected()+ "'";
                    strSqlStmt += ",rbafirma2_no";query += ",'"+rbAfirma2_no.isSelected()+ "'";
                    strSqlStmt += ",txtafirma2";query += ",'"+txtAfirma2.getText()+ "'";
                    strSqlStmt += ",rbafirma3_si";query += ",'"+rbAfirma3_si.isSelected()+ "'";
                    strSqlStmt += ",rbafirma3_no";query += ",'"+rbAfirma3_no.isSelected()+ "'";
                    strSqlStmt += ",txtafirma3";query += ",'"+txtAfirma3.getText()+ "'";
                    strSqlStmt += ",rbfactorr1_si";query += ",'"+rbFactorR1_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr1_no";query += ",'"+rbFactorR1_no.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr2_si";query += ",'"+rbFactorR2_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr2_no";query += ",'"+rbFactorR2_no.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr3_si";query += ",'"+rbFactorR3_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr3_no";query += ",'"+rbFactorR3_no.isSelected()+ "'";
                    strSqlStmt += ",txtfactorr3";query += ",'"+txtFactorR3.getText()+ "'";
                    strSqlStmt += ",rbfactorr4_si";query += ",'"+rbFactorR4_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr4_no";query += ",'"+rbFactorR4_no.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr5_si";query += ",'"+rbFactorR5_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr5_no";query += ",'"+rbFactorR5_no.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr6_si";query += ",'"+rbFactorR6_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr6_no";query += ",'"+rbFactorR6_no.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr7_si";query += ",'"+rbFactorR7_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr7_no";query += ",'"+rbFactorR7_no.isSelected()+ "'";
                    strSqlStmt += ",txtfactorr7";query += ",'"+txtFactorR7.getText()+ "'";
                    strSqlStmt += ",rbfactorr8_si";query += ",'"+rbFactorR8_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr8_no";query += ",'"+rbFactorR8_no.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr9_si";query += ",'"+rbFactorR9_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr9_no";query += ",'"+rbFactorR9_no.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr10_si";query += ",'"+rbFactorR10_si.isSelected()+ "'";
                    strSqlStmt += ",rbfactorr10_no";query += ",'"+rbFactorR10_no.isSelected()+ "'";
                    strSqlStmt += ",txtfactorr10";query += ",'"+txtFactorR10.getText()+ "'";
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + query.concat(")"))){
                        oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                        imprimir();
                        limpiar(); 
                   }else{oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");} 
                }
             }
        }else { oFunc.SubSistemaMensajeError("Llene los Campos correctamente");
            txtNordenEP.requestFocus();}
     }
     private void actualizar(){
        if(!txtNordenEP.getText().isEmpty()){
            if(validarEP()){
                String strSqlStmt;
                strSqlStmt="UPDATE ficha_sintomatologica_covid19\n" +
                "   SET fecha_examen='"+FechaExamen.getDate()+"'"
                        + ", rbsintoma1_si='"+rbSntoma1_si.isSelected()+"'"
                        + ", rbsintoma1_no='"+rbSntoma1_no.isSelected()+"'"
                        + ", txtsintoma1='"+txtSintoma1.getText()+"'"
                        + ", rbsintoma2_si='"+rbSntoma2_si.isSelected()+"'"
                        + ", rbsintoma2_no='"+rbSntoma2_no.isSelected()+"'"
                        + ", rbsintoma3_si='"+rbSntoma3_si.isSelected()+"'"
                        + ", rbsintoma3_no='"+rbSntoma3_no.isSelected()+"'"
                        +", rbsintoma4_si='"+rbSntoma4_si.isSelected()+"'"
                        + ", rbsintoma4_no='"+rbSntoma4_no.isSelected()+"'"
                        + ", rbsintoma5_si='"+rbSntoma5_si.isSelected()+"'"
                        + ", rbsintoma5_no='"+rbSntoma5_no.isSelected()+"'"
                        + ", rbsintoma6_si='"+rbSntoma6_si.isSelected()+"'"
                        + ", rbsintoma6_no='"+rbSntoma6_no.isSelected()+"'"
                        + ", rbsintoma7_si='"+rbSntoma7_si.isSelected()+"'"
                        + ", rbsintoma7_no='"+rbSntoma7_no.isSelected()+"'"
                        + ", rbsintoma8_si='"+rbSntoma8_si.isSelected()+"'"
                        + ", rbsintoma8_no='"+rbSntoma8_no.isSelected()+"'"
                        + ", rbsintoma9_si='"+rbSntoma9_si.isSelected()+"'"
                        + ", rbsintoma9_no='"+rbSntoma9_no.isSelected()+"'"
                        + ", rbsintoma10_si='"+rbSntoma10_si.isSelected()+"'"
                        + ", rbsintoma10_no='"+rbSntoma10_no.isSelected()+"'"
                        + ", rbsintoma11_si='"+rbSntoma11_si.isSelected()+"'"
                        + ", rbsintoma11_no='"+rbSntoma11_no.isSelected()+"'"
                        + ", txtsintoma11='"+txtSintoma11.getText()+"'"
                        + ", rbafirma1_si='"+rbAfirma1_si.isSelected()+"'"
                        + ", rbafirma1_no='"+rbAfirma1_no.isSelected()+"'"
                        + ", txtafirma1='"+txtAfirma1.getText()+"'"
                        + ", rbafirma2_si='"+rbAfirma2_si.isSelected()+"'"
                        + ", rbafirma2_no='"+rbAfirma2_no.isSelected()+"'"
                        + ", txtafirma2='"+txtAfirma2.getText()+"'"
                        + ", rbafirma3_si='"+rbAfirma3_si.isSelected()+"'"
                        + ", rbafirma3_no='"+rbAfirma3_no.isSelected()+"'"
                        + ", txtafirma3='"+txtAfirma3.getText()+"'"
                        + ", rbfactorr1_si='"+rbFactorR1_si.isSelected()+"'"
                        + ", rbfactorr1_no='"+rbFactorR1_no.isSelected()+"'"
                        + ", rbfactorr2_si='"+rbFactorR2_si.isSelected()+"'"
                        + ", rbfactorr2_no='"+rbFactorR2_no.isSelected()+"'"
                        + ", rbfactorr3_si='"+rbFactorR3_si.isSelected()+"'"
                        + ", rbfactorr3_no='"+rbFactorR3_no.isSelected()+"'"
                        + ", txtfactorr3='"+txtFactorR3.getText()+"'"
                        + ", rbfactorr4_si='"+rbFactorR4_si.isSelected()+"'"
                        + ", rbfactorr4_no='"+rbFactorR4_no.isSelected()+"'" 
                        + ", rbfactorr5_si='"+rbFactorR5_si.isSelected()+"'"
                        + ", rbfactorr5_no='"+rbFactorR5_no.isSelected()+"'" 
                        
                        + ", rbfactorr6_si='"+rbFactorR6_si.isSelected()+"'"
                        + ", rbfactorr6_no='"+rbFactorR6_no.isSelected()+"'" 
                        
                        + ", rbfactorr7_si='"+rbFactorR7_si.isSelected()+"'"
                        + ", rbfactorr7_no='"+rbFactorR7_no.isSelected()+"'" 
                        + ", txtfactorr7='"+txtFactorR7.getText()+"'"
                        
                        + ", rbfactorr8_si='"+rbFactorR8_si.isSelected()+"'" 
                        + ", rbfactorr8_no='"+rbFactorR8_no.isSelected()+"'"
                        
                        + ", rbfactorr9_si='"+rbFactorR9_si.isSelected()+"'"
                        + ", rbfactorr9_no='"+rbFactorR9_no.isSelected()+"'"
                        
                        + ", rbfactorr10_si='"+rbFactorR10_si.isSelected()+"'" 
                        + ", rbfactorr10_no='"+rbFactorR10_no.isSelected()+"'"
                        + ", txtfactorr10='"+txtFactorR10.getText()+"'" +
                              
                " WHERE n_orden='"+txtNordenEP.getText()+ "'";
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                    oFunc.SubSistemaMensajeInformacion("Se ha actualizado con Éxito");
                    imprimir();
                    limpiar();   
                }else{
                     oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                       }
            }
        }
    }
    private boolean imprimir() {
        boolean im = false;
        int seleccion = JOptionPane.showOptionDialog(
                this, // Componente padre
                "¿Desea Imprimir?", //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");
        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {
                printer(Integer.valueOf(txtNordenEP.getText().toString()));
                im = true;
            } else {
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"FichaSintomatologiaCovid19.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer.viewReport(jasperPrint, false);
                    JasperPrintManager.printReport(jasperPrint,true);
//                  JasperExportManager.exportReportToPdfFile( jasperPrint, "E:/prueba/reporte.pdf");
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
     private void print(Integer cod) {

        Map parameters = new HashMap();
        parameters.put("Norden", cod);

        try {
            String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "FichaSintomatologiaCovid19.jasper";
            JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
            JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
            JasperViewer viewer = new JasperViewer(myPrint, false);
            viewer.setTitle("Resultados de la ficha sintomatologica ");
            // viewer.setAchkReactivoIgmtrue);
            viewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaExamen;
    private com.toedter.calendar.JDateChooser FechaNacimientoEP;
    private javax.swing.ButtonGroup bgAF1;
    private javax.swing.ButtonGroup bgAF2;
    private javax.swing.ButtonGroup bgAF3;
    private javax.swing.ButtonGroup bgF1;
    private javax.swing.ButtonGroup bgF10;
    private javax.swing.ButtonGroup bgF2;
    private javax.swing.ButtonGroup bgF3;
    private javax.swing.ButtonGroup bgF4;
    private javax.swing.ButtonGroup bgF5;
    private javax.swing.ButtonGroup bgF6;
    private javax.swing.ButtonGroup bgF7;
    private javax.swing.ButtonGroup bgF8;
    private javax.swing.ButtonGroup bgF9;
    private javax.swing.ButtonGroup bgS1;
    private javax.swing.ButtonGroup bgS10;
    private javax.swing.ButtonGroup bgS11;
    private javax.swing.ButtonGroup bgS2;
    private javax.swing.ButtonGroup bgS3;
    private javax.swing.ButtonGroup bgS4;
    private javax.swing.ButtonGroup bgS5;
    private javax.swing.ButtonGroup bgS6;
    private javax.swing.ButtonGroup bgS7;
    private javax.swing.ButtonGroup bgS8;
    private javax.swing.ButtonGroup bgS9;
    private javax.swing.JButton btnAgregarEP;
    private javax.swing.JButton btnEditarEP1;
    private javax.swing.JButton btnIMP;
    private javax.swing.JButton btnLimpiarEP;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
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
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JRadioButton rbAfirma1_no;
    private javax.swing.JRadioButton rbAfirma1_si;
    private javax.swing.JRadioButton rbAfirma2_no;
    private javax.swing.JRadioButton rbAfirma2_si;
    private javax.swing.JRadioButton rbAfirma3_no;
    private javax.swing.JRadioButton rbAfirma3_si;
    private javax.swing.JRadioButton rbFactorR10_no;
    private javax.swing.JRadioButton rbFactorR10_si;
    private javax.swing.JRadioButton rbFactorR1_no;
    private javax.swing.JRadioButton rbFactorR1_si;
    private javax.swing.JRadioButton rbFactorR2_no;
    private javax.swing.JRadioButton rbFactorR2_si;
    private javax.swing.JRadioButton rbFactorR3_no;
    private javax.swing.JRadioButton rbFactorR3_si;
    private javax.swing.JRadioButton rbFactorR4_no;
    private javax.swing.JRadioButton rbFactorR4_si;
    private javax.swing.JRadioButton rbFactorR5_no;
    private javax.swing.JRadioButton rbFactorR5_si;
    private javax.swing.JRadioButton rbFactorR6_no;
    private javax.swing.JRadioButton rbFactorR6_si;
    private javax.swing.JRadioButton rbFactorR7_no;
    private javax.swing.JRadioButton rbFactorR7_si;
    private javax.swing.JRadioButton rbFactorR8_no;
    private javax.swing.JRadioButton rbFactorR8_si;
    private javax.swing.JRadioButton rbFactorR9_no;
    private javax.swing.JRadioButton rbFactorR9_si;
    private javax.swing.JRadioButton rbSntoma10_no;
    private javax.swing.JRadioButton rbSntoma10_si;
    private javax.swing.JRadioButton rbSntoma11_no;
    private javax.swing.JRadioButton rbSntoma11_si;
    private javax.swing.JRadioButton rbSntoma1_no;
    private javax.swing.JRadioButton rbSntoma1_si;
    private javax.swing.JRadioButton rbSntoma2_no;
    private javax.swing.JRadioButton rbSntoma2_si;
    private javax.swing.JRadioButton rbSntoma3_no;
    private javax.swing.JRadioButton rbSntoma3_si;
    private javax.swing.JRadioButton rbSntoma4_no;
    private javax.swing.JRadioButton rbSntoma4_si;
    private javax.swing.JRadioButton rbSntoma5_no;
    private javax.swing.JRadioButton rbSntoma5_si;
    private javax.swing.JRadioButton rbSntoma6_no;
    private javax.swing.JRadioButton rbSntoma6_si;
    private javax.swing.JRadioButton rbSntoma7_no;
    private javax.swing.JRadioButton rbSntoma7_si;
    private javax.swing.JRadioButton rbSntoma8_no;
    private javax.swing.JRadioButton rbSntoma8_si;
    private javax.swing.JRadioButton rbSntoma9_no;
    private javax.swing.JRadioButton rbSntoma9_si;
    private javax.swing.JTextField txtAfirma1;
    private javax.swing.JTextField txtAfirma2;
    private javax.swing.JTextField txtAfirma3;
    private javax.swing.JTextField txtApellidosEP;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDomicilioEP;
    private javax.swing.JTextField txtEdadEP;
    private javax.swing.JTextField txtFactorR10;
    private javax.swing.JTextField txtFactorR3;
    private javax.swing.JTextField txtFactorR7;
    private javax.swing.JTextField txtImpEP;
    private javax.swing.JTextField txtLugarNacimientoEP;
    private javax.swing.JTextField txtNombresEP;
    private javax.swing.JTextField txtNordenEP;
    private javax.swing.JTextField txtOcupaciónEP;
    private javax.swing.JTextField txtSintoma1;
    private javax.swing.JTextField txtSintoma11;
    // End of variables declaration//GEN-END:variables

public void limpiar(){
    txtNordenEP.setText(null);
    txtNombresEP.setText(null);
    txtApellidosEP.setText(null);
    FechaNacimientoEP.setDate(null);
    txtLugarNacimientoEP.setText(null);
    txtEdadEP.setText(null);
    txtDomicilioEP.setText(null);
    txtOcupaciónEP.setText(null);
    txtArea.setText(null);
    txtCelular.setText(null);
    FechaExamen.setDate(null);
    bgS1.clearSelection();
    bgS2.clearSelection();
    bgS3.clearSelection();
    bgS4.clearSelection();
    bgS5.clearSelection();
    bgS6.clearSelection();
    bgS7.clearSelection();
    bgS8.clearSelection();
    bgS9.clearSelection();
    bgS10.clearSelection();
    bgS11.clearSelection();
    bgF1.clearSelection();
    bgF2.clearSelection();
    bgF3.clearSelection();
    bgF4.clearSelection();
    bgF5.clearSelection();
    bgF6.clearSelection();
    bgF7.clearSelection();
    bgF8.clearSelection();
    bgF9.clearSelection();
    bgF10.clearSelection();
    bgAF1.clearSelection();
    bgAF2.clearSelection();
    bgAF3.clearSelection();
    txtNordenEP.setEnabled(true);
    txtNordenEP.requestFocusInWindow();
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
if (((JTextField)FechaExamen.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de examen");bResultado = false;}
    if(txtNordenEP.getText().isEmpty()){bResultado = false;}
 
   return bResultado;
}




}
