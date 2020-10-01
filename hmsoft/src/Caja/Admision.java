package Caja;
import Clases.clsGlobales;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;


public class Admision extends javax.swing.JFrame {
   Comprobantes t = new Comprobantes(); 
   RegistrarCliente r = new RegistrarCliente();
   PacientesEspera p = new PacientesEspera();
   MenuEmpresas age;
   MenuContrata cont;
   ServiciosGenerales sg;
   Factura fa;
   Reporteador re = new Reporteador();
   Valorizacion val = new Valorizacion();
   ControlFactura contfac=new ControlFactura();
   public Admision() {
      initComponents();
      lblFecha.setText(Fecha());
     
      lblUsuarioCaja.setText(clsGlobales.sNomOperador);
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
        jToolBar2 = new javax.swing.JToolBar();
        btnTicket = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnBoleta = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnrclientes = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnReportes = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton21 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton22 = new javax.swing.JButton();
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
        setTitle("Sistemes de Gestión \"MEDSOFT\"  -  Area: Caja  \"Centro Medico - HORIZONTE MEDIC\"");
        setIconImage(getIconImage());

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar2.setFloatable(false);
        jToolBar2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar2.setToolTipText("");

        btnTicket.setForeground(new java.awt.Color(102, 102, 102));
        btnTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagar.png"))); // NOI18N
        btnTicket.setMnemonic(KeyEvent.VK_F1);
        btnTicket.setText("Ticket");
        btnTicket.setToolTipText("F1 (Ticket de Atención y Comprobantes de pago)");
        btnTicket.setFocusable(false);
        btnTicket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTicket.setMaximumSize(new java.awt.Dimension(60, 72));
        btnTicket.setMinimumSize(new java.awt.Dimension(60, 72));
        btnTicket.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        jToolBar2.add(btnTicket);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.add(jSeparator1);

        btnBoleta.setForeground(new java.awt.Color(102, 102, 102));
        btnBoleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boletas.png"))); // NOI18N
        btnBoleta.setMnemonic(KeyEvent.VK_F2);
        btnBoleta.setText("Boleta");
        btnBoleta.setToolTipText("F2 (Registrar Clientes para cualquier servicio)");
        btnBoleta.setFocusable(false);
        btnBoleta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBoleta.setMaximumSize(new java.awt.Dimension(70, 72));
        btnBoleta.setMinimumSize(new java.awt.Dimension(70, 72));
        btnBoleta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnBoleta);

