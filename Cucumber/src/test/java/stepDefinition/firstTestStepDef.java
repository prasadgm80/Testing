package stepDefinition;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstTestStepDef {
	
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() {
		//you need to write your automation code here
		System.out.println("Given block is executed");
	}
	
	@When("User logged in with username {string} and password {string}")
	public void user_logged_in_with_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(string2);
    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("Then block is executed");
	    }

	    @When("User sign up with following detils")
	    public void user_sign_up_with_following_detils(io.cucumber.datatable.DataTable dataTable) {
	        // Write code here that turns the phrase above into concrete actions
	    	List<List<String>> obj = dataTable.asLists();
	    	System.out.println(obj.get(0).get(0));
	    	System.out.println(obj.get(0).get(1));
	    	System.out.println(obj.get(0).get(2));
	    	System.out.println(obj.get(0).get(3));
	    	System.out.println(obj.get(0).get(4));
	    }
	    
	    
	    @And("cards are displayed {string}")
	    public void cards_are_displayed(String string) {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println(string);
	    }

	    @When("^User logged in to application with username (.+) and password (.+)$")
	    public void user_logged_in_to_application_with_username_and_password(String username, String password) throws Throwable {
	        
	    System.out.println(username);
	    	System.out.println(password);
}
	    @Given("validate the browser")
	    public void validate_the_browser() {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("Browser Validated");
	    }
	    @When("Browser is triggered")
	    public void browser_is_triggered() {
	        // Write code here that turns the phrase above into concrete actions
	    	 System.out.println("Browser triggered");
	    }
	    @Then("Check if browser is started")
	    public void check_if_browser_is_started() {
	        // Write code here that turns the phrase above into concrete actions
	    	 System.out.println("Browser started");
	    }
}
