package Consultas;
import Caja.*;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import autocomplete.ajTextField;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class ConsultasEmpresas extends javax.swing.JFrame {
   Comprobantes t = new Comprobantes(); 
   RegistrarCliente r = new RegistrarCliente();
   PacientesEspera p = new PacientesEspera();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   MenuEmpresas age;
   MenuContrata cont;
   ServiciosGenerales sg;
   Factura fa;
   Reporteador re = new Reporteador();
   Valorizacion val = new Valorizacion();
   clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   DefaultTableModel model;
   
   public ConsultasEmpresas() {
      initComponents();
//      lblFecha.setText(Fecha());
//      new ajTextField.autocompleterText(jcb, "razon_empresa", "empresas");
//       new ajTextField.autocompleterText(txtContrata, "razon_contrata", "contratas");
      lblUsuarioCaja.setText(clsGlobales.sNomOperador);
     String empresa=(String)IngresoConsultas.cboEmpresas.getSelectedItem();
     String contrata=(String)IngresoConsultas.cboContratas.getSelectedItem();
     txtEmpresa.setText(empresa);
     txtContrata.setText(contrata);
       sbCargarDatosOcupacional("");
        this.setLocationRelativeTo(null);
      KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
//y enseguida registramos nuestro dispatcher
manager.addKeyEventDispatcher(new KeyEventDispatcher(){
            @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
                //como dije, solo las notificaciones del tipo "typed" son las que actualizan los componentes
                if(e.getID() == KeyEvent.KEY_TYPED){
                        //como vamos a convertir todo a mayúsculas, entonces solo checamos si los caracteres son 
                        //minusculas
                        if(e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z'){
                                //si lo son, entonces lo reemplazamos por su respectivo en mayúscula en el mismo evento
                                // (esto se logra por que en java todas las variables son pasadas por referencia)
                                e.setKeyChar((char)(((int)e.getKeyChar()) - 32));
                        }
                }
                //y listo, regresamos siempre falso para que las demas notificaciones continuen, si regresamos true
                // significa que el dispatcher consumio el evento
                return false; 
        }
});  
   }
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Menu = new javax.swing.JPopupMenu();
        Empresas = new javax.swing.JMenuItem();
        Contratas = new javax.swing.JMenuItem();
        Servicios = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtContrata = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Fhasta = new com.toedter.calendar.JDateChooser();
        Fdesde = new com.toedter.calendar.JDateChooser();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtBuscarCod = new javax.swing.JTextField();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btncerrar_caja = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEstadoserver = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblUsuarioCaja = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Desktop = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReporte = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtNorden = new javax.swing.JTextField();
        btnLimpiar1 = new javax.swing.JButton();
        lblAnexo7C = new javax.swing.JLabel();
        lblTriaje1 = new javax.swing.JLabel();
        lblAcctitudMedOcupa = new javax.swing.JLabel();
        lblAnexo02 = new javax.swing.JLabel();
        lblAptitudAnexo02 = new javax.swing.JLabel();
        lblLabClinico1 = new javax.swing.JLabel();
        lblElectrocardiograma1 = new javax.swing.JLabel();
        lblRadiografiaTorax1 = new javax.swing.JLabel();
        lblFichaAudiologica1 = new javax.swing.JLabel();
        lblAudiometria1 = new javax.swing.JLabel();
        lblEspirometria1 = new javax.swing.JLabel();
        lblOdontograma1 = new javax.swing.JLabel();
        lblPsicologia1 = new javax.swing.JLabel();
        lblFichaOIT1 = new javax.swing.JLabel();
        lblExRxSanguineos1 = new javax.swing.JLabel();
        lblAnexo7C1 = new javax.swing.JLabel();
        lblAnexo7D1 = new javax.swing.JLabel();
        lblHistorialOcupacional1 = new javax.swing.JLabel();
        lblCuestionarioNordico1 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Fecha :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Conectado");

        Empresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        Empresas.setText("Registro de Empresas");
        Empresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresasActionPerformed(evt);
            }
        });
        Menu.add(Empresas);

        Contratas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        Contratas.setText("Registro de Contratas");
        Contratas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratasActionPerformed(evt);
            }
        });
        Menu.add(Contratas);

        Servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        Servicios.setText("Servicios y Precios");
        Servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiciosActionPerformed(evt);
            }
        });
        Menu.add(Servicios);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemes de Gestión \"MEDSOFT\"  -  Area: Consultas \"Centro Medico - HORIZONTE MEDIC\"");
        setIconImage(getIconImage());

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Personalizada"));

        jLabel2.setText("Contratista :");

        jLabel12.setText("Empresa  :");

        txtContrata.setEditable(false);
        txtContrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrataActionPerformed(evt);
            }
        });

        txtEmpresa.setEditable(false);
        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        jLabel4.setText("Desde :");

        jLabel13.setText("Hasta :");

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel35.setText("Codigo:");

        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fhasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnMostrar)
                    .addComponent(jLabel35)
                    .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fhasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(btnLimpiar))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel5);

        jToolBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar2.setFloatable(false);
        jToolBar2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar2.setToolTipText("");
        jToolBar1.add(jToolBar2);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.add(jSeparator1);

        btncerrar_caja.setForeground(new java.awt.Color(102, 102, 102));
        btncerrar_caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar48x48.png"))); // NOI18N
        btncerrar_caja.setMnemonic(KeyEvent.VK_F8);
        btncerrar_caja.setText("Salir");
        btncerrar_caja.setToolTipText("Salir del Sistema");
        btncerrar_caja.setFocusable(false);
        btncerrar_caja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrar_caja.setMaximumSize(new java.awt.Dimension(80, 72));
        btncerrar_caja.setMinimumSize(new java.awt.Dimension(65, 72));
        btncerrar_caja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrar_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrar_cajaActionPerformed(evt);
            }
        });
        jToolBar1.add(btncerrar_caja);

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.add(jSeparator4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1383, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        jLabel1.setText("Usuario :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/server.png"))); // NOI18N
        jLabel3.setText("Estado de Servidor :");

        lblEstadoserver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstadoserver.setForeground(new java.awt.Color(0, 51, 102));
        lblEstadoserver.setText("Verificar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("CopyRight(c) 2005 -2012 NORPEC");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Fecha :");

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 51, 102));
        lblFecha.setText("00/00/00");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Hora:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Conectado");

        lblUsuarioCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuarioCaja.setForeground(new java.awt.Color(0, 51, 102));
        lblUsuarioCaja.setText("Medsoft");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuarioCaja)
                .addGap(168, 168, 168)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstadoserver)
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsuarioCaja))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEstadoserver))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(lblFecha)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        Desktop.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Desktop.setComponentPopupMenu(Menu);

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
        jScrollPane1.setViewportView(tbReporte);

        jTabbedPane1.addTab("Reporte", jScrollPane1);

        Desktop.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1230, 490);
        Desktop.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DRAG_LAYER);

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        lblAnexo7C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAnexo7C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnexo7C.setText("Anexo 7C-16A");
        lblAnexo7C.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        lblAnexo7C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnexo7CMouseClicked(evt);
            }
        });

        lblTriaje1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAcctitudMedOcupa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAcctitudMedOcupa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcctitudMedOcupa.setText("Act. Med.Ocupac :");
        lblAcctitudMedOcupa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        lblAcctitudMedOcupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAcctitudMedOcupaMouseClicked(evt);
            }
        });

        lblAnexo02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAnexo02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnexo02.setText("Anexo 02 :");
        lblAnexo02.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        lblAnexo02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnexo02MouseClicked(evt);
            }
        });

        lblAptitudAnexo02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAptitudAnexo02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAptitudAnexo02.setText("Aptitud-Anexo02");
        lblAptitudAnexo02.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblLabClinico1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblElectrocardiograma1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblRadiografiaTorax1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaAudiologica1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAudiometria1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblEspirometria1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblOdontograma1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblPsicologia1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaOIT1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblExRxSanguineos1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAnexo7C1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAnexo7D1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblHistorialOcupacional1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCuestionarioNordico1.setPreferredSize(new java.awt.Dimension(13, 11));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAnexo7D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAnexo7C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCuestionarioNordico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lblHistorialOcupacional1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAcctitudMedOcupa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAnexo7C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTriaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLabClinico1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAnexo02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAptitudAnexo02, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(lblFichaAudiologica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblRadiografiaTorax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(lblAudiometria1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lblEspirometria1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(lblOdontograma1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lblPsicologia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblFichaOIT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblExRxSanguineos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblElectrocardiograma1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar1))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnexo7C)
                    .addComponent(lblTriaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                                        .addComponent(lblAcctitudMedOcupa)
                                                                        .addGap(2, 2, 2)
                                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(lblAnexo02)
                                                                            .addComponent(lblElectrocardiograma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                    .addComponent(lblLabClinico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(2, 2, 2)
                                                                .addComponent(lblAptitudAnexo02))
                                                            .addComponent(lblRadiografiaTorax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18))
                                                    .addComponent(lblFichaAudiologica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18))
                                            .addComponent(lblAudiometria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addComponent(lblEspirometria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(lblOdontograma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))
                                    .addComponent(lblPsicologia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addComponent(lblFichaOIT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(lblExRxSanguineos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addComponent(lblAnexo7C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblHistorialOcupacional1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addComponent(lblCuestionarioNordico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblAnexo7D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(214, 214, 214))
        );

        Desktop.add(jPanel4);
        jPanel4.setBounds(1230, 0, 130, 490);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1383, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void btncerrar_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrar_cajaActionPerformed
 System.exit(0);
   }//GEN-LAST:event_btncerrar_cajaActionPerformed

    private void EmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresasActionPerformed
              if (estacerrado(age)){
                  age =new MenuEmpresas();
         ConsultasEmpresas.Desktop.add(age);
         ImageIcon ricon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         age.setFrameIcon(ricon);
         age.setLocation(centradoXY(r));
         age.show();
      }
      else{
         r.moveToFront();
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
    }//GEN-LAST:event_EmpresasActionPerformed

    private void ContratasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratasActionPerformed
            if (estacerrado(cont)){
                  cont =new MenuContrata();
         ConsultasEmpresas.Desktop.add(cont);
         ImageIcon ricon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cont.setFrameIcon(ricon);
         cont.setLocation(centradoXY(r));
         cont.show();
      }
      else{
         r.moveToFront();
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
    }//GEN-LAST:event_ContratasActionPerformed

    private void ServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiciosActionPerformed
           if (estacerrado(sg)){
                  sg =new ServiciosGenerales();
         ConsultasEmpresas.Desktop.add(sg);
         ImageIcon ricon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         sg.setFrameIcon(ricon);
         sg.setLocation(centradoXY(r));
         sg.show();
      }
      else{
         r.moveToFront();
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
    }//GEN-LAST:event_ServiciosActionPerformed

    private void tbReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReporteMouseClicked
        
        if(evt.getClickCount()==1){
            String cod  =  tbReporte.getValueAt(tbReporte.getSelectedRow(),0).toString();
            verifica(cod);
        }
        if (evt.getClickCount() == 2) 
        {  
            Integer cod  = Integer.valueOf( tbReporte.getValueAt(tbReporte.getSelectedRow(),0).toString());
            oPe.print(cod, "Aptitud_medico_ocupacional.jasper", "Ficha Aptitud");
             oPe.print(cod, "anexo7c2.jasper", "Anexo 7C Hoja Nro 2");
            oPe.print(cod, "Anexo7C.jasper", "Anexo 7C Hoja Nro 1");
           
            
        }
    }//GEN-LAST:event_tbReporteMouseClicked

    private void txtContrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrataActionPerformed
        txtEmpresa.requestFocus();
    }//GEN-LAST:event_txtContrataActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        txtContrata.requestFocus();
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        sbCargarDatosOcupacional(txtBuscarCod.getText());
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarPersonalizado();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
       
            sbCargarDatosOcupacional(txtBuscarCod.getText().toString());
            // sbCargarDatosOcupacional(txtBuscar.getText());
        
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        Limpiar2();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        verifica(txtNorden.getText().toString());
        //verifica2();
    }//GEN-LAST:event_txtNordenActionPerformed

    private void lblAnexo7CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnexo7CMouseClicked
        Integer cod  = Integer.valueOf( tbReporte.getValueAt(tbReporte.getSelectedRow(),0).toString());
