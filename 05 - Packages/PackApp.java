import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.Rect;
import figures.Ellipse;
import figures.Triangle;


class PackApp  {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Rect r1, r2, r3;
    Ellipse e1, e2, e3;
    Triangle t1,t2;

    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Packages Figures");
        this.setSize(350, 350);
        
        this.r1 = new Rect(50,50, 100,30, Color.blue, Color.black);
        this.r2 = new Rect(150,150,100,80, Color.red, Color.yellow);
        this.r3 = new Rect(250,250,100,100, Color.green, Color.blue);

        this.e1 = new Ellipse(300,50, 140,30, Color.red, Color.black);
        this.e2 = new Ellipse(400,150, 150,30, Color.yellow, Color.green);
        this.e3 = new Ellipse(500,200, 160,30, Color.blue, Color.orange );

        this.t1 = new Triangle(100,150,170,100,50,90, Color.blue, Color.black);
        this.t2 = new Triangle(300,100,100,150,200,100,  Color.red, Color.orange);


    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.r3.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);
        this.t1.paint(g);
        this.t2.paint(g);
    }
}