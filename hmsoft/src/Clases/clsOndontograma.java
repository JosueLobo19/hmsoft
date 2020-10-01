/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import javax.swing.JLabel;
import sistema.Odontograma;
import sistema.Odontograma1;
/**
 *
 * @author admin
 */
public class clsOndontograma {
   clsFunciones  oFunc = new clsFunciones(); 
   public void Ausente( JLabel label){
     label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgAusente.png")));
     label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212,208,200)));
     OValidar();
     OValidarLO();
   }    
    public void Cariada(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPorOturar.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }
    public void Extraer(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgExtraer.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }
    public void Fracturada(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgFracturada.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }

    public void Obturacion(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgObturacionEfectuada.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }

    public void Corona(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgCorona.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }

    public void Puente(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPuente.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }

    public void Metalica(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPPRMetalica.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }

    public void Acrilica(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPPRAcrilica.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }

    public void Total(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgPTotal.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }

    public void Normal(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png")));
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200)));
        OValidar();
        OValidarLO();
    }

public void OValidar( ){
    int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0,g = 0,h = 0,i = 0,j = 0,k = 0,l = 0;
    JLabel Labels[] = { Odontograma.lbl11, Odontograma.lbl12, Odontograma.lbl13,Odontograma.lbl14 ,Odontograma.lbl15 ,Odontograma.lbl16 ,Odontograma.lbl17 ,Odontograma.lbl18, 
                      Odontograma.lbl21,Odontograma.lbl22,Odontograma.lbl23,Odontograma.lbl24,Odontograma.lbl25,Odontograma.lbl26,Odontograma.lbl27,Odontograma.lbl28,
                      Odontograma.lbl31,Odontograma.lbl32,Odontograma.lbl33,Odontograma.lbl34,Odontograma.lbl35,Odontograma.lbl36,Odontograma.lbl37,Odontograma.lbl38,
                      Odontograma.lbl41,Odontograma.lbl42,Odontograma.lbl43,Odontograma.lbl44,Odontograma.lbl45,Odontograma.lbl46,Odontograma.lbl47,Odontograma.lbl48};
     for(int v=0;v<32;v++){
	if( Labels[v].getIcon().toString().equals(Odontograma.lblAusente.getIcon().toString())){
        a +=1; Odontograma.txtAusente.setText(String.valueOf(a));
       
        }
	if( Labels[v].getIcon().toString().equals(Odontograma.lblCariadaOturar.getIcon().toString())){
        b +=1; Odontograma.txtCariada.setText(String.valueOf(b));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma.lblPorExtraer.getIcon().toString())){
        c +=1; Odontograma.txtExtraer.setText(String.valueOf(c));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma.lblFracturada.getIcon().toString())){
        d +=1; Odontograma.txtFracturadas.setText(String.valueOf(d));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma.lblObturacionEfectuada.getIcon().toString())){
        e += 1; Odontograma.txtObturacionEfectuada.setText(String.valueOf(e));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma.lblCorona.getIcon().toString())){
        f += 1; Odontograma.txtCorona.setText(String.valueOf(f));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma.lblPuente.getIcon().toString())){
        g += 1; Odontograma.txtPuente.setText(String.valueOf(g));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma.lblPPRMetalica.getIcon().toString())){
        h += 1; Odontograma.txtMetalica.setText(String.valueOf(h));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma.lblPPRAcrilica.getIcon().toString())){
        i += 1; Odontograma.txtAcrilica.setText(String.valueOf(i));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma.lblPtotal.getIcon().toString())){
        j += 1; Odontograma.txtTotal.setText(String.valueOf(j));
        }
        if( Labels[v].getIcon().toString().equals(Odontograma.lblNormal.getIcon().toString())){
         
            if(v == 0 ){a=0; Odontograma.txtAusente.setText(String.valueOf(a));  }
         if(v == 0 ){b=0; Odontograma.txtCariada.setText(String.valueOf(b)); }
         if(v == 0 ){c=0; Odontograma.txtExtraer.setText(String.valueOf(c)); }
         if(v == 0 ){d=0; Odontograma.txtFracturadas.setText(String.valueOf(d));}
         if(v == 0 ){e=0; Odontograma.txtObturacionEfectuada.setText(String.valueOf(e));}
         if(v == 0 ){f=0; Odontograma.txtCorona.setText(String.valueOf(f));}
         if(v == 0 ){g=0; Odontograma.txtPuente.setText(String.valueOf(g));}
         if(v == 0 ){h=0; Odontograma.txtMetalica.setText(String.valueOf(h));}
         if(v == 0 ){i=0; Odontograma.txtAcrilica.setText(String.valueOf(i));}
         if(v == 0 ){j=0; Odontograma.txtTotal.setText(String.valueOf(j));}
         if(v == 0 ){k=0; Odontograma.txtNormal.setText(String.valueOf(k));}
           
     }
    k = 32 - (a+b+c+d+e+f+g+h+i+j) ; Odontograma.txtNormal.setText(String.valueOf(k));
    l = b + c + d ; Odontograma.txtDientesmalEstado.setText(String.valueOf(l));
    }
}
public void Limpiar()
{
    JLabel Labels[] = { Odontograma.lbl11, Odontograma.lbl12, Odontograma.lbl13,Odontograma.lbl14 ,Odontograma.lbl15 ,Odontograma.lbl16 ,Odontograma.lbl17 ,Odontograma.lbl18, 
                      Odontograma.lbl21,Odontograma.lbl22,Odontograma.lbl23,Odontograma.lbl24,Odontograma.lbl25,Odontograma.lbl26,Odontograma.lbl27,Odontograma.lbl28,
                      Odontograma.lbl31,Odontograma.lbl32,Odontograma.lbl33,Odontograma.lbl34,Odontograma.lbl35,Odontograma.lbl36,Odontograma.lbl37,Odontograma.lbl38,
                      Odontograma.lbl41,Odontograma.lbl42,Odontograma.lbl43,Odontograma.lbl44,Odontograma.lbl45,Odontograma.lbl46,Odontograma.lbl47,Odontograma.lbl48};
    for(int v=0;v<32;v++){
    Labels[v].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png")));
    }
    Odontograma.txtNorden.setText(null);
    Odontograma.txtNombre.setText(null);
    Odontograma.txtEdad.setText(null);
    Odontograma.txtSexo.setText(null);
    Odontograma.txtEmpresa.setText(null);
    Odontograma.txtContrata.setText(null);
    
   
   }
