package sistema;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
/**
 * @web http://www.jc-mouse.net
 * @author Mouse
 */
public final class ScreenSplash {

  final SplashScreen splash ;
  //texto que se muestra a medida que se va cargando el screensplah
  final String[] texto = {"Cargando BD" ,"configurando entorno", "librerias",
                          "archivos","formularios","iconos","properties",
                          "XML files", "extenciones", "reportes",
                          "database" ,"server","listo",
                          ""};

  public ScreenSplash() {
	 splash = SplashScreen.getSplashScreen();
  }

   public void animar()
   {
        if (splash != null)
        {
            Graphics2D g = splash.createGraphics();
            for(int i=1; i<texto.length; i++)
            {                       
                //se pinta texto del array
                g.setColor(new Color(204,204,204));//color de fondo
	        g.fillRect(203, 328,260,12);//para tapar texto anterior
                g.setColor(Color.DARK_GRAY);//color de texto	        
                g.drawString("cargando "+texto[i-1]+"...", 203, 338);                
                g.setColor(Color.ORANGE);//color de barra de progeso
                g.fillRect(204, 306,(i*300/texto.length), 13);//la barra de progreso
                ///se pinta una linea segmentada encima de la barra verde
                //float dash1[] = {2.0f};
                //BasicStroke dashed = new BasicStroke(9.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,5.0f, dash1, 0.0f);
                //g.setStroke(dashed);
                g.setColor(new Color(201,201,201));//color de barra de progeso
                g.setColor( new Color(102,102,102));
               // g.drawLine(205,314, 510, 314);                
                //se actualiza todo
                splash.update();
		try {
		 Thread.sleep(100);
		} catch(InterruptedException e) { }
            }
	   splash.close();
	}
        //una vez terminada la animación se muestra la aplicación principal
         try {
             new Ingreso().setVisible(true);
         }
	catch (Exception e) {
            System.out.println(e.getMessage());
        }
   }
    
}
