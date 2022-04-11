import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JFrame;

import figures.*;

public class FigureFrame extends JFrame {
        Random rand = new Random();
        Rect r1;
        Ellipse e1;
        Triangle t1;
        ArrayList<Figure>figs = new ArrayList<Figure>();
    
        public FigureFrame () {
            this.addWindowListener (
                new WindowAdapter() {
                    public void windowClosing (WindowEvent e) {
                        System.exit(0);
                    }
                }
            );

            this.addKeyListener (
            new KeyAdapter() {
                public void keyPressed (KeyEvent evt) {
                    if (evt.getKeyChar() == 'r') {
                        int x = rand.nextInt(350);
                        int y = rand.nextInt(350);
                        int w = rand.nextInt(50);
                        int h = rand.nextInt(50);
                        figs.add(new Rect(x,y, w,h));
                        repaint();  // outer.repaint()
                    }
                    if (evt.getKeyChar() == 'e') {
                        int w = rand.nextInt(350);
                        int h = rand.nextInt(350);
                        int x = rand.nextInt(350);
                        int y = rand.nextInt(350);
                        figs.add(new Ellipse(x, y, w, h));
                        repaint();
                    }
                }
            }
        );
            this.setTitle("Usando lista do tipo Figure");
            this.setSize(350, 350);
            
        }
    
        public void paint (Graphics g) {
            super.paint(g);
            for (Figure fig:figs) {
                fig.paint(g);
            }
        }
    
}