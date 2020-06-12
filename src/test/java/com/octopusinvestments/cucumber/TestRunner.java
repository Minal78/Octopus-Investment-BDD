package com.octopusinvestments.cucumber;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = ".",
        tags = "@Smoke,@Sanity"
)

public class TestRunner {
}
