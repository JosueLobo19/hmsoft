/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
public final class ConfigurarServicios extends javax.swing.JInternalFrame {
   
  clsFunciones  oFunc = new clsFunciones();
    clsConnection oConn = new clsConnection();
   

   public ConfigurarServicios() {
      initComponents();
      jtconfigurar.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/doc.png")));
      jtconfigurar.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/doc2.png")));
      jtconfigurar.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/kit24x24.png")));
      jtconfigurar.setIconAt(3, new ImageIcon(ClassLoader.getSystemResource("imagenes/radiologia24x24.png")));
      bgeditarcs.add(rbagregarAC);
      bgeditarcs.add(rbmodificarAC);   
      bgeditarcs.add(rbborrarAC); 
      bgeditarcs.add(rbnAC);
         sbCargartbAC();     
   }

  private void sbCargartbAC(){
     // Declaro una variable para las columnas
        int iColumnas=0;
        
        // Declaro un modelo de datos
        DefaultTableModel modelo = new DefaultTableModel();
        java.sql.ResultSetMetaData mdConsulta=null;
        Object [] oFila=null;
        
        // Ejecuto el Query definido en la variable
       if (oConn.FnBoolQueryExecute(clsConnection.sQuery))
        
         
        {
            // Captura el Error de Sql
            try 
            {
                // Prepara variable para obtener Meta Datos de la Consulta
                mdConsulta = oConn.setResult.getMetaData();
                
                // Obtiene el Numero de Columnas de la Consulta
                iColumnas = mdConsulta.getColumnCount();
                
                // Prepara los datos vacios iniciales
                oFila = new Object[iColumnas];
                                        
                // Ciclo para agregar las columnas                
                for ( int i = 1; i <= iColumnas; i++ ) 
                {
                    // Agrega la Columna al Modelo
                    modelo.addColumn(mdConsulta.getColumnLabel( i ));
                    //if ( i > 1 )
                    //    System.out.print( ", " );
                    //System.out.print( mdConsulta.getColumnLabel( i ) ); // Mostrar nombres de campos
                }
                
                // Coloca el Modelo en la Tabla
                tbAC.setModel(modelo);
        
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(ConfigurarServicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try 
            {
                 // Obtener los datos de la consulta
                 DefaultTableModel tblDatos = (DefaultTableModel) tbAC.getModel();
                 
                // Verifica resultados
                while (oConn.setResult.next())
                {
                    // Ciclo para agregar las columnas                
                    for ( int i = 1; i <= iColumnas; i++ ) 
                    {
                        // Agrega la Columna al Modelo
                       oFila[i-1]=oConn.setResult.getString(i);                        
                    }
                    // Agrega los datos a la tabla
                    tblDatos.addRow(oFila);
                     
                }
                 
                  // Coloca el Modelo de Nueva Cuenta
                  tbAC.setModel(tblDatos);
                
             
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                
                Logger.getLogger(ConfigurarServicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
 


   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgbuscarcs = new javax.swing.ButtonGroup();
        bgeditarcs = new javax.swing.ButtonGroup();
        jtconfigurar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombreAC = new javax.swing.JTextField();
        txtcodigoAC = new javax.swing.JTextField();
        btnconfirmarAC = new javax.swing.JButton();
        rbagregarAC = new javax.swing.JRadioButton();
        rbmodificarAC = new javax.swing.JRadioButton();
        rbborrarAC = new javax.swing.JRadioButton();
        rbnAC = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        txtbuscarAC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAC = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtbuscarAC1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombreAC1 = new javax.swing.JTextField();
        txtcodigoAC1 = new javax.swing.JTextField();
        btnconfirmarAC1 = new javax.swing.JButton();
        rbagregarAC1 = new javax.swing.JRadioButton();
        rbmodificarAC1 = new javax.swing.JRadioButton();
        rbborrarAC1 = new javax.swing.JRadioButton();
        rbnAC1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAC1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtbuscarAC2 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnombreAC2 = new javax.swing.JTextField();
        txtcodigoAC2 = new javax.swing.JTextField();
        btnconfirmarAC2 = new javax.swing.JButton();
        rbagregarAC2 = new javax.swing.JRadioButton();
        rbmodificarAC2 = new javax.swing.JRadioButton();
        rbborrarAC2 = new javax.swing.JRadioButton();
        rbnAC2 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAC2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txtbuscarAC3 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnombreAC3 = new javax.swing.JTextField();
        txtcodigoAC3 = new javax.swing.JTextField();
        btnconfirmarAC3 = new javax.swing.JButton();
        rbagregarAC3 = new javax.swing.JRadioButton();
        rbmodificarAC3 = new javax.swing.JRadioButton();
        rbborrarAC3 = new javax.swing.JRadioButton();
        rbnAC3 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtAC3 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Configuración de Servicios");
        setName("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar - Agregar - Eliminar"));

        jLabel4.setText("Código :");

        jLabel3.setText("Nombre :");

        txtnombreAC.setEditable(false);

        txtcodigoAC.setEditable(false);
        txtcodigoAC.setToolTipText("Código Generado Automatica mente");

        btnconfirmarAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnconfirmarAC.setText("Confirmar");
        btnconfirmarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarACActionPerformed(evt);
            }
        });

        rbagregarAC.setText("Agregar");
        rbagregarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbagregarACActionPerformed(evt);
            }
        });

        rbmodificarAC.setText("Modificar");
        rbmodificarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmodificarACActionPerformed(evt);
            }
        });

        rbborrarAC.setText("borrar");
        rbborrarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbborrarACActionPerformed(evt);
            }
        });

        rbnAC.setEnabled(false);
        rbnAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        rbnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtcodigoAC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbnAC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbagregarAC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbmodificarAC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbborrarAC))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtnombreAC, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnconfirmarAC)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnAC)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtcodigoAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbagregarAC)
                        .addComponent(rbmodificarAC)
                        .addComponent(rbborrarAC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombreAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconfirmarAC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        txtbuscarAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarACKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtbuscarAC, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscarAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tbAC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        tbAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbACMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAC);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jtconfigurar.addTab("Areas Clinica", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        txtbuscarAC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarAC1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtbuscarAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscarAC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar - Agregar - Eliminar"));

        jLabel5.setText("Código :");

        jLabel6.setText("Nombre :");

        txtnombreAC1.setEditable(false);

        txtcodigoAC1.setEditable(false);
        txtcodigoAC1.setToolTipText("Código Generado Automatica mente");

        btnconfirmarAC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnconfirmarAC1.setText("Confirmar");
        btnconfirmarAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarAC1ActionPerformed(evt);
            }
        });

        rbagregarAC1.setText("Agregar");
        rbagregarAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbagregarAC1ActionPerformed(evt);
            }
        });

        rbmodificarAC1.setText("Modificar");
        rbmodificarAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmodificarAC1ActionPerformed(evt);
            }
        });

        rbborrarAC1.setText("borrar");
        rbborrarAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbborrarAC1ActionPerformed(evt);
            }
        });

        rbnAC1.setEnabled(false);
        rbnAC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        rbnAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnAC1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtcodigoAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbnAC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbagregarAC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbmodificarAC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbborrarAC1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtnombreAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnconfirmarAC1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnAC1)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtcodigoAC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbagregarAC1)
                        .addComponent(rbmodificarAC1)
                        .addComponent(rbborrarAC1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnombreAC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconfirmarAC1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtAC1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        jtAC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAC1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtAC1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jtconfigurar.addTab("Exámenes Laboratorio", jPanel2);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        txtbuscarAC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarAC2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtbuscarAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscarAC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar - Agregar - Eliminar"));

        jLabel7.setText("Código :");

        jLabel8.setText("Nombre :");

        txtnombreAC2.setEditable(false);

        txtcodigoAC2.setEditable(false);
        txtcodigoAC2.setToolTipText("Código Generado Automatica mente");

        btnconfirmarAC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnconfirmarAC2.setText("Confirmar");
        btnconfirmarAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarAC2ActionPerformed(evt);
            }
        });

        rbagregarAC2.setText("Agregar");
        rbagregarAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbagregarAC2ActionPerformed(evt);
            }
        });

        rbmodificarAC2.setText("Modificar");
        rbmodificarAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmodificarAC2ActionPerformed(evt);
            }
        });

        rbborrarAC2.setText("borrar");
        rbborrarAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbborrarAC2ActionPerformed(evt);
            }
        });

        rbnAC2.setEnabled(false);
        rbnAC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        rbnAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnAC2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtcodigoAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbnAC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbagregarAC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbmodificarAC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbborrarAC2))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtnombreAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnconfirmarAC2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnAC2)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtcodigoAC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbagregarAC2)
                        .addComponent(rbmodificarAC2)
                        .addComponent(rbborrarAC2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtnombreAC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconfirmarAC2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtAC2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        jtAC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAC2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtAC2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jtconfigurar.addTab("Procedimientos", jPanel3);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        txtbuscarAC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarAC3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtbuscarAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscarAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar - Agregar - Eliminar"));

        jLabel9.setText("Código :");

        jLabel10.setText("Nombre :");

        txtnombreAC3.setEditable(false);

        txtcodigoAC3.setEditable(false);
        txtcodigoAC3.setToolTipText("Código Generado Automatica mente");

        btnconfirmarAC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnconfirmarAC3.setText("Confirmar");
        btnconfirmarAC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarAC3ActionPerformed(evt);
            }
        });

        rbagregarAC3.setText("Agregar");
        rbagregarAC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbagregarAC3ActionPerformed(evt);
            }
        });

        rbmodificarAC3.setText("Modificar");
        rbmodificarAC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmodificarAC3ActionPerformed(evt);
            }
        });

        rbborrarAC3.setText("borrar");
        rbborrarAC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbborrarAC3ActionPerformed(evt);
            }
        });

        rbnAC3.setEnabled(false);
        rbnAC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        rbnAC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnAC3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtcodigoAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbnAC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbagregarAC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbmodificarAC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbborrarAC3))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtnombreAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnconfirmarAC3)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnAC3)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtcodigoAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbagregarAC3)
                        .addComponent(rbmodificarAC3)
                        .addComponent(rbborrarAC3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtnombreAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconfirmarAC3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtAC3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        jtAC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAC3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtAC3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jtconfigurar.addTab("Radiografias", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtconfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtconfigurar, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void btnconfirmarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarACActionPerformed
   
    
 
   }//GEN-LAST:event_btnconfirmarACActionPerformed

   private void rbagregarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbagregarACActionPerformed
         txtnombreAC.setEditable(true);
         txtnombreAC.setText(""); 
         txtcodigoAC.setText("");
         txtnombreAC.requestFocus();
   }//GEN-LAST:event_rbagregarACActionPerformed

   private void rbmodificarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmodificarACActionPerformed
         txtnombreAC.setEditable(true);
        
   }//GEN-LAST:event_rbmodificarACActionPerformed

   private void rbborrarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbborrarACActionPerformed
 txtnombreAC.setEditable(false);     
   }//GEN-LAST:event_rbborrarACActionPerformed

   private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

   }//GEN-LAST:event_formInternalFrameClosing

   private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

   }//GEN-LAST:event_formInternalFrameOpened

   private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
    
   }//GEN-LAST:event_formInternalFrameClosed

   private void txtbuscarACKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarACKeyReleased
      String cadena = txtbuscarAC.getText();
    //  cargarAC(cadena.toUpperCase());
   }//GEN-LAST:event_txtbuscarACKeyReleased

   private void rbnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnACActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbnACActionPerformed

   private void tbACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbACMouseClicked
// TODO add your handling code here:
      int row = tbAC.getSelectedRow();
      txtcodigoAC.setText(tbAC.getModel().getValueAt(row, 0).toString());
      txtnombreAC.setText(tbAC.getModel().getValueAt(row, 1).toString());
      if(rbagregarAC.isSelected()){
         rbnAC.setSelected(true);
      }
   }//GEN-LAST:event_tbACMouseClicked

   private void txtbuscarAC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarAC1KeyReleased
      // TODO add your handling code here:
   }//GEN-LAST:event_txtbuscarAC1KeyReleased

   private void btnconfirmarAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarAC1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_btnconfirmarAC1ActionPerformed

   private void rbagregarAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbagregarAC1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbagregarAC1ActionPerformed

   private void rbmodificarAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmodificarAC1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbmodificarAC1ActionPerformed

   private void rbborrarAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbborrarAC1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbborrarAC1ActionPerformed

   private void rbnAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnAC1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbnAC1ActionPerformed

   private void jtAC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAC1MouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_jtAC1MouseClicked

   private void txtbuscarAC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarAC2KeyReleased
      // TODO add your handling code here:
   }//GEN-LAST:event_txtbuscarAC2KeyReleased

   private void btnconfirmarAC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarAC2ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_btnconfirmarAC2ActionPerformed

   private void rbagregarAC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbagregarAC2ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbagregarAC2ActionPerformed

   private void rbmodificarAC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmodificarAC2ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbmodificarAC2ActionPerformed

   private void rbborrarAC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbborrarAC2ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbborrarAC2ActionPerformed

   private void rbnAC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnAC2ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbnAC2ActionPerformed

   private void jtAC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAC2MouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_jtAC2MouseClicked

   private void txtbuscarAC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarAC3KeyReleased

   }//GEN-LAST:event_txtbuscarAC3KeyReleased

   private void btnconfirmarAC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarAC3ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_btnconfirmarAC3ActionPerformed

   private void rbagregarAC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbagregarAC3ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbagregarAC3ActionPerformed

   private void rbmodificarAC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmodificarAC3ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbmodificarAC3ActionPerformed

   private void rbborrarAC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbborrarAC3ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbborrarAC3ActionPerformed

   private void rbnAC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnAC3ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_rbnAC3ActionPerformed

   private void jtAC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAC3MouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_jtAC3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgbuscarcs;
    private javax.swing.ButtonGroup bgeditarcs;
    private javax.swing.JButton btnconfirmarAC;
    private javax.swing.JButton btnconfirmarAC1;
    private javax.swing.JButton btnconfirmarAC2;
    private javax.swing.JButton btnconfirmarAC3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JTable jtAC1;
    private javax.swing.JTable jtAC2;
    private javax.swing.JTable jtAC3;
    private javax.swing.JTabbedPane jtconfigurar;
    private javax.swing.JRadioButton rbagregarAC;
    private javax.swing.JRadioButton rbagregarAC1;
    private javax.swing.JRadioButton rbagregarAC2;
    private javax.swing.JRadioButton rbagregarAC3;
    private javax.swing.JRadioButton rbborrarAC;
    private javax.swing.JRadioButton rbborrarAC1;
    private javax.swing.JRadioButton rbborrarAC2;
    private javax.swing.JRadioButton rbborrarAC3;
    private javax.swing.JRadioButton rbmodificarAC;
    private javax.swing.JRadioButton rbmodificarAC1;
    private javax.swing.JRadioButton rbmodificarAC2;
    private javax.swing.JRadioButton rbmodificarAC3;
    private javax.swing.JRadioButton rbnAC;
    private javax.swing.JRadioButton rbnAC1;
    private javax.swing.JRadioButton rbnAC2;
    private javax.swing.JRadioButton rbnAC3;
    private javax.swing.JTable tbAC;
    private javax.swing.JTextField txtbuscarAC;
    private javax.swing.JTextField txtbuscarAC1;
    private javax.swing.JTextField txtbuscarAC2;
    private javax.swing.JTextField txtbuscarAC3;
    private javax.swing.JTextField txtcodigoAC;
    private javax.swing.JTextField txtcodigoAC1;
    private javax.swing.JTextField txtcodigoAC2;
    private javax.swing.JTextField txtcodigoAC3;
    private javax.swing.JTextField txtnombreAC;
    private javax.swing.JTextField txtnombreAC1;
    private javax.swing.JTextField txtnombreAC2;
    private javax.swing.JTextField txtnombreAC3;
    // End of variables declaration//GEN-END:variables

}
