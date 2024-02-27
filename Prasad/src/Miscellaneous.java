import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		
		driver.manage().window().maximize();  // maximizes window
		driver.manage().deleteAllCookies();   //deletes all cookies
		driver.manage().deleteCookieNamed("Name of Cookie");  //deletes cookie that you want to delete
		//driver.manage().addCookie("Name of Cookie");  //adds cookie whose name you know
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("D:\\Selenium\\Selenium.png"));
	}

}
