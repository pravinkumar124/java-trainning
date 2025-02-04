package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class CartTest {

    WebDriver driver;

    @Test
    public void testDeleteItemFromCart() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickPhonesCategory();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickDeleteButton();

        Assert.assertTrue(driver.getPageSource().contains("Your cart is empty"), "The cart should be empty after deletion");

        driver.quit();
    }

    @Test
    public void testCartTotalCalculation() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickPhonesCategory();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickPlaceOrderButton();

        Assert.assertTrue(driver.getPageSource().contains("Total price"), "Total price should be displayed");

        driver.quit();
    }

    @Test
    public void testClearCart() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickPhonesCategory();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickPlaceOrderButton();
        cartPage.clickDeleteButton();

        Assert.assertTrue(driver.getPageSource().contains("Your cart is empty"), "Cart should be cleared after deleting items");

        driver.quit();
    }
}
