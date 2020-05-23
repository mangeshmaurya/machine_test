package com.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\com\\test\\feature"}, glue = {"com.test.steps"}, plugin = {"pretty", "html:src/test/reports", "json:target/cucumber.json"})
public class TestRunner {
}
