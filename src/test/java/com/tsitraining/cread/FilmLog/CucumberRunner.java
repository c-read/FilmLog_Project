package com.tsitraining.cread.FilmLog;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Cucumber"},
        glue={"classpath:src/test/com/tsitraining/cread/FilmLog"})

public class CucumberRunner
{

}
