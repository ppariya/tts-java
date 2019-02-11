import java.util.Scanner;

public class Work 
{
	static Scanner test = new Scanner(System.in);
	static int age = 18;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Guess, how old am I?");
		int numGuessed = Integer.parseInt(test.nextLine());
		//same functionality as your while loop but with recursion
		//Good to know recursion for interviews!!!
		guessRecursive(numGuessed);
		
		//this is your old while loop implementation that I put in a method
//		guessIterative(numGuessed);
	}
	
	//a good read: https://www.codeproject.com/Articles/21194/Iterative-vs-Recursive-Approaches
	public static void guessRecursive(int numGuessed) {
		//guessed correctly, so will NOT call itself again and will exit the method
		if(numGuessed == age) {
			System.out.println("Wow! How do you know?!");
		}
		else {
			System.out.println("Wrong! Guess again");
			int nextGuess = Integer.parseInt(test.nextLine());
			//call itself to try again!
			guessRecursive(nextGuess);
		}
	}
	
	//your iterative method, achieves the same result as the recursive one
	public static void guessIterative(int numGuessed) {
		while (numGuessed != age) {
			System.out.println("Wrong! Guess again");
			numGuessed = Integer.parseInt(test.nextLine());
		}
	
		System.out.println("Wow! How do you know?!");
	}

}
