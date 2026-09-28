import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCartTest extends BaseTest {

    @Test(enabled = false)
    public void addSpecificProductToCart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addProductToCart("sauce-labs-backpack");

        WebElement cartElement = driver.findElement(By.className("shopping_cart_badge"));
        String cartCount = cartElement.getText();
        Assert.assertEquals(cartCount, "1");
    }

    @Test()
    public void addRandomProductToCart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addRandomProductToCart();

        WebElement cartElement = driver.findElement(By.className("shopping_cart_badge"));
        String cartCount = cartElement.getText();
        Assert.assertEquals(cartCount, "1");
    }
}