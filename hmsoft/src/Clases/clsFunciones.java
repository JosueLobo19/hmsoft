/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.toedter.calendar.JDateChooser;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author admin
 */
public class clsFunciones {
  clsConnection oConn = new clsConnection();
 
     Integer counter=0;
     String value=""; 
     Integer del;
    public void SubSistemaMensajeInformacion(String strMensaje)
    {
        
        // Añade el Usuario al Mensaje
        //JOptionPane.showMessageDialog(null,strMensaje);
        JOptionPane.showMessageDialog(null, strMensaje, "Sistema MEDSOFT",JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    public void SubSistemaMensajeError(String strMensaje)
    {
    
    JOptionPane.showMessageDialog(null, strMensaje,"Sistema MEDSOFT",JOptionPane.ERROR_MESSAGE);
    }        
    String fnIntSistemaSolicitaDatos(String strMensaje)
    {
        
        // Añade el Usuario al Mensaje        
        return JOptionPane.showInputDialog(null, strMensaje);
        
        
    }
    
    public int fnIntSistemaPregunta(String strMensaje)
    {
        
        // Añade el Usuario al Mensaje
        return JOptionPane.showConfirmDialog(null, strMensaje);
        
        
    }

public void NoLetras(java.awt.event.KeyEvent evt){
int k=(int)evt.getKeyChar();
if (k >= 97 && k <= 122 || k>=65 && k<=90){
evt.setKeyChar((char)KeyEvent.VK_CLEAR);
Toolkit.getDefaultToolkit().beep(); 
JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Ingreso de Datos",JOptionPane.ERROR_MESSAGE);
}
if(k==241 || k==209){
evt.setKeyChar((char)KeyEvent.VK_CLEAR);
Toolkit.getDefaultToolkit().beep(); 
JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Ingreso de Datos",JOptionPane.ERROR_MESSAGE);
}
if(k==32){
evt.setKeyChar((char)KeyEvent.VK_CLEAR);
Toolkit.getDefaultToolkit().beep(); 
JOptionPane.showMessageDialog(null,"No puede ingresar Espacios!!!","Ventana Error Ingreso de Datos",JOptionPane.ERROR_MESSAGE);
}
}
 public MaskFormatter setMascara(String mascara){  
      MaskFormatter mask = null;  
      try{  
         mask = new MaskFormatter(mascara);                    
         }catch(java.text.ParseException ex){}  
      return mask;  
   } 
    
    // Valida que un caracter sea un número
    public boolean fnBoolIsNumeric(char cCaracter)
    {
        // Variable de Resultados
        boolean bResult=false;
        
        // Valida uno por uno los caracteres
        if (cCaracter =='0')
            bResult = true;
        else
        if (cCaracter =='1')
            bResult = true;
        else
        if (cCaracter =='2')
            bResult = true;
        else
        if (cCaracter =='3')
            bResult = true;
        else
        if (cCaracter =='4')
            bResult = true;
        else
        if (cCaracter =='5')
            bResult = true;
        else
        if (cCaracter =='6')
            bResult = true;
        else
        if (cCaracter =='7')
            bResult = true;
        else
        if (cCaracter =='8')
            bResult = true;
        else
        if (cCaracter =='9')
            bResult = true;        
            
        // Valor de Retorno
        return bResult;
    }
    
   public boolean fnBoolIsInteger(String sCadena)
    {
        // Valor de Resultado
        boolean bResult = true;
        int iCuenta;
        
        if (sCadena.isEmpty())
            bResult = false;
        else
            for (iCuenta=0;iCuenta < sCadena.length();iCuenta++)
                if (! fnBoolIsNumeric(sCadena.charAt(iCuenta)))
                {
                    bResult = false;       
                    break;
                }
        // Retorna el Valor
        return bResult;
    }
    
    public boolean fnBoolIsDecimal(String sCadena)
    {
        // Valor de Resultado
        boolean bResult = true;
        boolean bPunto = false;
        int iCuenta;
        
        if (sCadena.isEmpty())
            bResult = false;
        else
            for (iCuenta=0;iCuenta < sCadena.length();iCuenta++)            
                // Verifica que sea un punto
                if (sCadena.charAt(iCuenta)=='.')
                    // Verifica que no haya ya un punto
                    if (bPunto)
                    {
                        bResult = false;
                        break;
                    }
                    else
                        bPunto = true;
                else
                    if (! fnBoolIsNumeric(sCadena.charAt(iCuenta)))
                    {
                        bResult = false;       
                        break;
                    }            
        // Retorna el Valor
        return bResult;
    }
    
    public String getStringOfNumber(Integer $num){
        this.counter = $num;
        return doThings($num);
    }
    
    public String doThings(Integer _counter){
        //Limite
        if(_counter >2000000)
            return "DOS MILLONES";
        
        switch(_counter){
            case 0: return "CERO";
            case 1: return "UN"; //UNO
            case 2: return "DOS";
            case 3: return "TRES";
            case 4: return "CUATRO";
            case 5: return "CINCO"; 
            case 6: return "SEIS";
            case 7: return "SIETE";
            case 8: return "OCHO";
            case 9: return "NUEVE";
            case 10: return "DIEZ";
            case 11: return "ONCE"; 
            case 12: return "DOCE"; 
            case 13: return "TRECE";
            case 14: return "CATORCE";
            case 15: return "QUINCE";
            case 20: return "VEINTE";
            case 30: return "TREINTA";
            case 40: return "CUARENTA";
            case 50: return "CINCUENTA";
            case 60: return "SESENTA";
            case 70: return "SETENTA";
            case 80: return "OCHENTA";
            case 90: return "NOVENTA";
            case 100: return "CIEN";
            
            case 200: return "DOSCIENTOS";
            case 300: return "TRESCIENTOS";
            case 400: return "CUATROCIENTOS";
            case 500: return "QUINIENTOS";
            case 600: return "SEISCIENTOS";
            case 700: return "SETECIENTOS";
            case 800: return "OCHOCIENTOS";
            case 900: return "NOVECIENTOS";
            
            case 1000: return "MIL";
            
            case 1000000: return "UN MILLON";
            case 2000000: return "DOS MILLONES";
        }
        if(_counter<20){
            //System.out.println(">15");
            return "DIECI"+ doThings(_counter-10);
        }
        if(_counter<30){
            //System.out.println(">20");
            return "VEINTI" + doThings(_counter-20);
        }
        if(_counter<100){
            //System.out.println("<100"); 
            return doThings( (int)(_counter/10)*10 ) + " Y " + doThings(_counter%10);
        }        
        if(_counter<200){
            //System.out.println("<200"); 
            return "CIENTO " + doThings( _counter - 100 );
        }         
        if(_counter<1000){
            //System.out.println("<1000");
            return doThings( (int)(_counter/100)*100 ) + " " + doThings(_counter%100);
        } 
        if(_counter<2000){
            //System.out.println("<2000");
            return "MIL " + doThings( _counter % 1000 );
        } 
        if(_counter<1000000){
            String var;
            //System.out.println("<1000000");
            var = doThings((int)(_counter/1000)) + " MIL" ;
            if(_counter % 1000!=0){
                //System.out.println(var);
                var += " " + doThings(_counter % 1000);
            }
            return var;
        }
        if(_counter<2000000){
            return "UN MILLON " + doThings( _counter % 1000000 );
        } 
        return "";
    }
public int calcularEdad(Calendar fechaNac){
    
    Calendar today = Calendar.getInstance();
    int diay = today.get(Calendar.YEAR);
    int fechay = fechaNac.get(Calendar.YEAR);
    int diff_year = diay - fechay;
    int diam = today.get(Calendar.MONTH);
    int fecham = fechaNac.get(Calendar.MONTH);
    int diff_month = diam - fecham;
    int dia = today.get(Calendar.DAY_OF_MONTH);
    int fecha = fechaNac.get(Calendar.DAY_OF_MONTH);
    int diff_day = dia - fecha;
    //Si está en ese año pero todavía no los ha cumplido
    if(diff_month<0 || (diff_month==0 && diff_day<0)){
        int factor=1;
        diff_year = diff_year - factor;
    }
    return diff_year;
}
public int calcularDias(Calendar fecha){
    
    Calendar today = Calendar.getInstance();
    int diay = today.get(Calendar.YEAR);
    int fechay = fecha.get(Calendar.YEAR);
    int diff_year = diay - fechay;
    int diam = today.get(Calendar.MONTH);
    int fecham = fecha.get(Calendar.MONTH);
    int diff_month = diam - fecham;
    int dia = today.get(Calendar.DAY_OF_MONTH);
    int fecha1 = fecha.get(Calendar.DAY_OF_MONTH);
    int diff_day = dia - fecha1;
    if(diff_month<0 || (diff_month==0 && diff_year<0)){
        int factor=1;
        diff_day = diff_year -factor;
    }
    //Si está en ese año pero todavía no los ha cumplido
    return diff_day;
}
public Double Sol(String sol){
        String s= sol.replaceAll("S/.","");
        Double soles = Double.valueOf(s);
        return soles; 
}
public String SolImp(String sol){
        String s= sol.replaceAll("S/.","");
        return s; 
}

public Double SolAll(String sol){
     
        String s= sol.replaceAll("S/.","");
        String s2= s.replaceAll(",", "");
        Double soles = Double.valueOf(s2);
        return soles; 
}
public String Soles(String sol){
        String s1= sol.replace("S/.","");
        String s2 = s1.replaceAll(",", "");
        String s = s2;
        return s; 

}
public double num(JComboBox j){
   String s = j.getSelectedItem().toString();
   double p = 0 ;
        switch (s.toString()) {
            case "-":
                p = 1;
                break;
            case "10%":
                p = 0.10;
                break;
            case "15%":
                p = 0.15;
                break;
            case "20%":
                p = 0.20;
                break;
            case "25%":
                p = 0.25;
                break;    
            case "30%":
                p = 0.30;
                break;
            case "35%":
                p = 0.35;
                break;
            case "40%":
                p = 0.40;
                break;
            case "45%":
                p = 0.45;
                break;
            case "50%":
                p = 0.50;
                break;
           case "55%":
                p = 0.55;
                break;
           case "60%":
                p = 0.60;
                break;
          case "65%":
                p = 0.65;
                break;
          case "70%":
                p = 0.70;
                break;
          case "75%":
                p = 0.75;
                break;    
        }


return p;
}
public double numtext(String j){
   String s = j.toString();
   double p = 0 ;
        switch (s.toString()) {
            case "-":
                p = 1;
                break;
            case "10%":
                p = 0.10;
                break;
            case "15%":
                p = 0.15;
                break;
            case "20%":
                p = 0.20;
                break;
            case "25%":
                p = 0.25;
                break;    
            case "30%":
                p = 0.30;
                break;
            case "35%":
                p = 0.35;
                break;
            case "40%":
                p = 0.40;
                break;
            case "45%":
                p = 0.45;
                break;
            case "50%":
                p = 0.50;
                break;
            case "55%":
                p = 0.55;
                break;
            case "60%":
                p = 0.60;
                break;
            case "65%":
                p = 0.65;
                break;
            case "70%":
                p = 0.70;
                break;
            case "75%":
                p = 0.75;
                break;     
        }


return p;
}
public String convertir(Double c){
 DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');
        DecimalFormat formateador = new DecimalFormat("'S/.'###,###.00",simbolo);
       String numero = formateador.format(c);
        return numero;
}
public Formatter nSerie(){
/*Devuelve Numero de Serie de Factura
 * 
 */
    Formatter fmt = new Formatter();
    Integer n;
String s="SELECT serie, del,hasta FROM serie_factura WHERE estado = TRUE";
                                            
    oConn.FnBoolQueryExecute(s);
    try {
        if(oConn.setResult.next()){
           n= oConn.setResult.getInt("serie");
           del = oConn.setResult.getInt("del")-1;
            clsGlobales.sHasta = oConn.setResult.getInt("hasta");
            fmt.format("%04d" , n);
            oConn.setResult.close();
        }
    } catch (Exception e) {
    }

return fmt;
}
public Formatter serie(Integer n){
 Formatter fmt = new Formatter();
 
 fmt.format("%04d" , n);
    return fmt;
}
public Formatter factura(Integer n){
 Formatter fmt = new Formatter();
 
 fmt.format("%07d" , n);
    return fmt;
}
public boolean nExiste(){
 boolean bResultado=false;
  String s="SELECT f_serie FROM facturas_detalle where f_serie="+ nSerie();
  oConn.FnBoolQueryExecute(s);
    try {
        if(oConn.setResult.next()){
        bResultado = true;
        }
    } catch (Exception e) {
    }
 
  return bResultado;
}
public Formatter nFactura(){
    Formatter fmt = new Formatter();
    Integer n ;
    if(nExiste()){
     String s="SELECT max(n_factura)  as nfactura FROM facturas_detalle where f_serie="+ nSerie();
    oConn.FnBoolQueryExecute(s);    
      try {
          if(oConn.setResult.next()){             
             n= oConn.setResult.getInt(1) ;
           n+=1;
           fmt.format("%07d" , n);
          }
          oConn.setResult.close();
    } catch (Exception e) {
    }
    }else{
    n= del + 1;
    fmt.format("%07d" , n);
    }   
return fmt;
}

public boolean vFactura(Formatter nFactura, Formatter nSerie){
/*
 * Validamos Factura
 */
 boolean bResultado=false;
String vF = "SELECT n_factura,f_serie FROM facturas_detalle WHERE  n_factura ="+nFactura+" AND f_serie ="+nSerie; 
   // SubSistemaMensajeInformacion(vF);
    oConn.FnBoolQueryExecute(vF);
    try {
        if(!oConn.setResult.wasNull()){
            bResultado = true;        
        }
        oConn.setResult.close();
    }catch(Exception e){
    }
 return bResultado;
}
public Formatter Digitos(Integer Fac){
Formatter fmt = new Formatter();
fmt.format("%04d", Fac);
return fmt;
}
public String nOcupacional(String n){
    String sql="SELECT cod_ho FROM historia_oc_info WHERE n_orden = '"+n+"'";
    String num = null;
    oConn.FnBoolQueryExecute(sql);
    try {
        if(oConn.setResult.next()){
            num = oConn.setResult.getString("cod_ho");
         }
        
    } catch (Exception e) {
    }
return num;
}
public Double igv(){
 String s="SELECT valor FROM igv WHERE estado = true";
 
 Double igv = null;
 oConn.FnBoolQueryExecute(s);
    try {
        if(oConn.setResult.next()){
            clsGlobales.igv = oConn.setResult.getString("valor");
            switch (oConn.setResult.getString("valor")) {
            case "17%":
                igv = 1.17;
                break;    
            case "18%":
                igv = 1.18;
                break;
            case "19%":
                igv = 1.19;
                break;
                      
        }
        
        }
        oConn.setResult.close();
    } catch (Exception e) {
    }
    return igv;
}
public Formatter tSerie(String tabla, String campo){
    Formatter fmt = new Formatter();
    
String s="SELECT MAX("+campo.toString()+") FROM "+tabla.toString();                                            
    oConn.FnBoolQueryExecute(s);
    try {
        if(oConn.setResult.next()){
               if(tabla.equals("s_n_boleta")){ 
              clsGlobales.bSerie = oConn.setResult.getInt(1);  
               }
               if(tabla.equals("s_n_factura")){ 
              clsGlobales.fSerie = oConn.setResult.getInt(1);  
               }
               if(tabla.equals("s_n_ticket")){ 
              clsGlobales.tSerie = oConn.setResult.getInt(1);  
               }
             fmt.format("%04d" , oConn.setResult.getInt(1));
            oConn.setResult.close();
        }
    } catch (Exception e) {
    }
return fmt;
}
public Formatter tSerieGlobal(String tabla, String campo){
    Formatter fmt = new Formatter();
    Integer n;
String s="SELECT desde, hasta FROM "+tabla.toString()+" WHERE "+campo.toString()+" = "+tSerie(tabla, campo);                                            
    oConn.FnBoolQueryExecute(s);
    try {
        if(oConn.setResult.next()){
            
            if(tabla.equals("s_n_boleta")){
            clsGlobales.bdesde = oConn.setResult.getInt("desde");
            clsGlobales.bHasta = oConn.setResult.getInt("hasta");
            }
            if(tabla.equals("s_n_factura")){
            clsGlobales.fdesde = oConn.setResult.getInt("desde");
            clsGlobales.fHasta = oConn.setResult.getInt("hasta");
            }
            if(tabla.equals("s_n_ticket")){
            clsGlobales.tdesde = oConn.setResult.getInt("desde");
            clsGlobales.tHasta = oConn.setResult.getInt("hasta");
            }
            oConn.setResult.close();
        }
    } catch (Exception e) {
    }
return fmt;
}

public Formatter nFacturas(String tabla, String campo,String serie1 ,String serie2){
   Formatter fmt = new Formatter();
   String oSql="SELECT MAX("+campo.toString()+") FROM "+ tabla.toString()+" WHERE "+serie1.toString()+" = "+ serie2.toString();
   oConn.FnBoolQueryExecute(oSql);
    try {
         if(oConn.setResult.next()){
             if(oConn.setResult.getString(1) == null){
                 if(tabla.equals("ticket")){
                 fmt.format("%07d" , clsGlobales.tdesde);
                 }
                 if(tabla.equals("facturas")){
                 fmt.format("%07d" , clsGlobales.fdesde);
                 }
                 if(tabla.equals("boletas")){
                 fmt.format("%07d" , clsGlobales.bdesde);
                 }
             }else{
                fmt.format("%07d" , oConn.setResult.getInt(1)+1);
             }
              
            oConn.setResult.close();
        }else{
             
         }
        
    } catch (Exception e) {
    }
   return fmt;
   }

public JDateChooser Fecha(JDateChooser fecha){
Date fechaDate = new Date();
fecha.setDate(fechaDate);

return fecha;
}
public boolean sConsultas(String tabla , String campo, String nro){
        boolean bresult = false;
        String sStmt;
        sStmt = " Select "+campo+" from "+tabla;
        sStmt+= " Where n_orden='"+nro+"'";
        oConn.FnBoolQueryExecute(sStmt);
        try {
        if (oConn.setResult.next()){
            bresult = true;
        }
        oConn.setResult.close();
    } catch (Exception e) {
    }
        
        return bresult;


}



}
