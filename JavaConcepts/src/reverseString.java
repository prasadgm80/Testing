
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		
		//String s = "Prasad";
		
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
