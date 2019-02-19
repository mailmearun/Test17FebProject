package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	
	@Given("^Launch Orange HRM Application$")
	public void launch_Orange_HRM_Application() throws Throwable {
	    System.out.println("Launch Orange HRM Application");
	}

	@When("^User enter credentials$")
	public void user_enter_credentials() throws Throwable {
		System.out.println("User enter credentials");
	}

	@Then("^User logged in successfully$")
	public void user_logged_in_successfully() throws Throwable {
		System.out.println("User logged in successfully");
	}

}
