package Interview;

public class factorial {
	
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		
		else
			return(n* factorial(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		//Looping
		int n =5;
		int m = 1;
		for(int i=1; i<=n; i++)
		{
			m = m*i;
			
		}
		System.out.println(m);
*/
		
		//Recursion
		System.out.println("Factorial is " + factorial(5));

	}

}
