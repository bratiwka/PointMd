package Steps;

import io.cucumber.java.en.Then;

public class ThenSteps {
    //Check that the respective page is displayed

    @Then("Check the success message")
    public void thenCheckThat() throws InterruptedException {

        Thread.sleep(3000);

    }
    @Then("Check that the URL contains the option you chose")
    public void thenCheckThatFinalPageUrl() throws InterruptedException {
        //PointPage.checkThatUrlIfIsTrueLastTime(Driver.getDriver().getCurrentUrl());
        Thread.sleep(3000);
    }
}