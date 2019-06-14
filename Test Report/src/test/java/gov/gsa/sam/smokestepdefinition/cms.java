package gov.gsa.sam.smokestepdefinition;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gov.gsa.sam.base.FileReaderManager;
//import gov.gsa.sam.base.LoginStepDef;
//import gov.gsa.sam.base.WebDriverManager;
import net.thucydides.core.annotations.Managed;

public class cms {
	//@Managed
	public static WebDriver driver;
	Scenario scenario;
	//LoginStepDef login =  new LoginStepDef();
	private static Logger logger = LoggerFactory.getLogger(cms.class);

	/*@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}
*/
	@Given("^Launch browser$")
	public static void launch_browser1() {
		// Otpclass.launch_browser();
		logger.info("start");
		//driver = WebDriverManager.getDriver();
		logger.info("launch method complted");
	}

	
	@And("^The user enters environment (\\w+)$")
	public void the_user_enters_environment_department(String urlConstant) throws Throwable {
		/*System.out.println("One::" + urlConstant);
		login.user_enters_environment(urlConstant,driver);*/
	}

	@And("^The user click on sign in link$")
	public void the_user_click_on_sign_in_link1() throws InterruptedException {
		/*login.user_click_on_signin_link(driver);*/
	}

	@And("^click on accept button$")
	public void then_click_accept_button1() throws InterruptedException {
		//login.user_click_accept_button(driver);
	}

	@And("^The user enters the email id (\\w+)$")
	public void the_user_enters_the_email_id1(String userName) throws Throwable {
	//	login.user_enters_the_email_id(userName, driver);
	}

	@And("^The user enters the password (\\w+)$")
	public void the_user_enters_the_password1(String password) {
		//login.user_enters_the_password(password, driver);
	}

	@And("^The user click on sign in button$")
	public void the_user_click_on_sign_in_button1() {
		//login.user_click_on_sign_in_button(driver);
	}

	@And("^The user want to receive your one time password (\\w+)$")
	public void the_user_want_to_receive_your_one_time_password1(String myEmailId) throws InterruptedException {
		//login.user_want_to_receive_your_one_time_password(myEmailId,driver);
	}

	@And("^user enters one time code$")
	public void the_user_enters_one_time_access_code1() {
		//login.user_enters_one_time_access_code(driver);
	}

	@And("^click on one time submit button$")
	public void the_user_click_on_one_time_submit_button1() {
		//login.user_click_on_one_time_submit_button(driver);
		logger.info("Successfull otp");
	}
}
