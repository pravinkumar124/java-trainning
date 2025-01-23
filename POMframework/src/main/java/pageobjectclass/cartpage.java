package pageobjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {

	WebDriver driver;
	public cartpage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	//driver.findElement(By.className("btn btn-success btn-lg")).click();
	//driver.findElement(By.id("cartur")).click();
	//driver.findElement(By.linkText("Delete")).click();
	//driver.findElement(By.linkText("Place Order")).click();
	//driver.findElement(By.id("//input[@id='name']")).sendKeys("ajay");
	//driver.findElement(By.id("//input[@id='country']")).sendKeys("india");
	//driver.findElement(By.id("//input[@id='city']")).sendKeys("chennai");
	//driver.findElement(By.id("//input[@id='card']")).sendKeys("sbacb");
	//driver.findElement(By.id("//input[@id='month']")).sendKeys("may");
	//driver.findElement(By.id("//input[@id='year']")).sendKeys("2024");
	//driver.findElement(By.linkText("Purchase")).click();
	//driver.findElement(By.linkText("OK")).click();
}
	@FindBy(className="btn btn-success btn-lg")
	WebElement addcart;
	
	@FindBy(id="cartur")
	WebElement cart;
	
	@FindBy(linkText="Delete")
	WebElement delete;
	
	@FindBy(linkText="Place Order")
	WebElement order;
	
	@FindBy(id="//input[@id='name']")
	WebElement name;
	
	@FindBy(id="//input[@id='country']")
	WebElement country;
	
	@FindBy(id="//input[@id='city']")
	WebElement city;
	
	@FindBy(id="//input[@id='card']")
	WebElement card;
	
	@FindBy(id="//input[@id='month']")
	WebElement month;
	
	@FindBy(id="//input[@id='year']")
	WebElement year;
	
	@FindBy(linkText="Purchase")
	WebElement buy;
	
	@FindBy(linkText="OK")
	WebElement ok;
	
public void dologin(String uname, String ucountry, String ucity, String ucard, String umonth, String uyear) {
		
	addcart.click();
	cart.click();
	delete.click();
	order.click();
	name.sendKeys(uname);
	country.sendKeys(ucountry);
	city.sendKeys(ucity);
	card.sendKeys(ucard);
	month.sendKeys(umonth);
	year.sendKeys(uyear);
	buy.click();
	ok.click();
	}

public void clickaddcart() {
	addcart.click();
}
public void clickcart() {
	cart.click();
}
public void clickdelete() {
	delete.click();
}

public void enterusername(String uname) {
	name.sendKeys(uname);
}
public void entercountry(String ucountry) {
	country.sendKeys(ucountry);
}
public void entercity(String ucity) {
	city.sendKeys(ucity);
}
public void entercard(String ucard) {
	card.sendKeys(ucard);
}
public void entermonth(String umonth) {
	month.sendKeys(umonth);
}
public void enteryear(String uyear) {
	year.sendKeys(uyear);
}
public void enterbuy(String ubuy) {
	buy.sendKeys(ubuy);
}
}