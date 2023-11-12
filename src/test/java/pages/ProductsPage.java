package pages;

import basePackage.BaseClass;
import model.CommonMethods;
import model.LoginPageLocator;
import model.ProductsPageLocator;
import model.TimeOut;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import testData.Values;

import java.util.List;

public class ProductsPage extends BaseClass{
    ChromeDriver driver;
    CommonMethods cm;
    Values td = new Values();


    public ProductsPage(ChromeDriver driver){
        this.driver = driver;
        cm = new CommonMethods(driver);
    }

    public void getProductByList(){
        cm.getElementsList(ProductsPageLocator.productBy,ProductsPageLocator.allProductName,td.productName,ProductsPageLocator.addToCart);
    }


}
