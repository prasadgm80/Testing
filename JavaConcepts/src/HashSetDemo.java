import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs =new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("Uk");
		hs.add("Australia");
		hs.add("China");
		
		hs.add("INDIA");
		hs.add(null);
		hs.add("null");
		hs.add(null);
		
		System.out.println(hs);
		
		Iterator<String> i=hs.iterator();
		//i.next();
		
		while(i.hasNext())
		{
		System.out.println(i.next());
		
		}
		//System.out.println(hs);
	}

}
