package testClasses;

import basePackage.BaseClass;
import model.TimeOut;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseClass{
    TimeOut waitTime = new TimeOut();

    @Test(priority = 1)
    public void loginIntoSystem() {

        ChromeDriver driver = getDriver();
        LoginPage login = new LoginPage(driver);

        System.out.println("Start of Login Feature");
        login.userNameInp();
        login.userPassInp();
        login.clickOnLoginBtn();
        waitTime.timeOut(3000);
        System.out.println("End of Login Feature");
    }
}