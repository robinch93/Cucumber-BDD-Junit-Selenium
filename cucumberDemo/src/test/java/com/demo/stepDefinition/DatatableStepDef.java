// package com.demo.stepDefinition;

// import java.util.List;

// import com.demo.Utils.BaseClass;

// import org.junit.Assert;
// import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.support.ui.Select;
// import org.openqa.selenium.support.ui.WebDriverWait;

// import io.cucumber.datatable.DataTable;
// import io.cucumber.java.AfterAll;
// import io.cucumber.java.BeforeAll;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;

// public class DatatableStepDef extends BaseClass {

// static WebDriver driver = getDriver();
// Actions actions = new Actions(driver);
// WebDriverWait wait = new WebDriverWait(driver, 50);

// @BeforeAll
// public static void before_all() {
// driver.manage().window().maximize();
// }

// @AfterAll
// public static void after_all() {
// BaseClass.quitDriver(driver);
// }

// @Given("User already on Computer Database Page")
// public void user_already_on_Computer_Database_page() {
// driver.get("http://computer-database.gatling.io/computers");
// }

// @When("title of the page is Computers database")
// public void title_of_Page_is() {
// String title = driver.getTitle();
// System.out.println("Title of page: " + title);
// Assert.assertEquals("Computers database", title);
// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
// }

// @Then("User click Add a Computer")
// public void user_click_add_a_computer() {
// WebElement addComputer = driver.findElement(By.xpath("//a[@id=\"add\"]"));
// JavascriptExecutor executor = (JavascriptExecutor) driver;
// executor.executeScript("arguments[0].click();", addComputer);
// }

// @Then("User enters computer name, date and company")
// public void user_enter_computer_details(DataTable details) throws Exception {
// List<List<String>> data = details.cells();
// driver.findElement(By.name("name")).sendKeys(data.get(0).get(0));
// driver.findElement(By.name("introduced")).sendKeys(data.get(0).get(1));
// Thread.sleep(500);
// Select company = new Select(driver.findElement(By.name("company")));
// company.selectByVisibleText(data.get(0).get(2));
// Thread.sleep(500);
// }

// @Then("User click create this computer")
// public void user_create_this_computer() {
// WebElement createComputer =
// driver.findElement(By.xpath("//input[@value=\"Create this computer\"]"));
// JavascriptExecutor executor = (JavascriptExecutor) driver;
// executor.executeScript("arguments[0].click();", createComputer);
// }

// @Then("User enter company companyName in filter")
// public void user_enter_company(DataTable company) {
// List<List<String>> data = company.cells();
// WebElement filter =
// driver.findElement(By.xpath("//input[@id=\"searchbox\"]"));
// filter.sendKeys(data.get(0).get(0));
// }

// @Then("User clicks the filter button")
// public void user_click_filter_button() throws InterruptedException {
// WebElement createComputer =
// driver.findElement(By.xpath("//input[@value=\"Filter by name\"]"));
// JavascriptExecutor executor = (JavascriptExecutor) driver;
// executor.executeScript("arguments[0].click();", createComputer);
// Thread.sleep(500);
// }

// }
