package sistema;

import Clases.GestorTime;
import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.Color;
import java.awt.Component;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.IndexedColors;

public class Observados extends javax.swing.JDialog  {
     clsFunciones  oFunc = new clsFunciones();
     clsConnection oConn = new clsConnection();
//     public static ResumenInformacion obs1;
     DefaultTableModel model;
     
    public Observados() {
        initComponents();
        timer.start();
        sbCargarDatosObservados("");
        txtNorden.requestFocus();
    }

//    Observados(ResumenInformacion parent, boolean modal) {
//        Observados.obs1 = parent;
//        this.setModal(modal);
//        initComponents();
//        setLocationRelativeTo(this);
//        KeyboardFocusManager kb = KeyboardFocusManager.getCurrentKeyboardFocusManager();
//        kb.addKeyEventPostProcessor(new KeyEventPostProcessor() {
//            @Override
//            public boolean postProcessKeyEvent(KeyEvent e) {
//                if (e.getKeyCode() == KeyEvent.VK_ESCAPE && this != null) {
//                    dispose();
//                    return false;
//                }
//                return true;
//            }
//        });
//        timer.start();
//        sbCargarDatosObservados("");
//        txtNorden.requestFocus();
//        
//    }
 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        FechaObservados = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtExamen = new javax.swing.JTextArea();
        chkCardiologia = new javax.swing.JCheckBox();
        chkOftalmologia = new javax.swing.JCheckBox();
        chkOdontologia = new javax.swing.JCheckBox();
        chkEspirometria = new javax.swing.JCheckBox();
        chkObesidad = new javax.swing.JCheckBox();
        chkNeumologia = new javax.swing.JCheckBox();
        chkRxTorax = new javax.swing.JCheckBox();
        chkTestAltura = new javax.swing.JCheckBox();
        chkHTA = new javax.swing.JCheckBox();
        chkOtrorino = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        chkAudiomtria = new javax.swing.JCheckBox();
        chkLaboratorio = new javax.swing.JCheckBox();
        btnLevObser = new javax.swing.JButton();
        jtTriaje = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbObservados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        Fdesde = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Fhasta = new com.toedter.calendar.JDateChooser();
        btnMostrar = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtBuscarCod = new javax.swing.JTextField();
        btnExportarExel = new javax.swing.JButton();

        setTitle("Observados");

        jLabel1.setText("Nro Orden :");

        txtNorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNordenMouseClicked(evt);
            }
        });
        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });
        txtNorden.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNordenFocusGained(evt);
            }
        });

        jLabel2.setText("Fecha :");

        jLabel4.setText("Nombres :");

        txtNombres.setEditable(false);

        jLabel5.setText("Edad :");

        txtEdad.setEditable(false);

        jLabel6.setText("años");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
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

        txtExamen.setColumns(10);
        txtExamen.setLineWrap(true);
        txtExamen.setRows(2);
        txtExamen.setToolTipText("");
        txtExamen.setBorder(javax.swing.BorderFactory.createTitledBorder("Interpretación"));
        jScrollPane1.setViewportView(txtExamen);
        txtExamen.getAccessibleContext().setAccessibleName("Examen");

        chkCardiologia.setText("CARDIOLOGIA");
        chkCardiologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCardiologiaActionPerformed(evt);
            }
        });

        chkOftalmologia.setText("OFTALMOLOGIA");
        chkOftalmologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOftalmologiaActionPerformed(evt);
            }
        });

        chkOdontologia.setText("ODONTOLOGIA");
        chkOdontologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOdontologiaActionPerformed(evt);
            }
        });

        chkEspirometria.setText("ESPIROMETRIA");
        chkEspirometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEspirometriaActionPerformed(evt);
            }
        });

        chkObesidad.setText("OBESIDAD");
        chkObesidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkObesidadActionPerformed(evt);
            }
        });

        chkNeumologia.setText("NEUMOLOGIA");
        chkNeumologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNeumologiaActionPerformed(evt);
            }
        });

        chkRxTorax.setText("RX TORAX");
        chkRxTorax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRxToraxActionPerformed(evt);
            }
        });

        chkTestAltura.setText("TEST ALTURA");
        chkTestAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTestAlturaActionPerformed(evt);
            }
        });

        chkHTA.setText("HTA");
        chkHTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHTAActionPerformed(evt);
            }
        });

        chkOtrorino.setText("OTORINOLORIGOLOGIA");
        chkOtrorino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOtrorinoActionPerformed(evt);
            }
        });

        jLabel38.setText("Hora :");

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        chkAudiomtria.setText("AUDIOMETRIA ");
        chkAudiomtria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAudiomtriaActionPerformed(evt);
            }
        });

        chkLaboratorio.setText("LABORATORIO");
        chkLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLaboratorioActionPerformed(evt);
            }
        });

        btnLevObser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basurero.gif"))); // NOI18N
        btnLevObser.setText("Levantar Observ");
        btnLevObser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevObserActionPerformed(evt);
            }
        });

        tbObservados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbObservados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbObservados.getTableHeader().setReorderingAllowed(false);
        tbObservados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbObservadosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbObservados);

        jtTriaje.addTab("Revisar si registro paciente correctamente", jScrollPane2);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        jLabel31.setText("Nombres/Apellidos/Empresa/Contrata/Observaciones:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel7.setText("Desde :");

        jLabel8.setText("Hasta :");

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel35.setText("Codigo:");

        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        btnExportarExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        btnExportarExel.setText("Exportar");
        btnExportarExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fhasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btnExportarExel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel31)
                .addGap(2, 2, 2)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fhasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnExportarExel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FechaObservados, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNombres)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel5)
                            .addGap(4, 4, 4)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(chkNeumologia))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(chkRxTorax))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkCardiologia)
                                .addComponent(chkOftalmologia)
                                .addComponent(chkOdontologia)
                                .addComponent(chkEspirometria)
                                .addComponent(chkObesidad))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkLaboratorio)
                                .addComponent(chkAudiomtria)
                                .addComponent(chkOtrorino)
                                .addComponent(chkHTA)
                                .addComponent(chkTestAltura)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnLevObser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAgregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimpiar))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtTriaje)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(FechaObservados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel38)
                                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkCardiologia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkTestAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkHTA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkOdontologia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkOtrorino, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkAudiomtria, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkObesidad, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkNeumologia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(chkRxTorax, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnLevObser)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
           if(!OrdenExiste()){
        String Sql="select d.nombres_pa||' '||d.apellidos_pa as nombres, d.fecha_nacimiento_pa FROM datos_paciente  AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa) "
//                + "INNER JOIN triaje AS t ON(t.n_orden = n.n_orden)"
                + "WHERE n.n_orden = '"+txtNorden.getText().toString()+"'";
         oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombres"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        txtNorden.setEditable(false);
//                        txtNorden.requestFocus();
                        Fecha();
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
       Agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void chkCardiologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCardiologiaActionPerformed
        if (chkCardiologia.isSelected()) {
            txtExamen.append("-CARDIOLOGIA"+'\n');
        }
    }//GEN-LAST:event_chkCardiologiaActionPerformed

    private void chkOftalmologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOftalmologiaActionPerformed
        if (chkOftalmologia.isSelected()) {
            txtExamen.append("-OFTALMOLOGIA"+'\n');
        }
    }//GEN-LAST:event_chkOftalmologiaActionPerformed

    private void chkOdontologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOdontologiaActionPerformed
        if (chkOdontologia.isSelected()) {
            txtExamen.append("-ODONTOLOGIA"+'\n');
        }
    }//GEN-LAST:event_chkOdontologiaActionPerformed

    private void chkEspirometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEspirometriaActionPerformed
        if (chkEspirometria.isSelected()) {
            txtExamen.append("-ESPIROMETRIA"+'\n');
        }
    }//GEN-LAST:event_chkEspirometriaActionPerformed

    private void chkObesidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkObesidadActionPerformed
        if (chkObesidad.isSelected()) {
            txtExamen.append("-OBESIDAD"+'\n');
        }
    }//GEN-LAST:event_chkObesidadActionPerformed

    private void chkNeumologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNeumologiaActionPerformed
        if (chkNeumologia.isSelected()) {
            txtExamen.append("-NEUMOLOGIA"+'\n');
        }
    }//GEN-LAST:event_chkNeumologiaActionPerformed

    private void chkRxToraxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRxToraxActionPerformed
        if (chkRxTorax.isSelected()) {
            txtExamen.append("-RX TORAX"+'\n');
        }
    }//GEN-LAST:event_chkRxToraxActionPerformed

    private void chkTestAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTestAlturaActionPerformed
        if (chkTestAltura.isSelected()) {
            txtExamen.append("-TEST ALTURA"+'\n');
        }
    }//GEN-LAST:event_chkTestAlturaActionPerformed

    private void chkHTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHTAActionPerformed
        if (chkHTA.isSelected()) {
            txtExamen.append("-HTA"+'\n');
        }
    }//GEN-LAST:event_chkHTAActionPerformed

    private void chkOtrorinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOtrorinoActionPerformed
        if (chkOtrorino.isSelected()) {
            txtExamen.append("-OTORINOLORIGOLOGIA"+'\n');
        }
    }//GEN-LAST:event_chkOtrorinoActionPerformed

    private void chkAudiomtriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAudiomtriaActionPerformed
        if (chkAudiomtria.isSelected()) {
            txtExamen.append("-AUDIOMETRIA"+'\n');
        }
    }//GEN-LAST:event_chkAudiomtriaActionPerformed

    private void chkLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLaboratorioActionPerformed
        if (chkLaboratorio.isSelected()) {
            txtExamen.append("-LABORATORIO"+'\n');
        }
    }//GEN-LAST:event_chkLaboratorioActionPerformed

    private void btnLevObserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevObserActionPerformed
        String strSqlStmt;
        strSqlStmt = "DELETE FROM observaciones\n" +
                    " WHERE n_orden='" + txtNorden.getText() + "'";
        
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se levanto la Observacion con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
    }//GEN-LAST:event_btnLevObserActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        sbCargarDatosObservados(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        String [] titulos={"N°Orden","Nombre","Fecha","Empresa","Contrata","T.Examen","Cargo","Observaciones","H.Entrada","H_Salida"};
        String [] registros = new String[10];
        String sql="";
        if(Fdesde.getDate()!=null && Fhasta.getDate()!=null){
            sql="select n_orden_ocupacional.n_orden, "
            + "datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + "n_orden_ocupacional.n_hora,o.fecha_obser,n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
            + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,"
            + "o.n_orden as observados,o.hora_obser, \n"
            + " o.examenes \n"
            + "From datos_paciente "
            + "inner join n_orden_ocupacional "
            + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
            +" inner join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)"
            + "where   o.fecha_obser >='" +Fdesde.getDate()+"' and  o.fecha_obser <='" +Fhasta.getDate()+"'"+
            "ORDER BY o.n_orden desc";
        }
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
                        registros[2]= formato.format(oConn.setResult.getDate("fecha_obser"));
                        registros[3]= oConn.setResult.getString("razon_empresa");
                        registros[4]= oConn.setResult.getString("razon_contrata");
                        String exa=oConn.setResult.getString("nom_examen");
                        registros[5]= exa;
                        registros[6]= oConn.setResult.getString("cargo_de");
                        String o=oConn.setResult.getString("observados");
                        if( o!= null){
                            //                            registros[7]="OBSERVADO";
                            registros[7]= oConn.setResult.getString("examenes");
                        }
                        registros[8]= oConn.setResult.getString("n_hora");
                        registros[9]= oConn.setResult.getString("hora_obser");
                        //registros[3]=oConn.setResult.getString("anexo7c");
                        tbObservados.setDefaultRenderer(Object.class, new Observados.MyCellRenderer());
                        model.addRow(registros);
                    }
                    // Coloca el Modelo de Nueva Cuenta
                    tbObservados.setModel(model);
                    sbTablaTriaje();
                    // Cierra Resultados
                    oConn.setResult.close();
                }
                catch (SQLException ex)
                {
                    //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased

        sbCargarDatosObservados(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void tbObservadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbObservadosMousePressed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if (evt.getClickCount() == 1) 
        {  
//            txtNorden.setEnabled(false);
            Integer cod  = Integer.valueOf( tbObservados.getValueAt(tbObservados.getSelectedRow(),0).toString());
            String Sql = "SELECT  dp.nombres_pa||' '||dp.apellidos_pa as nombres,dp.fecha_nacimiento_pa,o.n_orden,"
                    + " o.fecha_obser, o.hora_obser, o.examenes \n" +
                         " FROM datos_paciente as dp " +
                        "INNER JOIN n_orden_ocupacional as n ON (dp.cod_pa = n.cod_pa) \n" +
                "       INNER JOIN observaciones as o ON (o.n_orden = n.n_orden) \n" +
                "       WHERE n.n_orden='" + cod+"'";
            
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    txtNombres.setText(oConn.setResult.getString("nombres"));
                    txtNorden.setText(oConn.setResult.getString("n_orden"));
                    FechaObservados.setDate(oConn.setResult.getDate("fecha_obser"));
                    lblHora.setText(oConn.setResult.getString("hora_obser"));
                    txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())));
                    txtExamen.setText(oConn.setResult.getString("examenes"));
                    oConn.setResult.close();
                    
                }
            } catch (Exception e) {
            }
            
        }
    }//GEN-LAST:event_tbObservadosMousePressed

    private void txtNordenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNordenFocusGained

    }//GEN-LAST:event_txtNordenFocusGained

    private void txtNordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNordenMouseClicked
         Limpiar();
    }//GEN-LAST:event_txtNordenMouseClicked

    private void btnExportarExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExelActionPerformed
        //        if(this.tbReporte.getRowCount()==0){
            //            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            //            return;
            //        }
        //        JFileChooser chooser = new JFileChooser();
        //        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de exel", "xls");
        //        chooser.setFileFilter(filter);
        //        chooser.setDialogTitle("Guardar archivo");
        //        chooser.setMultiSelectionEnabled(false);
        //        chooser.setAcceptAllFileFilterUsed(false);
        //        if(chooser.showSaveDialog(null)== JFileChooser.APPROVE_OPTION){
            //            List<JTable> tb = new ArrayList<>();
            //            List<String> nom = new ArrayList<>();
            //        tb.add(tbReporte);
            //        nom.add("socios");
            //        String file=chooser.getSelectedFile().toString().concat(".xls");
            //        try{
                //            ExportarExel e = new ExportarExel(new File(file), tb, nom);
                //            if(e.export()){
                    //                JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel.","Reportes",JOptionPane.INFORMATION_MESSAGE);
                    //            }
                //        }catch (Exception ex){
                //            JOptionPane.showMessageDialog(null, "Hubo un error"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                //
                //        }
            //
            //        }
        if(this.tbObservados.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        generar(tbObservados);
    }//GEN-LAST:event_btnExportarExelActionPerformed
     private com.toedter.calendar.JDateChooser FechaNacimiento;
    void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaObservados.setDate(fechaDate);
}
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
void Agregar(){
    if(!txtNorden.getText().isEmpty()){
        if(validar()){
String insert="INSERT INTO observaciones(n_orden";
String values="VALUES ('"+txtNorden.getText()+"'"; 
       insert += ",fecha_obser ";
       values += ",'"+FechaObservados.getDate()+"'";
       if(!lblHora.getText().isEmpty()){
       insert += ",hora_obser";
       values += ",'"+lblHora.getText().toString()+"'";
       }
        if(!txtExamen.getText().isEmpty()){
       insert += " ,examenes";
       values += ",'"+txtExamen.getText().toString()+"'";
        }
         if (oConn.FnBoolQueryExecuteUpdate(insert.concat(")") + values.concat(")"))){
                   
             Limpiar(); 
             sbCargarDatosObservados("");
             oFunc.SubSistemaMensajeInformacion("Ingresado Correctamente");
                                 
         }       
       }
    }

}
void Limpiar(){
txtNorden.setEditable(true);  
//txtCodExam.setEditable(true);
txtNorden.setText(null);
//txtCodExam.setText(null);
FechaObservados.setDate(null);
txtNombres.setText(null);
txtEdad.setText(null);
//txtFVC.setText(null);
//txtFEV1.setText(null);
//txtFEV1FVC.setText(null);
//txtFEF2575.setText(null);
txtNorden.requestFocus();
//txtTalla.setText(null);
//txtPeso.setText(null);
txtExamen.setText(null);
chkAudiomtria.setSelected(false);
chkCardiologia.setSelected(false);
chkEspirometria.setSelected(false);
chkHTA.setSelected(false);
chkLaboratorio.setSelected(false);
chkNeumologia.setSelected(false);
chkObesidad.setSelected(false);
chkOdontologia.setSelected(false);
chkOftalmologia.setSelected(false);
chkOtrorino.setSelected(false);
chkRxTorax.setSelected(false);
chkTestAltura.setSelected(false);

}
private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaObservados.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    if(txtExamen.getText().isEmpty()){
    oFunc.SubSistemaMensajeError("Ingrese examenes observados");bResultado = false;
    }
