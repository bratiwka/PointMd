package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class WhenSteps {


    @When("On the right side of screen click \"Banca Nationala\"")
    public void whenClickOnTheRightSideOfScreen() throws InterruptedException {
        //PointPage.clickMenuButton();
        Thread.sleep(1000);
    }

    @And("Change \"BNM\" to Moldinconbank")
    public void whenChangeBNMtoMoldin() throws InterruptedException {
        //PointPage.clickMenuButton();
        Thread.sleep(1000);
    }

    @And("Click to input money value")
    public void whenClickToInputMoneyValue() throws InterruptedException {
        //PointPage.clickMenuButton();
        Thread.sleep(1000);
    }
}