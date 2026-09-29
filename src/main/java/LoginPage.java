import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage enterUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    public void clickLogin() {
        driver.findElement(By.id("login-button")).click();
    }
}