package gov.gsa.sam.stepdefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import gov.gsa.sam.locators.Locators;
import net.thucydides.core.annotations.Managed;

public class GmailStep {
	@Managed
	public static WebDriver driver;
	Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(GmailStep.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}
	  
	@And("^Search for an email$")
	public void  Search_for_an_email() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(Locators.GmailSearch).sendKeys("Federal Hierarchy - New office request submitted");
		driver.findElement(Locators.GmailSearch).sendKeys(Keys.ENTER);
		
	}

}
