package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SearchHotelPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;
    SearchHotelPage searchHotelPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/index.php");
        loginPage = new LoginPage(driver);
        searchHotelPage = new SearchHotelPage(driver);
    }

    @Test
    public void testLoginWithValidCredentials() {
        loginPage.login("validUsername", "validPassword");

        // After login, ensure that the search hotel page is loaded (asserting a field from the next page)
        Assert.assertTrue(searchHotelPage.isElementPresent(searchHotelPage.locationDropdown), "Login failed. Location dropdown is not present.");
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        loginPage.login("invalidUsername", "invalidPassword");

        // Assert that the login failed (e.g., error message or staying on login page)
        // This can be done by checking an error message or failed login indicator.
        Assert.assertTrue(driver.getCurrentUrl().contains("index.php"), "Login with invalid credentials didn't fail.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
