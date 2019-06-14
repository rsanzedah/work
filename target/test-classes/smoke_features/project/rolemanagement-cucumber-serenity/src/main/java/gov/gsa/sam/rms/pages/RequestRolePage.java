package gov.gsa.sam.rms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.LoggerFactory;

import gov.gsa.sam.rms.locators.RequestRolePageLocator;
import gov.gsa.sam.rms.utilities.CommonMethods;
import gov.gsa.sam.rms.utilities.Constants;

public class RequestRolePage {
	private static WebDriver driver;
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(RequestRolePage.class);

	private RequestRolePage() {
	}

	// *****************************************************************************
	// the following methods describe actions that can be taken immediately on
	// loading of this Page
	// *****************************************************************************
	public static void writeSupervisorName(String name) {
		driver.findElement(RequestRolePageLocator.SUPERVISOR_NAME_TEXTBOX).sendKeys(name);
	}

	public static void writeSupervisorEmail(String email) {
		driver.findElement(RequestRolePageLocator.SUPERVISOR_EMAIL_TEXTBOX).sendKeys(email);
	}

	public static void writeComment(String comment) {
		driver.findElement(RequestRolePageLocator.COMMENT_TEXTBOX).sendKeys(comment);
		CommonMethods.delay(3);
	}

	public static void clickSubmit() {
		driver.findElement(RequestRolePageLocator.SUBMIT_BUTTON).click();
		MyRolesPage.setDriver(RequestRolePage.getDriver());
		CommonMethods.delay(4);
	}

	public static void clickDomainDropdown() {
		CommonMethods.delay(Constants.SECONDS);
		driver.findElement(RequestRolePageLocator.DOMAINDROPDOWN_ICON).click();
	}

	public static void clickPendingRoleRequest() {
		driver.findElement(RequestRolePageLocator.PENDING_REQUESTS).click();
		CommonMethods.delay(1);
	}

	public static void clickPending() {
		driver.findElement(RequestRolePageLocator.PENDING).click();
		RoleRequestPendingPage.setDriver(driver);
		CommonMethods.delay(1);

	}

	public static boolean selectRoleIfFound(String roleName) {
		boolean roleFound = false;
		Select role = new Select(driver.findElement(RequestRolePageLocator.ROLE_SELECTOR));

		try {
			role.selectByVisibleText(roleName);
			roleFound = true;
		} catch (NoSuchElementException e) {

			return roleFound;
		}
		return roleFound;

	}

	public static boolean selectDomainIfFound(String domainName) {
		boolean domainFound = false;
		clickDomainDropdown();
		List<WebElement> domain = driver.findElements(RequestRolePageLocator.DOMAIN_SELECTOR);
		logger.info(("The size of the list is......" + domain.size()));

		for (int i = 0; i < domain.size(); i++) {
			WebElement currentDomain = domain.get(i);
			logger.info(currentDomain.getText());
			if (domainName.equals(currentDomain.getText())) {
				domainFound = true;
				currentDomain.click();
				return domainFound;
			}
		}
		return domainFound;
	}

	public static boolean selectOrgIfFound(String orgName) {
		boolean orgFound = false;
		driver.findElement(RequestRolePageLocator.ORGPICKER_TEXTAREA).sendKeys(orgName);
		List<WebElement> orgList = driver.findElements(RequestRolePageLocator.ORG_SELECTOR);
		logger.info(("The size of the list is......" + orgList.size()));
		WebElement firstOrg = orgList.get(0);
		logger.info("*****************the text from first org is*****" + firstOrg.getText());
		if (firstOrg.getText().toLowerCase().contains(orgName.toLowerCase())) {
			orgList.get(0).click();
			CommonMethods.delay(3);
			orgFound = true;
		}
		return orgFound;
	}

	public static boolean validateOrgSuggestionContainsGivenWord(String search, String givenWord) {
		boolean allOrgsContainsGivenWord = true;
		driver.findElement(RequestRolePageLocator.ORGPICKER_TEXTAREA).sendKeys(search);
		List<WebElement> orgList = driver.findElements(RequestRolePageLocator.ORG_SELECTOR);
		logger.info(("The size of the list is......" + orgList.size()));

		WebElement firstOrg = orgList.get(0);
		logger.info("*****************the text from first org is*****" + firstOrg.getText());

		for (WebElement org : orgList) {
			logger.info(org.getText());
			if (org.getText().contains(givenWord) == false) {
				allOrgsContainsGivenWord = false;
			}
		}
		return allOrgsContainsGivenWord;
	}

	// *****************************************************************************
	// the following methods describe actions that are only available after some
	// previous actions were taken on this SAME page.
	// *****************************************************************************

	// *****************************************************************************
	// driver getter and setter & private methods
	// *****************************************************************************
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		RequestRolePage.driver = driver;
	}

	public static boolean elementFound(By locator) {
		try {
			driver.findElement(locator);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}


}