package Interview;

import java.util.LinkedList;

public class linkedlistss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		
		ll.add("A");
		ll.add("A");
		ll.add("A");
		ll.add("A");
		ll.add("245");

		System.out.println(ll);
		
		for(int i=0; i< ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		
		
	}

}
