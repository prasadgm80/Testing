package Interview;

import java.util.ArrayList;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> ab =new ArrayList();
		ab.add("Hello World");
		
		String s = "Hello World";
		String t = s.split(" ")[0];
		String u = s.split(" ")[1];
		
		String v = "";
		for(int i=t.length()-1; i>=0 ; i--)
		{
			//System.out.print(s.charAt(i));  //directly prints the string in reverse
			v = v + t.charAt(i);
		}
		
		String w = "";
		for(int j=u.length()-1; j>=0 ; j--)
		{
			//System.out.print(s.charAt(i));  //directly prints the string in reverse
			w = w + u.charAt(j);
		}
		String x = v + " "+ w;
		
		System.out.println(x);
		
		if(s.equalsIgnoreCase(x))
		{
			System.out.println("It is a palindrome");
		}
		
		else
		{
			System.out.println("It is not a palindrome");

		}
		
		System.out.println(t);
		System.out.println(u);
		
		String s1= "EY";
		String s2= "EY";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
	/*	System.out.println(s[0]);
		System.out.println(s[1]);
		
		StringBuffer sb = new StringBuffer();
		
		sb.insert(0, s);
		sb.insert(11, sb.reverse());
		//StringBuffer t = sb.reverse();
		
		System.out.println(sb);
		
	*/	

	}

}
                      