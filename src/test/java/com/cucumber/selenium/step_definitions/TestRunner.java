package com.cucumber.selenium.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(tags="",
					features={"src/test/resources/loginMainPage.feature"},
					glue = "com.cucumber.selenium.step_definitions",
					plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})

			public class TestRunner extends AbstractTestNGCucumberTests{
				
}
