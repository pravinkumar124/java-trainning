package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage {

    private WebDriver driver;

    // Add contact page elements
    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "phone")
    private WebElement phoneField;

    @FindBy(id = "birthdate")
    private WebElement birthdateField;

    @FindBy(id = "saveContact")
    private WebElement saveContactButton;

    public AddContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPhone(String phone) {
        phoneField.sendKeys(phone);
    }

    public void enterBirthdate(String birthdate) {
        birthdateField.sendKeys(birthdate);
    }

    public void clickSaveContact() {
        saveContactButton.click();
    }
}
