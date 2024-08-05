package leetCode;

import java.util.HashSet;
import java.util.Iterator;

public class RemovingDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Prasad";
		String t = "";
		HashSet<Character> hs = new HashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			hs.add(s.charAt(i));
			
		}
		
		Iterator<Character> i =hs.iterator();
		
		
		
		while(i.hasNext())
		{
			t = t+i.next();
		}
		//System.out.println(hs.toString());
System.out.println(t);


	}

}
