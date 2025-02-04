package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserDashboardPage1;

public class LoginTest {

    WebDriver driver;

    @Test
    public void testLoginButtonVisibility() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isLoginButtonVisible(), "Login button should be visible");

        driver.quit();
    }

    @Test
    public void testLoginButtonClickability() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();
        Assert.assertTrue(driver.getTitle().contains("Log in"), "Log in page should open");

        driver.quit();
    }

    @Test
    public void testLoginFunctionalityWithValidCredentials() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("ajay12");
        loginPage.enterPassword("Password@098");
        loginPage.clickLoginButton();

        UserDashboardPage1 dashboardPage = new UserDashboardPage1(driver);
        Assert.assertTrue(dashboardPage.getLogoutButton().isDisplayed(), "Logout button should be visible after login");

        driver.quit();
    }

    @Test
    public void testLoginFunctionalityWithInvalidCredentials() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("ajay12");
        loginPage.enterPassword("Password@098");
        loginPage.clickLoginButton();

        Assert.assertTrue(driver.getPageSource().contains("Wrong username or password"), "Error message should be displayed");

        driver.quit();
    }
}
