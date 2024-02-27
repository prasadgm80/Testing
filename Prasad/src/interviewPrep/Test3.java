package interviewPrep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebDriverWait w= new WebDriverWait(driver, 5);
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		//Thread.sleep(4000);
		List<WebElement> countries =driver.findElements(By.cssSelector("li[ lass='ui-menu-item']"));
		
		for(WebElement country: countries)
		{
			if(country.getText().equalsIgnoreCase("Indonesia"))
			{
				country.click();
			}
		}
		// w.until(ExpectedConditions.visibilityOfAllElementsLocated(null))
		 
	}

}
