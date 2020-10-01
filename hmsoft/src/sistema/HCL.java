/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import autocomplete.ajTextFieldConsulta;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrador
 */
public class HCL extends javax.swing.JInternalFrame {
 clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    DefaultTableModel model;
    public HCL() {
        initComponents();
        oFunc.Fecha(Fecha);
        txtNombre.requestFocus();
        new ajTextFieldConsulta.autocompleterText(txtNombre,"select nombres_pa||' '||apellidos_pa as nombre FROM datos_paciente WHERE CONCAT(nombres_pa,' ',apellidos_pa)");
        sbCargarDatosMC("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHCL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtEC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        txtPA = new javax.swing.JTextField();
        txtR = new javax.swing.JTextField();
        txtFC = new javax.swing.JTextField();
        txtSO2 = new javax.swing.JTextField();
        txtT = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtTalla = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnamnesis = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAuxiliares = new javax.swing.JTextArea();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtExFisico = new javax.swing.JTextArea();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtTratamiento = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        txtCita = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbHC = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setClosable(true);
        setTitle("Historia Clinica - Horizonte medic");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Historia Clinica"));

        jLabel1.setText("Nº HCL :");

        txtHCL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHCL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHCL.setText("0");

        jLabel3.setText("Nombre :");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Edad :");

        jLabel5.setText("Sexo :");

        txtEdad.setEditable(false);

        txtSexo.setEditable(false);

        jLabel6.setText("Nº Ticket :");

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        jLabel7.setText("DNI :");

        txtDNI.setEditable(false);

        txtEC.setEditable(false);

        jLabel8.setText("E. Civil :");

        txtDireccion.setEditable(false);

        jLabel9.setText("Dirección :");

        jLabel10.setText("Fecha :");

        jLabel11.setText("P/A :");

        jLabel12.setText("FC :");

        jLabel13.setText("P :");

        jLabel14.setText("R :");

        jLabel15.setText("Tº :");

        jLabel16.setText("SO2 :");

        jLabel17.setText("PESO :");

        jLabel18.setText("TALLA :");

        txtP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPActionPerformed(evt);
            }
        });

        txtPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAActionPerformed(evt);
            }
        });

        txtR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRActionPerformed(evt);
            }
        });

        txtFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCActionPerformed(evt);
            }
        });

        txtSO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSO2ActionPerformed(evt);
            }
        });

        txtT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTActionPerformed(evt);
            }
        });

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        txtTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTallaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHCL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSO2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtHCL)
                        .addComponent(jLabel6)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAnamnesis.setColumns(20);
        txtAnamnesis.setRows(3);
        jScrollPane1.setViewportView(txtAnamnesis);

        jTabbedPane1.addTab("Anamnesis :", jScrollPane1);

        txtAuxiliares.setColumns(20);
        txtAuxiliares.setRows(3);
        jScrollPane3.setViewportView(txtAuxiliares);

        jTabbedPane2.addTab("Exámenes Auxiliares :", jScrollPane3);

        txtExFisico.setColumns(20);
        txtExFisico.setRows(3);
        jScrollPane4.setViewportView(txtExFisico);

        jTabbedPane3.addTab("Examen físico :", jScrollPane4);

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(3);
        jScrollPane5.setViewportView(txtDiagnostico);

        jTabbedPane4.addTab("Diagnóstico :", jScrollPane5);

        txtTratamiento.setColumns(20);
        txtTratamiento.setRows(3);
        jScrollPane6.setViewportView(txtTratamiento);

        jTabbedPane5.addTab("Tratamiento :", jScrollPane6);

        jLabel19.setText("Cita :");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tbHC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbHC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbHCMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(tbHC);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Historias Guardadas :", jPanel2);

        jLabel20.setText("Buscar :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1)
                            .addComponent(jTabbedPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCita)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar))
                        .addContainerGap())
                    .addComponent(jSeparator3)))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        cLLenar(txtNombre);
        txtPA.requestFocus();
        txtNombre.setEditable(false);
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAActionPerformed
        txtP.requestFocus();
    }//GEN-LAST:event_txtPAActionPerformed

    private void txtPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPActionPerformed
        txtFC.requestFocus();
    }//GEN-LAST:event_txtPActionPerformed

    private void txtFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCActionPerformed
        txtR.requestFocus();
    }//GEN-LAST:event_txtFCActionPerformed

    private void txtRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRActionPerformed
        txtT.requestFocus();
    }//GEN-LAST:event_txtRActionPerformed

    private void txtSO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSO2ActionPerformed
        txtPeso.requestFocus();
    }//GEN-LAST:event_txtSO2ActionPerformed

    private void txtTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTActionPerformed
      txtSO2.requestFocus();
    }//GEN-LAST:event_txtTActionPerformed

    private void txtTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTallaActionPerformed
        txtAnamnesis.requestFocus();
    }//GEN-LAST:event_txtTallaActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
       txtTalla.requestFocus();
    }//GEN-LAST:event_txtPesoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       sbCargarDatosMC(txtBuscar.getText().toString());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if(!txtNombre.getText().isEmpty()&& !txtHCL.getText().isEmpty()){
            Agregar();
            sbCargarDatosMC("");
        } else {
        oFunc.SubSistemaMensajeError("Ingrese Evaluado");
         txtNombre.requestFocus();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tbHCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHCMousePressed
        if (evt.getClickCount() == 2) 
        {  
            
            Integer cod  = Integer.valueOf(tbHC.getValueAt(tbHC.getSelectedRow(),0).toString());
            print(cod);
            
        }
    }//GEN-LAST:event_tbHCMousePressed
  private void print(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"HCL.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Hoja de Ruta EXMENES OCUPACIONALES");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 }
 private com.toedter.calendar.JDateChooser FNacimiento;
    public void cLLenar(JTextField cod){
        FNacimiento = new com.toedter.calendar.JDateChooser();
        String oSql="select cod_pa,sexo_pa, estado_civil_pa,historial_pa,fecha_nacimiento_pa,direccion_pa from datos_paciente where CONCAT(nombres_pa,' ',apellidos_pa) = '"+cod.getText().toString()+"'";
    oConn.FnBoolQueryExecute(oSql);
    try {
            if (oConn.setResult.next()) {
                txtSexo.setText(oConn.setResult.getString("sexo_pa").equals("M")? "MASCULINO":"FEMENINO"); 
                txtHCL.setText(oConn.setResult.getString("historial_pa"));
                txtDNI.setText(oConn.setResult.getString("cod_pa"));
               FNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                txtDireccion.setText(oConn.setResult.getString("direccion_pa"));
                txtEC.setText(oConn.setResult.getString("estado_civil_pa"));
                txtEdad.setText(String.valueOf(oFunc.calcularEdad(FNacimiento.getCalendar())) );
                oConn.setResult.close();
               txtNombre.setEditable(false);
            } 
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Ticket: " + ex.getMessage().toString());
        }
    
    }
    public void limpiar(){
    txtNombre.setEditable(true);    
    txtNombre.setText(null);
    txtEdad.setText(null);
    txtSexo.setText(null);
    txtDNI.setText(null);
    txtEC.setText(null);
    txtDireccion.setText(null);
    txtPA.setText(null);
    txtP.setText(null);
    txtFC.setText(null);
    txtR.setText(null);
    txtT.setText(null);
    txtSO2.setText(null);
    txtPeso.setText(null);
    txtTalla.setText(null);
    txtAnamnesis.setText(null);
    txtExFisico.setText(null);
    txtDiagnostico.setText(null);
    txtAuxiliares.setText(null);
    txtTratamiento.setText(null);
    txtCita.setText(null);
    txtHCL.setText(null);
    txtNombre.requestFocus();
    }
        public void Agregar(){
    String insert="INSERT INTO hcl(cod_pa,hcl_edad,hcl_fecha";
    String values ="VALUES ('"+txtDNI.getText().toString()+"','"+txtEdad.getText().toString()+"','"+ Fecha.getDate().toString()+"'";
           
           if(!txtPA.getText().isEmpty()){ 
           insert += ",hcl_pa";
           values += ",'"+txtPA.getText().toString()+"'";
           }
           if(!txtP.getText().isEmpty()){ 
           insert += ",hcl_p";
           values += ",'"+txtP.getText().toString()+"'";
           }
           if(!txtFC.getText().isEmpty()){ 
           insert += ",hcl_fc";
           values += ",'"+txtFC.getText().toString()+"'";
           }
           if(!txtR.getText().isEmpty()){ 
           insert += ",hcl_r";
           values += ",'"+txtR.getText().toString()+"'";
           }
           if(!txtT.getText().isEmpty()){ 
           insert += ",hcl_t";
           values += ",'"+txtT.getText().toString()+"'";
           }
           if(!txtSO2.getText().isEmpty()){ 
           insert += ",hcl_so2";
           values += ",'"+txtSO2.getText().toString()+"'";
           }
           if(!txtPeso.getText().isEmpty()){ 
           insert += ",hcl_peso";
           values += ",'"+txtPeso.getText().toString()+"'";
           }
           if(!txtTalla.getText().isEmpty()){ 
           insert += ",hcl_talla";
           values += ",'"+txtTalla.getText().toString()+"'";
           }
           //
           if(!txtAnamnesis.getText().isEmpty()){ 
           insert += ",h_anamnesis";
           values += ",'"+txtAnamnesis.getText().toString()+"'";
           }
           if(!txtExFisico.getText().isEmpty()){ 
           insert += ",h_ex_fisico";
           values += ",'"+txtExFisico.getText().toString()+"'";
           }
           if(!txtDiagnostico.getText().isEmpty()){ 
           insert += ",h_diagnostico";
           values += ",'"+txtDiagnostico.getText().toString()+"'";
           }
           if(!txtAuxiliares.getText().isEmpty()){ 
           insert += ",h_ex_auxiliares";
           values += ",'"+txtAuxiliares.getText().toString()+"'";
           }
           if(!txtTratamiento.getText().isEmpty()){ 
           insert += ",h_tratamiento";
           values += ",'"+txtTratamiento.getText().toString()+"'";
           }
           if(!txtCita.getText().isEmpty()){ 
           insert += ",h_cita";
           values += ",'"+txtCita.getText().toString()+"'";
           }
           
           try {
            if (oConn.FnBoolQueryExecuteUpdate(insert.concat(" ) ")+ values.concat(" ) "))){
                
                  oFunc.SubSistemaMensajeInformacion("Agregado Correctamente");
                       limpiar();          
                }else{
                oFunc.SubSistemaMensajeError("No se pudo Registrar Intente de nuevo");
            
            }
        } catch (Exception e) {
        }
    
    
    }
            void sbCargarDatosMC(String valor){
        
          String [] titulos={"Nº","HCL","Nombres","Fecha"};
          String [] registros = new String[4];
          model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
          String Sql="SELECT  d.nombres_pa||' '||d.apellidos_pa as nombre, d.historial_pa, h.hcl_fecha, h.hcl_n "
                  + "FROM datos_paciente AS d INNER JOIN hcl AS h ON (d.cod_pa = h.cod_pa)where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%"+valor+"%' "; 
                     
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    if (oConn.FnBoolQueryExecute(Sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                    registros[0]= oConn.setResult.getString("hcl_n");                 
                    registros[1]= oConn.setResult.getString("historial_pa");
                    registros[2]= oConn.setResult.getString("nombre");
                    registros[3]= formato.format(oConn.setResult.getDate("hcl_fecha"));
                     model.addRow(registros);
                }
                 
                  // Coloca el Modelo de Nueva Cuenta
                  tbHC.setModel(model);
                tabla();
             
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
    void tabla(){
    tbHC.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbHC.setModel(model);          
          tbHC.getColumnModel().getColumn(0).setPreferredWidth(15);
          tbHC.getColumnModel().getColumn(1).setPreferredWidth(20);
          tbHC.getColumnModel().getColumn(2).setPreferredWidth(220);
          tbHC.getColumnModel().getColumn(3).setPreferredWidth(50);
          tbHC.getTableHeader().setReorderingAllowed(false);

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tbHC;
    private javax.swing.JTextArea txtAnamnesis;
    private javax.swing.JTextArea txtAuxiliares;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCita;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEC;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextArea txtExFisico;
    private javax.swing.JTextField txtFC;
    private javax.swing.JLabel txtHCL;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtPA;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtR;
    private javax.swing.JTextField txtSO2;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtT;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextArea txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
