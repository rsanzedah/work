package gov.gsa.automation.gsa_automation_serenity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;

public class HooksDemoStepDefs {

	Scenario scenario;

	@Managed

	WebDriver driver;

	public void method1() {

		System.out.println("...................Browser..........");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("start-maximized");
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@Before({ "@Registration" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@When("^Registration page Display$")
	public void registration_page_Display() throws Throwable {
		System.out.println("****Registration page Display");
		driver.get("http://www.google.com");

	}

	@Then("^Enter Valid Data$")
	public void enter_Valid_Data() throws Throwable {
		System.out.println("****Enter Valid Data");
	}

	@Then("^Close$")
	public void close() throws Throwable {
		System.out.println("****Close");
	}

	@After({ "@Registration" })
	public void tearDown(Scenario scenario) {
		System.out.println("****After******" + scenario.getName());
	}

	@When("^Registration page Display one$")
	public void registration_page_Display_one() throws Throwable {
		System.out.println("**** Registration page Display one ");
	}

	@Then("^Enter Valid Data one$")
	public void enter_Valid_Data_one() throws Throwable {
		System.out.println("**** Enter Valid Data one ");
	}

	@Then("^Close one$")
	public void close_one() throws Throwable {
		System.out.println("**** Close one ");
	}

}
