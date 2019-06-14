@LoginDepartmentSubTierOfficeAdminRunner 
Feature:  Validate login with different users admin
         a) Super Admin
         b) Department Admin
         c) Sub Tier Admin
         d) office Admin       
                
@otp 
Scenario: Log into the GSA website as createDepartment
	And The user login into environment COMP_HOME_PAGE 
	And Click on department sign in link 
	And Click on department accept button 
	And Enters the department email id createDepartment 
	And Enters the department password alertadminPassword1 
	Then Click on department sign in button 
	And Receive your one time department password myEmail 
	# And The user clicks on password submit button
	And Enters department one time access code 
	Then Click on department one time submit button 
@SuperAdmineditDepartment 
Scenario: Super Admin 
	Given User Click on go to department link 
	Then User navigate into search page 
	And User click on edit agency details 
	And The user enters on month 
	And The user enters on Day 
	And The user enters on Year 
	And The user enters on Description 
	And  The user enters on Short Name 
	And click on submit agency details 
	And The user click on edit Agency Codes 
	And The user enters on Agency Code 
	And The user enters on CGAC 
	And The user enters on CFDA Code 
	And TAS-2 Code code is visible 
	And The user click on submit Agency Codes 
@SuperAdmineditSubTier 
Scenario: edit department 
	Given User Click on Hierarchy 
	Then User navigate into sub-Tier page 
	And User click on edit subTier details 
	And The user enters subTie end month 
	And The user enters subTier end Day 
	And The user enters subTier end Year 
	And The user enters subTier Short Name 
	And User click on submit Details Sub-Tier Details 
	And User click on edit subTier Agency Codese 
	And  The user enters on subTier Agency Codes 
	And TAS-2 code is not visible
	And User click on submit subTier Agency Codese 
@SuperAdminSignout 
Scenario: Department created browser sign 
	//Given browser sign out 
	Given Department created browser sign out
@otp 
Scenario: Log into the GSA website as DepartAdmin
	And The user login into environment COMP_HOME_PAGE 
	And Click on department sign in link 
	And Click on department accept button 
	And Enters the department email id DepartAdmin 
	And Enters the department password alertadminPassword 
	Then Click on department sign in button 
	And Receive your one time department password myEmail 
	# And The user clicks on password submit button
	And Enters department one time access code 
	Then Click on department one time submit button 
@DepartmentAdmin 
Scenario: Department Admin 
	Given User Click on go to department link 
	And Department Admin select check box in Organizations that I administer
	And Validate search results page
	Then User click on first subTier link
	And TAS-2 code is not visible
	Given User Click on Hierarchy 
	Then User click on first office
	And TAS-2 code is not visible
	Given User Click on Hierarchy 
	Then User click on first office
	And TAS-2 code is not visible
	And Go to profile page
	And Click on My Role Tab
	Then Department Admin Validate that the orgs that appear matches with user's role
	
@DepartmentAdminSignout 
Scenario: Department created browser sign 
	//Given browser sign out
	Given Department created browser sign out 
@otp 
Scenario: Log into the GSA website as SubTierAdmin
	And The user login into environment COMP_HOME_PAGE 
	And Click on department sign in link 
	And Click on department accept button 
	And Enters the department email id SubTierAdmin 
	And Enters the department password alertadminPassword 
	Then Click on department sign in button 
	And Receive your one time department password myEmail 
	# And The user clicks on password submit button
	And Enters department one time access code 
	Then Click on department one time submit button 
@SubTierAdminSubTier  
Scenario: SubTier Admin 
	Given User Click on go to department link 
	And User select check box in Organizations that I administer
	And Validate search results page
	#And select subTier check box
	Then User click on first subTier link
	Given User Click on Hierarchy 
	Then User click on first office
	#Then User click on the subTier
	And TAS-2 code is not visible
	And Go to profile page
	And Click on My Role Tab
	Then subTier Validate that the orgs that appear matches with user's role 
	  
@subTierAdminSignOut 
Scenario: Department created browser sign 
	//Given browser sign out 
	Given Department created browser sign out     
@otp 
Scenario: Log into the GSA website as officeAdmin
	And The user login into environment COMP_HOME_PAGE 
	And Click on department sign in link 
	And Click on department accept button 
	And Enters the department email id officeAdmin 
	And Enters the department password alertadminPassword 
	Then Click on department sign in button 
	And Receive your one time department password myEmail 
	# And The user clicks on password submit button
	And Enters department one time access code 
	Then Click on department one time submit button 
@officeAdmin 
Scenario: Office Admin 
	Given User Click on go to department link
	And Office admin select check box in Organizations that I administer
	#And select subTier check box
	And Validate search results page
	Then User click on first subTier link
	#Then User click on the subTier
	And TAS-2 code is not visible 
	Given User Click on Hierarchy 
	Then User click on first office
	
	Given User Click on Hierarchy 
	Then User click on first office
	
	And Go to profile page
	And Click on My Role Tab
	Then Validate that the orgs that appear matches with user's role
	
	@subTierAdminSignOut 
Scenario: Department created browser sign 
	#Given browser sign out
	Given Department created browser sign out
