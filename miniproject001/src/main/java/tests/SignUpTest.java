package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

public class SignUpTest {

    WebDriver driver;

    @Test
    public void testSignUpButtonVisibility() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isSignUpButtonVisible(), "Sign Up button should be visible");
        driver.quit();
    }

    @Test
    public void testSignUpButtonClickability() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpButton();
        Assert.assertTrue(driver.getTitle().contains("Sign up"), "Sign up page should open");

        driver.quit();
    }

    @Test
    public void testSignUpFunctionality() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpButton();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterUsername("ajay12");
        signUpPage.enterPassword("Password@098");
        signUpPage.clickSignUpButton();

        Assert.assertTrue(driver.getPageSource().contains("Sign up successful"), "Sign up should be successful");

        driver.quit();
    }
}

