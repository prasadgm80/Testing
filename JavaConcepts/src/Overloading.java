
public class Overloading {
	
	public void getData(int a) {
		
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading over = new Overloading();
		
		over.getData(5);
		over.getData("OverLoad");

	}

}
