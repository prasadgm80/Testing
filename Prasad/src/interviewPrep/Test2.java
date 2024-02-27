package interviewPrep;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ArrayList<String> cart = new ArrayList<String>();
		
		cart.add("Brocolli");
		cart.add("Beetroot");
		cart.add("Cucumber");
		
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<items.size(); i++)
		{
			int j=0;
			String[] formattedName = items.get(i).getText().split("-");
			String finalName = formattedName[0].trim();
			
			if(cart.contains(finalName))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==items.size())
				{
					break;
				}
			}
			
			
		}
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text() = 'PROCEED TO CHECKOUT']")).click();
		
		List<WebElement> values = driver.findElements(By.xpath("//table[@class='cartTable'] //td[4]"));
		int sum=0;
		//System.out.println(values);
		//Validating amount
		
	for(int k=1; k<=3; k++)
		{
		 System.out.println(values.get(k).getText());
		 sum = sum + Integer.parseInt(values.get(k).getText());
		}
		
		System.out.println(sum);
		
		int total = Integer.parseInt(driver.findElement(By.cssSelector("span[class ='totAmt']")).getText());
		
		Assert.assertEquals(sum, total);
		
		if(sum==total)
		{
			System.out.println("Vaues matched");
		}
			
		else
		{
			System.out.println("Vaues did not match");
		}
		
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		driver.findElement(By.xpath("//button[text() = 'Place Order']")).click();
		
		WebElement staticdropDown = driver.findElement(By.xpath("//div[@class='container']/div/div/div/div/select"));
		Select dropdown =new Select(staticdropDown);
		
		dropdown.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
}
	
	

}
