import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class DelAndLogout {

    static void addressDeleting (WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("(//a[starts-with(@data-test,\"destroy-\")])[1]")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@data-test=\"sign-out\"]")).click();
    }
}
