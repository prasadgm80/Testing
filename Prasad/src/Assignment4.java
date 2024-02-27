import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	

		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> windows =  driver.getWindowHandles();  // parent id and child id saved here
		Iterator<String> it= windows.iterator();
		String parentId = it.next();
		String childId = it.next();	
		driver.switchTo().window(it.next());
		
		System.out.println(driver.findElement(By.cssSelector("div[class= 'example']")).getText());
		 driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
	}

}
