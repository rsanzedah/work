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

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.gsa.sam.base.DateClass;
import gov.gsa.sam.base.FileReaderManager;
import gov.gsa.sam.locators.CreateOffice;
import gov.gsa.sam.locators.DepartmentLocators;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.utils.Constants;
import net.thucydides.core.annotations.Managed;

public class OfficeExceptionStepDef {
	

	@Managed
	public static WebDriver driver;
	Scenario scenario;
	
	private static Logger logger = LoggerFactory.getLogger(OfficeExceptionStepDef.class);
	
	public  String officeName1 = "This field cannot be empty";
	public  String streetAddress1 = "Street cannot be empty";
	public  String startDate1 = "Date is required";
	public  String allDate1 = "All date fields are required";
	public String endDate1 = "End Date before current date";
	public String fundStartDate1 = "Funding office type start date cannot be after office end date";
	public String fundEndDate1 = "Funding office type end date cannot be after office end date";
	public String contractingStartDate1 = "Contracting office type start date cannot be after office end date";
	public String contractingEndDate1 = "Contracting office type end date cannot be after office end date";
	public String grantsStartDate1 = "grants office type start date cannot be after office end date";
	public String grantsEndDate1 = "grants office type end date cannot be after office end date";
	public String fundingBeforeDate1 = "Funding office type end date is before current date";
	
