package figures;

import java.awt.*;

public class Triangle {
    
    int p1x, p1y, p2x, p2y, p3x, p3y; 
    Color fillColor, drawColor;

    public Triangle(int p1x, int p1y, int p2x, int p2y
        ,int p3x, int p3y, Color fillColor, Color drawColor) {

        this.p1x = p1x;
        this.p1y = p1y;
        this.p2x = p2x;
        this.p2y = p2y;
        this.p3x = p3x;
        this.p3y = p3y; 
        this.fillColor = fillColor;
        this.drawColor = drawColor;
    }

    public void print () {
        System.out.format("Triangulo na posicao (%d,%d, %d).\n",
             this.p1x, this.p2x, this.p3y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.drawColor);
        g2d.drawPolygon(new int[]{this.p1x,this.p2x,this.p3x}, new int[]{p1y,p2y,p3y}, 3);
        g2d.setColor(this.fillColor);
        g2d.fillPolygon(new int[]{this.p1x,this.p2x,this.p3x}, new int[]{p1y,p2y,p3y}, 3);
        
    }
}