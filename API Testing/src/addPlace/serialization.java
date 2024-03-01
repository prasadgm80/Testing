package addPlace;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> types = new ArrayList<String>();
		
		types.add("shoe Park");
		types.add("Shop");
		
		addPlaceAPI add = new addPlaceAPI();
		location loc = new location();
		
		
		loc.setLat("38.383494");
		loc.setLng("33.427362");
		
		add.setAccuracy("50");
		add.setName("Motha Wada");
		add.setPhone_number("9412345678");
		add.setAdddress("Tiwat Galli");
		add.setTypes(types);
		add.setWebsite("https://google.com");
		add.setLanguage("English");
		add.setLocation(loc);
		
		System.out.println(add);
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		response output =  given().log().all().header("Content-Type","application/json").body(add).
				queryParam("key", "qaclick123").when().
		 post("/maps/api/place/add/json").as(response.class);
		
		String placeId = output.getPlace_id();
		
		System.out.println(output.getPlace_id());
		System.out.println(output
				.getId());
		System.out.println(output.getReference());
		System.out.println(output.getScope());
		System.out.println(output.getStatus());
		
		Assert.assertNotEquals(output.getPlace_id(), "null");
		Assert.assertNotEquals(output.getId(), "null");
		Assert.assertNotEquals(output.getReference(), "null");
		Assert.assertNotEquals(output.getScope(), "null");
		Assert.assertNotEquals(output.getStatus(), "null");
		
		getPlace response = given().log().all().header("Content-Type","application/json").
				queryParam("key", "qaclick123").queryParam("place_id", placeId).when().
		 post("/maps/api/place/get/json").as(getPlace.class);
		
		
		System.out.println(response.getTypes());
		System.out.println(response.getPhone_number());
		
		
		
		 

	}

}
