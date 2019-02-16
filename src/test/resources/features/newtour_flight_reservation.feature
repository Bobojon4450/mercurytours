@EndToEnd
Feature: Newtour flight reservation page 

@MT002 
Scenario: Flight finder should be displayed 
	Given the user on the newtour homepage 
	When user enters "username" and "password" 
	And user clicks sign-in button 
	And verify Find a Flight page title 
	And user selects round trip and passenger 2 
	And user selects depart from "Paris" on "December" 24 
	And user selects arriving port "Seattle" 
	And user selects returning date "December" 30 
	And user selects Service as "Business" 
	And user selects Airline "Unified Airlines" 
	Then user clicks on continue button 
	Then user verifies Book a Flight page title 
	
@MT003 
Scenario: Slecting a flight for roundtrip 
	Given User selects departing Unified Airlines 
	Then User selects return Unified Airlines 
	Then user clicks continue button 
	And user verifies Book a Flight page title 
	
	
	
@MT004 
Scenario: Booking a flight 
	Given user enters First Name "John" and last name "Smith" 
	Then user selects vegeterian meal 
	Then user selects Card Type "Visa" and enters number "4111 1111 1111 1111" 
	Then user selects Expiration month "10" and year "2010" 
	Then user enters for credit first name "John" enter last name "Smith" 
	Then user clears address enters "7921 Jonas Branch dr" 
	Then user clears city and enters city "McLean" 
	Then user clears State/Province enters "VA" 
	Then user clears zip code enter "22102" and checks Same as Billing Address 
	Then user clicks Secure Purchase button 
	Then user verifies the current title with expected 
	
