/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
public final class FichaTriaje extends javax.swing.JInternalFrame {
 clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
        javax.swing.ImageIcon oIconoNo = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/xx.png"));
        javax.swing.ImageIcon oNo = null;
String[]Triaje = new String[]{};
     DefaultTableModel model;
   public FichaTriaje() {
      initComponents();
   
      
      CargarEmpresas();
      CargarContratas();
      CargarServicios();
       HabilitaReOr();
       sbCargarDatosOcupacional("");
       jtTriaje.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/reportes.png")));
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTriaje = new javax.swing.ButtonGroup();
        btBuscar = new javax.swing.ButtonGroup();
        tipoPaciente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboEmpresa = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cboContratas = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cboTipoServicio = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        FechaTriaje = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtHistorial = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblBuscarID1 = new javax.swing.JLabel();
        rbRecibo = new javax.swing.JRadioButton();
        rbOrden = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        chkAsistencial = new javax.swing.JCheckBox();
        chkRocupacional = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPesoTriaje = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtImcTriaje = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCinturaTriaje = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCaderaTriaje = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTemperaturaTriaje = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFcardiacaTriaje = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSatTriaje = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtIccTriaje = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPerimetroCuelloTriaje = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtSistolicaTriaje = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtDiastolicaTriaje = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtFRespiratoriaTriaje = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFvcTriaje = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFevTriaje = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtFevFvcTriaje = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtFefTriaje = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConclusionTriaje = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        chkPacientes = new javax.swing.JCheckBox();
        chkOcupacional = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        txtBuscarCod = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiarCancelarTriaje = new javax.swing.JButton();
        jtTriaje = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTriaje = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        atxtObservacionesAltura = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        btnDiagnostico = new javax.swing.JButton();
        txtEditar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ingreso datos Triaje");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos"));

        jLabel1.setText("Empresa:");

        cboEmpresa.setEditable(true);
        cboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresaActionPerformed(evt);
            }
        });

        jLabel2.setText("Contrata:");

        cboContratas.setEditable(true);
        cboContratas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboContratasActionPerformed(evt);
            }
        });

        jLabel3.setText("Ex.Médico :");

        cboTipoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoServicioActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombres:");

        jLabel6.setText("Apellidos:");

        jLabel7.setText("Fecha Nac:");

        FechaNacimiento.setDateFormatString("dd-MM-yyyy");

        FechaTriaje.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaTriajePropertyChange(evt);
            }
        });

        jLabel8.setText("Fecha Triaje:");

        jLabel32.setText("N° Historial :");

        txtHistorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistorialKeyPressed(evt);
            }
        });

        jLabel28.setText("Nro:");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        lblBuscarID1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        lblBuscarID1.setText("buscar");
        lblBuscarID1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarID1MouseClicked(evt);
            }
        });

        bgTriaje.add(rbRecibo);
        rbRecibo.setText("Recibo");
        rbRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReciboActionPerformed(evt);
            }
        });

        bgTriaje.add(rbOrden);
        rbOrden.setSelected(true);
        rbOrden.setText("N° Orden");
        rbOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOrdenActionPerformed(evt);
            }
        });

        jLabel33.setText("Edad:");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        tipoPaciente.add(chkAsistencial);
        chkAsistencial.setText(" Asistencial");
        chkAsistencial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkAsistencialMouseClicked(evt);
            }
        });

        tipoPaciente.add(chkRocupacional);
        chkRocupacional.setSelected(true);
        chkRocupacional.setText("Ocupacional");
        chkRocupacional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkRocupacionalMouseClicked(evt);
            }
        });
        chkRocupacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRocupacionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(chkRocupacional)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsistencial)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBuscarID1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbRecibo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbOrden))
                            .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboContratas, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel32)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(txtApellido))
                            .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(FechaTriaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAsistencial, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkRocupacional, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarID1)
                    .addComponent(rbRecibo)
                    .addComponent(rbOrden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboTipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboContratas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(FechaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel10.setText("Talla:");

        txtPesoTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoTriajeActionPerformed(evt);
            }
        });
        txtPesoTriaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesoTriajeFocusLost(evt);
            }
        });
        txtPesoTriaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoTriajeKeyTyped(evt);
            }
        });

        jLabel11.setText("Peso:");

        txtImcTriaje.setEditable(false);
        txtImcTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImcTriajeActionPerformed(evt);
            }
        });

        jLabel12.setText("IMC:");

        txtCinturaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCinturaTriajeActionPerformed(evt);
            }
        });
        txtCinturaTriaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCinturaTriajeKeyTyped(evt);
            }
        });

        jLabel13.setText("Cintura:");

        txtCaderaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaderaTriajeActionPerformed(evt);
            }
        });
        txtCaderaTriaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCaderaTriajeFocusLost(evt);
            }
        });

        jLabel14.setText("Cadera:");

        txtTemperaturaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaTriajeActionPerformed(evt);
            }
        });

        jLabel15.setText("Temperatura:");

        txtFcardiacaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFcardiacaTriajeActionPerformed(evt);
            }
        });

        jLabel16.setText("F. Cardiaca:");

        jLabel17.setText("SAT. 02:");

        txtSatTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSatTriajeActionPerformed(evt);
            }
        });

        jLabel18.setText("ICC:");

        txtIccTriaje.setEditable(false);
        txtIccTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIccTriajeActionPerformed(evt);
            }
        });

        jLabel19.setText("Perimetro Cuello:");

        txtPerimetroCuelloTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerimetroCuelloTriajeActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Presión Sistemica"));

        jLabel20.setText("Sistólica:");

        txtSistolicaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSistolicaTriajeActionPerformed(evt);
            }
        });

        jLabel21.setText("mm Hg");

        jLabel22.setText("Diastólica:");

        txtDiastolicaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiastolicaTriajeActionPerformed(evt);
            }
        });

        jLabel23.setText("mm Hg");

        jLabel24.setText("F. Respiratoria:");

        txtFRespiratoriaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFRespiratoriaTriajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtSistolicaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFRespiratoriaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtDiastolicaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txtFRespiratoriaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtSistolicaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtDiastolicaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jLabel29.setText("m.");

        jLabel30.setText("Kg.");

        txtTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTallaActionPerformed(evt);
            }
        });
        txtTalla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTallaFocusLost(evt);
            }
        });
        txtTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTallaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCinturaTriaje, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtIccTriaje, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtPesoTriaje)
                            .addComponent(txtImcTriaje, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtTalla))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPerimetroCuelloTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSatTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFcardiacaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemperaturaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaderaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel29)
                            .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPesoTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtImcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCinturaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtCaderaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTemperaturaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtFcardiacaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtSatTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIccTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtPerimetroCuelloTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Ingresar Informacion Triaje", jPanel3);

        jLabel4.setText("FVC:");

        txtFvcTriaje.setEditable(false);

        jLabel9.setText("FEV1:");

        txtFevTriaje.setEditable(false);

        jLabel25.setText("FEV1/FVC:");

        txtFevFvcTriaje.setEditable(false);

        jLabel26.setText("FEF 25 - 75%:");

        txtFefTriaje.setEditable(false);

        jLabel27.setText("Conclusión:");

        txtConclusionTriaje.setEditable(false);
        txtConclusionTriaje.setColumns(20);
        txtConclusionTriaje.setRows(5);
        txtConclusionTriaje.setEnabled(false);
        jScrollPane2.setViewportView(txtConclusionTriaje);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFvcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFevTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFevFvcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFefTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFvcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFevTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtFevFvcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtFefTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Espirometría", jPanel6);

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        jLabel31.setText("Nombres:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Selecciones Tipo Busqueda"));

        btBuscar.add(chkPacientes);
        chkPacientes.setText("Pacientes");

        btBuscar.add(chkOcupacional);
        chkOcupacional.setSelected(true);
        chkOcupacional.setText("Ocupacional");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(chkPacientes)
                .addGap(18, 18, 18)
                .addComponent(chkOcupacional)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPacientes)
                    .addComponent(chkOcupacional))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel35.setText("Codigo:");

        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnRegistrar.setText("Registar/Actualizar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiarCancelarTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarCancelarTriaje.setText("Limpiar/Cancelar");
        btnLimpiarCancelarTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCancelarTriajeActionPerformed(evt);
            }
        });

        tbTriaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbTriaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbTriaje.getTableHeader().setReorderingAllowed(false);
        tbTriaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTriajeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbTriajeMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbTriaje);

        jtTriaje.addTab("Revisar si registro paciente correctamente", jScrollPane1);

        jLabel34.setText("Diagnostico:");

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(2);
        atxtObservacionesAltura.setViewportView(txtDiagnostico);

        btnDiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticoActionPerformed(evt);
            }
        });

        txtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        txtEditar.setText("Editar");
        txtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDiagnostico))
                            .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar)
                            .addComponent(btnLimpiarCancelarTriaje)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtEditar)
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(310, Short.MAX_VALUE))
                    .addComponent(jtTriaje)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(btnDiagnostico)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEditar)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiarCancelarTriaje))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void cboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresaActionPerformed
      cboEmpresa.getEditor().addActionListener(new ActionListener() {
         @Override
     public void actionPerformed(ActionEvent e) {
          cboContratas.requestFocus();
     }
});
   }//GEN-LAST:event_cboEmpresaActionPerformed
   
   private void cboContratasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboContratasActionPerformed
      cboContratas.getEditor().addActionListener(new ActionListener() {
         @Override
     public void actionPerformed(ActionEvent e) {
          txtHistorial.setEnabled(true);  
          txtHistorial.requestFocus();
     }});
   }//GEN-LAST:event_cboContratasActionPerformed

   private void txtHistorialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistorialKeyPressed
     if(txtHistorial.getText().equals("")){
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            abrirDialoj();
        }
     }
   }//GEN-LAST:event_txtHistorialKeyPressed

   private void lblBuscarID1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarID1MouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_lblBuscarID1MouseClicked

   private void rbOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOrdenActionPerformed
   if(rbOrden.isSelected()){txtNumero.requestFocus();}
       
   }//GEN-LAST:event_rbOrdenActionPerformed

   private void rbReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReciboActionPerformed
       if(rbRecibo.isSelected()){txtNumero.requestFocus();}
      
   }//GEN-LAST:event_rbReciboActionPerformed

    private void cboTipoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoServicioActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
     
         if (chkRocupacional.isSelected()) {
            if (!txtNumero.getText().isEmpty()) {
                if (!OrdenExiste()) {
                    if (rbOrden.isSelected()) {

                        String Sql = "select datos_paciente.nombres_pa,"
                                + "datos_paciente.apellidos_pa,"
                                + "datos_paciente.fecha_nacimiento_pa,"
                                + "n_orden_ocupacional.nom_examen,"
                                + "n_orden_ocupacional.razon_empresa,"
                                + "n_orden_ocupacional.razon_contrata "
                                + "FROM datos_paciente "
                                + "INNER JOIN n_orden_ocupacional "
                                + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa) "
                                + "WHERE n_orden_ocupacional.n_orden='" + txtNumero.getText() + "'";
                        oConn.FnBoolQueryExecute(Sql);

                        try {
                            if (oConn.setResult.next()) {
                                txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                                txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                                FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                                cboTipoServicio.setSelectedItem(oConn.setResult.getString("nom_examen"));
                                cboEmpresa.setSelectedItem(oConn.setResult.getString("razon_empresa"));
                                cboContratas.setSelectedItem(oConn.setResult.getString("razon_contrata"));
                                FechaTriaje.requestFocusInWindow();
                                txtNumero.setEnabled(false);
                                txtEdad.setText(String.valueOf(calcularEdad(FechaNacimiento.getCalendar())));
                                fecha();
                                habilitaTriaje(true);
                                oConn.setResult.close();
                            } else {
                                oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                                oConn.setResult.close();
                            }
                        } catch (SQLException ex) {
                            oFunc.SubSistemaMensajeInformacion("Tríaje:" + ex.getMessage().toString());
                        }
                    }
                }
            
        }
         }
        if(chkAsistencial.isSelected()){ 
           CargarAsistencial();
        }
    }//GEN-LAST:event_txtNumeroActionPerformed
  public void habilitaTriaje(boolean r){
   txtTalla.setEnabled(r);
   txtPesoTriaje.setEditable(r);
   txtCinturaTriaje.setEditable(r);
   txtCaderaTriaje.setEditable(r);
   txtPerimetroCuelloTriaje.setEnabled(r);
   txtTemperaturaTriaje.setEditable(r);
   txtSatTriaje.setEnabled(r);
   txtFRespiratoriaTriaje.setEnabled(r);
   txtFcardiacaTriaje.setEditable(r);
   txtSistolicaTriaje.setEditable(r);
   txtDiastolicaTriaje.setEnabled(r);
  }
    public void fecha(){
Date dateHoy = new Date();
       // SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       FechaTriaje.setDate(dateHoy);
        
}
   private void CargarAsistencial(){
        if (!txtNumero.getText().isEmpty()) {
                if (!OrdenExiste()) {
                        if (rbOrden.isSelected()) {
                        String Sql = "select d.nombres_pa,d.edad \n" +
                        "FROM datos_paciente_asistencial as d \n" +
                        "WHERE d.n_hcl='" + txtNumero.getText() + "'";
                        oConn.FnBoolQueryExecute(Sql);
                        try {
                            if (oConn.setResult.next()) {
                                txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                                txtEdad.setText(oConn.setResult.getString("edad"));
                                FechaTriaje.requestFocusInWindow();
                                txtNumero.setEnabled(false);
                                
                                fecha();

                                oConn.setResult.close();
                            } else {
                                oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n ");
                                oConn.setResult.close();
                            }
                        } catch (SQLException ex) {
                            oFunc.SubSistemaMensajeInformacion("Tríaje asistencial:" + ex.getMessage().toString());
                        }
                    }
                        
                    
               }
            }
   }
    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
          
        int k=(int)evt.getKeyChar();
