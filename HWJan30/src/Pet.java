
import java.util.*;

public class Pet {
	
	String petName;
	String breed;
	String species;
	double weight;
	double height;
	int age;
	String gender;
	boolean fixed;
	Owner owner;
	
	public Pet() { //your constructor method
		
	}
	
	public Pet(String petName) {
		this.petName = petName;
		this.breed = null;
		this.species = null;
		this.weight = 0;
		this.height = 0;
		this.age = 0;
		this.gender = null;
		this.fixed = false;
	}
	
	/**
	 * set and get methods below here
	 */
	
	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isFixed() {
		return fixed;
	}

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
