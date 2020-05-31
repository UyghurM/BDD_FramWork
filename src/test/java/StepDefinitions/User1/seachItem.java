package StepDefinitions.User1;

import Pages.page1.GooglePage;
import Utility.ConfigReader;
import Utility.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class seachItem extends TestBase {

    GooglePage google = new GooglePage();

    @When("user enters Apple in search goes")
    public void user_enters_Apple_in_search_goes() throws Exception{
       google.SearchBox.sendKeys("Apple Computer" + Keys.ENTER);
       Thread.sleep(3000);
    }

    @Then("reloads google and enters {string}")
    public void reloads_google_and_enters(String string) {
        driver.get(ConfigReader.get("website"));
        google.SearchBox.sendKeys("Samsung Laptop"+Keys.ENTER);
    }

    @When("user enters motorolla in search goes")
    public void user_enters_motorolla_in_search_goes() {

    }

}
