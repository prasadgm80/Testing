package interviewPreparation;

public class PrimeNumberTillNValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		
		
		for(int i=3;i<num; i++)
		{
			boolean flag = false;
			
			for(int j=i-1; j>1; j--)
			{
				if(i%j ==0)
				{
					flag = true;
					break;
				}
			}
			
			if(!flag)
			{
				System.out.println(i+" is Prime number");
			}
		}

	}

}
