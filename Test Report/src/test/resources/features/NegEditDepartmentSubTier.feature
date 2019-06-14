@NegEditDepartmentSubTier 
Feature: Validate error meaasage in sub tier page
	
         
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
	And serach federal hierarchy administrative pages 
	Then Click on first department link 
	#Then Navigate into the search page 
		
@EmptySuperAdmineditDepartment 
Scenario: This field cannot be empty 
	Given User Click on edit submit agency details button 
	Then  User field cannot be empty field 
	And   User Click edit submit agency code button 
	Then  Reading fields cannot be empty field 
		
@EmptySuperAdmineditDepartment1	
Scenario: 
	Given click on federal hierancy link 
	#Then Navigate into the search page
	And serach federal hierarchy administrative pages 
	Then Click on first department link 	
	
@EmptySuperAdmineditDepartment2 
Scenario Outline: Description field is Empty 
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
	When Validate error message <ErrorMessage> 
	
	Examples: 
		|month|Day|Year|Description|ShorName|Agency|CGAC|CFDA|ErrorMessage|
		|12   |30 |2021|           |Test    |      |    |33  |Description cannot be empty|
		#|12   |30 |2021|Hiii        |Test    |56FC  |111 |33  |Description cannot be empty|
		#|12   |30 |2021|            |Test    |56FC  |111 |33  |Description cannot be empty|
		#|12   |30 |2021|            |Test    |      |111 |33  |Agency Code cannot be empty|
		#|12   |30 |2021|Hello       |Test    |56FC  |    |33  |CGAC cannot be empty|
		
				
@EmptySuperAdmineditDepartment3
		Scenario: 
			Given click on federal hierancy link 
			#Then Navigate into the search page
			And serach federal hierarchy administrative pages 
			Then Click on first department link 
			
		@requiredField 
		Scenario: This field is required 
			Given User Click on edit button field is required 
			Then  Reading field is required 
			#Then  Reading fields cannot be empty field 
			
		@requiredField1	
		Scenario: Required Field
			Given click on federal hierancy link 
			#Then Navigate into the search page
			And serach federal hierarchy administrative pages 
			Then Click on first department link 
			
		@RequiredAgency 
		Scenario Outline: Agency is Required 
			And user click edit Agency Codes 
			And user enters Agency Code <Agency> 
			And user enters CGAC code <CGAC> 
			And user enters CFDA <CFDA> 
			When Validate error message <ErrorMessage> 
			Examples: 
				|Agency|CGAC|CFDA|ErrorMessage|
				|      |123 |33  |Agency field is required|
				
				Scenario: 
					Given click on federal hierancy link 
					#Then Navigate into the search page
					And serach federal hierarchy administrative pages 
					Then Click on first department link 
					
				@RequiredCGAC 
				Scenario Outline: CGAC is Required 
					And user click edit Agency Codes 
					And user enters Agency Code <Agency> 
					And user enters CGAC code <CGAC> 
					And user enters CFDA <CFDA> 
					When Validate error message <ErrorMessage> 
					Examples: 
						|Agency|CGAC|CFDA|ErrorMessage|
						| 12   |    |33  |Agency field is required|
						
						@RequiredCGAC1 
						Scenario: 
							Given click on federal hierancy link 
							#Then Navigate into the search page
							And serach federal hierarchy administrative pages 
							Then Click on first department link 
							
						@CGACANumb 
						Scenario: : Reading CGAC only numbers expection 
							Given User Click on edit button only number 
							Then  Reading only number 
						@federalHierancy
						Scenario: 
							Given click on federal hierancy link 
							#Then Navigate into the search page
							And serach federal hierarchy administrative pages 
							Then Click on first department link 
							
						@RequiredCGACANumb 
						Scenario Outline: CGAC only numbers 
							And user click edit Agency Codes 
							And user enters Agency Code <Agency> 
							And user enters CGAC code <CGAC> 
							#And user enters CFDA <CFDA> 
							And click submit Agency Code 
							When Validate error message <ErrorMessage> 
							Examples: 
								|Agency|CGAC|CFDA|ErrorMessage|
								| 12   |aaa |33  |CGACNum1 only numbers.|
								
								
								@RequiredCGACANumb1
								Scenario: 
									Given click on federal hierancy link 
									#Then Navigate into the search page
									And serach federal hierarchy administrative pages 
									Then Click on first department link 
									
									
									
								@DateField 
								Scenario: date field expection 
									Given Reading date field Expection 
									Then  date field Expection 
									
								@DateField1	
								Scenario: 
									Given click on federal hierancy link 
									#Then Navigate into the search page
									And  serach federal hierarchy administrative pages 
									Then Click on first department link 
									
								@EmptySuperAdmineditDepartment 
								Scenario Outline: Date field 
									And click on edit agency details 
									And user enters month <month> 
									And user enters Day <Day> 
									And user enters Year <Year> 
									And user enters Description <Description> 
									And user enters Short Name <ShorName> 
									And click submit agency details 
									When Validate error message <ErrorMessage> 
									
									Examples: 
										|month|Day|Year|Description|ShorName|ErrorMessage|
										|     |30 |2021|Hello      |Test    |date fields are required|
										
