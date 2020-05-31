package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "",
        features = {"src/test/resources/Features/feature3"},
        glue = {"src/test/java/StepDefinitions/vytruk"},
        dryRun = false
)




public class VytruckRunner {
}
