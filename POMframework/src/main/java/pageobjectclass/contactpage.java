package pageobjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactpage {

	WebDriver driver;
	public contactpage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
		
	//driver.findElement(By.linkText("sent()")).click();
		
}
	@FindBy(linkText="sent()")
	WebElement sent;
	
	public void clickcontact() {
		sent.click();
	}
}