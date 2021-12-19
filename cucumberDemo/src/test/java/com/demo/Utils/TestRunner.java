package com.demo.Utils;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/demo/features", glue = { "com.demo.stepDefinition" }, plugin = {
		"pretty", "html:test-results/HtmlReports/report.html", "json:test-results/JsonReports/report.json",
		"junit:test-results/JUnitReports/report.xml" }, monochrome = true, dryRun = false, tags = "@SmokeTest and @EndtoEndTest and not @RegressionTest")

public class TestRunner {

}