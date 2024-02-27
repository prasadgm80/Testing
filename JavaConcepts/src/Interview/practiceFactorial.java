package Interview;

public class practiceFactorial {
	
	static int fib(int j)
	{
		int fib1 = 1;
		int fib2 = 1;
		int fibonacci=0;
		for(int i=0; i<j; i++)
		{
			if(i<2)
			{
			fibonacci = fib1;
			}			
			
			else
			{
				fibonacci = fib1 + fib2;
				
				fib2 = fib1;
				fib1 = fibonacci;
			}
			//System.out.println(fibonacci);
			//return fibonacci;
		}
		return fibonacci;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//factorial 5 = 5*4*3*2*1
		//fib = 1, 1, 1+1, 2+1, 3+2
		
		
		System.out.println(fib(5));
		
		
	}

}
