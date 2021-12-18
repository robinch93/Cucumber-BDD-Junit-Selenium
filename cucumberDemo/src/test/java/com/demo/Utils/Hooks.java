package com.demo.Utils;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	WebDriver driver = getDriver();

	@Before
	public void initDriver() {
		System.out.println("Launching the Driver");
	}

	@After
	public void tearDown() {
		System.out.println("Quitting the Driver");
		driver.quit();
	}

}
