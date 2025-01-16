package com.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage {
    WebDriver driver;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addToCartButton = By.id("atcRedesignId_btn");
    private By cartButton = By.id("gh-cart");

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void clickCart() {
        driver.findElement(cartButton).click();
    }
}
