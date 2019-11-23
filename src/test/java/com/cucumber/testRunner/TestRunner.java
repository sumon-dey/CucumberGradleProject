/*Cucumber and CucumberExtentReport Demo*/
package com.cucumber.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles", glue = {
		"com.cucumber" }, monochrome = true, dryRun = false, strict = false, plugin = {
				"pretty:target/cucumber-pretty-report", "html:target/cucumber-html-report",
				"junit:target/cucumber-junit-report/cucumber-results.xml",
				"json:target/cucumber-json-report/cucumber.json",
				"usage:target/cucumber-usage-report/cucumber-usage.json" }, tags = {
						"@ThirdApplicationFeature" }, junit = "--step-notifications")

// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-extent-report/report.html"

// tags = {"@Scenario1","@Scenario2"} -> AND
// tags = {"@Scenario1 and @Scenario2"} -> AND

// tags = {"@Scenario1,@Scenario2"} -> OR
// tags = {"@Scenario1 or @Scenario2"} -> OR

// tags = {"~@Scenario1"} -> NOT
// tags = {"not @Scenario1"} -> NOT

public class TestRunner {

	/*
	 * @AfterClass public static void writeExtentReport() {
	 * Reporter.loadXMLConfig(new File("./configs/extent-config.xml"));
	 * 
	 * Reporter.setSystemInfo("user", System.getProperty("user.name"));
	 * Reporter.setSystemInfo("os", "Mac OSX");
	 * Reporter.setTestRunnerOutput("Sample test runner output message");
	 * 
	 * }
	 */

}
