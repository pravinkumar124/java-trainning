package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "signin2")
    WebElement signUpButton;

    @FindBy(id = "login2")
    WebElement loginButton;

    @FindBy(xpath = "//h2[contains(text(),'Welcome')]")
    WebElement welcomeMessage;

    @FindBy(xpath = "//a[contains(text(),'Phones')]")
    WebElement phonesCategory;

    @FindBy(xpath = "//a[contains(text(),'Laptops')]")
    WebElement laptopsCategory;

    @FindBy(id = "nava")
    WebElement logo;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void HomePage1(WebDriver driver2) {		
	}

	public boolean isSignUpButtonVisible() {
        return signUpButton.isDisplayed();
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public boolean isLoginButtonVisible() {
        return loginButton.isDisplayed();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean isWelcomeMessageVisible() {
        return welcomeMessage.isDisplayed();
    }

    public void clickPhonesCategory() {
        phonesCategory.click();
    }

    public void clickLaptopsCategory() {
        laptopsCategory.click();
    }

    public boolean isLogoVisible() {
        return logo.isDisplayed();
    }
}
