package interviewPrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String name = "Prasad";
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			
			driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys(name);
			driver.findElement(By.cssSelector("input[name ='email']")).sendKeys("abc@gmail.com");
			
			driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("abcd");
			
			driver.findElement(By.id("exampleCheck1")).click();
			
			WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
			Select dropdown = new Select(staticDropdown);
			
			dropdown.selectByVisibleText("Male");
			
			driver.findElement(By.id("inlineRadio2")).click();
			
			driver.findElement(By.cssSelector("//input[class='form-control']")).click();
	}

}
