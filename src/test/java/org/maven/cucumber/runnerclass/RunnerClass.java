package org.maven.cucumber.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\java\\org\\maven\\cucumber\\feature\\"},glue= {"org.maven.cucumber.stepdefinition"})

public class RunnerClass {

}
