package leetCode;

import java.util.HashSet;

public class RemovingDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,3,4,5,6,6,6,7};
		HashSet hs = new HashSet();
		
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		
		System.out.println(hs);
		System.out.println(hs.size());

	}

}
