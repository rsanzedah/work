package gov.gsa.sam.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.base.FileReaderManager;
import gov.gsa.sam.locators.GlossaryPageLocators;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.utils.Constants;

public class GlossaryStepDef {

	String publishName;
	String publishText;
	@Managed
	public static WebDriver driver;
	Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(GlossaryStepDef.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Given("^The user enters environment glossary (\\w+)$")
	public void the_user_enters_environment_department(String urlConstant) throws Throwable {
		System.out.println("HI::" + urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^The user click on glossary sign in link$")
	public void the_user_click_on_sign_in_link1() throws InterruptedException {
		// otp.the_user_click_on_sign_in_link();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(HomePageLocator.navBarSignIn).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@And("^Then click on glossary accept button$")
	public void then_click_accept_button1() throws InterruptedException {
		// otp.then_click_accept_button();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters the glossary email id (\\w+)$")
	public void the_user_enters_the_email_id1(String userName) throws Throwable {
		logger.info("Username entered123 --  " + userName);
		TimeUnit.SECONDS.sleep(3);
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		// driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys("shanthi.dutta+alertadmin@gsa.gov");
		TimeUnit.SECONDS.sleep(3);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@And("^The user enters the glossary password (\\w+)$")
	public void the_user_enters_the_password1(String password) {
		// otp.the_user_enters_the_password(password);
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
	}

	@And("^The user click on glossary sign in button$")
	public void the_user_click_on_sign_in_button1() {
		// otp.the_user_click_on_sign_in_button();
		driver.findElement(HomePageLocator.dropdownSignInButton).click();
	}

	@And("^The user want to receive your one time glossary password (\\w+)$")
	public void the_user_want_to_receive_your_one_time_password1(String myEmailId) throws InterruptedException {
		// otp.the_user_want_to_receive_your_one_time_password(myEmailId);
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.open('https://mail.google.com/mail/#inbox')");
		driver.navigate();
		TimeUnit.SECONDS.sleep(2);
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ArrayList<String> tab_handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 1));
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(myEmailId);
		logger.info("emailID --  " + emailID);
		// driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shanthi.dutta@gsa.gov");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(emailID);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//*[@class='qhFLie']")).click();
		TimeUnit.SECONDS.sleep(20);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> lastMail = driver.findElements(By.className("zA"));// want
		logger.info("The size of the element: " + lastMail.size());
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(lastMail.get(0)).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Constants.OTP = driver.findElement(Locators.iaeOtp).getText().substring(30, 38);
		logger.info("The captured OTP is- " + Constants.OTP);
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 2));

	}

	@And("^The user enters glossary one time access code$")
	public void the_user_enters_one_time_access_code1() {
		// otp.the_user_enters_one_time_access_code();

		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		logger.info("Constants.OTP:::::" + Constants.OTP);
	}

	@And("^The user click on glossary one time submit button$")
	public void the_user_click_on_one_time_submit_button1() {
		// otp.the_user_click_on_one_time_submit_button();

		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
		// driver.navigate().refresh();

		logger.info("Successfull otp");

	}

	/*
	 * @Given("^User set cookie as alert admin token page$") public void
	 * user_set_cookie_as_alert_admin_token_page() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Chrome Driver\\chromedriver.exe"); DesiredCapabilities chrome_cap =
	 * DesiredCapabilities.chrome(); ChromeOptions options = new
	 * ChromeOptions(); options.addArguments("disable-infobars");
	 * options.addArguments("start-maximized"); //
	 * options.addArguments("--incognito");
	 * options.setExperimentalOption("useAutomationExtension", false);
	 * chrome_cap.setCapability(ChromeOptions.CAPABILITY, options); //
	 * ChromeDriverManager.getInstance().setup(); // driver = new
	 * ChromeDriver(chrome_cap); driver = new ChromeDriver();
	 * driver.get("http://localhost:4200/role-management/rm");
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * driver.manage().window().maximize(); boolean isenbled =
	 * driver.findElement(DepartmentLocators.clearCookies).isEnabled();
	 * logger.info("isEnbled" + isenbled);
	 * driver.findElement(DepartmentLocators.clearCookies).click(); boolean
	 * selectElement =
	 * driver.findElement(DepartmentLocators.selectAdminToken).isEnabled();
	 * logger.info("selectElement" + selectElement); Select selectAdminToken =
	 * new Select(driver.findElement(DepartmentLocators.selectAdminToken));
	 * selectAdminToken.selectByIndex(12); }
	 * 
	 * @Then("^User click on alert cookie button$") public void
	 * user_click_on_alert_cookie_button() { boolean setcookies =
	 * driver.findElement(DepartmentLocators.setcookies).isEnabled();
	 * logger.info("setcookies" + setcookies);
	 * driver.findElement(DepartmentLocators.setcookies).click();
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }
	 */

	@Given("^Enter the department wokspace URL$")
	public void enter_the_department_wokspace_URL() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.open('http://localhost:4200/workspace')");
		Set<String> tab_handles = driver.getWindowHandles();
		int number_of_tabs = tab_handles.size();
		int new_tab_index = number_of_tabs - 1;
		driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
		logger.info("Pages1:::" + driver.getTitle());
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Then("^The user click on go to glossary link$")
	public void the_user_click_on_go_to_glossary_link() throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		TimeUnit.SECONDS.sleep(30);
	//	((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
		driver.findElement(GlossaryPageLocators.clickGlossary).click();

	}

	@And("^The user navigates to glossary page$")
	public void the_user_navigates_to_glossary_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String breadCrumbs1 = driver.findElement(GlossaryPageLocators.breadCrumbs1).getText();
		logger.info("breadCrumbs:::" + breadCrumbs1);
		Assert.assertEquals(breadCrumbs1, "Workspace");
		String breadCrumbs2 = driver.findElement(GlossaryPageLocators.breadCrumbs2).getText();
		logger.info("breadCrumbs2:::" + breadCrumbs2);
		Assert.assertEquals(breadCrumbs2, "Glossary");

	}

