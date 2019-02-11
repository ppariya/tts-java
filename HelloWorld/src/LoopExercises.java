import java.util.*;
public class LoopExercises {
	static Scanner test = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		/*for(int x = 0; x < 5; x++) {
			System.out.println("I think I can");
		}
		
		for (int count = 0; count < 10 ; count++) {
			System.out.println(count*count);
		}
		System.out.println("Please enter number 1-10: ");
		int num = test.nextInt();
		while(num <= 10) {
			System.out.println(num*2);
			num++;
		}*/
//		String name;
//		do {
//			System.out.println("Please enter your name: ");
//			name = test.nextLine();
//		} while (!name.equalsIgnoreCase("Jacob"));
//		
		
		
//		
//		int count;
//		do {
//			count = new Random().nextInt(10)+1;
//			System.out.println(count);
//		} while(count != 7);
		
		/*
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Tiger");
		String fav = "Cat";
		
		for (int x = 0; x < animals.size(); x++) {
			String compare = animals.get(x);
			if(compare.equals(fav)) {
				System.out.println("I love "+ compare);
			} else {
				System.out.println("No, I don't care for those.");
			
			}
		}
		*/
//		
//		HashMap<String, String> hash = new HashMap<>();
//		System.out.println("Name? ");
//		String name = test.nextLine();
//		System.out.println("Age? ");
//		String age = test.nextLine();
//		System.out.println("Hometown? ");
//		String hometown = test.nextLine();
//		System.out.println("Favorite Food? ");
//		String favFood = test.nextLine();
//		hash.put("Name" , name);
//		hash.put("Age" , age);
//		hash.put("Hometown" , hometown);
//		hash.put("Favorite Food" , favFood);
//		System.out.println("This is " + hash.get("Name") +",");
//		System.out.println("They are " + hash.get("Age") +",-years-old,");
//		System.out.println("from  " + hash.get("Hometown") +",");
//		System.out.println("and their favorite food is " + hash.get("Favorite Food") +".");
//		for (Map.Entry<String,String> entry : hash.entrySet()) {
//			String key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key + ":" + value);
//		}
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		System.out.println("Please enter 1st number: ");
//		int first = test.nextInt();
//		System.out.println("Please enter 2nd number: ");
//		int second = test.nextInt();
//		System.out.println("Please enter 3rd number: ");
//		int third = test.nextInt();
//		System.out.println("Please enter 4th number: ");
//		int fourth = test.nextInt();
//		System.out.println("Please enter 5th number: ");
//		int fifth = test.nextInt();
//		numbers.add(first);
//		numbers.add(second);
//		numbers.add(third);
//		numbers.add(fourth);
//		numbers.add(fifth);
//		int sum = 0;
//		int product = 1;
//		int largest = Integer.MIN_VALUE;
//		int smallest = Integer.MAX_VALUE;
//		for (int number : numbers) {
//			sum = sum+number;
//			product = product*number; 
//			if (number > largest) {
//				largest = number;
//			} 
//			if(number < smallest) {
//				smallest = number;
//			
//			}
//			System.out.println("sum:" + sum);
//			System.out.println("product: "+product);
//			System.out.println("largest: "+ largest);
//			System.out.println("smallest:" + smallest);
//		}
//		HashMap<String, String> cars = new HashMap<String,String>();
//		cars.put("Camry" , "Toyota");
//		cars.put("Civic", "Honda");
//		cars.put("Corolla" , "Toyota");
//		System.out.println("Which model would you like?");
//		String model = test.nextLine();
//		String make = cars.get(model);
//		if (null != make) {
//			System.out.println("Oh, you're looking for a " + model +"?" +" Our " + make + " selection is right over here...") ;
//		} else {
//			System.out.println("Sorry we don't have what you are looking for!!!!");
//		}
//		
//		System.out.println("Please enter a word: ");
//		String word = test.nextLine();
//		
//		 
//		for (int index = word.length() - 1; index >= 0; index--) {		      
//		        System.out.println(word.charAt(index));
//		}
//		
//		String reverseWord = "";
//		for (int index = word.length() - 1; index >= 0; index--) {
//			reverseWord += word.charAt(index) ;
//		}
//		System.out.println(reverseWord);
		
//		
//		System.out.println("Please enter a word: ");
//		String firstWord = test.nextLine();
//		System.out.println("Please enter another word: ");
//		String secondWord = test.nextLine();
//		String newWord = "";
//		String largestWord = secondWord;
//		
//		int smallest = firstWord.length();
//		if (secondWord.length() < smallest) {
//			smallest = secondWord.length();
//			largestWord = firstWord;
//		}
//		int index = 0;
//		for (index = 0; index < smallest ; index++) {
//			newWord += firstWord.charAt(index);
//			newWord += secondWord.charAt(index);
//		
//		}
//		
//		for (int newIndex = smallest; newIndex < largestWord.length(); newIndex++) {
//				newWord += largestWord.charAt(newIndex);
//				
//		}
//		System.out.println(newWord);
		
		String again = "";
		do {
			System.out.println("Hello, please select an option 1 or option 2");
			System.out.println("1 is for the sum of a whole number that you will enter");
			System.out.println("2 is for the factorial of a whole number that you will enter");
			int choice = test.nextInt();
			while (choice != 1 && choice != 2) {
				System.out.println("Please enter 1 or 2");
				choice = test.nextInt();
				
			}
			System.out.println("Please enter an integer number");
			int number = test.nextInt();
			test.nextLine();
			int sum = 0;
			int factorial = 1;
			
			if (choice == 1) {
				again = summation(number, sum);
			} 
			if (choice == 2) {
				again = factorial(number, factorial);
			}

			while(!again.equalsIgnoreCase("N") && !again.equalsIgnoreCase("Y")) {
				System.out.println("Please enter Y or N");
			
				again = test.next();
				test.nextLine();
				
			}
			
		}	while (again.equalsIgnoreCase("Y"));
		System.out.println("Thank you! Have a good day!");
			
	}
	private static String factorial(int number, int factorial) {
		String again;
		for (int i = 1; i <=number; i++) {
			factorial = factorial*i;
		} 
		System.out.println(factorial);
		System.out.println("Do you want to continue(Y/N)");
		again = test.next();
		test.nextLine();
		return again;
	}
	private static String summation(int number, int sum) {
		String again;
		for (int i = 0; i <=number; i++) {
			sum = sum+i;
		} 
		System.out.println(sum);
		System.out.println("Do you want to continue(Y/N)");
		again = test.nextLine();
		return again;
	}
	
	
}
