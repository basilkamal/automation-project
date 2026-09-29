import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = BaseTest.staticDriver;

        if (driver != null) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String fileName = result.getName() + ".png";

            try {
                Files.createDirectories(Paths.get("screenshots"));
                Files.copy(screenshot.toPath(), Paths.get("screenshots/" + fileName), StandardCopyOption.REPLACE_EXISTING);
                System.out.println(">>> Screenshot saved successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}