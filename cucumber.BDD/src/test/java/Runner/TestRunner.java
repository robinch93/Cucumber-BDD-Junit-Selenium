package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// cucumber.project.src.test.java.stepDefinition
@RunWith(Cucumber.class)
@CucumberOptions(
		features = 
		"C:\\Users\\RobinChaudhary\\eclipse-workspace\\cucumber.project\\src\\test\\java\\features\\calculator.feature", // path of feature files
		glue = {"stepDefinition"},	// path of step definition files
		format = {"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},  // to generate output in diff. reporting. 
		monochrome = true, // display console output in proper readable format. 
		strict = true,  // it will check if any step is not defined in step definition. 
		dryRun = false,  // to check if the mapping is proper between feature and step definition file. 
		tags = {"@SmokeTest, ~@RegressionTest, @EndtoEndTest"}   // OR condition with ignore symbol
//		tags = {"@SmokeTest", "@RegressionTest"}  // AND condition
		)

public class TestRunner {

}
