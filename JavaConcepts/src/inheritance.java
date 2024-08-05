
public class inheritance {
	
	public void testData()
	{
		System.out.println("Testing");
	}
	
	class inherit extends inheritance
	{
		public void testData1()
		{
			System.out.println("Testing Inheritance");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inheritance in = new inheritance();
		
		in.testData();
		
		

	}

}
