package stepDefinition;

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

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ComputerStepDef extends AbstractStepDef{
	
	WebDriver driver = getDriver();
	
	@Given("^User is already on Computer Database Page$")
	public void user_is_already_on_Computer_Database_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://computer-database.gatling.io/computers");
		driver.manage().window().maximize();
	}
	
	@When("^title of login page is Computers database$")
	public void title_of_Computer_Database_Page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Computers database", title);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	}
	
	@Then("^User click on Add a Computer$")
	public void user_clicks_add_a_computer() {
		WebElement addComputer = driver.findElement(By.xpath("//a[@id=\"add\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addComputer);
	}
	
	@Then("^User enters computer \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_computer_details(String computerName, String date, String companyName) throws Exception {
	    driver.findElement(By.name("name")).sendKeys(computerName);
	    driver.findElement(By.name("introduced")).sendKeys(date);
	    Select company = new Select(driver.findElement(By.name("company")));
	    company.selectByVisibleText(companyName);
	    Thread.sleep(500);
	}

	@Then("^User click on create this computer$")
	public void user_click_create_this_computer() {
		WebElement createComputer = driver.findElement(By.xpath("//input[@value=\"Create this computer\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", createComputer);
	}

	@Then("^User fill company \"(.*)\" in filter$")
	public void user_fill_company(String filterName) {
		WebElement filter = driver.findElement(By.xpath("//input[@id=\"searchbox\"]"));
		filter.sendKeys(filterName);
	}
	
	@Then("^User clicks on filter button$")
	public void user_clicks_on_filter_button() throws InterruptedException {
		WebElement createComputer = driver.findElement(By.xpath("//input[@value=\"Filter by name\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", createComputer);
		Thread.sleep(500);
	}

}
