package Pages.page2;

import Utility.TestBase;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class facebookpage extends TestBase {
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "email")
    public WebElement emailinput;
    @FindBy(id = "pass")
    public WebElement passinput;
    @FindBy(id = "u_0_b")
    public WebElement click;
    @FindBy(xpath = "//span[contains(text(),'Log In as Mavlida Mardan')]")
    public WebElement Actual;
}
