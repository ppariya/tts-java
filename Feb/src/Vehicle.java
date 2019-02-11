
public class Vehicle {
	
	int numOfWheel;
	int numofDoors;
	String transmission;
	String fuelType;
	String engineSize;
	double tireSize;
	String tireBrand;
	
	public int getNumOfWheel() {
		return numOfWheel;
	}

	public void setNumOfWheel(int numOfWheel) {
		this.numOfWheel = numOfWheel;
	}

	public int getNumofDoors() {
		return numofDoors;
	}

	public void setNumofDoors(int numofDoors) {
		this.numofDoors = numofDoors;
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
	
	public Vehicle() {
	
	}
	public Vehicle(int numOfWheel, int numofDoors, String transmission, String fuelType, String engineSize, double tireSize, String tireBrand) {
		super();
		this.numOfWheel = numOfWheel;
		this.numofDoors = numofDoors;
		this.transmission = transmission;
		this.fuelType = fuelType;
		this.engineSize = engineSize;
		this.tireSize = tireSize;
		this.tireBrand = tireBrand;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
