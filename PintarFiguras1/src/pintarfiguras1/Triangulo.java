package pintarfiguras1;

import java.awt.*;

public class Triangulo extends Figura {
        
    public Triangulo(int [] xa, int [] ya, Color color1) {
        super(xa, ya, color1, Color.green);
    }
    
    public void pintar(Graphics g){
        
        //fillPolygon(int[] x,int[] y,int N): Rellena el poligono de N vertices 
                                            //con las coordenadas especificadas.
                                            
        //drawPolygon(int[] x,int[] y,int N): Dibuja el pol�gono de N v�rtices 
                                            //con las coordenadas especificadas.
                                            
        g.setColor(obtenerColorFondo());
        g.fillPolygon(obtenerXa(), obtenerYa(), 3);
        g.setColor(obtenerColorBorde());
        g.drawPolygon(obtenerXa(), obtenerYa(), 3);
    }
}
