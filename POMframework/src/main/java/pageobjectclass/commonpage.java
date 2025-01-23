package pageobjectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class commonpage {
	
	String baseUrl = "https://www.demoblaze.com/";
	
	WebDriver driver;
	public commonpage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(id="signin2")
	WebElement signuplink;
	
	@FindBy(id="login2")
	WebElement loginlink;
	
	@FindBy(xpath="//a[@class='nav-link']")
	WebElement aboutuslink;
	
	@FindBy(xpath="//a[@data-target='#exampleModal']")
	WebElement contactlink;
	
	@FindBy(linkText="byCat('phone')")
	WebElement categorieslink;
	
	@FindBy(linkText="Samsung galaxy s6")
	WebElement cartlink;
	
	//WebElement signuplink = driver.findElement(By.id("signin2"));
	//WebElement loginlink = driver.findElement(By.id("login2"));
	//WebElement aboutuslink = driver.findElement(By.xpath("//a[@class='nav-link']"));
	//WebElement contactlink = driver.findElement(By.xpath("//a[@data-target='#exampleModal']"));
	//WebElement categorieslink = driver.findElement(By.linkText("byCat('phone')"));
	//WebElement cartlink = driver.findElement(By.linkText("Samsung galaxy s6"));
	
	public void launchApp() {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	 public void clickonsignuplink() {
		 signuplink.click();
	 }
	 
	 public void clickonloginlink() {
		 loginlink.click();
	 }	
	 
	 public void clickonaboutuslink() {
		 aboutuslink.click();
	 }
	 
	 public void giclickoncontactlink() {
		 contactlink.click();
	 }
	 
	 public void clickoncategorieslink() {
		 categorieslink.click();
	 }
	 
	 public void clickoncartlink() {
		 cartlink.click();
	 }
}
