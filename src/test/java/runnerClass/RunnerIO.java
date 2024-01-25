package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = ".\\src\\test\\java\\featurefiles\\Login.feature",
		glue = "stepDefinations",
		dryRun = false
		
		         )

public class RunnerIO extends AbstractTestNGCucumberTests
{

}
