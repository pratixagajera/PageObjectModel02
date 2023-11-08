package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManager extends Utils
{
//    create method to open browser for testing
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//        create object
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        to open maximize screen while testing
        driver.manage().window().maximize();
//        url to reach on website
        driver.get("https://demo.nopcommerce.com/");
    }

//    create method to close browser
    public void closeBrowser()
    {
        driver.quit();
    }
}
