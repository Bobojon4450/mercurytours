package com.mercurytours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercurytours.utilities.Driver;

public class SelectFlightPage {

	WebDriver driver;
	
	public SelectFlightPage() {
		PageFactory.initElements(Driver.getInstance(), this);
		driver = Driver.getInstance();
	}
	
	@FindBy(xpath = "(//input[@name='outFlight'])[4]")
	public WebElement departFlight363;
	
	@FindBy(xpath = "(//input[@name='inFlight'])[4]")
	public WebElement reurnFlight363;
	
	@FindBy(css = "input[name='reserveFlights']")
	public WebElement continueFlight363;	
}
