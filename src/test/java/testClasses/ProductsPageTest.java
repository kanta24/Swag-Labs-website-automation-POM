package testClasses;

import model.CommonMethods;
import model.TimeOut;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.input.Input;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class ProductsPageTest extends LoginTest{
        CommonMethods cm;
        TimeOut waitTime = new TimeOut();
    @Test(priority = 2)
    public void clickOnAddToCart() throws InterruptedException {

        ChromeDriver driver = getDriver();
        cm = new CommonMethods(driver);
        ProductsPage clickOnAddCart = new ProductsPage(driver);

        System.out.println("Start of products Feature");
        clickOnAddCart.getProductByList();
        waitTime.timeOut(3000);
        System.out.println("End of products Feature");
    }
}