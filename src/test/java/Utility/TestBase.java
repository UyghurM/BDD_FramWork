package Utility;

import io.cucumber.core.api.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected  static WebDriver driver;
    protected  static WebDriverWait wait;
    protected  static Actions act;


    public static void BeforeScenario(){
        driver = Driver.driver();
        wait = new WebDriverWait(driver,10);
        act = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to( ConfigReader.get("website") ); // web addres s from config

    }

    public static void AfterScenario(Scenario result){

        if( result.isFailed() )
            result.embed( ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES) ,"image/png" );

        driver.quit();
    }


}
