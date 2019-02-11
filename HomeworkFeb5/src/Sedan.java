import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
/**
 * @author mikea
 *
 */
public class Sedan extends Vehicle {
	static Scanner kb = new Scanner(System.in);
	boolean sunRoof;
	
	public Sedan() {
		super();
		this.sunRoof = false;
	}
	
	public Sedan(boolean sun) {
		super();
		this.sunRoof = sun;
	}
	
	public Sedan(int wheels, int doors, String trans, String fuel, String engine,
			double tire, String brand, boolean sun) {
		
		super(wheels, doors, trans, fuel, engine, tire, brand);
		this.sunRoof = sun;
		
	}
	
	@Override
	public String toString() {
		//return ALL data in this instance as a string!
		return "wheels: " + numOfWheels + " doors: " + numOfDoors + " transmission: " + transmission + " fuel: " + fuelType + " engine: " + engineSize + " tire: " + tireSize + " brand: " + tireBrand + " sunRoof: " + sunRoof;
		
	}

	public static void main(String[] args) {
		
		/**
		 * 1) prompt the user for data to store in a Sedan object
		 * 2) create a Sedan object using the user data
		 * 3) define the toString() method in the Sedan class to format output to a text file
		 * 4) use the toString() method to get the data for the Sedan class object
		 * 5) output this data to a textfile using the writer 
		 */
		System.out.println("How many wheels?");
		int wheels = kb.nextInt();
		kb.nextLine();
		System.out.println("How many doors?");
		int doors = kb.nextInt();
		kb.nextLine();
		System.out.println("What type of transmission?");
		String trans = kb.nextLine();
		System.out.println("What type of fuel?");
		String fuel = kb.nextLine();
		System.out.println("What type of engine?");
		String engine = kb.nextLine();
		System.out.println("What size is your tire?");
		Double tire = kb.nextDouble();
		kb.nextLine();
		System.out.println("What is your tire brand?");
		String brand = kb.nextLine();
		System.out.println("Is it a sun roof car? (Y/N)");
		String input = kb.nextLine();
		boolean sunRoof = input.equalsIgnoreCase("Y");
		Sedan a = new Sedan(wheels, doors, trans, fuel, engine, tire, brand, sunRoof);
		
		
		
		
		try {
			PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
			writer.println(a.toString());
			writer.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
