package gov.gsa.sam.locators;

import org.openqa.selenium.By;

public class DepartmentErrorMessageLocators {
	
//input[@id='org-end-date_day']");
	
	public static final  By inputAgency = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/section/div/sam-text/sam-label-wrapper/div/span") ;
	// 	public static final  By inputAgency = By.xpath("//*[@id=\"orgName-input-error\"]") ;
	
	
	public static final By cgac = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[1]/sam-label-wrapper/div/span");
	//public static final By cgac = By.xpath("//*[@id=\"cgac-input-error\"]");
	
	
	public static final By omg = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[3]/sam-label-wrapper/div/span");
	//public static final By omg = By.xpath("//*[@id=\"omb-agency-input-error\"]");
	
	
	public static final By tas2 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[5]/sam-label-wrapper/div/span");
	//public static final By tas2 = By.xpath("//*[@id=\"tas2-input-error\"]");
	//*[@id="tas2-input-error"]
	
	
	public static final By agencyCode = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[2]/sam-label-wrapper/div/span");
	//public static final By agencyCode = By.xpath("//*[@id=\"fpds-input-error\"]");
	
	public static final By descriptionmsg = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[3]/sam-text-area/sam-label-wrapper/div/span");
	//public static final By descriptionmsg = By.xpath("//*[@id=\"description-error\"]");
	
	
	public static final By nameAlreadyExists = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/section/div/sam-text/sam-label-wrapper/div/span");
	//public static final By nameAlreadyExists = By.xpath("//*[@id=\"orgName-input-error\"]");
	
	
	public static final By agencyNameExist = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/section/div/sam-text/sam-label-wrapper/div/span");
	
	//public static final  By agencyNameExist = By.xpath("//*[@id=\"orgName-input-error\"]") ;
	
	
	public static final By cgacNumberValue = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[1]/sam-label-wrapper/div/span");

	//public static final By cgacNumberValue = By.xpath("//*[@id=\"cgac-input-error\"]");
	
	public static final By ombNumberValue = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[3]/sam-label-wrapper/div/span");
	//public static final By ombNumberValue = By.xpath("//*[@id=\"omb-agency-input-error\"]");
	
	public static final By cfdaNumberValue = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[1]/sam-label-wrapper/div/span");
	
	//public static final By cfdaNumberValue = By.xpath("//*[@id=\"cfda-input-error\"]");
	
	public static final By tas2NumberValue = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[5]/sam-label-wrapper/div/span");
	
	//public static final By tas2NumberValue = By.xpath("//*[@id=\"tas2-input-error\"]");
	
	public static final By agencyNumberValue = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[2]/sam-label-wrapper/div/span");

	//public static final By agencyNumberValue =  By.xpath("//*[@id=\"fpds-input-error\"]");
	
	public static final By tas = By.xpath("//*[@id=\"tas2-input-error\"]");
	
	
	public static final By cgac1 = By.xpath("//*[@id=\"cgac-input-error\"]");
	//public static final By cgac = By.xpath("//*[@id=\"cgac-input-error\"]");
	
	public static final By cfda1 = By.xpath("//*[@id=\"cfda-input-error\"]");
	
	public static final By subTierOrgName = By.xpath("//*[@id=\"orgName-input-error\"]");
	
	public static final By sunTierDate= By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	public static final By SubTierAgencyCode= By.xpath("//*[@id=\"fpds-input-error\"]");
	public static final By SubTierName = By.xpath("//*[@id=\"orgName-input\"]");
	public static final By subTierMonth = By.xpath("//*[@id=\"org-start-date_month\"]");
	public static final By subTierDay = By.xpath("//*[@id=\"org-start-date_day\"]");
	public static final By subTierYear = By.xpath("//*[@id=\"org-start-date_year\"]");
	public static final By subTierAgencyCode1 = By.xpath("//*[@id=\"fpds-input\"]");
	public static final By agencyAlpha = By.xpath("//*[@id=\"fpds-input-error\"]");
	
	
	


}
