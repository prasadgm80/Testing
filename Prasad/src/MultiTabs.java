import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTabs {


		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();	        

		    driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

		String parent=driver.getWindowHandle();

		Set<String>s1=driver.getWindowHandles();

		Iterator<String> I1= s1.iterator();

		while(I1.hasNext())

		{

		String child_window=I1.next();

		if(!parent.equals(child_window))

		{

		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();

		}

		}

		driver.switchTo().window(parent);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rameshkorla@outlook.com");

		System.out.println(driver.switchTo().window(parent).getTitle());

		}

		

	}


