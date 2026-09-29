import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartComponent {

    WebDriver driver;

    public CartComponent(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartCount() {
        return driver.findElement(By.className("shopping_cart_badge")).getText();
    }
}