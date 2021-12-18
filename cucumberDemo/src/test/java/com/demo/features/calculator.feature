Feature: Basic Calculator feature

	# without Examples Keyword
	Scenario: Basic Calculator test scenario

		Given User is already on Basic Calculator Page
		When  title of login page is Basic Calculator
		Then  User enter "3" and "5" for operation
		Then  User clicks on calculate button
		Then  User checks the answer

	# with Examples Keyword
	Scenario Outline: : Basic Calculator test scenario

		Given User is already on Basic Calculator Page
		When  title of login page is Basic Calculator
		Then  User enter "<number1>" and "<number2>" for operation
		Then  User clicks on calculate button
		Then  User checks the answer


		Examples:
			| number1 |  | number2 |
			| 3       |  | 5       |
			| 5       |  | 3       |
