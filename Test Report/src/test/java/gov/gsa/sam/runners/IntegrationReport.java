package gov.gsa.sam.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(dryRun = false, 
//features = {"src/test/resources/features/"},
features = {"src/test/resources/features/createDepartment.feature",
		// "src/test/resources/features/createOffice.feature",
		 "src/test/resources/features/LoginDepartmentSubTierOfficeAdmin.feature",
		 "src/test/resources/features/glossary.feature",
		 "src/test/resources/features/negCreateDepartSubTierscenarios.feature",
		 "src/test/resources/features/NegEditDepartmentSubTier.feature",
		 //"src/test/resources/features/officeExceptionHandling.feature", 
		 "src/test/resources/features/ReleaseNotes.feature",
		 "src/test/resources/features/faqs.feature"
		// "src/test/resources/features/video.feature" 
		 }, 
		 
	tags = {"@DepartmentCreatede ,@editDepartmentSubTier,@glossary, @errorScenario1,@NegEditDepartmentSubTier,@Release, @otp, @FAQs, @newFAQs, @published, @draft, @draftToPublish, @publishedToArchived, @archivedTounarchive, @draftToPublished"} ,
//plugin ={ "pretty", "html:target/CucumberHooks.html" }, 
			plugin = {"pretty", "html:target/cucumber-html-report", "pretty:target/cucumber-pretty.txt", "json:target/cucumber-usage.json","junit:target/cucumber-results.xml","html:target/CucumberHooks.html" },
	glue = { "gov.gsa.sam.stepdefinition"})

public class IntegrationReport {

}
