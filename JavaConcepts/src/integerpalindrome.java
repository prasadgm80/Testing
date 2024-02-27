
public class integerpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int palindrome = 125;
		int reverse = 0;
		
		while (palindrome != 0) 
		
		{
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
            }
		
		System.out.println(reverse);

}
}
