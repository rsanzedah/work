package gov.gsa.sam.stepdefinition;

import gov.gsa.sam.base.DateClass;
import gov.gsa.sam.base.FileReaderManager;
import gov.gsa.sam.fields.CreateOfficeFields;
import gov.gsa.sam.fields.DepartmentCreateLocators;
import gov.gsa.sam.fields.DepartmentField;

//import gov.gsa.sam.base.LoginStepDef;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.Before;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.thucydides.core.annotations.Managed;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.gsa.sam.locators.CreateOffice;
import gov.gsa.sam.locators.DepartmentLocators;
import gov.gsa.sam.locators.SubTierLocators;
//import gov.gsa.sam.locators.*;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.utils.Constants;
//import gov.gsa.sam.fields.DepartmentField;

public class CreateDepartmentStepDef {
	
	public static String AccountDetailsName;
	public static String AccountDetailsEmail;
	public static String BusinessPhone;
	public static String SubtieragencyCode;

	public static String agencyName1;
	public static String startMonth1;
	public static String startDay1;
	public static String startYear1;
	public static String agencyName;
	public static String startMonth;
	public static String startDay;
	public static String startYear;
	public static String CreateendMonth;
	public static String CreateendDay;
	public static String CreateendYear;
	public static String Description;
	public static String CreateshortName;
	public static String agencyCode;
	public static String cgac;
	public static String cfdaCode;
	public static String TAS2;
	public static String agencyName12;
    public static String ConfirmationStartDate;
	public static String ConfirmationEndDate;
	public static String ConfirmationDescription;
	public static String ConfirmationshortName;
	public static String ConfirmationAgencyCode;
	public static String ConfirmationCgac;
	public static String ConfirmationcfdaCode;
	public static String  ConfirmationTAS2;
	public static String SubTierName1;
	public static String OfficeName1;
	public static String DeptIndAgency1;
	public static String CGAC1;
	public static String SubTier1;
	public static String AgencyCode1;
	public static String StartMonth1;
	public static String StartDay1;
	public static String StartYear1;
	public static String EndMonth1;
	public static String EndDay1;
	public static String EndYear1;
	public static String OfficeShortName1;
	public static String OfficeRegion3;
	public static String OfficeActivity1;
	public static String RequestorName1;
	public static String RequestorEmail1;
	public static String RequestorPhone1;
	public static String POCEmail1;
	public static String POCNumber1;
	public static String POCName1;
	public static String StreetAddress1;
	public static String StreetAddress2;
	public static String Countr1y;
	public static String Zip1;
	public static String City1;
	public static String StateProvince1;
	public static String StreetAddress3;
	public static String StreetAddress4;
	public static String Country2;
	public static String Zip2;
	public static String City2;
	public static String StateProvince2;
	public static String ShippingStreet;
	public static String ShippingCountry;
	public static String ShippingZip;
	public static String ShippingCity;
	public static String ShippingState;
	public static String BillingStreet;
	public static String BillingCountry;
	public static String BillingZip;
	public static String BillingCity;
	public static String BillingState;
	public static String EditDepartmentEndMonth;
	public static String EditDepartmentEndDay;
	public static String EditDepartmentEndYear;
	public static String EditDepartmentDescription;
	public static String EditDepartmentShortName;
	public static String EditDepartmentAgencyCode;
	public static String EditDepartmentCGAC;
	public static String EditDepartmentCFDACode;
	public static String EditSubTierEndMonth;
	public static String EditSubTierEndDay;
	public static String EditSubTierEndYear;
	public static String EditSubTierShortName;
	public static String EditSubTierAgencyCode;
	public static String  EditDepartmentCFDACodetext1;
	 public static String SubTierNameTitle;
	 public static String SubTierNameRequired;
	 public static String SubTierNameHint;
	 public static String SubTierParentDepartment;
	 public static String SubTierDepartment;
	 public static String SubTierDepartmentTest;
	 public static String SubTierStartDate;
	 public static String  SubTierStartDateRequired;
	 public static String SubTierStartDateHint;
	 public static String SubTierStartDateMonth;
	 public static String SubTierStartDateDay;
	 public static String SubTierStartDateYear;
	 public static String  SubTierEndDate;
	 public static String SubTierEndDateHint;
	 public static String  SubTierEndDateMonth;
	 public static String SubTierEndDateDay;
	 public static String SubTierEndDateYear;
	 public static String SubTierShortNameTitle;
	 public static String SubTierShortNameHint;
	 public static String  SubTierCode;
     public static String SubTierCodeAgencyTitle;
	 public static String SubTierCodeAgencyHint;
	 public static String SubTierCodeAgencyRequired ;
	 public static String SubTierName;
	 public static String SubTierStartMonth;
	 public static String SubTierStartDay;
	 public static String SubTierStartYear;
	 public static String SubTierEndMonth;
	 public static String SubTierEndDay;
	 public static String SubTierEndYear;
	 public static String  SubTierShortName;
	 public static String  SubTierAgencyCode;
	 public static String CreateSubTierConfirmation;
	 public static String SubTierDetails;
	 public static String ConfirmationFH ;
	 public static String EditDepartmentShortNametext1;
	  public static String SubTierConfirmation ;
	  public static String SubTierConfirmationConfirmBelowDetails ;
	  public static String SubTierConfirmationSubTierDetails ;
	  public static String SubTierConfirmationSubTierName ;
	  public static String SubTierConfirmationStartDate ;
	  public static String SubTierConfirmationEndDate ;
	  public static String SubTierConfirmationShortname;
	  public static String SubTierConfirmationSubTierCode;
	  public static String SubTierConfirmationAgencyCode;
	  public static String SubTierConfirmationStartDateText;
	  public static String SubTierConfirmationEndDateText;
	  public static String SubTierConfirmationShortnameText;
	  public static String SubTierConfirmationAgencyCodeText;
	  
	  public static String EditDepartmentDescriptionText;
	  public static String EditDepartmentEndHint;
	  public static String EditDepartmentEndDay1;
	  public static String EditDepartmentEndMonth1;
	  public static String EditDepartmentEndYear1;
	  public static String EditDepartmentEndDayText;
	  public static String EditDepartmentEndMonthText;
	  public static String EditDepartmentEndYearText;
	  public static String EditDepartmentEndDateText;
	  public static String EditDepartmentShortName1;
	  public static String EditDepartmentShortNameHint;
	  public static String EditDepartmentShortNametext;
	  public static String EditDepartmentTAS2Codetext;

	  public static String EditDepartmentAgencyCodeHint;
	  public static String EditDepartmentAgencyCodetext;
	  public static String EditDepartmentCGACHint;
	  public static String EditDepartmentCGACtext;
	  public static String EditDepartmentCFDACodeHint;
	  public static String EditDepartmentCFDACodetext;

