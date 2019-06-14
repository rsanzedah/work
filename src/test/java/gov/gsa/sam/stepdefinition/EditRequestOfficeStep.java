package gov.gsa.sam.stepdefinition;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gov.gsa.sam.stepdefinition.RequestOfficeEditPagePositiveStep;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gov.gsa.sam.base.DateClass;
import gov.gsa.sam.fields.CreateOfficeFields;
import gov.gsa.sam.fields.CreateOfficeLocators;
import gov.gsa.sam.fields.EditRequestOfficeField;
import gov.gsa.sam.locators.EditOfficeProfileOfficeType;
import gov.gsa.sam.locators.EditRequestOfficeLocators;
import gov.gsa.sam.utils.OfficeType;
import net.thucydides.core.annotations.Managed;

public class EditRequestOfficeStep {
	public static String caStatus;
	public static String str1 = "";
	public static String x = "x";
	public static String ContractFunding = "Contract Funding";
	public static String ContractAwards = "Contract Awards";
	public static String FinancialAssistanceAwards = "Financial Assistance Awards";
	public static String FinancialAssistanceFunding = "Financial Assistance Funding";
	public static String cfStatus;
	public static String OfficeActivity1;
	public static String RequestorName1;
	public static String RequestorEmail1;
	public static String RequestorPhone1;
	public static String deptName;
	public static String cgac;
	public static String agencyName;
	public static String agencyCode;
	public static String AAC;
	public static String EditAAC;
	public static String EditDepartment;
	public static String EditSubTier;
	public static String EditStartDate;
	public static String EditEndDate;
	public static String EditShortname1;
	public static String EditRegion;
	public static String EditContractFunding;
	public static String EditContractFundingStart;
	public static String EditContractFundingEnd;
	public static String EditContractFundingStatus;
	public static String EditContractAwards;
	public static String EditContractAwardsStartDate;
	public static String EditContractAwardsEndDate;
	public static String EditContractAwardsStatus;
	public static String EditFinancialAssistanceAwards;
	public static String EditFinancialAssistanceAwardsStattDate;
	public static String EditFinancialAssistanceAwardsEndDate;
	public static String EditFinancialAssistanceAwardsStatus;
	public static String EditFinancialAssistanceFunding;
	public static String EditFinancialAssistanceFundingStartDate;
	public static String EditFinancialAssistanceFundingEndDate;
	public static String EditFinancialAssistanceFundingStatus;
	public static String mailingAddress1;
	public static String mailingAddress2;
	public static String EditContractAwardsStart11;
	public static String EditContractAwardsStartStatus11;
	public static String editofficeName;
	public static String EditDepartmentText;
	public static String ProfileStartMonth;
	public static String ProfileStartyear;
	public static String ProfileStartDate;
	public static String ProfileEndDate;
	public static String ProfileEndMonth;
	public static String ProfileEndyear;
	public static String profileEditShortname;
	public static String profileRegion;
	public static String EditSubTierText;
	public static String NED = "No End Date Available";
	public static String EditSubTierTextProfile1;
	public static String NRA = "No Region Info Available";
	public static String NSA = "No Shortname Available";
	public static String EditmailingAddress1;
	public static String EditmailingAddress2;
	public static String EditmailingAddress3;
	public static String EditmailingAddress4;
	public static String faaStatus;
	public static String confirmationEditEndDate;
	static Map<String, OfficeType> officeTypeMap = new HashMap<String, OfficeType>();
	static Map<String, OfficeType> officeTypeMap1 = new HashMap<String, OfficeType>();
	String officeTypeNameFromProfilePage;

	@Managed
	public static WebDriver driver;
	Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(EditRequestOfficeStep.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Then("^User navigate into search page and serach for gsa department$")
	public void The_user_navigates_into_the_search_page_and_search_for_gas_department() throws Throwable {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/input"))
				.sendKeys(EditRequestOfficeField.SearchGSA);
		Thread.sleep(6000);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(EditRequestOfficeLocators.FirstLink));
		// WebElement elt = driver.findElement(EditRequestOfficeLocators.FirstLink);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/i"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(9000);

		WebElement elt1 = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[4]/div/div[2]/div/div[2]/div[1]/a"));
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(9000);

		String deptName1 = driver.findElement(EditRequestOfficeLocators.departmentName).getText();
		logger.info("deptName1: " + deptName1);
		deptName = deptName1.replace("\n", " ");

		logger.info("deptName: " + deptName);

		cgac = driver.findElement(EditRequestOfficeLocators.cgac).getText().trim().toString();
		logger.info("cgac: " + cgac);

	}

