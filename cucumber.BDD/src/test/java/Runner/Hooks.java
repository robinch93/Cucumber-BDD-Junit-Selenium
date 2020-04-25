package Runner;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import stepDefinition.AbstractStepDef;

public class Hooks extends AbstractStepDef{

	WebDriver driver = getDriver();	
	
	// Global Hooks
	@Before
	public void setUp() {
		System.out.println("Launching the Url");
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}
	
	// local tagged hooks
	@Before("@SmokeTest")
	public void beforeSmoke() {
		System.out.println("run this method before smoke test");
	}
	
	@After("@SmokeTest")
	public void afterSmoke() {
		System.out.println("run this method after smoke test");
	}
	
}
