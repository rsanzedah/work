package gov.gsa.sam.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(dryRun = false, features = {"src/test/resources/features/createOffice.feature" },
tags ={"@office"},
plugin = { "pretty", "html:target/CucumberHooks.html" },
glue = {"gov.gsa.sam.stepdefinition"})


public class CreateOfficeRunner {

}
