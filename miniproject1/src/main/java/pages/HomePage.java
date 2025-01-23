package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    // HomePage Elements
    @FindBy(id = "signUp")
    private WebElement signUpButton;

    @FindBy(id = "login2")
    private WebElement loginButton;

    @FindBy(id = "nava")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//a[text()='Phones']")
    private WebElement phonesCategory;

    @FindBy(xpath = "//a[text()='Laptops']")
    private WebElement laptopsCategory;

    @FindBy(xpath = "//img[@id='logo']")
    private WebElement appLogo;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void clickSignUp() {
        signUpButton.click();
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean isSignUpButtonVisible() {
        return signUpButton.isDisplayed();
    }

    public boolean isLoginButtonVisible() {
        return loginButton.isDisplayed();
    }

    public boolean isWelcomeMessageDisplayed() {
        return welcomeMessage.isDisplayed();
    }

    public boolean isLogoDisplayed() {
        return appLogo.isDisplayed();
    }

    public void clickPhonesCategory() {
        phonesCategory.click();
    }

    public void clickLaptopsCategory() {
        laptopsCategory.click();
    }
}
