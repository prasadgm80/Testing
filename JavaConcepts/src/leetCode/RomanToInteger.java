package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///so logic here is from right to left value of each Roman numeral will decrease
		//So if any Roman numeral with less value is on left we need to substract its value
		//from its immediate right numeral value
		
		String input = "MCMXCIV";
		
		Map<Character, Integer> roman = new HashMap<>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		
		int initialvalue = 0;
		int sum = 0;
		
		for(int i=input.length()-1; i>=0; i--)
		{
			int currentValue = roman.get(input.charAt(i));
			
			if(currentValue<initialvalue)
			{
				sum = sum-currentValue;
			}
			
			else
			{
				sum = sum+currentValue;
			}
			
			initialvalue = currentValue;
		}
		
		System.out.println(sum);

	}

}
