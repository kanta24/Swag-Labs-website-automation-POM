package testClasses;

import model.CommonMethods;
import model.TimeOut;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LogoutPage;

public class LogoutTest extends ConfirmationTest{

    CommonMethods cm;
    TimeOut waitTime = new TimeOut();
    @Test(priority = 6)
    public void logoutFromSystem() throws InterruptedException{

        ChromeDriver driver = getDriver();
        cm = new CommonMethods(driver);
        LogoutPage logout = new LogoutPage(driver);

        System.out.println("Start of logout page");
        logout.menuButtonClick();
        waitTime.timeOut(3000);
        logout.logoutButtonClick();
        waitTime.timeOut(3000);
        System.out.println("End of logout page");
    }
}