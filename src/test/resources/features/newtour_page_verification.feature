Feature: Newtour Login Window 
@MT001
Scenario: Verify Login field is displayed 
	Given the user on the newtour homepage 
	When user enters "username" and "password" 
	Then user clicks sign-in button
	Then verify Find a Flight page title
