package pages;

import basePackage.BaseClass;
import model.CheckoutPageLocator;
import model.CommonMethods;
import model.ConfirmationPageLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ConfirmationPage {
    ChromeDriver driver;
    CommonMethods cm;

    public ConfirmationPage(ChromeDriver driver) {
        this.driver = driver;
        cm = new CommonMethods(driver);
    }


    public void testConfirmationMessage() {
        String confirmMessage = cm.getLocatorText(ConfirmationPageLocator.confirmationMsg);
        Assert.assertTrue(confirmMessage.equalsIgnoreCase(ConfirmationPageLocator.confirmMsgShowing));


    }
    public void goToHomePage(){
        cm.clickOnButton(ConfirmationPageLocator.backToHome);
    }
}
