package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/feature1",  // linked to the "featture1" directory
        glue = "StepDefinitions",
        dryRun = false,  // when dry run is false, the classes insetfefinition will run
        tags = "@test1",
        plugin = {
                "json:target/Reports/JSON/cucumber.json",
                "html:target/Reports/HTML/default-html-reports",
                "junit:target/Reports/JUNIT/MyJunit.xml",
                "pretty:target/Reports/Pretty/Myprestty.txt"
        }
)
public class CuckesRunner1 {


        
}
