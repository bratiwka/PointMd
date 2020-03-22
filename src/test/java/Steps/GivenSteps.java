package Steps;

import Pages.PointPage;
import io.cucumber.java.en.Given;

public class GivenSteps {


    @Given("Enter on the main Page")
    public void givenIAmOnTheMainPage() throws InterruptedException {
        Thread.sleep(4000);

    }
}