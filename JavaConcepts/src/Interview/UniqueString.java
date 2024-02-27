package Interview;

import java.util.ArrayList;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("String is unique : " + uniquechars("Apple"));
System.out.println("String is unique : " + uniquechars("blog"));

}
	
	public static boolean uniquechars(String word)
	{
		for(int i=0; i< word.length(); i++)
		{
			char c = word.charAt(i);
			
			if(word.indexOf(c) != word.lastIndexOf(c))
			{
				return false;
			}
			
		}
		return true;
	}
}
