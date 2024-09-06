package leetCode;

public class SecondMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {8,2,5,6,1,9,4,3,7};
		int highest=0;
		int secondHighest=0;
		
		for(int i=0; i<nums.length; i++)
		{
			if(highest<nums[i])
			{
				secondHighest = highest;
				highest=nums[i];
				
			}
			
			else if(secondHighest<nums[i] && highest!=nums[i])
			{
				secondHighest=nums[i];
			}
		}
		
		System.out.println(highest);
		System.out.println(secondHighest);
		

	}

}
