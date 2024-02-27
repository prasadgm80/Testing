

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenUrl {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	/*	String url = driver.findElement(By.cssSelector("a[href*= 'broken']")).getAttribute("href");  //for verifying single link
		
		
		
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int response = conn.getResponseCode();
		System.out.println(response);  */
		
		//In order to check all links in web page use below code:
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class= 'gf-li'] a"));
		SoftAssert a =  new SoftAssert();
		
		for (WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int response = conn.getResponseCode();
			System.out.println(link + "Response Code is " +response);
			a.assertTrue(response<400, link.getText() + " Link is broken " + response);
		
		/*	if(response<400)
			{
				System.out.println(link.getText() + " Link is not broken " + response);
				
			}	
			
			else
			{
				System.out.println(link.getText() + " Link is broken " + response);
			}*/
		}	
		
		//a.assertAll();
	} 
}
