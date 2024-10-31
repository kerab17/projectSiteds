package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
    private static WebDriver driver;


    public BrowserDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://192.168.50.185:81/login");
    }

    public static WebDriver getDriver() {
        return driver;
    }
    public static void close() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
