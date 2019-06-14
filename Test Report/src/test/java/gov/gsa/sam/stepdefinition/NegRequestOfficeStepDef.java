package gov.gsa.sam.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cucumber.api.java.en.Then;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gov.gsa.sam.base.DateClass;
import gov.gsa.sam.base.FileReaderManager;
import gov.gsa.sam.fields.CreateOfficeFields;
import gov.gsa.sam.fields.CreateOfficeLocators;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.utils.Constants;
//import gov.gsa.sam.locators.DepartmentErrorMessageLocators;
import net.thucydides.core.annotations.Managed;

public class NegRequestOfficeStepDef {
	public String myEmailId ;
	public static String OfficeNameError;
	public static String DateRequiredError;
	public static String NamePOCError;
	public static String EmailPOCError;
	public static String PhonePOCError;
	public static String StreetEmpty;
	public static String CountryEmpty;
	public static String ZipEmpty;
	public static String CityEmpty;
	public static String StateEmpty;
	public static String StreetEmpty1;
	public static String CountryEmpty1;
	public static String ZipEmpty1;
	public static String CityEmpty1;
	public static String StateEmpty1;
	public static String StreetEmpty2;
	public static String CountryEmpty2;
	public static String ZipEmpty2;
	public static String CityEmpty2;
	public static String StateEmpty2;

	public static String NameExists = "Test1";

