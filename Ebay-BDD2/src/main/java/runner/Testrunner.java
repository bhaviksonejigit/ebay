package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\\\QA\\\\SeleniumWorkSpace\\\\Ebay-BDD\\\\src\\\\main\\\\java\\\\features\\\\login.feature",
		glue={"stepDefinition"},
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true
		)

public class Testrunner {

}
