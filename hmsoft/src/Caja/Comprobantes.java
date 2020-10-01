/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Caja;
import Clases.ESCPrinter;
import Clases.GestorTime;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import autocomplete.ajTextFieldConsulta;
import autocomplete.ajTextFieldInteger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import sistema.CertificacionMedicaTrabajoAltura;
import sistema.Odontograma;
public final class Comprobantes extends javax.swing.JInternalFrame {
     // Constantes para las Columnas JTTICKET
    static final int INT_COL_CANTIDAD = 0;
    static final int INT_COL_CODIGO = 1;
    static final int INT_COL_DESCRIPCION = 2;
    static final int INT_COL_UNITARIO = 3;
    static final int INT_COL_TOTAL = 4;
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    public static BuscarCliente buscarCliente;
    boolean bAgruparProductos = true;
    DefaultTableModel ticket;
    String hcl;
    String operador;
    Formatter serie;
    Formatter numero;
 
   public Comprobantes() {
       super();
      initComponents();      
       jtcomprobantes.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
       if(cbreferido.isSelected()){
       txtreferido.setVisible(true);
       btnBuscarReferidoT.setVisible(true);
       }else{txtreferido.setVisible(false);btnBuscarReferidoT.setVisible(false);
       }
       cboServicios.setSelectedIndex(-1);
        fecha();
       AutoCompleteDecorator.decorate(this.cboServicios);
       AutoCompleteDecorator.decorate(this.cboTipoVenta);
       timer.start();
       txtOperador.setText(clsGlobales.sNomOperador); 
//       new ajTextFieldInteger.autocompleterText(txtCodPaciente, "cod_pa", "datos_paciente");
//       new ajTextFieldConsulta.autocompleterText(txtNombre,"select nombres_pa||' '||apellidos_pa as nombre FROM datos_paciente WHERE CONCAT(nombres_pa,' ',apellidos_pa)");
       new ajTextFieldConsulta.autocompleterText(txtDoctor,"select nombre_user||' '||apellido_user as nombre FROM usuarios WHERE CONCAT(nombre_user,' ',apellido_user)");
       habilitar(false); 
         sbTicket();
         Genera();
         ControlNumeracion();
         CargarId();
         desabilitar(false);
   }
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private void Genera(){
     serie = oFunc.tSerie("s_n_ticket", "s_ticket");
      oFunc.tSerieGlobal("s_n_ticket", "s_ticket");
      numero = oFunc.nFacturas("ticket", "n_ticket","s_ticket",serie.toString());
      txtNroTicket.setText(serie.toString()+" - "+ numero.toString());  
    }      
    public void MostrarBuscarCliente(){
       buscarCliente = new BuscarCliente(this, true);
       buscarCliente.setVisible(true); 
   }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgBoleta = new javax.swing.ButtonGroup();
        bgFactura = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pmTicket = new javax.swing.JPopupMenu();
        btnEliminar = new javax.swing.JMenuItem();
        jtcomprobantes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtCodPaciente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtFechaT = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtHoraT = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cboTipoVenta = new javax.swing.JComboBox();
        cbreferido = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtreferido = new javax.swing.JTextField();
        btnBuscarReferidoT = new javax.swing.JButton();
        btnAddUsuario = new javax.swing.JButton();
        chkAsistencial = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        cboEstadoCivil = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cboSexo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtNumHcl = new javax.swing.JLabel();
        txtOperador = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        FechaNac = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cboServicios = new javax.swing.JComboBox();
        txtCodServicio = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPrecioT = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        cboDescuento = new javax.swing.JComboBox();
        txtNroTicket = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTicket = new javax.swing.JTable();
        btnImprimirTicket = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnImprimirFicha = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtdescuento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        Fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        btnReporteFechas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fecha3 = new com.toedter.calendar.JDateChooser();
        Fecha4 = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();

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
        pmTicket.add(btnEliminar);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setClosable(true);
        setTitle("Seleccione Tipo Comprobante");
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

        jtcomprobantes.setBackground(new java.awt.Color(204, 204, 255));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos para Boleta"));

        jLabel18.setText("Cod./ DNI:");

        txtCodPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPacienteActionPerformed(evt);
            }
        });
        txtCodPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodPacienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodPacienteKeyTyped(evt);
            }
        });

        jLabel22.setText("Fecha:");

        txtFechaT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFechaT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFechaT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel24.setText("Hora:");

        txtHoraT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHoraT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtHoraT.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel33.setText("Tipo Venta:");

        cboTipoVenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CONTADO", "CREDITO", "TARJETA DEBITO", "TARJETA CREDITO" }));
        cboTipoVenta.setSelectedIndex(-1);
        cboTipoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoVentaActionPerformed(evt);
            }
        });

        cbreferido.setText("Es referido:");
        cbreferido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbreferidoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel19.setText("Nombres:");

        btnBuscarReferidoT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnBuscarReferidoT.setToolTipText("Agregar Referidor");
        btnBuscarReferidoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReferidoTActionPerformed(evt);
            }
        });

        btnAddUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnAddUsuario.setToolTipText("Agregar Referidor");
        btnAddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUsuarioActionPerformed(evt);
            }
        });

        chkAsistencial.setSelected(true);
        chkAsistencial.setText("Asistencial");
        chkAsistencial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkAsistencialMouseClicked(evt);
            }
        });

        jLabel6.setText("Direccion:");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado Civil:");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        cboEstadoCivil.setEditable(true);
        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO", "CONVIVIENTE" }));
        cboEstadoCivil.setSelectedIndex(-1);
        cboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoCivilActionPerformed(evt);
            }
        });

        jLabel8.setText("Edad:");

        jLabel9.setText("Telefono:");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        cboSexo.setEditable(true);
        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        cboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoActionPerformed(evt);
            }
        });

        jLabel10.setText("Sexo:");

        txtNumHcl.setBackground(new java.awt.Color(255, 255, 204));

        txtOperador.setEditable(false);

        jLabel12.setText("Apellidos:");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel23.setText("Fecha:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel19))
                            .addComponent(chkAsistencial))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(1, 1, 1)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(btnAddUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel22)
                                .addGap(1, 1, 1)
                                .addComponent(txtFechaT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel24)
                                .addGap(2, 2, 2)
                                .addComponent(txtHoraT, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtNumHcl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOperador))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(2, 2, 2)
                                .addComponent(cboTipoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(cbreferido)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8))
                            .addComponent(txtreferido))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(2, 2, 2)
                                .addComponent(txtTelefono))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnBuscarReferidoT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(2, 2, 2))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAsistencial, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumHcl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel19)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(txtFechaT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(txtHoraT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbreferido)
                    .addComponent(txtreferido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboTipoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33))
                    .addComponent(btnBuscarReferidoT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jButton1)))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23)
                    .addComponent(FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

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

        jLabel27.setText("Cod. Servicio:");

        jLabel28.setText("Precio:");

        txtPrecioT.setEditable(false);

        jLabel30.setText("Doctor :");

        txtDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregar.setMnemonic('a');
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel32.setText("Descuento :");

        cboDescuento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%" }));

        txtNroTicket.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNroTicket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNroTicket.setText("0000 - 0000000");
        txtNroTicket.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nro Ticket"));

        jLabel29.setText("Unidad :");

        txtUnidad.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboServicios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDoctor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNroTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNroTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(cboServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtCodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(cboDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTicket.setComponentPopupMenu(pmTicket);
        jScrollPane2.setViewportView(tbTicket);

        btnImprimirTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnImprimirTicket.setText("Imprimir Ticket");
        btnImprimirTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirTicketActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnCancelar.setText("Limpiar / Nuevo");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel31.setText("Total:");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 51, 0));
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotal.setText("S/.00.00");
        txtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnImprimirFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnImprimirFicha.setText("Imprimir Ficha");
        btnImprimirFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirFichaActionPerformed(evt);
            }
        });

        jLabel11.setText("Descuento:");

        txtdescuento.setText("S/.00.00");
        txtdescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnImprimirFicha)
                                .addGap(26, 26, 26)
                                .addComponent(btnImprimirTicket)
                                .addGap(10, 10, 10)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel31)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtdescuento)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnImprimirTicket)
                        .addComponent(btnImprimirFicha))
                    .addComponent(btnCancelar)
                    .addComponent(jLabel11)
                    .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal)
                    .addComponent(jLabel31))
                .addGap(22, 22, 22))
        );

        txtdescuento.getAccessibleContext().setAccessibleName("S/.00.00");

        jtcomprobantes.addTab("Ticket(F1)", jPanel1);

        jLabel1.setText("Desde :");

        jLabel2.setText("Hasta :");

        btnReporteFechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        btnReporteFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteFechasActionPerformed(evt);
            }
        });

        jLabel3.setText("Reporte General por Fechas");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N

        jLabel4.setText("Hasta :");

        jLabel5.setText("Reporte por Doctor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporteFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnReporteFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );

        jtcomprobantes.addTab("Reportes", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtcomprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtcomprobantes, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnImprimirTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirTicketActionPerformed
        boolean bCommit=false;
       if(ControlNumeracion()){
          Genera(); 
        if(validar()){ 
        // Inicia la transacción colocando el commit a false
        oConn.SubAutoCommit(false);
        // Intenta ejecutar cada uno de los procesos
        if (oTicketDetalle()) {
               if (oTicketContenido()) {
                  bCommit = true;
              }
           }
        // Verifica si debe hacer commit
        if (bCommit)
        {
            // Realiza la confirmación de la transaccion
            oConn.SubCommit();
            sbImprimeTicket();
            //Limpiar();
            btnImprimirFicha.setEnabled(bCommit);
            Genera();
        }
        else {
               oConn.SubRollBack();
           }
       }
       }
    }//GEN-LAST:event_btnImprimirTicketActionPerformed
  private boolean ControlNumeracion(){
   boolean bResult = true;
   if(Integer.valueOf(numero.toString()) > clsGlobales.tHasta ){
       oFunc.SubSistemaMensajeError("Debe Configurar Nueva Numeración");               
       bResult = false;
   }
   
   return bResult;
  }
    private boolean oTicketDetalle()
    {
        
        // Para los resultados
        boolean bResult = false;
                
        // Para la sentencia Sql
        String insert;
        String values; 
        
        // Query para actualizar el Folio
        insert = "INSERT INTO ticket(f_ticket, h_ticket, cod_pa,nom_medico,total ,s_ticket,n_ticket,descuento,operador)";
         values = "VALUES ('"+txtFechaT.getText().toString()+"','"+txtHoraT.getText().toString()+"','"
                 +txtCodPaciente.getText().toString()+"','"+txtDoctor.getText().toString()+"','"
                 +txtTotal.getText().toString()+"','"+serie.toString()+"','"+numero.toString()+"','"
                 +txtdescuento.getText().toString()+"','"+txtOperador.getText().toString()+"')";                             
                
             
        if (oConn.FnBoolQueryExecuteUpdate(insert + values)){
            bResult = true;
        }
        // Retorna el Valor
        return bResult;
        
        
    }
       private boolean oTicketContenido()
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
        for(iFila = 0; iFila < tbTicket.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            sCodigo = tbTicket.getModel().getValueAt(iFila, 0).toString();
            sCantidad = tbTicket.getModel().getValueAt(iFila, 1).toString();
            sUnidad = tbTicket.getModel().getValueAt(iFila, 2).toString();
            sDescripcion = tbTicket.getModel().getValueAt(iFila, 3).toString();
            sPrecioU = tbTicket.getModel().getValueAt(iFila, 4).toString();
            sDescuento = tbTicket.getModel().getValueAt(iFila, 5).toString();
            sPrecioT = tbTicket.getModel().getValueAt(iFila, 6).toString();
                    // Prepara Query para grabar venta detalle
                    strSqlStmt = " INSERT INTO ticket_contenido";
                    strSqlStmt = strSqlStmt + "(p_cod,";
                    strSqlStmt = strSqlStmt + " p_cantidad,";
                    strSqlStmt = strSqlStmt + " p_unidad,";
                    strSqlStmt = strSqlStmt + " p_descripcion,";
                    strSqlStmt = strSqlStmt + " p_unitario,";
                    strSqlStmt = strSqlStmt + " p_des,";
                    strSqlStmt = strSqlStmt + " p_total,";
                    strSqlStmt = strSqlStmt + " s_ticket,";
                    strSqlStmt = strSqlStmt + " n_ticket)";
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
private boolean validar(){
boolean bResultado=true;
    if (txtNombre.getText().isEmpty()) {
        oFunc.SubSistemaMensajeError("Ingrese Nombre");
        bResultado = false;
    }

    if(txtCodPaciente.getText().isEmpty()){
        oFunc.SubSistemaMensajeError("Ingrese DNI");
        
        bResultado = false;
    }
  
   return bResultado;
}
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       if (bAgruparProductos) {
            if (!ServicioExiste()) {
                sbServicioAgrega();
                sumar();
                LimpiarServicios();
            }
        } else {
            sbServicioAgrega();
            sumar();
            LimpiarServicios();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cboServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServiciosActionPerformed
        cboServicios.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(cboServicios.getSelectedIndex() >= 0){
                pServicios();
                if(txtDoctor.getText().isEmpty()){
                 txtDoctor.requestFocus();
                }else{btnAgregar.requestFocusInWindow();}
              }
            }});

    }//GEN-LAST:event_cboServiciosActionPerformed

    private void cbreferidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbreferidoActionPerformed
        if(cbreferido.isSelected()){
            txtreferido.setVisible(true);
            btnBuscarReferidoT.setVisible(true);
        }else{txtreferido.setVisible(false);btnBuscarReferidoT.setVisible(false);
        }
    }//GEN-LAST:event_cbreferidoActionPerformed

    private void txtCodPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodPacienteKeyReleased
        if (!chkAsistencial.isSelected()) {
            if (evt.getKeyCode() == 112) // F1 = 112
            {
                MostrarBuscarCliente();
            }
        }
    }//GEN-LAST:event_txtCodPacienteKeyReleased

    private void txtCodPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPacienteActionPerformed
         
        if(chkAsistencial.isSelected()){
            habilitar(true);
             bID1(txtCodPaciente);
             desabilitar(true);
//              txtNombre.requestFocus();
        }else {
            if (!txtCodPaciente.getText().isEmpty()) {
                bID(txtCodPaciente);
                cboTipoVenta.requestFocusInWindow();
                desabilitar(false);
                btnImprimirFicha.setEnabled(true);
            } else {
                txtNombre.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCodPacienteActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       if(!chkAsistencial.isSelected()){
        if(!txtNombre.getText().isEmpty()){
            bNombre(txtNombre);
            cboTipoVenta.requestFocusInWindow();
        }else{
            txtCodPaciente.requestFocus();
        }
       }else{
           
           cboTipoVenta.requestFocusInWindow();
       }
       
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cboTipoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoVentaActionPerformed
        cboTipoVenta.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cboSexo.requestFocusInWindow();
            }});
    }//GEN-LAST:event_cboTipoVentaActionPerformed

    private void txtDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorActionPerformed
        btnAgregar.requestFocusInWindow();
        
    }//GEN-LAST:event_txtDoctorActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
          txtCodPaciente.requestFocusInWindow();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int iRow;
        if(tbTicket.getSelectedRow()>= 0){
        if(tbTicket.getRowCount()>1){

            iRow = tbTicket.getSelectedRow();
            DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
            tblDatos.removeRow(iRow);
            tbTicket.setModel(tblDatos);
            sumar();

        }else{
            iRow = tbTicket.getSelectedRow();
            DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
            tblDatos.removeRow(iRow);
            tbTicket.setModel(tblDatos);
            txtTotal.setText("S/.00.00");

        }
        }else{
        oFunc.SubSistemaMensajeError("Seleccione un Item");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboServiciosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboServiciosPopupMenuWillBecomeInvisible
         pServicios();
                if(txtDoctor.getText().isEmpty()){
                 txtDoctor.requestFocus();
                }else{btnAgregar.requestFocusInWindow();}
    }//GEN-LAST:event_cboServiciosPopupMenuWillBecomeInvisible

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       Limpiar();
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodPacienteKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtCodPacienteKeyTyped

    private void btnReporteFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteFechasActionPerformed
        
            ReporteFechas(Fecha1.getDate(), Fecha2.getDate());
       
    }//GEN-LAST:event_btnReporteFechasActionPerformed

    private void chkAsistencialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAsistencialMouseClicked
//        habilitar(true);
        CargarServicios();
    }//GEN-LAST:event_chkAsistencialMouseClicked

    private void cboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoCivilActionPerformed
        // txtTelefonoCasa.requestFocus();
        cboEstadoCivil.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //                 departamentos();
               txtEdad.requestFocus();
            }
        });
    }//GEN-LAST:event_cboEstadoCivilActionPerformed

    private void btnAddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddUsuarioActionPerformed

    private void btnBuscarReferidoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReferidoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarReferidoTActionPerformed

    private void btnImprimirFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirFichaActionPerformed
            grabarAsistencial();
            Limpiar();
    }//GEN-LAST:event_btnImprimirFichaActionPerformed

    private void cboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoActionPerformed
        cboSexo.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtDireccion.requestFocus();
            }
        });
    }//GEN-LAST:event_cboSexoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
       cboEstadoCivil.requestFocusInWindow();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        txtTelefono.requestFocus();
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        cboServicios.requestFocusInWindow();
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
//        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtdescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescuentoActionPerformed
        String tota = txtTotal.getText().toString();
        double total=(Double.valueOf(oFunc.Soles(tota)));
        double descuento=Double.valueOf(oFunc.Soles(txtdescuento.getText().toString()));
                total=total-descuento;
                txtdescuento.setText(oFunc.convertir(descuento));
           txtTotal.setText(oFunc.convertir(total));     
    }//GEN-LAST:event_txtdescuentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sCodigo=txtCodPaciente.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE datos_paciente_asistencial\n" +
            "   SET nombres_pa='"+txtNombre.getText()+"', sexo_pa='"+cboSexo.getSelectedItem().toString()+"',"
                + " estado_civil_pa='"+cboEstadoCivil.getSelectedItem().toString()+"', direccion_pa='"+txtDireccion.getText()+"', \n" 
                + " cel_pa='"+txtTelefono.getText()+"',apellidos_pa='"+txtApellidos.getText()+"', edad= '"+txtEdad.getText()+"',\n" 
                + " fecha_nac='"+FechaNac.getDate()+"'\n"+
                " WHERE cod_pa='" + sCodigo + "'";
            Limpiar();
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
   private void ReporteFechas(Date date1, Date date2){

                Map parameters = new HashMap(); 
                parameters.put("Fecha1",date1);             
                parameters.put("Fecha2",date2);

                try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"ReporteFechasTicket.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Ficha 'Reporte por Fechas'");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }
  private void grabarAsistencial(){
       if (!txtCodPaciente.getText().isEmpty()) {
             String strSqlStmt;
                String Query;
                strSqlStmt = "Insert INTO datos_paciente_asistencial (";
                Query = "Values('";
                if (txtCodPaciente.getText().trim().length() >= 1) {
                    strSqlStmt += "cod_pa";
                    Query += txtCodPaciente.getText().toString() + "'";
                }
                if (txtNombre.getText().trim().length() > 1) {
                    strSqlStmt += ",nombres_pa";
                    Query += ",'" + txtNombre.getText().toString() + "'";
                }
                if (txtApellidos.getText().trim().length() > 1) {
                    strSqlStmt += ",apellidos_pa";
                    Query += ",'" + txtApellidos.getText().toString() + "'";
                }
                if (cboSexo.getSelectedIndex() >= 0) {

                    strSqlStmt += ",sexo_pa";
                    Query += ",'" + cboSexo.getSelectedItem().toString() + "'";
                }
                if (cboEstadoCivil.getSelectedIndex() >= 0) {
                    strSqlStmt += ",estado_civil_pa";
                    Query += ",'" + cboEstadoCivil.getSelectedItem().toString() + "'";
                }
                if (txtDireccion.getText().trim().length() > 1) {
                    strSqlStmt += ",direccion_pa";
                    Query += ",'" + txtDireccion.getText() + "'";
                }
                
                if (txtTelefono.getText().trim().length() > 1) {
                    strSqlStmt += ",cel_pa";
                    Query += ",'" + txtTelefono.getText().toString() + "'";
                }
                if (txtFechaT.getText().trim().length() > 1) {
                    strSqlStmt += ",fecha_registro_pa";
                    Query += ",'" + txtFechaT.getText().toString() + "'";
                }
                if (txtHoraT.getText().trim().length() > 1) {
                    strSqlStmt += ",hora_registro_pa";
                    Query += ",'" + txtHoraT.getText().toString() + "'";
                }
                 if (txtNumHcl.getText().trim().length() >= 1) {
                    strSqlStmt += ",n_hcl";
                    Query += ",'" + txtNumHcl.getText().toString() + "'";
                }
                if (txtEdad.getText().trim().length() >= 1) {
                    strSqlStmt += ",edad";
                    Query += ",'" + txtEdad.getText().toString() + "'";
                }
                    strSqlStmt += ",fecha_nac";
                    Query += ",'" + FechaNac.getDate() + "'";
                

             // oFunc.SubSistemaMensajeInformacion(strSqlStmt.concat(") ") + Query.concat(")"));  
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                    //Limpiar();
                    imprimir();
                    CargarId();
                    
                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");

                }
            

        }
  }
 private void Limpiar(){
 txtCodPaciente.setText(null);
 txtNombre.setText(null);
 txtApellidos.setText(null);
 cboTipoVenta.setSelectedIndex(0);
 txtreferido.setText(null);
 cboServicios.setSelectedIndex(-1);
 cboDescuento.setSelectedIndex(0);
 txtCodServicio.setText(null);
 txtPrecioT.setText(null);
 txtUnidad.setText(null);
 txtDoctor.setText(null);
 txtCodPaciente.setEditable(true);
 txtNombre.setEditable(true);
 txtdescuento.setText("S/.0.00");
 txtTotal.setText("S/.0.00");
 chkAsistencial.setSelected(false);
 txtCodPaciente.requestFocusInWindow();
 txtDireccion.setText(null);
 txtEdad.setText(null);
 cboSexo.setSelectedIndex(0);
 cboEstadoCivil.setSelectedIndex(0);
 txtTelefono.setText(null);
 hcl= "";
 sbTicket();
 Genera();
 habilitar(false); 
     desabilitar(false);
 }
 private void desabilitar(boolean r){
     txtNombre.setEnabled(r);
     txtApellidos.setEnabled(r);
     cboSexo.setEnabled(r);
     txtDireccion.setEnabled(r);
     txtEdad.setEnabled(r);
     txtTelefono.setEnabled(r);
     cboEstadoCivil.setEnabled(r);
     FechaNac.setEnabled(r);
     btnImprimirFicha.setEnabled(r);
 }
 private void LimpiarServicios(){
 txtCodServicio.setText(null);
 txtPrecioT.setText(null);
 txtUnidad.setText(null);
 cboDescuento.setSelectedIndex(0);
 cboServicios.setSelectedIndex(-1);
 cboServicios.requestFocusInWindow();
 
 }
