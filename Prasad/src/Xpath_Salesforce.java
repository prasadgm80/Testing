import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/* driver.get("https://salesforce.com");
		driver.findElement(By.xpath("//a[@href='https://login.salesforce.com/?locale=in']")).click();
		driver.findElement(By.xpath("//span[@class='header-text head-text header-text-line']")).click();

		
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("MynameisX");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("12345");//customised css path
		driver.findElement(By.cssSelector("button[class*='selected']")).click(); //regular expression
		*/
		
	/*	driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Selenium"); //parent-child traversing
		
		driver.findElement(By.xpath("//div[@jsname='vdLsw']/following-sibling::input")).sendKeys("selenium"); //sibling traversing
		driver.findElement(By.xpath("//input[@aria-label='Google Search']")).click();
		
		*/
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[text()='Forgotten password?']")).click(); //x path using text
			
			
			
}

}
