#@exceptionHandling 
#Feature: Create office exception handling 
#
#
#@otp 
#Scenario: Log into the GSA website 
##Given Launch the create browser 
#	And The user enters office COMP_HOME_PAGE 
#	And The user click on office exception sign in link 
#	And Then click on office exception accept button 
#	And The user enters the office exception email id createDepartment 
#	And The user enters the office exception password alertadminPassword 
#	Then The user click on office exception sign in button 
#	And The user want to receive your one time office exception password myEmail 
#	# And The user clicks on password submit button
#	And The user enters office exception one time access code 
#	Then The user click on office exception one time submit button 
#	
#@FederalHierarchy 
#Scenario: Click on Federal Hierarchy 
#	Given Click Goto Federal Hierarchy link 
#	And Click on the first subTier 
#	And Click on hierarchy link 
#	And Click on any active department link 
#	
#	
#	
#@emptyfields 
#Scenario: Create office empty fields 
#	Given User click on Create office submit button 
#	Then user click on create office submit office button 
#	Then user click sub-tier breadcrumbs link 
#	
#@numbersfields 
#Scenario: Create office number fields 
#	Given User click on Create office submit button 
#	And The user enters invalid start month 
#	Then user click on submit invalid date office button 
#	Then user click sub-tier breadcrumbs link 
#	
#	
#@createOffice 
#Scenario Outline: Create office 
#	Given User click on Create office submit button 
#	And The user enters office details correct Name <officeDetails> 
#	And The user enters create office correct start month <startMonth> 
#	And The user enters create office correct start day <startDay> 
#	And The user enters create office correct start year <startYear> 
#	And The user enters create office correct end month <EndMonth> 
#	And user enter office end day <EndDay> 
#	And The user enters create office correct end year <EndYear> 
#	And The user enters office correct short name <ShortName> 
#	And The user select office type correct funding <funding> 
#	And The user enters funding office correct start month <fundingstartMonth> 
#	And The user enters funding office correct start day <fundingstartDay> 
#	And The user enters funding office correct start year <fundingstartYear> 
#	And The user enters funding office correct end month <fundingEndMonth> 
#	And The user enters funding office correct end day <fundingEndDay> 
#	And The user enters funding office correct end year <fundingEndYear> 
#	And The user select office type correct contracting <contracting> 
#	And The user enters contracting office correct start month <contractingstartMonth> 
#	And The user enters contracting office correct start day <contractingstartDay> 
#	And The user enters contracting office correct start year <contractingstartYear> 
#	And The user enters contracting office correct end month <contractingEndMonth> 
#	And The user enters contracting office correct end day <contractingEndDay> 
#	And The user enters contracting office correct end year <contractingEndYear> 
#	And The user select office type correct grants <grants> 
#	And The user enters grants office correct start month <grantsstartMonth> 
#	And The user enters grants office correct start day <grantsstartDay> 
#	And The user enters grants office correct start year <grantsstartYear> 
#	And The user enters grants office correct end month <grantsEndMonth> 
#	And The user enters grants office correct end day <grantsEndDay> 
#	And The user enters grants office correct end year <grantsEndYear> 
#	And The user select office type correct other <other> 
#	And The user enters other office correct start month <otherstartMonth> 
#	And The user enters other office correct start day <otherstartDay> 
#	And The user enters other office correct start year <otherstartYear> 
#	And The user enters other office correct end month <otherEndMonth> 
#	And The user enters other office correct end day <otherEndDay> 
#	And The user enters other office correct end year <otherEndYear> 
#	And The user enters street correct address <address> 
#	And The user enters correct country <country> 
#	And The enters correct zip <zip> 
#	And The enters correct city <city> 
#	And The enters correct state <state> 
#	Then user click on submit office button 
#	Then user click sub-tier breadcrumbs link 
#	When Validating only number error message <ErrorMessage> 
#	#Then user click on Confirmation office button 
#	
#	Examples: 
#		|officeDetails | startMonth | startDay|startYear|EndMonth|EndDay|EndYear|ShortName|funding|fundingstartMonth|fundingstartDay|fundingstartYear|fundingEndMonth|fundingEndDay|fundingEndYear|contracting|contractingstartMonth|contractingstartDay|contractingstartYear|contractingEndMonth|contractingEndDay|contractingEndYear|grants|grantsstartMonth|grantsstartDay|grantsstartYear|grantsEndMonth|grantsEndDay|grantsEndYear|other|otherstartMonth|otherstartDay|otherstartYear|otherEndMonth|otherEndDay|otherEndYear|address          |country            |zip  |city    |state      |ErrorMessage                |
#		|              | 10         | 3       | 2018    | 12     |  30    | 2022 |test122 | funding |02              |12             |2018             |12            |12           |2020          |contracting |02                  |12                 |2018                |12                 |12                |2019             |grants|02              |12            |2018           |12            |12          |2021         |other|02             |12           |2018          |12           |12         |2022        |2245 spring field|USA - UNITED STATES|22066|Headland|AL - Alabama|officeDetailsExpectation  |
#		| officeTest    | 10        | 3       | 2018    | 12     |  30    | 2022 |test122 | funding |02              |12             |2018             |12            |12           |2020          |contracting |02                  |12                 |2018                |12                 |12                |2019             |grants|02              |12            |2018           |12            |12          |2021         |other|02             |12           |2018          |12           |12         |2022        |                 |USA - UNITED STATES|22066|Headland|AL - Alabama|addressExpectation  |
#		|officeTest    | 10         | 3       | 2018    | 12     |30      | 2022 |test122 | funding |                |12             |2018             |12            |12           |2020          |contracting |02                  |12                 |2018                |12                 |12                |2019             |grants|02              |12            |2018           |12            |12          |2021         |other|02             |12           |2018          |12           |12         |2022        |2245 spring field|USA - UNITED STATES|22066|Headland|AL - Alabama|fundingstartMonthExpectation |
#		
#		
#		
#		
#		#|officeTest    | 10         | 3       | 2018    | 12     |30    | 2022 |test122 | funding |02              |12             |2018             |12            |12           |2020          |contracting |02                  |12                 |2018                |12                 |12                |2019             |grants|02              |12            |2018           |12            |12          |2021         |other|02             |12           |2018          |12           |12         |2022        |2245 spring field|USA - UNITED STATES|22066|Headland|AL - Alabama|
#		
#		
#		
#		@datefields 
#		Scenario: Create office number fields 
#			Given User click on Create office submit button 
#			And The user enters invalid date 
#			Then user click on submit office button 
#			Then user click on invalid date confirmation button 
#			Then user click sub-tier breadcrumbs link 
#			
#		@OfficeInvalidDate 
#		Scenario Outline: Create date office 
#			Given User click on Create office submit button 
#			And The user enters office details correct Name <officeDetails> 
#			And The user enters create office correct start month <startMonth> 
#			And The user enters create office correct start day <startDay> 
#			And The user enters create office correct start year <startYear> 
#			And The user enters create office correct end month <EndMonth> 
#			And user enter office end day <EndDay> 
#			And The user enters create office correct end year <EndYear> 
#			And The user enters office correct short name <ShortName> 
#			And The user select office type correct funding <funding> 
#			And The user enters funding office correct start month <fundingstartMonth> 
#			And The user enters funding office correct start day <fundingstartDay> 
#			And The user enters funding office correct start year <fundingstartYear> 
#			And The user enters funding office correct end month <fundingEndMonth> 
#			And The user enters funding office correct end day <fundingEndDay> 
#			And The user enters funding office correct end year <fundingEndYear> 
#			And The user select office type correct contracting <contracting> 
#			And The user enters contracting office correct start month <contractingstartMonth> 
#			And The user enters contracting office correct start day <contractingstartDay> 
#			And The user enters contracting office correct start year <contractingstartYear> 
#			And The user enters contracting office correct end month <contractingEndMonth> 
#			And The user enters contracting office correct end day <contractingEndDay> 
#			And The user enters contracting office correct end year <contractingEndYear> 
#			And The user select office type correct grants <grants> 
#			And The user enters grants office correct start month <grantsstartMonth> 
#			And The user enters grants office correct start day <grantsstartDay> 
#			And The user enters grants office correct start year <grantsstartYear> 
#			And The user enters grants office correct end month <grantsEndMonth> 
#			And The user enters grants office correct end day <grantsEndDay> 
#			And The user enters grants office correct end year <grantsEndYear> 
#			And The user select office type correct other <other> 
#			And The user enters other office correct start month <otherstartMonth> 
#			And The user enters other office correct start day <otherstartDay> 
#			And The user enters other office correct start year <otherstartYear> 
#			And The user enters other office correct end month <otherEndMonth> 
#			And The user enters other office correct end day <otherEndDay> 
#			And The user enters other office correct end year <otherEndYear> 
#			And The user enters street correct address <address> 
#			And The user enters correct country <country> 
#			And The enters correct zip <zip> 
#			And The enters correct city <city> 
#			And The enters correct state <state> 
#			Then user click on submit office button 
#			Then user click on Confirmation office button 
#			When Validating only number error message <ErrorMessage> 
#			Then user click sub-tier breadcrumbs link 
#			
#			Examples: 
#				|officeDetails | startMonth | startDay|startYear|EndMonth|EndDay|EndYear|ShortName|funding|fundingstartMonth|fundingstartDay|fundingstartYear|fundingEndMonth|fundingEndDay|fundingEndYear|contracting|contractingstartMonth|contractingstartDay|contractingstartYear|contractingEndMonth|contractingEndDay|contractingEndYear|grants|grantsstartMonth|grantsstartDay|grantsstartYear|grantsEndMonth|grantsEndDay|grantsEndYear|other|otherstartMonth|otherstartDay|otherstartYear|otherEndMonth|otherEndDay|otherEndYear|address          |country            |zip  |city    |state      |ErrorMessage                |
#				|Test11         | 10         | 3       | 2018    | 12     |  30  | 2017 |test122 | funding |02              |12             |2018             |12            |12           |2020          |contracting |02                  |12                 |2018                |12                 |12                |2019             |grants|02              |12            |2018           |12            |12          |2021         |other|02             |12           |2018          |12           |12         |2022        |2245 spring field|USA - UNITED STATES|22066|Headland|AL - Alabama|EndYearExpectation  |
#				|Test11         | 10         | 3       | 2018    | 12     |  30  | 2018 |test122 | funding |02              |12             |2018             |12            |12           |2017          |contracting |02                  |12                 |2018                |12                 |12                |2019             |grants|02              |12            |2018           |12            |12          |2021         |other|02             |12           |2018          |12           |12         |2022        |2245 spring field|USA - UNITED STATES|22066|Headland|AL - Alabama|fundingEndYearExpectation  |
#				