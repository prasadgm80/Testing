package Practice1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payload.Body;
import io.restassured.*;


public class Test1 {

	
	//Add Place
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String Response = given().queryParam("Key", "qaclick123").
				header("Content-Type", "application/json")
		.body(Body.AddPlace())
		.when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
		.extract().response().asString();
		
	
		
		JsonPath js = new JsonPath(Response);
		
		String Place = js.get("place_id");
		System.out.println(Place);
		
		//Update Place
		String Address  = "Tiwat Galli, Gangakeds, 431514";
		
		String UpdatePlace = given().queryParam("Key", "aclick123").
		header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+Place+" \",\r\n"
				+ "\"address\":\""+Address+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").when().put("/maps/api/place/update/json").then().assertThat().statusCode(200)
		.extract().response().asString();
		
		//Get Place
		
		String getRequest = given().queryParam("Key", "qaclick123").queryParam("place_id", Place)
		.when().get("/maps/api/place/get/json").then().assertThat().statusCode(200)
		.extract().response().asString();
		
		System.out.println(getRequest);
		

		JsonPath js1 = new JsonPath(getRequest);
		String extractedAddress = js1.getString("address");
		
		System.out.println(extractedAddress);
	//	Assert.assertEquals(Address, addressExtracted);
*/
		

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		given().queryParam("Key", "qaclick123").header("Content-TYpe", "application/json")
		.body(Body.AddPlace()).when().post("/maps/api/place/add/json").then().log().all().assertThat()
		.statusCode(200);
		
	}

}
