package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ProductCategoryTest {

    WebDriver driver;

    @Test
    public void testWelcomeMessage() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isWelcomeMessageVisible(), "Welcome message should be displayed");

        driver.quit();
    }

    @Test
    public void testMenuItems() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isLogoVisible(), "Logo should be displayed");
        homePage.clickPhonesCategory();
        Assert.assertTrue(driver.getTitle().contains("Phones"), "Phones category should be visible");

        homePage.clickLaptopsCategory();
        Assert.assertTrue(driver.getTitle().contains("Laptops"), "Laptops category should be visible");

        driver.quit();
    }

    @Test
    public void testCategoryDisplay() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickPhonesCategory();
        Assert.assertTrue(driver.getTitle().contains("Phones"), "Phones category should be listed");

        homePage.clickLaptopsCategory();
        Assert.assertTrue(driver.getTitle().contains("Laptops"), "Laptops category should be listed");

        driver.quit();
    }
}

