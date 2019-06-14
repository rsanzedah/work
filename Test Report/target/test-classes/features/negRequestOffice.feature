@negativeOffice 
Feature: Validate error meaasage in office page 
	Negative Request office
         

@otp 
Scenario: Log into the GSA website as createDepartment 
	And The user login into environment COMP_HOME_PAGE 
	And Click on department sign in link 
	And Click on department accept button 
	And Enters the department email id createDepartment 
	And Enters the department password alertadminPassword 
	Then Click on department sign in button 
	And Receive your one time department password myEmail 
	# And The user clicks on password submit button
	And Enters department one time access code 
	Then Click on department one time submit button 
	
	
@officeAdmin 
Scenario: Validation on empty field in request office page 
	Given User Click on go to department link 
	Then User navigate into search page 
	Given User Click on Hierarchy 
	Then  Click on the first subTier link 
	Given Create office submit button 
	And Scroll down request office page 
	And Click on the mailing address plus symbol 
	And Select address type 
	And Click on the first plus symbol 
	Then The user click on submit create office button 
	And Validation on empty field in request office page 
	
@Requestoffice1 
Scenario Outline: Validate required fields error messages 
	And Scroll up 
	Given User click on subTier breadcrumb link 
	Given Create office submit button 
	And The user enters office details Name <officeDetails> 
	And The user enters create office start month <startMonth> 
	And The user enters create office start day <startDay> 
	And The user enters create office start year <startYear> 
	And The user enters create office end month <EndMonth> 
	And The user enters create office end day <EndDay> 
	And The user enters create office end year <EndYear> 
	And The user enters office ACC <ACC> 
	And The user enters POC check box <POCCheckBox> 
	And The user enters POC name <POCName> 
	And The user enters POC Email <POCEmail> 
	And The user enters POC Number <POCNumber> 
	And The user enters street address <address> 
	And The user enters country <country> 
	And The enters zip <Zip> 
	And The enters city <city> 
	And The enters state <state> 
	Then The user click on submit create office button 
	And Validation on error messages <ErrorMessages> 
	Examples: 
		|officeDetails|startMonth|startDay|startYear|EndMonth|EndDay|EndYear|ACC|POCCheckBox|POCName|POCEmail|POCNumber|address|country|Zip|city|state|ErrorMessages|
#	    |Test16       |   4      |  4     |   4     |        |      |       |121|           |       |         |        |       |       |   |    |     |UniqueName   |
#		|Test161      |          |        |         |   2    |  2   | 2     |x  |           |       |         |        |       |       |   |    |     |AfterDate    |
#		|Test161      |          |        |         |  2     |2     | 2     |x  |           |       |         |        |       |       |   |    |     |EndDate      |
#		|Test161      |          |        |         |        |      |       |  x|           |       |shanthi. |571     |       |       |   |    |     |InvalidPhone |
	
		
		@Requestoffice2 
		Scenario Outline: Validation on Awards office types error messages 
			And Scroll up 
			Given User click on subTier breadcrumb link 
			Given Create office submit button 
			And The user enters office details Name <officeDetails> 
			And The user enters create office start month <startMonth> 
			And The user enters create office start day <startDay> 
			And The user enters create office start year <startYear> 
			And The user enters create office end month <EndMonth> 
			And The user enters create office end day <EndDay> 
			And The user enters create office end year <EndYear> 
			And Select Poc check box 
			#			And The user enters POC check box <POCCheckBox> 
			#			And The user enters POC name <POCName> 
			#			And The user enters POC Email <POCEmail> 
			#			And The user enters POC Number <POCNumber> 
			And The user select office type contract Awards <contractAwards> 
			And The user enters contract Awards start month <contractAwardsstartMonth> 
			And The user enters contract Awards start day <contractAwardsstartDay> 
			And The user enters contract Awards start year <contractAwardsstartYear> 
			And The user enters contract Awards end month <contractAwardsEndMonth> 
			And The user enters contract Awards end day <contractAwardsEndDay> 
			And The user enters contract Awards end year <contractAwardsEndYear> 
			And The user select office type Financial Awards <FinancialAwards> 
			And The user enters Financial Awards start month <FinancialAwardsstartMonth> 
			And The user enters Financial Awards start day <FinancialAwardsstartDay> 
			And The user enters Financial Awards start year <FinancialAwardsstartYear> 
			And The user enters Financial Awards end month <FinancialAwardsEndMonth> 
			And The user enters Financial Awards end day <FinancialAwardsEndDay> 
			And The user enters Financial Awards end year <FinancialAwardsEndYear> 
			
			And Click on the mailing address plus symbol 
			And The user enters street address <address> 
			And The user enters country <country> 
			And The enters zip <Zip> 
			And The enters city <city> 
			And The enters state <state> 
			And Select address type 
			And Click on the first plus symbol 
			And The user enters awards office TAC3 street address <address3> 
			And The user enters TAC3 country <country3> 
			And The enters TAC3 zip <Zip3> 
			And The enters TAC3 city <officeCity3> 
			And The enters TAC3 state <state3> 
			And The user enters awards office TAC2 street address <address2> 
			And The user enters TAC2 country <country2> 
			And The enters TAC2 zip <Zip2> 
			And The enters TAC2 city <officeCity2> 
			And The enters TAC2 state <state2>  
			Then The user click on submit create office button 
			And Validation on error messages <ErrorMessages> 
			
			Examples: 
				|officeDetails|startMonth|startDay|startYear|EndMonth|EndDay|EndYear|contractAwards|contractAwardsstartMonth|contractAwardsstartDay|contractAwardsstartYear|contractAwardsEndMonth|contractAwardsEndDay|contractAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|address|country|Zip|city|state|address2|country2|Zip2|officeCity2|state2|address3|country3|Zip3|officeCity3|state3|ErrorMessages|
