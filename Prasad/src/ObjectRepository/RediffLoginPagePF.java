package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
	public RediffLoginPagePF(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	
/*	By login = By.xpath("//input[@name = 'login']");
	By password = By.name("passwd");
	By go = By.cssSelector("input[name = 'proceed']");
*/
	
	@FindBy(xpath = "//input[@name = 'login']")
	WebElement login;
	
	@FindBy(name = "passwd")
	WebElement password;
	
	@FindBy(xpath = "input[@name = 'proceed']")
	WebElement go;
	
	
	public WebElement emailid()
	{
		return login;
	}

	public WebElement password()
	{
		return password;
	}
	
	public WebElement proceed()
	{
		return go;
	}
}
