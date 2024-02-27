import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Enabled_Or_Disabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //gets to the website
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();  //click on Round Trip checkbox
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());  //checks whether enabled
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
	
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
		{	
			System.out.println("It is Enabled");
			Assert.assertTrue(true);
			}
		else
		{
			System.out.println("It is disabled");
			Assert.assertTrue(false);
		}
	}

}
