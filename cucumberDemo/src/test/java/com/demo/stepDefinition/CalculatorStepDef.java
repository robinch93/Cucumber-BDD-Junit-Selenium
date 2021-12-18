package com.demo.stepDefinition;

import com.demo.Utils.BaseClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef extends BaseClass {

	static WebDriver driver = getDriver();
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 50);

	@BeforeAll
	public static void before_all() {
		driver.manage().window().maximize();
	}

	@AfterAll
	public static void after_all() {
		BaseClass.quitDriver(driver);
	}

	@Given("User is already on Basic Calculator Page")
	public void user_already_on_Basic_Calculator_page() {
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");

	}

	@When("title of login page is Basic Calculator")
	public void title_of_Basic_Calculator_Page() throws Exception {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Basic Calculator", title);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	}

	@Then("User enter {string} and {string} for operation")
	public void user_enter_numbers_for_operation(String number1, String number2) {
		driver.findElement(By.name("number1")).sendKeys(number1);
		driver.findElement(By.name("number2")).sendKeys(number2);
	}

	@Then("User clicks on calculate button")
	public void user_clicks_on_calculate_button() {
		WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Calculate\"]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", loginButton);
	}

	@Then("User checks the answer")
	public void user_checks_the_answer() {
		WebElement calculate = driver.findElement(By.xpath("//input[@id=\"numberAnswerField\"]"));
		String answer = calculate.getAttribute("value");
		System.out.println("Answer is: " + answer);
		Assert.assertEquals("8", answer);
	}

}
