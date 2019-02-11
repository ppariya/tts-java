import java.io.Console;
import java.util.*;
public class Pet {
	String name;
	String gender;
	String mood;
	void sound() {
		if (mood.equalsIgnoreCase("happy")) {
			System.out.print("Woof! Woof!");
		}
		else {
			System.out.print("Whining!");
		}
	}
	public Pet() {
		
	}
	public Pet(String name, String gender, String mood) {
		this.name = name;
		this.gender = gender;
		this.mood = mood;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet new_pet = new Pet("Teddy", "Male", "Happy");
		new_pet.sound();
	}
	
}
