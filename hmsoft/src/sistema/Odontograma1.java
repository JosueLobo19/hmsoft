/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOndontograma;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
public final class Odontograma1 extends javax.swing.JDialog {
public JLabel diente;
clsConnection oConn = new clsConnection();
 clsFunciones  oFunc = new clsFunciones();
 clsOndontograma oDon = new clsOndontograma();
  DefaultTableModel model;
    public Odontograma1() {
        initComponents();
        jtOdontogramas.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/doc.png")));
       
        Fecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPopupMenu();
        btnAusente = new javax.swing.JMenuItem();
        btnCariada = new javax.swing.JMenuItem();
        btnExtraer = new javax.swing.JMenuItem();
        btnFracturada = new javax.swing.JMenuItem();
        btnEfectuada = new javax.swing.JMenuItem();
        btnCorona = new javax.swing.JMenuItem();
        btnPuente = new javax.swing.JMenuItem();
        btnMetalica = new javax.swing.JMenuItem();
        btnAcrilica = new javax.swing.JMenuItem();
        btnTotal = new javax.swing.JMenuItem();
        btnNormal = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        FechaOdontograma = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtContrata = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtOdontogramas = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl11 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl36 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl38 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl37 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl35 = new javax.swing.JLabel();
        lbl45 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl46 = new javax.swing.JLabel();
        lbl47 = new javax.swing.JLabel();
        lbl48 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lbl22 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPorExtraer = new javax.swing.JLabel();
        lblFracturada = new javax.swing.JLabel();
        lblCariadaOturar = new javax.swing.JLabel();
        lblPPRAcrilica = new javax.swing.JLabel();
        lblPuente = new javax.swing.JLabel();
        lblCorona = new javax.swing.JLabel();
        lblObturacionEfectuada = new javax.swing.JLabel();
        lblNormal = new javax.swing.JLabel();
        lblPtotal = new javax.swing.JLabel();
        lblPPRMetalica = new javax.swing.JLabel();
        lblAusente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtAusente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPuente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCariada = new javax.swing.JTextField();
        txtMetalica = new javax.swing.JTextField();
        txtExtraer = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtAcrilica = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtFracturadas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNormal = new javax.swing.JTextField();
        txtCorona = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDientesmalEstado = new javax.swing.JTextField();
        txtObturacionEfectuada = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();

        btnAusente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgAusente.png"))); // NOI18N
        btnAusente.setText("Ausente");
        btnAusente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAusenteActionPerformed(evt);
            }
        });
        menu.add(btnAusente);

        btnCariada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgPorOturar.png"))); // NOI18N
        btnCariada.setText("Cariada por Oturar");
        btnCariada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariadaActionPerformed(evt);
            }
        });
        menu.add(btnCariada);

        btnExtraer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgExtraer.png"))); // NOI18N
        btnExtraer.setText("Por Extraer");
        btnExtraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraerActionPerformed(evt);
            }
        });
        menu.add(btnExtraer);

        btnFracturada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgFracturada.png"))); // NOI18N
        btnFracturada.setText("Fracturada");
        btnFracturada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFracturadaActionPerformed(evt);
            }
        });
        menu.add(btnFracturada);

        btnEfectuada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgObturacionEfectuada.png"))); // NOI18N
        btnEfectuada.setText("Obturación Efectuada");
        btnEfectuada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectuadaActionPerformed(evt);
            }
        });
        menu.add(btnEfectuada);

        btnCorona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgCorona.png"))); // NOI18N
        btnCorona.setText("Corona");
        btnCorona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoronaActionPerformed(evt);
            }
        });
        menu.add(btnCorona);

        btnPuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgPuente.png"))); // NOI18N
        btnPuente.setText("Puente");
        btnPuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuenteActionPerformed(evt);
            }
        });
        menu.add(btnPuente);

        btnMetalica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgPPRMetalica.png"))); // NOI18N
        btnMetalica.setText("PPR Metalica");
        btnMetalica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetalicaActionPerformed(evt);
            }
        });
        menu.add(btnMetalica);

        btnAcrilica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgPPRAcrilica.png"))); // NOI18N
        btnAcrilica.setText("PPR Acrilica");
        btnAcrilica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcrilicaActionPerformed(evt);
            }
        });
        menu.add(btnAcrilica);

        btnTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgPTotal.png"))); // NOI18N
        btnTotal.setText("P Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        menu.add(btnTotal);

        btnNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/icon/imgNormal.png"))); // NOI18N
        btnNormal.setText("Normal");
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });
        menu.add(btnNormal);

        setTitle("Odontograma");

        jLabel1.setText("N° Orden :");

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

        jLabel2.setText("Fecha");

        FechaOdontograma.setDateFormatString("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");

        jLabel3.setText("Nombres :");

        txtNombre.setEditable(false);

        jLabel4.setText("Edad:");

        txtEdad.setEditable(false);

        jLabel5.setText("Sexo :");

        txtSexo.setEditable(false);

        jLabel6.setText("Empresa :");

        txtEmpresa.setEditable(false);

        jLabel7.setText("Contrata :");

        txtContrata.setEditable(false);

        jLabel8.setText("años");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Odontograma", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl11.setToolTipText("11");
        lbl11.setComponentPopupMenu(menu);
        lbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl11MousePressed(evt);
            }
        });

        lbl44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl44.setToolTipText("44");
        lbl44.setComponentPopupMenu(menu);
        lbl44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl44MousePressed(evt);
            }
        });

        lbl14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl14.setToolTipText("14");
        lbl14.setComponentPopupMenu(menu);
        lbl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl14MousePressed(evt);
            }
        });

        lbl36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl36.setToolTipText("36");
        lbl36.setComponentPopupMenu(menu);
        lbl36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl36MousePressed(evt);
            }
        });

        lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl15.setToolTipText("15");
        lbl15.setComponentPopupMenu(menu);
        lbl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl15MousePressed(evt);
            }
        });

        lbl32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl32.setToolTipText("32");
        lbl32.setComponentPopupMenu(menu);
        lbl32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl32MousePressed(evt);
            }
        });

        lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl12.setToolTipText("12");
        lbl12.setComponentPopupMenu(menu);
        lbl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl12MousePressed(evt);
            }
        });

        lbl38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl38.setToolTipText("38");
        lbl38.setComponentPopupMenu(menu);
        lbl38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl38MousePressed(evt);
            }
        });

        lbl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl13.setToolTipText("13");
        lbl13.setComponentPopupMenu(menu);
        lbl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl13MousePressed(evt);
            }
        });

        lbl37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl37.setToolTipText("37");
        lbl37.setComponentPopupMenu(menu);
        lbl37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl37MousePressed(evt);
            }
        });

        lbl28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl28.setToolTipText("28");
        lbl28.setComponentPopupMenu(menu);
        lbl28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl28MousePressed(evt);
            }
        });

        lbl24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl24.setToolTipText("24");
        lbl24.setComponentPopupMenu(menu);
        lbl24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl24MousePressed(evt);
            }
        });

        lbl34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl34.setToolTipText("34");
        lbl34.setComponentPopupMenu(menu);
        lbl34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl34MousePressed(evt);
            }
        });

        lbl35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl35.setToolTipText("35");
        lbl35.setComponentPopupMenu(menu);
        lbl35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl35MousePressed(evt);
            }
        });

        lbl45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl45.setToolTipText("45");
        lbl45.setComponentPopupMenu(menu);
        lbl45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl45MousePressed(evt);
            }
        });

        lbl27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl27.setToolTipText("27");
        lbl27.setComponentPopupMenu(menu);
        lbl27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl27MousePressed(evt);
            }
        });

        lbl26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl26.setToolTipText("26");
        lbl26.setComponentPopupMenu(menu);
        lbl26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl26MousePressed(evt);
            }
        });

        lbl25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl25.setToolTipText("25");
        lbl25.setComponentPopupMenu(menu);
        lbl25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl25MousePressed(evt);
            }
        });

        lbl21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl21.setToolTipText("21");
        lbl21.setComponentPopupMenu(menu);
        lbl21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl21MousePressed(evt);
            }
        });

        lbl46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl46.setToolTipText("46");
        lbl46.setComponentPopupMenu(menu);
        lbl46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl46MousePressed(evt);
            }
        });

        lbl47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl47.setToolTipText("47");
        lbl47.setComponentPopupMenu(menu);
        lbl47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl47MousePressed(evt);
            }
        });

        lbl48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl48.setToolTipText("48");
        lbl48.setComponentPopupMenu(menu);
        lbl48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl48MousePressed(evt);
            }
        });

        lbl41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl41.setToolTipText("41");
        lbl41.setComponentPopupMenu(menu);
        lbl41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl41MousePressed(evt);
            }
        });

        lbl42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl42.setToolTipText("42");
        lbl42.setComponentPopupMenu(menu);
        lbl42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl42MousePressed(evt);
            }
        });

        lbl43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl43.setToolTipText("43");
        lbl43.setComponentPopupMenu(menu);
        lbl43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl43MousePressed(evt);
            }
        });

        lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl18.setToolTipText("18");
        lbl18.setComponentPopupMenu(menu);
        lbl18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl18MousePressed(evt);
            }
        });

        lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl17.setToolTipText("17");
        lbl17.setComponentPopupMenu(menu);
        lbl17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl17MousePressed(evt);
            }
        });

        lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl16.setToolTipText("16");
        lbl16.setComponentPopupMenu(menu);
        lbl16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl16MousePressed(evt);
            }
        });

        lbl23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl23.setToolTipText("23");
        lbl23.setComponentPopupMenu(menu);
        lbl23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl23MousePressed(evt);
            }
        });

        lbl31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl31.setToolTipText("31");
        lbl31.setComponentPopupMenu(menu);
        lbl31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl31MousePressed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setComponentPopupMenu(menu);

        lbl22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl22.setToolTipText("22");
        lbl22.setComponentPopupMenu(menu);
        lbl22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl22MousePressed(evt);
            }
        });

        lbl33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lbl33.setToolTipText("33");
        lbl33.setComponentPopupMenu(menu);
        lbl33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl33MousePressed(evt);
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
                        .addComponent(lbl18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl11)
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl38))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl41)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl18)
                            .addComponent(lbl17)
                            .addComponent(lbl16)
                            .addComponent(lbl15)
                            .addComponent(lbl14)
                            .addComponent(lbl13)
                            .addComponent(lbl12)
                            .addComponent(lbl11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl48)
                            .addComponent(lbl47)
                            .addComponent(lbl46)
                            .addComponent(lbl45)
                            .addComponent(lbl44)
                            .addComponent(lbl43)
                            .addComponent(lbl42)
                            .addComponent(lbl41)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl21)
                            .addComponent(lbl22)
                            .addComponent(lbl23)
                            .addComponent(lbl24)
                            .addComponent(lbl25)
                            .addComponent(lbl26)
                            .addComponent(lbl27)
                            .addComponent(lbl28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl31)
                            .addComponent(lbl32)
                            .addComponent(lbl33)
                            .addComponent(lbl34)
                            .addComponent(lbl35)
                            .addComponent(lbl36)
                            .addComponent(lbl37)
                            .addComponent(lbl38)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Leyenda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblPorExtraer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgExtraer.png"))); // NOI18N
        lblPorExtraer.setText("Por Extraer");

        lblFracturada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgFracturada.png"))); // NOI18N
        lblFracturada.setText("Fracturada");

        lblCariadaOturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPorOturar.png"))); // NOI18N
        lblCariadaOturar.setText("Cariada por Oturar");

        lblPPRAcrilica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPPRAcrilica.png"))); // NOI18N
        lblPPRAcrilica.setText("P.P.R. Acrilica");

        lblPuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPuente.png"))); // NOI18N
        lblPuente.setText("Puente");

        lblCorona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgCorona.png"))); // NOI18N
        lblCorona.setText("Corona");

        lblObturacionEfectuada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgObturacionEfectuada.png"))); // NOI18N
        lblObturacionEfectuada.setText("Obturación Efectuada");

        lblNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png"))); // NOI18N
        lblNormal.setText("Normal");

        lblPtotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPTotal.png"))); // NOI18N
        lblPtotal.setText("P. Total");

        lblPPRMetalica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPPRMetalica.png"))); // NOI18N
        lblPPRMetalica.setText("P.P.R. Metalica");

        lblAusente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgAusente.png"))); // NOI18N
        lblAusente.setText("Ausente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPuente)
                    .addComponent(lblAusente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPPRMetalica)
                    .addComponent(lblCariadaOturar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPPRAcrilica)
                    .addComponent(lblPorExtraer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFracturada)
                    .addComponent(lblPtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObturacionEfectuada)
                    .addComponent(lblNormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCorona)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAusente)
                    .addComponent(lblCariadaOturar)
                    .addComponent(lblPorExtraer)
                    .addComponent(lblFracturada)
                    .addComponent(lblObturacionEfectuada)
                    .addComponent(lblCorona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuente)
                    .addComponent(lblPPRAcrilica)
                    .addComponent(lblPPRMetalica)
                    .addComponent(lblPtotal)
                    .addComponent(lblNormal))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        txtAusente.setText("0");
        txtAusente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAusenteFocusLost(evt);
            }
        });

        jLabel11.setText("Ausente :");

        jLabel12.setText("Puente :");

        txtPuente.setText("0");
        txtPuente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPuenteFocusLost(evt);
            }
        });

        jLabel13.setText("P.P.R. Metalica :");

        jLabel14.setText("Cariada por oturar :");

        txtCariada.setText("0");
        txtCariada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCariadaFocusLost(evt);
            }
        });

        txtMetalica.setText("0");
        txtMetalica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMetalicaFocusLost(evt);
            }
        });

        txtExtraer.setText("0");
        txtExtraer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExtraerFocusLost(evt);
            }
        });

        jLabel15.setText("Por Extraer :");

        jLabel16.setText("P.P.R Acrilica :");

        txtAcrilica.setText("0");
        txtAcrilica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcrilicaFocusLost(evt);
            }
        });

        jLabel17.setText("P. Total :");

        jLabel18.setText("Fracturada :");

        txtTotal.setText("0");
        txtTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalFocusLost(evt);
            }
        });

        txtFracturadas.setText("0");
        txtFracturadas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFracturadasFocusLost(evt);
            }
        });

        jLabel19.setText("Normal :");

        txtNormal.setText("0");
        txtNormal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNormalFocusLost(evt);
            }
        });

        txtCorona.setText("0");
        txtCorona.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCoronaFocusLost(evt);
            }
        });

        jLabel20.setText("Corona :");

        jLabel21.setText("Dientes en mal Estado :");

        txtDientesmalEstado.setText("0");
        txtDientesmalEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDientesmalEstadoFocusLost(evt);
            }
        });

        txtObturacionEfectuada.setText("0");
        txtObturacionEfectuada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObturacionEfectuadaFocusLost(evt);
            }
        });

        jLabel32.setText("Obturación Efectuada :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAusente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCariada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMetalica, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExtraer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAcrilica, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFracturadas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorona, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtObturacionEfectuada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDientesmalEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtObturacionEfectuada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtDientesmalEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtCorona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtFracturadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(txtExtraer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtAcrilica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtCariada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtMetalica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtAusente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtPuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGrabar.setText("Agregar/Actualizar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jLabel37.setText("Observaciones :");

        txtObservaciones.setText("NINGUNA");
        txtObservaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtObservacionesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacionesFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar)
                        .addGap(2, 2, 2)
                        .addComponent(btnLimpiar)))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGrabar)
                    .addComponent(jLabel37)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jtOdontogramas.addTab("Odontograma Adultos", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(txtNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrata)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jtOdontogramas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(FechaOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jtOdontogramas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl11MousePressed
        Object o = evt.getSource();
        if (o == lbl11) {
            diente = lbl11;
        }
        lbl11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl11MousePressed

    private void lbl44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl44MousePressed
        Object o = evt.getSource();
        if (o == lbl44) {
            diente = lbl44;
        }
        lbl44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl44MousePressed

    private void lbl14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl14MousePressed
        Object o = evt.getSource();
        if (o == lbl14) {
            diente = lbl14;
        }
        lbl14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl14MousePressed

    private void lbl36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl36MousePressed
        Object o = evt.getSource();
        if (o == lbl36) {
            diente = lbl36;
        }
        lbl36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl36MousePressed

    private void lbl15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl15MousePressed
        Object o = evt.getSource();
        if (o == lbl15) {
            diente = lbl15;
        }
        lbl15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl15MousePressed

    private void lbl32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl32MousePressed
        Object o = evt.getSource();
        if (o == lbl32) {
            diente = lbl32;
        }
        lbl32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl32MousePressed

    private void lbl12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl12MousePressed
        Object o = evt.getSource();
        if (o == lbl12) {
            diente = lbl12;
        }
        lbl12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl12MousePressed

    private void lbl38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl38MousePressed
        Object o = evt.getSource();
        if (o == lbl38) {
            diente = lbl38;
        }
        lbl38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl38MousePressed

    private void lbl13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl13MousePressed
        Object o = evt.getSource();
        if (o == lbl13) {
            diente = lbl13;
        }
        lbl13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl13MousePressed

    private void lbl37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl37MousePressed
        Object o = evt.getSource();
        if (o == lbl37) {
            diente = lbl37;
        }
        lbl37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl37MousePressed

    private void lbl28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl28MousePressed
        Object o = evt.getSource();
        if (o == lbl28) {
            diente = lbl28;
        }
        lbl28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl28MousePressed

    private void lbl24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl24MousePressed
        Object o = evt.getSource();
        if (o == lbl24) {
            diente = lbl24;
        }
        lbl24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl24MousePressed

    private void lbl34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl34MousePressed
        Object o = evt.getSource();
        if (o == lbl34) {
            diente = lbl34;
        }
        lbl34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl34MousePressed

    private void lbl35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl35MousePressed
        Object o = evt.getSource();
        if (o == lbl35) {
            diente = lbl35;
        }
        lbl35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl35MousePressed

    private void lbl45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl45MousePressed
        Object o = evt.getSource();
        if (o == lbl45) {
            diente = lbl45;
        }
        lbl45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl45MousePressed

    private void lbl27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl27MousePressed
        Object o = evt.getSource();
        if (o == lbl27) {
            diente = lbl27;
        }
        lbl27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl27MousePressed

    private void lbl26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl26MousePressed
        Object o = evt.getSource();
        if (o == lbl26) {
            diente = lbl26;
        }
        lbl26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl26MousePressed

    private void lbl25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl25MousePressed
        Object o = evt.getSource();
        if (o == lbl25) {
            diente = lbl25;
        }
        lbl25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl25MousePressed

    private void lbl21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl21MousePressed
        Object o = evt.getSource();
        if (o == lbl21) {
            diente = lbl21;
        }
        lbl21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl21MousePressed

    private void lbl46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl46MousePressed
        Object o = evt.getSource();
        if (o == lbl46) {
            diente = lbl46;
        }
        lbl46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl46MousePressed

    private void lbl47MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl47MousePressed
        Object o = evt.getSource();
        if (o == lbl47) {
            diente = lbl47;
        }
        lbl47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl47MousePressed

    private void lbl48MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl48MousePressed
        Object o = evt.getSource();
        if (o == lbl48) {
            diente = lbl48;
        }
        lbl48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl48MousePressed

    private void lbl41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl41MousePressed
        Object o = evt.getSource();
        if (o == lbl41) {
            diente = lbl41;
        }
        lbl41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl41MousePressed

    private void lbl42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl42MousePressed
        Object o = evt.getSource();
        if (o == lbl42) {
            diente = lbl42;
        }
        lbl42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl42MousePressed

    private void lbl43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl43MousePressed
        Object o = evt.getSource();
        if (o == lbl43) {
            diente = lbl43;
        }
        lbl43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl43MousePressed

    private void lbl18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl18MousePressed
        Object o = evt.getSource();
        if (o == lbl18) {
            diente = lbl18;
        }
        lbl18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl18MousePressed

    private void lbl17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl17MousePressed
        Object o = evt.getSource();
        if (o == lbl17) {
            diente = lbl17;
        }
        lbl17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl17MousePressed

    private void lbl16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl16MousePressed
        Object o = evt.getSource();
        if (o == lbl16) {
            diente = lbl16;
        }
        lbl16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl16MousePressed

    private void lbl23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl23MousePressed
        Object o = evt.getSource();
        if (o == lbl23) {
            diente = lbl23;
        }
        lbl23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl23MousePressed

    private void lbl31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl31MousePressed
        Object o = evt.getSource();
        if (o == lbl31) {
            diente = lbl31;
        }
        lbl31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl31MousePressed

    private void lbl22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl22MousePressed
        Object o = evt.getSource();
        if (o == lbl22) {
            diente = lbl22;
        }
        lbl22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl22MousePressed

    private void lbl33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl33MousePressed
        Object o = evt.getSource();
        if (o == lbl33) {
            diente = lbl33;
        }
        lbl33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
    }//GEN-LAST:event_lbl33MousePressed

    private void btnAusenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAusenteActionPerformed
       oDon.Ausente(diente);
    }//GEN-LAST:event_btnAusenteActionPerformed

    private void btnCariadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariadaActionPerformed
        oDon.Cariada(diente);
    }//GEN-LAST:event_btnCariadaActionPerformed

    private void btnExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraerActionPerformed
        oDon.Extraer(diente);
    }//GEN-LAST:event_btnExtraerActionPerformed

    private void btnFracturadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFracturadaActionPerformed
        oDon.Fracturada(diente);
    }//GEN-LAST:event_btnFracturadaActionPerformed

    private void btnEfectuadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectuadaActionPerformed
        oDon.Obturacion(diente);
    }//GEN-LAST:event_btnEfectuadaActionPerformed

    private void btnCoronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoronaActionPerformed
        oDon.Corona(diente);
    }//GEN-LAST:event_btnCoronaActionPerformed

    private void btnPuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuenteActionPerformed
        oDon.Puente(diente);
    }//GEN-LAST:event_btnPuenteActionPerformed

    private void btnMetalicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetalicaActionPerformed
      oDon.Metalica(diente);
    }//GEN-LAST:event_btnMetalicaActionPerformed

    private void btnAcrilicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcrilicaActionPerformed
      oDon.Acrilica(diente);
    }//GEN-LAST:event_btnAcrilicaActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        oDon.Total(diente);
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
       oDon.Normal(diente);
    }//GEN-LAST:event_btnNormalActionPerformed
