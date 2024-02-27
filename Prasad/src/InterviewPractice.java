import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class InterviewPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@value = 'radio2']")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@class = 'left-align']/fieldset/label[1]")));
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		Thread.sleep(5000);
		List<WebElement> countries = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		
		for(WebElement country: countries)
		{
			if (country.getText().equalsIgnoreCase("India"))
			
				country.click();
				System.out.println();
			}
			
		
		String name = driver.findElement(By.xpath("//label[@for = 'bmw']")).getText();
		System.out.println(name);
		driver.findElement(By.id("checkBoxOption1")).click();
		
		WebElement StaticDropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']")); // Passing the xpath of dropdown
		Select dropdown= new Select(StaticDropdown);
		
		dropdown.selectByVisibleText(name);

	}

}
