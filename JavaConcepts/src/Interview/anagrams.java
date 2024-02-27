package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class anagrams {
	
	public static boolean anagramMethod(String a, String b)
	{
		//String a = "Angel";
		//String b = "Angle";
		
		if(a.length() != b.length())
		{
			return false;
		}
		
		char[] S1 = a.toCharArray();
		char[] S2 = b.toCharArray();
		
		Arrays.sort(S2);
		Arrays.sort(S1);
		

		
		for(int i=0; i<a.length(); i++)
		{
			
			if(S2[i] != S1[i])
			{
				return false;
			}
			
		}
return true;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Both Strings are Anagram: " + anagramMethod("Angel", "Angle"));
		System.out.println("Both Strings are Anagram: " + anagramMethod("prasa", "Angle"));
		
}
}

