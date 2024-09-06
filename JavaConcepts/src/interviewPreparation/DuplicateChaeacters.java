package interviewPreparation;

import java.util.ArrayList;

public class DuplicateChaeacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Apple";
		ArrayList<Character> chars = new ArrayList<Character>();
		boolean flag = false;
		for(int i=0; i<input.length(); i++)
		{
			if(!(chars.contains(input.charAt(i))))
			{
				chars.add(input.charAt(i));
			}
			
			else
			{
				 flag =true;
			}
		}
		
		System.out.println(input+" contains duplicate characters: "+ flag);

	}

}
