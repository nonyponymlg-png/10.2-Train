import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;      

public class FreightCar extends RailCar {
    BufferedImage img;
    public FreightCar(Color color) {
        super(color);
        img = ImageLoader.loadImage("102-Train/f.png");
    }

    @Override
    void draw(Graphics g, int x, int y) {
        super.draw(g, x, y);
        g.drawImage(img, x+10, y+20,80,40, null);
    }
}
