package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    private WebDriver driver;

    // ProductPage Elements
    @FindBy(xpath = "//h2[@class='price-container']")
    private WebElement productPrice;

    @FindBy(xpath = "//button[text()='Add to cart']")
    private WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public String getProductPrice() {
        return productPrice.getText();
    }

    public void addToCart() {
        addToCartButton.click();
    }
}
