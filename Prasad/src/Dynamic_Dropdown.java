import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //gets to the website
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // clicks on To dropdown
		driver.findElement(By.xpath("//a[@value='BLR']")).click();                     //clicks on Bangalore
		System.out.println(driver.findElement(By.xpath("//a[@value='BLR']")).getText()); //prints name of city
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();               // clicks on Chennai
		System.out.println(driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).getText()); //prints name of city 
		
		/*	driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='MAA']")).click(); //parent child relationship xpath
	
		System.out.println(driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='MAA']")).getText()); */
	}


}
