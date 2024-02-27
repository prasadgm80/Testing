package Interview;

import java.util.HashMap;
import java.util.HashSet;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Applpe";
		
		HashSet hs = new HashSet();
		
		for(int i=0; i<s.length(); i++)
		{
			int count =1;
			
			char c = s.charAt(i);
				
			if (!(hs.contains(c)))
			{
			hs.add(c);
			
			for(int j= i+1; j<s.length(); j++)
			{
				char d = s.charAt(j);
				
				if(c==d)
				{
					count++;
					
				}				
			}
		}
			
			else if (hs.contains(c))
			{
				
			}
			
			if(count ==1)
			{
				System.out.println(c + " is non repeated character ");
			}
			
			else
			{
			System.out.println(c + " is ocurred " + count + " times");
			
			
/*			else {
				count++;
				System.out.println(c + " is duplicate");
			}
*/
			//int j = i+1;
			
			
		}
			}
		}
}
