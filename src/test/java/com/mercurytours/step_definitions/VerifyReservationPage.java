package com.mercurytours.step_definitions;

import com.mercurytours.pages.ReservationPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyReservationPage {

	ReservationPage rp = new ReservationPage();
	
	@When("^user verifies Round Trip is checked$")
	public void user_verifies_Round_Trip_is_checked() throws Throwable {
	    rp.verifyRoundTripIsChecked();
	}

	@When("^user verifies One way unchecked$")
	public void user_verifies_One_way_unchecked() throws Throwable {
	    rp.verifyOneWayTripIsChecked();
	}

	@When("^user verifies the number of Passenger is (\\d+)$")
	public void user_verifies_the_number_of_Passenger_is(int passenegrCount) throws Throwable {
		rp.verifyPassengerCount(passenegrCount);
	}

	@When("^user verifies Departing From is \"([^\"]*)\"$")
	public void user_verifies_Departing_From_is(String departFrom) throws Throwable {
		rp.verifyDepartFrom(departFrom);
	}

	@When("^user verifies On month \"([^\"]*)\"$")
	public void user_verifies_On_month(String months) throws Throwable {
	    rp.verifyOnMonth(months);
	}

	@When("^user verifies On date (\\d+)$")
	public void user_verifies_On_date(int dates) throws Throwable {
	    rp.verifyOnDate(dates);
	}

	@When("^user verifies Arriving In \"([^\"]*)\"$")
	public void user_verifies_Arriving_In(String arg1) throws Throwable {
	    
	}

	@When("^user verifies Returning month \"([^\"]*)\"$")
	public void user_verifies_Returning_month(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user verifies Returning date (\\d+)$")
	public void user_verifies_Returning_date(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user verifies Service class \"([^\"]*)\"$")
	public void user_verifies_Service_class(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user verifies Airline \"([^\"]*)\"$")
	public void user_verifies_Airline(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user clicks Continue button$")
	public void user_clicks_Continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user verifies Select a Flight title \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_verifies_Select_a_Flight_title_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
