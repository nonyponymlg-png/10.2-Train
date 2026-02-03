import javax.swing.*;
import java.awt.*;              

public class RailCar{
    Color color;

    public RailCar(Color _color) {
        color=_color;
    }

    void draw(Graphics g, int x, int y) {
        //g.setColor(Color.BLACK);
        // g2.drawString("Loco",x+10, y+20); 
        g.setColor(color);
        g.fillRect(x+10, y+20, 80, 80);

        g.setColor(Color.BLACK);
        g.fillOval(x+0+6, y+90, 25, 25);
        g.fillOval(x+33+6, y+90, 25, 25);
        g.fillOval(x+66+6, y+90, 25, 25);
    }
}
