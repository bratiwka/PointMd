package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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