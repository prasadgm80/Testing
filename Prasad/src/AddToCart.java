import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			int j=0;
			
			String[] ItemsNeeded = {"Cucumber", "Brocolli", "Carrot"};
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name")); //general css for product name
			
			for(int i=0;i<products.size();i++)
			{	
				String[] name= products.get(i).getText().split("-");
				String formattedName = name[0].trim();
				
			//	if(name.contains("Cucumber"))
				List ItemsNeededList = Arrays.asList(ItemsNeeded);
				
				if(ItemsNeededList.contains(formattedName))
				{
					//click on add cart
					j++;
					
					//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); // text based xpath
					
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); //parent child x path

					

					if(j==ItemsNeeded.length)
					{
						break;
					}
				
			}
				
			}
	}
}

