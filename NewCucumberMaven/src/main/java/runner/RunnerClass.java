package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "/Users/Deth/Desktop/Selenium/Selenium_Workspace/NewCucumberMaven/src/main/java/feature/login.feature",
	glue = {"stepdefinition"}	
)
public class RunnerClass {

	
}
