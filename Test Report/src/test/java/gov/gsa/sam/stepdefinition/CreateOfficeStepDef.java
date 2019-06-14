package gov.gsa.sam.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gov.gsa.sam.base.DateClass;
import gov.gsa.sam.fields.CreateOfficeFields;
import gov.gsa.sam.fields.CreateOfficeLocators;
import gov.gsa.sam.fields.DepartmentField;
import gov.gsa.sam.locators.CreateOffice;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.utils.Constants;
import net.thucydides.core.annotations.Managed;

public class CreateOfficeStepDef {
	//public  Boolean  str = true;
	public static String S = "S";
	public static String x = "x";
	public static String OfficeName1;
	public static String DeptIndAgency1;
	public static String CGAC1;
	public static String SubTier1;
	public static String AgencyCode1;
	public static String StartMonth1;
	public static String StartDay1;
	public static String StartYear1;
	public static String EndMonth1;
	public static String EndDay1;
	public static String EndYear1;
	public static String OfficeShortName1;
	public static String OfficeRegion3;
	public static String OfficeActivity1;
	public static String RequestorName1;
	public static String RequestorEmail1;
	public static String RequestorPhone1;
	public static String POCEmail1;
	public static String POCNumber1;
	public static String POCName1;
	public static String StreetAddress1;
	public static String StreetAddress2;
	public static String Countr1y;
	public static String Zip1;
	public static String City1;
	public static String StateProvince1;
	public static String StreetAddress3;
	public static String StreetAddress4;
	public static String Country2;
	public static String Zip2;
	public static String City2;
	public static String StateProvince2;
	public static String ShippingStreet;
	public static String ShippingCountry;
	public static String ShippingZip;
	public static String ShippingCity;
	public static String ShippingState;
	public static String BillingStreet;
	public static String BillingCountry;
	public static String BillingZip;
	public static String BillingCity;
	public static String BillingState;

	@Managed
	public static WebDriver driver;
	Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(CreateOfficeStepDef.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Given("^Create office submit button$")
	public void Create_office_submit_button() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(CreateOffice.createOfficeButton).click();
	}

	@And("^The user enters office details Name ([^\"]*)$")
	public void The_user_enters_office_details_Name(String officeDetails) throws Throwable {
		logger.info("Enter into login method:");
		Thread.sleep(2000);
		String fh = driver.findElement(CreateOfficeLocators.FederalHierarchy).getText();
		logger.info("fh: " + fh);
		Assert.assertEquals(CreateOfficeFields.CreateDept2, fh);

		String fhText = driver.findElement(CreateOfficeLocators.FederalHierarchyText).getText();
		logger.info("fhText: " + fhText);
		Assert.assertEquals(CreateOfficeFields.RequestOffice1, fhText);

		String officeDetail = driver.findElement(CreateOfficeLocators.OfficeDetails).getText();
		logger.info("officeDetails: " + officeDetail);
		Assert.assertEquals(CreateOfficeFields.OfficeDetails, officeDetail);

		String officeNameRqt = driver.findElement(CreateOfficeLocators.OfficeNameRQ).getText();
		logger.info("officeNameRqt: " + officeNameRqt);
		Assert.assertEquals(CreateOfficeFields.Required, officeNameRqt);
		// Assert.assertTrue(str.contains(DepartmentField.Required));

		String officeNameText = driver.findElement(CreateOfficeLocators.OfficeName).getText();
		logger.info("officeNameText: " + officeNameText);
		logger.info("OfficeNameText2: " + CreateOfficeFields.OfficeNameText);
		Assert.assertEquals(CreateOfficeFields.OfficeNameText, officeNameText);
		Thread.sleep(2000);
		if (officeDetails != null && officeDetails.trim().length() != 0) {
			OfficeName1 = officeDetails;
			logger.info("OfficeName1" + OfficeName1);
			driver.findElement(CreateOfficeLocators.OfficeNameTextBox).sendKeys(OfficeName1);
		} else {
			int OfficeName = (int) Math.ceil(Math.random() * 1000);
			OfficeName1 = (officeDetails + OfficeName);
			logger.info("OfficeName1" + OfficeName1);
			driver.findElement(CreateOfficeLocators.OfficeNameTextBox).sendKeys(OfficeName1);
			logger.info("enters create office name", scenario);
		}
		/*
		 * int OfficeName = (int) Math.ceil(Math.random() * 1000); OfficeName1 =
		 * (officeDetails + OfficeName);
		 * driver.findElement(CreateOfficeLocators.OfficeNameTextBox).sendKeys(
		 * OfficeName1); logger.info("enters create office name", scenario);
		 */

		String ParentDepartmentandSubTier = driver.findElement(CreateOfficeLocators.ParentDepartmentandSubTier)
				.getText();
		logger.info("ParentDepartment: " + ParentDepartmentandSubTier);
		Assert.assertEquals(CreateOfficeFields.ParentDepartment, ParentDepartmentandSubTier);

		String DeptIndAgency = driver.findElement(CreateOfficeLocators.DeptIndAgency).getText();
		logger.info("DeptIndAgency: " + DeptIndAgency);
		Assert.assertEquals(CreateOfficeFields.DeptAgency, DeptIndAgency);

		DeptIndAgency1 = driver.findElement(CreateOfficeLocators.DeptIndAgencyText).getText();
		logger.info("DeptIndAgency1: " + DeptIndAgency1);
		logger.info("CreateOfficeFields.DeptAgency: " + CreateOfficeFields.DeptAgency);
		logger.info("agencyName :"+ CreateDepartmentStepDef.agencyName);
		//Assert.assertEquals(CreateOfficeFields.DeptAgency, DeptIndAgency);
		if(CreateDepartmentStepDef.agencyName != null) {
			Assert.assertEquals(CreateDepartmentStepDef.agencyName, DeptIndAgency1);
		}else {
			logger.info("No action performed on DeptAgency");
		}
		//Assert.assertEquals(CreateDepartmentStepDef.agencyName, DeptIndAgency1);

		String CGAC = driver.findElement(CreateOfficeLocators.CGAC).getText();
		logger.info("CGAC: " + CGAC);
		Assert.assertEquals(CreateOfficeFields.CGAC, CGAC);

		CGAC1 = driver.findElement(CreateOfficeLocators.CGACText).getText();
		logger.info("CGAC1: " + CGAC1);
		logger.info("CreateDepartmentStepDef.EditDepartmentCGAC: " + CreateDepartmentStepDef.EditDepartmentCGAC);
		// Assert.assertEquals(CreateOfficeFields.CGAC, CGAC);
		// Assert.assertEquals(CreateDepartmentStepDef.EditDepartmentCGAC, CGAC1);
		 if(CreateDepartmentStepDef.EditDepartmentCGAC != null) {
			 Assert.assertEquals(CreateDepartmentStepDef.EditDepartmentCGAC, CGAC1);
			}else {
				logger.info("No action performed on CGAC");
			}

		String SubTier = driver.findElement(CreateOfficeLocators.SubTier).getText();
		logger.info("SubTier: " + SubTier);
		Assert.assertEquals(CreateOfficeFields.SubTier, SubTier);

		SubTier1 = driver.findElement(CreateOfficeLocators.SubTierText).getText();
		logger.info("SubTier1: " + SubTier1);
		logger.info("CreateDepartmentStepDef.SubTierName1: " + CreateDepartmentStepDef.SubTierName1);
		// Assert.assertEquals(CreateOfficeFields.SubTier, SubTier);
		//Assert.assertEquals(CreateDepartmentStepDef.SubTierName1, SubTier1);
		if(CreateDepartmentStepDef.SubTierName1 != null) {
			Assert.assertEquals(CreateDepartmentStepDef.SubTierName1, SubTier1);
			}else {
				logger.info("No action performed on SubTier Name1");
			}

		String AgencyCode = driver.findElement(CreateOfficeLocators.AgencyCode).getText();
		logger.info("AgencyCode: " + AgencyCode);
		Assert.assertEquals(CreateOfficeFields.AgencyCode, AgencyCode);

		AgencyCode1 = driver.findElement(CreateOfficeLocators.AgencyCodeText).getText();
		logger.info("AgencyCode: " + AgencyCode1);
		logger.info("CreateDepartmentStepDef.EditSubTierAgencyCode: " +CreateDepartmentStepDef.EditSubTierAgencyCode);
		// Assert.assertEquals(CreateOfficeFields.AgencyCode, AgencyCode);
		//Assert.assertEquals(CreateDepartmentStepDef.EditSubTierAgencyCode, AgencyCode1);
		 if(CreateDepartmentStepDef.EditSubTierAgencyCode!= null) {
			 Assert.assertEquals(CreateDepartmentStepDef.EditSubTierAgencyCode, AgencyCode1);
			}else {
				logger.info("No action performed on  Agency Code");
			}
	}

