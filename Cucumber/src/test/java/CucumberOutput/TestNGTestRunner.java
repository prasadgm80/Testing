package CucumberOutput;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features" ,
		glue = "stepDefinition",
		tags = "@Selenium"
		)

public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