public void OValidarLO( ){
    int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0,g = 0,h = 0,i = 0,j = 0,k = 0,l = 0;
    JLabel Labels[] = { Odontograma1.lbl11, Odontograma1.lbl12, Odontograma1.lbl13,Odontograma1.lbl14 ,Odontograma1.lbl15 ,Odontograma1.lbl16 ,Odontograma1.lbl17 ,Odontograma1.lbl18, 
                      Odontograma1.lbl21,Odontograma1.lbl22,Odontograma1.lbl23,Odontograma1.lbl24,Odontograma1.lbl25,Odontograma1.lbl26,Odontograma1.lbl27,Odontograma1.lbl28,
                      Odontograma1.lbl31,Odontograma1.lbl32,Odontograma1.lbl33,Odontograma1.lbl34,Odontograma1.lbl35,Odontograma1.lbl36,Odontograma1.lbl37,Odontograma1.lbl38,
                      Odontograma1.lbl41,Odontograma1.lbl42,Odontograma1.lbl43,Odontograma1.lbl44,Odontograma1.lbl45,Odontograma1.lbl46,Odontograma1.lbl47,Odontograma1.lbl48};
     for(int v=0;v<32;v++){
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblAusente.getIcon().toString())){
        a +=1; Odontograma1.txtAusente.setText(String.valueOf(a));
       
        }
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblCariadaOturar.getIcon().toString())){
        b +=1; Odontograma1.txtCariada.setText(String.valueOf(b));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblPorExtraer.getIcon().toString())){
        c +=1; Odontograma1.txtExtraer.setText(String.valueOf(c));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblFracturada.getIcon().toString())){
        d +=1; Odontograma1.txtFracturadas.setText(String.valueOf(d));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblObturacionEfectuada.getIcon().toString())){
        e += 1; Odontograma1.txtObturacionEfectuada.setText(String.valueOf(e));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblCorona.getIcon().toString())){
        f += 1; Odontograma1.txtCorona.setText(String.valueOf(f));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblPuente.getIcon().toString())){
        g += 1; Odontograma1.txtPuente.setText(String.valueOf(g));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblPPRMetalica.getIcon().toString())){
        h += 1; Odontograma1.txtMetalica.setText(String.valueOf(h));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblPPRAcrilica.getIcon().toString())){
        i += 1; Odontograma1.txtAcrilica.setText(String.valueOf(i));
        }
	if( Labels[v].getIcon().toString().equals(Odontograma1.lblPtotal.getIcon().toString())){
        j += 1; Odontograma1.txtTotal.setText(String.valueOf(j));
        }
        if( Labels[v].getIcon().toString().equals(Odontograma1.lblNormal.getIcon().toString())){
         
            if(v == 0 ){a=0; Odontograma1.txtAusente.setText(String.valueOf(a));  }
         if(v == 0 ){b=0; Odontograma1.txtCariada.setText(String.valueOf(b)); }
         if(v == 0 ){c=0; Odontograma1.txtExtraer.setText(String.valueOf(c)); }
         if(v == 0 ){d=0; Odontograma1.txtFracturadas.setText(String.valueOf(d));}
         if(v == 0 ){e=0; Odontograma1.txtObturacionEfectuada.setText(String.valueOf(e));}
         if(v == 0 ){f=0; Odontograma1.txtCorona.setText(String.valueOf(f));}
         if(v == 0 ){g=0; Odontograma1.txtPuente.setText(String.valueOf(g));}
         if(v == 0 ){h=0; Odontograma1.txtMetalica.setText(String.valueOf(h));}
         if(v == 0 ){i=0; Odontograma1.txtAcrilica.setText(String.valueOf(i));}
         if(v == 0 ){j=0; Odontograma1.txtTotal.setText(String.valueOf(j));}
         if(v == 0 ){k=0; Odontograma1.txtNormal.setText(String.valueOf(k));}
           
     }
    k = 32 - (a+b+c+d+e+f+g+h+i+j) ; Odontograma1.txtNormal.setText(String.valueOf(k));
    l = b + c + d ; Odontograma1.txtDientesmalEstado.setText(String.valueOf(l));
    }
}
public void LimpiarLO()
{
    JLabel Labels[] = { Odontograma1.lbl11, Odontograma1.lbl12, Odontograma1.lbl13,Odontograma1.lbl14 ,Odontograma1.lbl15 ,Odontograma1.lbl16 ,Odontograma1.lbl17 ,Odontograma1.lbl18, 
                      Odontograma1.lbl21,Odontograma1.lbl22,Odontograma1.lbl23,Odontograma1.lbl24,Odontograma1.lbl25,Odontograma1.lbl26,Odontograma1.lbl27,Odontograma1.lbl28,
                      Odontograma1.lbl31,Odontograma1.lbl32,Odontograma1.lbl33,Odontograma1.lbl34,Odontograma1.lbl35,Odontograma1.lbl36,Odontograma1.lbl37,Odontograma1.lbl38,
                      Odontograma1.lbl41,Odontograma1.lbl42,Odontograma1.lbl43,Odontograma1.lbl44,Odontograma1.lbl45,Odontograma1.lbl46,Odontograma1.lbl47,Odontograma1.lbl48};
    for(int v=0;v<32;v++){
    Labels[v].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/odontograma/imgNormal.png")));
    }
    Odontograma1.txtNorden.setText(null);
    Odontograma1.txtNombre.setText(null);
    Odontograma1.txtEdad.setText(null);
    Odontograma1.txtSexo.setText(null);
    Odontograma1.txtEmpresa.setText(null);
    Odontograma1.txtContrata.setText(null);
    
   
   }


}


