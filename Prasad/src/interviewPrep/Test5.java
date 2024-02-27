package interviewPrep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> radios= driver.findElements(By.xpath("//div[@id='radio-btn-example']/fieldset/label"));
		
		for(WebElement radio:radios)
		{
			if(radio.getText().equalsIgnoreCase("Radio1"))
			{
				radio.click();
			}
		}
		
		
		//Clicking checkbox
		
		driver.findElement(By.id("checkBoxOption3")).click();
		
		String checkbox = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
		
		System.out.println(checkbox);
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select dd = new Select(dropdown);
		
		dd.selectByVisibleText(checkbox);
		
		//Enter name
		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(checkbox);
		
		driver.findElement(By.id("confirmbtn")).click();
		
		String Text = driver.switchTo().alert().getText();
		
		if(Text.contains(checkbox))
		{
			System.out.println("Test case is passed");
		}
		
		else
		{
			System.out.println("Test case is Failed");
		}
		
		driver.switchTo().alert().accept();
		
		//Switching frames
		
		WebElement Frame =driver.findElement(By.id("courses-iframe"));
		
		driver.switchTo().frame(Frame);
		
		driver.findElement(By.cssSelector("a[class='theme-btn register-btn']")).click();
	}

}
