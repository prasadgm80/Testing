package Practice1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payload.Body;

public class bookDemo {
	
	@Test(dataProvider = "BookData")
	public void getBook(String Aisle, String isbn)
	{
		RestAssured.baseURI = "http://216.10.245.166";
		
		 String Response = given().header("Content-Type", "application/json").body(Body.AddBook(Aisle, isbn))
		 .when().post("Library/Addbook.php").then().assertThat().statusCode(200)
		 .extract().response().asString();
		 
		 JsonPath js = new JsonPath(Response);
		 
		 String id = js.get("ID");
		 System.out.println(id);
	}
	
	
	@DataProvider(name="BookData")
	public Object[][] getData()
	{
	return new	Object[][]  {{"ABC", "111"}, {"ABD","112"}, {"ABE","113"}};
				
	}
	

}
