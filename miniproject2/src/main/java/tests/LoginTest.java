package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ContactListPage;

public class LoginTest {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    ContactListPage contactListPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        contactListPage = new ContactListPage(driver);
    }

    @Test
    public void testLoginWithValidCredentials() {
        homePage.clickLogin();
        loginPage.enterEmail("valid@example.com");
        loginPage.enterPassword("validPassword");
        loginPage.clickLoginSubmit();

        // Verify login by checking if we are redirected to the contact list page
        Assert.assertTrue(contactListPage.isLogoutButtonVisible(), "Login failed. Logout button not visible.");
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        homePage.clickLogin();
        loginPage.enterEmail("invalid@example.com");
        loginPage.enterPassword("wrongPassword");
        loginPage.clickLoginSubmit();

        // Verify error message or behavior on invalid login attempt
        // For example: Assert.assertTrue(someErrorMessage.isDisplayed(), "Error message not shown.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

