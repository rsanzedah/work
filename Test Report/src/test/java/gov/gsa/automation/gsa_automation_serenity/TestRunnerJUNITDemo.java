package gov.gsa.automation.gsa_automation_serenity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(CucumberWithSerenity.class)
// @RunWith(SerenityRunner.class)
@CucumberOptions(plugin = { "pretty", "html:target/CucumberHooks.html" }, tags = {
		"@Registration,@Registration1" }, features = "src/test/resources/hooksDemo.feature")
public class TestRunnerJUNITDemo {

	/*
	 * @Managed WebDriver driver;
	 */

	/*
	 * @Test public void openGoogle(){
	 * System.out.println("openGoogle------------------------");
	 * System.out.println(System.getProperty("webdriver.base.url")+
	 * "............."); driver.get("http://www.google.com"); //driver.close();
	 * }
	 */

}
