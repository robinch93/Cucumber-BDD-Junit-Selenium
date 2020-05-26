# Cucumber-BDD-Junit-Selenium
This project is implementation of Cucumber BDD framework using selenium and Junit libraries. 

**Prerequisite** 
- Maven 
- Eclipse
- JUnit 
- Cucumber

Data-Driven testing is performed using different utilities cucumber framework provides. 
Below feature files with their corresponding step definitions are provided for various test performed. 

- Test Without Examples Keyword: 

   [cucumber.BDD/src/test/java/features/calculator.feature](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/features/calculator.feature)

   [cucumber.BDD/src/test/java/stepDefinition/CalculatorStepDef.java
](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/stepDefinition/CalculatorStepDef.java)

- Test With Examples Keyword: 

   [cucumber.BDD/src/test/java/features/computer.feature](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/features/computer.feature)

    [cucumber.BDD/src/test/java/stepDefinition/ComputerStepDef.java
](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/stepDefinition/ComputerStepDef.java)

- Test using Datatable using raw(): 

   [cucumber.BDD/src/test/java/features/datatable.feature](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/features/datatable.feature)

    [cucumber.BDD/src/test/java/stepDefinition/DatatableStepDef.java
](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/stepDefinition/DatatableStepDef.java)

- Test using Datatabale using asMap(): 

   [cucumber.BDD/src/test/java/features/mapping.feature](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/features/mapping.feature)

   [cucumber.BDD/src/test/java/stepDefinition/MappingStepDef.java
](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/stepDefinition/MappingStepDef.java)


- Test using Tagging: 

    [cucumber.BDD/src/test/java/features/tagging.feature](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/features/tagging.feature)

   [cucumber.BDD/src/test/java/stepDefinition/TaggingStepDef.java
](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/stepDefinition/TaggingStepDef.java)

**Runner** 

   The Runner class is the executable file which is used to setup the test by writing directories in features, glue and setting values for dryRun, strict, tags. etc

   [cucumber.BDD/src/test/java/Runner/TestRunner.java](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/Runner/TestRunner.java)

**Hooks** 

   Hooks are used define methods with @Before and @After annotations to run before or after the scenarios. 

   [cucumber.BDD/src/test/java/Runner/Hooks.java](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumber.BDD/src/test/java/Runner/Hooks.java)
  
  
 **Console Output** 

   After Execution console ouotput has been attached. 

   [Cucumber-BDD-Junit-Selenium/cucumber.BDD/console_output/](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/tree/master/cucumber.BDD/console_output)
   
   




