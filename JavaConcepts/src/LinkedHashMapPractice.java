import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> lh = new LinkedHashMap<Integer,String>();
		
		lh.put(0, "Aditi");
		lh.put(1, "Prasad");
		
		for(Entry<Integer, String> mp :lh.entrySet())
		{
			System.out.println(mp.getKey()+" is the key for "+mp.getValue());
		}

	}

}
