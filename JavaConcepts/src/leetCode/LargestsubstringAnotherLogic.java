package leetCode;

import java.util.HashSet;

public class LargestsubstringAnotherLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "avocado";
		
		HashSet hs = new HashSet();
		
		for(int i=0; i<s.length(); i++)
		{
			hs.add(s.charAt(i));
		}
		
		System.out.println(hs);
		
		for(int j=0; j<s.length(); j++)
		{
			
		}

	}

}
