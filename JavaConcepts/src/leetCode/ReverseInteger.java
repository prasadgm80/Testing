package leetCode;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12345;
		int reverse = 0;
		
		//Logic 1
		//output = 4321;
		//1*10^0+2*10^1+3*10^2
		
		String num  = Integer.toString(input);
		
		for(int i=0; i<num.length(); i++)
		{
			char ch = num.charAt(i);
			String chars = Character.toString(ch);
			
			reverse = reverse+Integer.parseInt(chars)*((int)Math.pow(10, i));
		}
		
		System.out.println("Reverse of Number is "+reverse);

		//Logic 2
		int reverse1 = 0;
		int count =Integer.toString(input).length()-1;
		while(input>0)
		{
			int remainder  = input%10;
			
			reverse1 = reverse1+(remainder*((int)Math.pow(10, count)));
			
			count--;
			input = input/10;
			
		}
		System.out.println("Reverse of Number is "+reverse1);

	}

}
