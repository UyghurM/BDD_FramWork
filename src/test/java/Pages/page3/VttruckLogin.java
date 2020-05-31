package Pages.page3;

import Utility.TestBase;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VttruckLogin extends TestBase {


{
    PageFactory.initElements(driver, this);
}

@FindBy(id = "prependedInput")
public  WebElement username;

@FindBy(id = "prependedInput2")
    public WebElement passinput;

@FindBy (id = "_submit")
    public WebElement click;


}