	@And("^Read agency name and agency code on subTier profile page$")
	public void Read_agency_name_and_agency_code_on_subTier_profile_page() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EditRequestOfficeLocators.agencyName));
		String agencyName1 = driver.findElement(EditRequestOfficeLocators.agencyName).getText();
		logger.info("agencyName: " + agencyName1);
		agencyName = agencyName1.replace("\n", " ");
		logger.info("agencyName:" + agencyName);

		agencyCode = driver.findElement(EditRequestOfficeLocators.agencyCode).getText().trim().toString();
		logger.info("agencyCode: " + agencyCode);
	}

	@Given("^Reading the Request Office Profile Page$")
	public void Reading_the_Request_Office_Profile_Page() throws Throwable {
		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EditRequestOfficeLocators.OfficeDetails));

		String editofficeName1 = driver.findElement(EditOfficeProfileOfficeType.EditofficeName).getText();
		logger.info("officeName:" + editofficeName);
		editofficeName = editofficeName1.replace("\n", " ");
		logger.info("editofficeName:" + editofficeName);

		String OfficeDetails = driver.findElement(EditRequestOfficeLocators.OfficeDetails).getText();
		logger.info("OfficeDetails:" + OfficeDetails);

		Module1 module1 = new Module1();
		module1.ValidatesMethod(driver, EditRequestOfficeLocators.OfficeDetails, EditRequestOfficeField.OfficeDetail);

		/*
		 * String OfficeDetails =
		 * driver.findElement(EditRequestOfficeLocators.OfficeDetails).getText();
		 * logger.info("OfficeDetails:" + OfficeDetails); logger.info("OfficeDetails1:"
		 * + EditRequestOfficeField.OfficeDetail);
		 * Assert.assertEquals(EditRequestOfficeField.OfficeDetail, OfficeDetails);
		 */

		String EditAAC = driver.findElement(EditRequestOfficeLocators.EditAAC).getText();
		logger.info("EditAAC:" + EditAAC);
		logger.info("EditAAC1:" + EditRequestOfficeField.AAC);
		Assert.assertEquals(EditRequestOfficeField.AAC, EditAAC);

		EditAAC = driver.findElement(EditRequestOfficeLocators.EditAACText).getText();
		logger.info("EditAACText:" + EditAAC);

		String EditDepartment = driver.findElement(EditRequestOfficeLocators.EditDepartment).getText();
		logger.info("EditDepartment:" + EditDepartment);
		logger.info("EditDepartment1:" + EditRequestOfficeField.DepartmentText);
		Assert.assertEquals(EditRequestOfficeField.DepartmentText, EditDepartment);

		EditDepartmentText = driver.findElement(EditRequestOfficeLocators.EditDepartmentText).getText();
		logger.info("EditDepartmentText:" + EditDepartmentText);
		logger.info("EditDepartment1:" + deptName);
		Assert.assertTrue(deptName.contains(EditDepartmentText));

		String EditSubTier = driver.findElement(EditRequestOfficeLocators.EditSubTier).getText();
		logger.info("EditSubTier:" + EditSubTier);
		logger.info("EditSubTier:" + EditRequestOfficeField.SubTierText);
		Assert.assertEquals(EditRequestOfficeField.SubTierText, EditSubTier);

		EditSubTierTextProfile1 = driver.findElement(EditRequestOfficeLocators.EditSubTierText).getText();
		logger.info("EditSubTierText:" + EditSubTierTextProfile1);
		logger.info("EditSubTier:" + agencyName);
		Assert.assertTrue(agencyName.contains(EditSubTierTextProfile1));

		String EditStartDate = driver.findElement(EditRequestOfficeLocators.EditStartDate).getText();
		logger.info("EditStartDate:" + EditSubTierText);
		logger.info("EditStartDate1:" + EditRequestOfficeField.EditStartDate);
		Assert.assertEquals(EditRequestOfficeField.EditStartDate, EditStartDate);

		EditStartDate = driver.findElement(EditRequestOfficeLocators.EditStartDateText).getText();
		logger.info("EditStartDateText:" + EditStartDate);
		DateClass.dateMonth(EditStartDate);
		ProfileStartMonth = DateClass.monthStr;
		ProfileStartyear = DateClass.yearStr;
		ProfileStartDate = DateClass.dateStr;

		logger.info("ProfileStartMonth" + ProfileStartMonth);
		logger.info("ProfileStartyear" + ProfileStartyear);
		logger.info("ProfileStartDate:" + ProfileStartDate);

		String EditEndDate = driver.findElement(EditRequestOfficeLocators.EditEndDate).getText();
		logger.info("EditEndDate:" + EditEndDate);
		logger.info("EditEndDate1:" + EditRequestOfficeField.EditEndDate);
		Assert.assertEquals(EditRequestOfficeField.EditEndDate, EditEndDate);

		Thread.sleep(2000);
		EditEndDate = driver.findElement(EditRequestOfficeLocators.EditEndDateText).getText();
		logger.info("EditEndDateText:" + EditEndDate);
		if (!EditEndDate.equalsIgnoreCase(NED)) {
			DateClass.dateMonth(EditEndDate);
			ProfileEndDate = DateClass.dateStr;
			ProfileEndMonth = DateClass.monthStr;
			ProfileEndyear = DateClass.yearStr;
			logger.info("ProfileEndDate" + ProfileEndDate);
			logger.info("ProfileEndMonth" + ProfileEndMonth);
			logger.info("ProfileEndyear:" + ProfileEndyear);
		} else {
			logger.info("No End Date Available");
		}

		String EditShortname1 = driver.findElement(EditRequestOfficeLocators.EditShortname).getText();
		logger.info("EditShortname:" + EditShortname1);
		logger.info("EditShortname1:" + EditRequestOfficeField.EditShortname);
		Assert.assertEquals(EditRequestOfficeField.EditShortname, EditShortname1);

		Thread.sleep(3000);
		String profileEditShortname1 = driver.findElement(EditRequestOfficeLocators.EditShortnameText).getText();
		logger.info("EditShortnameText:" + profileEditShortname1);
		if (!profileEditShortname1.equalsIgnoreCase(NSA)) {
			profileEditShortname = profileEditShortname1;
		} else {
			logger.info("No Shortname Available");
		}

		String EditRegion = driver.findElement(EditRequestOfficeLocators.EditRegion).getText();
		logger.info("EditRegion:" + EditRegion);
		logger.info("EditRegion1:" + EditRequestOfficeField.EditRegion);
		Assert.assertEquals(EditRequestOfficeField.EditRegion, EditRegion);

		String profileRegion1 = driver.findElement(EditRequestOfficeLocators.EditRegionText).getText();
		logger.info("EditRegionText:" + profileRegion1);

		if (!profileRegion1.equalsIgnoreCase(NRA)) {
			profileRegion = profileRegion1;
		} else {
			logger.info("No Region Available");
		}

		String OfficeTypes = driver.findElement(EditRequestOfficeLocators.OfficeTypes).getText();
		logger.info("OfficeTypes:" + OfficeTypes);
		logger.info("OfficeTypes1:" + EditRequestOfficeField.OfficeTypes);
		Assert.assertEquals(EditRequestOfficeField.OfficeTypes, OfficeTypes);

		String Types = driver.findElement(EditRequestOfficeLocators.EditType).getText();
		logger.info("Types:" + Types);
		logger.info("Types1:" + EditRequestOfficeField.Types);
		Assert.assertEquals(EditRequestOfficeField.Types, Types);

		String StartDateText = driver.findElement(EditRequestOfficeLocators.StartDateText).getText();
		logger.info("StartDateText:" + StartDateText);
		logger.info("StartDateText1:" + EditRequestOfficeField.StartDate1);
		Assert.assertEquals(EditRequestOfficeField.StartDate1, StartDateText);

		String EndDateText = driver.findElement(EditRequestOfficeLocators.EndDateText).getText();
		logger.info("EndDateText:" + EndDateText);
		logger.info("EndDateText1:" + EditRequestOfficeField.EndDate1);
		Assert.assertEquals(EditRequestOfficeField.EndDate1, EndDateText);
		Thread.sleep(3000);

		String EditStatus1 = driver.findElement(EditRequestOfficeLocators.EditStatus).getText();
		logger.info("EditStatus:" + EditStatus1);
		logger.info("EditStatus1:" + EditRequestOfficeField.Status);
		Assert.assertEquals(EditRequestOfficeField.Status, EditStatus1);

		Thread.sleep(3000);

		List<WebElement> row = driver
				.findElements(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div"));
		logger.info("row:" + row.size());
		int rowSize = row.size();
		List<WebElement> col = driver.findElements(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[" + rowSize + "]/div"));
		logger.info("col:" + col.size());
		int col1 = col.size();

		for (int i = 2; i <= rowSize; i++) {
			OfficeType officeType = new OfficeType();
			for (int j = 1; j <= col1; j++) {
				String value = driver.findElement(By.xpath(
						"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[" + i + "]/div[" + j + "]"))
						.getText();

				// logger.info("value:" + i + j + value);

				if (j == 2) { // Start Date

					officeType.setOfficeTypeStartDate(value);
				} else if (j == 3) { // End Date

					officeType.setOfficeTypeEndDate(value);
				} else if (j == 4) { // Status

					officeType.setOfficeTypeStatus(value);

				} else if (j == 1) { // officeType
					officeTypeNameFromProfilePage = value;
					officeType.setOfficeTypeName(officeTypeNameFromProfilePage);
				}

				officeTypeMap.put(officeTypeNameFromProfilePage, officeType);
			}
		}

		Set<String> keys = officeTypeMap.keySet();
		System.out.println(keys);
		// System.out.println("*********");

		Set<String> keySet = officeTypeMap.keySet();
		Iterator<String> keySetItr = keySet.iterator();
		while (keySetItr.hasNext()) {
			String currentKey = keySetItr.next();
			OfficeType s2 = officeTypeMap.get(currentKey);
			logger.info(currentKey + ":" + s2);
			// s1.getOfficeTypeStartDate();
		}

		// OfficeType s1 = officeTypeMap.get("Financial Assistance Awards");
		// logger.info("StartDate FAA: " + s1.getOfficeTypeStartDate());
		// OfficeType s2 = officeTypeMap.get("Contract Awards");
		Thread.sleep(3000);
		String OfficeAddress = driver.findElement(EditRequestOfficeLocators.OfficeAddress).getText();
		logger.info("OfficeAddress:" + OfficeAddress);
		logger.info("OfficeAddress1:" + EditRequestOfficeField.OfficeAddresss);
		Assert.assertEquals(OfficeAddress, EditRequestOfficeField.OfficeAddresss);
		Thread.sleep(3000);
		EditmailingAddress1 = driver.findElement(EditRequestOfficeLocators.EditmailingAddress1).getText();
		logger.info("EditmailingAddress1 Street 1:" + EditmailingAddress1);
		Thread.sleep(3000);
		// EditmailingAddress4 =
		// driver.findElement(EditOfficeProfileOfficeType.officeProfileStreet2).getText();
		// logger.info("EditmailingAddress4 Street 2:" + EditmailingAddress4);
		// Thread.sleep(3000);
		EditmailingAddress2 = driver.findElement(EditRequestOfficeLocators.EditmailingAddress2).getText();
		logger.info("EditmailingAddress2: Strret 2" + EditmailingAddress2);
		Thread.sleep(3000);
		EditmailingAddress3 = driver.findElement(EditRequestOfficeLocators.EditmailingAddress3).getText();
		logger.info("EditmailingAddress3 City:" + EditmailingAddress3);
		
		Thread.sleep(3000);
		EditmailingAddress4 = driver.findElement(EditRequestOfficeLocators.EditmailingAddress4).getText();
		logger.info("EditmailingAddress4 zip:" + EditmailingAddress4);
	}

	@Then("^Validates values on request office profile page and request office edit page$")
	public static void Validates_values_on_request_office_profile_page_and_request_office_edit_page() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.OfficeNameTextBox));

		String OfficeNameTextBox = driver.findElement(CreateOfficeLocators.OfficeNameTextBox).getAttribute("value");
		logger.info("OfficeNameTextBox: " + OfficeNameTextBox);
		logger.info("editofficeName: " + editofficeName);

		Assert.assertTrue(editofficeName.contains(OfficeNameTextBox));

		Module1 module2 = new Module1(); // GENERAL SERVICES ADMINISTRATION
		module2.ValidatesMethod(driver, CreateOfficeLocators.DeptIndAgencyText, EditDepartmentText);
		Thread.sleep(2000);
		module2.ValidatesMethod(driver, CreateOfficeLocators.CGACText, cgac);
		Thread.sleep(5000);
		module2.ValidatesMethod(driver, CreateOfficeLocators.SubTierText, EditSubTierTextProfile1);
		Thread.sleep(5000);
		module2.ValidatesMethod(driver, CreateOfficeLocators.AgencyCodeText, agencyCode);
		Thread.sleep(5000);

		if (ProfileEndMonth != null) {
			module2.ReadingValueFromEditableFields(driver, EditOfficeProfileOfficeType.EditEndMonth, ProfileEndMonth);

		} else {
			logger.info("End Month is null");
		}
		Thread.sleep(2000);

		Thread.sleep(2000);

		if (ProfileEndDate != null) {
			module2.ReadingValueFromEditableFields(driver, EditOfficeProfileOfficeType.EditEndDate, ProfileEndDate);
		} else {
			logger.info("End Date is null");
		}
		Thread.sleep(2000);

		if (ProfileEndyear != null) {
			module2.ReadingValueFromEditableFields(driver, EditOfficeProfileOfficeType.EditEndYear, ProfileEndyear);
		} else {
			logger.info("End Year is null");
		}

		if (profileEditShortname != null) {
			module2.ReadingValueFromEditableFields(driver, EditOfficeProfileOfficeType.ShortName, profileEditShortname);
		} else {
			logger.info("Short name is null");
		}

		if (profileRegion != null) {
			module2.ReadingValueFromEditableFields(driver, EditOfficeProfileOfficeType.OfficeRegion, profileRegion);
		} else {
			logger.info("Region is null");
		}

		OfficeActivity1 = driver.findElement(EditRequestOfficeLocators.ACC2Text).getText();
		logger.info("OfficeActivity1 : " + OfficeActivity1);

		module2.ValidatesMethod(driver, CreateOfficeLocators.Requestor, CreateOfficeFields.Requestor);
		module2.ValidatesMethod(driver, CreateOfficeLocators.NameText, CreateOfficeFields.Name);
		module2.ValidatesMethod(driver, CreateOfficeLocators.EmailText, CreateOfficeFields.Email);
		module2.ValidatesMethod(driver, CreateOfficeLocators.PhoneNumberText, CreateOfficeFields.Phone);

		OfficeType s1 = officeTypeMap.get("Financial Assistance Awards");
		logger.info("StartDate FAA2: " + s1.getOfficeTypeStartDate());
		OfficeType s2 = officeTypeMap.get("Contract Awards");
		logger.info("CA Status2:" + s2.getOfficeTypeStatus());

		OfficeType ca = officeTypeMap.get("Contract Awards");
		if (ca.getOfficeTypeName().equals(ContractAwards)) {
			boolean selection = driver.findElement(CreateOfficeLocators.ContractAwardsCheckbox).isSelected();
			logger.info("Contract Awards" + selection);
			if (ca.getOfficeTypeStartDate().length() != (str1.length())) {
				String caStartMonth = DateClass.getMonth(officeTypeMap.get("Contract Awards").getOfficeTypeStartDate());
				String caStartDate = DateClass.getDate(officeTypeMap.get("Contract Awards").getOfficeTypeStartDate());
				String caStartYear = DateClass.getYear(officeTypeMap.get("Contract Awards").getOfficeTypeStartDate());
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractAwardsStartMonthText,
						caStartMonth);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractAwardsStartDayText,
						caStartDate);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractAwardsStartYearText,
						caStartYear);
			} else {

				logger.info("Contract Awards has no start date");
			}
			if (ca.getOfficeTypeEndDate().length() != (str1.length())) {
				String caEndmonth = DateClass.getMonth(officeTypeMap.get("Contract Awards").getOfficeTypeEndDate());
				String caEndDate = DateClass.getDate(officeTypeMap.get("Contract Awards").getOfficeTypeEndDate());
				String caEndYear = DateClass.getYear(officeTypeMap.get("Contract Awards").getOfficeTypeEndDate());
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractAwardsEndMonthText,
						caEndmonth);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractAwardsEndDayText,
						caEndDate);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractAwardsEndYearText,
						caEndYear);
			} else {

				logger.info("Contract Awards had  no End date");
			}

			String caStatus = officeTypeMap.get("Contract Awards").getOfficeTypeStatus();
			logger.info("caStatus" + caStatus);

		} else {
			logger.info("Contract Awards is not selected");
		}

		OfficeType faa = officeTypeMap.get("Financial Assistance Awards");
		if (faa.getOfficeTypeName().equals(FinancialAssistanceAwards)) {
			boolean selection = driver.findElement(CreateOfficeLocators.FinancialAwardsCheckBox).isSelected();
			logger.info("Financial Assistance Awards" + selection);

			if (faa.getOfficeTypeStartDate().length() != (str1.length())) {
				String faaStartmonth = DateClass
						.getMonth(officeTypeMap.get("Financial Assistance Awards").getOfficeTypeStartDate());
				String faaStartDate = DateClass
						.getDate(officeTypeMap.get("Financial Assistance Awards").getOfficeTypeStartDate());
				String faaStartYear = DateClass
						.getYear(officeTypeMap.get("Financial Assistance Awards").getOfficeTypeStartDate());
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialAwardsStartMonthText,
						faaStartmonth);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialAwardsStartDayText,
						faaStartDate);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialAwardsStartYearText,
						faaStartYear);
			} else {
				logger.info("Financial Assistance Awards has start date");
			}

			if (faa.getOfficeTypeEndDate().length() != (str1.length())) {
				String faaEndmonth = DateClass
						.getMonth(officeTypeMap.get("Financial Assistance Awards").getOfficeTypeEndDate());
				String faaEndDate = DateClass
						.getDate(officeTypeMap.get("Financial Assistance Awards").getOfficeTypeEndDate());
				String faaEndYear = DateClass
						.getYear(officeTypeMap.get("Financial Assistance Awards").getOfficeTypeEndDate());
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialAwardsEndMonthText,
						faaEndmonth);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialAwardsEndDayText,
						faaEndDate);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialAwardsEndYearText,
						faaEndYear);
			} else {
				logger.info("Financial Assistance Awards has start date");
			}
			String faaStatus = officeTypeMap.get("Financial Assistance Awards").getOfficeTypeStatus();
			logger.info("faaStatus" + faaStatus);
		} else {
			logger.info("Financial Assistance Awards  is not selected");
		}
		OfficeType cf = officeTypeMap.get("Contract Funding");
		if (cf.getOfficeTypeName().equals(ContractFunding)) {
			boolean selection = driver.findElement(CreateOfficeLocators.ContractFunding).isSelected();
			logger.info("Contract Funding" + selection);
			if (cf.getOfficeTypeStartDate().length() != (str1.length())) {
				String cfStartmonth = DateClass
						.getMonth(officeTypeMap.get("Contract Funding").getOfficeTypeStartDate());
				String cfStartDate = DateClass.getDate(officeTypeMap.get("Contract Funding").getOfficeTypeStartDate());
				String cfStartYear = DateClass.getYear(officeTypeMap.get("Contract Funding").getOfficeTypeStartDate());
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractFundingStartMonthText,
						cfStartmonth);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractFundingStartDayText,
						cfStartDate);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractFundingStartYearText,
						cfStartYear);
			} else {
				logger.info("Contract Funding has start date");
			}

			if (cf.getOfficeTypeEndDate().length() != (str1.length())) {
				String cfEndmonth = DateClass.getMonth(officeTypeMap.get("Contract Funding").getOfficeTypeEndDate());
				String cfEndDate = DateClass.getDate(officeTypeMap.get("Contract Funding").getOfficeTypeEndDate());
				String cfEndYear = DateClass.getYear(officeTypeMap.get("Contract Funding").getOfficeTypeEndDate());
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractFundingEndMonthText,
						cfEndmonth);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractFundingEndDayText,
						cfEndDate);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ContractFundingEndYearText,
						cfEndYear);
			} else {
				logger.info("Contract Funding has start date");
			}
			String cfStatus = officeTypeMap.get("Contract Funding").getOfficeTypeStatus();
			logger.info("CFStatus" + cfStatus);
		} else {
			logger.info("Contract Funding  is not selected");
		}

		logger.info("###################");

		OfficeType faf = officeTypeMap.get("Financial Assistance Funding");
		if (faf.getOfficeTypeName().equals(FinancialAssistanceFunding)) {
			boolean selection = driver.findElement(CreateOfficeLocators.FinancialAwardsCheckBox).isSelected();
			logger.info("Financial Assistance Awards" + selection);
			// if(faaStartmonth != null) {
			if (faa.getOfficeTypeStartDate().length() != (str1.length())) {
				String fafStartmonth = DateClass
						.getMonth(officeTypeMap.get("Financial Assistance Funding").getOfficeTypeStartDate());
				String fafStartDate = DateClass
						.getDate(officeTypeMap.get("Financial Assistance Funding").getOfficeTypeStartDate());
				String fafStartYear = DateClass
						.getYear(officeTypeMap.get("Financial Assistance Funding").getOfficeTypeStartDate());
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialFundingStartMonthText,
						fafStartmonth);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialFundingStartDayText,
						fafStartDate);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialFundingStartYearText,
						fafStartYear);
			} else {
				logger.info("Financial Assistance Awards has start date");
			}

			if (faf.getOfficeTypeEndDate().length() != (str1.length())) {
				String fafEndmonth = DateClass
						.getMonth(officeTypeMap.get("Financial Assistance Funding").getOfficeTypeEndDate());
				String fafEndDate = DateClass
						.getDate(officeTypeMap.get("Financial Assistance Funding").getOfficeTypeEndDate());
				String fafEndYear = DateClass
						.getYear(officeTypeMap.get("Financial Assistance Funding").getOfficeTypeEndDate());
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialFundingEndMonthText,
						fafEndmonth);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialFundingEndDayText,
						fafEndDate);
				module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.FinancialFundingEndYearText,
						fafEndYear);
			} else {
				logger.info("Financial Assistance Funding has start date");
			}
			String fafStatus = officeTypeMap.get("Financial Assistance Funding").getOfficeTypeStatus();
			logger.info("faaStatus" + fafStatus);
		} else {
			logger.info("Financial Assistance Funding  is not selected");
		}

		module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.TAC1Street1TextBox, EditmailingAddress1);
	//module2.ReadingValueFromEditableFields(driver,EditOfficeProfileOfficeType.editStreet2, EditmailingAddress2);

		module2.ReadingValueFromEditableFields(driver, CreateOfficeLocators.ZipTextBox, EditmailingAddress4);

		String city = driver.findElement(CreateOfficeLocators.CityTextBox).getAttribute("value");
		Assert.assertTrue(EditmailingAddress3.contains(city));

		String state = driver.findElement(By.xpath("//*[@id=\"Mailing-Addressstate\"]")).getAttribute("value");
		logger.info("state:" + state);
		logger.info("EditmailingAddress2:" + EditmailingAddress2);
		// Assert.assertTrue(EditmailingAddress2.contains(state));

		Thread.sleep(2000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(-0,-5000)");
		Thread.sleep(2000);

	}

	@And("^The user Edit select office type contract Awards ([^\"]*)$")
	public void The_edit_user_select_office_type_contracting(String contractAwards) throws Throwable {
		if (contractAwards != null && contractAwards.trim().length() != 0) {
			logger.info("Not select ContractAwardsCheckbox" + contractAwards);
		} else {
			boolean selection = driver.findElement(CreateOfficeLocators.ContractAwardsCheckbox).isSelected();
			if (selection == true) {
				WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsCheckbox);
				Actions builder3 = new Actions(driver);
				Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
				Thread.sleep(2000);
				seriesOfActions3.sendKeys(Keys.TAB);
				seriesOfActions3.perform();
			}

			logger.info("ContractAwardsCheckbox: " + contractAwards);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsCheckbox);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
			Thread.sleep(2000);
			seriesOfActions3.sendKeys(Keys.TAB);
			seriesOfActions3.perform();
			String ContractAwardsText = driver.findElement(CreateOfficeLocators.ContractAwardsText).getText();
			logger.info("ContractAwardsText : " + ContractAwardsText);
			logger.info("ContractAwardsText 1: " + CreateOfficeFields.ContractAwards);
			Assert.assertEquals(CreateOfficeFields.ContractAwards, ContractAwardsText);

			String ContractAwardsStartOptional1 = driver.findElement(CreateOfficeLocators.ContractAwardsStartOptional)
					.getText();
			logger.info("ContractAwardsStartOptional1 : " + ContractAwardsStartOptional1);
			logger.info("ContractAwardsStartOptional 1: " + CreateOfficeFields.StartOptional);
			Assert.assertEquals(CreateOfficeFields.StartOptional, ContractAwardsStartOptional1);

			String ContractAwardsStart1 = driver.findElement(CreateOfficeLocators.ContractAwardsStart1).getText();
			logger.info("ContractAwardsStart1 : " + ContractAwardsStart1);
			logger.info("ContractAwardsStart 1: " + CreateOfficeFields.ContractFundingStart);
			Assert.assertEquals(CreateOfficeFields.ContractFundingStart, ContractAwardsStart1);
			logger.info("enters contracting ", scenario);
		}
	}

	@And("^The user edit select office type Financial Awards ([^\"]*)$")
	public void The_user_edit_select_office_type_Financial_Award(String FinancialAwards) {

		if (FinancialAwards != null && FinancialAwards.trim().length() != 0) {
			logger.info("No select FinancialAwards: " + FinancialAwards);

		} else {
			boolean selection = driver.findElement(CreateOfficeLocators.FinancialAwardsCheckBox).isSelected();
			if (selection == true) {
				logger.info("FinancialAwards:" + FinancialAwards);
				WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsCheckBox);
				Actions builder3 = new Actions(driver);
				Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
				seriesOfActions3.perform();
			}
			logger.info("FinancialAwards:" + FinancialAwards);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsCheckBox);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
			seriesOfActions3.sendKeys(Keys.TAB);
			seriesOfActions3.perform();
			String FinancialAwardsText = driver.findElement(CreateOfficeLocators.FinancialAwardsText).getText();
			logger.info("FinancialAwardsText : " + FinancialAwardsText);
			logger.info("FinancialAwardsText 1: " + CreateOfficeFields.FinancialAssistanceAwards);
			Assert.assertEquals(CreateOfficeFields.FinancialAssistanceAwards, FinancialAwardsText);
			String FinancialAwardsStartOptional = driver.findElement(CreateOfficeLocators.FinancialAwardsStartOptional)
					.getText();
			logger.info("FinancialAwardsStartOptional : " + FinancialAwardsStartOptional);
			logger.info("FinancialAwardsStartOptional 1: " + CreateOfficeFields.StartOptional);
			Assert.assertEquals(CreateOfficeFields.StartOptional, FinancialAwardsStartOptional);
			String FinancialAwardsStart1 = driver.findElement(CreateOfficeLocators.FinancialAwardsStart1).getText();
			logger.info("FinancialAwardsStart : " + FinancialAwardsStart1);
			logger.info("FinancialAwardsStart 1: " + CreateOfficeFields.FinancialAssistanceFundingStart);
			Assert.assertEquals(CreateOfficeFields.FinancialAssistanceFundingStart, FinancialAwardsStart1);
			logger.info("enters grants ", scenario);
		}

	}

	@And("^The user edit select office type contract funding ([^\"]*)$")
	public void The_user_edit_select_office_type_contract_funding(String contractfunding) {
		if (contractfunding != null && contractfunding.trim().length() != 0) {
			logger.info("Not select contract funding :" + contractfunding);

			logger.info("enters other ", scenario);
		} else {
			logger.info("contractfunding: " + contractfunding);
			String ContractFundingText = driver.findElement(CreateOfficeLocators.ContractFundingText).getText();
			logger.info("ContractFundingText : " + ContractFundingText);
			logger.info("ContractFundingText 1: " + CreateOfficeFields.ContractFunding);
			Assert.assertEquals(CreateOfficeFields.ContractFunding, ContractFundingText);
			boolean selection = driver.findElement(CreateOfficeLocators.ContractFunding).isSelected();
			if (selection == true) {
				logger.info("ContractFunding:" + contractfunding);
				WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFunding);
				Actions builder3 = new Actions(driver);
				Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
				seriesOfActions3.perform();
			}

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFunding);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
			seriesOfActions3.sendKeys(Keys.TAB);
			seriesOfActions3.perform();
			String ContractFundingStartOptional1 = driver.findElement(CreateOfficeLocators.ContractFundingStartOptional)
					.getText();
			logger.info("ContractFundingStartOptional : " + ContractFundingStartOptional1);
			logger.info("ContractFundingStartOptional 1: " + CreateOfficeFields.StartOptional);
			Assert.assertEquals(CreateOfficeFields.StartOptional, ContractFundingStartOptional1);
			String ContractFundingStart1 = driver.findElement(CreateOfficeLocators.ContractFundingStart1).getText();
			logger.info("ContractFundingStart1 : " + ContractFundingStart1);
			logger.info("ContractFundingStart 1: " + CreateOfficeFields.FinancialAssistanceFundingStart);
			Assert.assertEquals(CreateOfficeFields.FinancialAssistanceFundingStart, ContractFundingStart1);

			logger.info("enters other ", scenario);
		}

	}

	@And("^The user edit select office type Financial funding ([^\"]*)")
	public void The_user_edit_select_office_type_Financial_funding(String FinancialFunding) {
		String OfficeTypes = driver.findElement(CreateOfficeLocators.OfficeTypes).getText();
		logger.info("OfficeTypes : " + OfficeTypes);
		logger.info("OfficeTypes 1: " + CreateOfficeFields.OfficeTypes);
		Assert.assertEquals(CreateOfficeFields.OfficeTypes, OfficeTypes);

		String OfficeTypesText = driver.findElement(CreateOfficeLocators.OfficeTypesText).getText();
		logger.info("OfficeTypesText : " + OfficeTypesText);
		logger.info("OfficeTypesText 1: " + CreateOfficeFields.OfficeTypesText);
		Assert.assertEquals(CreateOfficeFields.OfficeTypesText, OfficeTypesText);

		if (FinancialFunding != null && FinancialFunding.trim().length() != 0) {
			logger.info("Not selected Financial funding:" + FinancialFunding);

		} else {
			logger.info("FinancialFunding:" + FinancialFunding);

			boolean selection = driver.findElement(CreateOfficeLocators.FinancialFunding).isSelected();
			if (selection == true) {
				logger.info("FinancialFunding:" + FinancialFunding);
				WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFunding);
				Actions builder3 = new Actions(driver);
				Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
				seriesOfActions3.perform();
			}

			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFunding);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
			seriesOfActions3.sendKeys(Keys.TAB);
			seriesOfActions3.perform();
			String FinancialFundingStartOptional = driver
					.findElement(CreateOfficeLocators.FinancialFundingStartOptional).getText();
			logger.info("FinancialFundingStartOptional : " + FinancialFundingStartOptional);
			logger.info("FinancialFundingStartOptional 1: " + CreateOfficeFields.StartOptional);
			Assert.assertEquals(CreateOfficeFields.StartOptional, FinancialFundingStartOptional);

			String FinancialFundingStart1 = driver.findElement(CreateOfficeLocators.FinancialFundingStart1).getText();
			logger.info("FinancialFundingStartOptional : " + FinancialFundingStart1);
			logger.info("FinancialFundingStartOptional 1: " + CreateOfficeFields.FinancialAssistanceFundingStart);
			Assert.assertEquals(CreateOfficeFields.FinancialAssistanceFundingStart, FinancialFundingStart1);
		}
	}

	@And("^Click on close button on edit office Request page$")
	public void Click_on_close_button_on_edit_office_Request_page() throws Throwable {
		WebElement elt14 = driver.findElement(CreateOfficeLocators.OfficeSubmit);
		Actions builder14 = new Actions(driver);
		Actions seriesOfActions14 = builder14.moveToElement(elt14).click();
		seriesOfActions14.perform();
		logger.info("Click on Buttom ", scenario);
		Thread.sleep(8000);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EditRequestOfficeLocators.EditRequest));

		String officeEditRequest = driver.findElement(EditRequestOfficeLocators.EditRequest).getText();
		logger.info("officeEditRequest" + officeEditRequest);
		logger.info(officeEditRequest);
		Assert.assertEquals(CreateOfficeFields.EditRequest, officeEditRequest);

		String officeEditRequestbody1 = driver.findElement(EditRequestOfficeLocators.EditRequestbody).getText();
		logger.info("officeEditRequestbody1 : " + officeEditRequestbody1);
		StringBuilder sb = new StringBuilder(officeEditRequestbody1);
		String originalString = sb.toString();
		String requestString = String.format(CreateOfficeFields.EditRequestbody1, CreateOfficeStepDef.OfficeName1);
		logger.info("requestString : " + requestString);
		System.out.println(StringUtils.equalsIgnoreCase(originalString, requestString));

		/*String officeEditRequestbody2 = driver.findElement(EditRequestOfficeLocators.EditRequestbody2).getText();
		logger.info("officeEditRequestbody2: " + officeEditRequestbody2);
		logger.info("CreateOfficeFields.EditRequestbody2: " + CreateOfficeFields.EditRequestbody2);
		Assert.assertEquals(CreateOfficeFields.EditRequestbody2, officeEditRequestbody2);*/

		WebElement elt114 = driver.findElement(CreateOfficeLocators.close);
		Actions builder114 = new Actions(driver);
		Actions seriesOfActions114 = builder114.moveToElement(elt114).click();
		seriesOfActions114.perform();
	}

	@Then("^Validating profile values$")
	public void Validating_profile_values() throws Throwable {

		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EditRequestOfficeLocators.OfficeDetails));

		String EditAAC = driver.findElement(EditRequestOfficeLocators.EditAAC).getText();
		logger.info("EditAAC:" + EditAAC);
		logger.info("EditAAC1:" + EditRequestOfficeField.AAC);
		Assert.assertEquals(EditRequestOfficeField.AAC, EditAAC);

		EditAAC = driver.findElement(EditRequestOfficeLocators.EditAACText).getText();
		logger.info("EditAACText:" + EditAAC);
		Assert.assertEquals(EditAAC, EditAAC);

		String EditDepartment = driver.findElement(EditRequestOfficeLocators.EditDepartment).getText();
		logger.info("EditDepartment:" + EditDepartment);
		logger.info("EditDepartment1:" + EditRequestOfficeField.DepartmentText);
		Assert.assertEquals(EditRequestOfficeField.DepartmentText, EditDepartment);

		String EditDepartmentText = driver.findElement(EditRequestOfficeLocators.EditDepartmentText).getText();
		logger.info("EditDepartmentText:" + EditDepartmentText);
		logger.info("EditDepartment1:" + deptName);
		Assert.assertTrue(deptName.contains(EditDepartmentText));

		String EditSubTier = driver.findElement(EditRequestOfficeLocators.EditSubTier).getText();
		logger.info("EditSubTier:" + EditSubTier);
		logger.info("EditSubTier:" + EditRequestOfficeField.SubTierText);
		Assert.assertEquals(EditRequestOfficeField.SubTierText, EditSubTier);

		EditSubTierText = driver.findElement(EditRequestOfficeLocators.EditSubTierText).getText().trim().toString();
		logger.info("EditSubTierText:" + EditSubTierText);
		logger.info("EditSubTier agencyName :" + agencyName);
		Assert.assertTrue(agencyName.contains(EditSubTierText));

		String EditStartDate = driver.findElement(EditRequestOfficeLocators.EditStartDate).getText();
		logger.info("EditStartDate:" + EditSubTierText);
		logger.info("EditStartDate1:" + EditRequestOfficeField.EditStartDate);
		Assert.assertEquals(EditRequestOfficeField.EditStartDate, EditStartDate);

		EditStartDate = driver.findElement(EditRequestOfficeLocators.EditStartDateText).getText();
		logger.info("EditStartDateText:" + EditStartDate);

		String EditEndDate = driver.findElement(EditRequestOfficeLocators.EditEndDate).getText();
		logger.info("EditEndDate:" + EditEndDate);
		logger.info("EditEndDate1:" + EditRequestOfficeField.EditEndDate);
		try {
			Assert.assertEquals(EditRequestOfficeField.EditEndDate, EditEndDate);
		} catch (Exception e) {
			logger.info("No End date Exception");
		}

		Thread.sleep(2000);
		confirmationEditEndDate = driver.findElement(EditRequestOfficeLocators.EditEndDateText).getText();
		logger.info("EditEndDateText:" + EditEndDate);
		logger.info("OfficeEndMonth :" + CreateOfficeStepDef.OfficeStartMonth);
		logger.info("OfficeEndDay: " + CreateOfficeStepDef.OfficeEndDay);
		logger.info("OfficeEndYear: " + CreateOfficeStepDef.OfficeEndYear);
		try {
			Assert.assertTrue(confirmationEditEndDate.contains(CreateOfficeStepDef.OfficeEndMonth));
			Assert.assertTrue(confirmationEditEndDate.contains(CreateOfficeStepDef.OfficeEndDay));
			Assert.assertTrue(confirmationEditEndDate.contains(CreateOfficeStepDef.OfficeEndYear));
		} catch (Exception e) {
			logger.info("No end date Exception");
		}
		Thread.sleep(1000);

		String EditShortname = driver.findElement(EditRequestOfficeLocators.EditShortname).getText();
		logger.info("EditShortname:" + EditShortname);
		logger.info("EditShortname1:" + EditRequestOfficeField.EditShortname);
		Assert.assertEquals(EditRequestOfficeField.EditShortname, EditShortname);

		Thread.sleep(3000);
		EditShortname1 = driver.findElement(EditRequestOfficeLocators.EditShortnameText).getText();
		logger.info("EditShortnameText:" + EditShortname);

		if (CreateOfficeStepDef.OfficeShortName1 == null) {
			logger.info("ShortnameText1 is null");
		} else {
			Assert.assertEquals(CreateOfficeStepDef.OfficeShortName1, EditShortname1);
		}

		String EditRegion = driver.findElement(EditRequestOfficeLocators.EditRegion).getText();
		logger.info("EditRegion:" + EditRegion);
		logger.info("EditRegion1:" + EditRequestOfficeField.EditRegion);
		Assert.assertEquals(EditRequestOfficeField.EditRegion, EditRegion);

		EditRegion = driver.findElement(EditRequestOfficeLocators.EditRegionText).getText();
		logger.info("EditRegionText:" + EditRegion);

		if (CreateOfficeStepDef.OfficeRegion3 == null) {
			logger.info("OfficeRegionText is null");
		} else {
			Assert.assertEquals(CreateOfficeStepDef.OfficeRegion3, EditRegion);
		}

		String OfficeTypes = driver.findElement(EditRequestOfficeLocators.OfficeTypes).getText();
		logger.info("OfficeTypes:" + OfficeTypes);
		logger.info("OfficeTypes1:" + EditRequestOfficeField.OfficeTypes);
		Assert.assertEquals(EditRequestOfficeField.OfficeTypes, OfficeTypes);

		String Types = driver.findElement(EditRequestOfficeLocators.EditType).getText();
		logger.info("Types:" + Types);
		logger.info("Types1:" + EditRequestOfficeField.Types);
		Assert.assertEquals(EditRequestOfficeField.Types, Types);

		String StartDateText = driver.findElement(EditRequestOfficeLocators.StartDateText).getText();
		logger.info("StartDateText:" + StartDateText);
		logger.info("StartDateText1:" + EditRequestOfficeField.StartDate1);
		Assert.assertEquals(EditRequestOfficeField.StartDate1, StartDateText);

		String EndDateText = driver.findElement(EditRequestOfficeLocators.EndDateText).getText();
		logger.info("EndDateText:" + EndDateText);
		logger.info("EndDateText1:" + EditRequestOfficeField.EndDate1);
		Assert.assertEquals(EditRequestOfficeField.EndDate1, EndDateText);
		Thread.sleep(3000);

		String EditStatus1 = driver.findElement(EditRequestOfficeLocators.EditStatus).getText();
		logger.info("EditStatus:" + EditStatus1);
		logger.info("EditStatus1:" + EditRequestOfficeField.Status);
		Assert.assertEquals(EditRequestOfficeField.Status, EditStatus1);

		List<WebElement> row = driver
				.findElements(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div"));
		logger.info("row:" + row.size());
		int rowSize = row.size();
		List<WebElement> col = driver.findElements(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[" + rowSize + "]/div"));
		logger.info("col:" + col.size());
		int col1 = col.size();

		for (int i = 2; i <= rowSize; i++) {
			OfficeType officeType = new OfficeType();
			for (int j = 1; j <= col1; j++) {
				String value = driver.findElement(By.xpath(
						"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[" + i + "]/div[" + j + "]"))
						.getText();

				// logger.info("value:" + i + j + value);

				if (j == 2) { // Start Date

					officeType.setOfficeTypeStartDate(value);
				} else if (j == 3) { // End Date

					officeType.setOfficeTypeEndDate(value);
				} else if (j == 4) { // Status

					officeType.setOfficeTypeStatus(value);

				} else if (j == 1) { // officeType
					officeTypeNameFromProfilePage = value;
					officeType.setOfficeTypeName(officeTypeNameFromProfilePage);
				}

				officeTypeMap.put(officeTypeNameFromProfilePage, officeType);
			}
		}

		Set<String> keys = officeTypeMap.keySet();
		System.out.println(keys);
		// System.out.println("*********");

		Set<String> keySet = officeTypeMap.keySet();
		Iterator<String> keySetItr = keySet.iterator();
		while (keySetItr.hasNext()) {
			String currentKey = keySetItr.next();
			OfficeType s2 = officeTypeMap.get(currentKey);
			logger.info(currentKey + ":" + s2);
			// s1.getOfficeTypeStartDate();
		}

		// OfficeType s1 = officeTypeMap.get("Financial Assistance Awards");
		// logger.info("StartDate FAA: " + s1.getOfficeTypeStartDate());
		// OfficeType s2 = officeTypeMap.get("Contract Awards");
		Thread.sleep(3000);
		OfficeType ca = officeTypeMap.get("Contract Awards");
		if (ca.getOfficeTypeName().equals(ContractAwards)) {
			logger.info("ca str1: " + str1.length());
			try {
				if (ca.getOfficeTypeStartDate().length() != (str1.length())
						&& (CreateOfficeStepDef.ContractAwards1.length() != (str1.length()))) {
					Assert.assertEquals(CreateOfficeStepDef.ContractAwards1,
							officeTypeMap.get("Contract Awards").getOfficeTypeStartDate());
				} else {

					logger.info("Contract Awards has no start date");
				}
			} catch (Exception e) {
				logger.info("CA Start Date Exception");
			}

			try {
				if (ca.getOfficeTypeEndDate().length() != (str1.length())
						&& (CreateOfficeStepDef.EndContractAwards1.length() != (str1.length()))) {
					Assert.assertEquals(CreateOfficeStepDef.EndContractAwards1,
							officeTypeMap.get("Contract Awards").getOfficeTypeEndDate());
				} else {

					logger.info("Contract Awards had  no End date");
				}
			} catch (Exception e) {
				logger.info("CA end Date Exception");
			}

			caStatus = officeTypeMap.get("Contract Awards").getOfficeTypeStatus();
			logger.info("caStatus" + caStatus);
			// Assert.assertEquals(CreateOfficeStepDef.ConfirmationContractAwards1Status,officeTypeMap.get("Contract
			// Awards").getOfficeTypeStatus());

		} else {
			logger.info("Contract Awards is not selected");
		}

		OfficeType faa = officeTypeMap.get("Financial Assistance Awards");
		if (faa.getOfficeTypeName().equals(FinancialAssistanceAwards)) {
			try {
				if (faa.getOfficeTypeStartDate().length() != (str1.length())
						&& (CreateOfficeStepDef.ConfirmationFinancialAwardsStartDate.length() != (str1.length()))) {
					Assert.assertEquals(CreateOfficeStepDef.ConfirmationFinancialAwardsStartDate,
							officeTypeMap.get("Financial Assistance Awards").getOfficeTypeStartDate());
				} else {
					logger.info("Financial Assistance Awards has start date");
				}
			} catch (Exception e) {
				logger.info("FA Start Date Exception");
			}

			try {
				if (faa.getOfficeTypeEndDate().length() != (str1.length())
						&& (CreateOfficeStepDef.ConfirmationFinancialAwardsEndDate.length() != (str1.length()))) {
					Assert.assertEquals(CreateOfficeStepDef.ConfirmationFinancialAwardsEndDate,
							officeTypeMap.get("Financial Assistance Awards").getOfficeTypeEndDate());

				} else {
					logger.info("Financial Assistance Awards has End date");
				}
			} catch (Exception e) {
				logger.info("FA end date Exception");
			}
			faaStatus = officeTypeMap.get("Financial Assistance Awards").getOfficeTypeStatus();
			logger.info("faaStatus" + faaStatus);
			// Assert.assertEquals(CreateOfficeStepDef.ConfirmationFinancialAwardsStatus,
			// officeTypeMap.get("Financial Assistance Awards").getOfficeTypeStatus());

		} else {
			logger.info("Financial Assistance Awards  is not selected");
		}

		OfficeType cf = officeTypeMap.get("Contract Funding");
		if (cf.getOfficeTypeName().equals(ContractFunding)) {
			try {
				if (cf.getOfficeTypeStartDate().length() != (str1.length())
						&& (CreateOfficeStepDef.ConfirmationContractFundingStartDate.length() != (str1.length()))) {
					Assert.assertEquals(CreateOfficeStepDef.ConfirmationContractFundingStartDate,
							officeTypeMap.get("Contract Funding").getOfficeTypeStartDate());

				} else {
					logger.info("Contract Funding has start date");
				}
			} catch (Exception e) {
				logger.info("CF Start dateException");
			}

			try {
				if (cf.getOfficeTypeEndDate().length() != (str1.length())
						&& (CreateOfficeStepDef.ConfirmationContractFundingEndDate.length() != (str1.length()))) {
					Thread.sleep(2000);
					Assert.assertEquals(CreateOfficeStepDef.ConfirmationContractFundingEndDate,
							officeTypeMap.get("Contract Funding").getOfficeTypeEndDate());

				} else {
					logger.info("Contract Funding hasn no End date");
				}
			} catch (Exception e) {
				logger.info(" CF end dateException");
			}
			cfStatus = officeTypeMap.get("Contract Funding").getOfficeTypeStatus();
			logger.info("CFStatus" + cfStatus);
			// Assert.assertEquals(CreateOfficeStepDef.ConfirmationContractFundingStatus,officeTypeMap.get("Contract
			// Funding").getOfficeTypeStatus());
		} else {
			logger.info("Contract Funding  is not selected");
		}

		OfficeType faf = officeTypeMap.get("Financial Assistance Funding");
		if (faf.getOfficeTypeName().equals(FinancialAssistanceFunding)) {
			try {
				if (faa.getOfficeTypeStartDate().length() != (str1.length())
						&& (CreateOfficeStepDef.ConfirmationFinancialFundingStartDate.length() != (str1.length()))) {
					Assert.assertEquals(CreateOfficeStepDef.ConfirmationFinancialFundingStartDate,
							officeTypeMap.get("Financial Assistance Funding").getOfficeTypeStartDate());

				} else {
					logger.info("Financial Assistance Awards has start date");
				}
			} catch (Exception e) {
				logger.info("FF Start dateException");
			}

			try {
				if (faf.getOfficeTypeEndDate().length() != (str1.length())
						&& (CreateOfficeStepDef.ConfirmationContractFundingEndDate.length() != (str1.length()))) {
					Assert.assertEquals(CreateOfficeStepDef.ConfirmationContractFundingEndDate,
							officeTypeMap.get("Financial Assistance Funding").getOfficeTypeEndDate());
				} else {
					logger.info("Financial Assistance Funding has start date");
				}
			} catch (Exception e) {
				logger.info("FF End dateException");
			}
			String fafStatus = officeTypeMap.get("Financial Assistance Funding").getOfficeTypeStatus();
			logger.info("faaStatus" + fafStatus);
			// Assert.assertEquals(CreateOfficeStepDef.ConfirmationFinancialFundingStatus,officeTypeMap.get("Financial
			// Assistance Funding").getOfficeTypeStatus());
		} else {
			logger.info("Financial Assistance Funding  is not selected");
		}

		Thread.sleep(3000);
		String OfficeAddress = driver.findElement(EditRequestOfficeLocators.OfficeAddress).getText();
		logger.info("OfficeAddress:" + OfficeAddress);
		logger.info("OfficeAddress1:" + EditRequestOfficeField.OfficeAddresss);
		Assert.assertEquals(OfficeAddress, EditRequestOfficeField.OfficeAddresss);
		Thread.sleep(3000);
		
		if(CreateOfficeStepDef.StreetAddress1.length() != (str1.length())) {
		String EditmailingAddress1 = driver.findElement(EditRequestOfficeLocators.EditmailingAddress1).getText();
		logger.info("EditmailingAddress1:" + EditmailingAddress1);
		logger.info("CreateOfficeStepDef.StreetAddress1: " + CreateOfficeStepDef.StreetAddress1);
		Assert.assertEquals(EditmailingAddress1, CreateOfficeStepDef.StreetAddress1);
		Thread.sleep(5000);
		Thread.sleep(3000);
		String EditmailingAddress2 = driver.findElement(EditRequestOfficeLocators.EditmailingAddress2).getText();
		logger.info("EditmailingAddress2:" + EditmailingAddress2);
		Thread.sleep(3000);
		String EditmailingAddress3 = driver.findElement(EditRequestOfficeLocators.EditmailingAddress3).getText();
		logger.info("EditmailingAddress3:" + EditmailingAddress3);
		logger.info(" ZipCode:" + CreateOfficeStepDef.ZipCode);
		logger.info("city: " + CreateOfficeStepDef.city);
		logger.info("state3: " + CreateOfficeStepDef.state3);
		Assert.assertTrue(EditmailingAddress4.contains(CreateOfficeStepDef.ZipCode));
		Assert.assertTrue(EditmailingAddress3.contains(CreateOfficeStepDef.city));
		Assert.assertTrue(EditmailingAddress3.contains(CreateOfficeStepDef.state3));
		}else {
			logger.info("SKiP Address");
		}

	}

	@Then("^contract Awards Active status and end date will be office type end date$")
	public static void contract_Awards_Active_status_and_end_date_will_be_office_end_date() throws Throwable {
		OfficeType ca = officeTypeMap.get("Contract Awards");

		Assert.assertEquals(caStatus, "ACTIVE");
	}

	@And("^The user is Financial Awards end date$")
	public static void The_user_is_Financial_Awards_end_date() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonthText).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		driver.findElement(CreateOfficeLocators.FinancialAwardsEndDayText).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		driver.findElement(CreateOfficeLocators.FinancialAwardsEndYearText).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
	}

	@Then("^Financial Awards End Year is inactive status and end date will be office type end date$")
	public static void Contract_Funding_is_inactive_status_and_end_date_will_be_office_Type_end_date()
			throws Throwable {
		OfficeType faa = officeTypeMap.get("Financial Assistance Awards");
		if (faa.getOfficeTypeName().equals(FinancialAssistanceAwards)) {
			Assert.assertEquals(faaStatus, "INACTIVE");

		} else {
			logger.info("Financial Assistance Awards  is not selected");
		}
	}


	@And("^The User UnSelect Contract Awards$")
	public void The_User_UnSelect_Contract_Awards() throws Throwable {
		boolean selection = driver.findElement(CreateOfficeLocators.ContractAwardsCheckbox).isSelected();
		if (selection == true) {
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsCheckbox);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
			Thread.sleep(2000);
			seriesOfActions3.sendKeys(Keys.TAB);
			seriesOfActions3.perform();
		}
	}

	@And("^The User UnSelect Financial Assistance Awards$")
	public void The_User_UnSelect_Financial_Assistance_Awards() {
		boolean selection = driver.findElement(CreateOfficeLocators.FinancialAwardsCheckBox).isSelected();
		if (selection == true) {
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsCheckBox);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
			seriesOfActions3.perform();
		}
	}

	@And("^The User UnSelect Contract Funding$")
	public void The_User_UnSelect_Contract_Funding() {
		boolean selection = driver.findElement(CreateOfficeLocators.ContractFunding).isSelected();
		if (selection == true) {
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFunding);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
			seriesOfActions3.perform();
		}
	}

	@And("^The User UnSelect Financial Assistance Funding$")
	public void The_User_UnSelect_Financial_Assistance_Funding() {
		boolean selection = driver.findElement(CreateOfficeLocators.FinancialFunding).isSelected();
		if (selection == true) {
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFunding);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
			seriesOfActions3.perform();
		}

	}

	@Then("^Deselect all office type in request office page$")
	public  void Deselect_all_office_type_in_request_office_page() throws Throwable {
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div")));

		List<WebElement> row = driver
				.findElements(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div"));
		logger.info("row:" + row.size());
		int rowSize = row.size();
		List<WebElement> col = driver.findElements(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[" + rowSize + "]/div"));
		logger.info("col:" + col.size());
		int col1 = col.size();

		for (int i = 2; i <= rowSize; i++) {
			OfficeType officeType = new OfficeType();
			for (int j = 1; j <= col1; j++) {
				String value = driver.findElement(By.xpath(
						"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[" + i + "]/div[" + j + "]"))
						.getText();

				// logger.info("value:" + i + j + value);

				if (j == 2) { // Start Date

					officeType.setOfficeTypeStartDate(value);
				} else if (j == 3) { // End Date

					officeType.setOfficeTypeEndDate(value);
				} else if (j == 4) { // Status

					officeType.setOfficeTypeStatus(value);

				} else if (j == 1) { // officeType
					officeTypeNameFromProfilePage = value;
					officeType.setOfficeTypeName(officeTypeNameFromProfilePage);
				}

				officeTypeMap1.put(officeTypeNameFromProfilePage, officeType);
			}
		}
		Set<String> keys = officeTypeMap1.keySet();
		System.out.println(keys);
		// System.out.println("*********");

		Set<String> keySet = officeTypeMap1.keySet();
		Iterator<String> keySetItr = keySet.iterator();
		while (keySetItr.hasNext()) {
			String currentKey = keySetItr.next();
			OfficeType s2 = officeTypeMap1.get(currentKey);
			logger.info(currentKey + ":" + s2);
			// s1.getOfficeTypeStartDate();
		}

		OfficeType faf = officeTypeMap1.get("Financial Assistance Funding");
		if (faf.getOfficeTypeName().equals(FinancialAssistanceFunding)) {
			Assert.assertEquals(officeTypeMap1.get("Financial Assistance Funding").getOfficeTypeStatus(), "EXPIRED");
		} else {
			logger.info("Financial Assistance Funding  is not selected");
		}
		OfficeType cf = officeTypeMap1.get("Contract Funding");
		if (cf.getOfficeTypeName().equals(ContractFunding)) {
			
			Assert.assertEquals(officeTypeMap1.get("Contract Funding").getOfficeTypeStatus(), "EXPIRED" );
		} else {
			logger.info("Contract Funding  is not selected");
		}
		OfficeType faa = officeTypeMap1.get("Financial Assistance Awards");
		if (faa.getOfficeTypeName().equals(FinancialAssistanceAwards)) {
			Assert.assertEquals( officeTypeMap1.get("Financial Assistance Funding").getOfficeTypeStatus(), "EXPIRED");

		} else {
			logger.info("Financial Assistance Awards  is not selected");
		}
		OfficeType ca = officeTypeMap1.get("Contract Awards");
		if (ca.getOfficeTypeName().equals(ContractAwards)) {
			Thread.sleep(5000);
			Assert.assertEquals(officeTypeMap1.get("Contract Awards").getOfficeTypeStatus(), "EXPIRED");
		} else {
			logger.info("Contract Awards  is not selected");
		}
		

	}

}
