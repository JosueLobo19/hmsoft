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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author admin
 */
public class SistemasUsuariosEmpresas extends javax.swing.JFrame {
  clsConnection oConn = new clsConnection();
    clsFunciones  oFunc = new clsFunciones();    
    enum eOperaciones { Insert, Delete, Update};
    eOperaciones Operacion;
    public SistemasUsuariosEmpresas() {
        initComponents();

        SubClavesCarga();
        AutoCompleteDecorator.decorate(this.cboUsuarios);
        SubHabilitaCaptura(false);
    }
    private void SubInsertUser()
    {
        // TODO add your handling code here:
        String insert; // Para el Query
        String values; 
        String sPass;      // Para el Password
        
        
        // Coloca la transacción a true
        oConn.SubAutoCommit(false);
        
        // Quita encriptamiento al password
        sPass = new String(txtPass.getPassword());
    
    
        // Prepara el Query
        insert  = "INSERT INTO usuarios_empresa(";
         values = " Values ("; 
         if(!txtRuc.getText().isEmpty()){
         insert += "ruc_user "; 
         values += "'"+txtRuc.getText().toString()+"'";
         }
         if(!txtUsuario.getText().isEmpty()){
         insert += ",usuario_user";
         values += ",'"+txtUsuario.getText().toString()+"'";
         }
         if(!txtPass.getText().isEmpty()){
         insert += ",pass_user ";
         values += ",'"+sPass+"'";
         }
         if(!txtEmpresa.getText().isEmpty()){
         insert += ",empresa_user ";
         values += ",'"+txtEmpresa.getText().toString()+"'";
         }
         if(!txtContrata.getText().isEmpty()){
         insert += ",contrata_user";
          values += ",'"+txtContrata.getText().toString()+"'";
         }
         if(!txtResponsable.getText().isEmpty()){
         insert += ",representante_user ";
         values += ",'"+txtResponsable.getText().toString()+"'";
         }
         if(!txtDireccion.getText().isEmpty()){
         insert += ",direccion ";
         values += ",'"+txtDireccion.getText().toString()+"'";
         }
         if(!txtTelefono.getText().isEmpty()){
         insert += ",telefono ";
         values += ",'"+txtTelefono.getText().toString()+"'";
         }
        
         insert += ",sistema, configura)";
         values += ",'"+chkSistema.isSelected()+"','"+chkConfiguracion.isSelected()+"')";
       
        //oFunc.SubSistemaMensajeError(insert + values);
        // Ejecuta el Query
        if (oConn.FnBoolQueryExecuteUpdate(insert + values))
        {    
           // Elimina el Role Proceso asociado
            oConn.SubCommit();
            Limpiar(true);
               // Mensaje
               oFunc.SubSistemaMensajeInformacion("Se ha realizado Insert con Éxito");
 
        }
        else
            // realiza el rollback
            oConn.SubRollBack();
    }
    private void SubUpdateUser()
    {
        // TODO add your handling code here:
        String strSqlStmt;
        String sPass;
        
        
        // Coloca la transacción a true
        oConn.SubAutoCommit(false);
        
        // Quita encriptamiento al password
        sPass = new String(txtPass.getPassword());
    
    
        // Prepara el Query
        strSqlStmt  = "Update usuarios_empresa ";
        strSqlStmt += "Set usuario_user='"+txtUsuario.getText().toString()+"' ";
        strSqlStmt += ",pass_user='"+sPass.toString()+"'";
        strSqlStmt += ",empresa_user='"+txtEmpresa.getText().toString()+"' ";
        strSqlStmt += ",contrata_user='"+txtContrata.getText().toString()+"' ";
        strSqlStmt += ",representante_user='"+txtResponsable.getText().toString()+"' ";
         if(!txtDireccion.getText().isEmpty()){
        strSqlStmt += " ,direccion='"+txtDireccion.getText().toString()+"' ";
        }
        strSqlStmt += ",telefono='"+txtTelefono.getText().toString()+"' ";
        strSqlStmt += ",sistema='"+chkSistema.isSelected()+"' ";
        strSqlStmt += ",configura='"+chkConfiguracion.isSelected()+"' ";
        
        strSqlStmt += " Where ruc_user='"+txtRuc.getText().toString()+"' ";
        
      if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt))
        {    
          oConn.SubCommit();
               // Mensaje
               cboUsuarios.setSelectedIndex(0);
               Limpiar(true);
               oFunc.SubSistemaMensajeInformacion("Se ha realizado Update con Éxito"); 
          
        }
        else
            // realiza el rollback
            oConn.SubRollBack();
        
    }
  private void SubDeleteUser()
    {
        
        // TODO add your handling code here:
        String strSqlStmt;
    
        // Prepara el Query
        strSqlStmt  = " Delete from usuarios_empresa ";
        strSqlStmt += " Where ruc_user='"+txtRuc.getText().toString()+"' ";

        // Ejecuta el Query
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt))
        {    
           // Mensaje
           oFunc.SubSistemaMensajeInformacion("Se ha realizado Delete con Éxito");
        }
       
    }
     private boolean fnBoolDatosOk()
    {
        
        // Variable para el Mensaje
        String sMessage="";
        String sPass="";
        String sRePass="";
        
        // Valida el
        if (txtPass.getPassword().length==0)
        {
            // Añade el Usuario al Mensaje
             sMessage = "Password";
            
            // Coloca el Foco en el Objeto
            txtPass.requestFocus();
        }
        
               
        // Valida el Nombre
        if (txtEmpresa.getText().length()<=0)
        {
            // Valida si no falló con el usuario para mandar el foco
            if (sMessage.length()==0)
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                txtEmpresa.requestFocus();
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"Empresa";
        }
        if (txtContrata.getText().length()<=0)
        {
            // Valida si no falló con el usuario para mandar el foco
            if (sMessage.length()==0)
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                txtContrata.requestFocus();
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"Contrata";
        }
         if (txtRuc.getText().length()<=0)
        {
            // Valida si no falló con el usuario para mandar el foco
            if (sMessage.length()==0)
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                txtRuc.requestFocus();
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"El RUC";
        }
          if (txtUsuario.getText().length()<=0)
        {
            // Valida si no falló con el usuario para mandar el foco
            if (sMessage.length()==0)
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                txtUsuario.requestFocus();
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"Un Nombre de Usuario";
        }
        if(chkConfiguracion.isSelected()==false  && chkSistema.isSelected()== false){
             
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"Seleccione Tipo de Ingreso";
        }  

        // Valida el Role
       
        
        // Valida los procesos seleccionados
        
        
        
        // Verifica si hay que desplegar el Mensaje
        if (sMessage.length() > 0)
        {
            //Prepara el Mensaje
            sMessage = "Debe de Capturar los siguiente datos:\n"+sMessage;
            JOptionPane.showMessageDialog(null, sMessage);
            
            // Devuelve falso
            return false;
        }
        else
        {
            // Retorna Correcto
            return true;    
        }
        
       
    } 


