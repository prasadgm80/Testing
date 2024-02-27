
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2;
		double srt = Math.sqrt(num);
	    boolean flag = false;
	    for (int i = 2; i <= srt; ++i) {
	      
	    	// condition for nonprime number
	      if (num % i == 0) 
	      {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	

	}


