package gov.gsa.sam.stepdefinition;

//public class NegCreateDepartSubTierscenariosStepDef {

import gov.gsa.sam.base.DateClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
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
import cucumber.api.java.en.When;
import gov.gsa.sam.base.FileReaderManager;
import gov.gsa.sam.utils.BaseClass;
import gov.gsa.sam.utils.Constants;
import net.thucydides.core.annotations.Managed;
import gov.gsa.sam.locators.DepartmentErrorMessageLocators;
import gov.gsa.sam.locators.DepartmentLocators;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.locators.Locators;
import org.junit.Assert;

public class NegCreateDepartSubTierscenariosStepDef {

	private static Logger logger = LoggerFactory.getLogger(NegCreateDepartSubTierscenariosStepDef.class);

	public String agencyCodes = "This field cannot be empty";
	public String onlyNumber = "Please enter only numbers.";
	public String EndDate = "End date cannot be earlier than the start date.";
	public String nameExists = "This name already exists. Please enter a different name.";
	public String datefield = "Date is required";
	public String datefield1 = "All date are required";
	public String specialagencyCode = "Please enter only alphanumeric values.";
	

	public static String agencyNameValue;
	public static String descriptions;
	public static String cgacValue;
	public static String omgValue;
	public static String tsaValue;
	public static String agencyCodeValue;
	public static String agencyNameExsit;
	public static String cgacNumber;
	public static String fpdsNumber;
	public static String ombNumber;
	public static String cfdaNumber;
	public static String tasNumber;
	public static String existNumber;
	public static String subTierAgencyCode1;
	public static String sunTierDate1;
	public static String subTierOrgName1;
	public static String agencyCodeValue1;
	public static String subTieragencyCode;
	public static String subTierAllDate;
	
	
	//public static String subTierDate;
	
	
	@Managed
	public static WebDriver driver;
	Scenario scenario;
	
	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Given("^environment (\\w+)$")
	public void environment_COMP_HOME_PAGE(String urlConstant) throws Throwable{
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

	/*@And("^The user enters environment message (\\w+)$")
	public static void the_user_enters_a_URL1(String urlConstant) {
		// Otpclass.the_user_enters_a_URL(urlConstant);

		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
	}*/

	@And("^The user click on message sign in link$")
	public void the_user_click_on_sign_in_link1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(HomePageLocator.navBarSignIn).click();
	}

	@And("^Then click on message accept button$")
	public void then_click_accept_button1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters the message email id (\\w+)$")
	public void the_user_enters_the_email_id1(String userName) throws Throwable {
		// otp.the_user_enters_the_email_id(userName);
		TimeUnit.SECONDS.sleep(3);
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
		
	}

	@And("^The user enters the message password (\\w+)$")
	public void the_user_enters_the_password1(String password) {
		// otp.the_user_enters_the_password(password);
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
	}

	@And("^The user click on message sign in button$")
	public void the_user_click_on_sign_in_button1() {
		// otp.the_user_click_on_sign_in_button();
		driver.findElement(HomePageLocator.dropdownSignInButton).click();
	}

	@And("^The user want to receive your one time message password (\\w+)$")
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

	@And("^The user enters message one time access code$")
	public void the_user_enters_one_time_access_code1() {
		// otp.the_user_enters_one_time_access_code();

		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		logger.info("Constants.OTP:::::" + Constants.OTP);
	}

	@And("^The user click on message one time submit button$")
	public void the_user_click_on_one_time_submit_button1() {
		logger.info("otp submitted:" + scenario);
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
	}

