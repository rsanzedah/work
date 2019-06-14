package gov.gsa.sam.locators;

import org.openqa.selenium.By;

public class feedsLocators {
	//public static final By newFAQ =By.xpath("");
	public static final By GotoAssistance =By.xpath("//*[@id=\"fal-workspace-link\"]");
	public static final By ClickAssistance =By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/sam-button/button");
	public static final By Title =By.xpath("//*[@id=\"title-input\"]");
	public static final By FederalAgency =By.xpath("//*[@id=\"defaultpicker\"]");
	// General Services Administration
	public static final By CfDA =By.xpath("//*[@id=\"programNumber-input\"]");
	public static final By next =By.xpath("//*[@id=\"fal-form-nav-next\"]");
	public static final By Done =By.xpath("//*[@id=\"fal-form-nav-done\"]");	
	public static final By Overview = By.xpath("//*[@id=\"objectives-input\"]");
	public static final By FunctionalCodes = By.xpath("//*[@id=\"functional-codes-control-ac-textarea\"]");
	public static final By FunctionalCodesDropdowm = By.xpath("//*[@id=\"fal-functional-codes\"]/div/sam-label-wrapper/div/div[2]/div[2]/ul/li[2]/ul/li[2]/p");                                                           
	public static final By SubjectTerms = By.xpath("//*[@id=\"subjectTermsSearch-ac-textarea\"]");
	public static final By SubjectTermsDropdowm = By.xpath("//*[@id=\"fal-subject-terms\"]/div/sam-label-wrapper/div/div[2]/div[2]/ul/li/ul/li[1]/p");	
	public static final By AddAuthorization =By.xpath("//*[@id=\"authorization-add-btn\"]");
	public static final By Act =By.xpath("//*[@id=\"checkbox-act_0\"]");
	public static final By ActDone =By.xpath("//*[@id=\"authorization-confirm-btn-0\"]");
	public static final By NewObligationButton = By.xpath("//*[@id=\"obligations-add-btn\"]");
	public static final By NotSeparately1 =By.xpath("//*[@id=\"radio-pFY-na\"]");
	public static final By NotSeparatelyText1 =By.xpath("//*[@id=\"test\"]");
	public static final By NotSeparately2 =By.xpath("//*[@id=\"financial-obligation-subform\"]/div[2]/div/div[2]/div/div[7]/samtextradiobutton/sam-fieldset-wrapper/div/fieldset/ul/li[3]/div/div[1]");
	public static final By NotSeparatelyText2 =By.xpath("//*[@id=\"test\"]");
	public static final By NotSeparately3 =By.xpath("//*[@id=\"financial-obligation-subform\"]/div[2]/div/div[2]/div/div[7]/samtextradiobutton/sam-fieldset-wrapper/div/fieldset/ul/li[3]/div/div[2]");
	public static final By NotSeparatelyText3 =By.xpath("//*[@id=\"test\"]");
	public static final By AssistanceType =By.xpath("//*[@id=\"fal-obligation-asst-type-autocomplete-comp\"]");
	public static final By MultipleAssistanceType =By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li[2]");
	public static final By AddObligation =By.xpath("//*[@id=\"obligations-confirm-btn\"]");
	public static final By AccomplishmentsNotApplicatin =By.xpath("//*[@id=\"fal-financial-info-accomplishments-checkbox-na\"]");
	public static final By AddAccountIdentification =By.xpath("//*[@id=\"fal-financial-info-account-identification\"]/sam-button/button");
	public static final By AccountIdentificationCode =By.xpath("//*[@id=\"code-box0\"]");
	public static final By AddCode =By.xpath("//*[@id=\"fal-financial-info-account-identification\"]/sam-listbuilder-card/div/div[2]/div/sam-button[2]/button");
	public static final By TreasuryDept = By.xpath("//*[@id=\"treasury-dept-code\"]");
	public static final By TreasuryAccount  =By.xpath("//*[@id=\"treasury-account-main-code\"]");
	public static final By AddCode2 =By.xpath("//*[@id=\"fal-financial-info-tafs-codes\"]/sam-listbuilder-card/div/div[2]/div/sam-button[2]/button");
	public static final By AddTAFSCodes  =By.xpath("//*[@id=\"fal-financial-info-tafs-codes\"]/sam-button/button");
	public static final By DocumentationRequired =By.xpath("//*[@id=\"documentation-credentials-checkbox-na\"]");
	public static final By ApplicantEligibility =By.xpath("//*[@id=\"applicantTypes-control-ac-textarea\"]");
	public static final By BeneficiaryEligibility =By.xpath("//*[@id=\"checkbox-isa\"]");	
	//public static final By Multiple1 =By.xpath("//*[@id=\"fal-criteria-applicant-list\"]/div/sam-label-wrapper/div/div[2]/div[2]/ul/li/ul/li[1]");
	public static final By Multiple1 =By.xpath("//*[@id=\"fal-criteria-applicant-list\"]/div/sam-label-wrapper/div/div[2]/div[2]/ul/li/ul/li[1]/p");                                                            
	public static final By 	LengthAndTimePhasingOfAssistance =By.xpath("//*[@id=\"lengthandtime-description-input\"]");
	public static final By  assistanceAwarded  =By.xpath("//*[@id=\"awardedtypes-control\"]");
	public static final By  UseOfAssistance =By.xpath("//*[@id=\"assUsageTypes-control-ac-textarea\"]");
	public static final By  UseOfAssistanceMultiple =By.xpath("//*[@id=\"fal-criteria-ass-usage-list\"]/div/sam-label-wrapper/div/div[2]/div[2]/ul/li/ul/li[1]");
	public static final By specificTerms =By.xpath("//*[@id=\"assistanceusage-description-input\"]");
	public static final By UseRestrictions =By.xpath("//*[@id=\"useRestrictions-checkbox-na\"]");
	public static final By  discretionaryFunds =By.xpath("//*[@id=\"use-Discretionary-Funds-checkbox-na\"]");
	public static final By loansAType =By.xpath("//*[@id=\"use-Loan-Terms-checkbox-na\"]");
	public static final By Deadlines =By.xpath("//*[@id=\"no\"]");
	public static final By AwardProcedure =By.xpath("//*[@id=\"awardProcedure-description\"]");
	public static final By DateRange =By.xpath("//*[@id=\"approval-input\"]");
	public static final By OtherApproval =By.xpath("//*[@id=\"approval-description\"]");
	public static final By Renewals =By.xpath("//*[@id=\"renewal-input\"]");
	public static final By OtherRenewalInformation =By.xpath("//*[@id=\"renewal-description\"]");
	public static final By Appeals =By.xpath("//*[@id=\"appeals-input\"]");
	public static final By OtherAppealsInformation =By.xpath("//*[@id=\"appeals-description\"]");
	public static final By Audits =By.xpath("//*[@id=\"audits-checkbox-na\"]");
	public static final By Regulations =By.xpath("//*[@id=\"additional-documentation-checkbox-na\"]");
	public static final By Entries =By.xpath("//*[@id=\"contact-information-list\"]/sam-button/button");
	public static final By Name =By.xpath("//*[@id=\"fal-contact-information-entry-0-full-name\"]");
	public static final By NameMuliple =By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li");
	public static final By EmailAddress =By.xpath("//*[@id=\"fal-contact-information-entry-0-email\"]");
	public static final By BusinessPhone =By.xpath("//*[@id=\"fal-contact-information-entry-0-phone-input\"]");
	public static final By StreetAddress1 =By.xpath("//*[@id=\"fal-contact-information-entry-0-street\"]");
	public static final By City =By.xpath("//*[@id=\"fal-contact-information-entry-0-city\"]");
	public static final By State =By.xpath("//*[@id=\"fal-contact-information-entry-0-state\"]");
	public static final By ZipCode =By.xpath("//*[@id=\"fal-contact-information-entry-0-zip\"]");
	public static final By Country =By.xpath("//*[@id=\"fal-contact-information-entry-0country\"]");
	public static final By add =By.xpath("//*[@id=\"fal-contact-information-entry-0\"]/div/fieldset/div/div/sam-button[2]/button");
	public static final By Done1 =By.xpath("//*[@id=\"fal-form-nav-done\"]");
	public static final By Publish =By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/tabs-fal/div[1]/a[3]");
	public static final By btnEnabledNotify =By.xpath("//*[@id=\"btnEnabledNotify Assistance Administrator\"]/button");
	public static final By AssistanceListings = By.xpath("//*[@id=\"btnEnabledNotify Assistance Administrator\"]/button");
	public static final By Listings = By.xpath("//*[@id=\"primary-content\"]/div/h1");
	public static final By notification = By.xpath("//*[@id=\"headerIconRequests\"]");
	//*[@id="headerIconRequests"]/sam-icon
	public static final By ShowAll = By.xpath("//*[@id=\"header-requests\"]/ul/li[2]/a");
	public static final By SubmitAl = By.xpath("//*[@id=\"Submit AL\"]");
	public static final By SentTab = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/msg-feed-sidenav/div/ul/li[2]/ul/li[1]/a");
	public static final By ReadData = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]");
	public static final By Received = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/msg-feed-sidenav/div/ul/li[2]/ul/li[2]/a");
	public static final By date = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/span[2]");
	public static final By ShowALlRequests = By.xpath("//*[@id=\"header-requests\"]/ul/li[6]/a");
	public static final By published =By.xpath("//*[@id=\"checkbox-published\"]");
	public static final By Search =By.xpath("//*[@id=\"fal-workspace-input-search-input\"]");
	public static final By DateTimeStamp =By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/results/div[3]/div/assistance-program-result/div[3]/div[2]/div/div");
	public static final By SearchButton =By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/div/div[1]/sam-button/button");
	
	
	public static final By Pending =By.xpath("//*[@id=\"Pending\"]");
	public static final By Approved =By.xpath("//*[@id=\"Approved\"]");
	public static final By Rejected =By.xpath("//*[@id=\"Rejected\"]");
	public static final By Canceled =By.xpath("//*[@id=\"Canceled\"]");
	public static final By Complete =By.xpath("//*[@id=\"Complete\"]");
	public static final By RoleAssignments =By.xpath("//*[@id=\"Role Assignments\"]");
	public static final By ClearFilters =By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/msg-feed-sidenav/div/div[5]/span/a");
	
	public static final By AssistanceListing1 =By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]");
	public static final By submit =By.xpath("//*[@id=\"btnEnabledSubmit\"]/button");
	public static final By SubmissionComment = By.xpath("//*[@id=\"submission-comment\"]");
	public static final By SubmitToOMB = By.xpath("//*[@id=\"main-container\"]/fal-form-submit/div/page/div/div/div[2]/div/form/div[2]/sam-button[2]/button");
	public static final By Pending1 = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]");
	public static final By PublishAL = By.xpath("//*[@id=\"Publish AL\"]");
	public static final By AssistnacePublish = By.xpath("//*[@id=\"btnEnabledPublish\"]/button");
	public static final By TextAreaPublish = By.xpath("//*[@id=\"ombrmo-input\"]");
	public static final By Publish1 = By.xpath("//*[@id=\"main-container\"]/fal-publish/div/page/div/div/div[2]/div/form/div[2]/sam-button[2]/button");
	public static final By Approved1 = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]");
	
	public static final By HHSPublished = By.xpath("//*[@id=\"checkbox-published\"]");
	public static final By HHSResult = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/p");
	
	public static final By SearchRequest = By.xpath("//*[@id=\"search-keyword\"]");
	

}
