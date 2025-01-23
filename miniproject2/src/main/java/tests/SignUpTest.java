package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

public class SignUpTest {

    WebDriver driver;
    HomePage homePage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void testSignUpButton() {
        // Check if the SignUp button is visible
        Assert.assertTrue(homePage.isSignUpButtonVisible(), "SignUp button is not visible");

        // Click SignUp and verify that we are on the SignUp page
        homePage.clickSignUp();
        signUpPage.enterEmail("testuser@example.com");
        signUpPage.enterPassword("password123");
        signUpPage.clickSignUpSubmit();

        // Add assertions as per your app's expected outcome, such as a success message
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
