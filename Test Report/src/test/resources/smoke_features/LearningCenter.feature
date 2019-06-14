@LearningCenter 
Feature: select four tab options: 
	1) New to beta.SAM.gov 
                       a) About Us
                       b) User Accounts
                 2) Data Sets
                       a)Federal Hierarchy
                       b)Entity Information
                 3) Resources
                      a) Assistance
                         1) Chief Financial Officers Council Grants Training
                         2) Benefits.gov Benefit Finder 
                      b) Wage Determinations
                          1) service contract Act
                      c) Partners
                 4) Policies

@otp 
Scenario: New to beta Sam gov page 
	Given User enters Learning Center environment COMP_HOME_PAGE 
	And User Click on Learning Center 
	Then The user able to log into beta Sam gov page
	And The user click on about us tab 
	Then User successfully nagavita into about us page 
	And The user click on User Accounts tab 
	Then User successfully nagavita into User Accounts page 
@DataSets 
Scenario: Data Sets Pages 
	Given  The user click on Data Sets tab 
	Then User successfully nagavita into Data Sets page 
	And The user click on Entity Information tab 
    Then User successfully nagavita into Entity Information page 
 	And The user click on Federal Hierarchy tab 
  	Then User successfully nagavita into Federal Hierarchy page 
 	
@Resources 
Scenario: Resources Pages 
	Given The user click on Resources tab 
	Then User successfully nagavita into Resources page 
	And The user click on Assistance tab 
	Then User successfully nagavita into Assistance page 
	And The user click on Chief Financial Officers link 
	Then User successfully nagavita into Chief Financial Officers page 
	And The user click on Benefit Finder link 
	Then User successfully nagavita into Benefit Finder page 
	And The user click on Wage Determinations tab 
	Then User successfully nagavita into Wage Determinations page 
	And The user click on service contract Act link 
	Then User successfully nagavita into service contract Act page 
	And The user click on Conformances under the Davis-Bacon Act link 
	Then User successfully nagavita into Conformances under the Davis-Bacon Act page 
	And The user click on Partners tab 
	Then User successfully nagavita into Partners page 
	And The user click on Disaster Assistance link 
	Then User successfully nagavita into Disaster Assistance page 
	
@Policies 
Scenario: Policies Pages 
	Given  The user click on Policies tab 
	And User successfully nagavita into Policies page 
	Then User click on beta sam link 
	
@Signout 
Scenario: Browser close
	Given Browser sign out 
	
Scenario: New to beta Sam gov page 
	Given User enters Learning Center environment COMP_HOME_PAGE 
	And User click on hand icon 
	Then Click on learning center 
	Then The user able to log into beta Sam gov page 
	And The user click on about us tab 
	Then User successfully nagavita into about us page 
	And The user click on User Accounts tab 
	Then User successfully nagavita into User Accounts page 
@DataSets 
Scenario: Data Sets Pages 
	Given  The user click on Data Sets tab 
	Then User successfully nagavita into Data Sets page 
	And The user click on Entity Information tab 
    Then User successfully nagavita into Entity Information page 
 	And The user click on Federal Hierarchy tab 
  	Then User successfully nagavita into Federal Hierarchy page 
 	
@Resources 
Scenario: Resources Pages 
	Given The user click on Resources tab 
	Then User successfully nagavita into Resources page 
	And The user click on Assistance tab 
	Then User successfully nagavita into Assistance page 
	And The user click on Chief Financial Officers link 
	Then User successfully nagavita into Chief Financial Officers page 
	And The user click on Benefit Finder link 
	Then User successfully nagavita into Benefit Finder page 
	And The user click on Wage Determinations tab 
	Then User successfully nagavita into Wage Determinations page 
	And The user click on service contract Act link 
	Then User successfully nagavita into service contract Act page 
	And The user click on Conformances under the Davis-Bacon Act link 
	Then User successfully nagavita into Conformances under the Davis-Bacon Act page 
	And The user click on Partners tab 
	Then User successfully nagavita into Partners page 
	And The user click on Disaster Assistance link 
	Then User successfully nagavita into Disaster Assistance page 
	
@Policies 
Scenario: Policies Pages 
	Given  The user click on Policies tab 
	And User successfully nagavita into Policies page 
	Then User click on beta sam link 
	
@Signout 
Scenario: Browser close
	Given Browser sign out 