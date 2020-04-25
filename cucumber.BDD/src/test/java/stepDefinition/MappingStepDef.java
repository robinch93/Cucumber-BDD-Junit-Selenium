package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MappingStepDef extends AbstractStepDef{
	
	WebDriver driver = getDriver();
	
	@Given("^User is on Basic Calculator Page$")
	public void user_is_on_Basic_Calculator_page() {
		
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		driver.manage().window().maximize();
	}
	
	@When("^title of the page is Basic Calculator$")
	public void title_of_the_page_is_Basic_Calculator() throws Exception {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Basic Calculator", title);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	}
	
	@Then("^User enter numbers and operation$")
	public void user_enter_numbers_and_operation(DataTable numbers) throws InterruptedException {
		
		for (Map<String, String> data : numbers.asMaps(String.class, String.class)) {
			
			WebElement num1 = driver.findElement(By.name("number1"));
			num1.sendKeys(data.get("num1"));
		    WebElement num2 = driver.findElement(By.name("number2"));
		    num2.sendKeys(data.get("num2"));
		    Thread.sleep(500);
		    Select operation = new Select(driver.findElement(By.name("selectOperation")));
		    operation.selectByVisibleText(data.get("operation"));
		    
		    Thread.sleep(500);
		    WebElement loginButton = driver.findElement(By.xpath("//input[@value=\"Calculate\"]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", loginButton);
			
			num1.clear();
			num2.clear();
			
			WebElement calculate = driver.findElement(By.xpath("//input[@id=\"numberAnswerField\"]"));
			String answer = calculate.getAttribute("value");
		   System.out.println("Answer after " + data.get("operation") +" operation: " + answer);
		   Assert.assertEquals("6", answer);
		   
		}
	    
	}

}
 