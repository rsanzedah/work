package gov.gsa.sam.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.gsa.sam.fields.CreateOfficeFields;
import gov.gsa.sam.fields.CreateOfficeLocators;
import gov.gsa.sam.fields.EditOfficePageFields;
import gov.gsa.sam.locators.EditOfficeLocators;
import gov.gsa.sam.locators.EditRequestOfficeLocators;
import net.thucydides.core.annotations.Managed;

public class NegEditReuqstofficeStepDef {
	@Managed
	public static WebDriver driver;
	Scenario scenario;
	Module1  module = new Module1();

	private static Logger logger = LoggerFactory.getLogger(NegEditReuqstofficeStepDef.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}	
	@And("^Edit office start date is not editable$")
	public void Edit_office_start_date_is_not_editable() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EditRequestOfficeLocators.editStartDate1));
		String value1 = driver.findElement(EditRequestOfficeLocators.editStartDate1).getAttribute("disabled");
		logger.info("Date is not editable: "+ value1);
		// getAttribute("disabled");
		String value2 = driver.findElement(EditRequestOfficeLocators.editStartMonth).getAttribute("disabled");
		logger.info("Month is not editable"+ value2);
		String value3 = driver.findElement(EditRequestOfficeLocators.editStartYear).getAttribute("disabled");
		logger.info("Year is not editable"+ value3);
		
	}
	@And("^AAC code is not editable$")
	public void AAC_code_is_not_editable() {
		String value1 = driver.findElement(EditRequestOfficeLocators.editAAC).getAttribute("disabled");
		logger.info("AAC is not editable"+value1);
		
	}
	
	@And("^The requestor is not edible$")
	public void The_requestor_is_not_edible() {
		String value1 = driver.findElement(EditRequestOfficeLocators.editName).getAttribute("disabled");
		logger.info("Name is not editable"+value1);
		String value2 = driver.findElement(EditRequestOfficeLocators.editEmail).getAttribute("disabled");
		logger.info("Email is not editable"+value2);
		String value3 = driver.findElement(EditRequestOfficeLocators.editPhone).getAttribute("disabled");
		logger.info("Phone is not editable"+value3);	
	}
	@Then("^Validating error message edits office page ([^\"]*)$")
	public void Validating_error_message_edits_office_page(String EditOfficeErrorMessage) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		if (EditOfficeErrorMessage.equalsIgnoreCase("Office Type")) {
			logger.info("\"Office Type  : " + EditOfficeErrorMessage);
			Thread.sleep(8);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(EditOfficeLocators.EndDate));
			module.ValidatesMethod(driver, EditOfficeLocators.EndDate, EditOfficePageFields.Enddate1);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(EditOfficeLocators.ContractAwardsStart));
			module.ValidatesMethod(driver, EditOfficeLocators.ContractAwardsStart, EditOfficePageFields.CAStartDate);
			module.ValidatesMethod(driver, EditOfficeLocators.CContractAwardsEnd, EditOfficePageFields.CAEndDate2);
			
			module.ValidatesMethod(driver, EditOfficeLocators.FinancialAssistanceAwardStart, EditOfficePageFields.FAAStartDate);
			module.ValidatesMethod(driver, EditOfficeLocators.FinancialAssistanceAwardsEnd, EditOfficePageFields.FAAEndDate2);
			
			module.ValidatesMethod(driver, EditOfficeLocators.ContractFundingStart, EditOfficePageFields.CFStartDate);
			module.ValidatesMethod(driver, EditOfficeLocators.ContractFundingEnd, EditOfficePageFields.CFEndDate2);
			
			module.ValidatesMethod(driver, EditOfficeLocators.FinancialAssistanceFundingStart, EditOfficePageFields.FAFStartDate);
			module.ValidatesMethod(driver, EditOfficeLocators.FinancialAssistanceFundingEnd, EditOfficePageFields.FAFEndDate2);
			Thread.sleep(6);
		
		
	}else {
		logger.info("Some thing in   : ");
		
	}

	}
}
