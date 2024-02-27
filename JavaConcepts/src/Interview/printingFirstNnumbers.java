package Interview;

public class printingFirstNnumbers {
	
	static void counting(int n)
	{
		if(n<=0)
		{
			return;
		}
		else 
		{
			counting(n-1);
			System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printingFirstNnumbers pn = new printingFirstNnumbers();
		pn.counting(10);
		
		
//System.out.println(counting(5));
	}

}
