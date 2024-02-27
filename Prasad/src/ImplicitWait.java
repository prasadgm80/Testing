import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));  //implicit wait
			
			int j=0;
			WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));    //driver object for explicit wait
			WebElement promo = driver.findElement(By.cssSelector("span[class='promoInfo']"));
			w.until(d ->promo.isDisplayed());
			//w.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(promo, null)))
			
			String[] ItemsNeeded = {"Cucumber", "Brocolli", "Carrot"};
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			addItems(driver, ItemsNeeded);
			
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();        //clicks on cart symbol
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();  //clicks on proceed to checkout
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));   //explicit wait
			driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");  //enters promo code
			driver.findElement(By.cssSelector("button[class='promoBtn']")).click();                  //clicks on Apply promo code
			
			
			
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));  //explicit wait
			w.until(d ->promo.isDisplayed());
			
			
			System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());  //prints text message
			
			
			
			
			

	}
	
	public static void addItems(WebDriver driver, String[] ItemsNeeded)
	{
	int j=0;
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

