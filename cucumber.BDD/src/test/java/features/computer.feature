Feature: Computer Database feature

Scenario Outline: Computer Database test scenario

	Given User is already on Computer Database Page
	When  title of login page is Computers database
	Then  User click on Add a Computer
	Then  User enters computer "<name>" and "<date>" and "<company>"
	Then  User click on create this computer 
	Then  User fill company "<companyName>" in filter
	Then  User clicks on filter button
	
Examples:
	| name | 			| date | 		| company | 			| companyName |
	| Lenovo Yoga | 	| 2012-06-09 | 	| Lenovo Group | 		| Lenovo |
	| Samsung Pixel | 	| 2012-07-09 | 	| Samsung Electronics | | Samsung |
	
	

	
	
	