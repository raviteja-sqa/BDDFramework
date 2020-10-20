package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/ravitejaburugupalli/LearnBitch/FreeCRMBDDFramework/src/main/java/Feature/deals.feature"
		,glue = {"NewStepDefinitions"}, // path of step definition file
		plugin= {"pretty", "html:target/cucumber-html-report", "json:json_output/cucumber.json", "junit: junit_xml/cucumber.xml"},
		dryRun = true, // checks if mapping is proper between feature and step definitions
		monochrome = true, // beautifies output
		strict = true// test fails if undefined/pending steps are there,
		)

public class TestRunner {

}

// OR tags = {"@SmokeTest, @RegressionTest"}
// AND tags = {"@SmokeTest", "@RegressionTest"}
// Ignore tags = {"~@SmokeTest", "~@RegressionTest"}
