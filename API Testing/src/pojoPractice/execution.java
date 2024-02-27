package pojoPractice;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import pojo.response;

public class execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		payload pay = new payload();
		
		pay.setJob("Prasad");
		pay.setName("APiLearning");
		
		RestAssured.baseURI = "https://reqres.in";
		
		payload output = given().log().all()
				.header("Content-Type","application/json")
				.body(pay).when().post("/api/users/2").as(payload.class);
		
		//String s = pay.getJob();
		
		//System.out.println(s);
		//System.out.println(pay.getName());
				
		
		System.out.println(output);

	}

}
