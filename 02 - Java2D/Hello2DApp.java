import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(1024,768);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
       
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.black);

        g.setColor(Color.blue);

        int w = getWidth();
        int h = getHeight();
        g2d.drawRect(400,100,300,300);
 
        g2d.drawRect(400,200,300,500);

        g2d.fillRect(400,100,300,300);
        g2d.fillRect(400,100,600,300);

        g2d.fillRect(400,100,300,600);
        g2d.fillRect(400,100,600,600);

        g2d.setColor(Color.green);
        g2d.fillOval(400,400,300,300);
        g2d.fillOval(400,100,300,300);
        
        g2d.fillOval(700,100,300,300);
        g2d.fillOval(700,400,300,300);
    }
}