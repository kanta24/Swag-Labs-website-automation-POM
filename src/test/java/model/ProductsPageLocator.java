package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPageLocator {
    public static By productBy = By.cssSelector(".inventory_item");
    public static By allProductName = By.cssSelector(".inventory_item_name");
    public static By addToCart = By.id("add-to-cart-sauce-labs-bike-light");

}

