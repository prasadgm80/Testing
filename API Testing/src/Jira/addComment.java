package Jira;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.io.File;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class addComment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//adding a random change

		RestAssured.baseURI = "http://localhost:8080/";
		
		//Login Session
		SessionFilter session = new SessionFilter();
		String res = given().header("Content-Type", "application/json").body("{\r\n"
				+ "    \"username\": \"prasadgm80\",\r\n"
				+ "    \"password\": \"prasad12345\"\r\n"
				+ "}").filter(session).when().post("/rest/auth/1/session").then().extract().
		response().asString();
		
		//Add Comment
		String message = "This is how I am learning RestAssured";
		String addComment= given().pathParam("Key", "10101").log().all().header("Content-Type", "application/json").
		body("{\r\n"
				+ "    \"body\": \""+message+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}").filter(session).when().
		post("rest/api/2/issue/{Key}/comment").then().assertThat().statusCode(201).
		extract().response().asString();
		
		//Storing comment id
		JsonPath js = new JsonPath(addComment);
		String CommentId = js.getString("id");
		
		//Add attachment
		given().header("X-Atlassian-Token", "no-check").pathParam("Key", "10101").
		header("Content-Type", "multipart/form-data").
		multiPart("file", new File("C:\\Users\\prasadgm80\\eclipse-workspace\\API Testing\\DefectAttachment.txt"))
		.filter(session).when().post("/rest/api/2/issue/{Key}/attachments")
		.then().log().all().assertThat().statusCode(200);
		
		//Get Issue
		String getComment = given().filter(session).pathParam("Key", "10101").queryParam("fields", "comment").
		log().all().get("/rest/api/2/issue/{Key}")
		.then().log().all().extract().response().asString();
		
		JsonPath js1 = new JsonPath(getComment);
		int commentsCount = js1.getInt("fields.comment.comments.size()");
		
		for (int i=0; i<commentsCount;i++)
		{
			String commentIdIssue = js1.get("fields.comment.comments["+i+"].id");  // comment id is saved here
			
			if(commentIdIssue.equalsIgnoreCase(CommentId))
			{
				String commentMessage = js1.get("fields.comment.comments["+i+"].body"); // comment is saved here
				
				Assert.assertEquals(message, commentMessage);
			}
		}
	}
}
