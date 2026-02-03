import java.awt.*;      

public class PassengerCar extends RailCar {
    public PassengerCar(Color color) {
        super(color);
    }

    @Override
    void draw(Graphics g, int x, int y) {
        super.draw(g, x, y);

        g.setColor(Color.cyan);
        g.fillRect(x+20,y+30,18,20);
        g.fillRect(x+40,y+30,18,20);
        g.fillRect(x+60,y+30,18,20);

    }
}
