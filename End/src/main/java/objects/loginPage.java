package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

public WebDriver driver;
	
	
	public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	By signin = By.cssSelector("a[class = 'theme-btn register-btn']");
	By email = By.cssSelector("input[type = 'email']");
	By password = By.cssSelector("input[type = 'password']");
	By loginButton = By.cssSelector("input[type = 'submit']");

	public WebElement getSignIn()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLoginButton()
	{
		return driver.findElement(loginButton);
	}
}
