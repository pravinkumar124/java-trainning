package listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ScreenshotListener implements ITestListener {

    private WebDriver driver;

    public ScreenshotListener(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            File destFile = new File("screenshots/" + result.getName() + ".png");
            org.apache.commons.io.FileUtils.copyFile(screenshot, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Other overridden methods can be left empty for this context
    @Override public void onTestStart(ITestResult result) {}
    @Override public void onTestSuccess(ITestResult result) {}
    @Override public void onTestSkipped(ITestResult result) {}
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    @Override public void onStart(org.testng.ITestContext context) {}
    @Override public void onFinish(org.testng.ITestContext context) {}
}
