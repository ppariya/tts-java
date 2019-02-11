import java.util.*;

 
public class Owner {

	String name;
	String phoneNumber;
	String address;
	double balance;
	ArrayList<Pet> pets;
	
	public Owner() {
		
	}
	
	public Owner(String name) { //build your constructor method here
		this.name = name;
		this.phoneNumber = null;
		this.address = null;
		this.balance = 0;
		this.pets = new ArrayList<>();
	}
	
	/**
	 * use this method to add a pet to the ArrayList object 'pets'
	 * @param p
	 */
	public void addPet(Pet p) {
		//Your code here
		this.pets.add(p);
	}
	
	/**
	 * create set and get methods down here
	 * 
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}

}
