package gov.gsa.sam.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(dryRun = false, features = { "src/test/resources/features/negCreateDepartSubTierscenarios.feature" }, 
tags = {"@errorScenario1"},

//tags = {SignOut , @otp , @DateField, @SignOut , @otp , @EmptySuperAdmineditDepartment , @SignOut , @otp, @EndDate, @SignOut, @otp1, @SubTierDateField, @SignOut,  @otp1, @EmptySuperAdmineditSubTier" },
plugin = { "pretty", "html:target/CucumberHooks.html" }, 
glue = {"gov.gsa.sam.stepdefinition"})


public class NegCreateDepartSubTierscenariosRunner {

}