//        oPe.print(cod, "Aptitud_medico_ocupacional.jasper", "Ficha Aptitud");
             oPe.print(cod, "anexo7c2.jasper", "Anexo 7C Hoja Nro 2");
            oPe.print(cod, "Anexo7C.jasper", "Anexo 7C Hoja Nro 1");
    }//GEN-LAST:event_lblAnexo7CMouseClicked

    private void lblAcctitudMedOcupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcctitudMedOcupaMouseClicked
        Integer cod  = Integer.valueOf( tbReporte.getValueAt(tbReporte.getSelectedRow(),0).toString());
        oPe.print(cod, "Aptitud_medico_ocupacional.jasper", "Ficha Aptitud");
    }//GEN-LAST:event_lblAcctitudMedOcupaMouseClicked

    private void lblAnexo02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnexo02MouseClicked
        Integer cod  = Integer.valueOf( tbReporte.getValueAt(tbReporte.getSelectedRow(),0).toString());
        oPe.print(cod, "Anexo_02.jasper", "Anexo 02");
    }//GEN-LAST:event_lblAnexo02MouseClicked
@Override
     public Image getIconImage() {
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/med.png"));
    return retValue;
    }
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
  
      java.awt.EventQueue.invokeLater(new Runnable() {

         @Override
         public void run() {
          
                 //JFrame.setDefaultLookAndFeelDecorated(true);
               //  SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeCoffeeSkin");  
            //-----------------------------------------------------------------------------------------
             //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.DustSkin");
                  //new Sistema().setVisible(true);
            
                 ConsultasEmpresas main = new ConsultasEmpresas();
                main.setExtendedState(MAXIMIZED_BOTH);
                main.setVisible(true);

         }
      });
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Contratas;
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem Empresas;
    private com.toedter.calendar.JDateChooser Fdesde;
    private com.toedter.calendar.JDateChooser Fhasta;
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JMenuItem Servicios;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btncerrar_caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblAcctitudMedOcupa;
    private javax.swing.JLabel lblAnexo02;
    private javax.swing.JLabel lblAnexo7C;
    private javax.swing.JLabel lblAnexo7C1;
    private javax.swing.JLabel lblAnexo7D1;
    private javax.swing.JLabel lblAptitudAnexo02;
    private javax.swing.JLabel lblAudiometria1;
    private javax.swing.JLabel lblCuestionarioNordico1;
    private javax.swing.JLabel lblElectrocardiograma1;
    private javax.swing.JLabel lblEspirometria1;
    private javax.swing.JLabel lblEstadoserver;
    private javax.swing.JLabel lblExRxSanguineos1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFichaAudiologica1;
    private javax.swing.JLabel lblFichaOIT1;
    private javax.swing.JLabel lblHistorialOcupacional1;
    private javax.swing.JLabel lblLabClinico1;
    private javax.swing.JLabel lblOdontograma1;
    private javax.swing.JLabel lblPsicologia1;
    private javax.swing.JLabel lblRadiografiaTorax1;
    private javax.swing.JLabel lblTriaje1;
    private javax.swing.JLabel lblUsuarioCaja;
    private javax.swing.JTable tbReporte;
    public javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNorden;
    // End of variables declaration//GEN-END:variables
    private boolean estacerrado(Object obj){
        JInternalFrame[] activos=Desktop.getAllFrames();
        boolean cerrado=true;
        int i=0;
        while (i<activos.length && cerrado){
            if(activos[i]==obj){
		cerrado=false;
            }
            i++;
        }
    return cerrado;
    }
    private Point centradoXY(JInternalFrame jif)
    {
        Point p = new Point(0,0);
        //se obtiene dimension del contenedor
        Dimension pantalla = ConsultasEmpresas.Desktop.getSize();
        //se obtiene dimension del JInternalFrame
        Dimension ventana = jif.getSize();
        //se calcula posición para el centrado
        p.x = (pantalla.width - ventana.width) / 2;
        p.y = (pantalla.height - ventana.height) / 2;
        return p;
    }
