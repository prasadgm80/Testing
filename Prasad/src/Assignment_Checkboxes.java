import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());   //confirms if clicked on checkbox
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());   //assertion
			driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();                            //clicks on checkbox
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());    //assertion
			driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();                           //unchecks checkbox
			System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());  //confirms if clicked on checkbox
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());  //assertion
			System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());               //gives number of checkboxes
            Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 3);
	}

}
