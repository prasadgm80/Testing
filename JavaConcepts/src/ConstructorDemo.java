
public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("I am the constructor");
		System.out.println("Constructor executed");
	}
	
	public ConstructorDemo(int a) {
		
		System.out.println("I am in parameterized constructor");
		System.out.println(a);
	}
	
	public void getData() {
		
		System.out.println("Method is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo c = new ConstructorDemo(5);
	}

}
