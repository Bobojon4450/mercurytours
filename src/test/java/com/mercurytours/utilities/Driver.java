package com.mercurytours.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

	private static WebDriver driver; 

	private Driver() {}
	// this is actually singleton class
	// if we cannot create an instance of this class
	// then methods in this class should be static methods.

	public static WebDriver getInstance() {
		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
			switch (ConfigurationReader.getProperty("browser")) {
			case "firefox":
				System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("gecko.driver.path"));
				driver = new FirefoxDriver();
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", ConfigurationReader.getProperty("chrome.driver.path"));
				// ChromeOptions options = new ChromeOptions();
				// options.setExperimentalOption("forceDevToolsScreenshot",
				// true);
				// options.addArguments("--start-maximized");
				driver = new ChromeDriver();
				break;
			case "ie":
				System.setProperty("webdriver.iexplorer.driver", ConfigurationReader.getProperty("ie.driver.path"));
				driver = new InternetExplorerDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			case "phantomjs":
				System.setProperty("webdriver.phantomjs.driver",
						ConfigurationReader.getProperty("phantomjs.driver.path"));
				driver = new PhantomJSDriver();
				break;
			default:
				System.setProperty("webdriver.chrome.driver", ConfigurationReader.getProperty("chrome.driver.path"));
				driver = new ChromeDriver();
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
