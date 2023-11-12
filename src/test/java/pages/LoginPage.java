package pages;

import basePackage.BaseClass;
import model.CommonMethods;
import model.LoginPageLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import testData.Values;

public class LoginPage extends BaseClass{
    ChromeDriver driver;
    CommonMethods cm;
    Values td = new Values();


    public LoginPage(ChromeDriver driver){
        this.driver = driver;
        cm = new CommonMethods(driver);

    }

//    public String homePageUrl(){
//        return LoginPageLocator.pageUrl;
//    }

    public void userNameInp(){
        cm.setText(LoginPageLocator.userName, td.userName);
    }
    public void userPassInp(){
        cm.setText(LoginPageLocator.userPassword, td.password);
    }
    public void clickOnLoginBtn(){
        cm.clickOnButton(LoginPageLocator.loginBtn);
    }

}
