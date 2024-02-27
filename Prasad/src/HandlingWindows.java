//import java.util.Iterator;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows =  driver.getWindowHandles();  // parent id and child id saved here
		Iterator<String> it= windows.iterator();
		String parentId = it.next();
		String childId = it.next();	
		driver.switchTo().window(childId);
		
		//Thread.sleep(5000L);
		
		WebElement text = driver.findElement(By.xpath("//p[@class='im-para red']/strong/a"));
		System.out.println(text.getText());
		String textExtracted = text.getText();
		//System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());  // captures text 
		//String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentId);
		Thread.sleep(2000L);

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(textExtracted); 
		
	}

}