//    if(txtFEV1.getText().isEmpty()){
//    oFunc.SubSistemaMensajeError("Ingrese FEV1");bResultado = false;
//    }
//    if(txtFEV1FVC.getText().isEmpty()){
//    oFunc.SubSistemaMensajeError("Ingrese FEV1/FVC");bResultado = false;
//    }
//    if(txtFEF2575.getText().isEmpty()){
//    oFunc.SubSistemaMensajeError("Ingrese FEF 25-75 %");bResultado = false;
//    }
  
   return bResultado;
}
 public boolean OrdenExiste()
    {
        
        boolean bResultado=false;
        if(!txtNorden.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from observaciones Where n_orden ="+txtNorden.getText().toString();
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             txtNorden.setText(null);
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        
    
        }
// public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmObservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmObservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmObservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmObservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Observados dialog = new Observados(obs1, true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fdesde;
    private com.toedter.calendar.JDateChooser FechaObservados;
    private com.toedter.calendar.JDateChooser Fhasta;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnExportarExel;
    private javax.swing.JButton btnLevObser;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JCheckBox chkAudiomtria;
    private javax.swing.JCheckBox chkCardiologia;
    private javax.swing.JCheckBox chkEspirometria;
    private javax.swing.JCheckBox chkHTA;
    private javax.swing.JCheckBox chkLaboratorio;
    private javax.swing.JCheckBox chkNeumologia;
    private javax.swing.JCheckBox chkObesidad;
    private javax.swing.JCheckBox chkOdontologia;
    private javax.swing.JCheckBox chkOftalmologia;
    private javax.swing.JCheckBox chkOtrorino;
    private javax.swing.JCheckBox chkRxTorax;
    private javax.swing.JCheckBox chkTestAltura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jtTriaje;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTable tbObservados;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextArea txtExamen;
    private javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtNorden;
    // End of variables declaration//GEN-END:variables
   
    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date HorNew = new Date();
            SimpleDateFormat fechaforma = new SimpleDateFormat("hh:mm:ss a");
            String FfechaSystemA = fechaforma.format(HorNew);

            GestorTime.setFfechaSystem(FfechaSystemA);
            lblHora.setText(GestorTime.getFfechaSystem());
        }
    });
  void sbCargarDatosObservados(String valor){
    String [] titulos={"N°Orden","Nombre","Fecha","Empresa","Contrata","T.Examen","Cargo","Observación","H.Entrada","H_Salida"};
    String [] registros = new String[10];
    String sql="";
     if(!txtBuscarCod.getText().isEmpty()){
        sql="select n_orden_ocupacional.n_orden, "
            + "datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + "n_orden_ocupacional.n_hora,o.fecha_obser,n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,"
                  + "n_orden_ocupacional.nom_examen,n_orden_ocupacional.cargo_de,"
            + "o.n_orden as observados,o.hora_obser, \n" 
            + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional "
            + "ON (datos_paciente.cod_pa = n_orden_ocupacional.cod_pa)"
            +" inner join observaciones as o ON (o.n_orden=n_orden_ocupacional.n_orden)"
            + "where   o.n_orden ='" +txtBuscarCod.getText().toString()+"'"+
              "ORDER BY o.n_orden desc";
    }else{
          sql ="select n.n_orden, datos_paciente.nombres_pa||''||datos_paciente.apellidos_pa AS nombres, "
            + "n.n_hora,o.fecha_obser,n.razon_empresa,n.razon_contrata,"
                  + "n.nom_examen,n.cargo_de,"
            + "o.n_orden as observados,o.hora_obser, \n" 
            + " o.examenes \n" 
            + "From datos_paciente "
            + "inner join n_orden_ocupacional as n ON (datos_paciente.cod_pa = n.cod_pa)"
            +" inner join observaciones as o ON (o.n_orden=n.n_orden)"
            + "where CONCAT(nombres_pa,' ',apellidos_pa,' ',"
                  + " n.razon_empresa,' ',n.razon_contrata,' ',o.examenes) LIKE '%"+valor+"%' "
            + "ORDER BY o.n_orden desc";    
      // DefaultTableModel tblDatos = (DefaultTableModel) tblProductos.getModel(); 
     }
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
                    registros[2]= formato.format(oConn.setResult.getDate("fecha_obser"));
                    registros[3]= oConn.setResult.getString("razon_empresa");
                    registros[4]= oConn.setResult.getString("razon_contrata");
                    String exa=oConn.setResult.getString("nom_examen");
                    registros[5]= exa;
                    registros[6]= oConn.setResult.getString("cargo_de");
                    String o=oConn.setResult.getString("observados");
                   if( o!= null){
//                            registros[7]="OBSERVADO";
                            registros[7]= oConn.setResult.getString("examenes");
                    }
                    registros[8]= oConn.setResult.getString("n_hora");
                    registros[9]= oConn.setResult.getString("hora_obser");
                    //registros[3]=oConn.setResult.getString("anexo7c");
                    tbObservados.setDefaultRenderer(Object.class, new Observados.MyCellRenderer());
                     model.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  tbObservados.setModel(model);
                  sbTablaTriaje();
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
  public class MyCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        boolean valid1= String.valueOf(table.getValueAt(row, 7)) != null;
        component.setBackground(valid1? Color.ORANGE:Color.GREEN);
        
//        component.setForeground(valid ? Color.black : Color.white);
        return component;
    }
}
    private void sbTablaTriaje() {
        tbObservados.getColumnModel().getColumn(0).setMinWidth(50);
        tbObservados.getColumnModel().getColumn(0).setMaxWidth(50);
//tbTriaje.getColumnModel().getColumn(1).setMinWidth(130);//260
//tbTriaje.getColumnModel().getColumn(1).setMaxWidth(130);
        tbObservados.getColumnModel().getColumn(2).setMinWidth(80);//130
        tbObservados.getColumnModel().getColumn(2).setMaxWidth(80);
//tbTriaje.getColumnModel().getColumn(3).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(3).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(4).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(4).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(5).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(5).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(6).setMinWidth(90);//260
//tbTriaje.getColumnModel().getColumn(6).setMaxWidth(90); 
        tbObservados.setFont(new java.awt.Font("Tahoma", 0, 11));
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();

        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.LEFT);
        tbObservados.setSelectionForeground(Color.BLUE);
        tbObservados.setGridColor(Color.blue);
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
        tbObservados.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11));
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));

    }
    
}
