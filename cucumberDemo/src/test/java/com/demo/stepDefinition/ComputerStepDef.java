package com.demo.stepDefinition;

import com.demo.Utils.BaseClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerStepDef extends BaseClass {

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

    @Given("User is already on Computer Database Page")
    public void user_is_already_on_Computer_Database_page() {
        driver.get("http://computer-datagatling.io/computers");
    }

    @When("title of login page is Computers database")
    public void title_of_Computer_Database_Page() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Computers database", title);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
    }

    @Then("User click on Add a Computer")
    public void user_clicks_add_a_computer() {
        WebElement addComputer = driver.findElement(By.xpath("//a[@id=\"add\"]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", addComputer);
    }

    @Then("User enters computer {string} and {string} and {string} ")
    public void user_enter_computer_details(String computerName, String date, String companyName) throws Exception {
        driver.findElement(By.name("name")).sendKeys(computerName);
        driver.findElement(By.name("introduced")).sendKeys(date);
        Select company = new Select(driver.findElement(By.name("company")));
        company.selectByVisibleText(companyName);
        Thread.sleep(500);
    }

    @Then("User click on create this computer")
    public void user_click_create_this_computer() {
        WebElement createComputer = driver.findElement(By.xpath("//input[@value=\"Create this computer\"]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", createComputer);
    }

    @Then("User fill company {string} in filter")
    public void user_fill_company(String filterName) {
        WebElement filter = driver.findElement(By.xpath("//input[@id=\"searchbox\"]"));
        filter.sendKeys(filterName);
    }

    @Then("User clicks on filter button")
    public void user_clicks_on_filter_button() throws InterruptedException {
        WebElement createComputer = driver.findElement(By.xpath("//input[@value=\"Filter by name\"]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", createComputer);
        Thread.sleep(500);
    }

}
