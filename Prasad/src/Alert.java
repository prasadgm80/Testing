import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Text = "Prasad";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(Text); // enters the test in box
		driver.findElement(By.id("alertbtn")).click(); // clicks on alert button
		System.out.println(driver.switchTo().alert().getText()); // prints message on pop up
		driver.switchTo().alert().accept(); // clicks on OK

		driver.findElement(By.id("name")).sendKeys(Text); // enters the test in box
		driver.findElement(By.id("confirmbtn")).click(); // clicks on Confirm button
		System.out.println(driver.switchTo().alert().getText()); // prints message on pop up
		driver.switchTo().alert().dismiss(); // clicks on Cancel

	}

}
