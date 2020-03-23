package Steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Driver;

public class BeforeAfterSteps {


    @Before
    public void before(){
        Driver.startDriver();
    }

    @After
    public void after(){
        Driver.quit();
    }


}