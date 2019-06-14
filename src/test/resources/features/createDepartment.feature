@DepartmentCreated 
Feature: Create and Editing department and sub tier 
	     1) Create department
         2) Editing department
         3) Create sub tier
         4) Editing sub tier
         5) Create Office
         6) Profile Page
        
@otp 
Scenario: Log into the GSA website 
#Given Launch the create browser 
	And The user enters environment department COMP_HOME_PAGE 
	And The user click on department sign in link 
	And Then click on department accept button 
	And The user enters the department email id createDepartment 
	And The user enters the department password alertadminPassword1 
	Then The user click on department sign in button 
	And The user want to receive your one time department password myEmail 
	# And The user clicks on password submit button
	And The user enters department one time access code 
	Then The user click on department one time submit button 
	
@profile
Scenario: Account name
    And Go to profile page
    And Reading details in account details page
    Then Click on the workspace 
	#And Click on My Role Tab
	#Then Department Admin Validate that the orgs that appear matches with user's role	
	
@createDepartment 
Scenario Outline: Create department 
	Given Click on above Go to Federal Hierarchy link 
	Then The user click on create department button 
	And The user enters department name <DepartmentName> 
	And The user enters start month <startMonth> 
	And The user enters start day <startDay> 
	And The user enters start year <startYear> 
	And The user enters end month <endMonth> 
	And The user enters end day <endDay> 
	And The user enters end year <endYear> 
	And The user enters fh Description data <DescriptionData> 
	And The user enters short Name <shortName> 
	And The user enters fh Agency codes <AgencyCode> 
	And The user enters fh CGAC code <CGAC> 
	And The user enters CFDA code <CFDA> 
	And The user enters fh TAS code <TAS> 
	#And Reading the departments fields
	Then The User click on the department confirm button 
	Then The User click on the confirmation department Submit button 
	
	Examples: 
		| DepartmentName | startMonth | startDay | startYear | endMonth | endDay | endYear | DescriptionData | shortName | AgencyCode |CGAC   | CFDA  | TAS |
		| Test33         |         01 |       08 |      2021 |       01 |     09 |    2023 | testdesc        | ShortBoll |  2345      | 345 |  12     |  12 |
		
		@editDepartment 
		Scenario Outline: Edit Department 
			Given User click on edit agency details button 
			And The user enters edit end month <editEndMonth> 
			And The user enters edit end day <editEndDay> 
			And The user enters edit end year <editEndYear> 
			And The user enters edit Description data <editDescriptionData> 
			And The user enters edit short Name <shortName> 
			Then User click on edit agency details submit button 
			Then User click on edit agency code button 
			And The user enters edit Agency codes <Agency> 
			And The user enters edit CGAC code <CGAC> 
			And The user enters edit CFDA code <CFDA> 
			#And The user enters edit TAS code <TAS> 
			Then User click on edit agency code submit button 
			Examples: 
				| editEndMonth | editEndDay | editEndYear | editDescriptionData | shortName   | CGAC | Agency  | CFDA |
				|           01 |         09 |        2022 | Second Test11       | Second Name |  987 | VFGH    |  6  |
				
				
				@createSubTier 
				Scenario Outline: Create Sub Tier 
					Given Click on Create Sub Tier 
					And The user enters sub Tier details <SubTierName> 
					And The user enters sub tier start month <startMonth> 
					And The user enters sub tier start day <startDay> 
					And The user enters sub tier start year <startYear> 
					And The user enters sub tier end month <endMonth> 
					And The user enters sub tier end day <endDay> 
					And The user enters sub tier end year <endYear> 
					And The user enters sub tier short name <shortName> 
					And The user enters sub tier Agency codes <agencyCode> 
					#And The user enters sub tier OMB code <omb> 
					Then The User click on the sub tier confirm button 
					Then The User click on the sub tier edit button 
					Then The User click on the sub tier submit button 
					When The User click on the confirmation sub tier Submit button 
					Then User navigate to sub Tier profile page 
					
					Examples: 
						|SubTierName | startMonth | startDay | startYear | endMonth | endDay | endYear | shortName | agencyCode |
						| Test13     |         01 |       08 |      2022 |       1  |     09 |    2019 | ShortBoll |  103       |
						
						@editSubTier
						Scenario Outline: Edit Sub Tier 
							Given Click on edit Sub Tier button 
							And The user click on edit sub tier detail 
							And The user edit sub tier end month <endMonth> 
							And The user edit sub tier end day <endDay> 
							And The user edit sub tier end year <endYear> 
							And The user edit sub tier short name <shortName> 
							And The user click on edit sub tier submit button 
							And The user click on edit sub tier codes 
							And The user edit sub tier Agency codes <agencyCode> 
							#And The user edit sub tier OMB code <omb> 
							Then The user click on the sub tier codes submit button 
							Examples: 
								|endMonth|endDay|endYear|shortName|agencyCode|
								|01      |09    |2022   |Edit     |1234      |
								
								
								@RequestOffice 
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
									And The user enters POC check box <POCCheckBox> 
									And The user enters POC name <POCName> 
									And The user enters POC Email <POCEmail> 
									And The user enters POC Number <POCNumber> 
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
									
									And The user select office type Financial funding <FinancialFunding> 
									And The user enters Financial funding start month <FinancialFundingstartMonth> 
									And The user enters Financial funding start day <FinancialFundingstartDay> 
									And The user enters Financial funding start year <FinancialFundingstartYear> 
									And The user enters Financial funding end month <FinancialFundingEndMonth> 
									And The user enters Financial funding end day <FinancialFundingEndDay> 
									And The user enters Financial funding end year <FinancialFundingEndYear> 
	
									
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
									And Click on close button on office Request page 
									Then Check request office email notitication	
									Examples: 
	|officeDetails|startMonth|startDay|startYear|EndMonth|EndDay|EndYear|ShortName|OfficeRegion|ACC|POCCheckBox|POCName      |POCEmail                        |POCNumber |FinancialFunding|FinancialFundingstartMonth|FinancialFundingstartDay|FinancialFundingstartYear|FinancialFundingEndMonth|FinancialFundingEndDay|FinancialFundingEndYear|contractAwards|contractAwardsstartMonth|contractAwardsstartDay|contractAwardsstartYear|contractAwardsEndMonth|contractAwardsEndDay|contractAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|FinancialAwards|FinancialAwardsstartMonth|FinancialAwardsstartDay|FinancialAwardsstartYear|FinancialAwardsEndMonth|FinancialAwardsEndDay|FinancialAwardsEndYear|Contractfunding|contractfundingstartMonth|contractfundingstartDay|contractfundingstartYear|contractfundingEndMonth|contractfundingEndDay|contractfundingEndYear|address          |country            |Zip  |city    |state       |address2         |country2           |Zip2 |officeCity2|state2|address3    |country3            |Zip3 |officeCity3|state3|
	|             |          |        |         |        |      |       |         |            |   |POCCheckBox|Shanthi Dutta|shanthi.dutta+SuperAdmin@gsa.gov|5714998137|                |                          |                        |                         |                        |                      |                       |              |                        |                      |                       |                      |                    |                     |               |                         |                       |                        |                       |                     |                      |               |                          |                      |                        |                         |                    |                     |               |                         |                        |                       |                       |                        |                   |2245 spring field|USA - UNITED STATES|     |        |            |                 |                   |     |           |      |            |                    |     |           |      |
	
										
										
										
										
										#								@activeSubTier 
										#								Scenario Outline: Create Sub-Tier in active department 
										#									Given Click on Federal Hierarchy link 
										#									Then Click on first active department link 
										#									Given Click on Create Sub Tier 
										#									And  The user enters sub Tier details <SubTierName> 
										#									And  The user enters sub tier start month <startMonth> 
										#									And  The user enters sub tier start day <startDay> 
										#									And  The user enters sub tier start year <startYear> 
										#									And  The user enters sub tier end month <endMonth> 
										#									And  The user enters sub tier end day <endDay> 
										#									And  The user enters sub tier end year <endYear> 
										#									And  The user enters sub tier short name <shortName> 
										#									And  The user enters sub tier Agency codes <agencyCode> 
										#									#And  The user enters sub tier OMB code <omb> 
										#									Then  The User click on the sub tier confirm button 
										#									Then  The User click on the sub tier edit button 
										#									Then  The User click on the sub tier submit button 
										#									When  The User click on the confirmation sub tier Submit button 
										#									Then  User navigate to sub Tier profile page 
										#									
										#									Examples: 
										#										|SubTierName | startMonth | startDay | startYear | endMonth | endDay | endYear | shortName | agencyCode |
										#										| Test103     |         01 |       08|      2019|       1 |     09 |    2019 | editName |  103       |
										#										
										#										@subTierEdit2 
										#										Scenario Outline: Edit Sub Tier 
										#										#Given Click on edit Sub Tier button 
										#											And The user click on edit sub tier detail 
										#											And The user edit sub tier end month <endMonth> 
										#											And The user edit sub tier end day <endDay> 
										#											And The user edit sub tier end year <endYear> 
										#											And The user edit sub tier short name <shortName> 
										#											And The user click on edit sub tier submit button 
										#											And The user click on edit sub tier codes 
										#											And The user edit sub tier Agency codes <agencyCode> 
										#											#And The user edit sub tier OMB code <omb> 
										#											Then The user click on the sub tier codes submit button 
										#											Examples: 
										#												|endMonth|endDay|endYear|shortName|agencyCode|
										#												|01      |09    |2019   |Edit     |1234      |
										#												
																				
																								@DepartmentCreatedSignout 
																								Scenario: Department created browser sign out 
																									Given Department browser sign out 
																						