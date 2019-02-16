@MT003
Feature: Newtour selecting a flight
Scenario: Slecting a flight for roundtrip
	Given User selects departing Unified Airlines
	Then User selects return Unified Airlines
	Then user clicks continue button
	And user verifies Book a Flight page title