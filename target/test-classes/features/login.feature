@Login
Feature: Feeds
         
Scenario: Log into the GSA website 
#Given Launch the create browser 
	And The user enters environment department driver COMP_HOME_PAGE 
	And The user click on department sign in link driver
	And Then click on department accept button driver
	And The user enters the department email id driver createDepartment 
	And The user enters the department password driver alertadminPassword 
	Then The user click on department sign in button driver
	And The user want to receive your one time department password driver myEmail 
	# And The user clicks on password submit button driver
	And The user enters department one time access code driver
	Then The user click on department one time submit button driver