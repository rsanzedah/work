package gov.gsa.sam.locators;

import org.openqa.selenium.By;

public class DepartmentLocators {

	// Admin pages:

	public static final By clearCookies = By.xpath("//*[@id=\"primary-content\"]/div[2]/button[2]");
	public static final By selectAdminToken = By.xpath("//*[@id=\"primary-content\"]/div[1]/select");
	public static final By setcookies = By.xpath("//*[@id=\"primary-content\"]/div[2]/button[1]");

	// Create Department Page:
	public static final By clickOnCreateDept = By
			.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[1]/button");
	public static final By departmentName = By.xpath("//input[@id='orgName-input']");
	public static final By startMonth = By.xpath("//input[@id='org-start-date_month']");
	public static final By startDay = By.xpath("//input[@id='org-start-date_day']");
	public static final By startYear = By.xpath("//input[@id='org-start-date_year']");
	public static final By endMonth = By.xpath("//input[@id='org-end-date_month']");
	public static final By endDay = By.xpath("//input[@id='org-end-date_day']");
	public static final By endYear = By.xpath("//input[@id='org-end-date_year']");
	public static final By description1 = By.xpath("//textarea[@id='description']");
	public static final By shortName = By.xpath(" //input[@id='orgShortName-input']");
	public static final By cgacCode = By.xpath("//input[@id='cgac-input']");
	// *[@id="cgac-input"]
	public static final By agencyCode = By.xpath("//input[@id='fpds-input']");
	// public static final By ombCode = By.xpath("//input[@id='omb-agency-input']");
	public static final By cfdaCode = By.xpath("//input[@id='cfda-input']");
	// *[@id="cfda-input"]
	public static final By tas2Code = By.xpath("//input[@id='tas2-input']");

	public static final By confirm = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button");
	public static final By submit = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button");

	// Edit Page 3:
	// public static final By editButton1
	// =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/form/div/button");
	public static final By editButton1 = By
			.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div/button");
	public static final By editSubmitButton1 = By
			.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/form/div[5]/sam-button/button");
	public static final By editButton2 = By
			.xpath("//*[@id=\\\"primary-content\\\"]/ng-component/div/div[1]/div[4]/button");
	public static final By descriptionText = By.xpath("//*[@id=\"description\"]");
	public static final By editSubmitButton = By
			.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/form/div[5]/sam-button/button");

	public static final By editSubmitButton2 = By
			.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/section/sam-button/button");

	public static final By AccountDetailsName = By
			.xpath("//*[@id=\"identity\"]/sam-editor/div/sam-label-wrapper/div/div/div/div[1]/div");
	public static final By AccountDetailsEmail = By
			.xpath("//*[@id=\"identity\"]/sam-editor/div/sam-label-wrapper/div/div/div/div[2]/div");
	public static final By BusinessPhone = By
			.xpath("//*[@id=\"identity\"]/sam-editor/div/sam-label-wrapper/div/div/div/div[3]/div");
	public static final By headerIconMenu = By.id("headerIconMenu");
	public static final By Workspace = By.id("header-link-workspace");
	public static final By SubTierNameTitle = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/section[1]/div/sam-text/sam-label-wrapper/div/label");
	public static final By SubTierNameRequired = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/section[1]/div/sam-text/sam-label-wrapper/div/label/span");
	public static final By SubTierNameHint = By.xpath("//*[@id=\"orgName-input-hint\"]");
	public static final By SubTierParentDepartment = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/section[2]/h3");
	public static final By SubTierDepartment = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/section[2]/div/span[1]");
	public static final By SubTierDepartmentTest = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/section[2]/div/span[2]");
	public static final By SubTierStartDate = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By SubTierStartDateRequired = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/legend/span");
	public static final By SubTierStartDateHint = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	public static final By SubTierStartDateMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By SubTierStartDateDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By SubTierStartDateYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");
	public static final By SubTierEndDate = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By SubTierEndDateHint = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	public static final By SubTierEndDateMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By SubTierEndDateDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By SubTierEndDateYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");
	public static final By SubTierShortNameTitle = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[3]/sam-text/sam-label-wrapper/div/label");
	public static final By SubTierShortNameHint = By.xpath("//*[@id=\"orgShortName-input-hint\"]");
	public static final By SubTierCode = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/h2");
	public static final By SubTierCodeAgencyTitle = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/div/sam-text/sam-label-wrapper/div/label");
	public static final By SubTierCodeAgencyHint = By.xpath("//*[@id=\"fpds-input-hint\"]");
	public static final By SubTierCodeAgencyRequired = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/div/sam-text/sam-label-wrapper/div/label/span");
	public static final By SubTierDetails = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/h2");

