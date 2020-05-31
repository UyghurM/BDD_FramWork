package Pages.page1;

import Utility.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends TestBase {

    {

        PageFactory.initElements(driver, this);
    }  // this MUST be included in every single classes in "Pages"Package


    @FindBy(xpath = "//input[@name='q']")
    public WebElement SearchBox;



}
