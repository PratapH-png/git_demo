package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features/" }, 
glue = { "StepDefination" }, 
tags= ("@Regression"),
plugin = { "pretty",
		"html:target/report/cucumber.html", "json:target/report/cucumber.json" }, 
dryRun = false, 
monochrome = true
)
public class runner {

}
