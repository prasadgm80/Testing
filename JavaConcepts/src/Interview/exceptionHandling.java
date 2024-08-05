package Interview;

public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("inside try block");
			
			String s =null;
			int n = s.length();
			
			int data = 25/0;
		}
		
		catch(Exception e)
		{
		System.out.println("inside catch block");
		System.out.println(e);
		}
		
		finally
		{
			System.out.println("This block is always executed");	
		}

	}

}
