import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{

    @Test()
    public void LoginCridintial() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"));
    }


}