package Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removingduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,1, 5,7,58,9,58,9};
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		
		HashSet<Integer> hs = new HashSet();
		
		for(int i=0; i<arr.length;i++ )
		{
			hs.add(arr[i]);
		}
		
		
		for(int j=0; j<arr.length; j++)
		{
			if(!(duplicate.contains(arr[j])))
			{
				duplicate.add(arr[j]);
			}
			
		}
		
        System.out.println(duplicate);
		System.out.println(hs);
		

	}

}
