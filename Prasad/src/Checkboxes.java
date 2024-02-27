import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());  // confirms if clicked on checkbox
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();                          //click on checkbox
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); //confirms if clicked on checkbox
		
		// number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		

	}

}
