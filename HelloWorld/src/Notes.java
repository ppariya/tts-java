import java.util.*;

public class Notes {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> integers = new ArrayList<Integer>(2);
		Integer one = new Integer(1);
		Integer two = new Integer(2);
		int[] a = {1,2,3};
		String[] b = {new String("one"), "two", "three"};
		Integer[] c= {new Integer(1), new Integer(2), new Integer(3)};
		integers.add(one);
		integers.add(two);
		Integer d = integers.get(0);
		integers.remove(1);
		
	}

}
