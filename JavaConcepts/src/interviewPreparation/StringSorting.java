package interviewPreparation;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "a3BcA1bC2";
		char[] arr = input.toCharArray();
		//input.to
		String a = "";
		String b = "";
		String c = "";
		String sorted1 = "";
		String sorted2 = "";
		String sorted3 ="";
		StringBuilder sb = new StringBuilder();
	//	output = "abcABC12"
		Arrays.sort(arr);
		//System.out.println(String.valueOf(arr));
		
		//System.out.println(Arrays);
		for(int i=0; i<input.length(); i++)
		{
			Character ch = input.charAt(i);
			if(Character.isLowerCase(ch))
			{
				a = a+ch;
				char[] arr1 = a.toCharArray();
				Arrays.sort(arr1);
				 sorted1 = String.valueOf(arr1);
			}
			
			else if(Character.isUpperCase(ch))
			{
				b = b+ch;
				char[] arr2 =b.toCharArray();
				Arrays.sort(arr2);
				 sorted2 = String.valueOf(arr2);
			}
			
			else
			{
				c = c+ch;
				char[] arr3 = c.toCharArray();
				Arrays.sort(arr3);
			 sorted3 = String.valueOf(arr3);
			}
		}
		
		Arrays.sort(a.toCharArray());
		//String.valueOf();
sb.append(sorted1).append(sorted2).append(sorted3);

System.out.println(sb);
	}

}
