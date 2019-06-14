/*package gov.gsa.sam.smokestepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gov.gsa.sam.base.FileReaderManager;
//import gov.gsa.sam.base.WebDriverManager;
import gov.gsa.sam.locators.DepartmentLocators;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.locators.MyWorkspace;
import gov.gsa.sam.locators.SubTierLocators;
import gov.gsa.sam.utils.Constants;
import net.thucydides.core.annotations.Managed;

public class FederalHierarchyStepDef {
	@Managed
	public static WebDriver driver;
	Scenario scenario;
	String withinlastCount;
	String withinlastResult;
	String scheduledTostart;
	String scheduledTostartResult1;
	String scheduledcount;
	String scheduledResult1;

	private static Logger logger = LoggerFactory.getLogger(FederalHierarchyStepDef.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Given("^Launch Smoke browser$")
	public static void launch_Smoke_browser() {
		logger.info("start");
		driver = WebDriverManager.getDriver();
		logger.info("launch method complted");

	}

	@And("^The user enters environment Smoke (\\w+)$")
	public static void The_user_enters_environment_Smoke(String urlConstant) throws Throwable {
		System.out.println("HI::" + urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);

	}

	@And("^The user click on Smoke sign in link$")
	public void The_user_click_on_Smoke_sign_in_link() throws Throwable {
		TimeUnit.SECONDS.sleep(2);
		//TimeUnit.SECONDS.sleep(3);
		logger.info(""+scenario );
		driver.findElement(HomePageLocator.navBarSignIn).click();
	}

	@And("^Then click on Smoke accept button$")
	public void Then_click_on_Smoke_accept_button() throws Throwable {
		TimeUnit.SECONDS.sleep(3);
		logger.info(""+scenario );
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters the Smoke email id (\\w+)$")
	public void the_user_enters_the_Smoke_email_id(String username) throws Throwable {
		TimeUnit.SECONDS.sleep(3);
		logger.info(""+scenario );
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(username);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^The user enters the Smoke password (\\w+)$")
	public void The_user_enters_the_Smoke_password(String password) {
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		logger.info(""+scenario );
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
		// driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys("Test@12345@12345");
		logger.info("Username entered --  " + scenario);

	}

	@Then("^The user click on Smoke sign in button$")
	public void The_user_click_on_Smoke_sign_in_button() {
		logger.info(""+scenario );
		driver.findElement(HomePageLocator.dropdownSignInButton).click();
	}

	@And("^The user want to receive your one time Smoke password (\\w+)$")
	public void The_user_want_to_receive_your_one_time_Smoke_password(String myEmail) throws Throwable {
		TimeUnit.SECONDS.sleep(8);
		((JavascriptExecutor) driver).executeScript("window.open('https://mail.google.com/mail/#inbox')");
		//driver.navigate().refresh();
		driver.navigate();
		TimeUnit.SECONDS.sleep(2);
		ArrayList<String> tab_handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 1));
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(myEmail);
		// String emailID = "shanthi.dutta@gsa.gov";
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(emailID);
		//driver.findElement(By.xpath("//*span[text()='Continue']")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//*[@class='qhFLie']")).click();
		TimeUnit.SECONDS.sleep(20);
		List<WebElement> lastMail = driver.findElements(By.className("zA"));// want
		logger.info("The size of the element: " + lastMail.size());
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(lastMail.get(0)).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
		TimeUnit.SECONDS.sleep(3);
		Constants.OTP = driver.findElement(Locators.iaeOtp).getText().substring(30, 38);
		logger.info("The captured OTP is- " + Constants.OTP);
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 2));
	}

	@And("^The user enters Smoke one time access code$")
	public void the_user_enters_Smoke_one_time_access_code() throws Throwable {
		
		logger.info("Constants.OTP:::::" + Constants.OTP);
		logger.info(""+scenario );
		TimeUnit.SECONDS.sleep(3);
		//driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(Constants.OTP);
		
	}

	@Then("^The user click on Smoke one time submit button$")
	public void The_user_click_on_Smoke_one_time_submit_button() throws Throwable {
		logger.info("otp submitted:" + scenario);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();

	}

	@Given("^Click on the last 90 days radio button$")
	public void Click_on_the_last_90_days_radio_button() throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		TimeUnit.SECONDS.sleep(30);
		WebElement elt3 = driver.findElement(MyWorkspace.withinLastDays);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		logger.info("Radio button");
		Thread.sleep(10);
		// TimeUnit.SECONDS.sleep(60);
		withinlastCount = driver.findElement(MyWorkspace.withinLastDaysCount).getText();
		logger.info("With in last 90 days:" + withinlastCount);
	}

	@And("^Click on the organization started$")
	public void Click_on_the_organization_started() throws Throwable {

		TimeUnit.SECONDS.sleep(10);
		WebElement elt4 = driver.findElement(MyWorkspace.organizationsStarted);
		Actions builder4 = new Actions(driver);
		Actions seriesOfActions4 = builder4.moveToElement(elt4).click();
		seriesOfActions4.sendKeys(Keys.ENTER);
		seriesOfActions4.perform();

	}

	@Then("^The user navigates into organization events page$")
	public void The_user_navigates_into_organization_events_page() throws Throwable {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(10);
		String eventsResult = driver.findElement(MyWorkspace.organizationsEventsResults).getText();
		logger.info("Events Result:" + eventsResult);
		TimeUnit.SECONDS.sleep(10);
		String s = eventsResult;
		 String[] ofResults =s.split("of ");
	       String[] spaceResults = ofResults[1].split(" ");
	       String withinlastResult =  spaceResults[0].replaceAll(",", "");
		logger.info("Second with in last 90 Result:" + withinlastResult);
		TimeUnit.SECONDS.sleep(3);
		 Assert.assertEquals(withinlastCount, withinlastResult);
		driver.findElement(MyWorkspace.workspace).click();

	}

	@Given("^Click on the scheduled for next 90 days$")
	public void Click_on_the_scheduled_for_next_90_days() throws Throwable {
		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		TimeUnit.SECONDS.sleep(10);
		WebElement elt3 = driver.findElement(MyWorkspace.scheduled);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		logger.info("Radio button");
		Thread.sleep(10);
		scheduledTostart = driver.findElement(MyWorkspace.scheduledToStartCount).getText();
		logger.info("scheduled count:" + scheduledTostart);

	}
	@And("Click on the scheduled to start")
	public void Click_on_the_scheduled_to_start() throws Throwable{
		TimeUnit.SECONDS.sleep(10);
		String eventsResult = driver.findElement(MyWorkspace.organizations).getText();
		logger.info("Events Result:" + eventsResult);
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(MyWorkspace.scheduledToStart).click();		
	}
	
	@Then("^Navigates into scheduled organization events page$")
	public void Navigates_into_scheduled_organization_events_page() throws Throwable{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(10);
		String scheduledResult = driver.findElement(MyWorkspace.organizationsEventsResults).getText();
		logger.info("Scheduled Events Result:" + scheduledResult);
		String s = scheduledResult;
		String[] ofResults = s.split("of ");
		String[] spaceResults = ofResults[1].split(" ");
		 scheduledTostartResult1 = spaceResults[0];
		logger.info("Scheduled Result:" + scheduledTostartResult1);
		Assert.assertEquals(scheduledTostart, scheduledTostartResult1);
		logger.info("successfully completed");
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(MyWorkspace.workspace).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("scroll(0,-2500)");
		//TimeUnit.SECONDS.sleep(30);
		
	}
	

	@And("^Click on the organization$")
	public void Click_on_the_organization() throws Throwable {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(10);
		String eventsResult = driver.findElement(MyWorkspace.organizations).getText();
		logger.info("Events Result:" + eventsResult);
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(MyWorkspace.workspace).click();

	}

	@Then("^Navigates into organization event$")
	public void Navigates_into_organization_event() throws Throwable {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(10);
		String scheduledResult = driver.findElement(MyWorkspace.organizationsEventsResults).getText();
		logger.info("Scheduled Events Result:" + scheduledResult);
		String s = scheduledResult;
		String[] ofResults = s.split("of ");
		String[] spaceResults = ofResults[1].split(" ");
		String scheduledResult1 = spaceResults[0];
		System.out.println(scheduledResult1);
		logger.info("Scheduled Result:" + scheduledResult1);
		TimeUnit.SECONDS.sleep(20);
	}

	@Given("^User click on above Go to Federal Hierarchy$")
	public void User_click_on_above_Go_to_Federal_Hierarchy() throws Throwable {
		logger.info("Federal Hierarchy");
		Thread.sleep(5);
		((JavascriptExecutor) driver).executeScript("scroll(0,-3500)");
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(20);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/div/div/div/div/div[2]/div/div[3]/a"));
		logger.info(""+scenario );
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("Workspace" + driver.getTitle(), scenario);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@And("^The user click on createdept button$")
	public void The_user_click_on_createdept_button() throws Throwable {
		logger.info("create department button", scenario);
		Thread.sleep(2000);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[1]/button"));
		logger.info(""+scenario );
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("Click Create Dept"  + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("^Navigate into create department page$")
	public void Navigate_into_create_department_page(){
		logger.info(""+scenario );
		String detailseqRuired = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/div"))
				.getText();
		Assert.assertEquals("Please provide details required to create a Department/Ind. Agency", detailseqRuired);	
		logger.info(" create department navigate");
	}
	@And("^The user click on cancel button$")
	public void The_user_click_on_cancel_button(){
		logger.info(""+scenario );
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/button")).click();
	}
	@Given("^The user click on first link$")
	public void The_user_click_on_first_link() throws Throwable{
		Thread.sleep(2000);
		//WebElement elt5 = driver.findElement(SubTierLocators.firstLink);
		WebElement elt5 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div[1]/div[2]/div[1]/a"));
		Actions builder5 = new Actions(driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		logger.info("The user click on the sub tier codes submit button", scenario);

		
	}
	@Then("Navigate into federal hierarchy deparment page")
	public void Navigate_into_federal_hierarchy_deparment_page() throws Throwable{
		Thread.sleep(20);
		String value = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[2]/title-and-section/div/h1/div")).getText();
		Assert.assertEquals("FEDERAL HIERARCHY", value);
		logger.info(""+scenario );
	}
	@And("^The click on edit button$")
	public void The_click_on_edit_button() throws Throwable{
		logger.info("The user click on edit sub tier detail", scenario);
		Thread.sleep(2000);

		//WebElement elt4 = driver.findElement(SubTierLocators.editSubTier1);
		WebElement elt4 = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div/button"));
		Thread.sleep(2000);
		logger.info(""+scenario );
		Actions builder4 = new Actions(driver);
		Actions seriesOfActions4 = builder4.moveToElement(elt4).click();
		seriesOfActions4.perform();
		Thread.sleep(1400);

		
	}
	@And("^The click on edit cancel button$")
	public void The_click_on_edit_cancel_button() throws Throwable{
		//WebElement elt4 = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/form/div[5]/button"));
		//WebElement elt4 = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[2]/button"));
		WebElement elt4 = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/form/div[2]/button"));
		Thread.sleep(2000);
		logger.info(""+scenario );
		Actions builder4 = new Actions(driver);
		Actions seriesOfActions4 = builder4.moveToElement(elt4).click();
		seriesOfActions4.perform();
		Thread.sleep(1400);

		
	}
	@Given("The user click on create sub tier button")
	public void The_user_click_on_create_sub_tier_button() throws Throwable{
		
((JavascriptExecutor) driver).executeScript("scroll(0,-2000)");
		
		logger.info("Create Sub Tier", scenario);
		WebElement elt5 = driver.findElement(SubTierLocators.crateSubTier);
		Thread.sleep(2000);
		Actions builder5 = new Actions(driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		
	}
	@Then("^The user click on create sub tier cancel button$")
	public void The_user_click_on_create_sub_tier_cancel_button() throws Throwable{
		logger.info("Create Sub Tier", scenario);
		WebElement elt5 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/button"));
		Thread.sleep(1400);
		Actions builder5 = new Actions(driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		
	}

}
*/