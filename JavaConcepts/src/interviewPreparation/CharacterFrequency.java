package interviewPreparation;

import java.util.ArrayList;
import java.util.List;

public class CharacterFrequency {
	
	public static void getFrequency(String name)
	{
		
		ArrayList<Character> nameChars = new ArrayList<Character>();
		int highest =0;
		int secondHighest = 0;
		char ch1 = ' ';
		char ch2 = ' ';
		
		for(int i=0; i<name.length(); i++)
		{
			int count=0;
			if(!(nameChars.contains(name.charAt(i))))
			{
				nameChars.add(name.charAt(i));
				
				for(int j=i; j<name.length(); j++)
				{
					if(name.charAt(i)==name.charAt(j))
					{
						count++;
					}
				}
				
				if(count>highest) 
				{
					secondHighest = highest;
					highest = count;
					
					ch2 = ch1;
					ch1 = name.charAt(i);
				}
				
				else if(count>secondHighest && highest!= count)
				{
					secondHighest = count;
					ch2 = name.charAt(i);
				}
				
			}
		}
		
		System.out.println(ch1+" is repeated "+highest+" times And "+ch2+" is repeated "+secondHighest+" times");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getFrequency("Prasada Mankeswarkar");
	}

}
