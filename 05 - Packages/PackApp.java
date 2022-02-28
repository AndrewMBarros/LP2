import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.*;
import figures.Polygon;

class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Rect r1, r2, r3;
    Ellipse e1, e2, e3;
    Polygon p1, p2;

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
        
        this.r1 = new Rect(50,50, 100,30,100,150,255,0,255);
        this.r2 = new Rect(150,150,100,80,255,0,150,255,0,255);
        this.r3 = new Rect(250,250,100,100,100,150,255,0,255);

        this.e1 = new Ellipse(300,100, 140,30);
        this.e2 = new Ellipse(400,150, 150,30);
        this.e3 = new Ellipse(500,200, 160,30);

        this.p1 = new Polygon(500,200, 160,30,100,150,255,0,255);
        this.p2 = new Polygon(500,200, 160,30,255,0,150,255,0,255);

    }


    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.r3.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);
        this.p1.paint(g);
        this.p2.paint(g);
    }
}