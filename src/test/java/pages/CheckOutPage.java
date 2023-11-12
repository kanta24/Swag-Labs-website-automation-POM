package pages;

import basePackage.BaseClass;
import model.CartPageLocator;
import model.CheckoutPageLocator;
import model.CommonMethods;
import model.LoginPageLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import testData.Values;

public class CheckOutPage {
    ChromeDriver driver;
    CommonMethods cm;
    Values td = new Values();

    public CheckOutPage(ChromeDriver driver){
        this.driver = driver;
        cm = new CommonMethods(driver);
    }


    public void userFNameInp(){
        cm.setText(CheckoutPageLocator.userFName, td.Fname);
    }
    public void userLNameInp(){
        cm.setText(CheckoutPageLocator.userLName, td.Lname);
    }
    public void zipCodeInp(){
        cm.setText(CheckoutPageLocator.userZipCode, td.zipCode);
    }
    public void clickOnContinueBtn(){
        cm.clickOnButton(CheckoutPageLocator.continueBtn);
    }
    public void clickOnFinishBtn(){
        cm.clickOnButton(CheckoutPageLocator.FinishBtn);
    }

}
