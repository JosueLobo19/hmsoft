package Caja;

import Clases.ESCPrinter;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Richard Garcia richard@nokytel.net
 */
public class BoletadeVenta extends javax.swing.JInternalFrame {
    //Agregando mis variables de conexcion a La DB
     clsFunciones  oFunc = new clsFunciones();
     clsConnection oConn = new clsConnection();
     DefaultTableModel modelo;
     String[]cliente = new String[]{};
     boolean bAgruparProductos = true;
       Formatter serie;
    Formatter numero;
        
     public BoletadeVenta() {
        initComponents();          
        jtBoleta.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
        jtBoletaAdd.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
        txtNR.requestFocus();
        AutoJuridico();
        sbTablaBoleta();
       txtOperador.setText(clsGlobales.sNomOperador); 
       AutoCompleteDecorator.decorate(this.cboServicios);
       Genera();
       //sbTablaBoleta();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBoleta = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tbBol = new javax.swing.JPopupMenu();
        btnEliminar = new javax.swing.JMenuItem();
        jtBoleta = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        chkNatural = new javax.swing.JCheckBox();
        chkJuridica = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        lblIngrese = new javax.swing.JLabel();
        txtNR = new javax.swing.JTextField();
        chkAsistencial = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        FechaBoleta = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboCondicion = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtOperador = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cboServicios = new javax.swing.JComboBox();
        txtCodServicio = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPrecioT = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtNroTicket = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        cboReferido = new javax.swing.JComboBox();
        jtBoletaAdd = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBoleta = new javax.swing.JTable();
        jLabel76 = new javax.swing.JLabel();
        lblImporteLetras = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        lblNroBoleta = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        tbBol.add(btnEliminar);

        setClosable(true);
        setTitle("Corporación peruana de centros médicos \"BOLETA DE VENTA\"");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tipo Cliente :"));

        btBoleta.add(chkNatural);
        chkNatural.setText("Persona Natural");
        chkNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNaturalActionPerformed(evt);
            }
        });

        btBoleta.add(chkJuridica);
        chkJuridica.setSelected(true);
        chkJuridica.setText("Persona Jurídica");
        chkJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkJuridicaActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblIngrese.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIngrese.setForeground(new java.awt.Color(51, 51, 51));
        lblIngrese.setText("Raz. Social :");

        txtNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNRActionPerformed(evt);
            }
        });
        txtNR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNRKeyReleased(evt);
            }
        });

        btBoleta.add(chkAsistencial);
        chkAsistencial.setText("Asistencial");
        chkAsistencial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkAsistencialMouseClicked(evt);
            }
        });
        chkAsistencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsistencialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNatural)
                .addGap(18, 18, 18)
                .addComponent(chkJuridica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkAsistencial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngrese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNR)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngrese, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkJuridica, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkAsistencial, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkNatural, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNR, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        jLabel1.setText("Dirección :");

        jLabel2.setText("Fecha :");

        jLabel3.setText("RUC:");

        jLabel4.setText("Condición :");

        cboCondicion.setEditable(true);
        cboCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CONTADO", "CREDITO", " " }));

        jLabel5.setText("Atendido :");

        txtOperador.setEditable(false);
        txtOperador.setFocusable(false);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Servicios Ticket"));

        jLabel26.setText("Servicio:");

        cboServicios.setEditable(true);
        cboServicios.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboServiciosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServiciosActionPerformed(evt);
            }
        });

        txtCodServicio.setEditable(false);

        jLabel27.setText("Cod. :");

        jLabel28.setText("Precio:");

        txtPrecioT.setEditable(false);

        jLabel30.setText("Unidad de medida :");

        txtUnidad.setEditable(false);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregar.setMnemonic('a');
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel29.setText("Ingrese Número de ticket :");

        txtNroTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroTicketActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel32.setText("Referidor:");

        cboReferido.setEditable(true);
        cboReferido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboReferidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNroTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboReferido, 0, 293, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboServicios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator3)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtNroTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(cboReferido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboServicios)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(txtCodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbBoleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBoleta.setComponentPopupMenu(tbBol);
        tbBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBoletaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbBoletaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbBoleta);
        if (tbBoleta.getColumnModel().getColumnCount() > 0) {
            tbBoleta.getColumnModel().getColumn(0).setResizable(false);
        }

        jtBoletaAdd.addTab("Puedes hacer clic en el Item para Quitarlo", jScrollPane2);

        jLabel76.setText("Son:");

        lblImporteLetras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblImporteLetras.setForeground(new java.awt.Color(51, 51, 51));
        lblImporteLetras.setText("CERO SOLES Y 00/100 NUEVOS SOLES");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("S/.00.00");
        lblTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTotal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblTotalPropertyChange(evt);
            }
        });

        jLabel51.setText("Total:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        lblNroBoleta.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblNroBoleta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNroBoleta.setText("0000 - 0000000");
        lblNroBoleta.setBorder(javax.swing.BorderFactory.createTitledBorder("Nro Boleta"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtBoletaAdd)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDireccion)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNroBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCrear)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblImporteLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(cboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(FechaBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtBoletaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(lblImporteLetras)
                    .addComponent(lblTotal)
                    .addComponent(jLabel51))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnCrear)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNroBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jtBoleta.addTab("Boleta de venta", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtBoleta)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtBoleta)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Genera(){
     serie = oFunc.tSerie("s_n_boleta", "s_boleta");
      oFunc.tSerieGlobal("s_n_boleta", "s_boleta");
      numero = oFunc.nFacturas("boletas", "n_boleta","b_serie",serie.toString());
      lblNroBoleta.setText(serie.toString()+" - "+ numero.toString());  
    }
    private void txtNRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNRKeyReleased
        if(!(evt.getKeyCode()>=65 && evt.getKeyCode()<=90 || evt.getKeyCode()>=96 && evt.getKeyCode()<=105 || evt.getKeyCode() == KeyEvent.VK_ENTER )) {
            return;
        }
        if(txtNR.getText().isEmpty()) {
            return;
        }
        if(cliente.length ==0) {
            return;
        }
       addTextAndSelectToTextFieldToRest(txtNR, getTextoApartirVector(txtNR.getText(), cliente));
    }//GEN-LAST:event_txtNRKeyReleased

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtNR.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNRActionPerformed
      
        if(chkJuridica.isSelected()== true){juridico();}
       if(chkNatural.isSelected()==true){natural();}
       if(chkAsistencial.isSelected()==true){asistencial();}
      
    }//GEN-LAST:event_txtNRActionPerformed

    private void chkNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNaturalActionPerformed
        
           AutoNatural();
       
        
    }//GEN-LAST:event_chkNaturalActionPerformed

    private void chkJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkJuridicaActionPerformed
       
           AutoJuridico();
       
        
    }//GEN-LAST:event_chkJuridicaActionPerformed

    private void cboServiciosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboServiciosPopupMenuWillBecomeInvisible
        if (cboServicios.getSelectedIndex() >= 0) {
            cboServicios();
        }
    }//GEN-LAST:event_cboServiciosPopupMenuWillBecomeInvisible

    private void cboServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServiciosActionPerformed
        cboServicios.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cboServicios();
                btnAgregar.requestFocusInWindow();
            }
        });
    }//GEN-LAST:event_cboServiciosActionPerformed

    private void txtNroTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroTicketActionPerformed
