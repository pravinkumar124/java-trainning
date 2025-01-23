package pageobjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuppage {

	WebDriver driver;
	public signuppage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);	
}
	@FindBy(id="sign-username")
	WebElement username;
	
	@FindBy(id="sign-password")
	WebElement password;
	
	@FindBy(xpath="//button [@class='btn btn-primary']")
	WebElement singup;
	
	public void dosignup(String uname, String pword ) {
		
		username.sendKeys(uname);
		password.sendKeys(pword);
		singup.click();	
	}
	public void enterusername(String uname) {
		username.sendKeys(uname);
	}
	public void enteruserpassword(String pword) {
		username.sendKeys(pword);
	}
	public void clicksignup() {
		singup.click();
	}
}