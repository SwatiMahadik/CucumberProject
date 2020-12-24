package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
 features= "C:\\Users\\d963073\\SimpleCucumberAutomationFramework\\src\\main\\java\\Features"
		 ,glue={"StepDefinitions"},
		 monochrome=true,
		 dryRun=false,
		plugin = { "pretty", "html:target/cucumber-reports" },
		tags={"@smoke"}


)
public class TestRunner {

}
