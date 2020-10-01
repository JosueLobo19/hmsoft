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
public class SistemasUsuarios extends javax.swing.JFrame {
  clsConnection oConn = new clsConnection();
    clsFunciones  oFunc = new clsFunciones();    
    enum eOperaciones { Insert, Delete, Update};
    eOperaciones Operacion;
    public SistemasUsuarios() {
        initComponents();
        SubProcesosCarga();
        SubRoleCarga();
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
        insert  = "INSERT INTO usuarios(";
         values = " Values ("; 
         if(!txtDNI.getText().isEmpty()){
         insert += "dni_user "; 
         values += "'"+txtDNI.getText().toString()+"'";
         }
         if(!txtUsuario.getText().isEmpty()){
         insert += ",usuario_user";
         values += ",'"+txtUsuario.getText().toString()+"'";
         }
         if(!txtPass.getText().isEmpty()){
         insert += ",pass_user ";
         values += ",'"+sPass+"'";
         }
         if(!txtNombres.getText().isEmpty()){
         insert += ",nombre_user ";
         values += ",'"+txtNombres.getText().toString()+"'";
         }
         if(!txtApellidos.getText().isEmpty()){
         insert += ",apellido_user";
          values += ",'"+txtApellidos.getText().toString()+"'";
         }
         if(!txtProfecion.getText().isEmpty()){
         insert += ",profesion_user ";
         values += ",'"+txtProfecion.getText().toString()+"'";
         }
          if(cboSexo.getSelectedIndex() >= 0){
         insert += ",sexo";
          values += ",'"+cboSexo.getSelectedItem().toString()+"'";
         }
         if(!txtDireccion.getText().isEmpty()){
         insert += ",direccion ";
         values += ",'"+txtDireccion.getText().toString()+"'";
         }
         if(!txtNroColegiatura.getText().isEmpty()){
         insert += ",cmp_user ";
         values += ",'"+txtNroColegiatura.getText().toString()+"'";
         }
         if(!txtRol.getText().isEmpty()){
         insert += ",rol_user ";
         values += ",'"+txtRol.getText().toString()+"'";
         }
         insert += ",sistema, admision, farmacia)";
         values += ",'"+chkSistema.isSelected()+"','"+chkAdmision.isSelected()+"','"+chkFarmacia.isSelected()+"')";
       
        //oFunc.SubSistemaMensajeError(insert + values);
        // Ejecuta el Query
        if (oConn.FnBoolQueryExecuteUpdate(insert + values))
        {    
           // Elimina el Role Proceso asociado
           subDeleteRoleProcesos();
           
           // Ejecuta Inserción
           if (fnBoolInsertaRoleProcesos())
           {
               oConn.SubCommit();
               // Mensaje
               oFunc.SubSistemaMensajeInformacion("Se ha realizado Insert con Éxito");
           }
           else
               oConn.SubRollBack();
            
           
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
        strSqlStmt  = "Update usuarios ";
        strSqlStmt += "Set usuario_user='"+txtUsuario.getText().toString()+"' ";
        strSqlStmt += ",pass_user='"+sPass.toString()+"'";
        strSqlStmt += ",nombre_user='"+txtNombres.getText().toString()+"' ";
        strSqlStmt += ",apellido_user='"+txtApellidos.getText().toString()+"' ";
        strSqlStmt += ",profesion_user='"+txtProfecion.getText().toString()+"' ";
        strSqlStmt += ",cmp_user='"+txtNroColegiatura.getText().toString()+"' ";
        strSqlStmt += ",rol_user='"+txtRol.getText().toString()+"' ";
         if(cboSexo.getSelectedIndex()>= 0){
         strSqlStmt += ",sexo='"+cboSexo.getSelectedItem().toString()+"' ";
        }
         if(!txtDireccion.getText().isEmpty()){
        strSqlStmt += " ,direccion='"+txtDireccion.getText().toString()+"' ";
        }
        strSqlStmt += ",sistema='"+chkSistema.isSelected()+"' ";
        strSqlStmt += ",admision='"+chkAdmision.isSelected()+"' ";
        strSqlStmt += ",farmacia='"+chkFarmacia.isSelected()+"'";
       
        
        
        strSqlStmt += " Where dni_user='"+txtDNI.getText().toString()+"' ";
        
      if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt))
        {    
          
           subDeleteRoleProcesos();
           
           // Ejecuta Inserción
           if (fnBoolInsertaRoleProcesos())
           {
    
               oConn.SubCommit();
               // Mensaje
               cboUsuarios.setSelectedIndex(0);
               oFunc.SubSistemaMensajeInformacion("Se ha realizado Update con Éxito");           
           }
           else
               oConn.SubRollBack();
            
          
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
        strSqlStmt  = " Delete from usuarios ";
        strSqlStmt += " Where dni_user='"+txtDNI.getText().toString()+"' ";

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
        if (txtNombres.getText().length()<=0)
        {
            // Valida si no falló con el usuario para mandar el foco
            if (sMessage.length()==0)
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                txtNombres.requestFocus();
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"El Nombre";
        }
        if (txtApellidos.getText().length()<=0)
        {
            // Valida si no falló con el usuario para mandar el foco
            if (sMessage.length()==0)
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                txtApellidos.requestFocus();
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"El Apellido";
        }
         if (txtDNI.getText().length()<=0)
        {
            // Valida si no falló con el usuario para mandar el foco
            if (sMessage.length()==0)
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                txtDNI.requestFocus();
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"El DNI";
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
        if(chkAdmision.isSelected()==false && chkFarmacia.isSelected()== false && chkSistema.isSelected()== false){
             
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"Seleccione Tipo de Ingreso";
        }  

        // Valida el Role
        if (txtRol.getText().length()<=0)
        {
            // Valida si no falló con el usuario para mandar el foco
            if (sMessage.length()==0)
                
                // Mando el Foco al Password si no ha fallado algun dato previo
                txtRol.requestFocus();
            
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"El rol";
        }
        
        // Valida los procesos seleccionados
        if (lstProcesos.isSelectionEmpty())
        {
            // Añade el Usuario al Mensaje
            sMessage = sMessage+"\n"+"Debe Seleccionar un Proceso";
        }
        
        
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
private void subDeleteRoleProcesos()
    {
        
        // Variable para el Query
        String sQuery;
        Boolean bResult=false;
        
        // Prepara el Query para Eliminar
        sQuery ="Delete from u_rol_procesos";        
        sQuery = sQuery + " Where rol_user='"+txtRol.getText().toString()+"'";
        
        // Ejecuta el Query para Borrar
        oConn.FnBoolQueryExecuteUpdate(sQuery);
        
        
    }
private boolean fnBoolExisteRole()
    {
        // Variable para el Query
        String sQuery;
        Boolean bResult=false;
        
        // Prepara el Query
        sQuery ="Select count(rol_user) from u_rol_procesos";
        sQuery = sQuery + " Where rol_user='"+txtRol.getText().toString()+"'";
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
        
                // Cierro los Resultados
                oConn.setResult.close();
                
                // Resultado
                bResult = true;

            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeError("fnBoolExisteRole:"+ex.getMessage().toString());
        }
        
        return (bResult);
    }
private boolean FnBoolExisteUsuario() 
    {
        // Variable para el Query
        String sQuery;
        Boolean bResult=false;
        
        // Prepara el Query
        sQuery ="Select * from usuarios";
        sQuery = sQuery + " Where dni_user='"+txtDNI.getText()+"'";
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Coloco los datos
                  txtPass.setText(oConn.setResult.getString ("pass_user"));
                txtNombres.setText(oConn.setResult.getString ("nombre_user"));
        txtApellidos.setText(oConn.setResult.getString ("apellido_user"));
        txtDNI.setText(oConn.setResult.getString ("dni_user"));
        txtDireccion.setText(oConn.setResult.getString ("direccion"));
        txtProfecion.setText(oConn.setResult.getString ("profesion_user"));
        txtNroColegiatura.setText(oConn.setResult.getString ("cmp_user"));
        txtUsuario.setText(oConn.setResult.getString ("usuario_user"));
        chkAdmision.setSelected(oConn.setResult.getBoolean("admision"));
        chkFarmacia.setSelected(oConn.setResult.getBoolean("farmacia"));
        chkSistema.setSelected(oConn.setResult.getBoolean("sistema"));
        txtRol.setText(oConn.setResult.getString ("rol_user"));
        cboSexo.setSelectedItem(oConn.setResult.getString("sexo"));
    

                // Cierro los Resultados
                oConn.setResult.close();
                
                // Resultado
                bResult = true;

            }
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeError("FnBoolExisteUsuario:"+ex.getMessage().toString());
        }

