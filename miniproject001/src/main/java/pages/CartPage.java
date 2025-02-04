package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement deleteButton;

    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    WebElement placeOrderButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public void clickPlaceOrderButton() {
        placeOrderButton.click();
    }
}
