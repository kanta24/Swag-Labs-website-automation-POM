package testClasses;

import model.TimeOut;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CheckOutPage;

public class CheckoutTest extends AddtoCartTest{

    TimeOut waitTime = new TimeOut();
    @Test(priority = 4)
    public void checkOut() {

        ChromeDriver driver = getDriver();
        CheckOutPage checkout = new CheckOutPage(driver);

        System.out.println("Start of Checkout Feature");
        checkout.userFNameInp();
        checkout.userLNameInp();
        checkout.zipCodeInp();
        waitTime.timeOut(5000);
        checkout.clickOnContinueBtn();
        waitTime.timeOut(5000);
        checkout.clickOnFinishBtn();
        waitTime.timeOut(5000);
        System.out.println("Start of Checkout Feature");
    }
}