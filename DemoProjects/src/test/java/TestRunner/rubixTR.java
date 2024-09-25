package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java" }, glue = { "StepDefinitions" }, 
				plugin = { "pretty","html:target/report/cucumber.html", "json:target/report/cucumber.json" }, 
				monochrome = true)

public class rubixTR {
	  
}
