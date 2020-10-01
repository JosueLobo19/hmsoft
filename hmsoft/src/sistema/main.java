/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
//import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                 JFrame.setDefaultLookAndFeelDecorated(false);
          
            //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeCoffeeSkin");
              syntetica();
                // lip();
              
           new ScreenSplash().animar();
                     }
        });
        
    }
     public static void tiny(){
    try {
        //TinyLookAndFeel.class.getResource("/Silver.theme");
        System.setProperty("sun.awt.noerasebackground", "true");
        UIManager.setLookAndFeel("de.muntjak.tinylookandfeel.TinyLookAndFeel");
        Toolkit.getDefaultToolkit().setDynamicLayout(true);
            //JDialog.setDefaultLookAndFeelDecorated(true);	// to decorate frames
    JDialog.setDefaultLookAndFeelDecorated(true);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
    }

}
     public static void syntetica(){
      try{
                  String[] li = {"Licensee=Juan Diaz Reyna", "LicenseRegistrationNumber=NCJR120428", "Product=Synthetica", "LicenseType=Non Commercial", "ExpireDate=--.--.----", "MaxVersion=2.999.999"};
UIManager.put("Synthetica.license.info", li);
UIManager.put("Synthetica.license.key", "880D7143-7AAA1FDE-63912FC6-171ED2C8-DFB544D6"); 
               UIManager.setLookAndFeel(new  SyntheticaSimple2DLookAndFeel());
               }catch(ParseException | UnsupportedLookAndFeelException ex)
               {
               JOptionPane.showMessageDialog(null,"No cargo thema","error" + ex.getMessage(),JOptionPane.ERROR_MESSAGE);
               
               }
     }
     public static void lip(){
  try {
	   // JFrame.setDefaultLookAndFeelDecorated(true);
	    JDialog.setDefaultLookAndFeelDecorated(true);
	    
	    com.lipstikLF.LipstikLookAndFeel.setMyCurrentTheme(
		    //new com.lipstikLF.theme.LightGrayTheme());
                    new com.lipstikLF.theme.KlearlooksTheme());
	    UIManager.setLookAndFeel("com.lipstikLF.LipstikLookAndFeel");
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
	    System.err.println("Unable to load native look and feel");
	}

}
}
