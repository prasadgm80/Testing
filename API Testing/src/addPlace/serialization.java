package addPlace;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		List<String> dataValues = new ArrayList<String>();
		
		dataDrive data = new dataDrive();
		
		ArrayList dataValue = data.getData("Test1");
		
		for(int i=0; i<dataValue.size(); i++)
		{
			dataValues.add(dataValue.get(i).toString());
		}
			
		//Add Place Test Case
		List<String> types = new ArrayList<String>();
		
		types.add(dataValues.get(7));
		types.add("Shop");
		
		addPlaceAPI add = new addPlaceAPI();
		location loc = new location();
		
		
		loc.setLat(dataValues.get(1));
		loc.setLng(dataValues.get(2));
		
		add.setAccuracy(dataValues.get(3));
		add.setName(dataValues.get(4));
		add.setPhone_number(dataValues.get(5));
		add.setAdddress(dataValues.get(6));
		add.setTypes(types);
		add.setWebsite(dataValues.get(8));
		add.setLanguage(dataValues.get(9));
		add.setLocation(loc);
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		response output =  given().log().all().header("Content-Type","application/json").
				body(add).queryParam("key", "qaclick123").when().
		 post("/maps/api/place/add/json").as(response.class);
		
		String placeId = output.getPlace_id();
		
		Assert.assertNotEquals(output.getPlace_id(), "null");
		Assert.assertNotEquals(output.getId(), "null");
		Assert.assertNotEquals(output.getReference(), "null");
		Assert.assertNotEquals(output.getScope(), "null");
		Assert.assertNotEquals(output.getStatus(), "null");
		
		//Get Place Test Case
		
		response response = given().log().all().header("Content-Type","application/json").
				queryParam("key", "qaclick123").queryParam("place_id", placeId).when().
		 get("/maps/api/place/get/json").as(response.class);
		
		
		System.out.println(response.getTypes());
		System.out.println(response.getPhone_number());
		
		//Update Place Test Case
		
		updatePlace update = new updatePlace();
		
		update.setAddress(dataValues.get(11));
		update.setKey(dataValues.get(10));
		update.setPlace_id(placeId);
		
		response responseUpdatePlace = given().log().all().header("Content-Type","application/json").
				body(update).queryParam("key", "qaclick123").queryParam("place_id", placeId).
				when().put("/maps/api/place/update/json").as(response.class);
		
		System.out.println(responseUpdatePlace.getMsg());
		
		
		//Delete Place Test Case
		
		deletePlace delete = new deletePlace();
		
		delete.setPlace_id(placeId);
		
		
		response deletePlace = given().log().all().header("Content-Type","application/json").
				body(delete).when().post("/maps/api/place/delete/json").as(response.class);
		
		System.out.println(responseUpdatePlace.getStatus());
		
		
		
			
		
		
	}

}
