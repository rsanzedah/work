package gov.gsa.sam.stepdefinition;


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
import net.thucydides.core.annotations.Managed;

public class FeddBackStep {
	@Managed
	public static WebDriver driver;
	Scenario scenario;
	String winHandleBefore1;

	private static Logger logger = LoggerFactory.getLogger(FeddBackStep.class);
	// LoginStepDef login = new LoginStepDef();

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Given("^Environment (\\w+)$")
	public void Environment(String urlConstant) throws Throwable {
		System.out.println("****COMP_HOME_PAGE. driver::" + driver);
		// driver.get("https://55samfrontendcomp.apps.prod-iae.bsp.gsa.gov/");

		System.out.println("One::" + urlConstant);
		// login.user_enters_environment(urlConstant,driver);

		System.out.println("HI::" + urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);

	}

	@And("^Click on provide feed back button$")
	public void Click_on_provide_feed_back_button() throws Throwable {
		Thread.sleep(3000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,3500)");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//a[@title=\'FAQS116\']")).click();
		WebElement elt3 = driver
				.findElement(By.xpath("//*[@id=\"main-container\"]/home/div[5]/div/div/div[2]/div/div[2]/h4"));
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);

		/*
		 * String winHandleBefore1 = driver.getWindowHandle(); for (String
		 * winHandle : driver.getWindowHandles()) {
		 * driver.switchTo().window(winHandle); }
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"question-0\"]/div/textarea")).
		 * sendKeys("Hi");
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//*[@id=\"button-question-1\"]")).click(
		 * ); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//*[@id=\"question-1\"]/div/textarea")).
		 * sendKeys("Hello");
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//*[@id=\"button-question-2\"]")).click(
		 * ); Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id=\"question-2\"]/div/div[1]/div[1]/label")).click();
		 * 
		 * 
		 * Thread.sleep(2000);
		 * 
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(
		 * "shanthi.dutta@gsa.gov");
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/app/sam-feedback/div/div/div[3]/div[1]/button[2]")).click
		 * ();
		 */

	}

	@And("^User enter like or dislike about beta.sam.gov$")
	public void User_enter_like_or_dislike_about_beta_sam_gov() throws Throwable {
		Thread.sleep(1000);
		winHandleBefore1 = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		driver.findElement(By.xpath("//*[@id=\"question-0\"]/div/textarea")).sendKeys("Hi");
		Thread.sleep(2000);

	}

	@And("^User enter what change or improvements would you suggest$")
	public void User_enter_what_change_or_improvements_would_you_suggest() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"button-question-1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"question-1\"]/div/textarea")).sendKeys("Hello");

		Thread.sleep(2000);
	}

	@And("^may we contact you if we have question about your feedback$")
	public void User_select_may_we_contact_you_if_we_have_question_about_your_feedback() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"button-question-2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"question-2\"]/div/div[1]/div[1]/label")).click();

	}

	@And("^User enter email id$")
	public void User_enter_email_id() {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("shanthi.dutta@gsa.gov");
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("/html/body/app/sam-feedback/div/div/div[3]/div[1]/button[2]")).click();
	}

	@And("^Click on learning center link$")
	public void Click_on_learn_center_link() throws Throwable {
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,3500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sam-footer\"]/div/div/nav/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(3000);
	}

	@And("^Click on the provide feed back button$")
	public void Click_provide_feed_back_button() throws Throwable {
		Thread.sleep(3000);
		WebElement elt3 = driver.findElement(By.xpath("//button[@title=\'Provide Feedback\']"));
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}
	
	@And("^User click on cancel button$")
	public void User_click_on_cancel_button() throws Throwable{
		driver.findElement(By.xpath("/html/body/app/sam-feedback/div/div/div[3]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		
	}
	@And("^Browser close$")
	public void Browser_close(){
		driver.quit();
	}
	
	
	@Then("^Check Warning you have feedback that has not been sumitted$")
	public void Check_Warning_you_have_feedback_that_has_not_been_sumitted() throws Throwable{
		Thread.sleep(1000);
		
		String val = "You have feedback that has not been submitted!";
		
		String val1 =  driver.findElement(By.xpath("//p[text()=\'You have feedback that has not been submitted!\']")).getText();
		logger.info("val1"+ val1);
		Assert.assertEquals(val, val1);
		//driver.findElement(By.xpath("/html/body/app/sam-feedback/div/div/div[3]/div[1]/button[1]")).click();
		
	}
	@And("^Click on date sets link$")
	public void Click_on_date_sets_link() throws Throwable{
		Thread.sleep(1000);
		WebElement elt3 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/nav/ul/li[2]/a"));
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);
		//driver.findElement(By.xpath("//*[@id\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/nav/ul/li[2]/a")).click();
	}
	
	@Then("^Click on confirm button$")
	public void Click_on_confirm_button() throws Throwable{
		Thread.sleep(1000);
		winHandleBefore1 = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		//driver.switchTo().alert().accept();
		
		//WebElement elt3 = driver.findElement(By.xpath("//button[text()=\'Confirm\']"));
		WebElement elt3 = driver.findElement(By.xpath("/html/body/app/sam-feedback/div/sam-modal/div/div/div[2]/div/sam-button[2]/button"));
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}
	
	@Then("^Click cancel button in alert warning$")
	public void click_cancel_button_in_alert_warning() throws Throwable{
		String val = "You have feedback that is not submitted. Do you want to proceed ahead?";
		String val2 = driver.findElement(By.xpath("/html/body/app/sam-feedback/div/sam-modal/div/div/div[2]/p")).getText();
		logger.info("You have feedback that is not submitted. "+val2);
		
		logger.info("Click on cancel buton");
		WebElement elt3 = driver.findElement(By.xpath("/html/body/app/sam-feedback/div/sam-modal/div/div/div[2]/div/sam-button[1]/button"));
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}
	
	@And("^Navigate into New to beta.SAM.gov page$")
	public void Navigate_into_New_to_betaSAMgov_page() throws Throwable{
		Thread.sleep(3000);
		String val = "While parts of this site are official, others are demonstration only and continue to be supported on one of our original websites shown below.";
		String val1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div[2]/div[2]/p[1]")).getText();
		
		//String val1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div[2]/div[2]/p[1]")).getText();
		Assert.assertEquals(val, val1);
		logger.info("Checking the assert");	
	}
	
	@Then("^Click on the provide feed back link$")
	public void Click_on_the_provide_feed_back_link() throws Throwable{
		winHandleBefore1 = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		logger.info("Click on fed back link");
		WebElement elt3 = driver.findElement(By.xpath("/html/body/app/sam-feedback/div/div/div[3]/div[2]/a"));
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);
	
	}
	
	@Then("^Navigate to policies page$")
	public void Navigate_to_policies_page(){
		String val = "The feedback surveys on beta.SAM.gov (information collections) meet the requirements of 44 U.S.C. § 3507, as amended by section 2 of the Paperwork Reduction Act of 1995. You do not need to answer these questions unless we display a valid Office of Management and Budget (OMB) control number. The OMB control number for our collections is 3090-0297. We estimate that it will take 3 minutes to read the instructions, gather the facts, and answer the questions. Send only comments relating to our time estimate, including suggestions for reducing this burden, or any other aspects of this collection of information to: General Services Administration, Regulatory Secretariat Division (MVCB), ATTN: Ms. Flowers/IC 3090-0297, 1800 F Street, NW, Washington, DC 20405.";
		String val1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/p[1]")).getText();
		Assert.assertEquals(val, val1);
		logger.info("Checking the assert");	
	}
	
	@Then("^Check the three question$")
	public void Check_the_three_question(){
		
		winHandleBefore1 = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		
		String question1 = "What do you like or dislike about beta.SAM.gov?";
		String question2 = "What changes or improvements would you suggest?";
		String question3 = "May we contact you if we have questions about your feedback?";
		
		String question11 = driver.findElement(By.xpath("//*[@id=\"button-question-0\"]")).getText();
		logger.info("question11:"+ question11);
		Assert.assertEquals(question1, question11);
		
		String question12 = driver.findElement(By.xpath("//*[@id=\"button-question-1\"]")).getText();
		logger.info("question12:"+ question12);
		Assert.assertEquals(question2, question12);
		
		
		String question13 = driver.findElement(By.xpath("//*[@id=\"button-question-2\"]")).getText();
		logger.info("question13:"+ question13);
		Assert.assertEquals(question3, question13);
	}
	
	@Then("^Check first radio button enabled$")
	public void Check_first_radio_button_enabled() throws Throwable{
		Thread.sleep(1400);
		logger.info("first radio button enabled");
		
		WebElement elt3 = driver.findElement(By.xpath("/html/body/app/sam-feedback/div/div/div[2]/div/sam-accordion/div/div[1]/span/i"));
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3);
		seriesOfActions3.perform();
		Thread.sleep(1400);
		
		Boolean val = driver.findElement(By.xpath("/html/body/app/sam-feedback/div/div/div[2]/div/sam-accordion/div/div[1]/span/i")).isEnabled();
		Assert.assertEquals(val, true);
		logger.info("first radio button enabled"+val);
		Thread.sleep(2000);
	}
	
	@Then("^Check second radio button enabled$")
	public void Check_second_radio_button_enabled() throws Throwable{
		Thread.sleep(1400);
		logger.info("second radio button enabled");
		
		WebElement elt3 = driver.findElement(By.xpath("/html/body/app/sam-feedback/div/div/div[2]/div/sam-accordion/div/div[2]/span/i"));
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3);
		seriesOfActions3.perform();
		Thread.sleep(1400);
		
		Boolean val = driver.findElement(By.xpath("/html/body/app/sam-feedback/div/div/div[2]/div/sam-accordion/div/div[2]/span/i")).isEnabled();
		Assert.assertEquals(val, true);
		logger.info("second radio button enabled"+val);
		Thread.sleep(2000);
	}
	

}
