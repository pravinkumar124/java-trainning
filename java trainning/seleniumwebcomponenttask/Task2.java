package seleniumwebcomponenttask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://jqueryui.com/droppable/");
            driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
            WebElement sourceElement = driver.findElement(By.id("draggable"));
            WebElement targetElement = driver.findElement(By.id("droppable"));
            Actions actions = new Actions(driver);
            actions.dragAndDrop(sourceElement, targetElement).perform();

            String color = targetElement.getCssValue("background-color");
            System.out.println("Target element's background color after drop: " + color);

            String targetText = targetElement.getText();
            System.out.println("Text of the target element after drop: " + targetText);

            if (targetText.equals("Dropped!")) {
                System.out.println("Drag and Drop operation was successful!");
            } else {
                System.out.println("Drag and Drop operation failed.");
            }

        } finally {
     
            driver.quit();
        }
    }
}
