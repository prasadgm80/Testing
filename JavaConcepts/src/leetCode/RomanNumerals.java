package leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5 - v
		//4 = IV
		
		int num = 11350;
		
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		
		hs.put(1, "I");
		hs.put(5, "V");
		hs.put(10, "X");
		hs.put(100, "C");
		hs.put(500, "D");
		hs.put(1000, "M");
		
		int[] arr  = {1000, 500, 100, 10, 5, 1}; 
		
		//int length = Integer.toString(input).length();
		
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) 
        {
            while (num >= values[i]) {
                //num -= values[i];
            	num = num-values[i];
                roman.append(symbols[i]);
            }
        }
            System.out.println(roman);
		
	}

	}

