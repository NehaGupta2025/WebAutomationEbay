package com.ebay.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/java/com/ebay/feature/ebay.feature"}, 
    glue = {"com.ebay.stepdefinition","Hooks.java"}, 
    plugin = {"pretty", "html:target/cucumber-reports.html"} 
				)

public class runner {

}





