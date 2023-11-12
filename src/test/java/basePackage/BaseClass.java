package basePackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseClass {
    public static ChromeDriver driver;

    @BeforeTest
    public ChromeDriver driverInitialize(){

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        return driver;
    }

    public static ChromeDriver getDriver() {
        return driver;
    }


    @AfterTest
    public void teardown(){
        driver.quit();

    }

}
