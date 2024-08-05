package Interview;

public class switchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String env ="uat1";
		
		switch(env)
		{
		case "uat1": System.out.println("uat1");	
		case "uat2": System.out.println("uat2");
		case "uat3": System.out.println("uat3");
		
		default: System.out.println("uat4");
		}

	}

}