cboReferido.requestFocusInWindow();
    }//GEN-LAST:event_txtNroTicketActionPerformed

    private void lblTotalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblTotalPropertyChange
       
      String sEntero;
        String sDecimal;
        int iLongitud;
        int iEntero;
        
        // Obtengo la Longitud
        String sol =oFunc.Soles(lblTotal.getText().toString());
       iLongitud = sol.length();
        
        // Obtengo la parte entera
        sEntero = sol.substring(0,iLongitud-3);
        iEntero = Integer.valueOf(sEntero);
        
        
        // Obtengo la parte decimal
        sDecimal = sol.substring(iLongitud-2)+"/100 NUEVOS SOLES";
       lblImporteLetras.setText(oFunc.getStringOfNumber(iEntero)+ " CON "+sDecimal );
       
       
    }//GEN-LAST:event_lblTotalPropertyChange

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
          
       if(validar()){
           boolean bCommit=false;
        // Inicia la transacción colocando el commit a false
        oConn.SubAutoCommit(false);
        
        // Intenta ejecutar cada uno de los procesos
        if (oBoletaDetalle()) {
               if (oBoletaContenido()) {
                  bCommit = true;
              }
           }
        
        // Verifica si debe hacer commit
        if (bCommit)
        {
            // Realiza la confirmación de la transaccion
            oConn.SubCommit();
            sbImprimeBoleta();
            Limpiar();
            Genera();
        }
        else {
               oConn.SubRollBack();
           }
        
        
       } 
    }//GEN-LAST:event_btnCrearActionPerformed
  private boolean oBoletaDetalle()
    {
        
        // Para los resultados
        boolean bResult = false;
                
        // Para la sentencia Sql
        String insert;
        String values; 
        
        // Query para actualizar el Folio
        insert = "INSERT INTO boletas(nom_cliente, dc_cliente, direccion_cliente,vendedor,fecha_imp,son,total_boleta, b_condicion, b_serie, n_boleta ";
         values = "VALUES ('"+txtNR.getText().toString()+"','"+txtDoc.getText().toString()+"','"+txtDireccion.getText().toString()+"','"+txtOperador.getText().toString()+
                        "','"+FechaBoleta.getDate().toString()+"','"+lblImporteLetras.getText().toString()+"','"+lblTotal.getText().toString()+"','"+cboCondicion.getSelectedItem().toString()+"','"+serie.toString()+"','"+numero.toString()+"'";       
                
             if(cboCondicion.getSelectedItem().toString().equals("CONTADO")){ 
             insert += ",b_estado";
             values +=",'PAGADO'";
             insert+= ",fecha_cancelado ";
             values +=",'"+FechaBoleta.getDate()+"'";
             }else{
              insert += ", b_estado";
              values +=",'POR PAGAR'";
             
             }
              
              
              
      
        
        // Ejecuta la Sentencia
           Genera();
        if (oConn.FnBoolQueryExecuteUpdate(insert.concat(" ) ") +values.concat(" ) "))){
            bResult = true;
        }
        // Retorna el Valor
        return bResult;
        
        
    }
       private boolean oBoletaContenido()
    {
        // Para los resultados
        boolean bResult = false;
        
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String  sDescripcion, sPrecioU,sPrecioT, sCantidad, sUnidad;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbBoleta.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            sCantidad = tbBoleta.getModel().getValueAt(iFila, 0).toString();
            sUnidad = tbBoleta.getModel().getValueAt(iFila, 1).toString();
            sDescripcion = tbBoleta.getModel().getValueAt(iFila, 2).toString();
            sPrecioU = tbBoleta.getModel().getValueAt(iFila, 3).toString();
            sPrecioT =  tbBoleta.getModel().getValueAt(iFila, 4).toString();
                    // Prepara Query para grabar venta detalle
                    strSqlStmt = " INSERT INTO boletas_contenido";
                    strSqlStmt = strSqlStmt + "(b_cant,";
                    strSqlStmt = strSqlStmt + " b_unidad,";
                    strSqlStmt = strSqlStmt + " b_descripcion,";
                    strSqlStmt = strSqlStmt + " b_p_unit,";
                    strSqlStmt = strSqlStmt + " b_p_total,";
                    strSqlStmt = strSqlStmt + " b_serie,";
                    strSqlStmt = strSqlStmt + " n_boleta) ";
                    strSqlStmt = strSqlStmt + " Values (";
                    strSqlStmt = strSqlStmt + "'"+sCantidad.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sUnidad.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sDescripcion.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sPrecioU.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sPrecioT.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+serie.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+numero.toString()+"')";
              
                    if ( oConn.FnBoolQueryExecuteUpdate(strSqlStmt))
                    {
                        bResult = true;
                       // break;
                    }
                    
        
        
        }
        return bResult;
    }
