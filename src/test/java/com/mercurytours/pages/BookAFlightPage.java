package com.mercurytours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercurytours.utilities.Driver;

public class BookAFlightPage {

	WebDriver driver;

	public BookAFlightPage() {
		
		driver = Driver.getInstance();
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(css = "input[name = 'passFirst0']")
	public WebElement passengerFirstName;
	
	@FindBy(css = "input[name = 'passLast0']")
	public WebElement passengerLastName;
	
	@FindBy(css = "select[name = 'pass.0.meal']")
	public WebElement mealDropDown;
	
	@FindBy(css = "select[name = 'creditCard']")
	public WebElement creditCardDropDown;
	
	@FindBy(css = "input[name = 'creditnumber']")
	public WebElement creditCardNumber;
	               
	@FindBy(css = "select[name = 'cc_exp_dt_mn']")
	public WebElement epirationMonths;
	
	@FindBy(css = "select[name = 'cc_exp_dt_yr']")
	public WebElement expirationYear;
	
	@FindBy(css = "input[name = 'cc_frst_name']")
	public WebElement creditCardFirstName;
	
	@FindBy(css = "input[name = 'cc_last_name']")
	public WebElement creditCardLastName;
	
	@FindBy(css = "input[name = 'billAddress1']")
	public WebElement addressLine1;
	
	@FindBy(css = "input[name = 'delCity']")
	public WebElement city;
	
	@FindBy(css = "input[name = 'billState']")
	public WebElement stateProvince;
	
	@FindBy(css = "input[name = 'billZip']")
	public WebElement zipCode;
	
	@FindBy(xpath = "(//input[@name = 'ticketLess'])[2]")
	public WebElement sameAsBilling;
	
	@FindBy(css = "input[name = 'buyFlights']")
	public WebElement securePurchase;
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "")
	public WebElement s;
	
	@FindBy(xpath = "")
	public WebElement c;
	
	@FindBy(xpath = "")
	public WebElement v;
	
	@FindBy(xpath = "")
	public WebElement b;
}
