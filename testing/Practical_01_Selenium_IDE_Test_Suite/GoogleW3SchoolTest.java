/*
 * Practical No : 01
 * Topic        : Creation of Test Suite using Selenium IDE
 * File name    : GoogleW3SchoolTest.java
 */
package practical1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/* Hand-written equivalent of the script Selenium IDE exports for google_w3school.side */
public class GoogleW3SchoolTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Sakshi\\Documents\\NetBeansProjects\\project1\\src\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 1-2  open / set window size
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1325, 816));

        // 3-5  click search box, type, press ENTER
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("w3 school");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        // open the W3Schools result
        driver.findElement(By.partialLinkText("W3Schools")).click();
        Thread.sleep(2000);

        // 6-10  navigate W3Schools top menu
        driver.findElement(By.linkText("PHP")).click();
        Thread.sleep(1500);
        driver.findElement(By.linkText("HOW TO")).click();
        Thread.sleep(1500);
        driver.findElement(By.linkText("EXCEL")).click();
        Thread.sleep(1500);

        System.out.println("Title : " + driver.getTitle());
        driver.quit();
    }
}
