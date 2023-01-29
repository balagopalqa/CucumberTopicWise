package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/appFeatures2/Login2.feature" },
glue= {"stepDefinition"},
tags="not @regression ",
plugin ={"pretty"},
monochrome = true)
public class MyTestRunner {

}
