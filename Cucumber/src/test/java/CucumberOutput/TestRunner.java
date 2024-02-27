package CucumberOutput;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features" ,
		glue = "stepDefinition", stepNotifications = true ,
		tags = "@Amazon"
		)

public class TestRunner {

}
