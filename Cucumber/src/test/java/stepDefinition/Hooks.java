package stepDefinition;

import Automation.Cucumber.Base;
import io.cucumber.java.After;


public class Hooks extends Base{
/*
	
	@Before("@Sanity")
	public void beforeValidation() {
		
		System.out.println("Case executed before sanity");
		
	}
	
	@After("@Sanity")
	public void afterValidation() {
		
		System.out.println("Case executed after sanity");
}
	
	*/
	
	@After("@Selenium")
	public void browserClose() {
		
		driver.close();
		
	}
}
