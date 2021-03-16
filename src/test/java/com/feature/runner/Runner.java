package com.feature.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		//strict=false,
		monochrome=true,
		features= {"src/test/resources"},
		glue = {"com.feature.testcases"},
		plugin = {
				"pretty",
				"html:target/site/html-report.html",
				"json:target/cucumber1.json"
		}
)
public class Runner extends AbstractTestNGCucumberTests{
	
}