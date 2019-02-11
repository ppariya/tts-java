
public class Sedan extends Vehicle {

	boolean sunRoof;
	public Sedan() {
		super();
		this.sunRoof = false;
	}
	
	public Sedan(boolean sun) {
		super();
		this.sunRoof = sun;
	}
	
	public Sedan(int numOfWheel, int numofDoors, String transmission, String fuelType, String engineSize, double tireSize, String tireBrand, boolean sun) {
		super(numOfWheel, numofDoors, transmission, fuelType, engineSize, tireSize, tireBrand);
		this.sunRoof = sun;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan s = new Sedan();
		System.out.println(s.getNumOfWheel());
	}

}
