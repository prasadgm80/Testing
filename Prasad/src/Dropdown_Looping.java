import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click(); //clicks on search box
		
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());// prints no of adults before any click
		/* int i = 1;
		while(i<5)
			{	
		
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();  // clicks on + icon to add adults
		i++;
		
			}*/
		
		for(int i=1; i<5;i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();  // clicks on + icon to add adults
		}	
		driver.findElement(By.id("btnclosepaxoption")).click();  //clicks Done Button
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText()); //prints no of adults after 5 clicks
		
	}
	
	

}
