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
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
public final class ExamenesAdicionales extends javax.swing.JInternalFrame {
 clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
        javax.swing.ImageIcon oIconoNo = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/xx.png"));
        javax.swing.ImageIcon oNo = null;
String[]Triaje = new String[]{};
     DefaultTableModel model;
    
   public ExamenesAdicionales() {
      initComponents();
      CargarEmpresas();
      CargarContratas();
      CargarServicios();
       
       
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
        FechaExamen = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtCondicionPsico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGyFSan = new javax.swing.JTextField();
        chkAprobadoPisco = new javax.swing.JCheckBox();
        chkObservadoPsico = new javax.swing.JCheckBox();
        chkDesaprobadoPsico = new javax.swing.JCheckBox();
        btnRegistrarPsico = new javax.swing.JButton();
        btnEditarPsico = new javax.swing.JButton();
        btnActualizarPsico = new javax.swing.JButton();
        chkO = new javax.swing.JCheckBox();
        chkA = new javax.swing.JCheckBox();
        chkB = new javax.swing.JCheckBox();
        chkAB = new javax.swing.JCheckBox();
        rbRHnegativo = new javax.swing.JRadioButton();
        rbRHpositivo = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCondicionTA = new javax.swing.JTextField();
        chkAprobadoTA = new javax.swing.JCheckBox();
        chkObservadoTA = new javax.swing.JCheckBox();
        chkDesaprobadoTA = new javax.swing.JCheckBox();
        btnRegistrarTA = new javax.swing.JButton();
        btnEditarTA = new javax.swing.JButton();
        btnActualizarTA = new javax.swing.JButton();
        txtNumero1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCondicionFT = new javax.swing.JTextField();
        chkAprobadoFT = new javax.swing.JCheckBox();
        chkObservadoFT = new javax.swing.JCheckBox();
        chkDesaprobadoFT = new javax.swing.JCheckBox();
        btnRegistrarFT = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMarcaResp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTipoResp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTallaResp = new javax.swing.JTextField();
        btnEditarFT = new javax.swing.JButton();
        btnActualizarFT = new javax.swing.JButton();
        txtNumero2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        btnLimpiarCancelar = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        atxtObservacionesAltura = new javax.swing.JScrollPane();
        txtResumen = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Examen Psicosensometrico -Test de Altura - Fist Test");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos"));

        jLabel1.setText("Empresa:");

        cboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresaActionPerformed(evt);
            }
        });

        jLabel2.setText("Contrata:");

        cboContratas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboContratasActionPerformed(evt);
            }
        });

        jLabel3.setText("Ex.Médico :");

        jLabel5.setText("Nombres:");

        jLabel6.setText("Apellidos:");

        jLabel7.setText("Fecha Nac:");

        FechaNacimiento.setDateFormatString("dd-MM-yyyy");

        FechaExamen.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExamenPropertyChange(evt);
            }
        });

        jLabel8.setText("Fecha Examen:");

        jLabel33.setText("Edad:");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

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

        jLabel28.setText("Nro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 50, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(FechaExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboContratas, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
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
                .addGap(2, 2, 2)
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
                    .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel19.setText("Psiconsensometria:");

        txtCondicionPsico.setEnabled(false);

        jLabel9.setText("Grupo y Factor Sanguineo:");

        txtGyFSan.setEnabled(false);

        chkAprobadoPisco.setText("Aprobado");
        chkAprobadoPisco.setEnabled(false);
        chkAprobadoPisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAprobadoPiscoActionPerformed(evt);
            }
        });

        chkObservadoPsico.setText("Observado");
        chkObservadoPsico.setEnabled(false);
        chkObservadoPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkObservadoPsicoActionPerformed(evt);
            }
        });

        chkDesaprobadoPsico.setText("Desaprobado");
        chkDesaprobadoPsico.setEnabled(false);
        chkDesaprobadoPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDesaprobadoPsicoActionPerformed(evt);
            }
        });

        btnRegistrarPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnRegistrarPsico.setText("Registar");
        btnRegistrarPsico.setEnabled(false);
        btnRegistrarPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPsicoActionPerformed(evt);
            }
        });

        btnEditarPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarPsico.setText("Editar");
        btnEditarPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPsicoActionPerformed(evt);
            }
        });

        btnActualizarPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizarPsico.setText("Actualizar");
        btnActualizarPsico.setEnabled(false);
        btnActualizarPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPsicoActionPerformed(evt);
            }
        });

        chkO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkO.setText("O");
        chkO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOActionPerformed(evt);
            }
        });

        chkA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkA.setText("A");
        chkA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAActionPerformed(evt);
            }
        });

        chkB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkB.setText("B");
        chkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBActionPerformed(evt);
            }
        });

        chkAB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkAB.setText("AB");
        chkAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkABActionPerformed(evt);
            }
        });

        rbRHnegativo.setText("Rh(-)");
        rbRHnegativo.setPreferredSize(new java.awt.Dimension(51, 15));
        rbRHnegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRHnegativoActionPerformed(evt);
            }
        });

        rbRHpositivo.setText("Rh(+)");
        rbRHpositivo.setPreferredSize(new java.awt.Dimension(55, 15));
        rbRHpositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRHpositivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(chkAprobadoPisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkObservadoPsico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkDesaprobadoPsico))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCondicionPsico, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGyFSan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnRegistrarPsico))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(chkO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRHpositivo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRHnegativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnActualizarPsico)
                .addGap(18, 18, 18)
                .addComponent(btnEditarPsico)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtCondicionPsico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAprobadoPisco)
                    .addComponent(chkObservadoPsico)
                    .addComponent(chkDesaprobadoPsico))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtGyFSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkO, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkB, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAB, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRHpositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRHnegativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnRegistrarPsico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarPsico)
                    .addComponent(btnEditarPsico)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Psicosensomtria ", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel10.setText("Test Altura: ");

        txtCondicionTA.setEnabled(false);

        chkAprobadoTA.setText("Aprobado");
        chkAprobadoTA.setEnabled(false);
        chkAprobadoTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAprobadoTAActionPerformed(evt);
            }
        });

        chkObservadoTA.setText("Observado");
        chkObservadoTA.setEnabled(false);
        chkObservadoTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkObservadoTAActionPerformed(evt);
            }
        });

        chkDesaprobadoTA.setText("Desaprobado");
        chkDesaprobadoTA.setEnabled(false);
        chkDesaprobadoTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDesaprobadoTAActionPerformed(evt);
            }
        });

        btnRegistrarTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnRegistrarTA.setText("Registar");
        btnRegistrarTA.setEnabled(false);
        btnRegistrarTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTAActionPerformed(evt);
            }
        });

        btnEditarTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarTA.setText("Editar");
        btnEditarTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTAActionPerformed(evt);
            }
        });

        btnActualizarTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizarTA.setText("Actualizar");
        btnActualizarTA.setEnabled(false);
        btnActualizarTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTAActionPerformed(evt);
            }
        });

        txtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero1ActionPerformed(evt);
            }
        });
        txtNumero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero1KeyTyped(evt);
            }
        });

        jLabel29.setText("Nro:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditarTA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarTA)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCondicionTA, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(80, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(chkAprobadoTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkObservadoTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDesaprobadoTA)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarTA)
                .addGap(85, 85, 85))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCondicionTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAprobadoTA)
                    .addComponent(chkObservadoTA)
                    .addComponent(chkDesaprobadoTA))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarTA)
                    .addComponent(btnEditarTA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarTA)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Test Altura", jPanel4);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel11.setText("Fist Test:");

        txtCondicionFT.setEnabled(false);

        chkAprobadoFT.setText("Aprobado");
        chkAprobadoFT.setEnabled(false);
        chkAprobadoFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAprobadoFTActionPerformed(evt);
            }
        });

        chkObservadoFT.setText("Observado");
        chkObservadoFT.setEnabled(false);
        chkObservadoFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkObservadoFTActionPerformed(evt);
            }
        });

        chkDesaprobadoFT.setText("Desaprobado");
        chkDesaprobadoFT.setEnabled(false);
        chkDesaprobadoFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDesaprobadoFTActionPerformed(evt);
            }
        });

        btnRegistrarFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnRegistrarFT.setText("Registar");
        btnRegistrarFT.setEnabled(false);
        btnRegistrarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFTActionPerformed(evt);
            }
        });

        jLabel4.setText("Marca de Respirador:");

        jLabel12.setText("Tipo de Respirador:");

        jLabel13.setText("Talla de Respirador:");

        btnEditarFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarFT.setText("Editar");
        btnEditarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFTActionPerformed(evt);
            }
        });

        btnActualizarFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizarFT.setText("Actualizar");
        btnActualizarFT.setEnabled(false);
        btnActualizarFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarFTActionPerformed(evt);
            }
        });

        txtNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero2ActionPerformed(evt);
            }
        });
        txtNumero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero2KeyTyped(evt);
            }
        });

        jLabel30.setText("Nro:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(txtMarcaResp))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTallaResp))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipoResp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCondicionFT, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarFT))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chkAprobadoFT)
                        .addGap(14, 14, 14)
                        .addComponent(chkObservadoFT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkDesaprobadoFT)))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarFT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarFT)
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCondicionFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAprobadoFT)
                    .addComponent(chkObservadoFT)
                    .addComponent(chkDesaprobadoFT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMarcaResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtTipoResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnEditarFT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTallaResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarFT)
                    .addComponent(btnActualizarFT)))
        );

        jTabbedPane1.addTab("Fist Test", jPanel6);

        btnLimpiarCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarCancelar.setText("Limpiar/Cancelar");
        btnLimpiarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCancelarActionPerformed(evt);
            }
        });

        jLabel34.setText("Resumen:");

        txtResumen.setColumns(20);
        txtResumen.setRows(2);
        atxtObservacionesAltura.setViewportView(txtResumen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnLimpiarCancelar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnLimpiarCancelar)
                        .addContainerGap())
                    .addComponent(jTabbedPane1)))
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
           
          txtCondicionPsico.requestFocus();
     }});
   }//GEN-LAST:event_cboContratasActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        if (!txtNumero.getText().isEmpty()) {
                if (!OrdenExistePsico()) {
                        String Sql = "select datos_paciente.nombres_pa,"
                                + "datos_paciente.apellidos_pa,"
                                + "datos_paciente.fecha_nacimiento_pa,"
                                + "n_orden_ocupacional.nom_examen,"
                                + "n_orden_ocupacional.razon_empresa,"
                                + "n_orden_ocupacional.razon_contrata, CASE WHEN l.chko = 'TRUE' THEN 'O'"
                            + " WHEN l.chka = 'TRUE' THEN 'A'"
                            + " WHEN l.chkb = 'TRUE' THEN 'B'"
                            + " WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| "
                            + "CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' "
                            + " WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS Grupofactor "
                                + "FROM datos_paciente "
                                + "INNER JOIN n_orden_ocupacional "
                                + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa) "
                                + "LEFT JOIN lab_clinico as l "
                                + "ON (l.n_orden = n_orden_ocupacional.n_orden) "
                                + "WHERE n_orden_ocupacional.n_orden='" + txtNumero.getText() + "'";
                        oConn.FnBoolQueryExecute(Sql);
                        try {
                            if (oConn.setResult.next()) {
                                txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                                txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                                FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                                String examen=oConn.setResult.getString("nom_examen");
                                cboTipoServicio.setSelectedItem(examen);
                                cboEmpresa.setSelectedItem(oConn.setResult.getString("razon_empresa"));
                                cboContratas.setSelectedItem(oConn.setResult.getString("razon_contrata"));
                                txtGyFSan.setText(oConn.setResult.getString("Grupofactor"));
                                txtCondicionPsico.requestFocusInWindow();
                                txtNumero.setEnabled(false);
                                txtEdad.setText(String.valueOf(calcularEdad(FechaNacimiento.getCalendar())));
                                fecha();
                                habilitaPsico(true);
                                oConn.setResult.close();
                            } else {
                                oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                                oConn.setResult.close();
                            }
                        } catch (SQLException ex) {
                            oFunc.SubSistemaMensajeInformacion("Examenes:" + ex.getMessage().toString());
                        }
                }
        }
    }//GEN-LAST:event_txtNumeroActionPerformed
  public void habilitaPsico(boolean r){
   txtCondicionPsico.setEnabled(r);
   chkAprobadoPisco.setEnabled(r);
   chkObservadoPsico.setEnabled(r);
   chkDesaprobadoPsico.setEnabled(r);
   txtGyFSan.setEnabled(r);
   btnRegistrarPsico.setEnabled(r);
   btnActualizarPsico.setEnabled(r);
   
  }
   public void habilitaTestAltura(boolean r){
   txtCondicionTA.setEnabled(r);
   chkAprobadoTA.setEnabled(r);
   chkObservadoTA.setEnabled(r);
   chkDesaprobadoTA.setEnabled(r);
   btnRegistrarTA.setEnabled(r);
   btnActualizarTA.setEnabled(r);
   btnEditarTA.setEnabled(r);
  }
   public void habilitaFistTest(boolean r){
   txtCondicionFT.setEnabled(r);
   chkAprobadoFT.setEnabled(r);
   chkObservadoFT.setEnabled(r);
   chkDesaprobadoFT.setEnabled(r);
   txtMarcaResp.setEnabled(r);
   txtTipoResp.setEnabled(r);
   txtTallaResp.setEnabled(r);
   btnRegistrarFT.setEnabled(r);
   btnEditarFT.setEnabled(r);
   btnActualizarFT.setEnabled(r);
  }
    public void fecha(){
Date dateHoy = new Date();
       // SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       FechaExamen.setDate(dateHoy);
        
}
  
    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
          
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 32) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar Espacios!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {

//txtnombreApellido.transferFocus();
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnLimpiarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCancelarActionPerformed
       LimpiarFicha();
      
       txtNumero.setEnabled(true);
       txtNumero.requestFocus();
    }//GEN-LAST:event_btnLimpiarCancelarActionPerformed
   

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
       txtCondicionTA.requestFocus();
    }//GEN-LAST:event_txtEdadActionPerformed
    
    private void FechaExamenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExamenPropertyChange
       txtCondicionTA.requestFocus();
               
    }//GEN-LAST:event_FechaExamenPropertyChange

    private void btnEditarPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPsicoActionPerformed
        if (!txtNumero.getText().isEmpty()) {

            String Sql = "select datos_paciente.nombres_pa,"
                    + "datos_paciente.apellidos_pa,"
                    + "datos_paciente.fecha_nacimiento_pa,"
                    + "n_orden_ocupacional.nom_examen,"
                    + "n_orden_ocupacional.razon_empresa,"
                    + "n_orden_ocupacional.razon_contrata, "
                    + "examen_psicosensometrico.fecha_registro, "
                    + "examen_psicosensometrico.condicion, "
                    + "examen_psicosensometrico.grupofactorsan "
                    + "FROM datos_paciente "
                    + "INNER JOIN n_orden_ocupacional "
                    + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa) "
                    + "INNER JOIN examen_psicosensometrico "
                    + "ON (examen_psicosensometrico.n_orden = n_orden_ocupacional.n_orden) "
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
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_registro"));
                    txtCondicionPsico.setText(oConn.setResult.getString("condicion"));
                    txtGyFSan.setText(oConn.setResult.getString("grupofactorsan"));
                    txtCondicionPsico.requestFocusInWindow();
                    txtNumero.setEnabled(false);
                    txtEdad.setText(String.valueOf(calcularEdad(FechaNacimiento.getCalendar())));
                    habilitaPsico(true);
                    btnRegistrarPsico.setEnabled(false);
                    oConn.setResult.close();
                } else {
                    oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    oConn.setResult.close();
                }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Examenes:" + ex.getMessage().toString());
            }

        }
        
    }//GEN-LAST:event_btnEditarPsicoActionPerformed

    private void btnActualizarPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPsicoActionPerformed
        String sCodigo=txtNumero.getText();
        String strSqlStmt;
        
