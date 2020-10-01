package Caja;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Richard Garcia richard@nokytel.net
 */
public class ControlFactura extends javax.swing.JInternalFrame {
    //Agregando mis variables de conexcion a La DB
     clsFunciones  oFunc = new clsFunciones();
     clsConnection oConn = new clsConnection();
     clsOperacionesUsuarios oPu = new clsOperacionesUsuarios();
     DefaultTableModel modelo;
     DefaultTableModel anular;
     String[]cliente = new String[]{};
     boolean bAgruparProductos = true;
     Formatter serie;
    Formatter numero;
     String num= null;   
     Integer nume=null;
     public ControlFactura() {
        initComponents();          
        jtFacturas.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
//        jtFacturas.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/chanchito.png")));
//        jtFacturas.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/cancelar16x16.png")));
//        if(clsGlobales.sRol.equals("ROOT")){
//        jtFacturas.setEnabledAt(1, true);
//        jtFacturas.setEnabledAt(2, true);
//        }else{
//         jtFacturas.setEnabledAt(1, false);
//        jtFacturas.setEnabledAt(2, false);        
//        }
        txtRuc.requestFocus();
        txtResponsable.setText(clsGlobales.sNomOperador);
        AutoJuridico();
        oFunc.igv();
        IGV.setText(clsGlobales.igv);
        cPersonalizada();
       // txtSerie.setText(String.valueOf(oFunc.nSerie()));
       //sbTablaBoleta();
       
       Genera();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBoleta = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tbFac = new javax.swing.JPopupMenu();
        btnEliminar = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jtFacturas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblIngrese = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FechaValorizacion = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        txtNval = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtOrdServ = new javax.swing.JTextField();
        txtPeriodoV = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        FechaAceptaciónV = new com.toedter.calendar.JDateChooser();
        btnLimpiar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        FechaEmisiónFac = new com.toedter.calendar.JDateChooser();
        jLabel53 = new javax.swing.JLabel();
        lblIGV = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lblValorVenta = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        IGV = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboCondicionP = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        txtTiempoC = new javax.swing.JTextField();
        txtAdelanto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cboEstadoFac = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        FechaCancelcionF = new com.toedter.calendar.JDateChooser();
        txtNumFact = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtDetracción = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbReporte = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEmpRazonSocial = new javax.swing.JTextField();
        txtEmpresaRuc = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Fhasta = new com.toedter.calendar.JDateChooser();
        Fdesde = new com.toedter.calendar.JDateChooser();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        btnExportarExel = new javax.swing.JButton();

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
        tbFac.add(btnEliminar);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setClosable(true);
        setTitle("CONTROL DE FACTURAS ");
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

        jtFacturas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtFacturasStateChanged(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Valorización"));

        lblIngrese.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIngrese.setForeground(new java.awt.Color(51, 51, 51));
        lblIngrese.setText("Empresa:");

        txtRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonSocialActionPerformed(evt);
            }
        });
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyReleased(evt);
            }
        });

        jLabel16.setText("Ruc :");

        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });
        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });

        jLabel2.setText("Fecha Val.:");

        jLabel20.setText("N° Valorización :");

        txtNval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNvalActionPerformed(evt);
            }
        });
        txtNval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNvalKeyTyped(evt);
            }
        });

        jLabel21.setText("Ord. Servicio :");

        txtOrdServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdServActionPerformed(evt);
            }
        });
        txtOrdServ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrdServKeyTyped(evt);
            }
        });

        txtPeriodoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodoVActionPerformed(evt);
            }
        });
        txtPeriodoV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeriodoVKeyTyped(evt);
            }
        });

        jLabel22.setText("Periodo:");

        jLabel23.setText("Fecha Acept.:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNval, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(lblIngrese))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaValorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtOrdServ, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeriodoV, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaAceptaciónV, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(FechaValorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIngrese)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(txtNval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtOrdServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeriodoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(FechaAceptaciónV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(5, 5, 5))
        );

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Factura"));

        jLabel10.setText("Descripción Servicio :");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane4.setViewportView(txtDescripcion);

        jLabel4.setText("Factura N° :");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("S/.00.00");
        txtTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalMouseClicked(evt);
            }
        });
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        txtTotal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTotalPropertyChange(evt);
            }
        });

        jLabel24.setText("Fech. Emision:");

        jLabel53.setText("Total :");

        lblIGV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIGV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIGV.setText("S/.00.00");
        lblIGV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel52.setText("IGV :");

        jLabel51.setText("Valor Venta:");

        lblValorVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorVenta.setText("S/.00.00");
        lblValorVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblValorVenta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblValorVentaPropertyChange(evt);
            }
        });

        jLabel9.setText("IGV :");

        IGV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        IGV.setText("0.0%");

        jLabel7.setText("Tipo Pago :");

        cboCondicionP.setEditable(true);
        cboCondicionP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CONTADO", "CREDITO" }));
        cboCondicionP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCondicionPItemStateChanged(evt);
            }
        });
        cboCondicionP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCondicionPActionPerformed(evt);
            }
        });

        jLabel29.setText("Tiempo Credito:");

        txtTiempoC.setEnabled(false);
        txtTiempoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoCActionPerformed(evt);
            }
        });

        txtAdelanto.setEnabled(false);

        jLabel1.setText("Adelanto:");

        jLabel25.setText("Estado :");

        cboEstadoFac.setEditable(true);
        cboEstadoFac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PENDIENTE", "CANCELADA" }));
        cboEstadoFac.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEstadoFacItemStateChanged(evt);
            }
        });
        cboEstadoFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoFacActionPerformed(evt);
            }
        });
        cboEstadoFac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboEstadoFacKeyPressed(evt);
            }
        });

        jLabel26.setText("Fech. Cancelación:");

        FechaCancelcionF.setEnabled(false);

        txtNumFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFactActionPerformed(evt);
            }
        });

        jLabel54.setText("Detracción :");

        txtDetracción.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDetracción.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDetracción.setText("S/.00.00");
        txtDetracción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetracciónActionPerformed(evt);
            }
        });

        txtObservacion.setColumns(20);
        txtObservacion.setRows(5);
        jScrollPane5.setViewportView(txtObservacion);

        jLabel6.setText("Observaciones :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(cboEstadoFac, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addComponent(txtAdelanto)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumFact, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel7))
                                        .addComponent(jLabel24))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(FechaEmisiónFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboCondicionP, 0, 120, Short.MAX_VALUE)
                                        .addComponent(txtTiempoC))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaCancelcionF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IGV)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel52))
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDetracción)
                            .addComponent(lblIGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(lblIGV)
                            .addComponent(jLabel9)
                            .addComponent(IGV))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorVenta)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(txtDetracción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtNumFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel24)
                                    .addComponent(FechaEmisiónFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(cboCondicionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(txtTiempoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAdelanto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(cboEstadoFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaCancelcionF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4)))))
                .addGap(5, 5, 5))
        );

        txtResponsable.setEditable(false);
        txtResponsable.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addGap(5, 5, 5)
                .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtFacturas.addTab("Factura", jPanel1);

        tbReporte.setModel(new javax.swing.table.DefaultTableModel(
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
        tbReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbReporteMouseClicked(evt);
            }
        });
        tbReporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbReporteKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(tbReporte);

        jTabbedPane1.addTab("Reporte", jScrollPane6);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Personalizada"));

        jLabel14.setText("Razon social :");

        jLabel15.setText("Ruc :");

        txtEmpRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpRazonSocialActionPerformed(evt);
            }
        });

        txtEmpresaRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaRucActionPerformed(evt);
            }
        });

        jLabel18.setText("Desde :");

        jLabel19.setText("Hasta :");

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpresaRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fhasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtEmpRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fhasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtEmpresaRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(btnLimpiar1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnExportarExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        btnExportarExel.setText("Exportar");
        btnExportarExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportarExel)
                .addContainerGap(88, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnExportarExel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtFacturas.addTab("Historial", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jtFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Genera(){
     serie = oFunc.tSerie("s_n_factura", "s_factura");
      oFunc.tSerieGlobal("s_n_factura", "s_factura");
      numero = oFunc.nFacturas("facturas", "n_factura","f_serie",serie.toString());
      
    }
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtRazonSocial.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated
    private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaValorizacion.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    
  
   return bResultado;
} 
 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jtFacturasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtFacturasStateChanged

    }//GEN-LAST:event_jtFacturasStateChanged

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if(validar()){
            boolean bCommit=false;
            // Inicia la transacción colocando el commit a false
            oConn.SubAutoCommit(false);
            // Intenta ejecutar cada uno de los procesos
            if (Grabar()) {
                 bCommit = true;
            }
            // Verifica si debe hacer commit
            if (bCommit)
            {
                // Realiza la confirmación de la transaccion
                oConn.SubCommit();
//                sbImprimeFactura();                       
                Limpiar();
            }
            else {
                oConn.SubRollBack();
            }

        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void lblValorVentaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblValorVentaPropertyChange

        String sEntero;
        String sDecimal;
        int iLongitud;
        int iEntero;

        // Obtengo la Longitud
        String sol =oFunc.Soles(lblValorVenta.getText().toString());
        iLongitud = sol.length();

        // Obtengo la parte entera
        sEntero = sol.substring(0,iLongitud-3);
        iEntero = Integer.valueOf(sEntero);

        // Obtengo la parte decimal
        sDecimal = sol.substring(iLongitud-2)+"/100 NUEVOS SOLES";
//        lblImporteLetras.setText(oFunc.getStringOfNumber(iEntero)+ " CON "+sDecimal );

        if(!lblValorVenta.getText().equals("S/.00.00")){
            Double valorventa = oFunc.SolAll(lblValorVenta.getText().toString()) / oFunc.igv();
            Double igv = oFunc.SolAll(lblValorVenta.getText().toString()) - valorventa;
//            lblvalorventa.setText(oFunc.convertir(valorventa));
            lblIGV.setText(oFunc.convertir(igv));
        }

    }//GEN-LAST:event_lblValorVentaPropertyChange

    private void txtTiempoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoCActionPerformed
        txtAdelanto.requestFocus();
    }//GEN-LAST:event_txtTiempoCActionPerformed
 private void Quit(){
     String sql = "DELETE FROM valorizacion_contenido"
               + " WHERE v_carta_aviso ='" +num+ "' RETURNING v_carta_aviso";
        if (oConn.FnBoolQueryExecute(sql)) {
//            oFunc.SubSistemaMensajeInformacion("Se ha se elimino la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo eliminar");
        }
 }
    private void txtRazonSocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyReleased
        if(!(evt.getKeyCode()>=65 && evt.getKeyCode()<=90 || evt.getKeyCode()>=96 && evt.getKeyCode()<=105 || evt.getKeyCode() == KeyEvent.VK_ENTER )) {
            return;
        }
        if(txtRazonSocial.getText().isEmpty()) {
            return;
        }
        if(cliente.length ==0) {
            return;
        }
        addTextAndSelectToTextFieldToRest(txtRazonSocial, getTextoApartirVector(txtRazonSocial.getText(), cliente));
    }//GEN-LAST:event_txtRazonSocialKeyReleased

    private void txtRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonSocialActionPerformed
        juridico();
    }//GEN-LAST:event_txtRazonSocialActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
              
    }//GEN-LAST:event_txtRucActionPerformed
   
    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        if(!txtTotal.getText().equals("S/.00.00")){
            Double valorventa = oFunc.SolAll(txtTotal.getText()) / oFunc.igv();
            Double igv = oFunc.SolAll(txtTotal.getText()) - valorventa;
            Double detrac=oFunc.SolAll(txtTotal.getText())*0.10;
            lblValorVenta.setText(oFunc.convertir(valorventa));
            lblIGV.setText(oFunc.convertir(igv));
            txtTotal.setText(oFunc.convertir(oFunc.SolAll(txtTotal.getText())));
            txtDetracción.setText(oFunc.convertir(detrac));
        } 
        txtObservacion.requestFocus();
         
    }//GEN-LAST:event_txtTotalActionPerformed

    private void cboCondicionPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCondicionPItemStateChanged
        if(cboCondicionP.getSelectedItem() == "CREDITO"){
            txtTiempoC.setEnabled(true);
            txtAdelanto.setEnabled(true);
        }else{
           txtTiempoC.setEnabled(false);
            txtAdelanto.setEnabled(false); 
        }
    }//GEN-LAST:event_cboCondicionPItemStateChanged

    private void cboCondicionPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCondicionPActionPerformed
        cboCondicionP.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cboCondicionP.getSelectedItem() == "CREDITO"){
                    txtTiempoC.setEnabled(true);
                    txtAdelanto.setEnabled(true);
                } else {
                }
                
            }
        });
    }//GEN-LAST:event_cboCondicionPActionPerformed

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtRucKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
          String Sql="SELECT r_empresa,r_numval, r_ordservicio, r_periodo, r_fecha_val, \n" +
