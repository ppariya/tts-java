import java.util.*;

public class ReverseAString {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome! Please enter a string and the program will reverse it and print it out.");
		String input = kb.nextLine();
		String output = "";
		for (int i = input.length() -1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println("Reverse string for " + input + " is " + output);
	}

}
