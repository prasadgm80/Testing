import java.util.ArrayList;

public class interviewPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random Comments
		
		
		//Number Swapping
/*		int x = 50;
		int y = 45;
		
		System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
			
*/
		//Removing duplicates from array
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		a.add(2);
		a.add(5);
		a.add(7);
		a.add(15);
		a.add(13);
		a.add(7);
		a.add(2);
		
		int c[] = {1, 5, 7, 13, 5, 7, 19};
		
		for(int i=0; i< a.size(); i++)
		{
			if(!b.contains(c[i]))
			{
				b.add(c[i]);
			}
		}
		System.out.println(b);
/*
		
		int num, b, c;
		num = 123;
		num = num - (num/10)*10;
		System.out.println(num);
*/		
	}

}
