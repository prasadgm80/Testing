import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int a, b, i, hcfl = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter first number :: ");
	      a = sc.nextInt();
	      System.out.println("Enter second number :: ");
	      b = sc.nextInt();

	      for(i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	         hcfl = i;
	      }
	      System.out.println("HCF of given two numbers is ::"+hcfl);
*/	 
		
		int a, b, i, hcfl = 0, lcml = 0;
		 
		a = 25;
		b=10;
		
		for(i=1; i<=b; i++)
		{
			if( a%i == 0 && b%i == 0 )
		         hcfl = i;
		}
		System.out.println("HCF of two numbers is " + hcfl);
		
		lcml = a*b/hcfl;
		
		System.out.println("LCM of two numbers is " + lcml);
		
	   }
	
	}