void sbCargarDatosOcupacional(String valor){
    String [] titulos={"N°Orden","Nombre","Fecha","H.Entrada","Empresa","Contrata","T.Examen","Cargo","F.Aptitud","Estado"};//,"F.Salida","H_Salida","T.Pago"
    String [] registros = new String[10];
    String sql="";
    if(!txtBuscarCod.getText().isEmpty()){
        sql ="select n_orden_ocupacional.n_orden, "
            + "datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + " n_orden_ocupacional.fecha_apertura_po,n_orden_ocupacional.n_hora,n_orden_ocupacional.tipo_pago,"
            + "n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
            + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,"
            + "ca.n_orden as aptitud,ca.fecha,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,"
            + "bc.n_orden as conduccion,ba.n_orden as altura,cma.n_orden as altura1,  "
            + "CASE  WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  END as estado, \n" 
            + "CASE  WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ac.no_apto = 'TRUE' THEN 'No Apto' END as estadoac, \n" 
            + "CASE  WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN a.no_apto = 'TRUE' THEN 'No Apto' END as estadoad,"
            + "CASE  WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN bc.chk_no = 'TRUE' THEN 'No Apto' END as estadobc,"
            + "CASE  WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN ba.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto' END as estadoba,"
            + "CASE  WHEN cma.p_si1 = 'TRUE' THEN 'Apto'\n" +
                    " WHEN cma.p_no1 = 'TRUE' THEN 'No Apto' END as estadoaltura,"
            + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional "
            + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
            +" left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexo7d as a ON (a.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexoc as ac ON (ac.n_orden=n_orden_ocupacional.n_orden)"
            +" left join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_conduccion as bc ON (bc.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_altura as ba ON (ba.n_orden=n_orden_ocupacional.n_orden)"      
            +" left join certificacion_medica_altura as cma ON (cma.n_orden=n_orden_ocupacional.n_orden)"      
            + "left join triaje on (n_orden_ocupacional.n_orden = triaje.n_orden)";
            if(!txtContrata.getText().isEmpty()){
                sql +="WHERE  n_orden_ocupacional.n_orden='"+valor+"' ";
            }
//                if(!txtContrata.getText().isEmpty()){
//                sql +="WHERE '"+txtContrata.getText().toString()+"' = n_orden_ocupacional.razon_contrata  AND "
//                        + "'"+txtEmpresa.getText().toString()+"' = n_orden_ocupacional.razon_empresa "
//                        + "AND n_orden_ocupacional.n_orden='"+valor+"' ";
//                }
                if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) 
                 {
                     if(txtEmpresa.getText().isEmpty() && txtContrata.getText().isEmpty() ){
                          sql +=" WHERE n_orden_ocupacional.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                     }else{
                         sql +=" AND n_orden_ocupacional.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                     }
                     
                 }
                 if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) 
                 {
                 sql +=" AND n_orden_ocupacional.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"' ";
                 }
                sql += " order by n_orden_ocupacional.fecha_apertura_po desc limit 100";
                 
    }else{
        sql ="select n_orden_ocupacional.n_orden, "
            + "datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + " n_orden_ocupacional.fecha_apertura_po,n_orden_ocupacional.n_hora,n_orden_ocupacional.tipo_pago,"
            + "n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
            + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,"
            + "ca.n_orden as aptitud,ca.fecha,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,"
            + "bc.n_orden as conduccion,ba.n_orden as altura,cma.n_orden as altura1,   "
            + "CASE  WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  END as estado, \n" 
            + "CASE  WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ac.no_apto = 'TRUE' THEN 'No Apto' END as estadoac, \n" 
            + "CASE  WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN a.no_apto = 'TRUE' THEN 'No Apto' END as estadoad,"
            + "CASE  WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN bc.chk_no = 'TRUE' THEN 'No Apto' END as estadobc,"
            + "CASE  WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN ba.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto' END as estadoba,"
            + "CASE  WHEN cma.p_si1 = 'TRUE' THEN 'Apto'\n" +
                    " WHEN cma.p_no1 = 'TRUE' THEN 'No Apto' END as estadoaltura,"
                + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional "
            + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
            +" left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexo7d as a ON (a.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexoc as ac ON (ac.n_orden=n_orden_ocupacional.n_orden)"
            +" left join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_conduccion as bc ON (bc.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_altura as ba ON (ba.n_orden=n_orden_ocupacional.n_orden)"      
           +" left join certificacion_medica_altura as cma ON (cma.n_orden=n_orden_ocupacional.n_orden)"      
            + "left join triaje on (n_orden_ocupacional.n_orden = triaje.n_orden)";
            if(!txtContrata.getText().isEmpty()){
                sql +=" WHERE '"+txtContrata.getText().toString()+"' = n_orden_ocupacional.razon_contrata  AND "
                        + "'"+txtEmpresa.getText().toString()+"' = n_orden_ocupacional.razon_empresa";
            }
            if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) 
            {
                if(txtEmpresa.getText().isEmpty() && txtContrata.getText().isEmpty() ){
                    sql +=" WHERE n_orden_ocupacional.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                }else{
                    sql +=" AND n_orden_ocupacional.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                }
                     
            }
            if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) 
            {
                sql +=" AND n_orden_ocupacional.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"'";
            } 
            
                 sql += " order by n_orden_ocupacional.fecha_apertura_po desc limit 100";
    }           
          
      // DefaultTableModel tblDatos = (DefaultTableModel) tblProductos.getModel(); 
    
      model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
       
