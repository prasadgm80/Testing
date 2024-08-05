package interviewPreparation;

import java.util.ArrayList;

public class EvenPositionOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,6,12,1,5,8};
		int[] sortedArray = new int[arr.length];
		int[] sortedArray1 = new int[arr.length];
		
		int x=0;
		int y = 1;
		
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
				sortedArray1[x] = arr[i];
				x = x+2;
			}
			
			else
			{
				odd.add(arr[i]);
				
				sortedArray1[y] = arr[i];
				y = y+2;
			}
		}
		
		
		int evenIndex = 0;
		int oddIndex = 1;
		
		for(int j=0; j<even.size();j++)
		{
			sortedArray[evenIndex] = even.get(j);
			evenIndex = evenIndex+2;
			//System.out.println(arr[evenIndex]);
		}
		
		for(int j=0; j<odd.size();j++)
		{
			sortedArray[oddIndex] = odd.get(j);
			oddIndex = oddIndex+2;
		}
        
		for(int k=0;k<sortedArray.length;  k++)
		{
			System.out.println(sortedArray1[k]);
		}
        
}
}
