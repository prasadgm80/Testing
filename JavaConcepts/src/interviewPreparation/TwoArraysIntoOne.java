package interviewPreparation;

public class TwoArraysIntoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [1,2,5,6] [3,4,7,8]
		 * 
		 * output = [1,2,3,4,5,6,7,8]
		 */
		
		int[] input1 = {1,2,5,6};
		int[] input2 =  {3,4,7,8};
		
		int length = input1.length+input2.length-1;
		System.out.println(length);
		int output[] = new int[length];
		int k=0;
		for(int i=0; i<length; i++)
		{
			output[k] = input1[i];
					k++;
					System.out.println(output[k]);	
			output[k] = input2[i];
			System.out.println(output[k]);
			k++;
		}

	}

}
