package Caja;

import Clases.ESCPrinter;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
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
public class Valorizacion extends javax.swing.JInternalFrame {
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
     public Valorizacion() {
        initComponents();          
        jtFacturas.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
//        jtFacturas.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/chanchito.png")));
//        jtFacturas.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/cancelar16x16.png")));
        jtFacturaAdd.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
//        if(clsGlobales.sRol.equals("ROOT")){
//        jtFacturas.setEnabledAt(1, true);
//        jtFacturas.setEnabledAt(2, true);
//        }else{
//         jtFacturas.setEnabledAt(1, false);
//        jtFacturas.setEnabledAt(2, false);        
//        }
        txtRazonSocial.requestFocus();
        AutoJuridico();
        sbTablaFactura();
        
        txtCotizador.setText(clsGlobales.sNomOperador); 
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
        jSeparator1 = new javax.swing.JSeparator();
        lblIngrese = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FechaValorizacion = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPrecioT = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        txtConcepto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboCondicion = new javax.swing.JComboBox();
        txtCotizador = new javax.swing.JTextField();
        jtFacturaAdd = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbValorizacion = new javax.swing.JTable();
        jLabel76 = new javax.swing.JLabel();
        lblImporteLetras = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        lblIGV = new javax.swing.JLabel();
        lblvalorventa = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        IGV = new javax.swing.JLabel();
        txtCartaAviso = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtLugarDestino = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAsunto = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtReferencia = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCuentaBanco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCuentaDetracciones = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnHMC = new javax.swing.JButton();
        btnCPCM = new javax.swing.JButton();
        txtCartaAviso1 = new javax.swing.JTextField();
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
        jButton1 = new javax.swing.JButton();
        txtAviso = new javax.swing.JTextField();
        FechaPago = new com.toedter.calendar.JDateChooser();
        cboCondicion1 = new javax.swing.JComboBox();

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
        setTitle("Valorización");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Empresa"));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblIngrese.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIngrese.setForeground(new java.awt.Color(51, 51, 51));
        lblIngrese.setText("Raz. Social :");

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

        jLabel2.setText("Fecha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblIngrese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazonSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FechaValorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(lblIngrese)
                .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(FechaValorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setText("Dirección :");

        jLabel3.setText("Destinatario:");

        txtDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinatarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Carta de aviso:");

        jLabel5.setText("Factura N°");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Servicios a la Valorizacion"));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel27.setText("Cantidad:");

        jLabel28.setText("Precio:");

        txtPrecioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioTActionPerformed(evt);
            }
        });
        txtPrecioT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioTKeyTyped(evt);
            }
        });

        jLabel30.setText("Unidad de medida :");

        txtUnidad.setText("UND");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregar.setMnemonic('a');
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnClear.setMnemonic('l');
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel29.setText("Item");

        txtItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemActionPerformed(evt);
            }
        });

        txtConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConceptoActionPerformed(evt);
            }
        });

        jLabel11.setText("Concepto/Descripcion:");

        jLabel7.setText("Estado :");

        cboCondicion.setEditable(true);
        cboCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PENDIENTE", "PAGADO" }));
        cboCondicion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCondicionItemStateChanged(evt);
            }
        });
        cboCondicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCondicionActionPerformed(evt);
            }
        });

        txtCotizador.setEditable(false);
        txtCotizador.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCotizador, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConcepto)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel27)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCotizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbValorizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbValorizacion.setComponentPopupMenu(tbFac);
        tbValorizacion.getTableHeader().setReorderingAllowed(false);
        tbValorizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbValorizacionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbValorizacionMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbValorizacion);

        jtFacturaAdd.addTab("Puedes hacer Click derecho en el Item para Quitarlo", jScrollPane2);

        jLabel76.setText("Son:");

        lblImporteLetras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblImporteLetras.setForeground(new java.awt.Color(51, 51, 51));
        lblImporteLetras.setText("CERO SOLES Y 00/100 NUEVOS SOLES");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("S/.00.00");
        lblTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTotal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblTotalPropertyChange(evt);
            }
        });

        jLabel51.setText("Total:");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel52.setText("IGV :");

        lblIGV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIGV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIGV.setText("S/.00.00");
        lblIGV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblvalorventa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblvalorventa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblvalorventa.setText("S/.00.00");
        lblvalorventa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel53.setText("Valor venta :");

        jLabel9.setText("IGV :");

        IGV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        IGV.setText("0.0%");

        txtCartaAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCartaAvisoActionPerformed(evt);
            }
        });

        jLabel17.setText("LugarDestino: ");

        txtLugarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarDestinoActionPerformed(evt);
            }
        });

        jLabel10.setText("Asunto :");

        txtAsunto.setColumns(20);
        txtAsunto.setRows(5);
        jScrollPane4.setViewportView(txtAsunto);

        txtReferencia.setColumns(20);
        txtReferencia.setRows(5);
        jScrollPane5.setViewportView(txtReferencia);

        jLabel6.setText("Referencia :");

        jLabel8.setText("Banco :");

        txtBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBancoActionPerformed(evt);
            }
        });

        jLabel12.setText("N° Cuenta :");

        txtCuentaBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaBancoActionPerformed(evt);
            }
        });
        txtCuentaBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaBancoKeyTyped(evt);
            }
        });

        jLabel13.setText("N°Cuenta Detracciones:");

        txtCuentaDetracciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaDetraccionesKeyTyped(evt);
            }
        });

        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
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

        btnHMC.setText("Aviso - HMC");
        btnHMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHMCActionPerformed(evt);
            }
        });

        btnCPCM.setText("Aviso - CPCM");
        btnCPCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPCMActionPerformed(evt);
            }
        });

        txtCartaAviso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCartaAviso1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtFacturaAdd)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel76)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImporteLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel8))
                                            .addComponent(txtCartaAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnHMC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCPCM))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtBanco)
                                                    .addComponent(txtCuentaDetracciones, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtCuentaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IGV)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel52))
                                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblvalorventa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(txtCartaAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(400, 400, 400)
                                        .addComponent(btnCrear)
                                        .addGap(3, 3, 3)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimpiar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(2, 2, 2)
                                        .addComponent(jScrollPane4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addGap(171, 171, 171)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(1, 1, 1)
                                        .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLugarDestino)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel4)
                        .addComponent(txtCartaAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel17)
                        .addComponent(txtLugarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtFacturaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel76)
                        .addComponent(lblImporteLetras))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblvalorventa)
                        .addComponent(jLabel53)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(lblIGV)
                    .addComponent(jLabel9)
                    .addComponent(IGV)
                    .addComponent(jLabel8)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtCuentaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(jLabel51)
                    .addComponent(jLabel13)
                    .addComponent(txtCuentaDetracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCrear)
                    .addComponent(btnActualizar)
                    .addComponent(btnHMC)
                    .addComponent(btnCPCM)
                    .addComponent(txtCartaAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jtFacturaAdd.getAccessibleContext().setAccessibleName("Puedes hacer Click derecho en el Item para Quitarlo");

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
                .addContainerGap(37, Short.MAX_VALUE)
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
                    .addComponent(btnLimpiar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButton1.setText("Actualizar Pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAviso.setEditable(false);

        cboCondicion1.setEditable(true);
        cboCondicion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PENDIENTE", "PAGADO" }));
        cboCondicion1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCondicion1ItemStateChanged(evt);
            }
        });
        cboCondicion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCondicion1ActionPerformed(evt);
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportarExel)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAviso)
                    .addComponent(cboCondicion1, 0, 150, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(txtAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboCondicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(FechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnExportarExel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jtFacturas.addTab("Historial", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtFacturas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtFacturas)
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
} private void LimpiarServicios(){
    txtCantidad.setText(null);
    txtPrecioT.setText(null);
    txtUnidad.setText(null);
    txtConcepto.setText(null);
    txtItem.setText(null);
  
 }
 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          int iRow;
        if(tbValorizacion.getRowCount()>1){
        
        iRow = tbValorizacion.getSelectedRow();
        DefaultTableModel tblDatos = (DefaultTableModel) tbValorizacion.getModel();
        tblDatos.removeRow(iRow);           
        tbValorizacion.setModel(tblDatos);
        sumar();
            
        }else{
            iRow = tbValorizacion.getSelectedRow();
            DefaultTableModel tblDatos = (DefaultTableModel) tbValorizacion.getModel();
            tblDatos.removeRow(iRow);           
            tbValorizacion.setModel(tblDatos);
            lblvalorventa.setText("S/.00.00");
            lblIGV.setText("S/.00.00");
            lblTotal.setText("S/.00.00");
            
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jtFacturasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtFacturasStateChanged

    }//GEN-LAST:event_jtFacturasStateChanged

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        if(validar()){
            boolean bCommit=false;
            // Inicia la transacción colocando el commit a false
            oConn.SubAutoCommit(false);

            // Intenta ejecutar cada uno de los procesos
            if (oFacturaDetalle()) {
                if (oFacturaContenido()) {
                    bCommit = true;

                }
            }

            // Verifica si debe hacer commit
            if (bCommit)
            {
                // Realiza la confirmación de la transaccion
                oConn.SubCommit();
//                sbImprimeFactura();
                txtCartaAviso1.setText(txtCartaAviso.getText());
                        
                Limpiar();
            }
            else {
                oConn.SubRollBack();
            }

        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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

        if(!lblTotal.getText().equals("S/.00.00")){
            Double valorventa = oFunc.SolAll(lblTotal.getText().toString()) / oFunc.igv();
            Double igv = oFunc.SolAll(lblTotal.getText().toString()) - valorventa;
            lblvalorventa.setText(oFunc.convertir(valorventa));
            lblIGV.setText(oFunc.convertir(igv));
        }

    }//GEN-LAST:event_lblTotalPropertyChange

    private void tbValorizacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbValorizacionMousePressed

    }//GEN-LAST:event_tbValorizacionMousePressed

    private void tbValorizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbValorizacionMouseClicked
//        Integer cod  = Integer.valueOf( tbValorizacion.getValueAt(tbValorizacion.getSelectedRow(),0).toString());
//           String sql = "SELECT v_item, v_descripcion, v_unidad, v_cantidad, v_precio_unit " +
//            "  FROM valorizacion_contenido " +
//            "where v_item='" + cod + "'";
//            
//            oConn.FnBoolQueryExecute(sql);
//            try {
//                if (oConn.setResult.next()) {
//                    txtItem.setText(oConn.setResult.getString("v_item"));
//                    txtConcepto.setText(oConn.setResult.getString("v_descripcion"));
//                    txtUnidad.setText(oConn.setResult.getString("v_unidad"));
//                    txtCantidad.setText(oConn.setResult.getString("v_cantidad"));
//                     txtPrecioT.setText(oConn.setResult.getString("v_precio_unit"));
//                    oConn.setResult.close();
//                }
//            } catch (Exception e) {
//            }
//            
    }//GEN-LAST:event_tbValorizacionMouseClicked

    private void txtConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConceptoActionPerformed
          txtCantidad.requestFocus();
    }//GEN-LAST:event_txtConceptoActionPerformed

    private void txtItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemActionPerformed
        txtConcepto.requestFocus();
    }//GEN-LAST:event_txtItemActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Quit();
        
        LimpiarServicios();
        sbTablaFactura();
    }//GEN-LAST:event_btnClearActionPerformed
 private void Quit(){
     String sql = "DELETE FROM valorizacion_contenido"
               + " WHERE v_carta_aviso ='" +num+ "' RETURNING v_carta_aviso";
        if (oConn.FnBoolQueryExecute(sql)) {
//            oFunc.SubSistemaMensajeInformacion("Se ha se elimino la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo eliminar");
        }
 }
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
        // Consume el caracter
    }//GEN-LAST:event_btnAgregarActionPerformed

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

    private void txtCartaAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCartaAvisoActionPerformed
         txtDestinatario.requestFocus();
    }//GEN-LAST:event_txtCartaAvisoActionPerformed

    private void txtDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinatarioActionPerformed
          txtLugarDestino.requestFocus();
    }//GEN-LAST:event_txtDestinatarioActionPerformed

    private void txtLugarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarDestinoActionPerformed
          txtFactura.requestFocus();
    }//GEN-LAST:event_txtLugarDestinoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
         txtPrecioT.requestFocus();
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioTActionPerformed
          txtUnidad.requestFocus();
    }//GEN-LAST:event_txtPrecioTActionPerformed

    private void cboCondicionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCondicionItemStateChanged
        
    }//GEN-LAST:event_cboCondicionItemStateChanged

    private void cboCondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCondicionActionPerformed
        cboCondicion.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                txtSerieTicket.requestFocusInWindow();
            }
        });
    }//GEN-LAST:event_cboCondicionActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioTKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtPrecioTKeyTyped

    private void txtCuentaDetraccionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaDetraccionesKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtCuentaDetraccionesKeyTyped

    private void txtCuentaBancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaBancoKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtCuentaBancoKeyTyped

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed
        txtAsunto.requestFocus();
    }//GEN-LAST:event_txtFacturaActionPerformed

    private void txtBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancoActionPerformed
        txtCuentaBanco.requestFocus();
    }//GEN-LAST:event_txtBancoActionPerformed

    private void txtCuentaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaBancoActionPerformed
        txtCuentaDetracciones.requestFocus();
    }//GEN-LAST:event_txtCuentaBancoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
          String Sql="SELECT v_carta_aviso,v_razon_cliente, v_ruc_cliente, v_direccion, v_fecha_emision, \n" +
