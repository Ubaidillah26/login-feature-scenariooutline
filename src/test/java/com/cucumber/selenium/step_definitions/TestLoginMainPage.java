package com.cucumber.selenium.step_definitions;

import org.openqa.selenium.WebDriver;

import com.cucumber.selenium.pages.loginMainPage;
import com.cucumber.selenium.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class TestLoginMainPage {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private loginMainPage loginPage = new loginMainPage();
	
	public TestLoginMainPage() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User go to web Swaglab")
	public void onWebsite() {
		driver.get(Constants.URL);
		Hooks.delay(2);
	}
	
	@And("User enter {string} username and {string} password")
	public void fillTxtAccount(String username, String password) {
		loginPage.valid(username, password);
	}
	
	@Then("User click button login")
	public void clickButtonLogin() {
		loginPage.buttonLogin();
	}
}
