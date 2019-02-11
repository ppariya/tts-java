import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

/**
 * @author mikea
 *
 */
public class Sedan extends Vehicle {

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
		return this.numOfWheels + "," + this.numOfDoors + "," + this.transmission + 
				"," + this.fuelType + "," + this.engineSize + "," + this.tireSize + 
				"," + this.tireBrand + "," + this.sunRoof;
	}

	public static void main(String[] args) {
		/**
		 * 1) prompt the user for data to store in a Sedan object
		 * 2) create a Sedan object using the user data
		 * 3) define the toString() method in the Sedan class to format output to a text file
		 * 4) use the toString() method to get the data for the Sedan class object
		 * 5) output this data to a textfile using the writer 
		 */
		boolean cont = false;
		do {
			cont = false;
			Scanner kb = new Scanner(System.in);
			System.out.println("Get ready to enter car data on a sedan: \n");
			ArrayList<String> userInput = new ArrayList<>();
			boolean sun = false;
			String[] prompts = {"How many wheels does the sedan have?", "How many doors?", 
					"what kind of transmission?", "What fuel does it use?", "Whats the engine size?",
					"What is the tire size?","How about the tire brand?","does the sedan have a sun roof?"};
			for (int i = 0; i < prompts.length; i++) {
				System.out.println(prompts[i]);
				userInput.add(kb.next());
			}
			if (userInput.get(7).equalsIgnoreCase("yes")) {
				sun = true;
			}
			Sedan nextCar = new Sedan(Integer.parseInt(userInput.get(0)), 
										Integer.parseInt(userInput.get(1)),
										userInput.get(2), userInput.get(3),
										userInput.get(4),Double.parseDouble(userInput.get(5)),
										userInput.get(6),sun);
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\mikea\\Desktop\\carDB",true));
				writer.write(nextCar.toString());
				writer.newLine();
				writer.close();
				//writer.write("the text you want to write here");
				//writer.newLine() creates a new line in the text file
				//writer.close() do this when you are finished to actually write the text to the file
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			System.out.println("do you want to continue?(Y/N)");
			if (kb.next().equalsIgnoreCase("y")) {
				cont = true;
			}
		} while (cont);		
	}
}
