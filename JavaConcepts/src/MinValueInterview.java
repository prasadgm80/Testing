
public class MinValueInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// printing minimum value of 3*3 array
		

		int b[][] = {{11, 5, 8}, {4, 7, 11}, {2, 6, 15}};
		System.out.println("Minimum Number is " + minNum(b));
		
}
	
	
	public static int minNum(int arr[][])
	{
		int min = arr[0][0];
		for (int i=0; i<3; i++ )   //Tracks rows
		{
			for (int j =0 ; j<3; j++)   //Tracks columns
			{
				
				if(arr[i][j] < min)
				{
					min = arr[i][j];
				}
	}			

}
		return min;
		//System.out.println(min);
		
	}
}
	
	
