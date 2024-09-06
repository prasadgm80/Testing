package interviewPreparation;

public class StringCharacterAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * input = a2b4c6d10
		 * output - aabbbbccccccdddddddddd
		 */
		
		String input = "a2b4c6d10";
		StringBuffer sb = new StringBuffer();
		char num = 0;
		
		for(int i=0; i<input.length();i=i+2)
		{
			Character ch = input.charAt(i);
			//char num =input.charAt(i+1);
			int k=0;
			
			try
			{
			 num =input.charAt(i+1);
				
			}
			
			catch(Exception e)
			{
				
			}
			
			
			
			finally
			{
			while(k<Integer.parseInt(String.valueOf(num)))
			{
				sb.append(String.valueOf(ch));
				k++;
			}
			}
			
		}
System.out.println(sb);
	}

}
