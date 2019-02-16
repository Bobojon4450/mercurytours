package com.mercurytours.step_definitions;

import static org.junit.Assert.assertEquals;

import com.mercurytours.pages.HomePage;
import com.mercurytours.utilities.BrowserUtilities;
import com.mercurytours.utilities.ConfigurationReader;
import com.mercurytours.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefs {
	HomePage hp = new HomePage();

	@Given("^the user on the newtour homepage$")
	public void the_user_on_the_newtour_homepage() throws Throwable {
		Driver.getInstance().get(ConfigurationReader.getProperty("URL"));
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		hp.userNameField.sendKeys(hp.userName);
		hp.passwordField.sendKeys(hp.password);
	}

	@Then("^user clicks sign-in button$")
	public void user_clicks_sign_in_button() throws Throwable {
	    hp.signInButton.click();
	    BrowserUtilities.waitForPageToLoad();
	}
	
	@Then("^verify Find a Flight page title$")
	public void verify_Find_a_Flight_page_title() throws Throwable {
	   assertEquals(hp.expectedTitle, Driver.getInstance().getTitle());
	}

}
