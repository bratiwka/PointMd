package Pages;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.concurrent.TimeUnit;


public class PointPage {

    private static String URL = "https://point.md/ru/";

    @FindBy(xpath = "//span[@id='money-widget-exchange-filters-banks-selected']")
    private static WebElement bancaNationalaAMoldovei;

    @FindBy(xpath = "//li[@data-id='C445B505B2554F318E4024EBFF0BE3D1']")
    private static WebElement selectMoldinconbank;

    @FindBy(xpath = "//input[@id='money-input-mdl']")
    private static WebElement inputMoneyValueMDL;
    @FindBy(xpath = "//input[@id='money-input-ron']")
    private static WebElement getValueFromRON;






    public static void clickToSelectBancaNationala(){
        bancaNationalaAMoldovei.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public static void clickToSelectMoldinconBank(){
        selectMoldinconbank.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }
    public static String mdl = "5000";
    public static void clickToInputMoneyValueMDL(){
        inputMoneyValueMDL.sendKeys(mdl);
        Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @Test
    public static void ExchangeTest(String mdl){
        double num = Double.parseDouble(mdl);
        double num2 = Double.parseDouble(getValueFromRON.getText());
        if(num2 != (num/3.84)){

        }else{
            System.out.println("Done");
        }
    }



    public static void startPage(){
        PageFactory.initElements(Driver.getDriver(), PointPage.class);
        Driver.getDriver().get(URL);

    }

    public PointPage() {
    }




    public static void setURL(String URL) {
        PointPage.URL = URL;
    }
    public static String getURL() {
        return URL;
    }


}
