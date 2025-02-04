package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {

    WebDriver driver;

    @FindBy(id = "name")
	private
    WebElement nameField;

    @FindBy(id = "country")
	private
    WebElement countryField;

    @FindBy(id = "city")
    WebElement cityField;

    @FindBy(id = "card")
    WebElement cardField;

    @FindBy(id = "month")
    WebElement monthField;

    @FindBy(id = "year")
    WebElement yearField;

    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    WebElement purchaseButton;

    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        getNameField().sendKeys(name);
    }

    public void enterCountry(String country) {
        getCountryField().sendKeys(country);
    }

    public void enterCity(String city) {
        cityField.sendKeys(city);
    }

    public void enterCardDetails(String card, String month, String year) {
        cardField.sendKeys(card);
        monthField.sendKeys(month);
        yearField.sendKeys(year);
    }

    public void clickPurchaseButton() {
        purchaseButton.click();
    }

	public WebElement getNameField() {
		return nameField;
	}

	public void setNameField(WebElement nameField) {
		this.nameField = nameField;
	}

	public WebElement getCountryField() {
		return countryField;
	}

	public void setCountryField(WebElement countryField) {
		this.countryField = countryField;
	}
}

