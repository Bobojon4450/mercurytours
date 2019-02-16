@MT004
Feature: Newtour flight booking page 

Scenario: Booking a flight 
	Given user enters First Name "John" and last name "Smith" 
	Then user selects vegeterian meal 
	Then user selects Card Type "Visa" and enters number "4111 1111 1111 1111" 
	Then user selects Expiration month "12" and year "2010" 
	Then user enters for credit first name "John" enter last name "Smith" 
	Then user clears address enters "7921 Jonas Branch dr" 
	Then user clears city and enters city "McLean" 
	Then user clears State/Province enters "VA" 
	Then user clears zip code enter "22102" and checks Same as Billing Address
	Then user clicks Secure Purchase button
	Then user verifies the current title with expected