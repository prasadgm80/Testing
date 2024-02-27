import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Below() method
		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
		String data =driver.findElement(withTagName("label").above(nameEditBox)).getText();
		System.out.println(data);
		
		//Above() method
		WebElement Edit1 =driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(withTagName("input").below(Edit1)).sendKeys("02/12/2020");
		
		//toLeftof() method
		WebElement checkbox = driver.findElement(By.xpath("//label[text() ='Check me out if you Love IceCreams!' ]"));
		driver.findElement(withTagName("input").toLeftOf(checkbox)).click();
		
		//toRightOf() method
		WebElement radio = driver.findElement(By.xpath("//label[@for = 'exampleFormControlRadio1')]"));
		driver.findElement(withTagName("div").toRightOf(radio)).click();
		
		
		
		
	}

}
