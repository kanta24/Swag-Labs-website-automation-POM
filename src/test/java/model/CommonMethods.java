package model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CommonMethods {
    ChromeDriver driver;

    public CommonMethods(ChromeDriver driver){
        this.driver = driver;
    }

    public void setText(By fieldText, String inputText){
        driver.findElement(fieldText).sendKeys(inputText);
    }

    public void keyboardAction(By fieldText, Keys keys, Keys keys1){
        driver.findElement(fieldText).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
    }

    public void clickOnButton(By btnLocator){
        driver.findElement(btnLocator).click();
    }

    public void clickOnField(By btnLocator){
        driver.findElement(btnLocator).click();
    }

    public String getLocatorText(By elementsLocator){
        String text = driver.findElement(elementsLocator).getText();
        return text;
    }

//    public void getElementsList(By elementsLocator,String text){
//        List<WebElement> listItems = driver.findElements(elementsLocator);
//        for(WebElement elementLists : listItems){
//            if (elementLists.getText().equals(text)){
//                elementLists.click();
//                break;
//            }
//
//        }

    public void getElementsList(By elementsLocator, By nameOfProduct, String text, By addCart){
            List<WebElement> products = driver.findElements(elementsLocator);
            WebElement prod = null;

            for (WebElement product : products) {
                WebElement productNameElement = product.findElement(nameOfProduct);
                String productNameText = productNameElement.getText();

                if (productNameText.equals(text)) {
                    prod = product;
                    break;
                }
            }

            if (prod != null) {
                prod.findElement(addCart).click();
            }
        }

        public void verifyProductDisplay(By itemName,String text){
            List<WebElement> cartProducts = driver.findElements(itemName);
            boolean match = false;

            for (WebElement cartProduct : cartProducts) {
                if (cartProduct.getText().equalsIgnoreCase(text)) {
                    match = true;
                    break; // Exit the loop as soon as a match is found
                }
            }

            Assert.assertTrue(match);

        }

    public void scrollToParticularElement(By elementLocator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elementLocator);

    }
    public void scrollUpTop(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -250);");
    }








}




