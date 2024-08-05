package leetCode;

public class MaximumArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] input = {1,8,6,2,5,4,8,3,7};
		int area = 0;
		int Maxarea = 0;
		
		for(int i=0; i<input.length; i++)
		{
			for(int j=i+1;j<input.length; j++ )
			{
				//Math.min(i, j);
				
				area = Math.min(input[i], input[j])*(j-i);
				
				if(area>Maxarea)
				{
					Maxarea = area;
				}
				
			}
		}
		
		System.out.println(Maxarea);

	}

}
