@Feeds 
Feature: Feeds 
     Login as Assistance User, Assistance Administrator, OMB Administrator, OMB Analyst, HHS OMBAnalyst1
     Validating context in receive tab 
     Validating context in sent tab 
     
Scenario: Log into the GSA website as createDepartment 
#Given Launch the create browser 
	And The user enters environment department COMP_HOME_PAGE 
	And The user click on department sign in link 
	And Then click on department accept button 
	And The user enters the department email id createDepartment 
	And The user enters the department password alertadminPassword 
	Then The user click on department sign in button 
	And The user want to receive your one time department password myEmail 
	And The user enters department one time access code 
	Then The user click on department one time submit button 
	
Scenario: Click on Assistance listings 
	Given Click on go to Assistance listings 
	And Click on add listing button 
	And Fill the header information details 
	And Fill the overview details 
	And Fill the authorization details 
	And Fill the obligations details 
	And Fill other Financial Information details 
	And Fill criteria for applying details 
	And Fill applying for Assistance details 
	And Fill compliance requirements details 
	And Fill contact information details 
	Then Click on submit button 
	
Scenario: The notification bell 
#Given Click on go to Assistance listings 
	Given User unselect published 
	And Search for a keyword 
	Then Read the timestamp 
	
Scenario: The notification bell 
	Given Click on the notification bell 
	# And Click on show all request
	And Click on Sent tab 
	And Click on Submit AL 
	And Search for the above Assistance Listings keyword
	And Read the text data as Assistnce user 
	Then Context validating in sent tab 
	
	#	
	#Scenario: Validate filter 
	#	#Given Select RoleAssignments 
	#	#Then Unselect RoleAssignments 
	#	And Click on Submit AL
	#	And Select Pending 
	#	Then Unselect Pending 
	#	And Select Approved 
	#	Then Unselect Approved 
	#	And Select Reject 
	#	Then Unselect Reject 
	#	And Select Canceled 
	#	Then Unselect Canceled 
	#	And Select Complete 
	#	Then Select Clear Filters 
	
@DepartmentCreatedSignout 
Scenario: Department created browser sign out 
	Given Department created browser sign out 
	
	
Scenario: Log into the GSA website as AssistanceAdministrator 
#Given Launch the create browser 
	And The user enters environment department COMP_HOME_PAGE 
	And The user click on department sign in link 
	And Then click on department accept button 
	And The user enters the department email id AssistanceAdministrator 
	And The user enters the department password alertadminPassword1 
	Then The user click on department sign in button 
	And The user want to receive your one time department password myEmail 
	And The user enters department one time access code 
	Then The user click on department one time submit button 
	
Scenario: AssistanceAdministrator Recevie notification bell 
	Given Click on the notification 
	And Click on the show all request 
	And Click on received tab 
	And Scroll down 
	And Click on Submit AL 
	And Scroll up
	And Search for the above Assistance Listings keyword 
	And Read the text data 
	Then Validating context in receive tab 
	And Click on Assistance Listings link 
	Then Click on Submit button 
	And Enter the data in submission comment 
	Then Click on submit to OMB 
	
	Given User unselect published 
	And Search for a keyword 
	Then Read the timestamp 
	
	Given Click on the notification 
	And Click on the show all request 
	And Click on Sent tab 
	And Search for the above Assistance Listings keyword 
	And Read the text data as Assistnce user 
	And Read the status of assisting listing 
	Then Context validating in sent tab 
	#And Read the date field	
	
@DepartmentCreatedSignout 
Scenario: Department created browser sign out 
	Given Department created browser sign out 
	
	
Scenario: Log into the GSA website as OMBAdministrator 
#Given Launch the create browser 
	And The user enters environment department COMP_HOME_PAGE 
	And The user click on department sign in link 
	And Then click on department accept button 
	And The user enters the department email id OMBAdministrator 
	And The user enters the department password alertadminPassword1 
	Then The user click on department sign in button 
	And The user want to receive your one time department password myEmail 
	And The user enters department one time access code 
	Then The user click on department one time submit button 
	
Scenario: OMBAdministrator Recevie notification bell 
	Given Click on the notification 
	And Click on the show all request 
	And Click on received tab 
	And Scroll down 
	And Click on Publish AL 
	And Scroll up 
	And Search for the above Assistance Listings keyword
	And Read the text data 
	And Read the status of assisting listing 
	#And Read the status of assisting listing 
	#And Read the Approve status of assisting listing
	Then Validating context in receive tab 
	And Click on Assistance Listings link 
	Then Click on publish button 
	And Enter the data in OMB comment 
	Then Click on assistance publish button 
	
	
@DepartmentCreatedSignout 
Scenario: Department created browser sign out 
	Given Department created browser sign out 
	
Scenario: Log into the GSA website as OMBAnalyst 
#Given Launch the create browser 
	And The user enters environment department COMP_HOME_PAGE 
	And The user click on department sign in link 
	And Then click on department accept button 
	And The user enters the department email id OMBAnalyst 
	And The user enters the department password alertadminPassword1 
	Then The user click on department sign in button 
	And The user want to receive your one time department password myEmail 
	And The user enters department one time access code 
	Then The user click on department one time submit button 
	
Scenario: OMBAnalyst Recevie notification bell 
	Given Click on the notification 
	And Click on the show all request 
	And Click on received tab 
	And Scroll down 
	And Click on Publish AL 
	And Scroll up 
	And Search for the above Assistance Listings keyword
	And Read the text data 
	And Read the Approve status of assisting listing 
	Then Validating context in receive tab 
	And Click on Assistance Listings link 
	
	
@DepartmentCreatedSignout 
Scenario: Department created browser sign out 
	Given Department created browser sign out 
	
	
Scenario: Log into the GSA website as HHS OMBAnalyst 
#Given Launch the create browser 
	And The user enters environment department COMP_HOME_PAGE 
	And The user click on department sign in link 
	And Then click on department accept button 
	And The user enters the department email id HHSOMBAnalyst1 
	And The user enters the department password alertadminPassword1 
	Then The user click on department sign in button 
	And The user want to receive your one time department password myEmail 
	# And The user clicks on password submit button
	And The user enters department one time access code 
	Then The user click on department one time submit button 
	Given Click on go to Assistance listings 
	
Scenario: Go to Assistance listings page 
	Given User click om HHS published 
	And Scroll up
	And Search for a keyword 
	Then No result found 
	
	@DepartmentCreatedSignout 
Scenario: Department created browser sign out 
	Given Department created browser sign out
	
	
	
	
	
   