package leetCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,2,3,3,4,5,6,6,7};
		int val = 3;
		
		List<Integer> ls = new ArrayList<Integer>();
		
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]!=val)
			{
				ls.add(nums[i]);
			}
			
		}
		System.out.println(ls);
		System.out.println(ls.size());

	}

}
