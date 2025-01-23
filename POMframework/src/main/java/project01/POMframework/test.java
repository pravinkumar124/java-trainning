package project01.POMframework;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjectclass.aboutuspage;
import pageobjectclass.cartpage;
import pageobjectclass.categoriespage;
import pageobjectclass.commonpage;
import pageobjectclass.contactpage;
import pageobjectclass.loginpage;
import pageobjectclass.signuppage;


public class test {
	
	WebDriver driver = new ChromeDriver();
	commonpage common = new commonpage(driver);
	signuppage signup = new signuppage(driver);
	loginpage login = new loginpage(driver);
	aboutuspage aboutus = new aboutuspage(driver);
	contactpage contact = new contactpage(driver);
	categoriespage categories = new categoriespage(driver);
	cartpage cart = new cartpage(driver);
	
	
	public void runsignuotest() {
		common.launchApp();
		common. clickonsignuplink();
		signup.dosignup("ajay123", "ajay123");	
	}
	public void runlogintest() {
		common.clickonloginlink();
		login.dologin("ajay123", "ajay123");
	}
	public void runaboutus() {
		common.clickonaboutuslink();
		aboutus.clickaboutus();	
	}
	public void runcontact() {
		common.giclickoncontactlink();
		contact.clickcontact();
	}
    public void runcategories() {
    	common.clickoncategorieslink();
    	categories.clicklaptops();
    	categories.clickmonitors();
    }
    public void runcart() {
    	common.clickoncartlink();
    	cart.dologin("ajay", "india", "chennai", "sbssb", "may", "2024");
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        test tests = new test();
        tests.runsignuotest();
        tests.runlogintest();
        tests.runaboutus();
        tests.runcontact();
        tests.runcategories();
        tests.runcart(); 
	}
}