package pageobjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver driver;
	public loginpage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	
	//driver.findElement(By.id("loginusername")).sendKeys("ajay@123");
	//driver.findElement(By.id("loginpassword")).sendKeys("ajay@123");
	//driver.findElement(By.xpath("//button [@class='btn btn-primary']")).click();
}
	@FindBy(id="loginusername")
	WebElement username;
	
	@FindBy(id="loginpassword")
	WebElement password;
	
	@FindBy(xpath="//button [@class='btn btn-primary']")
	WebElement login;
	
public void dologin(String uname, String pword ) {
		
		username.sendKeys(uname);
		password.sendKeys(pword);
		login.click();	
	}
	public void enterusername(String uname) {
		username.sendKeys(uname);
	}
	public void enteruserpassword(String pword) {
		username.sendKeys(pword);
	}
	public void clickloginup() {
		login.click();
	}
	
	
	
	
	
	
}