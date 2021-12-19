package com.demo.Utils;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/demo/features/computer.feature", glue = {
		"com.demo.stepDefinition" }, plugin = { "pretty", "html:test-results/HtmlReports/report.html",
				"json:test-results/JsonReports/report.json",
				"junit:test-results/JUnitReports/report.xml" }, monochrome = true,
		// strict = true, // it will check if any step is not defined in step
		// definition.
		dryRun = false // to check if the mapping is proper between feature and step definition file.
)

public class TestRunner {

}