package dealership;
import java.util.*;

public class Dealership {
	static Scanner kb = new Scanner(System.in);
	/**
	 * This assignment has 4 parts:
	 * 1) create three Vehicle objects
	 * 2) create another vehicle object accepting user input for 
	 * the make, model, color, price, and transmission type
	 * 3) create a HashMap and add these 4 objects.
	 * e.g. HashMap<String,	> dealership = new HashMap<>();
	 * 4) Ask the user what car they are interested in and return information 
	 * about the car(e.g.):
	 * System.out.println("What kind of car are you looking for?");
	 * user input: Mitsubishi
	 * => "We have a 2019 Mitsubishi Eclipse for $24,000.00"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle a = new Vehicle("Accord", "Honda", "Silver", 22000, "Maunual");
		Vehicle b = new Vehicle("Civic", "Honda", "Gold", 24000, "Auto");
		Vehicle c = new Vehicle("Camry", "Toyota", "Black", 25000, "Auto");
		
		System.out.println("Please enter car model");
		String model = kb.nextLine();
		System.out.println("Please enter car make");
		String make = kb.nextLine();		
		System.out.println("Please enter car color");
		String color = kb.nextLine();		
		System.out.println("Please enter car price");
		float price = kb.nextFloat();	
		kb.nextLine();
		System.out.println("Please enter car transmission type(auto/manual)");
		String transmission = kb.nextLine();
		
		Vehicle d = new Vehicle(model, make, color, price, transmission);
		//Create a list and add each vehicle in the list
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(a);
		vehicles.add(b);
		vehicles.add(c);
		vehicles.add(d);
		//create a hash map
		HashMap<String, List<Vehicle>> hashMap = new HashMap<>();
		//for each vehicle try to put it into the hash map
		for(Vehicle vehicle : vehicles) {
			String vehicleMake = vehicle.getMake().toLowerCase();
			//check if there is an existing array list
			List<Vehicle> vehiclesByMake = hashMap.get(vehicleMake);
			if(vehiclesByMake == null) {
				vehiclesByMake = new ArrayList<Vehicle>();
			}
			vehiclesByMake.add(vehicle);
			hashMap.put(vehicleMake, vehiclesByMake);
		}

		
		System.out.println("What kind of car are you looking for?");
		String userInput = kb.nextLine().toUpperCase();
		if(hashMap.get(userInput) != null){
			System.out.println("We have at least one of that car. Here they are.");
			for(Vehicle vehicle : hashMap.get(userInput)) {
				System.out.println("Make: " + vehicle.getMake() + " Model: " + vehicle.getModel() + " Color: " + vehicle.getColor());
			}
		}
		
	}

}
