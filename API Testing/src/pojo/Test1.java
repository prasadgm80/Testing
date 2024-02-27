package pojo;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Selenium to get query parameter code
/*		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\ChromedriverLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");

		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("prasadgm80@gmail.com");
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.cssSelector("span[class* = 'VfPpkd']")).click();
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Vitmechu33@");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.cssSelector("span[class* = 'VfPpkd']")).click();
		
		
		//String url = driver.getCurrentUrl(); 
		 *                     
		 */
		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AfJohXmqaYpFn-JDJ8XEO0zIe3q2PnCRtB7MFsScj2gwDtkU7IOPecY1_-53zMf8PNS7oA&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent";
		
		String partialcode = url.split("code=")[1];
		String code = partialcode.split("&")[0];
		
		//Getting access token request
		
		String  getAuthCode=given().urlEncodingEnabled(false)
		.queryParams("code", code)
		.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.queryParams("grant_type", "authorization_code").when()
		.post("https://accounts.google.com/o/oauth2/v2/auth").then().extract().response()
		.asString();
		
		System.out.println(getAuthCode);
		JsonPath js = new JsonPath(getAuthCode);
		String accessToken= js.getString("access_token");
		
		response rs = given().queryParam("access_token", accessToken).
				      expect().defaultParser(Parser.JSON).when()
		              .get("https://rahulshettyacademy.com/getCourse.php").as(response.class);
		
		rs.getCourses();
		rs.getExpertise();
		rs.getInstructor();
		rs.getLinkedIn();
		rs.getServices();
		rs.getUrl();
		
		//getting price of second course in Api with index
		rs.getCourses().getApi().get(1).getPrice();
		
		
		//getting price of second course in Api with name
		List<Api> courseList = rs.getCourses().getApi();
		
		for(int i=0; i<courseList.size(); i++)
		{
			if(courseList.get(i).getCourseTitle().equalsIgnoreCase("SoapUI WebServices"))
			{
				System.out.println(courseList.get(i).getPrice());
			}
		}
		
		//Compare course names
		String[] ActualList = {"Selenium", "Protractor", "Cypress"};
		List<String> actualListArray = Arrays.asList(ActualList);
		
		List<WebAutomation> automation = rs.getCourses().getWebAutomation();
		ArrayList<String> Expected = new ArrayList<String>();
		
		for(int i=0; i<automation.size();i++)
		{
			Expected.add(automation.get(i).getCourseTitle());
		}
		
		Assert.assertEquals(actualListArray, Expected);
		
		
		
		//System.out.println(response1);
	}

}
