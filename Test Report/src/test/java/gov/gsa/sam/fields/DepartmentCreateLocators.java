package gov.gsa.sam.fields;

import org.openqa.selenium.By;

public class DepartmentCreateLocators {
	
	//public static String  DeptAgency = "Department/Ind. Agency Details";
	//public static String DeptAgencyName1 = "Department/Ind. Agency Name";
	////public static String DeptAgencyName2 = "Provide a unique Department/Ind. Agency name. Existing Department/Ind. Agency names cannot be re-used.";
	//public static String DeptAgencyName3 = "Required";
	
	public static final By FederalHierechy = By.xpath(".//div[contains(text(),'FEDERAL HIERARCHY')]");
	public static final By Agency = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/h1/text()");
	public static final By DeptAgency = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/h2");
	public static final By CreateDept3 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/div");
	public static final By startDate = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By startDateText = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	public static final By startMonth = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By startDay = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");

	public static final By startYear = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");
	public static final By endDate = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By endDateText = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	public static final By endYear = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");
	public static final By endDay = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By endMonth = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	
	public static final By description = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[3]/sam-text-area/sam-label-wrapper/div/label");
	public static final By ShortName = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[4]/sam-text/sam-label-wrapper/div/label");
	public static final By ShortNameText = By.xpath("//*[@id=\"orgShortName-input-hint\"]");
	public static final By code = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/h2");
	public static final By AgencyCode = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[1]/sam-label-wrapper/div/label");
	public static final By AgencyCodeText = By.xpath("//*[@id=\"fpds-input-hint\"]");
	public static final By CGAC = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[2]/sam-label-wrapper/div/label");
	public static final By CGACText = By.xpath("//*[@id=\"cgac-input-hint\"]");
    public static final By CFDAC = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[3]/sam-label-wrapper/div/label");
	 public static final By CFDAText = By.xpath("//*[@id=\"cfda-input-hint\"]");
	public static final By TAS2Code = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[2]/section/form/sam-text[4]/sam-label-wrapper/div/label");
	 public static final By TAS2CodeText = By.xpath("//*[@id=\"tas2-input-hint\"]");
	 
	 public static final By ConfirmationHeader = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/h2");
	// public static final By Confirmation = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/h1");
	
	 public static final By Confirmation = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/h1");
	
	 public static final By ConfirmDetails = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/div");
	 public static final By AgencyName = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[1]/div[1]");
	 public static final By ConfirmationStartDate = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[2]/div[1]");
	 public static final By ConfirmationEndDate = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[3]/div[1]");
	 public static final By ConfirmationDescription = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[4]/div[1]");
	 public static final By ConfirmationShortname = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[5]/div[1]");
	 public static final By ConfirmationAgencyCode = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div[1]/span[1]");
	 public static final By ConfirmationCGACCode = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div[2]/span[1]");
	 public static final By ConfirmationCFDACode = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div[3]/span[1]");
	 public static final By ConfirmationTAS2Code = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div[4]/span[1]");
	 public static final By Confirmationcode = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/h2");
	 
	 
	 public static final By departmentConfirmSubmit = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button");
	                                                            //*[@id="main-container"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button
	//*[@id="primary-content"]/ng-component/div/div[1]/div[3]/div[1]/h2
	 public static final By EditAgencyName = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/h2");
	 public static final By EditStartDate = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[2]/span[1]/b");
	 public static final By EditEndDate = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[3]/span[1]/b");
	 public static final By EditDescription = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[4]/span[1]/b");
	 public static final By EditShortname = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[5]/span[1]/b");
	 public static final By EditAgencyCode = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[2]/span[1]/b");
	 public static final By EditCGACCode = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/span[1]/b");
	 public static final By EditCFDACode = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[4]/span[1]/b");
	 public static final By EditTAS2Code = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[5]/span[1]/b");
	 public static final By Editcode = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/h2");
	 
	 ////////////////// Edit Value
	 public static final By EditValueMonth = By.xpath("//*[@id=\"org-end-date_month\"]");
	 public static final By EditValueDay = By.xpath("//*[@id=\"org-end-date_day\"]");
	 public static final By EditValueYear = By.xpath("//*[@id=\"org-end-date_year\"]");
	 public static final By EditValueDescription = By.xpath("//*[@id=\"description\"]");
	 public static final By EditValueShortName = By.xpath("//*[@id=\"orgShortName-input\"]");
	 public static final By EditValueAgencyCode = By.xpath("//*[@id=\"fpds-input\"]");
	 public static final By EditValueCGAC = By.xpath("//*[@id=\"cgac-input\"]");
	 public static final By EditValueCFDACode = By.xpath("//*[@id=\"cfda-input\"]");
	 
	 ////////////////// Confirmation Value
	 public static final By ConfirmationValueAgencyName = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[1]/div[2]");
	 public static final By ConfirmationValueStartDate = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[2]/div[2]");
	 public static final By ConfirmationValueEndDate = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[3]/div[2]");
	 public static final By ConfirmationValueDescription = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[4]/div[2]/span");
	 public static final By ConfirmationValueShortName = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[5]/div[2]");
	 public static final By ConfirmationValueAgencyCode = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div[1]/span[2]");
	 public static final By ConfirmationValueCGAC = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div[2]/span[2]");
	 public static final By ConfirmationValueCFDACode = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div[3]/span[2]");
	 public static final By ConfirmationValueTASode = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[2]/div[4]/span[2]");
 
///
	 public static final By DepartmentConfirm = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button");
	//*[@id="main-container"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button
	 
}
