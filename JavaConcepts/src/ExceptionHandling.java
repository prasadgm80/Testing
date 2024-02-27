
public class ExceptionHandling {	
/*	public void getData() {
		
		System.out.println(k);
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 7;
			int b = 5;
			int c = 0;
			
			int k = a/c;
		}

		catch(ArithmeticException et) {
			System.out.println("Arithmatic Exception is caught");
		}
		
		catch(Exception e) {
			System.out.println("Error is caught");
		}
		finally
		{
		System.out.println("Close browser");	
		}
		//ExceptionHandling e = new ExceptionHandling();	
		
	}

}
