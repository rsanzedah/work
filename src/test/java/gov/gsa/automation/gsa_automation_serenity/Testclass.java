/*
 * package gov.gsa.automation.gsa_automation_serenity;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.Keys; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * import net.thucydides.core.annotations.Managed; import cucumber.api.Scenario;
 * import cucumber.api.java.Before; import cucumber.api.java.en.And; import
 * cucumber.api.java.en.Given; import locators.HomePageLocator;
 * 
 * 
 * public class Testclass {
 * 
 * Scenario scenario;
 * 
 * @Managed
 * 
 * WebDriver driver;
 * 
 * @Before({"@Registration"}) public void setUp(Scenario scenario){
 * System.out.println("****Before******"+scenario.getName()); }
 * 
 * @Given("^The user enters environment glossary COMP_HOME_PAGE$") public void
 * method1() throws Throwable{ System.out.println("****COMP_HOME_PAGE");
 * driver.get("https://55samfrontendcomp.apps.prod-iae.bsp.gsa.gov/");
 * 
 * }
 * 
 * @And("^The user click on glossary sign in link$") public void
 * the_user_click_on_sign_in_link1() throws InterruptedException { //
 * otp.the_user_click_on_sign_in_link();
 * 
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * driver.findElement(HomePageLocator.navBarSignIn).click();
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); }
 * 
 * @And("^Then click on glossary accept button$") public void
 * then_click_accept_button1() throws InterruptedException { //
 * otp.then_click_accept_button();
 * 
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); WebElement
 * elt3 = driver.findElement(HomePageLocator.POPUP_SUBMIT_BUTTON); Actions
 * builder3 = new Actions(driver); Actions seriesOfActions3 =
 * builder3.moveToElement(elt3).click(); seriesOfActions3.sendKeys(Keys.ENTER);
 * seriesOfActions3.perform(); Thread.sleep(1400); }
 * 
 * }
 */