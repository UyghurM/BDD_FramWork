package StepDefinitions.User2;

import Utility.TestBase;
import io.cucumber.java.en.When;

public class feature3 extends TestBase {

    @When("user prints hello")
    public void user_prints_hello() {
        System.out.println("Hello Mavluda");
    }

}
