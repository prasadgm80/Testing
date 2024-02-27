import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// drop down with select tag
		
		WebElement StaticDropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")); // Passing the xpath of dropdown
		Select dropdown= new Select(StaticDropdown);  // Creating an object dropdown
		dropdown.selectByIndex(1);                                          //select by index method
		System.out.println(dropdown.getFirstSelectedOption().getText());  
		
		dropdown.selectByVisibleText("AED");                              //select by visible text
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("USD");                                    //Select by Value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.quit();
	}

	
}
