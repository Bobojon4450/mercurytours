package com.mercurytours.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mercurytours.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * These methods run Before and After every "Scenario" per scenario in the feature file.
 * It must be always located within step_definition package where glue code is.
 * Cucumber will look for this class in this package. 
 * There are two types of hooks: @Before and @After.
 */

public class Hook {

	@Before
	public void setUp() {
		Driver.getInstance().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.getInstance().manage().window().maximize();
	}

    @After // Cucumber has it's own annotations
	public void tearDown(Scenario scenario) throws InterruptedException {
		if (scenario.isFailed()) {
			final byte[] screenShot = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenShot, "image/png");
		}
//		 Driver.closeDriver();
	}
}
