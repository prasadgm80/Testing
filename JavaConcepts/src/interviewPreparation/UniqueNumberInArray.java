package interviewPreparation;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,5,7,9,11,1,2,3,7,5,11};
		List<Integer> listarray = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
		
		if(!(listarray.contains(arr[i])))
{
	listarray.add(arr[i]);
	

			
			
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
				
			}
			
			if(count==0)
			{
				System.out.println(arr[i]+" is unique number");
			}
		}

	}
	}
}


