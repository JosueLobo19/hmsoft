/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public class clsOperacionesUsuarios {
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    public boolean eDatos(JTextField txt,String From,String OptionPane,JTextField nRo){
              boolean bResultado=false;
         int seleccion = JOptionPane.showOptionDialog(null, // Componente padre
    "¿Desea Eliminar Registro de "+OptionPane+"?", //Mensaje
    "Seleccione una opción", // Título
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,    // null para icono por defecto.
    new Object[] { "Si", "No"},   
    "Si");
    if (seleccion != -1)
    {
   if((seleccion + 1)==1)
   {
      if(txt.getText().toString().equals("PASADO")){
        String triaje ="DELETE FROM "+From+" WHERE n_orden="+nRo.getText().toString();
        if(oConn.FnBoolQueryExecuteUpdate(triaje)){
            oFunc.SubSistemaMensajeInformacion("Eliminado Correctamente");
            bResultado = true;
            
        }else{oFunc.SubSistemaMensajeInformacion("No se pudo Eliminar Registro");bResultado = true;}            
   }
   }
   else
   {
      // PRESIONO NO
     }
    }  
    
    return bResultado;
    }
     public void print(Integer cod, String Reporte, String Title){
                
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+Reporte;
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle(Title);
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex){
                    //Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
                     oFunc.SubSistemaMensajeError("No se pudo Cargar el Reporte : "+ Reporte);
                }
     }
       public void print1(String cod, String Reporte, String Title){
                
                Map parameters = new HashMap(); 
                parameters.put("CARTA",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+Reporte;
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle(Title);
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex){
                    //Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
                     oFunc.SubSistemaMensajeError("No se pudo Cargar el Reporte : "+ Reporte);
                }
     }
private javax.swing.JTextField oRs;
public JTextField oConsultar(String selec, String from, JTextField norden){
    oRs = new javax.swing.JTextField();
    String oSql ="SELECT "+selec+" FROM "+from+" WHERE n_orden ='"+norden.getText().toString()+"'";
    oConn.FnBoolQueryExecute(oSql);
    try {
                    if (oConn.setResult.next()) {                        
                        oRs.setText(oConn.setResult.getString(selec));                   
                        
                       
                    }
                    oConn.setResult.close();
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
            }
    
return oRs;

}
public boolean eSubRegistros(JTextField txt,String From,String where,JTextField nRo){
              boolean bResultado=false;
    
      if(txt.getText().toString().equals("PASADO")){
        String triaje ="DELETE FROM "+From+" WHERE "+where+"="+nRo.getText().toString();
        if(oConn.FnBoolQueryExecuteUpdate(triaje)){
            //oFunc.SubSistemaMensajeInformacion("Eliminado Correctamente");
            bResultado = true;
            
        }else{bResultado = true;}            
    
    
   
    }
 return bResultado;
}
public boolean nOrden(JTextField n, String t ){
  boolean bResultado = false;
    if (!n.getText().isEmpty()) {
            String sQuery;

            sQuery = "Select n_orden from "+ t +" Where n_orden =" + n.getText().toString();

            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {

                // Verifico que haya habido resultados
                if (oConn.setResult.next()) {
                    // Resultado
                    bResultado = true;
                   // oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                   // n.setText(null);
                }

                // Cierro los Resultados
                oConn.setResult.close();

            } catch (SQLException ex) {
            }
        }
  return bResultado;
}
public boolean oFinalizado(JTextField n){
    boolean bResultado;
  
    String oSql="UPDATE n_orden_ocupacional SET estado_ex='FINALIZADO' WHERE n_orden ='"+n.getText().toString()+"'";
   
    if(oConn.FnBoolQueryExecuteUpdate(oSql)){
            //oFunc.SubSistemaMensajeInformacion("Eliminado Correctamente");
            bResultado = true;
            
        }else{bResultado = false;}
     return bResultado;
}
    public void fecha(JDateChooser fecha) {
        Date dateHoy = new Date();
        // SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        fecha.setDate(dateHoy);

    }

}
