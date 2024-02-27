package Interview;

public class maxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[][] = {{10, 5}, {11, 17}, {23, 31}};
		
		int mincolumn = 0;
		int max = b[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				if(b[i][j]> max)
				{
					max = b[i][j];
					mincolumn = j;
				}
			}
		}
		
		System.out.println(max);
		
		int minvalue = b[0][mincolumn];
		int k=0;
		
		while(k<3)
		{
			if(b[k][mincolumn]<minvalue)
			{
				minvalue = b[k][mincolumn];
			}
			
			k++;
		}
		
		System.out.println(minvalue);
	}
	
	

}
