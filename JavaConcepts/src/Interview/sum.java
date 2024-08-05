package Interview;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
		
		int sum=0;
		int sumArray=0;
		int difference;
		int num = arr.length+1;
		
		for(int j=1; j<=num; j++)
		{
			sum = sum +j;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			
			
			sumArray = sumArray + arr[i];
			
		}
		
		difference = sum-sumArray;
		
		System.out.println(sum);
		System.out.println(sumArray);
		
		System.out.println(difference);

	}

}
