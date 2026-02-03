import java.awt.*;      

public class Caboose extends RailCar {
    public Caboose(Color color) {
        super(color);
    }

    @Override
    void draw(Graphics g, int x, int y) {
        super.draw(g, x, y);
        // x coordinates of the vertices
        int[] x1 = {x+10,x+90,x+100,x+0};

        // y coordinates of the vertices
        int[] y1 = {y+3, y+3, y+20, y+20};

        // Number of vertices
        int numberOfPoints = 4;

        // Set the color of the line to blue
        g.setColor(color);

        // Draw the polygon using drawPolygon function
        g.fillPolygon(x1, y1, numberOfPoints);

        g.setColor(Color.cyan);
        g.fillRect(x+20,y+20,30,30);
        
        g.setColor(new Color(150,75,0));
        g.fillRect(x+55,y+30,30,60);
    }
}