"       r_fecha_acep, r_descripcion, r_numfactura, r_fechaemisfac, r_valorventa::numeric AS VALORVENTA, \n" +
"       r_igv::numeric AS igv, r_total::numeric AS total, r_detraccion::numeric AS detraccion, r_tipopago, r_tiempcredito,"
                  + " r_adelanto::numeric AS adelanto, \n" +
"       r_estadofact, r_fechacancelacion, r_responsable, r_observacion " +
"  FROM reporte_facturas" +
"  WHERE r_ruc='"+ txtRuc.getText().toString()+  "'";
        oConn.FnBoolQueryExecute(Sql);      
             try {
                    if (oConn.setResult.next()) {
                       txtRazonSocial.setText(oConn.setResult.getString("r_empresa"));
                       txtNval.setText(oConn.setResult.getString("r_numval") );
                       txtOrdServ.setText(oConn.setResult.getString("r_ordservicio") );
                       txtPeriodoV.setText(oConn.setResult.getString("r_periodo") );
                       FechaValorizacion.setDate(oConn.setResult.getDate("r_fecha_val"));
                       FechaAceptaciónV.setDate(oConn.setResult.getDate("r_fecha_acep"));
                       txtDescripcion.setText(oConn.setResult.getString("r_descripcion"));
                       txtNumFact.setText(oConn.setResult.getString("r_numfactura"));
                       FechaEmisiónFac.setDate(oConn.setResult.getDate("r_fechaemisfac"));
                       lblValorVenta.setText(oConn.setResult.getString("VALORVENTA"));
                       lblIGV.setText(oConn.setResult.getString("igv"));
                       txtTotal.setText(oConn.setResult.getString("total"));
                       txtDetracción.setText(oConn.setResult.getString("detraccion"));
                       cboCondicionP.setSelectedItem(oConn.setResult.getString("r_tipopago"));
                       txtTiempoC.setText(oConn.setResult.getString("r_tiempcredito"));
                       txtAdelanto.setText(oConn.setResult.getString("adelanto"));
                       cboEstadoFac.setSelectedItem(oConn.setResult.getString("r_estadofact"));
                       FechaCancelcionF.setDate(oConn.setResult.getDate("r_fechacancelacion"));
                       txtObservacion.setText(oConn.setResult.getString("r_observacion"));
                                             
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Reporte Facturas:" + ex.getMessage().toString());
            }
             btnGrabar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed
 
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validar()){
            boolean bCommit=false;
//            // Inicia la transacción colocando el commit a false
            oConn.SubAutoCommit(false);
            // Intenta ejecutar cada uno de los procesos
           
            if (Actualizar()) {
                bCommit = true;
            }
//            // Verifica si debe hacer commit
            if (bCommit)
            {
//                // Realiza la confirmación de la transaccion
                oConn.SubCommit();
////                sbImprimeFactura();
                Limpiar();
            }else {
                oConn.SubRollBack();
            }
        }
        btnGrabar.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtEmpRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpRazonSocialActionPerformed
        txtEmpresaRuc.requestFocus();
    }//GEN-LAST:event_txtEmpRazonSocialActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        cPersonalizada();
    }//GEN-LAST:event_btnMostrarActionPerformed
    
    private void cPersonalizada(){
    modelo = new DefaultTableModel(){        
                 @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                if (columnIndex == 9) {

                    return true;
                }
                if (columnIndex == 10 ) {
//                    sumar();
                    return true;
                } else {
                    return false;
                }
            }
        };
                String vSql="SELECT  r_empresa AS NOMBREEMRESA,r_ruc AS RUC, r_numval AS N°VALORIZACION, "
                        + "r_ordservicio AS ORDENSERVICIO, r_periodo AS PERIODOVALORIZACION, "
                        + "r_fecha_val AS FECHAVALORIZACION, r_fecha_acep AS FECHAACEPTACIONVALORIZACION, "
                        + "r_descripcion AS DESCRIPCIONSERVICIO, r_numfactura AS N°FACTURA,"
                        + " r_fechaemisfac AS FECHAEMISIONFACTURA, r_valorventa::numeric AS VALORVENTA," +
                    "       r_igv::numeric AS IGV, r_total::numeric AS TOTAL, r_detraccion::numeric AS DETRACCION,"
                        + " r_tipopago AS CONTADOCREDITO, r_tiempcredito AS TIEMPOCREDITO, r_adelanto::numeric AS ADELANTO, " +
                    "       r_estadofact AS ESTADOFACTURA, r_fechacancelacion AS FECHACANCELACION, "
                        + "r_responsable AS RESPONSABLEEMISIONFACTURA, r_observacion AS OBSERVACIONES" +
                    "  FROM reporte_facturas" ;              
                if(!txtEmpRazonSocial.getText().isEmpty()){
                vSql +="WHERE '"+txtEmpRazonSocial.getText().toString()+"' = v_razon_cliente ";
                }
                if(!txtEmpresaRuc.getText().isEmpty()){
                vSql +="WHERE '"+txtEmpresaRuc.getText().toString()+"' = v_ruc_cliente ";
                }
                 if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) 
                 {
                     if(txtEmpresaRuc.getText().isEmpty() && txtEmpRazonSocial.getText().isEmpty() ){
                          vSql +=" WHERE v_fecha_emision >= '"+Fdesde.getDate().toString()+"'";
                     }else{
                         vSql +=" AND v_fecha_emision >= '"+Fdesde.getDate().toString()+"'";
                     }
                     
                 }
                 if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) 
                 {
                 vSql +=" AND v_fecha_emision <= '"+Fhasta.getDate().toString()+"'";
                 }
                         
                         
                   //oFunc.SubSistemaMensajeInformacion(vSql);      
                if (oConn.FnBoolQueryExecute(vSql))
             {
             try  {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                         modelo.addColumn(rsmt.getColumnLabel(i));
                        }
                    while (oConn.setResult.next())
                    {
                        Object [] Fila = new Object[CantidaColumnas];
                       
                        for (int i = 0; i < CantidaColumnas; i++) {
                           Fila[i] = oConn.setResult.getObject(i+1);
                            
                        }
                        modelo.addRow(Fila);
                    }
                    tbReporte = autoResizeColWidth(tbReporte, modelo);
                      tbReporte.setModel(modelo);
                     oConn.setResult.close();
                } 
                catch (SQLException ex) 
                {
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(ControlFactura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
   
    public JTable autoResizeColWidth(JTable table, DefaultTableModel model) {
    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    table.setModel(model);

    int margin = 5;

    for (int i = 0; i < table.getColumnCount(); i++) {
        int                     vColIndex = i;
        DefaultTableColumnModel colModel  = (DefaultTableColumnModel) table.getColumnModel();
        TableColumn             col       = colModel.getColumn(vColIndex);
        int                     width     = 0;

        // Get width of column header
        TableCellRenderer renderer = col.getHeaderRenderer();

        if (renderer == null) {
            renderer = table.getTableHeader().getDefaultRenderer();
        }

        Component comp = renderer.getTableCellRendererComponent(table, col.getHeaderValue(), false, false, 0, 0);

        width = comp.getPreferredSize().width;

        // Get maximum width of column data
        for (int r = 0; r < table.getRowCount(); r++) {
            renderer = table.getCellRenderer(r, vColIndex);
            comp     = renderer.getTableCellRendererComponent(table, table.getValueAt(r, vColIndex), false, false,
                    r, vColIndex);
            width = Math.max(width, comp.getPreferredSize().width);
        }

        // Add margin
        width += 2 * margin;

        // Set the width
        col.setPreferredWidth(width);
    }

    ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.LEFT);

    // table.setAutoCreateRowSorter(true);
    table.getTableHeader().setReorderingAllowed(false);

    return table;
} 
    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        LimpiarPersonalizado();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void txtEmpresaRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaRucActionPerformed
        txtEmpRazonSocial.requestFocus();
    }//GEN-LAST:event_txtEmpresaRucActionPerformed
    public void generar(JTable table) {
        HSSFWorkbook libro = new HSSFWorkbook();
        HSSFSheet hoja = libro.createSheet("Reporte");
           //  HSSFRow trow = hoja.createRow((short) 0);
         // createTituloCell(libro, trow, 0, CellStyle.ALIGN_CENTER,CellStyle.VERTICAL_CENTER, "Titulo del Excel");

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de exel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        //////////
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String file = chooser.getSelectedFile().toString().concat(".xls");
            ///////////////////////
            HSSFFont fuente = libro.createFont();
            HSSFFont fuente2 = libro.createFont();
fuente.setFontHeightInPoints((short)8);         
fuente.setFontName(HSSFFont.FONT_ARIAL);
fuente.setColor(IndexedColors.WHITE.getIndex());
fuente.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
///////////
fuente2.setFontHeightInPoints((short)7);         
fuente2.setFontName(HSSFFont.FONT_ARIAL);
fuente2.setColor(IndexedColors.BLACK.getIndex());

///////////////////
HSSFCellStyle estiloCelda = libro.createCellStyle();
HSSFCellStyle estiloCelda2 = libro.createCellStyle();

estiloCelda.setWrapText(true);
estiloCelda.setAlignment(HSSFCellStyle. ALIGN_CENTER);
estiloCelda.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
estiloCelda.setFont(fuente);
/////////////////////
estiloCelda2.setWrapText(true);
estiloCelda2.setAlignment(HSSFCellStyle. ALIGN_LEFT);
estiloCelda2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
estiloCelda2.setFont(fuente2);
//////////////////
// También, podemos establecer bordes...
estiloCelda.setBorderBottom(HSSFCellStyle.BORDER_THIN);
estiloCelda.setBottomBorderColor((short)8);
estiloCelda.setBorderLeft(HSSFCellStyle.BORDER_THIN);
estiloCelda.setLeftBorderColor((short)8);
estiloCelda.setBorderRight(HSSFCellStyle.BORDER_THIN);
estiloCelda.setRightBorderColor((short)8);
estiloCelda.setBorderTop(HSSFCellStyle.BORDER_THIN);
estiloCelda.setTopBorderColor((short)8);
//////////
estiloCelda2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setBottomBorderColor((short)8);
estiloCelda2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setLeftBorderColor((short)8);
estiloCelda2.setBorderRight(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setRightBorderColor((short)8);
estiloCelda2.setBorderTop(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setTopBorderColor((short)8);
///////////////////////
estiloCelda.setFillForegroundColor(IndexedColors.DARK_BLUE.getIndex());
estiloCelda.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

///////////////////////////////
        // oFunc.SubSistemaMensajeInformacion(String.valueOf(table.getColumnCount()));
            //   oFunc.SubSistemaMensajeInformacion(String.valueOf(table.getRowCount()));
            for (int i = 0; i < table.getRowCount() ; i++) {
                
               if (i == 0) {
                   HSSFRow fila = hoja.createRow(i);
                 for (int j = 0; j < table.getColumnCount() ; j++) {
                        HSSFCell celda = fila.createCell(j);
                        celda.setCellValue(new HSSFRichTextString(table.getColumnModel().getColumn(j).getHeaderValue().toString().toUpperCase()));
                       celda.setCellStyle(estiloCelda);
                   }
              } //else {
                    HSSFRow fila = hoja.createRow(i+1);
                    for (int j = 0; j < table.getColumnCount() ; j++) {
                        HSSFCell celda = fila.createCell(j);
                         
                        if (table.getValueAt(i, j) != null) {
                           
                            celda.setCellValue(new HSSFRichTextString(table.getValueAt(i, j).toString()));
                            hoja.autoSizeColumn(j);
                            celda.setCellStyle(estiloCelda2); 
                   // }
                 }      
                
               }
                try {
                    try (FileOutputStream elFichero = new FileOutputStream(file)) {
                        libro.write(elFichero);
                    }
                } catch (IOException e) {
                }
            }
          oFunc.SubSistemaMensajeInformacion("REPORTE COMPLETO");
 }

}
    private void btnExportarExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExelActionPerformed
        
        if(this.tbReporte.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        generar(tbReporte);
    }//GEN-LAST:event_btnExportarExelActionPerformed

    private void tbReporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbReporteKeyPressed
        
    }//GEN-LAST:event_tbReporteKeyPressed

    private void tbReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReporteMouseClicked
         
    }//GEN-LAST:event_tbReporteMouseClicked

    private void txtNvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNvalActionPerformed
        // TODO add your handling code here:
        txtOrdServ.requestFocus();
    }//GEN-LAST:event_txtNvalActionPerformed

    private void txtNvalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNvalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNvalKeyTyped

    private void txtOrdServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdServActionPerformed
        // TODO add your handling code here:
        txtPeriodoV.requestFocus();
    }//GEN-LAST:event_txtOrdServActionPerformed

    private void txtOrdServKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrdServKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdServKeyTyped

    private void txtPeriodoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodoVActionPerformed
        // TODO add your handling code here:
        FechaValorizacion.requestFocus();
    }//GEN-LAST:event_txtPeriodoVActionPerformed

    private void txtPeriodoVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeriodoVKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodoVKeyTyped

    private void cboEstadoFacItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEstadoFacItemStateChanged
        // TODO add your handling code here:
        if(cboEstadoFac.getSelectedItem() == "CREDITO"){
            txtTiempoC.setEnabled(true);
            txtAdelanto.setEnabled(true);
        }else{
           txtTiempoC.setEnabled(false);
            txtAdelanto.setEnabled(false); 
        }
    }//GEN-LAST:event_cboEstadoFacItemStateChanged

    private void cboEstadoFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoFacActionPerformed
        // TODO add your handling code here:
        if(cboEstadoFac.getSelectedItem() == "CANCELADA"){
            FechaCancelcionF.setEnabled(true);
        }else{
            try {
                Fecha();
            } catch (ParseException ex) {
                Logger.getLogger(ControlFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
           FechaCancelcionF.setEnabled(false); 
        }
    }//GEN-LAST:event_cboEstadoFacActionPerformed

    private void txtNumFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumFactActionPerformed

    private void txtDetracciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetracciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetracciónActionPerformed

    private void cboEstadoFacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboEstadoFacKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoFacKeyPressed

    private void txtTotalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTotalPropertyChange
        
    }//GEN-LAST:event_txtTotalPropertyChange

    private void txtTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalMouseClicked
        // TODO add your handling code here:
        txtTotal.setText(null);
    }//GEN-LAST:event_txtTotalMouseClicked
       private void LimpiarPersonalizado(){
    txtEmpRazonSocial.setText(null);
    txtEmpresaRuc.setText(null);
    Fhasta.setDate(null);
    Fdesde.setDate(null);
    
    }
  
