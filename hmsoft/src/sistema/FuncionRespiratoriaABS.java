package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FuncionRespiratoriaABS extends javax.swing.JInternalFrame {
     clsFunciones  oFunc = new clsFunciones();
     clsConnection oConn = new clsConnection();
    public FuncionRespiratoriaABS() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        FechaABS = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodExam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtFVC = new javax.swing.JTextField();
        txtFEV1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFEV1FVC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFEF2575 = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtTalla = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInterpretacion = new javax.swing.JTextArea();
        btnEditar = new javax.swing.JButton();
        chkNA = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFEV1Teo = new javax.swing.JTextField();
        txtFVCTeo = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Espirometría");

        jLabel1.setText("Nro Orden :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha :");

        jLabel3.setText("Cod Exam. :");

        txtCodExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodExamActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombres :");

        txtNombres.setEditable(false);

        jLabel5.setText("Edad :");

        txtEdad.setEditable(false);

        jLabel6.setText("años");

        jLabel7.setText("FVC %:");

        txtFVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFVCActionPerformed(evt);
            }
        });
        txtFVC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFVCKeyTyped(evt);
            }
        });

        txtFEV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEV1ActionPerformed(evt);
            }
        });
        txtFEV1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFEV1KeyTyped(evt);
            }
        });

        jLabel8.setText("FEV1 %:");

        jLabel9.setText("FEV1/FVC % :");

        txtFEV1FVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEV1FVCActionPerformed(evt);
            }
        });
        txtFEV1FVC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFEV1FVCKeyTyped(evt);
            }
        });

        jLabel10.setText("FEF 25-75 % :");

        txtFEF2575.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEF2575ActionPerformed(evt);
            }
        });
        txtFEF2575.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFEF2575KeyTyped(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar/Actualizar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel11.setText("Talla :");

        txtPeso.setEditable(false);
        txtPeso.setBackground(new java.awt.Color(51, 153, 255));
        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        txtTalla.setEditable(false);
        txtTalla.setBackground(new java.awt.Color(51, 153, 255));
        txtTalla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTallaActionPerformed(evt);
            }
        });

        jLabel12.setText("Peso :");

        txtInterpretacion.setColumns(10);
        txtInterpretacion.setLineWrap(true);
        txtInterpretacion.setRows(2);
        txtInterpretacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Interpretación"));
        jScrollPane1.setViewportView(txtInterpretacion);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        chkNA.setText("No  Paso Examen");
        chkNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNAActionPerformed(evt);
            }
        });

        jLabel13.setText("FVC Teorico");

        jLabel14.setText("FEV1 Teorico");

        txtFEV1Teo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEV1TeoActionPerformed(evt);
            }
        });
        txtFEV1Teo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFEV1TeoKeyTyped(evt);
            }
        });

        txtFVCTeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFVCTeoActionPerformed(evt);
            }
        });
        txtFVCTeo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFVCTeoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 41, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6)
                        .addGap(54, 54, 54)
                        .addComponent(chkNA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaABS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(txtCodExam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFEF2575, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFEV1FVC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFVC, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                        .addComponent(txtFEV1)))))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtFVCTeo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFEV1Teo))))))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(FechaABS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCodExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(chkNA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFEV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFVCTeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFEV1FVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFEF2575, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtFEV1Teo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
           if(!OrdenExiste()){
        String Sql="select d.nombres_pa||' '||d.apellidos_pa as nombres, d.fecha_nacimiento_pa,t.talla ,t.peso FROM datos_paciente  AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) "
                + "INNER JOIN triaje AS t ON(t.n_orden = n.n_orden)WHERE n.n_orden = '"+txtNorden.getText().toString()+"'";
         oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombres"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        txtPeso.setText(oConn.setResult.getString("peso").concat(" Kg."));
                        txtTalla.setText(oConn.setResult.getString("talla").concat(" cm."));
                        Fecha();
                        txtNorden.setEditable(false);
                        
                        txtCodExam.requestFocus();
                        
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Falta Pasar por Triaje o \n    Aperture EX-Preocupacional de nuevo");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Función Respiratoria:" + ex.getMessage().toString());
        }
        }
        }    
        
    }//GEN-LAST:event_txtNordenActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       if(OrdenExiste()){
           Actualizar();
       }else{
           Agregar();
       }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtFVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFVCActionPerformed
     txtFEV1.requestFocus();
    }//GEN-LAST:event_txtFVCActionPerformed

    private void txtFEV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEV1ActionPerformed
     txtFEV1FVC.requestFocus();
    }//GEN-LAST:event_txtFEV1ActionPerformed

    private void txtFEV1FVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEV1FVCActionPerformed
        txtFEF2575.requestFocus();
    }//GEN-LAST:event_txtFEV1FVCActionPerformed

    private void txtCodExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodExamActionPerformed
        txtFVC.requestFocus();
        txtCodExam.setEditable(false);
    }//GEN-LAST:event_txtCodExamActionPerformed

    private void txtFEF2575ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEF2575ActionPerformed
       btnAgregar.requestFocusInWindow();
    }//GEN-LAST:event_txtFEF2575ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTallaActionPerformed

    private void txtFVCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFVCKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 37) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "No puede ingresar porcentaje!!!", "Ventana Error Ingreso de Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtFVCKeyTyped

    private void txtFEV1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFEV1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 37) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "No puede ingresar porcentaje!!!", "Ventana Error Ingreso de Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtFEV1KeyTyped

    private void txtFEV1FVCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFEV1FVCKeyTyped
         int k = (int) evt.getKeyChar();
        if (k == 37) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "No puede ingresar porcentaje!!!", "Ventana Error Ingreso de Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtFEV1FVCKeyTyped

    private void txtFEF2575KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFEF2575KeyTyped
         int k = (int) evt.getKeyChar();
        if (k == 37) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "No puede ingresar porcentaje!!!", "Ventana Error Ingreso de Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtFEF2575KeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
           
        String Sql="select d.nombres_pa||' '||d.apellidos_pa as nombres, d.fecha_nacimiento_pa,t.talla ,t.peso,"
                + "f.fecha_abs,f.fvc, f.fev1, f.fev1fvc, f.fef25_75,f.interpretacion,fvc_teorico,fev1_teorico "
                + "FROM datos_paciente  AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) "
                + "INNER JOIN funcion_abs AS f ON(n.n_orden = f.n_orden) "
                + "INNER JOIN triaje AS t ON(t.n_orden = n.n_orden)WHERE n.n_orden = '"+txtNorden.getText().toString()+"'";
         oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombres"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        txtPeso.setText(oConn.setResult.getString("peso").concat(" Kg."));
                        txtTalla.setText(oConn.setResult.getString("talla").concat(" cm."));
                        FechaABS.setDate(oConn.setResult.getDate("fecha_abs"));
                        txtFVC.setText(oConn.setResult.getString("fvc"));
                        txtFEV1.setText(oConn.setResult.getString("fev1"));
                        txtFEV1FVC.setText(oConn.setResult.getString("fev1fvc"));
                        txtFEF2575.setText(oConn.setResult.getString("fef25_75"));
                        txtInterpretacion.setText(oConn.setResult.getString("interpretacion"));
                        txtFVCTeo.setText(oConn.setResult.getString("fvc_teorico"));
                        txtFEV1Teo.setText(oConn.setResult.getString("fev1_teorico"));
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registros");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Función Respiratoria:" + ex.getMessage().toString());
            }
        
        }    
    }//GEN-LAST:event_btnEditarActionPerformed

    private void chkNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNAActionPerformed
        txtFVC.setText("N/A");
        txtFEV1.setText("N/A");
        txtFEV1FVC.setText("N/A");
        txtFEF2575.setText("N/A");
    }//GEN-LAST:event_chkNAActionPerformed

    private void txtFEV1TeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEV1TeoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFEV1TeoActionPerformed

    private void txtFEV1TeoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFEV1TeoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFEV1TeoKeyTyped

    private void txtFVCTeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFVCTeoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFVCTeoActionPerformed

    private void txtFVCTeoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFVCTeoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFVCTeoKeyTyped
     private com.toedter.calendar.JDateChooser FechaNacimiento;
    void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaABS.setDate(fechaDate);
}
void Agregar(){
    if(!txtNorden.getText().isEmpty()){
        if(validar()){
String insert="INSERT INTO funcion_abs(n_orden";
String values="VALUES ('"+txtNorden.getText()+"'"; 
       insert += ",fecha_abs ";
       values += ",'"+FechaABS.getDate()+"'";
       if(!txtCodExam.getText().isEmpty()){
       insert += ",cod_exam";
       values += ",'"+txtCodExam.getText().toString()+"'";
       }
        if(!txtFVC.getText().isEmpty()){
       insert += ",fvc";
       values += ",'"+txtFVC.getText().toString()+"'";
        }
        if(!txtFEV1.getText().isEmpty()){
       insert += ",fev1";
       values += ",'"+txtFEV1.getText().toString()+"'";
        }
        if(!txtFEV1FVC.getText().isEmpty()){
       insert += ",fev1fvc";
       values += ",'"+txtFEV1FVC.getText().toString()+"'";
        }
        if(!txtFEF2575.getText().isEmpty()){
       insert += " ,fef25_75";
       values += ",'"+txtFEF2575.getText().toString()+"'";
        }
        if(!txtInterpretacion.getText().isEmpty()){
       insert += " ,interpretacion";
       values += ",'"+txtInterpretacion.getText().toString()+"'";
        }
        if(!txtFVCTeo.getText().isEmpty()){
       insert += " ,fvc_teorico";
       values += ",'"+txtFVCTeo.getText().toString()+"'";
        }
        if(!txtFEV1Teo.getText().isEmpty()){
       insert += " ,fev1_teorico";
       values += ",'"+txtFEV1Teo.getText().toString()+"'";
        }
         if (oConn.FnBoolQueryExecuteUpdate(insert.concat(")") + values.concat(")"))){
                    Limpiar();                
                   oFunc.SubSistemaMensajeInformacion("Ingresado Correctamente");
                                 
         }       
       }
    }

}
private void Actualizar(){
     String sCodigo=txtNorden.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE funcion_abs\n" +
                "   SET fecha_abs='"+FechaABS.getDate()+"', fvc='"+txtFVC.getText().toString()+"', fev1='"+txtFEV1.getText().toString()+"', \n" +
                "       fev1fvc='"+txtFEV1FVC.getText().toString()+"', fef25_75='"+txtFEF2575.getText().toString()+"',"
                + " interpretacion='"+txtInterpretacion.getText().toString()+"',fvc_teorico='"+txtFVCTeo.getText().toString()+"', "
                + "fev1_teorico='"+txtFEV1Teo.getText().toString()+"'" +
                " WHERE n_orden='" + sCodigo + "'";
             Limpiar();
             txtNorden.setEnabled(true);
             txtNorden.requestFocus();
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
}
void Limpiar(){
txtNorden.setEditable(true);  
txtCodExam.setEditable(true);
txtNorden.setText(null);
txtCodExam.setText(null);
FechaABS.setDate(null);
txtNombres.setText(null);
txtEdad.setText(null);
txtFVC.setText(null);
txtFEV1.setText(null);
txtFEV1FVC.setText(null);
txtFEF2575.setText(null);
txtNorden.requestFocus();
txtTalla.setText(null);
txtPeso.setText(null);
txtInterpretacion.setText(null);
chkNA.setSelected(false);
}
private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaABS.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    if(txtFVC.getText().isEmpty()){
    oFunc.SubSistemaMensajeError("Ingrese FVC");bResultado = false;
    }
    if(txtFEV1.getText().isEmpty()){
    oFunc.SubSistemaMensajeError("Ingrese FEV1");bResultado = false;
    }
    if(txtFEV1FVC.getText().isEmpty()){
    oFunc.SubSistemaMensajeError("Ingrese FEV1/FVC");bResultado = false;
    }
    if(txtFEF2575.getText().isEmpty()){
    oFunc.SubSistemaMensajeError("Ingrese FEF 25-75 %");bResultado = false;
    }
  
   return bResultado;
}
 public boolean OrdenExiste()
    {
        
        boolean bResultado=false;
        if(!txtNorden.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from funcion_abs Where n_orden ="+txtNorden.getText().toString();
        
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
//             txtNorden.setText(null);
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        
    
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaABS;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkNA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCodExam;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFEF2575;
    private javax.swing.JTextField txtFEV1;
    private javax.swing.JTextField txtFEV1FVC;
    private javax.swing.JTextField txtFEV1Teo;
    private javax.swing.JTextField txtFVC;
    private javax.swing.JTextField txtFVCTeo;
    private javax.swing.JTextArea txtInterpretacion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
