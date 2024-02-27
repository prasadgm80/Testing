import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;

public class ExternalFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		 String Response =given().header("Content-Type", "application/json").
	body(new String(Files.readAllBytes(Paths.get("C:\\Documents\\Exams\\API Testing\\Payload.json")))).
		when().post("Library/Addbook.php").then().assertThat().statusCode(200).
		extract().response().asString();
		
		 System.out.println(Response);

	}

}
