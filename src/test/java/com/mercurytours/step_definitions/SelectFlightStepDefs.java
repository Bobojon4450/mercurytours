package com.mercurytours.step_definitions;

import com.mercurytours.pages.SelectFlightPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SelectFlightStepDefs {

	SelectFlightPage sfp = new SelectFlightPage();
	
	@Given("^User selects departing Unified Airlines$")
	public void user_selects_departing_Unified_Airlines() throws Throwable {
	    sfp.departFlight363.click();
	}

	@Then("^User selects return Unified Airlines$")
	public void user_selects_return_Unified_Airlines() throws Throwable {
	    sfp.reurnFlight363.click();
	}

	@Then("^user clicks continue button$")
	public void user_clicks_continue_button() throws Throwable {
	    sfp.continueFlight363.click();
	}

}
