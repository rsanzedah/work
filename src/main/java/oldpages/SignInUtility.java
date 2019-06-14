package oldpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import gov.gsa.sam.rms.login.gov.pages.SigninPage;
//im/port gov.gsa.sam.rms.pages.HomePage;

//import gov.gsa.sam.rms.stepdefinition.LoginStep;

public class SignInUtility {
	
	private static Logger logger = LoggerFactory.getLogger(SignInUtility.class);
	public static void signIntoCommonWorkspacePage(String userEmail, String userPassword) throws Exception {
		LaunchBrowserUtil.openThisBrowser();
		LaunchBrowserUtil.enterUrl(Constants2.ACTIVE_ENV_URL);
		HomePage.setDriver(LaunchBrowserUtil.getDriver());
		HomePage.clickNavSignIn();
		HomePage.acceptGovPolicyPopup();
		HomePage.enterUserNamePasswordAndClickSignIn(userEmail, userPassword);
		CommonMethods.delay(17);
		LaunchBrowserUtil.captureOTPfromGsaEmail(Constants2.GMAIL_USERNAME);
		HomePage.enterOtpAndSubmit();
		MyWorkspacePage.setDriver(LaunchBrowserUtil.getDriver());
		CommonMethods.delay(2);

		 MyWorkspacePage.getDriver().navigate().refresh();
		MyWorkspacePage.clickSignInButton();

		CommonMethods.delay(11);
	}

	public static void signIntoCommonWorkspacePageNonFed(String userEmail, String userPassword)
			throws InterruptedException {
		LaunchBrowserUtil.openThisBrowser();
		LaunchBrowserUtil.enterUrl(Constants2.ACTIVE_ENV_URL);
		HomePage.setDriver(LaunchBrowserUtil.getDriver());
		HomePage.clickNavSignIn();
		HomePage.acceptGovPolicyPopup();
		HomePage.enterUserNamePasswordAndClickSignIn(userEmail, userPassword);
		CommonMethods.delay(22);
		//LaunchBrowserUtil.captureOTPfromGsaEmailNonFed(Constants.GMAIL_NONFED);
		HomePage.enterOtpAndSubmit();
		MyWorkspacePage.setDriver(LaunchBrowserUtil.getDriver());
		CommonMethods.delay(2);
	}

	public static void signIntoCommonWorkspaceWithLoginDotGov(String username, String password, String secretkey) {
		LaunchBrowserUtil.openThisBrowser();
		 LaunchBrowserUtil.enterUrl(Constants2.LOGINGOV_HOME_PAGE);
		MyWorkspacePage.setDriver(LaunchBrowserUtil.getDriver());
		MyWorkspacePage.clickSignInButton();
		MyWorkspacePage.clickAcceptOnBanner();
		SigninPage.setDriver(LaunchBrowserUtil.getDriver());
		CommonMethods.delay(4);

		CommonMethods.delay(2);
		SigninPage.enterEmailAddress(username);
		CommonMethods.delay(2);
		SigninPage.enterPassword(password);
		CommonMethods.delay(2);
		//SigninPage.clickSignInButton();
		SigninPage.clickNextButton();
		CommonMethods.delay(2);
		String otp = LaunchBrowserUtil.getOtp(username,secretkey);
		CommonMethods.delay(2);
		SigninPage.enterOtp(otp);
		CommonMethods.delay(2);
		SigninPage.clickSubmit();
		CommonMethods.delay(3);
	}

	public static void signIntoWorkspace(String username, String password, String secretkey, String usertype)
			throws Exception {// if no secret key, user Constants.NO_SECRET_KEY
		
	
		if ((Constants2.ACTIVE_ENV_URL.equals(Constants2.COMP_HOME_PAGE)
				|| Constants2.ACTIVE_ENV_URL.equals(Constants2.MINC_HOME_PAGE))
				&& (usertype.equals(Constants2.USER_FED))) {
			SignInUtility.signIntoCommonWorkspacePage(username, password);
		} else if ((Constants2.ACTIVE_ENV_URL.equals(Constants2.COMP_HOME_PAGE)
				|| Constants2.ACTIVE_ENV_URL.equals(Constants2.MINC_HOME_PAGE))
				&& (usertype.equals(Constants2.USER_NONFED))) {
			logger.info("Nonfed user signin---------");
			SignInUtility.signIntoCommonWorkspacePageNonFed(username, password);
		} else if (Constants2.ACTIVE_ENV_URL.equals(Constants2.LOGINGOV_HOME_PAGE)) {
			logger.info("Login.gov signin---------");
			SignInUtility.signIntoCommonWorkspaceWithLoginDotGov(username, password, secretkey);
		}
	}

}