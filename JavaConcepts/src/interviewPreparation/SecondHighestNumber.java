package interviewPreparation;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,7,4,6,2,5,7};
		int highest=0;
		int secondHighest = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>highest)
			{
				secondHighest = highest;
				highest = arr[i];
				
			}
			
			else if(arr[i]> secondHighest && arr[i] !=highest )
			{
				secondHighest = arr[i] ;
			}
		}
		
		System.out.println(secondHighest);

	}

}
