package Interview;

import java.util.HashSet;

public class removingduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,1, 5,7,58,9,58};
		
		HashSet<Integer> hs = new HashSet();
		
		for(int i=0; i<arr.length;i++ )
		{
			hs.add(arr[i]);
		}

		System.out.println(hs);
		

	}

}
