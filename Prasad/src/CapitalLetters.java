import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapitalLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.amazon.in/");
		Actions a= new Actions(driver);
		WebElement move= driver.findElement(By.id("nav-link-accountList"));
		
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		a.moveToElement(move).build().perform();
	}

}
