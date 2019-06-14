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
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.openhtmltopdf.util.Constants;

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

import net.thucydides.core.annotations.Managed;
import oldpages.CommonMethods;
import oldpages.Constants2;
import oldpages.ConstantsAccounts;
import oldpages.LaunchBrowserUtil;
import oldpages.MyWorkspacePage;
import oldpages.SignInUtility;
import oldpages.SigninPage;

public class FederalHierarchyStepDef extends Constants{
	//@Managed
	public static WebDriver driver;
//	Scenario scenario;
//	String withinlastCount;
//	String withinlastResult;
//	String scheduledTostart;
//	String scheduledTostartResult1;
//	/*String scheduledcount;
//	String scheduledResult1;*/

	private static Logger logger = LoggerFactory.getLogger(FederalHierarchyStepDef.class);
	public FederalHierarchyStepDef() {
    }
	//@Before({ "@Browser" })
//	public void setUp(Scenario scenario) {
	//	System.out.println("****Before******" + scenario.getName());
	//}

	/*@Given("^Launch Smoke browser$")
	public static void launch_Smoke_browser() {
		logger.info("start");
		driver = WebDriverManager.getDriver();
		logger.info("launch method complted");

	}
*/
	@Given("^user has an account in login dot gov domain$")
	public void user_has_an_account_in_login_dot_gov_domain() throws Exception {
		
		SignInUtility.signIntoCommonWorkspaceWithLoginDotGov("shah.raiaan+2@gsa.gov", Constants2.USERPASS,
				"6XA6VHAAALNL6Q7S");
				 
		
		
		
		
		
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
		Thread.sleep(5000);
		scheduledTostart = driver.findElement(MyWorkspace.scheduledToStartCount).getText();
		logger.info("scheduled count:" + scheduledTostart);

	}
	@And("Click on the scheduled to start")
	public void Click_on_the_scheduled_to_start() throws Throwable{
		/*TimeUnit.SECONDS.sleep(10);
		String eventsResult = driver.findElement(MyWorkspace.organizations).getText();
		logger.info("Events Result:" + eventsResult);*/
		TimeUnit.SECONDS.sleep(3000);
		//driver.findElement(MyWorkspace.scheduledToStart).click();	
		WebElement elt3 = driver.findElement(MyWorkspace.scheduledToStart);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		logger.info("Radio button");
		
		TimeUnit.SECONDS.sleep(50000);
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
	

	/*@And("^Click on the organization$")
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
	}*/

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
@Given("^Departmen browser sign out$")	
 public void method1() throws Throwable{
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//WebElement elt = (WebElement) driver.findElements(By.xpath("//*[@id=\"headerIconProfile\"]/i"));
	
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"headerIconProfile\"]/i"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header-link-signout\"]"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);
		driver.quit();
 }

}
