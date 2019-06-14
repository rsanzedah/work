package gov.gsa.sam.rms.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gov.gsa.sam.rms.locators.UserDirectoryPageLocator;
import gov.gsa.sam.rms.utilities.CommonMethods;

public class UserDirectoryPage {
	private static WebDriver driver;
	private static Logger logger = LoggerFactory.getLogger(UserDirectoryPage.class);

	// *****************************************************************************
	// the following methods describe actions that can be taken immediately on
	// loading of this Page
	// *****************************************************************************
	public static void searchUserOrgUserPicker(String userid) {
		driver.findElement(UserDirectoryPageLocator.USER_PICKER_BAR).sendKeys(userid);
		driver.findElement(UserDirectoryPageLocator.FIRST_RESULT).click();
		CommonMethods.delay(2);
	}

	public static boolean userMatched(String emailid, String department) {
		boolean userInfoMatches = false;
		List<WebElement> list = driver.findElements(UserDirectoryPageLocator.GET_LISTOFUSERS);
		logger.info("" + list.size());

		for (int i = 0; i < list.size(); i++) {
			String userinfo = list.get(i).getText();
			if (userinfo.contains(emailid) && userinfo.contains(department)) {
				userInfoMatches = true;
			}
		}

		return userInfoMatches;
	}

	public static List<WebElement> getUserList() {
		logger.info("The of the userlist is - " + driver.findElements(UserDirectoryPageLocator.GET_LISTOFUSERS).size());
		return driver.findElements(UserDirectoryPageLocator.GET_LISTOFUSERS);
	}

	public static void clickActions(String useremail) {
		int itemNo = 0;
		String id = useremail.concat("-action-" + itemNo);
		driver.findElement(By.id(id)).click();
		CommonMethods.delay(2);
	}

	public static void clickDownload() {
		driver.findElement(UserDirectoryPageLocator.DOWNLOAD_ICON).click();
		CommonMethods.delay(2);
	}

	public static void clickPdf() {
		driver.findElement(UserDirectoryPageLocator.PDF_DOWNLOAD).click();
		CommonMethods.delay(3);
	}

	public static void clickCsv() {
		driver.findElement(UserDirectoryPageLocator.CSV_DOWNLOAD).click();
		CommonMethods.delay(4);
	}

	public static void clickAssignRole(String useremail) {
		clickActions(useremail);
		CommonMethods.delay(2);
		driver.findElement(UserDirectoryPageLocator.ASSIGN_ROLE).click();
		AssignRolePage.setDriver(UserDirectoryPage.getDriver());
	}

	public static void clickViewAccess(String useremail) {
		clickActions(useremail);
		CommonMethods.delay(2);
		driver.findElement(UserDirectoryPageLocator.VIEW_ACCESS).click();
		MyRolesPage.setDriver(UserDirectoryPage.getDriver());
		RolesDirectoryViewAccessPage.setDriver(UserDirectoryPage.getDriver());
	}

	public static void clickCancel() {
		driver.findElement(UserDirectoryPageLocator.DOWNLOAD_CANCEL).click();
	}

