package com.mercurytours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercurytours.utilities.Driver;

public class HomePage {

	public String userName = "tutorial";
	public String password = "tutorial";
	public String expectedTitle = "Find a Flight: Mercury Tours:";

	public HomePage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(xpath = "//input[@name='userName']")
	public WebElement userNameField;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordField;

	@FindBy(xpath = "//input[@name='login']")
	public WebElement signInButton;

}
