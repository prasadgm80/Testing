import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		List<String> testing = new ArrayList<String>();
		
		testing.add("India");
		testing.add("Japan");
		testing.add("USA");
		testing.add("India");
		
		hs.put(0, "USA");
		hs.put(1, "UK");
		hs.put(2, "INDIA");
		hs.put(3, "INDIA");
		hs.put(4, "Australia");
		hs.put(4, "DuplicateKey");
		hs.put(5, null);
		hs.put(6, null);
		hs.put(null, "Test");
		
		
		//hs.size()
		
		//System.out.println(hs.get(0));
      //Map.Entry mp: map.EntrySet
		Set sn =hs.entrySet();
		Iterator it = sn.iterator();
		//System.out.println(hs);
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry) it.next();
			
			//System.out.println(it.next());
			//System.out.println(mp.getKey());
			//System.out.println(mp.getValue());
			
			//System.out.println(mp.getKey()+" for "+mp.getValue());
		}
		
		for(Map.Entry m: hs.entrySet())
		{
			System.out.println(m.getKey()+" for "+m.getValue());
		}
		
		
	}
	

}
