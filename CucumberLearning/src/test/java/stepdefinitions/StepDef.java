package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	@Given("^User On webapp$")
	public void user_On_webapp() throws Throwable {
		System.out.print("Webapp is open");
	}
	
	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) {
		System.out.print("Enter the username and password in the fields");
	}
	
	@When("^I submit login page$")
	public void i_submit_login_page() throws Throwable {
		System.out.print("Clicked on submit button");
	}
	
	@Then("^I redirect to userhome page$")
	public void i_redirect_to_userhome_page() throws Throwable {
		System.out.print("Successfully logged In");
	}
}