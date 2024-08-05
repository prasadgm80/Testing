package interviewPreparation;

public class testDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hello World");
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s3.intern());
		//System.out.println(s1.intern());
	}

}
