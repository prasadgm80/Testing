package Interview;

public class reverString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		if(s.contains(" "))
		{
		String t = s.split(" ")[0];
		String u = s.split(" ")[1];
		
		String v= "";
		for(int i=t.length()-1; i>=0 ; i--)
		{
			//System.out.print(s.charAt(i));  //directly prints the string in reverse
			v = v + t.charAt(i);
		}
		
		String w= "";
		for(int j=t.length()-1; j>=0 ; j--)
		{
			//System.out.print(s.charAt(i));  //directly prints the string in reverse
			w = w + u.charAt(j);
		}
		
		System.out.println(v + " " + w);
		
		if(s.equalsIgnoreCase(t))
		{
			System.out.println("It is a Palindrome");
		}
		
		else
		{
			System.out.println("It is not a Palindrome");
		}
		
		}
		
		else
		{
			String t = "";
			for(int i=s.length()-1; i>=0 ; i--)
			{
				//System.out.print(s.charAt(i));  //directly prints the string in reverse
				t = t + s.charAt(i);
			}
			
			System.out.println(t);
			
			if(s.equalsIgnoreCase(t))
			{
				System.out.println("It is a Palindrome");
			}
			
			else
			{
				System.out.println("It is not a Palindrome");
			}
		}
				
	}

}
