package Windowsandframestask;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Q2 {
    public static void main(String[] args) {
   
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
  
            driver.get("http://the-internet.herokuapp.com/nested_frames");

            driver.switchTo().frame("frame-top");
            int frameCount = driver.findElements(By.cssSelector("frame")).size();
            System.out.println("Number of frames on the page: " + frameCount);
            if (frameCount == 3) {
                System.out.println("There are exactly 3 frames.");
            } else {
                System.out.println("The number of frames is not 3.");
            }

            driver.switchTo().frame("frame-left");
            WebElement leftFrameBody = driver.findElement(By.tagName("body"));
            String leftFrameText = leftFrameBody.getText();
            if (leftFrameText.contains("LEFT")) {
                System.out.println("Text 'LEFT' found in the left frame.");
            } else {
                System.out.println("Text 'LEFT' NOT found in the left frame.");
            }

            driver.switchTo().parentFrame();  

            driver.switchTo().frame("frame-middle");
            WebElement middleFrameBody = driver.findElement(By.tagName("body"));
            String middleFrameText = middleFrameBody.getText();
            if (middleFrameText.contains("MIDDLE")) {
                System.out.println("Text 'MIDDLE' found in the middle frame.");
            } else {
                System.out.println("Text 'MIDDLE' NOT found in the middle frame.");
            }

            driver.switchTo().parentFrame(); 

            driver.switchTo().frame("frame-right");
            WebElement rightFrameBody = driver.findElement(By.tagName("body"));
            String rightFrameText = rightFrameBody.getText();
            if (rightFrameText.contains("RIGHT")) {
                System.out.println("Text 'RIGHT' found in the right frame.");
            } else {
                System.out.println("Text 'RIGHT' NOT found in the right frame.");
            }

            driver.switchTo().parentFrame();  

            driver.switchTo().frame("frame-bottom");
            WebElement bottomFrameBody = driver.findElement(By.tagName("body"));
            String bottomFrameText = bottomFrameBody.getText();
            if (bottomFrameText.contains("BOTTOM")) {
                System.out.println("Text 'BOTTOM' found in the bottom frame.");
            } else {
                System.out.println("Text 'BOTTOM' NOT found in the bottom frame.");
            }
            driver.switchTo().parentFrame();  

            String pageTitle = driver.getTitle();
            if (pageTitle.equals("Frames")) {
                System.out.println("Page title is 'Frames'.");
            } else {
                System.out.println("Page title is not 'Frames'. It is: " + pageTitle);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
