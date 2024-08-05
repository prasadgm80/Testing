import java.util.ArrayList;
import java.util.List;

public class charactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "prasad";
		
		List<String> ls = new ArrayList<String>();
		
		for(int i=0; i<name.length(); i++)
		{
			
			Character ch = name.charAt(i);
			if(!(ls.contains(ch.toString())))
			{
			ls.add(ch.toString());
			}
		}
		
			for(int j=0; j<ls.size(); j++)
			
{
				int counter =0;	
Character ch1 = null;

				
				for(int k=0; k<name.length(); k++)
				{
				 ch1 = name.charAt(k);
				
	if(ls.get(j).equalsIgnoreCase(ch1.toString()))
	{
		counter++;
	}
	
}
				System.out.println(ls.get(j)+" is repeated "+counter+" times");
				
	}
			
	}
}
			


			
		

	


