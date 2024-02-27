
public class PyramidWithSameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1
		 1  2
		 1  2  3
		 1  2  3  4
		 */
		
		
		int k=1;
		//for(int i=0; i<4; i++)
			
			for(int i=0; i<11; i = i+3)	
		{
			
			
			//for(int j=1; j<=4-i; j++)
			//for(int j=1; j<=i+1; j++)	   // loop for reverse pyramid
			for(int j=3; j<=i; j = j+3)   //  reverse pyramid with number 3, 6, 9
				
			{
				System.out.print(j);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
	}

}
}
