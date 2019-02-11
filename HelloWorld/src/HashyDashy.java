import java.util.*;
public class HashyDashy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hash = new HashMap<>();
		hash.put("w", new Integer(1) );
		hash.put("o", new Integer(1));
		hash.put("r", new Integer(1));
		hash.put("d", new Integer(1));
		System.out.println("The word \"word\", there is " + hash.get("w") + " w, " + hash.get("o") + " o, " + hash.get("r") + " r, and " + hash.get("d") + " d."  );
	}

}
