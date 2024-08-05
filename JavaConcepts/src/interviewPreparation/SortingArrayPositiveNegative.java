package interviewPreparation;

public class SortingArrayPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-1,5,-3,1,-5,-7,3,7};
		
		int num=0;
		int k=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
			{		
				k=arr[num];
				arr[num] = arr[i];
				arr[i]=k;
				num++;							
			}					
		}		

		for(int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j]);
			
		}
	}

}
