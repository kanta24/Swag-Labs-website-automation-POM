package testClasses;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ConfirmationPage;

public class ConfirmationTest extends CheckoutTest {
    @Test(priority = 5)
    public void confirmation() throws InterruptedException{

        ChromeDriver driver = getDriver();
        ConfirmationPage confirmation = new ConfirmationPage(driver);

        System.out.println("Start of Confirmation feature");
        confirmation.testConfirmationMessage();
        confirmation.goToHomePage();
        System.out.println("End of Confirmation feature");

    }
}