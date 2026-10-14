/*
 * Practical No : 15
 * Topic        : Cross-Browser Testing Using Selenium Grid
 * File name    : AllBrowserTest.java
 */
package selenium_grid;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AllBrowserTest {

    public static void runTest(String browser) throws Exception {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setBrowserName(browser);

        long startTime = System.currentTimeMillis();

        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444"), dc);

        driver.get("http://localhost/user_login/login.html");

        long endTime = System.currentTimeMillis();

        System.out.println("--------------------------------");
        System.out.println("Browser: " + browser);
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Execution Time: "
                + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) throws Exception {

        runTest("chrome");
        runTest("firefox");
        runTest("MicrosoftEdge");

        System.out.println("--------------------------------");
        System.out.println("Cross-Browser Testing Completed");
    }
}
