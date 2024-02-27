package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Automation.Cucumber.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumImplement {
	
	public WebDriver driver;
	
	@Given("^User is navigated to website$")
    public void user_is_navigated_to_website() throws Throwable {
		
		driver = Base.getDriver();
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}
	@When("^User searched for vegetable \"([^\"]*)\"$")
    public void user_searched_for_vegetable_something(String strArg1) throws Throwable {
	    
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys(strArg1);
	}
	@Then("^Results \"([^\"]*)\" are displayed$")
    public void results_something_are_displayed(String strArg1) throws Throwable {
		
		//Validating by Assertion 
	//	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string));
		
		//Validating with printing 
	  String veggie = driver.findElement(By.cssSelector("h4.product-name")).getText();
	  
	  if(veggie.contains(strArg1))
	  {
		  System.out.println("The case is passed");
	  }
	  else {
		  System.out.println("The case is failed");
	  }

}
	 @And("^item is added to cart$")
	    public void item_is_added_to_cart() throws Throwable {
	    	
	    	driver.findElement(By.cssSelector("a[class='increment']")).click();
	    	driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
	 }
	
	@And("^proceed to checkout$")
    public void proceed_to_checkout() throws Throwable {
		
		driver.findElement(By.xpath("//img[@alt = 'Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
       
    }

	@Then("^verify \"([^\"]*)\" is populated$")
    public void verify_something_is_populated(String strArg1) throws Throwable {
        String cartItems  =driver.findElement(By.cssSelector("p[class= 'product-name']")).getText();
        System.out.println(cartItems);
        
        if(cartItems.contains(strArg1))
        {
        	System.out.println("The case is passed");
        }
        else
        {
        	System.out.println("The case is failed");
        }
    }
    }


