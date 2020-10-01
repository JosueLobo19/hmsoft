/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public final class AnalisisBioquimico extends javax.swing.JInternalFrame {
        clsConnection oConn = new clsConnection();
        clsFunciones  oFunc = new clsFunciones();
        clsOperacionesUsuarios oPe= new clsOperacionesUsuarios();
        DefaultTableModel model;
         String[]responsables = new String[]{};
    public AnalisisBioquimico() {
        initComponents();
       jtExamen.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/impresora.png")));
        responsables = getRowsToVector("select nombre_user||' '||apellido_user AS responsable FROM usuarios");
     CargarDatos("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCreatinina = new javax.swing.JTextField();
        txtColesterol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLDLColesterol = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHDLColesterol = new javax.swing.JTextField();
        txtVLDLColesterol = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTrigliseridos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        FechaAnalisis = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jtExamen = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbExamen = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        txtBuscarCod = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Laboratorio Analisis Bioquímicos");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tipo Examen"));

        jRadioButton2.setText("Nro recibo");

        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Ficha Medica Ocupacional");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton2)
                .addGap(15, 15, 15)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jLabel1.setText("N° Ficha :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });
        txtNorden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenKeyTyped(evt);
            }
        });

        txtPaciente.setEditable(false);

        jLabel2.setText("Paciente :");

        jLabel3.setText("Fecha :");

        jLabel4.setText("creatinina :");

        txtCreatinina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatininaActionPerformed(evt);
            }
        });
        txtCreatinina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreatininaKeyTyped(evt);
            }
        });

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

        jLabel5.setText("Colesterol Total :");

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

        jLabel6.setText("L.D.L Colesterol :");

        jLabel7.setText("H.D.L Colesterol :");

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

        jLabel8.setText("V.L.D.L Colesterol :");

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

        jLabel9.setText("Trigliceridos");

        jLabel10.setText("Medico / Tecnico :");

        txtResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsableActionPerformed(evt);
            }
        });
        txtResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResponsableKeyReleased(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N

        FechaAnalisis.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaAnalisisPropertyChange(evt);
            }
        });

        jLabel12.setText("(V.N.08 - 1.4mg/dl)");

        jLabel13.setText("(V.N. < 200 mg/dl)");

        jLabel14.setText("(V.N. < 129 mg/dl)");

        jLabel15.setText("(V.N. 40 - 60 mg/dl)");

        jLabel16.setText("(V.N. < 30 mg/dl)");

        jLabel17.setText("(V.N. < 150 mg/dl)");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opciones"));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAceptar.setText("Guardar/Actualizar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(Limpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAceptar)
                .addComponent(Limpiar))
        );

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/microscopio.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel19.setText("Buscar :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N

        tbExamen.setModel(new javax.swing.table.DefaultTableModel(
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
        tbExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbExamenMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbExamen);

        jtExamen.addTab("Examen", jScrollPane1);

        jLabel35.setText("Codigo:");

        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtTrigliseridos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(txtVLDLColesterol, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHDLColesterol, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLDLColesterol, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtColesterol, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCreatinina, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12)))
                                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnEditar)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addGap(19, 19, 19)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(FechaAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtCreatinina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtLDLColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtHDLColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtVLDLColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtTrigliseridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel19)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        if(!txtNorden.getText().isEmpty()){
            if(! OrdenExiste()){
        String Sql="select d.nombres_pa||' '||d.apellidos_pa AS nombres "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+txtNorden.getText().toString()+"'";
        
         oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtPaciente.setText(oConn.setResult.getString("nombres"));
                        txtNorden.setEditable(false);
                        oPe.fecha(FechaAnalisis);
                        txtResponsable.requestFocus();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Odontograma:" + ex.getMessage().toString());}
            }
        }
    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsableActionPerformed
        FechaAnalisis.requestFocusInWindow();
    }//GEN-LAST:event_txtResponsableActionPerformed

    private void txtResponsableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsableKeyReleased
       if(!(evt.getKeyCode()>=65 && evt.getKeyCode()<=90 || evt.getKeyCode()>=96 && evt.getKeyCode()<=105 || evt.getKeyCode() == KeyEvent.VK_ENTER )) {
            return;
        }
        if(txtResponsable.getText().isEmpty()) {
            return;
        }
        if(responsables.length ==0) {
            return;
        }
        addTextAndSelectToTextFieldToRest(txtResponsable, getTextoApartirVector(txtResponsable.getText(), responsables));
    }//GEN-LAST:event_txtResponsableKeyReleased

    private void FechaAnalisisPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaAnalisisPropertyChange
        txtCreatinina.requestFocus();
    }//GEN-LAST:event_FechaAnalisisPropertyChange

    private void txtCreatininaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatininaActionPerformed
         float cretinina=Float.parseFloat(txtCreatinina.getText().toString());
               if(cretinina>1.4){
                   txtCreatinina.setForeground(Color.red);
               }
        txtColesterol.requestFocus();
    }//GEN-LAST:event_txtCreatininaActionPerformed

    private void txtColesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColesterolActionPerformed
       float colesterol=Float.parseFloat(txtColesterol.getText().toString());
       if(colesterol>200){
           txtColesterol.setForeground(Color.red);
       }
        txtLDLColesterol.requestFocus();
    }//GEN-LAST:event_txtColesterolActionPerformed

    private void txtLDLColesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLDLColesterolActionPerformed
      float ldlcolesterol=Float.parseFloat(txtLDLColesterol.getText().toString());
       if(ldlcolesterol>129){
           txtLDLColesterol.setForeground(Color.red);
       }
        txtHDLColesterol.requestFocus();
    }//GEN-LAST:event_txtLDLColesterolActionPerformed

    private void txtHDLColesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHDLColesterolActionPerformed
        float HDLcolesterol=Float.parseFloat(txtHDLColesterol.getText().toString());
       if(HDLcolesterol<40){
           txtHDLColesterol.setForeground(Color.red);
       }
        txtVLDLColesterol.requestFocus();
    }//GEN-LAST:event_txtHDLColesterolActionPerformed

    private void txtVLDLColesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVLDLColesterolActionPerformed
       float VLDcolesterol=Float.parseFloat(txtVLDLColesterol.getText().toString());
       if(VLDcolesterol>30){
           txtVLDLColesterol.setForeground(Color.red);
       }
        txtTrigliseridos.requestFocus();
    }//GEN-LAST:event_txtVLDLColesterolActionPerformed

    private void txtTrigliseridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrigliseridosActionPerformed
        float trigliceridos=Float.parseFloat(txtTrigliseridos.getText().toString());
       if(trigliceridos>150){
           txtTrigliseridos.setForeground(Color.red);
       }
        btnAceptar.requestFocusInWindow();
    }//GEN-LAST:event_txtTrigliseridosActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
         if(OrdenExiste()){
             Actualizar();
         }else{
              Agregar();
         }
       
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenKeyTyped

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
           txtNorden.requestFocusInWindow();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtCreatininaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreatininaKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtCreatininaKeyTyped

    private void txtColesterolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColesterolKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtColesterolKeyTyped

    private void txtLDLColesterolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLDLColesterolKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtLDLColesterolKeyTyped

    private void txtHDLColesterolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHDLColesterolKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtHDLColesterolKeyTyped

    private void txtVLDLColesterolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVLDLColesterolKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtVLDLColesterolKeyTyped

    private void txtTrigliseridosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrigliseridosKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtTrigliseridosKeyTyped

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        CargarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tbExamenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExamenMousePressed
         if (evt.getClickCount() == 2) 
        {  
            Integer cod  = Integer.valueOf( tbExamen.getValueAt(tbExamen.getSelectedRow(),0).toString());
            print(cod);
            
        }
    }//GEN-LAST:event_tbExamenMousePressed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
        
            CargarDatos(txtBuscarCod.getText());
        
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       if(!txtNorden.getText().isEmpty()){
            
        String Sql="select d.nombres_pa||' '||d.apellidos_pa AS nombres,a.txtreponsable, a.fecha_ab, a.txtcreatinina,a.txtcolesterol, "
                + "a.txtldlcolesterol, a.txthdlcolesterol, a.txtvldlcolesterol,a.txttrigliseridos "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "INNER JOIN analisis_bioquimicos AS a ON (n.n_orden = a.n_orden) "
                + "WHERE a.n_orden ='"+txtNorden.getText().toString()+"'";
        
         oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtPaciente.setText(oConn.setResult.getString("nombres"));
                        txtResponsable.setText(oConn.setResult.getString("txtreponsable"));
                        FechaAnalisis.setDate(oConn.setResult.getDate("fecha_ab"));
                        txtCreatinina.setText(oConn.setResult.getString("txtcreatinina"));
                        txtColesterol.setText(oConn.setResult.getString("txtcolesterol"));
                        txtLDLColesterol.setText(oConn.setResult.getString("txtldlcolesterol"));
                        txtHDLColesterol.setText(oConn.setResult.getString("txthdlcolesterol"));
                        txtVLDLColesterol.setText(oConn.setResult.getString("txtvldlcolesterol"));
                        txtTrigliseridos.setText(oConn.setResult.getString("txttrigliseridos"));
                        txtNorden.setEditable(false);
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Odontograma:" + ex.getMessage().toString());}
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed
 private void Agregar(){
 if(!txtNorden.getText().isEmpty()){ 
     if(validar()){
            String insert="INSERT INTO analisis_bioquimicos(n_orden, fecha_ab, txtreponsable";
            String values ="VALUES('"+txtNorden.getText().toString()+"','"+FechaAnalisis.getDate()+"','"+txtResponsable.getText().toString()+"'";
                    if(!txtCreatinina.getText().isEmpty()){insert += ",txtcreatinina"; values += ",'"+txtCreatinina.getText().toString()+"'";}
                    if(!txtColesterol.getText().isEmpty()){insert += ",txtcolesterol"; values += ",'"+txtColesterol.getText().toString()+"'";}
                    if(!txtLDLColesterol.getText().isEmpty()){insert += ",txtldlcolesterol"; values += ",'"+txtLDLColesterol.getText().toString()+"'";}
                    if(!txtHDLColesterol.getText().isEmpty()){insert += ",txthdlcolesterol"; values += ",'"+txtHDLColesterol.getText().toString()+"'";}
                    if(!txtVLDLColesterol.getText().isEmpty()){insert += ",txtvldlcolesterol"; values += ",'"+txtVLDLColesterol.getText().toString()+"'";}
                    if(!txtTrigliseridos.getText().isEmpty()){insert += ",txttrigliseridos"; values += ",'"+txtTrigliseridos.getText().toString()+"'";}
                   // oFunc.SubSistemaMensajeError(insert.concat(")") + values.concat(")"));    
                    if (oConn.FnBoolQueryExecuteUpdate(insert.concat(") ") + values.concat(")"))){
                        imprimir();
                        oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                        Limpiar();
                        CargarDatos("");

                    }else{
                        oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");

                    }

             }         

         }
 }
 private boolean validar(){
boolean bResultado=true;
if (((JTextField)FechaAnalisis.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Examen");bResultado = false;}
if(txtNorden.getText().isEmpty()){bResultado = false;} 
if(txtResponsable.getText().isEmpty()){bResultado = false;}
   return bResultado;
}
 public String[]getRowsToVector(String sql)
    {
        String[]veDats;
        //clsConnection oConn = new clsConnection();
        try
        {
            //oConn.FnBoolConnectionOpen(strConnector, strHost,strUser,strPassword);
            oConn.FnBoolQueryExecute(sql);

            ArrayList lista = new ArrayList();
            while (oConn.setResult.next())
            {
                lista.add(oConn.setResult.getString(1));
            }
            veDats = new String[lista.size()];
            for (int i = 0; i < lista.size(); i++)
            {
                veDats[i]=lista.get(i).toString();
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
            
            return null;
        }
        return veDats;
    }
 public static int getPosicionVectorBuscar(String datoBuscar, String[]dato)
{
  try{
      for(int i =0;1 < dato.length; i++){
        if(datoBuscar.equals(dato[i].substring(0, datoBuscar.length())))
            return i;
      }
              
     
  }catch(Exception e){
  
  }
  return -1;
}
public static String getTextoApartirVector(String datoBuscar, String[]vector)
{
    int nroPosicion = getPosicionVectorBuscar(datoBuscar, vector);
    if(nroPosicion == -1){
        return datoBuscar;
    }
    return vector[nroPosicion];
}
public static void addTextAndSelectToTextFieldToRest(JTextField textField, String newDato)
{
    String datoBuscado ="";
    int nroActual = textField.getText().length();
    datoBuscado = newDato.substring(nroActual, newDato.length());
    if(newDato.isEmpty() || datoBuscado.isEmpty())
        return;
    try {
        textField.getDocument().insertString(textField.getCaretPosition(), datoBuscado, null);
    }catch(Exception e){
    }
    textField.select(nroActual, textField.getText().length());

}
public boolean OrdenExiste()
    {
        // Para devolver el resultado
        boolean bResultado=false;
        
        // Para el Query
        String sQuery;
        
        // Prepara el Query
        sQuery  = "Select n_orden from analisis_bioquimicos Where n_orden="+txtNorden.getText().toString();
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
                
//               txtNorden.setText(null);
//               txtNorden.requestFocus();
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");           
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        
        
        
        // Retorna el Resultado
        return bResultado;
        
    }

private void Actualizar(){
      String sCodigo=txtNorden.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE analisis_bioquimicos\n" +
                " SET fecha_ab='"+FechaAnalisis.getDate()+"', txtreponsable='"+txtResponsable.getText().toString()+"', \n" +
                " txtcreatinina='"+txtCreatinina.getText().toString()+"', txtcolesterol='"+txtColesterol.getText().toString()+"', "
                + "txtldlcolesterol='"+txtLDLColesterol.getText().toString()+"', txthdlcolesterol='"+txtHDLColesterol.getText().toString()+"', \n" +
                " txtvldlcolesterol='"+txtVLDLColesterol.getText().toString()+"', txttrigliseridos='"+txtTrigliseridos.getText().toString()+"'" +
                " WHERE n_orden='" + sCodigo + "'";
            
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
             Limpiar();
             txtNorden.setEnabled(true);
             txtNorden.requestFocus();
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
}
void Limpiar(){
       txtNorden.setEditable(true);
       txtNorden.setText(null);
       txtResponsable.setText(null);
       txtPaciente.setText(null);
       FechaAnalisis.setDate(null);
       txtCreatinina.setText(null);
       txtColesterol.setText(null);
       txtLDLColesterol.setText(null);
       txtHDLColesterol.setText(null);
       txtVLDLColesterol.setText(null);
       txtTrigliseridos.setText(null);
       txtNorden.requestFocus();

}   private boolean imprimir(){
    boolean im = false;
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir?", //Mensaje
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
      printer(Integer.valueOf(txtNorden.getText().toString()));
       im = true;
   }
   else
   {
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"AnalisisBioquimicos.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  JasperPrintManager.printReport(jasperPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
 private void print(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"AnalisisBioquimicos.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Analisis Bioquímicos");
                    //viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 }
public void CargarDatos(String valor){
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
   String [] titulos={"N° Orden","Nombres y Apellidos","Fecha"};
    String [] registros = new String[3];    
   model = new DefaultTableModel(null,titulos){
            
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
   String Sql="";
   if(!txtBuscarCod.getText().isEmpty()){
       Sql="select d.nombres_pa||' '||d.apellidos_pa AS nombres,a.n_orden,  a.fecha_ab \n" +
"            FROM analisis_bioquimicos AS a \n" +
"            INNER JOIN n_orden_ocupacional AS n ON (a.n_orden = n.n_orden)\n" +
"            INNER JOIN datos_paciente AS d ON (n.cod_pa = d.cod_pa)\n" +
"              where a.n_orden='"+txtBuscarCod.getText().toString()+"'";
   }else{
     Sql="select d.nombres_pa||' '||d.apellidos_pa AS nombres,a.n_orden,  a.fecha_ab "
            + "FROM analisis_bioquimicos AS a "
            + "INNER JOIN n_orden_ocupacional AS n ON (a.n_orden = n.n_orden)"
            + "INNER JOIN datos_paciente AS d ON (n.cod_pa = d.cod_pa)"
            + "WHERE CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%"+valor+"%'";
   }
                if (oConn.FnBoolQueryExecute(Sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                                     
                    registros[0]= oConn.setResult.getString("n_orden");
                    registros[1]= oConn.setResult.getString("nombres");
                    registros[2]= formato.format(oConn.setResult.getDate("fecha_ab"));
                     model.addRow(registros);
                }
                
                  // Coloca el Modelo de Nueva Cuenta
                  tbExamen.setModel(model);
               sbExamen();
             
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           
}
void sbExamen(){
       
                 
          tbExamen.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbExamen.getColumnModel().getColumn(0).setPreferredWidth(110);
          tbExamen.getColumnModel().getColumn(1).setPreferredWidth(400);
          tbExamen.getColumnModel().getColumn(2).setPreferredWidth(190);
          
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaAnalisis;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jtExamen;
    private javax.swing.JTable tbExamen;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtColesterol;
    private javax.swing.JTextField txtCreatinina;
    private javax.swing.JTextField txtHDLColesterol;
    private javax.swing.JTextField txtLDLColesterol;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtTrigliseridos;
    private javax.swing.JTextField txtVLDLColesterol;
    // End of variables declaration//GEN-END:variables
}
