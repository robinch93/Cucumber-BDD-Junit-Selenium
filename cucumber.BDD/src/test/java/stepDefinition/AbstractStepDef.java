package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AbstractStepDef {

	protected static WebDriver driver;

	protected WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	

	
}
