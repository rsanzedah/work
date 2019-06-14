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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.gsa.sam.base.FileReaderManager;
import gov.gsa.sam.fields.CreateOfficeLocators;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.locators.SubTierLocators;
import gov.gsa.sam.utils.Constants;
import net.thucydides.core.annotations.Managed;

public class NegEditDepartmentSubTierStepDef {
	@Managed
	public static WebDriver driver;
	Scenario scenario;
	public String description1 = "This field cannot be empty.";
	public String AgencyCode1 = "This field cannot be empty.";
	public String CGAC1 = "This field cannot be empty.";
	public String AgencyCode12 = "This field is required";
	public String CGAC12 = "This field is required.";
	public String CGACNum = "Please enter only numbers.";
	public String Month1 = "All date fields are required";
	public String Acency2 = "This field cannot be empty.";
	
	

	public static String description;
	public static String AgencyCode;
	public static String CGAC;
	public static String AgencyCode2;
	public static String CGAC2;
	public static String CGACNum1;
	public static String Month;

	private static Logger logger = LoggerFactory.getLogger(NegEditDepartmentSubTierStepDef.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Given("^user login into the environment (\\w+)$")
	public void user_login_into_the_COMP_HOME_PAGE(String urlConstant) throws Throwable {
		logger.info("****COMP_HOME_PAGE. driver::" + driver);
		// driver.get("https://55samfrontendcomp.apps.prod-iae.bsp.gsa.gov/");
		System.out.println("HI::" + urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^Click on the sign in link$")
	public void Click_on_the_sign_in_link() throws Throwable {
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(HomePageLocator.navBarSignIn).click();
	}

	@And("^Click on the accept button$")
	public void Click_on_the_accept_button() throws Throwable {
		TimeUnit.SECONDS.sleep(3);
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	@And("^Enters the email id (\\w+)$")
	public void Enters_the_email_id_createDepartment(String userName) throws Throwable {
		TimeUnit.SECONDS.sleep(3);
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^Enters the password (\\w+)$")
	public void Enters_the_password_alertadminPassword(String password) {
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
		logger.info("Username entered --  " + scenario);
	}

	@Then("^Click on the sign in button$")
	public void Click_on_the_sign_in_button() {
		driver.findElement(HomePageLocator.dropdownSignInButton).click();
	}

	@And("^Receivev the your one time password (\\w+)$")
	public void Receivev_the_your_one_time_password_myEmail(String myEmailId) throws Throwable {
		TimeUnit.SECONDS.sleep(8);
		((JavascriptExecutor) driver).executeScript("window.open('https://mail.google.com/mail/#inbox')");
		driver.navigate();
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

	@And("^Enters the one time access code$")
	public void Enters_the_one_time_access_code() {
		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		logger.info("Constants.OTP:::::" + Constants.OTP);
	}

	@Then("^Click on the one time submit button$")
	public void Click_on_the_one_time_submit_button() {
		logger.info("otp submitted:" + scenario);
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
	}

	@Then("^Click on go the department link$")
	public void Click_on_go_the_department_link() throws Throwable {
		logger.info("Test:::" + driver);
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/div/div/div/div/div[2]/div/div[3]/a"))
				.click();
	}

	@Then("^Navigate into the search page$")
	public void Navigate_into_the_search_page() throws Throwable {
		logger.info("Search page");
		Thread.sleep(3000);
		WebElement elt = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[2]/div/div[2]/div[1]/a"));
		boolean present = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[2]/div/div[2]/div[1]/a"))
				.isDisplayed();
		logger.info("present:" + present);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("Pages2:::" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Click on DEPT");
	}

	@And("click on edit agency details$")
	public void click_on_edit_agency_details() throws Throwable {
		logger.info("user click on agency details button");
		Thread.sleep(1400);
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@And("^user enters Description ([^\"]*)$")
	public void User_click_on_Description(String Description) throws Throwable {
		logger.info("User click on Description" + Description);
		if (Description.equals(null) || Description.equals("")) {
			driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		} else {
			driver.findElement(By.xpath("//*[@id=\"description\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(Description);
		}
	}

	@And("^user enters Short Name ([^\"]*)$")
	public void User_click_on_Short_Name(String ShorName) throws Throwable {
		logger.info("User click on Short Name" + ShorName);
		driver.findElement(By.xpath("//*[@id=\"orgShortName-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"orgShortName-input\"]")).sendKeys(ShorName);
	}

	@And("^click submit agency details$")
	public void click_submit_agency_details() throws Throwable {
		logger.info("^user click submit agency details$");
		WebElement elt = driver.findElement(By.xpath(
				"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/div[3]/sam-button/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@And("^user click edit Agency Codes$")
	public void User_click_on_edit_Agency_Codes() throws Throwable {
		logger.info("User click on edit Agency Codes");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@And("^user enters Agency Code ([^\"]*)$")
	public void User_click_on_Agency_Code(String Agency) {
		logger.info("User click on Agency Code" + Agency);
		if (Agency.equals(null) || Agency.equals("")) {
			driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		} else {
			driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).sendKeys(Agency);
		}
	}

	@And("user enters CGAC code ([^\"]*)$")
	public void User_click_on_CGAC(String CGAC) {
		logger.info("User click on CGAC" + CGAC);
		if (CGAC.equals(null) || CGAC.equals("")) {
			driver.findElement(By.xpath("//*[@id=\"cgac-input\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		} else {
			driver.findElement(By.xpath("//*[@id=\"cgac-input\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"cgac-input\"]")).sendKeys(CGAC);
		}
	}

	@And("^user enters CFDA ([^\"]*)$")
	public void User_click_on_CFDA_Code(String CFDA) {
		logger.info("User click on CFDA Code" + CFDA);
		driver.findElement(By.xpath("//*[@id=\"cfda-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"cfda-input\"]")).sendKeys(CFDA);
	}

	@And("^TAS-2 Code is visible$")
	public void TAS2_Code_is_visible() {
		logger.info("TAS-2 Code code is visible");
		boolean val1 = driver
				.findElement(By
						.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/form/div/span[1]/b"))
				.isDisplayed();
		logger.info("TAS-2 Code" + val1);
		boolean val = driver.getPageSource().contains("TAS-2 Code");
		logger.info("TAS-2 Code" + val);
	}

	@And("^click submit Agency Code$")
	public void click_submit_Agency_Codes() throws Throwable {
		logger.info("click on edit Agency Codes");
		WebElement elt = driver.findElement(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/sam-button/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@And("^user enters month ([^\"]*)$")
	public void user_enters_month(String month) {
		logger.info("The user enters on month" + month);
		if (month.equals(null) || month.equals(" ")) {
			logger.info("The user enters on month" + month);
			driver.findElement(By.xpath("//*[@id=\"org-end-date_month\"]")).clear();
			
		} else {
		logger.info("The user enters on month" + month);
		driver.findElement(By.xpath("//*[@id=\"org-end-date_month\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_month\"]")).sendKeys(month);
		}
	}

	@And("^user enters Day ([^\"]*)$")
	public void user_enters_Day(String Day) {
		logger.info("The user enters on Day" + Day);
		if (Day.equals(null) || Day.equals("")) {
			driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).clear();
		} else {
		logger.info("The user enters on Day" + Day);
		driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).sendKeys(Day);
		}
	}

	@And("^user enters Year ([^\"]*)$")
	public void user_enters_Year(String Year) {
		logger.info("The user enters on Year" + Year);
		if (Year.equals(null) || Year.equals("")) {
			driver.findElement(By.xpath("//*[@id=\"org-end-date_year\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		} else {
		driver.findElement(By.xpath("//*[@id=\"org-end-date_year\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_year\"]")).sendKeys(Year);
		}
	}

	@Given("^Click on Hierarchy$")
	public void User_Click_Hierarchy() throws Throwable {
		logger.info("User Click on Hierarchy");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/aside/div/ul/li[2]/a"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@Then("navigate into sub-Tier page$")
	public void navigate_into_sub_Tier_page() throws InterruptedException {
		logger.info("sub-Tier page");
		Thread.sleep(2000);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/div/div[3]/div[1]/a"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);

	}

	@And("^click subTier details$")
	public void click_on_edit_subTier_details() throws Throwable {
		logger.info("Edit subTier details");
		/*WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);*/
		
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@And("user enters subTie month ([^\"]*)")
	public void user_enters_subTie_end_month(String month) {
		logger.info("The user enters on month" + month);
		driver.findElement(By.xpath("//*[@id=\"org-end-date_month\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_month\"]")).sendKeys(month);
	}

	@And("^user enters subTier end Day ([^\"]*)$")
	public void user_enters_subTier_end_Day(String Day) {
		logger.info("The user enters on Day" + Day);
		driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).sendKeys(Day);

	}

	@And("^user enters subTier end Year ([^\"]*)$")
	public void user_enters_subTier_end_Year(String Year) {
		logger.info("The user enters on Year" + Year);
		driver.findElement(By.xpath("//*[@id=\"org-end-date_year\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_year\"]")).sendKeys(Year);
	}

	@And("^user enters subTier Short Name ([^\"]*)$")
	public void user_enters_on_subTier_Short_Name(String ShortName) {
		logger.info("User click on Short Name" + ShortName);
		driver.findElement(By.xpath("//*[@id=\"orgShortName-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"orgShortName-input\"]")).sendKeys(ShortName);
	}

	@And("^User click submit Details Sub-Tier Details$")
	public void submit_subTier_agency_details() throws Throwable {
		logger.info("Edit submit subTier details");
		TimeUnit.SECONDS.sleep(3);
		WebElement elt = driver.findElement(By.xpath(
				"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/div[3]/sam-button/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@And("^Click on the edit subtier Agency Code$")
	public void Click_edit_subTier_Agency_Codes() throws Throwable {
		logger.info("Edit submit subTier details");
		TimeUnit.SECONDS.sleep(3);
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@And("user enters subTier Agency ([^\"]*)")
	public void user_enters_on_subTier_Agency_Codes(String Agency) {
		logger.info("User click on Agency Code");
		driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).sendKeys(Agency);
	}

	@And("^click submit subTier Agency Code$")
	public void click_submit_subTier_Agency_Codes() throws Throwable {
		logger.info("Edit submit subTier details");
		WebElement elt = driver.findElement(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/sam-button/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@Given("^User Click on edit submit agency details button$")
	public void User_Click_on_edit_submit_agency_details_button() throws Throwable {
		Thread.sleep(1400);
		logger.info("user click on agency details button");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		logger.info("^user click submit agency details$");
		WebElement elt1 = driver.findElement(By.xpath(
				"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/div[3]/sam-button/button"));
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(5000);
	}

	@Then("^User field cannot be empty field$")
	public void User_field_cannot_be_empty_field() throws Throwable {
		Thread.sleep(10);
		description = driver.findElement(By.xpath("//*[@id=\"description-error\"]")).getText();
		logger.info("description::" + description);
	}

	@And("^User Click edit submit agency code button$")
	public void User_Click_edit_submit_agency_code_button() throws Throwable {
		logger.info("User click on edit Agency Codes");
		Thread.sleep(1400);
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(3);
		driver.findElement(By.xpath("//*[@id=\"cgac-input\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		logger.info("click on edit Agency Codes");
		WebElement elt1 = driver.findElement(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/sam-button/button"));
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(2000);

	}

	@Then("^Reading fields cannot be empty field$")
	public void Reading_fields_cannot_be_empty_field() throws Throwable {
		Thread.sleep(10);
		AgencyCode = driver.findElement(By.xpath("//*[@id=\"fpds-input-error\"]")).getText();
		logger.info("AgencyCode:: " + AgencyCode);
		CGAC = driver.findElement(By.xpath("//*[@id=\"cgac-input-error\"]")).getText();
		logger.info("CGAC::" + CGAC);
	}

	@Given("^Edit browser sign out$")
	public void Edit_browser_signout() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("header-profile-icon"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header-link-signout\"]"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);
		driver.quit();
		driver.close();

	}

	@When("^Validate error message ([^\"]*)$")
	public void validate_Only_Number_Error_Message(String ErrorMessage) throws Throwable {

		if (ErrorMessage.equalsIgnoreCase("Description cannot be empty")) {
			logger.info("ErrorMessage :" + ErrorMessage);
			logger.info("description1 :" + description1);
			logger.info("description :" + description);
			Assert.assertEquals(description1, description);
			logger.info("description1:" + description1 + "description:" + description);

		} else if (ErrorMessage.equalsIgnoreCase("Agency Code cannot be empty")) {
			logger.info("ErrorMessage :" + ErrorMessage);
			logger.info("AgencyCode1 :" + AgencyCode1);
			logger.info("AgencyCode :" + AgencyCode);
			Assert.assertEquals(AgencyCode1, AgencyCode);
			logger.info("AgencyCode1:" + AgencyCode1 + "AgencyCode:" + AgencyCode);
		} else if (ErrorMessage.equalsIgnoreCase("CGAC cannot be empty")) {
			logger.info("ErrorMessage :" + ErrorMessage);
			logger.info("CGAC1 :" + CGAC1);
			logger.info("CGAC :" + CGAC);
			Assert.assertEquals(CGAC1, CGAC);
			logger.info("CGAC1:" + CGAC1 + "CGAC:" + CGAC);
		}else if (ErrorMessage.equalsIgnoreCase("Agency field is required")) {
			logger.info("ErrorMessage :" + ErrorMessage);
			logger.info("AgencyCode12 :" + AgencyCode12);
			logger.info("AgencyCode2:" + AgencyCode2);
			Assert.assertEquals(AgencyCode12, AgencyCode2);
			logger.info("AgencyCode12:" + AgencyCode12 + "AgencyCode2:" + AgencyCode2);
		} else if (ErrorMessage.equalsIgnoreCase("CGACNum1 only numbers.")) {
			logger.info("ErrorMessage :" + ErrorMessage);
			logger.info("CGACNum1 :" + CGACNum1);
			logger.info("CGACNum:" + CGACNum );
			Assert.assertEquals(CGACNum1, CGACNum );
			logger.info("CGACNum1 :" + CGACNum1  + "CGACNum:" + CGACNum );
		}else if (ErrorMessage.equalsIgnoreCase("date fields are required")) {
			logger.info("ErrorMessage :" + ErrorMessage);
			Thread.sleep(5000);
			logger.info("Month1 :" + Month1);
			String mon = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/sam-fieldset-wrapper/div/fieldset/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
			logger.info("Month:" + mon );
			Assert.assertEquals(Month1, mon );
			logger.info("Month1 :" + Month1  + "Month:" + Month );
		}else if(ErrorMessage.equalsIgnoreCase("Agency1 Code cannot be empty")){ 
			logger.info("ErrorMessage :" + ErrorMessage);
			logger.info("Acency2 :" + AgencyCode1);
			logger.info("AgencyCode :" + AgencyCode);
			Assert.assertEquals(Acency2, AgencyCode);
			logger.info("Acency2:" + Acency2 + "AgencyCode:" + AgencyCode);
			
			
		}
		else {
			System.out.println("--------------------------------------");

		}

	}

	@Given("^User Click on edit button field is required$")
	public void Click_on_edit_button_field_is_required() throws Throwable {
		logger.info("User click on edit Agency Codes");
		Thread.sleep(1400);
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(3);
		driver.findElement(By.xpath("//*[@id=\"cgac-input\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		logger.info("click on edit Agency Codes");
	}

	@Then("^Reading field is required$")
	public void Reading_field_is_required() throws Throwable {

		Thread.sleep(10);
		AgencyCode2 = driver.findElement(By.xpath("//*[@id=\"fpds-input-error\"]")).getText();
		logger.info("AgencyCode2:: " + AgencyCode);
		CGAC2 = driver.findElement(By.xpath("//*[@id=\"cgac-input-error\"]")).getText();
		logger.info("CGAC2 ::" + CGAC);
	}

	@Given("^User Click on edit button only number$")
	public void User_Click_on_edit_button_only_number() throws Throwable{
		logger.info("User click on edit Agency Codes");
		Thread.sleep(2000);
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		driver.findElement(By.xpath("//*[@id=\"cgac-input\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		driver.findElement(By.xpath("//*[@id=\"cgac-input\"]")).sendKeys("qqq");
		logger.info("click on edit Agency Codes");
		WebElement elt1 = driver.findElement(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/sam-button/button"));
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(2000);
		
	}
	@Then("^Reading only number$")
	public void Reading_only_number(){
		CGACNum1  = driver.findElement(By.xpath("//*[@id=\"cgac-input-error\"]")).getText();
		logger.info("CGACNum1 ::++" + CGACNum1 );
	}
	
	@Given("^Reading date field Expection$")
	public void Reading_date_field_Expection() throws InterruptedException{
		Thread.sleep(1400);
		logger.info("user click on agency details button");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		//driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).clear();
		
		
		logger.info("^user click submit agency details$");
		WebElement elt1 = driver.findElement(By.xpath(
				"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/div[3]/sam-button/button"));
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
		
	}
	@Then("^date field Expection$")
	public void date_field_Expection()  throws InterruptedException{
		logger.info("Month$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		 WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/sam-fieldset-wrapper/div/fieldset/sam-date/sam-fieldset-wrapper/div/fieldset/span")));
		                                                                   
		//////////////////////////// 4 /16 you did it month comment
		//Month  = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/sam-fieldset-wrapper/div/fieldset/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		logger.info("Month++"+ Month);
		
	}
	@And("^user clear subTier Agency$")
	public void user_clear_subTier_Agency () throws Exception{
		logger.info("User click on Agency Code");
		//driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(2);
		
	}
	
	
	@Then("^Read Agecy code expecrion$") 
	public void Read_Agecy_code_expecrion(){
		
		
		 AgencyCode = driver.findElement(By.xpath("//*[@id=\"fpds-input-error\"]")).getText();	
		 logger.info("AgencyCode: "+ AgencyCode);
	}
	
	@Given("^click on federal hierancy link$")
	public void click_on_federal_hierancy_link(){
		logger.info("Scroll down");
		((JavascriptExecutor) driver).executeScript("scroll(0,-3500)");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/sam-breadcrumbs/ul/li[2]/a")).click();
	}
	
	
	@And("^serach federal hierarchy administrative pages$")
	public void serach_federal_hierarchy_administrative_pages() throws Throwable{
		Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/input")));
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/input")).sendKeys("Department0.10280681");
		
		Thread.sleep(20);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/i"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("User click on the search button");
		Thread.sleep(2000);
	}
	
	@Then("^Click on first department link$")
	public void Click_on_first_department_link() throws Throwable{
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(SubTierLocators.firstLink));
		
		WebElement elt5 = driver.findElement(SubTierLocators.firstLink);
		Actions builder5 = new Actions(driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		logger.info("The user click on the sub tier codes submit button", scenario);
		
	}
	@Then("^Click on Hierarchy link$")
	public void Click_on_Hierarchy_link() throws Throwable{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/ng-component/div/aside/div/ul/li[2]/a")));
		
		WebElement elt1 = driver.findElement(By.xpath(
				"//*[@id=\"main-container\"]/ng-component/div/aside/div/ul/li[2]/a"));
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
	}
		
	@Then("^Click on sub-tier link$")
	public void Click_on_subtier_link() throws Throwable{
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"primary-content\"]/div/div[3]/div[1]/a")));
		
		WebElement elt1 = driver.findElement(By.xpath(
				"//*[@id=\"primary-content\"]/div/div[3]/div[1]/a"));
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);
	}
}
