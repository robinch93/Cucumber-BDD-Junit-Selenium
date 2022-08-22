# Cucumber-BDD-Junit-Selenium

This project is implementation of Cucumber BDD framework using selenium and Junit libraries using Gherkin language.

**Run on Local**
1. Download [Maven](https://maven.apache.org/download.cgi)
2. Run `cd cucumberDemo && mvn clean install -Dmaven.test.skip=true`
3. Run Feaure files with specific tags: <br />
   [Calculator](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/calculator.feature): &nbsp;  `mvn test -Dcucumber.filter.tags="@calculator"` <br />
   [Computer](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/computer.feature): &nbsp;  `mvn test -Dcucumber.filter.tags="@computer"` <br />
   [Database](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/database.feature): &nbsp;  `mvn test -Dcucumber.filter.tags="@database"` <br />
   [Mapping](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/mapping.feature): &nbsp;  `mvn test -Dcucumber.filter.tags="@mapping"` <br />
   [Tagging](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/tagging.feature): &nbsp;  `mvn test -Dcucumber.filter.tags="@tagging"` <br />
4. Open Test Reports: &nbsp;  `open -a "Google Chrome" file://$PWD/test-results/HtmlReports/report.html`

**Run on Docker**

Download [Docker](https://docs.docker.com/get-docker/) to run feature files tests:

1. [Calculator](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/calculator.feature): &nbsp;  `make docker-test-calculator` <br />
2. [Computer](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/computer.feature): &nbsp;  `make docker-test-computer` <br />
3. [Database](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/database.feature): &nbsp;  `make docker-test-database` <br />
4. [Mapping](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/mapping.feature): &nbsp;  `make docker-test-mapping` <br />
5. [Tagging](https://github.com/robinch93/Cucumber-BDD-Junit-Selenium/blob/master/cucumberDemo/src/test/java/com/demo/features/tagging.feature): &nbsp;  `make docker-test-tagging` <br />
