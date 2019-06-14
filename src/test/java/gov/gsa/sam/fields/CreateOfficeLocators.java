package gov.gsa.sam.fields;

import org.openqa.selenium.By;

public class CreateOfficeLocators {
	public static final By FederalHierarchy = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[1]/title-and-section/div/h1/div");
	        //*[@id="main-container"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[1]/title-and-section/div/h1/div
	public static final By FederalHierarchyText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[1]/title-and-section/div/div");
	public static final By RequestOfficeText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[1]/title-and-section/div/div");
	public static final By OfficeDetails = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/h2");
	public static final By OfficeNameText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[1]/div/sam-text/sam-label-wrapper/div/label");
	public static final By OfficeNameRQ = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[1]/div/sam-text/sam-label-wrapper/div/label/span");
	public static final By OfficeName = By.xpath("//*[@id=\"ofcName-input-hint\"]");
	public static final By OfficeNameTextBox = By.xpath("//*[@id=\"ofcName-input\"]");
	public static final By ParentDepartmentandSubTier = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[1]/h3");
	public static final By DeptIndAgency = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[1]/div[1]/span[1]");
	public static final By DeptIndAgencyText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[1]/div[1]/span[2]");
	public static final By CGAC = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[1]/div[1]/div/span[1]");
	public static final By CGACText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[1]/div[1]/div/span[2]");
	public static final By SubTier = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[1]/div[2]/span[1]");
	public static final By SubTierText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[1]/div[2]/span[2]");
	public static final By AgencyCode = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[1]/div[2]/div/span[1]");
	public static final By AgencyCodeText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[1]/div[2]/div/span[2]");
	public static final By Startdate = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By StartdateText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	public static final By StartdateMonthTextBox = By.xpath("//*[@id=\"ofc-start-date_month\"]");
	public static final By StartdateMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By StartdateDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By StartdateDayTextBox = By.xpath("//*[@id=\"ofc-start-date_day\"]");
	public static final By StartdateYearTextDate = By.xpath("//*[@id=\"ofc-start-date_year\"]");
	public static final By StartdateYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");
	public static final By Enddate = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[3]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");

	public static final By EnddateText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[3]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");

	// public static final By EnddateText =
	// By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[3]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	public static final By EnddateMonthTextbox = By.xpath("//*[@id=\"ofc-end-date_month\"]");
	public static final By EnddateMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[3]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By EnddateDayTextbox = By.xpath("//*[@id=\"ofc-end-date_day\"]");
	public static final By EnddateDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[3]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By EnddateYearTextbox = By.xpath("//*[@id=\"ofc-end-date_year\"]");
	public static final By EnddateYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[3]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");

	public static final By OfficeShortName = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[4]/sam-text/sam-label-wrapper/div/label");
	public static final By OfficeShortNameText = By.xpath("//*[@id=\"ofcShortName-input\"]");
	public static final By OfficeRegion1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[5]/sam-text/sam-label-wrapper/div/label");
	public static final By OfficeRegion2 = By.xpath("//*[@id=\"ofcRegion-input-hint\"]");
	public static final By OfficeRegionTextbox = By.xpath("//*[@id=\"ofcRegion-input\"]");

	public static final By OfficeActivityAddressCodeName = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[6]/sam-text/sam-label-wrapper/div/label");
	public static final By OfficeActivityAddressCodeText = By.xpath("//*[@id=\"ofcAAC-input-hint\"]");
	public static final By OfficeActivityAddressCode = By.xpath("//*[@id=\"ofcAAC-input\"]");
	// *[@id="ofcAAC-input"]

	public static final By Requestor = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/h3");
	public static final By Name = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/div[1]/span[1]");
	public static final By Email = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/div[2]/span[1]");
	public static final By PhoneNumber = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/div[3]/span[1]");

	// public static final By RequestorText = By.xpath("");
	public static final By NameText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/div[1]/span[2]");
	public static final By EmailText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/div[2]/span[2]");
	public static final By PhoneNumberText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/div[3]/span[2]");

