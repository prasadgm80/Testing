import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//clicking check box
		driver.findElement(By.cssSelector("label[for='benz'] input")).click();
        
		//Capturing checbox text by defining variable
		String Checkbox= (driver.findElement(By.cssSelector("label[for='benz']")).getText());
		System.out.println(Checkbox);
		
		//choosing dropdown option
		WebElement StaticDropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']")); // Passing the xpath of dropdown
		Select dropdown= new Select(StaticDropdown);  // Creating an object dropdown
		dropdown.selectByVisibleText(Checkbox);
		
		//Entering checkbox name in alert
		driver.findElement(By.id("name")).sendKeys(Checkbox);
		driver.findElement(By.id("alertbtn")).click();
		
		
		//Confirms Alert message contains checkbox option text
		String Alert = (driver.switchTo().alert().getText());
		System.out.println(Alert);
		
		if(Alert.contains(Checkbox))
		{
			System.out.println("True");
		}
		
		else
		{
			System.out.println("False");
		}
		
	}
	

}
