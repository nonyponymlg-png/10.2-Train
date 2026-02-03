import java.awt.*;      

public class Locomotive extends RailCar {
    public Locomotive(Color color) {
        super(color);
    }

    @Override
    void draw(Graphics g, int x, int y) {
        super.draw(g, x, y);
        int[] x1 = {x,x+10,x+10};

        // y coordinates of the vertices
        int[] y1 = {y+100, y+100, y+70};

        // Number of vertices
        int numberOfPoints = 3;

        // Set the color of the line to blue
        g.setColor(color);

        // Draw the polygon using drawPolygon function
        g.fillPolygon(x1, y1, numberOfPoints);
        g.fillRect(x+10,y,10,50);

        // Set the color of the line to blue
        g.setColor(Color.cyan);
        
        g.fillRect(x+30,y+30,25,25);
    }
}