	/*
	 * @Given("^Set cookies in admin token pages$") public void
	 * set_Cookies_In_Admin_Token_Page() throws Throwable{
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Chrome Driver\\chromedriver.exe"); DesiredCapabilities chrome_cap =
	 * DesiredCapabilities.chrome(); ChromeOptions options = new
	 * ChromeOptions(); options.addArguments("disable-infobars");
	 * options.addArguments("start-maximized");
	 * options.addArguments("--incognito");
	 * options.setExperimentalOption("useAutomationExtension", false);
	 * chrome_cap.setCapability(ChromeOptions.CAPABILITY, options);
	 * ChromeDriverManager.getInstance().setup(); driver = new
	 * ChromeDriver(chrome_cap);
	 * driver.get("http://localhost:4200/role-management/rm");
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * driver.manage().window().maximize(); boolean isenbled =
	 * driver.findElement(DepartmentLocators.clearCookies).isEnabled();
	 * System.out.println("Clear Cookies button : "+ isenbled);
	 * driver.findElement(DepartmentLocators.clearCookies).click(); boolean
	 * selectElement =
	 * driver.findElement(DepartmentLocators.selectAdminToken).isEnabled();
	 * System.out.println("Adimin Token drop down : "+ selectElement); Select
	 * selectAdminToken = new
	 * Select(driver.findElement(DepartmentLocators.selectAdminToken));
	 * selectAdminToken.selectByIndex(5); }
	 * 
	 * @Then("^User click on set admin token cookies$") public void
	 * user_Successfully_Set_The_Admin_Token_Cookie() { boolean setcookies =
	 * driver.findElement(DepartmentLocators.setcookies).isEnabled();
	 * System.out.println("set Cookies button : "+ setcookies);
	 * driver.findElement(DepartmentLocators.setcookies).click();
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }
	 */
	@Given("^Submit create depatment button without filling value$")
	public void submit_Create_Depatment_Button_Without_Filling_Value() throws Throwable {
		/*((JavascriptExecutor) driver).executeScript("window.open('http://localhost:4200/fh')");
		Set<String> tab_handles = driver.getWindowHandles();
		int number_of_tabs = tab_handles.size();
		int new_tab_index = number_of_tabs - 1;
		driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());*/
		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		WebElement elt3 = driver.findElement(DepartmentLocators.submit);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);
		logger.info("Click on Submit button");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		NegCreateDepartSubTierscenariosStepDef.agencyNameValue = driver.findElement(DepartmentErrorMessageLocators.inputAgency).getText();
		System.out.println(" NegCreateDepartSubTierscenariosStepDef.agencyNameValue :" + NegCreateDepartSubTierscenariosStepDef.agencyNameValue);

		NegCreateDepartSubTierscenariosStepDef.descriptions = driver.findElement(DepartmentErrorMessageLocators.descriptionmsg).getText();
		System.out.println(" NegCreateDepartSubTierscenariosStepDef.descriptions :" + NegCreateDepartSubTierscenariosStepDef.descriptions);

		NegCreateDepartSubTierscenariosStepDef.cgacValue = driver.findElement(DepartmentErrorMessageLocators.cgac).getText();
		System.out.println("NegCreateDepartSubTierscenariosStepDef. cgacValue :" + NegCreateDepartSubTierscenariosStepDef.cgacValue);

		NegCreateDepartSubTierscenariosStepDef.agencyCodeValue = driver.findElement(DepartmentErrorMessageLocators.agencyCode).getText();
		System.out.println(" NegCreateDepartSubTierscenariosStepDef. agencyCodeValue :" + NegCreateDepartSubTierscenariosStepDef.agencyCodeValue);

		//NegCreateDepartSubTierscenariosStepDef.omgValue = driver.findElement(DepartmentErrorMessageLocators.omg).getText();
		//System.out.println(" NegCreateDepartSubTierscenariosStepDef. omgValue: " + NegCreateDepartSubTierscenariosStepDef.omgValue);