	@Managed
	public static WebDriver driver;
	Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(CreateOfficeStepDef.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@And("^Validation on empty field in request office page$")
	public void submit_Create_Depatment_Button_Without_Filling_Value() throws Throwable {

		/*
		 * TimeUnit.SECONDS.sleep(3); ((JavascriptExecutor)
		 * driver).executeScript("scroll(0,2500)"); WebElement elt3 =
		 * driver.findElement(DepartmentLocators.submit); Actions builder3 = new
		 * Actions(driver); Actions seriesOfActions3 =
		 * builder3.moveToElement(elt3).click(); seriesOfActions3.perform();
		 * Thread.sleep(1400);
		 */
		logger.info("Click on Submit button");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		NegRequestOfficeStepDef.OfficeNameError = driver.findElement(CreateOfficeLocators.OfficeNameError).getText();
		logger.info("NegRequestOfficeStepDef.OfficeNameError :" + NegRequestOfficeStepDef.OfficeNameError);

		Assert.assertEquals(OfficeNameError, CreateOfficeFields.CannotBeEmpty);

		NegRequestOfficeStepDef.DateRequiredError = driver.findElement(CreateOfficeLocators.DateRequiredError)
				.getText();
		logger.info("NegRequestOfficeStepDef.DateRequiredError :" + NegRequestOfficeStepDef.DateRequiredError);
		Assert.assertEquals(DateRequiredError, CreateOfficeFields.DateIsRequired);

		NegRequestOfficeStepDef.NamePOCError = driver.findElement(CreateOfficeLocators.NameError).getText();
		logger.info("NegRequestOfficeStepDef.NamePOCError :" + NegRequestOfficeStepDef.NamePOCError);
		Assert.assertEquals(NamePOCError, CreateOfficeFields.CannotBeEmpty);

		NegRequestOfficeStepDef.EmailPOCError = driver.findElement(CreateOfficeLocators.EmailError).getText();
		logger.info("NegRequestOfficeStepDef.EmailPOCError :" + NegRequestOfficeStepDef.EmailPOCError);
		Assert.assertEquals(EmailPOCError, CreateOfficeFields.CannotBeEmpty);

		NegRequestOfficeStepDef.PhonePOCError = driver.findElement(CreateOfficeLocators.PhoneError).getText();
		logger.info("NegRequestOfficeStepDef.PhonePOCError: " + NegRequestOfficeStepDef.PhonePOCError);
		Assert.assertEquals(PhonePOCError, CreateOfficeFields.CannotBeEmpty);

		NegRequestOfficeStepDef.StreetEmpty = driver.findElement(CreateOfficeLocators.StreetAddressError).getText();
		logger.info("NegRequestOfficeStepDef.StreetEmpty: " + NegRequestOfficeStepDef.StreetEmpty);
		Assert.assertEquals(StreetEmpty, CreateOfficeFields.SrreetCannotBeEmpty);

		NegRequestOfficeStepDef.CountryEmpty = driver.findElement(CreateOfficeLocators.CountryError).getText();
		logger.info("NegRequestOfficeStepDef.CountryEmpty: " + NegRequestOfficeStepDef.CountryEmpty);
		Assert.assertEquals(CountryEmpty, CreateOfficeFields.CountryIsRequired);

		NegRequestOfficeStepDef.ZipEmpty = driver.findElement(CreateOfficeLocators.ZipError).getText();
		logger.info("NegRequestOfficeStepDef.ZipEmpty: " + NegRequestOfficeStepDef.ZipEmpty);
		Assert.assertEquals(ZipEmpty, CreateOfficeFields.ZipIsRequired);

		NegRequestOfficeStepDef.CityEmpty = driver.findElement(CreateOfficeLocators.CityError).getText();
		logger.info("NegRequestOfficeStepDef.CityEmpty: " + NegRequestOfficeStepDef.CityEmpty);
		Assert.assertEquals(CityEmpty, CreateOfficeFields.CityIsRequired);

		NegRequestOfficeStepDef.StateEmpty = driver.findElement(CreateOfficeLocators.StateError).getText();
		logger.info("NegRequestOfficeStepDef.StateEmpty: " + NegRequestOfficeStepDef.StateEmpty);
		Assert.assertEquals(StateEmpty, CreateOfficeFields.StateIsRequired);

		NegRequestOfficeStepDef.StreetEmpty1 = driver.findElement(CreateOfficeLocators.ErrorMailingAddress).getText();
		logger.info("NegRequestOfficeStepDef.StreetEmpty1: " + NegRequestOfficeStepDef.StreetEmpty);
		Assert.assertEquals(StreetEmpty, CreateOfficeFields.SrreetCannotBeEmpty);

		NegRequestOfficeStepDef.CountryEmpty1 = driver.findElement(CreateOfficeLocators.ErrorMailingAddresscountry)
				.getText();
		logger.info("NegRequestOfficeStepDef.CountryEmpty1: " + NegRequestOfficeStepDef.CountryEmpty);
		Assert.assertEquals(CountryEmpty, CreateOfficeFields.CountryIsRequired);

		NegRequestOfficeStepDef.ZipEmpty1 = driver.findElement(CreateOfficeLocators.ErrorMailingAddressZip).getText();
		logger.info("NegRequestOfficeStepDef.ZipEmpty1: " + NegRequestOfficeStepDef.ZipEmpty);
		Assert.assertEquals(ZipEmpty, CreateOfficeFields.ZipIsRequired);

		NegRequestOfficeStepDef.CityEmpty1 = driver.findElement(CreateOfficeLocators.ErrorMailingAddresscity).getText();
		logger.info("NegRequestOfficeStepDef.CityEmpty1: " + NegRequestOfficeStepDef.CityEmpty);
		Assert.assertEquals(CityEmpty, CreateOfficeFields.CityIsRequired);

		NegRequestOfficeStepDef.StateEmpty1 = driver.findElement(CreateOfficeLocators.ErrorMailingAddressState)
				.getText();
		logger.info("NegRequestOfficeStepDef.StateEmpty1: " + NegRequestOfficeStepDef.StateEmpty);
		Assert.assertEquals(StateEmpty, CreateOfficeFields.StateIsRequired);

		/*Thread.sleep(5000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
		Thread.sleep(5000);*/

		NegRequestOfficeStepDef.StreetEmpty2 = driver.findElement(CreateOfficeLocators.StreetEmpty2).getText();
		logger.info("NegRequestOfficeStepDef.StreetEmpty2: " + NegRequestOfficeStepDef.StreetEmpty);
		Assert.assertEquals(StreetEmpty, CreateOfficeFields.SrreetCannotBeEmpty);

		NegRequestOfficeStepDef.CountryEmpty2 = driver.findElement(CreateOfficeLocators.CountryEmpty2).getText();
		logger.info("NegRequestOfficeStepDef.CountryEmpty2: " + NegRequestOfficeStepDef.CountryEmpty);
		Assert.assertEquals(CountryEmpty, CreateOfficeFields.CountryIsRequired);

		NegRequestOfficeStepDef.ZipEmpty2 = driver.findElement(CreateOfficeLocators.ZipEmpty2).getText();
		logger.info("NegRequestOfficeStepDef.ZipEmpty2: " + NegRequestOfficeStepDef.ZipEmpty);
		Assert.assertEquals(ZipEmpty, CreateOfficeFields.ZipIsRequired);

		NegRequestOfficeStepDef.CityEmpty2 = driver.findElement(CreateOfficeLocators.CityEmpty2).getText();
		logger.info("NegRequestOfficeStepDef.CityEmpty2: " + NegRequestOfficeStepDef.CityEmpty);
		Assert.assertEquals(CityEmpty, CreateOfficeFields.CityIsRequired);

		NegRequestOfficeStepDef.StateEmpty2 = driver.findElement(CreateOfficeLocators.StateEmpty2).getText();
		logger.info("NegRequestOfficeStepDef.StateEmpty2: " + NegRequestOfficeStepDef.StateEmpty);
		Assert.assertEquals(StateEmpty, CreateOfficeFields.StateIsRequired);

		logger.info("successfully completed");
	}

	@Given("^User click on subTier breadcrumb link$")
	public void User_click_on_subTier_breadcrumb_link() throws Throwable {
		WebElement elt3 = driver.findElement(CreateOfficeLocators.SubTierBreadCrumb);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		logger.info("SubTierBreadCrumb");
		seriesOfActions3.perform();
		Thread.sleep(2000);
	}

	@And("Validation on error messages ([^\"]*)$")
	public void Validation_on_error_messages(String ErrorMessages) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		if (ErrorMessages.equalsIgnoreCase("UniqueName")) {
			logger.info("UniqueName1: successfully");
			Thread.sleep(20);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.AlreadyExists));
			String UniqueName1 = driver.findElement(CreateOfficeLocators.AlreadyExists).getText();
			Thread.sleep(6);
			logger.info("UniqueName1: " + UniqueName1);
			logger.info("CreateOfficeLocators.AlreadyExists: " + CreateOfficeFields.AlreadyExists);
			Thread.sleep(3);
			Assert.assertEquals(UniqueName1, CreateOfficeFields.AlreadyExists);
			Thread.sleep(3);
			
