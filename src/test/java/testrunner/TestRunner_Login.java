package testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".\\Features\\customers.feature",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		
)
public class TestRunner_Login {

}