        btnFactura.setForeground(new java.awt.Color(102, 102, 102));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Facturas.png"))); // NOI18N
        btnFactura.setMnemonic(KeyEvent.VK_F3);
        btnFactura.setText("Factura");
        btnFactura.setToolTipText("F3 (Reportes diarios)");
        btnFactura.setFocusable(false);
        btnFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFactura.setMaximumSize(new java.awt.Dimension(65, 72));
        btnFactura.setMinimumSize(new java.awt.Dimension(65, 72));
        btnFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnFactura);

        btnrclientes.setForeground(new java.awt.Color(102, 102, 102));
        btnrclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnrclientes.setMnemonic(KeyEvent.VK_F2);
        btnrclientes.setText("R. Clientes");
        btnrclientes.setToolTipText("F2 (Registrar Clientes para cualquier servicio)");
        btnrclientes.setFocusable(false);
        btnrclientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrclientes.setMaximumSize(new java.awt.Dimension(70, 72));
        btnrclientes.setMinimumSize(new java.awt.Dimension(70, 72));
        btnrclientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnrclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrclientesActionPerformed(evt);
            }
        });
        jToolBar2.add(btnrclientes);

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.add(jSeparator7);

        btnReportes.setForeground(new java.awt.Color(102, 102, 102));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/creporte.png"))); // NOI18N
        btnReportes.setMnemonic(KeyEvent.VK_F3);
        btnReportes.setText("Reportes");
        btnReportes.setToolTipText("F3 (Reportes diarios)");
        btnReportes.setFocusable(false);
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportes.setMaximumSize(new java.awt.Dimension(65, 72));
        btnReportes.setMinimumSize(new java.awt.Dimension(65, 72));
        btnReportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jToolBar2.add(btnReportes);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.add(jSeparator2);

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.add(jSeparator5);

        jButton21.setForeground(new java.awt.Color(102, 102, 102));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/creporte.png"))); // NOI18N
        jButton21.setMnemonic(KeyEvent.VK_F6);
        jButton21.setText("Valorización");
        jButton21.setToolTipText("F6 (Recoger Análisis Clinicos)");
        jButton21.setFocusable(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setMaximumSize(new java.awt.Dimension(80, 72));
        jButton21.setMinimumSize(new java.awt.Dimension(65, 72));
        jButton21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton21);

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.add(jSeparator6);

        jButton22.setForeground(new java.awt.Color(102, 102, 102));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/creporte.png"))); // NOI18N
        jButton22.setMnemonic(KeyEvent.VK_F6);
        jButton22.setText("R. Facturas");
        jButton22.setToolTipText("F6 (Recoger Análisis Clinicos)");
        jButton22.setFocusable(false);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setMaximumSize(new java.awt.Dimension(80, 72));
        jButton22.setMinimumSize(new java.awt.Dimension(65, 72));
        jButton22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton22);

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
        jToolBar2.add(btncerrar_caja);

        jToolBar1.add(jToolBar2);

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.add(jSeparator4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1310, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1310, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
      if(estacerrado(t)){             
          Admision.Desktop.add(t);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          t.setFrameIcon(ticon);
          t.setLocation(centradoXY(t));
         //try {
           // t.setMaximum(true);
         //} catch (PropertyVetoException ex) {
           // Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
         //}
           t.show();
       }
             else{
           t.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
      //JFrame tenga el tamaño de todos sus elementos
     // this.pack();
   }//GEN-LAST:event_btnTicketActionPerformed

   private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
       if(estacerrado(re)){             
          Admision.Desktop.add(re);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          re.setFrameIcon(ticon);
          re.setLocation(centradoXY(re));
         //try {
           // t.setMaximum(true);
         //} catch (PropertyVetoException ex) {
           // Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
         //}
           re.show();
       }
             else{
           re.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
   }//GEN-LAST:event_btnReportesActionPerformed

   private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
      if(estacerrado(val)){             
          Admision.Desktop.add(val);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          val.setFrameIcon(ticon);
          val.setLocation(centradoXY(val));
         //try {
           // t.setMaximum(true);
         //} catch (PropertyVetoException ex) {
           // Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
         //}
           val.show();
       }
             else{
           val.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
   }//GEN-LAST:event_jButton21ActionPerformed

   private void btncerrar_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrar_cajaActionPerformed
 System.exit(0);
   }//GEN-LAST:event_btncerrar_cajaActionPerformed

   private void btnrclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrclientesActionPerformed
      if (estacerrado(r)){
         Admision.Desktop.add(r);
         ImageIcon ricon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         r.setFrameIcon(ricon);
         r.setLocation(centradoXY(r));
         r.show();
      }
      else{
         r.moveToFront();
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
      
   }//GEN-LAST:event_btnrclientesActionPerformed

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        BoletadeVenta b = new BoletadeVenta();   
        if (estacerrado(b)){
         Admision.Desktop.add(b);
         ImageIcon ricon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         b.setFrameIcon(ricon);
         b.setLocation(centradoXY(b));
         b.show();
      }
      else{
         b.moveToFront();
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
    }//GEN-LAST:event_btnBoletaActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
         if (estacerrado(fa)){
                  fa =new Factura();
         Admision.Desktop.add(fa);
         ImageIcon ricon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fa.setFrameIcon(ricon);
         fa.setLocation(centradoXY(r));
         fa.show();
      }
      else{
         r.moveToFront();
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void EmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresasActionPerformed
              if (estacerrado(age)){
                  age =new MenuEmpresas();
         Admision.Desktop.add(age);
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
         Admision.Desktop.add(cont);
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
         Admision.Desktop.add(sg);
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

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(contfac)){             
          Admision.Desktop.add(contfac);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          contfac.setFrameIcon(ticon);
          contfac.setLocation(centradoXY(contfac));
         //try {
           // t.setMaximum(true);
         //} catch (PropertyVetoException ex) {
           // Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
         //}
           contfac.show();
        }else{
           contfac.moveToFront();
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_jButton22ActionPerformed
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
            
                 Admision main = new Admision();
                main.setExtendedState(MAXIMIZED_BOTH);
                main.setVisible(true);

         }
      });
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Contratas;
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem Empresas;
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JMenuItem Servicios;
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTicket;
    private javax.swing.JButton btncerrar_caja;
    private javax.swing.JButton btnrclientes;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblEstadoserver;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblUsuarioCaja;
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
        Dimension pantalla = Admision.Desktop.getSize();
        //se obtiene dimension del JInternalFrame
        Dimension ventana = jif.getSize();
        //se calcula posición para el centrado
        p.x = (pantalla.width - ventana.width) / 2;
        p.y = (pantalla.height - ventana.height) / 2;
        return p;
    }
 private String Fecha()
    {
        Date fecha= new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }

}

