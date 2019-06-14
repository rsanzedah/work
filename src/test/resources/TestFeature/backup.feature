@//NegEditDepartmentSubTier 
Feature: Create and Editing department and sub tier 
	1) Create department
         2) Editing department
         3) Create sub tier
         4) Editing sub tier    
         
@otp 
Scenario: Log into the GSA website 
	Given user login into the environment COMP_HOME_PAGE 
	And Click on the sign in link 
	And Click on the accept button 
 And Enters the email id createDepartment 
	And Enters the password alertadminPassword 
	Then Click on the sign in button 
	And Receivev the your one time password myEmail 
	And Enters the one time access code 
	Then Click on the one time submit button 
	Then Click on go the department link 
	Then Navigate into the search page 
	
@EmptySuperAdmineditDepartment 
Scenario Outline: Super Admin Edit Department 
	And click on edit agency details 
	And user enters month <month> 
	And user enters Day <Day> 
	And user enters Year <Year> 
	And user enters Description <Description> 
	And user enters Short Name <ShorName> 
	And click submit agency details 
	And user click edit Agency Codes 
	And user enters Agency Code <Agency> 
	And user enters CGAC code <CGAC> 
	And user enters CFDA <CFDA> 
	#And TAS-2 Code is visible 
	And click submit Agency Code 
	Examples: 
		|month|Day|Year|Description|ShorName|Agency|CGAC|CFDA|
		#|12   |30 |2021|Hiii       |Test    |56FC  |111 |33  |
		
		@EmptySuperAdmineditSubTier 
		Scenario Outline: Super Admin Edit SubTier 
			Given Click on Hierarchy 
			Then navigate into sub-Tier page 
			And click subTier details 
			And user enters subTie month <month> 
			And  user enters subTier end Day <Day> 
			And user enters subTier end Year <Year> 
			And user enters subTier Short Name  <ShortName> 
			And User click submit Details Sub-Tier Details 
			And Click on the edit subtier Agency Code 
			And user enters subTier Agency <Agency> 
			And click submit subTier Agency Code 
			Examples: 
				|month|Day|Year|ShortName|Agency|
				#|12   |12 |2021|test     |123   |                    
				@otp 
				Scenario: Log into the GSA website 
					Given user login into the environment COMP_HOME_PAGE 
					And Click on the sign in link 
					And Click on the accept button 
					And Enters the email id createDepartment 
					And Enters the password alertadminPassword 
					Then Click on the sign in button 
					And Receivev the your one time password myEmail 
					And Enters the one time access code 
					Then Click on the one time submit button 
					Then Click on go the department link 
					Then Navigate into the search page 
					
				@SuperAdmineditDepartment 
				Scenario Outline: Super Admin Edit Department 
					And click on edit agency details 
					And user enters month <month> 
					And user enters Day <Day> 
					And user enters Year <Year> 
					And user enters Description <Description> 
					And user enters Short Name <ShorName> 
					And click submit agency details 
					And user click edit Agency Codes 
					And user enters Agency Code <Agency> 
					And user enters CGAC code <CGAC> 
					And user enters CFDA <CFDA> 
					#And TAS-2 Code is visible 
					And click submit Agency Code 
					Examples: 
						|month|Day|Year|Description|ShorName|Agency|CGAC|CFDA|
						|12   |30 |2021|Hiii       |Test    |56FC  |111 |33  |
						
						@SuperAdmineditSubTier 
						Scenario Outline: Super Admin Edit SubTier 
							Given Click on Hierarchy 
							Then navigate into sub-Tier page 
							And click subTier details 
							And user enters subTie month <month> 
							And  user enters subTier end Day <Day> 
							And user enters subTier end Year <Year> 
							And user enters subTier Short Name  <ShortName> 
							And User click submit Details Sub-Tier Details 
							And Click on the edit subtier Agency Code 
							And user enters subTier Agency <Agency> 
							And click submit subTier Agency Code 
							Examples: 
								|month|Day|Year|ShortName|Agency|
								|12   |12 |2021|test     |123   |