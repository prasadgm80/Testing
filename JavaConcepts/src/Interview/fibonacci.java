package Interview;

public class fibonacci {

	///Recursion Method
	public static int fib(int n)
	{
	 if(n == 1 || n == 2)
	 { 
		 return 1; 
	 } 
	 else
	 {
		 return fib(n-1) + fib(n -2); //tail recursion  
	 }
	 
}

	//Loop method
	public static int fibLoop(int n)
	{
		if(n == 1 || n == 2)
		 { 
			 return 1; 
		 } 
		
		else
		{
			int fib1 = 1;
			int fib2 = 1;
			int fibonacci = 0;
			
			for(int i=3; i<= n; i++)
			{
				fibonacci = fib1 + fib2;
				fib1 = fib2;
				fib2 = fibonacci;
			}
			
			return fibonacci;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fibonacci is " + fib(5));
		System.out.println("Fibonacci is " + fibLoop(5));
	}

}
