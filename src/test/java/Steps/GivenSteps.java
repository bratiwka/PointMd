package Steps;

import Pages.PointPage;
import Pages.YoutubePage;
import cucumber.api.java.en.Given;

public class GivenSteps {


    @Given("Enter on the main Page")
    public void givenIAmOnTheMainPage() throws InterruptedException {
        PointPage.startPage();
        Thread.sleep(10000);

    }

    @Given("Go to YouTubePage")
    public void givenPageofYouTube() throws InterruptedException {
        YoutubePage.startPage();
        Thread.sleep(10000);

    }
}