"       v_destinatatio, v_lugardestino, v_nfactura, v_asunto, v_referencia, \n" +
"       v_condicion,  v_son, v_valor_venta, v_igv, v_total, \n" +
"       v_banco, v_ncuenta, v_ncuenta_detraciones\n" +
"  FROM valorizacion\n" +
"  WHERE v_carta_aviso='"+ txtCartaAviso.getText().toString()+  "'";
        oConn.FnBoolQueryExecute(Sql);      
             try {
                    if (oConn.setResult.next()) {
                       num=oConn.setResult.getString("v_carta_aviso");
                       txtRazonSocial.setText(oConn.setResult.getString("v_razon_cliente"));
                       txtRuc.setText(oConn.setResult.getString("v_ruc_cliente") );
                       txtDireccion.setText(oConn.setResult.getString("v_direccion"));
                       FechaValorizacion.setDate(oConn.setResult.getDate("v_fecha_emision"));
                       txtDestinatario.setText(oConn.setResult.getString("v_destinatatio"));
                       txtLugarDestino.setText(oConn.setResult.getString("v_lugardestino"));
                       txtFactura.setText(oConn.setResult.getString("v_nfactura"));
                       txtAsunto.setText(oConn.setResult.getString("v_asunto"));
                       txtReferencia.setText(oConn.setResult.getString("v_referencia"));
                       cboCondicion.setSelectedItem(oConn.setResult.getString("v_condicion"));
                       lblImporteLetras.setText(oConn.setResult.getString("v_son"));
                       lblvalorventa.setText(oConn.setResult.getString("v_valor_venta"));
                       lblIGV.setText(oConn.setResult.getString("v_igv"));
                       lblTotal.setText(oConn.setResult.getString("v_total"));
                       txtBanco.setText(oConn.setResult.getString("v_banco"));
                       txtCuentaBanco.setText(oConn.setResult.getString("v_ncuenta"));
                        txtCuentaDetracciones.setText(oConn.setResult.getString("v_ncuenta_detraciones"));
                       EditarContenidoValorizacion();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Antecedentes Patologicos:" + ex.getMessage().toString());
            }
    }//GEN-LAST:event_btnEditarActionPerformed
   private void editarContenido(){
        String sql = "SELECT vc.v_carta_aviso, v_item, v_descripcion, v_unidad, v_cantidad, v_precio_unit, \n" +
            "       v_precio_total\n" +
            "  FROM valorizacion as v\n" +
            "INNER JOIN valorizacion_contenido AS vc on(vc.v_carta_aviso=v.v_carta_aviso)\n" +
            "where vc.v_carta_aviso='" + txtCartaAviso.getText().toString() + "'";
        oConn.FnBoolQueryExecute(sql);      
             try {
                    if (oConn.setResult.next()) {
                       txtRazonSocial.setText(oConn.setResult.getString("v_razon_cliente"));
                       txtRuc.setText(oConn.setResult.getString("v_ruc_cliente") );
                       txtDireccion.setText(oConn.setResult.getString("v_direccion"));
                       FechaValorizacion.setDate(oConn.setResult.getDate("v_fecha_emision"));
                       txtDestinatario.setText(oConn.setResult.getString("v_destinatatio"));
                       txtLugarDestino.setText(oConn.setResult.getString("v_lugardestino"));
                       txtFactura.setText(oConn.setResult.getString("v_nfactura"));
                       txtAsunto.setText(oConn.setResult.getString("v_asunto"));
                       txtReferencia.setText(oConn.setResult.getString("v_referencia"));
                       cboCondicion.setSelectedItem(oConn.setResult.getString("v_condicion"));
                       lblImporteLetras.setText(oConn.setResult.getString("v_son"));
                       lblvalorventa.setText(oConn.setResult.getString("v_valor_venta"));
                       lblIGV.setText(oConn.setResult.getString("v_igv"));
                       lblTotal.setText(oConn.setResult.getString("v_total"));
                       txtBanco.setText(oConn.setResult.getString("v_banco"));
                       txtCuentaBanco.setText(oConn.setResult.getString("v_ncuenta"));
                        txtCuentaDetracciones.setText(oConn.setResult.getString("v_ncuenta_detraciones"));
                       EditarContenidoValorizacion();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo ");
                    }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Antecedentes Patologicos:" + ex.getMessage().toString());
            }
   }
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
            if(validar()){
            boolean bCommit=false;
            // Inicia la transacción colocando el commit a false
            oConn.SubAutoCommit(false);

            // Intenta ejecutar cada uno de los procesos
            if (ActualizarDetalle()) {
                if (ActualizaContenido()) {
                    bCommit = true;

                }
            }

            // Verifica si debe hacer commit
            if (bCommit)
            {
                // Realiza la confirmación de la transaccion
                oConn.SubCommit();
                txtCartaAviso1.setText(txtCartaAviso.getText());
//                sbImprimeFactura();
                Limpiar();
            }
            else {
                oConn.SubRollBack();
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnHMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHMCActionPerformed
        String Norden = txtCartaAviso1.getText();
        oPu.print1(Norden, "HojaValorizacion.jasper", "Valorizacion Horizonte Medic Consulting");
    }//GEN-LAST:event_btnHMCActionPerformed

    private void txtCartaAviso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCartaAviso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCartaAviso1ActionPerformed

    private void btnCPCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPCMActionPerformed
         String Norden = txtCartaAviso1.getText();
        oPu.print1(Norden, "HojaValorizacionCPCM.jasper", "Valorizacion Corp. Peruana de Centros Medicos");
        
    }//GEN-LAST:event_btnCPCMActionPerformed

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
    
                    String vSql="SELECT v_carta_aviso as CARTAAVISO, v_razon_cliente AS RAZONSOCIAL, "
                            + "v_ruc_cliente AS RUC, v_fecha_emision AS FECHAEMISION, \n" +
                        "       v_nfactura AS NFACTURA, v_cotizador AS USUARIO,"
                            + "v_valor_venta::numeric AS VALORVENTA, v_igv::numeric AS IGV, v_total::numeric AS TOTAL, \n" +
                        "      v_condicion AS ESTADO,v_fecha_cancelacion AS FECHACANCELACION\n" +
                        "  FROM valorizacion " ;              
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
                            if(i==3){
                               Fila[i]=formato.format(oConn.setResult.getDate("FECHAEMISION"));
                           }
                               
                           if(i==10){
                                if(oConn.setResult.getDate("FECHACANCELACION")!= null){
                                    Fila[i]= formato.format(oConn.setResult.getDate("FECHACANCELACION"));
                                }else{
                                    Fila[i]= " ";
                                }
                           }
                           
                          
                            
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
                    Logger.getLogger(Valorizacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    private boolean ActualizarReporte(){
//        // Para los resultados
        boolean bResult = false;
        // Para la sentencia Sql
        String insert;
        String values ; 
        // Query para actualizar el Folio
       insert = "UPDATE valorizacion\n" ;
       values=" SET v_condicion='"+cboCondicion1.getSelectedItem()+"'";
       if(FechaPago.getDate()!=null){
           values += ", v_fecha_cancelacion='" + FechaPago.getDate() + "'";
       }else{
           values += ", v_fecha_cancelacion=null";
       }
       
       values+=" where v_carta_aviso='"+txtAviso.getText().toString()+"' RETURNING v_carta_aviso;";
   

        if (oConn.FnBoolQueryExecute(insert +values)){
            bResult = true;
        }
        
        // Retorna el Valor
        return bResult;
//        
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      boolean bCommit=false;
            // Inicia la transacción colocando el commit a false
            oConn.SubAutoCommit(false);

            // Intenta ejecutar cada uno de los procesos
            if (ActualizarReporte()) {
                    bCommit = true;

                
            }

            // Verifica si debe hacer commit
            if (bCommit)
            {
                // Realiza la confirmación de la transaccion
                oConn.SubCommit();
                cPersonalizada();
            }
            else {
                oConn.SubRollBack();
            }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReporteMouseClicked
          if (evt.getClickCount() == 1) 
        {  
            String aviso;
            String estado;
            aviso=String.valueOf(tbReporte.getModel().getValueAt(tbReporte.getSelectedRow(), 0).toString());
            estado=String.valueOf(tbReporte.getModel().getValueAt(tbReporte.getSelectedRow(), 9).toString());
           txtAviso.setText(aviso); 
           cboCondicion1.setSelectedItem(estado);
            
            
        }
    }//GEN-LAST:event_tbReporteMouseClicked

    private void cboCondicion1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCondicion1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCondicion1ItemStateChanged

    private void cboCondicion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCondicion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCondicion1ActionPerformed
       private void LimpiarPersonalizado(){
    txtEmpRazonSocial.setText(null);
    txtEmpresaRuc.setText(null);
    Fhasta.setDate(null);
    Fdesde.setDate(null);
    
    }
  private void EditarContenidoValorizacion(){
//    String [] titulos={"N°Orden","Hospital","Operacion","Dias","complicaciones","Fecha"};
    String [] registros = new String[6];
      String sql = "SELECT vc.v_carta_aviso, v_item, v_descripcion, v_unidad, v_cantidad, v_precio_unit, \n" +
            "       v_precio_total\n" +
            "  FROM valorizacion as v\n" +
            "INNER JOIN valorizacion_contenido AS vc on(vc.v_carta_aviso=v.v_carta_aviso)\n" +
            "where vc.v_carta_aviso='" + txtCartaAviso.getText().toString() + "'";

    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("v_item");
                    registros[1]= oConn.setResult.getString("v_descripcion");
                    registros[2]= oConn.setResult.getString("v_unidad");
                    registros[3]= oConn.setResult.getString("v_cantidad");
                    registros[4]=oConn.setResult.getString("v_precio_unit");
                    registros[5]=oConn.setResult.getString("v_precio_total");
                    
                     modelo.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  tbValorizacion.setModel(modelo);
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Valorizacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  }  
final void AutoJuridico(){
     lblIngrese.setText("Raz. Social :");
       txtRazonSocial.requestFocus();
       txtRazonSocial.setText(null);
       cliente = getRowsToVector("SELECT razon_empresa FROM empresas UNION SELECT razon_contrata FROM contratas");
       
       
}

    
 void juridico(){
 String Sql ="SELECT ruc_empresa,direccion_empresa FROM empresas WHERE razon_empresa='"+txtRazonSocial.getText().toString()+"'"
         + "UNION "
         + "SELECT ruc_contrata,direccion_contrata FROM contratas WHERE razon_contrata ='"+txtRazonSocial.getText().toString()+"'";
         oConn.FnBoolQueryExecute(Sql);
          try {
            if (oConn.setResult.next()) {
                txtDireccion.setText(oConn.setResult.getString(2)); 
                txtRuc.setText(oConn.setResult.getString(1));
              
                Fecha();
                txtCartaAviso.requestFocus();
                oConn.setResult.close();

            } 
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Boleta de venta:" + ex.getMessage().toString());
        }
 
 }
 

 void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaValorizacion.setDate(fechaDate);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fdesde;
    private com.toedter.calendar.JDateChooser FechaPago;
    private com.toedter.calendar.JDateChooser FechaValorizacion;
    private com.toedter.calendar.JDateChooser Fhasta;
    private javax.swing.JLabel IGV;
    private javax.swing.ButtonGroup btBoleta;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCPCM;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnExportarExel;
    private javax.swing.JButton btnHMC;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox cboCondicion;
    private javax.swing.JComboBox cboCondicion1;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTabbedPane jtFacturaAdd;
    private javax.swing.JTabbedPane jtFacturas;
    private javax.swing.JLabel lblIGV;
    private javax.swing.JLabel lblImporteLetras;
    private javax.swing.JLabel lblIngrese;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblvalorventa;
    private javax.swing.JPopupMenu tbFac;
    private javax.swing.JTable tbReporte;
    private javax.swing.JTable tbValorizacion;
    private javax.swing.JTextArea txtAsunto;
    private javax.swing.JTextField txtAviso;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCartaAviso;
    private javax.swing.JTextField txtCartaAviso1;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtCotizador;
    private javax.swing.JTextField txtCuentaBanco;
    private javax.swing.JTextField txtCuentaDetracciones;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpRazonSocial;
    private javax.swing.JTextField txtEmpresaRuc;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtLugarDestino;
    private javax.swing.JTextField txtPrecioT;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextArea txtReferencia;
    private javax.swing.JTextField txtRuc;
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
private void sbTablaFactura()
    {
        // Declaro un modelo de datos
        modelo = new DefaultTableModel(){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
                  if(columnIndex==1 ) {
                  
                      return true;
              }
                  if(columnIndex==3 || columnIndex==4){
                     sumar();
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
                       if(e.getColumn() == 1){
                          
                          sumar();
                    }
                        }
                });
        
      
 

                
        // Añadimos columnas al modelo de datos
        modelo.addColumn("Item");
        modelo.addColumn("Concepto/Descripcion");
        modelo.addColumn("Unidad");
        modelo.addColumn("Cantidad");
        modelo.addColumn("P.Unitario");
        modelo.addColumn("Total");
                
        // Coloca el Modelo en la Tabla
        tbValorizacion.setModel(modelo);
        
        // Directamente
        tbValorizacion.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbValorizacion.getColumnModel().getColumn(1).setPreferredWidth(260);
        tbValorizacion.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbValorizacion.getColumnModel().getColumn(3).setPreferredWidth(10);
        tbValorizacion.getColumnModel().getColumn(4).setPreferredWidth(15);
        tbValorizacion.getColumnModel().getColumn(5).setPreferredWidth(35);
        tbValorizacion.getTableHeader().setReorderingAllowed(false);
        tbValorizacion.getTableHeader().setResizingAllowed(false);

       // tbBoleta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbValorizacion.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbValorizacion.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);        
        tbValorizacion.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        tbValorizacion.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
        tbValorizacion.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
   
        
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
   //     tbBoleta.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 9)); 
   
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }

private void sbTablaReporte()
    {
        // Declaro un modelo de datos
        modelo = new DefaultTableModel(){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
                  if(columnIndex==1 ) {
                  
                      return true;
              }
                  if(columnIndex==3 || columnIndex==4){
                     sumar();
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
                       if(e.getColumn() == 1){
                          
                          sumar();
                    }
                        }
                });
        
      
    }

private boolean ServicioExiste()
    {
        // Variables para Fila y Columns
        int fil;
        String sDato;
        String sDscto;
        String sPrecio;
        String sCantidad;

        boolean bResult=false;
        int iProductos ;
     
        // if(value.lastIndexOf(cboServicios.getSelectedItem().toString())>=0)
        sDato = txtCantidad.getText().toString();
       
        if (!sDato.isEmpty())
        {            

            // Ciclo para buscar en la Venta
            for(fil = 0; fil < tbValorizacion.getRowCount();fil++)
            {
                //Obtiene dato contenido en una celda de la tabla
                String value = (String)tbValorizacion.getValueAt(fil, 0);

                // lo pasa a Mayúsculas
                value = value.toUpperCase();
                // verifico si encuentra el dato
                if(value.lastIndexOf(sDato)>=0 )
                {
                    sCantidad = tbValorizacion.getModel().getValueAt(fil,1).toString();
                    sPrecio = tbValorizacion.getModel().getValueAt(fil,4).toString();                                   
                
                iProductos = Integer.valueOf(sCantidad) + 1;
                tbValorizacion.getModel().setValueAt(iProductos,fil, 1);  
               // oFunc.SubSistemaMensajeInformacion(sPrecio);
               Double Total = (iProductos * oFunc.Sol(sPrecio));
             // oFunc.SubSistemaMensajeInformacion(String.valueOf(Total));
                                    
                tbValorizacion.getModel().setValueAt(oFunc.convertir(Total), fil,6);
                    // Productos
                   //oFunc.SubSistemaMensajeInformacion(formateador.format(Total));
                   // lblTotal.setText(formateador.format(Total));
                     bResult = true;
                   
                }
                 
            }
            
        } 
    return bResult; 
    }
