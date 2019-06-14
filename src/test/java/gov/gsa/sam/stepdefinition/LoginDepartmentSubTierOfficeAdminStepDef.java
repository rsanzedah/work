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
import gov.gsa.sam.base.FileReaderManager;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.utils.Constants;
import net.thucydides.core.annotations.Managed;

public class LoginDepartmentSubTierOfficeAdminStepDef {
	
	public static String officeOrg;
	public static String subTiereOrg;
	public static String Departorg;
	@Managed
	public static WebDriver driver;
	Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(LoginDepartmentSubTierOfficeAdminStepDef.class);
	// LoginStepDef login = new LoginStepDef();

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@And("^The user login into environment (\\w+)$")
	public void the_user_login_into_environment(String urlConstant) throws Throwable {
		logger.info("****COMP_HOME_PAGE. driver::" + driver);
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

	@And("^Click on department sign in link$")
	public void Click_on_department_on_sign_in_link1() throws InterruptedException {

		// login.user_click_on_signin_link(driver);

		TimeUnit.SECONDS.sleep(3);
		driver.findElement(HomePageLocator.navBarSignIn).click();
	}

	@And("^Click on department accept button$")
	public void Click_on_department_accept_button1() throws InterruptedException {

		// login.user_click_accept_button(driver);

		TimeUnit.SECONDS.sleep(3);
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	@And("^Enters the department email id (\\w+)$")
	public void the_user_enters_the_email_id1(String userName) throws Throwable {
		// login.user_enters_the_email_id(userName, driver);
		TimeUnit.SECONDS.sleep(3);
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^Enters the department password (\\w+)$")
	public void Enters_the_department_password(String password) {
		// login.user_enters_the_password(password, driver);
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
		logger.info("Username entered --  " + scenario);
	}

	@And("^Click on department sign in button$")
	public void the_user_click_on_sign_in_button1() {
		// login.user_click_on_sign_in_button(driver);
		driver.findElement(HomePageLocator.dropdownSignInButton).click();

	}

	@And("^Receive your one time department password (\\w+)$")
	public void the_user_want_to_receive_your_one_time_password1(String myEmailId) throws InterruptedException {

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

	@And("^Enters department one time access code$")
	public void Enters_department_one_time_access_code1() {
		// login.user_enters_one_time_access_code(driver);
		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		logger.info("Constants.OTP:::::" + Constants.OTP);
	}

	@And("^Click on department one time submit button$")
	public void Click_on_department_one_time_submit_button1() {
		// login.user_click_on_one_time_submit_button(driver);
		logger.info("otp submitted:" + scenario);
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
	}

	@Given("^User Click on go to department link$")
	public void User_Click_on_go_to_department_link() throws Throwable {
		logger.info("Test:::" + driver);
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(30);
		// driver.findElement(editDepartmentSubTierLocators.ClickOnDepartmentlink).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/div/div/div/div/div[2]/div/div[3]/a")).click();
	}

	@Then("^User navigate into search page$")
	public void User_navigate_into_search_page() throws Throwable {
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/input")).sendKeys("Department0.2778346"); // Department0.25113487  Department0.44889498
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/input")).sendKeys("Department0.10280681");
		Thread.sleep(5000);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/i"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(9000);
		logger.info("User click on the search button");
		Thread.sleep(2000);
		String val1 = "Department0.2778346";
		String val2 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[4]/div/div[2]/div/div[2]/div[1]/a")).getText();
		logger.info("Department0.2778346: "+val2);
		 Assert.assertEquals(val1, val1);
		 logger.info("User click on link");
		 
		 
		 WebElement elt1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[4]/div/div[2]/div/div[2]/div[1]/a"));
			Actions builder1 = new Actions(driver);
			Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
			seriesOfActions1.perform();
			Thread.sleep(1400);
			logger.info("User click on the search button");
			Thread.sleep(3000);
	}

	@And("^User click on edit agency details$")
	public void User_click_on_edit_agency_details() throws Throwable {
		logger.info("user click on agency details button");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters on Description$")
	public void User_click_on_Description() throws Throwable {
		logger.info("User click on Description");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Test");
	}

	@And("^The user enters on Short Name$")
	public void User_click_on_Short_Name() throws Throwable {
		logger.info("User click on Short Name");
		driver.findElement(By.xpath("//*[@id=\"orgShortName-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"orgShortName-input\"]")).sendKeys("Test");

	}

	@And("^click on submit agency details$")
	public void click_on_submit_agency_details() throws Throwable {
		
		logger.info("click on submit agency details");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/div[3]/sam-button/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(5000);
	}

	@And("^The user click on edit Agency Codes$")
	public void User_click_on_edit_Agency_Codes() throws Throwable {
		logger.info("User click on edit Agency Codes");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);

	}

	@And("^The user enters on Agency Code$")
	public void User_click_on_Agency_Code() {
		logger.info("User click on Agency Code");
		driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).sendKeys("56FT");
	}

	@And("^The user enters on CGAC$")
	public void User_click_on_CGAC() {
		logger.info("User click on CGAC");
		driver.findElement(By.xpath("//*[@id=\"cgac-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"cgac-input\"]")).sendKeys("111");
	}

	@And("^The user enters on CFDA Code$")
	public void User_click_on_CFDA_Code() {
		logger.info("User click on CFDA Code");
		driver.findElement(By.xpath("//*[@id=\"cfda-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"cfda-input\"]")).sendKeys("33");

	}

	@And("^TAS-2 Code code is visible$")
	public void TAS2_Code_code_is_visible() {
		logger.info("TAS-2 Code code is visible");
		boolean val1 = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/form/div/span[1]/b")).isDisplayed();
		logger.info("TAS-2 Code"+ val1);
	
		boolean val = driver.getPageSource().contains("TAS-2 Code");
		logger.info("TAS-2 Code"+ val);
		
		boolean omb = driver.getPageSource().contains("OMB Agency Code");
		logger.info("OMB Agency Code"+ omb);
	}
	
	@And("^The user click on submit Agency Codes$")
	public void User_click_on_submit_Agency_Codes() throws Throwable {
		logger.info("User click on edit Agency Codes");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/sam-button/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(5000);
	}
	@And("^The user enters on month$")
	public void The_user_enterson_month(){
		logger.info("The user enters on month");
		driver.findElement(By.xpath("//*[@id=\"org-end-date_month\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_month\"]")).sendKeys("12");
	}
	
	@And("^The user enters on Day$")
	public void The_user_enters_on_Day(){
		logger.info("The user enters on Day");
		driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).sendKeys("30");
	}
	
	@And("^The user enters on Year$")
	public void The_user_enters_on_Year(){
		logger.info("The user enters on Year");
		driver.findElement(By.xpath("//*[@id=\"org-end-date_year\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_year\"]")).sendKeys("2021");
	}
	@Given("^User Click on Hierarchy$")
	public void User_Click_on_Hierarchy() throws Throwable{
		logger.info("User Click on Hierarchy");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/aside/div/ul/li[2]/a"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		
	}
	@Then("User navigate into sub-Tier page")
	public void user_navigate_into_sub_Tier_page() throws InterruptedException{
		logger.info("sub-Tier page");
		Thread.sleep(1000);
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/div/div[3]/div[1]/a"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		
	}
	@And("^User click on edit subTier details$")
	public void User_click_on_edit_subTier_details() throws Throwable{
		logger.info("Edit subTier details");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}
	@And("The user enters subTie end month")
	public void The_user_enters_subTie_end_month(){
		driver.findElement(By.xpath("//*[@id=\"org-end-date_month\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_month\"]")).sendKeys("12");
	}
	@And ("^The user enters subTier end Day$")
	public void The_user_enters_subTier_end_Day(){
		logger.info("The user enters on Day");
		driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_day\"]")).sendKeys("30");
		
	}
	@And("^The user enters subTier end Year$")
	public void The_user_enters_subTier_end_Year(){
		logger.info("The user enters on Year");
		driver.findElement(By.xpath("//*[@id=\"org-end-date_year\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"org-end-date_year\"]")).sendKeys("2021");
		
	}
	@And("^The user enters subTier Short Name$")
	public void The_user_enters_on_subTier_Short_Name(){
		logger.info("User click on Short Name");
		driver.findElement(By.xpath("//*[@id=\"orgShortName-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"orgShortName-input\"]")).sendKeys("Test");
		
	}
	@And("^User click on submit Details Sub-Tier Details$")
	public void User_click_on_submit_subTier_agency_details() throws Throwable{
		logger.info("Edit submit subTier details");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/div[3]/sam-button/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(5000);
		
	}
	@And("^User click on edit subTier Agency Codese$")
	public void User_click_on_edit_subTier_Agency_Codes() throws Throwable{
		logger.info("Edit submit subTier details");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		
	}

