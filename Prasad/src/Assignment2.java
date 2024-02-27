import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click(); // clicks on calendar
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click(); // chooses
																												// default
																												// date

		WebElement StaticDropdownAdults = driver.findElement(By.id("Adults")); // creates webElement for Adults dropdown
		Select Dropdown = new Select(StaticDropdownAdults);
		Dropdown.selectByIndex(3);
		System.out.println(Dropdown.getFirstSelectedOption().getText());

		WebElement StaticDropdownChildren = driver.findElement(By.id("Childrens")); // creates webElement for Childrens
																					// dropdown
		Select Dropdown1 = new Select(StaticDropdownChildren);
		Dropdown1.selectByVisibleText("5");
		System.out.println(Dropdown1.getFirstSelectedOption().getText());

		WebElement StaticDropdownInfants = driver.findElement(By.id("Infants")); //// creates webElement for Infants
																					//// dropdown
		Select Dropdown2 = new Select(StaticDropdownInfants);
		Dropdown2.selectByValue("1");
		System.out.println(Dropdown2.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("#MoreOptionsLink")).click(); // clicks on More options hyperlink
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo"); // inserts text Indigo

		driver.findElement(By.id("SearchBtn")).click(); // clicks on search
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText()); // Prints error message

	}

}
