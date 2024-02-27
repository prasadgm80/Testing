package Interview;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 4, 3, 5, 7};
		System.out.println("Missing number is " + missingN(arr));
		
		

	}
	
	public static int missingN(int a[])
	{

		int n = a.length + 1;
		
		int totalSum = n*(n+1)/2;
		
		int sum = 0;
		for (int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		
		int missingNum;
		
		missingNum = totalSum - sum;
		
		//System.out.println(miss);
		return missingNum;
	}

}
