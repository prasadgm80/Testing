import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,650)");
		
		//printing number of columns
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display'] //th")).size());
		
		//printing number of rows
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display'] //tr")).size());
		
		//printing second row
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display'] //tr[3]")).getText());
		
	}

}
