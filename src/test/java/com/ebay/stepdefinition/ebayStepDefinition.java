package com.ebay.stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Browser.BasePage;
import com.Browser.CartPage;
import com.Browser.HomePage;
import com.Browser.ItemPage;

import static org.junit.Assert.assertTrue;

	public class ebayStepDefinition {

	    WebDriver driver;
	    BasePage basepage;
	    HomePage homePage;
	    ItemPage itemPage;
	    CartPage cartPage;

	    @Given("^Open browser$")
	    public void open_browser() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Given("^Navigate to ebay.com$")
	    public void navigate_to_ebay_com() {
	        driver.get("https://www.ebay.com");
	    }

	    @When("^Search for 'book'$")
	    public void search_for_book() {
	        homePage = new HomePage(driver);
	        homePage.enterSearchTerm("book");
	        homePage.clickSearchButton();
	    }

	    @When("^Click on the first book in the list$")
	    public void click_on_first_book() {
	        homePage.clickFirstItem();
	        itemPage = new ItemPage(driver);
	    }

	    @When("^Click on 'Add to cart'$")
	    public void click_on_add_to_cart() {
	        itemPage.clickAddToCart();
	    }

	    @Then("^Verify the cart has been updated and displays the number of items in the cart$")
	    public void verify_cart_updated() {
	        itemPage.clickCart();
	        cartPage = new CartPage(driver);
	        String cartCount = cartPage.getCartItemCount();
	        assertTrue("Cart item count should be greater than 0", Integer.parseInt(cartCount) > 0);
	        driver.quit();
	    }
	}

