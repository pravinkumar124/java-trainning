package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    // Home page elements
    @FindBy(id = "signup")
    private WebElement signupButton;

    @FindBy(id = "login")
    private WebElement loginButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public void clickSignUp() {
        signupButton.click();
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean isSignUpButtonVisible() {
        return signupButton.isDisplayed();
    }

    public boolean isLoginButtonVisible() {
        return loginButton.isDisplayed();
    }
}
