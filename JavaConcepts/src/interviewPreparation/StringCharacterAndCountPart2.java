package interviewPreparation;

public class StringCharacterAndCountPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "a2b4c6d10";
		
		StringBuffer characterSeq = new StringBuffer();
		
		 for(int i=0; i<input.length(); i++)
		 {
			 StringBuffer num = new StringBuffer();
			 char ch = input.charAt(i);
			 
			 while(i+1<input.length() && Character.isDigit(input.charAt(i+1)))
			 {
				 num.append(input.charAt(i+1));
				 i++;
			 }
			 
			 int count = Integer.parseInt(num.toString());
			 
			 for(int j=0; j<count; j++)
			 {
				 characterSeq.append(ch) ;
			 }
					 
		 }
		 
		 System.out.println(characterSeq);
			
			
			
		
	}

}
