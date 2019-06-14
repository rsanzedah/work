@FAQS 
Feature:      1) Create FAQS   
              2) Publish FAQS (Select checkbox)
              3) After publish check In Learn Centre
              4)Draft FAQS (unselect checkbox)
              5)Publish FQAS

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
	
@faq 
Scenario: Go to FAQs page 
	Given The user click on go to FAQs link 
	And The user navigates to FAQs page 
	
	
@newFAQs 
Scenario: Create new FAQs 
	Given Click on new FAQs 
	And The user enters Question field 
	And The user enters the Response field 
	#And The user enters FQAS keywords fields 
	Then The users click on FAQs done button 
	And The users click on FAQs link 
	
	
@published 
Scenario: The user is able to published glossary. 
	Given FAQ Click on actions dropdown list 
	And FAQ User successfully published 
@faqsSignout 
Scenario: faqs browser sign out 
	Given faqs browser sign out 
@learMore 
Scenario: GSA in merging ten legacy award into one system 
	Given The user enters environment FAQs COMP_HOME_PAGE 
	Then Click on FAQS link 
@browserClose 
Scenario: faqs browser sign out 
	Given faqs browser close 
@otp1 
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
	
@faq2 
Scenario: Go to FAQs page 
	Given The user click on go to FAQs link 
	And The user navigates to FAQs page 
	And The user is search for a key word 
	
	
@draft 
Scenario: The user is able to edit FQAS. 
	Given FAQ The user selects the edit option 
	And FAQ The user enters the defintion edit field 
	#And FAQ The user enters keywords edit fields
	And User unselect display faq in home page 
	And FAQ User successfully click on done button 
	And FAQ User successfully click edit to glossary link 
	
@faqsSignout 
Scenario: faqs browser sign out 
	Given faqs browser sign out 
	
@learMore1 
Scenario: GSA in merging ten legacy award into one system 
	Given The user enters environment FAQs COMP_HOME_PAGE 
	Then Click on FAQS link 
	
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
	
@faq2 
Scenario: Go to FAQs page 
	Given The user click on go to FAQs link 
	And The user navigates to FAQs page 
	
@draftToPublish 
Scenario: The user convert status from draft to publishing 
	Given FAQ The user pulished draft glossary 
	And  FAQ The user successfully click on published the glossary 
	
@faqsSignout 
Scenario: faqs browser sign out 
	Given faqs browser sign out 
	
	@learMore3 
Scenario: GSA in merging ten legacy award into one system 
	Given The user enters environment FAQs COMP_HOME_PAGE 
	#Then Click on FAQS link 
	Then FAQS user display link does not appear
	And Click on More FAQs link
	Then User navigate to Learning Center page
	And User enter faqs title in the keyword search box
	
	
	
	