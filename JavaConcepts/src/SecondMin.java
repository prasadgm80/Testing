import java.util.ArrayList;

public class SecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[] = {5, 1, 9, 17, 7,501,304};
		ArrayList<Integer> a = new ArrayList<Integer>();
		int k;
		
		for (int i=0; i<b.length; i++)
		{
			for(int j = i+1; j<b.length; j++)
			{
			if(b[i]>b[j])
			{
				 k = b[i];
				 b[i] = b[j];
				 b[j] = k;       
			}
		
		}
			a.add(b[i])	;
			}
		System.out.println(a);
		//prints second highest number
		System.out.println("The Second highest number is " + a.get(a.size()-2));
		//prints second lowest number
		System.out.println("The Second Lowest number is " + a.get(1));
}
}