			logger.info("ACCExists : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.AacAlreadyExists));
			String ACCExists1 = driver.findElement(CreateOfficeLocators.AacAlreadyExists).getText();
			Thread.sleep(6);
			logger.info("ACCExists1: " + ACCExists1);
			logger.info("CreateOfficeFields.ACCExists1: " + CreateOfficeFields.AacAlreadyExists);
			Assert.assertEquals(ACCExists1, CreateOfficeFields.AacAlreadyExists);
			Thread.sleep(3);
			
			logger.info("BeforeDate: ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.StartBefore));
			String BeforeDate1 = driver.findElement(CreateOfficeLocators.StartBefore).getText();
			Thread.sleep(6);
			logger.info("BeforeDate: " + BeforeDate1);
			logger.info("CreateOfficeFields.StartBefore: " + CreateOfficeFields.StartBefore);
			Assert.assertEquals(BeforeDate1, CreateOfficeFields.StartBefore);
			Thread.sleep(3);
			
		} else if (ErrorMessages.equalsIgnoreCase("BeforeDate")) {
			/*logger.info("BeforeDate: ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.StartBefore));
			String BeforeDate1 = driver.findElement(CreateOfficeLocators.StartBefore).getText();
			Thread.sleep(6);
			logger.info("BeforeDate: " + BeforeDate1);
			logger.info("CreateOfficeFields.StartBefore: " + CreateOfficeFields.StartBefore);
			Assert.assertEquals(BeforeDate1, CreateOfficeFields.StartBefore);
			Thread.sleep(3);*/
		} else if (ErrorMessages.equalsIgnoreCase("AfterDate")) {
			logger.info("AfterDate: ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.AfterEnd));
			;
			String AfterDate1 = driver.findElement(CreateOfficeLocators.AfterEnd).getText();
			Thread.sleep(6);
			logger.info("AfterDate: " + AfterDate1);
			logger.info(" CreateOfficeFields.AfterEnd: " + CreateOfficeFields.AfterEnd);
			Assert.assertEquals(AfterDate1, CreateOfficeFields.AfterEnd);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("EndDate")) {
			logger.info("EarlierStartDate: ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.EarlierStartDate));
			String EarlierStartDate1 = driver.findElement(CreateOfficeLocators.EarlierStartDate).getText();
			Thread.sleep(6);
			logger.info("EarlierStartDate: " + EarlierStartDate1);
			logger.info("CreateOfficeFields.EarlierStartDate: " + CreateOfficeFields.EarlierStartDate);
			Assert.assertEquals(EarlierStartDate1, CreateOfficeFields.EarlierStartDate);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("ACCExists")) {
			/*logger.info("ACCExists : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.AacAlreadyExists));
			String ACCExists1 = driver.findElement(CreateOfficeLocators.AacAlreadyExists).getText();
			Thread.sleep(6);
			logger.info("ACCExists1: " + ACCExists1);
			logger.info("CreateOfficeFields.ACCExists1: " + CreateOfficeFields.AacAlreadyExists);
			Assert.assertEquals(ACCExists1, CreateOfficeFields.AacAlreadyExists);
			Thread.sleep(3);*/
		} else if (ErrorMessages.equalsIgnoreCase("ContractAwards12")) {
			logger.info("ContractAwards12 : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractAwards12));
			String ContractAwards12 = driver.findElement(CreateOfficeLocators.ContractAwards12).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractAwards12: " + ContractAwards12);
			logger.info("CreateOfficeFields.ContractAwards12: " + CreateOfficeFields.ContractAwards12);
			Assert.assertEquals(ContractAwards12, CreateOfficeFields.ContractAwards12);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractAwards2));
			String ContractAwards2 = driver.findElement(CreateOfficeLocators.ContractAwards2).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractAwards2: " + ContractAwards2);
			logger.info("CreateOfficeFields.ContractAwards2: " + CreateOfficeFields.ContractAwards2);
			Assert.assertEquals(ContractAwards2, CreateOfficeFields.ContractAwards2);

			logger.info("FinancialAssistanceAwards12  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceAwards12));
			String FinancialAssistanceAwards12 = driver.findElement(CreateOfficeLocators.FinancialAssistanceAwards12)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceAwards12 : " + FinancialAssistanceAwards12);
			logger.info(
					"CreateOfficeFields.FinancialAssistanceAwards12 " + CreateOfficeFields.FinancialAssistanceAwards12);
			Assert.assertEquals(FinancialAssistanceAwards12, CreateOfficeFields.FinancialAssistanceAwards12);

			logger.info("FinancialAssistanceAwards5  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceAwards5));
			String FinancialAssistanceAwards5 = driver.findElement(CreateOfficeLocators.FinancialAssistanceAwards5)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceAwards5 : " + FinancialAssistanceAwards5);
			logger.info(
					"CreateOfficeFields.FinancialAssistanceAwards5 " + CreateOfficeFields.FinancialAssistanceAwards5);
			Assert.assertEquals(FinancialAssistanceAwards5, CreateOfficeFields.FinancialAssistanceAwards5);
			Thread.sleep(3);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("ContractAwards3")) {
			logger.info("ContractAwards3  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractAwards3));
			String ContractAwards3 = driver.findElement(CreateOfficeLocators.ContractAwards3).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractAwards3 : " + ContractAwards3);
			logger.info("CreateOfficeFields.ContractAwards3: " + CreateOfficeFields.ContractAwards3);
			Assert.assertEquals(ContractAwards3, CreateOfficeFields.ContractAwards3);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("ContractAwards4")) {
			logger.info("ContractAwards4  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractAwards4));
			String ContractAwards4 = driver.findElement(CreateOfficeLocators.ContractAwards4).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractAwards4 : " + ContractAwards4);
			logger.info("CreateOfficeFields.ContractAwards4: " + CreateOfficeFields.ContractAwards4);
			Assert.assertEquals(ContractAwards4, CreateOfficeFields.ContractAwards4);

			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractAwards5));
			String ContractAwards5 = driver.findElement(CreateOfficeLocators.ContractAwards5).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractAwards5 : " + ContractAwards5);
			logger.info("CreateOfficeFields.ContractAwards5: " + CreateOfficeFields.ContractAwards5);
			Assert.assertEquals(ContractAwards5, CreateOfficeFields.ContractAwards5);

			logger.info("FinancialAssistanceAwards4  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceAwards4));
			String FinancialAssistanceAwards4 = driver.findElement(CreateOfficeLocators.FinancialAssistanceAwards4)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceAwards4 : " + FinancialAssistanceAwards4);
			logger.info(
					"CreateOfficeFields.FinancialAssistanceAwards4 " + CreateOfficeFields.FinancialAssistanceAwards4);
			Assert.assertEquals(FinancialAssistanceAwards4, CreateOfficeFields.FinancialAssistanceAwards4);
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceAwards2));
			String FinancialAssistanceAwards2 = driver.findElement(CreateOfficeLocators.FinancialAssistanceAwards2)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceAwards2 : " + FinancialAssistanceAwards2);
			logger.info(
					"CreateOfficeFields.FinancialAssistanceAwards12 " + CreateOfficeFields.FinancialAssistanceAwards2);
			Assert.assertEquals(FinancialAssistanceAwards2, CreateOfficeFields.FinancialAssistanceAwards2);

			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("FinancialAssistanceAwards3")) {
			logger.info("FinancialAssistanceAwardsStarted  : ");

			logger.info("ContractAwards3  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractAwards3));
			String ContractAwards3 = driver.findElement(CreateOfficeLocators.ContractAwards3).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractAwards3 : " + ContractAwards3);
			logger.info("CreateOfficeFields.ContractAwards3: " + CreateOfficeFields.ContractAwards3);
			Assert.assertEquals(ContractAwards3, CreateOfficeFields.ContractAwards3);

			logger.info("FinancialAssistanceAwards3  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceAwards3));
			String FinancialAssistanceAwards3 = driver.findElement(CreateOfficeLocators.FinancialAssistanceAwards3)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceAwards3 : " + FinancialAssistanceAwards3);
			logger.info(
					"CreateOfficeFields.FinancialAssistanceAwards3 " + CreateOfficeFields.FinancialAssistanceAwards3);
			Assert.assertEquals(FinancialAssistanceAwards3, CreateOfficeFields.FinancialAssistanceAwards3);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("InvalidPhone")) {
		    logger.info("InvalidPhone  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.PhoneError));
			String InvalidPhone = driver.findElement(CreateOfficeLocators.PhoneError).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.InvalidPhone : " + InvalidPhone);
			logger.info("CreateOfficeFields.InvalidPhone " + CreateOfficeFields.InvalidPhone);
			Assert.assertEquals(InvalidPhone, CreateOfficeFields.InvalidPhone);
			Thread.sleep(3);
			
			logger.info("InvalidEmail  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.EmailError));
			String InvalidEmail = driver.findElement(CreateOfficeLocators.EmailError).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.InvalidEmail : " + InvalidEmail);
			logger.info("CreateOfficeFields.InvalidEmail " + CreateOfficeFields.InvalidEmail);
			Assert.assertEquals(InvalidEmail, CreateOfficeFields.InvalidEmail);
			Thread.sleep(3);

		} else if (ErrorMessages.equalsIgnoreCase("InvalidEmail")) {
			/*logger.info("InvalidEmail  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.EmailError));
			String InvalidEmail = driver.findElement(CreateOfficeLocators.EmailError).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.InvalidEmail : " + InvalidEmail);
			logger.info("CreateOfficeFields.InvalidEmail " + CreateOfficeFields.InvalidEmail);
			Assert.assertEquals(InvalidEmail, CreateOfficeFields.InvalidEmail);
			Thread.sleep(3);*/
		} else {
			logger.info("**********************Some thing went wrong***********************************");
		}
	}

	@And("Validation on funding error messages ([^\"]*)$")
	public void Validation_on_funding_error_messages(String ErrorMessages) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		if (ErrorMessages.equalsIgnoreCase("FinancialAssistanceFunding12")) {
			logger.info("FinancialAssistanceFunding12  : ");
			Thread.sleep(8);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceFunding12));
			String FinancialAssistanceFunding12 = driver.findElement(CreateOfficeLocators.FinancialAssistanceFunding12)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceFunding12 : " + FinancialAssistanceFunding12);
			logger.info("CreateOfficeFields.FinancialAssistanceFunding12 "
					+ CreateOfficeFields.FinancialAssistanceFunding12);
			Assert.assertEquals(FinancialAssistanceFunding12, CreateOfficeFields.FinancialAssistanceFunding12);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("FinancialAssistanceFunding2")) {
			logger.info("FinancialAssistanceFunding2  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceFunding2));
			String FinancialAssistanceFunding2 = driver.findElement(CreateOfficeLocators.FinancialAssistanceFunding2)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceFunding2 : " + FinancialAssistanceFunding2);
			logger.info(
					"CreateOfficeFields.FinancialAssistanceFunding2 " + CreateOfficeFields.FinancialAssistanceFunding2);
			Assert.assertEquals(FinancialAssistanceFunding2, CreateOfficeFields.FinancialAssistanceFunding2);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("FinancialAssistanceFunding3")) {
			logger.info("FinancialAssistanceFunding3  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceFunding3));
			String FinancialAssistanceFunding3 = driver.findElement(CreateOfficeLocators.FinancialAssistanceFunding3)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceFunding3 : " + FinancialAssistanceFunding3);
			logger.info(
					"CreateOfficeFields.FinancialAssistanceFunding3 " + CreateOfficeFields.FinancialAssistanceFunding3);
			Assert.assertEquals(FinancialAssistanceFunding3, CreateOfficeFields.FinancialAssistanceFunding3);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("FinancialAssistanceFunding4")) {
			logger.info("FinancialAssistanceFunding3  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceFunding4));
			String FinancialAssistanceFunding4 = driver.findElement(CreateOfficeLocators.FinancialAssistanceFunding4)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceFunding4 : " + FinancialAssistanceFunding4);
			logger.info(
					"CreateOfficeFields.FinancialAssistanceFunding4 " + CreateOfficeFields.FinancialAssistanceFunding4);
			Assert.assertEquals(FinancialAssistanceFunding4, CreateOfficeFields.FinancialAssistanceFunding4);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("FinancialAssistanceFunding5")) {
			logger.info("FinancialAssistanceFunding5  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.FinancialAssistanceFunding5));
			String FinancialAssistanceFunding5 = driver.findElement(CreateOfficeLocators.FinancialAssistanceFunding5)
					.getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.FinancialAssistanceFunding5 : " + FinancialAssistanceFunding5);
			logger.info(
					"CreateOfficeFields.FinancialAssistanceFunding5 " + CreateOfficeFields.FinancialAssistanceFunding5);
			Assert.assertEquals(FinancialAssistanceFunding5, CreateOfficeFields.FinancialAssistanceFunding5);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("ContractFunding12")) {
			logger.info("ContractFunding12  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractFunding12));
			String ContractFunding12 = driver.findElement(CreateOfficeLocators.ContractFunding12).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractFunding12 : " + ContractFunding12);
			logger.info("CreateOfficeFields.ContractFunding12 " + CreateOfficeFields.ContractFunding12);
			Assert.assertEquals(ContractFunding12, CreateOfficeFields.ContractFunding12);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("ContractFunding2")) {
			logger.info("ContractFunding2  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractFunding2));
			String ContractFunding2 = driver.findElement(CreateOfficeLocators.ContractFunding2).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractFunding2 : " + ContractFunding2);
			logger.info("CreateOfficeFields.ContractFunding2 " + CreateOfficeFields.ContractFunding2);
			Assert.assertEquals(ContractFunding2, CreateOfficeFields.ContractFunding2);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("ContractFunding3")) {
			logger.info("ContractFunding3  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractFunding3));
			String ContractFunding3 = driver.findElement(CreateOfficeLocators.ContractFunding3).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractFunding3 : " + ContractFunding3);
			logger.info("CreateOfficeFields.ContractFunding3 " + CreateOfficeFields.ContractFunding3);
			Assert.assertEquals(ContractFunding3, CreateOfficeFields.ContractFunding3);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("ContractFunding4")) {
			logger.info("ContractFunding4  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractFunding4));
			String ContractFunding4 = driver.findElement(CreateOfficeLocators.ContractFunding4).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractFunding4 : " + ContractFunding4);
			logger.info("CreateOfficeFields.ContractFunding4 " + CreateOfficeFields.ContractFunding4);
			Assert.assertEquals(ContractFunding4, CreateOfficeFields.ContractFunding4);
			Thread.sleep(3);
		} else if (ErrorMessages.equalsIgnoreCase("ContractFunding5")) {
			logger.info("ContractFunding5  : ");
			Thread.sleep(8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ContractFunding5));
			String ContractFunding5 = driver.findElement(CreateOfficeLocators.ContractFunding5).getText();
			Thread.sleep(6);
			logger.info("CreateOfficeLocators.ContractFunding5 : " + ContractFunding5);
			logger.info("CreateOfficeFields.ContractFunding4 " + CreateOfficeFields.ContractFunding5);
			Assert.assertEquals(ContractFunding5, CreateOfficeFields.ContractFunding5);
			Thread.sleep(3);
		} else {
			logger.info("**********************Some thing went wrong***********************************");
		}
	}

	@And("^Click on the mailing address plus symbol$")
	public void Click_on_the_mailing_address_plus_symbol() throws Throwable {
		logger.info("mailing address plus symbol ");
		WebElement elt3 = driver.findElement(CreateOfficeLocators.pluseSymbol);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		Thread.sleep(2000);
		seriesOfActions3.sendKeys(Keys.TAB);
		seriesOfActions3.perform();
	}

	@And("^Select address type$")
	public void Select_address_type() throws Throwable {
		logger.info("Select address type");
		Select Address = new Select(driver.findElement(CreateOfficeLocators.SelectAddressType));
		Address.selectByIndex(2);
	}

	@And("^Click on the second pluse symbol$")
	public void Click_on_the_second_pluse_symbol() throws Throwable {
		logger.info("Click on the second pluse symbol");
		WebElement elt3 = driver.findElement(CreateOfficeLocators.pluseSymbol2);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		Thread.sleep(2000);
		// seriesOfActions3.sendKeys(Keys.TAB);
		seriesOfActions3.perform();
	}

	@And("^Click on the first plus symbol$")
	public void Click_on_the_first_plus_symbol() throws Throwable {
		logger.info("CClick on the first plus symbol");
		WebElement elt3 = driver.findElement(CreateOfficeLocators.pluseSymbol);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		Thread.sleep(2000);
		// seriesOfActions3.sendKeys(Keys.TAB);
		seriesOfActions3.perform();
	}

	@And("^Click on the first cross button$")
	public void Click_on_the_first_cross_button() throws Throwable {
		logger.info("Click on the first plus symbol");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.CrossSymbol1));

		Boolean text1 = driver.findElement(CreateOfficeLocators.CrossSymbol1).isDisplayed();
		logger.info("Click on the first cross symbol: " + text1);

		WebElement builder = driver.findElement(CreateOfficeLocators.CrossSymbol1);
		Actions mouseOverHome = new Actions(driver);
		Actions mouseHome = mouseOverHome.moveToElement(builder).click();
		mouseHome.perform();
	}

	@And("^Click on the second cross button$")
	public void Click_on_the_second_cross_button() throws Throwable {
		logger.info("Click on the second cross symbol");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.CrossSymbol2));
		Boolean text1 = driver.findElement(CreateOfficeLocators.CrossSymbol2).isDisplayed();
		logger.info("Click on the second cross symbol: " + text1);
		WebElement builder = driver.findElement(CreateOfficeLocators.CrossSymbol2);
		Actions mouseOverHome = new Actions(driver);
		Actions mouseHome = mouseOverHome.moveToElement(builder).click();
		mouseHome.perform();
	}

	@And("^Scrollup request office$")
	public void Scrollup_request_office() throws Throwable {
		Thread.sleep(2000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(-0,-10)");
	}

	@And("^Deselect Contract Awards$")
	public void Deselect_Contract_Awards() {
		WebElement builder = driver.findElement(CreateOfficeLocators.DeselectContractAwards);
		Actions mouseOverHome = new Actions(driver);
		Actions mouseHome = mouseOverHome.moveToElement(builder).click();
		mouseHome.perform();
	}

	@And("^Deselect Financial Assistance Awards$")
	public void Deselect_Financial_Assistance_Awards() {
		WebElement builder = driver.findElement(CreateOfficeLocators.DeselectFinancialAssistanceAwards);
		Actions mouseOverHome = new Actions(driver);
		Actions mouseHome = mouseOverHome.moveToElement(builder).click();
		mouseHome.perform();
	}

	@And("^Deselect Contract Funding$")
	public void Deselect_Contract_Funding() {
		WebElement builder = driver.findElement(CreateOfficeLocators.DeselectContractFunding);
		Actions mouseOverHome = new Actions(driver);
		Actions mouseHome = mouseOverHome.moveToElement(builder).click();
		mouseHome.perform();
	}

	@And("^Deselect Financial Assistance Funding$")
	public void Deselect_Financial_Assistance_Funding() {
		WebElement builder = driver.findElement(CreateOfficeLocators.DeselectFinancialAssistanceFunding);
		Actions mouseOverHome = new Actions(driver);
		Actions mouseHome = mouseOverHome.moveToElement(builder).click();
		mouseHome.perform();
	}

	@Then("^Office address Required is not visible$")
	public void Office_address_word_Required_is_visible() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ShippingAddressRequired));
		Boolean Shipping = driver.findElement(CreateOfficeLocators.ShippingAddressRequired).isDisplayed();
		logger.info("Shipping address: " + Shipping);

		String ShippingAddressRequired = driver.findElement(CreateOfficeLocators.ShippingAddressRequired).getText();
		logger.info("Required : " + ShippingAddressRequired);
		logger.info("Required 1: " + CreateOfficeFields.Required);
		Assert.assertEquals(CreateOfficeFields.Required, ShippingAddressRequired);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.BillingAddressRequired));
		Boolean Billing = driver.findElement(CreateOfficeLocators.BillingAddressRequired).isDisplayed();
		logger.info("Billing address : " + Billing);

		String BillingAddressRequired = driver.findElement(CreateOfficeLocators.BillingAddressRequired).getText();
		logger.info("Required : " + BillingAddressRequired);
		logger.info("Required 1: " + CreateOfficeFields.Required);
		Assert.assertEquals(CreateOfficeFields.Required, BillingAddressRequired);
	}

	@Then("^Billing address word Required is visible$")
	public void Billing_address_word_Required_is_visible() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.BillingAddressRequired));
		Boolean Billing = driver.findElement(CreateOfficeLocators.BillingAddressRequired).isDisplayed();
		logger.info("Billing address status: " + Billing);

