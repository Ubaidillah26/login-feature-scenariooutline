package com.cucumber.selenium.utils;

public enum TestScenarios {

	T0("User go to web Swaglab"),
	T1("User enter invalid username and password"),
	T2("User enter valid username and password"),
	T3("User click button login"),
	T4("User on website");
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	
}
