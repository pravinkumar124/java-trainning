package Windowsandframestask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) {
     
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
    
            driver.get("https://the-internet.herokuapp.com/windows");
            WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
            clickHereButton.click();

            String originalWindow = driver.getWindowHandle();
            Set<String> allWindowHandles = driver.getWindowHandles();
            String newWindowHandle = null;
            for (String handle : allWindowHandles) {
                if (!handle.equals(originalWindow)) {
                    newWindowHandle = handle;
                    break;
                }
            }
            driver.switchTo().window(newWindowHandle);
            String pageSource = driver.getPageSource();
            if (pageSource.contains("New Window")) {
                System.out.println("Text 'New Window' found on the page.");
            } else {
                System.out.println("Text 'New Window' NOT found on the page.");
            }

            driver.close();
            driver.switchTo().window(originalWindow);
            driver.quit();
            System.out.println("Test completed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
