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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gov.gsa.sam.base.FileReaderManager;
//import gov.gsa.sam.base.WebDriverManager;
import gov.gsa.sam.utils.Constants;
import net.thucydides.core.annotations.Managed;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.locators.MyWorkspace;
import gov.gsa.sam.locators.ReleaseNotesLocators;
import gov.gsa.sam.locators.DepartmentLocators;
import gov.gsa.sam.locators.GlossaryPageLocators;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.utils.Constants;


public class ReleaseNotesStepDef {

	String publishName;
	String publishText;

	@Managed
	public static WebDriver driver;
	public static WebDriverWait wait;
	private static Logger logger = LoggerFactory.getLogger(ReleaseNotesStepDef.class);

	/*@Given("^Launch Release browser$")
	public static void launch_browser1() {
		// Otpclass.launch_browser();
		driver = WebDriverManager.getDriver();
		logger.info("launch method complted");
	}*/
	
	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@And("^The user enters environment Release (\\w+)$")
	public static void the_user_enters_a_URL1(String urlConstant) throws InterruptedException {
		// Otpclass.the_user_enters_a_URL(urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^The user click on Release sign in link$")
	public void the_user_click_on_sign_in_link1() throws InterruptedException {
		// otp.the_user_click_on_sign_in_link();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(HomePageLocator.navBarSignIn).click();
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^Then click on Release accept button$")
	public void then_click_accept_button1() throws InterruptedException {
		// otp.then_click_accept_button();
		TimeUnit.SECONDS.sleep(3);
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters the Release email id (\\w+)$")
	public void the_user_enters_the_email_id1(String userName) throws Throwable {
		// otp.the_user_enters_the_email_id(userName);
		TimeUnit.SECONDS.sleep(3);
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
		logger.info("Username entered --  " + emailID);
	}

	@And("^The user enters the Release password (\\w+)$")
	public void the_user_enters_the_password1(String password) {
		// otp.the_user_enters_the_password(password);
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
	}

	@And("^The user click on Release sign in button$")
	public void the_user_click_on_sign_in_button1() {
		// otp.the_user_click_on_sign_in_button();
		driver.findElement(HomePageLocator.dropdownSignInButton).click();
	}

	@And("^The user want to receive your one time Release password (\\w+)$")
	public void the_user_want_to_receive_your_one_time_password1(String myEmailId) throws InterruptedException {
		// otp.the_user_want_to_receive_your_one_time_password(myEmailId);
		TimeUnit.SECONDS.sleep(8);
		((JavascriptExecutor) driver).executeScript("window.open('https://mail.google.com/mail/#inbox')");
		TimeUnit.SECONDS.sleep(3);
		ArrayList<String> tab_handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 1));
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(myEmailId);
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

	@And("^The user enters Release one time access code$")
	public void the_user_enters_one_time_access_code1() {
		// otp.the_user_enters_one_time_access_code();
		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		logger.info("Constants.OTP:::::" + Constants.OTP);
	}

	@And("^The user click on Release one time submit button$")
	public void the_user_click_on_one_time_submit_button1() {
		// otp.the_user_click_on_one_time_submit_button();
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
	}

	@Given("^The user click on go to Release link$")
	public void the_user_click_on_go_to_glossary_link() throws InterruptedException {

		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		TimeUnit.SECONDS.sleep(30);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		Boolean present = driver.findElement(GlossaryPageLocators.clickReleaselink).isDisplayed();
		logger.info("Release::******" + present);
		driver.findElement(GlossaryPageLocators.clickReleaselink).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@And("^The user navigates to Release page$")
	public void the_user_navigates_to_glossary_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String breadCrumbs1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		logger.info("breadCrumb1:::" + breadCrumbs1);
		Assert.assertEquals(breadCrumbs1, "Workspace");
		String breadCrumbs2 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/span"))
				.getText();
		logger.info("Release Notes1:::" + breadCrumbs2);
		Assert.assertEquals(breadCrumbs2, "Release Notes");
	}

	@And("^Release The user is able to select new status$")
	public void The_user_select_new_status() throws InterruptedException {

		WebElement clickNew = driver.findElement(GlossaryPageLocators.selectNew);
		Actions builder = new Actions(driver);
		clickNew.isSelected();
		Actions seriesOfActions = builder.moveToElement(clickNew).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@And("^Release The user is able to deselect new filter$")
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

	@And("^Release The user is able to selects published filter$")
	public void the_user_selects_published_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement clickNew1 = driver.findElement(GlossaryPageLocators.clickPublised);
		Actions builder1 = new Actions(driver);
		clickNew1.isSelected();
		Actions seriesOfActions1 = builder1.moveToElement(clickNew1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^Release The user is able to deselect published filter$")
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

	@And("^Release The user is able to selects draft filter$")
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
	}

	@And("^Release The user is able to deselect draft filter$")
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

	@And("^Release The user is able to selects archived filter$")
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
	}

	@And("^Release The user is able to deselect archived filter$")
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

	@And("^The user Release is able to search key word$")
	public void the_user_is_able_to_search_key_word() throws InterruptedException {

		driver.findElement(GlossaryPageLocators.searchBox).sendKeys("selenium");
		driver.findElement(GlossaryPageLocators.searchBox).sendKeys(Keys.ENTER);
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^The user Release selects clear filter$")
	public void the_user_selects_clear_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//WebElement clickNew1 = driver.findElement(GlossaryPageLocators.clearFilter);
		WebElement clickNew1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/content-management-sidenav/div/div[3]/span/a"));
		//*[@id="main-container"]/ng-component/page/div/div/div[2]/div[1]/sidebar/content-management-sidenav/div/div[3]/span/a
		Actions builder1 = new Actions(driver);
		clickNew1.isSelected();
		Actions seriesOfActions1 = builder1.moveToElement(clickNew1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("The user Release click on descending sort by list")
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

	@And("The user Release click on ascendent sort by list")
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

	@Given("^Click on new Release$")
	public void click_on_new_Release() {
		driver.findElement(MyWorkspace.newReleaseNote).click();
	}

	@And("^The user enters release field$")
	public void the_user_enters_Question_field() {
		int val = (int) Math.ceil(Math.random() * 1000);
		driver.findElement(ReleaseNotesLocators.release).sendKeys("Release" + val);
	}
	
	@And("^The user enters the overview field$")
	public void The_user_enters_the_overview_field() {
		driver.findElement(ReleaseNotesLocators.overview).sendKeys("Test");
	}

	@And("^The user enters the details field$")
	public void The_user_enters_the_details_field() {
		driver.findElement(ReleaseNotesLocators.details).sendKeys(
				"The home of Nebraska football head coach Scott Frost was burglarized this weekend, and $165,000 worth of items and goods were stolen, including over a dozen championship rings leading the Knights to a perfect 13-0 record this year. He also served as an assistant at Northern Iowa (2007-08) and Oregon (2009-15) in his career. ");

	}

	@And("^The users click on Release done button$")
	public void the_users_click_on_Release_done_button() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(GlossaryPageLocators.glossaryDone).click();
	}

	@And("^The users click on Release link$")
	public void the_users_click_on_Release_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,-400)");
		WebElement elt = driver.findElement(GlossaryPageLocators.linkGlossary);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@Given("^Release Click on actions dropdown list$")
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
		//String publishName = driver.findElement(GlossaryPageLocators.publishName).getText();
		//logger.info("publishName:::::" + publishName);
	}

	@And("Release User successfully published")
	public void user_successfully_published() {
		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@Given("^Release The user selects the edit option$")
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

	@And("^Release The user enters the overview field$")
	public void the_user_enters_the_defintion_edit_field() {
		driver.findElement(ReleaseNotesLocators.overview).clear();
		driver.findElement(ReleaseNotesLocators.overview).sendKeys("Update edit");
	}

	@And("^Release The user enters the details field$")
	public void the_user_enters_keywords_edit_fields() {
		driver.findElement(ReleaseNotesLocators.details).sendKeys("Glossary Test");
		driver.findElement(ReleaseNotesLocators.details).sendKeys(Keys.ENTER);
	}

	@And("^Release User successfully click on done button$")
	public void user_successfully_click_on_done_button() {
		driver.findElement(GlossaryPageLocators.editDone).click();
	}

	@And("^Release User successfully click edit to glossary link$")
	public void user_successfully_click_edit_to_glossary_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(3);
		// ((JavascriptExecutor)driver).executeScript("scroll(0,-400)");
		WebElement elt = driver.findElement(GlossaryPageLocators.linkGlossary);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@Given("^Release The user pulished draft glossary$")
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
		//String publishName = driver.findElement(GlossaryPageLocators.publishName).getText();
		//logger.info("publishName:::::" + publishName);
	}

	@And("Release The user successfully click on published the glossary")
	public void user_successfully_published_the_glossary() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@Given("^Release The user click on archive option$")
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

	@And("^Release The user successfully clicks on the archive the glossary$")
	public void the_user_successfully_clicks_on_the_archive_the_glossary() {
		String actual = "ARCHIVED";
		String ArchivedText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, ArchivedText);
	}

	@Given("^Release The user click on unarchive option$")
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

	@And("^Release The user successfully clicks on the unarchive the glossary$")
	public void The_user_successfully_clicks_ont_the_unarchive_the_glossary() {
		String actual = "DRAFT";
		String UnarchivedText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, UnarchivedText);
	}

	@Given("^Release The user click on published option$")
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

	@And("^Release The user successfully clicks on the published the glossary$")
	public void the_user_successfully_clicks_on_the_published_the_glossary() {
		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}
	
	@Given("Release created browser sign out")
	public void Release_created_browser_sign_out() throws Throwable{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
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
		driver.close();
		
	}

}
