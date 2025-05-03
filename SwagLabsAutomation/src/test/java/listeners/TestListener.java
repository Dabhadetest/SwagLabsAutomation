package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import base.BaseTest;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).getDriver();

        String testName = result.getName();
        String path = ScreenshotUtil.captureScreenshot(driver, testName);
        System.out.println("Screenshot saved at: " + path);
    }

    // You can override other methods like onTestStart, onTestSuccess, etc. if needed
}
