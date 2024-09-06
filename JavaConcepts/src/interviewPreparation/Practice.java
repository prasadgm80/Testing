package interviewPreparation;

import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void getArray(int[] arr)
	{
		
		List<Integer> numbers = new ArrayList<Integer>();
		int x=0;
		int y=1;
		
		for(int num: arr)
		{
			numbers.add(num);
		}
		
		for(int i=0; i<numbers.size(); i++)
		{
			if(numbers.get(i)%2==0)
			{
				arr[x]=numbers.get(i);
				x=x+2;
			}
			
			else
			{
				arr[y]=numbers.get(i);
				y=y+2;
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputArray = {3,6,12,1,5,8};
		
		getArray(inputArray);

	}

}