	public static void clickNonFedFilter() {
		driver.findElement(UserDirectoryPageLocator.NONFED_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickFedFilter() {
		driver.findElement(UserDirectoryPageLocator.FED_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickContractingOfficerFilter() {
		/*
		 * String roleFilterName = driver.findElement(UserDirectoryPageLocator.
		 * CONTRACTING_OFFICER_FILTER).getText(); logger.info(roleFilterName);
		 * if(!roleFilterName.equals("Contracting Officer")){//the locator must say
		 * contracting officer throw new IllegalArgumentException(); }
		 */
		driver.findElement(UserDirectoryPageLocator.CONTRACTING_OFFICER_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickAssistanceAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.ASSISTANCE_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickALGrandUserFilter() {
		driver.findElement(UserDirectoryPageLocator.AL_GRANDUSER_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickDRAFilter() {
		driver.findElement(UserDirectoryPageLocator.DRA_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickSAMPmoAdminAllDomainsFilter() {
		driver.findElement(UserDirectoryPageLocator.RA_FILTER_SAMPMOALLDOMAINS).click();
		CommonMethods.delay(2);
	}

	public static void clickAssistanceUserFilter() {
		driver.findElement(UserDirectoryPageLocator.ASSISTANCEUSER_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickFsdAgentFilter() {
		driver.findElement(UserDirectoryPageLocator.FSDAGENT_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickFsdAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.FSDADMIN_FILTER).click();
		CommonMethods.delay(2);

	}

	public static void clickAlertsAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.ALERTSADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickAgencyAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.AGENCYADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickCOAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.CO_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickOmbAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.OMB_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickDepartmentAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.DEPARTMENT_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickOfficeAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.OFFICE_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickSuperAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.SUPERADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickContractDataGrandUserFilter() {
		driver.findElement(UserDirectoryPageLocator.CONTRACTDATA_GRADUSER_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickContractOpportunitiesGrandUserFilter() {
		driver.findElement(UserDirectoryPageLocator.CONTRACTOPPORTUNITIES_GRADUSER_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickContractingSpecialistFilter() {
		driver.findElement(UserDirectoryPageLocator.CONTRACTING_SPECIALIST_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickDodAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.DOD_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickGSASecurityApproverFilter() {
		driver.findElement(UserDirectoryPageLocator.GSA_SECURITYAPPROVER_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickIAMadminFilter() {
		driver.findElement(UserDirectoryPageLocator.IAM_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickNasaAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.NASA_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickReportUserFilter() {
		driver.findElement(UserDirectoryPageLocator.REPORTUSER_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickSystemAccountAdminFilter() {
		driver.findElement(UserDirectoryPageLocator.SYSTEMACCOUNT_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickSystemManagerFilter() {
		driver.findElement(UserDirectoryPageLocator.SYSTEM_MANAGER_FILTER).click();
		CommonMethods.delay(2);

	}

	public static void clickOmbAnalystFilter() {
		driver.findElement(UserDirectoryPageLocator.OMB_ANALYST_FILTER).click();
		CommonMethods.delay(2);
	}

	// -----------role administration filters------
	public static void clickUserIAdministerFilter() {
		driver.findElement(UserDirectoryPageLocator.USER_I_ADMINSTER_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickUserWithNoRolesFilter() {
		driver.findElement(UserDirectoryPageLocator.USER_WITHNOROLES_FILTER).click();
		CommonMethods.delay(2);
	}

	// --------domain filters------------
	public static void clickAdminDomainFilter() {
		driver.findElement(UserDirectoryPageLocator.DOMAIN_ADMIN_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickAssitanceListingDomainFilter() {
		driver.findElement(UserDirectoryPageLocator.DOMAIN_AL_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickContractDataDomainFilter() {
		driver.findElement(UserDirectoryPageLocator.DOMAIN_CONTRACTDATA_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickContractOpportunitiesDomainFilter() {
		driver.findElement(UserDirectoryPageLocator.DOMAIN_CONTRACTOPPORTUNITIES_FILTER).click();
		CommonMethods.delay(2);

	}

	public static void clickFHdomainFilter() {
		driver.findElement(UserDirectoryPageLocator.DOMAIN_FH_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickReportingDomainFilter() {
		driver.findElement(UserDirectoryPageLocator.DOMAIN_REPORTING_FILTER).click();
		CommonMethods.delay(2);
	}

	public static void clickClearFilter() {
		driver.findElement(UserDirectoryPageLocator.CLEARFILTER).click();
		CommonMethods.delay(1);
	}

	public static void clickProvideFeedbackLink() {
		driver.findElement(UserDirectoryPageLocator.PROVIDEFEEDBACK_LINK).click();

	}

	public static void clickAdvancedInOrgPicker() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement elem = driver.findElement(UserDirectoryPageLocator.ORGPICKER_ADVANCED);
		// WebElement elem =
		// driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/div[1]/sam-agency-picker-v2/sam-label-wrapper/div/div[2]/a[1]"));

		boolean present = driver.findElement(UserDirectoryPageLocator.ORGPICKER_ADVANCED).isDisplayed();
		logger.info("boolean::::::" + present);
		Actions builder = new Actions(driver);

		//// *[@id="main-container"]/ng-component/page/div/div/div[2]/div[1]/sidebar/div[1]/sam-agency-picker-v2/sam-label-wrapper/div/div[2]/a[1]
		Actions builder1 = builder.moveToElement(elem).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).click();

		logger.info("Click ON ::::::" + present);
		builder1.build().perform();

		Thread.sleep(2000);

		/*
		 * * elem.sendKeys(Keys.TAB); elem.sendKeys(Keys.ENTER);
		 * 
		 * // driver.findElement(UserDirectoryPageLocator.ORGPICKER_ADVANCED).
		 * sendKeys(Keys.ENTER);
		 */
	}

	public static void clickSearchInOrgPicker() throws InterruptedException {
		driver.findElement(UserDirectoryPageLocator.SEARCH_ORGPICKER).click();
		CommonMethods.delay(2);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement elem = driver.findElement(UserDirectoryPageLocator.SEARCH_ORGPICKER);
		// WebElement elem =
		// driver.findElement(By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/div[1]/sam-agency-picker-v2/sam-label-wrapper/div/div[2]/a[1]"));
		Actions builder = new Actions(driver);

		//// *[@id="main-container"]/ng-component/page/div/div/div[2]/div[1]/sidebar/div[1]/sam-agency-picker-v2/sam-label-wrapper/div/div[2]/a[1]
		Actions builder1 = builder.moveToElement(elem).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).click();
		builder1.build().perform();

		Thread.sleep(2000);
	}

	public static List<WebElement> getPagination() {
		List<WebElement> pagination = driver.findElements(UserDirectoryPageLocator.PAGINATION);
		logger.info("The size of the pagination is -" + pagination.size());
		return pagination;
	}

	public static boolean userActionOptionsFound(String optionslookup) {
		boolean optionFound = false;
		List<WebElement> list = driver.findElements(UserDirectoryPageLocator.GET_LISTOFUSERACTIONS);
		for (int i = 0; i < list.size(); i++) {
			String options = list.get(i).getText().toLowerCase();
			if (options.contains(optionslookup.toLowerCase())) {
				optionFound = true;
			}
		}
		return optionFound;
	}

	public static boolean isClickable(WebElement webelement) {
		// logger.info(webelement.getText());

		if (webelement.getTagName().equals("a")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean elementFound(By locator) {
		try {
			driver.findElement(locator);
			return true;
		} catch (NoSuchElementException e) {
			logger.info("NoSuch Element found");
			return false;
		}
	}

	public static boolean isFilterSelected(By filterlocator) {
		return driver.findElement(filterlocator).isSelected();
	}

	public static void departmentSearch(String name) {
		driver.findElement(UserDirectoryPageLocator.DEPARTMENT_SEARCHBOX).sendKeys(name);
		CommonMethods.delay(1);
	}

	public static int suggestedOrgCount() {
		List<WebElement> list = driver.findElements(UserDirectoryPageLocator.DEPARTMENT_SUGGESTIONLIST);
		logger.info("Size of suggestion list is--" + list.size());
		return list.size();
	}

	public static String getFirstOrgFound() {
		return driver.findElement(UserDirectoryPageLocator.FIRST_ORG_RESULT).getText();
	}

	public static int getTotalNoOfPages() {
		String resultMessage = driver.findElement(UserDirectoryPageLocator.TOTAL_NO_OFRECORDS).getText();
		String[] bits = resultMessage.split(" ");
		int recordNo = Integer.parseInt(bits[bits.length - 2]);
		logger.info("The number of records found are - " + recordNo);
		int totalNoPages = noOfPageExpected(recordNo);
		logger.info("The number of pages found are - " + totalNoPages);
		return totalNoPages;
	}

	private static int noOfPageExpected(int totalNoOfRecords) {
		if (totalNoOfRecords <= 10) {
			return 0;
		} else if (totalNoOfRecords % 10 == 0) {
			return ((totalNoOfRecords / 10));
		} else {
			return ((totalNoOfRecords / 10) + 1);
		}
	}

	public static void clickPageNo(int pageno, int pageLimit) {
		List<WebElement> pagelist = getPagination();

		for (int i = 0; i < pageLimit && pagelist.size() > 1; i++) {
			if (Integer.parseInt(pagelist.get(i).getText()) == pageno) {
				logger.info("Text from the pagebutton - " + pagelist.get(i).getText());
				pagelist.get(i).click();
				CommonMethods.delay(3);
				break;
			}
		}
	}

	private UserDirectoryPage() {

	}

	// *****************************************************************************
	// driver getter and setter
	// *****************************************************************************
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		UserDirectoryPage.driver = driver;
	}

	public static void typeInOrgPicker(String orgsearchterm) {
		driver.findElement(UserDirectoryPageLocator.ORG_PICKER).sendKeys(orgsearchterm);
		CommonMethods.delay(2);

	}

	public static void searchUserInUserPicker(String user) {
		driver.findElement(UserDirectoryPageLocator.USER_PICKER_BAR).sendKeys(user);
		CommonMethods.delay(1);
		driver.findElement(UserDirectoryPageLocator.FIRST_RESULT).click();
		CommonMethods.delay(1);
	}

	public static void clickViewAccessOnly(String useremail) {
		clickActions(useremail);
		CommonMethods.delay(3); //
		driver.findElement(By.xpath(
				"//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/results/div[3]/div[1]/sam-actions-dropdown/div/ul/li/button/span[2]"))
				.click();
		CommonMethods.delay(2);
		MyRolesPage.setDriver(UserDirectoryPage.getDriver());
		RolesDirectoryViewAccessPage.setDriver(UserDirectoryPage.getDriver());
	}

	public static int getCurrentSelectedPage() {
		List<WebElement> pages = driver.findElements(UserDirectoryPageLocator.PAGINATION);
		for (int i = 0; i < pages.size(); i++) {
			if (pages.get(i).getAttribute("aria-label").equals("current")) {
				return i;
			}
		}
		return 0;
	}

	public static boolean userPickerAllUsersContainsThisSearchTerm(String searchterm) {
		driver.findElement(UserDirectoryPageLocator.USER_PICKER_BAR).sendKeys(searchterm);
		CommonMethods.delay(1);
		List<WebElement> listofusers = driver.findElements(By.className("secondary-value"));
		logger.info("The size of the list of users --- " + listofusers.size());
		boolean allTrue = false;
		int counter = 0;
		for (int i = 0; i < listofusers.size(); i++) {
			String user = listofusers.get(i).getText().toLowerCase();
			logger.info("The text for username is -- " + user);
			if (user.contains(searchterm.toLowerCase())) {
				counter++;
			}
		}
		if ((listofusers.size() == counter) && (counter != 0)) {
			allTrue = true;
		}
		return allTrue;

	}

	public static boolean orgPickerAllOrgsContainsThisSearchTermAndOrgName(String searchterm, String org) {
		driver.findElement(UserDirectoryPageLocator.ORG_PICKER).sendKeys(searchterm);
		CommonMethods.delay(1);
		List<WebElement> listoforgs = driver.findElements(By.className("multiple-values"));
		logger.info("The size of the list of orgs --- " + listoforgs.size());
		boolean allTrue = false;
		int counter = 0;
		for (int i = 0; i < listoforgs.size(); i++) {
			String orgdetails = listoforgs.get(i).getText().toLowerCase();
			logger.info("The text for orgname is -- " + orgdetails);
			if ((orgdetails.contains(searchterm.toLowerCase())) && (orgdetails.contains(org.toLowerCase()))) {
				counter++;
			}
		}
		if ((listoforgs.size() == counter) && (counter != 0)) {
			allTrue = true;
		}
		return allTrue;

	}

	public static void selectOrgInOrgPicker(String orgname) {
		driver.findElement(UserDirectoryPageLocator.ORG_PICKER).sendKeys(orgname);
		CommonMethods.delay(2);
		List<WebElement> listoforgs = driver.findElements(By.className("multiple-values"));
		listoforgs.get(0).click();
		CommonMethods.delay(2);
	}

	public static void clickOrgTypeWhereUsersHaveRoles() {
		driver.findElement(UserDirectoryPageLocator.ORG_PICKER_FILTER_WHERE_USERS_HAVE_ROLES).click();
		CommonMethods.delay(1);
		
	}

	public static String getNoResultsmessageFound() {
		return driver.findElement(UserDirectoryPageLocator.NO_RESULTS_MESSAGE).getText();

	}

}
