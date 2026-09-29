import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ProductsPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addProductToCart(String productName) {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-" + productName)));
        driver.findElement(By.id("add-to-cart-" + productName)).click();
    }

    public void addRandomProductToCart() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("btn_inventory")));
        List<WebElement> allButtons = driver.findElements(By.className("btn_inventory"));
        Random random = new Random();
        int randomIndex = random.nextInt(allButtons.size());
        allButtons.get(randomIndex).click();
    }
}