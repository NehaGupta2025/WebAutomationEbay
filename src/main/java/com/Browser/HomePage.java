package com.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    WebDriver driver;

    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

   
    private By searchBox = By.id("gh-ac");
    private By searchButton = By.id("gh-btn");
    private By firstItem = By.cssSelector(".s-item:first-child");

   
    public void enterSearchTerm(String term) {
        WebElement searchField = driver.findElement(searchBox);
        searchField.clear();
        searchField.sendKeys(term);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void clickFirstItem() {
        driver.findElement(firstItem).click();
    }
}
