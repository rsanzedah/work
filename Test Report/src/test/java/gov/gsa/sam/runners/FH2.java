package gov.gsa.sam.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(dryRun = false, 
features = {
		"src/test/resources/features/createDepartment.feature",
		"src/test/resources/features/negCreateDepartSubTierscenarios.feature",
		"src/test/resources/features/NegEditDepartmentSubTier.feature",
		"src/test/resources/features/negRequestOffice.feature"}, 
		plugin ={"pretty", "html:target/cucumber-html-report", "pretty:target/cucumber-pretty.txt", "json:target/cucumber-usage.json","junit:target/cucumber-results.xml","html:target/CucumberHooks.html" },
		glue = { "gov.gsa.sam.stepdefinition" })

public class FH2 {

}
