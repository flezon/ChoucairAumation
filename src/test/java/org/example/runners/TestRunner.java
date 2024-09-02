package org.example.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/hiringProcess.feature",
        glue = "org.example.stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
        tags = "@hiringProcess"
)
public class TestRunner {
}
