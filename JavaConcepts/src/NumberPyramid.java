
public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1;
		for(int i=0; i<4; i++)
		{
			
			
			//for(int j=1; j<=4-i; j++)
			for(int j=1; j<=i+1; j++)	   // loop for reverse pyramid
				
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
	}
	}
}

/*
 Numbers in Pyramid
 1  2  3  4
 5  6  7
 8  9
 10
 
 Numbers in Reverse Pyramid
 
 1
 2  3
 4  5  6
 7  8  9  10
 
 */

