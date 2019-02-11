package dealership;
import java.util.*;

public class Vehicle {

	String model;
	String make;
	String color;
	int year;
	String motor;
	float price;
	boolean AWD;
	int doors;
	int seat;
	boolean suicide;
	boolean spoiler;
	String transmission;
	String wheelModel;
	float wheelSize;
	
	Scanner kb = new Scanner(System.in);
	
	public Vehicle() {
		this.model = null;
	
	}
	
	public Vehicle(String model, String make, String color, float price, String transmission ) {
		this.model = model;
		this.make = make;
		this.color = color;
		this.year = 0;
		this.motor = "";
		this.price = price;
		this.AWD = false;
		this.doors = 4;
		this.seat = 4;
		this.suicide = false;
		this.spoiler = false;
		this.transmission = transmission;
		this.wheelModel = "";
		this.wheelSize = 0;
		
	}
	
	public void setModel(String a) {
		this.model = a;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setMake(String m) {
		this.make = m;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getTransmission() {
		return this.transmission;
	}
	

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void printVehicle() {
		System.out.print("Make: "+ this.getMake() + ", Model: " + this.getModel() + ", price: ");
		System.out.printf("%,.2f", this.getPrice());
		System.out.println(", transmission: " + this.getTransmission());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car1 = new Vehicle("Ghini", "Lambo", "Green", (float) 1000000.00, "Manual");
		
		car1.printVehicle();
		
		
	}

}
