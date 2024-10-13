package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.demoblaze.com/");
	        driver.manage().window().maximize();
	        String pageTitle = driver.getTitle();
	        if (pageTitle.equals("STORE")) {
	            System.out.println("Page landed on correct website");
	        } else {
	            System.out.println("Page not landed on correct website");
	        }


	}

}
