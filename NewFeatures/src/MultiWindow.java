
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Getting to practice 3 page
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Creating a new tab
		driver.switchTo().newWindow(WindowType.TAB	);
		
		Set<String> Handles = driver.getWindowHandles();
		Iterator<String> it = Handles.iterator();
		
		String ParentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(it.next());
		driver.get("https://rahulshettyacademy.com");
		String FirstCourse = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();
		
		//driver.close();
		driver.switchTo().window(ChildId);
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.cssSelector("[name = 'name']"));
		name.sendKeys(FirstCourse);
		
		//Taking screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		//	FileUtils.copyFile(file, new File("logo.png"));
		
		//Getting Height and Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		

	}

}
