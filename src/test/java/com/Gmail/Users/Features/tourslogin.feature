Feature: login
This feature deals with the login 

Scenario: Login with correct username and correct password

	Given I navigate to login page
	And I entered the "mercury" and "mercury"
	And I clicked submit button
	Then Its navigated to the home page

	
Scenario: Login with correct username and incorrect password

	Given I navigate to login page
	And I entered the "mercury" and "hello"
	And I clicked submit button
	Then Its not navigated to the home page
	


Scenario: Login with correct username and correct password using DataTable



	Given I navigate to login page
	
	
	When I entered following details
	| userName | passWord |
	| mercury  | mercury1 |
	| mercury  | mercury  |
	
	And I clicked submit button
	Then Its navigated to the home page
	
	

@datatable
Scenario Outline: Login with correct username and correct password using DataTable



	Given I navigate to login page
	#When I entered following details
	When I insert "<userName>" and "<passWord>"	
	And I clicked submit button
	Then Its navigated to the home page "<Expected result>"
	
	
	@Invalid
	Examples:

    | userName | passWord |Expected result|
	| mercury  | hello |Enter your userName and password correct|
	| mercury  | mercury  |Login Successfully|
	|name|hello|Enter your userName and password correct|
	
	