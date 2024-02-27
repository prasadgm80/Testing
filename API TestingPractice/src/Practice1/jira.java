package Practice1;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.filter.session.SessionFilter;
import payload.Body;

public class jira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "http://localhost:8080/";
		
		SessionFilter session =  new SessionFilter();
		given().header("Content-Type", "application/json").body(Body.jiraRes())
		.filter(session).when().post("/rest/auth/1/session").then().log().all().extract().asString();
		
		
	}

}
