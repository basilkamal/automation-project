import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{

    @Test()
    public void LoginCridintial() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"));
    }


}