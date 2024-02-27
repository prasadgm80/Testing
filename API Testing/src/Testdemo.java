import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.apache.http.util.Asserts;
import org.testng.Assert;

import Payload.Body;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
RestAssured.baseURI = "https://reqres.in";
		
		//RestAssured.useRelaxedHTTPSValidation();
		
		//End to end API Test
		String nameInput = "Prasad";
		String jobInput = "APILearning";

		
	String output = given().log().all()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \""+nameInput+"\",\r\n"
						+ "    \"job\": \""+jobInput+"\"\r\n"
						+ "}\r\n"
						+ "").when().post("/api/users/2")
				.then().assertThat().statusCode(201).extract().response()
				.asString();
	 
		//System.out.println(output);
		
		JsonPath js = new JsonPath(output);
		String nameExtract = js.get("name");
		String jobExtract = js.get("job");
		
		Assert.assertEquals(nameExtract, nameInput);
		Assert.assertEquals(jobExtract, jobInput);

	}

}
