/**
 * 
 */

/**
 * @author mikea
 *
 */
public class Vehicle {

	
	
	int numOfWheels;
	int numOfDoors;
	String transmission;
	String fuelType;
	String engineSize;
	double tireSize;
	String tireBrand;
	
	public Vehicle() {
		numOfWheels = 0;
		numOfDoors = 0;
		transmission = null;
		fuelType = null;
		engineSize = null;
		tireSize = 0;
		tireBrand = null;
		//super();
	}
	public Vehicle(int wheels, int doors, String trans, String fuel, String engine,
						double tire, String brand) {
		this.numOfWheels = wheels;
		this.numOfDoors = doors;
		this.transmission = trans;
		this.fuelType = fuel;
		this.engineSize = engine;
		this.tireSize = tire;
		this.tireBrand = brand;
	}
	
	public void setNumOfWheels(int n) {
		this.numOfWheels = n;
	}
	
	public int getNumOfWheels() {
		return this.numOfWheels;
	}
	
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}
	public double getTireSize() {
		return tireSize;
	}
	public void setTireSize(double tireSize) {
		this.tireSize = tireSize;
	}
	public String getTireBrand() {
		return tireBrand;
	}
	public void setTireBrand(String tireBrand) {
		this.tireBrand = tireBrand;
	}
	public static void main(String[] args) {
		
		

	}

}
