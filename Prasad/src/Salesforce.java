import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //X path used
		driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());//prints text
		//driver.quit();
	
	
}

}