	public static final By ConfirmationFH = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/h1/div");
	public static final By SubTierConfirmation = By.xpath("");
	public static final By SubTierConfirmationConfirmBelowDetails = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/div");
	public static final By SubTierConfirmationSubTierDetails = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/h2");
	public static final By SubTierConfirmationSubTierName = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[1]/div[1]");
	public static final By SubTierConfirmationSubTierNameText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[1]/div[2]");
	public static final By SubTierConfirmationStartDate = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[2]/div[1]");
	public static final By SubTierConfirmationStartDateText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[2]/div[2]");
	public static final By SubTierConfirmationEndDate = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[3]/div[1]");
	public static final By SubTierConfirmationEndDateText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[3]/div[2]");
	public static final By SubTierConfirmationShortname = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[4]/div[1]");
	public static final By SubTierConfirmationShortnameText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[4]/div[2]");
	public static final By SubTierConfirmationSubTierCode = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/h2");
	public static final By SubTierConfirmationAgencyCode = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div/span[1]");
	public static final By SubTierConfirmationAgencyCodeText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div/span[2]");
	

	  public static final By EditDepartmentEndHint = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/sam-fieldset-wrapper/div/fieldset/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	  public static final By EditDepartmentEndDay1 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/sam-fieldset-wrapper/div/fieldset/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	  public static final By EditDepartmentEndMonth1 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/sam-fieldset-wrapper/div/fieldset/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	  public static final By EditDepartmentEndYear1 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/sam-fieldset-wrapper/div/fieldset/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");
	  public static final By EditDepartmentEndDateText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[3]/span[2]");
	 
	  
	  public static final By EditDepartmentDescriptionText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[4]/span[2]/span");
	  public static final By EditDepartmentShortName1 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/div[2]/sam-text/sam-label-wrapper/div/label");
	  public static final By EditDepartmentShortNameHint = By.xpath("//*[@id=\"orgShortName-input-hint\"]");
	  public static final By EditDepartmentShortNametext = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[5]/span[2]");
	  public static final By EditDepartmentShortNametext1 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[5]/span[2]");

	  public static final By EditDepartmentAgencyCodeHint = By.xpath("//*[@id=\"fpds-input-hint\"]");
	  public static final By EditDepartmentAgencyCodetext = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[2]/span[2]/span");
	  
	  public static final By EditDepartmentCGACHint = By.xpath("//*[@id=\"cgac-input-hint\"]");
	  public static final By EditDepartmentCGACtext = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/span[2]/span");
	  public static final By EditDepartmentCFDACodeHint = By.xpath("//*[@id=\"cfda-input-hint\"]");
	  public static final By EditDepartmentCFDACodetext = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[4]/span[2]/span");
	  public static final By EditDepartmentTAS2Codetext = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[5]/span[2]/span");
	  
	  
	  public static final By EditDepartmentCFDACodetext1 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[4]/span[2]/span");
	  
	  
	  public static final By EditSubTierDetails = By.xpath ("");
	  public static final By EditSubTierDepartment = By.xpath("");
	  public static final By EditSubTierStartDate = By.xpath("");
	  public static final By EditSubTierEndDate = By.xpath("");
	  public static final By EditSubTierShortname = By.xpath("");
	  public static final By EditSubTierEndDateHint = By.xpath("");	
	  public static final By EditSubTierShortName = By.xpath("");
	  public static final By EditSubTierShortNamHint = By.xpath("");
	  public static final By EditSubTierAgencyCodeHint = By.xpath("");
	  
	  
	  
	  
	// public static final By = By.xpath("");

}
