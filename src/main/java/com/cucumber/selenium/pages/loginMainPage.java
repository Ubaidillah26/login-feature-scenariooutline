package com.cucumber.selenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.selenium.drivers.DriverSingleton;

public class loginMainPage {

	private WebDriver driver;
	
	public loginMainPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='user-name']") private WebElement txtusername;
	@FindBy(xpath = "//input[@id='password']") private WebElement txtpassword;
	@FindBy(xpath = "//*[@id=\"login-button\"]") private WebElement btnLogin;
		
	public void valid(String username, String password) {//		
		this.txtusername.sendKeys(username);
		this.txtpassword.sendKeys(password);
	}
	
	public void buttonLogin() {
		btnLogin.click();
	}
}
