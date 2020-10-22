package pintarfiguras1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;

public class NewJFrame extends JFrame {
    
    //Figura vector[];
    int N, h, w;
    ArrayList<Figura> listA;

    public NewJFrame() {
        initComponents();
        llenar_vector();
        setTitle("FIGURAS UTILIZANDO POLIMORFISMO");
    }

    public void llenar_vector() {
        
        int i, x, y, r, alto, ancho, calc;
        Color color;
        h = this.getHeight();
        w = this.getWidth();
        listA = new ArrayList<Figura>();
        
        for(i = 0; i < 300; i++) { 
            
            int [] vacXa;
            int [] vacYa;
            
            x = (int)(Math.random() * w); //la pisición de tu figura, origen
            y = (int)(Math.random() * h);
            color = new Color((int)(Math.random() * 250), (int)(Math.random() * 250), (int)(Math.random() * 250));
            if (i >= 0 && i < 100) {
                r = (int)(Math.random() * 60);
                //vector[i] = new Circulo(x, y, r, color);
                listA.add(new Circulo(x, y, r, color));
            } else if (i >= 100 && i < 110) {
                vacXa = new int[3];
                vacYa= new int[3];
                for (calc = 0; calc < 3; calc++) {
                    vacXa [calc] = (int)((x * Math.random()) + i * 0.2);
                    vacYa [calc] = (int)((y * Math.random()) + i * 0.2);
                }
                //vector[i] = new Triangulo(vacXa, vacYa, color);
                listA.add(new Triangulo(vacXa, vacYa, color));
            } else if (i >= 110 && i < 200) {
                alto = (int)(Math.random() * 50);
                ancho = (int)(Math.random()* 50);
                listA.add(new Ovalo(x, y, ancho, alto, color));
            } else if (i >= 200 && i < 250) {
                String s = "Saul";
                listA.add(new Palabra(x, y, s, color));
            }else {
                alto = (int)(Math.random() * 50);
                ancho = (int)(Math.random()* 50);
                //vector[i] = new Rectangulo(x, y, alto, ancho, color);
                listA.add(new Rectangulo(x, y, alto, ancho, color));
            }
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        
        //fillRect(int x,int y,int w,int h): Rellena el rectangulo.
        
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        /*
        for(int i = 0; i < N; i++) {
            vector[i].pintar(g);
        }*/
        for (Figura fig: listA) {
            fig.pintar(g);//cada objeto llama a su método
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