        if (bResult)
           SubCargaRoleProcesos();
        
        
        // Retorna el Resultado
        return bResult;
        
    }
private boolean fnBoolInsertaRoleProcesos()
    {
        int iPosicion;
        String sElemento;
        String sQuery;
        boolean bResult=true;
        
        for (iPosicion = 0; iPosicion < lstProcesos.getModel().getSize();iPosicion++)
        {
            // Obtiene el Elemento de la lista
            sElemento = lstProcesos.getModel().getElementAt(iPosicion).toString();
            sElemento = sElemento.substring(0,10);                       
            
            // Verifica si esta seleccionado
         
            if (lstProcesos.isSelectedIndex(iPosicion))
            {
                // Prepara Query para Insersion
                sQuery = "Insert into u_rol_procesos ";
                sQuery = sQuery + " (rol_user,procesos_ide) ";
                sQuery = sQuery + " values ('"+txtRol.getText().toString()+"','"+sElemento.toUpperCase()+"')";
                
                // Ejecuta Inserción
                
                if (! oConn.FnBoolQueryExecuteUpdate(sQuery))
                    bResult = false;
                
            }
            
        }
        
        // Retorna
        return (bResult);
    }
    private void SubInicializaCaptura(boolean bClave)
    {
        // Inicializa los datos de Captura
        if (bClave)
           txtPass.setText(null);
         txtNombres.setText("");
        txtApellidos.setText("");
       
        txtDireccion.setText("");
        txtProfecion.setText("");
        txtNroColegiatura.setText("");
        txtUsuario.setText("");
        chkAdmision.setSelected(false);
        chkFarmacia.setSelected(false);
        chkSistema.setSelected(false);
        cboSexo.setSelectedIndex(0);
        txtRol.setText(null); 
        cboRoles.setSelectedIndex(0);
        
        // Carga las Claves
        SubClavesCarga();
        
        // Carga los procesos
        SubProcesosCarga();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cboSexo = new javax.swing.JComboBox();
        txtDireccion = new javax.swing.JTextField();
        txtProfecion = new javax.swing.JTextField();
        txtNroColegiatura = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chkSistema = new javax.swing.JCheckBox();
        chkAdmision = new javax.swing.JCheckBox();
        chkFarmacia = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstProcesos = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cboUsuarios = new javax.swing.JComboBox();
        cboRoles = new javax.swing.JComboBox();
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

        jLabel1.setText("Nombres :");

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMENINO" }));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtNroColegiatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroColegiaturaActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(51, 155, 234));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(51, 155, 234));

        jLabel2.setText("Apellidos :");

        jLabel3.setText("DNI :");

        jLabel4.setText("Dirección :");

        jLabel6.setText("Sexo:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("Profección :");

        jLabel10.setText("Nro Colegiatura :");

        jLabel11.setText("Usuario :");

        jLabel12.setText("Contraseña :");

        jLabel14.setText("Ingresos Area :");

        chkSistema.setText("Sistema");
        chkSistema.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkAdmision.setText("Admisión");
        chkAdmision.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkFarmacia.setText("Farmacia");
        chkFarmacia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

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
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres)
                    .addComponent(txtApellidos)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtNroColegiatura, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfecion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkSistema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkAdmision)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkFarmacia)))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtProfecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNroColegiatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(chkAdmision)
                            .addComponent(chkFarmacia))))
                .addGap(14, 14, 14))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Permisos y Accesos"));

        lstProcesos.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane2.setViewportView(lstProcesos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Modificar"));

        jLabel13.setText("Usuario :");

        jLabel15.setText("Roles :");

        jLabel16.setText("Nuevo Rol :");

        cboUsuarios.setEditable(true);
        cboUsuarios.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboUsuariosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboUsuarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboUsuariosFocusGained(evt);
            }
        });

        cboRoles.setEditable(true);
        cboRoles.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboRolesPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboRoles, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRol, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(9, 9, 9)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboUsuariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboUsuariosFocusGained
    
    }//GEN-LAST:event_cboUsuariosFocusGained

    private void btnInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsActionPerformed
          // TODO add your handling code here:
     // Valida que haya capturado algo
    // Valida el Usuario
    if (txtDNI.getText().length()==0)
    {
        // Despliego el Mensaje
        oFunc.SubSistemaMensajeError("Debe Ingresar DNI");

        // Coloca el Foco en el Objeto
        txtNombres.requestFocus();
        
        
    }
    else
        
        // Valido que el Usuario Exista
        if (FnBoolExisteUsuario())
            // Despliego el Mensaje
            oFunc.SubSistemaMensajeError("La Usuario ya Existe");
        else
        {
            // Inicializa Captura
            SubInicializaCaptura(false);
            
            // Especifica la operacion
            Operacion = eOperaciones.Insert;
            
            // Habilita captura
            SubHabilitaCaptura(true);
            txtNombres.requestFocus();
        }         
            
    }//GEN-LAST:event_btnInsActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
       if (txtDNI.getText().length()==0)
    {
        // Despliego el Mensaje
        oFunc.SubSistemaMensajeError("Debe Ingresar DNI de Usuario a Modificar");

        // Coloca el Foco en el Objeto
        txtDNI.requestFocus();
        
        
    }
    else
        if (! FnBoolExisteUsuario())
            // Despliego el Mensaje
            oFunc.SubSistemaMensajeError("Usuario a Modificar Ya Existe");
        else
        {
            // Especifica la operacion
            Operacion = eOperaciones.Update;
            
            // Hablita la captura
            SubHabilitaCaptura(true);
            
        }         
            
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        if (txtDNI.getText().length()==0)
    {
        // Despliego el Mensaje
        oFunc.SubSistemaMensajeError("Debe Ingresar DNI de Usuario a Eliminar");

        // Coloca el Foco en el Objeto
        txtDNI.requestFocus();
        
        
    }
    else
        if (! FnBoolExisteUsuario())
            // Despliego el Mensaje
            oFunc.SubSistemaMensajeError("DNI a Eliminar No Existe");
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
            txtDNI.setText(null);
            SubInicializaCaptura(true);
            SubHabilitaCaptura(false);
            SubProcesosCarga();
            SubRoleCarga();
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtDNI.setText(null);
        SubInicializaCaptura(true);
        SubHabilitaCaptura(false);
        SubProcesosCarga();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        txtNombres.requestFocus();
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        txtApellidos.requestFocus();
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
       txtDireccion.requestFocus();
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        txtProfecion.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNroColegiaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroColegiaturaActionPerformed
        txtUsuario.requestFocus();
    }//GEN-LAST:event_txtNroColegiaturaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtPass.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void cboUsuariosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboUsuariosPopupMenuWillBecomeInvisible
           
        if (! cboUsuarios.getSelectedItem().toString().equals("SELECCIONE"))
        {
           
            if(cboUsuarios.getSelectedIndex()>=1){
                String sq="SELECT dni_user FROM usuarios WHERE usuario_user ='"+cboUsuarios.getSelectedItem()+"'";
               oConn.FnBoolQueryExecute(sq);
                 
                try {
                       if (oConn.setResult.next()) {
                        
                    txtDNI.setText(oConn.setResult.getString(1));
                    
                    FnBoolExisteUsuario();
                       }
                } catch (SQLException ex) {
                    Logger.getLogger(SistemasUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                
             }
        }
    }//GEN-LAST:event_cboUsuariosPopupMenuWillBecomeInvisible

    private void cboRolesPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboRolesPopupMenuWillBecomeInvisible
      if (! cboRoles.getSelectedItem().toString().equals("SELECCIONE"))
        {
            if(cboRoles.getSelectedIndex()>=1){
            
            txtRol.setText(cboRoles.getSelectedItem().toString());
            // Carga de Nuevo los Procesos
            SubCargaRoleProcesos();
        }
        }
    }//GEN-LAST:event_cboRolesPopupMenuWillBecomeInvisible

    private void SubProcesosCarga()
    {
        String sqlStmt;
        String sIdeProceso;
        String sNomProceso;
       
        DefaultListModel itemLista;
        itemLista = new DefaultListModel();
        lstProcesos.removeAll();
        sqlStmt = "Select * from u_procesos";
        
        if (oConn.FnBoolQueryExecute(sqlStmt))
        {
            try 
            {
                 while (oConn.setResult.next())
                 {
                     sIdeProceso = oConn.setResult.getString("procesos_ide");
                     sNomProceso = oConn.setResult.getString("procesos_nom");
                     itemLista.addElement(sIdeProceso.toLowerCase()+"**"+sNomProceso);                     
                 }
                 lstProcesos.setModel(itemLista);
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(SistemasUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
      private void SubRoleCarga()
    {
        // Para instrucción sql
        String sqlStmt;
       // String sNomRole;
        
        
        // Limpia el Control
      cboRoles.removeAllItems();
       cboRoles.addItem("SELECCIONE");
        
         // Prepara Variable para realizar el Query
        sqlStmt = "Select distinct(rol_user) from u_rol_procesos";
        
        if (oConn.FnBoolQueryExecute(sqlStmt))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {
                     
                     // Obtiene los datos de la Consulta
                     
                     
                     // Agrega el Elemento
                     cboRoles.addItem(oConn.setResult.getString ("rol_user"));
                     
                 }
                 
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialog(rootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(SistemasUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }
          private void SubClavesCarga()
    {
        // Para instrucción sql
        String sqlStmt;
        //String sClave;
        
        
        // Limpia el Control
       cboUsuarios.removeAllItems();
       cboUsuarios.addItem("SELECCIONE");
        
         // Prepara Variable para realizar el Query
        sqlStmt = "Select usuario_user from usuarios";
        
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
                Logger.getLogger(SistemasUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }
          private void SubHabilitaCaptura(boolean bHabilita)
    {
        // Habilita/Deshabilita clave
        txtDNI.setEnabled(! bHabilita);
        //txtApellidos.setEnabled (! bHabilita);
        cboUsuarios.setEnabled(! bHabilita);
        // Habilita/Deshabilita detalles
        txtNombres.setEnabled(bHabilita);
        txtApellidos.setEnabled(bHabilita);
        //txtDNI.setEnabled(bHabilita);
        txtDireccion.setEnabled(bHabilita);
        txtProfecion.setEnabled(bHabilita);
        txtNroColegiatura.setEnabled(bHabilita);
        txtUsuario.setEnabled(bHabilita);
        txtPass.setEnabled(bHabilita);
        cboRoles.setEnabled(bHabilita);
        cboSexo.setEnabled(bHabilita);
         chkAdmision.setEnabled(bHabilita);
          chkFarmacia.setEnabled(bHabilita);
           chkSistema.setEnabled(bHabilita);
        
        
        lstProcesos.setEnabled(bHabilita);
        
        // Habilita/Desahabilita Operaciones
        btnIns.setEnabled(! bHabilita);
        btnUpd.setEnabled(! bHabilita);
        btnDel.setEnabled(! bHabilita);
        
        // Habilita/Deshabilita captura
        btnOk.setEnabled(bHabilita);
        btnCancel.setEnabled(bHabilita);    
        
        if (bHabilita)
            // Coloca el Foco
            txtDNI.requestFocus();
    
    }
    private void SubCargaRoleProcesos()
    {
        String sQuery;
        String sElemento;
        String sProceso;
        int iPosicion;
        int [] iSeleccionados;
        iSeleccionados = new int[lstProcesos.getModel().getSize()]; //tamaño del arreglo es 3 elementos

        // Inicializa el Vector de Seleccionados
        for (iPosicion = 0; iPosicion < lstProcesos.getModel().getSize();iPosicion++)
        {   
            // Coloca la posición de -1
            iSeleccionados[iPosicion]= -1;
        }
        
        // Prepara el Query de los Procesos
        sQuery = "Select * from u_rol_procesos where rol_user='"+txtRol.getText().toString()+"'";

        // Ejecuta el Query para la Nueva Consulta
        oConn.FnBoolQueryExecute(sQuery);                                

        // Capturo el Error
        try 
        {
            // Verifico que haya habido resultados
            while (oConn.setResult.next())
            {
                // Obtengo el Proceso
                sProceso = oConn.setResult.getString ("procesos_ide");

                for (iPosicion = 0; iPosicion < lstProcesos.getModel().getSize();iPosicion++)
                {
                    // Obtiene el Elemento de la lista
                    sElemento = lstProcesos.getModel().getElementAt(iPosicion).toString();
                    sElemento = sElemento.substring(0,10);                       
                    System.out.println("Comparando Elemento:" + sElemento +" con:"+sProceso);

                    if (sElemento.toUpperCase().contentEquals(sProceso))
                    {
                        //lstProcesos.setSelectedIndex(iPosicion);
                        iSeleccionados[iPosicion]= iPosicion;
                    }
                }

                
            }
            // Asigna el Vector de Seleccionados
            lstProcesos.setSelectedIndices(iSeleccionados);
                
            // Cierro los Resultados
            oConn.setResult.close();                                

        } 
        catch (SQLException ex) 
        {
                oFunc.SubSistemaMensajeError("SubGetRoleProcesos:"+ex.getMessage().toString());
        }
    }
       private void SubSeleccionaProceso(String strProceso)
    {
        int iPosicion;
        int [] iSeleccionados;
        iSeleccionados = new int[lstProcesos.getModel().getSize()]; //tamaño del arreglo es 3 elementos
        String sElemento;
        
        for (iPosicion = 0; iPosicion < lstProcesos.getModel().getSize();iPosicion++)
        {
            // Obtiene el Elemento de la lista
            sElemento = lstProcesos.getModel().getElementAt(iPosicion).toString();
            sElemento = sElemento.substring(0,10);                       
            System.out.println("Comparando Elemento:" + sElemento +" con:"+strProceso);
            
            if (sElemento.contentEquals(strProceso))
            {
               //lstProcesos.setSelectedIndex(iPosicion);
               iSeleccionados[iPosicion]= iPosicion;
            }
            else
                iSeleccionados[iPosicion]=-1;
        }
        
        // Asigna el Vector de Seleccionados
        lstProcesos.setSelectedIndices(iSeleccionados);
        
    }
    
    private void SubSeleccionaRole(String strRole)
    {
        int iPosicion;
        String sElemento;
        
        for (iPosicion = 0; iPosicion < cboRoles.getItemCount();iPosicion++)
        {
            // Obtiene el Elemento de la lista
            sElemento = lstProcesos.getModel().getElementAt(iPosicion).toString();
            sElemento = sElemento.substring(0,10);                       
            System.out.println("Comparando Elemento:" + sElemento +" con:"+strRole);
            
            // Compara el Elemento
            if (sElemento.contentEquals(strRole))
            {
               cboRoles.setSelectedIndex(iPosicion);
               break;
            }
        }
                
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
            java.util.logging.Logger.getLogger(SistemasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new SistemasUsuarios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnIns;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnUpd;
    private javax.swing.JComboBox cboRoles;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JComboBox cboUsuarios;
    private javax.swing.JCheckBox chkAdmision;
    private javax.swing.JCheckBox chkFarmacia;
    private javax.swing.JCheckBox chkSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JList lstProcesos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNroColegiatura;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtProfecion;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
