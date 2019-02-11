package dealership;

public class Notes {
	int i;
	String a;
	
	
	public Notes() {
		this.i = 0;
		this.a = "Hello";
	}
	
	public void setA(String b) {
		this.a = b;
		
	}
	
	public int getI() {
		return i;
	}
	
	public String getA() {
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notes instance = new Notes();
		System.out.println(instance.a);
		instance.setA("Good Bye!!!");
		System.out.println(instance.a);
		int value = instance.getI();
		String name = instance.getA();
		System.out.println("i = " + value + " \na = " +name);
	}

}
