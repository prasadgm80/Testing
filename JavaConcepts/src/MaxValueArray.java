
public class MaxValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// printing Maximum value of 3*3 array
		

		int b[][] = {{1, 5, 8}, {4, 7, 11}, {2, 6, 15}};
		int max = b[0][0];
		
		for (int i=0; i<3; i++ )   //Tracks rows
		{
			for (int j =0 ; j<3; j++)   //Tracks columns
			{
				
				
				if(b[i][j] > max)
				{
					max = b[i][j];
				}
	}			

}
		System.out.println(max);
		
	}

}
