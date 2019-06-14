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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gov.gsa.sam.base.FileReaderManager;
//import gov.gsa.sam.base.WebDriverManager;
import gov.gsa.sam.utils.Constants;
import net.thucydides.core.annotations.Managed;
import gov.gsa.sam.locators.Locators;
import gov.gsa.sam.locators.DepartmentLocators;
import gov.gsa.sam.locators.GlossaryPageLocators;
import gov.gsa.sam.locators.HomePageLocator;
import gov.gsa.sam.locators.SubTierLocators;
import gov.gsa.sam.locators.VideoLocators;

public class VideoStepdef {

	@Managed
	public static WebDriver driver;
	public static WebDriverWait wait;
	private static Logger logger = LoggerFactory.getLogger(VideoStepdef.class);
	
	GlossaryPageLocators CmsLocators = new GlossaryPageLocators();


	/*@Given("^Launch video browser$")

	public static void launch_browser_video() {

		driver = WebDriverManager.getDriver();
		System.out.println("launch method complted");

	}*/
	

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@And("^The user enters video environment (\\w+)$")
	public static void the_user_enters_a_URL_video(String urlConstant) throws InterruptedException {
		System.out.println("****COMP_HOME_PAGE. driver::"+driver);
		//driver.get("https://55samfrontendcomp.apps.prod-iae.bsp.gsa.gov/");
		
		System.out.println("One::" + urlConstant);
		//login.user_enters_environment(urlConstant,driver);
		
		System.out.println("HI::" + urlConstant);
		String url = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(urlConstant);
		driver.navigate().to(url);
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);

	}

	@And("^The user click on video sign in link$")
	public void the_user_click_on_sign_in_link_video() throws InterruptedException {
		logger.info("Click on sign in click");
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(HomePageLocator.navBarSignIn).click();
	}

	@And("^Then click on video accept button$")
	public void then_click_accept_button_video() throws InterruptedException {
		logger.info("Then click on accept button");
		TimeUnit.SECONDS.sleep(3);
		WebElement elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON);
		Actions builder3 = new Actions(driver);
		Actions seriesOfActions3 = builder3.moveToElement(elt3).click();
		seriesOfActions3.sendKeys(Keys.ENTER);
		seriesOfActions3.perform();
		Thread.sleep(1400);
	}

	@And("^The user enters the email id video (\\w+)$")
	public void the_user_enters_the_email_id_video(String userName) throws Throwable {

		TimeUnit.SECONDS.sleep(3);
		 String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(userName);
		 driver.findElement(HomePageLocator.emailPlaceHolder).sendKeys(emailID);
		TimeUnit.SECONDS.sleep(3);
		logger.info("Username entered --  " + emailID);

	}

	@And("^The user enters the password video (\\w+)$")
	public void the_user_enters_video_the_password(String password) {
		String password1 = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(password);
		driver.findElement(HomePageLocator.signInPasswordPlaceHolder).sendKeys(password1);

	}

	@And("^The user click on video sign in button$")
	public void the_user_click_on_video_sign_in_butto() {
		driver.findElement(HomePageLocator.dropdownSignInButton).click();

	}

	@And("^The user want to receive your video one time password (\\w+)$")
	public void the_user_want_to_receive_video_your_one_time_password(String myEmailId) throws InterruptedException {
		TimeUnit.SECONDS.sleep(8);
		((JavascriptExecutor) driver).executeScript("window.open('https://mail.google.com/mail/#inbox')");
		driver.navigate();
		ArrayList<String> tab_handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab_handles.get(tab_handles.size() - 1));
		String emailID = FileReaderManager.getInstance().getConfigFileReader().getPropertyValue(myEmailId);
		//String emailID = "shanthi.dutta@gsa.gov";
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

	
	 /* @And("^The user clicks on password submit button$") public void
	  the_user_clicks_on_video_password_submit_button() {
	  
	  }
	 */
	@And("^The user enters one time access code video$")
	public void the_user_enters_video_one_time_access_code() {
		driver.findElement(HomePageLocator.OTP_PLACEHOLDER).sendKeys(Constants.OTP);
		System.out.println("Constants.OTP:::::" + Constants.OTP);

	}

	@And("^The user click on one time submit button video$")
	public void the_user_click_on_video_one_time_submit_button() {
		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
		System.out.println("user click on sumit button");
	}
	
	
	@And("^The user click on video one time submit button$")
	public void the_user_click_on_one_time_submit_button1() {
		// otp.the_user_click_on_one_time_submit_button();

		driver.findElement(HomePageLocator.SUBMIT_BUTTON).click();
		// driver.navigate().refresh();

		logger.info("Successfull otp");

	}


	@Given("^The user click on go to video link$")
	public void the_user_click_on_video_go_to_videos_link() throws InterruptedException {
		logger.info("User enter CMS page");
		TimeUnit.SECONDS.sleep(3);
		((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
		driver.findElement(CmsLocators.clickVideosLink).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("User click on CMS video page");
	}

	@And("^The user navigate to video page$")
	public void the_user_navigate_video_to_videos_page() throws InterruptedException {
		/*String breadCrumbs1 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a"))
				.getText();
		System.out.println("breadCrumbs:::" + breadCrumbs1);
		Assert.assertEquals(breadCrumbs1, "Workspace");
		String breadCrumbs2 = driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/span"))
				.getText();
		System.out.println("Release Notes2:::" + breadCrumbs2);
		Assert.assertEquals(breadCrumbs2, "Videos");*/
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String breadCrumbs1 = driver.findElement(GlossaryPageLocators.breadCrumbs1).getText();
		logger.info("breadCrumbs:::" + breadCrumbs1);
		Assert.assertEquals(breadCrumbs1, "Workspace");
		String breadCrumbs2 = driver.findElement(GlossaryPageLocators.breadCrumbs2).getText();
		logger.info("breadCrumbs2:::" + breadCrumbs2);
		Assert.assertEquals(breadCrumbs2, "Videos");

	}
	
	@Given("^The user click on new video$")
	public void the_user_click_on_new_video(){
		driver.findElement(VideoLocators.newVideo).click();
	}
	@And("^The users enter title$")
	public void the_users_enter_title(){
		double val = Math.random();
		driver.findElement(VideoLocators.title).sendKeys("Test"+val);	
	}
	@And("^The users enter description$")
	public void the_users_enter_description(){
	    driver.findElement(VideoLocators.description).sendKeys("Hi");	
	}
	@And("^The users select video$")
	public void the_users_select_video() throws InterruptedException{
		
		//driver.findElement(VideoLocators.selectVideo).sendKeys("C:/Users/Public/Videos/Sample Videos/Wildlife.mp4");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement elt = driver.findElement(VideoLocators.selectVideo);
		 Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
				//sendKeys("C:/Users/Public/Videos/Sample Videos/Wildlife.mp4");		
		seriesOfActions.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@And("^The users select caption$")
	public void the_users_select_caption() throws InterruptedException{
		//driver.findElement(VideoLocators.selectCaption).sendKeys("C:/Users/Public/Videos/Sample Videos/WebVTT.vtt");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement elt = driver.findElement(VideoLocators.selectCaption);
		 Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(elt).click();
				//sendKeys("C:/Users/Public/Videos/Sample Videos/WebVTT.vtt");		
		seriesOfActions.perform();
		Thread.sleep(1400);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@And("^The users click on done button$")
	public void the_users_click_on_done_button(){
		driver.findElement(VideoLocators.clickDone).click();
		
	}
	
	@Given("^Video created browser sign out$")
	public void Video_created_browser_sign_out() throws Throwable{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"headerIconProfile\"]/i"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header-link-signout\"]"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
