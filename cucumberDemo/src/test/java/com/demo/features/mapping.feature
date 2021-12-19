Feature: Basic Calculator mapping feature

	# datatables with maps
	Scenario: Basic Calculator mapping test scenario

		Given User is on Basic Calculator Page
		When  title of the page is Basic Calculator
		Then  User enter numbers and operation
			| num1 | num2 | operation |
			| 2    | 4    | Add       |
			| 9    | 3    | Subtract  |
			| 2    | 3    | Multiply  |
			| 12   | 2    | Divide    |


