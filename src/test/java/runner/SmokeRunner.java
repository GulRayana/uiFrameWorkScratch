package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

features = "src/main/resources/Features",
glue = "steps",
tags = "@smoke",
dryRun = true,
monochrome = true,
publish = true,
plugin = {
        "pretty",
        "hml:target/default-cucumber-reports",
        "json:target/cucumber.json"
}
)
class SmokeRunner {
}
