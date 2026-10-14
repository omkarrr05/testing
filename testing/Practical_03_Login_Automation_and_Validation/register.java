/*
 * Practical No : 03
 * Topic        : Login Automation and Validation
 * File name    : register.java
 */
package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Sakshi\\Documents\\NetBeansProjects\\project3\\src\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/login/register/register.html");
        driver.findElement(By.name("fullname")).sendKeys("Sakshi Ramkrishna Mestry");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("asakshimestry06@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("12345");
        Thread.sleep(2000);

        // Click Register
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        // Wait for 2 seconds
        Thread.sleep(2000);
    }
}
