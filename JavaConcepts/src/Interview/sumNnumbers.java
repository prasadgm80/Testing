package Interview;

public class sumNnumbers {
	
	static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		else
		{
			return(n + sum(n-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of first N numbers is " + sum(101));

	}

}