#				|Test161      |          |        |         |        |      |       |              |                        |                      |                       |             M        |      D             |                     |               |                         |                       |                         |     M                |         D           |                      |       |       |   |    |     |        |        |    |           |      |        |        |    |           |      |ContractAwards4|
#				|Test101      |          |        |         |        |      |       |              |   M                    |     D                |                       |                      |                    |                     |               |  M                      |   D                   |                         |                      |                     |                      |       |       |   |    |     |        |        |    |           |      |        |        |    |           |      |ContractAwards12|			    
#				|Test161      |          |        |         |        |      |       |              |                        |                      |                       |     S                |       S            |                     |               |                         |                       |                         |      S               |        S            |                      |       |       |   |    |     |        |        |    |           |      |        |        |    |           |      |FinancialAssistanceAwards3|
							
				@Requestoffice3 
				Scenario Outline: Validation on Funding office types error messages 
					And Scroll up 
					Given User click on subTier breadcrumb link 
					Given Create office submit button 
					And The user enters office details Name <officeDetails> 
					And The user enters create office start month <startMonth> 
					And The user enters create office start day <startDay> 
					And The user enters create office start year <startYear> 
					And The user enters create office end month <EndMonth> 
					And The user enters create office end day <EndDay> 
					And The user enters create office end year <EndYear> 
					And Select Poc check box 
					And The user select office type Financial funding <FinancialFunding> 
					And The user enters Financial funding start month <FinancialFundingstartMonth> 
					And The user enters Financial funding start day <FinancialFundingstartDay> 
					And The user enters Financial funding start year <FinancialFundingstartYear> 
					And The user enters Financial funding end month <FinancialFundingEndMonth> 
					And The user enters Financial funding end day <FinancialFundingEndDay> 
					And The user enters Financial funding end year <FinancialFundingEndYear> 
					And The user select office type contract funding  <Contractfunding> 
					And The user enters other contract funding start month <contractfundingstartMonth> 
					And The user enters other contract funding start day <contractfundingstartDay> 
					And The user enters other contract funding start year <contractfundingstartYear> 
					And The user enters other contract funding end month <contractfundingEndMonth> 
					And The user enters other contract funding end day <contractfundingEndDay> 
					And The user enters other contract funding end year <contractfundingEndYear> 
					And The user enters street address <address> 
					And The user enters country <country> 
					And The enters zip <Zip> 
					And The enters city <city> 
					And The enters state <state> 
					And The user enters TAC2 street address <address2> 
					And The user enters TAC2 country <country2> 
					And The enters TAC2 zip <Zip2> 
					And The enters TAC2 city <officeCity2> 
					And The enters TAC2 state <state2> 
					And The user enters TAC3 street address <address3> 
					And The user enters TAC3 country <country3> 
					And The enters TAC3 zip <Zip3> 
					And The enters TAC3 city <officeCity3> 
					And The enters TAC3 state <state3> 
					Then The user click on submit create office button
					And Validation on funding error messages <ErrorMessages> 
									
					Examples: 
						|officeDetails|startMonth|startDay|startYear|EndMonth|EndDay|EndYear|FinancialFunding|FinancialFundingstartMonth|FinancialFundingstartDay|FinancialFundingstartYear|FinancialFundingEndMonth|FinancialFundingEndDay|FinancialFundingEndYear|Contractfunding|contractfundingstartMonth|contractfundingstartDay|contractfundingstartYear|contractfundingEndMonth|contractfundingEndDay|contractfundingEndYear|address|country|Zip|city|state|address2|country2|Zip2|officeCity2|state2|address3|country3|Zip3|officeCity3|state3 |ErrorMessages|