		String BillingAddressRequired = driver.findElement(CreateOfficeLocators.BillingAddressRequired).getText();
		logger.info("Required : " + BillingAddressRequired);
		logger.info("Required 1: " + CreateOfficeFields.Required);
		Assert.assertEquals(CreateOfficeFields.Required, BillingAddressRequired);
	}

	@Then("^Shipping address word Required is visible$")
	public void Shipping_address_word_Required_is_visible() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.ShippingAddressRequired));
		Boolean Shipping = driver.findElement(CreateOfficeLocators.ShippingAddressRequired).isDisplayed();
		logger.info("Shipping address status: " + Shipping);

		String ShippingAddressRequired = driver.findElement(CreateOfficeLocators.ShippingAddressRequired).getText();
		logger.info("Required : " + ShippingAddressRequired);
		logger.info("Required 1: " + CreateOfficeFields.Required);
		Assert.assertEquals(CreateOfficeFields.Required, ShippingAddressRequired);		
	}	
	  @Then("^Shipping address TAC2 cross symbol is visible$")
	public void Shipping_address_TAC2_cross_symbol_is_visible() {
			try {
				 WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.CrossSymbol1));
					Boolean ShippingCross = driver.findElement(CreateOfficeLocators.CrossSymbol1).isDisplayed();
					logger.info("Shipping address TAC2 cross symbol " + ShippingCross);	
			}catch(Exception e) {logger.info("Shipping address TAC2 not visiabe cross symbol"+ e);}
	}
	  @Then("^Billing address TAC3 cross symbol is visible$")
	  public void Billing_address_TAC3_cross_symbol_is_visible() {
			
			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				  wait.until(ExpectedConditions.visibilityOfElementLocated(CreateOfficeLocators.CrossSymbol2));
					Boolean BillingCross = driver.findElement(CreateOfficeLocators.CrossSymbol2).isDisplayed();
					logger.info("Billing address TAC3 cross symbol " + BillingCross);
			}catch(Exception e) {logger.info("Billing address TAC3 not visiabe cross symbol" + e );}
	  }
	  
	 
	  @And("^Scroll up to office type$")
	  public void  Scroll_up_to_office_type() throws Throwable {
		  Thread.sleep(2000);
			logger.info("Scroll up");
			((JavascriptExecutor) driver).executeScript("scroll(-0,-4)");
			Thread.sleep(2000);
	  }
	  
		@And("^Click on edit button on confirmation office Request page$")
		public void Click_on_edit_button_on_confirmation_office_Request_page() {
			WebElement builder = driver.findElement(CreateOfficeLocators.OfficeEdit);
			Actions mouseOverHome = new Actions(driver);
			Actions mouseHome = mouseOverHome.moveToElement(builder).click();
			mouseHome.perform();
		}
}
