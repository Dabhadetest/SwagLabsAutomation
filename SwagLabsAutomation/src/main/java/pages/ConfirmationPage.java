package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {

    WebDriver driver;

    // Locator for the confirmation message
    private By confirmationMessage = By.cssSelector(".complete-header");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Verifies if the confirmation page is displayed
    public boolean isConfirmationDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }
}
