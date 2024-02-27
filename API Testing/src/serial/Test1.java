package serial;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.*;
import io.restassured.response.Response;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		response r = new response();
		
		r.setAccuracy(50);
		r.setAddress("29, side layout, cohen 09");
		r.setLanguage("French-IN");
		r.setName("Frontline house");
		r.setPhone_number("(+91) 983 893 3937");
		r.setWebsite("http://google.com");
		
		List<String> values = new ArrayList<String>();
		values.add("shoe park");
		values.add("shop");
		r.setTypes(values);
		
		location l = new location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		r.setLoction(l);
		
 		
		Response res = given().queryParam("key", "qaclick123")
		.body(r)
		.when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
		.extract().response();
		
		String response = res.asString();
		System.out.println(response);
		
	}

}
