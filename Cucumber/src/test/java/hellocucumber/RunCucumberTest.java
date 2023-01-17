package hellocucumber;


import org.junit.runner.RunWith;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {".//resources/opencart/Features.feature"},
        glue="StepDefinitions",
        dryRun = true,
        monochrome = true,
        plugin = {"pretty"}
)


class RunCucumber{
        }