#						|Test161      |          |        |         |        |      |       |                |                          |                        |                         |           M            |          D           |                       |     x         |         x               |        x              |        x               |     x                 |         x           |        x             |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |FinancialAssistanceFunding12|
#						|Test161      |          |        |         |        |      |       |                |                          |                        |                         |          M             |        D             |                       |     x         |       x                 |      x                |       x                |     x                 |         x           |        x             |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |FinancialAssistanceFunding2|
#						|Test161      |          |        |         |        |      |       |                |                          |                        |                         |           S            |         S            |                       |     x         |     x                   |    x                  |      x                 |    x                  |        x            |         x            |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |FinancialAssistanceFunding3|
#						|Test101      |          |        |         |        |      |       |                | M                        |  D                     |                         |                        |                      |                       |     x         |  x                      |   x                   |      x                 |      x                |   x                 |  x                   |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |FinancialAssistanceFunding4|
#						|Test101      |          |        |         |        |      |       |                | M                        |  D                     |                         |                        |                      |                       |      x        |  x                      |   x                   |      x                 |      x                |   x                 |   x                  |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |FinancialAssistanceFunding5|
#						|Test161      |          |        |         |        |      |       |x               |  x                       |             x          |     x                   |    x                   |    x                 |   x                   |               |                         |                       |                        |      M                |   D                 |                      |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |ContractFunding12|						
#						|Test161      |          |        |         |        |      |       |x               |   x                      |            x           |    x                    |    x                   |     x                |    x                  |               |                         |                       |                        |       M               |   D                 |                      |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |ContractFunding2|
#						|Test161      |          |        |         |        |      |       |  x             |    x                     |          x             |    x                    |     x                  |      x               |     x                 |               |                         |                       |                        |        S              |   S                 |                      |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |ContractFunding3|
#						|Test101      |          |        |         |        |      |       |x               |     x                    |     x                  |    x                    |      x                 |       x              |      x                |               |M                        | D                     |                        |                       |                     |                      |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |ContractFunding4|
#						|Test101      |          |        |         |        |      |       | x              |     x                    |     x                  |    x                    |       x                |       x              |       x               |               |M                        | D                     |                        |                       |                     |                      |       |       |   |    |     |        |        |    |           |      |        |        |    |           |       |ContractFunding5|
							
						
		@OfficeAddress 
Scenario Outline: Validation on office address error messages 
	And Scroll up 
	Given User click on subTier breadcrumb link 
	Given Create office submit button 
	And The user enters office details Name <officeDetails> 
	And The user enters create office start month <startMonth> 
	And The user enters create office start day <startDay> 
	And The user enters create office start year <startYear> 
	And Select Poc check box 
	And The user select office type contract Awards <contractAwards> 
	And Click on the mailing address plus symbol 
	And The user enters street address <address> 
	And The user enters country <country> 
	And The enters zip <Zip> 
	And The enters city <city> 
	And The enters state <state> 
	And Select address type 
	And Click on the first plus symbol 
	And The user enters awards office TAC3 street address <address3> 
	And The user enters TAC3 country <country3> 
	And The enters TAC3 zip <Zip3> 
	And The enters TAC3 city <officeCity3> 
	And The enters TAC3 state <state3> 
	And The user enters awards office TAC2 street address <address2> 
	And The user enters TAC2 country <country2> 
	And The enters TAC2 zip <Zip2> 
	And The enters TAC2 city <officeCity2> 
	And The enters TAC2 state <state2> 
	#And Click on the second cross button 
	#And Click on the first cross button 
	And Deselect Contract Awards 
	And The user select office type Financial funding <FinancialFunding> 
	And Deselect Financial Assistance Funding
	#And Scroll up to office type
	And The user select office type Financial Awards <FinancialAwards> 
	Then Shipping address word Required is visible 
	Then Billing address word Required is visible 
	Then Shipping address TAC2 cross symbol is visible 
	Then Billing address TAC3 cross symbol is visible 

	Examples: 
		|officeDetails|startMonth|startDay|startYear|contractAwards|address|country|Zip |city|state|address2|country2|Zip2|officeCity2|state2|address3|country3|Zip3|officeCity3|state3|FinancialFunding|address2|country2|Zip2|city2|state2|address3|country3|Zip3|city3|state3|FinancialAwards|
