package com.mercurytours.step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.mercurytours.pages.ReservationPage;
import com.mercurytours.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReservationPageStepDefs {

	ReservationPage rp = new ReservationPage();
	String expectedTitle = "Select a Flight: Mercury Tours";
	String expectedUrl = "http://newtours.demoaut.com/mercuryreservation2.php";
	WebDriverWait wait =new WebDriverWait(Driver.getInstance(), 20);
	
	@When("^user selects round trip and passenger (\\d+)$")
	public void user_selects_round_trip_and_passenger(int arg1) throws Throwable {
//	    rp.toggle(rp.roundTrip, true);
		rp.checkRoundtripButton(rp.roundTrip);
	}

	@When("^user selects depart from \"([^\"]*)\" on \"([^\"]*)\" (\\d+)$")
	public void user_selects_depart_from_on(String departFrom, String month, int date) throws Throwable {
	   rp.departFrom(departFrom); 
	   rp.chooseFromMonth(month);
	   rp.chooseFromDate(date);
	}

	@When("^user selects arriving port \"([^\"]*)\"$")
	public void user_selects_arriving_port(String arringPort) throws Throwable {
	    rp.arrivingIn(arringPort);
	}

	@When("^user selects returning date \"([^\"]*)\" (\\d+)$")
	public void user_selects_returning_date(String month, int date) throws Throwable {
	    rp.chooseToMonth(month);rp.chooseToDate(date); 
	}

	@When("^user selects Service as \"([^\"]*)\"$")
	public void user_selects_Service_as(String flightClass) throws Throwable {
	    rp.setFlightClass(flightClass);
	}

	@When("^user selects Airline \"([^\"]*)\"$")
	public void user_selects_Airline(String airline) throws Throwable {
	    rp.chooseAirLine(airline);
	}
	
	@Then("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
	    rp.continueButton.click();
	}
	
	@Then("^user verifies Book a Flight page title$")
	public void user_verifies_Book_a_Flight_page_title() throws Throwable {
	    Thread.sleep(3000);
	    assertEquals(expectedUrl, Driver.getInstance().getCurrentUrl());
	}
	
	

}
