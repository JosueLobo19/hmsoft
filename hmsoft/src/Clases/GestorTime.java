/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class GestorTime {
    static Date FechaSystem = new Date();
static SimpleDateFormat fechaformato = new SimpleDateFormat("hh:mm:ss a");
public static String FfechaSystem = fechaformato.format(FechaSystem);

public static void setFfechaSystem(String ffechaSystem) {
FfechaSystem = ffechaSystem;
}

public static String getFfechaSystem() {
return FfechaSystem;
} 
} 


