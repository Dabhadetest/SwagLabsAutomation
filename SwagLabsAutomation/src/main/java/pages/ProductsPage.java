package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    private By productTitle = By.cssSelector(".title"); // Typically shows "Products"
    private By firstAddToCartButton = By.cssSelector(".inventory_item button");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartIcon = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageDisplayed() {
        return driver.findElement(productTitle).isDisplayed();
    }

    public void addFirstProductToCart() {
        driver.findElement(firstAddToCartButton).click();
    }

    public String getCartCount() {
        return driver.findElement(cartBadge).getText();
    }

    public void clickCart() {
        driver.findElement(cartIcon).click();
    }
}
