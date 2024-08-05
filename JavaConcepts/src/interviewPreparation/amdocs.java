package interviewPreparation;

public class amdocs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "aabbbccccaaaaaa";
		int counter = 1;
		
		//StringBuilder comp = new StringBuilder();
		StringBuffer comp = new StringBuffer();
		
		for(int i=0; i<test.length(); i++)
		{
			if(i+1 <test.length() && test.charAt(i)==test.charAt(i+1))
			{
				counter++;
			}
			
			else
			{
				comp.append(test.charAt(i)).append(counter);
				counter = 1;
			}
				
		}
		System.out.println(comp);	
		}

	}