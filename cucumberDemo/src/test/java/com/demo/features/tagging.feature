@FunctionalTest @tagging
Feature: Free CRM tag based feature

    @SmokeTest @RegressionTest
    Scenario: Login with correct username and password
        Given  This is a valid login test

    @RegressionTest
    Scenario: Login with incorrect username and password
        Given  This is invalid login test

    @SmokeTest
    Scenario: Create a contact
        Given  This is a contact test case

    @SmokeTest @RegressionTest
    Scenario: Create a deal
        Given  This is a deal test case

    @SmokeTest
    Scenario: Create a task
        Given  This is a task test case

    @RegressionTest
    Scenario: Create a call
        Given  This is a call test case

    @EndtoEndTest  @SmokeTest
    Scenario: Searh a case
        Given  This is a case test case

    @EndtoEndTest
    Scenario: Searh a deal
        Given  This is a deal test case

    @SmokeTest @RegressionTest
    Scenario: Application Logout
        Given  This is a logout test case





