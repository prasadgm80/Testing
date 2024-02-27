import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
			
			
			
			String vegetable = null;
			List<String> veggies = new ArrayList<String>();
			veggies.add("Brocolli");
			veggies.add("Cauliflower");
			veggies.add("Bhendi");
			
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File ("C:\\Users\\Aditi\\Desktop\\Notes\\Selenium\\selenium.png"));
			
			
			List<WebElement> veggiNames = driver.findElements(By.xpath("//h4[@class='product-name']"));
			
			for(int i=0; i<veggiNames.size(); i++)
				
			{
				String names = veggiNames.get(i).getText();
				String[]name = names.split("-");
				 vegetable = name[0].trim();
				System.out.println(vegetable);
			
			if(veggies.contains(vegetable))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			}
			}
			
			driver.quit();
			
			
			
		
	}
	}

