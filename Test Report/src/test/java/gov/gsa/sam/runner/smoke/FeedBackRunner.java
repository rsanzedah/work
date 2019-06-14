package gov.gsa.sam.runner.smoke;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(dryRun = false, 
features = {"src/test/resources/smoke_features/feedback.feature"}, 
tags = {"@FeedBack" },
//tags = {"@otp , @createDepartment , @createSubTier , @editButton , 	@activeSubTier , @subTierEdit2 " },
plugin = {"pretty", "html:target/cucumber-html-report", "pretty:target/cucumber-pretty.txt", "json:target/cucumber-usage.json","junit:target/cucumber-results.xml","html:target/CucumberHooks.html" },
glue = { "gov.gsa.sam.stepdefinition" })

public class FeedBackRunner {

}
