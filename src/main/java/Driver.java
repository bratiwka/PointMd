import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    public static void startDriver(){
        System.setProperty("webdriver.chrome.driver",
                "D:\\chromedriver.exe");


        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }


    public static WebDriver getDriver(){
        return driver;
    }


    public static void quit(){
        driver.quit();
    }

}
