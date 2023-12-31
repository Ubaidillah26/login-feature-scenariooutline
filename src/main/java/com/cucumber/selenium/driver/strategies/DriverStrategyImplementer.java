package com.cucumber.selenium.driver.strategies;

import com.cucumber.selenium.utils.Constants;

public class DriverStrategyImplementer {
	
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();

		default:
			return null;
		}
	}

}
