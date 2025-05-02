package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {

    WebDriver driver;

    // Locator for the Finish button
    private By finishButton = By.id("finish");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    // Clicks the Finish button to complete checkout
    public void clickFinish() {
        driver.findElement(finishButton).click();
    }
}