	public static final By PointOfContact = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/form/div[1]/h3");
	public static final By CheckBoxRequestorAsPointOfContact = By.xpath("//*[@id=\"my-org-cbx\"]");
	public static final By UseTheRequestorAsPointOfContact = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/form/div[2]/label");
	public static final By POCName = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/form/div[3]/div[1]/sam-text/sam-label-wrapper/div/label");
	public static final By POCEmail = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/form/div[3]/div[2]/sam-text/sam-label-wrapper/div/label");
	public static final By POCPhoneNumber = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/form/div[3]/div[3]/sam-phone-entry/sam-label-wrapper/div/label");

	public static final By POCNameTextBox = By.xpath("//*[@id=\"name-input\"]");
	public static final By POCEmailTextBox = By.xpath("//*[@id=\"email-input\"]");
	public static final By POCPhoneNumberTextBox = By.xpath("//*[@id=\"mobile-phone-number\"]");

	public static final By OfficeTypes = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/h2");
	public static final By OfficeTypesText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[1]");
	
	public static final By FinancialFunding = By.xpath("//*[@id=\"FinancialAssistanceFunding\"]");
	//*[@id="FinancialAssistanceFundings"]
	public static final By FinancialFundingStartOptional = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
			
	public static final By FinancialFundingEndOptional = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By FinancialFundingStart1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
			
	public static final By FinancialFundingEnd1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");

	public static final By FinancialFundingStartMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By FinancialFundingStartDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By FinancialFundingStartYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");
	public static final By FinancialFundingEndMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By FinancialFundingEndDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By FinancialFundingEndYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");

	public static final By FinancialFundingStartMonthText = By
			.xpath("//*[@id=\"FinancialAssistanceFundingStartDate_month\"]");
	public static final By FinancialFundingStartDayText = By
			.xpath("//*[@id=\"FinancialAssistanceFundingStartDate_day\"]");
	public static final By FinancialFundingStartYearText = By
			.xpath("//*[@id=\"FinancialAssistanceFundingStartDate_year\"]");
	public static final By FinancialFundingEndMonthText = By
			.xpath("//*[@id=\"FinancialAssistanceFundingEndDate_month\"]");
	public static final By FinancialFundingEndDayText = By.xpath("//*[@id=\"FinancialAssistanceFundingEndDate_day\"]");
	public static final By FinancialFundingEndYearText = By
			.xpath("//*[@id=\"FinancialAssistanceFundingEndDate_year\"]");

	public static final By FinancialAwardsCheckBox = By.xpath("//*[@id=\"FinancialAssistanceAwards\"]");
	
	public static final By FinancialAwardsText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/sam-toggle/label");
	        //*[@id="main-container"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/sam-toggle/label

	public static final By FinancialAwardsStartOptional = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By FinancialAwardsEndOptional = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By FinancialAwardsStart1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	public static final By FinancialAwardsEnd1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");

	public static final By FinancialAwardsStartMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By FinancialAwardsStartDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By FinancialAwardsStartYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");

	public static final By FinancialAwardsStartMonthText = By
			.xpath("//*[@id=\"FinancialAssistanceAwardsStartDate_month\"]");
	public static final By FinancialAwardsStartDayText = By
			.xpath("//*[@id=\"FinancialAssistanceAwardsStartDate_day\"]");
	public static final By FinancialAwardsStartYearText = By
			.xpath("//*[@id=\"FinancialAssistanceAwardsStartDate_year\"]");

	public static final By FinancialAwardsEndMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By FinancialAwardsEndDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By FinancialAwardsEndYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");

	public static final By FinancialAwardsEndMonthText = By
			.xpath("//*[@id=\"FinancialAssistanceAwardsEndDate_month\"]");
	public static final By FinancialAwardsEndDayText = By.xpath("//*[@id=\"FinancialAssistanceAwardsEndDate_day\"]");
	public static final By FinancialAwardsEndYearText = By.xpath("//*[@id=\"FinancialAssistanceAwardsEndDate_year\"]");

	public static final By ContractAwardsCheckbox = By.xpath("//*[@id=\"ContractAwards\"]");
	public static final By ContractAwardsText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/sam-toggle/label");
	         //*[@id="main-container"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/sam-toggle/label

