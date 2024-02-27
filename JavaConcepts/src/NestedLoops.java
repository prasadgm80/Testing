
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<4; i++)
		{
			System.out.println("Outer For Loop Started");
			
			for(int j=0; j<3; j++)
			{
				System.out.println("Inner For Loop Started");
			}
			
			System.out.println("Outer For Loop Ended");
		}
	}

}