#		|Test131      |          |        |         |              |       |       |    |    |     |        |        |    |           |      |        |        |    |           |      |                |        |        |    |     |      |        |        |    |     |      |               |
		
		
		
						
		@OfficeAddress4 
Scenario Outline: Validation on office address error messages 
	And Scroll up 
	Given User click on subTier breadcrumb link 
	Given Create office submit button 
	And The user enters office details Name <officeDetails> 
	And The user enters create office start month <startMonth> 
	And The user enters create office start day <startDay> 
	And The user enters create office start year <startYear> 
	And Select Poc check box 
	And The user select office type contract Awards <contractAwards> 
	#And The user select office type Financial Awards <FinancialAwards> 
	And Click on the mailing address plus symbol 
	And The user enters street address <address> 
	And The user enters country <country> 
	And The enters zip <Zip> 
	And The enters city <city> 
	And The enters state <state> 
	And Select address type 
	And Click on the first plus symbol 
	And The user enters awards office TAC3 street address <address3> 
	And The user enters TAC3 country <country3> 
	And The enters TAC3 zip <Zip3> 
	And The enters TAC3 city <officeCity3> 
	And The enters TAC3 state <state3> 
	And The user enters awards office TAC2 street address <address2> 
	And The user enters TAC2 country <country2> 
	And The enters TAC2 zip <Zip2> 
	And The enters TAC2 city <officeCity2> 
	And The enters TAC2 state <state2> 
	Then Shipping address TAC2 cross symbol is visible 
	Then Billing address TAC3 cross symbol is visible
	
	And Click on the second cross button 
	Then The user click on submit create office button 
	Then The user click on Confirmation create office button 
	And Click on edit button on confirmation office Request page
	And Deselect Contract Awards
	And The user select office type contract funding  <Contractfunding> 
	  And The user select office type Financial Awards <FinancialAwards>
	
	And The user enters awards office TAC3 street address <address3> 
	And The user enters TAC3 country <country3> 
	And The enters TAC3 zip <Zip3> 
	And The enters TAC3 city <officeCity3> 
	And The enters TAC3 state <state3> 
	
	Then Shipping address word Required is visible 
	Then Billing address word Required is visible 
	Then Shipping address TAC2 cross symbol is visible 
	Then Billing address TAC3 cross symbol is visible
	Then The user click on submit create office button
	Then The user click on Confirmation create office button 
	And Click on close button on office Request page
	Then Check request office email notitication

	Examples: 
		|officeDetails|startMonth|startDay|startYear|FinancialAwards|address|country|Zip |city|state|address2|country2|Zip2|officeCity2|state2|address3|country3|Zip3|officeCity3|state3|FinancialFunding|address2|country2|Zip2|city2|state2|address3|country3|Zip3|city3|state3|Contractfunding|contractAwards|
		|             |          |        |         |               |       |       |    |    |     |        |        |    |           |      |        |        |    |           |      |                |        |        |    |     |      |        |        |    |     |      |               |              |   
		
#		@DepartmentCreatedSignout 
#		Scenario: Department created browser sign out 
#		Given Department created browser sign out
		
	 	
		
	#	And Deselect Contract Awards
	#	And Deselect Financial Assistance Awards
	#	And Deselect Contract Funding
	#	And Deselect Financial Assistance Funding
	
	#   Then Shipping address word Required is visible	
	# Then Office address Required is not visible
	# Then Billing address word Required is visible	
	# Then Shipping address TAC2 cross symbol is visible
	# Then Billing address TAC3 cross symbol is visible	 
	