//       int cont=0;
//       int cont1=0;
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("n_orden");
                    registros[1]= oConn.setResult.getString("nombres");
                    registros[2]= formato.format(oConn.setResult.getDate("fecha_apertura_po"));
                    registros[3]= oConn.setResult.getString("n_hora");
                    registros[4]= oConn.setResult.getString("razon_empresa");
                    registros[5]= oConn.setResult.getString("razon_contrata");
                    String exa=oConn.setResult.getString("nom_examen");
                    registros[6]= exa;
                    registros[7]= oConn.setResult.getString("cargo_de");
                    String s=oConn.setResult.getString("aptitud");
                    String a=oConn.setResult.getString("anexo7d");
                    String o=oConn.setResult.getString("observados");
                    String ac=oConn.setResult.getString("anexoc");
                    String bc=oConn.setResult.getString("conduccion");
                    String ba=oConn.setResult.getString("altura");
                    String aa=oConn.setResult.getString("altura1");
                    
                    if(s != null ){
                        registros[8]="COMPLETO";
                        registros[9]= oConn.setResult.getString("estado");
//                        cont++;
                    }else if( a != null && "ANEXO-7D".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoad");
//                            cont++;
                    }else if( o!= null){
                            registros[8]="OBSERVADO";
                            registros[9]= oConn.setResult.getString("examenes");
//                            cont1++;
                    }else if( ac!= null && "ANEXO-C".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoac");
//                            cont++;
                    }else if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadobc");
