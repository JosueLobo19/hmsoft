/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autocomplete;

import Clases.clsConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ajSQL {
    /**
     * Recibe una consulta sql y retorna un String de la primera columna
     * @param sql
     * @return
     */
    // clsConnection oConn = new clsConnection();
   // clsFunciones  oFunc = new clsFunciones();
    public static String getCampoUnicoStrin(String sql)
    {
        clsConnection oConn = new clsConnection();
        String xTmp="";
        System.out.println("\nsql: "+sql);
        //conexion d = new conexion();
        //d.estaConectado();
        //ResultSet rs = d.dameLista(sql);
         
        try
        {
            oConn.FnBoolQueryExecute(sql);
            while (oConn.setResult.next())
            
            {
                xTmp=oConn.setResult.getString(1);
                break;
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No fue posible procesar el sql, por favor verifique su estructura", "Error de integridad", 0);
           
            //oConn.SubConnectionClose();
            return xTmp="";
        }      
            //oConn.SubConnectionClose();
        return xTmp;
    }
}