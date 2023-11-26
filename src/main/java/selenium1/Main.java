package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "D:\\Sel Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Step 1,2,3
//        driver.get("https://www.saucedemo.com/");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
        Main obj = new Main();
        obj.test(driver, "standard_user", "secret_sauce");
        if (driver.findElement(By.className("app_logo")).getText().toString().equals("Swag Labs")) {
            System.out.println("Test success");
        } else {
            System.out.println("Test failed");
        }

        Thread.sleep(5000);

        // Step 1,4,5
//        driver.get("https://www.saucedemo.com/");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user66r");
//        driver.findElement(By.id("password")).sendKeys("standard_user66");
//        driver.findElement(By.id("login-button")).click();

        obj.test(driver, "standard_user66", "standard_user66");
        if (driver.getCurrentUrl().toString().equals("https://www.saucedemo.com/")) {
            System.out.println("Test success");
        } else {
            System.out.println("Test failed");
        }

    }

    void test(WebDriver driver, String username, String pass) {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login-button")).click();


    }

}