package pintarfiguras1;

//import java.applet.*;
import java.awt.*;

public class Rectangulo extends Figura {
    
    int ancho,alto;

    public Rectangulo(int x1, int y1, int ancho, int alto, Color color1) {
        super(x1, y1, color1, Color.blue);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    //fillRect(int x,int y,int w,int h): Rellena el rectangulo.
    //drawRect(int x,int y,int w,int h): Dibuja el rectangulo.
    
    public void pintar(Graphics g) {
        g.setColor(obtenerColorFondo());
        g.fillRect(obtenerX(), obtenerY(), alto, ancho);
        g.setColor(obtenerColorBorde());
        g.drawRect(obtenerX(), obtenerY(), alto, ancho);
    }
}

