package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class ProductPageTest {

    WebDriver driver;

    @Test
    public void testProductRedirection() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickPhonesCategory();

        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.getProductTitle().length() > 0, "Product page should display product title");

        driver.quit();
    }

    @Test
    public void testProductDetails() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickPhonesCategory();

        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.getProductPrice().length() > 0, "Product price should be displayed");

        driver.quit();
    }

    @Test
    public void testAddToCart() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickPhonesCategory();

        ProductPage productPage = new ProductPage(driver);
        String initialProductCount = driver.getCurrentUrl();
        productPage.clickAddToCart();

        Assert.assertTrue(driver.getCurrentUrl().contains("cart"), "The product should be added to the cart");

        driver.quit();
    }
}
