@database
Feature: Computer Data table Feature

	# using datatable without examples keyword
	Scenario: Computer Data table Scenario

		Given User already on Computer Database Page
		When  title of the page is Computers database
		Then  User click Add a Computer
		Then  User enters computer name, date and company
			| Lenovo Yoga | 2012-06-09 | Lenovo Group |

		Then  User click create this computer
		Then  User enter company companyName in filter
			| Lenovo Group |

		Then  User clicks the filter button