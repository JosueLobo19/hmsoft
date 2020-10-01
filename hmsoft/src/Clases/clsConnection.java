package Clases;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class clsConnection {
    
    // Esta variable se cambió a static para poder ser manejada como global
    // Cualquier instancia de esta clase utilizará la misma Variable de Conexion
    //Connection oConnection;
    
    
    // Variable de Conexion static para poder ser usada global
    public static Connection oConnection;
    
    // Variable para los Query's
    public Statement sqlStmt;
    
    // Variable global para el Query
    public static String sQuery;
    
    // Variable para los resultados
    public ResultSet setResult;
    public int       intResult;
    
    
    
    
    // Funcion para realizar la conexion
   public boolean FnBoolConnectionOpen(String strConnector, String strHost,String strUser,String strPassword) 
    {
        try
        {
            //Registra y Prepara el Conector
            Class.forName(strConnector);
            
            //Intenta la Conexion
            oConnection = DriverManager.getConnection(strHost, strUser, strPassword);
            
            // Retorna Verdadero 
            return true;
        } 
        catch (ClassNotFoundException | SQLException e)
        {
            // Ocurrió una excepcion la cual imprime            
            JOptionPane.showMessageDialog(null, e.toString());
            
            // Retorna Falso
            return false;
        }       
    }
    
  public  void SubConnectionClose()
    {
        // Captura Exception
        try 
        {
            // Cierra Conexion
            oConnection.close();
        } 
        catch (Exception e)
        {
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error SubQueryExecute:CreateStatement:"+e.getMessage());
            
        }
        
    }
    
    // Procedimiento para Ejecutar un Query
 public boolean FnBoolQueryExecute(String strQuery)
    {
        // Captura el Error
        try 
        {
            // Crea el Objeto para el Query
            sqlStmt = oConnection.createStatement();            
        } 
        catch (Exception e) 
        {
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error SubQueryExecute:createStatement:"+e.getMessage());
            
            // retorna false
            return false;
        }
        try 
        {
            setResult= sqlStmt.executeQuery (strQuery);            
            
            // Retorna que pudo ejecutar
            return true;
            
        } 
        catch (Exception e) 
        {
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error SubQueryExecute:executeQuery:"+e.getMessage());               
            
            // Retorna false
            return false;
        }
    }

    
    // Procedimiento para Ejecutar un Query
   public boolean FnBoolQueryExecuteUpdate(String strQuery)
    {
        // Captura el Error
        try 
        {
            // Crea el Objeto para el Query
            sqlStmt = oConnection.createStatement();            
        } 
        catch (Exception e) 
        {
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error SubQueryExecuteUpdate:createStatement:"+e.getMessage());
            
            // retorna false
            return false;
        }
        try 
        {
            // ejecuta el Update
            intResult =sqlStmt.executeUpdate(strQuery);            
            
            // Retorna que pudo ejecutar
            return true;
            
        } 
        catch (Exception e) 
        {
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error SubQueryExecuteUpdate:executeQuery:"+e.getMessage());               
            
            // Retorna false
            return false;
        }
    }
    
    // Inicia una transacción
   public void SubAutoCommit(boolean bCommit)
    {
        // Coloca el Modo de la transacción
        try 
        {
            oConnection.setAutoCommit(bCommit);
        } 
        catch (SQLException ex) 
        {
            // Genera el Looger
            Logger.getLogger(clsConnection.class.getName()).log(Level.SEVERE, null, ex);
            
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error voidAutoCommit");               
            
        }

    }
    
   public void SubRollBack()
    {
        try 
        {
            oConnection.rollback();
        } catch (SQLException ex) 
        {
            // Graba al Logger
            Logger.getLogger(clsConnection.class.getName()).log(Level.SEVERE, null, ex);
        
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error RollBack");               

        }
    }
    
  public  void SubCommit()
    {
        try {
            oConnection.commit();
        } catch (SQLException ex) 
        {
            // Graba al Logger
            Logger.getLogger(clsConnection.class.getName()).log(Level.SEVERE, null, ex);
            
            // Mensaje de Error
            JOptionPane.showMessageDialog(null,"Error Commit");               
        }
    }
    
}