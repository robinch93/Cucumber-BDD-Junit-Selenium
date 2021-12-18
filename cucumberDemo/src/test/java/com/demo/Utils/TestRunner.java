package com.demo.Utils;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/demo/features/calculator.feature", glue = { "com.demo.stepDefinition" },
		// plugin = { "pretty", "html:test-output/html",
		// "json:test-output/json_output/cucumber.json",
		// "junit:test-output/junit_xml/cucumber.xml" },
		monochrome = true,
		// strict = true, // it will check if any step is not defined in step
		// definition.
		dryRun = false // to check if the mapping is proper between feature and step definition file.
)

public class TestRunner {

}