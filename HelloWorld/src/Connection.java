
//This is a demonstration of Parent - Child class relationships
public class Connection extends Animals
{
	//since we extend Animals, the super keyword will call the Animals constructor
	public Connection(String color, int legs, String name, String species, String gender) {
		//this calls the Animals constructor
		super(color, legs, name, species, gender);
	}

	public static void main(String[] args) 	
	{
		int ar[] = {4, 6, 8};
		String word[] = {"Walls", "Pizza", "Time", "Elaboration"};
		System.out.println(word[2]);
		Connection n = new Connection("orange", 3, "Oscar", "Platapus", "Male");
		//Connection class itself doesn't have a field 'color', but Animals (the parent class) does
		//That's why you are able to call the 'color' field from 'n' here
		System.out.println(n.color);
	}

}
