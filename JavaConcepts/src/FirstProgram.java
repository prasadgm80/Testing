
public class FirstProgram {
	
	int a = 10;
	public void getData() {
		
		System.out.println("Method");
		
	}

	FirstProgram()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstProgram fp = new FirstProgram();
		fp.getData();
		System.out.println(fp.a);
		
		//Calling methods from different class file
		
		SecondClass sn = new SecondClass();
		sn.setData();
		
		int a = 4;
		
		System.out.println("Hi");
		System.out.println("Hello World");
		System.out.println(a);
	}

}
