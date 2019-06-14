@Release
Feature: New Release Notes
         Create FQAs
         Editing Release
         PUBLISHED Release
         DRAFT
         ARCHIVED
         UNARCHIVED

 @otp 
Scenario: Log into the GSA website 
	#Given Launch Release browser 
	And The user enters environment Release COMP_HOME_PAGE 
	And The user click on Release sign in link 
	And Then click on Release accept button 
	And The user enters the Release email id alertadminUserName 
	And The user enters the Release password alertadminPassword 
	Then The user click on Release sign in button 
	And The user want to receive your one time Release password myEmail 
	# And The user clicks on password submit button
	And The user enters Release one time access code 
	Then The user click on Release one time submit button 
	
@Release12
Scenario: Go to Release page
    Given The user click on go to Release link 
    And The user navigates to Release page 
	And Release The user is able to select new status 
	And Release The user is able to deselect new filter
	And Release The user is able to selects published filter 
	And Release The user is able to deselect published filter 
	And Release The user is able to selects draft filter 
	And Release The user is able to deselect draft filter 
	And Release The user is able to selects archived filter 
	And Release The user is able to deselect archived filter 
	And The user Release is able to search key word 
	And The user Release selects clear filter 
	And The user Release click on descending sort by list 
	And The user Release click on ascendent sort by list 
	
	
@newRelease12
Scenario: Create new Release 
	Given Click on new Release 
	And The user enters release field 
	And The user enters the overview field 
	And The user enters the details field 
	Then The users click on Release done button 
	And The users click on Release link 
	
	
@published12
Scenario: The user is able to published glossary. 
	Given Release Click on actions dropdown list 
	And Release User successfully published 
	
@draft12 
Scenario: The user is able to edit published glossary. 
	Given Release The user selects the edit option 
	And Release The user enters the overview field 
	And Release The user enters the details field
	And Release User successfully click on done button 
	And Release User successfully click edit to glossary link 
	
@draftToPublish12
Scenario: The user convert status from draft to publishing 
	Given Release The user pulished draft glossary 
	And  Release The user successfully click on published the glossary 
#	
#@publishedToArchived 
#Scenario: The user convert status from publishing to archiving 
#	Given Release The user click on archive option 
#	And  Release The user successfully clicks on the archive the glossary 
#	
#	
#@archivedTounarchive 
#Scenario: The user convert status from publishing to archiving 
#	Given Release The user click on unarchive option 
#	And  Release The user successfully clicks on the unarchive the glossary 
#	
#	
#@draftToPublished 
#Scenario: The user convert status from draft to published glossary. 
#	Given Release The user click on published option 
#	And Release The user successfully clicks on the published the glossary  

@ReleaseSignout 
Scenario:  Release created browser sign out 
	Given Release created browser sign out 