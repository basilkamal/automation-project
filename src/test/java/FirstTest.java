import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Test()
    public void LoginCridintial() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"));
    }

    @Test()
    public void deliberateFailureTest() {
        Assert.assertTrue(false, "This test is designed to fail to verify Allure screenshot attachment");
    }
}