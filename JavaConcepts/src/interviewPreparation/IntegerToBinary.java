package interviewPreparation;

public class IntegerToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 55;
		StringBuffer sb = new StringBuffer();
		
		System.out.println(	Integer.toBinaryString(num));
		
		while(num>0)
		{
			
			 int remainder = num%2;
			 sb.append(remainder);
			 num= num/2;
			
		}
		
		String binary = String.valueOf(sb.reverse());
		
		int sum = 0;
		int count = binary.length()-1;
		for(int i=0; i<binary.length(); i++)
		{
			int number = Integer.parseInt(String.valueOf(binary.charAt(i)));
			
			sum = sum+ (number*((int)(Math.pow(2, count))));
			count--;
		}
		
		System.out.println(sum);
	
	}

}
