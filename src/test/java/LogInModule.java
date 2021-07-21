import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class LogInModule {
    //log in for existing user
    static void logIn (WebDriver driver) {
        driver.findElement(By.xpath("//a[@id=\"sign-in\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"session_email\"]")).
                sendKeys("almost145@yandex.ru");
        driver.findElement(By.xpath("//input[@id=\"session_password\"]")).
                sendKeys("qwerty");
        driver.findElement(By.cssSelector("input[value=\"Sign in\"]")).click();
    }
}
