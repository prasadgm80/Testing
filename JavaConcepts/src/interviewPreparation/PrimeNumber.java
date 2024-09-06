package interviewPreparation;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=100;
		
		for(int i=2; i<num; i++)
		{
			int count=0;
			if(i==2)
			{
				System.out.println(i+" is prime number");
			}
			
			else
			{
				for(int j=i-1; j>=2; j--)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				
				if(count==0)
				{
					System.out.println(i+" is prime number");
				}
			}
			
			
			
		}

	}

}
