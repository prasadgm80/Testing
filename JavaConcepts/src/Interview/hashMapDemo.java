package Interview;

import java.util.HashMap;

public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(0, "A");
		hm.put(1, "B");
		hm.put(2, "B");
		
		System.out.println(hm);
		
		for(int i=0; i<hm.size(); i++)
		{
			System.out.println(hm.get(i));
		}
		
		

	}

}
