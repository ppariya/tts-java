import java.util.*;
public class Hashy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		HashMap<String, String> person = new HashMap<>();
		String key1 = "Hashbrowns";
		String value1 = "I love hashbrowns";
		String key2 = "Eggplants";
		String value2 = "Hate it!";
		person.put(key1, value1);
		person.put(key2, value2);
		person.put("mushrooms","I love mushrooms!");
		System.out.println(person);
		System.out.println("Do you like eggplants? " + person.get(key2));
		System.out.println("Do you like hashbrowns? " + person.get(key1)); //different ways to get value from hashmap//
	
	}

}
