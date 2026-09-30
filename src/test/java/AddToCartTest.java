import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class AddToCartTest extends BaseTest {

    @Severity(SeverityLevel.NORMAL)
    @Test(enabled = false)
    public void addSpecificProductToCart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addProductToCart("sauce-labs-backpack");

        CartComponent cartComponent = new CartComponent(driver);
        String cartCount = cartComponent.getCartCount();
        Assert.assertEquals(cartCount, "1");
    }

    @Severity(SeverityLevel.NORMAL)
    @Test()
    public void addRandomProductToCart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addRandomProductToCart();

        CartComponent cartComponent = new CartComponent(driver);
        String cartCount = cartComponent.getCartCount();
        Assert.assertEquals(cartCount, "1");
    }
}