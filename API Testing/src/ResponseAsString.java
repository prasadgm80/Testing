import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Payload.Body;



public class ResponseAsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We have called the Body from class Body.java, The method is Addplace().
		// So Body.AddPlace() will return entire Body.
		// we are storing it in a string
		
	RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String Response = given().log().all().queryParam("Key", "qaclick123").header("Content-Type", "application/json")
		.body(Body.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println(Response);
		
	}

}
