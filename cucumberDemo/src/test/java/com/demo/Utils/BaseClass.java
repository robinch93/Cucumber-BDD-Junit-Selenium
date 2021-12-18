package com.demo.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	protected static WebDriver driver;
	ChromeOptions options = new ChromeOptions();

	protected WebDriver getDriver() {
		// System.setProperty("webdriver.chrome.driver", "usr/local/bin/chromedriver");
		// options.addArguments("--headless", "--window-size=1920,1200");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		driver = new ChromeDriver(options);
		return driver;
	}

}
