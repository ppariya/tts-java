/**
 * 
 */
import java.util.*;
import java.io.*;
/**
 * This will be the class that holds the main method for running our program. It will hold 
 * the basic instructions for the program.
 *
 */
public class Main extends Sedan{
	static Scanner reader = new Scanner(System.in);
	private static final String FILENAME = "carDB.txt";
	
	/**
	 * we can organize and declutter our code by creating methods that do specific tasks 
	 * and then call those methods. This follows the principles of "Abstraction", which 
	 * says that to simplify creation and understanding of a complex system, we should hide
	 * the details of components. The method below is an example of a method created for 
	 * the purpose of abstraction.
	 */
	private static int mainMenu() {
		//write your output here and call this method from the main method
		// e.g. int response = Main.mainMenu();
		int userInput;
		System.out.println("Main Menu: Please enter a number from options down below");
		System.out.println("1. Create");
		System.out.println("2. Read");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("0. Exit program");
		userInput = Integer.parseInt(reader.nextLine());
		if(userInput < 0 || userInput > 4) {
			System.out.println("Invalid Selection");
			mainMenu();
		}
		return userInput;
		
	}
	
	private static  void create	() {
		
		System.out.println("Please enter a number from options down below");
		System.out.println("1. Create a new record");
		System.out.println("0. Return to main menu");
		int userInput = Integer.parseInt(reader.nextLine());
		
		if(userInput < 0 || userInput > 1) {
			System.out.println("Invalid Selection");
			create();
		}
		if(userInput == 0) {
			mainMenu();
		}
		if(userInput == 1) {
			System.out.println("Please enter a number from options down below");
			System.out.println("1. Sedan");
			System.out.println("2. Vehicle");
			System.out.println("0. Return to main menu");
			int userInput2 = Integer.parseInt(reader.nextLine());
			if (userInput2 < 0 || userInput2 > 2) {
				System.out.println("Invalid Selection");
				create();
			}
			if (userInput2 == 1) {
				Sedan a = new Sedan();
				System.out.println("Please enter the make:");

			}
			if (userInput2 == 2) {
				Vehicle b = new Vehicle();
			}
			if (userInput2 == 0) {
				mainMenu();
			}
		}
//		if(userInput2 < 0 || userInput > 1) {
//			System.out.println("Invalid Selection");
//			create();
//		}


	}
	public static void main(String[] args) {
		
		if (mainMenu() == 1) {
			create();
		}
		/**
		 * The first thing we need to do is read in our data and store it in a data structure.
		 * If we use a HashMap, we can store the Vehicle/Sedan objects we create in a way 
		 * that allows for us to search for, retrieve, and put cars in with a constant
		 * time complexity ( in other words, O(1)). So let's work on reading in our data
		 * and storing it in a HashMap.
		 * 
		 * Note that for this part of the problem you will want to use some new fields
		 * I added to Vehicle. Go to the Vehicle class and check it out.
		 * 
		 * I went ahead and created the HashMap we will need to store our data from the text file.
		 * your job is to write code that will read in the data from the text file.
		 */
		HashMap<UUID,Vehicle> carHash = new HashMap<>();
		try {
			BufferedReader readDB = new BufferedReader(new FileReader(Main.FILENAME));
			System.out.println(readDB.readLine());
			//readDB.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Error reading in DB: All or some data may be unavailable");
		}
		
		
		
		/**
		 * After we populate our carHash with Vehicle and/or Sedan objects, we need to provide 
		 * the user a menu. create a simple text based menu for the user. It should look something
		 * like this:
		 * 
		 * 1. Create
		 * 2. Read
		 * 3. Update
		 * 4. Delete
		 * 0. Exit Program
		 * 
		 * (option 1):
		 * 1. create new record >>1. Sedan    2. Vehicle
		 * 2. return to menu
		 * 
		 * (option 2):
		 * 1. Search by ID
		 * 2. Read all records
		 * 3. return to menu
		 * 
		 * (option 3): 
		 * 1. Update by ID
		 * 2. return to menu
		 * 
		 * (option 4):
		 * 1. Delete by ID
		 * 2. Delete all records
		 * 3. return to menu
		 */
		
	}

}
