package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
    private WebDriver driver;

    @FindBy(id = "first_name")
    private WebElement firstNameField;

    @FindBy(id = "last_name")
    private WebElement lastNameField;

    @FindBy(id = "address")
    private WebElement addressField;

    @FindBy(id = "cc_num")
    private WebElement creditCardField;

    @FindBy(id = "book_now")
    private WebElement bookNowButton;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterAddress(String address) {
        addressField.sendKeys(address);
    }

    public void enterCreditCardDetails(String cardNumber) {
        creditCardField.sendKeys(cardNumber);
    }

    public void clickBookNow() {
        bookNowButton.click();
    }

    public void completeBooking(String firstName, String lastName, String address, String cardNumber) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterAddress(address);
        enterCreditCardDetails(cardNumber);
        clickBookNow();
    }
}
