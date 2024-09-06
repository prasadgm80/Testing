package interviewPreparation;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		
		int firstNum=0;
		int SecondNum = 1;
		int nextNum=0;
		
		System.out.print("Fibbonacci series is "+firstNum+" "+SecondNum);
		
		for(int i=2; i<num; i++)
		{
			nextNum = firstNum+SecondNum;
			
			System.out.print(" "+nextNum);
			firstNum = SecondNum;
			SecondNum =nextNum; 
			
		}

	}

}
