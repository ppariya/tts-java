import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> stack = new Stack<>();
		String[] array = {"Hello", "My", "Name", "is","Fah"};
		stack.push(array[0]);
		
		
		
		for (int i = 0; i < array.length; i++) {
			stack.push(array[i]);
			
		}
		int size = stack.size();
		for (int j = size -1; j > 0 ; j--) {
			System.out.println(stack.pop());
		}
	}

}
