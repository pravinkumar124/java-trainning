package pageobjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class categoriespage {

	WebDriver driver;
	public categoriespage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
		
	//driver.findElement(By.linkText("byCat('notebook')")).click();
	//driver.findElement(By.linkText("byCat('monitor')")).click();
	
}
	
	@FindBy(linkText="byCat('notebook')")
	WebElement laptops;
	
	@FindBy(linkText="byCat('monitor')")
	WebElement monitors;
	
 public void dologin() {
		
	laptops.click();
	monitors.click();
     	
	}
 public void clicklaptops() {
	 laptops.click();
}
 public void clickmonitors() {
	 monitors.click();
}
}
