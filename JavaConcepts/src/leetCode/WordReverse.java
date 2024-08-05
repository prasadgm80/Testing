package leetCode;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testing = "Prasad is Clever or Not";
		String reverse = "";
		
		String[] arr = testing.split(" ");
		
		for(int i=arr.length-1;i>=0; i--)
		{
			reverse = reverse+arr[i]+" ";
		}
		
		System.out.println(reverse);

	}

}
