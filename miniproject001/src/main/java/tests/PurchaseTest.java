package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.PlaceOrderPage;

public class PurchaseTest {

    WebDriver driver;

    @Test
    public void testRedirectToPlaceOrderWindow() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        CartPage cartPage = new CartPage(driver);
        cartPage.clickPlaceOrderButton();

        Assert.assertTrue(driver.getTitle().contains("Place Order"), "Place order page should open");

        driver.quit();
    }

    @Test
    public void testUserDetailsOnPlaceOrderPage() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        CartPage cartPage = new CartPage(driver);
        cartPage.clickPlaceOrderButton();

        PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);
        Assert.assertTrue(placeOrderPage.getNameField().isDisplayed(), "Name field should be visible");
        Assert.assertTrue(placeOrderPage.getCountryField().isDisplayed(), "Country field should be visible");

        driver.quit();
    }

    @Test
    public void testCompletePurchase() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        CartPage cartPage = new CartPage(driver);
        cartPage.clickPlaceOrderButton();

        PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);
        placeOrderPage.enterName("ajay");
        placeOrderPage.enterCountry("INDIA");
        placeOrderPage.enterCity("MUMBAI");
        placeOrderPage.enterCardDetails("12345678901456", "42", "2027");
        placeOrderPage.clickPurchaseButton();

        Assert.assertTrue(driver.getPageSource().contains("Thank you for your purchase"), "Purchase should be confirmed");

        driver.quit();
    }
}

