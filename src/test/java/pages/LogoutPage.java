package pages;

import basePackage.BaseClass;
import model.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {
    ChromeDriver driver;
    CommonMethods cm;
    TimeOut waitTime = new TimeOut();


    public LogoutPage(ChromeDriver driver) {
        this.driver = driver;
        cm = new CommonMethods(driver);
    }
    public void viewMenuBtn(){
        cm.scrollUpTop();
    }
    public void menuButtonClick() {
        cm.clickOnButton(LogoutPageLocator.menuBtn);
    }

    public void logoutButtonClick() {
        cm.clickOnField(LogoutPageLocator.logoutBtn);
    }
}