package Pages;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Test;
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
    @FindBy(xpath = "//td[@class='money-widget-exchange-table-tbody-item-calculator']//input[@data-currency='ron']")
    private static WebElement getValueFromRON;
    @FindBy(xpath = "//td[@id='money-trade-buy-ron']")
    private static WebElement getRON;




    public static void clickToSelectBancaNationala(){
        System.out.println(getValueFromRON.getText());
        bancaNationalaAMoldovei.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public static void clickToSelectMoldinconBank(){
        selectMoldinconbank.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }


    public static void clickToInputMoneyValueMDL(double mdl){
        inputMoneyValueMDL.sendKeys(String.valueOf(mdl));
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public static void ExchangeTest(double actualResult){
        System.out.println(getValueFromRON.getText());
        double num2 = Double.parseDouble(getValueFromRON.getText());

        Assert.assertEquals(num2,actualResult/Double.parseDouble(getRON.getText()));
    }



    public static void startPage(){
        PageFactory.initElements(Driver.getDriver(), PointPage.class);
        Driver.getDriver().get(URL);

    }





    public static void setURL(String URL) {
        PointPage.URL = URL;
    }
    public static String getURL() {
        return URL;
    }


}
