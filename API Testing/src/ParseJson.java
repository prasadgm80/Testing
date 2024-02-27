import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import Payload.Body;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ParseJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

RestAssured.baseURI = "https://rahulshettyacademy.com";
		
             // Add place
          
		String Response = given().log().all().queryParam("Key", "qaclick123").header("Content-Type", "application/json")
		.body(Body.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println(Response);
		
		JsonPath js = new JsonPath(Response);
		String  placeId= js.getString("place_id");
		System.out.println(placeId);
		
		
		// Update place
		
		String newAddress = "Tiwat Galli, Gangakhed, India";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200)
		.body("msg", equalTo("Address successfully updated"));
		
		
		// Get place
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeId)
		.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract()
		.response().asString();
		
		JsonPath js1 = new JsonPath(getPlaceResponse);
		String extractedAddress = js1.getString("address");
		System.out.println(extractedAddress);
		
		Assert.assertEquals(newAddress, extractedAddress);
	
	}

	
	
}
