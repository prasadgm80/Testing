import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortTableWithStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column
		//capture all web elements in list
		//capture the text and store it in list - String 1
		//sort the names  - String 2
		//compare two strings
		
		
		//click on column
		driver.findElement(By.xpath("//tr/th[3]")).click();
		
		//capture all web elements in list
		List<WebElement> cart = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture the text and store it in list - String 1
		List<String> originalcart =cart.stream().map(s-> s.getText()).collect(Collectors.toList());
		
		//sort the names  - String 2
		List<String> sortedcart =cart.stream().map(s-> s.getText()).sorted().collect(Collectors.toList());
	//	List<String> sortedcart =originalcart.stream().sorted().collect(Collectors.toList());  // we can create sorted list in this way as well
		
		//compare two strings
		//Assert.assertTrue(originalcart.equals(sortedcart));
		//System.out.println(sortedcart);
		
		
		//printing value of selected vegetable
		List<String> price;
		
		do {
			List<WebElement> cartloop = driver.findElements(By.xpath("//tr/td[1]"));
		 price = cartloop.stream().filter(s-> s.getText().contains("Rice")).
				map(s-> getVeggiePrice(s)).collect(Collectors.toList());
		
		// System.out.println(price);
		 
		price.forEach(a-> System.out.println(a));
		
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		} 
		while(price.size()<1);
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
