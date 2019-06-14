package gov.gsa.sam.stepdefinition;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.text.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gov.gsa.sam.fields.Constants;
import gov.gsa.sam.fields.DepartmentField;
import gov.gsa.sam.locators.DepartmentLocators;
import gov.gsa.sam.locators.feedsLocators;
import net.thucydides.core.annotations.Managed;

public class FeedsStepDef {
	Date fullDateStrDate1;
	public static String tempDate;
	public static String nameList ;
	public static String DateTimeStamp;
	public static String reading;
	public static String date;
	public static String reading2;
	public static String date2;
	@Managed
	public static WebDriver driver;
	public static WebDriverWait wait;
	private static Logger logger = LoggerFactory.getLogger(FeedsStepDef.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Given("^Click on go to Assistance listings$")
	public void Click_on_go_to_Assistance_listings() throws Throwable {
		Thread.sleep(5000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@title=\'FAQS116\']")).click();
		WebElement elt3 = driver.findElement(feedsLocators.GotoAssistance);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
	}

	@And("^Click on add listing button$")
	public void Click_on_add_listing_button() throws Throwable {
		Thread.sleep(8000);
		driver.findElement(feedsLocators.ClickAssistance).click();
	}

	@And("^Fill the header information details$")
	public void Fill_the_header_information_details() throws Throwable {
		Thread.sleep(2000);

		Random r1 = new Random();
		String outputs = "";
		for (int i = 0; i < 3; i++)
			outputs += r1.nextInt(1000);
		nameList = "Test" + outputs;
		driver.findElement(feedsLocators.Title).sendKeys(nameList);
		Thread.sleep(2000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.FederalAgency).sendKeys("General Services Administration");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.FederalAgency).sendKeys(Keys.DOWN);
		// Actions action = new Actions(driver);
		// action.keyDown(Keys.DOWN).build().perform();
		driver.findElement(feedsLocators.FederalAgency).sendKeys(Keys.ENTER);
		logger.info("Select drop down list");
		Thread.sleep(2000);
		Random r = new Random();
		String output = "";
		for (int i = 0; i < 3; i++)
			output += r.nextInt(1000);
		logger.info("output:" + output);
		driver.findElement(feedsLocators.CfDA).sendKeys(output);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.CfDA).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.next).click();
	}

	@And("^Fill the overview details$")
	public void Fill_the_overview_details() throws Throwable {
		Thread.sleep(4000);
		driver.findElement(feedsLocators.Overview).sendKeys("Hi");
		driver.findElement(feedsLocators.Overview).sendKeys(Keys.TAB);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.FunctionalCodes).sendKeys("Resource Conservation and");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.FunctionalCodesDropdowm).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.SubjectTerms).sendKeys("Education");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.SubjectTermsDropdowm).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.next).click();
	}

	@And("^Fill the authorization details$")
	public void Fill_the_authorization_details() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AddAuthorization).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Act).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.ActDone).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.next).click();
		Thread.sleep(2000);
	}

	@And("^Fill the obligations details$")
	public void Fill_the_obligations_details() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.NewObligationButton).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AssistanceType).sendKeys("Hi");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.MultipleAssistanceType).click();

		// driver.findElement(feedsLocators.AssistanceType).sendKeys(Keys.ENTER);

		driver.findElement(feedsLocators.NotSeparately1).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.NotSeparatelyText1).sendKeys("Hi");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.NotSeparatelyText1).sendKeys(Keys.TAB);
		// driver.findElement(feedsLocators.NotSeparatelyText1).sendKeys(Keys.TAB);

		driver.findElement(feedsLocators.NotSeparately2).click();
		Thread.sleep(2000);
		// driver.findElement(feedsLocators.NotSeparatelyText1).sendKeys("the");
		Thread.sleep(2000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);

		driver.findElement(feedsLocators.NotSeparately3).click();
		Thread.sleep(2000);
		// driver.findElement(feedsLocators.NotSeparately3).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		// driver.findElement(feedsLocators.NotSeparatelyText1).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AddObligation).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.next).click();
		Thread.sleep(2000);

	}

	@And("^Fill other Financial Information details$")
	public void Fill_other_Financial_Information_details() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AccomplishmentsNotApplicatin).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AddAccountIdentification).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AccountIdentificationCode).sendKeys("11111111111");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AddCode).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AddTAFSCodes).click();

		Thread.sleep(2000);
		driver.findElement(feedsLocators.TreasuryDept).sendKeys("11");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.TreasuryAccount).sendKeys("1112");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AddCode2).click();
		;
		Thread.sleep(2000);
		driver.findElement(feedsLocators.next).click();
		Thread.sleep(2000);
	}

	@And("^Fill criteria for applying details$")
	public void Fill_criteria_for_applying_details() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.DocumentationRequired).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.ApplicantEligibility).sendKeys("u");
		Thread.sleep(2000);
		// driver.findElement(feedsLocators.Multiple1).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(feedsLocators.Multiple1).click();
		// driver.findElement(feedsLocators.Multiple1).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.BeneficiaryEligibility).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.LengthAndTimePhasingOfAssistance).sendKeys("The  are so many stories");
		Thread.sleep(2000);
		Select drpCountry = new Select(driver.findElement(feedsLocators.assistanceAwarded));
		drpCountry.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.UseOfAssistance).sendKeys("N");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.UseOfAssistanceMultiple).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.specificTerms).sendKeys("The  are so many stories");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.UseRestrictions).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.discretionaryFunds).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.loansAType).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.next).click();
		Thread.sleep(2000);
	}

	@And("^Fill applying for Assistance details$")
	public void Fill_applying_for_Assistance_details() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Deadlines).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AwardProcedure).sendKeys("Test 123");
		Thread.sleep(2000);
		Select drpCountry = new Select(driver.findElement(feedsLocators.DateRange));
		Thread.sleep(2000);
		drpCountry.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.OtherApproval).sendKeys("Test456");
		Thread.sleep(2000);
		Select drpCountry1 = new Select(driver.findElement(feedsLocators.Renewals));
		Thread.sleep(2000);
		drpCountry1.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.OtherRenewalInformation).sendKeys("Test456");
		Thread.sleep(2000);
		Select drpCountry2 = new Select(driver.findElement(feedsLocators.Appeals));
		Thread.sleep(2000);
		drpCountry2.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.OtherAppealsInformation).sendKeys("Test789");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.next).click();
		Thread.sleep(2000);
	}

	@And("^Fill compliance requirements details$")
	public void Fill_compliance_requirements_details() throws Throwable {
		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		TimeUnit.SECONDS.sleep(30);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Audits).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Regulations).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.next).click();
	}

	@And("^Fill contact information details$")
	public void Fill_contact_information_details() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Entries).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Name).sendKeys("sh");
		Thread.sleep(8000);
		driver.findElement(feedsLocators.NameMuliple).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.add).click();
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Done1).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Publish).click();
		Thread.sleep(2000);
	}

	@Then("^Click on submit button$")
	public void Click_on_submit_button() throws Throwable {
		Thread.sleep(5000);
		String NameOflisting = driver.findElement(feedsLocators.Listings).getText();
		logger.info("NameOflisting:::" + NameOflisting);
		String str = NameOflisting.replace("\n", " ");
		logger.info("NameOflisting::" + str);
		logger.info("nameList::" + nameList);

		// Assert.assertTrue(nameList.contains(str));
		// Assert.assertEquals(nameList, NameOflisting);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AssistanceListings).click();
		Thread.sleep(2000);
	}

	@Given("^Click on the notification bell$")
	public void Click_on_the_notification_bell() throws Throwable {
		Thread.sleep(4000);
		driver.findElement(feedsLocators.notification).click();
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(feedsLocators.ShowAll));
		driver.findElement(feedsLocators.ShowAll).click();
		Thread.sleep(2000);
	}

	@And("^Click on Submit AL$")
	public void Click_on_submit_al() throws Throwable {
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(feedsLocators.SubmitAl));
		driver.findElement(feedsLocators.SubmitAl).click();
		Thread.sleep(2000);
	}

	@And("^Click on Sent tab$")
	public void Click_on_Sent_tab() throws Throwable {
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(feedsLocators.SentTab));
		driver.findElement(feedsLocators.SentTab).click();
		Thread.sleep(2000);

	}

	@And("^Read the text data$")
	public void Read_the_text_data() throws Throwable {
		Thread.sleep(2000);
		reading = driver.findElement(feedsLocators.ReadData).getText();
		logger.info("Reading data list :" + reading);
		Thread.sleep(2000);

		Thread.sleep(2000);
		date = driver.findElement(feedsLocators.date).getText();
		logger.info("Reading date  :" + date);
		Thread.sleep(2000);
	}

	@And("^Read the text data as Assistnce user$")
	public void Read_the_text_data_as_Assistnce_user() throws Throwable {
		Thread.sleep(2000);
		reading2 = driver.findElement(feedsLocators.ReadData).getText();
		logger.info("Reading data list :" + reading2);
		Thread.sleep(2000);

		Thread.sleep(2000);
		date2 = driver.findElement(feedsLocators.date).getText();
		logger.info("Reading date2  :" + date2);
		Thread.sleep(2000);

	}

	@And("^Click on received tab$")
	public void Click_on_received_tab() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Received).click();
		// logger.info("Reading date list :"+ reading);
		Thread.sleep(2000);
	}

	@Given("^Click on the notification$")
	public void Click_on_the_notification() throws Throwable {
		Thread.sleep(6000);
		driver.findElement(feedsLocators.notification).click();
		Thread.sleep(2000);

	}

	@And("^Click on the show all request$")
	public void Click_on_the_show_all_request() throws Throwable {
		Thread.sleep(8000);
		driver.findElement(feedsLocators.ShowALlRequests).click();
		Thread.sleep(2000);
	}

	@Given("^User unselect published$")
	public void User_unselect_published() throws Throwable {
		Thread.sleep(8000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(8000);
		driver.findElement(feedsLocators.published).click();
		Thread.sleep(2000);
	}

	@And("^Search for a keyword$")
	public void Search_for_a_keyword() throws Throwable {
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(feedsLocators.Search));
		driver.findElement(feedsLocators.Search).sendKeys(nameList);
		// driver.findElement(feedsLocators.Search).sendKeys("Test55732545");
		Thread.sleep(2000);
		driver.findElement(feedsLocators.SearchButton).click();
		Thread.sleep(2000);
	}

	@Then("^Read the timestamp$")
	public void Read_the_timestamp() throws Throwable {
		Thread.sleep(8000);
		DateTimeStamp = driver.findElement(feedsLocators.DateTimeStamp).getText();
		logger.info("DateTimeStamp :" + DateTimeStamp);
		Thread.sleep(2000);

		// String[] str1Split = str1.split("\n");
		// String dateTimePart = str1Split[1];
		// String fullDateStr = "Dec 19, 2018 12:58 pm";

		SimpleDateFormat sdf = new SimpleDateFormat("hh:mmaaa");
		// Date dateTimePartDate = sdf.parse(dateTimePart);
		// System.out.println(dateTimePartDate);

		SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd, yyyy hh:mm aaa");
		Date fullDateStrDate = sdf1.parse(DateTimeStamp);
		tempDate = sdf.format(fullDateStrDate);
		logger.info("tempDate: " + tempDate);
		fullDateStrDate1 = sdf.parse(tempDate);
		logger.info("fullDateStrDate1: " + fullDateStrDate1);

		// System.out.println(dateTimePartDate.equals(fullDateStrDate1));
	}

	@And("^Scroll down$")
	public void Scroll_down() throws Throwable {
		Thread.sleep(2000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(2000);

	}

	@And("^Scroll up$")
	public void Scroll_up() throws Throwable {
		Thread.sleep(2000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(-0,-500)");
		Thread.sleep(2000);
	}

	@Then("^Context validating in sent tab$")
	public void Context_validating_in_sent_tab() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(reading2.contains("You"));
		Thread.sleep(2000);
		Assert.assertTrue(reading2.contains(nameList));
		Thread.sleep(2000);
		logger.info("tempDate:" + tempDate);
		logger.info("date2:" + date2);
		Assert.assertTrue(date2.equals(tempDate));
	}

	@Then("^Validating context in receive tab$")
	public void Validating_context_in_receive_tab() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(reading.contains("Shanthi Dutta"));
		Thread.sleep(2000);
		Assert.assertTrue(reading.contains(nameList));
		Assert.assertTrue(date.equals(tempDate));

	}

	@Given("^Select RoleAssignments$")
	public void Select_RoleAssignments() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.RoleAssignments).click();
		Thread.sleep(2000);

	}

	@Then("^Unselect RoleAssignments$")
	public void Unselect_RoleAssignments() throws Throwable {
		driver.findElement(feedsLocators.SearchButton).click();
		Thread.sleep(2000);
	}

	@And("^Select Pending$")
	public void Select_Pending() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Pending).click();
		Thread.sleep(2000);
	}

	@Then("^Unselect Pending$")
	public void Unselect_Pending() throws Throwable {
		driver.findElement(feedsLocators.Pending).click();
		Thread.sleep(2000);

	}

	@And("^Select Approved$")
	public void Select_Approved() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Approved).click();
		Thread.sleep(2000);

	}

	@Then("^Unselect Approved$")
	public void Unselect_Approved() throws Throwable {
		driver.findElement(feedsLocators.Approved).click();
		Thread.sleep(2000);

	}

	@And("^Select Reject$")
	public void Select_Reject() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Rejected).click();
		Thread.sleep(2000);

	}

	@Then("^Unselect Reject$")
	public void Unselect_Reject() throws Throwable {
		driver.findElement(feedsLocators.Rejected).click();
		Thread.sleep(2000);
	}

	@And("^Select Canceled$")
	public void Select_Canceled() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Canceled).click();
		Thread.sleep(2000);
	}

	@Then("^Unselect Canceled$")
	public void Unselect_Canceled() throws Throwable {
		driver.findElement(feedsLocators.Canceled).click();
		Thread.sleep(2000);
	}

	@And("^Select Complete$")
	public void Select_Complete() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.Complete).click();
		Thread.sleep(2000);

	}

	@And("^Select Clear Filters$")
	public void Select_Clear_Filters() {
		driver.findElement(feedsLocators.ClearFilters).click();
	}

	@And("^Click on Assistance Listings link$")
	public void Click_on_Assistance_Listing_link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.AssistanceListing1).click();
	}

	@Then("^Click on Submit button$")
	public void Click_on_Submit_button() throws Throwable {
		Thread.sleep(12000);
		driver.findElement(feedsLocators.submit).click();
	}

	@And("^Enter the data in submission comment$")
	public void Enter_the_data_in_submission_comment() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(feedsLocators.SubmissionComment).sendKeys("Done");
	}

	@Then("^Click on submit to OMB$")
	public void Click_on_submit_button1() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(feedsLocators.SubmitToOMB).click();
		Thread.sleep(10000);
	}

	@And("^Read the status of assisting listing$")
	public void Read_the_status_of_assisting_listing() throws Throwable {
		Thread.sleep(1000);
		String val1 = driver.findElement(feedsLocators.Pending1).getText();
		logger.info("Pending :" + val1);
		Assert.assertTrue(val1.equals(Constants.Pending));
	}

	@Then("^Context validating in received tab$")
	public void Context_validating_in_received_tab() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(reading2.contains("You"));
		Thread.sleep(2000);
		Assert.assertTrue(reading2.contains(nameList));
		Thread.sleep(2000);
		Assert.assertTrue(date2.equals(tempDate));
	}

	@And("^Click on Publish AL$")
	public void Click_on_publish_al() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(feedsLocators.PublishAL).click();
		Thread.sleep(2000);
	}

	@Then("^Click on publish button$")
	public void Click_on_publish_button() throws Throwable {
		Thread.sleep(8000);
		driver.findElement(feedsLocators.AssistnacePublish).click();
	}

	@Then("^Click on assistance publish button$")
	public void Click_on_assistance_publish_button() throws Throwable {
		Thread.sleep(8000);
		driver.findElement(feedsLocators.Publish1).click();
	}

	@And("^Enter the data in OMB comment$")
	public void Enter_the_data_in_OMB_comment() throws Throwable {
		Thread.sleep(4000);
		driver.findElement(feedsLocators.TextAreaPublish).sendKeys("Done");
		/*Thread.sleep(2000);
		 driver.findElement(feedsLocators.Publish1).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
	}

	@And("^Read the Approve status of assisting listing$")
	public void Read_the_Approve_status_of_assisting_listing() throws Throwable {
		Thread.sleep(1000);
		String val1 = driver.findElement(feedsLocators.Approved1).getText();
		logger.info("Approved :" + val1);
		Assert.assertTrue(val1.equals(Constants.Approved));
	}

	@Given("^User click om HHS published$")
	public void User_click_om_HHS_published() throws Throwable {
		Thread.sleep(6000);
		Boolean available = driver.findElement(feedsLocators.HHSPublished).isDisplayed();
		logger.info("Displayed: "+ available);
		  driver.findElement(feedsLocators.HHSPublished).click();
		
		/*WebElement elt3 = driver.findElement(feedsLocators.HHSPublished);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);*/
		  Thread.sleep(5000);
	}
	
	@Then("^No result found$")
	public void No_result_found() throws Throwable {
		Thread.sleep(5000);
		String val1 = driver.findElement(feedsLocators.HHSResult).getText();
		logger.info("No Reult :" + val1);
		Assert.assertTrue(val1.contains(Constants.NORESULTS));

	}
	
	
	@And("^Search for the above Assistance Listings keyword$")
	public void Search_for_the_above_Assistance_Listings_keyword() throws Throwable{
		Thread.sleep(2000);
		driver.findElement(feedsLocators.SearchRequest).sendKeys(nameList);
		Thread.sleep(2000);
		driver.findElement(feedsLocators.SearchRequest).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	@Given("^Browser signout$")
	public void Browser_signout() throws Throwable{
		Thread.sleep(6000);
		driver.quit();
		driver.close();
	}
	
	@And("^Click on the show all request1$")
	public void Click_on_the_show_all_request1() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(feedsLocators.OMBAnalystShowAll).click();
		Thread.sleep(2000);
		
	}
	

}
