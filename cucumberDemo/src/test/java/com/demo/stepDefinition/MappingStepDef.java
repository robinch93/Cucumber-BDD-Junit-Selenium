package com.demo.stepDefinition;

import java.util.Map;

import com.demo.Utils.BaseClass;
import com.demo.Utils.Locators.Calculator;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MappingStepDef extends BaseClass {

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

    @Given("User is on Basic Calculator Page")
    public void user_is_on_Basic_Calculator_page() {
        driver.get(Calculator.url);
    }

    @When("title of the page is Basic Calculator")
    public void title_of_the_page_is_Basic_Calculator() throws Exception {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Basic Calculator", title);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
    }

    @Then("User enter numbers and operation")
    public void user_enter_numbers_and_operation(DataTable numbers) throws InterruptedException {

        for (Map<String, String> data : numbers.asMaps(String.class, String.class)) {

            WebElement num1 = driver.findElement(By.name(Calculator.num1));
            num1.sendKeys(data.get("num1"));
            WebElement num2 = driver.findElement(By.name(Calculator.num2));
            num2.sendKeys(data.get("num2"));
            Thread.sleep(500);
            Select operation = new Select(driver.findElement(By.name(Calculator.operation)));
            operation.selectByVisibleText(data.get("operation"));

            Thread.sleep(500);
            WebElement loginButton = driver.findElement(By.xpath(Calculator.loginButton));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", loginButton);

            num1.clear();
            num2.clear();

            WebElement calculate = driver.findElement(By.xpath(Calculator.answerField));
            String answer = calculate.getAttribute("value");
            System.out.println("Answer after " + data.get("operation") + " operation: " + answer);
            Assert.assertEquals("6", answer);

        }

    }

}