public static com.toedter.calendar.JDateChooser FechaNacimiento;
    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
       FechaNacimiento = new com.toedter.calendar.JDateChooser();
       if(OrdenExiste()){
           EditarLO();
           Fecha();
       }else{
            Editar();
            Fecha();
       }
       
    }//GEN-LAST:event_txtNordenActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       if(!txtNorden.getText().isEmpty()){
        oDon.LimpiarLO();
        oDon.OValidarLO();
        FechaNacimiento.setDate(null);
        FechaOdontograma.setDate(null);
        txtNorden.setEditable(true);
        txtNorden.requestFocus();
       }else{oDon.LimpiarLO();oDon.OValidarLO();txtNorden.requestFocus();}
              
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if(OrdenExiste()){
            ActualizarLO();
        }else{
             AgregarLO();
        }
       
    }//GEN-LAST:event_btnGrabarActionPerformed
   private boolean imprimir(){
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Odontograma_lo.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  JasperPrintManager.printReport(jasperPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma1.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
    private void txtAusenteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAusenteFocusLost
        if(txtAusente.getText().isEmpty()){txtAusente.setText("0");}
    }//GEN-LAST:event_txtAusenteFocusLost

    private void txtPuenteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPuenteFocusLost
        if(txtPuente.getText().isEmpty()){txtPuente.setText("0");}
    }//GEN-LAST:event_txtPuenteFocusLost

    private void txtCariadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCariadaFocusLost
        if(txtCariada.getText().isEmpty()){txtCariada.setText("0");}
    }//GEN-LAST:event_txtCariadaFocusLost

    private void txtMetalicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMetalicaFocusLost
        if(txtMetalica.getText().isEmpty()){txtMetalica.setText("0");}
    }//GEN-LAST:event_txtMetalicaFocusLost

    private void txtExtraerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExtraerFocusLost
        if(txtExtraer.getText().isEmpty()){txtExtraer.setText("0");}
    }//GEN-LAST:event_txtExtraerFocusLost

    private void txtAcrilicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcrilicaFocusLost
       if(txtAcrilica.getText().isEmpty()){txtAcrilica.setText("0");}
    }//GEN-LAST:event_txtAcrilicaFocusLost

    private void txtFracturadasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFracturadasFocusLost
       if(txtFracturadas.getText().isEmpty()){txtFracturadas.setText("0");}
    }//GEN-LAST:event_txtFracturadasFocusLost

    private void txtTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusLost
        if(txtTotal.getText().isEmpty()){txtTotal.setText("0");}
    }//GEN-LAST:event_txtTotalFocusLost

    private void txtCoronaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCoronaFocusLost
        if(txtCorona.getText().isEmpty()){txtCorona.setText("0");}
    }//GEN-LAST:event_txtCoronaFocusLost

    private void txtNormalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNormalFocusLost
        if(txtNormal.getText().isEmpty()){txtNormal.setText("0");}
    }//GEN-LAST:event_txtNormalFocusLost

    private void txtObturacionEfectuadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObturacionEfectuadaFocusLost
        if(txtObturacionEfectuada.getText().isEmpty()){txtObturacionEfectuada.setText("0");}
    }//GEN-LAST:event_txtObturacionEfectuadaFocusLost

    private void txtDientesmalEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDientesmalEstadoFocusLost
       if(txtDientesmalEstado.getText().isEmpty()){txtDientesmalEstado.setText("0");}
    }//GEN-LAST:event_txtDientesmalEstadoFocusLost

    private void txtObservacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesFocusGained
        if(txtObservaciones.getText().equals("-")){
        txtObservaciones.setText("");
        }
    }//GEN-LAST:event_txtObservacionesFocusGained

    private void txtObservacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesFocusLost
        if(txtObservaciones.getText().isEmpty()) {
            txtObservaciones.setText("-");
        }
    }//GEN-LAST:event_txtObservacionesFocusLost

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenKeyTyped
 
    private void AgregarLO(){
         if(!txtNorden.getText().isEmpty()){
        if(! OrdenExiste()){
        if(validar()){          
            String Insert ="INSERT INTO odontograma_lo(";
            String Values ="VALUES ('";
              Insert +="n_orden, fecha_od,edad_od";
              Values += txtNorden.getText().toString()+"','"+FechaOdontograma.getDate()+"','"+txtEdad.getText().toString()+"'";
              if(!lbl18.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_18";
              Values +=",'"+lbl18.getIcon().toString()+"'";
              }
              if(!lbl17.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_17";
              Values +=",'"+lbl17.getIcon().toString()+"'";
              }
               if(!lbl16.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_16";
              Values +=",'"+lbl16.getIcon().toString()+"'";
               }
                if(!lbl15.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_15";
              Values +=",'"+lbl15.getIcon().toString()+"'";
                }
               if(!lbl14.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_14";
              Values +=",'"+lbl14.getIcon().toString()+"'";
               }
                if(!lbl13.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_13";
              Values +=",'"+lbl13.getIcon().toString()+"'";
                }
                 if(!lbl12.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_12";
              Values +=",'"+lbl12.getIcon().toString()+"'";
                 }
               if(!lbl11.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_11";
              Values +=",'"+lbl11.getIcon().toString()+"'";
               }
              if(!lbl21.getIcon().toString().equals(lblNormal.getIcon().toString())){ 
              Insert +=",lbl_21";
              Values +=",'"+lbl21.getIcon().toString()+"'";
              }
              if(!lbl22.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_22";
              Values +=",'"+lbl22.getIcon().toString()+"'";
              }
              if(!lbl23.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_23";
              Values +=",'"+lbl23.getIcon().toString()+"'";
              }
              if(!lbl24.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_24";
              Values +=",'"+lbl24.getIcon().toString()+"'";
              }
              if(!lbl25.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_25";
              Values +=",'"+lbl25.getIcon().toString()+"'";
              }
              if(!lbl26.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_26";
              Values +=",'"+lbl26.getIcon().toString()+"'";
              }
              if(!lbl27.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_27";
              Values +=",'"+lbl27.getIcon().toString()+"'";
              }
              if(!lbl28.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_28";
              Values +=",'"+lbl28.getIcon().toString()+"'";
              }
              if(!lbl31.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_31";
              Values +=",'"+lbl31.getIcon().toString()+"'";
              }
              if(!lbl32.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_32";
              Values +=",'"+lbl32.getIcon().toString()+"'";
              }
              if(!lbl33.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_33";
              Values +=",'"+lbl33.getIcon().toString()+"'";
              }
              if(!lbl34.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_34";
              Values +=",'"+lbl34.getIcon().toString()+"'";
              }
              if(!lbl35.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_35";
              Values +=",'"+lbl35.getIcon().toString()+"'";
              }
              if(!lbl36.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_36";
              Values +=",'"+lbl36.getIcon().toString()+"'";
              }
              if(!lbl37.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_37";
              Values +=",'"+lbl37.getIcon().toString()+"'";
              }
              if(!lbl38.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_38";
              Values +=",'"+lbl38.getIcon().toString()+"'";
              }
              if(!lbl41.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_41";
              Values +=",'"+lbl41.getIcon().toString()+"'";
              }
              if(!lbl42.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_42";
              Values +=",'"+lbl42.getIcon().toString()+"'";
              }
              if(!lbl43.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_43";
              Values +=",'"+lbl43.getIcon().toString()+"'";
              }
              if(!lbl44.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_44";
              Values +=",'"+lbl44.getIcon().toString()+"'";
              }
              if(!lbl45.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_45";
              Values +=",'"+lbl45.getIcon().toString()+"'";
              }
              if(!lbl46.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_46";
              Values +=",'"+lbl46.getIcon().toString()+"'";
              }
              if(!lbl47.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_47";
              Values +=",'"+lbl47.getIcon().toString()+"'";
              }
              if(!lbl48.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_48";
              Values +=",'"+lbl48.getIcon().toString()+"'";
              }
              Insert +=",txtpiezasmalestado";
              Values +=",'"+txtDientesmalEstado.getText().toString()+"'";
              Insert +=",txtausentes";
              Values +=",'"+txtAusente.getText().toString()+"'";
              Insert +=",txtcariadasoturar";
              Values +=",'"+txtCariada.getText().toString()+"'";
              Insert +=",txtporextraer";
              Values +=",'"+txtExtraer.getText().toString()+"'";
              Insert +=",txtfracturada";
              Values +=",'"+txtFracturadas.getText().toString()+"'";
              Insert +=",txtobturacionesefectuadas";
              Values +=",'"+txtObturacionEfectuada.getText().toString()+"'";
              Insert +=",txtpuentes";
              Values +=",'"+txtPuente.getText().toString()+"'";
              Insert +=",txtpprmetalicas";
              Values +=",'"+txtMetalica.getText().toString()+"'";
              Insert +=",txtppracrilicas";
              Values +=",'"+txtAcrilica.getText().toString()+"'";
              Insert +=",txtptotal";
              Values +=",'"+txtTotal.getText().toString()+"'";
              Insert +=",txtnormales";
              Values +=",'"+txtNormal.getText().toString()+"'";
              Insert +=",txtcoronas";
              Values +=",'"+txtCorona.getText().toString()+"'";
              Insert +=",txtobservaciones)";
              Values +=",'"+txtObservaciones.getText().toString()+"')";
       
       
                
             if (oConn.FnBoolQueryExecuteUpdate(Insert + Values)){
                imprimir();
                oDon.LimpiarLO();
                oDon.OValidarLO();
                oFunc.SubSistemaMensajeInformacion("Se levanto la observación");
                FechaNacimiento.setDate(null);
                FechaOdontograma.setDate(null);
                txtNorden.setEditable(true);
                txtNorden.requestFocus();
                
              }else {oFunc.SubSistemaMensajeError("No se pudo Agregar Registro Intente Nuevamente");
             }
          
       }
        }          
       }  
    }
    private void ActualizarLO(){
        String sCodigo=txtNorden.getText();
       String Insert ="UPDATE odontograma_lo "
               + "SET n_orden="+txtNorden.getText().toString()+", fecha_od='"+FechaOdontograma.getDate()+"',"
               + "edad_od='"+txtEdad.getText().toString()+"'";
              if(!lbl18.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_18='"+lbl18.getIcon().toString()+"'";
              }
              if(!lbl17.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_17='"+lbl17.getIcon().toString()+"'";
              }
               if(!lbl16.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_16='"+lbl16.getIcon().toString()+"'";
               }
                if(!lbl15.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_15='"+lbl15.getIcon().toString()+"'";
                }
               if(!lbl14.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_14='"+lbl14.getIcon().toString()+"'";
               }
                if(!lbl13.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_13='"+lbl13.getIcon().toString()+"'";
                }
                 if(!lbl12.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_12='"+lbl12.getIcon().toString()+"'";
                 }
               if(!lbl11.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_11='"+lbl11.getIcon().toString()+"'";
               }
              if(!lbl21.getIcon().toString().equals(lblNormal.getIcon().toString())){ 
              Insert +=",lbl_21='"+lbl21.getIcon().toString()+"'";
              }
              if(!lbl22.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_22='"+lbl22.getIcon().toString()+"'";
              }
              if(!lbl23.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_23='"+lbl23.getIcon().toString()+"'";
              }
              if(!lbl24.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_24='"+lbl24.getIcon().toString()+"'";
              }
              if(!lbl25.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_25='"+lbl25.getIcon().toString()+"'";
              }
              if(!lbl26.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_26='"+lbl26.getIcon().toString()+"'";
              }
              if(!lbl27.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_27='"+lbl27.getIcon().toString()+"'";
              }
              if(!lbl28.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_28='"+lbl28.getIcon().toString()+"'";
              }
              if(!lbl31.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_31='"+lbl31.getIcon().toString()+"'";
              }
              if(!lbl32.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_32='"+lbl32.getIcon().toString()+"'";
              }
              if(!lbl33.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_33='"+lbl33.getIcon().toString()+"'";
              }
              if(!lbl34.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_34='"+lbl34.getIcon().toString()+"'";
              }
              if(!lbl35.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_35='"+lbl35.getIcon().toString()+"'";
              }
              if(!lbl36.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_36='"+lbl36.getIcon().toString()+"'";
              }
              if(!lbl37.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_37='"+lbl37.getIcon().toString()+"'";
              }
              if(!lbl38.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_38='"+lbl38.getIcon().toString()+"'";
              }
              if(!lbl41.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_41='"+lbl41.getIcon().toString()+"'";
              }
              if(!lbl42.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_42='"+lbl42.getIcon().toString()+"'";
              }
              if(!lbl43.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_43='"+lbl43.getIcon().toString()+"'";
              }
              if(!lbl44.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_44='"+lbl44.getIcon().toString()+"'";
              }
              if(!lbl45.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_45='"+lbl45.getIcon().toString()+"'";
              }
              if(!lbl46.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_46='"+lbl46.getIcon().toString()+"'";
              }
              if(!lbl47.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_47='"+lbl47.getIcon().toString()+"'";
              }
              if(!lbl48.getIcon().toString().equals(lblNormal.getIcon().toString())){
              Insert +=",lbl_48='"+lbl48.getIcon().toString()+"'";
              }
              Insert +=",txtpiezasmalestado='"+txtDientesmalEstado.getText().toString()+"'";
              Insert +=",txtausentes='"+txtAusente.getText().toString()+"'";
              Insert +=",txtcariadasoturar='"+txtCariada.getText().toString()+"'";
              Insert +=",txtporextraer='"+txtExtraer.getText().toString()+"'";
              Insert +=",txtfracturada='"+txtFracturadas.getText().toString()+"'";
              Insert +=",txtobturacionesefectuadas='"+txtObturacionEfectuada.getText().toString()+"'";
              Insert +=",txtpuentes='"+txtPuente.getText().toString()+"'";
              Insert +=",txtpprmetalicas='"+txtMetalica.getText().toString()+"'";
              Insert +=",txtppracrilicas='"+txtAcrilica.getText().toString()+"'";
              Insert +=",txtptotal='"+txtTotal.getText().toString()+"'";
              Insert +=",txtnormales='"+txtNormal.getText().toString()+"'";
              Insert +=",txtcoronas='"+txtCorona.getText().toString()+"'";
              Insert +=",txtobservaciones='"+txtObservaciones.getText().toString()+"'";
              Insert +=" WHERE n_orden='" + sCodigo + "'";
             if (oConn.FnBoolQueryExecuteUpdate(Insert)){
                imprimir();
                oDon.LimpiarLO();
                oDon.OValidarLO();
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                FechaNacimiento.setDate(null);
                FechaOdontograma.setDate(null);
                txtNorden.setEditable(true);
                txtNorden.requestFocus();
               
              }else {oFunc.SubSistemaMensajeError("No se pudo Agregar Registro Intente Nuevamente");
             }
    }
    private void Editar(){
        if(!txtNorden.getText().isEmpty()){
       String Sql="SELECT d.nombres_pa||' '||d.apellidos_pa as nombre ,d.sexo_pa,\n" +
            "       n.razon_empresa,n.razon_contrata,\n" +
            "       o.fecha_od, o.edad_od, o.lbl_18, o.lbl_17, o.lbl_16, o.lbl_15, \n" +
            "       o.lbl_14, o.lbl_13, o.lbl_12, o.lbl_11, o.lbl_21, o.lbl_22, o.lbl_23, o.lbl_24, \n" +
            "       o.lbl_25, o.lbl_26, o.lbl_27, o.lbl_28, o.lbl_31, o.lbl_32, o.lbl_33, o.lbl_34, \n" +
            "       o.lbl_35, o.lbl_36, o.lbl_37, o.lbl_38, o.lbl_41, o.lbl_42, o.lbl_43, o.lbl_44, \n" +
            "       o.lbl_45, o.lbl_46, o.lbl_47, o.lbl_48, o.txtpiezasmalestado, o.txtausentes, \n" +
            "       o.txtcariadasoturar, o.txtporextraer, o.txtfracturada, o.txtobturacionesefectuadas, \n" +
            "       o.txtpuentes, o.txtpprmetalicas, o.txtppracrilicas, o.txtptotal, o.txtnormales, \n" +
            "       o.txtcoronas, o.txtobservaciones\n" +
            "  FROM datos_paciente AS d \n" +
            "  INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) \n" +
            "  INNER JOIN odontograma AS o ON (o.n_orden = n.n_orden) 	\n" +
            "  WHERE n.n_orden ='"+txtNorden.getText().toString() +"'";
         oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombre.setText(oConn.setResult.getString("nombre"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa")); 
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));    
                        txtSexo.setText(oConn.setResult.getString("sexo_pa").equals("M")?"MASCULINO" : "FEMENINO");
//                        FechaOdontograma.setDate(oConn.setResult.getDate("fecha_od"));
                        txtEdad.setText(oConn.setResult.getString("edad_od"));
                        String l18=oConn.setResult.getString("lbl_18");
                        String l17=oConn.setResult.getString("lbl_17");
                        String l16=oConn.setResult.getString("lbl_16");
                        String l15=oConn.setResult.getString("lbl_15");
                        String l14=oConn.setResult.getString("lbl_14");
                        String l13=oConn.setResult.getString("lbl_13");
                        String l12=oConn.setResult.getString("lbl_12");
                        String l11=oConn.setResult.getString("lbl_11");
                        String l21=oConn.setResult.getString("lbl_21");
                        String l22=oConn.setResult.getString("lbl_22");
                        String l23=oConn.setResult.getString("lbl_23");
                        String l24=oConn.setResult.getString("lbl_24");
                        String l25=oConn.setResult.getString("lbl_25");
                        String l26=oConn.setResult.getString("lbl_26");
                        String l27=oConn.setResult.getString("lbl_27");
                        String l28=oConn.setResult.getString("lbl_28");
                        String l31=oConn.setResult.getString("lbl_31");
                        String l32=oConn.setResult.getString("lbl_32");
                        String l33=oConn.setResult.getString("lbl_33");
                        String l34=oConn.setResult.getString("lbl_34");
                        String l35=oConn.setResult.getString("lbl_35");
                        String l36=oConn.setResult.getString("lbl_36");
                        String l37=oConn.setResult.getString("lbl_37");
                        String l38=oConn.setResult.getString("lbl_38");
                        String l41=oConn.setResult.getString("lbl_41");
                        String l42=oConn.setResult.getString("lbl_42");
                        String l43=oConn.setResult.getString("lbl_43");
                        String l44=oConn.setResult.getString("lbl_44");
                        String l45=oConn.setResult.getString("lbl_45");
                        String l46=oConn.setResult.getString("lbl_46");
                        String l47=oConn.setResult.getString("lbl_47");
                        String l48=oConn.setResult.getString("lbl_48");
                        if(l18!= null){
                            lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource(l18.substring(31, l18.length()))));
                        }
                        if(l17!= null){
                            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource(l17.substring(31, l17.length()))));
                        }
                        if(l16!= null){
                            lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource(l16.substring(31, l16.length()))));
                        }
                        if(l15!= null){
                            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource(l15.substring(31, l15.length()))));
                        }
                        if(l14!= null){
                            lbl14.setIcon(new javax.swing.ImageIcon(getClass().getResource(l14.substring(31, l14.length()))));
                        }
                        if(l13!= null){
                            lbl13.setIcon(new javax.swing.ImageIcon(getClass().getResource(l13.substring(31, l13.length()))));
                        }
                        if(l12!= null){
                            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource(l12.substring(31, l12.length()))));
                        }
                        if(l11!= null){
                            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource(l11.substring(31, l11.length()))));
                        }
                        if(l21!= null){
                             lbl21.setIcon(new javax.swing.ImageIcon(getClass().getResource(l21.substring(31, l21.length()))));
                        }
                        if(l22!= null){
                            lbl22.setIcon(new javax.swing.ImageIcon(getClass().getResource(l22.substring(31, l22.length()))));
                        }
                        if(l23!= null){
                            lbl23.setIcon(new javax.swing.ImageIcon(getClass().getResource(l23.substring(31, l23.length()))));
                        }
                        if(l24!= null){
                            lbl24.setIcon(new javax.swing.ImageIcon(getClass().getResource(l24.substring(31, l24.length()))));
                        }
                        if(l25!= null){
                            lbl25.setIcon(new javax.swing.ImageIcon(getClass().getResource(l25.substring(31, l25.length()))));
                        }
                        if(l26!= null){
                            lbl26.setIcon(new javax.swing.ImageIcon(getClass().getResource(l26.substring(31, l26.length()))));
                        }
                        if(l27!= null){
                            lbl27.setIcon(new javax.swing.ImageIcon(getClass().getResource(l27.substring(31, l27.length()))));
                        }
                        if(l28!= null){
                            lbl28.setIcon(new javax.swing.ImageIcon(getClass().getResource(l28.substring(31, l28.length()))));
                        }
                        if(l31!= null){
                            lbl31.setIcon(new javax.swing.ImageIcon(getClass().getResource(l31.substring(31, l31.length()))));
                        }
                        if(l32!= null){
                             lbl32.setIcon(new javax.swing.ImageIcon(getClass().getResource(l32.substring(31, l32.length()))));
                        }
                        if(l33!= null){
                            lbl33.setIcon(new javax.swing.ImageIcon(getClass().getResource(l33.substring(31, l33.length()))));
                        }
                        if(l34!= null){
                            lbl34.setIcon(new javax.swing.ImageIcon(getClass().getResource(l34.substring(31, l34.length()))));
                        }
                        if(l35!= null){
                            lbl35.setIcon(new javax.swing.ImageIcon(getClass().getResource(l35.substring(31, l35.length()))));
                        }
                        if(l36!= null){
                             lbl36.setIcon(new javax.swing.ImageIcon(getClass().getResource(l36.substring(31, l36.length()))));
                        }
                        if(l37!= null){
                             lbl37.setIcon(new javax.swing.ImageIcon(getClass().getResource(l37.substring(31, l37.length()))));
                        }
                        if(l38!= null){
                            lbl38.setIcon(new javax.swing.ImageIcon(getClass().getResource(l38.substring(31, l38.length()))));
                        }
                        if(l41!= null){
                            lbl41.setIcon(new javax.swing.ImageIcon(getClass().getResource(l41.substring(31, l41.length()))));
                        }
                        if(l42!= null){
                            lbl42.setIcon(new javax.swing.ImageIcon(getClass().getResource(l42.substring(31, l42.length()))));
                        }
                        if(l43!= null){
                            lbl43.setIcon(new javax.swing.ImageIcon(getClass().getResource(l43.substring(31, l43.length()))));
                        }
                        if(l44!= null){
                            lbl44.setIcon(new javax.swing.ImageIcon(getClass().getResource(l44.substring(31, l44.length()))));
                        }
                        if(l45!= null){
                            lbl45.setIcon(new javax.swing.ImageIcon(getClass().getResource(l45.substring(31, l45.length()))));
                        }
                        if(l46!= null){
                            lbl46.setIcon(new javax.swing.ImageIcon(getClass().getResource(l46.substring(31, l46.length()))));
                        }
                        if(l47!= null){
                            lbl47.setIcon(new javax.swing.ImageIcon(getClass().getResource(l47.substring(31, l47.length()))));
                        }
                        if(l48!= null){
                            lbl48.setIcon(new javax.swing.ImageIcon(getClass().getResource(l48.substring(31, l48.length()))));
                        }
                        
                         
                        txtDientesmalEstado.setText(oConn.setResult.getString("txtpiezasmalestado"));
                        txtAusente.setText(oConn.setResult.getString("txtausentes"));
                        txtCariada.setText(oConn.setResult.getString("txtcariadasoturar"));
                        txtExtraer.setText(oConn.setResult.getString("txtporextraer"));
                        txtFracturadas.setText(oConn.setResult.getString("txtfracturada"));
                        txtObturacionEfectuada.setText(oConn.setResult.getString("txtobturacionesefectuadas"));
                        txtPuente.setText(oConn.setResult.getString("txtpuentes"));
                        txtMetalica.setText(oConn.setResult.getString("txtpprmetalicas"));
                        txtAcrilica.setText(oConn.setResult.getString("txtppracrilicas"));
                        txtTotal.setText(oConn.setResult.getString("txtptotal"));
                        txtNormal.setText(oConn.setResult.getString("txtnormales"));
                        txtCorona.setText(oConn.setResult.getString("txtcoronas"));
                        txtObservaciones.setText(oConn.setResult.getString("txtobservaciones"));
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Odontograma:" + ex.getMessage().toString());}
    
           }     
    }
    private void EditarLO(){
        if(!txtNorden.getText().isEmpty()){
       String Sql="SELECT d.nombres_pa||' '||d.apellidos_pa as nombre ,d.sexo_pa,\n" +
            "       n.razon_empresa,n.razon_contrata,\n" +
            "       o.fecha_od, o.edad_od, o.lbl_18, o.lbl_17, o.lbl_16, o.lbl_15, \n" +
            "       o.lbl_14, o.lbl_13, o.lbl_12, o.lbl_11, o.lbl_21, o.lbl_22, o.lbl_23, o.lbl_24, \n" +
            "       o.lbl_25, o.lbl_26, o.lbl_27, o.lbl_28, o.lbl_31, o.lbl_32, o.lbl_33, o.lbl_34, \n" +
            "       o.lbl_35, o.lbl_36, o.lbl_37, o.lbl_38, o.lbl_41, o.lbl_42, o.lbl_43, o.lbl_44, \n" +
            "       o.lbl_45, o.lbl_46, o.lbl_47, o.lbl_48, o.txtpiezasmalestado, o.txtausentes, \n" +
            "       o.txtcariadasoturar, o.txtporextraer, o.txtfracturada, o.txtobturacionesefectuadas, \n" +
            "       o.txtpuentes, o.txtpprmetalicas, o.txtppracrilicas, o.txtptotal, o.txtnormales, \n" +
            "       o.txtcoronas, o.txtobservaciones\n" +
            "  FROM datos_paciente AS d \n" +
            "  INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) \n" +
            "  INNER JOIN odontograma_lo AS o ON (o.n_orden = n.n_orden) 	\n" +
            "  WHERE n.n_orden ='"+txtNorden.getText().toString() +"'";
         oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombre.setText(oConn.setResult.getString("nombre"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa")); 
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));    
                        txtSexo.setText(oConn.setResult.getString("sexo_pa").equals("M")?"MASCULINO" : "FEMENINO");
//                        FechaOdontograma.setDate(oConn.setResult.getDate("fecha_od"));
                        txtEdad.setText(oConn.setResult.getString("edad_od"));
                        String l18=oConn.setResult.getString("lbl_18");
                        String l17=oConn.setResult.getString("lbl_17");
                        String l16=oConn.setResult.getString("lbl_16");
                        String l15=oConn.setResult.getString("lbl_15");
                        String l14=oConn.setResult.getString("lbl_14");
                        String l13=oConn.setResult.getString("lbl_13");
                        String l12=oConn.setResult.getString("lbl_12");
                        String l11=oConn.setResult.getString("lbl_11");
                        String l21=oConn.setResult.getString("lbl_21");
                        String l22=oConn.setResult.getString("lbl_22");
                        String l23=oConn.setResult.getString("lbl_23");
                        String l24=oConn.setResult.getString("lbl_24");
                        String l25=oConn.setResult.getString("lbl_25");
                        String l26=oConn.setResult.getString("lbl_26");
                        String l27=oConn.setResult.getString("lbl_27");
                        String l28=oConn.setResult.getString("lbl_28");
                        String l31=oConn.setResult.getString("lbl_31");
                        String l32=oConn.setResult.getString("lbl_32");
                        String l33=oConn.setResult.getString("lbl_33");
                        String l34=oConn.setResult.getString("lbl_34");
                        String l35=oConn.setResult.getString("lbl_35");
                        String l36=oConn.setResult.getString("lbl_36");
                        String l37=oConn.setResult.getString("lbl_37");
                        String l38=oConn.setResult.getString("lbl_38");
                        String l41=oConn.setResult.getString("lbl_41");
                        String l42=oConn.setResult.getString("lbl_42");
                        String l43=oConn.setResult.getString("lbl_43");
                        String l44=oConn.setResult.getString("lbl_44");
                        String l45=oConn.setResult.getString("lbl_45");
                        String l46=oConn.setResult.getString("lbl_46");
                        String l47=oConn.setResult.getString("lbl_47");
                        String l48=oConn.setResult.getString("lbl_48");
                        if(l18!= null){
                            lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource(l18.substring(31, l18.length()))));
                        }
                        if(l17!= null){
                            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource(l17.substring(31, l17.length()))));
                        }
                        if(l16!= null){
                            lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource(l16.substring(31, l16.length()))));
                        }
                        if(l15!= null){
                            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource(l15.substring(31, l15.length()))));
                        }
                        if(l14!= null){
                            lbl14.setIcon(new javax.swing.ImageIcon(getClass().getResource(l14.substring(31, l14.length()))));
                        }
                        if(l13!= null){
                            lbl13.setIcon(new javax.swing.ImageIcon(getClass().getResource(l13.substring(31, l13.length()))));
                        }
                        if(l12!= null){
                            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource(l12.substring(31, l12.length()))));
                        }
                        if(l11!= null){
                            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource(l11.substring(31, l11.length()))));
                        }
                        if(l21!= null){
                             lbl21.setIcon(new javax.swing.ImageIcon(getClass().getResource(l21.substring(31, l21.length()))));
                        }
                        if(l22!= null){
                            lbl22.setIcon(new javax.swing.ImageIcon(getClass().getResource(l22.substring(31, l22.length()))));
                        }
                        if(l23!= null){
                            lbl23.setIcon(new javax.swing.ImageIcon(getClass().getResource(l23.substring(31, l23.length()))));
                        }
                        if(l24!= null){
                            lbl24.setIcon(new javax.swing.ImageIcon(getClass().getResource(l24.substring(31, l24.length()))));
                        }
                        if(l25!= null){
                            lbl25.setIcon(new javax.swing.ImageIcon(getClass().getResource(l25.substring(31, l25.length()))));
                        }
                        if(l26!= null){
                            lbl26.setIcon(new javax.swing.ImageIcon(getClass().getResource(l26.substring(31, l26.length()))));
                        }
                        if(l27!= null){
                            lbl27.setIcon(new javax.swing.ImageIcon(getClass().getResource(l27.substring(31, l27.length()))));
                        }
                        if(l28!= null){
                            lbl28.setIcon(new javax.swing.ImageIcon(getClass().getResource(l28.substring(31, l28.length()))));
                        }
                        if(l31!= null){
                            lbl31.setIcon(new javax.swing.ImageIcon(getClass().getResource(l31.substring(31, l31.length()))));
                        }
                        if(l32!= null){
                             lbl32.setIcon(new javax.swing.ImageIcon(getClass().getResource(l32.substring(31, l32.length()))));
                        }
                        if(l33!= null){
                            lbl33.setIcon(new javax.swing.ImageIcon(getClass().getResource(l33.substring(31, l33.length()))));
                        }
                        if(l34!= null){
                            lbl34.setIcon(new javax.swing.ImageIcon(getClass().getResource(l34.substring(31, l34.length()))));
                        }
                        if(l35!= null){
                            lbl35.setIcon(new javax.swing.ImageIcon(getClass().getResource(l35.substring(31, l35.length()))));
                        }
                        if(l36!= null){
                             lbl36.setIcon(new javax.swing.ImageIcon(getClass().getResource(l36.substring(31, l36.length()))));
                        }
                        if(l37!= null){
                             lbl37.setIcon(new javax.swing.ImageIcon(getClass().getResource(l37.substring(31, l37.length()))));
                        }
                        if(l38!= null){
                            lbl38.setIcon(new javax.swing.ImageIcon(getClass().getResource(l38.substring(31, l38.length()))));
                        }
                        if(l41!= null){
                            lbl41.setIcon(new javax.swing.ImageIcon(getClass().getResource(l41.substring(31, l41.length()))));
                        }
                        if(l42!= null){
                            lbl42.setIcon(new javax.swing.ImageIcon(getClass().getResource(l42.substring(31, l42.length()))));
                        }
                        if(l43!= null){
                            lbl43.setIcon(new javax.swing.ImageIcon(getClass().getResource(l43.substring(31, l43.length()))));
                        }
                        if(l44!= null){
                            lbl44.setIcon(new javax.swing.ImageIcon(getClass().getResource(l44.substring(31, l44.length()))));
                        }
                        if(l45!= null){
                            lbl45.setIcon(new javax.swing.ImageIcon(getClass().getResource(l45.substring(31, l45.length()))));
                        }
                        if(l46!= null){
                            lbl46.setIcon(new javax.swing.ImageIcon(getClass().getResource(l46.substring(31, l46.length()))));
                        }
                        if(l47!= null){
                            lbl47.setIcon(new javax.swing.ImageIcon(getClass().getResource(l47.substring(31, l47.length()))));
                        }
                        if(l48!= null){
                            lbl48.setIcon(new javax.swing.ImageIcon(getClass().getResource(l48.substring(31, l48.length()))));
                        }
                        
                         
                        txtDientesmalEstado.setText(oConn.setResult.getString("txtpiezasmalestado"));
                        txtAusente.setText(oConn.setResult.getString("txtausentes"));
                        txtCariada.setText(oConn.setResult.getString("txtcariadasoturar"));
                        txtExtraer.setText(oConn.setResult.getString("txtporextraer"));
                        txtFracturadas.setText(oConn.setResult.getString("txtfracturada"));
                        txtObturacionEfectuada.setText(oConn.setResult.getString("txtobturacionesefectuadas"));
                        txtPuente.setText(oConn.setResult.getString("txtpuentes"));
                        txtMetalica.setText(oConn.setResult.getString("txtpprmetalicas"));
                        txtAcrilica.setText(oConn.setResult.getString("txtppracrilicas"));
                        txtTotal.setText(oConn.setResult.getString("txtptotal"));
                        txtNormal.setText(oConn.setResult.getString("txtnormales"));
                        txtCorona.setText(oConn.setResult.getString("txtcoronas"));
                        txtObservaciones.setText(oConn.setResult.getString("txtobservaciones"));
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Odontograma:" + ex.getMessage().toString());}
    
           }     
    }
    

