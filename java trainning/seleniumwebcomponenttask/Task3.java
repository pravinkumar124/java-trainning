package seleniumwebcomponenttask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Task3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.guvi.in/");
            
            driver.manage().window().maximize();
            
            WebDriverWait wait = new WebDriverWait(driver, 10);
            
            WebElement signupButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/register']")));
            signupButton.click();
            
            WebElement nameField = driver.findElement(By.name("full_name"));
            WebElement emailField = driver.findElement(By.name("email"));
            WebElement passwordField = driver.findElement(By.name("password"));
            WebElement confirmPasswordField = driver.findElement(By.name("confirm_password"));
            
            nameField.sendKeys("Nick J");
            emailField.sendKeys("nick098j@gamil.com"); 
            passwordField.sendKeys("Password123");
            confirmPasswordField.sendKeys("Password123");
       
            WebElement signupSubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));
            signupSubmitButton.click();
            
            wait.until(ExpectedConditions.titleContains("Welcome"));
            String pageTitleAfterSignup = driver.getTitle();
            System.out.println("Page Title after Signup: " + pageTitleAfterSignup);

            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']")));
            loginButton.click();
            
            WebElement emailLoginField = driver.findElement(By.name("email"));
            WebElement passwordLoginField = driver.findElement(By.name("password"));
            
            emailLoginField.sendKeys("nick098j@gamil.com");
            passwordLoginField.sendKeys("Password123");
            
            WebElement loginSubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginSubmitButton.click();
            
            wait.until(ExpectedConditions.titleContains("Dashboard"));
            String pageTitleAfterLogin = driver.getTitle();
            System.out.println("Page Title after Login: " + pageTitleAfterLogin);
            
            if (pageTitleAfterLogin.contains("Dashboard")) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Login Failed.");
            }

        } finally {
          
            driver.quit();
        }
    }
}
