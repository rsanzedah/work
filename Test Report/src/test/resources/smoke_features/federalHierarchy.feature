@SmokeTest
Feature:  High leavel Smoketing 


 @otp1 
Scenario: Log into the GSA website 
	#Given Launch Smoke browser 
	And The user enters environment Smoke COMP_HOME_PAGE 
	And The user click on Smoke sign in link 
	And Then click on Smoke accept button 
	And The user enters the Smoke email id createDepartment 	
	And The user enters the Smoke password alertadminPassword 
	Then The user click on Smoke sign in button 
	And The user want to receive your one time Smoke password myEmail 
	# And The user clicks on password submit button
	And The user enters Smoke one time access code 
	Then The user click on Smoke one time submit button 
	
	@FHWidget  
Scenario: FH widget links
	Given Click on the last 90 days radio button 
	And Click on the organization started
	Then The user navigates into organization events page
	Given Click on the scheduled for next 90 days
	#And Click on the organization
	#Then Navigates into organization event
	And Click on the scheduled to start 
	Then Navigates into scheduled organization events page
	
	@createDept
	Scenario: Create department 
	Given User click on above Go to Federal Hierarchy
	And The user click on createdept button
	Then Navigate into create department page
	And The user click on cancel button
	Given The user click on first link
	Then Navigate into federal hierarchy deparment page 
	And The click on edit button
	And The click on edit cancel button
	Given The user click on create sub tier button
	Then The user click on create sub tier cancel button 
	
	
	
		
@DeptSignout 
Scenario: 
	Given Departmen browser sign out 
	
	
	
	
	