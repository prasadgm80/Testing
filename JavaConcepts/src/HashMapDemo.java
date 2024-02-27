import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		
		hs.put(0, "USA");
		hs.put(1, "UK");
		hs.put(2, "INDIA");
		hs.put(3, "CHINA");
		hs.put(4, "Australia");
		
		System.out.println(hs.get(0));

		Set sn =hs.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
	}
	

}
