import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']"))); //switches to frame using webelement
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		
		//driver.findElement(By.id("draggable")).click();  //clicks on the drag me to the target
		
		Actions a= new Actions(driver);
		
		WebElement Source= driver.findElement(By.id("draggable"));
		WebElement Target= driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, Target).build().perform();
		//driver.switchTo().defaultContent();
		
		
	}

}
