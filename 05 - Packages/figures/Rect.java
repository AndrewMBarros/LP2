package figures;

import java.awt.*;

public class Rect {
    private int x, y;
    private int w, h;
    Color drawColor, fillColor;
    
    public Rect (int x, int y, int w, int h, Color drawColor, Color fillColor) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.drawColor = drawColor;
        this.fillColor = fillColor;
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.drawColor);
        g2d.drawRect(this.x,this.y, this.w,this.h);
        g2d.setColor(this.fillColor);
        g2d.fillRect(this.x, this.y, this.w, this.h);
    }
}
