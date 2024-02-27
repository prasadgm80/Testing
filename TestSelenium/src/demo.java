import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\ChromedriverLatest\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
	/*	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\geckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		*/
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		
		//System.out.println(products);
		
		for(int i=0; i< products.size(); i++)
		{
			String[] name= products.get(i).getText().split("-");
			String formattedName = name[0].trim();			
			
			if(formattedName.contains("Brocolli"))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); 

			}
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
	}

}
