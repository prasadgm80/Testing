import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Payload.Body;

import static io.restassured.RestAssured.*;

public class dynamicJson {

	@Test(dataProvider = "BookData")
	public void Test1(String aisle, String isbn)
	{
		 RestAssured.baseURI = "http://216.10.245.166";
		
		 String Response =given().header("Content-Type", "application/json").
				 body(Body.book(aisle, isbn)).
		when().post("Library/Addbook.php").then().assertThat().statusCode(200).
		extract().response().asString();
		System.out.println(Response);
	
		JsonPath js = ReUsableMethods.rawToJson(Response);
		String id = js.get("ID");
		System.out.println(id);
				
	}
	
	@DataProvider(name = "BookData")
	public  Object[][] getData() 
	{
	return new Object[][] {{"asdf", "364"}, {"lkjh", "5897"}, {"mnbvc", "5648"}};
	}
	
	
	
}
