package gov.gsa.sam.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import gov.gsa.sam.locators.EditRequestOfficeLocators;
import gov.gsa.sam.fields.CreateOfficeFields;

import net.thucydides.core.annotations.Managed;

public class Module1 {

	@Managed
	// public static WebDriver driver;
	// Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(Module1.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	public void ValidatesMethod(WebDriver driver, By inputConstant, String inputFileConstant) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputConstant));
			String data = driver.findElement(inputConstant).getText().trim().toString();
			logger.info("inputConstant : " + data);
			logger.info("inputFileConstant 1: " + inputFileConstant);
			Assert.assertEquals(data, inputFileConstant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void ReadingValueFromEditableFields(WebDriver driver,By inputConstant, String inputFileConstant) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputConstant));
			String data = driver.findElement(inputConstant).getAttribute("value").trim().toString();;
			logger.info("inputConstant : " + data);
			logger.info("inputFileConstant 1: " + inputFileConstant);
			Assert.assertEquals(data, inputFileConstant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
