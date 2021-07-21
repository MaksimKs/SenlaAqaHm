import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class AddressEditModule {
    static void addressEditing (WebDriver driver) {
        driver.findElement(By.xpath("(//a[starts-with(@data-test,\"edit-\")])[1]")).click();
        driver.findElement(By.id("address_first_name")).sendKeys("1");
        driver.findElement(By.id("address_last_name")).sendKeys("2");
        driver.findElement(By.xpath("//input[@value=\"Update Address\"]")).click();
        driver.findElement(By.xpath("//a[@data-test=\"list\"]")).click();
    }
}
