package StepDefinitions;

import Utility.TestBase;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class  hooks extends TestBase {

    // YOU DO NOT Touch THOSE

    @Before
    public void setup01(){
        BeforeScenario();

    }


    @After
    public void end(Scenario result){

        AfterScenario(result);

    }




}