if (k >= 97 && k <= 122 || k>=65 && k<=90){
evt.setKeyChar((char)KeyEvent.VK_CLEAR);
JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
}
if(k==241 || k==209){
evt.setKeyChar((char)KeyEvent.VK_CLEAR);
JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
}
if(k==32){
evt.setKeyChar((char)KeyEvent.VK_CLEAR);
JOptionPane.showMessageDialog(null,"No puede ingresar Espacios!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
}
if(k==10){
    
//txtnombreApellido.transferFocus();
}
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnLimpiarCancelarTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCancelarTriajeActionPerformed
       LimpiarFichaTriaje();
      
       txtNumero.setEnabled(true);
       txtNumero.requestFocus();
    }//GEN-LAST:event_btnLimpiarCancelarTriajeActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         if (OrdenExiste()) {
             Actualizar();
         }else{
             AgregarTriaje();
         }
        
    
      
            
    }//GEN-LAST:event_btnRegistrarActionPerformed
   private void AgregarTriaje(){
        if(chkRocupacional.isSelected()){
           if(!txtNumero.getText().isEmpty()){
                 if(!OrdenExiste()){
                     if(validar()){
            String strSqlStmt;
             String Query ;
            strSqlStmt="INSERT INTO triaje(";
            Query="Values('";
            if (txtNumero.getText().trim().length()>= 1 ){strSqlStmt += "n_orden";Query += txtNumero.getText().toString()+ "'";}
              if (txtEdad.getText().trim().length()>= 1 ){strSqlStmt += ",edad";Query += ",'"+txtEdad.getText().toString()+ "'";}
              if (((JTextField)FechaTriaje.getDateEditor().getUiComponent()).getText().trim().length()> 1 ){strSqlStmt+= ",fecha_triaje";Query+= ",'"+FechaTriaje.getDate().toString()+ "'";}
              if (txtTalla.getText().trim().length()>= 1 ){strSqlStmt += ",talla";Query += ",'"+txtTalla.getText().toString()+ "'";}
              if (txtPesoTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",peso";Query += ",'"+txtPesoTriaje.getText().toString()+ "'";}
              if (txtImcTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",imc";Query += ",'"+txtImcTriaje.getText().toString()+ "'";}
              if (txtCinturaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",cintura";Query += ",'"+txtCinturaTriaje.getText().toString()+ "'";}
              if (txtIccTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",icc";Query += ",'"+ txtIccTriaje.getText().toString()+ "'";}
              if (txtCaderaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",cadera";Query += ",'"+txtCaderaTriaje.getText().toString()+ "'";}
              if (txtTemperaturaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",temperatura";Query += ",'"+txtTemperaturaTriaje.getText().toString()+ "'";}
              if (txtFcardiacaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",f_cardiaca";Query += ",'"+txtFcardiacaTriaje.getText().toString()+ "'";}
              if (txtSatTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",sat_02";Query += ",'"+txtSatTriaje.getText().toString()+ "'";}
              if (txtPerimetroCuelloTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",perimetro_cuello";Query += ",'"+txtPerimetroCuelloTriaje.getText().toString()+ "'";}
              if (txtSistolicaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",sistolica";Query += ",'"+txtSistolicaTriaje.getText().toString()+ "'";}
              if (txtDiastolicaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",diastolica";Query += ",'"+txtDiastolicaTriaje.getText().toString()+ "'";}
              if (txtFRespiratoriaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",f_respiratoria";Query += ",'"+txtFRespiratoriaTriaje.getText().toString()+ "'";}
              if (txtFvcTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",fvc";Query += ",'"+txtFvcTriaje.getText().toString()+ "'";}
              if (txtFevTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",fev_1";Query += ",'"+txtFevTriaje.getText().toString()+ "'";}
              if (txtFevFvcTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",fev1_fvc";Query += ",'"+txtFevFvcTriaje.getText().toString()+ "'";}
              if (txtFefTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",fef25_75";Query += ",'"+txtFefTriaje.getText().toString()+ "'";}
              if (txtDiagnostico.getText().trim().length()>= 1 ){strSqlStmt += ",conclusion";Query += ",'"+txtDiagnostico.getText().toString()+ "'";}
               
               if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
             oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
             LimpiarFichaTriaje();
             txtNumero.setEnabled(true);
             txtNumero.requestFocus();
             sbCargarDatosOcupacional("");
                  
        }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
        }
        }else{ oFunc.SubSistemaMensajeError("Número de Orden Utilizado");}
        }else {  oFunc.SubSistemaMensajeError("Llene los Campos correctamente");txtNumero.requestFocus();}
       }
   } 
   private void AgregarAsistencial(){
        if(chkAsistencial.isSelected()){
            if(!txtNumero.getText().isEmpty()){
                 if(!OrdenExiste()){
                     if(validar()){
            String strSqlStmt;
             String Query ;
            strSqlStmt="INSERT INTO triaje_asistencial(";
            Query="Values('";
            if (txtNumero.getText().trim().length()>= 1 ){strSqlStmt += "n_hcl";Query += txtNumero.getText().toString()+ "'";}
              if (txtEdad.getText().trim().length()>= 1 ){strSqlStmt += ",edad";Query += ",'"+txtEdad.getText().toString()+ "'";}
              if (((JTextField)FechaTriaje.getDateEditor().getUiComponent()).getText().trim().length()> 1 ){strSqlStmt+= ",fecha_triaje";Query+= ",'"+FechaTriaje.getDate().toString()+ "'";}
              if (txtTalla.getText().trim().length()>= 1 ){strSqlStmt += ",talla";Query += ",'"+txtTalla.getText().toString()+ "'";}
              if (txtPesoTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",peso";Query += ",'"+txtPesoTriaje.getText().toString()+ "'";}
              if (txtImcTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",imc";Query += ",'"+txtImcTriaje.getText().toString()+ "'";}
              if (txtCinturaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",cintura";Query += ",'"+txtCinturaTriaje.getText().toString()+ "'";}
              if (txtIccTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",icc";Query += ",'"+ txtIccTriaje.getText().toString()+ "'";}
              if (txtCaderaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",cadera";Query += ",'"+txtCaderaTriaje.getText().toString()+ "'";}
              if (txtTemperaturaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",temperatura";Query += ",'"+txtTemperaturaTriaje.getText().toString()+ "'";}
              if (txtFcardiacaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",f_cardiaca";Query += ",'"+txtFcardiacaTriaje.getText().toString()+ "'";}
              if (txtSatTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",sat_02";Query += ",'"+txtSatTriaje.getText().toString()+ "'";}
              if (txtPerimetroCuelloTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",perimetro_cuello";Query += ",'"+txtPerimetroCuelloTriaje.getText().toString()+ "'";}
              if (txtSistolicaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",sistolica";Query += ",'"+txtSistolicaTriaje.getText().toString()+ "'";}
              if (txtDiastolicaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",diastolica";Query += ",'"+txtDiastolicaTriaje.getText().toString()+ "'";}
              if (txtFRespiratoriaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",f_respiratoria";Query += ",'"+txtFRespiratoriaTriaje.getText().toString()+ "'";}
              
               
               if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
             oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
             LimpiarFichaTriaje();
             txtNumero.setEnabled(true);
             txtNumero.requestFocus();
             sbCargarDatosOcupacional("");
        }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
        }
        }
        }else {  oFunc.SubSistemaMensajeError("Llene los Campos correctamente");txtNumero.requestFocus();}
        }
    }
    private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaTriaje.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    else if(txtTalla.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Talla");bResultado=false; }
    else if(txtPesoTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Peso");bResultado=false; }
    else if(txtCinturaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Cintura");bResultado=false; }
    
     else if(txtCaderaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Cadera");bResultado=false; }
     else if(txtTemperaturaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Temperatura");bResultado=false; }
     else if(txtFcardiacaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Frecuencia Cardica");bResultado=false; }
     else if(txtSatTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Sat02");bResultado=false; }
     else if(txtPerimetroCuelloTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Perimetro Cuello");bResultado=false; }
     else if(txtSistolicaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Sistólica");bResultado=false; }
     else if(txtDiastolicaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Diastólica");bResultado=false; }
     else if(txtFRespiratoriaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Función respiratoria");bResultado=false; }
     else  if (((JTextField)FechaTriaje.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de cita");bResultado = false;}
   
  
   return bResultado;
}
    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
       txtTalla.requestFocus();
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
    }//GEN-LAST:event_txtBuscarKeyReleased
    
    private void FechaTriajePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaTriajePropertyChange
       txtTalla.requestFocus();
               
    }//GEN-LAST:event_FechaTriajePropertyChange




    private void tbTriajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTriajeMouseClicked
        
       if (evt.getClickCount() == 2) 
        {  
            Integer cod  = Integer.valueOf( tbTriaje.getValueAt(tbTriaje.getSelectedRow(),0).toString());
            oPe.print(cod, "Triaje.jasper", "Ficha Triaje");
            
        }
    }//GEN-LAST:event_tbTriajeMouseClicked

    private void btnDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticoActionPerformed
//       if(!txtIccTriaje.getText().isEmpty() && !txtIccTriaje.getText().isEmpty()
//               &&!txtSistolicaTriaje.getText().isEmpty()&&!txtDiastolicaTriaje.getText().isEmpty()
//               && !txtFcardiacaTriaje.getText().isEmpty()){ 
//        diagnostico();
//       }else {
//        oFunc.SubSistemaMensajeInformacion("Debe ingresar todos los campos necesarios");
//    }
    }//GEN-LAST:event_btnDiagnosticoActionPerformed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
        if(chkOcupacional.isSelected()){ 
        sbCargarDatosOcupacional(txtBuscar.getText());}
        if(chkPacientes.isSelected()){ 
        oFunc.SubSistemaMensajeError("no hay registros");
       // sbCargarDatosOcupacional(txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void chkAsistencialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAsistencialMouseClicked
       LimpiarFichaTriaje();
       HabilitaReOr();
       txtNumero.setEnabled(true);
       txtNumero.requestFocus();
    }//GEN-LAST:event_chkAsistencialMouseClicked

    private void chkRocupacionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkRocupacionalMouseClicked
       
    }//GEN-LAST:event_chkRocupacionalMouseClicked

    private void chkRocupacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRocupacionalActionPerformed
        
    }//GEN-LAST:event_chkRocupacionalActionPerformed

    private void txtTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTallaKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtTallaKeyTyped

    private void txtTallaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTallaFocusLost
        if(!txtTalla.getText().isEmpty()){
            JFormattedTextField talla = new JFormattedTextField(oFunc.setMascara("#.##"));
            talla.setText(txtTalla.getText());
            txtTalla.setText(talla.getText());
            talla.setText(null);
        }
    }//GEN-LAST:event_txtTallaFocusLost

    private void txtTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTallaActionPerformed
        txtPesoTriaje.requestFocus();
    }//GEN-LAST:event_txtTallaActionPerformed

    private void txtFRespiratoriaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFRespiratoriaTriajeActionPerformed
       
    }//GEN-LAST:event_txtFRespiratoriaTriajeActionPerformed

    private void txtDiastolicaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiastolicaTriajeActionPerformed
        if(!txtSistolicaTriaje.getText().isEmpty() && !txtDiastolicaTriaje.getText().isEmpty()){
            float sistolica = Float.parseFloat(txtSistolicaTriaje.getText().toString());
            float diastolica = Float.parseFloat(txtDiastolicaTriaje.getText().toString());
            if (sistolica < 120 && diastolica < 80) {
                txtDiagnostico.append("- PRESION ARTERIAL: NORMAL." + '\n');
            } else if ((sistolica >= 120 && sistolica < 140) && (diastolica >= 80 && diastolica <= 90)) {
                txtDiagnostico.append("- PRESION ARTERIAL: PREHIPERTENSION." + '\n');
            } else if ((sistolica >= 140 && sistolica < 160) && (diastolica > 90 && diastolica < 100)) {
                txtDiagnostico.append("- PRESION ARTERIAL: HTA-1." + '\n');
            } else if ((sistolica >= 160) && (diastolica >= 100)) {
                txtDiagnostico.append("- PRESION ARTERIAL: HTA-2." + '\n');
            }
        }
        txtFRespiratoriaTriaje.requestFocus();
    }//GEN-LAST:event_txtDiastolicaTriajeActionPerformed

    private void txtSistolicaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSistolicaTriajeActionPerformed

        txtDiastolicaTriaje.requestFocus();
    }//GEN-LAST:event_txtSistolicaTriajeActionPerformed

    private void txtPerimetroCuelloTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerimetroCuelloTriajeActionPerformed
        if (!txtPerimetroCuelloTriaje.getText().isEmpty()) {
            String sql = "SELECT dp.sexo_pa FROM datos_paciente as dp "
            + "inner join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) "
            + "where n.n_orden='" + txtNumero.getText().toString() + "'";
            oConn.FnBoolQueryExecute(sql);

            try {
                if (oConn.setResult.next()) {
                    String sexo = oConn.setResult.getString("sexo_pa");
                    float cuello = Float.parseFloat(txtPerimetroCuelloTriaje.getText().toString());
                    if ("M".equals(sexo)) {
                        if (cuello < 43.2) {
                            txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: NORMAL." + '\n');
                        } else {
                            txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: ANORMAL." + '\n');
                        }
                    }
                    if ("F".equals(sexo)) {
                        if (cuello < 40.6) {
                            txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: NORMAL." + '\n');
                        } else {
                            txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: ANORMAL." + '\n');
                        }
                    }
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeError("No existe registros del cliente");
            }
        }
        txtSistolicaTriaje.requestFocus();
    }//GEN-LAST:event_txtPerimetroCuelloTriajeActionPerformed

    private void txtIccTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIccTriajeActionPerformed

    }//GEN-LAST:event_txtIccTriajeActionPerformed

    private void txtSatTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSatTriajeActionPerformed
        txtPerimetroCuelloTriaje.requestFocus();
    }//GEN-LAST:event_txtSatTriajeActionPerformed

    private void txtFcardiacaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFcardiacaTriajeActionPerformed
        if(!txtFcardiacaTriaje.getText().isEmpty()){
            float frecuencia = Float.parseFloat(txtFcardiacaTriaje.getText().toString());
            if(frecuencia>100){
                txtDiagnostico.append("- FRECUENCIA CARDIACA: TAQUICARDIA."+'\n');
            }else if(frecuencia<60){
                txtDiagnostico.append("- FRECUENCIA CARDIACA: BRAQUICARDIA."+'\n');
            }else{txtDiagnostico.append("- FRECUENCIA CARDIACA: NORMAL."+'\n');}
        }
        txtSatTriaje.requestFocus();
    }//GEN-LAST:event_txtFcardiacaTriajeActionPerformed

    private void txtTemperaturaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaTriajeActionPerformed
        if(!txtIccTriaje.getText().isEmpty()){
            String sql="SELECT dp.sexo_pa FROM datos_paciente as dp "
            +"inner join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) "
            + "where n.n_orden='"+txtNumero.getText().toString()+"'";
            oConn.FnBoolQueryExecute(sql);

            try {
                if (oConn.setResult.next())
                {
                    String sexo=oConn.setResult.getString("sexo_pa");
                    float icc = Float.parseFloat(txtIccTriaje.getText().toString());
                    if ("M".equals(sexo)) {
                        if (icc >= 0.78 && icc < 0.95) {
                            txtDiagnostico.append("- INDICE DE CINTRUA CADERA: NORMAL." + '\n');
                        } else if(icc >= 0.95 ){
                            txtDiagnostico.append("- INDICE DE CINTRUA CADERA: OBESIDAD ABDOMIO VISCERAL." + '\n');
                        }
                    }
                    if ("F".equals(sexo)) {
                        if (icc >= 0.71 && icc < 0.86) {
                            txtDiagnostico.append("- INDICE DE CINTRUA CADERA: NORMAL." + '\n');
                        } else if(icc >=0.86){
                            txtDiagnostico.append("- INDICE DE CINTRUA CADERA: OBESIDAD ABDOMIO VISCERAL." + '\n');
                        }
                    }
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeError("No existe registros del cliente");
            }
        }
        txtFcardiacaTriaje.requestFocus();
    }//GEN-LAST:event_txtTemperaturaTriajeActionPerformed

    private void txtCaderaTriajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCaderaTriajeFocusLost
        if (txtCinturaTriaje.getText().length() > 1  ){
            if(txtCaderaTriaje.getText().length() > 1){
                //oFunc.SubSistemaMensajeError("carga");
                DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
                simbolos.setDecimalSeparator('.');
                DecimalFormat formateador = new DecimalFormat("##.##",simbolos);

                Double ci;
                Double ca;
                ci = Double.valueOf(txtCinturaTriaje.getText().toString());
                ca = Double.valueOf(txtCaderaTriaje.getText().toString());
                double icc= ci / ca ;
                txtIccTriaje.setText(formateador.format(icc));
            }
        }
    }//GEN-LAST:event_txtCaderaTriajeFocusLost

    private void txtCaderaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaderaTriajeActionPerformed
        txtTemperaturaTriaje.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaderaTriajeActionPerformed

    private void txtCinturaTriajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCinturaTriajeKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtCinturaTriajeKeyTyped

    private void txtCinturaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCinturaTriajeActionPerformed
        float imc = Float.parseFloat(txtImcTriaje.getText().toString());
        if (imc < 18.5) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: BAJO DE PESO." + '\n');
        } else if (imc >= 18.5 && imc < 25) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: NORMAL." + '\n');
        } else if (imc >= 25 && imc < 30) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: SOBREPESO." + '\n');
        } else if (imc >= 30 && imc < 35) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD I." + '\n');
        } else if (imc >= 35 && imc < 40) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD II." + '\n');
        } else {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD III." + '\n');
        }
        txtCaderaTriaje.requestFocus();
    }//GEN-LAST:event_txtCinturaTriajeActionPerformed

    private void txtImcTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImcTriajeActionPerformed
        txtCinturaTriaje.requestFocus();
    }//GEN-LAST:event_txtImcTriajeActionPerformed

    private void txtPesoTriajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoTriajeKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtPesoTriajeKeyTyped

    private void txtPesoTriajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesoTriajeFocusLost
        if (txtTalla.getText().length() > 1  ){
            if(txtPesoTriaje.getText().length() > 1){
                //oFunc.SubSistemaMensajeError("carga");
                DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
                simbolos.setDecimalSeparator('.');
                DecimalFormat formateador = new DecimalFormat("##.##",simbolos);

                Double t;
                Double p;
                t = Double.valueOf(txtTalla.getText().toString());
                p = Double.valueOf(txtPesoTriaje.getText().toString());
                double imc= p/(t * t) ;
                txtImcTriaje.setText(formateador.format(imc));
            }
        }
    }//GEN-LAST:event_txtPesoTriajeFocusLost

    private void txtPesoTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoTriajeActionPerformed
        txtCinturaTriaje.requestFocus();
    }//GEN-LAST:event_txtPesoTriajeActionPerformed

    private void txtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarActionPerformed
        habilitaTriaje(true);
        
    }//GEN-LAST:event_txtEditarActionPerformed

    private void tbTriajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTriajeMousePressed
        if (evt.getClickCount() == 1) 
        {  
            txtNumero.setEnabled(false);
            habilitaTriaje(false);
            Integer cod  = Integer.valueOf( tbTriaje.getValueAt(tbTriaje.getSelectedRow(),0).toString());
            String Sql = "select dp.nombres_pa,dp.apellidos_pa,dp.fecha_nacimiento_pa,n.nom_examen,n.razon_empresa,n.razon_contrata,\n" +
                "	t.edad, t.fecha_triaje, t.talla, t.peso, \n" +
                "       t.imc, t.cintura, t.icc, t.cadera, t.temperatura, t.f_cardiaca, t.sat_02, t.perimetro_cuello, \n" +
                "       t.sistolica, t.diastolica, t.f_respiratoria, t.conclusion FROM datos_paciente as dp\n" +
                "       INNER JOIN n_orden_ocupacional as n ON (dp.cod_pa = n.cod_pa) \n" +
                "       INNER JOIN triaje as t ON (t.n_orden = n.n_orden) \n" +
                "       WHERE n.n_orden='" + cod+"'";
            
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNumero.setText(String.valueOf(cod));
                    txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                    txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    cboTipoServicio.setSelectedItem(oConn.setResult.getString("nom_examen"));
                    cboEmpresa.setSelectedItem(oConn.setResult.getString("razon_empresa"));
                    cboContratas.setSelectedItem(oConn.setResult.getString("razon_contrata"));
                    txtEdad.setText(oConn.setResult.getString("edad"));
                    FechaTriaje.setDate(oConn.setResult.getDate("fecha_triaje"));
                    txtTalla.setText(oConn.setResult.getString("talla"));
                    txtPesoTriaje.setText(oConn.setResult.getString("peso"));
                    txtImcTriaje.setText(oConn.setResult.getString("imc"));
                    txtCinturaTriaje.setText(oConn.setResult.getString("cintura"));
                    txtIccTriaje.setText(oConn.setResult.getString("icc"));
                    txtCaderaTriaje.setText(oConn.setResult.getString("cadera"));
                    txtTemperaturaTriaje.setText(oConn.setResult.getString("temperatura"));
                    txtFcardiacaTriaje.setText(oConn.setResult.getString("f_cardiaca"));
                    txtSatTriaje.setText(oConn.setResult.getString("sat_02"));
                    txtPerimetroCuelloTriaje.setText(oConn.setResult.getString("perimetro_cuello"));
                    txtSistolicaTriaje.setText(oConn.setResult.getString("sistolica"));
                    txtDiastolicaTriaje.setText(oConn.setResult.getString("diastolica"));
                    txtFRespiratoriaTriaje.setText(oConn.setResult.getString("f_respiratoria"));
                    txtDiagnostico.setText(oConn.setResult.getString("conclusion"));
                    oConn.setResult.close();
                }
            } catch (Exception e) {
            }
            
        }
    }//GEN-LAST:event_tbTriajeMousePressed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
        if(chkOcupacional.isSelected()){ 
        sbCargarDatosOcupacional(txtBuscar.getText());}
        if(chkPacientes.isSelected()){ 
        oFunc.SubSistemaMensajeError("no hay registros");
       // sbCargarDatosOcupacional(txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarActionPerformed


   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private com.toedter.calendar.JDateChooser FechaTriaje;
    private javax.swing.JScrollPane atxtObservacionesAltura;
    private javax.swing.ButtonGroup bgTriaje;
    private javax.swing.ButtonGroup btBuscar;
    private javax.swing.JButton btnDiagnostico;
    private javax.swing.JButton btnLimpiarCancelarTriaje;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboContratas;
    private javax.swing.JComboBox cboEmpresa;
    private javax.swing.JComboBox cboTipoServicio;
    private javax.swing.JCheckBox chkAsistencial;
    private javax.swing.JCheckBox chkOcupacional;
    private javax.swing.JCheckBox chkPacientes;
    private javax.swing.JCheckBox chkRocupacional;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jtTriaje;
    private javax.swing.JLabel lblBuscarID1;
    private javax.swing.JRadioButton rbOrden;
    private javax.swing.JRadioButton rbRecibo;
    private javax.swing.JTable tbTriaje;
    private javax.swing.ButtonGroup tipoPaciente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtCaderaTriaje;
    private javax.swing.JTextField txtCinturaTriaje;
    private javax.swing.JTextArea txtConclusionTriaje;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDiastolicaTriaje;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JButton txtEditar;
    private javax.swing.JTextField txtFRespiratoriaTriaje;
    private javax.swing.JTextField txtFcardiacaTriaje;
    private javax.swing.JTextField txtFefTriaje;
    private javax.swing.JTextField txtFevFvcTriaje;
    private javax.swing.JTextField txtFevTriaje;
    private javax.swing.JTextField txtFvcTriaje;
    private javax.swing.JTextField txtHistorial;
    private javax.swing.JTextField txtIccTriaje;
    private javax.swing.JTextField txtImcTriaje;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPerimetroCuelloTriaje;
    private javax.swing.JTextField txtPesoTriaje;
    private javax.swing.JTextField txtSatTriaje;
    private javax.swing.JTextField txtSistolicaTriaje;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTemperaturaTriaje;
    // End of variables declaration//GEN-END:variables
       public boolean OrdenExiste()
    {
        // Para devolver el resultado
        boolean bResultado=false;
        
        // Para el Query
        String sQuery="";
        
        // Prepara el Query
        if(chkRocupacional.isSelected()){
        sQuery  = "Select * from triaje Where n_orden="+txtNumero.getText().toString();
        }
        if(chkAsistencial.isSelected()){
           sQuery  = "Select * from triaje_asistencial Where n_hcl="+txtNumero.getText().toString(); 
        }
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
//             txtNumero.setText(null);
//             txtNumero.requestFocus();
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        
        
        
        // Retorna el Resultado
        return bResultado;
        
    }
       private void Actualizar(){
           String sCodigo=txtNumero.getText();
        String strSqlStmt;
        
//      sCodigo = tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString();
        strSqlStmt="UPDATE triaje\n" +
                "   SET edad='" + txtEdad.getText().toString() + "', fecha_triaje='" + FechaTriaje.getDate().toString() + "', \n" +
                "       talla='" + txtTalla.getText().toString() + "', peso='" + txtPesoTriaje.getText().toString() + "', "+
                "       imc='" + txtImcTriaje.getText().toString() + "', cintura='" + txtCinturaTriaje.getText().toString() + "', "+ 
                "       icc='" + txtIccTriaje.getText().toString() + "', cadera='" + txtCaderaTriaje.getText().toString() + "', " +
                "       temperatura='" + txtTemperaturaTriaje.getText().toString() + "',f_cardiaca='" + txtFcardiacaTriaje.getText().toString() + "', "+ 
                "sat_02='" + txtSatTriaje.getText().toString() + "', perimetro_cuello='" + txtPerimetroCuelloTriaje.getText().toString() + "', " +
                "sistolica='" + txtSistolicaTriaje.getText().toString() + "', diastolica='" + txtDiastolicaTriaje.getText().toString() + "', \n" +
                "f_respiratoria='" + txtFRespiratoriaTriaje.getText().toString() + "', conclusion='" + txtDiagnostico.getText().toString() + "'\n" +
                " WHERE n_orden='" + sCodigo + "'";
            LimpiarFichaTriaje();
             txtNumero.setEnabled(true);
             txtNumero.requestFocus();
             sbCargarDatosOcupacional("");
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
        sbCargarDatosOcupacional("");
       }
   private void LimpiarFichaTriaje(){
   txtNumero.setText(null);
   cboTipoServicio.setSelectedIndex(-1);
   cboContratas.setSelectedIndex(-1);
   cboEmpresa.setSelectedIndex(-1);
   txtHistorial.setText(null);
   txtNombre.setText(null);
   txtApellido.setText(null);
   FechaNacimiento.setDate(null);
   txtEdad.setText(null);
   FechaTriaje.setDate(null);
   txtTalla.setText(null);
   txtPesoTriaje.setText(null);
   txtImcTriaje.setText(null);
   txtCinturaTriaje.setText(null);
   txtIccTriaje.setText(null);
   txtCaderaTriaje.setText(null);
   txtTemperaturaTriaje.setText(null);
   txtFcardiacaTriaje.setText(null);
   txtSatTriaje.setText(null);
   txtPerimetroCuelloTriaje.setText(null);
   txtSistolicaTriaje.setText(null);
   txtDiastolicaTriaje.setText(null);
   txtFRespiratoriaTriaje.setText(null);
   txtDiagnostico.setText(null);
   txtNumero.requestFocus();
   chkAsistencial.setSelected(false);
           
   
   }
   private void HabilitaReOr(){
   cboTipoServicio.setEnabled(false);
   cboEmpresa.setEnabled(false);
   cboContratas.setEnabled(false);
   txtHistorial.setEditable(false);
   txtApellido.setEditable(false);
   txtNombre.setEditable(false);
   FechaNacimiento.setEnabled(false);
   txtEdad.setEditable(false);
   txtTalla.setEnabled(false);
   //if(bHabilita){}
   txtPesoTriaje.setEditable(false);
   txtCinturaTriaje.setEditable(false);
   txtCaderaTriaje.setEditable(false);
   txtPerimetroCuelloTriaje.setEnabled(false);
   txtTemperaturaTriaje.setEditable(false);
   txtSatTriaje.setEnabled(false);
   txtFRespiratoriaTriaje.setEnabled(false);
   txtFcardiacaTriaje.setEditable(false);
   txtSistolicaTriaje.setEditable(false);
   txtDiastolicaTriaje.setEnabled(false);
   
   txtFcardiacaTriaje.requestFocus();
  
   }
    private void abrirDialoj(){
       FichaTriajeModalCod FrmModalCod = new FichaTriajeModalCod(null,true);
        FrmModalCod.setLocationRelativeTo(null);
        FrmModalCod.setVisible(true);
    
    }
    private void diagnostico(){
        String sql="SELECT dp.sexo_pa FROM datos_paciente as dp " 
                +"inner join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) "
                + "where n.n_orden='"+txtNumero.getText().toString()+"'";
        oConn.FnBoolQueryExecute(sql);
        
        try {
            if (oConn.setResult.next())
            {
               String sexo=oConn.setResult.getString("sexo_pa");
                float imc = Float.parseFloat(txtImcTriaje.getText().toString());
                float sistolica = Float.parseFloat(txtSistolicaTriaje.getText().toString());
                float diastolica = Float.parseFloat(txtDiastolicaTriaje.getText().toString());
                float frecuencia = Float.parseFloat(txtFcardiacaTriaje.getText().toString());
                float icc = Float.parseFloat(txtIccTriaje.getText().toString());
                float cuello = Float.parseFloat(txtPerimetroCuelloTriaje.getText().toString());
               
               if(frecuencia>100){
                   txtDiagnostico.append("- FRECUENCIA CARDIACA: TAQUICARDIA."+'\n');
               }else if(frecuencia<60){
                   txtDiagnostico.append("- FRECUENCIA CARDIACA: BRAQUICARDIA."+'\n');
               }else{txtDiagnostico.append("- FRECUENCIA CARDIACA: NORMAL."+'\n');}
               if(imc<18.5){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: BAJO DE PESO."+'\n');
               }else if(imc>=18.5 && imc<25){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: NORMAL."+'\n');
               }else if(imc>=25 && imc<30){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: SOBREPESO."+'\n');
               }else if(imc>=30 && imc<35){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD I."+'\n');
               }else if(imc>=35 && imc<40){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD II."+'\n');
               }else{ txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD III."+'\n');}
               if(sistolica<120 && diastolica<80){
                   txtDiagnostico.append("- PRESION ARTERIAL: NORMAL."+'\n');
               }else if((sistolica>=120 && sistolica<140)&& (diastolica>=80 && diastolica<90)){
                   txtDiagnostico.append("- PRESION ARTERIAL: PREHIPERTENSION."+'\n');
               }else if((sistolica>=140 && sistolica<160)&& (diastolica>=90 && diastolica<100)){
                   txtDiagnostico.append("- PRESION ARTERIAL: HTA-1."+'\n');
               }else if((sistolica>=160)&& (diastolica>=100)){
                txtDiagnostico.append("- PRESION ARTERIAL: HTA-2."+'\n');}
               if ("M".equals(sexo)) {
                    if (icc >= 0.78 && icc < 0.95) {
                        txtDiagnostico.append("- Indice de Cintura Cadera: NORMAL." + '\n');
                    } else if(icc >= 0.95 ){
                        txtDiagnostico.append("- Indice de Cintura Cadera: OBESIDAD ABDOMIO VISCERAL." + '\n');
                    }
               }
               if ("F".equals(sexo)) {
                    if (icc >= 0.71 && icc < 0.86) {
                        txtDiagnostico.append("- INDICE DE CINTRUA CADERA: NORMAL." + '\n');
                    } else if(icc >=0.86){
                        txtDiagnostico.append("- INDICE DE CINTRUA CADERA: OBESIDAD ABDOMIO VISCERAL." + '\n');
                    }
               }
               if ("M".equals(sexo)) {
                    if (cuello <43.2) {
                        txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: NORMAL." + '\n');
                    } else {
                        txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: ANORMAL." + '\n');
                    }
               }
               if ("F".equals(sexo)) {
                    if (cuello < 40.6) {
                        txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: NORMAL." + '\n');
                    } else {
                        txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: ANORMAL." + '\n');
                    }
               }
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeError("No existe registros del cliente");
       }
    }
   
private void CargarEmpresas(){
      String sQuery;        
        sQuery ="SELECT razon_empresa FROM empresas";
         if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
              while (oConn.setResult.next())
                 {                    
                     cboEmpresa.addItem(oConn.setResult.getString ("razon_empresa"));   
                 }
            } 
            catch (SQLException ex) 
            {
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cboEmpresa.setSelectedIndex(-1);
        cboEmpresa.setBackground(Color.LIGHT_GRAY);
        AutoCompleteDecorator.decorate(this.cboEmpresa);
}
private void CargarContratas(){
      String sQuery;        
        sQuery ="SELECT razon_contrata FROM contratas";
         if (oConn.FnBoolQueryExecute(sQuery))
        {
            try {
              while (oConn.setResult.next())
                 {             
                     cboContratas.addItem(oConn.setResult.getString ("razon_contrata"));   
                 }
            } 
            catch (SQLException ex){
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cboContratas.setSelectedIndex(-1);
        cboContratas.setBackground(Color.lightGray);
        AutoCompleteDecorator.decorate(this.cboContratas);
}
private void CargarServicios(){
      String sQuery;        
        sQuery ="SELECT nom_examen FROM examen_medico_ocupacional";
         if (oConn.FnBoolQueryExecute(sQuery))
        {
            try {
              while (oConn.setResult.next())
                 {             
                     cboTipoServicio.addItem(oConn.setResult.getString ("nom_examen"));   
                 }
            } 
            catch (SQLException ex){
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cboTipoServicio.setSelectedIndex(-1);
        cboTipoServicio.setBackground(Color.lightGray);
        AutoCompleteDecorator.decorate(this.cboTipoServicio);
}

void sbCargarDatosOcupacional(String valor){
    String [] titulos={"N°Orden","Nombre","Fecha","Empresa","Contrata","T.Examen","Cargo","F.Aptitud","Estado","H.Entrada","H_Salida"};
    String [] registros = new String[11];
    String sql="";
    if(!txtBuscarCod.getText().isEmpty()){
        sql="select n_orden_ocupacional.n_orden, \n" +
"            datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, \n" +
"            triaje.fecha_triaje,n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
             + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,\n" +
"            n_orden_ocupacional.n_hora,ca.n_orden as aptitud,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,"
            + "bc.n_orden as conduccion,ba.n_orden as altura,  "+
                  "CASE WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  END as estado, \n" +
             "CASE  WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ac.no_apto = 'TRUE' THEN 'No Apto' END as estadoac, \n" +
            "CASE  WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                  " WHEN a.no_apto = 'TRUE' THEN 'No Apto' END as estadoad,"
              + "CASE  WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN bc.chk_no = 'TRUE' THEN 'No Apto' END as estadobc,"
            + "CASE  WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN ba.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto' END as estadoba," 
            + " o.examenes \n" +
             " From datos_paciente \n" +
"            inner join n_orden_ocupacional \n" +
"            ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)\n" +
"            left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n_orden_ocupacional.n_orden)\n" +
"            left join anexo7d as a ON (a.n_orden=n_orden_ocupacional.n_orden)\n" +
"            left join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)\n" +
           "left join anexoc as ac ON (ac.n_orden=n_orden_ocupacional.n_orden)"   +
           " left join b_certificado_conduccion as bc ON (bc.n_orden=n_orden_ocupacional.n_orden)"+
           " left join b_certificado_altura as ba ON (ba.n_orden=n_orden_ocupacional.n_orden)"   +  
"            inner join triaje on (n_orden_ocupacional.n_orden = triaje.n_orden)\n" +
"            where   triaje.n_orden ='" +txtBuscarCod.getText().toString()+"'"+
"            ORDER BY triaje.n_orden desc limit 20";
    }else{
          sql ="select n_orden_ocupacional.n_orden, "
            + "datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + "n_orden_ocupacional.n_hora,triaje.fecha_triaje,n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
                  + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,"
            + "ca.n_orden as aptitud,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,  "
            + "bc.n_orden as conduccion,ba.n_orden as altura,  "
            + "CASE  WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  END as estado, \n" 
            + "CASE  WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ac.no_apto = 'TRUE' THEN 'No Apto' END as estadoac, \n" 
            + "CASE  WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN a.no_apto = 'TRUE' THEN 'No Apto' END as estadoad,"
              + "CASE  WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN bc.chk_no = 'TRUE' THEN 'No Apto' END as estadobc,"
            + "CASE  WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN ba.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto' END as estadoba,"
            + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional "
            + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
            +" left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexo7d as a ON (a.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexoc as ac ON (ac.n_orden=n_orden_ocupacional.n_orden)"
            +" left join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_conduccion as bc ON (bc.n_orden=n_orden_ocupacional.n_orden)"
           +" left join b_certificado_altura as ba ON (ba.n_orden=n_orden_ocupacional.n_orden)"     
           + "inner join triaje on (n_orden_ocupacional.n_orden = triaje.n_orden)"
            + "where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%"+valor+"%' "
            + "ORDER BY triaje.n_orden desc limit 20";    
      // DefaultTableModel tblDatos = (DefaultTableModel) tblProductos.getModel(); 
    }
      model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("n_orden");
                    registros[1]= oConn.setResult.getString("nombres");
                    registros[2]= formato.format(oConn.setResult.getDate("fecha_triaje"));
                    registros[3]= oConn.setResult.getString("razon_empresa");
                    registros[4]= oConn.setResult.getString("razon_contrata");
                    String exa=oConn.setResult.getString("nom_examen");
                    registros[5]= exa;
                    registros[6]= oConn.setResult.getString("cargo_de");
                    String s=oConn.setResult.getString("aptitud");
                    String a=oConn.setResult.getString("anexo7d");
                    String o=oConn.setResult.getString("observados");
                    String ac=oConn.setResult.getString("anexoc");
                    String bc=oConn.setResult.getString("conduccion");
                    String ba=oConn.setResult.getString("altura");
                    if(s != null ){
                        registros[7]="COMPLETO";
                        registros[8]= oConn.setResult.getString("estado");
                    }else if( a != null && "ANEXO-7D".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoad");
                    }else if( o!= null){
                            registros[7]="OBSERVADO";
                            registros[8]= oConn.setResult.getString("examenes");
                    }else if( ac!= null && "ANEXO-C".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoac");
                    }else  if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadobc");
                    }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoba");
                    }else{ 
                        registros[7]="FALTA";
                        registros[8]= " ";
                    }
                    registros[9]= oConn.setResult.getString("n_hora");
                    registros[10]= oConn.setResult.getString("horasalida");
                    //registros[3]=oConn.setResult.getString("anexo7c");
                    tbTriaje.setDefaultRenderer(Object.class, new MyCellRenderer());
                     model.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  tbTriaje.setModel(model);
                  sbTablaTriaje();
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
public class MyCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        boolean valid = String.valueOf(table.getValueAt(row, 7)).equals("COMPLETO");
        boolean valid1= String.valueOf(table.getValueAt(row, 7)).equals("OBSERVADO");
        component.setBackground(valid ? Color.green :valid1? Color.ORANGE:Color.RED);
        
//        component.setForeground(valid ? Color.black : Color.white);
        return component;
    }
}
    private void sbTablaTriaje() {
        tbTriaje.getColumnModel().getColumn(0).setMinWidth(50);
        tbTriaje.getColumnModel().getColumn(0).setMaxWidth(50);
//tbTriaje.getColumnModel().getColumn(1).setMinWidth(130);//260
//tbTriaje.getColumnModel().getColumn(1).setMaxWidth(130);
        tbTriaje.getColumnModel().getColumn(2).setMinWidth(80);//130
        tbTriaje.getColumnModel().getColumn(2).setMaxWidth(80);
//tbTriaje.getColumnModel().getColumn(3).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(3).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(4).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(4).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(5).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(5).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(6).setMinWidth(90);//260
//tbTriaje.getColumnModel().getColumn(6).setMaxWidth(90); 
        tbTriaje.setFont(new java.awt.Font("Tahoma", 0, 11));
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();

        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.LEFT);
        tbTriaje.setSelectionForeground(Color.BLUE);
        tbTriaje.setGridColor(Color.blue);
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
//        tbTriaje.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        tbTriaje.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11));
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));

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

}
