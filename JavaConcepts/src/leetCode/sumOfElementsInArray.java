package leetCode;

public class sumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int target = 8;
		
		for(int i=0; i< arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(target ==arr[i]+arr[j] )
				{
					System.out.println(arr[i]+" and "+arr[j]+" adds to target "+target );
				}
			}
		}
		

	}

}
