
public class SringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Defining string with String Literal
		String a = " Hello";
		System.out.println(a.trim());
		
		String b = " Prasad";
		
		//Defining string by creating object of class
		
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		
		System.out.println(a.substring(2, 4));
		System.out.println(a.substring(2));
		System.out.println(a.concat("Prasad"));
		
		String ab = new String("Hello/World");
		
		String arr[] = ab.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(ab.replace("l", "k"));
		
		
		
	}

}
