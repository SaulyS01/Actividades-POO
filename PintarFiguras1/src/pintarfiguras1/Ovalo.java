package pintarfiguras1;

import java.awt.Color;
import java.awt.Graphics;

public class Ovalo extends Figura {
    
    int ancho,alto;
    
    public Ovalo(int x1, int y1, int ancho, int alto, Color color1) {
        super(x1, y1, color1, Color.red);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public void pintar(Graphics g) {
        g.setColor(obtenerColorFondo());
        g.fillOval(obtenerX(), obtenerY(), alto, ancho);
        g.setColor(obtenerColorBorde());
        g.drawOval(obtenerX(), obtenerY(), alto, ancho);
    }
}
