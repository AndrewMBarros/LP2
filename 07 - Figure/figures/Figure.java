package figures;
import java.awt.*;
public abstract class Figure {

    int x,y;
    int w,h;

    public Figure(int x, int y, int h, int w) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public abstract void paint(Graphics g);

    public abstract void print();
}