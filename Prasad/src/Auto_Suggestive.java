import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	/*
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
				option.click();
			
		}
		*/
		
		for(int i=0; i<options.size(); i++)
		{
			if(options.get(i).getText().equalsIgnoreCase("India"))
			{
				driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")).get(i).click();
			}
		}
	}

}
 