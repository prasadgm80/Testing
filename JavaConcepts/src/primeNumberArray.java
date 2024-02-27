
public class primeNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int b[] = {5, 1, 9, 17, 7,501,304};
		//for (int j=0; j<b.length; j++)
			for (int j=2; j<100; j++)
		{
		//int num = b[j];
				int num = j;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      
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

}
