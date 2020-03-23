package Pages;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.concurrent.TimeUnit;


public class YoutubePage {

    private static String URL = "https://www.gismeteo.md/";

    @FindBy(xpath = "//input[@id='js-search']")
    private static WebElement selectVTrende;




    public static void clickToSelectVtrende(){
        selectVTrende.sendKeys("ZAEBALA");

        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }





    public static void startPage(){
        PageFactory.initElements(Driver.getDriver(), YoutubePage.class);
        Driver.getDriver().get(URL);

    }



    public static void setURL(String URL) {
        YoutubePage.URL = URL;
    }
    public static String getURL() {
        return URL;
    }


}
