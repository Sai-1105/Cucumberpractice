package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.FunctionalLibrary.FunctionalLibrary;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src\\test\\java\\com\\feature\\Automation.feature", glue = "com.stepdefn", 
		dryRun = false,monochrome=true,strict=true,plugin = { "pretty", "html:target/cucumber-reports" }

)

public class Testrunner extends FunctionalLibrary {
	@BeforeClass
	public static void driverinitialization() throws Throwable {
		getDriver("Chrome");

	}

	@AfterClass
	public static void quit() {
		driver.quit();
	}

}
