package Interview;

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
	        System.out.println(
	                "java2blog and blogjava2 are rotation of each other : " + isRotation("java2blog", "blogjava2"));
	        System.out.println(
	                "java2blog and avablog2j are rotation of each other : " + isRotation("java2blog", "avablog2j"));
	 
	    }
	 
	    public static boolean isRotation(String str, String rotation) {
	        String str2 = str + str;
	 
	        System.out.println(str2);
	        
	        if (str2.contains(rotation)) {
	            return true;
	        }
	        return false;
	        
	        

	}

}
