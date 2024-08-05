package leetCode;

public class SecondMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,5,6,1,9,4,3,7};
		int k;
		
		for(int i=0; i<nums.length; i++)
		{
			for(int j=0; j<nums.length; j++)
			{
				if(nums[i]>nums[j])
				{
					k=nums[i];
					nums[i]=nums[j];
					nums[j]=k;
					
				}
			}
		}
		
		for(int l=0; l<nums.length; l++)
		{
		System.out.println(nums[l]);
		}

	}

}
