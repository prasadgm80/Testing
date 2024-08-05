package interviewPreparation;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Apple";
		String t = "";
		List<Character> list = new ArrayList<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			if(!(list.contains(s.charAt(i))))
			{
				list.add(s.charAt(i));
				t = t+s.charAt(i);
			}
			
		}
		
		System.out.println(t);
	}

}
