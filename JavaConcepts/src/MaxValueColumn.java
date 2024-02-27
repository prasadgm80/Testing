
public class MaxValueColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Finding minimum value in array and then finding maximum value from that column
		

		int arr[][] = {{1, 5, 8}, {4, 7, 11}, {2, 6, 15}};
		System.out.println("Max Value is " + maxVal(arr));
		

}
	
	public static int maxVal(int b[][])
	{
		int min = b[0][0];
		int mincolumn = 0;
		//int maxvalue = b[0][0];
		
		for (int i=0; i<3; i++ )   //Tracks rows
		{
			for (int j =0 ; j<3; j++)   //Tracks columns
			{
				
				
				if(b[i][j] < min)
				{
					min = b[i][j];
					mincolumn = j;
				}
	}			

}
		int maxvalue = b[0][mincolumn];
		int k = 0;
		while (k<3)
		{
			if(b[k][mincolumn]>maxvalue)
			{
				maxvalue = b[k][mincolumn];
			}
			k++;
		}
		System.out.println(maxvalue);
		
		return maxvalue;
		
		
	}
	}


