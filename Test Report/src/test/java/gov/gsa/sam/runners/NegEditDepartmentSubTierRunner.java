package gov.gsa.sam.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(dryRun = false, features = { "src/test/resources/features/NegEditDepartmentSubTier.feature" }, 
tags = {"@NegEditDepartmentSubTier" },

//tags = {"@otp , @EmptySuperAdmineditDepartment , @SignOut, @otp , @EmptySuperAdmineditDepartment1 , @SignOut, @otp , @requiredField, @SignOut, @otp , @RequiredAgency,  @SignOut, @otp , @RequiredCGAC,  @SignOut, @otp , @CGACANumb, @SignOut, @otp ,	@RequiredCGACANumb  @SignOut , @otp , @DateField, @SignOut , @otp , @EmptySuperAdmineditDepartment , @SignOut , @otp, @EndDate, @SignOut, @otp1, @SubTierDateField, @SignOut,  @otp1, @EmptySuperAdmineditSubTier" },
plugin = { "pretty", "html:target/CucumberHooks.html" }, glue = {"gov.gsa.sam.stepdefinition"})

public class NegEditDepartmentSubTierRunner {

}
