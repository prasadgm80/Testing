package Interview;

import java.util.HashSet;

public class UniqueStringHshSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String has Unique characters: " + uniquechars("Apple"));
		System.out.println("String has Unique characters: " + uniquechars("blog"));

	}
	
	public static boolean uniquechars(String word)
	{
		HashSet hs = new HashSet();
		
		for(int i=0; i<word.length(); i++)
		{
			char c = word.charAt(i);
			if(!(hs.add(c)))
			{
				return false;
			}						
		}
		System.out.println(hs);
		return true;
	}

}
