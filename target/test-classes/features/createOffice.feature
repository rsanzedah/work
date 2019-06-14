@office 
Feature: Create and Editing office 
	1) Create office
      
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
	
		
@profile
Scenario: Account name
    And Go to profile page
    And Reading details in account details page
    Then Click on the workspace 
	
@officeAdmin 
Scenario: My Workspace 
	Given User Click on go to department link 
	Then User navigate into search page 
	Given User Click on Hierarchy 
	Then  Click on the first subTier link 
	
@createOffice1
Scenario Outline: Create office 
	Given Click on edit button 
	And The user enters office details Name <officeDetails> 
	And The user enters create office start month <startMonth> 
	And The user enters create office start day <startDay> 
	And The user enters create office start year <startYear> 
	And The user enters create office end month <EndMonth> 
	And The user enters create office end day <EndDay> 
	And The user enters create office end year <EndYear> 
	And The user enters office short name <ShortName> 
	And The user enters office office region <OfficeRegion> 
	And The user enters office ACC <ACC> 
#   And Select Poc check box 
	And The user enters POC check box <POCCheckBox> 
    And The user enters POC name <POCName> 
	And The user enters POC Email <POCEmail> 
	And The user enters POC Number <POCNumber> 
	And The user select office type Financial funding <FinancialFunding> 
	And The user enters Financial funding start month <FinancialFundingstartMonth> 
	And The user enters Financial funding start day <FinancialFundingstartDay> 
	And The user enters Financial funding start year <FinancialFundingstartYear> 
	And The user enters Financial funding end month <FinancialFundingEndMonth> 
	And The user enters Financial funding end day <FinancialFundingEndDay> 
	And The user enters Financial funding end year <FinancialFundingEndYear> 
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
	Then The user click on submit create office button 
	Then The user click on Confirmation create office button 
	And Click on close button on office Request page
	Then Check request office email notitication 
	
	Examples: 
	|officeDetails|startMonth|startDay|startYear|EndMonth|EndDay|EndYear|ShortName|OfficeRegion|ACC|FinancialFunding|FinancialFundingstartMonth|FinancialFundingstartDay|FinancialFundingstartYear|FinancialFundingEndMonth|FinancialFundingEndDay|FinancialFundingEndYear|contractAwards|contractAwardsstartMonth|contractAwardsstartDay|contractAwardsstartYear|contractAwardsEndMonth|contractAwardsEndDay|contractAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|Contractfunding|contractfundingstartMonth|contractfundingstartDay|contractfundingstartYear|contractfundingEndMonth|contractfundingEndDay|contractfundingEndYear|address          |country            |Zip  |city    |state       |address2         |country2           |Zip2 |officeCity2|state2|address3    |country3            |Zip3 |officeCity3|state3|POCCheckBox|POCName|POCEmail|POCNumber|
#	|             |          |        |         |        |      |       | Tes     |  1         |   |                |                          |                        |                         |                        |                      |                       |              |                        |                      |                       |                      |                    |                     |               |                         |                       |                        |                       |                     |                      |               |                          |                      |                        |                         |                    |                     |               |                         |                        |                       |                       |                        |                   |2245 spring field|USA - UNITED STATES|     |        |            |                 |                   |     |           |      |            |                    |     |           |      |           |       |        |         |
		
		
		
		@createOffice123
    Scenario Outline: Create office Page
	Given Click on edit button
	And The user enters office details Name <officeDetails> 
	And The user enters create office start month <startMonth> 
	And The user enters create office start day <startDay> 
	And The user enters create office start year <startYear> 
	And The user enters create office end month <EndMonth> 
	And The user enters create office end day <EndDay> 
	And The user enters create office end year <EndYear> 
	And The user enters office short name <ShortName> 
	And The user enters office office region <OfficeRegion> 
	And The user enters office ACC <ACC> 
	And Select Poc check box 
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
	And Select Billing Address check box
	Then Validate Billing Addresss data
	And Select shipping address check box
	Then Validate shipping addresss data
	Then The user click on submit create office button 
	Then The user click on Confirmation create office button 
	And Click on close button on office Request page
	Then Check request office email notitication 
	
	Examples: 
	|officeDetails|startMonth|startDay|startYear|EndMonth|EndDay|EndYear|ShortName|OfficeRegion|ACC|contractAwards|contractAwardsstartMonth|contractAwardsstartDay|contractAwardsstartYear|contractAwardsEndMonth|contractAwardsEndDay|contractAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|address             |country            |Zip  |city    |state       |
	|             |          |        |         |        |      |       | Tes     |  1         |   |              |                        |                      |                       |                      |                    |                     |               |                         |                       |                        |                       |                     |                      |               |                          |                      |                        |                       |                     |                      |   2245 spring field|USA - UNITED STATES|     |        |            |                 
		


		
		#@DepartmentCreatedSignout 
		#Scenario: Department created browser sign out 
		#	Given Department created browser sign out 
			
			
			
												