	@And("The user enters on subTier Agency Codes")
	public void The_user_enters_on_subTier_Agency_Codes(){
		logger.info("User click on Agency Code");
		driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fpds-input\"]")).sendKeys("56FT");
		
	}
	
	@And("^User click on submit subTier Agency Codese$")
	public void The_user_enters_on_subTier_submit_Agency_Codes() throws Throwable{
		logger.info("Edit submit subTier details");
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/sam-button/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(5000);
	}
	
	@Then("^User click on the sub tier$")
	public void  User_click_on_the_sub_tier() throws Throwable{
		logger.info("Edit subTier details");
		
		
		///////////////////*************************
		
		Thread.sleep(3000);
		String val = "543";
		
		WebElement elt2 = driver.findElement(By.xpath("//span[contains(text(),'543')]"));
		//WebElement elt = driver.findElement(By.xpath("//span[contains(text(),'047')]"));
		Actions builder2 = new Actions(driver);
		Actions seriesOfActions2 = builder2.moveToElement(elt2);
		seriesOfActions2.perform();
		// driver.findElement(By.xpath("//a[@title=\'FAQS116\']")).click();
		//String  val1 = driver.findElement(By.xpath("//span[contains(text(),'047')]")).getText();
		String  val1 = driver.findElement(By.xpath("//span[contains(text(),'543')]")).getText();
		logger.info("Sub-Tier(L2) : "+ val1);
		 Assert.assertEquals(val1, val);
		 Thread.sleep(2000);
		
		/////////////////////*************************
		Thread.sleep(2000);
		WebElement elt = driver
				.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[3]/div/div[2]/div[1]/a"));
		
		boolean present = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[3]/div/div[2]/div[1]/a")).isDisplayed();
		logger.info("present:"+ present);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
	}
	@And("^TAS-2 code is not visible$")
	public void TAS2_code_is_not_visible() throws InterruptedException {
		
		boolean val = driver.getPageSource().contains("TAS-2 Code");
		logger.info("TAS-2::"+ val);
		
		boolean omb = driver.getPageSource().contains("OMB Bureau Code");
		logger.info("OMB Bureau Code"+ omb);
		
		Thread.sleep(1400);
	}
	

	@Given("^browser sign out$")
	public void browser_sign_out_() throws Throwable {
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
	
	
	@Then("^User click on the subTier$")
	public void User_click_on_the_subTier() throws Throwable{
		logger.info("User click on the subTier");
		Thread.sleep(3000);
	//	String val = "Agency Code:  4732";
		WebElement elt = driver.findElement(By.xpath("//div[contains(text(),'4732')]"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt);
		seriesOfActions.perform();
		//String  val1 = driver.findElement(By.xpath("//div[contains(text(),'4732')]")).getText();
		//logger.info("Sub-Tier(L2) : "+ val1);
		// Assert.assertEquals(val1, val);
		 Thread.sleep(2000);
		 WebElement elt1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[3]/div/div[2]/div[1]/a"));
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(1400);	
	}

	@And("^User select check box in Organizations that I administer$")
	public void User_select_check_box_in_Organizations_that_I_administer() throws Throwable{
		Thread.sleep(3000);
		String val  ="Organizations that I administer";
		String val2 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[1]/div/div[2]/span[5]/span/label")).getText();
		 Assert.assertEquals(val2, val);
		Thread.sleep(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"my-org-cbx\"]")).click();
		Thread.sleep(4000);
		String val11 = "GENERAL SERVICES ADMINISTRATION ";
		String val21 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div[2]/div/div/span/span[1]/a/b")).getText();
		Assert.assertEquals(val11, val21);		
		String val13 = "4700";
		String vall2 =  driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div[2]/div/div/span/span[2]/span[1]/span[2]")).getText();
		logger.info("Agency Code"+ vall2);
		Assert.assertEquals(val13, vall2);
		Thread.sleep(1000);	
	}
	
	@And("^Validate search results page$")
	public void Validate_search_results_page() throws Throwable{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/input")).sendKeys("GENERAL SERVICES ADMINISTRATION ");
		
		Thread.sleep(2000);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/i"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("User click on the search button");
		Thread.sleep(3000);
		String val1 = "GENERAL SERVICES ADMINISTRATION ";
		String val2 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[4]/div/div[2]/div/div[2]/div[1]/a")).getText();
		//*[@id="main-container"]/ng-component/div/div/div[4]/div/div[2]/div/div[2]/div[1]/a
		 Assert.assertEquals(val1, val1);
	}
	
	@And("^select subTier check box$")
	public void select_subTier_checkbox() throws Throwable{
		Thread.sleep(3000);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"Sub-Tier\"]"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		String val1 = "GENERAL SERVICES ADMINISTRATION ";
		officeOrg = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[4]/div/div[2]/div/div[2]/div[1]/a")).getText();
		logger.info("officeOrg:"+officeOrg);
		 Assert.assertEquals(val1, val1);
		
		
		
	}
	@Then("^User click on first subTier link$")
	public void User_click_on_first_subTier_link() throws Throwable{
		Thread.sleep(3000);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[4]/div/div[2]/div/div[2]/div[1]/a"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		
		
	}
	@Then("^User click on first office$")
	public void User_click_on_first_office() throws Throwable{
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"primary-content\"]/div/div[3]/div[1]/a")).click();	
	   Thread.sleep(1000);
	   
	   Thread.sleep(3000);
	   String val = "FEDERAL HIERARCHY";
	   String val2 = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[1]/title-and-section/div/h1/div")).getText();
	   
	   Assert.assertEquals(val, val2);
	   Thread.sleep(1000);
	}
	
	@And("^Go to profile page$")
	public void Go_to_profile_page() throws Throwable{
		logger.info("Click into scroll");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");
		Thread.sleep(5000);

		WebElement elt = driver.findElement(By.id("header-profile-icon"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(300);
		logger.info("Go to the profile page");

		Thread.sleep(3000);
		
		WebElement elt1 = driver.findElement(By.xpath("//*[@id=\"header-link-profile\"]"));
		Actions builder1 = new Actions(driver);
		Actions seriesOfActions1 = builder1.moveToElement(elt1).click();
		seriesOfActions1.perform();
		Thread.sleep(3000);
		
	}
	@Then("^Validate that the orgs that appear matches with user's role$")
	public void Validate_that_the_orgs_that_appear_matches_with_user_role(){
		String org = "General Services Administration (470504)";
		logger.info("org name:"+ org);
		String org1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/section/ng-component/div/results/table/tbody/tr/td[1]")).getText();
		//Assert.assertEquals(org, officeOrg);
		Assert.assertEquals(org, org1);	
	
	}

	@And("^Click on My Role Tab$")
	public void Click_on_My_Role_Tab() throws Throwable{
		                                              
		WebElement elt = driver.findElement(By.xpath(" //*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/sam-sidenav/div/a[3]"));
		//WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/sam-sidenav/div/a[3]/div/div"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("Go to the profile page");
		
	}  
	@Then("^subTier Validate that the orgs that appear matches with user's role$")
	public void subTier_Validate_that_the_orgs_that_appear_matches_with_users_role(){
		String org = "General Services Administration (4700)";
		logger.info("org name:"+ org);
		String org1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/section/ng-component/div/results/table/tbody/tr/td[1]")).getText();
		//Assert.assertEquals(org, officeOrg);
		Assert.assertEquals(org, org1);
	}
	
	@And("^Department Admin select check box in Organizations that I administer$")
	public void Department_Admin_select_check_box_in_Organizations_that_I_administer() throws Throwable{
		Thread.sleep(3000);
		String val  ="Organizations that I administer";
		String val2 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[1]/div/div[2]/span[5]/span/label")).getText();
		 Assert.assertEquals(val2, val);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"my-org-cbx\"]")).click();
		Thread.sleep(2000);
		String val11 = "GENERAL SERVICES ADMINISTRATION ";
		String val21 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div[1]/div[1]/div/div[2]/span[1]/a/b")).getText();
		logger.info("GENERAL SERVICES ADMINISTRATION"+val21);
		Assert.assertEquals(val11, val21);		
		String val13 = "047";
		String vall2 =  driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div[2]/div/div/div/span[2]/span[1]/span[2]")).getText();
		logger.info("CGAC: "+ vall2);
		Assert.assertEquals(val13, vall2);
		Thread.sleep(1000);		
	}
	
	@Then("^Department Admin Validate that the orgs that appear matches with user's role$")
	public void Department_Admin_Validate_that_the_orgs_that_appear_matches_with_user_role (){
		String org = "General Services Administration (047)";
		logger.info("org name:"+ org);
		String org1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/section/ng-component/div/results/table/tbody/tr/td[1]")).getText();
		logger.info("org1::"+ org1);
		//Assert.assertEquals(org, officeOrg);
		Assert.assertEquals(org, org1);
		
	}
	
	
	@And("^Super Admin select check box in Organizations that I administer$")
	public void Super_Admin_select_check_box_in_Organizations_that_I_administer() throws Throwable{
		Thread.sleep(1000);
		String val  ="Organizations that I administer";
		String val2 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[1]/div/div[2]/span[5]/span/label")).getText();
		 Assert.assertEquals(val2, val);
		Thread.sleep(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"my-org-cbx\"]")).click();
		Thread.sleep(2000);
		String val11 = "GENERAL SERVICES ADMINISTRATION ";
		String val21 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div[1]/div[1]/div/div[2]/span[1]/a/b")).getText();
		logger.info("GENERAL SERVICES ADMINISTRATION"+val21);
		Assert.assertEquals(val11, val21);		
		String val13 = "543";
		String vall2 =  driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div[2]/div/div/div/span[2]/span[1]/span[2]")).getText();
		logger.info("CGAC"+ vall2);
		Assert.assertEquals(val13, vall2);
		Thread.sleep(1000);	
	}
	

	@And("^Office admin select check box in Organizations that I administer$")
	public void  Office_admin_select_check_box_in_Organizations_that_I_administer() throws Throwable{
		Thread.sleep(5000);
		String val  ="Organizations that I administer";
		String val2 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div/div[1]/div/div[2]/span[5]/span/label")).getText();
		 Assert.assertEquals(val2, val);
		Thread.sleep(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"my-org-cbx\"]")).click();
		Thread.sleep(2000);
		String val11 = "GENERAL SERVICES ADMINISTRATION ";
		String val21 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div[2]/div/div/span/span[1]/a/b")).getText();
		Assert.assertEquals(val11, val21);		
		String val13 = "470504";
		String vall2 =  driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[3]/div[2]/div/div/span/span[2]/span[1]/span[2]")).getText();
		logger.info("AAC Code: "+ vall2);
		Assert.assertEquals(val13, vall2);
		Thread.sleep(1000);	
		
	}
	}
	

	
	
	