//                            cont++;
                    }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoba");
//                            cont++;
                    }else if( aa!= null && "TEST-ALTURA".equals(exa)){
                            registros[8]="COMPLETO";
                            registros[9]= oConn.setResult.getString("estadoaltura");
//                            cont++;
                    }else{ 
                        registros[8]="FALTA";
                        registros[9]= " ";
//                        cont1++;
                    }
//                    if(oConn.setResult.getDate("fecha")!= null){
//                        registros[10]= formato.format(oConn.setResult.getDate("fecha"));
//                    }else{
//                        registros[10]= " ";
//                    }
//                    
//                    registros[11]= oConn.setResult.getString("horasalida");
////                    registros[12]= oConn.setResult.getString("tipo_pago");
//                    oPe.fecha(FechaFicha);
//                    FechaFicha.setDate());
//                    txtFecha.setText(formato.format(oConn.setResult.getDate("fecha_apertura_po")));
//                    if("CREDITO".equals(registros[12])){
//                        cont++;
//                            registros[13]=String.valueOf(cont);
//                        
//                    }else{
//                        cont1++;
//                        registros[13]=String.valueOf(cont1);
//                        
//                    }
//                    
                    tbReporte.setDefaultRenderer(Object.class, new MyCellRenderer());
                    this.tbReporte.setDefaultRenderer(Object.class, colorCelda());
                            
                     model.addRow(registros);
                }
               
                  // Coloca el Modelo de Nueva Cuenta
                  tbReporte.setModel(model);
