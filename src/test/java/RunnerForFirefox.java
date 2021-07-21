import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class RunnerForFirefox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://a.testaddressbook.com/");

        LogInModule.logIn(driver);
        AddressModule.addressCreating(driver);
        AddressEditModule.addressEditing(driver);
        DelAndLogout.addressDeleting (driver);
    }
}
