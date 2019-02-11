
public class Polymorphism {
	int a;
	String b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

	
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public Polymorphism() {
		this.a =1;
		this.b = "creative";
		
	}
	public String toString() {
		return a + " " + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p = new Polymorphism();
		System.out.println(p.toString());
		
	}

}
