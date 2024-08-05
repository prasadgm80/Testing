import java.util.ArrayList;

public class reverse {
	
	public static String reversal(String word) {
	    char[] chs = word.toCharArray();
	    System.out.println(chs);

	    int i=0, j=chs.length-1;
	    while (i < j) {
	        // swap chs[i] and chs[j]
	        char t = chs[i];
	        chs[i] = chs[j];
	        chs[j] = t;
	       i++; j--;
	    }
	    return String.valueOf(chs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reversal("Hello World Test"));
		}
}


