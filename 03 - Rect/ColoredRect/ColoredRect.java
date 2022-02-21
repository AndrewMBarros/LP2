import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.geom.*;

public class ColoredRect {
    public static void main (String[] args) {
        ColoredRectFrame frame = new ColoredRectFrame();
    }
}

class ColoredRectFrame extends JFrame {
    public ColoredRectFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setSize(800, 640);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.blue);
        g2d.fillRect(50, 170, 300, 200);

        g2d.setColor(Color.green);
        g2d.fillRect(275,125,350,250);
        
        g2d.setColor(Color.red);
        g2d.fillRect(525,200,225,200);
        
        g2d.setColor(Color.yellow);
        g2d.fillRect(50,270,700,150);


    }
}