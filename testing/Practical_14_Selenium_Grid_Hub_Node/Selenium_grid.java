/*
 * Practical No : 14
 * Topic        : Selenium Server (Grid) Configuration and Remote Execution
 * File name    : Selenium_grid.java
 */
package selenium_grid;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium_grid {

    public static void main(String[] args) throws Exception {

        DesiredCapabilities dc = new DesiredCapabilities();

        // Firefox browser
        dc.setBrowserName("firefox");

        // Connect to Selenium Grid
        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444"), dc);

        // Open website
        driver.get("http://localhost/user_login/login.html");

        System.out.println("Browser: Firefox");
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Remote execution completed successfully.");
    }
}
