import java.util.*;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lists = new ArrayList<String>();
		String name1 = new String("Chicken"); //example how to add string to the array list//
		String name2 = "Cat"; //another example how to add string to the array list//
		lists.add(name1); //best practice//
		lists.add(name2);
		lists.add("Monkey");
		lists.add("Lion");
		System.out.println(lists.get(0)+" "+ lists.get(1)+" "+lists.get(2)+" "+lists.get(3));
		name1 = "Dog";
		lists.add(name1);
		System.out.println(lists.get(4));
	}

}
