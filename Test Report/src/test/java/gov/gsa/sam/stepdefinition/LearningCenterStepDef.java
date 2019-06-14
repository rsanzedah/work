package gov.gsa.sam.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.gsa.sam.base.FileReaderManager;
import gov.gsa.sam.locators.LearningCenterLocators;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Managed;
import cucumber.api.Scenario;

public class LearningCenterStepDef {

	@Managed
	public static WebDriver driver;
	Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(LearningCenterStepDef.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Given("^User enters Learning Center environment (\\w+)$")
	public void User_enters_Learning_Center_environment_COMP_HOME_PAGE(String urlConstant) throws Throwable {
		System.out.println("****COMP_HOME_PAGE. driver::" + driver);
		// driver.get("https://55samfrontendcomp.apps.prod-iae.bsp.gsa.gov/");

		System.out.println("One::" + urlConstant);
		// nagavita.user_enters_environment(urlConstant,driver);

		System.out.println("HI::" + urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
		driver.navigate().refresh();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);
	}

	@And("^User Click on Learning Center$")
	public void User_Click_on_Learning_Center() throws Exception {
		driver.findElement(LearningCenterLocators.footer).click();
		Thread.sleep(3000);
	}

	@Then("^The user able to log into beta Sam gov page$")
	public void The_user_able_to_log_into_beta_Sam_gov_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Assert.assertEquals(val, val1);
		String beta = "New to beta.SAM.gov";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita New to beta.SAM.gov:" + beta1);
		Thread.sleep(10);
		driver.findElement(By
				.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div[2]/div[2]/div/span/a"))
				.click();
		String val2 = "Learning Center";
		String val12 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();

		Assert.assertEquals(val2, val12);
		Thread.sleep(4000);
		/*String beta2 = "Why beta?";
		String beta12 = driver
				.findElement(
						By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/sam-breadcrumbs/ul/li[2]/span"))
				.getText();
		Assert.assertEquals(beta2, beta12);
		logger.info("User to nagavita Why beta " + beta12);*/

		String para2 = "GSA decided to use the term beta when naming beta.SAM.gov to distinguish it from the current legacy SAM.gov site. While parts of the site are official, others are demonstration only and continue to be supported on one of our original websites. The original websites will be gradually migrated to the beta site. When the functionality from an original site has been migrated, the site will be a candidate for retirement. The original sites will co-exist with beta.SAM.gov until they are retired. Once the original SAM.gov site has retired, this site will be renamed “SAM.gov.”";

		String para12 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/form-only/div/div/div/div[2]/div[2]/div[4]/p"))
				.getText();
		para12 = para12.replaceAll("[\n\r]", "");

		logger.info("Otinnal:" + para2);
		logger.info("getText:::" + para12);
		Assert.assertEquals(para2, para12);
		Thread.sleep(30);
		TimeUnit.SECONDS.sleep(8);
		((JavascriptExecutor) driver).executeScript("scroll(0,-400)");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/sam-breadcrumbs/ul/li[1]/a"))
				.click();
		Thread.sleep(10);
		String para = "The General Services Administration (GSA) manages federal acquisition and awards processes in 10 online websites which are now being merged into one.";
		String para1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div[4]/div[2]/p[1]"))
				.getText();
		Assert.assertEquals(para, para1);
		boolean avilable = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div[4]/div[1]/div"))
				.isDisplayed();
		logger.info("logo is present" + avilable);
	}

	@And("^User Click on learn more link$")
	public void User_Click_on_learn_more_link() throws InterruptedException {
		String val2 = "Learning Center";
		String val12 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();

		Assert.assertEquals(val2, val12);
		Thread.sleep(1000);
		String beta2 = "Why beta?";
		String beta12 = driver
				.findElement(
						By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/sam-breadcrumbs/ul/li[2]/span"))
				.getText();
		Assert.assertEquals(beta2, beta12);
		logger.info("User to nagavita Why beta " + beta12);

		String para2 = "GSA decided to use the term beta when naming beta.SAM.gov to distinguish it from the current legacy SAM.gov site. While parts of the site are official, others are demonstration only and continue to be supported on one of our original websites. The original websites will be gradually migrated to the beta site. When the functionality from an original site has been migrated, the site will be a candidate for retirement. The original sites will co-exist with beta.SAM.gov until they are retired. Once the original SAM.gov site has retired, this site will be renamed “SAM.gov.”";

		String para12 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/form-only/div/div/div/div[2]/div[2]/div[4]/p"))
				.getText();
		para12 = para12.replaceAll("[\n\r]", "");

		logger.info("Otinnal:" + para2);
		logger.info("getText:::" + para12);
		Assert.assertEquals(para2, para12);
		Thread.sleep(30);
		TimeUnit.SECONDS.sleep(8);
		((JavascriptExecutor) driver).executeScript("scroll(0,-400)");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div/sam-breadcrumbs/ul/li[1]/a"))
				.click();
		Thread.sleep(10);
	}

	@Then("^User nagavita into beta Sam gov page$")
	public void User_nagavita_into_beta_Sam_ov_page() {
		String para = "The General Services Administration (GSA) manages federal acquisition and awards processes in 10 online websites which are now being merged into one.";
		String para1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div[4]/div[2]/p[1]"))
				.getText();
		Assert.assertEquals(para, para1);
		boolean avilable = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div[4]/div[1]/div"))
				.isDisplayed();
		logger.info("logo is present" + avilable);
	}

	@And("^The user click on about us tab$")
	public void The_user_click_on_about_us_tab() {
		driver.findElement(LearningCenterLocators.aboutUs).click();
	}

	@Then("^User successfully nagavita into about us page$")
	public void User_successfully_nagavita_into_about_us_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);

		String beta = "About Us";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita About Us: " + beta1);
		logger.info("paragraph");
		String paragraph = "The General Service Administration’s (GSA) Office of the Integrated Award Environment (IAE) manages federal procurement and awards processes in ten online systems. These systems include:";
		logger.info("Orginal" + paragraph);
		String paragraph1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/p[1]"))
				.getText();
		logger.info("getText()" + paragraph1);
		Assert.assertEquals(paragraph, paragraph1);

	}

