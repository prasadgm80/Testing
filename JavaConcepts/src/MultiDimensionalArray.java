
public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[2][2];
		
		a[0][0] = 1;
		a[0][1] = 4;
		a[1][0] = 5;
		a[1][1] = 7;
		
		//System.out.println(a[1][1]);
		
		//Defining multi dimensional array in literal form
		
		int b[][] = {{1, 5}, {4, 7}};
		
		for (int i=0; i<2; i++ )   //Tracks rows
		{
			for (int j =0 ; j<2; j++)   //Tracks columns
			{
				System.out.println(b[i][j]);
			}
		}
		
	

}
}