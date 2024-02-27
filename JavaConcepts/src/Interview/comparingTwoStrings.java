package Interview;

import java.util.ArrayList;

public class comparingTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program to print not matching number from second string 
		int a[] = {1, 2, 3, 4, 6};
		ArrayList<Integer> ab = new ArrayList<Integer>();
		ab.add(1);
		ab.add(2);
		ab.add(3);
		ab.add(5);
		ab.add(6);
		
		for (int i=0; i<a.length; i++)
		{
			
				if(!ab.contains(a[i]))
				{
					System.out.println(a[i]);
				}
			}
		}
		
	

}
