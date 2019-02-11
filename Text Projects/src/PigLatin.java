import java.util.*;
public class PigLatin {
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cont = "y";
		do {
			System.out.println("Welcome to Pig Latin Program! Pig Latin is a game of alterations played on the English language game. "
					+ "\nTo create the Pig Latin form of an English word the initial consonant sound is transposed to the end of the word "
					+ "\nand an ay is affixed (Ex.: \"banana\" would yield anana-bay). Please enter a word:");	
		
			String input = kb.nextLine();
			String output = "";
			
			for (int i = 1; i < input.length() ; i++) {
				output += input.charAt(i);
			}
			output += "-"+ input.charAt(0) + "ay";
			System.out.println("Pig Latin for " + input + " is " + output.toLowerCase());
			System.out.println("Do you want to continue (Y/N)?");
			cont = kb.nextLine();
			while (!cont.equalsIgnoreCase("Y") && !cont.equalsIgnoreCase("N")) {
				System.out.println("Please enter only Y/N");
				cont = kb.nextLine();
			}
		} while (cont.equalsIgnoreCase("y")); 
		System.out.println("Have a good day!");
	}

}
