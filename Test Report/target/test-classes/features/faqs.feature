@FAQS1234
Feature: New FQAs
         Create FQAs
         Editing FAQs
         PUBLISHED FAQS
         DRAFT
         ARCHIVED
         UNARCHIVED

 @otp 
Scenario: Log into the GSA website 
	#Given Launch FAQs browser 
	And The user enters environment FAQs COMP_HOME_PAGE 
	And The user click on FAQs sign in link 
	And Then click on FAQs accept button 
	And The user enters the FAQs email id alertadminUserName 
	And The user enters the FAQs password alertadminPassword 
	Then The user click on FAQs sign in button 
	And The user want to receive your one time FAQs password myEmail 
	# And The user clicks on password submit button
	And The user enters FAQs one time access code 
	Then The user click on FAQs one time submit button 
	
@FAQs 
Scenario: Go to FAQs page
    Given The user click on go to FAQs link 
    And The user navigates to FAQs page 
	And FAQs The user is able to select new status 
	And FAQs The user is able to deselect new filter
	And FAQs The user is able to selects published filter 
	And FAQs The user is able to deselect published filter 
	And FAQs The user is able to selects draft filter 
	And FAQs The user is able to deselect draft filter 
	And FAQs The user is able to selects archived filter 
	And FAQs The user is able to deselect archived filter 
	And The user FAQs is able to search key word 
	And The user FAQs selects clear filter 
	And The user FAQs click on descending sort by list 
	And The user FAQs click on ascendent sort by list 
	
	
@newFAQs
Scenario: Create new FAQs 
	Given Click on new FAQs 
	And The user enters Question field 
	And The user enters the Response field 
	And The user enters FQAS keywords fields 
	Then The users click on FAQs done button 
	And The users click on FAQs link 
	
	
@published 
Scenario: The user is able to published glossary. 
	Given FAQ Click on actions dropdown list 
	And FAQ User successfully published 
	
@draft 
Scenario: The user is able to edit published glossary. 
	Given FAQ The user selects the edit option 
	And FAQ The user enters the defintion edit field 
	And FAQ The user enters keywords edit fields 
	And FAQ User successfully click on done button 
	And FAQ User successfully click edit to glossary link 
	
@draftToPublish 
Scenario: The user convert status from draft to publishing 
	Given FAQ The user pulished draft glossary 
	And  FAQ The user successfully click on published the glossary 
	
@publishedToArchived 
Scenario: The user convert status from publishing to archiving 
	Given FAQ The user click on archive option 
	And  FAQ The user successfully clicks on the archive the glossary 
	
	
@archivedTounarchive 
Scenario: The user convert status from publishing to archiving 
	Given FAQ The user click on unarchive option 
	And  FAQ The user successfully clicks on the unarchive the glossary 
	
	
@draftToPublished 
Scenario: The user convert status from draft to published glossary. 
	Given FAQ The user click on published option
	And FAQ The user successfully clicks on the published the glossary
	
		@faqSignout 
Scenario:  Faqs created browser sign out 
	Given Faqs created browser sign out  