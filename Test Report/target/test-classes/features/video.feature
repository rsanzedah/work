@Videos 
Feature: video 

@otpVideo 
Scenario: Log into the GSA website 
	#Given Launch video browser 
	And The user enters video environment COMP_HOME_PAGE 
	And The user click on video sign in link 
	And Then click on video accept button
	And The user enters the email id video alertadminUserName 
	And The user enters the password video alertadminPassword 
	Then The user click on video sign in button 
	And The user want to receive your video one time password myEmail 
	And The user enters one time access code video  
	Then The user click on video one time submit button
	
	
Scenario: Go to videos page 
	Given The user click on go to video link 
	And The user navigate to video page 
	
@newVideos 
Scenario: create click on new video 
	Given The user click on new video 
	And The users enter title 
	And The users enter description 
	And The users select video 
	And The users select caption 
	Then The users click on done button
	
	@VideoSignout 
Scenario:  Video created browser sign out 
	Given Video created browser sign out
 
