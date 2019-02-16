package com.mercurytours.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-reports", "json:target/cucumber.json" },
				 features = "src/test/resources/features", 
				 glue = "com/mercurytours/step_definitions",
				 tags = "@MT001",
				 dryRun = false)
				 
public class CukesRunners {
}

/**
 * Cucumber hooks run after and before every single scenario.
 * Hook should always be in the same package as the glue code.  
 */




