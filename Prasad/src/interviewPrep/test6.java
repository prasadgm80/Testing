package interviewPrep;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String[] Items = {"Brocolli", "Cucumber"};
		int j=0;
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products =   driver.findElements(By.cssSelector("//h4[class = 'product-name']"));
		
		for(int i=0; i<products.size(); i++)
		{
			String prod = products.get(i).getText().split("-")[0];
			String formattedName =  prod.trim();
			
			List ItesmNeeded =  Arrays.asList(Items);
			
			if(ItesmNeeded.contains(formattedName))
			{
			driver.findElement(By.xpath("//div[@class = 'product-action'] //button[text() = 'ADD TO CART']")).click();
			
			j++;
			
			if(j== Items.length )
			{
				break;
			}
		}
			
	}
		
	}

}
