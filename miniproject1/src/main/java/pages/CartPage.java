package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private WebDriver driver;

    // CartPage Elements
    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[text()='Place Order']")
    private WebElement placeOrderButton;

    @FindBy(id = "total")
    private WebElement totalPrice;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void clickPlaceOrder() {
        placeOrderButton.click();
    }

    public void deleteProductFromCart() {
        deleteButton.click();
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }
}