//  ++++++                sbTablaTriaje();
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(ConsultasEmpresas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
 private DefaultTableCellRenderer colorCelda(){
    DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(){
         @Override
         public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//            setBackground(Color.WHITE );
//             setForeground(Color.BLACK);
             boolean valid = String.valueOf(table.getValueAt(row, 8)).equals("COMPLETO");
             boolean valid1= String.valueOf(table.getValueAt(row, 8)).equals("OBSERVADO");
//             boolean valid2= String.valueOf(table.getValueAt(row, 12)).equals("EFECTIVO");
             if(valid){
                 setBackground(Color.green );
             }else if(valid1){
                 setBackground(Color.orange );
             }else{
                 setBackground(Color.red );
             }
             if(isSelected){
                setBackground(Color.lightGray );
            }

            if(column==12){
//                String valor =value.toString();
             if(String.valueOf(table.getValueAt(row, 12)).equals("EFECTIVO")){
                 setBackground(Color.CYAN );
             }else if(String.valueOf(table.getValueAt(row, 12)).equals("CREDITO")){
                 setBackground(Color.yellow );
             }else{
                  setBackground(Color.red );
             }
//                switch (valor){
//                    case "EFECTIVO" : setBackground(Color.CYAN );break;
//                    case "CREDITO" : setBackground(Color.yellow );break;   
//                    
//                }
            }
            
             return component;
         }
    };
     return dtcr;
}   
void sbCargarDatosOcupacional1(String empresa,String contrata){
    String [] titulos={"N°Orden","Nombre","Fecha","Empresa","Contrata","T.Examen","Cargo","F.Aptitud","Estado","H.Entrada","H_Salida"};
    String [] registros = new String[11];
    String sql="";
          sql ="select n_orden_ocupacional.n_orden, "
            + "datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + "n_orden_ocupacional.n_hora,triaje.fecha_triaje,n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
                  + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,"
            + "ca.n_orden as aptitud,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,  "
            + "bc.n_orden as conduccion,ba.n_orden as altura,  "
            + "CASE  WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  END as estado, \n" 
            + "CASE  WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN ac.no_apto = 'TRUE' THEN 'No Apto' END as estadoac, \n" 
            + "CASE  WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                    " WHEN a.no_apto = 'TRUE' THEN 'No Apto' END as estadoad,"
              + "CASE  WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN bc.chk_no = 'TRUE' THEN 'No Apto' END as estadobc,"
            + "CASE  WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                  " WHEN ba.chk_observado = 'TRUE' THEN 'Observado'\n" +
                    " WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                    " WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto' END as estadoba,"
            + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional "
            + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
            +" left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexo7d as a ON (a.n_orden=n_orden_ocupacional.n_orden)"
            +" left join anexoc as ac ON (ac.n_orden=n_orden_ocupacional.n_orden)"
            +" left join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)"
            +" left join b_certificado_conduccion as bc ON (bc.n_orden=n_orden_ocupacional.n_orden)"
           +" left join b_certificado_altura as ba ON (ba.n_orden=n_orden_ocupacional.n_orden)"     
           + "inner join triaje on (n_orden_ocupacional.n_orden = triaje.n_orden)"
            + "WHERE '"+empresa+"' = n_orden_ocupacional.razon_empresa AND '"+contrata+"' = n_orden_ocupacional.razon_contrata"
            + " order by n_orden_ocupacional.n_orden desc limit 100";   
      // DefaultTableModel tblDatos = (DefaultTableModel) tblProductos.getModel(); 
    
      model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("n_orden");
                    registros[1]= oConn.setResult.getString("nombres");
                    registros[2]= formato.format(oConn.setResult.getDate("fecha_triaje"));
                    registros[3]= oConn.setResult.getString("razon_empresa");
                    registros[4]= oConn.setResult.getString("razon_contrata");
                    String exa=oConn.setResult.getString("nom_examen");
                    registros[5]= exa;
                    registros[6]= oConn.setResult.getString("cargo_de");
                    String s=oConn.setResult.getString("aptitud");
                    String a=oConn.setResult.getString("anexo7d");
                    String o=oConn.setResult.getString("observados");
                    String ac=oConn.setResult.getString("anexoc");
                    String bc=oConn.setResult.getString("conduccion");
                    String ba=oConn.setResult.getString("altura");
                    if(s != null ){
                        registros[7]="COMPLETO";
                        registros[8]= oConn.setResult.getString("estado");
                    }else if( a != null && "ANEXO-7D".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoad");
                    }else if( o!= null){
                            registros[7]="OBSERVADO";
                            registros[8]= oConn.setResult.getString("examenes");
                    }else if( ac!= null && "ANEXO-C".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoac");
                    }else  if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadobc");
                    }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoba");
                    }else{ 
                        registros[7]="FALTA";
                        registros[8]= " ";
                    }
                    registros[9]= oConn.setResult.getString("n_hora");
                    registros[10]= oConn.setResult.getString("horasalida");
                    //registros[3]=oConn.setResult.getString("anexo7c");
