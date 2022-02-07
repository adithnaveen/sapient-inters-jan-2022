package com.bdd.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources"}, 
		glue = {"com.naveen.step"}, 
		monochrome = true, 
		plugin = {"pretty", "html:target/html-reports.html", "json:target/api-report.json"} 
//		tags = "not @register"
		)
public class CucumberTestRunner {

	// you cannot have any business logic 
}
