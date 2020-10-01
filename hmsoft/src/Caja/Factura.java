package Caja;

import Clases.ESCPrinter;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.NumberFormat;
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
public class Factura extends javax.swing.JInternalFrame {
    //Agregando mis variables de conexcion a La DB
     clsFunciones  oFunc = new clsFunciones();
     clsConnection oConn = new clsConnection();
     DefaultTableModel modelo;
     DefaultTableModel anular;
     String[]cliente = new String[]{};
     boolean bAgruparProductos = true;
     Formatter serie;
    Formatter numero;
        
     public Factura() {
        initComponents();          
        jtFacturas.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
        jtFacturas.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/chanchito.png")));
        jtFacturas.setIconAt(2, new ImageIcon(ClassLoader.getSystemResource("imagenes/cancelar16x16.png")));
        jtFacturaAdd.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
        if(clsGlobales.sRol.equals("ROOT")){
        jtFacturas.setEnabledAt(1, true);
        jtFacturas.setEnabledAt(2, true);
        }else{
         jtFacturas.setEnabledAt(1, false);
        jtFacturas.setEnabledAt(2, false);        
        }
        txtNR.requestFocus();
        AutoJuridico();
        sbTablaFactura();
       txtOperador.setText(clsGlobales.sNomOperador); 
       AutoCompleteDecorator.decorate(this.cboServicios);
        oFunc.igv();
        IGV.setText(clsGlobales.igv);
        sbAnularFactura();
       // txtSerie.setText(String.valueOf(oFunc.nSerie()));
       //sbTablaBoleta();
       txtAnulado.setText(clsGlobales.sNomOperador); 
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
        chkNatural = new javax.swing.JCheckBox();
        chkJuridica = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        lblIngrese = new javax.swing.JLabel();
        txtNR = new javax.swing.JTextField();
        chkAsistencial = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        FechaFactura = new com.toedter.calendar.JDateChooser();
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
        btnClear = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtSerieTicket = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtOrdenServicio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNroGuia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboDescuento = new javax.swing.JComboBox();
        txtNTicket = new javax.swing.JTextField();
        jtFacturaAdd = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
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
        lblNroFactura = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        IGV = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNroFactura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        lblValorVentaAF = new javax.swing.JLabel();
        lblIGVAF = new javax.swing.JLabel();
        lblTotalAF = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbAnularFacturas = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtMotivoAnulacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtAnulado = new javax.swing.JTextField();

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
        setTitle("Corporación peruana de centros médicos \"FACTURA\"");
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
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAsistencial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngrese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNR)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(lblIngrese)
                .addComponent(chkJuridica)
                .addComponent(chkNatural)
                .addComponent(txtNR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jSeparator1)
                .addComponent(chkAsistencial))
        );

        jLabel1.setText("Dirección :");

        jLabel2.setText("Fecha :");

        jLabel3.setText("Doc. Indet :");

        jLabel4.setText("Condición :");

        cboCondicion.setEditable(true);
        cboCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CONTADO", "CREDITO" }));
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

        jLabel27.setText("Cod :");

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

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnClear.setMnemonic('l');
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel29.setText("Ingrese Número de ticket :");

        txtSerieTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieTicketActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setText("Orden de Servicio :");

        txtOrdenServicio.setText("N/A");
        txtOrdenServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenServicioActionPerformed(evt);
            }
        });

        jLabel7.setText("Nro Guia :");

        txtNroGuia.setText("N/A");
        txtNroGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroGuiaActionPerformed(evt);
            }
        });

        jLabel8.setText("Dcto:");

        cboDescuento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%" }));
        cboDescuento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDescuentoItemStateChanged(evt);
            }
        });
        cboDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDescuentoActionPerformed(evt);
            }
        });

        txtNTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboServicios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSerieTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrdenServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtSerieTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtOrdenServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtNroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(cboDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboServicios)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(txtCodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbFactura.setComponentPopupMenu(tbFac);
        tbFactura.getTableHeader().setReorderingAllowed(false);
        tbFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFacturaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbFacturaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbFactura);

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

        lblNroFactura.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblNroFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNroFactura.setText("0000 - 0000000");
        lblNroFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Nro Factura"));

        jLabel9.setText("IGV :");

        IGV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        IGV.setText("0.0%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOperador))
                    .addComponent(jtFacturaAdd)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImporteLetras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(541, 541, 541)
                        .addComponent(btnCrear)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
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
                    .addComponent(FechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(lblIGV)
                            .addComponent(jLabel9)
                            .addComponent(IGV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(jLabel51))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnCrear)))
                    .addComponent(lblNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jtFacturaAdd.getAccessibleContext().setAccessibleName("Puedes hacer Click derecho en el Item para Quitarlo");

        jtFacturas.addTab("Factura", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        jtFacturas.addTab("Facturas por Cobrar", jPanel3);

        txtNroFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroFacturaActionPerformed(evt);
            }
        });

        jLabel10.setText("Serie :");

        jLabel11.setText("Nro Factura :");

        jLabel12.setText("RUC :");

        jLabel13.setText("Razon Social :");

        txtRUC.setEditable(false);

        txtRazonSocial.setEditable(false);

        lblValorVentaAF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValorVentaAF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorVentaAF.setText("S/.00,000.00");
        lblValorVentaAF.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Valor Venta"));

        lblIGVAF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIGVAF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIGVAF.setText("S/.00,000.00");
        lblIGVAF.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "I.G.V"));

        lblTotalAF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalAF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalAF.setText("S/.00,000.00");
        lblTotalAF.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Total"));

        tbAnularFacturas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tbAnularFacturas);

        jTabbedPane1.addTab("Facturas Anuladas", jScrollPane4);

        jLabel14.setText("Motivo Anulación :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar16x16.png"))); // NOI18N
        jButton3.setText("Anular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setText("Anulado por :");

        txtAnulado.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtMotivoAnulacion)
                                    .addComponent(txtRazonSocial))
                                .addGap(31, 31, 31))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtAnulado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIGVAF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorVentaAF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalAF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 421, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtMotivoAnulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton3))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(txtAnulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblValorVentaAF)
                        .addGap(1, 1, 1)
                        .addComponent(lblIGVAF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalAF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtFacturas.addTab("Anular Facturas", jPanel4);

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
      lblNroFactura.setText(serie.toString()+" - "+ numero.toString());  
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
       if(chkAsistencial.isSelected()==true){}
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

    private void txtSerieTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieTicketActionPerformed
        txtOrdenServicio.requestFocus();
    }//GEN-LAST:event_txtSerieTicketActionPerformed

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
        Double igv = oFunc.SolAll(lblTotal.getText().toString()) -valorventa;
        lblvalorventa.setText(oFunc.convertir(valorventa));
        lblIGV.setText(oFunc.convertir(igv));
       }
       
      
    }//GEN-LAST:event_lblTotalPropertyChange

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
            sbImprimeFactura();
            Limpiar();
            Genera();
        }
        else {
               oConn.SubRollBack();
           }
        
        
       } 
    }//GEN-LAST:event_btnCrearActionPerformed

    private void tbFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFacturaMouseClicked
        
    }//GEN-LAST:event_tbFacturaMouseClicked
    private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaFactura.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    if(cboCondicion.getSelectedIndex() < 0){
        oFunc.SubSistemaMensajeError("Factura a Credito o Contado ");
        cboCondicion.requestFocusInWindow();
        bResultado = false;
    }
  
   return bResultado;
}
    private void tbFacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFacturaMousePressed
          
    
    }//GEN-LAST:event_tbFacturaMousePressed

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

    private void txtOrdenServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenServicioActionPerformed
       txtNroGuia.requestFocus();
    }//GEN-LAST:event_txtOrdenServicioActionPerformed

    private void txtNroGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroGuiaActionPerformed
       cboDescuento.requestFocus();
    }//GEN-LAST:event_txtNroGuiaActionPerformed

    private void cboDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDescuentoActionPerformed
        cboDescuento.getEditor().addActionListener(new ActionListener() {
         @Override
     public void actionPerformed(ActionEvent e) {
           
          cboServicios.requestFocus();
     }});
    }//GEN-LAST:event_cboDescuentoActionPerformed

    private void cboDescuentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDescuentoItemStateChanged
         cboServicios.requestFocus();
    }//GEN-LAST:event_cboDescuentoItemStateChanged

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        LimpiarServicios();
    }//GEN-LAST:event_btnClearActionPerformed
 private void LimpiarServicios(){
 txtCodServicio.setText(null);
 txtPrecioT.setText(null);
 txtUnidad.setText(null);
 cboDescuento.setSelectedIndex(0);
 cboServicios.setSelectedIndex(-1);
 cboServicios.requestFocusInWindow();
 
 }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          int iRow;
        if(tbFactura.getRowCount()>1){
        
        iRow = tbFactura.getSelectedRow();
        DefaultTableModel tblDatos = (DefaultTableModel) tbFactura.getModel();
        tblDatos.removeRow(iRow);           
        tbFactura.setModel(tblDatos);
        sumar();
            
        }else{
            iRow = tbFactura.getSelectedRow();
            DefaultTableModel tblDatos = (DefaultTableModel) tbFactura.getModel();
        tblDatos.removeRow(iRow);           
        tbFactura.setModel(tblDatos);
        lblvalorventa.setText("S/.00.00");
        lblIGV.setText("S/.00.00");
        lblTotal.setText("S/.00.00");
            
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNTicketActionPerformed

    private void cboCondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCondicionActionPerformed
        cboCondicion.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                txtSerieTicket.requestFocusInWindow();
            }
        });
    }//GEN-LAST:event_cboCondicionActionPerformed

    private void cboCondicionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCondicionItemStateChanged
         txtSerieTicket.requestFocusInWindow();
    }//GEN-LAST:event_cboCondicionItemStateChanged

    private void txtNroFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroFacturaActionPerformed
       String oSql="SELECT f_razon_cliente,f_ruc_cliente,f_serie,n_factura,f_valor_venta,f_igv,f_total FROM facturas WHERE f_serie ='"+txtSerie.getText().toString() +"' and n_factura ='"+txtNroFactura.getText().toString()+"'";
       oFunc.SubSistemaMensajeInformacion(oSql);   
       oConn.FnBoolQueryExecute(oSql);
        try {
            if(oConn.setResult.next()){
                txtRUC.setText(oConn.setResult.getString("f_ruc_cliente"));
                txtRazonSocial.setText(oConn.setResult.getString("f_razon_cliente"));
                lblValorVentaAF.setText(oConn.setResult.getString("f_valor_venta"));
                lblIGVAF.setText(oConn.setResult.getString("f_igv"));
                lblTotalAF.setText(oConn.setResult.getString("f_total"));
                
            }
        } catch (Exception e) {
        }
  
    }//GEN-LAST:event_txtNroFacturaActionPerformed

    private void jtFacturasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtFacturasStateChanged
        
    }//GEN-LAST:event_jtFacturasStateChanged

    private void chkAsistencialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAsistencialMouseClicked
//        CargarServicios();
//        lblIngrese.setText("Nombre :");
//        txtNR.requestFocus();
    }//GEN-LAST:event_chkAsistencialMouseClicked

    private void chkAsistencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsistencialActionPerformed
        AutoAsistencial();
    }//GEN-LAST:event_chkAsistencialActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (bAgruparProductos) {

            sbServicioAgrega();

        } else {
           ;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
 private void cboServicios(){
      if(cboServicios.getSelectedIndex() >= 0){
               String Consulta;
               Consulta = "SELECT cod_servicio, precio,unidad FROM servicios_generales WHERE descripcion  ='"+cboServicios.getSelectedItem().toString().concat("'")  ;
               oConn.FnBoolQueryExecute(Consulta);
               try 
                {
                 if (oConn.setResult.next())
                 {       
                       //  LimpiarServicios();    
                         txtCodServicio.setText(oConn.setResult.getString("cod_servicio"));           
                         txtPrecioT.setText(oConn.setResult.getString("precio"));  
                         txtUnidad.setText(oConn.setResult.getString("unidad"));  
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
  if(chkAsistencial.isSelected()== true )//&& txtNR.getText().isEmpty() || chkJuridica.isSelected()==true )
        {lblIngrese.setText("Nombre :");
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
                txtSerieTicket.requestFocus();
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
                txtSerieTicket.requestFocus();
                oConn.setResult.close();

            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Boleta de venta:" + ex.getMessage().toString());
        }
 }
 void asistencial(){
 String Sql ="select cod_pa,direccion_pa from datos_paciente_asistencial where nombres_pa= '" +txtNR.getText().toString()+"'";
    oConn.FnBoolQueryExecute(Sql);
          try {
            if (oConn.setResult.next()) {
                txtDireccion.setText(oConn.setResult.getString(2)); 
                txtDoc.setText(oConn.setResult.getString(1));                              
              CargarServicios();
                Fecha();
                txtSerieTicket.requestFocus();
                oConn.setResult.close();

            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Boleta de venta:" + ex.getMessage().toString());
        }
 }
 void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaFactura.setDate(fechaDate);
}
   private void CargarServicios(){
    String Consulta;
    cboServicios.removeAllItems();
    Consulta = "select descripcion from servicios_generales \n" 
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
    private com.toedter.calendar.JDateChooser FechaFactura;
    private javax.swing.JLabel IGV;
    private javax.swing.ButtonGroup btBoleta;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCrear;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox cboCondicion;
    private javax.swing.JComboBox cboDescuento;
    private javax.swing.JComboBox cboServicios;
    private javax.swing.JCheckBox chkAsistencial;
    private javax.swing.JCheckBox chkJuridica;
    private javax.swing.JCheckBox chkNatural;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTabbedPane jtFacturaAdd;
    private javax.swing.JTabbedPane jtFacturas;
    private javax.swing.JLabel lblIGV;
    private javax.swing.JLabel lblIGVAF;
    private javax.swing.JLabel lblImporteLetras;
    private javax.swing.JLabel lblIngrese;
    private javax.swing.JLabel lblNroFactura;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalAF;
    private javax.swing.JLabel lblValorVentaAF;
    private javax.swing.JLabel lblvalorventa;
    private javax.swing.JTable tbAnularFacturas;
    private javax.swing.JPopupMenu tbFac;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTextField txtAnulado;
    private javax.swing.JTextField txtCodServicio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtMotivoAnulacion;
    private javax.swing.JTextField txtNR;
    private javax.swing.JTextField txtNTicket;
    private javax.swing.JTextField txtNroFactura;
    private javax.swing.JTextField txtNroGuia;
    private javax.swing.JTextField txtOperador;
    private javax.swing.JTextField txtOrdenServicio;
    private javax.swing.JTextField txtPrecioT;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtSerieTicket;
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
                  if(columnIndex==1) {
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
        modelo.addColumn("Cod");
        modelo.addColumn("Cant");
        modelo.addColumn("Unidad");
        modelo.addColumn("Descripción");
        modelo.addColumn("P.Unitario");
        modelo.addColumn("Dscto");
        modelo.addColumn("Total");
                
        // Coloca el Modelo en la Tabla
        tbFactura.setModel(modelo);
        
        // Directamente
        tbFactura.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbFactura.getColumnModel().getColumn(1).setPreferredWidth(10);
        tbFactura.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbFactura.getColumnModel().getColumn(3).setPreferredWidth(260);
        tbFactura.getColumnModel().getColumn(4).setPreferredWidth(15);
        tbFactura.getColumnModel().getColumn(5).setPreferredWidth(5);
        tbFactura.getColumnModel().getColumn(6).setPreferredWidth(35);
        tbFactura.getTableHeader().setReorderingAllowed(false);
        tbFactura.getTableHeader().setResizingAllowed(false);

       // tbBoleta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbFactura.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbFactura.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);        
        tbFactura.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        tbFactura.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
        tbFactura.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
        tbFactura.getColumnModel().getColumn(6).setCellRenderer(cellAlinear);
   
        
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
        String sDscto;
        String sPrecio;
        String sCantidad;

        boolean bResult=false;
        int iProductos ;
     
        // if(value.lastIndexOf(cboServicios.getSelectedItem().toString())>=0)
        sDato = txtCodServicio.getText().toString();
        sDscto = cboDescuento.getSelectedItem().toString();
        if (!sDato.isEmpty())
        {            

            // Ciclo para buscar en la Venta
            for(fil = 0; fil < tbFactura.getRowCount();fil++)
            {
                //Obtiene dato contenido en una celda de la tabla
                String value = (String)tbFactura.getValueAt(fil, 0);
                String des = (String)tbFactura.getValueAt(fil, 5);

                // lo pasa a Mayúsculas
                value = value.toUpperCase();
                des = des.toUpperCase();
                // verifico si encuentra el dato
                if(value.lastIndexOf(sDato)>=0 && des.lastIndexOf(sDscto)>=0 )
                {
                    sCantidad = tbFactura.getModel().getValueAt(fil,1).toString();
                    sPrecio = tbFactura.getModel().getValueAt(fil,4).toString();                                   
                
                iProductos = Integer.valueOf(sCantidad) + 1;
                tbFactura.getModel().setValueAt(iProductos,fil, 1);  
               // oFunc.SubSistemaMensajeInformacion(sPrecio);
               Double Total = (iProductos * oFunc.Sol(sPrecio)-(iProductos * oFunc.Sol(sPrecio))* oFunc.num(cboDescuento));
             // oFunc.SubSistemaMensajeInformacion(String.valueOf(Total));
                                    
                tbFactura.getModel().setValueAt(oFunc.convertir(Total), fil,6);
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
    if(tbFactura.getRowCount()>=0){
       
        double total = 0;
		double subtotal;
		for (int i = 0; i < modelo.getRowCount(); i++) {
                        String sCantidad = tbFactura.getModel().getValueAt(i,1).toString();
                        String sPrecio = tbFactura.getModel().getValueAt(i,4).toString();
                        String sDscto = tbFactura.getModel().getValueAt(i,5).toString();
                        NumberFormat money = NumberFormat.getCurrencyInstance();
                        Double Total = ((Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio))-(Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio))*oFunc.numtext(sDscto));
                        tbFactura.getModel().setValueAt(oFunc.convertir(Total), i,6);
                        subtotal = Double.valueOf(oFunc.Soles(modelo.getValueAt(i, 6).toString()));
                        
			total += subtotal;
		}
                   lblTotal.setText(oFunc.convertir(total));
     //   }
    
   }
}
public void sbServicioAgrega()
    {

        double decPrecio;

        // Variable para el modelo de la tabla
        DefaultTableModel tblDatos = (DefaultTableModel) tbFactura.getModel();

        // Prepara los datos vacios iniciales
        Object [] oFila = new Object[7];
        
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
                        oFila[0]=oConn.setResult.getString("cod_servicio");
                        oFila[1]="1";
                        oFila[2]=oConn.setResult.getString("unidad");
                        oFila[3]=oConn.setResult.getString("descripcion");
                        oFila[4]=oFunc.convertir(Double.valueOf(oConn.setResult.getString("precio")));
                        oFila[5]= cboDescuento.getSelectedItem().toString();
                        
                        
                        decPrecio = oConn.setResult.getDouble("precio");
                      //  Double Total = (iProductos * oFunc.Sol(sPrecio)-(iProductos * oFunc.Sol(sPrecio))* oFunc.num(cboDescuento));
                        Double Total = (decPrecio -(decPrecio * oFunc.num(cboDescuento))); 
                        oFila[6]= oFunc.convertir(Total);
                        tblDatos.insertRow(0, oFila);                       

                        tbFactura.setModel(tblDatos);
                        
                       
                                
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
    private void Limpiar(){
    txtNR.setText(null);
    txtDireccion.setText(null);
    txtDoc.setText(null);
    txtSerieTicket.setText(null);
    txtOrdenServicio.setText(null);
    txtNroGuia.setText(null);
    cboCondicion.setSelectedIndex(-1);
    cboDescuento.setSelectedIndex(0);
    cboServicios.removeAllItems();
    txtCodServicio.setText(null);
    txtPrecioT.setText(null);
    txtUnidad.setText(null);
    lblvalorventa.setText("S/.00.00");
    lblIGV.setText("S/.00.00");
    lblTotal.setText("S/.00.00");
    txtNR.requestFocus();
    sbTablaFactura();
    Genera();
    }


     void sbImprimeFactura()
    {
        if(tbFactura.getRowCount()>=0){
        int iFila;
        SimpleDateFormat formato = new SimpleDateFormat("dd / MM / yyyy");
        SimpleDateFormat FechaCancelacion = new SimpleDateFormat("dd        MM             yy");
              ESCPrinter escp = new ESCPrinter("\\\\CAJA\\epson", false); //create ESCPrinter on network location \\computer\sharename, 9pin printer
        if (escp.initialize()) {
            escp.setCharacterSet(ESCPrinter.USA);
            escp.select15CPI();//15 characters per inch printing
            //NroFactura
            escp.advanceVertical(5);
            escp.setAbsoluteHorizontalPosition(8);
            escp.horizontalTab(9);
            escp.print("");
            escp.print(lblNroFactura.getText());
            //
            escp.advanceVertical(5); //go down 5cm
            escp.setAbsoluteHorizontalPosition(9); 
            //escp.bold(true);
            escp.print(txtNR.getText().toString());
            //escp.bold(false);
            escp.advanceVertical2(1);
            escp.setAbsoluteHorizontalPosition(9); 
            escp.print(txtDireccion.getText().toString());
            //Ruc
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(7); 
            escp.horizontalTab(10);
            escp.print(txtDoc.getText().toString());
            //Orden de Compra
            escp.advanceVertical2(3);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.print(txtOrdenServicio.getText().toString());
           //Condiciones
            escp.advanceVertical2(0);
            escp.setAbsoluteHorizontalPosition(13); 
            escp.print(cboCondicion.getSelectedItem().toString());
            //Nro Guia
            escp.advanceVertical2(0);
            escp.setAbsoluteHorizontalPosition(13);
            escp.horizontalTab(4);
            escp.print(txtNroGuia.getText().toString());
              //Vendedor
            escp.advanceVertical2(0);
            escp.setAbsoluteHorizontalPosition(14);
            escp.horizontalTab(8);
            escp.print("  ---");  
               //Fecha
            escp.advanceVertical2(0);
            escp.setAbsoluteHorizontalPosition(14);
            escp.horizontalTab(10);
            escp.print(formato.format(FechaFactura.getDate()));
            escp.advanceVertical(3);
            for(iFila = 0; iFila < tbFactura.getRowCount();iFila++)
        {   
            //Codigo
            escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(3); 
            escp.print(tbFactura.getValueAt(iFila, 0).toString());
            //Cantidad
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(7);
            escp.print(" "+tbFactura.getValueAt(iFila, 1).toString());
            //Unidad
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(2);
            escp.print(tbFactura.getValueAt(iFila, 2).toString());
            //Descripción
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(3);
            escp.print("  "+tbFactura.getValueAt(iFila, 3).toString());
            //Precio Unitario
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(10);
            escp.print("   "+oFunc.SolImp(tbFactura.getValueAt(iFila, 4).toString()));
            //Precio Dscto
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(11);
            escp.print("      "+tbFactura.getValueAt(iFila, 5).toString());
            //Precio Total
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(12);
            escp.print("    "+oFunc.SolImp(tbFactura.getValueAt(iFila, 6).toString()));
                            
        }   
            switch (tbFactura.getRowCount()) {
            case 1: escp.advanceVertical(15); break;
            case 2: escp.advanceVertical(14); break;
            case 3: escp.advanceVertical(13); break;
            case 4: escp.advanceVertical(12); break;   
            case 5: escp.advanceVertical(11); break;
            case 6: escp.advanceVertical(10); break;
            case 7: escp.advanceVertical(9); break;
            case 8: escp.advanceVertical(8); break;
            case 9: escp.advanceVertical(7); break;
            case 10: escp.advanceVertical(6); break;
            case 11: escp.advanceVertical(5); break;
            case 12: escp.advanceVertical(4); break;
            case 13: escp.advanceVertical(3); break;
            case 14: escp.advanceVertical(2); break;
            case 15: escp.advanceVertical(1); break;
            //case 16: escp.advanceVertical(1); break;
            
         }
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(3);
            escp.print("Caja: "+txtOperador.getText());
            //Importe en letras
            escp.advanceVertical2(2);
            escp.setAbsoluteHorizontalPosition(5);
            escp.print(lblImporteLetras.getText());
            //TOTAL
            escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(12);
            escp.print(" "+lblTotal.getText());
            //IGV
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(10);
            escp.print(" "+lblIGV.getText());
            //VALOR VENTA
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(8);
            escp.print(" "+lblvalorventa.getText());
            //IGV ACTUAL
            escp.advanceVertical(2);
            escp.setAbsoluteHorizontalPosition(4);
            escp.horizontalTab(10);
            escp.print("IGV: "+IGV.getText());
            
            if(cboCondicion.getSelectedItem()== "CONTADO"){
                escp.advanceVertical(1);
                escp.setAbsoluteHorizontalPosition(4);
                escp.horizontalTab(4);
                escp.print(FechaCancelacion.format(FechaFactura.getDate()));
            }
            escp.formFeed(); //eject paper
            escp.close(); //close stream
            
        }
        else {
                System.out.println("No se ha podido abrir la secuencia para impresora");
            }
    }
    else{
    oFunc.SubSistemaMensajeError("No se puede Crear Factura no hay Servicio Agregado");
        }      
    }

  private boolean oFacturaDetalle()
    {
        
        // Para los resultados
        boolean bResult = false;
                
        // Para la sentencia Sql
        String insert;
        String values; 
        
        // Query para actualizar el Folio
        insert = "INSERT INTO facturas(f_razon_cliente, f_ruc_cliente, f_direccion,f_condicion,f_vendedor,f_fecha_emision,f_son,f_valor_venta, f_igv, f_total, f_serie, n_factura";
         values = "VALUES ('"+txtNR.getText().toString()+"','"+txtDoc.getText().toString()+"','"+txtDireccion.getText().toString()+"','"+cboCondicion.getSelectedItem()+
                        "','"+txtOperador.getText().toString()+"','"+FechaFactura.getDate()+"','"+lblImporteLetras.getText().toString()+"','"+lblvalorventa.getText().toString()+"','"+lblIGV.getText().toString()+"','"+lblTotal.getText().toString()+"','"+serie.toString()+"','"+numero.toString()+"'";       
                
             if(!txtOrdenServicio.getText().isEmpty()){
             insert += " ,f_orden_atencion";
             values +=",'"+txtOrdenServicio.getText().toString()+"'";
             }
             if(!txtNroGuia.getText().isEmpty()){
             insert += " ,f_nro_guia";
             values +=",'"+txtNroGuia.getText().toString()+"'";
             }
             
             if(cboCondicion.getSelectedItem() == "CONTADO"){ 
             insert += ", f_estado";
              values +=",'PAGADO'";
              insert+= ",f_fecha_cancelacion ";
               values +=",'"+FechaFactura.getDate()+"'";
             }else{
              insert += ", f_estado";
              values +=",'POR PAGAR'";
             
             }
              
              
        // Ejecuta la Sentencia
           Genera();
        if (oConn.FnBoolQueryExecuteUpdate(insert.concat(" )") +values.concat(" )"))){
            bResult = true;
        }
        // Retorna el Valor
        return bResult;
        
        
    }
       private boolean oFacturaContenido()
    {
        // Para los resultados
        boolean bResult = false;
        
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String sCodigo, sDescripcion, sPrecioU,sPrecioT,sDescuento, sCantidad, sUnidad;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbFactura.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            sCodigo = tbFactura.getModel().getValueAt(iFila, 0).toString();
            sCantidad = tbFactura.getModel().getValueAt(iFila, 1).toString();
            sUnidad = tbFactura.getModel().getValueAt(iFila, 2).toString();
            sDescripcion = tbFactura.getModel().getValueAt(iFila, 3).toString();
            sPrecioU = tbFactura.getModel().getValueAt(iFila, 4).toString();
            sDescuento = tbFactura.getModel().getValueAt(iFila, 5).toString();
            sPrecioT = tbFactura.getModel().getValueAt(iFila, 6).toString();
           
        
                    // Prepara Query para grabar venta detalle
                    strSqlStmt = " INSERT INTO facturas_contenido";
                    strSqlStmt = strSqlStmt + "(f_cod,";
                    strSqlStmt = strSqlStmt + " f_cantidad,";
                    strSqlStmt = strSqlStmt + " f_unidad,";
                    strSqlStmt = strSqlStmt + " f_descripcion,";
                    strSqlStmt = strSqlStmt + " f_precio_unit,";
                    strSqlStmt = strSqlStmt + " f_descuento,";
                    strSqlStmt = strSqlStmt + " f_precio_total,";
                    strSqlStmt = strSqlStmt + " f_serie,";
                    strSqlStmt = strSqlStmt + " n_factura)";
                    strSqlStmt = strSqlStmt + " Values (";
                    strSqlStmt = strSqlStmt + "'"+sCodigo.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sCantidad.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sUnidad.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sDescripcion.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sPrecioU.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sDescuento.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sPrecioT.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+serie.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+numero.toString()+"')";
                    
                    // Ejecuta la Sentencia
                    if ( oConn.FnBoolQueryExecuteUpdate(strSqlStmt))
                    {
                        bResult = true;
                       // break;
                    }
                    
        
        
        }
        return bResult;
    }
private void sbAnularFactura()
    {
        // Declaro un modelo de datos
        anular = new DefaultTableModel(){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
                  if(columnIndex==1) {
                  return true;
              }
            else {
                  return false;
              }
                  
        
    }   
              
        };
                
        // Añadimos columnas al modelo de datos
        anular.addColumn("Nro Factura");
        anular.addColumn("RUC");
        anular.addColumn("Empresa");
        anular.addColumn("P. Total");
               
        // Coloca el Modelo en la Tabla
        tbAnularFacturas.setModel(anular);
        
        // Directamente
        tbAnularFacturas.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbAnularFacturas.getColumnModel().getColumn(1).setPreferredWidth(10);
        tbAnularFacturas.getColumnModel().getColumn(2).setPreferredWidth(260);
        tbAnularFacturas.getColumnModel().getColumn(3).setPreferredWidth(10);
        tbAnularFacturas.getTableHeader().setReorderingAllowed(false);
        tbAnularFacturas.getTableHeader().setResizingAllowed(false);

       // tbBoleta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbFactura.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbFactura.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);        
        tbFactura.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        tbFactura.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
        tbFactura.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
        tbFactura.getColumnModel().getColumn(6).setCellRenderer(cellAlinear);
   
        
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
   //     tbBoleta.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 9)); 
   
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }       
}