	@And("^The user enters create office start month ([^\"]*)$")
	public void The_user_enters_create_office_start_month(String startMonth) {

		String Startdate = driver.findElement(CreateOfficeLocators.Startdate).getText();
		logger.info("Start date: " + Startdate);
		logger.info("Start date1: " + CreateOfficeFields.Startdate);
		String str = Startdate.replace("\n", " ");
		logger.info("Str========" + str);
		Assert.assertTrue(str.contains(CreateOfficeFields.Startdate));
		Assert.assertTrue(str.contains(CreateOfficeFields.Required));
		// Assert.assertEquals(CreateOfficeFields.Startdate, Startdate);

		String StartdateText = driver.findElement(CreateOfficeLocators.StartdateText).getText();
		logger.info("Start date Text: " + StartdateText);
		logger.info("Start date Text 1: " + CreateOfficeFields.StartdateText);
		Assert.assertEquals(CreateOfficeFields.StartdateText, StartdateText);

		String StartdateMonth = driver.findElement(CreateOfficeLocators.StartdateMonth).getText();
		logger.info("Start date Month TextBox: " + StartdateMonth);
		logger.info("Start date Month TextBox 1: " + CreateOfficeFields.Month);
		Assert.assertEquals(CreateOfficeFields.Month, StartdateMonth);
		if (startMonth != null && startMonth != x && startMonth.trim().length() != 0) {
			logger.info("startMonth" + startMonth);
			driver.findElement(CreateOfficeLocators.StartdateMonthTextBox).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"month"));
			logger.info("enters start month ", scenario);
		} else if (startMonth == x) {
			logger.info("No select on startMonth ");
		} else {
			logger.info("startMonth" + DateClass.getCurrentMonth());
			driver.findElement(CreateOfficeLocators.StartdateMonthTextBox).sendKeys(DateClass.getCurrentMonth());
			logger.info("enters start month ", scenario);
		}

	}

	@And("^The user enters create office start day ([^\"]*)$")
	public void The_user_enters_create_office_start_day(String startDay) {

		String StartdateDay = driver.findElement(CreateOfficeLocators.StartdateDay).getText();
		logger.info("Start : " + StartdateDay);
		logger.info("Start Day: " + CreateOfficeFields.Day);
		Assert.assertEquals(CreateOfficeFields.Day, StartdateDay);
		// StartMonth1 = DateClass.getCurrentDay();
		if (startDay != null && !(startDay.equalsIgnoreCase(x)) && startDay.trim().length() != 0) {
			StartMonth1 = startDay;
			logger.info("startDay" + startDay);
			driver.findElement(CreateOfficeLocators.StartdateDayTextBox).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"day"));
			logger.info("enters start day ", scenario);

		} else if (startDay != null && startDay.equalsIgnoreCase(x)) {
			logger.info("No select on start Day ");
		} else {
			StartMonth1 = DateClass.getCurrentDay();
			logger.info("startDay" + startDay);
			driver.findElement(CreateOfficeLocators.StartdateDayTextBox).sendKeys(DateClass.getCurrentDay());
			logger.info("enters start day ", scenario);
		}
		// driver.findElement(CreateOfficeLocators.StartdateDayTextBox).sendKeys(DateClass.getCurrentDay());
		// logger.info("enters start day ", scenario);
	}

	@And("^The user enters create office start year ([^\"]*)$")
	public void The_user_enters_create_office_start_year(String startYear) {

		String StartdateYear = driver.findElement(CreateOfficeLocators.StartdateYear).getText();
		logger.info("Start Year : " + StartdateYear);
		logger.info("Start Year: " + CreateOfficeFields.Year);
		Assert.assertEquals(CreateOfficeFields.Year, StartdateYear);
		// StartYear1 = DateClass.getCurrentYear();
		// logger.info("StartYear1: " + StartYear1);
		// driver.findElement(CreateOfficeLocators.StartdateYearTextDate).sendKeys(DateClass.getCurrentYear());
		// logger.info("enters start year ", scenario);

		if (startYear != null && !(startYear.equalsIgnoreCase(x)) && startYear.trim().length() != 0) {
			StartYear1 = startYear;
			logger.info("StartYear1: " + StartYear1);
			driver.findElement(CreateOfficeLocators.StartdateYearTextDate).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"year"));
			logger.info("enters start year ", scenario);

		} else if (startYear != null && startYear.equalsIgnoreCase(x)) {
			logger.info("No select on startYear ");
		} else {
			StartYear1 = DateClass.getCurrentYear();
			logger.info("StartYear1: " + StartYear1);
			driver.findElement(CreateOfficeLocators.StartdateYearTextDate).sendKeys(DateClass.getCurrentYear());
			logger.info("enters start year ", scenario);
		}
	}

	@And("^The user enters create office end month ([^\"]*)$")
	public void The_user_enter_create_office_end_month(String EndMonth) throws Throwable {
		String Enddate = driver.findElement(CreateOfficeLocators.Enddate).getText();
		logger.info("End date: " + Enddate);
		logger.info("End date1: " + CreateOfficeFields.Enddate);
		Assert.assertEquals(CreateOfficeFields.Enddate, Enddate);

		String EnddateText = driver.findElement(CreateOfficeLocators.EnddateText).getText();
		logger.info("End date: " + EnddateText);
		logger.info("End date1: " + CreateOfficeFields.EnddateText);
		Assert.assertEquals(CreateOfficeFields.EnddateText, EnddateText);

		String EnddateMonth = driver.findElement(CreateOfficeLocators.EnddateMonth).getText();
		logger.info("End Month : " + EnddateMonth);
		logger.info("End Month1: " + CreateOfficeFields.Month);
		Assert.assertEquals(CreateOfficeFields.Month, EnddateMonth);

		Thread.sleep(1000);
		// logger.info("DateClass.getCurrentMonth():" + DateClass.getCurrentMonth());
		// driver.findElement(CreateOfficeLocators.EnddateMonthTextbox).sendKeys(DateClass.getCurrentMonth());
		// driver.findElement(CreateOfficeLocators.EnddateMonthTextbox).sendKeys("02");
		logger.info("enters start month ", scenario);

		if (EndMonth != null && !(EndMonth.equalsIgnoreCase(x)) && EndMonth.trim().length() != 0) {
			logger.info("EndMonth:" + EndMonth);
			driver.findElement(CreateOfficeLocators.EnddateMonthTextbox).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"month"));
		} else if (EndMonth != null && EndMonth.equalsIgnoreCase(x)) {
			logger.info("No select on EndMonth ");
		} else {
			logger.info("DateClass.getCurrentMonth():" + DateClass.getCurrentMonth());
			driver.findElement(CreateOfficeLocators.EnddateMonthTextbox).sendKeys(DateClass.addOrSubDaysFromCurrentDate(1,"month"));
		}
	}

	@And("^The user enters create office end day ([^\"]*)$")
	public void The_user_enters_create_office_end_day(String EndDay) {

		String EnddateDay = driver.findElement(CreateOfficeLocators.EnddateDay).getText();
		logger.info("End Day : " + EnddateDay);
		logger.info("End Day: " + CreateOfficeFields.Day);
		Assert.assertEquals(CreateOfficeFields.Day, EnddateDay);
		logger.info("DateClass.getPreviousDay():" + DateClass.getPreviousDay());
		/*
		 * EndDay1 = DateClass.getPreviousDay();
		 * driver.findElement(CreateOfficeLocators.EnddateDayTextbox).sendKeys(DateClass
		 * .getPreviousDay());
		 * //driver.findElement(CreateOfficeLocators.EnddateDayTextbox).sendKeys("05");
		 * logger.info("enters End day ", scenario);
		 */
		if (EndDay != null && !(EndDay.equalsIgnoreCase(x)) && EndDay.trim().length() != 0) {
			logger.info("EnddateDay:" + EndDay);
			EndDay1 = EndDay;
			driver.findElement(CreateOfficeLocators.EnddateDayTextbox).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"day"));
		} else if (EndDay != null && EndDay.equalsIgnoreCase(x)) {
			logger.info("No select on EnddateDay ");
		} else {
			EndDay1 = DateClass.getPreviousDay();
			logger.info("EnddateDay:" + DateClass.getPreviousDay());
			driver.findElement(CreateOfficeLocators.EnddateDayTextbox).sendKeys(DateClass.addOrSubDaysFromCurrentDate(1,"day"));
		}
	}

	@And("^The user enters create office end year ([^\"]*)$")
	public void The_user_enters_create_office_end_year(String EndYear) {
		String EnddateYear = driver.findElement(CreateOfficeLocators.EnddateYear).getText();
		logger.info("End year : " + EnddateYear);
		logger.info("End year: " + CreateOfficeFields.Year);
		Assert.assertEquals(CreateOfficeFields.Year, EnddateYear);
		logger.info("DateClass.getCurrentYear():" + DateClass.getCurrentYear());
		// EndYear1 = DateClass.getCurrentYear();
		// driver.findElement(CreateOfficeLocators.EnddateYearTextbox).sendKeys(DateClass.getCurrentYear());
		// logger.info("enters End year ", scenario);
		if (EndYear != null && !(EndYear.equalsIgnoreCase(x)) && EndYear.trim().length() != 0) {
			EndYear1 = EndYear;
			logger.info("EndYear1: " + EndYear1);
			driver.findElement(CreateOfficeLocators.EnddateYearTextbox).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"year"));
			logger.info("enters End year ", scenario);
		} else if (EndYear != null && EndYear.equalsIgnoreCase(x)) {
			logger.info("No select on EndYear ");
		} else {
			EndYear1 = DateClass.getCurrentYear();
			logger.info("EndYear1: " + EndYear1);
			driver.findElement(CreateOfficeLocators.EnddateYearTextbox).sendKeys(DateClass.addOrSubDaysFromCurrentDate(1,"year"));
			logger.info("enters End year ", scenario);
		}
	}

	@And("^The user enters office short name ([^\"]*)$")
	public void The_user_enters_office_short_name(String ShortName) {
		String OfficeShortName = driver.findElement(CreateOfficeLocators.OfficeShortName).getText();
		logger.info("ShortName : " + OfficeShortName);
		logger.info("ShortName1: " + CreateOfficeFields.ShortName);
		Assert.assertEquals(CreateOfficeFields.ShortName, OfficeShortName);
		/*
		 * OfficeShortName1 = ShortName;
		 * driver.findElement(CreateOfficeLocators.OfficeShortNameText).sendKeys(
		 * OfficeShortName1); logger.info("enters ShortName ", scenario);
		 */
		if (ShortName != null && ShortName.trim().length() != 0) {
			logger.info("ShortName: " + ShortName);
			OfficeShortName1 = ShortName;
			driver.findElement(CreateOfficeLocators.OfficeShortNameText).sendKeys(OfficeShortName1);
			logger.info("OfficeShortName1: " + OfficeShortName1);
		} else {
			OfficeShortName1 = ShortName;
			driver.findElement(CreateOfficeLocators.OfficeShortNameText).sendKeys(OfficeShortName1);
			logger.info("OfficeShortName1: " + OfficeShortName1);
			logger.info("enters ShortName ", scenario);
		}
	}

	@And("^The user select office type Financial funding ([^\"]*)$")
	public void The_user_select_office_type_funding(String FinancialFunding) {
		String OfficeTypes = driver.findElement(CreateOfficeLocators.OfficeTypes).getText();
		logger.info("OfficeTypes : " + OfficeTypes);
		logger.info("OfficeTypes 1: " + CreateOfficeFields.OfficeTypes);
		Assert.assertEquals(CreateOfficeFields.OfficeTypes, OfficeTypes);

		String OfficeTypesText = driver.findElement(CreateOfficeLocators.OfficeTypesText).getText();
		logger.info("OfficeTypesText : " + OfficeTypesText);
		logger.info("OfficeTypesText 1: " + CreateOfficeFields.OfficeTypesText);
		Assert.assertEquals(CreateOfficeFields.OfficeTypesText, OfficeTypesText);

		/*
		 * WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFunding);
		 * Actions builder3 = new Actions(driver); Actions seriesOfActions3 =
		 * builder3.moveToElement(elt3).click(); seriesOfActions3.sendKeys(Keys.TAB);
		 * seriesOfActions3.perform();
		 */

		if (FinancialFunding != null && FinancialFunding.trim().length() != 0) {
			logger.info("Not selected Financial funding:" + FinancialFunding);

		} else {
			logger.info("FinancialFunding:" + FinancialFunding);

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

		/*
		 * String FinancialFundingStartOptional =
		 * driver.findElement(CreateOfficeLocators.FinancialFundingStartOptional)
		 * .getText(); logger.info("FinancialFundingStartOptional : " +
		 * FinancialFundingStartOptional);
		 * logger.info("FinancialFundingStartOptional 1: " +
		 * CreateOfficeFields.StartOptional);
		 * Assert.assertEquals(CreateOfficeFields.StartOptional,
		 * FinancialFundingStartOptional);
		 * 
		 * String FinancialFundingStart1 =
		 * driver.findElement(CreateOfficeLocators.FinancialFundingStart1).getText();
		 * logger.info("FinancialFundingStartOptional : " + FinancialFundingStart1);
		 * logger.info("FinancialFundingStartOptional 1: " +
		 * CreateOfficeFields.FinancialAssistanceFundingStart);
		 * Assert.assertEquals(CreateOfficeFields.FinancialAssistanceFundingStart,
		 * FinancialFundingStart1);
		 */
	}

	@And("^The user enters Financial funding start month ([^\"]*)$")
	public void The_user_enters_funding_office_start_month(String FinancialFundingstartMonth) throws Throwable {
		if (FinancialFundingstartMonth != null && !(FinancialFundingstartMonth.equalsIgnoreCase(x))
				&& FinancialFundingstartMonth.trim().length() != 0) {
			String FinancialFundingStartMonth1 = driver.findElement(CreateOfficeLocators.FinancialFundingStartMonth)
					.getText();
			logger.info("FinancialFundingStartMonth : " + FinancialFundingStartMonth1);
			logger.info("FinancialFundingStartMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialFundingStartMonth1);
			logger.info("Financial funding Start Month: " + DateClass.getCurrentMonth());
			logger.info("FinancialFundingstartMonth" + FinancialFundingstartMonth);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingStartMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(3,"month"));
			logger.info("Financial funding start month" + FinancialFundingstartMonth);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingStartMonthText).sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);

		} else if (FinancialFundingstartMonth != null && FinancialFundingstartMonth.equalsIgnoreCase(x)) {
			logger.info("No select on FinancialFundingstartMonth ");
		} else {
			String FinancialFundingStartMonth1 = driver.findElement(CreateOfficeLocators.FinancialFundingStartMonth)
					.getText();
			logger.info("FinancialFundingStartMonth : " + FinancialFundingStartMonth1);
			logger.info("FinancialFundingStartMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialFundingStartMonth1);
			logger.info("Financial funding Start Month: " + DateClass.getCurrentMonth());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingStartMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentMonth());
			logger.info("Financial funding start month" + DateClass.getCurrentMonth());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingStartMonthText).sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		}
	}

	@And("^The user enters Financial funding start day ([^\"]*)$")
	public void The_user_enters_funding_office_start_day(String FinancialFundingstartDay) throws Throwable {
		if (FinancialFundingstartDay != null && !(FinancialFundingstartDay.equalsIgnoreCase(x))
				&& FinancialFundingstartDay.trim().length() != 0) {
			logger.info("FinancialFundingstartDay" + FinancialFundingstartDay);
			String FinancialFundingStartDay = driver.findElement(CreateOfficeLocators.FinancialFundingStartDay)
					.getText();
			logger.info("FinancialFundingStartDay : " + FinancialFundingStartDay);
			logger.info("FinancialFundingStartDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialFundingStartDay);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingStartDayText);
			Actions builder3 = new Actions(driver);
			logger.info("Financial funding Start Day: " + DateClass.getCurrentDay());
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(3,"day"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingStartDayText).sendKeys(Keys.TAB);
			logger.info("enters start day ", scenario);
		} else if (FinancialFundingstartDay != null && FinancialFundingstartDay.equalsIgnoreCase(x)) {
			logger.info("No select on FinancialFundingstartDay ");
		} else {
			logger.info("FinancialFundingstartDay" + DateClass.getCurrentDay());
			String FinancialFundingStartDay = driver.findElement(CreateOfficeLocators.FinancialFundingStartDay)
					.getText();
			logger.info("FinancialFundingStartDay : " + FinancialFundingStartDay);
			logger.info("FinancialFundingStartDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialFundingStartDay);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingStartDayText);
			Actions builder3 = new Actions(driver);
			logger.info("Financial funding Start Day: " + DateClass.getCurrentDay());
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentDay());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingStartDayText).sendKeys(Keys.TAB);
			logger.info("enters start day ", scenario);
		}
	}

	@And("^The user enters Financial funding start year ([^\"]*)$")
	public void The_user_enters_funding_office_start_year(String FinancialFundingstartYear) throws Throwable {
		if (FinancialFundingstartYear != null && !(FinancialFundingstartYear.equalsIgnoreCase(x))
				&& FinancialFundingstartYear.trim().length() != 0) {
			logger.info("FinancialFundingstartYear: " + FinancialFundingstartYear);
			String FinancialFundingStartYear1 = driver.findElement(CreateOfficeLocators.FinancialFundingStartYear)
					.getText();
			logger.info("FinancialFundingStartDay : " + FinancialFundingStartYear1);
			logger.info("FinancialFundingStartDay 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialFundingStartYear1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingStartYearText);
			Actions builder3 = new Actions(driver);
			logger.info("Financial funding Start year: " + FinancialFundingstartYear);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(FinancialFundingstartYear);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingStartYearText).sendKeys(Keys.TAB);
		} else if (FinancialFundingstartYear != null && FinancialFundingstartYear.equalsIgnoreCase(x)) {
			logger.info("No select on FinancialFundingstartYear ");
		} else {
			logger.info("FinancialFundingstartYear" + FinancialFundingstartYear);
			String FinancialFundingStartYear1 = driver.findElement(CreateOfficeLocators.FinancialFundingStartYear)
					.getText();
			logger.info("FinancialFundingStartDay : " + FinancialFundingStartYear1);
			logger.info("FinancialFundingStartDay 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialFundingStartYear1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingStartYearText);
			Actions builder3 = new Actions(driver);
			logger.info("Financial funding Start year: " + DateClass.getCurrentYear());
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingStartYearText).sendKeys(Keys.TAB);
		}

		logger.info("enters start year ", scenario);
	}

	@And("^The user enters Financial funding end month ([^\"]*)$")
	public void The_user_enter_funding_office_end_month(String FinancialFundingEndMonth) throws Throwable {
		if (FinancialFundingEndMonth != null && !(FinancialFundingEndMonth.equalsIgnoreCase(x)) && ! (FinancialFundingEndMonth.equalsIgnoreCase(S)) && FinancialFundingEndMonth.trim().length() != 0) {
			logger.info("FinancialFundingEndMonth Null: " +DateClass.addOrSubDaysFromCurrentDate(-1,"month"));
			String FinancialFundingEndOptional1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndOptional)
					.getText();
			logger.info("FinancialFundingEndOptional : " + FinancialFundingEndOptional1);
			logger.info("FinancialFundingEndOptional 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.EndOptional, FinancialFundingEndOptional1);

			String FinancialFundingEnd1 = driver.findElement(CreateOfficeLocators.FinancialFundingEnd1).getText();
			logger.info("FinancialFundingEnd : " + FinancialFundingEnd1);
			logger.info("FinancialFundingEnd 1: " + CreateOfficeFields.ContractAwardsStart);
			Assert.assertEquals(CreateOfficeFields.ContractAwardsStart, FinancialFundingEnd1);

			String FinancialFundingEndMonth1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndMonth)
					.getText();
			logger.info("FinancialFundingEndMonth : " + FinancialFundingEndMonth1);
			logger.info("FinancialFundingEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialFundingEndMonth1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"month"));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("02");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingEndMonthText).sendKeys(Keys.TAB);
		} else if (FinancialFundingEndMonth != null && FinancialFundingEndMonth.equalsIgnoreCase(x) && ! (FinancialFundingEndMonth.equalsIgnoreCase (S) )) {
			logger.info("No select on FinancialFundingEndMonth ");
		} else if (FinancialFundingEndMonth != null &&  !(FinancialFundingEndMonth.equalsIgnoreCase(x)) && (FinancialFundingEndMonth.equalsIgnoreCase(S))) {
			logger.info("FinancialFundingEndMonth S: " + (DateClass.addOrSubDaysFromCurrentDate(5,"month")));
			String FinancialFundingEndOptional1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndOptional)
					.getText();
			logger.info("FinancialFundingEndOptional : " + FinancialFundingEndOptional1);
			logger.info("FinancialFundingEndOptional 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.EndOptional, FinancialFundingEndOptional1);

			String FinancialFundingEnd1 = driver.findElement(CreateOfficeLocators.FinancialFundingEnd1).getText();
			logger.info("FinancialFundingEnd : " + FinancialFundingEnd1);
			logger.info("FinancialFundingEnd 1: " + CreateOfficeFields.ContractAwardsStart);
			Assert.assertEquals(CreateOfficeFields.ContractAwardsStart, FinancialFundingEnd1);

			String FinancialFundingEndMonth1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndMonth)
					.getText();
			logger.info("FinancialFundingEndMonth : " + FinancialFundingEndMonth1);
			logger.info("FinancialFundingEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialFundingEndMonth1);
			logger.info("Test====="+ (DateClass.addOrSubDaysFromCurrentDate(5,"month")));
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys((DateClass.addOrSubDaysFromCurrentDate(5,"month")));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("02");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingEndMonthText).sendKeys(Keys.TAB);
		}  else {
			String FinancialFundingEndOptional1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndOptional)
					.getText();
			logger.info("FinancialFundingEndOptional : " + FinancialFundingEndOptional1);
			logger.info("FinancialFundingEndOptional 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.EndOptional, FinancialFundingEndOptional1);

			String FinancialFundingEnd1 = driver.findElement(CreateOfficeLocators.FinancialFundingEnd1).getText();
			logger.info("FinancialFundingEnd : " + FinancialFundingEnd1);
			logger.info("FinancialFundingEnd 1: " + CreateOfficeFields.ContractAwardsStart);
			Assert.assertEquals(CreateOfficeFields.ContractAwardsStart, FinancialFundingEnd1);

			String FinancialFundingEndMonth1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndMonth)
					.getText();
			logger.info("FinancialFundingEndMonth : " + FinancialFundingEndMonth1);
			logger.info("FinancialFundingEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialFundingEndMonth1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys((DateClass.addOrSubDaysFromCurrentDate(1,"month")));
			logger.info("DateClass.getCurrentMonth():" + DateClass.getCurrentMonth());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingEndMonthText).sendKeys(Keys.TAB);
		}
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters Financial funding end day ([^\"]*)$")
	public void The_user_enters_funding_office_end_day(String FinancialFundingEndDay) throws InterruptedException {
		if (FinancialFundingEndDay != null && !(FinancialFundingEndDay.equalsIgnoreCase(x)) && !(FinancialFundingEndDay.equalsIgnoreCase(S))
				&& FinancialFundingEndDay.trim().length() != 0) {
			logger.info("FinancialFundingEndDay: " + DateClass.addOrSubDaysFromCurrentDate(-1,"day"));
			String FinancialFundingEndDay1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndDay).getText();
			logger.info("FinancialFundingEndDay : " + FinancialFundingEndDay1);
			logger.info("FinancialFundingEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialFundingEndDay1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(FinancialFundingEndDay);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingEndDayText).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"day"));
			logger.info("enters End day ", scenario);
		} else if (FinancialFundingEndDay != null && FinancialFundingEndDay.equalsIgnoreCase(x) && !(FinancialFundingEndDay.equalsIgnoreCase(S))) {
			logger.info("No select on FinancialFundingEndDay ");
		}else if (FinancialFundingEndDay != null && !( FinancialFundingEndDay.equalsIgnoreCase(x)) && (FinancialFundingEndDay.equalsIgnoreCase(S))) {
			logger.info("FinancialFundingEndDay S: " + DateClass.addOrSubDaysFromCurrentDate(5,"day"));
			String FinancialFundingEndDay1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndDay).getText();
			logger.info("FinancialFundingEndDay : " + FinancialFundingEndDay1);
			logger.info("FinancialFundingEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialFundingEndDay1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(FinancialFundingEndDay);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingEndDayText).sendKeys(DateClass.addOrSubDaysFromCurrentDate(5,"day"));
			logger.info("enters End day ", scenario);
		} else {
			String FinancialFundingEndDay1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndDay).getText();
			logger.info("FinancialFundingEndDay : " + FinancialFundingEndDay1);
			logger.info("FinancialFundingEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialFundingEndDay1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(1,"day"));
			logger.info("FinancialFundingEndDay" + DateClass.getPreviousDay());
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("05");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingEndDayText).sendKeys(Keys.TAB);
			logger.info("enters End day ", scenario);
		}
	}

	@And("^The user enters Financial funding end year ([^\"]*)$")
	public void The_user_enters_funding_office_end_year(String FinancialFundingEndYear) throws Throwable {
		if (FinancialFundingEndYear != null && !(FinancialFundingEndYear.equalsIgnoreCase(x))
				&& FinancialFundingEndYear.trim().length() != 0) {
			logger.info("FinancialFundingEndYear: " + FinancialFundingEndYear);
			String FinancialFundingEndYear1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndYear)
					.getText();
			logger.info("FinancialFundingEndDay : " + FinancialFundingEndYear1);
			logger.info("FinancialFundingEndDay 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialFundingEndYear1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingEndYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(FinancialFundingEndYear);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingEndYearText).sendKeys(Keys.TAB);
			logger.info("enters End year ", scenario);
		} else if (FinancialFundingEndYear != null && FinancialFundingEndYear.equalsIgnoreCase(x)) {
			logger.info("No select on FinancialFundingEndYear ");
		} else {
			String FinancialFundingEndYear1 = driver.findElement(CreateOfficeLocators.FinancialFundingEndYear)
					.getText();
			logger.info("FinancialFundingEndYear1 : " + FinancialFundingEndYear1);
			logger.info("FinancialFundingEndYear1 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialFundingEndYear1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialFundingEndYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
			logger.info("FinancialFundingEndYear" + DateClass.getCurrentYear());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialFundingEndYearText).sendKeys(Keys.TAB);
			logger.info("enters End year ", scenario);
		}
	}

	@And("^The user select office type contract Awards ([^\"]*)$")
	public void The_user_select_office_type_contracting(String contractAwards) throws Throwable {
		/*
		 * WebElement elt3 =
		 * driver.findElement(CreateOfficeLocators.ContractAwardsCheckbox); Actions
		 * builder3 = new Actions(driver); Actions seriesOfActions3 =
		 * builder3.moveToElement(elt3).click(); Thread.sleep(2000);
		 * seriesOfActions3.sendKeys(Keys.TAB); seriesOfActions3.perform();
		 */

		if (contractAwards != null && contractAwards.trim().length() != 0) {
			logger.info("Not select ContractAwardsCheckbox" + contractAwards);
		} else {
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

		/*
		 * String ContractAwardsText =
		 * driver.findElement(CreateOfficeLocators.ContractAwardsText).getText();
		 * logger.info("ContractAwardsText : " + ContractAwardsText);
		 * logger.info("ContractAwardsText 1: " + CreateOfficeFields.ContractAwards);
		 * Assert.assertEquals(CreateOfficeFields.ContractAwards, ContractAwardsText);
		 * 
		 * String ContractAwardsStartOptional1 =
		 * driver.findElement(CreateOfficeLocators.ContractAwardsStartOptional)
		 * .getText(); logger.info("ContractAwardsStartOptional1 : " +
		 * ContractAwardsStartOptional1); logger.info("ContractAwardsStartOptional 1: "
		 * + CreateOfficeFields.StartOptional);
		 * Assert.assertEquals(CreateOfficeFields.StartOptional,
		 * ContractAwardsStartOptional1);
		 * 
		 * String ContractAwardsStart1 =
		 * driver.findElement(CreateOfficeLocators.ContractAwardsStart1).getText();
		 * logger.info("ContractAwardsStart1 : " + ContractAwardsStart1);
		 * logger.info("ContractAwardsStart 1: " +
		 * CreateOfficeFields.ContractFundingStart);
		 * Assert.assertEquals(CreateOfficeFields.ContractFundingStart,
		 * ContractAwardsStart1); logger.info("enters contracting ", scenario);
		 */
	}

	@And("^The user enters contract Awards start month ([^\"]*)$")
	public void The_user_enters_contracting_office_start_month(String contractAwardsstartMonth) throws Throwable {
		if (contractAwardsstartMonth != null && !(contractAwardsstartMonth.equalsIgnoreCase(x)) && contractAwardsstartMonth.trim().length() != 0) {
			logger.info("contractAwardsstartMonth" + contractAwardsstartMonth);
			String ContractAwardsStartMonth1 = driver.findElement(CreateOfficeLocators.ContractAwardsStartMonth)
					.getText();
			logger.info("ContractAwardsStartMonth : " + ContractAwardsStartMonth1);
			logger.info("ContractAwardsStartMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, ContractAwardsStartMonth1);
			logger.info("DateClass.getCurrentMonth(): " + DateClass.getCurrentMonth());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsStartMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(3,"month"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsStartMonthText).sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		} else if (contractAwardsstartMonth != null && contractAwardsstartMonth.equalsIgnoreCase(x)) {
			logger.info("No select on contractAwardsstartMonth ");
		} else {
			logger.info("contractAwardsstartMonth" + DateClass.getCurrentMonth());
			String ContractAwardsStartMonth1 = driver.findElement(CreateOfficeLocators.ContractAwardsStartMonth)
					.getText();
			logger.info("ContractAwardsStartMonth : " + ContractAwardsStartMonth1);
			logger.info("ContractAwardsStartMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, ContractAwardsStartMonth1);
			logger.info("DateClass.getCurrentMonth(): " + DateClass.getCurrentMonth());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsStartMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentMonth());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsStartMonthText).sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		}
	}

	@And("^The user enters contract Awards start day ([^\"]*)$")
	public void The_user_enters_contracting_office_start_day(String contractAwardsstartDay) throws Throwable {
		/*
		 * String ContractAwardsStartDay1 =
		 * driver.findElement(CreateOfficeLocators.ContractAwardsStartDay).getText();
		 * logger.info("contractAwardsstartDay : " + ContractAwardsStartDay1);
		 * logger.info("contractAwardsstartDay 1: " + CreateOfficeFields.Day);
		 * Assert.assertEquals(CreateOfficeFields.Day, ContractAwardsStartDay1);
		 * logger.info("DateClass.getCurrentMonth(): " + DateClass.getCurrentDay());
		 * /*WebElement elt3 =
		 * driver.findElement(CreateOfficeLocators.ContractAwardsStartDayText); Actions
		 * builder3 = new Actions(driver); Actions seriesOfActions3 =
		 * builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentDay());
		 * seriesOfActions3.perform(); Thread.sleep(2000);
		 * driver.findElement(CreateOfficeLocators.ContractAwardsStartDayText).sendKeys(
		 * Keys.TAB); logger.info("enters start day ", scenario);
		 */
		if (contractAwardsstartDay != null && !(contractAwardsstartDay.equalsIgnoreCase(x))
				&& contractAwardsstartDay.trim().length() != 0) {
			String ContractAwardsStartDay1 = driver.findElement(CreateOfficeLocators.ContractAwardsStartDay).getText();
			logger.info("contractAwardsstartDay : " + ContractAwardsStartDay1);
			logger.info("contractAwardsstartDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractAwardsStartDay1);
			logger.info("DateClass.getCurrentMonth(): " + DateClass.getCurrentDay());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsStartDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(3,"day"));
			logger.info("contractAwardsstartDay" + contractAwardsstartDay);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsStartDayText).sendKeys(Keys.TAB);
			logger.info("enters start day ", scenario);
		} else if (contractAwardsstartDay != null && contractAwardsstartDay.equalsIgnoreCase(x)) {
			logger.info("No select on contractAwardsstartDay ");
		} else {
			String ContractAwardsStartDay1 = driver.findElement(CreateOfficeLocators.ContractAwardsStartDay).getText();
			logger.info("contractAwardsstartDay : " + ContractAwardsStartDay1);
			logger.info("contractAwardsstartDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractAwardsStartDay1);
			logger.info("DateClass.getCurrentMonth(): " + DateClass.getCurrentDay());

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsStartDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentDay());
			logger.info("DateClass.getCurrentDay()" + DateClass.getCurrentDay());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsStartDayText).sendKeys(Keys.TAB);
			logger.info("enters start day ", scenario);
		}
	}

	@And("^The user enters contract Awards start year ([^\"]*)$")
	public void The_user_enters_contracting_office_start_year(String contractAwardsstartYear) throws Throwable {
		if (contractAwardsstartYear != null && !(contractAwardsstartYear.equalsIgnoreCase(x))
				&& contractAwardsstartYear.trim().length() != 0) {
			logger.info("contractAwardsstartYear: " + contractAwardsstartYear);
			String ContractAwardsStartYear1 = driver.findElement(CreateOfficeLocators.ContractAwardsStartYear)
					.getText();
			logger.info("contractAwardsstartYear : " + ContractAwardsStartYear1);
			logger.info("contractAwardsstartYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, ContractAwardsStartYear1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsStartYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(contractAwardsstartYear);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsStartYearText).sendKeys(Keys.TAB);
			logger.info("enters start year ", scenario);
		} else if (contractAwardsstartYear != null && contractAwardsstartYear.equalsIgnoreCase(x)) {
			logger.info("No select on contractAwardsstartYear ");
		} else {
			logger.info("contractAwardsstartYear: " + DateClass.getCurrentYear());
			String ContractAwardsStartYear1 = driver.findElement(CreateOfficeLocators.ContractAwardsStartYear)
					.getText();
			logger.info("contractAwardsstartYear : " + ContractAwardsStartYear1);
			logger.info("contractAwardsstartYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, ContractAwardsStartYear1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsStartYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsStartYearText).sendKeys(Keys.TAB);
			logger.info("enters start year ", scenario);
		}
	}

	@And("^The user enters contract Awards end month ([^\"]*)$")
	public void The_user_enter_contracting_office_end_month(String contractAwardsEndMonth) throws Throwable {
		if (contractAwardsEndMonth != null && !(contractAwardsEndMonth.equalsIgnoreCase(x)) && ! (contractAwardsEndMonth.equalsIgnoreCase(S))
				&& contractAwardsEndMonth.trim().length() != 0) {
			String ContractAwardsEndOptional1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndOptional)
					.getText();
			logger.info("contractAwardsEndMonth  Null : " + ContractAwardsEndOptional1);
			logger.info("contractAwardsEndMonth 1: " + CreateOfficeFields.EndOptional);
			Assert.assertEquals(CreateOfficeFields.EndOptional, ContractAwardsEndOptional1);
			String ContractAwardsEnd1 = driver.findElement(CreateOfficeLocators.ContractAwardsEnd1).getText();
			logger.info("contractAwardsEndMonth : " + ContractAwardsEnd1);
			logger.info("contractAwardsEndMonth 1: " + CreateOfficeFields.ContractFundingEnd);
			Assert.assertEquals(CreateOfficeFields.ContractFundingEnd, ContractAwardsEnd1);
			String FinancialFundingEndMonth1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndMonth)
					.getText();
			logger.info("contractAwardsEndMonth : " + FinancialFundingEndMonth1);
			logger.info("contractAwardsEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialFundingEndMonth1);
			logger.info("contractAwardsEndMonth: " + contractAwardsEndMonth);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"month"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsEndMonthText).sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		} else if (contractAwardsEndMonth != null && contractAwardsEndMonth.equalsIgnoreCase(x) && ! (contractAwardsEndMonth.equalsIgnoreCase(S))) {
			logger.info("No select on contractAwardsEndMonth ");
		} else if (contractAwardsEndMonth != null && !(contractAwardsEndMonth.equalsIgnoreCase(x)) &&  (contractAwardsEndMonth.equalsIgnoreCase(S))) {
			String ContractAwardsEndOptional1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndOptional)
					.getText();
			logger.info("contractAwardsEndMonth  S: " + ContractAwardsEndOptional1);
			logger.info("contractAwardsEndMonth 1: " + CreateOfficeFields.EndOptional);
			Assert.assertEquals(CreateOfficeFields.EndOptional, ContractAwardsEndOptional1);
			String ContractAwardsEnd1 = driver.findElement(CreateOfficeLocators.ContractAwardsEnd1).getText();
			logger.info("contractAwardsEndMonth : " + ContractAwardsEnd1);
			logger.info("contractAwardsEndMonth 1: " + CreateOfficeFields.ContractFundingEnd);
			Assert.assertEquals(CreateOfficeFields.ContractFundingEnd, ContractAwardsEnd1);
			String FinancialFundingEndMonth1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndMonth)
					.getText();
			logger.info("contractAwardsEndMonth : " + FinancialFundingEndMonth1);
			logger.info("contractAwardsEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialFundingEndMonth1);
			logger.info("contractAwardsEndMonth: " + contractAwardsEndMonth);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(5,"month"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsEndMonthText).sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		} else {
			String ContractAwardsEndOptional1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndOptional)
					.getText();
			logger.info("contractAwardsEndMonth : " + ContractAwardsEndOptional1);
			logger.info("contractAwardsEndMonth 1: " + CreateOfficeFields.EndOptional);
			Assert.assertEquals(CreateOfficeFields.EndOptional, ContractAwardsEndOptional1);
			String ContractAwardsEnd1 = driver.findElement(CreateOfficeLocators.ContractAwardsEnd1).getText();
			logger.info("contractAwardsEndMonth : " + ContractAwardsEnd1);
			logger.info("contractAwardsEndMonth 1: " + CreateOfficeFields.ContractFundingEnd);
			Assert.assertEquals(CreateOfficeFields.ContractFundingEnd, ContractAwardsEnd1);
			String FinancialFundingEndMonth1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndMonth)
					.getText();
			logger.info("contractAwardsEndMonth : " + FinancialFundingEndMonth1);
			logger.info("contractAwardsEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialFundingEndMonth1);
			logger.info("contractAwardsEndMonth:" + DateClass.getCurrentMonth());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys((DateClass.addOrSubDaysFromCurrentDate(1,"month")));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("02");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsEndMonthText).sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		}
	}

	@And("^The user enters contract Awards end day ([^\"]*)$")
	public void The_user_enters_contracting_office_end_day(String contractAwardsEndDay) throws Throwable {
		if (contractAwardsEndDay != null && !(contractAwardsEndDay.equalsIgnoreCase(x)) && ! (contractAwardsEndDay.equalsIgnoreCase(S))
				&& contractAwardsEndDay.trim().length() != 0) {
			logger.info("contractAwardsEndDay Null: " + contractAwardsEndDay);
			String ContractAwardsEndDay1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndDay).getText();
			logger.info("ContractAwardsEndDay1 : " + ContractAwardsEndDay1);
			logger.info("ContractAwardsEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractAwardsEndDay1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"day"));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("05");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsEndDayText).sendKeys(Keys.TAB);
			logger.info("enters End day ", scenario);
		} else if (contractAwardsEndDay != null && contractAwardsEndDay.equalsIgnoreCase(x) && ! (contractAwardsEndDay.equalsIgnoreCase(S))) {
			logger.info("No select on contractAwardsEndDay ");
		}else if (contractAwardsEndDay != null && ! (contractAwardsEndDay.equalsIgnoreCase(x)) &&  (contractAwardsEndDay.equalsIgnoreCase(S))) {
			logger.info("contractAwardsEndDay S: " + contractAwardsEndDay);
			String ContractAwardsEndDay1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndDay).getText();
			logger.info("ContractAwardsEndDay1 : " + ContractAwardsEndDay1);
			logger.info("ContractAwardsEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractAwardsEndDay1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(5,"day"));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("05");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsEndDayText).sendKeys(Keys.TAB);
			logger.info("enters End day ", scenario);
		} else {
			logger.info("contractAwardsEndDay : " + DateClass.getPreviousDay());
			String ContractAwardsEndDay1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndDay).getText();
			logger.info("ContractAwardsEndDay1 : " + ContractAwardsEndDay1);
			logger.info("ContractAwardsEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractAwardsEndDay1);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(1,"day"));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("05");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsEndDayText).sendKeys(Keys.TAB);
			logger.info("enters End day ", scenario);
		}
	}

	@And("^The user enters contract Awards end year ([^\"]*)$")
	public void The_user_enters_contracting_office_end_year(String contractAwardsEndYear) throws Throwable {
		/*
		 * String ContractAwardsEndYear1 =
		 * driver.findElement(CreateOfficeLocators.ContractAwardsEndYear).getText();
		 * logger.info("ContractAwardsEndYear1 : " + ContractAwardsEndYear1);
		 * logger.info("ContractAwardsEndYear 1: " + CreateOfficeFields.Year);
		 * Assert.assertEquals(CreateOfficeFields.Year, ContractAwardsEndYear1);
		 * WebElement elt3 =
		 * driver.findElement(CreateOfficeLocators.ContractAwardsEndYearText); Actions
		 * builder3 = new Actions(driver); Actions seriesOfActions3 =
		 * builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
		 * seriesOfActions3.perform(); Thread.sleep(2000);
		 * driver.findElement(CreateOfficeLocators.ContractAwardsEndYearText).sendKeys(
		 * Keys.TAB); logger.info("enters End year ", scenario);
		 */
		if (contractAwardsEndYear != null && !(contractAwardsEndYear.equalsIgnoreCase(x))
				&& contractAwardsEndYear.trim().length() != 0) {
			String ContractAwardsEndYear1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndYear).getText();
			logger.info("ContractAwardsEndYear1 : " + ContractAwardsEndYear1);
			logger.info("ContractAwardsEndYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, ContractAwardsEndYear1);
			logger.info("contractAwardsEndYear: " + contractAwardsEndYear);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsEndYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(contractAwardsEndYear);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsEndYearText).sendKeys(Keys.TAB);
			logger.info("enters End year ", scenario);
		} else if (contractAwardsEndYear != null && contractAwardsEndYear.equalsIgnoreCase(x)) {
			logger.info("No select on contractAwardsEndYear ");
		} else {
			String ContractAwardsEndYear1 = driver.findElement(CreateOfficeLocators.ContractAwardsEndYear).getText();
			logger.info("ContractAwardsEndYear1 : " + ContractAwardsEndYear1);
			logger.info("ContractAwardsEndYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, ContractAwardsEndYear1);
			logger.info("contractAwardsEndYear" + DateClass.getCurrentYear());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractAwardsEndYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractAwardsEndYearText).sendKeys(Keys.TAB);
			logger.info("enters End year ", scenario);
		}
	}

	@And("^The user select office type Financial Awards ([^\"]*)$")
	public void The_user_select_office_type_grants(String FinancialAwards) throws Throwable {
		if (FinancialAwards != null && FinancialAwards.trim().length() != 0) {
			logger.info("No select FinancialAwards: " + FinancialAwards);

		} else {
			logger.info("FinancialAwards:" + FinancialAwards);

           /* WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAwardsCheckBox));
			Boolean FinancialAwardsCheckBox = driver.findElement(CreateOfficeLocators.FinancialAwardsCheckBox).isDisplayed();
			logger.info("FinancialAwardsCheckBox: " + FinancialAwardsCheckBox);*/
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

	@And("^The user enters Financial Awards start month ([^\"]*)$")
	public void The_user_enters_grants_office_start_month(String FinancialAwardsstartMonth) throws Throwable {


		if (FinancialAwardsstartMonth != null && !(FinancialAwardsstartMonth.equalsIgnoreCase(x))
				&& FinancialAwardsstartMonth.trim().length() != 0) {
			String FinancialAwardsStartMonth = driver.findElement(CreateOfficeLocators.FinancialAwardsStartMonth)
					.getText();
			logger.info("FinancialAwardsStartMonth : " + FinancialAwardsStartMonth);
			logger.info("FinancialAwardsStartMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialAwardsStartMonth);
			logger.info("DateClass.getCurrentMonth(): " + DateClass.getCurrentMonth());
			logger.info("FinancialAwardsstartMonth: " + FinancialAwardsstartMonth);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(3,"month"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			// seriesOfActions3.sendKeys(Keys.TAB);
			driver.findElement(CreateOfficeLocators.FinancialAwardsStartMonthText).sendKeys(Keys.TAB);
		} else if (FinancialAwardsstartMonth != null && FinancialAwardsstartMonth.equalsIgnoreCase(x)) {
			logger.info("No select on FinancialAwardsstartMonth ");
		} else {
			String FinancialAwardsStartMonth = driver.findElement(CreateOfficeLocators.FinancialAwardsStartMonth)
					.getText();
			logger.info("FinancialAwardsStartMonth : " + FinancialAwardsStartMonth);
			logger.info("FinancialAwardsStartMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialAwardsStartMonth);
			logger.info("DateClass.getCurrentMonth(): " + DateClass.getCurrentMonth());
			logger.info("FinancialAwardsstartMonth: " + DateClass.getCurrentMonth());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentMonth());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			// seriesOfActions3.sendKeys(Keys.TAB);
			driver.findElement(CreateOfficeLocators.FinancialAwardsStartMonthText).sendKeys(Keys.TAB);
		}

		logger.info("enters start month ", scenario);
	}

	@And("^The user enters Financial Awards start day ([^\"]*)$")
	public void The_user_enters_grants_office_start_day(String FinancialAwardsstartDay) throws Throwable {

		if (FinancialAwardsstartDay != null && !(FinancialAwardsstartDay.equalsIgnoreCase(x))
				&& FinancialAwardsstartDay.trim().length() != 0) {
			String FinancialAwardsStartDay1 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartDay)
					.getText();
			logger.info("FinancialAwardsStartDay : " + FinancialAwardsStartDay1);
			logger.info("FinancialAwardsStartDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialAwardsStartDay1);
			logger.info("FinancialAwardsstartDay : " + FinancialAwardsstartDay);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(3,"day"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsStartDayText).sendKeys(Keys.TAB);
			logger.info("enters start day ", scenario);
		} else if (FinancialAwardsstartDay != null && FinancialAwardsstartDay.equalsIgnoreCase(x)) {
			logger.info("No select on FinancialAwardsstartDay ");
		} else {
			String FinancialAwardsStartDay1 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartDay)
					.getText();
			logger.info("FinancialAwardsStartDay : " + FinancialAwardsStartDay1);
			logger.info("FinancialAwardsStartDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialAwardsStartDay1);
			logger.info("FinancialAwardsstartDay" + DateClass.getCurrentDay());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentDay());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsStartDayText).sendKeys(Keys.TAB);
			logger.info("enters start day ", scenario);
		}
	}

	@And("^The user enters Financial Awards start year ([^\"]*)$")
	public void The_user_enters_grants_office_start_year(String FinancialAwardsstartYear) throws Throwable {
		if (FinancialAwardsstartYear != null && !(FinancialAwardsstartYear.equalsIgnoreCase(x))
				&& FinancialAwardsstartYear.trim().length() != 0) {
			String FinancialAwardsStartYear1 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartYear)
					.getText();
			logger.info("FinancialAwardsStartYear : " + FinancialAwardsStartYear1);
			logger.info("FinancialAwardsStartYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialAwardsStartYear1);
			logger.info("FinancialAwardsstartYear: " + FinancialAwardsstartYear);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsStartYearText).sendKeys(Keys.TAB);
			// seriesOfActions3.sendKeys(Keys.TAB);
			logger.info("enters start year ", scenario);
		} else if (FinancialAwardsstartYear != null && FinancialAwardsstartYear.equalsIgnoreCase(x)) {
			logger.info("No select on FinancialAwardsstartYear ");
		} else {
			String FinancialAwardsStartYear1 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartYear)
					.getText();
			logger.info("FinancialAwardsStartYear : " + FinancialAwardsStartYear1);
			logger.info("FinancialAwardsStartYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialAwardsStartYear1);
			logger.info("FinancialAwardsstartYear: " + DateClass.getCurrentYear());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsStartYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsStartYearText).sendKeys(Keys.TAB);
			// seriesOfActions3.sendKeys(Keys.TAB);
			logger.info("enters start year ", scenario);
		}
	}

	@And("^The user enters Financial Awards end month ([^\"]*)$")
	public void The_user_enter_grants_office_end_month(String FinancialAwardsEndMonth) throws Throwable {
		if (FinancialAwardsEndMonth != null && !(FinancialAwardsEndMonth.equalsIgnoreCase(x)) && !(FinancialAwardsEndMonth.equalsIgnoreCase(S))
				&& FinancialAwardsEndMonth.trim().length() != 0) {
			String FinancialAwardsEndOptional = driver.findElement(CreateOfficeLocators.FinancialAwardsEndOptional)
					.getText();
			logger.info("FinancialAwardsEndOptional  Null : " + FinancialAwardsEndOptional);
			logger.info("FinancialAwardsEndOptional 1: " + CreateOfficeFields.EndOptional);
			Assert.assertEquals(CreateOfficeFields.EndOptional, FinancialAwardsEndOptional);

			String FinancialAwardsEnd1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEnd1).getText();
			logger.info("FinancialAwardsEnd1 : " + FinancialAwardsEnd1);
			logger.info("FinancialAwardsEnd 1: " + CreateOfficeFields.FinancialAssistanceEnd);
			Assert.assertEquals(CreateOfficeFields.FinancialAssistanceEnd, FinancialAwardsEnd1);

			String FinancialAwardsEndMonth1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonth)
					.getText();
			logger.info("FinancialAwardsEndMonth : " + FinancialAwardsEndMonth1);
			logger.info("FinancialAwardsEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialAwardsEndMonth1);
			logger.info("FinancialAwardsEndMonth: " + FinancialAwardsEndMonth);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"month"));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("02");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonthText).sendKeys(Keys.TAB);
			// seriesOfActions3.sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		} else if (FinancialAwardsEndMonth != null && FinancialAwardsEndMonth.equalsIgnoreCase(x) && !(FinancialAwardsEndMonth.equalsIgnoreCase(S))) {
			logger.info("No select on FinancialAwardsEndMonth ");
		}else if (FinancialAwardsEndMonth != null &&  !(FinancialAwardsEndMonth.equalsIgnoreCase(x))  && (FinancialAwardsEndMonth.equalsIgnoreCase(S))) {
			String FinancialAwardsEndOptional = driver.findElement(CreateOfficeLocators.FinancialAwardsEndOptional)
					.getText();
			logger.info("FinancialAwardsEndOptional S: " + FinancialAwardsEndOptional);
			logger.info("FinancialAwardsEndOptional 1: " + CreateOfficeFields.EndOptional);
			Assert.assertEquals(CreateOfficeFields.EndOptional, FinancialAwardsEndOptional);

			String FinancialAwardsEnd1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEnd1).getText();
			logger.info("FinancialAwardsEnd1 : " + FinancialAwardsEnd1);
			logger.info("FinancialAwardsEnd 1: " + CreateOfficeFields.FinancialAssistanceEnd);
			Assert.assertEquals(CreateOfficeFields.FinancialAssistanceEnd, FinancialAwardsEnd1);

			String FinancialAwardsEndMonth1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonth)
					.getText();
			logger.info("FinancialAwardsEndMonth : " + FinancialAwardsEndMonth1);
			logger.info("FinancialAwardsEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialAwardsEndMonth1);
			logger.info("FinancialAwardsEndMonth: " + FinancialAwardsEndMonth);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys((DateClass.addOrSubDaysFromCurrentDate(5,"month")));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("02");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonthText).sendKeys(Keys.TAB);
		}  else {
			String FinancialAwardsEndOptional = driver.findElement(CreateOfficeLocators.FinancialAwardsEndOptional)
					.getText();
			logger.info("FinancialAwardsEndOptional : " + FinancialAwardsEndOptional);
			logger.info("FinancialAwardsEndOptional 1: " + CreateOfficeFields.EndOptional);
			Assert.assertEquals(CreateOfficeFields.EndOptional, FinancialAwardsEndOptional);

			String FinancialAwardsEnd1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEnd1).getText();
			logger.info("FinancialAwardsEnd1 : " + FinancialAwardsEnd1);
			logger.info("FinancialAwardsEnd 1: " + CreateOfficeFields.FinancialAssistanceEnd);
			Assert.assertEquals(CreateOfficeFields.FinancialAssistanceEnd, FinancialAwardsEnd1);

			String FinancialAwardsEndMonth1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonth)
					.getText();
			logger.info("FinancialAwardsEndMonth : " + FinancialAwardsEndMonth1);
			logger.info("FinancialAwardsEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, FinancialAwardsEndMonth1);
			logger.info("FinancialAwardsEndMonth: " + DateClass.getCurrentMonth());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys((DateClass.addOrSubDaysFromCurrentDate(1,"month")));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("02");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsEndMonthText).sendKeys(Keys.TAB);
			// seriesOfActions3.sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		}
	}

	@And("^The user enters Financial Awards end day ([^\"]*)$")
	public void The_user_enters_grants_office_end_day(String FinancialAwardsEndDay) throws Throwable {

		if (FinancialAwardsEndDay != null && !(FinancialAwardsEndDay.equalsIgnoreCase(x)) && !(FinancialAwardsEndDay.equalsIgnoreCase(S))
				&& FinancialAwardsEndDay.trim().length() != 0) {
			String FinancialAwardsEndDay1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndDay).getText();
			logger.info("FinancialFundingEndDay Null: " + FinancialAwardsEndDay1);
			logger.info("FinancialFundingEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialAwardsEndDay1);
			logger.info("FinancialAwardsEndDay: " + FinancialAwardsEndDay);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"day"));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("05");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsEndDayText).sendKeys(Keys.TAB);
		} else if (FinancialAwardsEndDay != null && FinancialAwardsEndDay.equalsIgnoreCase(x) && !(FinancialAwardsEndDay.equalsIgnoreCase(S))) {
			logger.info("No select on FinancialAwardsEndDay ");
		}else if (FinancialAwardsEndDay != null && !(FinancialAwardsEndDay.equalsIgnoreCase(x)) && (FinancialAwardsEndDay.equalsIgnoreCase(S))) {
			String FinancialAwardsEndDay1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndDay).getText();
			logger.info("FinancialFundingEndDay S: " + FinancialAwardsEndDay1);
			logger.info("FinancialFundingEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialAwardsEndDay1);
			logger.info("FinancialAwardsEndDay: " + FinancialAwardsEndDay);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(5,"day"));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("05");
			seriesOfActions3.perform();
			Thread.sleep(2000);
		}else {
			String FinancialAwardsEndDay1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndDay).getText();
			logger.info("FinancialFundingEndDay : " + FinancialAwardsEndDay1);
			logger.info("FinancialFundingEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, FinancialAwardsEndDay1);
			logger.info("FinancialAwardsEndDay:" + DateClass.getPreviousDay());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(1,"day"));
			// Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("05");
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsEndDayText).sendKeys(Keys.TAB);
		}

		logger.info("enters End day ", scenario);
	}

	@And("^The user enters Financial Awards end year ([^\"]*)$")
	public void The_user_enters_grants_office_end_year(String FinancialAwardsEndYear) throws Throwable {
		// driver.findElement(CreateOffice.grantsEndYear).sendKeys(grantsEndYear);

		/*
		 * String FinancialAwardsEndYear1 =
		 * driver.findElement(CreateOfficeLocators.FinancialAwardsEndYear).getText();
		 * logger.info("FinancialAwardsEndYear1 : " + FinancialAwardsEndYear1);
		 * logger.info("FinancialAwardsEndYear 1: " + CreateOfficeFields.Year);
		 * Assert.assertEquals(CreateOfficeFields.Year, FinancialAwardsEndYear1);
		 * 
		 * WebElement elt3 =
		 * driver.findElement(CreateOfficeLocators.FinancialAwardsEndYearText); Actions
		 * builder3 = new Actions(driver); Actions seriesOfActions3 =
		 * builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
		 * seriesOfActions3.perform(); Thread.sleep(2000);
		 * driver.findElement(CreateOfficeLocators.FinancialAwardsEndYearText).sendKeys(
		 * Keys.TAB); logger.info("enters End year ", scenario);
		 */
		if (FinancialAwardsEndYear != null && !(FinancialAwardsEndYear.equalsIgnoreCase(x))
				&& FinancialAwardsEndYear.trim().length() != 0) {
			String FinancialAwardsEndYear1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndYear).getText();
			logger.info("FinancialAwardsEndYear1 : " + FinancialAwardsEndYear1);
			logger.info("FinancialAwardsEndYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialAwardsEndYear1);
			logger.info("FinancialAwardsEndYear: " + FinancialAwardsEndYear);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(FinancialAwardsEndYear);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsEndYearText).sendKeys(Keys.TAB);
			logger.info("enters End year ", scenario);
		} else if (FinancialAwardsEndYear != null && FinancialAwardsEndYear.equalsIgnoreCase(x)) {
			logger.info("No select on FinancialAwardsEndYear ");
		} else {
			String FinancialAwardsEndYear1 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndYear).getText();
			logger.info("FinancialAwardsEndYear1 : " + FinancialAwardsEndYear1);
			logger.info("FinancialAwardsEndYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialAwardsEndYear1);
			logger.info("FinancialAwardsEndYear:" + DateClass.getCurrentYear());
			WebElement elt3 = driver.findElement(CreateOfficeLocators.FinancialAwardsEndYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.FinancialAwardsEndYearText).sendKeys(Keys.TAB);
			logger.info("enters End year ", scenario);
		}
	}

	@And("^The user select office type contract funding ([^\"]*)$")
	public void The_user_select_office_type_other(String contractfunding) {
		if (contractfunding != null && contractfunding.trim().length() != 0) {
			logger.info("Not select contract funding :" + contractfunding);

			logger.info("enters other ", scenario);
		} else {
			logger.info("contractfunding: " + contractfunding);
			String ContractFundingText = driver.findElement(CreateOfficeLocators.ContractFundingText).getText();
			logger.info("ContractFundingText : " + ContractFundingText);
			logger.info("ContractFundingText 1: " + CreateOfficeFields.ContractFunding);
			Assert.assertEquals(CreateOfficeFields.ContractFunding, ContractFundingText);

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

	@And("^The user enters other contract funding start month ([^\"]*)$")
	public void The_user_enters_other_office_start_month(String contractfundingstartMonth) throws Throwable {
		if (contractfundingstartMonth != null && !(contractfundingstartMonth.equalsIgnoreCase(x))
				&& contractfundingstartMonth.trim().length() != 0) {
			logger.info("contractfundingstartMonth Null : " + DateClass.addOrSubDaysFromCurrentDate(3,"month"));
			String ContractFundingStartMonth1 = driver.findElement(CreateOfficeLocators.ContractFundingStartMonth)
					.getText();
			logger.info("ContractFundingStartMonth : " + ContractFundingStartMonth1);
			logger.info("ContractFundingStartMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, ContractFundingStartMonth1);

			logger.info("DateClass.getCurrentMonth(): " + DateClass.getCurrentMonth());

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingStartMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(3,"month"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			// seriesOfActions3.sendKeys(Keys.TAB);
			driver.findElement(CreateOfficeLocators.ContractFundingStartMonthText).sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		} else if (contractfundingstartMonth != null && contractfundingstartMonth.equalsIgnoreCase(x)) {
			logger.info("No select on contractfundingstartMonth ");
		} else {
			logger.info("contractfundingstartMonth:*** " + DateClass.getCurrentMonth());
			String ContractFundingStartMonth1 = driver.findElement(CreateOfficeLocators.ContractFundingStartMonth)
					.getText();
			logger.info("ContractFundingStartMonth : " + ContractFundingStartMonth1);
			logger.info("ContractFundingStartMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, ContractFundingStartMonth1);

			logger.info("DateClass.getCurrentMonth(): " + DateClass.getCurrentMonth());

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingStartMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentMonth());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			// seriesOfActions3.sendKeys(Keys.TAB);
			driver.findElement(CreateOfficeLocators.ContractFundingStartMonthText).sendKeys(Keys.TAB);
			logger.info("enters start month ", scenario);
		}

	}

	@And("^The user enters other contract funding start day ([^\"]*)$")
	public void The_user_enters_other_office_start_day(String contractfundingstartDay) throws Throwable {
		if (contractfundingstartDay != null && !(contractfundingstartDay.equalsIgnoreCase(x))
				&& contractfundingstartDay.trim().length() != 0) {
			logger.info("contractfundingstartDay Null :" + DateClass.addOrSubDaysFromCurrentDate(3,"day"));
			String ContractFundingStartDay1 = driver.findElement(CreateOfficeLocators.ContractFundingStartDay)
					.getText();
			logger.info("ContractFundingStartDay : " + ContractFundingStartDay1);
			logger.info("ContractFundingStartDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractFundingStartDay1);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingStartDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(3,"day"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingStartDayText).sendKeys(Keys.TAB);
			logger.info("enters start day ", scenario);
		} else if (contractfundingstartDay != null && contractfundingstartDay.equalsIgnoreCase(x)) {
			logger.info("No select on contractfundingstartDay");
		} else {
			logger.info("contractfundingstartDay: " + DateClass.getCurrentDay());
			String ContractFundingStartDay1 = driver.findElement(CreateOfficeLocators.ContractFundingStartDay)
					.getText();
			logger.info("ContractFundingStartDay : " + ContractFundingStartDay1);
			logger.info("ContractFundingStartDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractFundingStartDay1);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingStartDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentDay());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingStartDayText).sendKeys(Keys.TAB);
			logger.info("enters start day ", scenario);
		}
	}

	@And("^The user enters other contract funding start year ([^\"]*)$")
	public void The_user_enters_other_office_start_year(String contractfundingstartYear) throws Throwable {

		if (contractfundingstartYear != null && !(contractfundingstartYear.equalsIgnoreCase(x))
				&& contractfundingstartYear.trim().length() != 0) {
			logger.info("contractfundingstartYear: " + contractfundingstartYear);
			String FinancialFundingStartYear = driver.findElement(CreateOfficeLocators.ContractFundingStartYear)
					.getText();
			logger.info("FinancialFundingStartDay : " + FinancialFundingStartYear);
			logger.info("FinancialFundingStartDay 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialFundingStartYear);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingStartYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(contractfundingstartYear);
			seriesOfActions3.sendKeys(Keys.TAB);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingStartYearText).sendKeys(Keys.TAB);
			logger.info("enters start year ", scenario);
		} else if (contractfundingstartYear != null && contractfundingstartYear.equalsIgnoreCase(x)) {
			logger.info("No select on contractfundingstartYear ");
		} else {
			logger.info("contractfundingstartYear: " + DateClass.getCurrentYear());
			String FinancialFundingStartYear = driver.findElement(CreateOfficeLocators.ContractFundingStartYear)
					.getText();
			logger.info("FinancialFundingStartDay : " + FinancialFundingStartYear);
			logger.info("FinancialFundingStartDay 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, FinancialFundingStartYear);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingStartYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
			seriesOfActions3.sendKeys(Keys.TAB);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingStartYearText).sendKeys(Keys.TAB);
			logger.info("enters start year ", scenario);
		}

	}

	@And("^The user enters other contract funding end month ([^\"]*)$")
	public void The_user_enter_other_office_end_month(String contractfundingEndMonth) throws Throwable {
		if (contractfundingEndMonth != null && !(contractfundingEndMonth.equalsIgnoreCase(x)) && !(contractfundingEndMonth.equalsIgnoreCase(S))
				&& contractfundingEndMonth.trim().length() != 0) {
			logger.info("contractfundingEndMonth  Null: " + contractfundingEndMonth);
			String ContractFundingEndOptional = driver.findElement(CreateOfficeLocators.ContractFundingEndOptional)
					.getText();
			logger.info("ContractFundingEndOptional : " + ContractFundingEndOptional);
			logger.info("ContractFundingEndOptional 1: " + CreateOfficeFields.EndOptional);
			Assert.assertEquals(CreateOfficeFields.EndOptional, ContractFundingEndOptional);

			String ContractFundingEnd1 = driver.findElement(CreateOfficeLocators.ContractFundingEnd1).getText();
			logger.info("ContractFundingEnd1 : " + ContractFundingEnd1);
			logger.info("ContractFundingEnd1 1: " + CreateOfficeFields.ContractFundingEnd);
			Assert.assertEquals(CreateOfficeFields.ContractFundingEnd, ContractFundingEnd1);

			String ContractFundingEndMonth = driver.findElement(CreateOfficeLocators.ContractFundingEndMonth).getText();
			logger.info("ContractFundingEndMonth : " + ContractFundingEndMonth);
			logger.info("ContractFundingEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, ContractFundingEndMonth);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"month"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingEndMonthText).sendKeys(Keys.TAB);
		} else if (contractfundingEndMonth != null && contractfundingEndMonth.equalsIgnoreCase(x) && !(contractfundingEndMonth.equalsIgnoreCase(S))) {
			logger.info("No select on contractfundingEndMonth ");
		}  else if (contractfundingEndMonth != null && !(contractfundingEndMonth.equalsIgnoreCase(x)) && (contractfundingEndMonth.equalsIgnoreCase(S))) {
			logger.info("contractfundingEndMonth S: " + contractfundingEndMonth);
			String ContractFundingEndOptional = driver.findElement(CreateOfficeLocators.ContractFundingEndOptional)
					.getText();
			logger.info("ContractFundingEndOptional : " + ContractFundingEndOptional);
			logger.info("ContractFundingEndOptional 1: " + CreateOfficeFields.EndOptional);
			Assert.assertEquals(CreateOfficeFields.EndOptional, ContractFundingEndOptional);

			String ContractFundingEnd1 = driver.findElement(CreateOfficeLocators.ContractFundingEnd1).getText();
			logger.info("ContractFundingEnd1 : " + ContractFundingEnd1);
			logger.info("ContractFundingEnd1 1: " + CreateOfficeFields.ContractFundingEnd);
			Assert.assertEquals(CreateOfficeFields.ContractFundingEnd, ContractFundingEnd1);

			String ContractFundingEndMonth = driver.findElement(CreateOfficeLocators.ContractFundingEndMonth).getText();
			logger.info("ContractFundingEndMonth : " + ContractFundingEndMonth);
			logger.info("ContractFundingEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, ContractFundingEndMonth);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys((DateClass.addOrSubDaysFromCurrentDate(5,"month")));
			seriesOfActions3.perform();
			Thread.sleep(2000);
		} else {
			logger.info("contractfundingEndMonth : " + DateClass.getCurrentMonth());
			String ContractFundingEndOptional = driver.findElement(CreateOfficeLocators.ContractFundingEndOptional)
					.getText();
			logger.info("ContractFundingEndOptional : " + ContractFundingEndOptional);
			logger.info("ContractFundingEndOptional 1: " + CreateOfficeFields.EndOptional);
			Assert.assertEquals(CreateOfficeFields.EndOptional, ContractFundingEndOptional);

			String ContractFundingEnd1 = driver.findElement(CreateOfficeLocators.ContractFundingEnd1).getText();
			logger.info("ContractFundingEnd1 : " + ContractFundingEnd1);
			logger.info("ContractFundingEnd1 1: " + CreateOfficeFields.ContractFundingEnd);
			Assert.assertEquals(CreateOfficeFields.ContractFundingEnd, ContractFundingEnd1);

			String ContractFundingEndMonth = driver.findElement(CreateOfficeLocators.ContractFundingEndMonth).getText();
			logger.info("ContractFundingEndMonth : " + ContractFundingEndMonth);
			logger.info("ContractFundingEndMonth 1: " + CreateOfficeFields.Month);
			Assert.assertEquals(CreateOfficeFields.Month, ContractFundingEndMonth);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingEndMonthText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys((DateClass.addOrSubDaysFromCurrentDate(1,"month")));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingEndMonthText).sendKeys(Keys.TAB);
		}

		logger.info("enters start month ", scenario);
	}

	@And("^The user enters other contract funding end day ([^\"]*)$")
	public void The_user_enters_other_office_end_day(String contractfundingEndDay) throws Throwable {
		if (contractfundingEndDay != null && !(contractfundingEndDay.equalsIgnoreCase(x)) && !(contractfundingEndDay.equalsIgnoreCase (S))
				&& contractfundingEndDay.trim().length() != 0) {
			logger.info("contractfundingEndDay: " + contractfundingEndDay);
			String ContractFundingEndDay1 = driver.findElement(CreateOfficeLocators.ContractFundingEndDay).getText();
			logger.info("ContractFundingEndDay : " + ContractFundingEndDay1);
			logger.info("ContractFundingEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractFundingEndDay1);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(-1,"day"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingEndDayText).sendKeys(Keys.TAB);
			logger.info("enters End day ", scenario);

		} else if (contractfundingEndDay != null && contractfundingEndDay.equalsIgnoreCase(x) && !(contractfundingEndDay.equalsIgnoreCase (S))) {
			logger.info("No select on contractfundingEndDay ");
		}else if (contractfundingEndDay != null && !( contractfundingEndDay.equalsIgnoreCase(x)) && (contractfundingEndDay.equalsIgnoreCase (S))) {
			logger.info("contractfundingEndDay: " + contractfundingEndDay);
			String ContractFundingEndDay1 = driver.findElement(CreateOfficeLocators.ContractFundingEndDay).getText();
			logger.info("ContractFundingEndDay : " + ContractFundingEndDay1);
			logger.info("ContractFundingEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractFundingEndDay1);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(5,"day"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingEndDayText).sendKeys(Keys.TAB);
			logger.info("enters End day ", scenario);
		} else {
			logger.info("contractfundingEndDay" + DateClass.getPreviousDay());
			String ContractFundingEndDay1 = driver.findElement(CreateOfficeLocators.ContractFundingEndDay).getText();
			logger.info("ContractFundingEndDay : " + ContractFundingEndDay1);
			logger.info("ContractFundingEndDay 1: " + CreateOfficeFields.Day);
			Assert.assertEquals(CreateOfficeFields.Day, ContractFundingEndDay1);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingEndDayText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.addOrSubDaysFromCurrentDate(1,"day"));
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingEndDayText).sendKeys(Keys.TAB);
			logger.info("enters End day ", scenario);
		}
	}

	@And("^The user enters other contract funding end year ([^\"]*)$")
	public void The_user_enters_other_office_end_year(String contractfundingEndYear) throws Throwable {
		if (contractfundingEndYear != null && !(contractfundingEndYear.equalsIgnoreCase(x))
				&& contractfundingEndYear.trim().length() != 0) {
			logger.info("contractfundingEndYear:" + contractfundingEndYear);
			String ContractFundingEndYear1 = driver.findElement(CreateOfficeLocators.ContractFundingEndYear).getText();
			logger.info("ContractFundingEndYear : " + ContractFundingEndYear1);
			logger.info("ContractFundingEndYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, ContractFundingEndYear1);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingEndYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(contractfundingEndYear);
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingEndYearText).sendKeys(Keys.TAB);
			logger.info("enters End year ", scenario);
		} else if (contractfundingEndYear != null && contractfundingEndYear.equalsIgnoreCase(x)) {
			logger.info("No select on contractfundingEndYear ");
		} else {
			logger.info("contractfundingEndYear: " + DateClass.getCurrentYear());
			String ContractFundingEndYear1 = driver.findElement(CreateOfficeLocators.ContractFundingEndYear).getText();
			logger.info("ContractFundingEndYear : " + ContractFundingEndYear1);
			logger.info("ContractFundingEndYear 1: " + CreateOfficeFields.Year);
			Assert.assertEquals(CreateOfficeFields.Year, ContractFundingEndYear1);

			WebElement elt3 = driver.findElement(CreateOfficeLocators.ContractFundingEndYearText);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(DateClass.getCurrentYear());
			seriesOfActions3.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.ContractFundingEndYearText).sendKeys(Keys.TAB);
			logger.info("enters End year ", scenario);
		}
	}

	@And("^The user enters street address ([^\"]*)$")
	public void The_user_enters_street_address(String address) {

		if (address != null && address.trim().length() != 0) {
			logger.info("address: " + address);
			String OfficeAddress = driver.findElement(CreateOfficeLocators.OfficeAddress).getText();
			logger.info("OfficeAddress : " + OfficeAddress);
			logger.info("OfficeAddress 1: " + CreateOfficeFields.OfficeAddress);
			Assert.assertEquals(CreateOfficeFields.OfficeAddress, OfficeAddress);

			String MailingAddress = driver.findElement(CreateOfficeLocators.MailingAddress).getText();
			String str = MailingAddress.replace("\n", " ");
			logger.info("MailingAddress : " + str);
			logger.info("MailingAddress 1: " + CreateOfficeFields.TAC1);
			logger.info("Str========" + str);
			Assert.assertTrue(str.contains(CreateOfficeFields.TAC1));

			String MailingRequired = driver.findElement(CreateOfficeLocators.MailingRequired).getText();
			logger.info("Required : " + MailingRequired);
			logger.info("Required 1: " + CreateOfficeFields.Required);
			Assert.assertEquals(CreateOfficeFields.Required, MailingRequired);

			String TAC1Street1 = driver.findElement(CreateOfficeLocators.TAC1Street1).getText();
			logger.info("TAC1Street : " + TAC1Street1);
			logger.info("TAC1Street 1: " + CreateOfficeFields.StreetAddress1);
			Assert.assertEquals(CreateOfficeFields.OfficeAddress, OfficeAddress);
			StreetAddress1 = address;
			driver.findElement(CreateOfficeLocators.TAC1Street1TextBox).sendKeys(StreetAddress1);
			logger.info("enters officeStreet ", scenario);
		} else {
			logger.info("address :" + "123 Lee Way");
			String OfficeAddress = driver.findElement(CreateOfficeLocators.OfficeAddress).getText();
			logger.info("OfficeAddress : " + OfficeAddress);
			logger.info("OfficeAddress 1: " + CreateOfficeFields.OfficeAddress);
			Assert.assertEquals(CreateOfficeFields.OfficeAddress, OfficeAddress);

			String MailingAddress = driver.findElement(CreateOfficeLocators.MailingAddress).getText();
			String str = MailingAddress.replace("\n", " ");
			logger.info("MailingAddress : " + str);
			logger.info("MailingAddress 1: " + CreateOfficeFields.TAC1);
			logger.info("Str========" + str);
			Assert.assertTrue(str.contains(CreateOfficeFields.TAC1));

			String MailingRequired = driver.findElement(CreateOfficeLocators.MailingRequired).getText();
			logger.info("Required : " + MailingRequired);
			logger.info("Required 1: " + CreateOfficeFields.Required);
			Assert.assertEquals(CreateOfficeFields.Required, MailingRequired);

			String TAC1Street1 = driver.findElement(CreateOfficeLocators.TAC1Street1).getText();
			logger.info("TAC1Street : " + TAC1Street1);
			logger.info("TAC1Street 1: " + CreateOfficeFields.StreetAddress1);
			Assert.assertEquals(CreateOfficeFields.OfficeAddress, OfficeAddress);
			StreetAddress1 = "123 Lee Way";
			driver.findElement(CreateOfficeLocators.TAC1Street1TextBox).sendKeys(StreetAddress1);
			logger.info("enters officeStreet ", scenario);
		}
	}

	@And("^The user enters country ([^\"]*)$")
	public void The_user_enters_country(String country) throws Throwable {
		if (country != null && country.trim().length() != 0) {
			logger.info("country:" + country);
			String Country = driver.findElement(CreateOfficeLocators.Country).getText();
			logger.info("Country : " + Country);
			logger.info("Country 1: " + CreateOfficeFields.Country);
			Assert.assertEquals(CreateOfficeFields.Country, Country);
			logger.info("country:" + country);
			Boolean val = driver.findElement(CreateOfficeLocators.CountryTextBox).isDisplayed();
			logger.info("Boolean::" + val);
			driver.findElement(CreateOfficeLocators.CountryTextBox).sendKeys(country);
			Thread.sleep(1000);
			WebElement elt = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.CountryTextBox).sendKeys(Keys.TAB);
			logger.info("enters country ", scenario);

		} else {
			logger.info("country: " + "USA");
			String Country = driver.findElement(CreateOfficeLocators.Country).getText();
			logger.info("Country : " + Country);
			logger.info("Country 1: " + CreateOfficeFields.Country);
			Assert.assertEquals(CreateOfficeFields.Country, Country);
			logger.info("country:" + country);
			Boolean val = driver.findElement(CreateOfficeLocators.CountryTextBox).isDisplayed();
			logger.info("Boolean::" + val);
			driver.findElement(CreateOfficeLocators.CountryTextBox).sendKeys("USA");
			Thread.sleep(1000);
			WebElement elt = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.CountryTextBox).sendKeys(Keys.TAB);
			logger.info("enters country ", scenario);

		}
	}

	@And("^The enters zip ([^\"]*)$")
	public void The_enters_zip(String Zip) throws Throwable {
		if (Zip != null && Zip.trim().length() != 0) {
			logger.info("Zip: " + Zip);
			String Zip1 = driver.findElement(CreateOfficeLocators.Zip).getText();
			logger.info("Zip : " + Zip1);
			logger.info("Zip 1: " + CreateOfficeFields.Zip);
			Assert.assertEquals(CreateOfficeFields.Zip, Zip1);
			driver.findElement(CreateOfficeLocators.ZipTextBox).sendKeys(Zip);
			Thread.sleep(2000);
			logger.info("enters officeZip ", scenario);
		} else {
			logger.info("Zip: " + "36310");
			String Zip1 = driver.findElement(CreateOfficeLocators.Zip).getText();
			logger.info("Zip : " + Zip1);
			logger.info("Zip 1: " + CreateOfficeFields.Zip);
			Assert.assertEquals(CreateOfficeFields.Zip, Zip1);
			driver.findElement(CreateOfficeLocators.ZipTextBox).sendKeys("36310");
			Thread.sleep(2000);
			logger.info("enters officeZip ", scenario);
		}
	}

	@And("^The enters city ([^\"]*)$")
	public void The_enters_city(String officeCity) throws Throwable {
		logger.info("city:" + officeCity);
		String City = driver.findElement(CreateOfficeLocators.City).getText();
		logger.info("City : " + City);
		logger.info("City 1: " + CreateOfficeFields.City);
		Assert.assertEquals(CreateOfficeFields.City, City);
		Thread.sleep(2000);
		Boolean test = driver.findElement(CreateOfficeLocators.CityTextBox).isDisplayed();
		logger.info("City1234: ", test);
		driver.findElement(CreateOfficeLocators.CityTextBox).click();
		Thread.sleep(2000);
		Boolean test2 = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results\"]/li")).isDisplayed();		
		logger.info("City:::::::::::::::::::::::::::: ", test2);
		Thread.sleep(2000);
    	WebElement elt = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results\"]/li"));

		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		logger.info("enters officeCity ", scenario);
	}

	@And("^The enters state ([^\"]*)$")
	public void The_enters_state(String state) throws Throwable {

		logger.info("State:" + state);
		String State = driver.findElement(CreateOfficeLocators.State).getText();
		logger.info("State : " + State);
		logger.info("State 1: " + CreateOfficeFields.State);
		Assert.assertEquals(CreateOfficeFields.State, State);
		logger.info("enters officeState ", scenario);
	}

	@Then("The user click on submit create office button")
	public void The_user_click_on_submit_create_office_button() throws Throwable {

		WebElement elt3 = driver.findElement(CreateOfficeLocators.OfficeConfirm2);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
         Thread.sleep(3);
	}

	@Then("^The user click on Confirmation create office button$")
	public void The_user_click_on_Confirmation_create_office_button() throws Throwable {

		System.out.println("Sumit button on Reuest office page::::::::::::::::::::::::::::::::::::");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String FEDERALHIERARCHY = driver.findElement(CreateOfficeLocators.FEDERALHIERARCHY).getText();
		logger.info("FEDERALHIERARCHY : " + FEDERALHIERARCHY);
		logger.info("FEDERALHIERARCHY 1: " + CreateOfficeFields.CreateDept2);
		Assert.assertEquals(CreateOfficeFields.CreateDept2, FEDERALHIERARCHY);
		Thread.sleep(8000);
		String ConfirmBelowDetails = driver.findElement(CreateOfficeLocators.ConfirmBelowDetails).getText();
		logger.info("ConfirmBelowDetails : " + ConfirmBelowDetails);
		logger.info("ConfirmBelowDetails 1: " + CreateOfficeFields.ConfirmBelowDetails);
		Assert.assertEquals(CreateOfficeFields.ConfirmBelowDetails, ConfirmBelowDetails);

		String OfficeDetail = driver.findElement(CreateOfficeLocators.OfficeDetail).getText();
		logger.info("OfficeDetail : " + OfficeDetail);
		logger.info("OfficeDetail 1: " + CreateOfficeFields.OfficeDetails);
		Assert.assertEquals(CreateOfficeFields.OfficeDetails, OfficeDetail);
		Thread.sleep(8000);
		String OfficeName12 = driver.findElement(CreateOfficeLocators.OfficeName1).getText();
		logger.info("OfficeName : " + OfficeName12);
		logger.info("OfficeName 1: " + CreateOfficeFields.OfficeName1);
		Assert.assertEquals(CreateOfficeFields.OfficeName1, OfficeName12);

		String OfficeNameText1 = driver.findElement(CreateOfficeLocators.OfficeNameText1).getText();
		logger.info("OfficeNameText : " + OfficeNameText1);
		logger.info("OfficeNameText 1: " + OfficeName1);
		Assert.assertEquals(OfficeName1, OfficeNameText1);
		Thread.sleep(8000);
		String DeptIndAgency12 = driver.findElement(CreateOfficeLocators.DeptIndAgency1).getText();
		logger.info("DeptIndAgency : " + DeptIndAgency12);
		String str = DeptIndAgency12.replace("\n", " ");
		logger.info("DeptIndAgency1: " + CreateOfficeFields.DeptIndAgency);
		Assert.assertTrue(str.contains(CreateOfficeFields.DeptIndAgency));
		// Assert.assertEquals(CreateOfficeFields.DeptIndAgency, DeptIndAgency12);
		Thread.sleep(8000);
		String DeptIndAgencyText1 = driver.findElement(CreateOfficeLocators.DeptIndAgencyText1).getText();
		logger.info("DeptIndAgencyText : " + DeptIndAgencyText1);
		// String str = DeptIndAgency12.replace("\n", " ");
		logger.info("DeptIndAgencyText1: " + DeptIndAgency1);
		Assert.assertEquals(DeptIndAgency1, DeptIndAgencyText1);
		Thread.sleep(8000);
		String CGAC12 = driver.findElement(CreateOfficeLocators.CGAC1).getText();
		logger.info("CGAC : " + CGAC12);
		logger.info("CGAC1: " + CreateOfficeFields.CGAC1);
		Assert.assertEquals(CreateOfficeFields.CGAC1, CGAC12);

		String CGACText1 = driver.findElement(CreateOfficeLocators.CGACText1).getText();
		logger.info("CGACText : " + CGACText1);
		logger.info("CGACText1: " + CGAC1);
		Assert.assertEquals(CGAC1, CGACText1);

		String SubTier12 = driver.findElement(CreateOfficeLocators.SubTier1).getText();
		logger.info("SubTier : " + SubTier12);
		logger.info("SubTier 1: " + CreateOfficeFields.SubTier1);
		Assert.assertEquals(CreateOfficeFields.SubTier1, SubTier12);

		String SubTierText12 = driver.findElement(CreateOfficeLocators.SubTierText1).getText();
		logger.info("SubTierText : " + SubTierText12);
		logger.info("SubTierText 1: " + SubTier1);
		Assert.assertEquals(SubTier1, SubTierText12);

		String AgencyCode12 = driver.findElement(CreateOfficeLocators.AgencyCode1).getText();
		logger.info("AgencyCode : " + AgencyCode12);
		logger.info("AgencyCode 1: " + CreateOfficeFields.AgencyCode1);
		Assert.assertEquals(CreateOfficeFields.AgencyCode1, AgencyCode12);

		String AgencyCodeText1 = driver.findElement(CreateOfficeLocators.AgencyCodeText1).getText();
		logger.info("AgencyCodeText : " + AgencyCodeText1);
		logger.info("AgencyCodeText 1: " + AgencyCode1);
		// Assert.assertEquals(AgencyCode1, AgencyCodeText1);

		String StartDate12 = driver.findElement(CreateOfficeLocators.StartDate).getText();
		logger.info("StartDate : " + StartDate12);
		logger.info("StartDate 1: " + CreateOfficeFields.StartDate);
		Assert.assertEquals(CreateOfficeFields.StartDate, StartDate12);

		String StartDateText = driver.findElement(CreateOfficeLocators.StartDateText).getText();
		logger.info("StartDate : " + StartDateText);
		Thread.sleep(8000);
		String EndDate12 = driver.findElement(CreateOfficeLocators.EndDate).getText();
		logger.info("EndDate : " + EndDate12);
		logger.info("EndDate1: " + CreateOfficeFields.EndDate);
		Assert.assertEquals(CreateOfficeFields.EndDate, EndDate12);

		String EndDateText = driver.findElement(CreateOfficeLocators.EndDateText).getText();
		logger.info("EndDateText : " + EndDateText);

		String Shortname12 = driver.findElement(CreateOfficeLocators.Shortname1).getText();
		logger.info("Shortname : " + Shortname12);
		logger.info("Shortname 1: " + CreateOfficeFields.Shortname);
		Assert.assertEquals(CreateOfficeFields.Shortname, Shortname12);

		Thread.sleep(8000);
		String ShortnameText1 = driver.findElement(CreateOfficeLocators.ShortnameText1).getText();
		logger.info("ShortnameText : " + ShortnameText1);
		logger.info("ShortnameText 1: " + OfficeShortName1);
		
		if(OfficeShortName1 ==null) {
			logger.info("ShortnameText1 is null");
		}else {
			Assert.assertEquals(OfficeShortName1, ShortnameText1);	
		}

		String OfficeRegion12 = driver.findElement(CreateOfficeLocators.OfficeRegion).getText();
		logger.info("OfficeRegion : " + OfficeRegion12);
		logger.info("OfficeRegion 1: " + CreateOfficeFields.OfficeRegion1);
		Assert.assertEquals(CreateOfficeFields.OfficeRegion1, OfficeRegion12);
		Thread.sleep(8000);
		String OfficeRegionText = driver.findElement(CreateOfficeLocators.OfficeRegionText).getText();
		logger.info("OfficeRegionText : " + OfficeRegionText);
		logger.info("OfficeRegionText 1: " + OfficeRegion3);
		
		if(OfficeRegion3 == null) {
			logger.info("OfficeRegionText is null");
		}else {
			Assert.assertEquals(OfficeRegion3, OfficeRegionText);	
		}
		// WebDriverWait wait = new WebDriverWait(drv,30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.OfficeAAC));
		String OfficeAAC = driver.findElement(CreateOfficeLocators.OfficeAAC).getText();
		logger.info("OfficeAAC : " + OfficeAAC);
		logger.info("OfficeAAC 1: " + CreateOfficeFields.OfficeAAC);
		Assert.assertEquals(CreateOfficeFields.OfficeAAC, OfficeAAC);

		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.OfficeAACText));
		String OfficeAACText = driver.findElement(CreateOfficeLocators.OfficeAACText).getText();
		logger.info("OfficeAACText : " + OfficeAACText);
		logger.info("OfficeAACText 1: " + OfficeActivity1);
		
		if(OfficeActivity1 == null) {
			logger.info("OfficeAACText is null");
		}else {
			Assert.assertEquals(OfficeActivity1, OfficeAACText);	
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.RequestorName));
		String RequestorName = driver.findElement(CreateOfficeLocators.RequestorName).getText();
		logger.info("RequestorName : " + RequestorName);
		logger.info("RequestorName 1: " + CreateOfficeFields.RequestorName1);
		Assert.assertEquals(CreateOfficeFields.RequestorName1, RequestorName);

		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.RequestorNameText));
		String RequestorNameText = driver.findElement(CreateOfficeLocators.RequestorNameText).getText();
		logger.info("RequestorNameText : " + RequestorNameText);
		logger.info("RequestorNameText 1: " + RequestorName1);	
		if(RequestorName1 == null) {
			logger.info("RequestorName1 is null");
		}else {
			Assert.assertEquals(RequestorName1, RequestorNameText);	
		}
		
		String RequestorEmail = driver.findElement(CreateOfficeLocators.RequestorEmail).getText();
		logger.info("RequestorEmail : " + RequestorEmail);
		logger.info("RequestorEmail 1: " + CreateOfficeFields.RequestorEmail1);
		Assert.assertEquals(CreateOfficeFields.RequestorEmail1, RequestorEmail);

		String RequestorEmailText = driver.findElement(CreateOfficeLocators.RequestorEmailText).getText();
		logger.info("RequestorEmailText : " + RequestorEmailText);
		logger.info("RequestorEmailText 1: " + RequestorEmail1);

		if(RequestorEmail1 == null) {
			logger.info("RequestorEmail1 is null");
		}else {
			Assert.assertEquals(RequestorEmail1, RequestorEmailText);
		}

		String RequestorPhoneNumber = driver.findElement(CreateOfficeLocators.RequestorPhoneNumber).getText();
		logger.info("RequestorPhoneNumber : " + RequestorPhoneNumber);
		logger.info("RequestorPhoneNumber 1: " + CreateOfficeFields.RequestorPhone1);
		Assert.assertEquals(CreateOfficeFields.RequestorPhone1, RequestorPhoneNumber);

		String RequestorPhoneNumberText = driver.findElement(CreateOfficeLocators.RequestorPhoneNumberText).getText();
		logger.info("RequestorPhoneNumberText : " + RequestorPhoneNumberText);
		logger.info("RequestorPhoneNumberText 1: " + RequestorPhone1);
		
		if(RequestorPhone1 == null) {
			logger.info("RequestorPhone1 is null");
		}else {
			Assert.assertEquals(RequestorPhone1, RequestorPhoneNumberText);
		}

		String POCName12 = driver.findElement(CreateOfficeLocators.POCName1).getText();
		logger.info("POCName : " + POCName12);
		logger.info("POCName 1: " + CreateOfficeFields.POCName1);
		Assert.assertEquals(CreateOfficeFields.POCName1, POCName12);

		String POCNameText = driver.findElement(CreateOfficeLocators.POCNameText).getText();
		logger.info("POCNameText : " + POCNameText);
		logger.info("POCNameText 1: " + POCName1);

		if(POCName1 == null) {
			logger.info("POCName1 is null");
		}else {
			Assert.assertEquals(POCName1, POCNameText);
		}

		String POCEmail12 = driver.findElement(CreateOfficeLocators.POCEmail1).getText();
		logger.info("POCEmail : " + POCEmail12);
		logger.info("POCEmail 1: " + CreateOfficeFields.POCEmail1);
		Assert.assertEquals(CreateOfficeFields.POCEmail1, POCEmail12);

		String POCEmailText = driver.findElement(CreateOfficeLocators.POCEmailText).getText();
		logger.info("POCEmailText : " + POCEmailText);
		logger.info("POCEmailText 1: " + POCEmail1);
		
		if(POCEmail1 == null) {
			logger.info("POCEmail1 is null");
		}else {
			Assert.assertEquals(POCEmail1, POCEmailText);
		}

		String POCPhoneNumber12 = driver.findElement(CreateOfficeLocators.POCPhoneNumber1).getText();
		logger.info("POCPhoneNumber : " + POCPhoneNumber12);
		logger.info("POCPhoneNumber 1: " + CreateOfficeFields.POCPhoneNumber);
		Assert.assertEquals(CreateOfficeFields.POCPhoneNumber, POCPhoneNumber12);
		
		String POCPhoneNumberText = driver.findElement(CreateOfficeLocators.POCPhoneNumberText).getText();
		logger.info("POCPhoneNumberText : " + POCPhoneNumberText);
		logger.info("POCPhoneNumberText 1: " + POCNumber1);

		
		if(POCNumber1 == null) {
			logger.info("POCNumber1 is null");
		}else {
			Assert.assertEquals(POCNumber1, POCPhoneNumberText);
		}

		String OfficeTypes1 = driver.findElement(CreateOfficeLocators.OfficeTypes1).getText();
		logger.info("OfficeTypes1 : " + OfficeTypes1);
		logger.info("OfficeTypes 1: " + CreateOfficeFields.OfficeTypes1);
		Assert.assertEquals(CreateOfficeFields.OfficeTypes1, OfficeTypes1);

		String Types = driver.findElement(CreateOfficeLocators.Types).getText();
		logger.info("Types : " + Types);
		logger.info("Types 1: " + CreateOfficeFields.Types);
		Assert.assertEquals(CreateOfficeFields.Types, Types);

		String StartDate1 = driver.findElement(CreateOfficeLocators.StartDate1).getText();
		logger.info("StartDate : " + StartDate1);
		logger.info("StartDate 1: " + CreateOfficeFields.StartDate2);
		Assert.assertEquals(CreateOfficeFields.StartDate2, StartDate1);

		String EndDate1 = driver.findElement(CreateOfficeLocators.EndDate1).getText();
		logger.info("EndDate : " + EndDate1);
		logger.info("EndDate 1: " + CreateOfficeFields.EndDate2);
		Assert.assertEquals(CreateOfficeFields.EndDate2, EndDate1);

		String Status = driver.findElement(CreateOfficeLocators.Status).getText();
		logger.info("Status : " + Status);
		logger.info("Status 1: " + CreateOfficeFields.Status);
		Assert.assertEquals(CreateOfficeFields.Status, Status);
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractAwards));
			//Boolean str2 = driver.findElement(CreateOfficeLocators.ContractAwards).isDisplayed();
			String ContractAwards = driver.findElement(CreateOfficeLocators.ContractAwards).getText();
			Thread.sleep(2000);
			logger.info("ContractAwards : " + ContractAwards);
			logger.info("ContractAwards 1: " + CreateOfficeFields.ContractAwards);
			Assert.assertEquals(CreateOfficeFields.ContractAwards, ContractAwards);
			Thread.sleep(2000);	
			}
			catch (Exception e) {logger.info("ContractAwards is not select ");}
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceAwards));
			Boolean str3 = driver.findElement(CreateOfficeLocators.FinancialAssistanceAwards).isDisplayed();
			logger.info("FinancialAssistanceAwards: "+str3);
			String FinancialAssistanceAwards = driver.findElement(CreateOfficeLocators.FinancialAssistanceAwards).getText();
			logger.info("FinancialAssistanceAwards : " + FinancialAssistanceAwards);
			logger.info("FinancialAssistanceAwards 1: " + CreateOfficeFields.FinancialAssistanceAwards);
			Assert.assertEquals(CreateOfficeFields.FinancialAssistanceAwards, FinancialAssistanceAwards);
			Thread.sleep(2000);	
			}
			catch (Exception e) {logger.info("FinancialAssistanceAwards is not select ");}
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractFunding1));
			Boolean str4 = driver.findElement(CreateOfficeLocators.ContractFunding1).isDisplayed();
			logger.info("ContractFunding1: "+str4);
			String ContractFunding1 = driver.findElement(CreateOfficeLocators.ContractFunding1).getText();
			logger.info("ContractFunding : " + ContractFunding1);
			logger.info("ContractFunding 1: " + CreateOfficeFields.ContractFunding);
			Assert.assertEquals(CreateOfficeFields.ContractFunding, ContractFunding1);
			Thread.sleep(2000);
			}
			catch (WebDriverException e) {logger.info("ContractFunding is not select");}
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceFunding));
			Boolean str5 = driver.findElement(CreateOfficeLocators.FinancialAssistanceFunding).isDisplayed();
			logger.info("FinancialAssistanceFunding: "+str5);
			String FinancialAssistanceFunding = driver.findElement(CreateOfficeLocators.FinancialAssistanceFunding)
					.getText();
			logger.info("FinancialAssistanceFunding : " + FinancialAssistanceFunding);
			logger.info("FinancialAssistanceFunding 1: " + CreateOfficeFields.FinancialAssistanceFunding);
			Assert.assertEquals(CreateOfficeFields.FinancialAssistanceFunding, FinancialAssistanceFunding);
			Thread.sleep(8000);
			Thread.sleep(2000);
			}
			catch (WebDriverException e) {logger.info("FinancialAssistanceFunding is not select ");}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.OfficeAddresses));
		String OfficeAddresses = driver.findElement(CreateOfficeLocators.OfficeAddresses).getText();
		logger.info("OfficeAddresses : " + OfficeAddresses);
		logger.info("OfficeAddresses 1: " + CreateOfficeFields.OfficeAddresses);
		Assert.assertEquals(CreateOfficeFields.OfficeAddresses, OfficeAddresses);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.MailingAddressTAC12));
		String MailingAddressTAC12 = driver.findElement(CreateOfficeLocators.MailingAddressTAC12).getText();
		logger.info("MailingAddressTAC12 : " + MailingAddressTAC12);
		logger.info("MailingAddressTAC12 1: " + CreateOfficeFields.MailingAddrss);
		Assert.assertEquals(CreateOfficeFields.MailingAddrss, MailingAddressTAC12);
		Thread.sleep(5000);
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ShippingAddressTAC9));
			Boolean str6 = driver.findElement(CreateOfficeLocators.ShippingAddressTAC9).isDisplayed();
			logger.info("ShippingAddressTAC: "+str6);
			String ShippingAddressTAC = driver.findElement(CreateOfficeLocators.ShippingAddressTAC9).getText();
			logger.info("ShippingAddressTAC : " + ShippingAddressTAC);
			logger.info("ShippingAddressTAC 1: " + CreateOfficeFields.ShippingAddress);
			Assert.assertEquals(CreateOfficeFields.ShippingAddress, ShippingAddressTAC);
			Thread.sleep(5000);
			}
			catch (WebDriverException e) {logger.info("ShippingAddress is not select ");}
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.BillingAddressTAC9));
			Boolean str7 = driver.findElement(CreateOfficeLocators.BillingAddressTAC9).isDisplayed();
			logger.info("BillingAddressTAC: "+str7);
			String BillingAddressTAC = driver.findElement(CreateOfficeLocators.BillingAddressTAC9).getText();
			logger.info("BillingAddressTAC : " + BillingAddressTAC);
			logger.info("BillingAddressTAC 1: " + CreateOfficeFields.BillingAddress1);
			Assert.assertEquals(CreateOfficeFields.BillingAddress1, BillingAddressTAC);
			Thread.sleep(8000);
			}
			catch (WebDriverException e) {logger.info("BillingAddressTAC is not select ");}
	}

	@And("^Click on close button on office Request page$")
	public void Click_on_close_button_on_office_Request_page() throws Throwable {
		// wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.OfficeSubmit));
		WebElement elt14 = driver.findElement(CreateOfficeLocators.OfficeSubmit);
		Actions builder14 = new Actions(driver);
		Actions seriesOfActions14 = builder14.moveToElement(elt14).click();
		seriesOfActions14.perform();
		logger.info("Click on Buttom ", scenario);
		Thread.sleep(8000);

		Thread.sleep(3000);
		String FHOfficeRequest = driver.findElement(CreateOfficeLocators.FHOfficeRequest).getText();
		logger.info("FHOfficeRequest : " + FHOfficeRequest);
		logger.info("FHOfficeRequest 1: " + CreateOfficeFields.CreateDept2);
		// Assert.assertEquals(CreateOfficeFields.CreateDept2, FHOfficeRequest);

		String Success = driver.findElement(CreateOfficeLocators.Success).getText();
		logger.info("Success12 : " + Success);
		logger.info("Success 12: " + CreateOfficeFields.Success);
		Assert.assertEquals(CreateOfficeFields.Success, Success);

		String Success1 = driver.findElement(CreateOfficeLocators.Success1).getText();
		logger.info("Success13 : " + Success1);
		logger.info("Success 13: " + CreateOfficeFields.Success1);
		Assert.assertEquals(CreateOfficeFields.Success1, Success1);

		WebElement elt114 = driver.findElement(CreateOfficeLocators.close);
		Actions builder114 = new Actions(driver);
		Actions seriesOfActions114 = builder114.moveToElement(elt114).click();
		seriesOfActions114.perform();

	}

	@Then("^Click on the first subTier link$")
	public void Click_on_the_first_subTier_link() throws Throwable {
		Thread.sleep(3000);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/div/div[3]/div[1]/a"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
	}

	@And("^The user enters office office region ([^\"]*)$")
	public void The_user_enters_office_office_region(String OfficeRegion) {
		String OfficeRegion1 = driver.findElement(CreateOfficeLocators.OfficeRegion1).getText();
		logger.info("OfficeRegion1 : " + OfficeRegion1);
		logger.info("OfficeRegionText2: " + CreateOfficeFields.OfficeRegion);
		Assert.assertEquals(CreateOfficeFields.OfficeRegion, OfficeRegion1);

		String OfficeRegion2 = driver.findElement(CreateOfficeLocators.OfficeRegion2).getText();
		logger.info("Office Region : " + OfficeRegion2);
		logger.info("Office Region2 : " + CreateOfficeFields.OfficeRegionText);
		Assert.assertEquals(CreateOfficeFields.OfficeRegionText, OfficeRegion2);

		OfficeRegion3 = OfficeRegion;
		logger.info("OfficeRegion3: " + OfficeRegion3);
		driver.findElement(CreateOfficeLocators.OfficeRegionTextbox).sendKeys(OfficeRegion3);
		logger.info("enters ShortName ", scenario);
	}

	@And("^The user enters office ACC ([^\"]*)$")
	public void The_user_enters_office_ACC(String ACC) throws Throwable {
		String OfficeActivityAddressCodeName = driver.findElement(CreateOfficeLocators.OfficeActivityAddressCodeName)
				.getText();
		logger.info("ACC 1 : " + OfficeActivityAddressCodeName);
		logger.info("ACC 2: " + CreateOfficeFields.ACC);
		Assert.assertEquals(CreateOfficeFields.ACC, OfficeActivityAddressCodeName);

		String OfficeActivityAddressCodeText = driver.findElement(CreateOfficeLocators.OfficeActivityAddressCodeText)
				.getText();
		logger.info("Office Region : " + OfficeActivityAddressCodeText);
		logger.info("Office Region2 : " + CreateOfficeFields.ACCText);
		Assert.assertEquals(CreateOfficeFields.ACCText, OfficeActivityAddressCodeText);

		if (ACC != null && ACC.trim().length() != 0 && !(ACC.equalsIgnoreCase(x))) {
			logger.info("ACC: " + ACC);
			Boolean val = driver.findElement(CreateOfficeLocators.OfficeActivityAddressCode).isDisplayed();
			logger.info("val:" + val);
			driver.findElement(CreateOfficeLocators.OfficeActivityAddressCode).sendKeys(ACC);
		}else if (ACC != null && ACC.equalsIgnoreCase(x)) {
			logger.info("No select on ACC ");
		}  else {
			logger.info("ACC: ");
			int acc1 = (int) Math.ceil(Math.random() * 1000);
			OfficeActivity1 = "T" + acc1;
			logger.info("OfficeActivity1: " + OfficeActivity1);
			Thread.sleep(2000);

			Boolean val = driver.findElement(CreateOfficeLocators.OfficeActivityAddressCode).isDisplayed();
			logger.info("val:" + val);
			driver.findElement(CreateOfficeLocators.OfficeActivityAddressCode).sendKeys(OfficeActivity1);
		}

		String Requestor = driver.findElement(CreateOfficeLocators.Requestor).getText();
		logger.info("Requestor : " + Requestor);
		logger.info("Requestor 2 : " + CreateOfficeFields.Requestor);
		Assert.assertEquals(CreateOfficeFields.Requestor, Requestor);

		String NameText = driver.findElement(CreateOfficeLocators.NameText).getText();
		logger.info("Name : " + NameText);
		logger.info("Name 2: " + CreateOfficeFields.Name);
		Assert.assertEquals(CreateOfficeFields.Name, NameText);
		RequestorName1 = NameText;

		String EmailText = driver.findElement(CreateOfficeLocators.EmailText).getText();
		logger.info("EmailText : " + EmailText);
		logger.info("EmailText 2: " + CreateOfficeFields.Email);
		Assert.assertEquals(CreateOfficeFields.Email, EmailText);
		RequestorEmail1 = EmailText;

		String PhoneNumberText = driver.findElement(CreateOfficeLocators.PhoneNumberText).getText();
		logger.info("PhoneNumberText : " + PhoneNumberText);
		logger.info("Phone Number Text 2: " + CreateOfficeFields.Phone);
		Assert.assertEquals(CreateOfficeFields.Phone, PhoneNumberText);
		RequestorPhone1 = PhoneNumberText;

	}

	@And("^The user enters POC check box ([^\"]*)$")
	public void The_user_enters_POC_check_box(String POCCheckBox) {

		String PointOfContact = driver.findElement(CreateOfficeLocators.PointOfContact).getText();
		logger.info("PointOfContact : " + PointOfContact);
		logger.info("PointOfContact 2: " + CreateOfficeFields.POC);
		Assert.assertEquals(CreateOfficeFields.POC, PointOfContact);

		String UseTheRequestorAsPointOfContact = driver
				.findElement(CreateOfficeLocators.UseTheRequestorAsPointOfContact).getText();
		logger.info("UseTheRequestorAsPointOfContact : " + UseTheRequestorAsPointOfContact);
		logger.info("UseTheRequestorAsPointOfContact 2: " + CreateOfficeFields.POCText);
		Assert.assertEquals(CreateOfficeFields.POCText, UseTheRequestorAsPointOfContact);

	}
	
	
	@And("^Select Poc check box$")
	public void Select_Poc_check_box() throws Throwable {
		Thread.sleep(2000);
		WebElement elt = driver.findElement(CreateOfficeLocators.PocCheckbox);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.findElement(CreateOfficeLocators.PocCheckbox).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		logger.info("**************************POC****************************************************");
	}

	@And("^The user enters POC name ([^\"]*)$")
	public void The_user_enters_POC_name(String POCName) throws Throwable {

		if (POCName != null && POCName.trim().length() != 0) {
			logger.info("POCName: " + POCName);
			String POCName2 = driver.findElement(CreateOfficeLocators.POCName).getText();
			String str = POCName2.replace("\n", " ");
			logger.info("Str========" + str);
			logger.info("POCName : " + str);
			logger.info("POCName 2: " + CreateOfficeFields.POCName);
			Assert.assertTrue(str.contains(CreateOfficeFields.POCName));
			Assert.assertTrue(str.contains(CreateOfficeFields.Required));
			POCName1 = POCName;
			driver.findElement(CreateOfficeLocators.POCNameTextBox).sendKeys(POCName1);
			logger.info("POCName1: "+ POCName1);
			logger.info("CreateDepartmentStepDef.AccountDetailsName: "+ CreateDepartmentStepDef.AccountDetailsName);
			Assert.assertEquals(CreateDepartmentStepDef.AccountDetailsName, POCName1);
		} else {
			logger.info("POCName:" + "Shanthi Dutta");
			String POCName2 = driver.findElement(CreateOfficeLocators.POCName).getText();
			String str = POCName2.replace("\n", " ");
			logger.info("Str========" + str);
			logger.info("POCName : " + str);
			logger.info("POCName 2: " + CreateOfficeFields.POCName);
			Assert.assertTrue(str.contains(CreateOfficeFields.POCName));
			Assert.assertTrue(str.contains(CreateOfficeFields.Required));
			POCName1 = "Shanthi Dutta";
			driver.findElement(CreateOfficeLocators.POCNameTextBox).sendKeys(POCName1);
			logger.info("POCName1: "+ POCName1);
			logger.info("CreateDepartmentStepDef.AccountDetailsName: "+ CreateDepartmentStepDef.AccountDetailsName);
			Assert.assertEquals(CreateDepartmentStepDef.AccountDetailsName, POCName1);
			Thread.sleep(1000);
		}
	}

	@And("^The user enters POC Email ([^\"]*)$")
	public void The_user_enters_POC_Email(String POCEmail) throws Throwable {

		if (POCEmail != null && POCEmail.trim().length() != 0) {
			logger.info("POCEmail:" + POCEmail);
			String POCEmail2 = driver.findElement(CreateOfficeLocators.POCEmail).getText();
			String str = POCEmail2.replace("\n", " ");
			logger.info("Str========" + str);
			logger.info("POCEmail1 : " + str);
			logger.info("POCEmail 2: " + CreateOfficeFields.POCEmail);
			Assert.assertTrue(str.contains(CreateOfficeFields.POCEmail));
			Assert.assertTrue(str.contains(CreateOfficeFields.Required));
			POCEmail1 = POCEmail;
			driver.findElement(CreateOfficeLocators.POCEmailTextBox).sendKeys(POCEmail1);
			logger.info("POCEmail1: "+ POCEmail1);
			logger.info("CreateDepartmentStepDef.AccountDetailsEmail: "+ CreateDepartmentStepDef.AccountDetailsEmail);
			Assert.assertEquals(CreateDepartmentStepDef.AccountDetailsEmail, POCEmail1);
			driver.findElement(CreateOfficeLocators.POCEmailTextBox).sendKeys(Keys.TAB);
			Thread.sleep(2000);
		} else {
			logger.info("POCEmail:" + "shanthi.dutta+SuperAdmin@gsa.gov");
			String POCEmail2 = driver.findElement(CreateOfficeLocators.POCEmail).getText();
			String str = POCEmail2.replace("\n", " ");
			logger.info("Str========" + str);
			logger.info("POCEmail1 : " + str);
			logger.info("POCEmail 2: " + CreateOfficeFields.POCEmail);
			Assert.assertTrue(str.contains(CreateOfficeFields.POCEmail));
			Assert.assertTrue(str.contains(CreateOfficeFields.Required));
			POCEmail1 = "shanthi.dutta+SuperAdmin@gsa.gov";
			driver.findElement(CreateOfficeLocators.POCEmailTextBox).sendKeys("shanthi.dutta+SuperAdmin@gsa.gov");
			logger.info("POCEmail1: "+ POCEmail1);
			logger.info("CreateDepartmentStepDef.AccountDetailsEmail: "+ CreateDepartmentStepDef.AccountDetailsEmail);
			Assert.assertEquals(CreateDepartmentStepDef.AccountDetailsEmail, POCEmail1);
			driver.findElement(CreateOfficeLocators.POCEmailTextBox).sendKeys(Keys.TAB);
			Thread.sleep(2000);
		}
	}

	@And("^The user enters POC Number ([^\"]*)$")
	public void The_user_enters_POC_Number(String POCNumber) throws Throwable {

		if (POCNumber != null && POCNumber.trim().length() != 0) {
			logger.info("POCNumber" + POCNumber);
			String POCPhoneNumber2 = driver.findElement(CreateOfficeLocators.POCPhoneNumber).getText();
			String str = POCPhoneNumber2.replace("\n", " ");
			logger.info("POCPhoneNumber1 : " + str);
			logger.info("POCNumber 2: " + CreateOfficeFields.POCNumber);
			Assert.assertTrue(str.contains(CreateOfficeFields.POCNumber));
			Assert.assertTrue(str.contains(CreateOfficeFields.Required));
			POCNumber1 = POCNumber;
			logger.info("POCNumber1: " + POCNumber1);
			Thread.sleep(2000);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.POCPhoneNumberTextBox);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys(POCNumber1);
			logger.info("POCNumber1: "+ POCNumber1);
			logger.info("CreateDepartmentStepDef.BusinessPhone: "+ CreateDepartmentStepDef.BusinessPhone);
			//Assert.assertEquals(CreateDepartmentStepDef.BusinessPhone, POCNumber1);
			// seriesOfActions3.sendKeys(Keys.ENTER);
			seriesOfActions3.perform();
			
		} else {
			logger.info("POCNumber: " + "5714998137");
			String POCPhoneNumber2 = driver.findElement(CreateOfficeLocators.POCPhoneNumber).getText();
			String str = POCPhoneNumber2.replace("\n", " ");
			logger.info("POCPhoneNumber1 : " + str);
			logger.info("POCNumber 2: " + CreateOfficeFields.POCNumber);
			Assert.assertTrue(str.contains(CreateOfficeFields.POCNumber));
			Assert.assertTrue(str.contains(CreateOfficeFields.Required));
			POCNumber1 = "5714998137";
			logger.info("POCNumber1: " + POCNumber1);
			Thread.sleep(2000);
			WebElement elt3 = driver.findElement(CreateOfficeLocators.POCPhoneNumberTextBox);
			Actions builder3 = new Actions(driver);
			Actions seriesOfActions3 = builder3.moveToElement(elt3).sendKeys("5714998137");
			logger.info("POCNumber1: "+ POCNumber1);
			logger.info("CreateDepartmentStepDef.BusinessPhone: "+ CreateDepartmentStepDef.BusinessPhone);
			//Assert.assertEquals(CreateDepartmentStepDef.BusinessPhone, POCNumber1);
			// seriesOfActions3.sendKeys(Keys.ENTER);
			seriesOfActions3.perform();
		}

	}

	@And("^The user enters TAC2 street address ([^\"]*)$")
	public void The_user_enters_street_address_TAC2(String address2) {
	
		if (address2 != null && address2.trim().length() != 0) {
			logger.info("No address2 code: " + address2);

		} else {
			logger.info("address2:" + address2);
			String ShippingAddressTAC = driver.findElement(CreateOfficeLocators.ShippingAddressTAC).getText();
			String str = ShippingAddressTAC.replace("\n", " ");
			logger.info("ShippingAddressTAC : " + str);
			logger.info("ShippingAddressTAC 1: " + CreateOfficeFields.ShippingAddress1);
			logger.info("Str========" + str);
			Assert.assertTrue(str.contains(CreateOfficeFields.ShippingAddress1));

			String ShippingAddressRequired = driver.findElement(CreateOfficeLocators.ShippingAddressRequired).getText();
			logger.info("Required : " + ShippingAddressRequired);
			logger.info("Required 1: " + CreateOfficeFields.Required);
			Assert.assertEquals(CreateOfficeFields.Required, ShippingAddressRequired);
			// Assert.assertTrue(str.contains(CreateOfficeFields.Required));

			String Streetaddress1 = driver.findElement(CreateOfficeLocators.Streetaddress1).getText();
			logger.info("Streetaddress1 : " + Streetaddress1);
			logger.info("TAC1Street 1: " + CreateOfficeFields.StreetAddress1);
			Assert.assertEquals(CreateOfficeFields.StreetAddress1, Streetaddress1);
			ShippingStreet = address2;

			driver.findElement(CreateOfficeLocators.StreetaddressTextbox).sendKeys("PPPPPP");
			logger.info("enters officeStreet ", scenario);
		}

	}

	@And("^The user enters TAC2 country ([^\"]*)$")
	public void The_user_enters_country_TAC2(String country2) throws Throwable {
		if (country2 != null && country2.trim().length() != 0) {
			logger.info("No Zip code: " + Zip2);

		} else {
			logger.info("country2:" + country2);
			String CountryTAC2 = driver.findElement(CreateOfficeLocators.CountryTAC2).getText();
			logger.info("Country : " + CountryTAC2);
			logger.info("Country 1: " + CreateOfficeFields.Country);
			Assert.assertEquals(CreateOfficeFields.Country, CountryTAC2);

			logger.info("country:" + country2);
			Boolean val = driver.findElement(CreateOfficeLocators.CountryTAC2TextBox).isDisplayed();
			logger.info("Boolean::" + val);

			driver.findElement(CreateOfficeLocators.CountryTAC2TextBox).sendKeys("USA");
			Thread.sleep(1000);
			WebElement elt = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.CountryTAC2TextBox).sendKeys(Keys.TAB);
			logger.info("enters country ", scenario);
		}

	}

	@And("^The enters TAC2 zip ([^\"]*)$")
	public void The_enters_zip_TAC2(String Zip2) throws Throwable {
		if (Zip2 != null && Zip2.trim().length() != 0) {
			logger.info("No Zip code: " + Zip2);

		} else {
			logger.info("Zip2:" + Zip2);
			String ZipTAC2 = driver.findElement(CreateOfficeLocators.ZipTAC2).getText();
			logger.info("Zip : " + Zip1);
			logger.info("Zip 1: " + CreateOfficeFields.Zip);
			Assert.assertEquals(CreateOfficeFields.Zip, ZipTAC2);
			driver.findElement(CreateOfficeLocators.ZipTACTextBox).sendKeys("36310");
			Thread.sleep(2000);
			logger.info("enters officeZip ", scenario);
		}

	}

	@And("^The enters TAC2 city ([^\"]*)$")
	public void The_enters_city_TAC2(String officeCity2) throws Throwable {
		
		if (officeCity2 != null && officeCity2.trim().length() != 0) {
			logger.info("No City Select" + officeCity2);
		} else {
			logger.info("officeCity2: " + officeCity2);
			logger.info("city:" + officeCity2);
			String CityTAC2 = driver.findElement(CreateOfficeLocators.CityTAC2).getText();
			logger.info("City : " + CityTAC2);
			logger.info("City 1: " + CreateOfficeFields.City);
			Assert.assertEquals(CreateOfficeFields.City, CityTAC2);
			Thread.sleep(2000);
			Boolean test = driver.findElement(CreateOfficeLocators.CityTAC2TextBox).isDisplayed();
			logger.info("City1234: ", test);
			driver.findElement(CreateOfficeLocators.CityTAC2TextBox).click();
			Thread.sleep(2000);
			Boolean test2 = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results\"]/li")).isDisplayed();
			//*[@id="sam-autocomplete-results"]/li
			logger.info("City:::::::::::::::::::::::::::: ", test2);
			Thread.sleep(2000);
			WebElement elt = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results\"]/li"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(2000);
			logger.info("enters officeCity ", scenario);
		}

	}

	@And("^The enters TAC2 state ([^\"]*)$")
	public void The_enters_state_TAC2(String state2) throws Throwable {

		if (state2 != null && state2.trim().length() != 0) {
			logger.info("No select on state2: " + state2);

		} else {
			logger.info("state2:" + state2);
			String StateTAC2 = driver.findElement(CreateOfficeLocators.StateTAC2).getText();
			logger.info("State : " + StateTAC2);
			logger.info("State 1: " + CreateOfficeFields.State);
			Assert.assertEquals(CreateOfficeFields.State, StateTAC2);
			logger.info("enters officeState ", scenario);
		}

	}

	@And("^The user enters TAC3 street address ([^\"]*)$")
	public void The_user_enters_street_address_TAC3(String address3) {
		
		if (address3 != null && address3.trim().length() != 0) {
			logger.info("No select on address3: " + address3);
		} else {
			logger.info("address3: " + address3);
			String BillingAddressTAC = driver.findElement(CreateOfficeLocators.BillingAddressTAC).getText();
			String str = BillingAddressTAC.replace("\n", " ");
			logger.info("BillingAddressTAC : " + str);
			logger.info("BillingAddressTAC 1: " + CreateOfficeFields.BillingAddress2);
			logger.info("Str========" + str);
			Assert.assertTrue(str.contains(CreateOfficeFields.BillingAddress2));

			String BillingAddressRequired = driver.findElement(CreateOfficeLocators.BillingAddressRequired).getText();
			logger.info("Required : " + BillingAddressRequired);
			logger.info("Required 1: " + CreateOfficeFields.Required);
			Assert.assertEquals(CreateOfficeFields.Required, BillingAddressRequired);
			// Assert.assertTrue(str.contains(CreateOfficeFields.Required));

			String Streetaddress1 = driver.findElement(CreateOfficeLocators.Streetaddress1TAC3).getText();
			logger.info("TAC3Street : " + Streetaddress1);
			logger.info("TAC3Street 1: " + CreateOfficeFields.StreetAddress1);
			Assert.assertEquals(CreateOfficeFields.StreetAddress1, Streetaddress1);
			BillingStreet = address3;

			driver.findElement(CreateOfficeLocators.StreetaddressTextboxTAC13).sendKeys("QQQQQQQQ");
			logger.info("enters officeStreet ", scenario);
		}
	}

	@And("^The user enters TAC3 country ([^\"]*)$")
	public void The_user_enters_country_TAC3(String country3) throws Throwable {

		
		if (country3 != null && country3.trim().length() != 0) {
			logger.info("No select on country3: " + country3);
		} else {
			logger.info("country3: " + country3);
			String CountryTAC2 = driver.findElement(CreateOfficeLocators.CountryTAC3).getText();
			logger.info("CountryTAC2 : " + CountryTAC2);
			logger.info("CountryTAC2 1: " + CreateOfficeFields.Country);
			Assert.assertEquals(CreateOfficeFields.Country, CountryTAC2);
			logger.info("country:" + country3);
			Boolean val = driver.findElement(CreateOfficeLocators.CountryTAC3Text).isDisplayed();
			logger.info("Boolean::" + val);
			driver.findElement(CreateOfficeLocators.CountryTAC3Text).sendKeys("USA");
			Thread.sleep(1000);
			WebElement elt = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results-kv\"]/li"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(2000);
			driver.findElement(CreateOfficeLocators.CountryTextBox).sendKeys(Keys.TAB);
			logger.info("enters country ", scenario);
		}
	}

	@And("^The enters TAC3 zip ([^\"]*)$")
	public void The_enters_zip_TAC3(String Zip3) throws Throwable {
		if (Zip3 != null && Zip3.trim().length() != 0) {
			logger.info("No select on state3:" + Zip3);
		} else {
			String ZipTAC3 = driver.findElement(CreateOfficeLocators.ZipTAC3).getText();
			logger.info("ZipTAC3 : " + ZipTAC3);
			logger.info("ZipTAC3 1: " + CreateOfficeFields.Zip);
			Assert.assertEquals(CreateOfficeFields.Zip, ZipTAC3);
			driver.findElement(CreateOfficeLocators.ZipTextBoxTAC3).sendKeys("36310");
			Thread.sleep(2000);
			logger.info("enters officeZip ", scenario);
		}
	}

	@And("^The enters TAC3 city ([^\"]*)$")
	public void The_enters_city_TAC3(String officeCity3) throws Throwable {
		
		if (officeCity3 != null && officeCity3.trim().length() != 0) {
			logger.info("No select on City: " + officeCity3);

		} else {
			logger.info("city:" + officeCity3);
			String CityTAC3 = driver.findElement(CreateOfficeLocators.CityTAC3).getText();
			logger.info("CityTAC3 : " + CityTAC3);
			logger.info("CityTAC3 1: " + CreateOfficeFields.City);
			Assert.assertEquals(CreateOfficeFields.City, CityTAC3);
			Thread.sleep(2000);
			Boolean test = driver.findElement(CreateOfficeLocators.CityTAC3TextBox).isDisplayed();
			logger.info("City1234: ", test);
			driver.findElement(CreateOfficeLocators.CityTAC3TextBox).click();
			Thread.sleep(1000);
			Boolean test2 = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results\"]/li"))
					.isDisplayed();
			logger.info("City:::::::::::::::::::::::::::: ", test2);
			Thread.sleep(2000);
			WebElement elt = driver.findElement(By.xpath("//*[@id=\"sam-autocomplete-results\"]/li"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(2000);
			logger.info("enters officeCity ", scenario);
		}
	}

	@And("^The enters TAC3 state ([^\"]*)$")
	public void The_enters_state_TAC3(String state3) throws Throwable {

		if (state3 != null && state3.trim().length() != 0) {
			logger.info("No select on state3:" + state3);
		} else {
			logger.info("State:" + state3);
			String StateTac3 = driver.findElement(CreateOfficeLocators.StateTac3).getText();
			logger.info("State : " + StateTac3);
			logger.info("State 1: " + CreateOfficeFields.State);
			Assert.assertEquals(CreateOfficeFields.State, StateTac3);
			logger.info("enters officeState ", scenario);
		}
	}

	@And("^Scroll down request office page$")
	public void Scroll_down_request_office_page() throws Throwable {
		Thread.sleep(2000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		Thread.sleep(5000);

	}
	
	@And("^The user enters awards office TAC2 street address ([^\"]*)$")
	public void The_user_enters_awards_street_address_TAC2(String address2) {
	
		if (address2 != null && address2.trim().length() != 0) {
			logger.info("No address2 code: " + address2);

		} else {
			logger.info("address2:" + address2);
			String ShippingAddressTAC = driver.findElement(CreateOfficeLocators.ShippingAddressTAC).getText();
			String str = ShippingAddressTAC.replace("\n", " ");
			logger.info("ShippingAddressTAC : " + str);
			logger.info("ShippingAddressTAC 1: " + CreateOfficeFields.ShippingAddress1);
			logger.info("Str========" + str);
			Assert.assertTrue(str.contains(CreateOfficeFields.ShippingAddress1));
			String Streetaddress1 = driver.findElement(CreateOfficeLocators.Streetaddress1).getText();
			logger.info("Streetaddress1 : " + Streetaddress1);
			logger.info("TAC1Street 1: " + CreateOfficeFields.StreetAddress1);
			Assert.assertEquals(CreateOfficeFields.StreetAddress1, Streetaddress1);
			ShippingStreet = address2;
			driver.findElement(CreateOfficeLocators.StreetaddressTextbox).sendKeys("PPPPPP");
			logger.info("enters officeStreet ", scenario);
		}

	}
	
	@And("^The user enters awards office TAC3 street address ([^\"]*)$")
	public void The_user_entersawards_office_street_address_TAC3(String address3) {
		
		if (address3 != null && address3.trim().length() != 0) {
			logger.info("No select on address3: " + address3);
		} else {
			
			logger.info("address3: " + address3);
			WebDriverWait wait = new WebDriverWait(driver, 40);
			 
			 wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.BillingAddressTAC));
			String BillingAddressTAC = driver.findElement(CreateOfficeLocators.BillingAddressTAC).getText();
			String str = BillingAddressTAC.replace("\n", " ");
			logger.info("BillingAddressTAC : " + str);
			logger.info("BillingAddressTAC 1: " + CreateOfficeFields.BillingAddress2);
			logger.info("Str========" + str);
			Assert.assertTrue(str.contains(CreateOfficeFields.BillingAddress2));
			String Streetaddress1 = driver.findElement(CreateOfficeLocators.Streetaddress1TAC3).getText();
			logger.info("TAC3Street : " + Streetaddress1);
			logger.info("TAC3Street 1: " + CreateOfficeFields.StreetAddress1);
			Assert.assertEquals(CreateOfficeFields.StreetAddress1, Streetaddress1);
			BillingStreet = address3;

			driver.findElement(CreateOfficeLocators.StreetaddressTextboxTAC13).sendKeys("QQQQQQQQ");
			logger.info("enters officeStreet ", scenario);
		}
	}
	
	
	@Then ("^Check request office email notitication$")
	public void Check_request_office_email_notitication() throws Throwable {
	((JavascriptExecutor) driver).executeScript("window.open('https://mail.google.com/mail/#inbox')");
		driver.navigate();
		ArrayList<String> tab_handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 1));
		/*String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(myEmailId);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(emailID);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//*[@class='qhFLie']")).click();*/
		TimeUnit.SECONDS.sleep(20);
		List<WebElement> lastMail = driver.findElements(By.className("zA"));// want
		logger.info("The size of the element: " + lastMail.size());
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(lastMail.get(0)).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
		TimeUnit.SECONDS.sleep(3);
		Constants.RequestOfficeEmail = driver.findElement(Locators.iaeOtp).getText();
		logger.info("The captured OTP is- " + Constants.RequestOfficeEmail);
		//String emailContent = Constants.RequestOfficeEmail;
		
		StringBuilder sb = new StringBuilder(Constants.RequestOfficeEmail);
		String  emailContent  = sb.toString();
		
		String[] strSplit = emailContent.split("office");
		String splitByOffice = strSplit[1].trim();
		String val = splitByOffice.substring(0, splitByOffice.indexOf(" "));
		//logger.info("office--" + splitByOffice.substring(0, splitByOffice.indexOf(" ")));
		//Assert.assertEquals(splitByOffice.substring(0, splitByOffice.indexOf(" ")), OfficeName1);
		logger.info("office--" +val );
		Assert.assertEquals(val, OfficeName1);
		
		
		strSplit = emailContent.split("department");
		String splitByDept = strSplit[1].trim();
		
		String val2 =splitByDept.substring(0, splitByDept.indexOf(" "));
		logger.info("department++" +val2 );
		Assert.assertEquals(val2, DeptIndAgency1);
		//logger.info("department++" + splitByDept.substring(0, splitByDept.indexOf(" ")));
		//Assert.assertEquals(splitByDept.substring(0, splitByDept.indexOf(" ")), DeptIndAgency1);
		
		strSplit = emailContent.split("sub-tier");
		String splitBySubTier = strSplit[1].trim();
		String val3 = splitBySubTier.substring(0, splitBySubTier.indexOf(" "));
		logger.info("sub-tier::" +val3);
		Assert.assertEquals(val3, SubTier1);
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 2));
		//logger.info("sub-tier::" + splitBySubTier.substring(0, splitBySubTier.indexOf(" ")));
		//Assert.assertEquals(splitBySubTier.substring(0, splitBySubTier.indexOf(" ")), SubTier1);
		
	}
}
