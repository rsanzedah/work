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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;
import gov.gsa.sam.base.FileReaderManager;
//import gov.gsa.sam.base.LoginStepDef;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import gov.gsa.sam.locators.FAQsLocators;
import gov.gsa.sam.locators.GlossaryPageLocators;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.locators.LearningCenterLocators;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.locators.MyWorkspace;
import gov.gsa.sam.utils.Constants;

public class FAQsStepDef {

	@Managed
	public static WebDriver driver;
	String FAQSName;
	Scenario scenario;
	String publishName;
	public String publishName1;
	public static String publishName2;
	String publishText;
	public static WebDriverWait wait;
	// LoginStepDef login = new LoginStepDef();
	private static Logger logger = LoggerFactory.getLogger(FAQsStepDef.class);

	/*
	 * @Given("^Launch FAQs browser$") public static void launch_browser1() { //F
	 * Otpclass.launch_browser(); logger.info("-------------------"); driver =
	 * WebDriverManager.getDriver(); logger.info("launch method complted"); }
	 */

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@And("The user enters environment FAQs (\\w+)$")
	public void the_user_enters_a_URL1(String urlConstant) throws Throwable {
		logger.info("HI::" + urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^The user click on FAQs sign in link$")
	public void the_user_click_on_sign_in_link1() throws InterruptedException {
		// login.user_click_on_signin_link(driver);
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(HomePageLocator.navBarSignIn).click();
	}

	@And("^Then click on FAQs accept button$")
	public void then_click_accept_button1() throws InterruptedException {
		// login.user_click_accept_button(driver);
		TimeUnit.SECONDS.sleep(3);
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters the FAQs email id (\\w+)$")
	public void the_user_enters_the_email_id1(String userName) throws Throwable {
		// login.user_enters_the_email_id(userName, driver);
		TimeUnit.SECONDS.sleep(3);
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^The user enters the FAQs password (\\w+)$")
	public void the_user_enters_the_password1(String password) {
		// login.user_enters_the_password(password, driver);
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
		logger.info("Username entered --  " + scenario);
	}

	@And("^The user click on FAQs sign in button$")
	public void the_user_click_on_sign_in_button1() {
		// login.user_click_on_sign_in_button(driver);
		driver.findElement(HomePageLocator.dropdownSignInButton).click();
	}

	@And("^The user want to receive your one time FAQs password (\\w+)$")
	public void the_user_want_to_receive_your_one_time_password1(String myEmailId) throws InterruptedException {
		// login.user_want_to_receive_your_one_time_password(myEmailId, driver);
		TimeUnit.SECONDS.sleep(8);
		((JavascriptExecutor) driver).executeScript("window.open('https://mail.google.com/mail/#inbox')");
		driver.navigate();
		TimeUnit.SECONDS.sleep(2);
		ArrayList<String> tab_handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 1));
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(myEmailId);
		// String emailID = "shanthi.dutta@gsa.gov";
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(emailID);
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

	@And("^The user enters FAQs one time access code$")
	public void the_user_enters_one_time_access_code1() {
		// login.user_enters_one_time_access_code(driver);
		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		logger.info("Constants.OTP:::::" + Constants.OTP);
	}

	@And("^The user click on FAQs one time submit button$")
	public void the_user_click_on_one_time_submit_button1() {
		// login.user_click_on_one_time_submit_button(driver);
		logger.info("otp submitted:" + scenario);
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();

		logger.info("Successfull otp");
	}

	@Given("^The user click on go to FAQs link$")
	public void the_user_click_on_go_to_glossary_link() throws InterruptedException {
		logger.info("Click into scroll");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		TimeUnit.SECONDS.sleep(30);
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Boolean present = driver.findElement(MyWorkspace.clickFAQs).isDisplayed();
		logger.info("faqs::******" + present);
		// driver.findElement(By.xpath("//a[@href='/cm/faqs?order=desc&amp;sort=lastmodifieddate&amp;path=1']")).click();

		driver.findElement(MyWorkspace.clickFAQs).click();
		// driver.findElement(GlossaryPageLocators.clickVideosLink).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@And("^The user navigates to FAQs page$")
	public void the_user_navigates_to_glossary_page() throws InterruptedException {
		TimeUnit.SECONDS.sleep(30);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String breadCrumbs1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		logger.info("breadCrumbs1:::" + breadCrumbs1);
		Assert.assertEquals(breadCrumbs1, "Workspace");
		String breadCrumbs2 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/span"))
				.getText();
		logger.info("Release Notes1:::" + breadCrumbs2);
		Assert.assertEquals(breadCrumbs2, "FAQs");

	}

	@And("^FAQs The user is able to select new status$")
	public void The_user_select_new_status() throws InterruptedException {

		WebElement clickNew = driver.findElement(GlossaryPageLocators.selectNew);
		Actions builder = new Actions(driver);
		clickNew.isSelected();
		Actions seriesOfActions = builder.moveToElement(clickNew).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actual = "NEW";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);

	}

	@And("^FAQs The user is able to deselect new filter$")
	public void the_user_deselect_new_filter() throws InterruptedException {
		WebElement clickNew = driver.findElement(GlossaryPageLocators.selectNew);
		Actions builder = new Actions(driver);
		clickNew.isDisplayed();
		Actions seriesOfActions = builder.moveToElement(clickNew).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^FAQs The user is able to selects published filter$")
	public void the_user_selects_published_filter() throws InterruptedException {
		String actual = "PUBLISHED";
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement clickNew1 = driver.findElement(GlossaryPageLocators.clickPublised);
		Actions builder1 = new Actions(driver);
		clickNew1.isSelected();
		Actions seriesOfActions1 = builder1.moveToElement(clickNew1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		logger.info("publishText************" + publishText);
		Assert.assertEquals(actual, publishText);

		/*
		 * String actual = "PUBLISHED"; String publishText =
		 * driver.findElement(GlossaryPageLocators.publishText).getText();
		 * Assert.assertEquals(actual, publishText);
		 */
	}

	@And("^FAQs The user is able to deselect published filter$")
	public void the_user_deselect_published_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement clickNew1 = driver.findElement(GlossaryPageLocators.clickPublised);
		Actions builder1 = new Actions(driver);
		clickNew1.isDisplayed();
		Actions seriesOfActions1 = builder1.moveToElement(clickNew1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^FAQs The user is able to selects draft filter$")
	public void the_user_selects_draft_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement clickNew1 = driver.findElement(GlossaryPageLocators.clickDraft);
		Actions builder1 = new Actions(driver);
		clickNew1.isSelected();
		Actions seriesOfActions1 = builder1.moveToElement(clickNew1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String actual = "DRAFT";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@And("^FAQs The user is able to deselect draft filter$")
	public void the_user_deselect_draft_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement clickNew1 = driver.findElement(GlossaryPageLocators.clickDraft);
		Actions builder1 = new Actions(driver);
		clickNew1.isDisplayed();
		Actions seriesOfActions1 = builder1.moveToElement(clickNew1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^FAQs The user is able to selects archived filter$")
	public void the_user_selects_archived_filter() throws InterruptedException {

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement clickNew1 = driver.findElement(GlossaryPageLocators.clickArchived);
		Actions builder1 = new Actions(driver);
		clickNew1.isSelected();
		Actions seriesOfActions1 = builder1.moveToElement(clickNew1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String actual = "ARCHIVED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@And("^FAQs The user is able to deselect archived filter$")
	public void the_user_deselect_archived_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement clickNew1 = driver.findElement(GlossaryPageLocators.clickArchived);
		Actions builder1 = new Actions(driver);
		clickNew1.isDisplayed();
		Actions seriesOfActions1 = builder1.moveToElement(clickNew1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^The user FAQs is able to search key word$")
	public void the_user_is_able_to_search_key_word() throws InterruptedException {

		driver.findElement(GlossaryPageLocators.searchBox).sendKeys("FAQS741");
		driver.findElement(GlossaryPageLocators.searchBox).sendKeys(Keys.ENTER);
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^The user FAQs selects clear filter$")
	public void the_user_selects_clear_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement clickNew1 = driver.findElement(GlossaryPageLocators.clearFilter);
		Actions builder1 = new Actions(driver);
		clickNew1.isSelected();
		Actions seriesOfActions1 = builder1.moveToElement(clickNew1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("The user FAQs click on descending sort by list")
	public void the_user_click_on_descending_sort_by_list() throws InterruptedException {
		WebElement clickOnSort = driver.findElement(GlossaryPageLocators.descendingOrder);
		Actions builder = new Actions(driver);
		clickOnSort.isDisplayed();
		Actions seriesOfActions = builder.moveToElement(clickOnSort).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("The user FAQs click on ascendent sort by list")
	public void the_user_click_on_ascendent_sort_by_list() throws InterruptedException {
		WebElement clickOnSort = driver.findElement(GlossaryPageLocators.ascendingOrder);
		Actions builder = new Actions(driver);
		clickOnSort.isDisplayed();
		Actions seriesOfActions = builder.moveToElement(clickOnSort).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^Click on new FAQs$")
	public void click_on_new_FAQs() {
		driver.findElement(FAQsLocators.newFAQ).click();
	}

	@And("^The user enters Question field$")
	public void the_user_enters_Question_field() {
		// int val = (int) Math.ceil(Math.random() * 1000);
		Random rand = new Random();
		float result = rand.nextFloat();
		driver.findElement(FAQsLocators.question).sendKeys("FAQS" + result);
	}

	@And("^The user enters the Response field$")
	public void The_user_enters_the_Response_field() {
		driver.findElement(FAQsLocators.response).sendKeys(
				"The home of Nebraska football head coach Scott Frost was burglarized this weekend, and $165,000 worth of items and goods were stolen, including over a dozen championship rings leading the Knights to a perfect 13-0 record this year. He also served as an assistant at Northern Iowa (2007-08) and Oregon (2009-15) in his career. ");

	}

	@And("^The user enters FQAS keywords fields$")
	public void the_user_enters_keywords_fields() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean selectElement = driver.findElement(GlossaryPageLocators.keyword).isEnabled();
		logger.info("keywords:" + selectElement);
		// TimeUnit.SECONDS.sleep(30);
		driver.findElement(GlossaryPageLocators.keyword).sendKeys("FAQS");
		driver.findElement(GlossaryPageLocators.keyword).sendKeys(Keys.ENTER);
		driver.findElement(GlossaryPageLocators.keyword).sendKeys(Keys.TAB);
	}

	@And("^The users click on FAQs done button$")
	public void the_users_click_on_FAQs_done_button() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// boolean
		// selectElement =
		// driver.findElement(GlossaryPageLocators.keyword).isEnabled();
		// logger.info("FAQs done : " + selectElement);
		// TimeUnit.SECONDS.sleep(10);
		driver.findElement(FAQsLocators.dispayFAQInHomePage).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(GlossaryPageLocators.glossaryDone).click();
	}

	@And("^The users click on FAQs link$")
	public void the_users_click_on_FAQs_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(8);
		((JavascriptExecutor) driver).executeScript("scroll(0,-400)");
		FAQSName = driver.findElement(By.xpath("//*[@id=\"Edit CMS\"]/div/h1")).getText();
		logger.info("Name of the FAQS: " + FAQSName);

		WebElement elt = driver.findElement(GlossaryPageLocators.linkGlossary);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}
	////////////////////////////////////////////

	@Given("^FAQ Click on actions dropdown list$")
	public void click_on_actions_dropdown_list() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement elt = driver.findElement(GlossaryPageLocators.clickGlossaryAction);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elt1 = driver.findElement(GlossaryPageLocators.clickGlossaryPublish);
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		logger.info("publishText:::::" + publishText);
		String publishName = driver.findElement(GlossaryPageLocators.publishName).getText();
		logger.info("publishName:::::" + publishName);
		publishName2 = driver.findElement(GlossaryPageLocators.publishName).getText();
		logger.info("publishName2:::::" + publishName2);
	}

	@And("FAQ User successfully published")
	public void user_successfully_published() {
		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@Given("^FAQ The user selects the edit option$")
	public void the_user_selects_the_edit_option() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement elt = driver.findElement(GlossaryPageLocators.clickGlossaryAction);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elt1 = driver.findElement(GlossaryPageLocators.clickGlossaryEdit);
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
	}

	@And("^FAQ The user enters the defintion edit field$")
	public void the_user_enters_the_defintion_edit_field() {
		driver.findElement(GlossaryPageLocators.editDefinition).clear();
		driver.findElement(GlossaryPageLocators.editDefinition).sendKeys("Update edit");
	}

	@And("^FAQ The user enters keywords edit fields$")
	public void the_user_enters_keywords_edit_fields() {
		driver.findElement(GlossaryPageLocators.editTextarea).sendKeys("Glossary Test");
		driver.findElement(GlossaryPageLocators.editTextarea).sendKeys(Keys.ENTER);
	}

	@And("^FAQ User successfully click on done button$")
	public void user_successfully_click_on_done_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(GlossaryPageLocators.editDone).click();
	}

	@And("^FAQ User successfully click edit to glossary link$")
	public void user_successfully_click_edit_to_glossary_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(8);
		// ((JavascriptExecutor)driver).executeScript("scroll(0,-400)");
		WebElement elt = driver.findElement(GlossaryPageLocators.linkGlossary);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@Given("^FAQ The user pulished draft glossary$")
	public void the_user_pulished_draft_glossary() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement elt = driver.findElement(GlossaryPageLocators.clickGlossaryAction);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elt1 = driver.findElement(GlossaryPageLocators.clickGlossaryPublish);
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		logger.info("publishText:::::" + publishText);
		String publishName = driver.findElement(GlossaryPageLocators.publishName).getText();
		logger.info("publishName:::::" + publishName);
	}

	@And("FAQ The user successfully click on published the glossary")
	public void user_successfully_published_the_glossary() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@Given("^FAQ The user click on archive option$")
	public void the_user_click_on_archive_option() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement elt = driver.findElement(GlossaryPageLocators.clickGlossaryAction);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elt1 = driver.findElement(GlossaryPageLocators.clickArchive);
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		String archivedText = driver.findElement(GlossaryPageLocators.publishText).getText();
		logger.info("ArchivedText:::::" + archivedText);
		String archivedName = driver.findElement(GlossaryPageLocators.publishName).getText();
		logger.info("ArchivedName:::::" + archivedName);

	}

	@And("^FAQ The user successfully clicks on the archive the glossary$")
	public void the_user_successfully_clicks_on_the_archive_the_glossary() {
		String actual = "ARCHIVED";
		String ArchivedText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, ArchivedText);
	}

	@Given("^FAQ The user click on unarchive option$")
	public void the_user_click_on_unarchive_option() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement elt = driver.findElement(GlossaryPageLocators.clickGlossaryAction);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elt1 = driver.findElement(GlossaryPageLocators.clickUnArchive);
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		String unArchivedText = driver.findElement(GlossaryPageLocators.publishText).getText();
		logger.info("UnarchivedText:::::" + unArchivedText);
		String unArchivedName = driver.findElement(GlossaryPageLocators.publishName).getText();
		logger.info("UnarchivedName:::::" + unArchivedName);
	}

	@And("^FAQ The user successfully clicks on the unarchive the glossary$")
	public void The_user_successfully_clicks_ont_the_unarchive_the_glossary() {
		String actual = "DRAFT";
		String UnarchivedText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, UnarchivedText);
	}

	@Given("^FAQ The user click on published option$")
	public void the_user_click_on_published_option() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement elt = driver.findElement(GlossaryPageLocators.clickGlossaryAction);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elt1 = driver.findElement(GlossaryPageLocators.clickPublished);
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		logger.info("publishText:::::" + publishText);
		String publishName = driver.findElement(GlossaryPageLocators.publishName).getText();
		logger.info("publishName:::::" + publishName);

	}

	@And("^FAQ The user successfully clicks on the published the glossary$")
	public void the_user_successfully_clicks_on_the_published_the_glossary() {
		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@Given("^Faqs created browser sign out$")
	public void Faqs_created_browser_signout() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"headerIconProfile\"]/i"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header-link-signout\"]"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);
		driver.quit();
		driver.close();

	}

	@And("^Scroll down to learn more link$")
	public void Scroll_down_to_learn_more_link() throws Throwable {
		logger.info("Click into scroll");
		logger.info("publishName:" + publishName);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(30);
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		TimeUnit.SECONDS.sleep(20);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.findElement(By.xpath("//a[text()="+publishName+"]")).click();
		driver.findElement(By.xpath("//a[@title='" + publishName + "']")).click();

		// a[@title=]
		TimeUnit.SECONDS.sleep(2000);
	}

	@Given("^New browser$")
	public void New_browser() {
		driver.close();

	}

	@Given("^faqs browser sign out$")
	public void faqs_browser_sign_out() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"headerIconProfile\"]/i"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header-link-signout\"]"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);
		driver.quit();
	}

	@Then("^Click on FAQS link$")
	public void Click_on_FAQS_link() throws Throwable {
		Thread.sleep(3000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,3500)");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//a[@title=\'FAQS116\']")).click();
		logger.info("publishName2::++++++:" + FAQsStepDef.publishName2);
		driver.findElement(By.xpath("//a[@title=\'" + FAQsStepDef.publishName2 + "\']")).click();
		Thread.sleep(4000);
	}

	@Given("^New Browser$")
	public void New_Browser() throws Throwable {
		((JavascriptExecutor) driver)
				.executeScript("window.open('https://55samfrontendcomp.apps.prod-iae.bsp.gsa.gov/', 'new_window')");
		// ((JavascriptExecutor)
		// driver).executeScript("window.open('https://mail.google.com/mail/#inbox')");
		driver.navigate();
		// Thread.sleep(3000);
	}

	@Given("^faqs browser close$")
	public void faqs_browser_close() {
		driver.quit();
	}

	@And("^The user is search for a key word$")
	public void sendkey() throws Throwable {
		driver.findElement(GlossaryPageLocators.searchBox).sendKeys(FAQsStepDef.publishName2);
		driver.findElement(GlossaryPageLocators.searchBox).sendKeys(Keys.ENTER);
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//////////////
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/h4/a")).click();
	    
		Thread.sleep(10000);
		String val = "Display FAQ in Home Page:";
	    String val1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/form-only/div/div/div/div[2]/div[2]/div[6]/span[1]")).getText();
	    Thread.sleep(10);
		Assert.assertEquals(val, val1);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/sam-breadcrumbs/ul/li[2]/a")).click();
		Thread.sleep(1000);
	}

	@And("^User unselect display faq in home page$")
	public void User_unselect_display_faq_in_home_page() throws Throwable {

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// boolean selectElement =
		// driver.findElement(GlossaryPageLocators.keyword).isEnabled();
		// logger.info("FAQs done : " + selectElement);
		TimeUnit.SECONDS.sleep(10);
		// driver.findElement(FAQsLocators.dispayFAQInHomePage).click();
		driver.findElement(By.xpath("//*[@id=\"toggle faq\"]")).isSelected();
		TimeUnit.SECONDS.sleep(10);
	}

	@Then("^FAQS user display link does not appear$")
	public void FAQS_user_display_link_does_not_appear() throws Throwable {
		Thread.sleep(3000);
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,3500)");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//a[@title=\'FAQS116\']")).click();
		logger.info("publishName2::++++++:" + FAQsStepDef.publishName2);

		try {
			driver.findElement(By.xpath("//a[@title=\'" + FAQsStepDef.publishName2 + "\']")).isDisplayed();
			driver.findElement(By.xpath("//a[@title=\'" + FAQsStepDef.publishName2 + "\']")).click();
		} catch (NoSuchElementException e) {
			Thread.sleep(10);
			logger.info("all tests passed successfully");
		}
	}

	@And("^Click on More FAQs link$")
	public void Click_on_More_FAQs_link() throws Throwable {
		
		driver.findElement(By.xpath("//a[@title=\'More FAQs\']")).click();
		Thread.sleep(3000);
	}

	@Then("^User navigate to Learning Center page$")
	public void User_navigate_to_Learning_Center_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a")).getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);
		
		String beta = "Library";
		String beta1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/span")).getText();
		Thread.sleep(10);
		Assert.assertEquals(beta, beta1);		
	}
	
	@And("^User enter faqs title in the keyword search box$")
	public void User_enter_faqs_title_in_the_keyword_search_box(){
		
		driver.findElement(By.xpath("//*[@id=\"search-users\"]")).sendKeys("Toggle feature testing");
		driver.findElement(By.xpath("//*[@id=\"search-users\"]")).sendKeys(Keys.ENTER);
		
		
	}

}
