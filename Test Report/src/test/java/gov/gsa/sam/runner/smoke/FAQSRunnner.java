package gov.gsa.sam.runner.smoke;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(dryRun = false, features = { "src/test/resources/smoke_features/faqs.feature" },
		// tags = {"@otp , @faq, @faqsSignout "},
		tags = { "@FAQS" },
        //tags = { "@learMore, @browserClose, @otp1, @faq2, @draft, @faqsSignout, @learMore1, @otp, @faq2, @draftToPublish, @faqsSignout, @learMore3"},
		plugin = { "pretty", "html:target/CucumberHooks.html" }, glue = { "gov.gsa.sam.stepdefinition" })

public class FAQSRunnner {

}
