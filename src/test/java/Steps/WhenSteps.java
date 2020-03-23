package Steps;

import Pages.PointPage;
import Pages.YoutubePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class WhenSteps {


    @When("On the right side of screen click \"Banca Nationala\"")
    public void whenClickOnTheRightSideOfScreen() throws InterruptedException {
        PointPage.clickToSelectBancaNationala();
        Thread.sleep(3000);
    }

    @And("Change \"BNM\" to Moldinconbank")
    public void whenChangeBNMtoMoldin() throws InterruptedException {
        PointPage.clickToSelectMoldinconBank();
        Thread.sleep(3000);
    }

    @And("Click to input money value")
    public void whenClickToInputMoneyValue() throws InterruptedException {
        PointPage.clickToInputMoneyValueMDL(5000);
        PointPage.ExchangeTest(5000);
        Thread.sleep(3000);
    }






    @And("Click to v Trende")
    public void whenClickToVTrendeYoutube() throws InterruptedException {
        YoutubePage.clickToSelectVtrende();
        Thread.sleep(3000);
    }
}