import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Step("Enter username: {username}")
    public LoginPage enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        driver.findElement(By.id("user-name")).sendKeys(username);
        return this;
    }

    @Step("Enter password")
    public LoginPage enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    @Step("Click login button")
    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        driver.findElement(By.id("login-button")).click();
    }
}