	public static final By ContractAwardsStartOptional = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By ContractAwardsEndOptional = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By ContractAwardsStart1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	public static final By ContractAwardsEnd1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");

	public static final By ContractAwardsStartMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By ContractAwardsStartDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By ContractAwardsStartYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");

	public static final By ContractAwardsStartMonthText = By.xpath("//*[@id=\"ContractAwardsStartDate_month\"]");
	public static final By ContractAwardsStartDayText = By.xpath("//*[@id=\"ContractAwardsStartDate_day\"]");
	public static final By ContractAwardsStartYearText = By.xpath("//*[@id=\"ContractAwardsStartDate_year\"]");

	public static final By ContractAwardsEndMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By ContractAwardsEndDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By ContractAwardsEndYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");

	public static final By ContractAwardsEndMonthText = By.xpath("//*[@id=\"ContractAwardsEndDate_month\"]");
	public static final By ContractAwardsEndDayText = By.xpath("//*[@id=\"ContractAwardsEndDate_day\"]");
	public static final By ContractAwardsEndYearText = By.xpath("//*[@id=\"ContractAwardsEndDate_year\"]");

	public static final By ContractFunding = By.xpath("//*[@id=\"ContractFunding\"]");
	public static final By ContractFundingText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/sam-toggle/label");
	        //*[@id="main-container"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/sam-toggle/label
	

	public static final By ContractFundingStartOptional = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	        //*[@id="main-container"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/legend
			
	public static final By ContractFundingEndOptional = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/legend");
	public static final By ContractFundingStart1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
			//"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
	
	public static final By ContractFundingEnd1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");
		//	"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]");

	public static final By ContractFundingStartMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
			//"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By ContractFundingStartDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
			
			//"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By ContractFundingStartYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");
	//"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");

	public static final By ContractFundingStartMonthText = By.xpath("//*[@id=\"ContractFundingStartDate_month\"]");
	public static final By ContractFundingStartDayText = By.xpath("//*[@id=\"ContractFundingStartDate_day\"]");
	public static final By ContractFundingStartYearText = By.xpath("//*[@id=\"ContractFundingStartDate_year\"]");

	public static final By ContractFundingEndMonth = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	//"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[1]/label");
	public static final By ContractFundingEndDay = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
			//"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label");
	public static final By ContractFundingEndYear = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");
			//"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[3]/label");

	public static final By ContractFundingEndMonthText = By.xpath("//*[@id=\"ContractFundingEndDate_month\"]");
	public static final By ContractFundingEndDayText = By.xpath("//*[@id=\"ContractFundingEndDate_day\"]");
	public static final By ContractFundingEndYearText = By.xpath("//*[@id=\"ContractFundingEndDate_year\"]");

	public static final By OfficeAddress = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/h2");
	public static final By MailingAddress = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/sam-address-form-v2/div/div[1]/h3/span");
	public static final By TAC1Street1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/sam-address-form-v2/div/div[2]/sam-text[1]/sam-label-wrapper/div/label");
	public static final By TAC1Street2 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/sam-address-form-v2/div/div[2]/sam-text[2]/sam-label-wrapper/div/label");
	// public static final By TAC1Street1TextBox =
	// By.xpath("//*[@id=\"street-1-input\"]");
	public static final By TAC1Street1TextBox = By.xpath("//*[@id=\"street1-Mailing-Address\"]");
	public static final By TAC1Street2TextBox = By.xpath("//*[@id=\"street-2-input\"]");
	public static final By Country = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/sam-address-form-v2/div/div[2]/sam-location-component/sam-autocomplete[1]/div/sam-label-wrapper/div/label");
	public static final By Zip = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/sam-address-form-v2/div/div[2]/sam-location-component/sam-text/sam-label-wrapper/div/label");
	// public static final By City =
	// By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/sam-address-form-v2/div/div[2]/sam-location-component/sam-autocomplete[2]/div/sam-label-wrapper/div/label");
	public static final By City = By.xpath(" //*[@id=\"MailingAddress(TAC1)\"]/div/div[2]/sam-location-component/sam-loc-autocomplete/div/sam-label-wrapper/div/label");
			//"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/sam-address-form-v2/div/div[2]/sam-location-component/sam-autocomplete[2]/div/sam-label-wrapper/div/label");
         //*[@id="MailingAddress(TAC1)"]/div/div[2]/sam-location-component/sam-loc-autocomplete/div/sam-label-wrapper/div/label
	public static final By CountryTextBox = By.xpath("//*[@id=\"Mailing-Addresscountry\"]");
	// *[@id="Mailing-Addresscity"]
	public static final By CityTextBox = By.xpath(" //*[@id=\"Mailing-Addresscity\"]");

