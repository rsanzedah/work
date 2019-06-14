	@FeedBack
Feature:     FeedBack

	@Scenario
Scenario: Submit the Provide feedback without filling the form from the home page 
	Given Environment COMP_HOME_PAGE 
	And Click on provide feed back button
	Then Check the three question 
	Then user click on submit button
	And Click on learning center link 
	And Navigate into New to beta.SAM.gov page
	And Browser close
	
		@Scenario
Scenario: Cancel the Provide feedback without filling the form from the home page 
	Given Environment COMP_HOME_PAGE 
	And Click on provide feed back button
	Then User click on cancel button
	And Click on learning center link
	And Navigate into New to beta.SAM.gov page
	And Browser close
	
	@Scenario1
Scenario: Cancel the Provide feedback by filling one answer in the form from the home page 
	Given Environment COMP_HOME_PAGE 
	And Click on provide feed back button
	And User enter like or dislike about beta.sam.gov
	Then User click on cancel button
	And Click on learning center link
	Then Click cancel button in alert warning
	And Click on learning center link
	Then Click on confirm button
	And Navigate into New to beta.SAM.gov page
	And Browser close
	
@Scenario2
Scenario: Provide feedback from the home page 
	Given Environment COMP_HOME_PAGE 
	And Click on provide feed back button 
	And User enter like or dislike about beta.sam.gov
	And User enter what change or improvements would you suggest
	Then Check first radio button enabled
	And may we contact you if we have question about your feedback
	Then Check second radio button enabled
	And User enter email id
	Then user click on submit button 
	And Browser close
	
	
	@Scenario3
Scenario: Submit provide feedback without filling one answer from the learning center 
	Given Environment COMP_HOME_PAGE 
	And Click on learning center link
	And Click on the provide feed back button
	And User enter what change or improvements would you suggest
	And may we contact you if we have question about your feedback
	And User enter email id
	Then user click on submit button
	And Browser close
	

	@Scenario4
Scenario: confirm provide feedback from the learning center 
	Given Environment COMP_HOME_PAGE 
	And Click on learning center link
	And Click on the provide feed back button 
	And User enter like or dislike about beta.sam.gov
	#And User enter the answer for like or dislike about beta.sam.gov
	And User enter what change or improvements would you suggest
	And may we contact you if we have question about your feedback
	And User enter email id
	Then user click on submit button
	And Browser close
	
	
		@Scenario4
Scenario: Cancel the provide feedback from the learning center
	Given Environment COMP_HOME_PAGE 
	And Click on learning center link
	And Click on the provide feed back button 
	And User enter like or dislike about beta.sam.gov
	#And User enter the answer for like or dislike about beta.sam.gov
	And User enter what change or improvements would you suggest
	And may we contact you if we have question about your feedback
	And User enter email id
	Then User click on cancel button
	Then Check Warning you have feedback that has not been sumitted
	And Click on date sets link
	Then Click on confirm button
			
		@Scenario6
Scenario: Click on Form Approved OMB#3090-0297 Exp. Date 07/31/2019 from Home page
	Given Environment COMP_HOME_PAGE 
	And Click on learning center link
	And Click on the provide feed back button
	Then Click on the provide feed back link 
	Then Navigate to policies page
	
	
	
	
	
	
