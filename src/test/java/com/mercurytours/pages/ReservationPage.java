package com.mercurytours.pages;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.mercurytours.utilities.Driver;


public class ReservationPage extends HomePage{

	WebDriver driver;

	public ReservationPage() {
		super();
		driver = Driver.getInstance();
	}

	@FindBy(xpath = "//input[@name='tripType' and @value='roundtrip']")
	public WebElement roundTrip;

	@FindBy(xpath = "//select[@name='passCount']")
	public WebElement dropDown;

	@FindBy(xpath = "//select[@name='fromPort']")
	public WebElement departFrom;

	@FindBy(xpath = "//select[@name='fromMonth']")
	public WebElement month;

	@FindBy(xpath = "//select[@name='fromDay']")
	public WebElement date;

	@FindBy(xpath = "//select[@name='toPort']")
	public WebElement arriving;
	
	@FindBy(xpath = "//input[@name='servClass']")
	public List<WebElement> business;
	
	@FindBy(xpath = "//select[@name='airline']")
	public WebElement airlines;
	
	@FindBy(xpath = "//input[@value='oneway']")
	public WebElement oneWay;
	
	@FindBy(css = "input[name='findFlights']")
	public WebElement continueButton;
	
	@FindBy(xpath = "//td[@class = 'title']//font[contains(text(), 'DEPART')]")
	public WebElement DEPART;
	
	
	@Test
	public void test() {
//		List<String> list = new ArrayList<String>();
//		list.add("Business");
//		System.out.println(list.contains("business"));
		driver.get("http://newtours.demoaut.com/");
		WebElement UserName = driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signInButton = driver.findElement(By.xpath("//input[@name='login']"));
		UserName.sendKeys("tutorial");
		passWord.sendKeys("tutorial");
		signInButton.click();
		
		Select select = new Select(month);
		List<WebElement>list2 = select.getOptions();
//		String[] texts = new String[list2.size()];
//		for (int i = 0; i < texts.length; i++) {
//			texts[i]=list2.get(i).getText().toLowerCase();
//		}
//		List<String> sortedList = Arrays.asList(texts);
//		System.out.println("sortedList "+sortedList);		
//		for (String str : texts) {
//			System.out.print(str+" ");
//		}
		
	}
	
	/*	written by Belek	*/
	public void setFlightClass(String flightClass) {
		List<WebElement> list = business;
		if (flightClass.equalsIgnoreCase("economy"))flightClass = "Coach";
		for (WebElement el : list) {
			if (el.getAttribute("value").equalsIgnoreCase(flightClass)) {
				el.click();
			}
		}
	}
		
//		By locator = By.xpath("//input[@name='servClass']");
//		if (flightClass.contains("Business") || flightClass.contains("business")) {
//			for (WebElement webElement : list) {
//				if (webElement.getAttribute("value").equalsIgnoreCase("Business")) {
//					toggle(webElement, true);
//				}
//			}
//		}else if (flightClass.contains("Economy") || flightClass.contains("economy")) {
//			for (WebElement webElement : list) {
//				if (webElement.getAttribute("value").equalsIgnoreCase("Economy")) {
//					toggle(webElement, true);
//				}
//			}
//		}else if (flightClass.contains("First") || flightClass.contains("first")) {
//			for (WebElement webElement : list) {
//				if (webElement.getAttribute("value").equalsIgnoreCase("First")) {
//					toggle(webElement, true);
//				}
//			}
//		}

	public void verifyOnDate(int dates) {
		String data = String.valueOf(dates);
		Select select = new Select(date);
		List<WebElement>list = select.getOptions();
		for (WebElement webElement : list) {
			if (webElement.getAttribute("value").equals(data)) {
				assertTrue(webElement.getAttribute("value").equals(data));
				break;
			}
		}
	}
	
	public void verifyRoundTripIsChecked() {
		assertTrue(roundTrip.isSelected());
	}
	
	public void verifyOneWayTripIsChecked() {
		assertTrue(!oneWay.isSelected());
	}
	