	@Managed
	public static WebDriver driver;
	Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(CreateDepartmentStepDef.class);
	// LoginStepDef login = new LoginStepDef();

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@And("^The user enters environment department (\\w+)$")
	public void the_user_enters_a_URL1(String urlConstant) throws Throwable {
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

	@And("^The user click on department sign in link$")
	public void the_user_click_on_sign_in_link1() throws InterruptedException {

		// login.user_click_on_signin_link(driver);

		TimeUnit.SECONDS.sleep(3);
		driver.findElement(HomePageLocator.navBarSignIn).click();
	}

	@And("^Then click on department accept button$")
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

	@And("^The user enters the department email id (\\w+)$")
	public void the_user_enters_the_email_id1(String userName) throws Throwable {
		// login.user_enters_the_email_id(userName, driver);
		TimeUnit.SECONDS.sleep(3);
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^The user enters the department password (\\w+)$")
	public void the_user_enters_the_password1(String password) {

		// login.user_enters_the_password(password, driver);
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
		logger.info("Username entered --  " + scenario);
	}

	@And("^The user click on department sign in button$")
	public void the_user_click_on_sign_in_button1() {
		// login.user_click_on_sign_in_button(driver);
		driver.findElement(HomePageLocator.dropdownSignInButton).click();

	}

	@And("^The user want to receive your one time department password (\\w+)$")
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

	@And("^The user enters department one time access code$")
	public void the_user_enters_one_time_access_code1() {

		// login.user_enters_one_time_access_code(driver);
		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		logger.info("Constants.OTP:::::" + Constants.OTP);
	}

	@And("^The user click on department one time submit button$")
	public void the_user_click_on_one_time_submit_button1() {
		// login.user_click_on_one_time_submit_button(driver);
		logger.info("otp submitted:" + scenario);
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
	}

	@Given("^Click on above Go to Federal Hierarchy link$")
	public void click_on_above_go_to_Federal_Hierarchy_link() throws InterruptedException {
		System.out.println("Federal Hierarchy1234566");
		logger.info("Test:::::" + driver);
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(20);
		WebElement elt = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/div/div/div/div/div[2]/div/div[3]/a"));
		// *[@id="main-container"]/ng-component/div/div/div/div/div/div/div/div[2]/div/div[3]/a
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("Workspace" + driver.getTitle(), scenario);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^The user click on create department button$")
	public void the_User_Click_On_Create_Department_Button() throws Throwable {
		logger.info("create department button", scenario);
		Thread.sleep(1400);
		// WebElement elt =
		// driver.findElement(DepartmentLocators.clickOnCreateDept);
		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[1]/button"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(2000);
		logger.info("Pages2:::" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// h1contains(text(),'Create Department/Ind. Agency')]

		// String val1 =
		// driver.findElement(By.xpath(".//div[contains(text(),'FEDERAL
		// HIERARCHY')]")).getText();

		String val1 = driver.findElement(DepartmentCreateLocators.FederalHierechy).getText();
		logger.info("val1" + val1);
		Assert.assertEquals(DepartmentField.CreateDept2, val1);
		String va12 = driver.findElement(By.xpath(".//h1[contains(text(),'Create Department/Ind. Agency')]")).getText();
		logger.info("val2" + va12);
		logger.info("Create Department/Ind. Agency" + DepartmentField.CreateDept1);
		String detailseqRuired = driver.findElement(DepartmentCreateLocators.CreateDept3).getText();
		logger.info("Please provide details required to create a Department/Ind. Agency" + detailseqRuired);
		Assert.assertEquals(DepartmentField.CreateDept3, detailseqRuired);
	}

	@And("^The user enters department name ([^\"]*)$")
	public void the_User_Enters_Department_Name(String DepartmentName) throws Throwable {
		logger.info("enters department name", scenario);
		String expected = driver.findElement(DepartmentCreateLocators.DeptAgency).getText();
		logger.info("Department/Ind. Agency Details: (DepartmentName)" + expected);
		logger.info("DepartmentCreateLocators.DeptAgency :" + DepartmentCreateLocators.DeptAgency);
		Assert.assertEquals(DepartmentField.DeptAgency, expected);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String expected1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/section/div/sam-text/sam-label-wrapper/div/label/span"))
				.getText();
		logger.info("Required" + expected1);
		logger.info("Required" + DepartmentField.Required);
		Assert.assertEquals(DepartmentField.Required, expected1);
		String expected2 = driver.findElement(By.xpath("//*[@id=\"orgName-input-hint\"]")).getText();
		logger.info(
				"Provide a unique Department/Ind. Agency name. Existing Department/Ind. Agency names cannot be re-used."
						+ expected2);
		logger.info(
				"Provide a unique Department/Ind. Agency name. Existing Department/Ind. Agency names cannot be re-used."
						+ DepartmentField.DeptAgencyName2);
		Assert.assertEquals(DepartmentField.DeptAgencyName2, expected2);

		// driver.findElement(DepartmentLocators.departmentName).sendKeys(DepartmentName);
		// int val = (int) Math.ceil(Math.random() * 1000);
		Random rand = new Random();
		float result = rand.nextFloat();
		String val = "Department" + result;
		agencyName = val;
		logger.info("agencyName :"+ agencyName);
		driver.findElement(DepartmentLocators.departmentName).sendKeys(agencyName);
	}

	@And("^The user enters start month ([^\"]*)$")
	public void the_User_Enter_Start_Month(String startMonth) throws Throwable {
		// String expected =
		// driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/legend")).getText();
		String expected = driver.findElement(DepartmentCreateLocators.startDate).getText();///// startMonth
		String[] expArr = expected.split("");
		logger.info("len" + expArr.length);
		logger.info("expected $$$$$$$$$$$$:" + expected, expected.contains("Start Date"), expected.substring(0, 10));
		String str = expected.replace("\n", " ");
		logger.info("Str========" + str);
		Assert.assertTrue(str.contains(DepartmentField.StartDate));
		Assert.assertTrue(str.contains(DepartmentField.Required));
		// String expected2 =
		// driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[1]")).getText();
		String expected2 = driver.findElement(DepartmentCreateLocators.startDateText).getText();
		logger.info(
				"Provide start date for the Department/Ind. Agency. Start date can be current or in future.(expected2): "
						+ expected2);

		logger.info("Provide start date for the Department/Ind. Agency. Start date can be current or in future."
				+ DepartmentField.DeptStartMonth2);
		Assert.assertEquals(DepartmentField.DeptStartMonth2, expected2);

		String expected3 = driver.findElement(DepartmentCreateLocators.startMonth).getText();
		logger.info("Month ++: " + expected3);
		logger.info("month: ==" + DepartmentField.Month);
		Assert.assertEquals(DepartmentField.Month, expected3);
		startMonth = DateClass.getCurrentMonth();
		// driver.findElement(DepartmentLocators.startMonth).sendKeys(startMonth);
		driver.findElement(DepartmentLocators.startMonth).sendKeys(DateClass.getCurrentMonth());
		logger.info("enters start month ", scenario);
	}

	@And("^The user enters start day ([^\"]*)$")
	public void The_User_Enters_Start_Day(String startDay) throws Throwable {
		// String expected3 =
		// driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div[1]/form/div[1]/sam-date/sam-fieldset-wrapper/div/fieldset/div[2]/div[2]/label")).getText();
		String expected3 = driver.findElement(DepartmentCreateLocators.startDay).getText();
		logger.info("Day ++: " + expected3);
		logger.info("Day: ==" + DepartmentField.Day);
		Assert.assertEquals(DepartmentField.Day, expected3);
		startDay = DateClass.getCurrentDay();
		// driver.findElement(DepartmentLocators.startDay).sendKeys(startDay);
		driver.findElement(DepartmentLocators.startDay).sendKeys(DateClass.getCurrentDay());
		logger.info("enters start day " + scenario);
	}

	@And("The user enters start year ([^\"]*)")
	public void The_User_Enters_Start_Year(String startYear) throws Throwable {
		String expected3 = driver.findElement(DepartmentCreateLocators.startYear).getText();
		logger.info("Year ++: " + expected3);
		logger.info("Year: ==" + DepartmentField.Year);
		Assert.assertEquals((DepartmentField.Year), expected3);
		startYear = DateClass.getCurrentYear();
		driver.findElement(DepartmentLocators.startYear).sendKeys(DateClass.getCurrentYear());
		logger.info("enters start month " + scenario);
	}

	@And("The user enters end month ([^\"]*)")
	public void the_User_Enters_End_Month(String endMonth) throws Throwable {

		String expected1 = driver.findElement(DepartmentCreateLocators.endDate).getText();
		logger.info("Year ++: " + expected1);
		logger.info("Year: ==" + DepartmentField.DeptStartDate1);
		Assert.assertEquals((DepartmentField.DeptStartDate1), expected1);
		String expected2 = driver.findElement(DepartmentCreateLocators.endDateText).getText();
		logger.info("Text ++: " + expected2);
		logger.info("Text: ==" + DepartmentField.DeptStartDate2);
		Assert.assertEquals((DepartmentField.DeptStartDate2), expected2);
		String expected3 = driver.findElement(DepartmentCreateLocators.endMonth).getText();
		logger.info("Month++: " + expected3);
		logger.info("Month: ==" + DepartmentField.Month);
		Assert.assertEquals((DepartmentField.Month), expected3);
		CreateendMonth = endMonth;
		driver.findElement(DepartmentLocators.endMonth).sendKeys(DateClass.addOrSubDaysFromCurrentDate(2,"month"));
		//driver.findElement(DepartmentLocators.endMonth).sendKeys("02");
		logger.info("enters end month ", scenario);
	}

	@And("The user enters end day ([^\"]*)")
	public void the_User_Enters_End_Day(String endDay) throws Throwable {
		String expected1 = driver.findElement(DepartmentCreateLocators.endDay).getText();
		logger.info("Day ++: " + expected1);
		logger.info("Day: ==" + DepartmentField.Day);
		Assert.assertEquals((DepartmentField.Day), expected1);
		CreateendDay = endDay;
		driver.findElement(DepartmentLocators.endDay).sendKeys(DateClass.addOrSubDaysFromCurrentDate(2,"day"));
		logger.info("enters end year ", scenario);
	}

	@And("The user enters end year ([^\"]*)")
	public void the_User_Enters_End_Year(String endYear) throws Throwable {
		String expected1 = driver.findElement(DepartmentCreateLocators.endYear).getText();
		logger.info("Year ++: " + expected1);
		logger.info("Year: ==" + DepartmentField.Year);
		Assert.assertEquals((DepartmentField.Year), expected1);
		CreateendYear = endYear;
		driver.findElement(DepartmentLocators.endYear).sendKeys(DateClass.addOrSubDaysFromCurrentDate(2,"year"));
		logger.info("enters end year ", scenario);
	}

	@And("^The user enters fh Description data ([^\"]*)$")
	public void the_User_Enters_Description_data(String DescriptionData) throws Throwable {
		// driver.findElement(DepartmentLocators.description1).sendKeys(DescriptionData);

		String expected = driver.findElement(DepartmentCreateLocators.description).getText();
		logger.info("Description ++: " + expected);
		String str = expected.replace("\n", " ");
		logger.info("Str========" + str);
		logger.info("Year: ==" + DepartmentField.Description);
		Assert.assertTrue(str.contains(DepartmentField.Description));
		Assert.assertTrue(str.contains(DepartmentField.Required));
		Description = "Mango trees grow to 35–40 m (115–131 ft) tall, with a crown radius of 10 m (33 ft). The trees are long-lived, as some specimens still fruit after 300 years.[10] In deep soil, the taproot descends to a depth of 6 m (20 ft)"
				+ "with profuse, wide-spreading feeder roots and anchor roots penetrating deeply into the soil.[1] The leaves are evergreen, alternate, simple, 15–35 cm (5.9–13.8 in) long, and 6–16 cm (2.4–6.3 in) broad; when the leaves are young they are"
				+ "orange-pink, rapidly changing to a dark, glossy red, then dark green as they mature.[1] The flowers are produced in terminal panicles 10–40 cm (3.9–15.7 in) long; each flower is small and white with five petals 5–10 mm (0.20–0.39 in) "
				+ "long, with a mild, sweet fragrance.[1] Over 500 varieties of mangoes are known,[1] many of which ripen in summer, while some give a double crop.[11] The fruit takes four to five months from flowering to ripen.";

		driver.findElement(DepartmentLocators.description1).sendKeys("Mango trees grow to 35–40 m (115–131 ft) tall, with a crown radius of 10 m (33 ft). The trees are long-lived, as some specimens still fruit after 300 years.[10] In deep soil, the taproot descends to a depth of 6 m (20 ft)"
						+ "with profuse, wide-spreading feeder roots and anchor roots penetrating deeply into the soil.[1] The leaves are evergreen, alternate, simple, 15–35 cm (5.9–13.8 in) long, and 6–16 cm (2.4–6.3 in) broad; when the leaves are young they are"
						+ "orange-pink, rapidly changing to a dark, glossy red, then dark green as they mature.[1] The flowers are produced in terminal panicles 10–40 cm (3.9–15.7 in) long; each flower is small and white with five petals 5–10 mm (0.20–0.39 in) "
						+ "long, with a mild, sweet fragrance.[1] Over 500 varieties of mangoes are known,[1] many of which ripen in summer, while some give a double crop.[11] The fruit takes four to five months from flowering to ripen.");

		// driver.findElement(DepartmentLocators.description1).sendKeys(
		// "The U.S. Supreme Court on June 26 handed Donald Trump one of the
		// biggest victories of his presidency, upholding his travel ban
		// targeting several Muslim-majority countries. The 5-4 ruling, with the
		// court’s five conservatives in the majority, ends for now a fierce
		// fight in the courts over whether the policy represented an unlawful
		// Muslim ban. Mr. Trump can now claim vindication after lower courts
		// had blocked his travel ban announced in September 2017, as well as
		// two prior versions, in legal challenges brought by the State of
		// Hawaii and others. The court held that the challengers had failed to
		// show that the ban violates either U.S. immigration law or the U.S.
		// Constitution's First Amendment prohibition on the government favoring
		// one religion over another. Mr. Trump quickly reacted on Twitter:
		// “SUPREME COURT UPHOLDS TRUMP TRAVEL BAN. Wow!” Writing for the court,
		// Chief Justice John Roberts said that the government “has set forth a
		// sufficient national security justification” to prevail. “We express
		// no view on the soundness of the policy,” Roberts added. The ruling
		// affirmed broad presidential discretion over who is allowed to enter
		// the United States. It means that the current ban can remain in effect
		// and that Mr. Trump could potentially add more countries. Mr. Trump
		// has said the policy is needed to protect the country against attacks
		// by Islamic militants. The current ban, announced in September 2017,
		// prohibits entry into the United States of most ");
		logger.info("enters fh Description data ", scenario);
	}

	@And("^The user enters short Name ([^\"]*)$")
	public void the_User_Enters_Short_Name(String shortName) throws Throwable {
		String expected1 = driver.findElement(DepartmentCreateLocators.ShortName).getText();
		logger.info("Year ++: " + expected1);
		logger.info("Year: ==" + DepartmentField.ShortName);
		Assert.assertEquals((DepartmentField.ShortName), expected1);

		String expected2 = driver.findElement(DepartmentCreateLocators.ShortNameText).getText();
		logger.info("Year ++: " + expected2);
		logger.info("Year: ==" + DepartmentField.ShortNameText);
		Assert.assertEquals((DepartmentField.ShortNameText), expected2);

		CreateshortName = shortName;
		driver.findElement(DepartmentLocators.shortName).sendKeys(shortName);
		logger.info("enters fhshort Name ", scenario);

		String expected3 = driver.findElement(DepartmentCreateLocators.code).getText();
		logger.info("code ++: " + expected3);
		logger.info("code: ==" + DepartmentField.Code);
		Assert.assertEquals((DepartmentField.Code), expected3);

	}

	@And("^The user enters fh CGAC code ([^\"]*)$")
	public void the_User_Enters_CGAC_Code(String CGAC) throws Throwable {
		String expected = driver.findElement(DepartmentCreateLocators.CGAC).getText();
		logger.info("CGAC Code ++: " + expected);
		String str = expected.replace("\n", " ");
		logger.info("Str========" + str);
		logger.info("gency Code: ==" + DepartmentField.Cgac);
		Assert.assertTrue(str.contains(DepartmentField.Cgac));
		Assert.assertTrue(str.contains(DepartmentField.Required));

		String expected2 = driver.findElement(DepartmentCreateLocators.CGACText).getText();
		logger.info("CGAC text ++: " + expected2);
		logger.info("CGAC Text: ==" + DepartmentField.CgacText);
		Assert.assertEquals((DepartmentField.CgacText), expected2);

		cgac = CGAC;
		driver.findElement(DepartmentLocators.cgacCode).sendKeys(CGAC);
		logger.info("enters fh CGAC code ", scenario);
	}

	@And("^The user enters fh Agency codes ([^\"]*)$")

	public void the_User_Enters_Agency_Code(String AgencyCode) throws Throwable {
		String expected = driver.findElement(DepartmentCreateLocators.AgencyCode).getText();
		logger.info("Agency Code ++: " + expected);
		String str = expected.replace("\n", " ");
		logger.info("Str========" + str);
		logger.info("gency Code: ==" + DepartmentField.AgencyCode);
		Assert.assertTrue(str.contains(DepartmentField.AgencyCode));
		Assert.assertTrue(str.contains(DepartmentField.Required));

		String expected2 = driver.findElement(DepartmentCreateLocators.AgencyCodeText).getText();
		logger.info("Agency Code text ++: " + expected2);
		logger.info("Agency Code Text: ==" + DepartmentField.AgencyCodeText);
		Assert.assertEquals((DepartmentField.AgencyCodeText), expected2);

		agencyCode = AgencyCode;
		driver.findElement(DepartmentLocators.agencyCode).sendKeys(AgencyCode);
		logger.info("enters fh Agency codes ", scenario);
	}

	@And("^The user enters CFDA code ([^\"]*)$")
	public void the_User_Enters_CFDA_Code(String CFDA) throws Throwable {
		String expected1 = driver.findElement(DepartmentCreateLocators.CFDAC).getText();
		logger.info("CFDA Code  ++: " + expected1);
		logger.info("CFDA Code: ==" + DepartmentField.CfdaCode);
		Assert.assertEquals((DepartmentField.CfdaCode), expected1);
		String expected2 = driver.findElement(DepartmentCreateLocators.CFDAText).getText();
		logger.info("CFDA Code text ++: " + expected2);
		logger.info("CFDA CodeText: ==" + DepartmentField.CfdaCodeText);
		Assert.assertEquals((DepartmentField.CfdaCodeText), expected2);

		cfdaCode = CFDA;
		driver.findElement(DepartmentLocators.cfdaCode).sendKeys(CFDA);
		logger.info("Enter CFDA code", scenario);
	}

	@And("^The user enters fh TAS code ([^\"]*)$")
	public void the_User_Enters_TAS_Code(String TAS) throws Throwable {
		String expected = driver.findElement(DepartmentCreateLocators.TAS2Code).getText();
		logger.info("TAS2 Code ++: " + expected);
		String str = expected.replace("\n", " ");
		logger.info("Str========" + str);
		logger.info("TAS2 Code: ==" + DepartmentField.TAS2);
		Assert.assertTrue(str.contains(DepartmentField.TAS2));
		Assert.assertTrue(str.contains(DepartmentField.Required));
		String expected2 = driver.findElement(DepartmentCreateLocators.TAS2CodeText).getText();
		logger.info("TAS2 Code text ++: " + expected2);
		logger.info("TAS2 CodeText: ==" + DepartmentField.TAS2Text);
		Assert.assertEquals((DepartmentField.TAS2Text), expected2);

		TAS2 = TAS;
		driver.findElement(DepartmentLocators.tas2Code).sendKeys(TAS2);
		logger.info("Enter confirm button", scenario);
	}

	@Then("^The User click on the department confirm button$")
	public void the_User_Click_On_The_Department_Confirm_Buttone() throws Throwable {
		logger.info("the department confirm button", scenario);
		
		
//WebElement elt3 = driver.findElement(DepartmentLocators.submit);
		WebElement elt3 = driver.findElement(DepartmentCreateLocators.DepartmentConfirm);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);
		logger.info("Click on Submit button");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^The User click on the confirmation department Submit button$")
	public void the_User_Click_On_The_Confirmation_Department_Submit_Button() throws Throwable {
		logger.info("confirmation department Submit button ", scenario);
		String expected = driver.findElement(DepartmentCreateLocators.Confirmation).getText();
		logger.info("FEDERAL HIERARCHYn ++: " + expected);
		// String str = expected.replace("\n", " ");
		// logger.info("Str========" + str);
		logger.info("FEDERAL HIERARCHY ==" + DepartmentField.CreateDept2);
		Assert.assertTrue(expected.contains(DepartmentField.CreateDept2));
		// Assert.assertTrue(str.contains(DepartmentField.Required));

		String expected2 = driver.findElement(DepartmentCreateLocators.ConfirmDetails).getText();
		logger.info("Confirm below details: " + expected2);
		logger.info("Confirm below details ==" + DepartmentField.ConfirmDetails);
		Assert.assertEquals((DepartmentField.ConfirmDetails), expected2);
		Thread.sleep(1000);

		String expected3 = driver.findElement(DepartmentCreateLocators.ConfirmationHeader).getText();
		logger.info("Department/Ind. Agency Details ++: " + expected3);
		logger.info("Department/Ind. Agency Details ==" + DepartmentField.DeptAgency);
		Assert.assertTrue(expected3.contains(DepartmentField.DeptAgency));
		Thread.sleep(1000);

		String expected4 = driver.findElement(DepartmentCreateLocators.AgencyName).getText();
		logger.info("Department/Ind. Agency Name: " + expected4);
		logger.info("Department/Ind. Agency Name: ==" + DepartmentField.AgencyName);
		Assert.assertEquals((DepartmentField.AgencyName), expected4);
		Thread.sleep(1000);

		String expected5 = driver.findElement(DepartmentCreateLocators.ConfirmationStartDate).getText();
		logger.info("Start Date: " + expected5);
		logger.info("Start Date: ==" + DepartmentField.ConfirmationStartDate);
		Assert.assertEquals((DepartmentField.ConfirmationStartDate), expected5);
		Thread.sleep(1000);

		String expected6 = driver.findElement(DepartmentCreateLocators.ConfirmationEndDate).getText();
		logger.info("End Date: " + expected6);
		logger.info("End Date: ==" + DepartmentField.ConfirmationEndDate);
		Assert.assertEquals((DepartmentField.ConfirmationEndDate), expected6);
		Thread.sleep(1000);

		String expected7 = driver.findElement(DepartmentCreateLocators.ConfirmationDescription).getText();
		logger.info("Description: " + expected7);
		logger.info("Description: ==" + DepartmentField.ConfirmationDescription);
		Assert.assertEquals((DepartmentField.ConfirmationDescription), expected7);
		Thread.sleep(1000);

		String expected8 = driver.findElement(DepartmentCreateLocators.ConfirmationShortname).getText();
		logger.info("Shortname: " + expected8);
		logger.info("Shortname: ==" + DepartmentField.ConfirmationShortname);
		Assert.assertEquals((DepartmentField.ConfirmationShortname), expected8);
		Thread.sleep(1000);

		String expected10 = driver.findElement(DepartmentCreateLocators.Confirmationcode).getText();
		logger.info("Department/Ind. Agency Codes: " + expected10);
		logger.info("Department/Ind. Agency Codes: ==" + DepartmentField.Code);
		Assert.assertEquals((DepartmentField.Code), expected10);
		Thread.sleep(1000);

		String expected11 = driver.findElement(DepartmentCreateLocators.ConfirmationAgencyCode).getText();
		logger.info("Agency Code: " + expected11);
		logger.info("Agency Code: ==" + DepartmentField.ConfirmationAgencyCode);
		Assert.assertEquals((DepartmentField.ConfirmationAgencyCode), expected11);
		Thread.sleep(1000);

		String expected12 = driver.findElement(DepartmentCreateLocators.ConfirmationCGACCode).getText();
		logger.info("CGAC Code: " + expected12);
		logger.info("CGAC Code: ==" + DepartmentField.ConfirmationCGACCode);
		Assert.assertEquals((DepartmentField.ConfirmationCGACCode), expected12);
		Thread.sleep(1000);

		String expected13 = driver.findElement(DepartmentCreateLocators.ConfirmationCFDACode).getText();
		logger.info("CFDA Code: " + expected13);
		logger.info("CFDA Code: ==" + DepartmentField.ConfirmationCFDACode);
		Assert.assertEquals((DepartmentField.ConfirmationCFDACode), expected13);
		Thread.sleep(1000);

		String expected14 = driver.findElement(DepartmentCreateLocators.ConfirmationTAS2Code).getText();
		logger.info("TAS-2 Code: " + expected13);
		logger.info("TAS-2 Code: ==" + DepartmentField.ConfirmationTAS2Code);
		Assert.assertEquals((DepartmentField.ConfirmationTAS2Code), expected14);
		Thread.sleep(1000);

		String confirmDetails = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[1]/title-and-section/div/div"))
				.getText();
		Assert.assertEquals("Confirm below details", confirmDetails);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		agencyName1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[1]/div[2]"))
				.getText();
		logger.info("agencyCode: " + agencyName1);
		////////--
		
		agencyName12 = driver.findElement(DepartmentCreateLocators.ConfirmationValueAgencyName).getText();
		logger.info("agencyName12 : "+ agencyName12);
		Assert.assertEquals(agencyName12,agencyName);
		
		ConfirmationStartDate = driver.findElement(DepartmentCreateLocators.ConfirmationValueStartDate).getText();
		logger.info("ConfirmationStartDate : "+ ConfirmationStartDate);
		//Assert.assertEquals(ConfirmationStartDate, CreateendYear);
		
		ConfirmationEndDate = driver.findElement(DepartmentCreateLocators.ConfirmationValueStartDate).getText();
		logger.info("ConfirmationEndDate : "+ ConfirmationEndDate);
		//Assert.assertEquals(ConfirmationEndDate, CreateendYear);
		
		//ConfirmationEndDate = driver.findElement(DepartmentCreateLocators.ConfirmationValueStartDate).getText();
		//logger.info("ConfirmationEndDate : "+ ConfirmationEndDate);
		
		ConfirmationDescription = driver.findElement(DepartmentCreateLocators.ConfirmationValueDescription).getText();
		logger.info("ConfirmationDescription : "+ ConfirmationDescription);
		//Assert.assertEquals(ConfirmationDescription,Description);
		//Assert.assertTrue(ConfirmationDescription.contains(Description));
		
		
		ConfirmationshortName = driver.findElement(DepartmentCreateLocators.ConfirmationValueShortName).getText();
		logger.info("ConfirmationshortName : "+ ConfirmationshortName);
		Assert.assertEquals(ConfirmationshortName,CreateshortName);
		
		ConfirmationAgencyCode = driver.findElement(DepartmentCreateLocators.ConfirmationValueAgencyCode).getText();
		logger.info("ConfirmationAgencyCode : "+ ConfirmationAgencyCode);
		logger.info("agencyCode: "+ agencyCode);
		Assert.assertEquals(ConfirmationAgencyCode,agencyCode);
		
		ConfirmationCgac = driver.findElement(DepartmentCreateLocators.ConfirmationValueCGAC).getText();
		logger.info("ConfirmationCgac : "+ ConfirmationCgac);
		logger.info("cgac: "+ cgac);
		Assert.assertEquals(ConfirmationCgac, cgac);
		
		ConfirmationcfdaCode = driver.findElement(DepartmentCreateLocators.ConfirmationValueCFDACode).getText();
		logger.info("ConfirmationcfdaCode : "+ ConfirmationcfdaCode);
		Assert.assertEquals(ConfirmationcfdaCode,cfdaCode);
		
		ConfirmationTAS2 = driver.findElement(DepartmentCreateLocators.ConfirmationValueTASode).getText();
		logger.info("ConfirmationTAS2 : "+ ConfirmationTAS2);
		Assert.assertEquals(ConfirmationTAS2,TAS2);
		
		
		
		
		///////////////////////////////////////////////////////////////////////////////////// Show more ////////////////////////
		WebElement elt30 = driver.findElement(By.xpath(
				"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[4]/div[2]/span/a"));
		// WebElement elt30 =
		// driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[4]/div[2]/span/a"));
		Actions builder30 = new Actions(driver);
		Actions seriesOfActions30 = builder30.moveToElement(elt30).click();
		seriesOfActions30.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement elt301 = driver.findElement(By.xpath(
				"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[4]/div[2]/span/span/a"));
		// WebElement elt301 =
		// driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/div/div[1]/div[4]/div[2]/span/span/a"));
		Actions builder301 = new Actions(driver);
		Actions seriesOfActions301 = builder301.moveToElement(elt301).click();
		seriesOfActions301.perform();
		Thread.sleep(2000);
		/////////////////////////////////////////////////////////////////////////////
		
		//WebElement elt3 = driver.findElement(DepartmentLocators.submit);
		WebElement elt3 = driver.findElement(DepartmentCreateLocators.departmentConfirmSubmit);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.perform();
		Thread.sleep(1400);
		logger.info("Click on Submit button");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		/// -----
		String expected26 = driver.findElement(DepartmentCreateLocators.EditAgencyName).getText();
		logger.info("Department/Ind. Agency Name: " + expected26);
		logger.info("Department/Ind. Agency Name: ==" + DepartmentField.EditAgencyName);
		Assert.assertEquals((DepartmentField.EditAgencyName), expected26);
		Thread.sleep(1000);

		String expected21 = driver.findElement(DepartmentCreateLocators.EditStartDate).getText();
		logger.info("Start Date: " + expected21);
		logger.info("Start Date: ==" + DepartmentField.ConfirmationStartDate);
		Assert.assertEquals((DepartmentField.ConfirmationStartDate), expected21);
		Thread.sleep(1000);

		String expected22 = driver.findElement(DepartmentCreateLocators.EditEndDate).getText();
		logger.info("End Date: " + expected22);
		logger.info("End Date: ==" + DepartmentField.ConfirmationEndDate);
		Assert.assertEquals((DepartmentField.ConfirmationEndDate), expected22);
		Thread.sleep(1000);

		String expected23 = driver.findElement(DepartmentCreateLocators.EditDescription).getText();
		logger.info("Description: " + expected23);
		logger.info("Description: ==" + DepartmentField.ConfirmationDescription);
		Assert.assertEquals((DepartmentField.ConfirmationDescription), expected23);
		Thread.sleep(1000);

		String expected24 = driver.findElement(DepartmentCreateLocators.EditShortname).getText();
		logger.info("Shortname: " + expected24);
		logger.info("Shortname: ==" + DepartmentField.ConfirmationShortname);
		Assert.assertEquals((DepartmentField.ConfirmationShortname), expected24);
		Thread.sleep(1000);

		/// -----
		String expected20 = driver.findElement(DepartmentCreateLocators.Editcode).getText();
		logger.info("Department/Ind. Agency Codes: " + expected20);
		logger.info("Department/Ind. Agency Codes: ==" + DepartmentField.Code);
		Assert.assertEquals((DepartmentField.Code), expected20);
		Thread.sleep(1000);

		String expected16 = driver.findElement(DepartmentCreateLocators.EditAgencyCode).getText();
		logger.info("Agency Code: " + expected16);
		logger.info("Agency Code: ==" + DepartmentField.ConfirmationAgencyCode);
		Assert.assertEquals((DepartmentField.ConfirmationAgencyCode), expected16);
		Thread.sleep(1000);

		String expected17 = driver.findElement(DepartmentCreateLocators.EditCGACCode).getText();
		logger.info("CGAC Code: " + expected17);
		logger.info("CGAC Code: ==" + DepartmentField.EditCgac);
		Assert.assertEquals((DepartmentField.EditCgac), expected17);
		Thread.sleep(1000);

		String expected18 = driver.findElement(DepartmentCreateLocators.EditCFDACode).getText();
		logger.info("CFDA Code: " + expected18);
		logger.info("CFDA Code: ==" + DepartmentField.ConfirmationCFDACode);
		Assert.assertEquals((DepartmentField.ConfirmationCFDACode), expected18);
		Thread.sleep(1000);

		String expected19 = driver.findElement(DepartmentCreateLocators.EditTAS2Code).getText();
		logger.info("TAS-2 Code: " + expected19);
		logger.info("TAS-2 Code: ==" + DepartmentField.ConfirmationTAS2Code);
		Assert.assertEquals((DepartmentField.ConfirmationTAS2Code), expected19);
		Thread.sleep(1000);

	}

	@Then("^User click on edit agency details button$")
	public void user_Click_On_Edit_Agency_Details_Button() throws Throwable {

		/////////////////////////////////////////////////////
		Thread.sleep(2000);
		logger.info("edit agency details button", scenario);

		String details = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/h2"))
				.getText();
		logger.info("Chekinggggggg++++: " + details);
		Assert.assertEquals("Department/Ind. Agency Details", details);
		WebElement elt4 = driver.findElement(DepartmentLocators.editButton1);
		Actions builder4 = new Actions(driver);
		Actions seriesOfActions4 = builder4.moveToElement(elt4).click();
		seriesOfActions4.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters edit end month ([^\"]*)$")
	public void the_User_Enters_Edit_End_Month(String editEndMonth) {
		EditDepartmentEndHint = driver.findElement(DepartmentLocators.EditDepartmentEndHint).getText();
		logger.info("EditDepartmentEndHint "+ EditDepartmentEndHint);
		logger.info("DepartmentField.EditDepartmentEndHint "+ DepartmentField.EditDepartmentEndHint);
		Assert.assertEquals(DepartmentField.EditDepartmentEndHint, EditDepartmentEndHint);
		
		EditDepartmentEndMonth1 = driver.findElement(DepartmentLocators.EditDepartmentEndMonth1).getText();
		logger.info("EditDepartmentEndMonth1 "+ EditDepartmentEndMonth1);
		logger.info("DepartmentField.Month "+ DepartmentField.Month);
		Assert.assertEquals(DepartmentField.Month, EditDepartmentEndMonth1);
		
		
		driver.findElement(DepartmentLocators.endMonth).clear();
		EditDepartmentEndMonth = DateClass.addOrSubDaysFromCurrentDate(1,"month");
		driver.findElement(DepartmentLocators.endMonth).sendKeys(EditDepartmentEndMonth);
		logger.info("enters edit end month ", EditDepartmentEndMonth);
		 
		//driver.findElement(DepartmentLocators.endMonth).sendKeys("02");
		logger.info("enters edit end month ", scenario);
	}

	@And("^The user enters edit end day ([^\"]*)$")
	public void the_User_Enters_Edit_End_Day(String editEndDay) throws Throwable {
		EditDepartmentEndDay1 = driver.findElement(DepartmentLocators.EditDepartmentEndDay1).getText();
		logger.info("EditDepartmentEndDay1 "+ EditDepartmentEndDay1);
		logger.info("DepartmentField.Day "+ DepartmentField.Day);
		Assert.assertEquals(DepartmentField.Day, EditDepartmentEndDay1);
		
		driver.findElement(DepartmentLocators.endDay).clear();
		EditDepartmentEndDay = DateClass.addOrSubDaysFromCurrentDate(1,"day");
		driver.findElement(DepartmentLocators.endDay).sendKeys(EditDepartmentEndDay);
		logger.info("enters edit end day ", EditDepartmentEndDay);
		logger.info("enters edit end day ", scenario);
	}

	@And("^The user enters edit end year ([^\"]*)$")
	public void the_User_Enters_Edit_End_Year(String editEndYear) throws Throwable {
		EditDepartmentEndYear1 = driver.findElement(DepartmentLocators.EditDepartmentEndYear1).getText();
		logger.info("EditDepartmentEndYear1 "+ EditDepartmentEndYear1);
		logger.info("DepartmentField.Year "+ DepartmentField.Year);
		Assert.assertEquals(DepartmentField.Year, EditDepartmentEndYear1);
		
		driver.findElement(DepartmentLocators.endYear).clear();
		EditDepartmentEndYear = DateClass.addOrSubDaysFromCurrentDate(1,"year");
		logger.info("enters edit end year ", EditDepartmentEndYear);
		driver.findElement(DepartmentLocators.endYear).sendKeys(EditDepartmentEndYear);
		logger.info("enters edit end year ", scenario);
	}

	@And("^The user enters edit Description data ([^\"]*)$")
	public void the_User_Enters_Edit_Description_data(String editDescriptionData) throws Throwable {

		driver.findElement(DepartmentLocators.description1).clear();
		// driver.findElement(DepartmentLocators.description1).sendKeys(editDescriptionData);
		EditDepartmentDescription = editDescriptionData;
		driver.findElement(DepartmentLocators.description1).sendKeys(EditDepartmentDescription);
		logger.info("enters edit Description data " + scenario);
	}

	@And("^The user enters edit short Name ([^\"]*)$")
	public void the_User_Enters_Edit_Short_Name(String shortName) throws Throwable {
		EditDepartmentShortName1 = driver.findElement(DepartmentLocators.EditDepartmentShortName1).getText();
		logger.info("EditDepartmentShortName1 "+ EditDepartmentShortName1);
		logger.info("DepartmentField.EditDepartmentShortName1 "+  DepartmentField.EditDepartmentShortName1);
		Assert.assertEquals(DepartmentField.EditDepartmentShortName1, EditDepartmentShortName1);
		
		EditDepartmentShortNameHint = driver.findElement(DepartmentLocators.EditDepartmentShortNameHint).getText();
		logger.info("EditDepartmentShortNameHint "+ EditDepartmentShortNameHint);
		logger.info("DepartmentField.EditDepartmentShortNameHint "+ DepartmentField.EditDepartmentShortNameHint);
		Assert.assertEquals(DepartmentField.EditDepartmentShortNameHint, EditDepartmentShortNameHint);
		
		driver.findElement(DepartmentLocators.shortName).clear();
		EditDepartmentShortName = shortName; 
		driver.findElement(DepartmentLocators.shortName).sendKeys(EditDepartmentShortName);
		logger.info("enters edit short Name ", scenario);
	}

	@Then("User click on edit agency details submit button")
	public void user_Click_On_Edit_Agency_Details_Submit_Button() throws Throwable {
		logger.info("edit agency details submit button ", scenario);
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elt10 = driver.findElement(By.xpath(
				"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/div[3]/sam-button/button"));
		Actions builder50 = new Actions(driver);
		Actions seriesOfActions10 = builder50.moveToElement(elt10).click();
		seriesOfActions10.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1400);

	}

	@Then("^User click on edit agency code button$")
	public void user_Click_On_Edit_Agency_Code_Button() throws Throwable {
		logger.info("edit agency code button", scenario);
		String textAgencyCode = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/h2"))
				.getText();
		Assert.assertEquals("Department/Ind. Agency Codes", textAgencyCode);
		// WebElement elt4 =
		// driver.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/button"));
		WebElement elt4 = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/button"));
		// WebElement elt4 = driver.findElement(Locators.editButton2);
		Actions builder4 = new Actions(driver);
		Actions seriesOfActions4 = builder4.moveToElement(elt4).click();
		seriesOfActions4.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters edit CGAC code ([^\"]*)$")
	public void the_User_Enters_Edit_CGAC_Code(String CGAC) {
		EditDepartmentCGACHint = driver.findElement(DepartmentLocators.EditDepartmentCGACHint).getText();
		logger.info("EditDepartmentCGACHint "+ EditDepartmentCGACHint);
		logger.info("DepartmentField.EditDepartmentCGACHint :"+ DepartmentField.EditDepartmentCGACHint);
		Assert.assertEquals(DepartmentField.EditDepartmentCGACHint, EditDepartmentCGACHint);
		
		driver.findElement(DepartmentLocators.cgacCode).clear();
		EditDepartmentCGAC = CGAC;
		driver.findElement(DepartmentLocators.cgacCode).sendKeys(EditDepartmentCGAC);
		logger.info("enters edit CGAC code", scenario);
	}

	@And("^The user enters edit Agency codes ([^\"]*)$")
	public void the_User_Enters_Edit_Agency_Codes(String Agency) throws Throwable {
		EditDepartmentAgencyCodeHint = driver.findElement(DepartmentLocators.EditDepartmentAgencyCodeHint).getText();
		logger.info("EditDepartmentAgencyCodeHint "+ EditDepartmentAgencyCodeHint);
		logger.info("DepartmentField.EditDepartmentAgencyCodeHint "+ DepartmentField.EditDepartmentAgencyCodeHint);
		Assert.assertEquals(DepartmentField.EditDepartmentAgencyCodeHint, EditDepartmentAgencyCodeHint);
		
		driver.findElement(DepartmentLocators.agencyCode).clear();
		EditDepartmentAgencyCode = Agency;
		driver.findElement(DepartmentLocators.agencyCode).sendKeys(EditDepartmentAgencyCode);
		logger.info("enters edit Agency code", scenario);
	}

	@And("^The user enters edit CFDA code([^\"]*)$")
	public void the_User_Enters_Edit_CFDA_Codes(String CFDA) throws Throwable {
		EditDepartmentCFDACodeHint = driver.findElement(DepartmentLocators.EditDepartmentCFDACodeHint).getText();
		logger.info("EditDepartmentCFDACodeHint "+ EditDepartmentCFDACodeHint);
		logger.info("DepartmentField.EditDepartmentCFDACodeHint "+ DepartmentField.EditDepartmentCFDACodeHint);
		Assert.assertEquals(DepartmentField.EditDepartmentCFDACodeHint, EditDepartmentCFDACodeHint);
		
		driver.findElement(DepartmentLocators.cfdaCode).clear();
		EditDepartmentCFDACode = CFDA;
		driver.findElement(DepartmentLocators.cfdaCode).sendKeys(EditDepartmentCFDACode);
		logger.info("enters edit CFDA code", scenario);
	}

	@And("^The user enters edit TAS code ([^\"]*)$")
	public void the_User_Enters_Edit_TAS_Codes(String TAS) throws Throwable {
		driver.findElement(DepartmentLocators.tas2Code).clear();
		driver.findElement(DepartmentLocators.tas2Code).sendKeys(TAS);
		logger.info("enters edit TAS code", scenario);
	}

	@Then("User click on edit agency code submit button")
	public void user_Click_On_Edit_Agency_Code_Submit_Button() throws Throwable {
		logger.info("edit agency code submit button", scenario);
		WebElement elt5 = driver.findElement(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/sam-button/button"));
		Actions builder5 = new Actions(driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		
		/*EditDepartmentEndDateText = driver.findElement(DepartmentLocators.EditDepartmentEndDateText).getText();
		logger.info("EditDepartmentEndDateText ", EditDepartmentEndDateText);
		logger.info("DepartmentField.EditDepartmentCFDACodeHint ", DepartmentField.EditDepartmentCFDACodeHint);
		Assert.assertEquals(DepartmentField.EditDepartmentCFDACodeHint, EditDepartmentEndDateText);*/
		Thread.sleep(5000);
		
		EditDepartmentDescriptionText = driver.findElement(DepartmentLocators.EditDepartmentDescriptionText).getText();
		logger.info("EditDepartmentDescriptionText "+ EditDepartmentDescriptionText);
		logger.info("EditDepartmentDescription"+ EditDepartmentDescription);
		Assert.assertEquals(EditDepartmentDescription, EditDepartmentDescriptionText);
		
		Thread.sleep(5000);
		EditDepartmentShortNametext1 = driver.findElement(DepartmentLocators.EditDepartmentShortNametext1).getText();
		logger.info("EditDepartmentShortNametext1 "+ EditDepartmentShortNametext1);
		logger.info("EditDepartmentShortName"+ EditDepartmentShortName);
		Assert.assertEquals(EditDepartmentShortName, EditDepartmentShortNametext1);
		
		Thread.sleep(6000);
		
		EditDepartmentAgencyCodetext = driver.findElement(DepartmentLocators.EditDepartmentAgencyCodetext).getText().trim();
		logger.info("EditDepartmentAgencyCodetext "+ EditDepartmentAgencyCodetext);
		logger.info("EditDepartmentAgencyCode "+ EditDepartmentAgencyCode);
		//String  Str = EditDepartmentAgencyCode;
		//Assert.assertTrue(Str.contains(EditDepartmentAgencyCodetext));
		Assert.assertEquals(EditDepartmentAgencyCode.trim(), EditDepartmentAgencyCodetext);
		Thread.sleep(6000);
		
		EditDepartmentCGACtext = driver.findElement(DepartmentLocators.EditDepartmentCGACtext).getText().trim();
		logger.info("EditDepartmentCGACtext "+ EditDepartmentCGACtext);
		logger.info("EditDepartmentCGAC"+ EditDepartmentCGAC);
		Assert.assertEquals(EditDepartmentCGAC.trim(), EditDepartmentCGACtext);
		Thread.sleep(6000);
		Thread.sleep(4);
		/*EditDepartmentCFDACodetext = driver.findElement(DepartmentLocators.EditDepartmentCFDACodetext).getText().trim();
		logger.info("EditDepartmentCFDACodetext "+ EditDepartmentCFDACodetext);
		logger.info("EditDepartmentCFDACode"+ EditDepartmentCFDACode); 
		Assert.assertEquals(EditDepartmentCFDACode.trim(), EditDepartmentCFDACodetext);*/
		
		EditDepartmentCFDACodetext1 = driver.findElement(DepartmentLocators.EditDepartmentCFDACodetext1).getText().trim();
		logger.info("EditDepartmentCFDACodetext1 "+ EditDepartmentCFDACodetext1);
		logger.info("EditDepartmentCFDACode"+ EditDepartmentCFDACode); 
		Assert.assertEquals(EditDepartmentCFDACode.trim(), EditDepartmentCFDACodetext1);
		
		Thread.sleep(6000);
		EditDepartmentTAS2Codetext = driver.findElement(DepartmentLocators.EditDepartmentTAS2Codetext).getText().trim();
		logger.info("EditDepartmentTAS2Codetext "+ EditDepartmentTAS2Codetext);
		logger.info("TAS2 "+ TAS2);
		Assert.assertEquals(TAS2.trim(), EditDepartmentTAS2Codetext);
	}

	@Given("Click on Create Sub Tier")
	public void click_on_create_subTier() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("scroll(0,-2000)");

		logger.info("Create Sub Tier", scenario);
		WebElement elt5 = driver.findElement(SubTierLocators.crateSubTier);
		Actions builder5 = new Actions(driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters sub Tier details ([^\"]*)$")
	public void the_user_enters_sub_tier_detail(String SubTierName) {
		SubTierDetails = driver.findElement(DepartmentLocators.SubTierDetails).getText();
		logger.info("SubTierDetails: "+ SubTierDetails);
		logger.info("DepartmentField.SubTierDetails: "+ DepartmentField.SubTierDetails);
		Assert.assertEquals(DepartmentField.SubTierDetails, SubTierDetails);
		
		SubTierNameTitle = driver.findElement(DepartmentLocators.SubTierNameTitle).getText();
		logger.info("SubTierNameTitle: "+ SubTierNameTitle);
		
		String str = SubTierNameTitle.replace("\n", " ");
		logger.info("Str========" + str);
		Assert.assertTrue(str.contains(DepartmentField.SubTierNameTitle));
		Assert.assertTrue(str.contains(CreateOfficeFields.Required));
		
		//logger.info("DepartmentField.SubTierNameTitle: "+ DepartmentField.SubTierNameTitle);
		//Assert.assertEquals(DepartmentField.SubTierNameTitle, SubTierNameTitle);
		
		/*SubTierNameRequired = driver.findElement(DepartmentLocators.SubTierNameRequired).getText();
		logger.info("SubTierNameRequired: "+ SubTierNameRequired);
		logger.info("DepartmentField.SubTierNameRequired: "+ DepartmentField.Required);
		Assert.assertEquals(DepartmentField.Required, SubTierNameRequired);*/
		
		SubTierNameHint = driver.findElement(DepartmentLocators.SubTierNameHint).getText();
		logger.info("SubTierNameHint: "+ SubTierNameHint);
		logger.info("DepartmentField.SubTierNameHint: "+ DepartmentField.SubTierNameHint);
		Assert.assertEquals(DepartmentField.SubTierNameHint, SubTierNameHint);
		
		
		driver.findElement(DepartmentLocators.departmentName).clear();
		int val = (int) Math.ceil(Math.random() * 1000);
		SubTierName1 = "Sub Tier" + val;
		logger.info("SubTierName: "+SubTierName1);
		driver.findElement(DepartmentLocators.departmentName).sendKeys(SubTierName1);
		logger.info("sub tier details", scenario);
		
		SubTierParentDepartment = driver.findElement(DepartmentLocators.SubTierParentDepartment).getText();
		logger.info("SubTierParentDepartment: "+ SubTierParentDepartment);
		logger.info("DepartmentField.SubTierParentDepartment: "+ DepartmentField.SubTierParentDepartment);
		Assert.assertEquals(DepartmentField.SubTierParentDepartment, SubTierParentDepartment);
		
		SubTierDepartment = driver.findElement(DepartmentLocators.SubTierDepartment).getText();
		logger.info("SubTierDepartment: "+ SubTierDepartment);
		logger.info("SubTierDepartment : "+ SubTierDepartment.length());
		logger.info("DepartmentField.SubTierDepartment: "+ DepartmentField.SubTierDepartment);
		logger.info(" DepartmentField.SubTierDepartment : "+  (DepartmentField.SubTierDepartment).length());
		Assert.assertEquals(DepartmentField.SubTierDepartment, SubTierDepartment);
		
		SubTierDepartmentTest = driver.findElement(DepartmentLocators.SubTierDepartmentTest).getText();
		logger.info("SubTierDepartmentTest: "+ SubTierDepartmentTest);
		logger.info("agencyName "+ agencyName);
		//Assert.assertTrue(DepartmentField.SubTierDepartment.contains(agencyName));	
	}

	@And("^The user enters sub tier start month ([^\"]*)$")
	public void the_user_enters_sub_tier_start_month(String startMonth) {
		
		SubTierStartDate = driver.findElement(DepartmentLocators.SubTierStartDate).getText();
		logger.info("SubTierStartDate: "+ SubTierStartDate);
		logger.info("DepartmentField.SubTierStartDate: "+ DepartmentField.SubTierStartDate);
		String str = SubTierStartDate.replace("\n", " ");
		logger.info("Str========" + str);
		Assert.assertTrue(str.contains(DepartmentField.SubTierStartDate));
		Assert.assertTrue(str.contains(CreateOfficeFields.Required));
		
		//Assert.assertEquals(DepartmentField.SubTierStartDate, SubTierStartDate);
		
	/*	
		SubTierStartDateRequired = driver.findElement(DepartmentLocators.SubTierStartDateRequired).getText();
		logger.info("SubTierStartDateRequired: "+ SubTierStartDateRequired);
		logger.info("DepartmentField.Required: "+ DepartmentField.Required);
		Assert.assertEquals(DepartmentField.Required, SubTierStartDateRequired);*/
		
		SubTierStartDateHint = driver.findElement(DepartmentLocators.SubTierStartDateHint).getText();
		logger.info("SubTierStartDateHint: "+ SubTierStartDateHint);
		logger.info("DepartmentField.SubTierStartDateHint: "+ DepartmentField.SubTierStartDateHint);
		Assert.assertEquals(DepartmentField.SubTierStartDateHint, SubTierStartDateHint);
		
		SubTierStartDateMonth = driver.findElement(DepartmentLocators.SubTierStartDateMonth).getText();
		logger.info("SubTierStartDateMonth: "+ SubTierStartDateMonth);
		logger.info("DepartmentField.Month: "+ DepartmentField.Month);
		Assert.assertEquals(DepartmentField.Month, SubTierStartDateMonth);

		driver.findElement(DepartmentLocators.startMonth).clear();
		driver.findElement(DepartmentLocators.startMonth).sendKeys(DateClass.getCurrentMonth());
		logger.info("sub tier start month", scenario);

	}

	@And("^The user enters sub tier start day ([^\"]*)$")
	public void the_user_enters_sub_tier_start_day(String startDay) {
		SubTierStartDateDay = driver.findElement(DepartmentLocators.SubTierStartDateDay).getText();
		logger.info("SubTierStartDateDay: "+ SubTierStartDateDay);
		logger.info("DepartmentField.Day: "+ DepartmentField.Day);
		Assert.assertEquals(DepartmentField.Day, SubTierStartDateDay);

		driver.findElement(DepartmentLocators.startDay).clear();
		driver.findElement(DepartmentLocators.startDay).sendKeys(DateClass.getCurrentDay());
		logger.info("sub tier start day", scenario);
	}

	@And("^The user enters sub tier start year ([^\"]*)$")
	public void the_user_enters_sub_tier_start_year(String startYear) {
		SubTierStartDateYear = driver.findElement(DepartmentLocators.SubTierStartDateYear).getText();
		logger.info("SubTierStartDateYear: "+ SubTierStartDateYear);
		logger.info(" DepartmentField.Year: "+ DepartmentField.Year);
		Assert.assertEquals(DepartmentField.Year, SubTierStartDateYear);
			
		driver.findElement(DepartmentLocators.startYear).clear();
		driver.findElement(DepartmentLocators.startYear).sendKeys(DateClass.getCurrentYear());
		logger.info("sub tier start year", scenario);
	}

	@And("^The user enters sub tier end month ([^\"]*)$")
	public void the_user_enters_sub_tier_end_month(String endMonth) {
		SubTierEndDate = driver.findElement(DepartmentLocators.SubTierEndDate).getText();
		logger.info("SubTierEndDate: "+ SubTierEndDate);
		logger.info("DepartmentField.SubTierStartDate: "+ DepartmentField.SubTierEndDate);
		Assert.assertEquals(DepartmentField.SubTierEndDate, SubTierEndDate);
		
		SubTierEndDateHint = driver.findElement(DepartmentLocators.SubTierEndDateHint).getText();
		logger.info("SubTierEndDateHint: "+ SubTierEndDateHint);
		logger.info("DepartmentField.SubTierEndDateHint: "+ DepartmentField.SubTierEndDateHint);
		Assert.assertEquals(DepartmentField.SubTierEndDateHint, SubTierEndDateHint);
		
		SubTierEndDateMonth = driver.findElement(DepartmentLocators.SubTierEndDateMonth).getText();
		logger.info("SubTierEndDateMonth: "+ SubTierEndDateMonth);
		logger.info("DepartmentField.Month: "+ DepartmentField.Month);
		Assert.assertEquals(DepartmentField.Month, SubTierEndDateMonth);
		
		driver.findElement(DepartmentLocators.endMonth).clear();
		driver.findElement(DepartmentLocators.endMonth).sendKeys(DateClass.addOrSubDaysFromCurrentDate(2,"month"));
		//driver.findElement(DepartmentLocators.endMonth).sendKeys("02");
		logger.info("sub tier end month", scenario);
	}

	@And("^The user enters sub tier end day ([^\"]*)$")
	public void the_user_enters_sub_tier_end_day(String endDay) {
		SubTierEndDateDay = driver.findElement(DepartmentLocators.SubTierEndDateDay).getText();
		logger.info("SubTierEndDateDay: "+ SubTierEndDateDay);
		logger.info("DepartmentField.Day: "+ DepartmentField.Day);
		Assert.assertEquals(DepartmentField.Day, SubTierEndDateDay);
		
		driver.findElement(DepartmentLocators.endDay).clear();
		driver.findElement(DepartmentLocators.endDay).sendKeys(DateClass.addOrSubDaysFromCurrentDate(2,"day"));
		//driver.findElement(DepartmentLocators.endDay).sendKeys(endDay);
		//driver.findElement(DepartmentLocators.endDay).sendKeys("2");
		logger.info("sub tier end day", scenario);
	}

	@And("^The user enters sub tier end year ([^\"]*)$")
	public void the_user_enters_sub_tier_end_year(String endYear) throws InterruptedException {
		SubTierEndDateYear = driver.findElement(DepartmentLocators.SubTierEndDateYear).getText();
		logger.info("SubTierEndDateYear: "+ SubTierEndDateYear);
		logger.info("DepartmentField.Day: "+ DepartmentField.Year);
		Assert.assertEquals(DepartmentField.Year, SubTierEndDateYear);
		
		driver.findElement(DepartmentLocators.endYear).clear();
		driver.findElement(DepartmentLocators.endYear).sendKeys(DateClass.addOrSubDaysFromCurrentDate(2,"year"));
		//driver.findElement(DepartmentLocators.endYear).sendKeys(endYear);
		logger.info("sub tier end year", scenario);
	}

	@And("^The user enters sub tier short name ([^\"]*)$")
	public void the_user_enters_sub_tier_short_name(String shortName) throws InterruptedException {
		SubTierShortNameTitle = driver.findElement(DepartmentLocators.SubTierShortNameTitle).getText();
		logger.info("SubTierShortNameTitle: "+ SubTierShortNameTitle);
		logger.info("DepartmentField.Day: "+ DepartmentField.SubTierShortNameTitle);
		Assert.assertEquals(DepartmentField.SubTierShortNameTitle, SubTierShortNameTitle);
		
		SubTierShortNameHint = driver.findElement(DepartmentLocators.SubTierShortNameHint).getText();
		logger.info("SubTierShortNameHint: "+ SubTierShortNameHint);
		logger.info("DepartmentField.SubTierShortNameHint: "+ DepartmentField.SubTierShortNameHint);
		Assert.assertEquals(DepartmentField.SubTierShortNameHint, SubTierShortNameHint);
		SubTierShortName = shortName;
		driver.findElement(SubTierLocators.shortName).clear();
		driver.findElement(SubTierLocators.shortName).sendKeys(SubTierShortName);
		// TimeUnit.SECONDS.sleep(50);
		logger.info("sub tier short name", scenario);
	}

	@And("^The user enters sub tier Agency codes ([^\"]*)$")
	public void the_user_enters_sub_tier_Agency_codes(String agencyCode) throws InterruptedException {
		SubTierCode = driver.findElement(DepartmentLocators.SubTierCode).getText();
		logger.info("SubTierCode: "+ SubTierShortNameTitle);
		logger.info("DepartmentField.SubTierCode: "+ DepartmentField.SubTierCode);
		Assert.assertEquals(DepartmentField.SubTierCode, SubTierCode);
		
		SubTierCodeAgencyTitle = driver.findElement(DepartmentLocators.SubTierCodeAgencyTitle).getText();
		logger.info("SubTierCodeAgencyTitle: "+ SubTierCodeAgencyTitle);
		logger.info("DepartmentField.SubTierCodeAgencyTitle: "+ DepartmentField.SubTierCodeAgencyTitle);
		String str = SubTierCodeAgencyTitle.replace("\n", " ");
		logger.info("Str========" + str);
		Assert.assertTrue(str.contains(DepartmentField.SubTierCodeAgencyTitle));
		Assert.assertTrue(str.contains(CreateOfficeFields.Required));
		
		/*Assert.assertEquals(DepartmentField.SubTierCodeAgencyTitle, SubTierCodeAgencyTitle);
		
		SubTierCodeAgencyRequired = driver.findElement(DepartmentLocators.SubTierCodeAgencyRequired).getText();
		logger.info("SubTierCodeAgencyRequired: "+ SubTierCodeAgencyRequired);
		logger.info("DepartmentField.SubTierCodeAgencyHint: "+ DepartmentField.DeptAgencyName3);
		Assert.assertEquals(DepartmentField.DeptAgencyName3, SubTierCodeAgencyRequired);*/
		
		SubTierCodeAgencyHint = driver.findElement(DepartmentLocators.SubTierCodeAgencyHint).getText();
		logger.info("SubTierCodeAgencyHint: "+ SubTierCodeAgencyHint);
		logger.info("DepartmentField.SubTierCodeAgencyHint: "+ DepartmentField.SubTierCodeAgencyHint);
		Assert.assertEquals(DepartmentField.SubTierCodeAgencyHint, SubTierCodeAgencyHint);
		
		driver.findElement(SubTierLocators.agencyCode).clear();
		SubtieragencyCode = agencyCode;
		driver.findElement(SubTierLocators.agencyCode).sendKeys(SubtieragencyCode);
		// TimeUnit.SECONDS.sleep(50);
		logger.info("sub tier Agency codes", scenario);
	}

	@And("^The user enters sub tier OMB code ([^\"]*)$")
	public void the_user_enters_sub_tier_OMB_code(String omb) throws InterruptedException {
		driver.findElement(SubTierLocators.ombCode).clear();
		driver.findElement(SubTierLocators.ombCode).sendKeys(omb);
		// TimeUnit.SECONDS.sleep(50);
		logger.info("sub tier OMB code", scenario);
	}

	@Then("^The User click on the sub tier confirm button$")
	public void the_user_click_on_the_sub_tier_confirm_button() throws InterruptedException {
		logger.info("sub tier confirm button", scenario);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// WebElement elt10 = driver.findElement(
		// By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button"));
		WebElement elt10 = driver.findElement(SubTierLocators.SubmitsunTier);
		Actions builder50 = new Actions(driver);
		Actions seriesOfActions10 = builder50.moveToElement(elt10).click();
		seriesOfActions10.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1400);
		
		String ConfirmationFH = driver.findElement(DepartmentLocators.ConfirmationFH).getText();
		logger.info("ConfirmationFH: "+ ConfirmationFH);
		logger.info("DepartmentField.ConfirmationFH:"+ DepartmentField.ConfirmationFH);
		Assert.assertEquals(DepartmentField.ConfirmationFH, ConfirmationFH);

		/*String SubTierConfirmation = driver.findElement(DepartmentLocators.SubTierConfirmation).getText();
		logger.info("SubTierConfirmation: "+ SubTierConfirmation);
		logger.info("DepartmentField.SubTierConfirmation: "+ DepartmentField.SubTierConfirmation);
		Assert.assertEquals(DepartmentField.SubTierConfirmation, SubTierConfirmation);*/
		
		String SubTierConfirmationConfirmBelowDetails = driver.findElement(DepartmentLocators.SubTierConfirmationConfirmBelowDetails).getText();
		logger.info("SubTierConfirmationConfirmBelowDetails: "+ SubTierConfirmationConfirmBelowDetails);
		logger.info("DepartmentField.ConfirmDetails: "+ DepartmentField.ConfirmDetails);
		Assert.assertEquals(DepartmentField.ConfirmDetails, SubTierConfirmationConfirmBelowDetails);
		
		String SubTierConfirmationSubTierDetails = driver.findElement(DepartmentLocators.SubTierConfirmationSubTierDetails).getText();
		logger.info("SubTierConfirmationSubTierDetails: "+ SubTierConfirmationSubTierDetails);
		logger.info("DepartmentField.ConfirmDetails: "+ DepartmentField.SubTierConfirmationSubTierDetails);
		Assert.assertEquals(DepartmentField.SubTierConfirmationSubTierDetails, SubTierConfirmationSubTierDetails);
		
		String SubTierConfirmationSubTierName = driver.findElement(DepartmentLocators.SubTierConfirmationSubTierName).getText();
		logger.info("SubTierConfirmationSubTierName: "+ SubTierConfirmationSubTierName);
		logger.info("DepartmentField.SubTierNameTitle: "+ DepartmentField.SubTierConfirmationSubTierName);
		Assert.assertEquals(DepartmentField.SubTierConfirmationSubTierName, SubTierConfirmationSubTierName);
		
		String SubTierConfirmationSubTierNameText = driver.findElement(DepartmentLocators.SubTierConfirmationSubTierNameText).getText();
		logger.info("SubTierConfirmationSubTierNameText: "+ SubTierConfirmationSubTierNameText);
		logger.info("SubTierName1 "+ SubTierName1);
		Assert.assertEquals(SubTierName1, SubTierConfirmationSubTierNameText);
		
		String SubTierConfirmationStartDate = driver.findElement(DepartmentLocators.SubTierConfirmationStartDate).getText();
		logger.info("SubTierConfirmationStartDate: "+ SubTierConfirmationStartDate);
		logger.info("DepartmentField.SubTierNameTitle: "+ DepartmentField.ConfirmationStartDate);
		Assert.assertEquals(DepartmentField.ConfirmationStartDate, SubTierConfirmationStartDate);
		
		String SubTierConfirmationEndDate = driver.findElement(DepartmentLocators.SubTierConfirmationEndDate).getText();
		logger.info("SubTierConfirmationEndDate: "+ SubTierConfirmationEndDate);
		logger.info("DepartmentField.SubTierNameTitle: "+ DepartmentField.ConfirmationEndDate);
		Assert.assertEquals(DepartmentField.ConfirmationEndDate, SubTierConfirmationEndDate);
		
		String SubTierConfirmationShortname = driver.findElement(DepartmentLocators.SubTierConfirmationShortname).getText();
		logger.info("SubTierConfirmationShortname: "+ SubTierConfirmationShortname);
		logger.info("DepartmentField.ConfirmationShortname: "+ DepartmentField.ConfirmationShortname);
		Assert.assertEquals(DepartmentField.ConfirmationShortname, SubTierConfirmationShortname);
		
		String SubTierConfirmationShortnameText = driver.findElement(DepartmentLocators.SubTierConfirmationShortnameText).getText();
		logger.info("SubTierConfirmationShortnameText: "+ SubTierConfirmationShortnameText);
		logger.info("SubTierShortName: "+SubTierShortName);
		Assert.assertEquals(SubTierShortName, SubTierConfirmationShortnameText);
		
		String SubTierConfirmationSubTierCode = driver.findElement(DepartmentLocators.SubTierConfirmationSubTierCode).getText();
		logger.info("SubTierConfirmationSubTierCode: "+ SubTierConfirmationSubTierCode);
		logger.info("DepartmentField.SubTierCode: "+ DepartmentField.SubTierCode);
		Assert.assertEquals(DepartmentField.SubTierCode, SubTierConfirmationSubTierCode);
		
		String SubTierConfirmationAgencyCode = driver.findElement(DepartmentLocators.SubTierConfirmationAgencyCode).getText();
		logger.info("SubTierConfirmationAgencyCode: "+ SubTierConfirmationAgencyCode);
		logger.info("DepartmentField.SubTierCodeAgencyTitle1:"+ DepartmentField.SubTierCodeAgencyTitle1);
		Assert.assertEquals(DepartmentField.SubTierCodeAgencyTitle1, SubTierConfirmationAgencyCode);
		
		String SubTierCodeAgencyTitle = driver.findElement(DepartmentLocators.SubTierConfirmationAgencyCodeText).getText();
		logger.info("SubTierCodeAgencyTitle: "+ SubTierCodeAgencyTitle);
		logger.info("SubtieragencyCode: "+ SubtieragencyCode);
		Assert.assertEquals(SubtieragencyCode, SubTierCodeAgencyTitle);
		
	}

	@Then("^The User click on the sub tier edit button$")
	public void the_User_click_on_the_sub_tier_edit_button() throws InterruptedException {
		logger.info("sub tier edit button", scenario);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elt10 = driver.findElement(SubTierLocators.editsubTier);
		Actions builder50 = new Actions(driver);
		Actions seriesOfActions10 = builder50.moveToElement(elt10).click();
		seriesOfActions10.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1400);

	}

	@Then("The User click on the sub tier submit button")
	public void the_user_click_on_the_sub_tier_submit_button() throws Throwable {
		logger.info("sub tier submit button", scenario);
		WebElement elt10 = driver.findElement(SubTierLocators.SubmitsunTier);
		Actions builder50 = new Actions(driver);
		Actions seriesOfActions10 = builder50.moveToElement(elt10).click();
		seriesOfActions10.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1400);
	}

	@When("^The User click on the confirmation sub tier Submit button$")
	public void the_user_click_on_the_confirmation_sub_tier_Submit_button() throws InterruptedException {
		logger.info(" confirmation sub tier Submit button", scenario);

		WebElement elt10 = driver.findElement(SubTierLocators.subTierConfirmation);
		Actions builder50 = new Actions(driver);
		Actions seriesOfActions10 = builder50.moveToElement(elt10).click();
		seriesOfActions10.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1400);

	}

	@Then("^User navigate to sub Tier profile page$")
	public void user_navigate_to_sub_Tier_profile_page() {
		logger.info("Profile", scenario);
		String val = "Profile";
		String profilePage = driver.findElement(SubTierLocators.profile).getText();
		Assert.assertEquals(val, profilePage);
	}

	@Given("^Click on edit Sub Tier button$")
	public void the_user_click_on_edit_sub_tier_detail() throws InterruptedException {
		logger.info("Click on edit Sub Tier button", scenario);

	}

	@And("The user click on edit sub tier detail")
	public void The_user_click_on_edit_sub_tier_detail() throws Throwable {
		logger.info("The user click on edit sub tier detail", scenario);

		// WebElement elt4 = driver.findElement(SubTierLocators.editSubTier1);
		WebElement elt4 = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/button"));
		// *[@id="primary-content"]/ng-component/div/div[1]/div[3]/div[1]/button
		Actions builder4 = new Actions(driver);
		Actions seriesOfActions4 = builder4.moveToElement(elt4).click();
		seriesOfActions4.perform();
		Thread.sleep(1400);

	}

	@And("^The user edit sub tier end month ([^\"]*)$")
	public void The_user_edit_sub_tier_end_month(String endMonth) {

		/*
		 * String text = driver.findElement(By.xpath(
		 * "//*[@id=\"primary-content\"]/ng-component/div/div[1]/form/div/h2"))
		 * .getText(); Assert.assertEquals("Dept/Ind Agency Details", text);
		 */
		driver.findElement(DepartmentLocators.endMonth).clear();
		EditSubTierEndMonth = DateClass.addOrSubDaysFromCurrentDate(1,"month");
		logger.info("EditSubTierEndMonth: "+ EditSubTierEndMonth);
		driver.findElement(DepartmentLocators.endMonth).sendKeys(EditSubTierEndMonth);
		logger.info("The user edit sub tier end month", scenario);

	}

	@And("^The user edit sub tier end day ([^\"]*)$")
	public void The_user_edit_sub_tier_end_day(String endDay) {
		driver.findElement(DepartmentLocators.endDay).clear();
		EditSubTierEndDay = DateClass.addOrSubDaysFromCurrentDate(1,"day");
		logger.info("EditSubTierEndDay: "+ EditSubTierEndDay);
		driver.findElement(DepartmentLocators.endDay).sendKeys(EditSubTierEndDay);
		logger.info("The user edit sub tier end day", scenario);

	}

	@And("^The user edit sub tier end year ([^\"]*)$")
	public void The_user_edit_sub_tier_end_year(String endYear) {
		driver.findElement(DepartmentLocators.endYear).clear();
		EditSubTierEndYear = DateClass.addOrSubDaysFromCurrentDate(1,"year");
		logger.info("EditSubTierEndYear: "+ EditSubTierEndYear);
		driver.findElement(DepartmentLocators.endYear).sendKeys(EditSubTierEndYear);
		logger.info("The user edit sub tier end year", scenario);

	}

	@And("^The user edit sub tier short name ([^\"]*)$")
	public void The_user_edit_sub_tier_shortName(String shortName) {
		driver.findElement(DepartmentLocators.shortName).clear();
		EditSubTierShortName = shortName;
		driver.findElement(DepartmentLocators.shortName).sendKeys(EditSubTierShortName);
		logger.info("EditSubTierShortName: " + EditSubTierShortName);
		logger.info("The user edit sub tier short name", scenario);

	}

	@And("^The user click on edit sub tier submit button$")
	public void The_user_click_on_edit_sub_tier_submit_button() throws Throwable {
		logger.info("edit agency details submit button ", scenario);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// WebElement elt10 =
		// driver.findElement(DepartmentLocators.editSubmitButton1);

		WebElement elt10 = driver.findElement(By.xpath(
				"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/form/div[3]/sam-button/button"));

		Actions builder50 = new Actions(driver);
		Actions seriesOfActions10 = builder50.moveToElement(elt10).click();
		seriesOfActions10.perform();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1400);
		logger.info("The user click on edit sub tier submit button", scenario);

	}

	@And("^The user click on edit sub tier codes$")
	public void The_user_click_on_edit_sub_tier_codes() throws InterruptedException {
		logger.info("The user click on edit sub tier codes", scenario);
		WebElement elt4 = driver
				.findElement(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/button"));
		// WebElement elt4 = driver.findElement(Locators.editButton2);
		Actions builder4 = new Actions(driver);
		Actions seriesOfActions4 = builder4.moveToElement(elt4).click();
		seriesOfActions4.perform();
		Thread.sleep(1400);

	}

	@And("^The user edit sub tier Agency codes ([^\"]*)$")
	public void The_user_edit_sub_tier_Agency_codes(String agencyCode) {
		driver.findElement(SubTierLocators.agencyCode).clear();
		EditSubTierAgencyCode = agencyCode;
		logger.info("EditSubTierAgencyCode: "+ EditSubTierAgencyCode);
		driver.findElement(SubTierLocators.agencyCode).sendKeys(EditSubTierAgencyCode);
		logger.info("The user edit sub tier Agency codes", scenario);

	}

	@And("^The user edit sub tier OMB code ([^\"]*)$")
	public void The_user_edit_sub_tier_OMB_codes(String omb) {
		driver.findElement(SubTierLocators.ombCode).clear();
		driver.findElement(SubTierLocators.ombCode).sendKeys(omb);
		logger.info("The user edit sub tier OMB code", scenario);

	}

	@Then("^The user click on the sub tier codes submit button$")
	public void the_user_click_on_the_sub_tier_codes_submit_button() throws Throwable {
		// *[@id="primary-content"]/ng-component/div/div[1]/div[4]/section/sam-button/button
		WebElement elt5 = driver.findElement(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/section/sam-button/button"));
		// WebElement elt5 = driver.findElement(SubTierLocators.editSubTier2);
		Actions builder5 = new Actions(driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		logger.info("The user click on the sub tier codes submit button", scenario);

	}

	@Given("^Click on Federal Hierarchy link$")
	public void click_on_Federal_Hierarchy_link() throws Throwable {

		WebElement elt5 = driver.findElement(SubTierLocators.clickFederalHierarchyLink);
		Actions builder5 = new Actions(driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		logger.info("The user click on the sub tier codes submit button", scenario);
		logger.info("active department :" + agencyName1);
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/input")).sendKeys("Department0.3221259");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/input"))
				.sendKeys(agencyName1);

		WebElement elt = driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/i"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
		seriesOfActions.perform();
		Thread.sleep(1400);
		logger.info("User click on the search button");
		Thread.sleep(2000);
	}

	@Then("^Click on first active department link$")
	public void click_on_first_active_department_link() throws Throwable {
		// *[@id="main-container"]/ng-component/div/div/div[3]/div[1]/div[2]/div[1]/a
		WebElement elt5 = driver.findElement(SubTierLocators.firstLink);
		Actions builder5 = new Actions(driver);
		Actions seriesOfActions5 = builder5.moveToElement(elt5).click();
		seriesOfActions5.perform();
		Thread.sleep(1400);
		logger.info("The user click on the sub tier codes submit button", scenario);

	}

	/*
	 * @Given("^Browser close$") public void browser_close() {
	 * logger.info("Inside CloseBrowser"); driver.close(); driver.quit();
	 * logger.debug("Closed Browser");
	 * 
	 * }
	 */

	@Given("^Department created browser sign out$")
	public void department_created_browser_sign_out_() throws Throwable {
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

	@And("^Reading the departments fields$")
	public void Reading_the_departments_fields() throws Throwable {
		((JavascriptExecutor) driver).executeScript("scroll(0,-400)");
		Thread.sleep(4000);
		agencyName1 = driver.findElement(DepartmentLocators.departmentName).getText();
		logger.info("agencyName1:" + agencyName1);
		startMonth1 = driver.findElement(DepartmentLocators.startMonth).getText();
		logger.info("startMonth1:" + startMonth1);
		startDay1 = driver.findElement(DepartmentLocators.startDay).getText();
		logger.info("startDay1:" + startDay1);
		startYear1 = driver.findElement(DepartmentLocators.startYear).getText();
		logger.info("startYear1:" + startYear1);
	}
	
	@And("^Reading details in account details page$")
	public void Reading_details_in_account_details_page() throws Throwable {
		AccountDetailsName = driver.findElement(DepartmentLocators.AccountDetailsName).getText();
		logger.info("AccountDetailsName: "+ AccountDetailsName);
		Thread.sleep(2000);
		AccountDetailsEmail = driver.findElement(DepartmentLocators.AccountDetailsEmail).getText();
		logger.info("AccountDetailsEmail: "+ AccountDetailsEmail);

		Thread.sleep(2000);
		BusinessPhone = driver.findElement(DepartmentLocators.BusinessPhone).getText();
		logger.info("BusinessPhone: "+ BusinessPhone);
	  } 
	 @Then("^Click on the workspace$")
	 public void Click_on_the_workspace() throws Throwable {
		 Thread.sleep(2000);
		 driver.findElement(DepartmentLocators.headerIconMenu).click();
		 Thread.sleep(5000);
		 driver.findElement(DepartmentLocators.Workspace).click();
		 Thread.sleep(2000); 
	 }

}
