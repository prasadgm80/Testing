	package Automation.Cucumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\prasadgm80\\eclipse-workspace\\Cucumber\\src\\test\\java\\Automation\\Cucumber\\global.properties");
		prop.load(fis);
		
				
				
		String CurrentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\Chromedrivers\\July\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.get(prop.getProperty("url"));
		 return driver;
	}
}
