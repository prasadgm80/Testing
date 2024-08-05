import java.util.ArrayList;
import java.util.List;

public class largestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "avocado";
		List<Integer> lengh = new ArrayList<Integer>();
		
		char[] arr = s.toCharArray();
		
		for(int k=0; k<arr.length; k++)
		{
			String t = "";
			
		for(int i=k; i< arr.length; i++)
		{
			if(t.isBlank())
			{
			int num = 0;				
			for (int j=i+1; j<arr.length; j++)
			{
				
				if(arr[i]==arr[j])
				{
					num= num+1;
					t = s.substring(k, j);
					System.out.println(t);
					lengh.add(t.length());
					
				break;
				}
											
			}
			}
			}
		
		if(t.isBlank())
				 
		{
			t = s.substring(k, arr.length);
			lengh.add(t.length());		
			System.out.println(t);
			
		}
		
		}
		System.out.println(lengh);
	}
}
