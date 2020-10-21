package pintarfiguras1;

//import java.applet.*;
import java.awt.*;

public class Circulo extends Figura {
    
    int radio;

    public Circulo(int x1, int y1, int radio, Color color1) {
        super(x1, y1, color1, Color.red);//llamar al constructor de Figura
        this.radio = radio;
    }

    //fillRoundRect(int x,int y,int w,int h,int aw,int ah):
                                                      //Rellena un rectangulo con vertices redondeados. 
                                                      //aw es el ancho del arco y ah el alto.
    //drawRoundRect(int x,int y,int w,int h,int aw,int ah): 
                                                      //Dibuja un rect�ngulo con 
                                                      //vertices redondeados. aw 
                                                      //es el ancho del arco y ah 
                                                      //el alto.
    
    public void pintar(Graphics g) {
        g.setColor(obtenerColorFondo());
        g.fillRoundRect(obtenerX(),obtenerY(), radio, radio, radio, radio);
        g.setColor(obtenerColorBorde());
        g.drawRoundRect(obtenerX(),obtenerY(), radio, radio, radio, radio);
    }
}



