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
        switch (type) {
            case "Caboose":
                cars.add(cars.size(), new Caboose(color));
                break;
            case "FreightCar":
                cars.add(cars.size(), new FreightCar(color));
                break;
            case "Locomotive":
                cars.add(cars.size(), new Locomotive(color));
                break;
            case "PassengerCar":
                cars.add(cars.size(), new PassengerCar(color));
                break;
        
            default:
                cars.add(cars.size(), new RailCar(color));
                break;
        }
    }
    void addCar(int i,String type, Color color) {
        switch (type) {
            case "Caboose":
                cars.add(i, new Caboose(color));
                break;
            case "FreightCar":
                cars.add(i, new FreightCar(color));
                break;
            case "Locomotive":
                cars.add(i, new Locomotive(color));
                break;
            case "PassengerCar":
                cars.add(i, new PassengerCar(color));
                break;
        
            default:
                cars.add(i, new RailCar(color));
                break;
        }
    }

    void showCars(Graphics g) {
        for (int index = 0; index < cars.size(); index++) {
            cars.get(index).draw(g,(index*100) + x+(int)(Math.random()*10)-5,y+(int)(Math.random()*10)-5);
        }
    }
}