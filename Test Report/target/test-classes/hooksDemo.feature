Feature: Registration in MercuryFlight site

	#Scenarios
	@Registration
	Scenario: Single User Registration process
	    When Registration page Display
	    Then Enter Valid Data
	     And Close
	     
	#Scenarios
	@Registration1
	Scenario: Single User Registration process one
	    When Registration page Display one
	    Then Enter Valid Data one
	     And Close one
	     
	 
	     