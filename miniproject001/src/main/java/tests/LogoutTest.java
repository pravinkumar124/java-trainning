package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserDashboardPage1;

public class LogoutTest {

    WebDriver driver;

    @Test
    public void testLogoutButtonVisibility() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();

        UserDashboardPage1 dashboardPage = new UserDashboardPage1(driver);
        Assert.assertTrue(dashboardPage.getLogoutButton().isDisplayed(), "Logout button should be visible");

        driver.quit();
    }

    @Test
    public void testLogoutFunctionality() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();

        UserDashboardPage1 dashboardPage = new UserDashboardPage1(driver);
        dashboardPage.clickLogoutButton();

        Assert.assertTrue(driver.getTitle().contains("Home"), "User should be redirected to home page after logout");

        driver.quit();
    }
}