private boolean FnBoolExisteUsuario() 
    {
        // Variable para el Query
        String sQuery;
        boolean bResult=false;
        
        // Prepara el Query
        sQuery ="Select ruc_user from usuarios_empresa";
        sQuery = sQuery + " Where ruc_user='"+txtRuc.getText()+"'";
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Coloco los datos
                
                // Resultado
                bResult = true;

                // Cierro los Resultados
                oConn.setResult.close();
                

            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeError("FnBoolExisteUsuario:"+ex.getMessage().toString());
        }

     
        
        // Retorna el Resultado
        return bResult;
        
    }
private void Limpiar(boolean bClave)
    {
        // Inicializa los datos de Captura
        if (bClave)
           txtPass.setText(null);
         txtEmpresa.setText("");
        txtContrata.setText("");
       
        txtDireccion.setText("");
        txtResponsable.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        chkSistema.setSelected(true);
        chkConfiguracion.setSelected(false);
        
        // Carga las Claves
        SubClavesCarga();
        
        
    }
    private boolean empresaExiste() 
    {
        // Variable para el Query
        String sQuery;
        boolean bResult=false;
        
        // Prepara el Query
        sQuery ="Select ruc_empresa from empresas";
        sQuery = sQuery + " Where ruc_empresa='"+txtRuc.getText()+"'";
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Coloco los datos
                
                // Resultado
                bResult = true;

                // Cierro los Resultados
                oConn.setResult.close();
                

            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeError("empresas:"+ex.getMessage().toString());
        }

     
        
        // Retorna el Resultado
        return bResult;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtContrata = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chkSistema = new javax.swing.JCheckBox();
        chkConfiguracion = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cboUsuarios = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        btnDel = new javax.swing.JButton();
        btnIns = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Crear usuarios"));

        jLabel1.setText("Empresa :");

        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        txtContrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrataActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(51, 155, 234));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(51, 155, 234));

        jLabel2.setText("Contrata :");

        jLabel3.setText("RUC :");

        jLabel4.setText("Dirección :");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("Responsable :");

        jLabel10.setText("Telefono :");

        jLabel11.setText("Usuario :");

        jLabel12.setText("Contraseña :");

        jLabel14.setText("Ingresos Area :");

        chkSistema.setText("Sistema");
        chkSistema.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkConfiguracion.setText("Configuracion");
        chkConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkSistema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkConfiguracion)))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator2))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(chkSistema)
                            .addComponent(chkConfiguracion))))
                .addGap(14, 14, 14))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Modificar"));

        jLabel13.setText("Usuario :");

        cboUsuarios.setEditable(true);
        cboUsuarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboUsuariosFocusGained(evt);
            }
        });
        cboUsuarios.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboUsuariosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboUsuarios, 0, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(2, 2, 2))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operaciones"));

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basurero.gif"))); // NOI18N
        btnDel.setText("Eliminar");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        btnIns.setText("Insertar");
        btnIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsActionPerformed(evt);
            }
        });

        btnUpd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnUpd.setText("Actualizar");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDel)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Transacción"));

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnOk.setText("Confirmar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboUsuariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboUsuariosFocusGained
    
    }//GEN-LAST:event_cboUsuariosFocusGained

    private void btnInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsActionPerformed
    
        // Valido que el Usuario Exista
        if (!FnBoolExisteUsuario()){
            // Despliego el Mensaje
              // Especifica la operacion
            Operacion = eOperaciones.Insert;
            datosEmpresa();
            // Habilita captura
            SubHabilitaCaptura(true);
            txtEmpresa.requestFocus();
            
        }else{
           oFunc.SubSistemaMensajeError("La Usuario ya Existe");
            
          
        }         
            
    }//GEN-LAST:event_btnInsActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
       if (txtRuc.getText().length()==0)
        {
            // Despliego el Mensaje
            oFunc.SubSistemaMensajeError("Debe Ingresar ruc de Usuario a Modificar");

            // Coloca el Foco en el Objeto
            txtRuc.requestFocus();


        }else if (! FnBoolExisteUsuario()){
            // Despliego el Mensaje
            
            oFunc.SubSistemaMensajeError("Usuario a Modificar Ya Existe");
        }else{
            // Especifica la operacion
            datosUsuarios();
            Operacion = eOperaciones.Update;
            // Hablita la captura
            
            
            SubHabilitaCaptura(true);
            
        }         
            
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        if (txtRuc.getText().length()==0)
    {
        // Despliego el Mensaje
        oFunc.SubSistemaMensajeError("Debe Ingresar ruc de Usuario a Eliminar");

        // Coloca el Foco en el Objeto
        txtRuc.requestFocus();
        
        
    }
    else
        if (! FnBoolExisteUsuario())
            // Despliego el Mensaje
            oFunc.SubSistemaMensajeError("ruc a Eliminar No Existe");
        else
        {
            // Especifica la operacion
            Operacion = eOperaciones.Delete;
            
            // Habilita la captura
            SubHabilitaCaptura(true);
            
            // Colocal el Foco en Ok
            btnOk.requestFocus();
        }
            
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (fnBoolDatosOk())
        {
            //Llama rutina de Transaccion
            if (Operacion == eOperaciones.Update)
                SubUpdateUser();
            else if  (Operacion == eOperaciones.Insert)
                SubInsertUser();
            else 
                SubDeleteUser();
            
            // Inicializa y Habilita Captura
            txtRuc.setText(null);
            SubHabilitaCaptura(false);
       
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtRuc.setText(null);
        Limpiar(true);
        SubHabilitaCaptura(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        txtEmpresa.requestFocus();
    }//GEN-LAST:event_txtRucActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        txtContrata.requestFocus();
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void txtContrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrataActionPerformed
       txtDireccion.requestFocus();
    }//GEN-LAST:event_txtContrataActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        txtResponsable.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        txtUsuario.requestFocus();
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtPass.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void cboUsuariosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboUsuariosPopupMenuWillBecomeInvisible
           
        if (! cboUsuarios.getSelectedItem().toString().equals("SELECCIONE"))
        {
           
            if(cboUsuarios.getSelectedIndex()>=1){
                String sq="SELECT ruc_user FROM usuarios_empresa WHERE usuario_user ='"+cboUsuarios.getSelectedItem()+"'";
               oConn.FnBoolQueryExecute(sq);
                 
                try {
                       if (oConn.setResult.next()) {
                        
                    txtRuc.setText(oConn.setResult.getString(1));
                    
                    FnBoolExisteUsuario();
                       }
                } catch (SQLException ex) {
                    Logger.getLogger(SistemasUsuariosEmpresas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
             }
        }
    }//GEN-LAST:event_cboUsuariosPopupMenuWillBecomeInvisible


          private void SubClavesCarga()
    {
        // Para instrucción sql
        String sqlStmt;
        //String sClave;
        
        
        // Limpia el Control
       cboUsuarios.removeAllItems();
       cboUsuarios.addItem("SELECCIONE");
        
         // Prepara Variable para realizar el Query
        sqlStmt = "Select usuario_user from usuarios_empresa";
        
        if (oConn.FnBoolQueryExecute(sqlStmt))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {
                     
                     // Obtiene los datos de la Consulta
          
                     
                     // Agrega el Elemento
                     cboUsuarios.addItem(oConn.setResult.getString ("usuario_user"));
                     
                 }
                 
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialog(rootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(SistemasUsuariosEmpresas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }
          private void SubHabilitaCaptura(boolean bHabilita)
    {
        // Habilita/Deshabilita clave
        txtRuc.setEnabled(! bHabilita);
        //txtApellidos.setEnabled (! bHabilita);
        cboUsuarios.setEnabled(! bHabilita);
        // Habilita/Deshabilita detalles
        txtEmpresa.setEnabled(bHabilita);
        txtContrata.setEnabled(bHabilita);
        //txtDNI.setEnabled(bHabilita);
        txtDireccion.setEnabled(bHabilita);
        txtResponsable.setEnabled(bHabilita);
        txtTelefono.setEnabled(bHabilita);
        txtUsuario.setEnabled(bHabilita);
        txtPass.setEnabled(bHabilita);
         chkConfiguracion.setEnabled(bHabilita);
           chkSistema.setEnabled(bHabilita);
        
        // Habilita/Desahabilita Operaciones
        btnIns.setEnabled(! bHabilita);
        btnUpd.setEnabled(! bHabilita);
        btnDel.setEnabled(! bHabilita);
        
        // Habilita/Deshabilita captura
        btnOk.setEnabled(bHabilita);
        btnCancel.setEnabled(bHabilita);    
        
        if (bHabilita)
            // Coloca el Foco
            txtRuc.requestFocus();
    
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemasUsuariosEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemasUsuariosEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemasUsuariosEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemasUsuariosEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new SistemasUsuariosEmpresas().setVisible(true);
            }
        });
    }
    void datosEmpresa(){
        
        if(!txtRuc.getText().isEmpty()){
           if(empresaExiste()){
             String Sql="SELECT razon_empresa, direccion_empresa, telefono_empresa, \n" +
                        " responsable_empresa\n" +
                        "  FROM empresas WHERE ruc_empresa ='"+txtRuc.getText().toString()+"'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtContrata.setText("N/A");
                        txtDireccion.setText(oConn.setResult.getString("direccion_empresa")); 
                        txtResponsable.setText(oConn.setResult.getString("responsable_empresa"));
                        txtTelefono.setText(oConn.setResult.getString("telefono_empresa")); 
                        
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("DatosEmpresa:" + ex.getMessage().toString());}
           }else{
               oFunc.SubSistemaMensajeInformacion("Empresa no esta registrada:");
           }
    
        }
    }
    void datosUsuarios(){
        
        if(!txtRuc.getText().isEmpty()){
           if(FnBoolExisteUsuario()){
             String Sql="SELECT  usuario_user, pass_user, empresa_user, contrata_user, \n" +
            "       representante_user, direccion, telefono, sistema, configura\n" +
            "  FROM usuarios_empresa WHERE ruc_user ='"+txtRuc.getText().toString()+"'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtUsuario.setText(oConn.setResult.getString("usuario_user"));
                        txtPass.setText(oConn.setResult.getString("pass_user"));
                        txtEmpresa.setText(oConn.setResult.getString("empresa_user"));
                        txtContrata.setText(oConn.setResult.getString("contrata_user"));
                        txtDireccion.setText(oConn.setResult.getString("direccion")); 
                        txtResponsable.setText(oConn.setResult.getString("representante_user"));
                        txtTelefono.setText(oConn.setResult.getString("telefono")); 
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("DatosUsuariosEmpresa:" + ex.getMessage().toString());}
           }else{
               oFunc.SubSistemaMensajeInformacion("No exite usuario de la Empresa:");
           }
    
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnIns;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnUpd;
    private javax.swing.JComboBox cboUsuarios;
    private javax.swing.JCheckBox chkConfiguracion;
    private javax.swing.JCheckBox chkSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
