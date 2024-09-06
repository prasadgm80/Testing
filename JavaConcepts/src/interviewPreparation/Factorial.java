package interviewPreparation;

public class Factorial {

	public static int getfactorial(int num)
	{
	
		int facorial = 1;
		
		for(int i=num; i>=1; i--)
		{
			facorial = facorial*num;
			num= num-1;
		}
		
		return facorial;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number= 6;
		System.out.println(getfactorial(number));

	}

}