	// public static final By ZipTextBox =
	// By.xpath("//*[@id=\"location-group-zip\"]");
	public static final By ZipTextBox = By.xpath("//*[@id=\"Mailing-Addresszip\"]");

	public static final By State = By.xpath("//*[@id=\"MailingAddress(TAC1)\"]/div/div[2]/sam-location-component/sam-autocomplete[2]/div/sam-label-wrapper/div/label");
			//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/sam-address-form-v2/div/div[2]/sam-location-component/sam-autocomplete[3]/div/sam-label-wrapper/div/label");
	// public static final By StateTextBox =
	// By.xpath("//*[@id=\"location-group-state\"]");
	public static final By StateTextBox = By.xpath("//*[@id=\"Mailing-Addressstate\"]");
	public static final By confirm = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/sam-button/button");

	public static final By RequestOffice = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[1]/title-and-section/div/h1");
	public static final By UseMailingAddress1 = By.xpath("//*[@id=\"Shipping Address (TAC2)\"]");

	public static final By UseMailingAddress2 = By.xpath("//*[@id=\"Billing Address (TAC3)\"]");
	public static final By MailingRequired = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/sam-address-form-v2/div/div[1]/span");
	public static final By OfficeConfirm = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/sam-button/button");

	public static final By OfficeConfirm2 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/sam-button/button");

	/////////////////////// Edit page

	public static final By FEDERALHIERARCHY = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[1]/title-and-section/div/h1/div");
	public static final By ConfirmBelowDetails = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[1]/title-and-section/div/div");

	public static final By OfficeDetail = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/h2");
	public static final By OfficeName1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[1]/div[1]");
	public static final By OfficeNameText1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[1]/div[2]");

