import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import Payload.Body;
import io.restassured.path.json.JsonPath;

public class MockResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JsonPath js  = new JsonPath(Body.dummyResponse());
		
		// Count of number of courses
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//Printing purchase amount
		int purchaseAmount =	js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);
		
		// Printing title of first course
		String firstTitle = js.get("courses[0].title");
		System.out.println(firstTitle);
		
		String[] arra = new String[3];
		arra = js.get("courses[*].title");
		System.out.println(arra);
		
		
		// Printing title and prices of all courses
		for (int i=0; i<count;i++)
		{
			String courses = js.get("courses["+i+"].title");
			System.out.println(courses);
			
			int price = js.getInt("courses["+i+"].price");
			System.out.println(price);
		}
	
		//Printing price of specific course
		for (int i=0; i<count;i++)
		{
			String courses = js.get("courses["+i+"].title");
			
			if(courses.contains("RPA"))
			{
			int price = js.getInt("courses["+i+"].price");
			System.out.println(price);
			}
		}
	
		// Validating sum of all courses is correctly matching purchase amount
		int k = 0;
		for (int i=0; i<count;i++)
		{
			
			int price = js.getInt("courses["+i+"].price");
			int copies = js.getInt("courses["+i+"].copies");
			int multiplication = price*copies;
			k = k + multiplication;
			}
		if(k==purchaseAmount)
		{
			System.out.println("Amount matched");
		}
		else
		{
			System.out.println("Amount did not match");
		}
		
		Assert.assertEquals(k, purchaseAmount);
	}

}
