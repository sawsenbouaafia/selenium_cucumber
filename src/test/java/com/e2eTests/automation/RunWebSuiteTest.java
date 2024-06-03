package com.e2eTests.automation;

import org.junit.runner.RunWith;
/**
 * The Test Runner File uses the @RunWith() Annotation from JUnit for executing
 * tests.
 */

import io.cucumber.junit.Cucumber;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

/**
 * The @CucumberOptions Annotation is used to define the location of feature
 * files, step definitions, reporting integration.
 */

@CucumberOptions (
		features = {"src/spec/features"},
		plugin = {"pretty","html:target/Cucumber-report.html"},
		tags = ("@login"),
		//glue = {"step_definitions"},
		monochrome = false,
		snippets = CAMELCASE
		
		)
/**
 * This class is used to run the test, which is a JUnit Test Runner Class
 * containing the Step Definition location and the other primary metadata
 * required to run the test.
 */

public class RunWebSuiteTest {

}
