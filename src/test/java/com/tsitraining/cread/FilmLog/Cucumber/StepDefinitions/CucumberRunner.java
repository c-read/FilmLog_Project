package com.tsitraining.cread.FilmLog.Cucumber.StepDefinitions;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
        glue={"StepDefinitions"})

public class CucumberRunner
{

}
