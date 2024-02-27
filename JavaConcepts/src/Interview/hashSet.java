package Interview;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("B");
		
	/*	hs.remove("B");
		hs.add("B");
		
*/		
		
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			String s = (String)it.next();
			System.out.println(s);
		}

	}

}
