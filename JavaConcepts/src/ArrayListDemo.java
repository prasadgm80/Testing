import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Abhijit");
		a.add("Akshay");
		a.add("Atul");
		a.add("null");
		
		System.out.println(a);
		
		a.add(0, "Avinash");
		System.out.println(a);
		
/*		a.remove(1);
		a.remove("Avinash");
		System.out.println(a);
*/
		System.out.println(a.get(0));
		System.out.println(a.contains("Atul"));
		
		System.out.println(a.indexOf("Atul"));
		a.size();
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}

}
