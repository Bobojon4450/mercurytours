package com.mercurytours.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mercurytours.pages.BookAFlightPage;
import com.mercurytours.utilities.Driver;

import cucumber.api.java.en.Then;

public class BookingFlightStepDefs {

	String expectedTitle = "Flight Confirmation: Mercury Tours";
	BookAFlightPage bf = new BookAFlightPage();

	@Then("^user enters First Name \"([^\"]*)\" and last name \"([^\"]*)\"$")
	public void user_enters_First_Name_and_last_name(String fName, String lName){
		 bf.passengerFirstName.sendKeys(fName);
		 bf.passengerLastName.sendKeys(lName);
	}

	@Then("^user selects vegeterian meal$")
	public void user_selects_vegeterian_meal(){
	    selectMeal();
	}

	@Then("^user selects Card Type \"([^\"]*)\" and enters number \"([^\"]*)\"$")
	public void user_selects_Card_Type_and_enters_number(String cardType, String cardNumber){
	    selectCreditCard(cardType);
	    bf.creditCardNumber.sendKeys(cardNumber);
	}

	@Then("^user selects Expiration month \"([^\"]*)\" and year \"([^\"]*)\"$")
	public void user_selects_Expiration_month_and_year(String month, String year) throws InterruptedException{
	    Thread.sleep(1000);
		selectExpirationMonth(month);
	    selectExpirationYear(year);
	}

	@Then("^user enters for credit first name \"([^\"]*)\" enter last name \"([^\"]*)\"$")
	public void user_enters_for_credit_first_name_enter_last_name(String name, String lastName){
	    bf.creditCardFirstName.sendKeys(name);
	    bf.creditCardLastName.sendKeys(lastName);
	}

	@Then("^user clears address enters \"([^\"]*)\"$")
	public void user_clears_address_enters(String newAddress) {
	    bf.addressLine1.clear();
	    bf.addressLine1.sendKeys(newAddress);
	}

	@Then("^user clears city and enters city \"([^\"]*)\"$")
	public void user_clears_city_and_enters_city(String city){
	    bf.city.clear();
	    bf.city.sendKeys(city);
	}

	@Then("^user clears State/Province enters \"([^\"]*)\"$")
	public void user_clears_State_Province_enters(String state){
	    bf.stateProvince.clear();
	    bf.stateProvince.sendKeys(state);
	}

	@Then("^user clears Postal Code enter \"([^\"]*)\"$")
	public void user_clears_Postal_Code_enter(String zipCode){
	    bf.zipCode.clear();bf.zipCode.sendKeys(zipCode);
	}
	
	@Then("^user clears zip code enter \"([^\"]*)\" and checks Same as Billing Address$")
	public void user_clears_zip_code_enter_and_checks_Same_as_Billing_Address(String zipCode){
	    bf.zipCode.clear();bf.zipCode.sendKeys(zipCode);
	    bf.sameAsBilling.click();
	}
	
	@Then("^user clicks Secure Purchase button$")
	public void user_clicks_Secure_Purchase_button(){
//	    bf.securePurchase.click();
	}
	
	@Then("^user verifies the current title with expected$")
	public void user_verifies_the_current_title_with_expected(){
		assertEquals(expectedTitle, Driver.getInstance().getTitle());
	}
	
	public void selectMeal() {
		WebElement mlDropDown = bf.mealDropDown;
		Select select = new Select(mlDropDown);
		List<WebElement> list = select.getOptions();
		for (WebElement webElement : list) {
			if (webElement.getText().equals("Vegetarian")) {
				webElement.click();
			}
		}
	}
	
	public void selectCreditCard(String cardType) {
		WebElement creditDropDown = bf.creditCardDropDown;
		Select select = new Select(creditDropDown);
		List<WebElement> list = select.getOptions();
		for (WebElement webElement : list) {
			if (webElement.getText().equals(cardType)) {
				webElement.click();
			}
		}
	}
	
	public void selectExpirationMonth(String month) {
		WebElement monthExpDropDown = bf.epirationMonths;
		Select select = new Select(monthExpDropDown);
		List<WebElement> list = select.getOptions();
		for (WebElement webElement : list) {
			if (webElement.getText().equals(month)) {
				webElement.click();
			}
		}
		
	}
	
	public void selectExpirationYear(String year){
		WebElement yearExpDropDown = bf.expirationYear;
		Select select2 = new Select(yearExpDropDown);
		List<WebElement> list = select2.getOptions();
		for (WebElement webElement : list) {
			if (webElement.getText().trim().equals(year)) {
				webElement.click();
			}
		}
		
	}	
}
	
/**	String[] texts = new String[list.size()];
	for (int i = 0; i < texts.length; i++) {
		texts[i]=list.get(i).getText();
	}
	List<String> mothsTexts = Arrays.asList(texts);
	else {
		if(!mothsTexts.contains(year)) {
		assertTrue(mothsTexts.contains(year));
	}
}*/	