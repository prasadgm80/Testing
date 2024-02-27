package stepDefinition;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Automation.Cucumber.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonImplement {
	public WebDriver driver;
	
	@Given("Enter Amazon Websites with proper link")
	public void enter_amazon_websites_with_proper_link() throws IOException {
		driver = Base.getDriver();
		
	}
	
	@When("Search product {string}")
	public void search_product(String string1) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys(string1);
		//Thread.sleep(3000);
	    
	}
	
	
	@Then("Select product with name {string}")
	public void select_product_with_name(String string) {
		
		driver.findElement(By.id("nav-search-submit-button")).click();
	    
	}    

	@Then("Click on the product")
	public void click_on_the_product() {
	    
		driver.findElement(By.xpath("//div[@data-index = '9']/div/span/div/div/div/div/div/div[1]")).click();
	}
	
	@Then("add to cart")
	public void add_to_cart() {
/*		Set<String> Handles =driver.getWindowHandles();
		Iterator<String> it = Handles.iterator();
		driver.switchTo().window(it.next());
		//driver.switchTo().window(it.next());
*/		
	    driver.findElement(By.cssSelector("input[value* ='Cart']")).click();
	}
	
	@Then("go to cart")
	public void go_to_cart() {
	    driver.findElement(By.id("hlb-view-cart-announce")).click();
	}
}