public boolean OrdenExiste()
    {
        boolean bResultado=false;
        if(!txtNorden.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from odontograma_lo Where n_orden ="+txtNorden.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        }

void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaOdontograma.setDate(fechaDate);
}  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaOdontograma;
    private javax.swing.JMenuItem btnAcrilica;
    private javax.swing.JMenuItem btnAusente;
    private javax.swing.JMenuItem btnCariada;
    private javax.swing.JMenuItem btnCorona;
    private javax.swing.JMenuItem btnEfectuada;
    private javax.swing.JMenuItem btnExtraer;
    private javax.swing.JMenuItem btnFracturada;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JMenuItem btnMetalica;
    private javax.swing.JMenuItem btnNormal;
    private javax.swing.JMenuItem btnPuente;
    private javax.swing.JMenuItem btnTotal;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jtOdontogramas;
    public static javax.swing.JLabel lbl11;
    public static javax.swing.JLabel lbl12;
    public static javax.swing.JLabel lbl13;
    public static javax.swing.JLabel lbl14;
    public static javax.swing.JLabel lbl15;
    public static javax.swing.JLabel lbl16;
    public static javax.swing.JLabel lbl17;
    public static javax.swing.JLabel lbl18;
    public static javax.swing.JLabel lbl21;
    public static javax.swing.JLabel lbl22;
    public static javax.swing.JLabel lbl23;
    public static javax.swing.JLabel lbl24;
    public static javax.swing.JLabel lbl25;
    public static javax.swing.JLabel lbl26;
    public static javax.swing.JLabel lbl27;
    public static javax.swing.JLabel lbl28;
    public static javax.swing.JLabel lbl31;
    public static javax.swing.JLabel lbl32;
    public static javax.swing.JLabel lbl33;
    public static javax.swing.JLabel lbl34;
    public static javax.swing.JLabel lbl35;
    public static javax.swing.JLabel lbl36;
    public static javax.swing.JLabel lbl37;
    public static javax.swing.JLabel lbl38;
    public static javax.swing.JLabel lbl41;
    public static javax.swing.JLabel lbl42;
    public static javax.swing.JLabel lbl43;
    public static javax.swing.JLabel lbl44;
    public static javax.swing.JLabel lbl45;
    public static javax.swing.JLabel lbl46;
    public static javax.swing.JLabel lbl47;
    public static javax.swing.JLabel lbl48;
    public static javax.swing.JLabel lblAusente;
    public static javax.swing.JLabel lblCariadaOturar;
    public static javax.swing.JLabel lblCorona;
    public static javax.swing.JLabel lblFracturada;
    public static javax.swing.JLabel lblNormal;
    public static javax.swing.JLabel lblObturacionEfectuada;
    public static javax.swing.JLabel lblPPRAcrilica;
    public static javax.swing.JLabel lblPPRMetalica;
    public static javax.swing.JLabel lblPorExtraer;
    public static javax.swing.JLabel lblPtotal;
    public static javax.swing.JLabel lblPuente;
    private javax.swing.JPopupMenu menu;
    public static javax.swing.JTextField txtAcrilica;
    public static javax.swing.JTextField txtAusente;
    public static javax.swing.JTextField txtCariada;
    public static javax.swing.JTextField txtContrata;
    public static javax.swing.JTextField txtCorona;
    public static javax.swing.JTextField txtDientesmalEstado;
    public static javax.swing.JTextField txtEdad;
    public static javax.swing.JTextField txtEmpresa;
    public static javax.swing.JTextField txtExtraer;
    public static javax.swing.JTextField txtFracturadas;
    public static javax.swing.JTextField txtMetalica;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtNorden;
    public static javax.swing.JTextField txtNormal;
    private javax.swing.JTextField txtObservaciones;
    public static javax.swing.JTextField txtObturacionEfectuada;
    public static javax.swing.JTextField txtPuente;
    public static javax.swing.JTextField txtSexo;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaOdontograma.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
  
   return bResultado;
}
}
