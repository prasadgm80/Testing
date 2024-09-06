package interviewPreparation;

public class HighestCommmonFactor {

	public static void getLCM(int num1, int num2)
	{
	
		
		int min = Math.min(num2, num1);
		int hcf = 1;
		int lcm;
		
		for(int i=2; i<min; i++)
		{
			if(num1%i==0 &&  num2%i==0)
			{
				hcf = i;
			}
		}
		

		lcm = (num1*num2)/hcf;
		
		System.out.println("Lowest Common Multiplier is "+lcm+" Highest Common Factor is "+hcf);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 25;
		int num2 = 90;
		
		getLCM(num1, num2);
		
	}

}
