package Interview;

public class SpecialCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd%$%AFH%^&";
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch =s.charAt(i);
			
			if(s.charAt(i) == '%')
			{
				a++;
			}
			
			else if(s.charAt(i) == '$')
			{
				b++;
			}
			
			else if(s.charAt(i) == '^')
			{
				c++;
			}
			
			else if (s.charAt(i) == '&')
			{
				d++;
			}
			
			else if(ch >= 'a' && ch<= 'z')
			{
				e++;
			}
			
			else if(ch >= 'A' && ch<= 'Z')
			{
				f++;
			}
		}

		System.out.println("Count of % is " + a);
		System.out.println("Count of $ is " + b);
		System.out.println("Count of ^ is " + c);
		System.out.println("Count of & is " + d);
		System.out.println("Count of small chars is " + e);
		System.out.println("Count of capital chars is " + f);
	}

}
