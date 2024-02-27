
public class ThisDemo {

	int a = 10;
	
	final int i = 4;
	

	
	
	public void getData() {
		int a = 20;
		int c = a + this.a;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(c);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo td = new ThisDemo();
		td.getData();
		

	}

}
