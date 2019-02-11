/**
 * 
 */
package dealership;

/**
 * @author mikea
 *
 */
public class Vehicle {
	
	/**
	 * create set methods for the model, make, price, and transmission, and color 
	 * and create
	 * get methods for the same variables. Create a vehicle object with this data:
	 * Make: Lambo, Model: Ghini, price = 1,000,000.00, tranmission: Manual,
	 * color: your choice.
	 * output these details using the get methods and System.out.println() in the 
	 * main() method.
	 */
	/**
	 * Fields/Instance Variables:
	 * 
	 * If we own a dealership and have a database of cars to sell, 
	 * what kind of details would we save about those cars?
	 */
	String model;
	int year;
	String make;
	String color;
//	String motor;
	float price;
	boolean AWD;
	int doors;
//	int seats;
//	boolean suicide;
//	boolean spoiler;
	String transmission;
//	String wheelModel;
//	float wheelSize;
	/**
	 * Constructor method:
	 * - this is used to create an INSTANCE of the class, otherwise known
	 * 		as an object.
	 * The constructor is where we assign beginning values for our fields.
	 * @param args
	 */
	public Vehicle(String model, int year, String make, String color, String motor, 
			float price, boolean AWD, int doors, int seats, boolean suicide,
			boolean spoiler, String transmission, String wheelModel, float wheelSize) {
		
		
	}
	
	public Vehicle(String model, int year, String make) {
		this.model = model;
		this.year = year;
		this.make = make;
		this.color = "";
		//this.motor = "";
		this.price = 0;
		this.AWD = false;
		this.doors = 4;
		//this.seats = 4;
		//this.suicide = false;
		//this.spoiler = false;
		this.transmission = "";
		//this.wheelModel = "";
		//this.wheelSize = 0;
	}
	/**
	 * Methods/Functions:
	 * 
	 * Methods are used to access, process, and manipulate data stored in our 
	 * fields/ instance variables.
	 * 
	 * Common types of methods:
	 * set() and get() methods - these are used to set or return field values
	 * 
	 */
	public void setModel(String a) {
		this.model = a;
	}
	
//	public void setYear(int y) {
//		this.year = y;
//	}
	
	public String getModel() {
		return this.model;
	}
	
	@Override 
	public String toString() {
		//use this to return a String object that represents all the relevant data
		//for a car
		return "";
	}
	
//	public static void main(String[] args) {
//		
//		Vehicle a = new Vehicle("Honda",1997,"Accord");
//
//	}

}
