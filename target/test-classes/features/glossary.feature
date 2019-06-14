@glossary 
Feature: Glossary 
	Create New Glossary
         Editing Glossary
         PUBLISHED Glossary
         DRAFT Glossary
         ARCHIVED Glossary
         UNARCHIVED Glossary

#@alertSuperAdmin 
#Scenario: Setup admin token 
#	Given User set cookie as alert admin token page 
#	Then User click on alert cookie button 
	
@otp 
Scenario: Log into the GSA website 
#Given Launch glossary browser 
	Given The user enters environment glossary COMP_HOME_PAGE 
	And The user click on glossary sign in link 
	And Then click on glossary accept button 
	And The user enters the glossary email id alertadminUserName 
	And The user enters the glossary password alertadminPassword 
	Then The user click on glossary sign in button 
	And The user want to receive your one time glossary password myEmail 
	# And The user clicks on password submit button
	And The user enters glossary one time access code 
	Then The user click on glossary one time submit button 
	
@glossary1 
Scenario: Go to glossary page 
#Given Enter the department wokspace URL
	Then The user click on go to glossary link 
	And The user navigates to glossary page 
	And The user select new status 
	And The user deselect new filter 
	And The user selects published filter 
	And The user deselect published filter 
	And The user selects draft filter 
	And The user deselect draft filter 
	And The user selects archived filter 
	And The user deselect archived filter 
	And The user is able to search key word 
	And The user selects clear filter 
	And The user click on descending sort by list 
	And The user click on ascendent sort by list 
	
@newGlossary 
Scenario: Create new glossary 
	Given Click on new glossary 
	And  The user enters data field 
	And The user enters the defintion field 
	And The user enters the source field 
	#And The user selects the domain keyword 
	And The user enters keywords fields 
	Then The users click on glossary done button 
	And The users click on glossary link 
@published 
Scenario: The user is able to published glossary. 
	Given Click on actions dropdown list 
	And User successfully published 
	
@draft 
Scenario: The user is able to edit published glossary. 
	Given The user selects the edit option 
	And The user enters the defintion edit field 
	And The user enters keywords edit fields 
	And User successfully click on done button 
	And User successfully click edit to glossary link 
@draftToPublish 
Scenario: The user convert status from draft to publishing 
	Given The user pulished draft glossary 
	And  The user successfully click on published the glossary 
@publishedToArchived 
Scenario: The user convert status from publishing to archiving 
	Given The user click on archive option 
	And  The user successfully clicks on the archive the glossary 
Scenario: The user convert status from publishing to archiving 
	Given The user click on unarchive option 
	And  The user successfully clicks on the unarchive the glossary 
@draftToPublished1 
Scenario: The user convert status from draft to published glossary. 
	Given The user click on published option 
	And The user successfully clicks on the published the glossary 
@GlossarySignout 
Scenario:  Glossary created browser sign out 
	Given Glossary created browser sign out 
