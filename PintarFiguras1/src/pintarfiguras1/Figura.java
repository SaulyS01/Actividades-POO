package pintarfiguras1;

//import java.applet.*;
import java.awt.*;

abstract class Figura {

    private int x,y;
    private int [] xa, ya;
    private Color colorFondo,colorBorde;

    public Figura(int x, int y, Color colorFondo, Color colorBorde) {
        this.x = x;
        this.y = y;
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }
    
    public Figura(int [] xa, int [] ya, Color colorFondo, Color colorBorde) {
        this.xa = xa;
        this.ya = ya;
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

    public int obtenerX() {
        return x;
    }
    
    public int obtenerY() {
        return y;
    }
    
    public int [] obtenerXa() {
        return xa;
    }
    
    public int [] obtenerYa() {
        return ya;
    }
    
    public Color obtenerColorFondo() {
        return colorFondo;  
    }
    
    public Color obtenerColorBorde() {
        return colorBorde;
    }

    abstract void pintar(Graphics g);
}
