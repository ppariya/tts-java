
public class Animals {
	
	String color;
	int legs;
	String name;
	String species;
	String gender;
	
public Animals(String color, int legs, String name, String species, String gender)
{
	this.color = color;
	this.legs = legs;
	this.name = name;
	this.species = species;
	this.gender = gender;
}

int mutation()
{
	//I put this back, as I didn't notice you assigning ani.legs in your main method code
	return legs + 1;
}

void welcome()
{
	System.out.println("Arn't you cute..." + species);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals ani = new Animals("Yellow", 4 , "Teddy", "Mongoose", "Female");
		System.out.println(ani.name);
		Animals ani1 = new Animals("Brown", 2 , "Milo" , "Cat", "Male");
		System.out.println(ani1.color);
		ani.welcome();
		ani.legs = ani.mutation();
		System.out.println(ani.legs);
		ani.legs = ani.mutation();
		System.out.println(ani.legs);
	}

}
