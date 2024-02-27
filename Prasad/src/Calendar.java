import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
			
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector("td[class*='day']"));
		int count = driver.findElements(By.cssSelector("td[class*='day']")).size();
		
		for(int i=0; i<count; i++)
		{
			String text = driver.findElements(By.cssSelector("td[class*='day']")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
				
			{
				driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();
				break;
			}
		}
		
	}

}
