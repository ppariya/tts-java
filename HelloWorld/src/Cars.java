
public class Cars {
	String make;
	String modle;
	String color;
	
	
	public Cars(String make, String modle, String color)
	{
		this.make = make;
		this.modle = modle;
		this.color = color;
	}

	String newColor()
	{
		return this.color = "Green";
	}
	
	void changeNewColor()
	{
		System.out.println("Oh you want to change your car color from " + color + " to green?!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars myCar = new Cars("Toyota", "Camry", "Silver");
		System.out.println(myCar.color);
		//method is called changeNewColor, but the change isn't happening in this method, consider renaming the method.
		myCar.changeNewColor();
		System.out.println(myCar.newColor());
	}

}
