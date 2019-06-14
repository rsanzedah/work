@GMail 
Feature: GMail
      
@otp 
Scenario: Log into the GSA website as createDepartment 
	And The user login into environment COMP_HOME_PAGE  
	And Receive your one time department password myEmail
	Then Check request office email notitication
	And Search for an email  
	
	#And Enters department one time access code 
	Then Click on department one time submit button 
	