package pageobjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class aboutuspage {

	WebDriver driver;
	public aboutuspage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
	
}
	@FindBy(xpath="//button[@class='btn btn-secondary']")
	WebElement aboutus;
	
	 public void dologin() {
			
		 aboutus.click();
	}
		 public void clickaboutus() {
			 aboutus.click();
		}
}