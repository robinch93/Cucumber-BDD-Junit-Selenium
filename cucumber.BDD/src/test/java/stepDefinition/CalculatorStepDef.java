package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CalculatorStepDef extends AbstractStepDef{
	
	WebDriver driver = getDriver();
	
	@Given("^User is already on Basic Calculator Page$")
	public void user_already_on_Basic_Calculator_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		driver.manage().window().maximize();
	}
	
	@When("^title of login page is Basic Calculator$")
	public void title_of_Basic_Calculator_Page() throws Exception {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Basic Calculator", title);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	}
	
	@Then("^User enter \"(.*)\" and \"(.*)\" for operation$")
	public void user_enter_numbers_for_operation(String number1, String number2) {
	    driver.findElement(By.name("number1")).sendKeys(number1);
	    driver.findElement(By.name("number2")).sendKeys(number2);
	}

	@Then("^User clicks on calculate button$")
	public void user_clicks_on_calculate_button() {
		WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Calculate\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginButton);
	}

	@Then("^User checks the answer$")
	public void user_checks_the_answer() {
		WebElement calculate = driver.findElement(By.xpath("//input[@id=\"numberAnswerField\"]"));
		String answer = calculate.getAttribute("value");
	   System.out.println("Answer is: " + answer);
	   Assert.assertEquals("8", answer);
	}

}
 