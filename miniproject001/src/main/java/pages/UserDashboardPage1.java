package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class UserDashboardPage1 {

    WebDriver driver;

    @FindBy(id = "logout2")
	private
    WebElement logoutButton;

    public UserDashboardPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void UserDashboardPage11(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void clickLogoutButton() {
        getLogoutButton().click();
    }

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public void setLogoutButton(WebElement logoutButton) {
		this.logoutButton = logoutButton;
	}
}
