package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:/VScode-Projects/ebay-cucumber/cucumber-ebay/src/test/resources/Feature.feature",
    glue = "stepDefinations"
)

public class testRunner {
    
}
