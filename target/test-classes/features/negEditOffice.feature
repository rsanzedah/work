@NegEditReuqstoffice 
Feature: Editing request office page negative scenarios.	
      
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
	Then User navigate into search page and serach for gsa department 
	Given User Click on Hierarchy 
	Then  Click on the first subTier link 
	And  Read agency name and agency code on subTier profile page 
	Given User Click on Hierarchy 
	Then  Click on the first subTier link 
	
@EditRequestOffice 
Scenario: Validating not editable edit request office
	Given Click on edit button
	And Edit office start date is not editable
	And AAC code is not editable
	And The requestor is not edible
	
	Scenario Outline: Validating date fields edit request office
	And The user enters create office end month <EndMonth> 
	And The user enters create office end day <EndDay> 
	And The user enters create office end year <EndYear>
    And Select Poc check box 
	And The user Edit select office type contract Awards <contractAwards> 
	And The user enters contract Awards start month <contractAwardsstartMonth> 
	And The user enters contract Awards start day <contractAwardsstartDay> 
	And The user enters contract Awards start year <contractAwardsstartYear> 
	And The user enters contract Awards end month <contractAwardsEndMonth> 
	And The user enters contract Awards end day <contractAwardsEndDay> 
	And The user enters contract Awards end year <contractAwardsEndYear> 
	
	And The user edit select office type Financial Awards <FinancialAwards> 
	And The user enters Financial Awards start month <FinancialAwardsstartMonth> 
	And The user enters Financial Awards start day <FinancialAwardsstartDay> 
	And The user enters Financial Awards start year <FinancialAwardsstartYear> 
	And The user enters Financial Awards end month <FinancialAwardsEndMonth> 
	And The user enters Financial Awards end day <FinancialAwardsEndDay> 
	And The user enters Financial Awards end year <FinancialAwardsEndYear> 
	
	And The user edit select office type contract funding  <Contractfunding> 
	And The user enters other contract funding start month <contractfundingstartMonth> 
	And The user enters other contract funding start day <contractfundingstartDay> 
	And The user enters other contract funding start year <contractfundingstartYear> 
	And The user enters other contract funding end month <contractfundingEndMonth> 
	And The user enters other contract funding end day <contractfundingEndDay> 
	And The user enters other contract funding end year <contractfundingEndYear> 
	
	And The user edit select office type Financial funding <FinancialFunding> 
	And The user enters Financial funding start month <FinancialFundingstartMonth> 
	And The user enters Financial funding start day <FinancialFundingstartDay> 
	And The user enters Financial funding start year <FinancialFundingstartYear> 
	And The user enters Financial funding end month <FinancialFundingEndMonth> 
	And The user enters Financial funding end day <FinancialFundingEndDay> 
	And The user enters Financial funding end year <FinancialFundingEndYear> 
	
#	And The user enters street address <address> 
#	And The user enters country <country> 
#	And The enters zip <Zip> 
#	And The enters city <city> 
#	And The enters state <state> 
	Then The user click on submit create office button
	Then Validating error message edits office page <EditOfficeErrorMessage>
	Examples: 
		|officeDetails|EndMonth|EndDay|EndYear|ShortName|OfficeRegion|ACC|POCCheckBox|POCName      |POCEmail                        |POCNumber |FinancialFunding|FinancialFundingstartMonth|FinancialFundingstartDay|FinancialFundingstartYear|FinancialFundingEndMonth|FinancialFundingEndDay|FinancialFundingEndYear|contractAwards|contractAwardsstartMonth|contractAwardsstartDay|contractAwardsstartYear|contractAwardsEndMonth|contractAwardsEndDay|contractAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|Contractfunding|contractfundingstartMonth|contractfundingstartDay|contractfundingstartYear|contractfundingEndMonth|contractfundingEndDay|contractfundingEndYear|address          |country            |Zip  |city    |state       |EditOfficeErrorMessage|
		|             |  P     |   P  |P      |  Test   |1           |   |POCCheckBox|Shanthi Dutta|shanthi.dutta+SuperAdmin@gsa.gov|5714998137|                |                          |                        |                         |         P              |     P                |                       |              |                        |                      |                       |    P                 | P                  |                     |               |                         |                       |                        |            P          |       P             |                      |               |                         |                       |                        |           P           |      P              |                      |               |                         |                        |                       |         P             |       P             |                      |2245 spring field|USA - UNITED STATES|     |        |            |   Office Type        |     
		 
	