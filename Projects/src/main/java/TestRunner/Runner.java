package TestRunner;


import io.cucumber.testng.CucumberOptions;

@RunWith()
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
plugin = { "pretty",
		"html:target/report/cucumber.html", "json:target/report/cucumber.json" },
monochrome=true)
public class Runner {

}
