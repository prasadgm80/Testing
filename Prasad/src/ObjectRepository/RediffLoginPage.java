package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	public RediffLoginPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	WebDriver driver;
	
	By login = By.xpath("//input[@name = 'login']");
	By password = By.name("passwd");
	By go = By.cssSelector("input[name = 'proceed']");
	
	public WebElement emailid()
	{
		return driver.findElement(login);
		 
	}

	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement proceed()
	{
		return driver.findElement(go);
	}
}