//      sCodigo = tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString();
        strSqlStmt="UPDATE triaje\n" +
                "   SET edad='" + txtEdad.getText().toString() + "', fecha_triaje='" + FechaExamen.getDate().toString() + "', \n" +
                "       talla='" + txtCondicionTA.getText().toString() + "', "+ 
                "       icc='" + txtCondicionPsico.getText().toString() +  "', conclusion='" + txtResumen.getText().toString() + "'\n" +
                " WHERE n_orden='" + sCodigo + "'";
            LimpiarFicha();
             txtNumero.setEnabled(true);
             txtNumero.requestFocus();
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
    }//GEN-LAST:event_btnActualizarPsicoActionPerformed

    private void btnRegistrarTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTAActionPerformed
        if (!txtNumero1.getText().isEmpty()) {
            if (!OrdenExisteTA()) {

                String strSqlStmt;
                String Query;
                strSqlStmt = "INSERT INTO examen_testaltura(";
                Query = "Values('";
                if (txtNumero1.getText().trim().length() >= 1) {
                    strSqlStmt += "n_orden";
                    Query += txtNumero1.getText().toString() + "'";
                }
                if (((JTextField) FechaExamen.getDateEditor().getUiComponent()).getText().trim().length() > 1) {
                    strSqlStmt += ",fecha_registro";
                    Query += ",'" + FechaExamen.getDate().toString() + "'";
                }
                if (txtCondicionPsico.getText().trim().length() >= 1) {
                    strSqlStmt += ",condicion";
                    Query += ",'" + txtCondicionPsico.getText().toString() + "'";
                }

                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                    LimpiarFicha();
                    txtNumero1.setEnabled(true);
                    txtNumero1.requestFocus();

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            }
        } else {
            oFunc.SubSistemaMensajeError("Codigo Utililizado");
            txtNumero1.requestFocus();
        }
    }//GEN-LAST:event_btnRegistrarTAActionPerformed

    private void btnRegistrarPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPsicoActionPerformed
        if (!txtNumero.getText().isEmpty()) {
            if (!OrdenExistePsico()) {

                String strSqlStmt;
                String Query;
                strSqlStmt = "INSERT INTO examen_psicosensometrico(";
                Query = "Values('";
                if (txtNumero.getText().trim().length() >= 1) {
                    strSqlStmt += "n_orden";
                    Query += txtNumero.getText().toString() + "'";
                }
                if (((JTextField) FechaExamen.getDateEditor().getUiComponent()).getText().trim().length() > 1) {
                    strSqlStmt += ",fecha_registro";
                    Query += ",'" + FechaExamen.getDate().toString() + "'";
                }
                if (txtCondicionPsico.getText().trim().length() >= 1) {
                    strSqlStmt += ",condicion";
                    Query += ",'" + txtCondicionPsico.getText().toString() + "'";
                }
                if (txtGyFSan.getText().trim().length() >= 1) {
                    strSqlStmt += ",grupofactorsan";
                    Query += ",'" + txtGyFSan.getText().toString() + "'";
                }

                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                    LimpiarFicha();
                    txtNumero.setEnabled(true);
                    txtNumero.requestFocus();

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            }
        } else {
            oFunc.SubSistemaMensajeError("Codigo Utililizado");
            txtNumero.requestFocus();
        }
    }//GEN-LAST:event_btnRegistrarPsicoActionPerformed

    private void btnRegistrarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFTActionPerformed
        if (!txtNumero2.getText().isEmpty()) {
            if (!OrdenExisteFT()) {

                String strSqlStmt;
                String Query;
                strSqlStmt = "INSERT INTO examen_fisttest(";
                Query = "Values('";
                if (txtNumero2.getText().trim().length() >= 1) {
                    strSqlStmt += "n_orden";
                    Query += txtNumero2.getText().toString() + "'";
                }
                if (((JTextField) FechaExamen.getDateEditor().getUiComponent()).getText().trim().length() > 1) {
                    strSqlStmt += ",fecha_registro";
                    Query += ",'" + FechaExamen.getDate().toString() + "'";
                }
                if (txtCondicionFT.getText().trim().length() >= 1) {
                    strSqlStmt += ",condicion";
                    Query += ",'" + txtCondicionFT.getText().toString() + "'";
                }
                if (txtMarcaResp.getText().trim().length() >= 1) {
                    strSqlStmt += ",marca_respirador";
                    Query += ",'" + txtMarcaResp.getText().toString() + "'";
                }
                if (txtTipoResp.getText().trim().length() >= 1) {
                    strSqlStmt += ",tipo_respirador";
                    Query += ",'" + txtTipoResp.getText().toString() + "'";
                }
                if (txtTallaResp.getText().trim().length() >= 1) {
                    strSqlStmt += ",talla_espirador";
                    Query += ",'" + txtTallaResp.getText().toString() + "'";
                }
                if (txtResumen.getText().trim().length() >= 1) {
                    strSqlStmt += ",resumen";
                    Query += ",'" + txtResumen.getText().toString() + "'";
                }

                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                    LimpiarFicha();
                    txtNumero2.setEnabled(true);
                    txtNumero2.requestFocus();

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
            }
        } else {
            oFunc.SubSistemaMensajeError("Codigo Utililizado");
            txtNumero2.requestFocus();
        }
    }//GEN-LAST:event_btnRegistrarFTActionPerformed

    private void btnEditarTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTAActionPerformed
         if (!txtNumero1.getText().isEmpty()) {

            String Sql = "select datos_paciente.nombres_pa,"
                    + "datos_paciente.apellidos_pa,"
                    + "datos_paciente.fecha_nacimiento_pa,"
                    + "n_orden_ocupacional.nom_examen,"
                    + "n_orden_ocupacional.razon_empresa,"
                    + "n_orden_ocupacional.razon_contrata, "
                    + "examen_testaltura.fecha_registro, "
                    + "examen_testaltura.condicion "
                    + "FROM datos_paciente "
                    + "INNER JOIN n_orden_ocupacional "
                    + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa) "
                    + "INNER JOIN examen_testaltura "
                    + "ON (examen_testaltura.n_orden = n_orden_ocupacional.n_orden) "
                    + "WHERE n_orden_ocupacional.n_orden='" + txtNumero1.getText() + "'";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                    txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    cboTipoServicio.setSelectedItem(oConn.setResult.getString("nom_examen"));
                    cboEmpresa.setSelectedItem(oConn.setResult.getString("razon_empresa"));
                    cboContratas.setSelectedItem(oConn.setResult.getString("razon_contrata"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_registro"));
                    txtCondicionTA.setText(oConn.setResult.getString("condicion"));
                    txtCondicionTA.requestFocusInWindow();
                    txtNumero1.setEnabled(false);
                    txtEdad.setText(String.valueOf(calcularEdad(FechaNacimiento.getCalendar())));
                    habilitaPsico(true);
                    btnRegistrarTA.setEnabled(false);
                    oConn.setResult.close();
                } else {
                    oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    oConn.setResult.close();
                }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Examenes:" + ex.getMessage().toString());
            }

        }
    }//GEN-LAST:event_btnEditarTAActionPerformed

    private void btnActualizarTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTAActionPerformed

    private void btnEditarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFTActionPerformed
        if (!txtNumero2.getText().isEmpty()) {

            String Sql = "select datos_paciente.nombres_pa,"
                    + "datos_paciente.apellidos_pa,"
                    + "datos_paciente.fecha_nacimiento_pa,"
                    + "n_orden_ocupacional.nom_examen,"
                    + "n_orden_ocupacional.razon_empresa,"
                    + "n_orden_ocupacional.razon_contrata, "
                    + "examen_fisttest.fecha_registro, "
                    + "examen_fisttest.condicion, "
                     + "examen_fisttest.marca_respirador, "
                    + "examen_fisttest.tipo_respirador, "
                     + "examen_fisttest.talla_espirador, "
                    + "examen_fisttest.resumen "
                    + "FROM datos_paciente "
                    + "INNER JOIN n_orden_ocupacional "
                    + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa) "
                    + "INNER JOIN examen_fisttest "
                    + "ON (examen_fisttest.n_orden = n_orden_ocupacional.n_orden) "
                    + "WHERE n_orden_ocupacional.n_orden='" + txtNumero2.getText() + "'";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                    txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    cboTipoServicio.setSelectedItem(oConn.setResult.getString("nom_examen"));
                    cboEmpresa.setSelectedItem(oConn.setResult.getString("razon_empresa"));
                    cboContratas.setSelectedItem(oConn.setResult.getString("razon_contrata"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_registro"));
                    txtCondicionFT.setText(oConn.setResult.getString("condicion"));
                    txtCondicionFT.setText(oConn.setResult.getString("marca_respirador"));
                    txtCondicionFT.setText(oConn.setResult.getString("tipo_respirador"));
                    txtCondicionFT.setText(oConn.setResult.getString("talla_espirador"));
                    txtCondicionFT.setText(oConn.setResult.getString("resumen"));
                    txtCondicionFT.requestFocusInWindow();
                    txtNumero2.setEnabled(false);
                    txtEdad.setText(String.valueOf(calcularEdad(FechaNacimiento.getCalendar())));
                    habilitaPsico(true);
                    btnRegistrarFT.setEnabled(false);
                    oConn.setResult.close();
                } else {
                    oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    oConn.setResult.close();
                }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Examenes:" + ex.getMessage().toString());
            }

        }
    }//GEN-LAST:event_btnEditarFTActionPerformed

    private void btnActualizarFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarFTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarFTActionPerformed

    private void txtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero1ActionPerformed
        if (!txtNumero1.getText().isEmpty()) {
                if (!OrdenExisteTA()) {
                    
                        String Sql = "select datos_paciente.nombres_pa,"
                                + "datos_paciente.apellidos_pa,"
                                + "datos_paciente.fecha_nacimiento_pa,"
                                + "n_orden_ocupacional.nom_examen,"
                                + "n_orden_ocupacional.razon_empresa,"
                                + "n_orden_ocupacional.razon_contrata "
                                + "FROM datos_paciente "
                                + "INNER JOIN n_orden_ocupacional "
                                + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa) "
                                + "WHERE n_orden_ocupacional.n_orden='" + txtNumero1.getText() + "'";
                        oConn.FnBoolQueryExecute(Sql);

                        try {
                            if (oConn.setResult.next()) {
                                txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                                txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                                FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                                String examen=oConn.setResult.getString("nom_examen");
                                cboTipoServicio.setSelectedItem(examen);
                                cboEmpresa.setSelectedItem(oConn.setResult.getString("razon_empresa"));
                                cboContratas.setSelectedItem(oConn.setResult.getString("razon_contrata"));
                                txtNumero1.setEnabled(false);
                                txtEdad.setText(String.valueOf(calcularEdad(FechaNacimiento.getCalendar())));
                                fecha();
                                habilitaTestAltura(true);
                                oConn.setResult.close();
                            } else {
                                oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                                oConn.setResult.close();
                            }
                        } catch (SQLException ex) {
                            oFunc.SubSistemaMensajeInformacion("Examenes:" + ex.getMessage().toString());
                        }
                }
        }
    }//GEN-LAST:event_txtNumero1ActionPerformed

    private void txtNumero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 32) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar Espacios!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {

//txtnombreApellido.transferFocus();
        }
    }//GEN-LAST:event_txtNumero1KeyTyped

    private void txtNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero2ActionPerformed
        if (!txtNumero2.getText().isEmpty()) {
                if (!OrdenExisteFT()) {
                    
                        String Sql = "select datos_paciente.nombres_pa,"
                                + "datos_paciente.apellidos_pa,"
                                + "datos_paciente.fecha_nacimiento_pa,"
                                + "n_orden_ocupacional.nom_examen,"
                                + "n_orden_ocupacional.razon_empresa,"
                                + "n_orden_ocupacional.razon_contrata "
                                + "FROM datos_paciente "
                                + "INNER JOIN n_orden_ocupacional "
                                + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa) "
                                + "WHERE n_orden_ocupacional.n_orden='" + txtNumero2.getText() + "'";
                        oConn.FnBoolQueryExecute(Sql);

                        try {
                            if (oConn.setResult.next()) {
                                txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                                txtApellido.setText(oConn.setResult.getString("apellidos_pa"));
                                FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                                String examen=oConn.setResult.getString("nom_examen");
                                cboTipoServicio.setSelectedItem(examen);
                                cboEmpresa.setSelectedItem(oConn.setResult.getString("razon_empresa"));
                                cboContratas.setSelectedItem(oConn.setResult.getString("razon_contrata"));
                                txtNumero2.setEnabled(false);
                                txtEdad.setText(String.valueOf(calcularEdad(FechaNacimiento.getCalendar())));
                                fecha();
                                habilitaFistTest(true);
                                oConn.setResult.close();
                            } else {
                                oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                                oConn.setResult.close();
                            }
                        } catch (SQLException ex) {
                            oFunc.SubSistemaMensajeInformacion("Examenes:" + ex.getMessage().toString());
                        }
                    
                }
            
        }
    }//GEN-LAST:event_txtNumero2ActionPerformed

    private void txtNumero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero2KeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 32) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar Espacios!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {

//txtnombreApellido.transferFocus();
        }
    }//GEN-LAST:event_txtNumero2KeyTyped

    private void chkAprobadoPiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAprobadoPiscoActionPerformed
        txtCondicionPsico.setText("APROBADO");
    }//GEN-LAST:event_chkAprobadoPiscoActionPerformed

    private void chkObservadoPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkObservadoPsicoActionPerformed
        txtCondicionPsico.setText("OBSERVADO");
    }//GEN-LAST:event_chkObservadoPsicoActionPerformed

    private void chkDesaprobadoPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDesaprobadoPsicoActionPerformed
        txtCondicionPsico.setText("DESAPROBADO");
    }//GEN-LAST:event_chkDesaprobadoPsicoActionPerformed

    private void chkAprobadoTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAprobadoTAActionPerformed
        txtCondicionTA.setText("APROBADO");
    }//GEN-LAST:event_chkAprobadoTAActionPerformed

    private void chkObservadoTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkObservadoTAActionPerformed
        txtCondicionTA.setText("OBSERVADO");
    }//GEN-LAST:event_chkObservadoTAActionPerformed

    private void chkDesaprobadoTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDesaprobadoTAActionPerformed
        txtCondicionTA.setText("DESAPROBADO");
    }//GEN-LAST:event_chkDesaprobadoTAActionPerformed

    private void chkAprobadoFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAprobadoFTActionPerformed
        txtCondicionFT.setText("APROBADO");
        
    }//GEN-LAST:event_chkAprobadoFTActionPerformed

    private void chkObservadoFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkObservadoFTActionPerformed
        txtCondicionFT.setText("OBSERVADO");
    }//GEN-LAST:event_chkObservadoFTActionPerformed

    private void chkDesaprobadoFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDesaprobadoFTActionPerformed
        txtCondicionFT.setText("DESAPROBADO");
    }//GEN-LAST:event_chkDesaprobadoFTActionPerformed

    private void chkOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOActionPerformed
        txtGyFSan.setText("O");
    }//GEN-LAST:event_chkOActionPerformed

    private void chkAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAActionPerformed
        txtGyFSan.setText("A");
    }//GEN-LAST:event_chkAActionPerformed

    private void chkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBActionPerformed
        txtGyFSan.setText("B");
    }//GEN-LAST:event_chkBActionPerformed

    private void chkABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkABActionPerformed
        txtGyFSan.setText("AB");
    }//GEN-LAST:event_chkABActionPerformed

    private void rbRHnegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRHnegativoActionPerformed
        txtGyFSan.setText(txtGyFSan.getText().toString()+"-");
        
    }//GEN-LAST:event_rbRHnegativoActionPerformed

    private void rbRHpositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRHpositivoActionPerformed
        txtGyFSan.setText(txtGyFSan.getText().toString()+"+");
       
    }//GEN-LAST:event_rbRHpositivoActionPerformed


   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaExamen;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JScrollPane atxtObservacionesAltura;
    private javax.swing.ButtonGroup bgTriaje;
    private javax.swing.ButtonGroup btBuscar;
    private javax.swing.JButton btnActualizarFT;
    private javax.swing.JButton btnActualizarPsico;
    private javax.swing.JButton btnActualizarTA;
    private javax.swing.JButton btnEditarFT;
    private javax.swing.JButton btnEditarPsico;
    private javax.swing.JButton btnEditarTA;
    private javax.swing.JButton btnLimpiarCancelar;
    private javax.swing.JButton btnRegistrarFT;
    private javax.swing.JButton btnRegistrarPsico;
    private javax.swing.JButton btnRegistrarTA;
    private javax.swing.JComboBox cboContratas;
    private javax.swing.JComboBox cboEmpresa;
    private javax.swing.JComboBox cboTipoServicio;
    private javax.swing.JCheckBox chkA;
    private javax.swing.JCheckBox chkAB;
    private javax.swing.JCheckBox chkAprobadoFT;
    private javax.swing.JCheckBox chkAprobadoPisco;
    private javax.swing.JCheckBox chkAprobadoTA;
    private javax.swing.JCheckBox chkB;
    private javax.swing.JCheckBox chkDesaprobadoFT;
    private javax.swing.JCheckBox chkDesaprobadoPsico;
    private javax.swing.JCheckBox chkDesaprobadoTA;
    private javax.swing.JCheckBox chkO;
    private javax.swing.JCheckBox chkObservadoFT;
    private javax.swing.JCheckBox chkObservadoPsico;
    private javax.swing.JCheckBox chkObservadoTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbRHnegativo;
    private javax.swing.JRadioButton rbRHpositivo;
    private javax.swing.ButtonGroup tipoPaciente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCondicionFT;
    private javax.swing.JTextField txtCondicionPsico;
    private javax.swing.JTextField txtCondicionTA;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGyFSan;
    private javax.swing.JTextField txtMarcaResp;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextArea txtResumen;
    private javax.swing.JTextField txtTallaResp;
    private javax.swing.JTextField txtTipoResp;
    // End of variables declaration//GEN-END:variables
    public boolean OrdenExisteFT(){
        // Para devolver el resultado
        boolean bResultado=false;
        // Para el Query
        String sQuery="";
        // Prepara el Query
        sQuery  = "Select * from examen_fisttest Where n_orden="+txtNumero.getText().toString();
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             txtNumero.setText(null);
             txtNumero.requestFocus();
            }
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        // Retorna el Resultado
        return bResultado;
        
    }
     public boolean OrdenExistePsico(){
        // Para devolver el resultado
        boolean bResultado=false;
        // Para el Query
        String sQuery="";
        // Prepara el Query
        sQuery  = "Select * from examen_psicosensometrico Where n_orden="+txtNumero.getText().toString();
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             txtNumero.setText(null);
             txtNumero.requestFocus();
            }
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        // Retorna el Resultado
        return bResultado;
        
    }
      public boolean OrdenExisteTA(){
        // Para devolver el resultado
        boolean bResultado=false;
        // Para el Query
        String sQuery="";
        // Prepara el Query
        sQuery  = "Select * from examen_testaltura Where n_orden="+txtNumero.getText().toString();
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             txtNumero.setText(null);
             txtNumero.requestFocus();
            }
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        // Retorna el Resultado
        return bResultado;
        
    }
   private void LimpiarFicha(){
   txtNumero.setText(null);
   txtNumero1.setText(null);
   txtNumero2.setText(null);
   cboTipoServicio.setSelectedIndex(-1);
   cboContratas.setSelectedIndex(-1);
   cboEmpresa.setSelectedIndex(-1);
   txtNombre.setText(null);
   txtApellido.setText(null);
   FechaNacimiento.setDate(null);
   txtEdad.setText(null);
   FechaExamen.setDate(null);
   txtCondicionTA.setText(null);
   txtCondicionPsico.setText(null);
   txtCondicionFT.setText(null);
   txtTipoResp.setText(null);
   txtTallaResp.setText(null);
   txtResumen.setText(null);
   txtGyFSan.setText(null);
       habilitaPsico(false);
       habilitaFistTest(false);
       habilitaTestAltura(false);
   txtNumero.requestFocus();
           
   
   }
  
    private void abrirDialoj(){
       FichaTriajeModalCod FrmModalCod = new FichaTriajeModalCod(null,true);
        FrmModalCod.setLocationRelativeTo(null);
        FrmModalCod.setVisible(true);
    
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
