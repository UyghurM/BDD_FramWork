package StepDefinitions.vytruk;

import Pages.page3.VttruckLogin;
import Utility.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginAsStoremanager extends TestBase {

    VttruckLogin l=new VttruckLogin();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        driver.get("https://qa2.vytrack.com/");
    }

    @Then("user Enters {string} and {string}")
    public void user_Enters_and(String string, String string2) {
       l.username.sendKeys(string);
       l.passinput.sendKeys(string2);
    }

    @Then("click on login button")
    public void click_on_login_button() {
        l.click.click();
    }

    @Then("user on homepage")
    public void user_on_homepage() {
       driver.getTitle();
    }

}