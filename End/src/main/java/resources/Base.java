package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;
	public String url;
	public WebDriver BrowserInitiation() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\prasadgm80\\eclipse-workspace\\End\\src\\main\\java\\resources\\InvokingData.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		if(browserName.equals("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
			 
			}
		else if(browserName.equals("FireFox"))
		{
			//System properties for firefox and Webdriver for firefox
		}
		else if (browserName.equals("IE"))
		{
			//System properties for IE and Webdriver for IE
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	public void screenshots(String TestCaseName) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	String destinationFil = System.getProperty("user.dir")+"\\reports\\"+TestCaseName+"";
	FileUtils.copyFile(src, new File ("D:\\Selenium\\Selenium.png"));
	}
	
}
