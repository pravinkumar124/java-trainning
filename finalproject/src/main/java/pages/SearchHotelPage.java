package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
    private WebDriver driver;

    @FindBy(id = "location")
	public WebElement locationDropdown;

    @FindBy(id = "hotels")
    private WebElement hotelsDropdown;

    @FindBy(id = "room_type")
    private WebElement roomTypeDropdown;

    @FindBy(id = "check_in")
    private WebElement checkInDateField;

    @FindBy(id = "check_out")
    private WebElement checkOutDateField;

    @FindBy(id = "search_hotel")
    private WebElement searchHotelButton;

    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectLocation(String location) {
        locationDropdown.sendKeys(location);
    }

    public void selectHotel(String hotel) {
        hotelsDropdown.sendKeys(hotel);
    }

    public void selectRoomType(String roomType) {
        roomTypeDropdown.sendKeys(roomType);
    }

    public void enterCheckInDate(String checkInDate) {
        checkInDateField.sendKeys(checkInDate);
    }

    public void enterCheckOutDate(String checkOutDate) {
        checkOutDateField.sendKeys(checkOutDate);
    }

    public void clickSearchButton() {
        searchHotelButton.click();
    }

	public boolean isElementPresent(WebElement locationDropdown2) {
		// TODO Auto-generated method stub
		return false;
	}
}