private void bID1(JTextField cod){
    if (!txtCodPaciente.getText().isEmpty()) {
        if (OrdenExiste()) {
            String oSql = "SELECT nombres_pa,apellidos_pa, sexo_pa, estado_civil_pa, direccion_pa, cel_pa, \n"
                    + "n_hcl, edad, fecha_nac FROM datos_paciente_asistencial where cod_pa = '" + cod.getText().toString() + "' LIMIT 1";

            oConn.FnBoolQueryExecute(oSql);
            try {
                if (oConn.setResult.next()) {
                    FechaNacimiento = new com.toedter.calendar.JDateChooser();
                    txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                    txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                    cboSexo.setSelectedItem(oConn.setResult.getString("sexo_pa"));
                    cboEstadoCivil.setSelectedItem(oConn.setResult.getString("estado_civil_pa"));
                    txtDireccion.setText(oConn.setResult.getString("direccion_pa"));
                    txtTelefono.setText(oConn.setResult.getString("cel_pa"));
                    txtNumHcl.setText(oConn.setResult.getString("n_hcl"));
                    txtEdad.setText(oConn.setResult.getString("edad"));
                    FechaNac.setDate(oConn.setResult.getDate("fecha_nac"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nac"));
                    txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())));

                    CargarServicios();
                    txtCodPaciente.setEditable(false);
//                    txtNombre.setEditable(false);
                    cboTipoVenta.setSelectedIndex(0);
                    cboServicios.setSelectedIndex(-1);
                    oConn.setResult.close();

                }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ticket: " + ex.getMessage().toString());
            }
        } else {
            CargarNumHistoria();

        }

    }
    
    
}
 public boolean OrdenExiste(){
        // Para devolver el resultado
        boolean bResultado=false;
        // Para el Query
        String sQuery="";
        // Prepara el Query
        if(chkAsistencial.isSelected()){
           sQuery  = "Select * from datos_paciente_asistencial Where cod_pa="+txtCodPaciente.getText().toString(); 
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
private void bID(JTextField cod){
    String oSql="select nombres_pa||' '||apellidos_pa as nombres,sexo_pa,estado_civil_pa,direccion_pa,"
            + "direccion_pa,cel_pa,fecha_nacimiento_pa,historial_pa from datos_paciente where cod_pa = '"+cod.getText().toString()+"'"; 
    
    oConn.FnBoolQueryExecute(oSql);
    try {
            if (oConn.setResult.next()) {
                FechaNacimiento = new com.toedter.calendar.JDateChooser();
                txtNombre.setText(oConn.setResult.getString("nombres")); 
                cboSexo.setSelectedItem(oConn.setResult.getString("sexo_pa"));
                cboEstadoCivil.setSelectedItem(oConn.setResult.getString("estado_civil_pa"));
                txtDireccion.setText(oConn.setResult.getString("direccion_pa"));
                txtTelefono.setText(oConn.setResult.getString("cel_pa"));
                FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())));
                hcl = oConn.setResult.getString("historial_pa");
                habilitar(true);
                CargarServicios();
                txtCodPaciente.setEditable(false);
                txtNombre.setEditable(false);
                cboTipoVenta.setSelectedIndex(0);
                cboServicios.setSelectedIndex(-1);
               oConn.setResult.close();

            } 
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Ticket: " + ex.getMessage().toString());
        }
}
private void bNombre(JTextField cod){
     String oSql="select cod_pa, historial_pa from datos_paciente where CONCAT(nombres_pa,' ',apellidos_pa) = '"+cod.getText().toString()+"'";
    oConn.FnBoolQueryExecute(oSql);
    try {
            if (oConn.setResult.next()) {
                txtCodPaciente.setText(oConn.setResult.getString("cod_pa")); 
                hcl = oConn.setResult.getString("historial_pa");
                habilitar(true);
                CargarServicios();
                txtCodPaciente.setEditable(false);
                txtNombre.setEditable(false);
                cboTipoVenta.setSelectedIndex(0);
                cboServicios.setSelectedIndex(-1);
               oConn.setResult.close();

            } 
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Ticket: " + ex.getMessage().toString());
        }
}
private void habilitar(boolean r){
    cboTipoVenta.setEnabled(r);
    cbreferido.setEnabled(r);
    cboServicios.setEnabled(r);
    txtDoctor.setEditable(r);
    cboDescuento.setEnabled(r);
    FechaNac.setEnabled(r);
//    txtDireccion.setEditable(r);
//    txtEdad.setEditable(r);
//    txtTelefono.setEditable(r);
//    cboEstadoCivil.setEnabled(r);
//    cboSexo.setEnabled(r);
    btnAgregar.setEnabled(r);
    btnImprimirTicket.setEnabled(r);
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
            for(fil = 0; fil < tbTicket.getRowCount();fil++)
            {
                //Obtiene dato contenido en una celda de la tabla
                String value = (String)tbTicket.getValueAt(fil, 0);
                String des = (String)tbTicket.getValueAt(fil, 5);

                // lo pasa a Mayúsculas
                value = value.toUpperCase();
                des = des.toUpperCase();
                // verifico si encuentra el dato
                if(value.lastIndexOf(sDato)>=0 && des.lastIndexOf(sDscto)>=0 )
                {
                    sCantidad = tbTicket.getModel().getValueAt(fil,1).toString();
                    sPrecio = tbTicket.getModel().getValueAt(fil,4).toString();                                   
                
                iProductos = Integer.valueOf(sCantidad) + 1;
                tbTicket.getModel().setValueAt(iProductos,fil, 1);  
               // oFunc.SubSistemaMensajeInformacion(sPrecio);
               Double Total = (iProductos * oFunc.Sol(sPrecio))/oFunc.num(cboDescuento);
             // oFunc.SubSistemaMensajeInformacion(String.valueOf(Total));
                                    
                tbTicket.getModel().setValueAt(oFunc.convertir(Total), fil,6);
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
        DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();

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
                        
                        Double Total = decPrecio / oFunc.num(cboDescuento); 
                        oFila[6]= oFunc.convertir(Total);
                        tblDatos.insertRow(0, oFila);  
                        tbTicket.setModel(tblDatos);
                       txtTotal.setText(oFunc.convertir(Total));
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
public void sumar(){
   //if(!lblTotal.getText().equals("S/.00.00")){
    if(tbTicket.getRowCount()>=1){
       
        double total = 0;
		double subtotal;
		for (int i = 0; i < ticket.getRowCount(); i++) {
			
                        String sCantidad = tbTicket.getModel().getValueAt(i,1).toString();
                        String sPrecio = tbTicket.getModel().getValueAt(i,4).toString();
                        String sDscto = tbTicket.getModel().getValueAt(i,5).toString();
                        //Double Total = (Double.valueOf(sCantidad) * oFunc.Sol(sPrecio))/oFunc.numtext(sDscto);
                        Double Total = (Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio))-(Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio))*oFunc.numtext(sDscto);
                        
                        tbTicket.getModel().setValueAt(oFunc.convertir(Total), i,6);
                        subtotal = Double.valueOf(oFunc.Soles(ticket.getValueAt(i, 6).toString()));
			total += subtotal;
                        
		}
                   txtTotal.setText(oFunc.convertir(total));
     //   }
    
   }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha1;
    private com.toedter.calendar.JDateChooser Fecha2;
    private com.toedter.calendar.JDateChooser Fecha3;
    private com.toedter.calendar.JDateChooser Fecha4;
    private com.toedter.calendar.JDateChooser FechaNac;
    private javax.swing.ButtonGroup bgBoleta;
    private javax.swing.ButtonGroup bgFactura;
    private javax.swing.JButton btnAddUsuario;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarReferidoT;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnImprimirFicha;
    private javax.swing.JButton btnImprimirTicket;
    private javax.swing.JButton btnReporteFechas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboDescuento;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JComboBox cboServicios;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JComboBox cboTipoVenta;
    private javax.swing.JCheckBox cbreferido;
    private javax.swing.JCheckBox chkAsistencial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane jtcomprobantes;
    private javax.swing.JPopupMenu pmTicket;
    private javax.swing.JTable tbTicket;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodPaciente;
    private javax.swing.JTextField txtCodServicio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JLabel txtFechaT;
    private javax.swing.JLabel txtHoraT;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNroTicket;
    private javax.swing.JLabel txtNumHcl;
    private javax.swing.JTextField txtOperador;
    private javax.swing.JTextField txtPrecioT;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextField txtUnidad;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtreferido;
    // End of variables declaration//GEN-END:variables
    private void pServicios(){
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
    private void CargarNumHistoria() {
        
        String sql = "SELECT max(n_hcl)+1 as cod from datos_paciente_asistencial";
        oConn.FnBoolQueryExecute(sql);
        try {
            if (oConn.setResult.next()) {
                txtNumHcl.setText("NumHistoria: ");
                txtNumHcl.setText(oConn.setResult.getString("cod"));

            } else {

            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void CargarId() {
        
        String sql = "SELECT max(id_datos)+1 as cod from datos_paciente_asistencial";
        oConn.FnBoolQueryExecute(sql);
        try {
            if (oConn.setResult.next()) {
                txtId.setText("ID: ");
                txtId.setText(oConn.setResult.getString("cod"));

            } else {

            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void CargarServicios(){
    String Consulta;    
    Consulta = "select descripcion from servicios_generales "
             + " ORDER BY  descripcion asc ";
        if (oConn.FnBoolQueryExecute(Consulta))
        {
            try 
            {
                while (oConn.setResult.next())
                 {                     
                   cboServicios.addItem(oConn.setResult.getString ("descripcion"));                     
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
Timer timer = new Timer (1000, new ActionListener ()
{

    @Override
    public void actionPerformed(ActionEvent e)
{
Date HorNew = new Date();
SimpleDateFormat fechaforma = new SimpleDateFormat("hh:mm:ss a");
String FfechaSystemA = fechaforma.format(HorNew);

GestorTime.setFfechaSystem(FfechaSystemA);

txtHoraT.setText(GestorTime.getFfechaSystem());
}
});
private void fecha(){
Date dateHoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        txtFechaT.setText(formato.format(dateHoy));
}
void AddTicket(){
String strSqlStmt;
             String Query ;
            strSqlStmt="Insert INTO ticket_pa (";
            Query="Values('";
             if (txtCodPaciente.getText().trim().length()>= 1 ){
              strSqlStmt += "cod_pa";
              Query += txtCodPaciente.getText().toString()+ "'";
            } 
            if (txtNombre.getText().trim().length()> 1 ){
              strSqlStmt+= ",nombres_pa";
              Query+= ",'" + txtNombre.getText().toString()+"'"; 
            }
            if  (txtFechaT.getText().trim().length()> 1 ){
              strSqlStmt+= ",fecha_nacimiento_pa";
              Query+= ",'"+txtFechaT.getText().toString()+ "'";
            }
            if (cboTipoVenta.getSelectedIndex() >= 0  ){
              
            strSqlStmt+= ",tipo_venta";
            Query+= ",'"+cboTipoVenta.getSelectedItem().toString()+ "'";
            }
            if (txtHoraT.getText().trim().length()> 1 ){
              strSqlStmt+= ",hora_ticket";
              Query+= ",'"+txtHoraT.getText().toString()+ "'";
            }
        }
private void sbTicket(){
         // Declaro un modelo de datos
   ticket = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            if (columnIndex == 1) {
                return true;
            } else {
                return false;
            }
        }

    };
        ticket.addTableModelListener(new TableModelListener(){
            @Override
                    public void tableChanged(TableModelEvent e) {
                       if(e.getColumn() == 1){
                        sumar();
                    }
                        }
                });
        // Añadimos columnas al modelo de datos
        ticket.addColumn("Cod");
        ticket.addColumn("Cant");
        ticket.addColumn("Unidad");
        ticket.addColumn("Descripción");
        ticket.addColumn("P.Unitario");
        ticket.addColumn("Dscto");
        ticket.addColumn("Total");
                
        // Coloca el Modelo en la Tabla
        tbTicket.setModel(ticket);
        
        // Directamente
        tbTicket.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbTicket.getColumnModel().getColumn(1).setPreferredWidth(5);
        tbTicket.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbTicket.getColumnModel().getColumn(3).setPreferredWidth(255);
        tbTicket.getColumnModel().getColumn(4).setPreferredWidth(10);
        tbTicket.getColumnModel().getColumn(5).setPreferredWidth(2);
        tbTicket.getColumnModel().getColumn(6).setPreferredWidth(55);
        tbTicket.getTableHeader().setReorderingAllowed(false);
        tbTicket.getTableHeader().setResizingAllowed(false);

       // tbBoleta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbTicket.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);        
        tbTicket.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(6).setCellRenderer(cellAlinear);
        
    }
 void sbImprimeTicket()
    {
        if(tbTicket.getRowCount()>=0){
        int iFila;
        SimpleDateFormat formato = new SimpleDateFormat("dd / MM / yyyy");
        SimpleDateFormat FechaCancelacion = new SimpleDateFormat("dd        MM             yy");
              ESCPrinter escp = new ESCPrinter("\\\\CAJA\\epson", false); //create ESCPrinter on network location \\computer\sharename, 9pin printer
        if (escp.initialize()) {
            escp.setCharacterSet(ESCPrinter.USA);
            escp.select15CPI();//15 characters per inch printing
            //NroFactura
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5);
            escp.bold(true);
            escp.print("CENTRO MEDICO - HORIZONTE MEDIC S.A.C.");
            //Nro Ticket
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(10);
            escp.print("Nro : "+ txtNroTicket.getText().toString());
            //Dirección
            escp.advanceVertical(1); //go down 5cm
            escp.setAbsoluteHorizontalPosition(5); 
            escp.print("Jr. Leoncio Prado #786 - Huamachuco "); 
            //Teléfono            
            escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.print("Tel: 044 - 652832 / #989603777");
            escp.bold(false);
            //DATOS
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(6);
            escp.print("FECHA : "+ txtFechaT.getText().toString());
            if(!txtHoraT.getText().isEmpty()){
            escp.print("  HORA : "+ txtHoraT.getText().toString());
            }
            if(!txtNumHcl.getText().isEmpty()){
                escp.print("  HCL : "+ txtNumHcl.getText().toString());
            }
//                escp.print("  HCL : "+ hcl.toString());
            //Cliente
            escp.advanceVertical(2);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.print("PACIENTE : "+ txtNombre.getText().toString());
            //DNI
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(6);
            escp.print("DNI : "+ txtCodPaciente.getText().toString());
            //Medico
            
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(8);
            if(!txtDoctor.getText().isEmpty()){
            escp.print("MEDICO : "+ txtDoctor.getText().toString());
            }else{
            escp.print("MEDICO : -");            
            }
            
            escp.advanceVertical(2);
            escp.setAbsoluteHorizontalPosition(3); 
            escp.print("--------------------------------------------------------------------------------------------------------");
            //
            escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(3); 
            escp.print("|");
            //*************************************
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.print("CODIGO");            
            //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(1);
            escp.print("   CANT."); 
             //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(2);
            escp.print("  UNI.");
            //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(3);
            escp.print("           DESCRIPCION");
            //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(9);
            escp.print("P.UNIT.");
            //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(10);
            escp.print("  DSCNTO");
            //
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(11);
            escp.print("   P.TOTAL.");
            
            //***************************************
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(3); 
            escp.print("                                                                                                       |");
          
             escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(3); 
            escp.print("--------------------------------------------------------------------------------------------------------");
             //
            for(iFila = 0; iFila < tbTicket.getRowCount();iFila++)
        {   
            //Codigo
            escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.print(tbTicket.getValueAt(iFila, 0).toString());
            //Cantidad
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(1);
            escp.print("   "+tbTicket.getValueAt(iFila, 1).toString());
            //Unidad
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(2);
            escp.print("  "+tbTicket.getValueAt(iFila, 2).toString());
            //Descripción
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(3);
            escp.print(" "+tbTicket.getValueAt(iFila, 3).toString());
            //Precio Unitario
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(9);
            escp.print(oFunc.SolImp(tbTicket.getValueAt(iFila, 4).toString()));
            //Precio Dscto
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(10);
            escp.print("  "+tbTicket.getValueAt(iFila, 5).toString());
            //Precio Total
            escp.advanceVertical(0);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(11);
            escp.print("   "+oFunc.SolImp(tbTicket.getValueAt(iFila, 6).toString()));
                            
        }
            escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(3); 
            escp.print("--------------------------------------------------------------------------------------------------------");
           //descuento
            escp.bold(true);
            escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(10);
            escp.print("DESCUENTO : "+txtdescuento.getText().toString());
            //TOTAL
            escp.bold(true);
            escp.advanceVertical(1);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.horizontalTab(10);
            escp.print("TOTAL : "+txtTotal.getText().toString());
            //mensaje
            escp.advanceVertical(2);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.print("ATENDIDO POR :  "+txtOperador.getText().toString());
            escp.bold(false);
            
            escp.advanceVertical(3);
            escp.setAbsoluteHorizontalPosition(5); 
            escp.print("Si desea acérquese a cajear por boleta.");
            escp.bold(false);
            //escp.formFeed(); //eject paper
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
 private void imprimir(){
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir ?", //Mensaje
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
      printer(Integer.valueOf(txtId.getText()));
   }
   else
   {
      // PRESIONO NO
     }
    }

}
private void printer(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                 try 
                {
                    String master = System.getProperty("user.dir") +
                                "/reportes/HistoriaClinicaAsistencial.jasper";
            
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del reporte.");
                //System.exit(2);
            } 
            JasperReport masterReport = null;
            try 
            {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } 
            catch (JRException e) 
            {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            } 
            JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
                           
                    JasperViewer.viewReport(myPrint,false);
            
//            JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
//            JasperPrintManager.printReport(jasperPrint,true);

                   } catch (JRException ex) {
                    Logger.getLogger(CertificacionMedicaTrabajoAltura.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }
}