	@And("^The user select new status$")
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
		logger.info("breadCrumbs2:::" + publishText, scenario);
	}

	@And("^The user deselect new filter$")
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

	@And("^The user selects published filter$")
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

		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		logger.info("publishText************" + publishText);
		Assert.assertEquals(actual, publishText);
		logger.info("breadCrumbs2:::" + publishText, scenario);

	}

	@And("^The user deselect published filter$")
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

	@And("^The user selects draft filter$")
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
		logger.info("breadCrumbs2:::" + publishText, scenario);
	}

	@And("^The user deselect draft filter$")
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

	@And("^The user selects archived filter$")
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
		logger.info("breadCrumbs2:::" + publishText, scenario);
	}

	@And("^The user deselect archived filter$")
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

	@And("^The user is able to search key word$")
	public void the_user_is_able_to_search_key_word() throws InterruptedException {

		driver.findElement(GlossaryPageLocators.searchBox).sendKeys("selenium");
		driver.findElement(GlossaryPageLocators.searchBox).sendKeys(Keys.ENTER);
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("The user click on descending sort by list")
	public void the_user_click_on_descending_sort_by_list() throws InterruptedException {
		WebElement clickOnSort = driver.findElement(GlossaryPageLocators.descendingOrder);
		Actions builder = new Actions(driver);
		clickOnSort.isDisplayed();
		Actions seriesOfActions = builder.moveToElement(clickOnSort).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		logger.info("descending:::" + scenario);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("The user click on ascendent sort by list")
	public void the_user_click_on_ascendent_sort_by_list() throws InterruptedException {
		WebElement clickOnSort = driver.findElement(GlossaryPageLocators.ascendingOrder);
		Actions builder = new Actions(driver);
		clickOnSort.isDisplayed();
		Actions seriesOfActions = builder.moveToElement(clickOnSort).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("ascendent:::" + scenario);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^The user selects clear filter$")
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

	@Given("^Click on new glossary$")
	public void click_on_new_glossary() {
		driver.findElement(GlossaryPageLocators.newGlossary).click();
	}

	@And("The user enters data field")
	public void the_user_enters_data_field() {
		int val = (int) Math.ceil(Math.random() * 1000);
		driver.findElement(GlossaryPageLocators.dataField).sendKeys("Glossary" + val);
	}

	@And("^The user enters the defintion field$")
	public void the_user_enters_the_defintion_field() {
		driver.findElement(GlossaryPageLocators.definition).sendKeys(
				"The U.S. Supreme Court on June 26 handed Donald Trump one of the biggest victories of his presidency, upholding his travel ban targeting several Muslim-majority countries. The 5-4 ruling, with the court’s five conservatives in the majority, ends for now a fierce fight in the courts over whether the policy represented an unlawful Muslim ban. Mr. Trump can now claim vindication after lower courts had blocked his travel ban announced in September 2017, as well as two prior versions, in legal challenges brought by the State of Hawaii and others. The court held that the challengers had failed to show that the ban violates either U.S. immigration law or the U.S. Constitution's First Amendment prohibition on the government favoring one religion over another. Mr. Trump quickly reacted on Twitter: “SUPREME COURT UPHOLDS TRUMP TRAVEL BAN. Wow!” Writing for the court, Chief Justice John Roberts said that the government “has set forth a sufficient national security justification” to prevail. “We express no view on the soundness of the policy,” Roberts added. The ruling affirmed broad presidential discretion over who is allowed to enter the United States. It means that the current ban can remain in effect and that Mr. Trump could potentially add more countries. Mr. Trump has said the policy is needed to protect the country against attacks by Islamic militants. The current ban, announced in September 2017, prohibits entry into the United States of most ");
	}

	@And("^The user enters the source field$")
	public void the_user_enters_the_source_field() {
		driver.findElement(GlossaryPageLocators.source).sendKeys("Selenium");
	}

	@And("^The user selects the domain keyword$")
	public void the_user_selects_the_domain_keyword() {
		boolean selectElement = driver.findElement(GlossaryPageLocators.domain).isEnabled();
		logger.info("Action : " + selectElement);
		Select selectAdminToken = new Select(driver.findElement(GlossaryPageLocators.domain));
		selectAdminToken.selectByIndex(2);
	}

	@And("^The user enters keywords fields$")
	public void the_user_enters_keywords_fields() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean selectElement = driver.findElement(GlossaryPageLocators.keyword).isEnabled();
		logger.info("Action : " + selectElement);
		driver.findElement(GlossaryPageLocators.keyword).sendKeys("Glossary");
		driver.findElement(GlossaryPageLocators.keyword).sendKeys(Keys.ENTER);
		logger.info("Submitting new glossary:" + scenario);
	}

	@Then("^The users click on glossary done button$")
	public void the_users_click_on_glossary_done_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(GlossaryPageLocators.glossaryDone).click();
	}

	@And("^The users click on glossary link$")
	public void the_users_click_on_worksapce_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("scroll(0,-400)");
		WebElement elt = driver.findElement(GlossaryPageLocators.linkGlossary);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@Given("^Click on actions dropdown list$")
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
		logger.info("publishText:::::" + publishText, scenario);
		String publishName = driver.findElement(GlossaryPageLocators.publishName).getText();
		logger.info("publishName:::::" + publishName, scenario);
	}

	@And("User successfully published")
	public void user_successfully_published() {
		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@Given("^The user selects the edit option$")
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

	@And("^The user enters the defintion edit field$")
	public void the_user_enters_the_defintion_edit_field() {
		driver.findElement(GlossaryPageLocators.editDefinition).clear();
		driver.findElement(GlossaryPageLocators.editDefinition).sendKeys("Update edit");
	}

	@And("^The user enters keywords edit fields$")
	public void the_user_enters_keywords_edit_fields() {
		driver.findElement(GlossaryPageLocators.editTextarea).sendKeys("Glossary Test");
		driver.findElement(GlossaryPageLocators.editTextarea).sendKeys(Keys.ENTER);

		logger.info("Submitting edit glossary:" + scenario);
	}

	@And("^User successfully click on done button$")
	public void user_successfully_click_on_done_button() {
		driver.findElement(GlossaryPageLocators.editDone).click();
		logger.info("Edit glossary Done:" + scenario);
	}

	@And("^User successfully click edit to glossary link$")
	public void user_successfully_click_edit_to_glossary_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// ((JavascriptExecutor)driver).executeScript("scroll(0,-400)");
		WebElement elt = driver.findElement(GlossaryPageLocators.linkGlossary);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@Given("^The user pulished draft glossary$")
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
		logger.info("draft glossary:" + scenario);
	}

	@And("The user successfully click on published the glossary")
	public void user_successfully_published_the_glossary() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@Given("^The user click on archive option$")
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
		logger.info("ArchivedName:::::" + archivedName, scenario);

	}

	@And("^The user successfully clicks on the archive the glossary$")
	public void the_user_successfully_clicks_on_the_archive_the_glossary() {
		String actual = "ARCHIVED";
		String ArchivedText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, ArchivedText);
	}

	@Given("^The user click on unarchive option$")
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
		logger.info("UnarchivedName:::::" + unArchivedName, scenario);
	}

	@And("^The user successfully clicks on the unarchive the glossary$")
	public void The_user_successfully_clicks_ont_the_unarchive_the_glossary() {
		String actual = "DRAFT";
		String UnarchivedText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, UnarchivedText);
	}

	@Given("^The user click on published option$")
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

		logger.info("published glossary:" + scenario);

	}

	@And("^The user successfully clicks on the published the glossary$")
	public void the_user_successfully_clicks_on_the_published_the_glossary() {
		String actual = "PUBLISHED";
		String publishText = driver.findElement(GlossaryPageLocators.publishText).getText();
		Assert.assertEquals(actual, publishText);
	}

	@Then("^The user click on go to FAQS link$")

	public void the_user_click_on_go_to_FAQS_link() throws InterruptedException {
		driver.findElement(GlossaryPageLocators.clickFAQSLink).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("^The user navigate to FAQS page$")
	public void the_user_navigate_to_FAQS_page() {
		String breadCrumbs1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		logger.info("breadCrumbs:::" + breadCrumbs1);
		Assert.assertEquals(breadCrumbs1, "Workspace");
		String breadCrumbs2 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/span"))
				.getText();
		logger.info("breadCrumbs2:::" + breadCrumbs2);
		Assert.assertEquals(breadCrumbs2, "FAQs");
	}

	@Then("^The user click on go to release notes link$")

	public void the_user_click_on_go_to_release_notes_link() throws InterruptedException {

		driver.findElement(GlossaryPageLocators.clickReleaselink).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("^The user navigate to release notes page$")
	public void the_user_navigate_to_release_notes_page() {
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

	@Then("^The user click on go to videos link$")
	public void the_user_click_on_go_to_videos_link() throws InterruptedException {

		driver.findElement(GlossaryPageLocators.clickVideosLink).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("^The user navigate to videos page$")
	public void the_user_navigate_to_videos_page() {

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
		Assert.assertEquals(breadCrumbs2, "Videos");
	}

	@Then("^The user click on go to fotter release notes link$")

	public void the_user_click_on_go_to_fotter_relase_link() throws InterruptedException {
		driver.findElement(GlossaryPageLocators.footerReleaseLink).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("^The user navigate to fotter release notes page$")
	public void the_user_navigate_to_fotter_release_notes_page() {
		String breadCrumbs1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		logger.info("breadCrumbs:::" + breadCrumbs1);
		Assert.assertEquals(breadCrumbs1, "Home");
		String breadCrumbs2 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/span"))
				.getText();
		logger.info("Release Notes1:::" + breadCrumbs2);
		Assert.assertEquals(breadCrumbs2, "Release Notes");

	}

	/*@Given("^Glossary Browser close$")
	public void Glossary_browser_close() {
		logger.info("Inside CloseBrowser");
		driver.close();
		driver.quit();
		logger.debug("Closed Browser");

	}
*/
	@Given("Glossary created browser sign out")
	public void Glossary_created_browser_sign_out() throws Throwable{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("header-profile-icon"));
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
}
