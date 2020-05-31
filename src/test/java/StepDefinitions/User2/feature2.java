package StepDefinitions.User2;

import Utility.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class feature2 extends TestBase {

    @When("user goes to amazon website")
    public void user_goes_to_amazon_website() {
        driver.get("https://www.amazon.com");
    }

    @Then("closes the browser")
    public void closes_the_browser() throws Exception{
        Thread.sleep(3000);
    }

}
