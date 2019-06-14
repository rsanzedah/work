@errorScenario1 
Feature: Validate error meaasage in create department and sub tier page 


@otp 
Scenario: Log into the GSA website 
#Given Launch the message browser
	And environment COMP_HOME_PAGE 
	And The user click on message sign in link 
	And Then click on message accept button 
	And The user enters the message email id createDepartment 
	And The user enters the message password alertadminPassword 
	Then The user click on message sign in button 
	And The user want to receive your one time message password myEmail 
	# And The user clicks on password submit button
	And The user enters message one time access code 
	Then The user click on message one time submit button 
	Given Click on Go to Federal Hierarchy link 
	And click department button 
	
	
@createwithoutdata1 
Scenario: Submit department without filling value 
	Given Submit create depatment button without filling value 
	Then User click the Federal Hierarchy link 
	
@cannotBeEmpty1 
Scenario Outline: Validating negative scenario department 
#Given Click on Go to Federal Hierarchy link 
	And click department button 
	When The user enters agency name <DepartmentName> 
	When The user enters Description <Description> 
	When The user enters CGAC <CGAC> 
	When The user enters Agency code <AgencyCode> 
	#When The user enters OMB <OMB>
	When The user enters TAS <TAS> 
	Then The User click on the department submit button 
	When Validate create department <ErrorMessage> 
	Then  User click the Federal Hierarchy link 
	
	Examples: 
		| DepartmentName | Description | CGAC   | AgencyCode | TAS | ErrorMessage     |
		|                | Apple       |    345 | ZXYA       |  34 | AgencyError      |
		| Test 1         | Boll        |        | ZXYA        |  34 | CGACError        |
		| Test 2         | xyz         | Cat345 |            |  34 | AgencyCodeError  |
		| Test 4         | Cat         |    345 | ZXYA       |     | TASError         |
		| Test 5         |             |    345 | asdf       |  32 | DescriptionError |
		| Test12         | Apple       | ABC1   | ZXYA      |  34 | CGACnumberExist  |
		
		
		@createwithdata1 
		Scenario: Submit department by filling value 
		#And click department button 
			Given Submit create depatment button with filling value 
			Then User click the Federal Hierarchy link 
		@onlyNumber1 
		Scenario Outline: Validating negative scenario department 
		#Given Enter the URL 
			And click department button 
			When The user enters agency name <AgencyName> 
			When The user enters Description <Description> 
			When The user enters CGAC <CGAC> 
			When The user enters Agency code <AgencyCode> 
			#When The user enters OMB <OMB>
			When The user enters CFDC <CFDAValue> 
			When The user enters TAS <TAS> 
			Then The User click on the department submit button 
			#Then The User click on confirmation department Submit button 
			When Validate only number <ErrorMessage> 
			Then  User click the Federal Hierarchy link 
			Examples: 
				| AgencyName                | Description          | CGAC | AgencyCode | CFDAValue | TAS  | ErrorMessage |
				| Department0.10280681      | Testing the text box |  123 |        123 |        42 |  12  | AgencyName   |
				| Test89                    | Testing the text box | abc  | abc        |        32 |  62  | CGACValue1   |
				#| Test68                   | Testing the text box |  123 |        123 |         42 |  12 | OMBValue     |
				| Test89                    | Testing the text box |  123 |        123 | ab         |  12 | CFDAValue    |
				| Test89                    | Testing the text box |  123 |        123 |        34 | bc   | TASValue     |
				
				@specialChar1 
				Scenario: Submit department by filling special char 
				#And click department button 
					Given Submit create depatment button by filling special char 
					Then User click the Federal Hierarchy link 
				@specialChar1 
				Scenario Outline:
				Validateing error message after Submit department by filling special char 
					And click department button 
					When The user enters agency name <AgencyName> 
					When The user enters Description <Description> 
					When The user enters CGAC <CGAC> 
					When The user enters Agency code <AgencyCode> 
					#When The user enters OMB <OMB>
					When The user enters CFDC <CFDAValue> 
					When The user enters TAS <TAS> 
					Then The User click on the department submit button 
					#Then The User click on confirmation department Submit button 
					When Validate only number <ErrorMessage> 
					Then  User click the Federal Hierarchy link 
					Examples: 
						| AgencyName               | Description          | CGAC | AgencyCode | CFDAValue | TAS  | ErrorMessage |
						| ####################     | @@@@@@@@@@@@@@@@@@@@@|  123 |       :::: |        42 |  12  | alphanumeric values|
						| ####################     | @@@@@@@@@@@@@@@@@@@@@|  123 |       123 |         @@ |  12  | CFDAValue   |
						| ####################     | @@@@@@@@@@@@@@@@@@@@@|  ::: |       123 |         42 |  12  | CGACValue1   |
						| ####################     | @@@@@@@@@@@@@@@@@@@@@|  123 |       123 |         42 |  ##  | TASValue   |
						
						@WithoutFillingValue1 
						Scenario: Submit subTier without filling value 
							Given User Click on the search federal hierarchy adminstractor 
							And Click on the first link 
							And Click on the create sub tier button 
							Given Submit create subTier button without filling value 
							And Reading sub tier error message 
							
						@WithoutFillingValue2 
						Scenario Outline:
						Validateing error message submit subTier without filling value 
						# Given User Click on the search federal hierarchy adminstractor
						# And Click on the first link 
							Then User click on the Department name bread crumbs link 
							And Click on the create sub tier button 
							Given Enter sub Tier name <AgencyName> 
							And Enters month <month> 
							And Enters day <day> 
							And Enters year <year> 
							And Enters Agency code <code> 
							Given Submit create subTier button without filling value 
							Then Validate subTier error messages <ErrorMessage> 
							Examples: 
								|AgencyName|month|day|year|code|ErrorMessage|
								|          |12   |24 |2020|1234|Cannot Empty|
								|Test1     |     |   |    |aaaa|Date Required|
								#|Test2     |     |11 |2020|1111|All Date Required|
								|Test3     |12   |10 |2010|    |Agency empty| 
								
								@WithFillingValue1 
								Scenario: Submit subTier by filling value 
									Then User click on the Department name bread crumbs link 
									# Given User Click on the search federal hierarchy adminstractor
									#And Click on the first link 
									And Click on the create sub tier button 
									Given Submit create subTier button by filling value 
									And Reading sub tier values error message 
									
								@WithFillingValue2 
								Scenario Outline:
								Validateing error message submit subTier by filling value 
								# Given User Click on the search federal hierarchy adminstractor
								# And Click on the first link 
									Then User click on the Department name bread crumbs link 
									And Click on the create sub tier button 
									Given Enter sub Tier name <AgencyName> 
									And Enters month <month> 
									And Enters day <day> 
									And Enters year <year> 
									And Enters Agency code <code> 
									Given Submit create subTier button without filling value 
									Then Validate subTier error messages <ErrorMessage> 
									Examples: 
										|AgencyName|month|day|year|code|ErrorMessage|
										#|  Test    |12   |30 |2020|1234|Date|
										|Test1     |12   |30 |2019|;;;;|SubTierAgency|
										
										@Browserclose
										Scenario: Browser close 
											//Given Meaasage Browser close
											Given Department created browser sign out 
											
											
											
											
											