		NegCreateDepartSubTierscenariosStepDef.tsaValue = driver.findElement(DepartmentErrorMessageLocators.tas).getText();
		System.out.println(" NegCreateDepartSubTierscenariosStepDef. tsaValue: " + NegCreateDepartSubTierscenariosStepDef.tsaValue);
	}

	@Then("^User Clicks on Federal Hierarchy link$")
	public void the_user_submitted_without_filling_the_data() throws Throwable {
		Thread.sleep(2);
		((JavascriptExecutor) driver).executeScript("scroll(0,-2500)");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/a")).click();

		Thread.sleep(1000);
	}

	@Given("^Enter the URL$")
	public void enter_The_URL() throws Throwable {
		/*((JavascriptExecutor) driver).executeScript("window.open('http://localhost:4200/fh')");
		Set<String> tab_handles = driver.getWindowHandles();
		int number_of_tabs = tab_handles.size();
		int new_tab_index = number_of_tabs - 1;
		driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
		System.out.println("Pages1:::" + driver.getTitle());*/
		WebElement elt = driver.findElement(DepartmentLocators.clickOnCreateDept);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		System.out.println("Pages2:::" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

	}

	@When("The user enters agency name ([^\"]*)$")
	public void the_User_Enters_Agency_Name(String DepartmentName) throws Throwable {

		driver.findElement(DepartmentLocators.departmentName).sendKeys(DepartmentName);

		driver.findElement(DepartmentLocators.startMonth).sendKeys(DateClass.getCurrentMonth());

		System.out.println("Month::::::::" + (DateClass.getCurrentMonth()));
		driver.findElement(DepartmentLocators.startDay).sendKeys(DateClass.getCurrentDay());
		System.out.println("Month::::::::" + (DateClass.getCurrentDay()));
		driver.findElement(DepartmentLocators.startYear).sendKeys(DateClass.getCurrentYear());
		System.out.println("Month::::::::" + (DateClass.getCurrentYear()));
	}

	@When("^The user enters Description ([^\"]*)$")
	public void the_User_Enters_Description(String Description) throws Throwable {
		driver.findElement(DepartmentLocators.description1).sendKeys(Description);

	}

	@When("The user enters CGAC ([^\"]*)$")
	public void the_User_Enters_CGAC(String CGAC) throws Throwable {
		driver.findElement(DepartmentLocators.cgacCode).sendKeys(CGAC);
	}

	@When("The user enters Agency code ([^\"]*)$")
	public void the_User_Enters_Agency_Code(String AgencyCode) throws Throwable {
		driver.findElement(DepartmentLocators.agencyCode).sendKeys(AgencyCode);

	}

	/*@When("The user enters OMB ([^\"]*)$")
	public void the_User_Enters_OMB(String OMB) throws Throwable {
		driver.findElement(DepartmentLocators.ombCode).sendKeys(OMB);

	}*/

	@When("The user enters CFDC ([^\"]*)$")
	public void the_User_Enters_CFDA_Code(String CFDAValue) throws Throwable {
		driver.findElement(DepartmentLocators.cfdaCode).sendKeys(CFDAValue);

	}

	@When("The user enters TAS ([^\"]*)$")
	public void the_User_Enters_TAS(String TAS) throws Throwable {
		driver.findElement(DepartmentLocators.tas2Code).sendKeys(TAS);

	}

	@Then("^The User click on the department submit button$")
	public void the_User_Click_On_The_Department_Submit_Button() throws Throwable {

		WebElement elt3 = driver.findElement(DepartmentLocators.submit);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);

	}

	@When("^Validate create department([^\"]*)$")
	public void validate_creatw_department(String ErrorMessage) throws Throwable {

		if (ErrorMessage.equalsIgnoreCase("AgencyError")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(agencyCodes, agencyNameValue);
			System.out.println("agencyCodes:" + agencyCodes + "agencyNameValue:" + agencyNameValue);

		} /*
			 * else if(ErrorMessage.equalsIgnoreCase("CGACnumberExist")) {
			 * System.out.println("ErrorMessage :"+ ErrorMessage);
			 * Assert.assertEquals(onlyNumber, cgacValue);
			 * System.out.println(onlyNumber + cgacValue);
			 * 
			 * }
			 */else if (ErrorMessage.equalsIgnoreCase("AgencyCodeError")) {
			System.out.println("ErrorMessage::::::: :" + ErrorMessage);
			Assert.assertEquals(agencyCodes, agencyCodeValue);
			System.out.println(agencyCodes + agencyCodeValue);

		} else if (ErrorMessage.equalsIgnoreCase("OMBError")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(agencyCodes, omgValue);
			System.out.println(agencyCodes + omgValue);

		} else if (ErrorMessage.equalsIgnoreCase("TASError")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(agencyCodes, tsaValue);
			System.out.println(agencyCodes + tsaValue);
		} else if (ErrorMessage.equalsIgnoreCase("DescriptionError")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(agencyCodes, descriptions);
			System.out.println(agencyCodes + tsaValue);

		} else {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(agencyCodes, cgacValue);
			System.out.println(agencyCodes + cgacValue);
		}

	}

	@Given("^Submit create depatment button with filling value$")
	public void submit_Create_Depatment_Button_With_Filling_Value() throws Throwable {
		
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		/*((JavascriptExecutor) driver).executeScript("window.open('http://localhost:4200/fh')");
		Set<String> tab_handles = driver.getWindowHandles();
		int number_of_tabs = tab_handles.size();
		int new_tab_index = number_of_tabs - 1;
		driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
		System.out.println("Pages1:::" + driver.getTitle());
		WebElement elt = driver.findElement(DepartmentLocators.clickOnCreateDept);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		System.out.println("Pages2:::" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);*/

		driver.findElement(DepartmentLocators.departmentName).sendKeys("Department0.10280681");
		driver.findElement(DepartmentLocators.startMonth).sendKeys(DateClass.getCurrentMonth());
		driver.findElement(DepartmentLocators.startDay).sendKeys(DateClass.getCurrentDay());
		driver.findElement(DepartmentLocators.startYear).sendKeys(DateClass.getCurrentYear());
		driver.findElement(DepartmentLocators.description1).sendKeys("description");
		driver.findElement(DepartmentLocators.cgacCode).sendKeys("abc");
		driver.findElement(DepartmentLocators.agencyCode).sendKeys("123");
		//driver.findElement(DepartmentLocators.ombCode).sendKeys("asc");
		driver.findElement(DepartmentLocators.cfdaCode).sendKeys("abc");
		driver.findElement(DepartmentLocators.tas2Code).sendKeys("av");
/*
		WebElement elt3 = driver.findElement(DepartmentLocators.submit);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(2000);*/

		WebElement elt31 = driver.findElement(DepartmentLocators.submit);
		Actions builder31 = new Actions(driver);
		Actions seriesOfActions31 = builder31.moveToElement(elt31).click();
		seriesOfActions31.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		NegCreateDepartSubTierscenariosStepDef.agencyNameExsit = driver.findElement(DepartmentErrorMessageLocators.agencyNameExist)
				.getText();
		System.out.println(" NegCreateDepartSubTierscenariosStepDef.agencyNameExsit :" + NegCreateDepartSubTierscenariosStepDef.agencyNameExsit);

		NegCreateDepartSubTierscenariosStepDef.cgacNumber = driver.findElement(DepartmentErrorMessageLocators.cgac1).getText();
		System.out.println(" NegCreateDepartSubTierscenariosStepDef.cgacNumber :" + NegCreateDepartSubTierscenariosStepDef.cgacNumber);

		//NegCreateDepartSubTierscenariosStepDef.ombNumber = driver.findElement(DepartmentErrorMessageLocators.ombNumberValue).getText();
		//System.out.println(" NegCreateDepartSubTierscenariosStepDef.ombNumber :" + NegCreateDepartSubTierscenariosStepDef.ombNumber);

		NegCreateDepartSubTierscenariosStepDef.cfdaNumber = driver.findElement(DepartmentErrorMessageLocators.cfda1).getText();
		System.out.println(" NegCreateDepartSubTierscenariosStepDef.cfdaNumber :" + NegCreateDepartSubTierscenariosStepDef.cfdaNumber);

		NegCreateDepartSubTierscenariosStepDef.tasNumber = driver.findElement(DepartmentErrorMessageLocators.tas).getText();
		System.out.println(" NegCreateDepartSubTierscenariosStepDef.tasNumber :" + NegCreateDepartSubTierscenariosStepDef.tasNumber);

	}

	@When("^Validate only number ([^\"]*)$")
	public void validate_Only_Number_Error_Message(String ErrorMessage) throws Throwable {

		if (ErrorMessage.equalsIgnoreCase("AgencyName")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(nameExists, agencyNameExsit);
			System.out.println("nameExists:" + nameExists + "agencyNameExsit:" + agencyNameExsit);

		} else if (ErrorMessage.equalsIgnoreCase("CGAC")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(onlyNumber, cgacNumber);
			logger.info("onlyNumber"+onlyNumber);
			logger.info("cgacNumber"+cgacNumber);

		} else if (ErrorMessage.equalsIgnoreCase("AgencyCode")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			// Assert.assertEquals(onlyNumber, cgacNumber);

		} else if (ErrorMessage.equalsIgnoreCase("OMB")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(onlyNumber, ombNumber);
			logger.info("onlyNumber"+ onlyNumber);
			logger.info("ombNumber"+ombNumber);

		} else if (ErrorMessage.equalsIgnoreCase("CFDAValue")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(onlyNumber, cfdaNumber);
			logger.info("onlyNumber"+onlyNumber);
			logger.info("cfdaNumber"+cfdaNumber);

		} else if (ErrorMessage.equalsIgnoreCase("TAS")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			Assert.assertEquals(onlyNumber, tasNumber);
			logger.info("onlyNumber"+onlyNumber);
			logger.info("tasNumber"+tasNumber);

		}else if (ErrorMessage.equalsIgnoreCase("alphanumeric values")) {
			System.out.println("ErrorMessage :" + ErrorMessage);
			logger.info("specialagencyCode"+specialagencyCode);
			logger.info("agencyCodeValue1"+agencyCodeValue1);
			Assert.assertEquals(specialagencyCode, agencyCodeValue1);
			
		}else {
			System.out.println("--------------------------------------");

		}

	}

	@Then("^The User click on confirmation department Submit button$")
	public void the_User_Click_On_The_Confirmation_Department_Submit_Button() throws Throwable {

		WebElement elt3 = driver.findElement(DepartmentLocators.submit);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);
		System.out.println("Click on Submit button");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Given("^Meaasage Browser close$")
	public void Meaasage_browser_close() throws InterruptedException {
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

		logger.debug("Closed Browser");

	}
	
	@Given("^Click on Go to Federal Hierarchy link$")
	public void Click_on_Go_to_Federal_Hierarchy_link() throws Throwable{
		System.out.println("Federal Hierarchy1234566");
		logger.info("Test:::::" + driver);
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(30);
		WebElement elt = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/div/div/div/div/div[2]/div/div[3]/a"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("Workspace" + driver.getTitle(), scenario);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@And("^click department button$")
	public void click_department_button() throws Throwable{
		logger.info("create department button", scenario);
		Thread.sleep(1400);
		// WebElement elt =
		// driver.findElement(DepartmentLocators.clickOnCreateDept);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("Pages2:::" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String detailseqRuired = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/div"))
				.getText();
		Assert.assertEquals("Please provide details required to create a Department/Ind. Agency", detailseqRuired);	
	}
	
	 @And("^User click the Federal Hierarchy link$")
	 public void  User_click_the_Federal_Hierarchy_link() throws Throwable{
		 TimeUnit.SECONDS.sleep(3);
		 ((JavascriptExecutor) driver).executeScript("scroll(0,-2500)");
		 TimeUnit.SECONDS.sleep(3);
		 
			WebElement elt = driver.findElement(
					By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/a"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(1400);
			logger.info("Workspace" + driver.getTitle(), scenario);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	 }
     @Given("^User Click on the search federal hierarchy adminstractor$")
	 public void User_Click_on_the_search_federal_hierarchy_adminstractor() throws Throwable{
    	 Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/input")).sendKeys("Department0.10280681");
 		
 		
 		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/i"));
 		Actions builder = new Actions(driver);
 		Actions seriesOfActions = builder.moveToElement(elt).click();
 		seriesOfActions.perform();
 		Thread.sleep(5000);
 		logger.info("User click on the search button");
 		TimeUnit.SECONDS.sleep(10);
 
	 }
	 @And("^Click on the first link$")
	 public void Click_on_the_first_link() throws Throwable{
		 WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[4]/div/div[2]/div/div[2]/div[1]/a"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(1400);
			String val1 = " FEDERAL HIERARCHY Department0.016638517";
			//String val2 = driver.findElement(By.xpath("//h1[contains(text(),'Department0.016638517')]")).getText();
	 		//logger.info("(Department0.016638517) val2: "+val2);
	 		 //Assert.assertEquals(val1, val2);
	 }
	 
	 @And("^User click on the Department name bread crumbs link$")
	 public void User_click_the_Department_name_bread_crumbs_link() throws Throwable{
		 TimeUnit.SECONDS.sleep(8);
			((JavascriptExecutor) driver).executeScript("scroll(0,-400)");
		 driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[3]/a")).click();
		 
	 }
	 @And("^Click on the create sub tier button$")
	 public void Click_on_the_create_sub_tier_button() throws Throwable{
		 Thread.sleep(2000);	
		 WebElement elt = driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[1]/button"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(1400);	 
	 }
	 
	 @Given("^Submit create subTier button without filling value$")
	 public void Submit_create_subTier_button_without_filling_value() throws Throwable{
		 Thread.sleep(20);
		 WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(1400);
	 } 
	 
	// public String datefield = "Date is required";
	 @And("^Reading sub tier error message$")
	 public void Reading_sub_tier_error_message(){
		 NegCreateDepartSubTierscenariosStepDef.subTierOrgName1 = driver.findElement(DepartmentErrorMessageLocators.subTierOrgName).getText();
			System.out.println(" NegCreateDepartSubTierscenariosStepDef.subTierOrgName1 :" + NegCreateDepartSubTierscenariosStepDef.subTierOrgName1);
			NegCreateDepartSubTierscenariosStepDef.sunTierDate1 = driver.findElement(DepartmentErrorMessageLocators.sunTierDate).getText();
			System.out.println(" NegCreateDepartSubTierscenariosStepDef.sunTierDate :" + NegCreateDepartSubTierscenariosStepDef.sunTierDate1);
			NegCreateDepartSubTierscenariosStepDef.subTierAgencyCode1 = driver.findElement(DepartmentErrorMessageLocators.SubTierAgencyCode).getText();
			System.out.println(" NegCreateDepartSubTierscenariosStepDef.subTierOrgName1 :" + NegCreateDepartSubTierscenariosStepDef.subTierAgencyCode1);
	 }
	 
     @Given("^Enter sub Tier name([^\"]*)$")
	 public void User_enter_subTier_name(String AgencyName) throws Throwable{
    	 Thread.sleep(20);
		 driver.findElement(DepartmentErrorMessageLocators.SubTierName).sendKeys(AgencyName);
	 }
	 @And("^Enters month ([^\"]*)$")
	 public void Enters_month_date(String month) throws Throwable{
		 Thread.sleep(20);
		 driver.findElement(DepartmentErrorMessageLocators.subTierMonth).sendKeys(month);
		 
	 }
	 @And("^Enters day ([^\"]*)$")
	 public void Enters_day(String day) throws Throwable{
		 Thread.sleep(20);
		 driver.findElement(DepartmentErrorMessageLocators.subTierDay).sendKeys(day);
	 }
	 @And("^Enters year ([^\"]*)$")
	 public void Enters_year(String year) throws Throwable{
		 Thread.sleep(20);
		 driver.findElement(DepartmentErrorMessageLocators.subTierYear).sendKeys(year);
		 
	 }
	 @And("^Enters Agency code ([^\"]*)$")
	 public void Enters_Agency_code(String code) throws Throwable{
		 Thread.sleep(20);
		 driver.findElement(DepartmentErrorMessageLocators.subTierAgencyCode1).sendKeys(code); 
	 }
	 
	 @Then("^Validate subTier error messages ([^\"]*)$")
	 public void Validate_subTier_error_messages(String ErrorMessage){
		 if (ErrorMessage.equalsIgnoreCase("Cannot Empty")) {
				System.out.println("ErrorMessage :" + ErrorMessage);
				Assert.assertEquals(subTierOrgName1, agencyCodes);
				System.out.println("subTierOrgName1:" + subTierOrgName1 + "agencyCodes:" + agencyCodes);

			} else if (ErrorMessage.equalsIgnoreCase("Date Required")) {
				System.out.println("ErrorMessage :" + ErrorMessage);
				Assert.assertEquals(sunTierDate1, datefield);
				System.out.println("sunTierDate1:"+ sunTierDate1 + "datefield:"+ datefield);
	        }else if(ErrorMessage.equalsIgnoreCase("Agency empty")) {
				System.out.println("ErrorMessage :" + ErrorMessage);
				Assert.assertEquals(subTierAgencyCode1, agencyCodes);
				System.out.println("subTierAgencyCode1:"+ subTierAgencyCode1 + "agencyCodes:"+ agencyCodes);
			} else if(ErrorMessage.equalsIgnoreCase("SubTierAgency")) {
				System.out.println("ErrorMessage :" + ErrorMessage);
				Assert.assertEquals(subTieragencyCode, specialagencyCode);
				System.out.println("subTieragencyCode:"+ subTieragencyCode + "specialagencyCode:"+ specialagencyCode);
			}else if(ErrorMessage.equalsIgnoreCase("subTierAllDate")) {
				System.out.println("ErrorMessage :" + ErrorMessage);
				//String agencySpecial = driver.findElement(By.xpath("")).getText();
				Assert.assertEquals(subTierAllDate, subTierAllDate);
				System.out.println("subTierAllDate:"+ subTierAllDate + "subTierAllDate:"+ subTierAllDate);
			}else {
				logger.info("Sub Tier Tested");
				
			}
		 //Date Required
	 }
	 
	 
	 @Given("^Submit create depatment button by filling special char$")
	 public void Submit_create_depatment_button_by_filling_special_char() throws Throwable{
		 WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[1]/button"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(1400);
			driver.findElement(DepartmentLocators.departmentName).sendKeys("###################");
			driver.findElement(DepartmentLocators.startMonth).sendKeys(DateClass.getCurrentMonth());
			driver.findElement(DepartmentLocators.startDay).sendKeys(DateClass.getCurrentDay());
			driver.findElement(DepartmentLocators.startYear).sendKeys(DateClass.getCurrentYear());
			driver.findElement(DepartmentLocators.description1).sendKeys("@@@@@@@@@@@@");
			driver.findElement(DepartmentLocators.cgacCode).sendKeys("@@");
			driver.findElement(DepartmentLocators.agencyCode).sendKeys("::::");
			//driver.findElement(DepartmentLocators.ombCode).sendKeys("asc");
			driver.findElement(DepartmentLocators.cfdaCode).sendKeys("$$$");
			driver.findElement(DepartmentLocators.tas2Code).sendKeys("##");

			WebElement elt31 = driver.findElement(DepartmentLocators.submit);
			Actions builder31 = new Actions(driver);
			Actions seriesOfActions31 = builder31.moveToElement(elt31).click();
			seriesOfActions31.perform();
			Thread.sleep(1400);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			NegCreateDepartSubTierscenariosStepDef.agencyCodeValue1 = driver.findElement(DepartmentErrorMessageLocators.agencyAlpha).getText();
			System.out.println(" NegCreateDepartSubTierscenariosStepDef. agencyCodeValue1 :" + NegCreateDepartSubTierscenariosStepDef.agencyCodeValue1);
			
			//NegCreateDepartSubTierscenariosStepDef.agencyNameExsit = driver.findElement(DepartmentErrorMessageLocators.agencyNameExist).getText();
			//System.out.println(" NegCreateDepartSubTierscenariosStepDef.agencyNameExsit :" + NegCreateDepartSubTierscenariosStepDef.agencyNameExsit);

			NegCreateDepartSubTierscenariosStepDef.cgacNumber = driver.findElement(DepartmentErrorMessageLocators.cgac1).getText();
			System.out.println(" NegCreateDepartSubTierscenariosStepDef.cgacNumber :" + NegCreateDepartSubTierscenariosStepDef.cgacNumber);

			//NegCreateDepartSubTierscenariosStepDef.ombNumber = driver.findElement(DepartmentErrorMessageLocators.ombNumberValue).getText();
			//System.out.println(" NegCreateDepartSubTierscenariosStepDef.ombNumber :" + NegCreateDepartSubTierscenariosStepDef.ombNumber);

			NegCreateDepartSubTierscenariosStepDef.cfdaNumber = driver.findElement(DepartmentErrorMessageLocators.cfda1).getText();
			System.out.println(" NegCreateDepartSubTierscenariosStepDef.cfdaNumber :" + NegCreateDepartSubTierscenariosStepDef.cfdaNumber);

			NegCreateDepartSubTierscenariosStepDef.tasNumber = driver.findElement(DepartmentErrorMessageLocators.tas).getText();
			System.out.println(" NegCreateDepartSubTierscenariosStepDef.tasNumber :" + NegCreateDepartSubTierscenariosStepDef.tasNumber);
		 
	 }
	 
	 @Given("^Submit create subTier button by filling value$")
	 public void create_subTier_button_by_filling_value() throws Throwable{
		 Thread.sleep(3000);
		 driver.findElement(DepartmentErrorMessageLocators.SubTierName).sendKeys("#####");
		 driver.findElement(DepartmentErrorMessageLocators.subTierMonth).sendKeys(DateClass.getCurrentMonth());
		 driver.findElement(DepartmentErrorMessageLocators.subTierDay).sendKeys(DateClass.getCurrentDay());
		 driver.findElement(DepartmentErrorMessageLocators.subTierYear).sendKeys(DateClass.getCurrentYear());
		 driver.findElement(DepartmentErrorMessageLocators.subTierAgencyCode1).sendKeys("$$$$"); 
		 Thread.sleep(20);
		 WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button"));
			Actions builder = new Actions(driver);
			Actions seriesOfActions = builder.moveToElement(elt).click();
			seriesOfActions.perform();
			Thread.sleep(1400);
	 }
	 @And("^Reading sub tier values error message$")
	 public void Reading_sub_tier_values_error_message(){
		 //NegCreateDepartSubTierscenariosStepDef.subTierAllDate = driver.findElement(DepartmentErrorMessageLocators.sunTierDate).getText();
			//System.out.println(" NegCreateDepartSubTierscenariosStepDef.sunTierDate :" + NegCreateDepartSubTierscenariosStepDef.subTierAllDate);
			NegCreateDepartSubTierscenariosStepDef.subTieragencyCode = driver.findElement(DepartmentErrorMessageLocators.SubTierAgencyCode).getText();
			System.out.println(" NegCreateDepartSubTierscenariosStepDef.subTieragencyCode :" + NegCreateDepartSubTierscenariosStepDef.subTieragencyCode);
		 
	 }

}
