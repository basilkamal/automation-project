import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
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

    @Severity(SeverityLevel.NORMAL)
    @Test()
    public void lockedOutUserCannotLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("locked_out_user")
                .enterPassword("secret_sauce")
                .clickLogin();

        boolean errorDisplayed = driver.findElements(By.cssSelector("[data-test='error']")).size() > 0;
        Assert.assertTrue(errorDisplayed, "Expected an error message for locked out user");
    }
}