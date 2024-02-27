import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class responseExtractPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
RestAssured.baseURI = "https://reqres.in";
		
		RestAssured.useRelaxedHTTPSValidation();
		
		//End to end API Test
		
	String output = given().log().all()
			.header("Content-Type","application/json").queryParam("page", "2").
			body("")
				.when().get("/api/users")
				.then().extract().response()
				.asString(); 
	 
		System.out.println(output);
		
		JsonPath js = new JsonPath(output);
				
		 System.out.println(js.getList("data.id").get(0)); // Gets element at any index with get() method
			
		int n = js.getList("data.id").size(); // Counts size of an array

		ArrayList<Object> str= new ArrayList<Object>();
		
		for (int i=0; i<js.getList("data.id").size(); i++)
		{
			Object s1 = js.getList("data.id").get(i); // Since element in array are objects so defined an object
			
			Object id = js.get("data["+i+"].id"); //another way to extract data from an array
			
			str.add(s1); //Stores elements in response array in an arraylist
			Assert.assertNotEquals(s1, "null");
			System.out.println(s1);
			System.out.println(id);
			
		}
		
		String output1 = given().log().all()
				.header("Content-Type","application/json").
				body("")
					.when().get("/api/unknown/2")
					.then().extract().response()
					.asString(); 
		
		System.out.println(output1);
		
		JsonPath js1 = new JsonPath(output1);
		Object id1 = js1.get("data.id");
		System.out.println(id1);
		Object text = js1.get("support.text");
		
		Assert.assertEquals(text, "To keep ReqRes free, contributions towards server costs are appreciated!");
	
	}

}
