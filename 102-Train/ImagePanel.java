import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel(BufferedImage img) {
        this.image = img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Calls the parent's paintComponent
        if (image != null) {
            // Draw the image at coordinates (x, y) = (0, 0)
            g.drawImage(image, 0, 0, this); 
        }
    }
}
