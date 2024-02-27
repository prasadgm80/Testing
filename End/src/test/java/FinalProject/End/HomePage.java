package FinalProject.End;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objects.loginPage;
import resources.Base;

public class HomePage extends Base{
	public WebDriver driver;
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void browserInvokation() throws IOException
	{
		driver = BrowserInitiation();
	}
	
	@Test(dataProvider = "getData")
	public void Test1(String username, String password) 
	{
		
		driver.get(prop.getProperty("url"));
		loginPage lp = new loginPage(driver);
		lp.getSignIn().click();  //clicks on Login icon on one page
		lp.getEmail().sendKeys(username);  //Enters email id
		lp.getPassword().sendKeys(password);  // Enters password
		lp.getLoginButton().click();  //clicks on login
		//driver.quit();
		Log.info("Test case is passed");
	}
	
	@AfterTest
	public void browserClosing()
	{
		driver.quit();
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		//1st square bracket is for no of rows. It also signifies no of data 
		//2nd square bracket is for no of columns. It also signifies no of data in single test
		Object[][] data = new Object[2][2];
		//1st row
		data[0][0] = "useer1@abc.com";
		data[0][1] = "123456";
		
		//2nd row
		data[1][0] = "user2@abc.com";
		data[1][1] = "123466789";
		
		return data;
		
		
	}

}
