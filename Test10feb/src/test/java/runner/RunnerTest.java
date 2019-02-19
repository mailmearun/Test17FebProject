package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
       
        features = {"src/test/resources/Features"},
        glue = {"stepdefs"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-report/Extent.html" }
		)

public class RunnerTest extends AbstractTestNGCucumberTests
{

}