private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaBoleta.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    if(cboCondicion.getSelectedIndex() < 0){
        oFunc.SubSistemaMensajeError("Condición");
        cboCondicion.requestFocusInWindow();
        bResultado = false;
    }
  
   return bResultado;
}
    private void tbBoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBoletaMouseClicked
        
    }//GEN-LAST:event_tbBoletaMouseClicked

    private void tbBoletaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBoletaMousePressed
         
    }//GEN-LAST:event_tbBoletaMousePressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (bAgruparProductos)
            {    
               if (!ServicioExiste()){
                   sbServicioAgrega();
                   sumar();
                   LimpiarServicios();
               }
            }
            else       
        {
                sbServicioAgrega();
                sumar();
                LimpiarServicios();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
public void sumar(){
   //if(!lblTotal.getText().equals("S/.00.00")){
    if(tbBoleta.getRowCount()>=1){
       
        double total = 0;
		double subtotal;
		for (int i = 0; i < modelo.getRowCount(); i++) {
			
                        String sCantidad = tbBoleta.getModel().getValueAt(i,0).toString();
                        String sPrecio = tbBoleta.getModel().getValueAt(i,3).toString();
                        Double Total = (Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio));
                        tbBoleta.getModel().setValueAt(oFunc.convertir(Total), i,4);
                        subtotal = Double.valueOf(oFunc.Soles(modelo.getValueAt(i, 4).toString()));
			total += subtotal;
                        
//                           Double Total = ((Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio))-(Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio))*oFunc.numtext(sDscto));
//                        tbFactura.getModel().setValueAt(oFunc.convertir(Total), i,6);
//                        subtotal = Double.valueOf(oFunc.Soles(modelo.getValueAt(i, 6).toString()));
		}
                   lblTotal.setText(oFunc.convertir(total));
     //   }
    
   }
}
    private void cboReferidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboReferidoActionPerformed
        cboReferido.getEditor().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cboServicios.requestFocus();
            }
        });
    }//GEN-LAST:event_cboReferidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int iRow;
        if(tbBoleta.getRowCount()>1){
            iRow = tbBoleta.getSelectedRow();
            DefaultTableModel tblDatos = (DefaultTableModel) tbBoleta.getModel();
            tblDatos.removeRow(iRow);
            tbBoleta.setModel(tblDatos);
            sumar();

        }else{
            iRow = tbBoleta.getSelectedRow();
            DefaultTableModel tblDatos = (DefaultTableModel) tbBoleta.getModel();
            tblDatos.removeRow(iRow);
            tbBoleta.setModel(tblDatos);
            lblTotal.setText("S/.00.00");

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void chkAsistencialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAsistencialMouseClicked
//        lblIngrese.setText("Nombre :");
//        CargarServicios();
//                Fecha();
    }//GEN-LAST:event_chkAsistencialMouseClicked

    private void chkAsistencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsistencialActionPerformed
        AutoAsistencial();
    }//GEN-LAST:event_chkAsistencialActionPerformed
 private void LimpiarServicios(){
 txtCodServicio.setText(null);
 txtPrecioT.setText(null);
 txtUnidad.setText(null);
 cboServicios.setSelectedIndex(-1);
 cboServicios.requestFocusInWindow();
 
 }
 private void cboServicios(){
  if(cboServicios.getSelectedIndex() >= 0){
            
               String Consulta;
               Consulta = "SELECT cod_servicio, precio,unidad FROM servicios_generales WHERE descripcion  ='"+cboServicios.getSelectedItem().toString()+"' limit 1";
             
               oConn.FnBoolQueryExecute(Consulta);
               
               try 
                {
                 if (oConn.setResult.next())
                 {       
                     
                         txtCodServicio.setText(oConn.setResult.getString("cod_servicio"));           
                         txtPrecioT.setText(oConn.setResult.getString("precio"));  
                         txtUnidad.setText(oConn.setResult.getString("unidad")); 
                         oConn.setResult.close();
                 }
                 
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           }
 
 } 
 void sbImprimeBoleta()
    {
        if(tbBoleta.getRowCount()>=1){
        int iFila;
        SimpleDateFormat formato = new SimpleDateFormat("   dd    MM      yyyy");
              ESCPrinter escp = new ESCPrinter("\\\\CAJA\\epson", true); //create ESCPrinter on network location \\computer\sharename, 9pin printer
        if (escp.initialize()) {
            escp.setCharacterSet(ESCPrinter.USA);
            escp.select15CPI();//15 characters per inch printing
            escp.advanceVertical(8); //go down 5cm
            escp.setAbsoluteHorizontalPosition(8); 
            //escp.bold(true);
            escp.print(txtNR.getText().toString());
             escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(8);
            escp.horizontalTab(9);
            escp.print("");
            escp.print(lblNroBoleta.getText().toString());
            //escp.bold(false);
            escp.advanceVertical(2);
            escp.setAbsoluteHorizontalPosition(8); 
            escp.print(txtDireccion.getText().toString());
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(8);
            escp.horizontalTab(10);
            escp.print(formato.format(FechaBoleta.getDate())); 
            escp.advanceVertical(2);
            escp.setAbsoluteHorizontalPosition(8); 
            escp.print(txtDoc.getText().toString());
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(8);
            escp.horizontalTab(5);
            escp.print(txtOperador.getText().toString());
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(8);
            escp.horizontalTab(11);
            escp.print(cboCondicion.getSelectedItem().toString());
            escp.advanceVertical(4);
            for(iFila = 0; iFila < tbBoleta.getRowCount();iFila++)
            {
            escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.print(tbBoleta.getValueAt(iFila, 0).toString());
            //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(9);
            //escp.horizontalTab(1);
            escp.print(" "+tbBoleta.getValueAt(iFila, 1).toString());
            //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(3);
            escp.print(tbBoleta.getValueAt(iFila, 2).toString());
            //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(10);
            escp.print("      "+tbBoleta.getValueAt(iFila, 3).toString());
            //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(12);
            escp.print("    "+tbBoleta.getValueAt(iFila, 4).toString());  
                
        }   
            switch (tbBoleta.getRowCount()) {
            case 1: escp.advanceVertical(19); break;
            case 2: escp.advanceVertical(18); break;
            case 3: escp.advanceVertical(17); break;
            case 4: escp.advanceVertical(16); break;   
            case 5: escp.advanceVertical(15); break;
            case 6: escp.advanceVertical(14); break;
            case 7: escp.advanceVertical(13); break;
            case 8: escp.advanceVertical(12); break;
            case 9: escp.advanceVertical(11); break;
            case 10: escp.advanceVertical(10); break;
            case 11: escp.advanceVertical(9); break;
            case 12: escp.advanceVertical(8); break;
            case 13: escp.advanceVertical(7); break;
            case 14: escp.advanceVertical(6); break;
            case 15: escp.advanceVertical(5); break;
            case 16: escp.advanceVertical(4); break;
            case 17: escp.advanceVertical(3); break; 
         }
            
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(8);
            escp.print(lblImporteLetras.getText());
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(12);
            escp.print(" "+lblTotal.getText());
            escp.advanceVertical(4);
            escp.setAbsoluteHorizontalPosition(8);
            escp.horizontalTab(3);
            escp.print(formato.format(FechaBoleta.getDate()));
            escp.formFeed(); //eject paper
            escp.close(); //close stream
            
        }
        else {
                System.out.println("No se ha podido abrir la secuencia para impresora");
            }
    }
    else{
    oFunc.SubSistemaMensajeError("No se puede Crear Boleta no hay Servicio Agregado");
        }      
    } 
  private void Limpiar(){
    txtNR.setText(null);
    txtDireccion.setText(null);
    txtDoc.setText(null); 
    cboCondicion.setSelectedIndex(-1);
    cboServicios.removeAllItems();
    txtCodServicio.setText(null);
    txtPrecioT.setText(null);
    txtUnidad.setText(null);
    lblTotal.setText("S/.00.00");
    txtNR.requestFocus();
    sbTablaBoleta();
    Genera();
    }
final void AutoJuridico(){
     if(chkJuridica.isSelected()== true)//&& txtNR.getText().isEmpty()|| chkNatural.isSelected()==true )
        {lblIngrese.setText("Raz. Social :");
       txtNR.requestFocus();
       txtNR.setText(null);
       cliente = getRowsToVector("SELECT razon_empresa FROM empresas UNION SELECT razon_contrata FROM contratas");
       
       }
}
final void AutoNatural(){
  if(chkNatural.isSelected()== true )//&& txtNR.getText().isEmpty() || chkJuridica.isSelected()==true )
        {lblIngrese.setText("Nombre :");
        txtNR.requestFocus();
        txtNR.setText(null);
        cliente = getRowsToVector("select nombres_pa||' '||apellidos_pa as nombres from datos_paciente");
        
        }
}
 final void AutoAsistencial(){
  if(chkNatural.isSelected()== true )//&& txtNR.getText().isEmpty() || chkJuridica.isSelected()==true )
        {lblIngrese.setText("Nombre :");
        jLabel3.setText("Dni:");
        txtNR.requestFocus();
        txtNR.setText(null);
        cliente = getRowsToVector("select nombres_pa as nombres from datos_paciente_asistencial");
        
        }
}
 void juridico(){
 String Sql ="SELECT ruc_empresa,direccion_empresa FROM empresas WHERE razon_empresa='"+txtNR.getText().toString()+"'"
         + "UNION "
         + "SELECT ruc_contrata,direccion_contrata FROM contratas WHERE razon_contrata ='"+txtNR.getText().toString()+"'";
         oConn.FnBoolQueryExecute(Sql);
          try {
            if (oConn.setResult.next()) {
                txtDireccion.setText(oConn.setResult.getString(2)); 
                txtDoc.setText(oConn.setResult.getString(1));
              CargarServicios();
                Fecha();
                txtNroTicket.requestFocus();
                oConn.setResult.close();

            } 
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Boleta de venta:" + ex.getMessage().toString());
        }
 
 }
 void natural(){
 String Sql ="select cod_pa,direccion_pa from datos_paciente where CONCAT(nombres_pa||' '||apellidos_pa) = '" +txtNR.getText().toString()+"'";
    oConn.FnBoolQueryExecute(Sql);
          try {
            if (oConn.setResult.next()) {
                txtDireccion.setText(oConn.setResult.getString(2)); 
                txtDoc.setText(oConn.setResult.getString(1));                              
              CargarServicios();
                Fecha();
                txtNroTicket.requestFocus();
                oConn.setResult.close();

            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Boleta de venta:" + ex.getMessage().toString());
        }
 }
 void asistencial(){
 String Sql ="select cod_pa,direccion_pa from datos_paciente_asistencial where nombres_pa = '" +txtNR.getText().toString()+"'";
    oConn.FnBoolQueryExecute(Sql);
          try {
            if (oConn.setResult.next()) {
                txtDireccion.setText(oConn.setResult.getString("direccion_pa")); 
                txtDoc.setText(oConn.setResult.getString("cod_pa"));                              
              CargarServicios();
                Fecha();
                txtNroTicket.requestFocus();
                oConn.setResult.close();

            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Boleta de venta:" + ex.getMessage().toString());
        }
 }
 void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaBoleta.setDate(fechaDate);
}
   private void CargarServicios(){
    String Consulta;
    cboServicios.removeAllItems();
    Consulta = "select descripcion from servicios_generales "
             + " ORDER BY  descripcion asc ";
        if (oConn.FnBoolQueryExecute(Consulta))
        {
            try 
            {
                 while (oConn.setResult.next())
                 {                     
                                    
                         cboServicios.addItem(oConn.setResult.getString (1));                     
                 }
              
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    cboServicios.setSelectedIndex(-1);

} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaBoleta;
    private javax.swing.ButtonGroup btBoleta;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JComboBox cboCondicion;
    private javax.swing.JComboBox cboReferido;
    private javax.swing.JComboBox cboServicios;
    private javax.swing.JCheckBox chkAsistencial;
    private javax.swing.JCheckBox chkJuridica;
    private javax.swing.JCheckBox chkNatural;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane jtBoleta;
    private javax.swing.JTabbedPane jtBoletaAdd;
    private javax.swing.JLabel lblImporteLetras;
    private javax.swing.JLabel lblIngrese;
    private javax.swing.JLabel lblNroBoleta;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPopupMenu tbBol;
    private javax.swing.JTable tbBoleta;
    private javax.swing.JTextField txtCodServicio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtNR;
    private javax.swing.JTextField txtNroTicket;
    private javax.swing.JTextField txtOperador;
    private javax.swing.JTextField txtPrecioT;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
public final String[]getRowsToVector(String sql)
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
            oConn.setResult.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
            
            return null;
        }
        return veDats;
    }

public static int getPosicionVectorBuscar(String datoBuscar, String[]empresas)
{
  try{
      for(int i =0;1 < empresas.length; i++){
        if(datoBuscar.equals(empresas[i].substring(0, datoBuscar.length()))) {
              return i;
          }
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
    if(newDato.isEmpty() || datoBuscado.isEmpty()) {
        return;
    }
    try {
        textField.getDocument().insertString(textField.getCaretPosition(), datoBuscado, null);
    }catch(Exception e){
    }
    textField.select(nroActual, textField.getText().length());

}
private void sbTablaBoleta()
    {
        // Declaro un modelo de datos
        modelo = new DefaultTableModel(){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
                  if(columnIndex==0) {
                  return true;
              }
            else {
                  return false;
              }
    }   
              
        };
         modelo.addTableModelListener(new TableModelListener(){

            @Override
                    public void tableChanged(TableModelEvent e) {
                       if(e.getColumn() == 0){
                          
                          sumar();
                    }
                        }
                });
        // Añadimos columnas al modelo de datos
        modelo.addColumn("Cant");
        modelo.addColumn("Unidad");
        modelo.addColumn("Descripción");
        modelo.addColumn("P.Unitario");
        modelo.addColumn("Total");
                
        // Coloca el Modelo en la Tabla
        tbBoleta.setModel(modelo);
        
        // Directamente

        tbBoleta.getColumn("Cant").setWidth(5);
        tbBoleta.getColumn("Cant").setPreferredWidth(5);        
        tbBoleta.getColumn("Unidad").setWidth(20);
        tbBoleta.getColumn("Unidad").setPreferredWidth(20);
        tbBoleta.getColumn("Descripción").setWidth(320);
        tbBoleta.getColumn("Descripción").setPreferredWidth(320);
        tbBoleta.getColumn("P.Unitario").setWidth(30);
        tbBoleta.getColumn("P.Unitario").setPreferredWidth(30);
        tbBoleta.getColumn("Total").setWidth(50);
        tbBoleta.getColumn("Total").setPreferredWidth(50);
        
       // tbBoleta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbBoleta.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbBoleta.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);        
        tbBoleta.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
   
        
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
   //     tbBoleta.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 9)); 
   
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }
private boolean ServicioExiste()
    {
        // Variables para Fila y Columns
        int fil;
        String sDato;
        String sPrecio;
        String sCantidad;

        boolean bResult=false;
        int iProductos ;
     
        // if(value.lastIndexOf(cboServicios.getSelectedItem().toString())>=0)
        sDato = cboServicios.getSelectedItem().toString();
        
        if (!sDato.isEmpty())
        {            

            // Ciclo para buscar en la Venta
            for(fil = 0; fil < tbBoleta.getRowCount();fil++)
            {
                //Obtiene dato contenido en una celda de la tabla
                String value = (String)tbBoleta.getValueAt(fil, 2);
                

                // lo pasa a Mayúsculas
                value = value.toUpperCase();
                
                // verifico si encuentra el dato
                if(value.lastIndexOf(sDato)>=0 )
                {
                    sCantidad = tbBoleta.getModel().getValueAt(fil,0).toString();
                    sPrecio = tbBoleta.getModel().getValueAt(fil,3).toString();                                   
                
                iProductos = Integer.valueOf(sCantidad) + 1;
                tbBoleta.getModel().setValueAt(iProductos,fil, 0);  
               // oFunc.SubSistemaMensajeInformacion(sPrecio);
               Double Total = (iProductos * oFunc.Sol(sPrecio));
             // oFunc.SubSistemaMensajeInformacion(String.valueOf(Total));
                                    
                tbBoleta.getModel().setValueAt(oFunc.convertir(Total), fil,4);
                    // Productos
                   //oFunc.SubSistemaMensajeInformacion(formateador.format(Total));
                   // lblTotal.setText(formateador.format(Total));
                     bResult = true;
                   
                }
                 
            }
            
        } 
    return bResult; 
    }
public void sbServicioAgrega()
    {

        double decPrecio;

        // Variable para el modelo de la tabla
        DefaultTableModel tblDatos = (DefaultTableModel) tbBoleta.getModel();

        // Prepara los datos vacios iniciales
        Object [] oFila = new Object[5];
        
        // Para el Query
        String sQuery;
        
        // Valida que haya algo en el Codigo
        if (! txtCodServicio.getText().trim().isEmpty())
        {
            // Prepara el Query
            sQuery  = "select cod_servicio,descripcion,precio::money::numeric ,unidad from servicios_generales where cod_servicio ='"+txtCodServicio.getText().toString()+"'";

            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {
               if (oConn.setResult.next())
                {       
                        oFila[0]="1";
                        oFila[1]=oConn.setResult.getString("unidad");
                        oFila[2]=oConn.setResult.getString("descripcion");
                        oFila[3]=oFunc.convertir(Double.valueOf(oConn.setResult.getString("precio")));
                        decPrecio = oConn.setResult.getDouble("precio");
                        
                        Double Total = decPrecio ;
                        oFila[4]= oFunc.convertir(Total);
                        tblDatos.insertRow(0, oFila);
                        tbBoleta.setModel(tblDatos);
                       lblTotal.setText(oFunc.convertir(Total));
                }
                else 
                {
                    oFunc.SubSistemaMensajeError("No se agrego correctamente");
                }

                // Cierro los Resultados
                oConn.setResult.close();

            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeError("Boleta de venta:"+ex.getMessage().toString());
            }
        }
            
        
        
    }


         
}
