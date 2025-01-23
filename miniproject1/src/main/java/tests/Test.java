package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

public class Test {

    WebDriver driver;
    HomePage homePage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void setUp() {
        // Set up WebDriver
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void testSignUpFunctionality() {
        // Verify the sign-up button is visible and click it
        Assert.assertTrue(homePage.isSignUpButtonVisible());
        homePage.clickSignUp();

        // Enter username and password and submit
        signUpPage.enterUsername("testuser");
        signUpPage.enterPassword("password123");
        signUpPage.clickSignUpSubmit();

        // Add your validation logic here (e.g., check if registration was successful)
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after the test
        driver.quit();
    }
}