	public static String officeName;
	public static String streetAddress;
	public static String startDate;
	public static String allDate; 
	public static String endDate;
	public static String fundStartDate;
	public static String fundEndDate;
	public static String contractingStartDate;
	public static String contractingEndDate;
	public static String grantsStartDate;
	public static String grantsEndDate;
	public static String fundingBeforeDate;


	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}
	@And("^The user enters office (\\w+)$")
	public void The_user_enters_office(String urlConstant) throws Throwable{
		System.out.println("****COMP_HOME_PAGE. driver::" + driver);
		// driver.get("https://55samfrontendcomp.apps.prod-iae.bsp.gsa.gov/");
		// login.user_enters_environment(urlConstant,driver);
		System.out.println("HI::" + urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);
	}
		
	
	@And("^The user click on office exception sign in link$")
	public void The_user_click_on_office_exception_sign_in_link() throws Throwable{
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(HomePageLocator.navBarSignIn).click();
		
	}
	
	@And("^Then click on office exception accept button$")
	public void then_click_office_exception_accept_button1() throws InterruptedException {

		// login.user_click_accept_button(driver);

		TimeUnit.SECONDS.sleep(3);
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters the office exception email id (\\w+)$")
	public void the_user_enters_the_office_exception_emailId(String userName) throws Throwable {
		// login.user_enters_the_email_id(userName, driver);
		TimeUnit.SECONDS.sleep(3);
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^The user enters the office exception password (\\w+)$")
	public void the_user_enters_the_office_exception_password(String password) {

		// login.user_enters_the_password(password, driver);
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
		logger.info("Username entered --  " + scenario);
	}

	@And("^The user click on office exception sign in button$")
	public void the_user_click_on_office_exception_sign_in_button1() {
		// login.user_click_on_sign_in_button(driver);
		driver.findElement(HomePageLocator.dropdownSignInButton).click();

	}

	@And("^The user want to receive your one time office exception password (\\w+)$")
	public void the_user_want_to_receive_your_one_time_office_exception_password(String myEmailId) throws InterruptedException {

		// login.user_want_to_receive_your_one_time_password(myEmailId,driver);
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

	@And("^The user enters office exception one time access code$")
	public void the_user_enters_office_exception_one_time_access_code1() {

		// login.user_enters_one_time_access_code(driver);
		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		logger.info("Constants.OTP:::::" + Constants.OTP);
	}

	@And("^The user click on office exception one time submit button$")
	public void the_user_click_on_office_exception_one_time_submit_button1() {
		// login.user_click_on_one_time_submit_button(driver);
		logger.info("otp submitted:" + scenario);
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
	}

	@Given("^Click Goto Federal Hierarchy link$")
	public void Click_Goto_Federal_Hierarchy_link() throws Throwable{
		System.out.println("Federal Hierarchy1234566");
		logger.info("Test:::::" + driver);
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//TimeUnit.SECONDS.sleep(3);
		Thread.sleep(3000);
		//WebElement elt = driver.findElement(
			//	By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[2]/div/div[4]/div[1]/a"));
		
		WebElement elt = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/div/div/div/div/div[2]/div/div[3]/a"));
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", elt);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		logger.info("Click on Goto Federal Hierarchy link" + driver);
		Thread.sleep(2000);
		logger.info("Workspace" + driver.getTitle(), scenario);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	@And("^Click on any active department link$")
	public void Click_on_any_active_department_link() throws Throwable{
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		logger.info("second active department link" + driver);
		Thread.sleep(3000);
		WebElement elt5 = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/div/div[4]/div[1]/a"));
		Actions builder5 = new Actions(driver);
		logger.info("Click on second link" + driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		logger.info("Pages2:::" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("The user click on the sub tier codes submit button", scenario);
		
	}
	@And("^Click on hierarchy link$")
	public void Click_on_hierarchy_link() throws Throwable{
		logger.info("second active department link" + driver);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement elt5 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/aside/div/ul/li[2]/a"));
		Actions builder5 = new Actions(driver);
		logger.info("Click on second link" + driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		logger.info("Pages2:::" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("The user click on the sub tier codes submit button", scenario);
		
	}
	
	@And("^Click on the first subTier$")
	public void  Click_on_the_first_subTier() throws Throwable{
		logger.info("second active department link" + driver);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//WebElement elt5 = driver.findElement(SubTierLocators.firstLink);
		WebElement elt5 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[2]/div/div[3]/div[1]/a"));
		Actions builder5 = new Actions(driver);
		logger.info("Click on second link" + driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		logger.info("Pages2:::" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("The user click on the sub tier codes submit button", scenario);
		
	}
	
	@And("^Click on create office$")
	public void Click_on_create_office() throws Throwable{
		Thread.sleep(2000);
		driver.findElement(CreateOffice.createOfficeButton).click();
	}
	
	@Given("^User click on Create office submit button$")
	public void Create_office_submit_button() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(5000);

		driver.findElement(CreateOffice.createOfficeButton).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	@And("^The user enters office details correct Name ([^\"]*)$")
	public void The_user_enters_office_details_Name_correct(String officeDetails) throws Throwable {
		logger.info("Enter into login method:");
		 Thread.sleep(3000);
		  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//int val = (int) Math.ceil(Math.random() * 1000);
		driver.findElement(By.xpath("//*[@id=\"orgName-input\"]")).sendKeys(officeDetails);
		logger.info("enters create office name", scenario);
	}

	@And("^The user enters create office correct start month ([^\"]*)$")
	public void The_user_enters_create_office_start_month_correct(String startMonth) {
		driver.findElement(CreateOffice.officeDate).sendKeys(DateClass.getCurrentMonth());
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters create office correct start day ([^\"]*)$")
	public void The_user_enters_create_office_start_day_correct(String startDay) {
		driver.findElement(DepartmentLocators.startDay).sendKeys(DateClass.getCurrentDay());
		logger.info("enters start day ", scenario);
	}

	@And("^The user enters create office correct start year ([^\"]*)$")
	public void The_user_enters_create_office_start_year_correct(String startYear) {
		driver.findElement(DepartmentLocators.startYear).sendKeys(DateClass.getCurrentYear());
		logger.info("enters start year ", scenario);
	}

	@And("^The user enters create office correct end month ([^\"]*)$")
	public void The_user_enter_create_office_end_month_correct(String EndMonth) {
		driver.findElement(CreateOffice.officeEndMonth).sendKeys(EndMonth);
		logger.info("enters start month ", scenario);
	}

	@And("^user enter office end day ([^\"]*)$")
	public void user_enters_office_end_day(String EndDay) {
		//driver.findElement(CreateOffice.officeEndDay).sendKeys(DateClass.getCurrentMonth());
		logger.info("End dae: "+ EndDay);
		driver.findElement(CreateOffice.officeEndDay).sendKeys(EndDay);
		logger.info("End dae: "+ scenario);
		
	}

	@And("^The user enters create office correct end year ([^\"]*)$")
	public void The_user_enters_create_office_end_year_correct(String EndYear) {
		driver.findElement(CreateOffice.officeEndYear).sendKeys(EndYear);
		logger.info("enters End year ", scenario);

	}

	@And("^The user enters office correct short name ([^\"]*)$")
	public void The_user_enters_office_short_name_correct(String ShortName) {
		driver.findElement(CreateOffice.officeShortName).sendKeys(ShortName);
		logger.info("enters ShortName ", scenario);

	}

	@And("^The user select office type correct funding ([^\"]*)$")
	public void The_user_select_office_type_funding_correct(String funding) {
 
		driver.findElement(CreateOffice.funding).click();
		logger.info("enters funding ", scenario);
	}
	
	
	
	@And("^The user enters funding office correct start month ([^\"]*)$")
	public void The_user_enters_funding_office_start_month_correct(String fundingstartMonth) {
		//driver.findElement(CreateOffice.fundingStartMonth).sendKeys(DateClass.getCurrentMonth());
		driver.findElement(CreateOffice.fundingStartMonth).sendKeys(fundingstartMonth);
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters funding office correct start day ([^\"]*)$")
	public void The_user_enters_funding_office_start_day_correct(String fundingstartDay) {
		driver.findElement(CreateOffice.fundingStartDay).sendKeys(DateClass.getCurrentDay());
		logger.info("enters start day ", scenario);
	}

	@And("^The user enters funding office correct start year ([^\"]*)$")
	public void The_user_enters_funding_office_start_year_correct(String fundingstartYear) {
		driver.findElement(CreateOffice.fundingStartYear).sendKeys(DateClass.getCurrentYear());
		logger.info("enters start year ", scenario);
	}

	@And("^The user enters funding office correct end month ([^\"]*)$")
	public void The_user_enter_funding_office_end_month_correct(String fundingEndMonth) {
		driver.findElement(CreateOffice.fundingEndMonth).sendKeys(fundingEndMonth);
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters funding office correct end day ([^\"]*)$")
	public void The_user_enters_funding_office_end_day_correct(String fundingEndDay) {
		driver.findElement(CreateOffice.fundingEndDay).sendKeys(fundingEndDay);
		logger.info("enters End day ", scenario);
	}

	@And("^The user enters funding office correct end year ([^\"]*)$")
	public void The_user_enters_funding_office_end_year_correct(String fundingEndYear) {
		driver.findElement(CreateOffice.fundingEndYear).sendKeys(fundingEndYear);
		logger.info("enters End year ", scenario);
	}
	
	@And("^The user select office type correct contracting ([^\"]*)$")
	public void The_user_select_office_type_contracting_correct(String contracting) {
		driver.findElement(CreateOffice.contracting).click();
		logger.info("enters contracting ", scenario);
	}
	
	@And("^The user enters contracting office correct start month ([^\"]*)$")
	public void The_user_enters_contracting_office_start_month_correct(String contractingstartMonth) {
		driver.findElement(CreateOffice.contractingStartMonth).sendKeys(DateClass.getCurrentMonth());
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters contracting office correct start day ([^\"]*)$")
	public void The_user_enters_contracting_office_start_day_correct(String contractingstartDay) {
		driver.findElement(CreateOffice.contractingStartDay).sendKeys(DateClass.getCurrentDay());
		logger.info("enters start day ", scenario);
	}

	@And("^The user enters contracting office correct start year ([^\"]*)$")
	public void The_user_enters_contracting_office_start_year_correct(String contractingstartYear) {
		driver.findElement(CreateOffice.contractingStartYear).sendKeys(DateClass.getCurrentYear());
		logger.info("enters start year ", scenario);
	}

	@And("^The user enters contracting office correct end month ([^\"]*)$")
	public void The_user_enter_contracting_office_end_month(String contractingEndMonth) {
		driver.findElement(CreateOffice.contractingEndMonth).sendKeys(contractingEndMonth);
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters contracting office correct end day ([^\"]*)$")
	public void The_user_enters_contracting_office_end_day_correct(String contractingEndDay) {
		driver.findElement(CreateOffice.contractingEndDay).sendKeys(contractingEndDay);
		logger.info("enters End day ", scenario);
	}

	@And("^The user enters contracting office correct end year ([^\"]*)$")
	public void The_user_enters_contracting_office_end_year_correct(String contractingEndYear) {
		driver.findElement(CreateOffice.contractingEndYear).sendKeys(contractingEndYear);
		logger.info("enters End year ", scenario);
	}

	@And("^The user select office type correct grants ([^\"]*)$")
	public void The_user_select_office_type_grants_correct(String grants) {
		driver.findElement(CreateOffice.grants).click();
		logger.info("enters grants ", scenario);
	}

	
	@And("^The user enters grants office correct start month ([^\"]*)$")
	public void The_user_enters_grants_office_start_month_correct(String grantsstartMonth) {
	driver.findElement(CreateOffice.grantsStartMonth).sendKeys(DateClass.getCurrentMonth());
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters grants office correct start day ([^\"]*)$")
	public void The_user_enters_grants_office_start_day_correct(String grantsstartDay) {
		driver.findElement(CreateOffice.grantsStartDay).sendKeys(DateClass.getCurrentDay());
		logger.info("enters start day ", scenario);
	}

	@And("^The user enters grants office correct start year ([^\"]*)$")
	public void The_user_enters_grants_office_start_year_correct(String grantsstartYear) {
	driver.findElement(CreateOffice.grantsStartYear).sendKeys(DateClass.getCurrentYear());
		logger.info("enters start year ", scenario);
	}

	@And("^The user enters grants office correct end month ([^\"]*)$")
	public void The_user_enter_grants_office_end_month_correct(String grantsEndMonth) {
		driver.findElement(CreateOffice.grantsEndMonth).sendKeys(grantsEndMonth);
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters grants office correct end day ([^\"]*)$")
	public void The_user_enters_grants_office_end_day_correct(String grantsEndDay) {
		driver.findElement(CreateOffice.grantsEndDay).sendKeys(grantsEndDay);
		logger.info("enters End day ", scenario);
	}

	@And("^The user enters grants office correct end year ([^\"]*)$")
	public void The_user_enters_grants_office_end_year_correct(String grantsEndYear) {
		driver.findElement(CreateOffice.grantsEndYear).sendKeys(grantsEndYear);
		logger.info("enters End year ", scenario);
	}

	@And("^The user select office type correct other ([^\"]*)$")
	public void The_user_select_office_type_other_correct(String other) {
		driver.findElement(CreateOffice.other).click();
		logger.info("enters other ", scenario);

	}

	@And("^The user enters other office correct start month ([^\"]*)$")
	public void The_user_enters_other_office_start_month(String otherstartMonth) {
		driver.findElement(CreateOffice.otherStartMonth).sendKeys(DateClass.getCurrentMonth());
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters other office correct start day ([^\"]*)$")
	public void The_user_enters_other_office_start_day_correct(String otherstartDay) {
		driver.findElement(CreateOffice.otherStartDay).sendKeys(DateClass.getCurrentDay());
		logger.info("enters start day ", scenario);
	}

	@And("^The user enters other office correct start year ([^\"]*)$")
	public void The_user_enters_other_office_start_year_correct(String otherstartYear) {
		driver.findElement(CreateOffice.otherStartYear).sendKeys(DateClass.getCurrentYear());
		logger.info("enters start year ", scenario);
	}

	@And("^The user enters other office correct end month ([^\"]*)$")
	public void The_user_enter_other_office_end_month_correct(String otherEndMonth) {
		driver.findElement(CreateOffice.otherEndMonth).sendKeys(otherEndMonth);
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters other office correct end day ([^\"]*)$")
	public void The_user_enters_other_office_end_day_correct(String otherEndDay) {
		driver.findElement(CreateOffice.otherEndDay).sendKeys(otherEndDay);
		logger.info("enters End day ", scenario);
	}

	@And("^The user enters other office correct end year ([^\"]*)$")
	public void The_user_enters_other_office_end_year_correct(String otherEndYear) {
		driver.findElement(CreateOffice.otherEndYear).sendKeys(otherEndYear);
		logger.info("enters End year ", scenario);
	}

	
	@And("^The user enters street correct address ([^\"]*)$")
	public void The_user_enters_street_address_correct(String address) {
		driver.findElement(CreateOffice.officeStreet).sendKeys(address);
		logger.info("enters officeStreet ", scenario);
	}

	@And("^The user enters correct country ([^\"]*)$")
	public void The_user_enters_country_correct(String country) throws Throwable {
		logger.info("country:"+ country);
		Boolean val = driver.findElement(By.xpath("//*[@id=\"location-group-country\"]")).isDisplayed();
		logger.info("Boolean::"+val);
	   // driver.findElement(By.xpath("//*[@id=\"location-group-country\"]")).sendKeys("USA - UNITED STATES");
	    driver.findElement(By.xpath("//*[@id=\"location-group-country\"]")).sendKeys("USA");
	   
	  logger.info("enters country ", scenario);
	}

	@And("^The enters correct zip ([^\"]*)$")
	public void The_enters_zip_correct(String officeZip) throws Throwable {
		driver.findElement(CreateOffice.officeZip).sendKeys("36310");
		Thread.sleep(2000);
		logger.info("enters officeZip ", scenario);

	}

	@And("^The enters correct city ([^\"]*)$")
	public void The_enters_city_correct(String officeCity) throws Throwable {
		logger.info("city:"+ officeCity);
		Thread.sleep(2000);
		Boolean test = driver.findElement(By.xpath("//*[@id=\"location-group-city\"]")).isDisplayed();
		logger.info("City1234: ", test);
		driver.findElement(By.xpath("//*[@id=\"location-group-city\"]")).click();
		Thread.sleep(3000);
		Boolean test2 = driver.findElement(By.xpath("//span[text()='Abbeville, AL']")).isDisplayed();
		logger.info("City:::::::::::::::::::::::::::: ", test2);
		Thread.sleep(2000);
		WebElement elt = driver.findElement(By.xpath("//span[text()='Abbeville, AL']"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		logger.info("enters officeCity ", scenario);

	}

	@And("^The enters correct state ([^\"]*)$")
	public void The_enters_state_correct(String state) throws Throwable {

		logger.info("enters officeState ", scenario);

	}

	@Then("user click on submit office button")
	public void The_user_click_on_submit_create_office_button_correct() throws Throwable {
		driver.findElement(CreateOffice.officeSubmit).click();
		logger.info("Click on Buttom ", scenario);
		Thread.sleep(5000);

	} 
	@Then("^user click on Confirmation office button$")
	public void  The_user_click_on_Confirmation_create_office_button_correct() throws Throwable{
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button")).click();	
		Thread.sleep(3000);
	}
	
	@Then("user click sub-tier breadcrumbs link")
	public void user_click_sub_tier_breadcrumbs_link() throws Throwable{
		((JavascriptExecutor) driver).executeScript("scroll(0,-2000)");
		Thread.sleep(1000);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[4]/a"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		logger.info("enters officeCity ", scenario);
	}
	
	
	
	@Then("user click on create office submit office button")
	public void user_click_on_create_office_submit_office_button() throws Throwable{
		Thread.sleep(1000);
		logger.info("Scrolll down ", scenario);
		((JavascriptExecutor) driver).executeScript("scroll(0,3000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button")).click();
		logger.info("Click on Buttom ", scenario);
		//((JavascriptExecutor) driver).executeScript("scroll(0,3000)");
		Thread.sleep(2000);
	       officeName = driver.findElement(By.xpath("//*[@id=\"orgName-input-error\"]")).getText();
	       logger.info("This field cannot be empty (officeName)::::::::::::::"+ officeName);
	       
	       ((JavascriptExecutor) driver).executeScript("scroll(0,3000)");
		 streetAddress = driver.findElement(By.xpath("//*[@id=\"street-1-input-error\"]")).getText();
		 logger.info("Street cannot be empty (streetAddress)::::::::::::::"+  streetAddress);
		//startDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();

		
		Thread.sleep(5000);
		
	}
	
	  @When("^Validating only number error message ([^\"]*)$")
	    public void Validating_Only_Number_Error_Message(String ErrorMessage) throws Throwable  {
	    	
	    	if(ErrorMessage.equalsIgnoreCase("officeDetailsExpectation")) { 
	    		logger.info("ErrorMessage :"+ ErrorMessage);
	    		Assert.assertEquals(officeName1, officeName);	
	    		logger.info("officeName1:" +officeName1 + "agencyNameExsit:"+  officeName);
	    		
	    	}else if(ErrorMessage.equalsIgnoreCase("addressExpectation")) {
	    		logger.info("ErrorMessage :"+ ErrorMessage);
	    		Assert.assertEquals(streetAddress1, streetAddress);
	    		logger.info("streetAddress1:" +streetAddress1 + "streetAddress:"+  streetAddress);
	    		

	    	}else if(ErrorMessage.equalsIgnoreCase("fundingstartMonthExpectation")) {
	    		logger.info("ErrorMessage :"+ ErrorMessage);
	    		Assert.assertEquals(allDate1,  allDate);
	    		logger.info(" allDate1:" + allDate1 + " allDate:"+   allDate);
	         }else if(ErrorMessage.equalsIgnoreCase("EndYearExpectation")) {
		    		logger.info("ErrorMessage :"+ ErrorMessage);
		    		Assert.assertEquals(endDate1,  endDate);
		    		logger.info(" endDate1:" + endDate + " endDate:"+   endDate);
		       }else if(ErrorMessage.equalsIgnoreCase("fundingEndYearExpectation")) {
		    		logger.info("ErrorMessage() :"+ ErrorMessage);
		    		logger.info("fundingBeforeDate1 : "+ fundingBeforeDate);
		    		logger.info("fundingBeforeDate : "+ fundingBeforeDate1);
		    		Assert.assertEquals(fundingBeforeDate1,  fundingBeforeDate);
		    		logger.info(" fundingBeforeDate1:" + fundingBeforeDate1 + " fundingBeforeDate:"+   fundingBeforeDate);
		       }else {
	    		System.out.println("--------------------------------------");
	    		
	    	}
	    	
	    }
		
		@And("^The user enters invalid start month$")
	  public void The_user_enters_invalid_start_month() throws InterruptedException{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"orgName-input\"]")).sendKeys("TestName");
			driver.findElement(CreateOffice.officeDate).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(DepartmentLocators.startDay).sendKeys(DateClass.getCurrentDay());
			driver.findElement(DepartmentLocators.startYear).sendKeys(DateClass.getCurrentYear());
			driver.findElement(CreateOffice.funding).click();
			driver.findElement(CreateOffice.fundingStartMonth).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(CreateOffice.fundingStartDay).sendKeys();
			driver.findElement(CreateOffice.fundingStartYear).sendKeys(DateClass.getCurrentYear());
			logger.info("enters start month ", scenario);
		
	  }
	  @Then("^user click on submit invalid date office button$")
		public void user_click_on_submit_office_invalid_date_button() throws Throwable{
			Thread.sleep(1000);
			logger.info("Scrolll down ", scenario);
			((JavascriptExecutor) driver).executeScript("scroll(0,3000)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button")).click();
			logger.info("Click on Buttom ", scenario);
			Thread.sleep(2000);
		       allDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[4]/form/div[2]/div[1]/div[1]/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		       logger.info("All date fields are required (allDate)::::::::::::::"+ allDate);
		       Thread.sleep(3000);
		     Thread.sleep(5000);
		}
	  
	  @And("^The user enters invalid date$")
	  public void The_user_enters_invalid_date() throws Throwable{
		  Thread.sleep(3000);
		  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"orgName-input\"]")).sendKeys("TestName");
			driver.findElement(CreateOffice.officeDate).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(DepartmentLocators.startDay).sendKeys(DateClass.getCurrentDay());
			driver.findElement(DepartmentLocators.startYear).sendKeys(DateClass.getCurrentYear());
			driver.findElement(CreateOffice.officeEndDay).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(CreateOffice.officeEndMonth).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(CreateOffice.officeEndYear).sendKeys("2017");
			driver.findElement(CreateOffice.funding).click();
			driver.findElement(CreateOffice.fundingStartMonth).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(CreateOffice.fundingStartDay).sendKeys(DateClass.getCurrentDay());
			driver.findElement(CreateOffice.fundingStartYear).sendKeys(DateClass.getCurrentYear());
			driver.findElement(CreateOffice.fundingEndMonth).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(CreateOffice.fundingEndDay).sendKeys(DateClass.getCurrentDay());
			driver.findElement(CreateOffice.fundingEndYear).sendKeys("2000");
			driver.findElement(CreateOffice.contracting).click();
			driver.findElement(CreateOffice.contractingStartMonth).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(CreateOffice.contractingStartDay).sendKeys(DateClass.getCurrentDay());
			driver.findElement(CreateOffice.contractingStartYear).sendKeys(DateClass.getCurrentYear());
			driver.findElement(CreateOffice.contractingEndMonth).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(CreateOffice.contractingEndDay).sendKeys(DateClass.getCurrentDay());
			driver.findElement(CreateOffice.contractingEndYear).sendKeys(DateClass.getCurrentYear());
			driver.findElement(CreateOffice.grants).click();
			driver.findElement(CreateOffice.grantsStartYear).sendKeys(DateClass.getCurrentYear());
			driver.findElement(CreateOffice.grantsStartDay).sendKeys(DateClass.getCurrentDay());
			driver.findElement(CreateOffice.grantsStartMonth).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(CreateOffice.grantsEndMonth).sendKeys(DateClass.getCurrentYear());
			driver.findElement(CreateOffice.grantsEndDay).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(CreateOffice.grantsEndYear).sendKeys(DateClass.getCurrentYear());
			driver.findElement(CreateOffice.officeStreet).sendKeys("2244 lake dr");
			driver.findElement(CreateOffice.officeZip).sendKeys("36310");
			Thread.sleep(2000);
			Boolean test = driver.findElement(By.xpath("//*[@id=\"location-group-city\"]")).isDisplayed();
			logger.info("City1234: ", test);
			driver.findElement(By.xpath("//*[@id=\"location-group-city\"]")).click();
			Thread.sleep(2000);
			Boolean test2 = driver.findElement(By.xpath("//span[text()='Abbeville, AL']")).isDisplayed();
			logger.info("city: invlid::"+test2);
			Thread.sleep(2000);
			WebElement elt = driver.findElement(By.xpath("//span[text()='Abbeville, AL']"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(2000);
			//driver.findElement(CreateOffice.officeSubmit).click();
			logger.info("enters start month ", scenario);
	  }
	  
	  @Then("^user click on invalid date confirmation button$")
	  public void user_click_on_invalid_date_confirmation_button() throws Throwable{
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button")).click();
		Thread.sleep(3000);	
		
		endDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		fundStartDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[4]/form/div[2]/div[1]/div[1]/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		//fundEndDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		contractingStartDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[4]/form/div[2]/div[1]/div[2]/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		contractingEndDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[4]/form/div[2]/div[1]/div[2]/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		grantsStartDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[4]/form/div[2]/div[2]/div[1]/div/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		grantsEndDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[4]/form/div[2]/div[2]/div[1]/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		fundingBeforeDate = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/sam-date/sam-fieldset-wrapper/div/fieldset/span")).getText();
		Thread.sleep(5000);
	  }
}
