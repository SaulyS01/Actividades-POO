package pintarfiguras1;

import java.awt.Color;
import java.awt.Graphics;

public class Palabra extends Figura{
    
    String s;
    
    public Palabra(int x, int y, String s, Color color1) {
        super(x, y, color1, Color.orange);
        this.s = s;
    }
    
    public void pintar(Graphics g) {
        g.setColor(obtenerColorFondo());
        g.drawString(s, obtenerX(), obtenerY());
    }
}
