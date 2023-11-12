package testClasses;

import model.TimeOut;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CartPage;

public class AddtoCartTest extends ProductsPageTest{
    TimeOut waitTime = new TimeOut();
    @Test(priority = 3)
    public void clickOnCartBtn() {

        ChromeDriver driver = getDriver();
        CartPage addToCart = new CartPage(driver);

        System.out.println("Start of Addtocart Feature");
        addToCart.clickOnCartIcon();
        addToCart.productDisplayVerification();
        waitTime.timeOut(10000);
        addToCart.checkoutBtn();
        waitTime.timeOut(3000);
        System.out.println("Start of Addtocart Feature");
    }
}