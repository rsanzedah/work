package runner;




import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty" },
features = "src/main/java/feature", tags = { "@Login","@1"})
public class CucumberTestSuite {
	// "@RoleMigration","@3"
}


