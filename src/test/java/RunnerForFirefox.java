import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.time.Duration;

public class RunnerForFirefox {
    public static void main(String[] args) {

        //main class for running test in FF

        String pathToGeckoDriver;
        File file = new File("src\\main\\resources\\geckodriver.exe");
        pathToGeckoDriver = file.getAbsolutePath();

        System.setProperty("webdriver.gecko.driver", pathToGeckoDriver);
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://a.testaddressbook.com/");

        LogInModule.logIn(driver);
        AddressModule.addressCreating(driver);
        AddressModule.addressEditing(driver);
        AddressModule.addressDeleting (driver);
        AddressModule.sighOut(driver);

    }
}