#										
#										Scenario: 
#									Given click on federal hierancy link 
#									#Then Navigate into the search page
#									And serach federal hierarchy administrative pages 
#									Then Click on first department link 
#									
#									@EndDate 
#										Scenario Outline: Department End Date Today 
#											And click on edit agency details 
#											And user enters month <month> 
#											And user enters Day <Day> 
#											And user enters Year <Year> 
#											And user enters Description <Description> 
#											And user enters Short Name <ShorName> 
#											And click submit agency details 
#											#When Validate error message <ErrorMessage> 
#											
#											Examples: 
#												|month|Day|Year|Description|ShorName|
#												| 11  |13  |2018|Hello      |Test    |
								@federalHierancy2				
								Scenario: Click on federal Hierancy
									Given click on federal hierancy link 
									#Then Navigate into the search page
									And serach federal hierarchy administrative pages 
									Then Click on first department link
									And Click on Hierarchy link 
			                        And Click on sub-tier link 
									
									@SubTierDateField 
												Scenario: Date field expection 
													Given Reading date field Expection 
													Then  date field Expection
													
								@federalHierancy3									
								Scenario: Click on federal Hierancy 
									Given click on federal hierancy link 
									#Then Navigate into the search page
									And serach federal hierarchy administrative pages 
									Then Click on first department link
									And Click on Hierarchy link 
			                        And Click on sub-tier link  
									
													
													@EmptySuperAdmineditSubTier 
												Scenario Outline: Super Admin Edit SubTier 
													And click subTier details 
													And user enters subTie month <month> 
													And  user enters subTier end Day <Day> 
													And user enters subTier end Year <Year> 
													And user enters subTier Short Name  <ShortName> 
													And User click submit Details Sub-Tier Details  
													When Validate error message <ErrorMessage> 
													Examples: 
														|month|Day|Year|ShortName|Agency|ErrorMessage|
														|   |12 |2021|test     |123     |date fields are required|
														
				
		
									@federalHierancy4					
									Scenario: 0ne
									Given click on federal hierancy link 
									#Then Navigate into the search page
									And serach federal hierarchy administrative pages 
									Then Click on first department link
									And Click on Hierarchy link 
			                        And Click on sub-tier link 
			                        
			                        @SubTierAgencyCodeField
												Scenario: Agency Code Field Edit SubTier 
												And Click on the edit subtier Agency Code 
													And user clear subTier Agency 
													And click submit subTier Agency Code
													Then Read Agecy code expecrion
									@federalHierancy5				
								 Scenario: two
									Given click on federal hierancy link 
									#Then Navigate into the search page
									And serach federal hierarchy administrative pages 
									Then Click on first department link
									And Click on Hierarchy link 
			                        And Click on sub-tier link  
			                        
												@AgencyCodeSubTier 
												Scenario Outline: Super Admin Edit SubTier
													And Click on the edit subtier Agency Code 
													And user enters subTier Agency <Agency> 
													And click submit subTier Agency Code 
													When Validate error message <ErrorMessage> 
													Examples: 
														|month|Day|Year|ShortName|Agency|ErrorMessage|
														|  08 |12 |2021|test     |      |Agency1 Code cannot be empty |
														
														@DepartmentCreatedSignout 
														Scenario: browser sign out 
														Given Department created browser sign out
															#Given Edit browser sign out
												
										
										
										
												