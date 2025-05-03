package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutTest {

    public void testCheckout(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Wait until the element with id 'checkout' is visible
        WebElement checkoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
        
        // Now click the button
        checkoutButton.click();
    }
}
