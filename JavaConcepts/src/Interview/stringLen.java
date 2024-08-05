package Interview;

public class stringLen {
	
	public static int getInt(String x)
	{

		
		
		int l=0;
		try
		{
		for(int i=0;;i++)
		{
			x.charAt(i);
			l++;
			
		}
		}
		//adding comment
		catch(Exception e)
		{
			
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Apple";
		System.out.println("Length of String is " + getInt(s));
	}

}
