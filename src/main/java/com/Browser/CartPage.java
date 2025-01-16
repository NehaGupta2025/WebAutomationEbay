package com.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cartItemCount = By.cssSelector(".gh-cart-status strong");

     public String getCartItemCount() {
        return driver.findElement(cartItemCount).getText();
    }
}
