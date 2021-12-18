$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/calculator.feature");
formatter.feature({
  "line": 1,
  "name": "Basic Calculator feature",
  "description": "",
  "id": "basic-calculator-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# without Examples Keyword"
    }
  ],
  "line": 4,
  "name": "Basic Calculator test scenario",
  "description": "",
  "id": "basic-calculator-feature;basic-calculator-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is already on Basic Calculator Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Basic Calculator",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter \"3\" and \"5\" for operation",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on calculate button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User checks the answer",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorStepDef.user_already_on_Basic_Calculator_page()"
});
formatter.result({
  "duration": 145823049,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinition.CalculatorStepDef.user_already_on_Basic_Calculator_page(CalculatorStepDef.java:23)\n\tat ✽.Given User is already on Basic Calculator Page(src/test/java/features/calculator.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "CalculatorStepDef.title_of_Basic_Calculator_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 12
    },
    {
      "val": "5",
      "offset": 20
    }
  ],
  "location": "CalculatorStepDef.user_enter_numbers_for_operation(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CalculatorStepDef.user_clicks_on_calculate_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CalculatorStepDef.user_checks_the_answer()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 12,
      "value": "# with Examples Keyword"
    }
  ],
  "line": 13,
  "name": ": Basic Calculator test scenario",
  "description": "",
  "id": "basic-calculator-feature;:-basic-calculator-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is already on Basic Calculator Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is Basic Calculator",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enter \"\u003cnumber1\u003e\" and \"\u003cnumber2\u003e\" for operation",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User clicks on calculate button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User checks the answer",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "basic-calculator-feature;:-basic-calculator-test-scenario;",
  "rows": [
    {
      "cells": [
        "number1",
        "",
        "number2"
      ],
      "line": 23,
      "id": "basic-calculator-feature;:-basic-calculator-test-scenario;;1"
    },
    {
      "cells": [
        "3",
        "",
        "5"
      ],
      "line": 24,
      "id": "basic-calculator-feature;:-basic-calculator-test-scenario;;2"
    },
    {
      "cells": [
        "5",
        "",
        "3"
      ],
      "line": 25,
      "id": "basic-calculator-feature;:-basic-calculator-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": ": Basic Calculator test scenario",
  "description": "",
  "id": "basic-calculator-feature;:-basic-calculator-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is already on Basic Calculator Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is Basic Calculator",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enter \"3\" and \"5\" for operation",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User clicks on calculate button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User checks the answer",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorStepDef.user_already_on_Basic_Calculator_page()"
});
formatter.result({
  "duration": 277293,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinition.CalculatorStepDef.user_already_on_Basic_Calculator_page(CalculatorStepDef.java:23)\n\tat ✽.Given User is already on Basic Calculator Page(src/test/java/features/calculator.feature:15)\n",
  "status": "failed"
});
formatter.match({
  "location": "CalculatorStepDef.title_of_Basic_Calculator_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 12
    },
    {
      "val": "5",
      "offset": 20
    }
  ],
  "location": "CalculatorStepDef.user_enter_numbers_for_operation(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CalculatorStepDef.user_clicks_on_calculate_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CalculatorStepDef.user_checks_the_answer()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": ": Basic Calculator test scenario",
  "description": "",
  "id": "basic-calculator-feature;:-basic-calculator-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is already on Basic Calculator Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is Basic Calculator",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enter \"5\" and \"3\" for operation",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User clicks on calculate button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User checks the answer",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorStepDef.user_already_on_Basic_Calculator_page()"
});
formatter.result({
  "duration": 240581,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinition.CalculatorStepDef.user_already_on_Basic_Calculator_page(CalculatorStepDef.java:23)\n\tat ✽.Given User is already on Basic Calculator Page(src/test/java/features/calculator.feature:15)\n",
  "status": "failed"
});
formatter.match({
  "location": "CalculatorStepDef.title_of_Basic_Calculator_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    },
    {
      "val": "3",
      "offset": 20
    }
  ],
  "location": "CalculatorStepDef.user_enter_numbers_for_operation(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CalculatorStepDef.user_clicks_on_calculate_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CalculatorStepDef.user_checks_the_answer()"
});
formatter.result({
  "status": "skipped"
});
});