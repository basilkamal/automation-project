import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage;

    @Given("I open the login page")
    public void iOpenTheLoginPage() {
        Hooks.driver.get("https://www.saucedemo.com");
        loginPage = new LoginPage(Hooks.driver);
    }

    @When("I enter username {string} and password {string}")
    public void iEnterUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username).enterPassword(password);
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the products page")
    public void iShouldBeRedirectedToTheProductsPage() {
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"));
    }
}