import javax.swing.*;
import java.awt.*;              

public class RailCar{
    String type;
    Color color;

    public RailCar(String _type, Color _color) {
        type=_type;
        color=_color;
    }

    void draw(Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.BLACK);
        switch (type) {
            case "Locomotive":
                g2.drawString("Loco",x+10, y+20); 
                g.setColor(color);
                g.fillRect(x+10, y+20, 80, 80);
                g.setColor(Color.yellow);
                g.fillOval(x+0, y+40, 25, 40);
                break;
            case "PassengerCar":
                g2.drawString("Passenger",x+10, y+30); 
                g.setColor(color);
                g.fillRect(x+10, y+30, 80, 70);
                g.setColor(Color.blue);
                g.fillRect(x+30, y+40, 40, 40);
                break;
            case "FreightCar":
                g2.drawString("Freight",x+10, y+30); 
                g.setColor(color);
                g.fillRect(x+10, y+30, 80, 70);
                break;
            case "Caboose":
                g2.drawString("Caboose",x+10, y+20); 
                g.setColor(color);
                g.fillRect(x+10, y+30, 80, 70);
                break;
        
            default:
                break;
        }

        g.setColor(Color.BLACK);
        g.fillOval(x+0+6, y+90, 25, 25);
        g.fillOval(x+33+6, y+90, 25, 25);
        g.fillOval(x+66+6, y+90, 25, 25);
    }
}
