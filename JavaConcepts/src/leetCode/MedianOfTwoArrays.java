package leetCode;

public class MedianOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,7};
		int[] b = {8,9,10,11,12,13,14};
		
		int size1 = a.length;
		int size2 = b.length;
		//float s = (float)(6+5)/2;
		//System.out.println(s);
		
		int sum = size1+size2;
		float median;
		int div = sum/2;
		
		if(size1>size2)
		{
			
		if(sum%2==0)
		{
			
			 median = (float)(a[div-1]+a[div])/2;
				System.out.println("Median is "+median );
		}
			
			else
			{
				
				System.out.println("Median is "+ a[div]);
			}
		}
		
		else if(size1<size2)
		{
			if(sum%2==0)
			{
			 median = (float)(b[div-size1-1]+b[div-size1])/2;
			 System.out.println("Median is "+median );
			}
			
			else
			{
				
				System.out.println("Median is "+ b[div-size1]);
			}
		}
		
		else
		{
			 median = (float)(a[size1-1]+b[0])/2;
			 System.out.println("Median is "+median);		
		}

	}	
}
