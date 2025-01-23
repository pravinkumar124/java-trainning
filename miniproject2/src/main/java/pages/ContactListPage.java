package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactListPage {

    private WebDriver driver;

    // Contact list page elements
    @FindBy(id = "addContact")
    private WebElement addContactButton;

    @FindBy(className = "contact")
    private List<WebElement> contactList;

    @FindBy(id = "logout")
    private WebElement logoutButton;

    public ContactListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with elements
    public void clickAddContact() {
        addContactButton.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public List<WebElement> getContactList() {
        return contactList;
    }

    public boolean isLogoutButtonVisible() {
        return logoutButton.isDisplayed();
    }
}
