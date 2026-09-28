import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart(String productName) {
        driver.findElement(By.id("add-to-cart-" + productName)).click();
    }

    public void addRandomProductToCart() {
        List<WebElement> allButtons = driver.findElements(By.className("btn_inventory"));
        Random random = new Random();
        int randomIndex = random.nextInt(allButtons.size());
        allButtons.get(randomIndex).click();
    }


}