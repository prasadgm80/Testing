package serial;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class specBuilder {

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
		
		RequestSpecification req= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addQueryParam("key", "qaclick123").build();
		
		ResponseSpecification resspec = new ResponseSpecBuilder().expectStatusCode(200).build();
 		
		RequestSpecification res = given().spec(req)
		.body(r);
		
		
	Response response1 =	res.when().post("/maps/api/place/add/json").then().
			spec(resspec)
		.extract().response();
		
		String response = response1.asString();
		System.out.println(response1);
		System.out.println("5");

	}

}