final void AutoJuridico(){
     lblIngrese.setText("Raz. Social :");
       txtRazonSocial.requestFocus();
       txtRazonSocial.setText(null);
       cliente = getRowsToVector("SELECT razon_empresa FROM empresas UNION SELECT razon_contrata FROM contratas");
       
       
}

    
 void juridico(){
 String Sql ="SELECT ruc_empresa FROM empresas WHERE razon_empresa='"+txtRazonSocial.getText().toString()+"'"
         + "UNION "
         + "SELECT ruc_contrata FROM contratas WHERE razon_contrata ='"+txtRazonSocial.getText().toString()+"'";
         oConn.FnBoolQueryExecute(Sql);
          try {
            if (oConn.setResult.next()) {
                txtRuc.setText(oConn.setResult.getString(1));
                txtNval.requestFocus();
                oConn.setResult.close();
            } 
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Boleta de venta:" + ex.getMessage().toString());
        }
 
 }
 

 void Fecha() throws ParseException{

SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
Date today = formateador.parse("10/10/2010");
FechaCancelcionF.setDate(today);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fdesde;
    private com.toedter.calendar.JDateChooser FechaAceptaciónV;
    private com.toedter.calendar.JDateChooser FechaCancelcionF;
    private com.toedter.calendar.JDateChooser FechaEmisiónFac;
    private com.toedter.calendar.JDateChooser FechaValorizacion;
    private com.toedter.calendar.JDateChooser Fhasta;
    private javax.swing.JLabel IGV;
    private javax.swing.ButtonGroup btBoleta;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnExportarExel;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox cboCondicionP;
    private javax.swing.JComboBox cboEstadoFac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTabbedPane jtFacturas;
    private javax.swing.JLabel lblIGV;
    private javax.swing.JLabel lblIngrese;
    private javax.swing.JLabel lblValorVenta;
    private javax.swing.JPopupMenu tbFac;
    private javax.swing.JTable tbReporte;
    private javax.swing.JTextField txtAdelanto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDetracción;
    private javax.swing.JTextField txtEmpRazonSocial;
    private javax.swing.JTextField txtEmpresaRuc;
    private javax.swing.JTextField txtNumFact;
    private javax.swing.JTextField txtNval;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextField txtOrdServ;
    private javax.swing.JTextField txtPeriodoV;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTiempoC;
    private javax.swing.JTextField txtTotal;
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

private void Limpiar(){
        txtRuc.setText(null);   
        txtRazonSocial.setText(null);
        txtNval.setText(null);
        txtOrdServ.setText(null);
        txtPeriodoV.setText(null);
        txtTotal.setText(null);
        FechaValorizacion.setDate(null);
        FechaAceptaciónV.setDate(null);
        txtDescripcion.setText(null);
        txtNumFact.setText(null);
        FechaEmisiónFac.setDate(null);
        cboCondicionP.setSelectedIndex(0);
        txtObservacion.setText(null);
        txtTotal.setText("S/.00.00");
        lblIGV.setText("S/.00.00");
        lblValorVenta.setText("S/.00.00");
        txtDetracción.setText("S/.00.00");
        txtTiempoC.setText(null);
        txtAdelanto.setText(null);
        cboEstadoFac.setSelectedIndex(0);
        FechaCancelcionF.setEnabled(false);
        FechaCancelcionF.setDate(null);
        txtRazonSocial.requestFocus();
    }
  private boolean Grabar(){
//        
//        // Para los resultados
        boolean bResult = false;
//                
        // Para la sentencia Sql
        String insert;
        String values; 
        // Query para actualizar el Folio
       insert = "INSERT INTO reporte_facturas(\n" +
"            r_ruc, r_empresa, r_numval, r_ordservicio, r_periodo, r_fecha_val, \n" +
"            r_fecha_acep, r_descripcion, r_numfactura, r_fechaemisfac, r_valorventa, \n" +
"            r_igv, r_total, r_detraccion, r_tipopago, r_tiempcredito, r_adelanto, \n" +
"            r_estadofact, r_fechacancelacion, r_responsable, r_observacion ";
    values ="VALUES ('"+txtRuc.getText()+"', "
            + "'"+txtRazonSocial.getText()+"', "
            + "'"+txtNval.getText()+"', "
            + "'"+txtOrdServ.getText()+"', "
            + "'"+txtPeriodoV.getText()+"', "
            + "'"+FechaValorizacion.getDate()+"', "
            + "'"+FechaAceptaciónV.getDate()+"', "
            + "'"+txtDescripcion.getText()+"', "
            + "'"+txtNumFact.getText()+"', "
            + "'"+FechaEmisiónFac.getDate()+"', "
            + "'"+lblValorVenta.getText()+"', "
            + "'"+lblIGV.getText()+"', "
            + "'"+txtTotal.getText()+"', "
            + "'"+txtDetracción.getText()+"', "
            + "'"+cboCondicionP.getSelectedItem()+"', "
            + "'"+txtTiempoC.getText()+"', "
            + "'"+txtAdelanto.getText()+"', "
            + "'"+cboEstadoFac.getSelectedItem()+"', "
            + "'"+FechaCancelcionF.getDate()+"', "
            + "'"+txtResponsable.getText()+"', "
            + "'"+txtObservacion.getText()+"' ";
        if (oConn.FnBoolQueryExecuteUpdate(insert.concat(" )") +values.concat(" )"))){
            bResult = true;
        }
        // Retorna el Valor
        return bResult;
//        
        
    }
       
    private boolean Actualizar(){
//        // Para los resultados
        boolean bResult = false;
        // Para la sentencia Sql
        String jquery;
        // Query para actualizar el Folio
       jquery = "UPDATE reporte_facturas\n" 
               +" SET r_estadofact='"+cboEstadoFac.getSelectedItem()+"'\n" 
               +", r_fechacancelacion='"+FechaCancelcionF.getDate()+"'"
               + ", r_responsable='"+txtResponsable.getText()+"'"
               + ", r_observacion='"+txtObservacion.getText()+"'\n"
      + " where r_ruc='"+txtRuc.getText()+"'";

        if (oConn.FnBoolQueryExecuteUpdate(jquery)){
            bResult = true;
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        }
        // Retorna el Valor
        return bResult;
    }
}
