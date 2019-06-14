package gov.gsa.sam.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		dryRun = false,
		features= {"src/test/resources/features/video.feature"},
		//tags = {"@otpVideo, @videos, @newVideos"},
		tags = {"@Videos "},
        //plugin = {"pretty", "html:target/cucumber","json:target/cucumber/cucumber.json", "junit:target/cucumber.xml"},
	    plugin = {"pretty", "html:target/cucumber-html-report", "pretty:target/cucumber-pretty.txt", "json:target/cucumber-usage.json","junit:target/cucumber-results.xml" },
        glue={"gov.gsa.sam.stepdefinition"})

public class VideoRunner  {

}
