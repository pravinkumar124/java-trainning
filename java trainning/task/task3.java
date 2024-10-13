package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task3 {

	public static void main(String[] args) {
	
        WebDriver driver = new ChromeDriver();

            driver.get("https://www.wikipedia.org/");

            driver.manage().window().maximize();
            WebElement searchInput = driver.findElement(By.name("search"));
            searchInput.sendKeys("Artificial Intelligence");
            searchInput.submit();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement historySection = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("History")));

            historySection.click();

            WebElement sectionTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("History")));

            System.out.println("Section Title: " + sectionTitle.getText());
   

	}

}
