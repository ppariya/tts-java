
public class Main {

	public static void main(String[] args) {
		
		Owner[] owners = new Owner[5];
		/**
		 * 1)create 5 Owner objects and add them to the array
		 * 2)for each owner in the array, add two Pet objects to the Owner object
		 * by adding the Pet objects to the ArrayList in the Owner Object
		 * (See Owner.java file)
		 * 3)Print out the list of owners and their pets  
		 */
		Owner one = new Owner("Mark");
		Owner two = new Owner("Jacob");
		Owner three = new Owner("Ari");
		Owner four = new Owner("Jen");
		Owner five = new Owner("Fah");
		
		owners[0] = one;
		owners[1] = two;
		owners[2] = three;
		owners[3] = four;
		owners[4] = five;
		
		Pet petOne = new Pet("Teddy");
		Pet petTwo = new Pet("Milo");
				
		
		for (Owner owner: owners) {
			owner.addPet(petOne);
			owner.addPet(petTwo);
		}

		for (Owner owner: owners) {
			System.out.print(owner.getName() + ": ");
			for(Pet pet : owner.getPets()) {
				System.out.print(pet.getPetName() + " ");
			}
			System.out.println();
		}
		
	}

}
