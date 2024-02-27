import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//gets count of all links
		System.out.println(driver.findElements(By.tagName("a")).size()); //gets the count of links on webpage
		
		//gets count of all links in footer
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());  //gets count of links in footer
		
		//gets links in column discount coupon
		WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());  //gets count of links in column
		
		
		// opens each link under discount coupon in new tab 
		for (int i=1; i<column.findElements(By.tagName("a")).size(); i++)
		{
			String OpenNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		//	column.findElements(By.tagName("a")).get(i).click();  // opens link in same tab. 
			column.findElements(By.tagName("a")).get(i).sendKeys(OpenNewTab);
			Thread.sleep(5000L);
		}
		
		Set<String> windows =  driver.getWindowHandles();  // parent id and child id saved here
		Iterator<String> it= windows.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		
	}

}
