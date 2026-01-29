import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Display extends JPanel{
	public Display(){}
	public void paintComponent(Graphics g){
		super.paintComponent(g); 
		setBackground(Color.WHITE);
		Train train = new Train(0,0); 
		train.addCar("Locomotive",Color.blue); 
		train.addCar("PassengerCar",Color.gray); 
		train.addCar("PassengerCar",Color.gray); 
		train.addCar("FreightCar",Color.green); 
		train.addCar(3,"PassengerCar",Color.gray); 
		train.addCar("FreightCar",Color.green); 
		train.addCar("Caboose",Color.red); 
		train.addCar(6,"FreightCar",Color.green); 
		train.showCars(g); 
	}
}
