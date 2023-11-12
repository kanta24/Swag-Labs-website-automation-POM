package pages;

import basePackage.BaseClass;
import model.CartPageLocator;
import model.CommonMethods;
import model.ProductsPageLocator;
import model.TimeOut;
import org.openqa.selenium.chrome.ChromeDriver;
import testData.Values;

public class CartPage {
    ChromeDriver driver;
    CommonMethods cm;
    TimeOut waitTime = new TimeOut();
    Values td = new Values();

    public CartPage(ChromeDriver driver){
        this.driver = driver;
        cm = new CommonMethods(driver);

    }

    public void clickOnCartIcon(){
        cm.clickOnButton(CartPageLocator.cartIcon);
    }
    public void productDisplayVerification(){
        cm.verifyProductDisplay(CartPageLocator.allProductName,td.productName);
    }
    public void checkoutBtn(){
        cm.clickOnButton(CartPageLocator.checkOutBtn);
    }


}