//+++++++                    tbReporte.setDefaultRenderer(Object.class, new MyCellRenderer());
                     model.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  tbReporte.setModel(model);
//+++++                  sbTablaTriaje();
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(ConsultasEmpresas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
public class MyCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        boolean valid = String.valueOf(table.getValueAt(row, 7)).equals("COMPLETO");
        boolean valid1= String.valueOf(table.getValueAt(row, 7)).equals("OBSERVADO");
        component.setBackground(valid ? Color.green :valid1? Color.ORANGE:Color.RED);
        
//        component.setForeground(valid ? Color.black : Color.white);
        return component;
    }
}
    private void sbTablaTriaje() {
        tbReporte.getColumnModel().getColumn(0).setMinWidth(50);
        tbReporte.getColumnModel().getColumn(0).setMaxWidth(50);
//tbTriaje.getColumnModel().getColumn(1).setMinWidth(130);//260
//tbTriaje.getColumnModel().getColumn(1).setMaxWidth(130);
        tbReporte.getColumnModel().getColumn(2).setMinWidth(80);//130
        tbReporte.getColumnModel().getColumn(2).setMaxWidth(80);
//tbTriaje.getColumnModel().getColumn(3).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(3).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(4).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(4).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(5).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(5).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(6).setMinWidth(90);//260
//tbTriaje.getColumnModel().getColumn(6).setMaxWidth(90); 
        tbReporte.setFont(new java.awt.Font("Tahoma", 0, 11));
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();

        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.LEFT);
        tbReporte.setSelectionForeground(Color.BLUE);
        tbReporte.setGridColor(Color.blue);
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
//        tbTriaje.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        tbReporte.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11));
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));

    }
     private void LimpiarPersonalizado(){
    Fhasta.setDate(null);
    Fdesde.setDate(null);
    txtBuscarCod.setText(null);
     }
     //para verificar examenes pasados 
     public void verifica(String orden){
        if (!orden.isEmpty()) {
            if (OrdenExiste(orden)) {
                String Sql = "SELECT d.nombres_pa||' '||d.apellidos_pa AS nombres,n.nom_examen FROM "
                        + "datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa)WHERE n.n_orden ='" + orden + "'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNorden.setText(orden);
                        oConn.setResult.close();
                    }
                    oConn.setResult.close();
                } catch (Exception e) {
                }
                vExamenes(orden);

            } else {
                oFunc.SubSistemaMensajeError("No existe Nro Orden");
                Limpiar2();
            }
        }
    }
     private void Limpiar2(){
    
//    lblTriaje.setForeground(Color.BLACK);
//    lblLabClinico.setForeground(Color.BLACK);
    lblAnexo02.setForeground(Color.BLACK);
    lblAptitudAnexo02.setForeground(Color.BLACK);
//    lblFichaAudiologica.setForeground(Color.BLACK);
//    lblAudiometria.setForeground(Color.BLACK);
//    lblEspirometria.setForeground(Color.BLACK);
//    lblOdontograma.setForeground(Color.BLACK);
//    lblPsicologia.setForeground(Color.BLACK);
//    lblAnexo7D.setForeground(Color.BLACK);
//    lblHistorialOcupacional.setForeground(Color.BLACK);
//    lblFichaAPatologicos.setForeground(Color.BLACK);
//    lblCuestionarioNordico.setForeground(Color.BLACK);
//    lblCertificacionAltura.setForeground(Color.BLACK);
//    lblConsentimientoDosaje.setForeground(Color.BLACK);
//    lblSAS.setForeground(Color.BLACK);
    lblAnexo7C.setForeground(Color.BLACK);
//    lblExRxSanguineos.setForeground(Color.BLACK);
//    lblPerimetroToraxico.setForeground(Color.BLACK);
//    lblOftalmologia.setForeground(Color.BLACK);
//    //modificacion
//    lblCertTrabAltBarrick.setForeground(Color.BLACK);
//    lblCertCondVehBarrick.setForeground(Color.BLACK);
//    lblUsoRespirador.setForeground(Color.BLACK);
    lblAcctitudMedOcupa.setForeground(Color.BLACK);
//    lblFichaOIT.setForeground(Color.BLACK);
//    txtNorden.setText(null);
//    txtNorden.requestFocus();
  }
     public void vExamenes(String Nro){
      
//        vSql(lblTriaje, "triaje", Nro);
//        vSql(lblLabClinico, "lab_clinico", Nro);
        vSql(lblAnexo02, "anexo_02", Nro);
        vSql(lblAptitudAnexo02, "radiografia_torax", Nro);
//        vSql(lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro);
//        //modificacion
//        vSql(lblFichaAudiologica, "ficha_audiologica", Nro);  
//        vSql(lblAudiometria, "audiometria_po", Nro); 
//        //
//        vSql(lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro);
//        vSql(lblEspirometria, "funcion_abs", Nro);
//        vSql(lblOdontograma, "odontograma", Nro);
//        vSql(lblPsicologia, "informe_psicologico", Nro);
//        vSql(lblAnexo7D, "anexo7d", Nro);
//        vSql(lblHistorialOcupacional, "historia_oc_info", Nro);        
//        vSql(lblFichaAPatologicos, "antecedentes_patologicos", Nro);
//        vSql(lblCuestionarioNordico, "cuestionario_nordico", Nro);
//        vSql(lblCertificacionAltura, "certificacion_medica_altura", Nro);
//        vSql(lblSAS, "ficha_sas", Nro);
//        vSql(lblConsentimientoDosaje, "consentimiento_dosaje", Nro);
//        vSql(lblPerimetroToraxico, "perimetro_toracico", Nro);
//        vSql(lblOftalmologia, "oftalmologia", Nro); 
        vSql(lblAnexo7C, "anexo7c", Nro);
        //modificacion
//        vSql(lblCertTrabAltBarrick, "b_certificado_altura", Nro);
//        vSql(lblCertCondVehBarrick, "b_certificado_conduccion", Nro);
//        vSql(lblUsoRespirador, "b_uso_respiradores", Nro);
        vSql(lblAcctitudMedOcupa, "certificado_aptitud_medico_ocupacional", Nro);
//        vSql(lblFichaOIT,"oit",Nro);
    }
     public boolean vSql(JLabel lbl ,String sTabla, String sOpcion)
    {
        String sStmt;
        boolean bResult=false;
        sStmt = " Select * from "+sTabla;
        sStmt+= " Where n_orden='"+sOpcion+"'";        
        oConn.FnBoolQueryExecute(sStmt);
        try 
        {
            if (oConn.setResult.next()){        
               bResult=true;
               lbl.setForeground(Color.blue);
//            lbl.setIcon(oIconoSi);
           
            }else{
                lbl.setForeground(Color.red);
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasEmpresas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return bResult;        
    }
     public boolean OrdenExiste(String orden)
    {
        boolean bResultado=false;
        String sQuery;
        sQuery  = "Select n_orden from n_orden_ocupacional Where n_orden="+orden;
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try { // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
            }// Cierro los Resultados
            oConn.setResult.close();
        } catch (SQLException ex) {
        }
        return bResultado; 
    }    
}

