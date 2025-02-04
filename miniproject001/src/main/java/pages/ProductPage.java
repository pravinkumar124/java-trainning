package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    @FindBy(xpath = "//h2[contains(text(),'Product')]")
    WebElement productTitle;

    @FindBy(id = "price-value")
    WebElement productPrice;

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getProductTitle() {
        return productTitle.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }
}