	@And("^The user click on User Accounts tab$")
	public void The_user_click_on_User_Accounts_tab() {
		driver.findElement(LearningCenterLocators.userAccount).click();
	}

	@Then("^User successfully nagavita into User Accounts page$")
	public void User_successfully_nagavita_into_User_Accounts_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);

		String beta = "User Accounts";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita About Us: " + beta1);

		logger.info("paragraph");
		String paragraph = "Visitors to this site can generally be grouped into three types: federal users, non-federal or entity users, and public users. Depending on which type of user you are, you may need to create a user account to access additional features.";
		logger.info("Orginal" + paragraph);
		String paragraph1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div[2]/div[1]/p[1]"))
				.getText();
		logger.info("getText()" + paragraph1);
		Assert.assertEquals(paragraph, paragraph1);

	}

	@Given("^The user click on Data Sets tab$")
	public void The_user_click_on_Data_Sets_tab() {
		driver.findElement(LearningCenterLocators.dataSets).click();

	}

	@Then("^User successfully nagavita into Data Sets page$")
	public void User_successfully_nagavita_into_Data_Sets_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);

		String beta = "Data Sets";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita Data Sets: " + beta1);

		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div/section[2]/div[2]/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div/section[2]/div[2]/div/div/div[1]/div/a")).click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		logger.info("paragraph");
		String paragraph = "ATTENTION: The U.S. Small Business Administration (SBA) updated its Table of Small Business Size Standards adopting the Office of Management and Budget's 2017 revision of the North American Industry Classification System (NAICS) effective October 1, 2017. The revised NAICS Codes and their corresponding size standards are available for use in FBO. The updated table of size standards is available on SBA's website at www.sba.gov/size.";
		logger.info("Orginal" + paragraph);
		String paragraph1 = driver.findElement(By.xpath("//*[@id=\"cc\"]/div/div[1]/div[1]/div[2]/p")).getText();
		logger.info("getText()" + paragraph1);
		Assert.assertEquals(paragraph, paragraph1);
		driver.close();
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div/section[3]/div[2]/div/div/div[1]/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div/section[3]/div[2]/div/div/div[1]/div/a")).click(); 
		//*[@id="main-container"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div/section[3]/div[2]/div/div/div[1]/div/a
		String winHandleBefore1 = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		logger.info("paragraph");
		String paragraph2 = "Federal Procurement Data System - Next Generation";
		logger.info("Orginal" + paragraph2);
		String paragraph12 = driver.findElement(By.xpath("//*[@id=\"anch_1\"]")).getText();
		
		logger.info("getText()" + paragraph12);
		Assert.assertEquals(paragraph2, paragraph12);
		driver.close();
		driver.switchTo().window(winHandleBefore1);
	}

	@And("^The user click on Federal Hierarchy tab$")
	public void Then_user_click_on_Federal_Hierarchy_tab() {
		driver.findElement(LearningCenterLocators.federalHierarchy).click();
	}

	@Then("^User successfully nagavita into Federal Hierarchy page$")
	public void User_successfully_nagavita_into_Federal_Hierarchy_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);

		String beta = "Federal Hierarchy";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita Federal Hierarchy: " + beta1);

		logger.info("paragraph");
		String paragraph = "The Federal Hierarchy is the authoritative source for managing and referencing federal funding and awarding organizations. It’s a directory or “family tree” that organizes federal Government users and establishes relationships between each Department/Independent Agency’s sub-tiers and its offices.";
		logger.info("Orginal" + paragraph);
		String paragraph1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/p[1]"))
				.getText();
		logger.info("getText()" + paragraph1);
		Assert.assertEquals(paragraph, paragraph1);
	}

	@And("^The user click on Entity Information tab$")
	public void The_user_click_on_Entity_Information_tab() {
		driver.findElement(LearningCenterLocators.entityInformation).click();

	}

	@And("^User successfully nagavita into Entity Information page$")
	public void User_successfully_nagavita_into_Entity_Information_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);
		String beta = "Entity Information";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita Entity Information: " + beta1);
		logger.info("paragraph");
		String paragraph = "Parties looking to do business with the federal government must register as “entities” in SAM. Currently, SAM has more than half a million registered entities from both the procurement and assistance communities. This includes prime and subcontractors from sole proprietors and small businesses through large corporations, and assistance recipients from individuals and small non-profits through state governments. Federal government agencies also register to participate in intra-governmental transactions.";
		logger.info("Orginal" + paragraph);
		String paragraph1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/p[1]"))
				.getText();
		logger.info("getText()" + paragraph1);
		Assert.assertEquals(paragraph, paragraph1);
	}

	@Given("^The user click on Resources tab$")
	public void The_user_click_on_Resources_tab() {
		driver.findElement(LearningCenterLocators.resources).click();
	}

	@Then("^User successfully nagavita into Resources page$")
	public void User_successfully_nagavita_into_Resources_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);
		String beta = "Resources";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita Resources: " + beta1);

		logger.info("paragraph");
		String paragraph = "Explore related websites, policy information, and other material related to federal assistance and contracting.";
		logger.info("Orginal" + paragraph);
		String paragraph1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/div[2]/div/p[1]"))
				.getText();
		logger.info("getText()" + paragraph1);
		Assert.assertEquals(paragraph, paragraph1);
	}

	@And("^The user click on Assistance tab$")
	public void The_user_click_on_Assistance_tab() throws InterruptedException {
		driver.findElement(LearningCenterLocators.assistance).click();
		Thread.sleep(3000);
	}

	@Then("^User successfully nagavita into Assistance page$")
	public void User_successfully_nagavita_into_Assistance_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);

		String beta = "Assistance";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita Assistance: " + beta1);

	}

	@And("^The user click on Wage Determinations tab$")
	public void The_user_click_on_Wage_Determinations_tab() throws Throwable {
		driver.findElement(LearningCenterLocators.wageDeterminations).click();
		Thread.sleep(3000);
	}

	@Then("^User successfully nagavita into Wage Determinations page$")
	public void User_successfully_nagavita_into_Wage_Determinations_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);

		String beta = "Wage Determinations";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita Wage Determinations: " + beta1);

	}

	@And("^The user click on Partners tab$")
	public void The_user_click_on_Partners_tab() throws Throwable {
		driver.findElement(LearningCenterLocators.partners).click();
		Thread.sleep(3000);

	}

	@Then("^User successfully nagavita into Partners page$")
	public void User_successfully_nagavita_into_Partners_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);

		String beta = "Partners";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita Partners: " + beta1);

	}

	@Given("^The user click on Policies tab$")
	public void The_user_click_on_Policies_tab() {
		driver.findElement(LearningCenterLocators.Policies).click();

	}

	@Then("^User successfully nagavita into Policies page$")
	public void User_successfully_nagavita_into_Policies_page() throws Throwable {
		String val = "Learning Center";
		String val1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		Thread.sleep(10);
		Assert.assertEquals(val, val1);

		String beta = "Policies";
		String beta1 = driver.findElement(LearningCenterLocators.betaSam).getText();
		Thread.sleep(2000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita Policies: " + beta1);

		logger.info("paragraph");
		String paragraph = "The feedback surveys on beta.SAM.gov (information collections) meet the requirements of 44 U.S.C. § 3507, as amended by section 2 of the Paperwork Reduction Act of 1995. You do not need to answer these questions unless we display a valid Office of Management and Budget (OMB) control number. The OMB control number for our collections is 3090-0297. We estimate that it will take 3 minutes to read the instructions, gather the facts, and answer the questions. Send only comments relating to our time estimate, including suggestions for reducing this burden, or any other aspects of this collection of information to: General Services Administration, Regulatory Secretariat Division (MVCB), ATTN: Ms. Flowers/IC 3090-0297, 1800 F Street, NW, Washington, DC 20405.";
		logger.info("Orginal" + paragraph);
		String paragraph1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/ng-component/p[1]"))
				.getText();
		logger.info("getText()" + paragraph1);
		Assert.assertEquals(paragraph, paragraph1);
	}

	@And("^The user click on Chief Financial Officers link$")
	public void The_user_click_on_Chief_Financial_Officers() throws Throwable {
		driver.findElement(LearningCenterLocators.chiefFinancial).click();
		Thread.sleep(1000);

	}

	@Then("^User successfully nagavita into Chief Financial Officers page$")
	public void User_successfully_nagavita_into_Chief_Financial_Officers() throws Throwable {
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		String beta = "GRANTS TRAINING";
		String beta1 = driver.findElement(LearningCenterLocators.chiefFinancialHeader).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita GRANTS TRAINING: " + beta1);

		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}

	@And("^The user click on Benefit Finder link$")
	public void The_user_click_on_Benefit_Finder() throws Throwable {
		driver.findElement(LearningCenterLocators.benefitFinder).click();
		Thread.sleep(1000);

	}

	@Then("^User successfully nagavita into Benefit Finder page$")
	public void User_successfully_nagavita_into_Benefit_Finder() throws Throwable {
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		String beta = "Benefit Finder";
		String beta1 = driver.findElement(LearningCenterLocators.benefitFinderHeader).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("User to nagavita Benefit Finder: " + beta1);

		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}

	@And("^The user click on service contract Act link$")
	public void The_user_click_on_service_contract() throws Throwable {
		driver.findElement(LearningCenterLocators.serviceContract).click();
		Thread.sleep(1000);

	}

	@Then("^User successfully nagavita into service contract Act page$")
	public void User_successfully_nagavita_into_service_contract() throws Throwable {
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		String beta = "Wage and Hour Division (WHD)";
		String beta1 = driver.findElement(LearningCenterLocators.serviceContractHeader).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("Wage and Hour Division (WHD) " + beta1);

		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}

	@And("^The user click on Conformances under the Davis-Bacon Act link$")
	public void The_user_click_on_DBA_Project_Wage_Determination_link() throws Throwable {
		driver.findElement(LearningCenterLocators.Conformances).click();
		Thread.sleep(1000);

	}

	@Then("^User successfully nagavita into Conformances under the Davis-Bacon Act page$")
	public void User_successfully_nagavita_into_DBA_Project_Wage_Determination_page() throws Throwable {
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		String beta = "HOME";
		String beta1 = driver.findElement(LearningCenterLocators.ConformancesHeader).getText();
		Thread.sleep(3000);
		Assert.assertEquals(beta, beta1);
		logger.info("HOME " + beta1);

		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}

	@Then("^User click on beta sam link$")
	public void beta_sam_link() throws Throwable {

		driver.findElement(LearningCenterLocators.betaSamClick).click();
		Thread.sleep(2000);

	}

	@And("^The user click on Disaster Assistance link$")
	public void User_successfully_nagavita_Disaster_Assistance() throws Throwable {
		driver.findElement(LearningCenterLocators.disasterAssistance).click();
		Thread.sleep(2000);
	}

	@Then("^User successfully nagavita into Disaster Assistance page$")
	public void Disaster_Assistance() throws Throwable {

		String winHandleBefore = driver.getWindowHandle();
		// Perform the click operation that opens new window
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		String beta = "Find Assistance";
		String beta1 = driver.findElement(LearningCenterLocators.disasterAssistanceHeader).getText();
		Assert.assertEquals(beta, beta1);
		logger.info("Find Assistance" + beta1);
		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}

	@Given("^Browser sign out$")
	public void Browser_sign_out() {
		driver.quit();
	}

	@And("^User click on hand icon$")
	public void User_click_on_hand_icon() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headerIconMenu\"]")).click();
		Thread.sleep(2000);
	}

	@Then("^Click on learning center$")
	public void Click_on_learning_center() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"header-link-help\"]")).click();
		Thread.sleep(2000);
		
	}

}
