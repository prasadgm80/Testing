import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import Payload.Body;
import io.restassured.RestAssured;

public class TestAPI {

public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		RestAssured.useRelaxedHTTPSValidation();
		
		//End to end API Test
		
	String output = given().log().all().queryParam("key", "qaclick123")
				.header("Content-Type","application/json")
				.body(Body.AddPlace()).when().post("/maps/api/place/add/json")
				.then().assertThat().statusCode(200).header("Server", "Apache/2.4.18 (Ubuntu)").
				body("scope", equalTo("APP")).extract().response()
				.asString();
	 
		System.out.println(output);
	
		
		
	}
	
}