	public static final By DeptIndAgency1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]");
	public static final By DeptIndAgencyText1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]");
	public static final By CGAC1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[3]/div[1]");
	public static final By CGACText1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[3]/div[2]");
	public static final By SubTier1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[4]/div[1]");
	public static final By SubTierText1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[4]/div[2]");
	public static final By AgencyCode1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[5]/div[1]");
	public static final By AgencyCodeText1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[5]/div[2]");
	public static final By StartDate = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[6]/div[1]");
	public static final By StartDateText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[6]/div[2]");
	public static final By EndDate = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[7]/div[1]");
	public static final By EndDateText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[7]/div[2]");
	public static final By Shortname1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[8]/div[1]");
	public static final By ShortnameText1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[8]/div[2]");
	public static final By OfficeRegion = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[9]/div[1]");
	public static final By OfficeRegionText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[9]/div[2]");
	public static final By OfficeAAC = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[10]/div[1]");
	public static final By OfficeAACText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[10]/div[2]");
	public static final By RequestorName = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[11]/div[1]");
	public static final By RequestorNameText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[11]/div[2]");
	public static final By RequestorEmail = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[12]/div[1]");
	public static final By RequestorEmailText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[12]/div[2]");
	public static final By RequestorPhoneNumber = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[13]/div[1]");
	public static final By RequestorPhoneNumberText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[13]/div[2]");
	public static final By POCName1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[14]/div[1]");
	public static final By POCNameText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[14]/div[2]");
	public static final By POCEmail1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[15]/div[1]");
	public static final By POCEmailText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[15]/div[2]");
	public static final By POCPhoneNumber1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[16]/div[1]");
	public static final By POCPhoneNumberText = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[16]/div[2]");
	public static final By OfficeTypes1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/h2");
	public static final By Types = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div[1]");
	public static final By StartDate1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div[2]");
	public static final By EndDate1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div[3]");
	public static final By Status = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div[4]");
	public static final By FinancialAssistanceFunding = By.xpath("//*[@id=\"FinancialAssistanceFunding\"]");

	public static final By ContractAwards = By.xpath("//*[@id=\"ContractAwards\"]");

	public static final By FinancialAssistanceAwards = By.xpath("//*[@id=\"FinancialAssistanceAwards\"]");
	public static final By ContractFunding1 = By.xpath("//*[@id=\"ContractFunding\"]");
	
	public static final By OfficeAddresses = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/h2");
	public static final By MailingAddressTAC12 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[1]/span[1]");
	public static final By MailingAddressTACText1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[1]/span[2]/div[1]");
	public static final By MailingAddressTACText2 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[1]/span[2]/div[2]");
	public static final By MailingAddressTACText3 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[1]/span[2]/div[3]");

	public static final By ShippingAddressTAC = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/sam-address-form-v2/div/div[1]/h3/span");

	public static final By ShippingAddressTAC1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/span[2]/div[1]");
	public static final By ShippingAddressTAC2 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/span[2]/div[2]");
	public static final By ShippingAddressTAC3 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/span[2]/div[3]");

	public static final By BillingAddressTAC = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[3]/sam-address-form-v2/div/div[1]/h3/span");
	public static final By BillingAddressTAC1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[3]/span[2]/div[1]");
	public static final By BillingAddressTAC2 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[3]/span[2]/div[2]");
	public static final By BillingAddressTAC3 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[3]/span[2]/div[3]");
	public static final By OfficeSubmit = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/sam-button/button");
	public static final By Active1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div[4]/span");
	public static final By OfficeRequest = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/h1");
	public static final By Success = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/div[1]");
	public static final By Success1 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/div[2]");
	public static final By close = By
			.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/sam-button/button");
	public static final By FHOfficeRequest = By
			.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/span");
	// Shipping Address (TAC2)

	public static final By ShippingAddressRequired = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/sam-address-form-v2/div/div[1]/span");

	public static final By Streetaddress1 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/sam-address-form-v2/div/div[3]/sam-text[1]/sam-label-wrapper/div/label");
	public static final By StreetaddressTextbox = By.xpath("//*[@id=\"street1-Shipping-Address\"]");
	public static final By CountryTAC2 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/sam-address-form-v2/div/div[3]/sam-location-component/sam-autocomplete[1]/div/sam-label-wrapper/div/label");
	public static final By CountryTAC2TextBox = By.xpath("//*[@id=\"Shipping-Addresscountry\"]");
	public static final By CountryTAC2TextBox1 = By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li");

	public static final By CityTAC2 = By.xpath("//*[@id=\"BillingAddress(TAC3)\"]/div/div[3]/sam-location-component/sam-loc-autocomplete/div/sam-label-wrapper/div/label");
			//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/sam-address-form-v2/div/div[3]/sam-location-component/sam-autocomplete[2]/div/sam-label-wrapper/div/label");
	public static final By CityTAC2TextBox = By.xpath("//*[@id=\"Shipping-Addresscity\"]");
	public static final By CityTAC2TextBox1 = By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li[1]");
	public static final By ZipTAC2 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/sam-address-form-v2/div/div[3]/sam-location-component/sam-text/sam-label-wrapper/div/label");
	public static final By ZipTACTextBox = By.xpath("//*[@id=\"Shipping-Addresszip\"]");
	public static final By StateTAC2 = By.xpath(
			"//*[@id=\"ShippingAddress(TAC2)\"]/div/div[3]/sam-location-component/sam-autocomplete[2]/div/sam-label-wrapper/div/label");
	
	public static final By StateTAC2TextBox = By.xpath("//*[@id=\"Shipping-Addressstate\"]");
	public static final By StateTAC2TextBox1 = By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li[1]");

	// Billing Address (TAC3)

	public static final By BillingAddressRequired = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[3]/sam-address-form-v2/div/div[1]/span");
	public static final By Streetaddress1TAC3 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[3]/sam-address-form-v2/div/div[3]/sam-text[1]/sam-label-wrapper/div/label");
	public static final By StreetaddressTextboxTAC13 = By.xpath("//*[@id=\"street1-Billing-Address\"]");

	public static final By CountryTAC3 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[3]/sam-address-form-v2/div/div[3]/sam-location-component/sam-autocomplete[1]/div/sam-label-wrapper/div/label");
	public static final By CountryTAC3Text = By.xpath("//*[@id=\"Billing-Addresscountry\"]");
	public static final By CountryTAC3TextBox1 = By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li[1]/span");
	public static final By CityTAC3 = By.xpath("//*[@id=\"BillingAddress(TAC3)\"]/div/div[3]/sam-location-component/sam-loc-autocomplete/div/sam-label-wrapper/div/label");
			//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[3]/sam-address-form-v2/div/div[3]/sam-location-component/sam-autocomplete[2]/div/sam-label-wrapper/div/label");
	public static final By CityTAC3TextBox = By.xpath("//*[@id=\"Billing-Addresscity\"]");

	public static final By CityTAC3TextBox1 = By.xpath("//*[@id=\"sam-autocomplete-results\"]/li[1]");
			//*[@id=\"sam-autocomplete-results-kv\"]/li[1]");
	                                                    //*[@id="sam-autocomplete-results"]/li[1]
	public static final By ZipTAC3 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[3]/sam-address-form-v2/div/div[3]/sam-location-component/sam-text/sam-label-wrapper/div/label");
	public static final By ZipTextBoxTAC3 = By.xpath("//*[@id=\"Billing-Addresszip\"]");

	public static final By StateTac3 = By.xpath("//*[@id=\"BillingAddress(TAC3)\"]/div/div[3]/sam-location-component/sam-autocomplete[2]/div/sam-label-wrapper/div/label");
			//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[3]/sam-address-form-v2/div/div[3]/sam-location-component/sam-autocomplete[3]/div/sam-label-wrapper/div/label");
	public static final By StateTac3Textbox = By.xpath("//*[@id=\"Billing-Addressstate\"]");
	public static final By StateTac3Textbox1 = By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li[1]");

	public static final By ShippingAddressTAC9 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/span[1]");
	public static final By BillingAddressTAC9 = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[3]/span[1]");

	// Error Message

	public static final By OfficeNameError = By.xpath("//*[@id=\"ofcName-input-error\"]");
	public static final By DateRequiredError = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	public static final By NameError = By.xpath("//*[@id=\"name-input-error\"]");
	public static final By EmailError = By.xpath("//*[@id=\"email-input-error\"]");
	public static final By PhoneError = By.xpath("//*[@id=\"mobile-phone-number-error\"]");
	public static final By StreetAddressError = By.xpath("//*[@id=\"street1-Mailing-Address-error\"]");
	public static final By CountryError = By.xpath("//*[@id=\"Mailing-Addresscountry-error\"]");
	public static final By ZipError = By.xpath("//*[@id=\"Mailing-Addresszip-error\"]");
	public static final By CityError = By.xpath("//*[@id=\"Mailing-Addresscity-error\"]");
	public static final By StateError = By.xpath("//*[@id=\"Mailing-Addressstate-error\"]");
	
	//public static final By InvalidEmail = By.xpath("//*[@id=\"email-input-error\"]");
