import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		
	//String characters = driver.findElement(By.xpath("//p[@class='a-last']")).getText();
		String url  = driver.getTitle();
		
		
		
		
		if(!(url.contains("Online Shopping")))
		{
			driver.findElement(By.xpath("//a[@onclick='window.location.reload()']")).click();
		}
		
		else
		{
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
		
		driver.findElement(By.xpath("//div[@class='nav-right']")).click();
		
		List<WebElement>options = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a"));
		
		System.out.println(options);
		
		for(int i=0; i<options.size(); i++)
		{
			WebElement Option = options.get(i);
			String optionValue= Option.getText();
			System.out.println(optionValue);
			
			if(optionValue.contains("Apple iPhone 13 (128GB) - Starlight"))
			{
				Option.click();
				break;
				
			}
		}
		//comment
		
		Set<String> windows =  driver.getWindowHandles();  // parent id and child id saved here
		Iterator<String> it= windows.iterator();
		//String childId = it.next();
		//String parentId = it.next();	
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//span[@class='a-button-inner']/input")).click();
			
		}
	}

}
