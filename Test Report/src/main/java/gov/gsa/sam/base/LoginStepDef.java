/*package gov.gsa.sam.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
//import gov.gsa.sam.locators.*;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.utils.Constants;
import net.thucydides.core.annotations.Managed;

public class LoginStepDef {
	//@Managed
	//public static WebDriver driver;
  Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(LoginStepDef.class);

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	public void user_enters_environment(String urlConstant, WebDriver driver) throws Throwable {
		System.out.println("TWO:" + urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		logger.info("url12345678:"+ url +" driver::"+driver);
		driver.navigate().to(url);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//TimeUnit.SECONDS.sleep(3);
		//logger.info("url"+ scenario);
	}

	public void user_click_on_signin_link(WebDriver driver) throws InterruptedException {
		//Thread.sleep(2000);
		TimeUnit.SECONDS.sleep(30);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(HomePageLocator.navBarSignIn).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void user_click_accept_button(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	public void user_enters_the_email_id(String userName,WebDriver driver) throws Throwable {
		logger.info("Username entered123 --  " + userName);
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		logger.info("Username entered11111111111111111111111 -- " + emailID);
		driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("emailID"+ scenario);
	}

	public void user_enters_the_password(String password,WebDriver driver) {
		 String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
			driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);
			logger.info("password"+ scenario);
		//driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys("Test@12345@12345");
	}

	public void user_click_on_sign_in_button(WebDriver driver) {
		driver.findElement(HomePageLocator.dropdownSignInButton).click();
	}

	public void user_want_to_receive_your_one_time_password(String myEmailId,WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open('https://mail.google.com/mail/#inbox')");
		ArrayList<String> tab_handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 1));
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(myEmailId);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(emailID);
		//driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shanthi.dutta@gsa.gov");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		TimeUnit.SECONDS.sleep(40);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> lastMail = driver.findElements(By.className("zA"));// want
		logger.info("The size of the element: " + lastMail.size());
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(lastMail.get(0)).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Constants.OTP = driver.findElement(Locators.iaeOtp).getText().substring(30, 38);
		logger.info("The captured OTP is- " + Constants.OTP);
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 2));
		logger.info("myEmailId"+ scenario);
	}

	public void user_enters_one_time_access_code(WebDriver driver) {
		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		logger.info("Constants.OTP:::::" + Constants.OTP);
		logger.info("OTP"+ scenario);
	}

	public void user_click_on_one_time_submit_button(WebDriver driver) {
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
		logger.info("Successfull otp"+ scenario);
	}

}
*/