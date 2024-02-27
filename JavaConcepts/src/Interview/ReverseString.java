package Interview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		
		        ReverseString rsr = new ReverseString();
		        String blogName = "java2blog";
		        String reverse = rsr.recursiveReverse(blogName);
		        System.out.println("Reverse of java2blog is:" + reverse);
*/
		String s = "abcde";
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		
		    }
		 
		    public String recursiveReverse(String orig) {
		        if (orig.length() == 1)
		            return orig;
		        else
		            return orig.charAt(orig.length() - 1) + 
		                          recursiveReverse(orig.substring(0, orig.length() - 1));
		 

	}

}
