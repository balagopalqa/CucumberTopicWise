package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/appFeatures" },
glue= {"stepDefinition"},
tags="@new1",
plugin ={"pretty"},
monochrome = true)
public class MyTestRunner {

}
