package Interview;

public class secondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 7, 10, 15, 25};
		int m = arr.length;
		int j=0;
		
		for (int i=0; i<arr.length; i++)
		{
			for(int k=0; k<arr.length; k++)
			{
				if(arr[i]>arr[k])
				{
					arr[i] = j;
					arr[i] = arr[k];
					arr[k] = j;
							
				}
			}
		}		

		System.out.println(arr[1]);
	}

}
