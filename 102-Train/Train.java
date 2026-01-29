import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Train{
    int x;
    int y;
    ArrayList<RailCar> cars = new ArrayList<RailCar>();

    public Train(int _x, int _y) {
        x = _x;
        y = _y;
    }

    void addCar(String type, Color color) {
        cars.add(cars.size(), new RailCar(type, color));
    }
    void addCar(int i,String type, Color color) {
        cars.add(i,new RailCar(type, color));
    }

    void showCars(Graphics g) {
        for (int index = 0; index < cars.size(); index++) {
            cars.get(index).draw(g,(index*100) + x,y);
        }
    }
}