public void sumar(){
   //if(!lblTotal.getText().equals("S/.00.00")){
    if(tbValorizacion.getRowCount()>=0){
       
        double total = 0;
		double subtotal;
		for (int i = 0; i < modelo.getRowCount(); i++) {
                        String sCantidad = tbValorizacion.getModel().getValueAt(i,3).toString();
                        String sPrecio = tbValorizacion.getModel().getValueAt(i,4).toString();
                        NumberFormat money = NumberFormat.getCurrencyInstance();
                        Double Total = (Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio));
                        tbValorizacion.getModel().setValueAt(oFunc.convertir(Total), i,5);
                        subtotal = Double.valueOf(oFunc.Soles(modelo.getValueAt(i, 5).toString()));
                        
			total += subtotal;
		}
                   lblTotal.setText(oFunc.convertir(total));
     //   }
    
   }
}
public void sbServicioAgrega(){

        double precio; Integer cantidad;
        // Variable para el modelo de la tabla
        DefaultTableModel tblDatos = (DefaultTableModel) tbValorizacion.getModel();

        // Prepara los datos vacios iniciales
        String [] oFila = new String[6];
        // Para el Query
        
        // Valida que haya algo en el Codigo
       if (!txtCantidad.getText().trim().isEmpty()) {
            oFila[0] = txtItem.getText().toString();
            oFila[1] = txtConcepto.getText().toString();
            oFila[2] = txtUnidad.getText().toString();
            cantidad=Integer.parseInt(txtCantidad.getText().toString());
            oFila[3] =String.valueOf(cantidad) ;
            precio =Double.valueOf(txtPrecioT.getText().toString());
            oFila[4] =oFunc.convertir(precio) ;
            
            Double Total = (Double.valueOf(cantidad)*Double.valueOf(precio));
            oFila[5] = oFunc.convertir(Total);
            tblDatos.insertRow(0, oFila);

            tbValorizacion.setModel(tblDatos);
            lblTotal.setText(oFunc.convertir(Total));

       }

        
        
    }
    private void Limpiar(){
    txtRazonSocial.setText(null);
    txtDireccion.setText(null);
    txtDestinatario.setText(null);
    txtLugarDestino.setText(null);
    txtCartaAviso.setText(null);
    FechaValorizacion.setDate(null);
    txtRuc.setText(null);
    txtFactura.setText(null);
    txtAsunto.setText(null);
    txtReferencia.setText(null);
    lblvalorventa.setText("S/.00.00");
    lblIGV.setText("S/.00.00");
    lblTotal.setText("S/.00.00");
    txtBanco.setText(null);
    txtCuentaBanco.setText(null);
    txtCuentaDetracciones.setText(null);
    txtRazonSocial.requestFocus();
    sbTablaFactura();
    }


     void sbImprimeFactura(){
//        if(tbFactura.getRowCount()>=0){
//        int iFila;
//        SimpleDateFormat formato = new SimpleDateFormat("dd / MM / yyyy");
//        SimpleDateFormat FechaCancelacion = new SimpleDateFormat("dd        MM             yy");
//              ESCPrinter escp = new ESCPrinter("\\\\CAJA\\epson", false); //create ESCPrinter on network location \\computer\sharename, 9pin printer
//        if (escp.initialize()) {
//            escp.setCharacterSet(ESCPrinter.USA);
//            escp.select15CPI();//15 characters per inch printing
//            //NroFactura
//            escp.advanceVertical(5);
//            escp.setAbsoluteHorizontalPosition(8);
//            escp.horizontalTab(9);
//            escp.print("");
//            escp.print(lblNroFactura.getText());
//            //
//            escp.advanceVertical(5); //go down 5cm
//            escp.setAbsoluteHorizontalPosition(9); 
//            //escp.bold(true);
//            escp.print(txtRazonSocial.getText().toString());
//            //escp.bold(false);
//            escp.advanceVertical2(1);
//            escp.setAbsoluteHorizontalPosition(9); 
//            escp.print(txtDireccion.getText().toString());
//            //Ruc
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(7); 
//            escp.horizontalTab(10);
//            escp.print(txtDestinatario.getText().toString());
//            //Orden de Compra
//            escp.advanceVertical2(3);
//            escp.setAbsoluteHorizontalPosition(5); 
//            escp.print(txtOrdenServicio.getText().toString());
//           //Condiciones
//            escp.advanceVertical2(0);
//            escp.setAbsoluteHorizontalPosition(13); 
//            escp.print(cboCondicion.getSelectedItem().toString());
//            //Nro Guia
//            escp.advanceVertical2(0);
//            escp.setAbsoluteHorizontalPosition(13);
//            escp.horizontalTab(4);
//            escp.print(txtNroGuia.getText().toString());
//              //Vendedor
//            escp.advanceVertical2(0);
//            escp.setAbsoluteHorizontalPosition(14);
//            escp.horizontalTab(8);
//            escp.print("  ---");  
//               //Fecha
//            escp.advanceVertical2(0);
//            escp.setAbsoluteHorizontalPosition(14);
//            escp.horizontalTab(10);
//            escp.print(formato.format(FechaFactura.getDate()));
//            escp.advanceVertical(3);
//            for(iFila = 0; iFila < tbFactura.getRowCount();iFila++)
//        {   
//            //Codigo
//            escp.advanceVertical(1);
//            escp.setAbsoluteHorizontalPosition(3); 
//            escp.print(tbFactura.getValueAt(iFila, 0).toString());
//            //Cantidad
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(7);
//            escp.print(" "+tbFactura.getValueAt(iFila, 1).toString());
//            //Unidad
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(4);
//            escp.horizontalTab(2);
//            escp.print(tbFactura.getValueAt(iFila, 2).toString());
//            //Descripción
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(4);
//            escp.horizontalTab(3);
//            escp.print("  "+tbFactura.getValueAt(iFila, 3).toString());
//            //Precio Unitario
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(4);
//            escp.horizontalTab(10);
//            escp.print("   "+oFunc.SolImp(tbFactura.getValueAt(iFila, 4).toString()));
//            //Precio Dscto
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(5);
//            escp.horizontalTab(11);
//            escp.print("      "+tbFactura.getValueAt(iFila, 5).toString());
//            //Precio Total
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(5);
//            escp.horizontalTab(12);
//            escp.print("    "+oFunc.SolImp(tbFactura.getValueAt(iFila, 6).toString()));
//                            
//        }   
//            switch (tbFactura.getRowCount()) {
//            case 1: escp.advanceVertical(15); break;
//            case 2: escp.advanceVertical(14); break;
//            case 3: escp.advanceVertical(13); break;
//            case 4: escp.advanceVertical(12); break;   
//            case 5: escp.advanceVertical(11); break;
//            case 6: escp.advanceVertical(10); break;
//            case 7: escp.advanceVertical(9); break;
//            case 8: escp.advanceVertical(8); break;
//            case 9: escp.advanceVertical(7); break;
//            case 10: escp.advanceVertical(6); break;
//            case 11: escp.advanceVertical(5); break;
//            case 12: escp.advanceVertical(4); break;
//            case 13: escp.advanceVertical(3); break;
//            case 14: escp.advanceVertical(2); break;
//            case 15: escp.advanceVertical(1); break;
//            //case 16: escp.advanceVertical(1); break;
//            
//         }
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(4);
//            escp.horizontalTab(3);
//            escp.print("Caja: "+txtFactura.getText());
//            //Importe en letras
//            escp.advanceVertical2(2);
//            escp.setAbsoluteHorizontalPosition(5);
//            escp.print(lblImporteLetras.getText());
//            //TOTAL
//            escp.advanceVertical(1);
//            escp.setAbsoluteHorizontalPosition(4);
//            escp.horizontalTab(12);
//            escp.print(" "+lblTotal.getText());
//            //IGV
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(4);
//            escp.horizontalTab(10);
//            escp.print(" "+lblIGV.getText());
//            //VALOR VENTA
//            escp.advanceVertical(0);
//            escp.setAbsoluteHorizontalPosition(4);
//            escp.horizontalTab(8);
//            escp.print(" "+lblvalorventa.getText());
//            //IGV ACTUAL
//            escp.advanceVertical(2);
//            escp.setAbsoluteHorizontalPosition(4);
//            escp.horizontalTab(10);
//            escp.print("IGV: "+IGV.getText());
//            
//            if(cboCondicion.getSelectedItem()== "CONTADO"){
//                escp.advanceVertical(1);
//                escp.setAbsoluteHorizontalPosition(4);
//                escp.horizontalTab(4);
//                escp.print(FechaCancelacion.format(FechaFactura.getDate()));
//            }
//            escp.formFeed(); //eject paper
//            escp.close(); //close stream

//                System.out.println("No se ha podido abrir la secuencia para impresora");
//            }
//    }
//    else{
//    oFunc.SubSistemaMensajeError("No se puede Crear Factura no hay Servicio Agregado");
//        }      
    }

  private boolean oFacturaDetalle(){
//        
//        // Para los resultados
        boolean bResult = false;
//                
        // Para la sentencia Sql
        String insert;
        String values; 
        
        // Query para actualizar el Folio
       insert = "INSERT INTO valorizacion( v_carta_aviso, v_razon_cliente, v_ruc_cliente, v_direccion, v_fecha_emision, \n" +
        "            v_destinatatio, v_lugardestino, v_nfactura, v_asunto, v_referencia, \n" +
        "            v_cotizador, v_son, v_valor_venta, v_igv, v_total ";
    values ="VALUES('"+txtCartaAviso.getText().toString()+"'"
            + ",'"+txtRazonSocial.getText().toString()+"'"
            + ",'"+txtRuc.getText().toString()+"'"
            + ",'"+txtDireccion.getText().toString()+ "'"
            + ",'"+FechaValorizacion.getDate()+"'"
            + ",'"+txtDestinatario.getText().toString()+"'"
            + ",'"+txtLugarDestino.getText().toString()+"'"
            + ",'"+txtFactura.getText().toString()+"'"
            + ",'"+txtAsunto.getText().toString()+"'"
            + ",'"+txtReferencia.getText().toString()+"'"
            + ",'"+txtCotizador.getText().toString()+"'"
            + ",'"+lblImporteLetras.getText().toString()+"'"
            + ",'"+lblvalorventa.getText().toString()+"'"
            + ",'"+lblIGV.getText().toString()+"'"     
            + ",'"+lblTotal.getText().toString()+"'";       
                if(cboCondicion.getSelectedItem() == "PAGADO"){ 
                insert += ", v_condicion";
                 values +=",'PAGADO'";
                 insert+= ",f_fecha_cancelacion ";
                  values +=",'"+FechaValorizacion.getDate()+"'";
                }else{
                 insert += ", v_condicion";
                 values +=",'PENDIENTE'";
                }

                if(!txtBanco.getText().isEmpty()){
                    insert += ", v_banco";
                    values +=",'"+txtBanco.getText().toString()+"'";
                }
                if(!txtCuentaBanco.getText().isEmpty()){
                    insert += ", v_ncuenta";
                    values +=",'"+txtCuentaBanco.getText().toString()+"'";
                }
                if(!txtCuentaDetracciones.getText().isEmpty()){
                    insert += ", v_ncuenta_detraciones";
                    values +=",'"+txtCuentaDetracciones.getText().toString()+"'";
                }

        if (oConn.FnBoolQueryExecuteUpdate(insert.concat(" )") +values.concat(" )"))){
            bResult = true;
        }
        // Retorna el Valor
        return bResult;
//        
        
    }
       private boolean oFacturaContenido(){
        // Para los resultados
        boolean bResult = false;
        
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String sItem, sDescripcion, sPrecioU,sPrecioT, sCantidad, sUnidad;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbValorizacion.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            sItem = tbValorizacion.getModel().getValueAt(iFila, 0).toString();
            sDescripcion = tbValorizacion.getModel().getValueAt(iFila, 1).toString();
            sUnidad = tbValorizacion.getModel().getValueAt(iFila, 2).toString();
            sCantidad = tbValorizacion.getModel().getValueAt(iFila, 3).toString();
            sPrecioU = tbValorizacion.getModel().getValueAt(iFila, 4).toString();
            sPrecioT = tbValorizacion.getModel().getValueAt(iFila, 5).toString();
           
        
                    // Prepara Query para grabar venta detalle
                    strSqlStmt = " INSERT INTO valorizacion_contenido";
                    strSqlStmt = strSqlStmt + "(v_carta_aviso,";
                    strSqlStmt = strSqlStmt + " v_item,";
                    strSqlStmt = strSqlStmt + " v_descripcion,";
                    strSqlStmt = strSqlStmt + " v_unidad,";
                    strSqlStmt = strSqlStmt + " v_cantidad,";
                    strSqlStmt = strSqlStmt + " v_precio_unit,";
                    strSqlStmt = strSqlStmt + " v_precio_total)";
                    strSqlStmt = strSqlStmt + " Values ('"+txtCartaAviso.getText().toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sItem.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sDescripcion.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sUnidad.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sCantidad.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sPrecioU.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sPrecioT.toString()+"')";
                    // Ejecuta la Sentencia
                    if ( oConn.FnBoolQueryExecuteUpdate(strSqlStmt))
                    {
                        bResult = true;
                       // break;
                    }
                    
        
        }
        
        return bResult;
    
    }
    private boolean ActualizarDetalle(){
//        // Para los resultados
        boolean bResult = false;
        // Para la sentencia Sql
        String insert;
        String values ; 
        // Query para actualizar el Folio
       insert = "UPDATE valorizacion\n" ;
       values=" SET v_razon_cliente='"+txtRazonSocial.getText().toString()+"'";
       values+=", v_ruc_cliente='"+txtReferencia.getText().toString()+"'";
       values+=", v_direccion='"+txtDireccion.getText().toString()+"'" ;
       values+=", v_destinatatio='"+txtDestinatario.getText().toString()+"'";
       values+=", v_lugardestino='"+txtLugarDestino.getText().toString()+"'";
       values+=", v_nfactura='"+txtFactura.getText().toString()+"'" ;
       values+=", v_asunto='"+txtAsunto.getText().toString()+"'";
       values+=", v_referencia='"+txtReferencia.getText().toString()+"'";
        if (cboCondicion.getSelectedItem() == "PAGADO") {
            values += ", v_condicion='PAGADO'";
            values += ", v_fecha_cancelacion='" + FechaValorizacion.getDate() + "'";
        } else {
            values += ", v_condicion='PENDIENTE'";
        }
       values+=", v_cotizador='"+txtCotizador.getText().toString()+"'";
       values+=", v_son='"+lblImporteLetras.getText().toString()+"'" ;
       values+=", v_valor_venta='"+lblvalorventa.getText().toString()+"'";
       values+=", v_igv='"+lblIGV.getText().toString()+"'";
       values+=", v_total='"+lblTotal.getText().toString()+"'";
      
       values+=", v_banco='"+txtBanco.getText().toString()+"'" ;
       values+=", v_ncuenta='"+txtCuentaBanco.getText().toString()+"'";
       values+=", v_ncuenta_detraciones='"+txtCuentaDetracciones.getText().toString()+"'"
      + "where v_carta_aviso='"+txtCartaAviso.getText()+"' RETURNING v_carta_aviso;";
   

        if (oConn.FnBoolQueryExecute(insert +values)){
            bResult = true;
        }
        // Retorna el Valor
        return bResult;
//        
        
    }
     private boolean ActualizaContenido(){
        // Para los resultados
        boolean bResult = false;
        // Variable para las filas de la Tabla de Productos
        int iFila;
        // Variables para los diferentes datos
        String sItem, sDescripcion, sPrecioU,sPrecioT, sCantidad, sUnidad;
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        // Ciclo para grabar el detalle de la venta
        
        for(iFila = 0; iFila < tbValorizacion.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            sItem = tbValorizacion.getModel().getValueAt(iFila, 0).toString();
            sDescripcion = tbValorizacion.getModel().getValueAt(iFila, 1).toString();
            sUnidad = tbValorizacion.getModel().getValueAt(iFila, 2).toString();
            sCantidad = tbValorizacion.getModel().getValueAt(iFila, 3).toString();
            sPrecioU = tbValorizacion.getModel().getValueAt(iFila, 4).toString();
            sPrecioT = tbValorizacion.getModel().getValueAt(iFila, 5).toString();
                    // Prepara Query para grabar venta detalle
                 
                        strSqlStmt = " UPDATE valorizacion_contenido SET v_descripcion='" + sDescripcion + "'";
                        strSqlStmt += " ,v_unidad='" + sUnidad + "'";
                        strSqlStmt += " ,v_cantidad='" + sCantidad + "'";
                        strSqlStmt += " ,v_precio_unit='" + sPrecioU + "'";
                        strSqlStmt += " ,v_precio_total='" + sPrecioT + "' where v_carta_aviso='" + num + "' and v_item='" + sItem + "' ";
                        // Ejecuta la Sentencia
                        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                            bResult = true;
                            // break;
                        }
                    
        
        }
//        oFunc.SubSistemaMensajeInformacion(String.valueOf(iFila));
         filas();
          if (iFila == nume+1) {
              Quit();
             if (oFacturaContenido()) {
                 bResult = true;
                 // break;
             }
         }
         return bResult;
    
    }
  private boolean filas(){
      boolean bResult = false;
      String strSqlStmt; 
      strSqlStmt = " Select count(v_carta_aviso) AS fila from valorizacion_contenido Where v_carta_aviso ='" + num + "'";
      oConn.FnBoolQueryExecute(strSqlStmt);      
             try {
                    if (oConn.setResult.next()) {
                       nume=Integer.parseInt(oConn.setResult.getString("fila"));
                       bResult= true;
                   }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro");
                    }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Antecedentes Patologicos:" + ex.getMessage().toString());
            }
      return bResult;
      
  }
}
