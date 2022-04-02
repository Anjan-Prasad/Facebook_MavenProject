package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue = {"com.facebook.stepDefination"},
		tags= "@Facebook",
		monochrome = true,dryRun=false
		)

public class LoginTestRunner {
			
}


