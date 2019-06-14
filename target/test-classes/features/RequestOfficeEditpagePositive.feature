@RequestOfficeEditPagePositive 
Feature: Editing Request Office Page 
	Positive scenario
      
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
Scenario Outline: Edit request office positive scenarios
	Given Reading the Request Office Profile Page 
    Given Click on edit button 
	Then Validates values on request office profile page and request office edit page  
	And The user enters office details Name <officeDetails> 
	And The user read create office start date 
	And The user enters office end date 
	#And The user enters create office end month <EndMonth> 
	#And The user enters create office end day <EndDay> 
	#And The user enters create office end year <EndYear> 
	#And End date should be null
	And The user enters office short name <ShortName> 
	And The user enters Edit office ACC <ACC> 
	And The user enters POC check box <POCCheckBox> 
	And The user enters POC name <POCName> 
	And The user enters POC Email <POCEmail> 
	And The user enters POC Number <POCNumber> 
	And The user Edit select office type contract Awards <contractAwards> 
	And The user enters contract Awards start month <contractAwardsstartMonth> 
	And The user enters contract Awards start day <contractAwardsstartDay> 
	And The user enters contract Awards start year <contractAwardsstartYear> 
	And The user enters contract Awards start year <contractAwardsstartYear> 
	And The user enters contract Awards end month <contractAwardsEndMonth> 
	And The user enters contract Awards end day <contractAwardsEndDay>
	And The user enters contract Awards end year <contractAwardsEndYear> 
	#And The user is contract Awards end date
	And The user edit select office type Financial Awards <FinancialAwards> 
	#And The user enters Financial Awards start month <FinancialAwardsstartMonth> 
	#And The user enters Financial Awards start day <FinancialAwardsstartDay> 
	#And The user enters Financial Awards start year <FinancialAwardsstartYear>
	And The user enters tomorrow is start date for Financial Awards
	And The user has entered Financial Awards end date
	#The User UnSelect Financial Assistance Awards 
	And The User UnSelect Contract Funding 
	And The User UnSelect Financial Assistance Funding  
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
	Then The user click on Confirmation create office button 
	And Click on close button on edit office Request page 
	Then Validating profile values 
	Then Financial Awards End Year is inactive status and end date will be office type end date
	Then contract Awards Active status and end date will be office type end date   
	Given Reading the Request Office Profile Page 
	Given Click on edit button 
	Then Validates values on request office profile page and request office edit page  
	And The user enters office details Name <officeDetails> 
	And The user read create office start date 
	And The user enters office end date 
	And The user enters office short name <ShortName> 
	And The user enters Edit office ACC <ACC> 
	And The user enters POC check box <POCCheckBox> 
	And The user enters POC name <POCName> 
	And The user enters POC Email <POCEmail> 
	And The user enters POC Number <POCNumber> 
	And The User UnSelect Contract Awards
	And The User UnSelect Financial Assistance Awards
	And The User UnSelect Contract Funding
	And The User UnSelect Financial Assistance Funding
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
	Then The user click on Confirmation create office button 
	And Click on close button on edit office Request page
	#Then Validating profile values 
	Then Deselect all office type in request office page  
	
	Examples: 
		|officeDetails|EndMonth|EndDay|EndYear|ShortName|OfficeRegion|ACC|POCCheckBox|POCName      |POCEmail                        |POCNumber |FinancialFunding|contractAwards|contractAwardsstartMonth|contractAwardsstartDay|contractAwardsstartYear|contractAwardsEndMonth|contractAwardsEndDay|contractAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|Contractfunding|contractfundingstartMonth|contractfundingstartDay|contractfundingstartYear|contractfundingEndMonth|contractfundingEndDay|contractfundingEndYear|address          |country            |Zip  |city    |state       |address2         |country2           |Zip2 |officeCity2|state2|address3    |country3            |Zip3 |officeCity3|state3|
		|             |     S  |     S| S     |  Test   |1           |   |POCCheckBox|Shanthi Dutta|shanthi.dutta+SuperAdmin@gsa.gov|5714998137|                |              |                        |                      |                       |                      |                    |                     |              |                         |                        |                       |                       |                     |                       |              |                          |                      |                        |               |                         |                       |                        |                       |                     |                      |2245 spring field|USA - UNITED STATES|     |        |            |                 |                   |     |           |      |            |                    |     |           |      |
		
		
		