	public void verifyOnMonth(String theMonth) {
		Select select = new Select(month);
		List<WebElement>list = select.getOptions();
		
		String[] texts = new String[list.size()];
		for (int i = 0; i < texts.length; i++) {
			texts[i]=list.get(i).getText();
		}
		List<String> sortedList = Arrays.asList(texts);
		
		for (WebElement webElement : list) {
			if (webElement.getText().equals(theMonth)) {
				assertTrue(webElement.getText().equals(theMonth));
				break;
			}else {
				if (!sortedList.contains(theMonth)) {
					assertTrue(sortedList.contains(theMonth));
				}
			}
		}
	}

	 
	public void verifyPassengerCount(int passNum) {
		String passengerNum = String.valueOf(passNum);
		Select select = new Select(dropDown);
		List<WebElement>list = select.getOptions();
		assertTrue(list.get(passNum-1).getAttribute("value").equals(passengerNum));
	}
	
	public void verifyDepartFrom(String depFrom) {
		Select select = new Select(departFrom);
		List<WebElement>list = select.getOptions();
		for (WebElement webElement : list) {
			if (webElement.getText().equals(depFrom)) {
				assertTrue(webElement.getText().equals(depFrom));
				break;
			}
		}
	}
	
	public void chooseAirLine(String airline) {
		Select select = new Select(airlines);
		List<WebElement> airList = select.getOptions();
		for (WebElement webElement : airList) {
			if (webElement.getText().equals(airline)) {
				webElement.click();
			}
		}
	}
	
//	public void selectFlightClass(String flightClass) {
//		if (business.getText().equals(flightClass)) {
//			toggle(business, true);
//		}
//	}

	public void chooseFromDate(int date) {
		Select select = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		String dates = String.valueOf(date);
		List<WebElement> dayList = select.getOptions();
		for (WebElement calendarDay : dayList) {
			if (calendarDay.getAttribute("value").equals(dates)) {
				calendarDay.click();
				break;
			}
		}
	}
	
	public void chooseToDate(int date) {
		Select select = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		String dates = String.valueOf(date);
		List<WebElement> dayList = select.getOptions();
		for (WebElement calendarDay : dayList) {
			if (calendarDay.getAttribute("value").equals(dates)) {
				calendarDay.click();
				break;
			}
		}
	}
	
	public void arrivingIn(String destination) {
		Select select5 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		List<WebElement> arrival = select5.getOptions();
		for (WebElement element : arrival) {
			if (element.getAttribute("value").equals(destination)) {
				element.click();
				break;
			}
		}
	}

	public void chooseFromMonth(String month) {
		Select select = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		List<WebElement> fromMonth = select.getOptions();
		select.selectByVisibleText(month);
	}
	
	public void chooseToMonth(String month) {
		Select select = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		List<WebElement> toMonth = select.getOptions();
		select.selectByVisibleText(month);
	}

	public void departFrom(String departFrom) {
		Select select2 = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		List<WebElement> fromList = select2.getOptions();
		for (WebElement fromOption : fromList) {
			if (fromOption.getAttribute("value").equals(departFrom)) {
				fromOption.click();
				break;
			}
		}
	}

	public void selectPassengerCount(WebElement dropDown, int passengerCount) {
		String passengerNum = String.valueOf(passengerCount);
		Select select = new Select(dropDown);
		List<WebElement> list = select.getOptions();
		for (WebElement options : list) {
			if (options.getAttribute("value").equals(passengerNum)) {
				options.click();
				break;
			}
		}
	}

	public void toggle(WebElement checkbox, boolean checked) {
		if (checked) {
			if (checkbox.isSelected()) {
				return;
			} else {
				checkbox.click();
			}
		} else {
			if (checkbox.isSelected()) {
				checkbox.click();
			} else {
				return;
			}
		}
	}
	
	public void checkRoundtripButton(WebElement element) {
		if (element.isSelected()) {
			return;
		} else {
			element.click();
		}
	}

}

//System.out.println("Invalid input in Feature file!!!");
//int index = 0;
//if(!theMonth.equalsIgnoreCase(list.get(index).getText())) {
//	if (index < list.size()-1) {
//		index++;
//	}
//}
//assertTrue(theMonth.equalsIgnoreCase(list.get(index).getText()));
/** I need code in this line. Something like this --> fail() */

//else {
//	assertTrue(theMonth.equalsIgnoreCase(list.get(0).getText()));
//}