//public static final By InvalidPhone = By.xpath("");

	public static final By AlreadyExists = By.xpath("//*[@id=\"ofcName-input-error\"]");
	public static final By StartBefore = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");

	public static final By AfterEnd = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	public static final By EarlierStartDate = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[3]/sam-date/sam-fieldset-wrapper/div/fieldset/span");

	// public static final By = By.xpath("");
	
	public static final By SubTierBreadCrumb = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[4]/a");
	
	public static final By AacAlreadyExists = By.xpath("//*[@id=\"ofcAAC-input-error\"]");
	 public static final By ContractAwards1 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 //public static final By ContractAwards2 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By ContractAwards2 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
		
	 
	 public static final By ContractAwards3 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By ContractAwards12 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By ContractAwards4 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	                                                   //*[@id="main-container"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span
	 public static final By ContractAwards5 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[2]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
     
	 public static final By FinancialAssistanceAwards12 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");	 
	 public static final By FinancialAssistanceAwards2 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By FinancialAssistanceAwards4 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");	 
	 public static final By FinancialAssistanceAwards5 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 
	 
	 public static final By FinancialAssistanceAwards3 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[3]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");

	 public static final By PocCheckbox = By.xpath("//*[@id=\"my-org-cbx\"]");
	 
	 
	 public static final By FinancialAssistanceFunding12 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By FinancialAssistanceFunding2 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By FinancialAssistanceFunding3 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By FinancialAssistanceFunding4 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By FinancialAssistanceFunding5 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[5]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 
	 public static final By ContractFunding12 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	                                                    
	 public static final By ContractFunding2 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By ContractFunding3 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By ContractFunding4 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span");
	 public static final By ContractFunding5 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[7]/form/div[4]/div/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span");

	
	 public static final By pluseSymbol = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/sam-address-form-v2/div/div[1]/h3/i");
	 public static final By SelectAddressType = By.id("Org Address Types");
	 public static final By  pluseSymbol2 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/sam-address-form-v2/div/div[1]/h3/i[1]");
	
	 public static final By  CrossSymbol1 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/sam-address-form-v2/div/div[1]/h3/i[2]");
	 public static final By  CrossSymbol2 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[3]/sam-address-form-v2/div/div[1]/h3/i");
	 public static final By  ErrorMailingAddress = By.id("street1-Mailing-Address-error");
	 public static final By  ErrorShippingAddress = By.id("street1-Shipping-Address-error");
	 public static final By  ErrorMailingAddresscountry = By.id("Mailing-Addresscountry-error");
	 public static final By  ErrorShippingAddresscountry = By.id("Shipping-Addresscountry-error");
	 public static final By  ErrorMailingAddresscity = By.id("Mailing-Addresscity-error");
	 public static final By  ErrorShippingAddresscity = By.id("Shipping-Addresscity-error");
	 public static final By  ErrorMailingAddressZip = By.id("Mailing-Addresszip-error");
	 public static final By  ErrorShippingAddressZip = By.id("Shipping-Addresszip-error");
	 public static final By  ErrorMailingAddressState = By.id("Mailing-Addressstate-error");
	 public static final By  ErrorShippingAddressState = By.id("Shipping-Addressstate-error");
	 public static final By  StreetEmpty2 = By.xpath("//*[@id=\"street1-Billing-Address-error\"]");
	 public static final By  CountryEmpty2 =By.xpath("//*[@id=\"Billing-Addresscountry-error\"]");
	 public static final By  CityEmpty2 = By.xpath("//*[@id=\"Billing-Addresscity-error\"]");
	 public static final By  ZipEmpty2 = By.xpath("//*[@id=\"Billing-Addresszip-error\"]");
	 public static final By  StateEmpty2 = By.xpath("//*[@id=\"Billing-Addressstate-error\"]");
	 
	 public static final By  DeselectContractAwards = By.xpath("//*[@id=\"ContractAwards\"]");
	 public static final By  DeselectFinancialAssistanceAwards = By.xpath("//*[@id=\"FinancialAssistanceAwards\"]");
	 public static final By  DeselectContractFunding = By.xpath("//*[@id=\"ContractFunding\"]");
	 public static final By  DeselectFinancialAssistanceFunding = By.xpath("//*[@id=\"FinancialAssistanceFunding\"]"); 
	 public static final By OfficeEdit = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/button");
	 public static final By ConfirmationOfficeStartDate = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[6]/div[2]");
	 public static final By ConfirmationOfficeEndDate = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[7]/div[2]");
	 public static final By ConfirmationContractAwardsStartDate = By.xpath("//*[@id=\"ContractAwardsstart\"]");
	 public static final By ConfirmationContractAwardsEndDate = By.xpath("//*[@id=\"ContractAwardsend\"]");
	 public static final By ConfirmationFinancialAwardsStartDate = By.xpath("//*[@id=\"FinancialAssistanceAwardsstart\"]");
	 public static final By ConfirmationFinancialAwardsEndDate = By.xpath("//*[@id=\"FinancialAssistanceAwardsend\"]");
	 public static final By ConfirmationContractFundingStartDate = By.xpath("//*[@id=\"ContractFundingstart\"]");
	 public static final By ConfirmationContractFundingEndDate = By.xpath("//*[@id=\"ContractFundingend\"]");
	 public static final By ConfirmationFinancialFundingStartDate = By.xpath("//*[@id=\"FinancialAssistanceFundingstart\"]");
	 public static final By ConfirmationFinancialFundingEndDate = By.xpath("//*[@id=\"FinancialAssistanceFundingend\"]");
	 
	 public static final By ConfirmationStartDate1 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[6]/div[2]");
	 public static final By ConfirmationEndDate1 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[7]/div[2]");
	 public static final By PocName3 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/form/section/div[1]/span[2]");
	 public static final By PocEmail3 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/form/section/div[2]/span[2]");
	 public static final By PocNumber3 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/form/section/div[3]/span[2]");
	 public static final By Street2 = By.xpath("//*[@id=\"street2-Mailing-Address\"]");
	 public static final By UseMailingAdressTAC3 = By.xpath("//*[@id=\"Billing-Address\"]");
	 public static final By UseMailingAdressTAC2 = By.xpath("//*[@id=\"Shipping-Address\"]");
	 
	 public static final By MailingAdressTAC3Address1 = By.xpath("//*[@id=\"BillingAddress(TAC3)\"]/div/div[3]/div[1]/span[2]");
	 public static final By MailingAdressTAC3Address2 = By.xpath("//*[@id=\"BillingAddress(TAC3)\"]/div/div[3]/div[2]/span[2]");
	 public static final By MailingAdressTAC3Country = By.xpath("//*[@id=\"BillingAddress(TAC3)\"]/div/div[3]/div[3]/span[2]");
	 public static final By MailingAdressTAC3Zip = By.xpath("//*[@id=\"BillingAddress(TAC3)\"]/div/div[3]/div[4]/span[2]");
	 public static final By MailingAdressTAC3City = By.xpath("//*[@id=\"BillingAddress(TAC3)\"]/div/div[3]/div[5]/span[2]");
	 public static final By MailingAdressTAC3Stat3 = By.xpath("//*[@id=\"BillingAddress(TAC3)\"]/div/div[3]/div[6]/span[2]");
	 
	 
	 public static final By MailingAdressTAC2Address1 = By.xpath("//*[@id=\"ShippingAddress(TAC2)\"]/div/div[3]/div[1]/span[2]");
	 public static final By MailingAdressTAC2Address2 = By.xpath("//*[@id=\"ShippingAddress(TAC2)\"]/div/div[3]/div[2]/span[2]");
	 public static final By MailingAdressTAC2Country = By.xpath("//*[@id=\"ShippingAddress(TAC2)\"]/div/div[3]/div[3]/span[2]");
	 public static final By MailingAdressTAC2Zip = By.xpath("//*[@id=\"ShippingAddress(TAC2)\"]/div/div[3]/div[4]/span[2]");
	 public static final By MailingAdressTAC2City = By.xpath("//*[@id=\"ShippingAddress(TAC2)\"]/div/div[3]/div[5]/span[2]");
	 public static final By MailingAdressTAC2Stat3 = By.xpath("//*[@id=\"ShippingAddress(TAC2)\"]/div/div[3]/div[6]/span[2]");
	 
	 public static final By ConfirmationMailingAddress = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[1]/span[2]/div[1]");
	 public static final By ConfirmationMailingCity = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[1]/span[2]/div[2]");
	 public static final By ConfirmationMailingCountry = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[1]/span[2]/div[3]");
	 
	 
	 public static final By ConfirmationShippingAddress = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/span[2]/div[1]");
	 public static final By ConfirmationShippingCity = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/span[2]/div[2]");
	 public static final By ConfirmationShippingCountry = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]/span[2]/div[3]");
	 
	 
	 public static final By ConfirmationBillingAddress = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[3]/span[2]/div[1]");
	 public static final By ConfirmationBillingCity = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[3]/span[2]/div[2]");
	 public static final By ConfirmationBillingCountry = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[3]/span[2]/div[3]");
	 
	 
	
	
	 
	 
	 
	 
	 
	 
}
