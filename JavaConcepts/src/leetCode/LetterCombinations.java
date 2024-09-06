package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> letters  =new HashMap<Integer, String>();
		String num = "23";
		List<String> test = new ArrayList<String>();

		int number = 23;

		
		letters.put(2, "abc");
		letters.put(3, "def");
		letters.put(4, "ghi");
		letters.put(5, "jkl");
		letters.put(6, "mno");
		letters.put(7, "pqrs");
		letters.put(8, "tuv");
		letters.put(9, "wxyz");
		
		while(number>0)
		{
int remainder  = number%10;
			
test.add(letters.get(remainder));
			
number = number/10;
		}
		
		for(int i=0; i<)

	}

}
