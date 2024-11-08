package seleniumwebcomponenttask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
      
        WebDriver driver = new ChromeDriver();
        
        try {
    
            driver.manage().window().maximize();
            
    
            driver.get("https://jqueryui.com/datepicker/URL");
            
            driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
           
            WebElement datepickerInput = driver.findElement(By.id("datepicker"));
            datepickerInput.click();
           
            WebElement nextButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
            nextButton.click();
            
            Thread.sleep(500); 
            List<WebElement> allDates = driver.findElements(By.cssSelector(".ui-datepicker-calendar td a"));
            
            for (WebElement date : allDates) {
                if (date.getText().equals("22")) {
                    date.click();
                    break;
                }
            }
            
            String selectedDate = datepickerInput.getAttribute("value");
            System.out.println("Selected Date: " + selectedDate);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
