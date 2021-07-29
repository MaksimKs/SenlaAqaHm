import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

class AddressModule {
    //action with address
    static void addressCreating(WebDriver driver) {
        //create new address
        driver.findElement(By.xpath("//a[@href=\"/addresses\"]")).click();
        driver.findElement(By.xpath("//a[@data-test=\"create\"]")).click();

        //filling the forms
        driver.findElement(By.id("address_first_name")).sendKeys("Sam");
        driver.findElement(By.id("address_last_name")).sendKeys("Senioro");
        driver.findElement(By.id("address_street_address")).sendKeys("Central st.");
        driver.findElement(By.id("address_secondary_address")).sendKeys("5 building, 7 ap.");
        driver.findElement(By.id("address_city")).sendKeys("Long Branch");
        driver.findElement(By.xpath("//option[@value=\"NJ\"]")).click();
        driver.findElement(By.id("address_zip_code")).sendKeys("07740");
        driver.findElement(By.xpath("//input[@id=\"address_country_us\" and @value=\"us\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"address[birthday]\"]")).sendKeys("05101986");
        driver.findElement(By.xpath("//input[@id=\"address_color\"]")).sendKeys("#0060df");
        driver.findElement(By.id("address_age")).sendKeys("28");
        driver.findElement(By.xpath("//input[@id=\"address_website\"]")).sendKeys("http://www.random.com");

        //path to file which will be upload
        String pathToFile;
        File filePath = new File("src\\main\\resources\\Test_pict.png");
        pathToFile = filePath.getAbsolutePath();
        driver.findElement(By.xpath("//input[@id=\"address_picture\"]")).
                sendKeys(pathToFile);

        driver.findElement(By.xpath("//input[@id=\"address_phone\"]")).sendKeys("+375291234567");
        driver.findElement(By.xpath("//input[@id=\"address_interest_climb\"]")).click();
        driver.findElement(By.xpath("//textarea[@id=\"address_note\"]")).sendKeys("test message");
        driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
        driver.findElement(By.xpath("//a[@data-test=\"list\"]")).click();
    }

    //editing exist address
    static void addressEditing (WebDriver driver) {
        driver.findElement(By.xpath("(//a[starts-with(@data-test,\"edit-\")])[1]")).click();
        driver.findElement(By.id("address_first_name")).sendKeys("1");
        driver.findElement(By.id("address_last_name")).sendKeys("2");
        driver.findElement(By.xpath("//input[@value=\"Update Address\"]")).click();
        driver.findElement(By.xpath("//a[@data-test=\"list\"]")).click();
    }

    //deleting first address in list
    static void addressDeleting (WebDriver driver) {
        driver.findElement(By.xpath("(//a[starts-with(@data-test,\"destroy-\")])[1]")).click();
        driver.switchTo().alert().accept();
    }

    //sign-out from address-book for current user
    static void sighOut(WebDriver driver) {
        driver.findElement(By.xpath("//a[@data-test=\"sign-out\"]")).click();
        driver.quit();
    }
}
