package com.demo.stepDefinition;
// package stepDefinition;

// import java.util.List;

// import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.Select;

// import Runner.BaseClass;
// import cucumber.api.DataTable;
// import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;
// import cucumber.api.java.en.When;
// import junit.framework.Assert;

// public class DatatableStepDef extends BaseClass {

// private BaseClass base;

// public DatatableStepDef(BaseClass base) {
// this.base = base;
// }

// @Given("^User already on Computer Database Page$")
// public void user_already_on_Computer_Database_page() {
// driver = new ChromeDriver();
// driver.get("http://computer-database.gatling.io/computers");
// driver.manage().window().maximize();
// }

// @When("^title of the page is Computers database$")
// public void title_of_Page_is() {
// String title = driver.getTitle();
// System.out.println("Title of page: " + title);
// Assert.assertEquals("Computers database", title);
// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
// }

// @Then("^User click Add a Computer$")
// public void user_click_add_a_computer() {
// WebElement addComputer = driver.findElement(By.xpath("//a[@id=\"add\"]"));
// JavascriptExecutor executor = (JavascriptExecutor) driver;
// executor.executeScript("arguments[0].click();", addComputer);
// }

// @Then("^User enters computer name, date and company$")
// public void user_enter_computer_details(DataTable details) throws Exception {
// List<List<String>> data = details.raw();
// driver.findElement(By.name("name")).sendKeys(data.get(0).get(0));
// driver.findElement(By.name("introduced")).sendKeys(data.get(0).get(1));
// Thread.sleep(500);
// Select company = new Select(driver.findElement(By.name("company")));
// company.selectByVisibleText(data.get(0).get(2));
// Thread.sleep(500);
// }

// @Then("^User click create this computer$")
// public void user_create_this_computer() {
// WebElement createComputer =
// driver.findElement(By.xpath("//input[@value=\"Create this computer\"]"));
// JavascriptExecutor executor = (JavascriptExecutor) driver;
// executor.executeScript("arguments[0].click();", createComputer);
// }

// @Then("^User enter company companyName in filter$")
// public void user_enter_company(DataTable company) {
// List<List<String>> data = company.raw();
// WebElement filter =
// driver.findElement(By.xpath("//input[@id=\"searchbox\"]"));
// filter.sendKeys(data.get(0).get(0));
// }

// @Then("^User clicks the filter button$")
// public void user_click_filter_button() throws InterruptedException {
// WebElement createComputer =
// driver.findElement(By.xpath("//input[@value=\"Filter by name\"]"));
// JavascriptExecutor executor = (JavascriptExecutor) driver;
// executor.executeScript("arguments[0].click();", createComputer);
// Thread.sleep(500);
// }

// }
